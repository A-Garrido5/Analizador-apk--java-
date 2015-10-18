import java.util.ArrayList;

// 
// Decompiled by Procyon v0.5.30
// 

public class pr
{
    long[] a;
    String[] b;
    String[] c;
    int d;
    long e;
    String f;
    String g;
    boolean h;
    boolean i;
    int j;
    ArrayList k;
    
    public int a() {
        return this.j;
    }
    
    public pr a(final int d) {
        this.d = d;
        return this;
    }
    
    public pr a(final long e) {
        this.e = e;
        return this;
    }
    
    public pr a(final String g) {
        this.g = g;
        return this;
    }
    
    pr a(final pr pr) {
        this.d = pr.d;
        this.e = pr.e;
        this.f = pr.f;
        this.g = pr.g;
        this.h = pr.h;
        this.i = pr.i;
        return this;
    }
    
    public pr a(final boolean h) {
        this.h = h;
        return this;
    }
    
    public pr a(final long[] a) {
        this.a = a;
        return this;
    }
    
    public pr a(final String[] b) {
        this.b = b;
        return this;
    }
    
    public int b() {
        return this.k.size();
    }
    
    public pr b(final String[] c) {
        this.c = c;
        return this;
    }
}
