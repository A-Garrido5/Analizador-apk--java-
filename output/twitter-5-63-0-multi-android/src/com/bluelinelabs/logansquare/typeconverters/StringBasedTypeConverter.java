// 
// Decompiled by Procyon v0.5.30
// 

package com.bluelinelabs.logansquare.typeconverters;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;

public abstract class StringBasedTypeConverter implements TypeConverter
{
    public abstract String convertToString(final Object p0);
    
    public abstract Object getFromString(final String p0);
    
    @Override
    public Object parse(final JsonParser jsonParser) {
        return this.getFromString(jsonParser.a((String)null));
    }
    
    @Override
    public void serialize(final Object o, final String s, final boolean b, final JsonGenerator jsonGenerator) {
        jsonGenerator.a(s, this.convertToString(o));
    }
}
