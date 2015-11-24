// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.playback;

public class aw
{
    public final long a;
    public final long b;
    public final int c;
    
    public aw(final long a, final long b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static aw a(final long n, final long n2) {
        return new aw(n, n2, b(n, n2));
    }
    
    public static int b(final long n, final long n2) {
        if (n2 <= 0L || n <= 0L) {
            return 0;
        }
        return (int)Math.round(100.0 * n / n2);
    }
}
