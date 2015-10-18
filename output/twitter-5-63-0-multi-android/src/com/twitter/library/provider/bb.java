// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.provider.BaseColumns;

public final class bb implements BaseColumns
{
    public static boolean a(final int n) {
        return (n & 0xE) != 0x0;
    }
    
    public static boolean b(final int n) {
        return (n & 0x2) != 0x0;
    }
    
    public static boolean c(final int n) {
        return (n & 0x4) != 0x0;
    }
    
    public static boolean d(final int n) {
        return (n & 0x8) != 0x0;
    }
    
    public static boolean e(final int n) {
        return (n & 0x1) != 0x0;
    }
    
    public static boolean f(final int n) {
        return (n & 0x10) != 0x0;
    }
    
    public static boolean g(final int n) {
        return (0x38000000 & n) != 0x0;
    }
    
    public static boolean h(final int n) {
        return (0x40000 & n) != 0x0;
    }
    
    public static boolean i(final int n) {
        return (0x80000 & n) != 0x0;
    }
    
    public static boolean j(final int n) {
        return (0x4000000 & n) != 0x0;
    }
    
    public static boolean k(final int n) {
        return (0x8000 & n) != 0x0;
    }
    
    public static boolean l(final int n) {
        return (0x1000000 & n) != 0x0;
    }
    
    public static boolean m(final int n) {
        return (0x2000000 & n) != 0x0;
    }
    
    public static boolean n(final int n) {
        return (0x8000000 & n) != 0x0;
    }
    
    public static boolean o(final int n) {
        return (0x10000000 & n) != 0x0;
    }
    
    public static boolean p(final int n) {
        return (0x20000000 & n) != 0x0;
    }
    
    public static boolean q(final int n) {
        return (0x10000 & n) != 0x0;
    }
    
    public static boolean r(final int n) {
        return (n & 0x100) != 0x0;
    }
    
    public static boolean s(final int n) {
        return (0x100000 & n) != 0x0 && (0x200000 & n) == 0x0;
    }
    
    public static boolean t(final int n) {
        return (0x400000 & n) != 0x0;
    }
    
    public static boolean u(final int n) {
        return t(n) && (0x800000 & n) != 0x0;
    }
}
