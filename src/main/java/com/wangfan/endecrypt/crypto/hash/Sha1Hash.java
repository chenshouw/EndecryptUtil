package com.wangfan.endecrypt.crypto.hash;

import com.wangfan.endecrypt.codec.Base64;
import com.wangfan.endecrypt.codec.Hex;

/**
 * Generates an SHA-1 Hash (Secure Hash Standard, NIST FIPS 180-1) from a given input <tt>source</tt> with an
 * optional <tt>salt</tt> and hash iterations.
 * <p/>
 * See the {@link SimpleHash SimpleHash} parent class JavaDoc for a detailed explanation of Hashing
 * techniques and how the overloaded constructors function.
 *
 * @since 0.9
 */
public class Sha1Hash extends SimpleHash {

    //TODO - complete JavaDoc

    public static final String ALGORITHM_NAME = "SHA-1";

    public Sha1Hash() {
        super(ALGORITHM_NAME);
    }

    public Sha1Hash(Object source) {
        super(ALGORITHM_NAME, source);
    }

    public Sha1Hash(Object source, Object salt) {
        super(ALGORITHM_NAME, source, salt);
    }

    public Sha1Hash(Object source, Object salt, int hashIterations) {
        super(ALGORITHM_NAME, source, salt, hashIterations);
    }

    public static Sha1Hash fromHexString(String hex) {
        Sha1Hash hash = new Sha1Hash();
        hash.setBytes(Hex.decode(hex));
        return hash;
    }

    public static Sha1Hash fromBase64String(String base64) {
        Sha1Hash hash = new Sha1Hash();
        hash.setBytes(Base64.decode(base64));
        return hash;
    }
}
