package com.wangfan.endecrypt.crypto.hash.format;

/**
 * @since 1.2
 */
public interface HashFormatFactory {

    HashFormat getInstance(String token);
}
