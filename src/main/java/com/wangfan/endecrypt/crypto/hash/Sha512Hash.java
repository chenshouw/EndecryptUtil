package com.wangfan.endecrypt.crypto.hash;

import com.wangfan.endecrypt.codec.Base64;
import com.wangfan.endecrypt.codec.Hex;

/**
 * Generates an SHA-512 Hash from a given input <tt>source</tt> with an optional <tt>salt</tt> and hash iterations.
 * <p/>
 * See the {@link SimpleHash SimpleHash} parent class JavaDoc for a detailed explanation of Hashing
 * techniques and how the overloaded constructors function.
 * <p/>
 * <b>JDK Version Note</b> - Attempting to instantiate this class on JREs prior to version 1.4.0 will throw
 * an {@link IllegalStateException IllegalStateException}
 *
 * @since 0.9
 */
public class Sha512Hash extends SimpleHash {

    //TODO - complete JavaDoc

    public static final String ALGORITHM_NAME = "SHA-512";

    public Sha512Hash() {
        super(ALGORITHM_NAME);
    }

    public Sha512Hash(Object source) {
        super(ALGORITHM_NAME, source);
    }

    public Sha512Hash(Object source, Object salt) {
        super(ALGORITHM_NAME, source, salt);
    }

    public Sha512Hash(Object source, Object salt, int hashIterations) {
        super(ALGORITHM_NAME, source, salt, hashIterations);
    }

    public static Sha512Hash fromHexString(String hex) {
        Sha512Hash hash = new Sha512Hash();
        hash.setBytes(Hex.decode(hex));
        return hash;
    }

    public static Sha512Hash fromBase64String(String base64) {
        Sha512Hash hash = new Sha512Hash();
        hash.setBytes(Base64.decode(base64));
        return hash;
    }
}

