// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core;

public enum JsonGenerator$Feature
{
    a("AUTO_CLOSE_TARGET", 0, true), 
    b("AUTO_CLOSE_JSON_CONTENT", 1, true), 
    c("QUOTE_FIELD_NAMES", 2, true), 
    d("QUOTE_NON_NUMERIC_NUMBERS", 3, true), 
    e("WRITE_NUMBERS_AS_STRINGS", 4, false), 
    f("WRITE_BIGDECIMAL_AS_PLAIN", 5, false), 
    g("FLUSH_PASSED_TO_STREAM", 6, true), 
    h("ESCAPE_NON_ASCII", 7, false), 
    i("STRICT_DUPLICATE_DETECTION", 8, false), 
    j("IGNORE_UNKNOWN", 9, false);
    
    private final boolean _defaultState;
    private final int _mask;
    
    private JsonGenerator$Feature(final String s, final int n, final boolean defaultState) {
        this._defaultState = defaultState;
        this._mask = 1 << this.ordinal();
    }
    
    public static int a() {
        int n = 0;
        for (final JsonGenerator$Feature jsonGenerator$Feature : values()) {
            if (jsonGenerator$Feature.b()) {
                n |= jsonGenerator$Feature.c();
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
