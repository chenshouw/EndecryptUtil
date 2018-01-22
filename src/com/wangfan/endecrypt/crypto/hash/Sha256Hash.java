package com.wangfan.endecrypt.crypto.hash;

import com.wangfan.endecrypt.codec.Base64;
import com.wangfan.endecrypt.codec.Hex;

/**
 * Generates an SHA-256 Hash from a given input <tt>source</tt> with an optional <tt>salt</tt> and hash iterations.
 * <p/>
 * See the {@link SimpleHash SimpleHash} parent class JavaDoc for a detailed explanation of Hashing
 * techniques and how the overloaded constructors function.
 * <p/>
 * <b>JDK Version Note</b> - Attempting to instantiate this class on JREs prior to version 1.4.0 will throw
 * an {@link IllegalStateException IllegalStateException}
 *
 * @since 0.9
 */
public class Sha256Hash extends SimpleHash {

    //TODO - complete JavaDoc

    public static final String ALGORITHM_NAME = "SHA-256";

    public Sha256Hash() {
        super(ALGORITHM_NAME);
    }

    public Sha256Hash(Object source) {
        super(ALGORITHM_NAME, source);
    }

    public Sha256Hash(Object source, Object salt) {
        super(ALGORITHM_NAME, source, salt);
    }

    public Sha256Hash(Object source, Object salt, int hashIterations) {
        super(ALGORITHM_NAME, source, salt, hashIterations);
    }

    public static Sha256Hash fromHexString(String hex) {
        Sha256Hash hash = new Sha256Hash();
        hash.setBytes(Hex.decode(hex));
        return hash;
    }

    public static Sha256Hash fromBase64String(String base64) {
        Sha256Hash hash = new Sha256Hash();
        hash.setBytes(Base64.decode(base64));
        return hash;
    }
}
