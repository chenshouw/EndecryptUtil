package com.wangfan.endecrypt.crypto.hash;

import com.wangfan.endecrypt.codec.ByteSource;
import com.wangfan.endecrypt.crypto.RandomNumberGenerator;

/**
 * A {@code HashService} that allows configuration of its strategy via JavaBeans-compatible setter methods.
 *
 * @since 1.2
 */
public interface ConfigurableHashService extends HashService {

    /**
     * Sets the 'private' (internal) salt to be paired with a 'public' (random or supplied) salt during hash computation.
     *
     * @param privateSalt the 'private' internal salt to be paired with a 'public' (random or supplied) salt during
     *                    hash computation.
     */
    void setPrivateSalt(ByteSource privateSalt);

    /**
     * Sets the number of hash iterations that will be performed during hash computation.
     *
     * @param iterations the number of hash iterations that will be performed during hash computation.
     */
    void setHashIterations(int iterations);

    /**
     * Sets the name of the {@link java.security.MessageDigest MessageDigest} algorithm that will be used to compute
     * hashes.
     *
     * @param name the name of the {@link java.security.MessageDigest MessageDigest} algorithm that will be used to
     *             compute hashes.
     */
    void setHashAlgorithmName(String name);

    /**
     * Sets a source of randomness used to generate public salts that will in turn be used during hash computation.
     *
     * @param rng a source of randomness used to generate public salts that will in turn be used during hash computation.
     */
    void setRandomNumberGenerator(RandomNumberGenerator rng);
}
