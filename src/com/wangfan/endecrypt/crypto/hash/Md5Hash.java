package com.wangfan.endecrypt.crypto.hash;

import com.wangfan.endecrypt.codec.Base64;
import com.wangfan.endecrypt.codec.Hex;

/**
 * Generates an MD5 Hash (RFC 1321) from a given input <tt>source</tt> with an optional <tt>salt</tt> and
 * hash iterations.
 * <p/>
 * See the {@link SimpleHash SimpleHash} parent class JavaDoc for a detailed explanation of Hashing
 * techniques and how the overloaded constructors function.
 *
 * @since 0.9
 */
public class Md5Hash extends SimpleHash {

    //TODO - complete JavaDoc

    public static final String ALGORITHM_NAME = "MD5";

    public Md5Hash() {
        super(ALGORITHM_NAME);
    }

    public Md5Hash(Object source) {
        super(ALGORITHM_NAME, source);
    }

    public Md5Hash(Object source, Object salt) {
        super(ALGORITHM_NAME, source, salt);
    }

    public Md5Hash(Object source, Object salt, int hashIterations) {
        super(ALGORITHM_NAME, source, salt, hashIterations);
    }

    public static Md5Hash fromHexString(String hex) {
        Md5Hash hash = new Md5Hash();
        hash.setBytes(Hex.decode(hex));
        return hash;
    }

    public static Md5Hash fromBase64String(String base64) {
        Md5Hash hash = new Md5Hash();
        hash.setBytes(Base64.decode(base64));
        return hash;
    }
}
