// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public abstract class gk extends gj
{
    private final int[] b;
    private final int[] c;
    private final int[] d;
    private final int[] e;
    private final float[] f;
    private final float[] g;
    
    protected gk() {
        final int c = e0.c;
        this.d = new int[4];
        this.b = new int[8];
        this.f = new float[4];
        this.g = new float[4];
        this.e = new int[this.b.length / 2];
        this.c = new int[this.b.length / 2];
        if (fN.a != 0) {
            e0.c = c + 1;
        }
    }
    
    protected static int a(final int[] array) {
        int n = 0;
        final int c = e0.c;
        final int length = array.length;
        int i = 0;
        while (i < length) {
            n += array[i];
            ++i;
            if (c != 0) {
                break;
            }
        }
        return n;
    }
    
    protected static int a(final int[] array, final int[][] array2) {
        final int c = e0.c;
        int i = 0;
        while (i < array2.length) {
            if (gj.a(array, array2[i], 0.45f) < 0.2f) {
                return i;
            }
            ++i;
            if (c != 0) {
                break;
            }
        }
        throw fv.a();
    }
    
    protected static void a(final int[] array, final float[] array2) {
        int n = 0;
        final int c = e0.c;
        float n2 = array2[0];
        int i = 1;
        while (i < array.length) {
            if (array2[i] < n2) {
                n2 = array2[i];
                n = i;
            }
            ++i;
            if (c != 0) {
                break;
            }
        }
        --array[n];
    }
    
    protected static void b(final int[] array, final float[] array2) {
        int n = 0;
        final int c = e0.c;
        float n2 = array2[0];
        int i = 1;
        while (i < array.length) {
            if (array2[i] > n2) {
                n2 = array2[i];
                n = i;
            }
            ++i;
            if (c != 0) {
                break;
            }
        }
        ++array[n];
    }
    
    protected static boolean b(final int[] array) {
        final int c = e0.c;
        final int n = array[0] + array[1];
        final float n2 = n / (n + array[2] + array[3]);
        if (n2 >= 0.7916667f && n2 <= 0.89285713f) {
            int n3 = Integer.MAX_VALUE;
            int n4 = Integer.MIN_VALUE;
            int n6;
            for (int length = array.length, i = 0; i < length; i = n6) {
                final int n5 = array[i];
                if (n5 > n4) {
                    n4 = n5;
                }
                if (n5 < n3) {
                    n3 = n5;
                }
                n6 = i + 1;
                if (c != 0) {
                    break;
                }
            }
            return n4 < n3 * 10;
        }
        return false;
    }
    
    protected final float[] a() {
        return this.g;
    }
    
    protected final int[] b() {
        return this.c;
    }
    
    protected final int[] c() {
        return this.e;
    }
    
    protected final float[] d() {
        return this.f;
    }
    
    protected final int[] e() {
        return this.b;
    }
    
    protected final int[] f() {
        return this.d;
    }
}
