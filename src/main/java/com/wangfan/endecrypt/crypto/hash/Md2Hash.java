package com.wangfan.endecrypt.crypto.hash;

import com.wangfan.endecrypt.codec.Base64;
import com.wangfan.endecrypt.codec.Hex;

/**
 * Generates an MD2 Hash (RFC 1319) from a given input <tt>source</tt> with an optional <tt>salt</tt> and
 * hash iterations.
 * <p/>
 * See the {@link SimpleHash SimpleHash} parent class JavaDoc for a detailed explanation of Hashing
 * techniques and how the overloaded constructors function.
 *
 * @since 0.9
 */
public class Md2Hash extends SimpleHash {

    public static final String ALGORITHM_NAME = "MD2";

    public Md2Hash() {
        super(ALGORITHM_NAME);
    }

    public Md2Hash(Object source) {
        super(ALGORITHM_NAME, source);
    }

    public Md2Hash(Object source, Object salt) {
        super(ALGORITHM_NAME, source, salt);
    }

    public Md2Hash(Object source, Object salt, int hashIterations) {
        super(ALGORITHM_NAME, source, salt, hashIterations);
    }

    public static Md2Hash fromHexString(String hex) {
        Md2Hash hash = new Md2Hash();
        hash.setBytes(Hex.decode(hex));
        return hash;
    }

    public static Md2Hash fromBase64String(String base64) {
        Md2Hash hash = new Md2Hash();
        hash.setBytes(Base64.decode(base64));
        return hash;
    }
}
