// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

public class z
{
    public static int a(final int n, final int n2) {
        int n3 = 0;
        switch (n2) {
            default: {
                n3 = (n | n2);
                break;
            }
            case 1: {
                return 0xFFFFFFFB & (0xFFFFFF7F & (0x200 | (n | 0x1)));
            }
            case 256: {
                return 0xFFFFFFFB & (0xFFFFFF7F & (0x200 | (0x1 | (n | 0x100))));
            }
            case 4: {
                final boolean f = f(n);
                n3 = 4;
                if (f) {
                    return 32772;
                }
                break;
            }
            case 8192: {
                return 0xFFFFFFEF & (n | 0x2000);
            }
        }
        return n3;
    }
    
    public static boolean a(final int n) {
        return (n & 0x80) != 0x0;
    }
    
    public static int b(final int n, int n2) {
        if ((n2 & 0x1) != 0x0) {
            n2 = (0x1000 | (0x100 | (0x10 | (n2 | 0x80))));
        }
        return n & ~n2;
    }
    
    public static boolean b(final int n) {
        return (n & 0x1) != 0x0;
    }
    
    public static boolean c(final int n) {
        return (n & 0x2) != 0x0;
    }
    
    public static boolean d(final int n) {
        return (n & 0x2000) != 0x0;
    }
    
    public static boolean e(final int n) {
        return (n & 0x4) != 0x0;
    }
    
    public static boolean f(final int n) {
        return (0x8000 & n) != 0x0;
    }
    
    public static boolean g(final int n) {
        return (n & 0x200) != 0x0;
    }
    
    public static boolean h(final int n) {
        return (n & 0x8) != 0x0;
    }
    
    public static boolean i(final int n) {
        return (n & 0x10) != 0x0;
    }
    
    public static boolean j(final int n) {
        return (n & 0x20) != 0x0;
    }
    
    public static boolean k(final int n) {
        return (n & 0x4000) != 0x0;
    }
    
    public static boolean l(final int n) {
        return (n & 0x100) != 0x0;
    }
    
    public static boolean m(final int n) {
        return (n & 0x400) != 0x0;
    }
}
