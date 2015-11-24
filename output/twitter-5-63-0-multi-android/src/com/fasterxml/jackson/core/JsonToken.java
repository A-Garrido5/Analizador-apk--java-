// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core;

public enum JsonToken
{
    a("NOT_AVAILABLE", 0, (String)null, -1), 
    b("START_OBJECT", 1, "{", 1), 
    c("END_OBJECT", 2, "}", 2), 
    d("START_ARRAY", 3, "[", 3), 
    e("END_ARRAY", 4, "]", 4), 
    f("FIELD_NAME", 5, (String)null, 5), 
    g("VALUE_EMBEDDED_OBJECT", 6, (String)null, 12), 
    h("VALUE_STRING", 7, (String)null, 6), 
    i("VALUE_NUMBER_INT", 8, (String)null, 7), 
    j("VALUE_NUMBER_FLOAT", 9, (String)null, 8), 
    k("VALUE_TRUE", 10, "true", 9), 
    l("VALUE_FALSE", 11, "false", 10), 
    m("VALUE_NULL", 12, "null", 11);
    
    final int _id;
    final boolean _isBoolean;
    final boolean _isNumber;
    final boolean _isScalar;
    final boolean _isStructEnd;
    final boolean _isStructStart;
    final String _serialized;
    final byte[] _serializedBytes;
    final char[] _serializedChars;
    
    private JsonToken(final String s, final int n, final String serialized, final int id) {
        boolean isScalar = true;
        super(s, n);
        if (serialized == null) {
            this._serialized = null;
            this._serializedChars = null;
            this._serializedBytes = null;
        }
        else {
            this._serialized = serialized;
            this._serializedChars = serialized.toCharArray();
            final int length = this._serializedChars.length;
            this._serializedBytes = new byte[length];
            for (int i = 0; i < length; ++i) {
                this._serializedBytes[i] = (byte)this._serializedChars[i];
            }
        }
        this._id = id;
        this._isBoolean = ((id == 10 || id == 9) && isScalar);
        this._isNumber = ((id == 7 || id == 8) && isScalar);
        this._isStructStart = ((id == (isScalar ? 1 : 0) || id == 3) && isScalar);
        this._isStructEnd = ((id == 2 || id == 4) && isScalar);
        if (this._isStructStart || this._isStructEnd || id == 5 || id == -1) {
            isScalar = false;
        }
        this._isScalar = isScalar;
    }
    
    public final int a() {
        return this._id;
    }
    
    public final String b() {
        return this._serialized;
    }
    
    public final boolean c() {
        return this._isStructStart;
    }
    
    public final boolean d() {
        return this._isStructEnd;
    }
    
    public final boolean e() {
        return this._isScalar;
    }
}
