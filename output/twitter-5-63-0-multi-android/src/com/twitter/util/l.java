// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util;

import java.util.Arrays;

public class l
{
    public static int a(final float n) {
        if (n != 0.0f) {
            return Float.floatToIntBits(n);
        }
        return 0;
    }
    
    public static int a(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static int a(final Object o) {
        if (o != null) {
            return o.hashCode();
        }
        return 0;
    }
    
    public static int a(final Object... array) {
        return Arrays.hashCode(array);
    }
    
    public static boolean a(final Object o, final Object o2) {
        return (o == null && o2 == null) || (o != null && o.equals(o2));
    }
}
