// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public class cs
{
    public static int c;
    private final float a;
    private final float b;
    
    public cs(final float b, final float a) {
        this.b = b;
        this.a = a;
    }
    
    public static float a(final cs cs, final cs cs2) {
        return gf.a(cs.b, cs.a, cs2.b, cs2.a);
    }
    
    private static float a(final cs cs, final cs cs2, final cs cs3) {
        final float b = cs2.b;
        final float a = cs2.a;
        return (cs3.b - b) * (cs.a - a) - (cs3.a - a) * (cs.b - b);
    }
    
    public static void a(final cs[] array) {
        final int c = cs.c;
        final float a = a(array[0], array[1]);
        final float a2 = a(array[1], array[2]);
        final float a3 = a(array[0], array[2]);
        cs cs = null;
        cs cs2 = null;
        cs cs3 = null;
        Label_0123: {
            if (a2 >= a && a2 >= a3) {
                cs = array[0];
                cs2 = array[1];
                cs3 = array[2];
                if (c == 0) {
                    break Label_0123;
                }
                ++fN.a;
            }
            if (a3 >= a2 && a3 >= a) {
                cs = array[1];
                cs2 = array[0];
                cs3 = array[2];
                if (c == 0) {
                    break Label_0123;
                }
            }
            cs = array[2];
            cs2 = array[0];
            cs3 = array[1];
        }
        if (a(cs2, cs, cs3) >= 0.0f) {
            final cs cs4 = cs3;
            cs3 = cs2;
            cs2 = cs4;
        }
        array[0] = cs3;
        array[1] = cs;
        array[2] = cs2;
    }
    
    public final float a() {
        return this.b;
    }
    
    public final float b() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof cs;
        boolean b2 = false;
        if (b) {
            final cs cs = (cs)o;
            final float n = fcmpl(this.b, cs.b);
            b2 = false;
            if (n == 0) {
                final float n2 = fcmpl(this.a, cs.a);
                b2 = false;
                if (n2 == 0) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return 31 * Float.floatToIntBits(this.b) + Float.floatToIntBits(this.a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(25);
        sb.append('(');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
