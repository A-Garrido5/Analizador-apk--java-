// 
// Decompiled by Procyon v0.5.30
// 

package com.bluelinelabs.logansquare.typeconverters;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;

public abstract class LongBasedTypeConverter implements TypeConverter
{
    public abstract long convertToLong(final Object p0);
    
    public abstract Object getFromLong(final long p0);
    
    @Override
    public Object parse(final JsonParser jsonParser) {
        return this.getFromLong(jsonParser.o());
    }
    
    @Override
    public void serialize(final Object o, final String s, final boolean b, final JsonGenerator jsonGenerator) {
        jsonGenerator.a(s, this.convertToLong(o));
    }
}
