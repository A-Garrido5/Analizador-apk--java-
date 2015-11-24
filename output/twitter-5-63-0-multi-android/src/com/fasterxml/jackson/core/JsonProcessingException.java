// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core;

import java.io.IOException;

public class JsonProcessingException extends IOException
{
    static final long serialVersionUID = 123L;
    protected JsonLocation _location;
    
    protected JsonProcessingException(final String s, final JsonLocation jsonLocation) {
        this(s, jsonLocation, null);
    }
    
    protected JsonProcessingException(final String s, final JsonLocation location, final Throwable t) {
        super(s);
        if (t != null) {
            this.initCause(t);
        }
        this._location = location;
    }
    
    public JsonLocation a() {
        return this._location;
    }
    
    protected String b() {
        return null;
    }
    
    @Override
    public String getMessage() {
        String s = super.getMessage();
        if (s == null) {
            s = "N/A";
        }
        final JsonLocation a = this.a();
        final String b = this.b();
        if (a != null || b != null) {
            final StringBuilder sb = new StringBuilder(100);
            sb.append(s);
            if (b != null) {
                sb.append(b);
            }
            if (a != null) {
                sb.append('\n');
                sb.append(" at ");
                sb.append(a.toString());
            }
            s = sb.toString();
        }
        return s;
    }
    
    @Override
    public String toString() {
        return this.getClass().getName() + ": " + this.getMessage();
    }
}
