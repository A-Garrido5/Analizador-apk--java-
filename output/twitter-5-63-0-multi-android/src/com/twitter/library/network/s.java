// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

public class s
{
    public static final s[] a;
    private final String b;
    private final int c;
    private final int d;
    
    static {
        a = new s[] { new s("India 2G", 70, 718), new s("India 3G", 920, 487) };
    }
    
    public s(final String b, final int c, final int d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public String a() {
        return this.b;
    }
    
    public int b() {
        return this.c;
    }
    
    public int c() {
        return this.d;
    }
}
