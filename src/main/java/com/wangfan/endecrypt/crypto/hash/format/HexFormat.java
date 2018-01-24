package com.wangfan.endecrypt.crypto.hash.format;

import com.wangfan.endecrypt.crypto.hash.Hash;

/**
 * {@code HashFormat} that outputs <em>only</em> The hash's digest bytes in hex format.  It does not print out
 * anything else (salt, iterations, etc).  This implementation is mostly provided as a convenience for
 * command-line hashing.
 *
 * @since 1.2
 */
public class HexFormat implements HashFormat {

    /**
     * Returns {@code hash != null ? hash.toHex() : null}.
     *
     * @param hash the hash instance to format into a String.
     * @return {@code hash != null ? hash.toHex() : null}.
     */
    public String format(Hash hash) {
        return hash != null ? hash.toHex() : null;
    }
}
