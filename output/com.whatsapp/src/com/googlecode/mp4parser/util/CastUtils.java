// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.util;

public class CastUtils
{
    public static int l2i(final long n) {
        if (n > 2147483647L || n < -2147483648L) {
            throw new RuntimeException("A cast to int has gone wrong. Please contact the mp4parser discussion group (" + n + ")");
        }
        return (int)n;
    }
}
