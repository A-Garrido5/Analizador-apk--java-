// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core;

public class JsonGenerationException extends JsonProcessingException
{
    private static final long serialVersionUID = 123L;
    
    public JsonGenerationException(final String s) {
        super(s, (JsonLocation)null);
    }
}
