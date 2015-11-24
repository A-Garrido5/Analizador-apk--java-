// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.security.MessageDigest;
import java.math.BigInteger;

public final class j
{
    private static final byte[] a;
    private static final xk b;
    
    static {
        a = a();
        b = new xk();
    }
    
    public static String a(final String s) {
        String a = "";
        try {
            if (j.a.length > 0) {
                a = xh.a(j.b.a(s.getBytes(), j.a), 2);
            }
            return a;
        }
        catch (Exception ex) {
            return a;
        }
    }
    
    private static byte[] a() {
        try {
            final byte[] byteArray = new BigInteger("be08ddcea956ae72c74de56431c607eb27ca650d", 16).toByteArray();
            final MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(byteArray);
            return instance.digest();
        }
        catch (Exception ex) {
            return new byte[0];
        }
    }
}
