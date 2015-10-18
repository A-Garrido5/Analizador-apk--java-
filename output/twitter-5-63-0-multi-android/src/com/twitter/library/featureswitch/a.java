// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.featureswitch;

import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
import java.security.MessageDigest;

public class a
{
    public static int a(final String s, final String s2) {
        try {
            return new BigInteger(1, MessageDigest.getInstance("MD5").digest((s + ":" + s2).getBytes())).mod(new BigInteger(String.valueOf(10000))).intValue();
        }
        catch (NoSuchAlgorithmException ex) {
            return 0;
        }
    }
}
