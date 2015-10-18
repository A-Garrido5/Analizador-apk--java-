// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

public final class dd
{
    public static final int[] a;
    public static final long[] b;
    public static final float[] c;
    public static final double[] d;
    public static final boolean[] e;
    public static final String[] f;
    public static final byte[][] g;
    public static final byte[] h;
    
    static {
        a = new int[0];
        b = new long[0];
        c = new float[0];
        d = new double[0];
        e = new boolean[0];
        f = new String[0];
        g = new byte[0][];
        h = new byte[0];
    }
    
    public static int a(final int n) {
        return n >>> 3;
    }
    
    static int a(final int n, final int n2) {
        return n2 | n << 3;
    }
}
