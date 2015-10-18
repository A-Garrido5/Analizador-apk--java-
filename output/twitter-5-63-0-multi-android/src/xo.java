import android.view.animation.Interpolator;

// 
// Decompiled by Procyon v0.5.30
// 

public class xo implements Interpolator
{
    private float a;
    private float b;
    private float c;
    private final xq d;
    
    public xo() {
        this(new xq());
    }
    
    public xo(final float n) {
        this(new xq(n));
    }
    
    xo(final xq d) {
        this.a = 0.001f;
        this.b = 0.002f;
        this.c = 0.0f;
        this.d = d;
    }
    
    private float a(final float n) {
        if (this.c <= 0.0f) {
            this.c = a(this.d, this.a, this.b);
        }
        return n * this.c;
    }
    
    private static float a(final xq xq, final float n, final float n2) {
        float n3 = 100.0f;
        float n4 = 0.0f;
        float a;
        float b;
        do {
            n4 += n3;
            a = xq.a(n4);
            b = xq.b(n4);
            n3 *= 2.0f;
        } while (Math.abs(a) > n || Math.abs(b) > n2);
        float n5 = n4;
        float n6 = b;
        float n7 = n3;
        float n8 = a;
        while (n7 > 1.0f) {
            n7 /= 2.0f;
            float n9;
            if (Math.abs(n8) < n && Math.abs(n6) < n2) {
                n9 = n5 - n7;
            }
            else {
                n9 = n5 + n7;
            }
            final float a2 = xq.a(n9);
            final float b2 = xq.b(n9);
            n8 = a2;
            n5 = n9;
            n6 = b2;
        }
        return n5;
    }
    
    public float getInterpolation(final float n) {
        return 1.0f - this.d.a(this.a(n));
    }
}
