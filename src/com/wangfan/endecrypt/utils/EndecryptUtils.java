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
	 * base64进制加密
	 * 
	 * @param password
	 * @return
	 */
	public static String encrytBase64(String password) {
		byte[] bytes = password.getBytes();
		return Base64.encodeToString(bytes);
	}

	/**
	 * base64进制解密
	 * 
	 * @param cipherText
	 * @return
	 */
	public static String decryptBase64(String cipherText) {
		return Base64.decodeToString(cipherText);
	}

	/**
	 * 16进制加密
	 * 
	 * @param password
	 * @return
	 */
	public static String encrytHex(String password) {
		byte[] bytes = password.getBytes();
		return Hex.encodeToString(bytes);
	}

	/**
	 * 16进制解密
	 * 
	 * @param cipherText
	 * @return
	 */
	public static String decryptHex(String cipherText) {
		return new String(Hex.decode(cipherText));
	}
	
	/**
	 * aes加密
	 * @param password 明文
	 * @param key 密钥
	 * @return
	 */
	public static String encrytAes(String password, Key key){
		AesCipherService aesCipherService = new AesCipherService();
		String aes_cipherText = aesCipherService.encrypt(password.getBytes(), key.getEncoded()).toHex();
		return aes_cipherText;
	}
	
	/**
	 * aes解密
	 * @param cipherText 密文
	 * @param key 密钥
	 * @return
	 */
	public static String decryptAes(String cipherText, Key key){
		AesCipherService aesCipherService = new AesCipherService();
		String aes_mingwen = new String(aesCipherService.decrypt(Hex.decode(cipherText), key.getEncoded()).getBytes());
		return aes_mingwen;
	}

	/**
	 * 生成密钥
	 * @return
	 * @author wangfan
	 */
	public static Key generateKey() {
		AesCipherService aesCipherService = new AesCipherService();
		aesCipherService.setKeySize(128);
		Key key = aesCipherService.generateNewKey();
		//return Base64.encodeToString(key.getEncoded());
		return key;
	}

	/**
	 * md5加密(没有盐)
	 * @param password 要加密的字符串
	 */
	public static String decryptMd5(String password) {
		return new Md5Hash(password).toHex();
	}
	
	/**
	 * 指定盐salt进行md5加密
	 * @param password 要加密的字符串
	 * @param salt 盐
	 * @param hashIterations 散列次数
	 * @return
	 */
	public static String decryptMd5(String password, String salt, int hashIterations) {
		String password_cipherText = new Md5Hash(password, salt, hashIterations).toHex();
		return password_cipherText;
	}

}