package com.wangfan.endecrypt.crypto.hash.format;

import com.wangfan.endecrypt.crypto.hash.Hash;

/**
 * {@code HashFormat} that outputs <em>only</em> the hash's digest bytes in Base64 format.  It does not print out
 * anything else (salt, iterations, etc).  This implementation is mostly provided as a convenience for
 * command-line hashing.
 *
 * @since 1.2
 */
public class Base64Format implements HashFormat {

    /**
     * Returns {@code hash != null ? hash.toBase64() : null}.
     *
     * @param hash the hash instance to format into a String.
     * @return {@code hash != null ? hash.toBase64() : null}.
     */
    public String format(Hash hash) {
        return hash != null ? hash.toBase64() : null;
    }
}
