// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class ca
{
    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    
    private ca(final float g, final float i, final float d, final float h, final float a, final float e, final float b, final float c, final float f) {
        this.g = g;
        this.h = h;
        this.b = b;
        this.i = i;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static ca a(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8) {
        final float n9 = n5 + (n - n3) - n7;
        final float n10 = n6 + (n2 - n4) - n8;
        if (n9 == 0.0f && n10 == 0.0f) {
            return new ca(n3 - n, n5 - n3, n, n4 - n2, n6 - n4, n2, 0.0f, 0.0f, 1.0f);
        }
        final float n11 = n3 - n5;
        final float n12 = n7 - n5;
        final float n13 = n4 - n6;
        final float n14 = n8 - n6;
        final float n15 = n11 * n14 - n12 * n13;
        final float n16 = (n14 * n9 - n12 * n10) / n15;
        final float n17 = (n10 * n11 - n9 * n13) / n15;
        return new ca(n3 - n + n16 * n3, n7 - n + n17 * n7, n, n4 - n2 + n16 * n4, n8 - n2 + n17 * n8, n2, n16, n17, 1.0f);
    }
    
    public static ca a(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final float n10, final float n11, final float n12, final float n13, final float n14, final float n15, final float n16) {
        return a(n9, n10, n11, n12, n13, n14, n15, n16).a(b(n, n2, n3, n4, n5, n6, n7, n8));
    }
    
    public static ca b(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8) {
        return a(n, n2, n3, n4, n5, n6, n7, n8).a();
    }
    
    ca a() {
        final int b = hN.b;
        final ca ca = new ca(this.a * this.f - this.c * this.e, this.c * this.d - this.i * this.f, this.i * this.e - this.a * this.d, this.b * this.e - this.h * this.f, this.g * this.f - this.b * this.d, this.h * this.d - this.g * this.e, this.h * this.c - this.b * this.a, this.b * this.i - this.g * this.c, this.g * this.a - this.h * this.i);
        if (fN.a != 0) {
            hN.b = b + 1;
        }
        return ca;
    }
    
    ca a(final ca ca) {
        final int b = hN.b;
        final ca ca2 = new ca(this.g * ca.g + this.i * ca.h + this.d * ca.b, this.g * ca.i + this.i * ca.a + this.d * ca.c, this.g * ca.d + this.i * ca.e + this.d * ca.f, this.h * ca.g + this.a * ca.h + this.e * ca.b, this.h * ca.i + this.a * ca.a + this.e * ca.c, this.h * ca.d + this.a * ca.e + this.e * ca.f, this.b * ca.g + this.c * ca.h + this.f * ca.b, this.b * ca.i + this.c * ca.a + this.f * ca.c, this.b * ca.d + this.c * ca.e + this.f * ca.f);
        if (b != 0) {
            ++fN.a;
        }
        return ca2;
    }
    
    public void a(final float[] array) {
        final int b = hN.b;
        final int length = array.length;
        final float g = this.g;
        final float h = this.h;
        final float b2 = this.b;
        final float i = this.i;
        final float a = this.a;
        final float c = this.c;
        final float d = this.d;
        final float e = this.e;
        final float f = this.f;
        int j = 0;
        while (j < length) {
            final float n = array[j];
            final float n2 = array[j + 1];
            final float n3 = f + (b2 * n + c * n2);
            array[j] = (d + (g * n + i * n2)) / n3;
            array[j + 1] = (e + (n * h + n2 * a)) / n3;
            j += 2;
            if (b != 0) {
                break;
            }
        }
    }
}
