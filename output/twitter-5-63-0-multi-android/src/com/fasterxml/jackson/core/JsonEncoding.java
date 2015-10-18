// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core;

public enum JsonEncoding
{
    a("UTF8", 0, "UTF-8", false, 8), 
    b("UTF16_BE", 1, "UTF-16BE", true, 16), 
    c("UTF16_LE", 2, "UTF-16LE", false, 16), 
    d("UTF32_BE", 3, "UTF-32BE", true, 32), 
    e("UTF32_LE", 4, "UTF-32LE", false, 32);
    
    protected final boolean _bigEndian;
    protected final int _bits;
    protected final String _javaName;
    
    private JsonEncoding(final String s, final int n, final String javaName, final boolean bigEndian, final int bits) {
        this._javaName = javaName;
        this._bigEndian = bigEndian;
        this._bits = bits;
    }
    
    public String a() {
        return this._javaName;
    }
    
    public boolean b() {
        return this._bigEndian;
    }
    
    public int c() {
        return this._bits;
    }
}
