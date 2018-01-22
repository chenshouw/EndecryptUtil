package com.wangfan.endecrypt.crypto.hash;

import com.wangfan.endecrypt.codec.ByteSource;

/**
 * Simple implementation of {@link HashRequest} that can be used when interacting with a {@link HashService}.
 *
 * @since 1.2
 */
public class SimpleHashRequest implements HashRequest {

    private final ByteSource source; //cannot be null - this is the source to hash.
    private final ByteSource salt; //null = no salt specified
    private final int iterations; //0 = not specified by the requestor; let the HashService decide.
    private final String algorithmName; //null = let the HashService decide.

    /**
     * Creates a new SimpleHashRequest instance.
     *
     * @param algorithmName the name of the hash algorithm to use.  This is often null as the
     * {@link HashService} implementation is usually configured with an appropriate algorithm name, but this
     * can be non-null if the hash service's algorithm should be overridden with a specific one for the duration
     * of the request.
     *
     * @param source the source to be hashed
     * @param salt any public salt which should be used when computing the hash
     * @param iterations the number of hash iterations to execute.  Zero (0) indicates no iterations were specified
     * for the request, at which point the number of iterations is decided by the {@code HashService}
     * @throws NullPointerException if {@code source} is null or empty.
     */
    public SimpleHashRequest(String algorithmName, ByteSource source, ByteSource salt, int iterations) {
        if (source == null) {
            throw new NullPointerException("source argument cannot be null");
        }
        this.source = source;
        this.salt = salt;
        this.algorithmName = algorithmName;
        this.iterations = Math.max(0, iterations);
    }

    public ByteSource getSource() {
        return this.source;
    }

    public ByteSource getSalt() {
        return this.salt;
    }

    public int getIterations() {
        return iterations;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }
}
