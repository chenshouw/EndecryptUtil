package com.wangfan.endecrypt.exception;


/**
 * Runtime exception thrown by the framework when unable to instantiate a Class via reflection.
 *
 * @since 0.2
 */
public class InstantiationException extends EndecryptException
{

    /**
     * Creates a new InstantiationException.
     */
    public InstantiationException() {
        super();
    }

    /**
     * Constructs a new InstantiationException.
     *
     * @param message the reason for the exception
     */
    public InstantiationException(String message) {
        super(message);
    }

    /**
     * Constructs a new InstantiationException.
     *
     * @param cause the underlying Throwable that caused this exception to be thrown.
     */
    public InstantiationException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new InstantiationException.
     *
     * @param message the reason for the exception
     * @param cause   the underlying Throwable that caused this exception to be thrown.
     */
    public InstantiationException(String message, Throwable cause) {
        super(message, cause);
    }
}
