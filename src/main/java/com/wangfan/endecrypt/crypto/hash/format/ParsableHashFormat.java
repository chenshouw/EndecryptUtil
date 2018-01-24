package com.wangfan.endecrypt.crypto.hash.format;

import com.wangfan.endecrypt.crypto.hash.Hash;


/**
 * A {@code ParsableHashFormat} is able to parse a formatted string and convert it into a {@link Hash} instance.
 * <p/>
 * This interface exists to represent {@code HashFormat}s that can offer two-way conversion
 * (Hash -&gt; String, String -&gt; Hash) capabilities.  Some HashFormats, such as many {@link ModularCryptFormat}s
 * (like Unix Crypt(3)) only support one way conversion and therefore wouldn't implement this interface.
 *
 * @see Shiro1CryptFormat
 *
 * @since 1.2
 */
public interface ParsableHashFormat extends HashFormat {

    /**
     * Parses the specified formatted string and returns the corresponding Hash instance.
     *
     * @param formatted the formatted string representing a Hash.
     * @return the corresponding Hash instance.
     */
    Hash parse(String formatted);
}
