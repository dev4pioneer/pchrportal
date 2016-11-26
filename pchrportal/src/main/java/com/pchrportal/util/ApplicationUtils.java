package com.pchrportal.util;

import java.io.Serializable;
import java.security.MessageDigest;

import sun.misc.BASE64Encoder;

import com.pchrportal.constants.ApplicationConstants;

public class ApplicationUtils implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String valueEncryptor(String inputValue) throws Exception {
		MessageDigest messageDigest = null;
		messageDigest = MessageDigest.getInstance(ApplicationConstants.ENCRYPTION_ALOGRITHM_TYPE);
		messageDigest.update(inputValue.getBytes(ApplicationConstants.CHARSET));
		
		/* Digest the encryption algorithm*/
		byte raw[] = messageDigest.digest();
		String encryptedValue = (new BASE64Encoder()).encode(raw);
		return encryptedValue;
	}
}
