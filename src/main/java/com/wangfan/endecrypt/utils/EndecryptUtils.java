package com.wangfan.endecrypt.utils;

import java.security.Key;

import com.wangfan.endecrypt.codec.Base64;
import com.wangfan.endecrypt.codec.Hex;
import com.wangfan.endecrypt.crypto.AesCipherService;
import com.wangfan.endecrypt.crypto.hash.Md5Hash;

/**
 * 加密解密工具类
 * 
 * @author wangfan
 * @date 2017-4-28 上午9:45:00
 */
public class EndecryptUtils {
	/**
	 * 将字符串转换成base64编码
	 * 
	 * @param str
	 * @return
	 */
	public static String encrytBase64(String str) {
		try {
			return Base64.encodeToString(str.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 将base64编码转换成字符串
	 * 
	 * @param cipherText
	 * @return
	 */
	public static String decryptBase64(String cipherText) {
		try {
			return Base64.decodeToString(cipherText);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 将字符串转换成16进制
	 * 
	 * @param password
	 * @return
	 */
	public static String encrytHex(String str) {
		try {
			return Hex.encodeToString(str.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 将16进制编码转换成字符串
	 * 
	 * @param cipherText
	 * @return
	 */
	public static String decryptHex(String cipherText) {
		try {
			return new String(Hex.decode(cipherText));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * aes加密
	 * 
	 * @param password
	 *            明文
	 * @param key
	 *            密钥
	 * @return
	 */
	public static String encrytAes(String password, Key key) {
		try {
			AesCipherService aesCipherService = new AesCipherService();
			String aes_cipherText = aesCipherService.encrypt(
					password.getBytes(), key.getEncoded()).toHex();
			return aes_cipherText;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * aes解密
	 * 
	 * @param cipherText
	 *            密文
	 * @param key
	 *            密钥
	 * @return
	 */
	public static String decryptAes(String cipherText, Key key) {
		try {
			AesCipherService aesCipherService = new AesCipherService();
			String aes_mingwen = new String(aesCipherService.decrypt(
					Hex.decode(cipherText), key.getEncoded()).getBytes());
			return aes_mingwen;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 生成密钥
	 * 
	 * @return
	 * @author wangfan
	 */
	public static Key generateKey(String key) {
		try {
			AesCipherService aesCipherService = new AesCipherService();
			return aesCipherService.generateKey(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * md5加密(没有盐)
	 * 
	 * @param password
	 *            要加密的字符串
	 */
	public static String encrytMd5(String password) {
		try {
			return new Md5Hash(password).toHex();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 指定盐salt进行md5加密
	 * 
	 * @param password
	 *            要加密的字符串
	 * @param salt
	 *            盐
	 * @param hashIterations
	 *            散列次数
	 * @return
	 */
	public static String encrytMd5(String password, String salt,
			int hashIterations) {
		try {
			String password_cipherText = new Md5Hash(password, salt,
					hashIterations).toHex();
			return password_cipherText;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}