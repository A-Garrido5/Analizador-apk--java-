// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp;

public enum ResponseSource
{
    a("CACHE", 0), 
    b("CONDITIONAL_CACHE", 1), 
    c("NETWORK", 2), 
    d("NONE", 3);
    
    private ResponseSource(final String s, final int n) {
    }
    
    public boolean a() {
        return this == ResponseSource.b || this == ResponseSource.c;
    }
    
    public boolean b() {
        return this == ResponseSource.a || this == ResponseSource.b;
    }
}
