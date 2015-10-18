// 
// Decompiled by Procyon v0.5.30
// 

package com.bluelinelabs.logansquare.typeconverters;

import com.fasterxml.jackson.core.JsonGenerator;
import java.text.ParseException;
import java.util.Date;
import com.fasterxml.jackson.core.JsonParser;
import java.text.DateFormat;

public abstract class DateTypeConverter implements TypeConverter
{
    private static final Object FORMATTER_LOCK;
    
    static {
        FORMATTER_LOCK = new Object();
    }
    
    public abstract DateFormat getDateFormat();
    
    @Override
    public Date parse(final JsonParser jsonParser) {
        final String a = jsonParser.a((String)null);
        try {
            synchronized (DateTypeConverter.FORMATTER_LOCK) {
                return this.getDateFormat().parse(a);
            }
        }
        catch (ParseException ex) {
            return null;
        }
    }
    
    public void serialize(final Date date, final String s, final boolean b, final JsonGenerator jsonGenerator) {
        synchronized (DateTypeConverter.FORMATTER_LOCK) {
            jsonGenerator.a(s, this.getDateFormat().format(date));
        }
    }
}
