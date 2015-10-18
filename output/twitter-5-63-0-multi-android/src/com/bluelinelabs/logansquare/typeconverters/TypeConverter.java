// 
// Decompiled by Procyon v0.5.30
// 

package com.bluelinelabs.logansquare.typeconverters;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;

public interface TypeConverter
{
    Object parse(final JsonParser p0);
    
    void serialize(final Object p0, final String p1, final boolean p2, final JsonGenerator p3);
}
