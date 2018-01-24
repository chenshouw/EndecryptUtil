package com.wangfan.endecrypt.crypto.hash;

import com.wangfan.endecrypt.codec.ByteSource;

/**
 * A Cryptographic {@code Hash} represents a one-way conversion algorithm that transforms an input source to an
 * underlying byte array.  Hex and Base64-encoding output of the hashed bytes are automatically supported by the
 * inherited {@link #toHex() toHex()} and {@link #toBase64() toBase64()} methods.
 * <p/>
 * The bytes returned by the parent interface's {@link #getBytes() getBytes()} are the hashed value of the
 * original input source, also known as the 'checksum' or 'digest'.
 *
 * @see Md2Hash
 * @see Md5Hash
 * @see Sha1Hash
 * @see Sha256Hash
 * @see Sha384Hash
 * @see Sha512Hash
 * @since 0.9
 */
public interface Hash extends ByteSource {

    /**
     * Returns the name of the algorithm used to hash the input source, for example, {@code SHA-256}, {@code MD5}, etc.
     * <p/>
     * The name is expected to be a {@link java.security.MessageDigest MessageDigest} algorithm name.
     *
     * @return the the name of the algorithm used to hash the input source, for example, {@code SHA-256}, {@code MD5}, etc.
     * @since 1.1
     */
    String getAlgorithmName();

    /**
     * Returns a salt used to compute the hash or {@code null} if no salt was used.
     *
     * @return a salt used to compute the hash or {@code null} if no salt was used.
     * @since 1.2
     */
    ByteSource getSalt();

    /**
     * Returns the number of hash iterations used to compute the hash.
     *
     * @return the number of hash iterations used to compute the hash.
     * @since 1.2
     */
    int getIterations();

}
