// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core;

public enum JsonParser$Feature
{
    a("AUTO_CLOSE_SOURCE", 0, true), 
    b("ALLOW_COMMENTS", 1, false), 
    c("ALLOW_YAML_COMMENTS", 2, false), 
    d("ALLOW_UNQUOTED_FIELD_NAMES", 3, false), 
    e("ALLOW_SINGLE_QUOTES", 4, false), 
    f("ALLOW_UNQUOTED_CONTROL_CHARS", 5, false), 
    g("ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER", 6, false), 
    h("ALLOW_NUMERIC_LEADING_ZEROS", 7, false), 
    i("ALLOW_NON_NUMERIC_NUMBERS", 8, false), 
    j("STRICT_DUPLICATE_DETECTION", 9, false);
    
    private final boolean _defaultState;
    private final int _mask;
    
    private JsonParser$Feature(final String s, final int n, final boolean defaultState) {
        this._mask = 1 << this.ordinal();
        this._defaultState = defaultState;
    }
    
    public static int a() {
        int n = 0;
        for (final JsonParser$Feature jsonParser$Feature : values()) {
            if (jsonParser$Feature.b()) {
                n |= jsonParser$Feature.c();
            }
        }
        return n;
    }
    
    public boolean a(final int n) {
        return (n & this._mask) != 0x0;
    }
    
    public boolean b() {
        return this._defaultState;
    }
    
    public int c() {
        return this._mask;
    }
}
