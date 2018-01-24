package com.wangfan.endecrypt.crypto.hash.format;

import java.util.Locale;

/**
 * An enum representing Shiro's default provided {@link HashFormat} implementations.
 *
 * @since 1.2
 */
public enum ProvidedHashFormat {

    /**
     * Value representing the {@link HexFormat} implementation.
     */
    HEX(HexFormat.class),

    /**
     * Value representing the {@link Base64Format} implementation.
     */
    BASE64(Base64Format.class),

    /**
     * Value representing the {@link Shiro1CryptFormat} implementation.
     */
    SHIRO1(Shiro1CryptFormat.class);

    private final Class<? extends HashFormat> clazz;

    private ProvidedHashFormat(Class<? extends HashFormat> clazz) {
        this.clazz = clazz;
    }

    Class<? extends HashFormat> getHashFormatClass() {
        return this.clazz;
    }

    public static ProvidedHashFormat byId(String id) {
        if (id == null) {
            return null;
        }
        try {
            // Use English Locale, some Locales handle uppercase/lower differently. i.e. Turkish and upper case 'i'
            // is not 'I'. And 'SHIRO1' would be 'SHİRO1'
            return valueOf(id.toUpperCase(Locale.ENGLISH));
        } catch (IllegalArgumentException ignored) {
            return null;
        }
    }

}
