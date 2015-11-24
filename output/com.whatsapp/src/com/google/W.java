// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public abstract class W
{
    private static W a;
    
    static {
        W.a = new X();
    }
    
    public static W a() {
        return W.a;
    }
    
    protected static void a(final L l, final float[] array) {
        final int b = hN.b;
        final int g = l.g();
        final int a = l.a();
        int n = 0;
        int n2 = 1;
        while (n < array.length && n2 != 0) {
            final int n3 = (int)array[n];
            final int n4 = (int)array[n + 1];
            if (n3 < -1 || n3 > g || n4 < -1 || n4 > a) {
                throw fv.a();
            }
            Label_0113: {
                if (n3 == -1) {
                    array[n] = 0.0f;
                    if (b == 0) {
                        n2 = 1;
                        break Label_0113;
                    }
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
                if (n3 == g) {
                    array[n] = g - 1;
                    n2 = 1;
                }
            }
            Label_0154: {
                if (n4 == -1) {
                    array[n + 1] = 0.0f;
                    if (b == 0) {
                        n2 = 1;
                        break Label_0154;
                    }
                    n2 = 1;
                }
                if (n4 == a) {
                    array[n + 1] = a - 1;
                    n2 = 1;
                }
            }
            n += 2;
            if (b != 0) {
                break;
            }
        }
        int n5 = -2 + array.length;
        int n6 = 1;
        while (n5 >= 0 && n6 != 0) {
            final int n7 = (int)array[n5];
            final int n8 = (int)array[n5 + 1];
            if (n7 < -1 || n7 > g || n8 < -1 || n8 > a) {
                throw fv.a();
            }
            Label_0261: {
                if (n7 == -1) {
                    array[n5] = 0.0f;
                    if (b == 0) {
                        n6 = 1;
                        break Label_0261;
                    }
                    n6 = 1;
                }
                else {
                    n6 = 0;
                }
                if (n7 == g) {
                    array[n5] = g - 1;
                    n6 = 1;
                }
            }
            Label_0302: {
                if (n8 == -1) {
                    array[n5 + 1] = 0.0f;
                    if (b == 0) {
                        n6 = 1;
                        break Label_0302;
                    }
                    n6 = 1;
                }
                if (n8 == a) {
                    array[n5 + 1] = a - 1;
                    n6 = 1;
                }
            }
            n5 -= 2;
            if (b != 0) {
                break;
            }
        }
    }
    
    public abstract L a(final L p0, final int p1, final int p2, final float p3, final float p4, final float p5, final float p6, final float p7, final float p8, final float p9, final float p10, final float p11, final float p12, final float p13, final float p14, final float p15, final float p16, final float p17, final float p18);
    
    public abstract L a(final L p0, final int p1, final int p2, final ca p3);
}
