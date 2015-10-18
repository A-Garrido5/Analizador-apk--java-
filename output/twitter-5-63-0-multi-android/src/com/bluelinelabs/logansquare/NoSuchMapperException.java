// 
// Decompiled by Procyon v0.5.30
// 

package com.bluelinelabs.logansquare;

public class NoSuchMapperException extends RuntimeException
{
    public NoSuchMapperException(final Class clazz, final Exception ex) {
        super("Class " + clazz.getCanonicalName() + " could not be mapped to a JSON object. Perhaps it hasn't been annotated with @JsonObject?", ex);
    }
}
