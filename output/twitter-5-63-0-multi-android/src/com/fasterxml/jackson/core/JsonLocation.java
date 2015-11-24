// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core;

import java.io.Serializable;

public class JsonLocation implements Serializable
{
    public static final JsonLocation a;
    private static final long serialVersionUID = 1L;
    final int _columnNr;
    final int _lineNr;
    final long _totalBytes;
    final long _totalChars;
    final transient Object b;
    
    static {
        a = new JsonLocation("N/A", -1L, -1L, -1, -1);
    }
    
    public JsonLocation(final Object o, final long n, final int n2, final int n3) {
        this(o, -1L, n, n2, n3);
    }
    
    public JsonLocation(final Object b, final long totalBytes, final long totalChars, final int lineNr, final int columnNr) {
        this.b = b;
        this._totalBytes = totalBytes;
        this._totalChars = totalChars;
        this._lineNr = lineNr;
        this._columnNr = columnNr;
    }
    
    public long a() {
        return this._totalBytes;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        boolean b2;
        if (o == this) {
            b2 = b;
        }
        else {
            b2 = false;
            if (o != null) {
                final boolean b3 = o instanceof JsonLocation;
                b2 = false;
                if (b3) {
                    final JsonLocation jsonLocation = (JsonLocation)o;
                    if (this.b == null) {
                        final Object b4 = jsonLocation.b;
                        b2 = false;
                        if (b4 != null) {
                            return b2;
                        }
                    }
                    else if (!this.b.equals(jsonLocation.b)) {
                        return false;
                    }
                    if (this._lineNr != jsonLocation._lineNr || this._columnNr != jsonLocation._columnNr || this._totalChars != jsonLocation._totalChars || this.a() != jsonLocation.a()) {
                        b = false;
                    }
                    return b;
                }
            }
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.b == null) {
            hashCode = 1;
        }
        else {
            hashCode = this.b.hashCode();
        }
        return ((hashCode ^ this._lineNr) + this._columnNr ^ (int)this._totalChars) + (int)this._totalBytes;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(80);
        sb.append("[Source: ");
        if (this.b == null) {
            sb.append("UNKNOWN");
        }
        else {
            sb.append(this.b.toString());
        }
        sb.append("; line: ");
        sb.append(this._lineNr);
        sb.append(", column: ");
        sb.append(this._columnNr);
        sb.append(']');
        return sb.toString();
    }
}
