// 
// Decompiled by Procyon v0.5.30
// 

package com.bluelinelabs.logansquare.typeconverters;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;

public abstract class BooleanBasedTypeConverter implements TypeConverter
{
    public abstract boolean convertToBoolean(final Object p0);
    
    public abstract Object getFromBoolean(final boolean p0);
    
    @Override
    public Object parse(final JsonParser jsonParser) {
        return this.getFromBoolean(jsonParser.q());
    }
    
    @Override
    public void serialize(final Object o, final String s, final boolean b, final JsonGenerator jsonGenerator) {
        jsonGenerator.a(s, this.convertToBoolean(o));
    }
}
