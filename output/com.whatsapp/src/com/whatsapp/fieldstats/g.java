// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum g
{
    public static final g A;
    public static final g B;
    private static final g[] b;
    private final int a;
    
    static {
        A = new g("A", 0, 0);
        B = new g("B", 1, 1);
        b = new g[] { g.A, g.B };
    }
    
    private g(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
