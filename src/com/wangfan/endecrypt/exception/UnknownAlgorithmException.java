package com.wangfan.endecrypt.exception;

import com.wangfan.endecrypt.crypto.CryptoException;

/**
 * Exception thrown when attempting to lookup or use a cryptographic algorithm that does not exist in the current
 * JVM environment.
 *
 * @since 1.2
 */
public class UnknownAlgorithmException extends CryptoException {

    public UnknownAlgorithmException(String message) {
        super(message);
    }

    public UnknownAlgorithmException(Throwable cause) {
        super(cause);
    }

    public UnknownAlgorithmException(String message, Throwable cause) {
        super(message, cause);
    }
}
