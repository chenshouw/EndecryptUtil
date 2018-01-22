package com.wangfan.endecrypt.crypto.hash.format;

import com.wangfan.endecrypt.crypto.hash.Hash;

/**
 * A {@code HashFormat} is able to format a {@link Hash} instance into a well-defined formatted String.
 * <p/>
 * Note that not all HashFormat algorithms are reversible.  That is, they can't be parsed and reconstituted to the
 * original Hash instance.  The traditional <a href="http://en.wikipedia.org/wiki/Crypt_(Unix)">
 * Unix crypt(3)</a> is one such format.
 * <p/>
 * The formats that <em>are</em> reversible however will be represented as {@link ParsableHashFormat} instances.
 *
 * @see ParsableHashFormat
 *
 * @since 1.2
 */
public interface HashFormat {

    /**
     * Returns a formatted string representing the specified Hash instance.
     *
     * @param hash the hash instance to format into a String.
     * @return a formatted string representing the specified Hash instance.
     */
    String format(Hash hash);
}
