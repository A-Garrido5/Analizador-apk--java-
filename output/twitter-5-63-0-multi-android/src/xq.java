// 
// Decompiled by Procyon v0.5.30
// 

public class xq
{
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    
    public xq() {
        this(1.5f);
    }
    
    public xq(final float n) {
        this(4.0f + n * 4.0f, 4.0f, 1.0f);
    }
    
    public xq(final float a, final float b, final float c) {
        this.k = 0.0f;
        this.l = 1.0f;
        this.m = 0.0f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = this.a();
        this.f = this.c();
        this.e = this.b();
        this.i = this.d(this.f, this.d);
        this.j = this.c(this.f, this.d);
        this.a(0.0f, 1.0f, 0.0f);
    }
    
    private float a() {
        return (float)Math.sqrt(this.a / this.c);
    }
    
    private float a(final float n, final float n2) {
        if ((this.f >= 0.0f && this.f < 1.0f) || this.f == 1.0f) {
            return n;
        }
        if (this.f > 1.0f) {
            return n + (n * this.i - n2) / (this.j - this.i);
        }
        throw new IllegalArgumentException();
    }
    
    private float b() {
        return (float)(this.d * Math.sqrt(1.0 - Math.pow(this.f, 2.0)));
    }
    
    private float b(final float n, final float n2) {
        if (this.f >= 0.0f && this.f < 1.0f) {
            return 1.0f / this.e * (n2 + n * (this.f * this.d));
        }
        if (this.f == 1.0f) {
            return n2 + n * this.d;
        }
        if (this.f > 1.0f) {
            return -(n * this.i - n2) / (this.j - this.i);
        }
        throw new IllegalArgumentException();
    }
    
    private float c() {
        return (float)(this.b / (2.0 * Math.sqrt(this.c * this.a)));
    }
    
    private float c(final float n, final float n2) {
        final float n3 = n2 * (2.0f * n);
        return (-n3 - (float)Math.sqrt(n3 * n3 - n2 * n2 * 4.0f)) / 2.0f;
    }
    
    private float d(final float n, final float n2) {
        final float n3 = n2 * (2.0f * n);
        return (-n3 + (float)Math.sqrt(n3 * n3 - n2 * n2 * 4.0f)) / 2.0f;
    }
    
    public float a(final float n) {
        final float n2 = 0.0062831854f * n;
        if (this.f >= 0.0f && this.f < 1.0f) {
            return this.k + (float)Math.pow(2.718281828459045, n2 * (-this.f * this.d)) * ((float)(this.h * Math.sin(n2 * this.e)) + (float)(this.g * Math.cos(n2 * this.e)));
        }
        if (this.f == 1.0f) {
            return this.k + (float)Math.pow(2.718281828459045, n2 * -this.d) * (this.g + n2 * this.h);
        }
        if (this.f > 1.0f) {
            return this.k + ((float)(this.h * Math.pow(2.718281828459045, n2 * this.j)) + (float)(this.g * Math.pow(2.718281828459045, n2 * this.i)));
        }
        throw new IllegalArgumentException();
    }
    
    public void a(final float k, final float n, final float m) {
        this.k = k;
        this.l = n - k;
        this.m = m;
        this.g = this.a(this.l, this.m);
        this.h = this.b(this.l, this.m);
    }
    
    public float b(final float n) {
        final float n2 = 0.0062831854f * n;
        double n3;
        if (this.f >= 0.0f && this.f < 1.0f) {
            n3 = -this.f * this.d * Math.pow(2.718281828459045, n2 * (-this.f * this.d)) * (this.g * Math.cos(n2 * this.e) + this.h * Math.sin(n2 * this.e)) + Math.pow(2.718281828459045, n2 * (-this.f * this.d)) * (this.g * -this.e * Math.sin(n2 * this.e) + this.h * this.e * Math.cos(n2 * this.e));
        }
        else if (this.f == 1.0f) {
            n3 = this.g * (-this.d * Math.pow(2.718281828459045, n2 * -this.d)) + this.h * Math.pow(2.718281828459045, n2 * -this.d) + n2 * this.h * (-this.d * Math.pow(2.718281828459045, n2 * -this.d));
        }
        else {
            if (this.f <= 1.0f) {
                throw new IllegalArgumentException();
            }
            n3 = this.g * this.i * Math.pow(2.718281828459045, n2 * this.i) + this.h * this.j * Math.pow(2.718281828459045, n2 * this.j);
        }
        return (float)n3;
    }
}
