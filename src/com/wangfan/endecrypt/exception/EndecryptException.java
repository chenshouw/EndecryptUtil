package com.wangfan.endecrypt.exception;

/**
 * Root exception for all Shiro runtime exceptions.  This class is used as the root instead
 * of {@link java.lang.SecurityException} to remove the potential for conflicts;  many other
 * frameworks and products (such as J2EE containers) perform special operations when
 * encountering {@link java.lang.SecurityException}.
 *
 * @since 0.1
 */
public class EndecryptException extends RuntimeException {

    /**
     * Creates a new ShiroException.
     */
    public EndecryptException() {
        super();
    }

    /**
     * Constructs a new ShiroException.
     *
     * @param message the reason for the exception
     */
    public EndecryptException(String message) {
        super(message);
    }

    /**
     * Constructs a new ShiroException.
     *
     * @param cause the underlying Throwable that caused this exception to be thrown.
     */
    public EndecryptException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new ShiroException.
     *
     * @param message the reason for the exception
     * @param cause   the underlying Throwable that caused this exception to be thrown.
     */
    public EndecryptException(String message, Throwable cause) {
        super(message, cause);
    }

}
