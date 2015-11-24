// 
// Decompiled by Procyon v0.5.30
// 

package com.bluelinelabs.logansquare.typeconverters;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;

public abstract class IntBasedTypeConverter implements TypeConverter
{
    public abstract int convertToInt(final Object p0);
    
    public abstract Object getFromInt(final int p0);
    
    @Override
    public Object parse(final JsonParser jsonParser) {
        return this.getFromInt(jsonParser.n());
    }
    
    @Override
    public void serialize(final Object o, final String s, final boolean b, final JsonGenerator jsonGenerator) {
        jsonGenerator.a(s, this.convertToInt(o));
    }
}
