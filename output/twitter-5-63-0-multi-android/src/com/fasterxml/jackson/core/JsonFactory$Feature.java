// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core;

public enum JsonFactory$Feature
{
    a("INTERN_FIELD_NAMES", 0, true), 
    b("CANONICALIZE_FIELD_NAMES", 1, true), 
    c("FAIL_ON_SYMBOL_HASH_OVERFLOW", 2, true);
    
    private final boolean _defaultState;
    
    private JsonFactory$Feature(final String s, final int n, final boolean defaultState) {
        this._defaultState = defaultState;
    }
    
    public static int a() {
        int n = 0;
        for (final JsonFactory$Feature jsonFactory$Feature : values()) {
            if (jsonFactory$Feature.b()) {
                n |= jsonFactory$Feature.c();
            }
        }
        return n;
    }
    
    public boolean a(final int n) {
        return (n & this.c()) != 0x0;
    }
    
    public boolean b() {
        return this._defaultState;
    }
    
    public int c() {
        return 1 << this.ordinal();
    }
}
