package com.wangfan.endecrypt.crypto.hash;

import com.wangfan.endecrypt.codec.Base64;
import com.wangfan.endecrypt.codec.Hex;

/**
 * Generates an SHA-384 Hash from a given input <tt>source</tt> with an optional <tt>salt</tt> and hash iterations.
 * <p/>
 * See the {@link SimpleHash SimpleHash} parent class JavaDoc for a detailed explanation of Hashing
 * techniques and how the overloaded constructors function.
 * <p/>
 * <b>JDK Version Note</b> - Attempting to instantiate this class on JREs prior to version 1.4.0 will throw
 * an {@link IllegalStateException IllegalStateException}
 *
 * @since 0.9
 */
public class Sha384Hash extends SimpleHash {

    //TODO - complete JavaDoc

    public static final String ALGORITHM_NAME = "SHA-384";

    public Sha384Hash() {
        super(ALGORITHM_NAME);
    }

    public Sha384Hash(Object source) {
        super(ALGORITHM_NAME, source);
    }

    public Sha384Hash(Object source, Object salt) {
        super(ALGORITHM_NAME, source, salt);
    }

    public Sha384Hash(Object source, Object salt, int hashIterations) {
        super(ALGORITHM_NAME, source, salt, hashIterations);
    }

    public static Sha384Hash fromHexString(String hex) {
        Sha384Hash hash = new Sha384Hash();
        hash.setBytes(Hex.decode(hex));
        return hash;
    }

    public static Sha384Hash fromBase64String(String base64) {
        Sha384Hash hash = new Sha384Hash();
        hash.setBytes(Base64.decode(base64));
        return hash;
    }
}
