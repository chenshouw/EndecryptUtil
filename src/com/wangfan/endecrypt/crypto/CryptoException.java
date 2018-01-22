package com.wangfan.endecrypt.crypto;

import com.wangfan.endecrypt.exception.EndecryptException;

/**
 * Base Shiro exception for problems encountered during cryptographic operations.
 *
 * @since 1.0
 */
public class CryptoException extends EndecryptException {

    public CryptoException(String message) {
        super(message);
    }

    public CryptoException(Throwable cause) {
        super(cause);
    }

    public CryptoException(String message, Throwable cause) {
        super(message, cause);
    }
}
