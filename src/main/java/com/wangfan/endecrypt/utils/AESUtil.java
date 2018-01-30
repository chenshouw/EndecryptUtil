package com.wangfan.endecrypt.utils;

import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

import com.wangfan.endecrypt.codec.Hex;

/**
 * AES加密
 * 
 * @author wangfan
 * @date 2018-1-30 下午2:33:48
 */
public class AESUtil {
	private static final String KEY_ALGORITHM = "AES";
	private static final String CIPHER_ALGORITHM = "AES/ECB/PKCS5Padding";

	/**
	 * AES加密
	 * 
	 * @param password
	 * @param hexKey
	 *            16进制的密钥
	 * @return
	 */
	public static String encrytAes(String password, String hexKey) {
		try {
			Key key = new SecretKeySpec(Hex.decode(hexKey), KEY_ALGORITHM);
			return encrytAes(password, key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * AES加密
	 * 
	 * @param password
	 * @param key
	 *            密钥
	 * @return
	 */
	public static String encrytAes(String password, Key key) {
		try {
			Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] doFinal = cipher.doFinal(password.getBytes());
			return Hex.encodeToString(doFinal);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * AES解密
	 * 
	 * @param cipherText
	 * @param hexKey
	 *            16进制的密钥
	 * @return
	 */
	public static String decryptAes(String cipherText, String hexKey) {
		try {
			Key key = new SecretKeySpec(Hex.decode(hexKey), KEY_ALGORITHM);
			return decryptAes(cipherText, key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * AES解密
	 * 
	 * @param cipherText
	 * @param key
	 *            密钥
	 * @return
	 */
	public static String decryptAes(String cipherText, Key key) {
		try {
			Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
			cipher.init(Cipher.DECRYPT_MODE, key);
			byte[] doFinal2 = cipher.doFinal(Hex.decode(cipherText));
			return new String(doFinal2, "utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 生成key
	 * 
	 * @param key
	 * @return
	 */
	public static Key generateKey(String key) {
		try {
			KeyGenerator kg = KeyGenerator.getInstance(KEY_ALGORITHM);
			SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
			secureRandom.setSeed(key.getBytes());
			kg.init(128, secureRandom);
			return kg.generateKey();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 生成16进制的key
	 * 
	 * @param key
	 * @return 16进制的key
	 */
	public static String generateHexKey(String key) {
		Key generateKey = generateKey(key);
		if (generateKey != null) {
			return Hex.encodeToString(generateKey.getEncoded());
		}
		return null;
	}

}
