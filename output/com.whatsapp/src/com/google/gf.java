// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class gf
{
    public static boolean a;
    
    public static float a(final float n, final float n2, final float n3, final float n4) {
        final float n5 = n - n3;
        final float n6 = n2 - n4;
        return (float)Math.sqrt(n5 * n5 + n6 * n6);
    }
    
    public static float a(final int n, final int n2, final int n3, final int n4) {
        final int n5 = n - n3;
        final int n6 = n2 - n4;
        return (float)Math.sqrt(n5 * n5 + n6 * n6);
    }
    
    public static int a(final float n) {
        float n2;
        if (n < 0.0f) {
            n2 = -0.5f;
        }
        else {
            n2 = 0.5f;
        }
        return (int)(n2 + n);
    }
}
