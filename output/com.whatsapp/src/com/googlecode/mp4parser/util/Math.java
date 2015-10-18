// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.util;

public class Math
{
    public static int gcd(int n, int i) {
        while (i > 0) {
            final int n2 = i;
            i = n % i;
            n = n2;
        }
        return n;
    }
    
    public static long gcd(long n, long n2) {
        while (n2 > 0L) {
            final long n3 = n2;
            n2 = n % n2;
            n = n3;
        }
        return n;
    }
    
    public static int lcm(final int n, final int n2) {
        return n * (n2 / gcd(n, n2));
    }
    
    public static long lcm(final long n, final long n2) {
        return n * (n2 / gcd(n, n2));
    }
}
