package com.wangfan.endecrypt.crypto.hash.format;

/**
 * A {@code HashFormat} that supports
 * <a href="http://packages.python.org/passlib/modular_crypt_format.html">Modular Crypt Format</a> token rules.
 *
 * @see <a href="http://en.wikipedia.org/wiki/Crypt_(Unix)">Crypt (unix)</a>
 * @see <a href="http://www.tummy.com/journals/entries/jafo_20110117_054918">MCF Journal Entry</a>
 * @since 1.2
 */
public interface ModularCryptFormat extends HashFormat {

    public static final String TOKEN_DELIMITER = "$";

    /**
     * Returns the Modular Crypt Format identifier that indicates how the formatted String should be parsed.  This id
     * is always in the MCF-formatted string's first token.
     * <p/>
     * Example values are {@code md5}, {@code 1}, {@code 2}, {@code apr1}, etc.
     *
     * @return the Modular Crypt Format identifier that indicates how the formatted String should be parsed.
     */
    String getId();
}
