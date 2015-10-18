import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.5.30
// 

public final class aw implements at
{
    long[] a;
    private int b;
    
    public aw() {
        this.a = new long[1];
    }
    
    private aw(final av av) {
        this.a = new long[] { av.a, 0L };
    }
    
    private void e(final int n) {
        final long[] a = new long[n];
        if (this.a != null) {
            System.arraycopy(this.a, 0, a, 0, this.a.length);
        }
        this.a = a;
    }
    
    private int f(final int n) {
        final int n2 = (n + this.b) / 64;
        if (n2 > -1 + this.a.length) {
            this.e(n2 + 1);
        }
        return n2;
    }
    
    private int g(final int n) {
        return (n + this.b) % 64;
    }
    
    private static int h(final int n) {
        if (n < 0) {
            throw new IllegalArgumentException(String.format("input must be a positive number: %s", n));
        }
        return n;
    }
    
    @Override
    public void a() {
        Arrays.fill(this.a, 0L);
    }
    
    @Override
    public void a(final int n) {
        h(n);
        final int f = this.f(n);
        final long[] a = this.a;
        a[f] |= 1L << this.g(n);
    }
    
    List b() {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 64 * this.a.length - this.b; ++i) {
            if (this.c(i)) {
                list.add(i);
            }
        }
        return list;
    }
    
    @Override
    public void b(final int n) {
        h(n);
        final int f = this.f(n);
        final long[] a = this.a;
        a[f] ^= 1L << this.g(n);
    }
    
    @Override
    public boolean c(final int n) {
        h(n);
        return (this.a[this.f(n)] & 1L << this.g(n)) != 0x0L;
    }
    
    @Override
    public void d(final int n) {
        this.b -= h(n);
        if (this.b < 0) {
            final int n2 = 1 + this.b / -64;
            final long[] a = new long[n2 + this.a.length];
            System.arraycopy(this.a, 0, a, n2, this.a.length);
            this.a = a;
            this.b = 64 + this.b % 64;
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        final List b = this.b();
        for (int i = 0; i < b.size(); ++i) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(b.get(i));
        }
        return sb.append('}').toString();
    }
}
