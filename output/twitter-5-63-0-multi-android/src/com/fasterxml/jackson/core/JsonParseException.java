// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core;

public class JsonParseException extends JsonProcessingException
{
    private static final long serialVersionUID = 1L;
    
    public JsonParseException(final String s, final JsonLocation jsonLocation) {
        super(s, jsonLocation);
    }
    
    public JsonParseException(final String s, final JsonLocation jsonLocation, final Throwable t) {
        super(s, jsonLocation, t);
    }
}
