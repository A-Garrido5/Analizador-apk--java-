// 
// Decompiled by Procyon v0.5.30
// 

package com.bluelinelabs.logansquare;

public class NoSuchTypeConverterException extends RuntimeException
{
    public NoSuchTypeConverterException(final Class clazz) {
        super("Class " + clazz.getCanonicalName() + " does not having a TypeConverter defined. TypeConverters can be added using LoganSquare.registerTypeConverter().");
    }
}
