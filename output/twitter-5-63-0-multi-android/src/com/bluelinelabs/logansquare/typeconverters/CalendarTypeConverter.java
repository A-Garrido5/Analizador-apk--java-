// 
// Decompiled by Procyon v0.5.30
// 

package com.bluelinelabs.logansquare.typeconverters;

import com.fasterxml.jackson.core.JsonGenerator;
import java.text.ParseException;
import java.util.Calendar;
import com.fasterxml.jackson.core.JsonParser;
import java.text.DateFormat;

public abstract class CalendarTypeConverter implements TypeConverter
{
    private static final Object FORMATTER_LOCK;
    
    static {
        FORMATTER_LOCK = new Object();
    }
    
    public abstract DateFormat getDateFormat();
    
    @Override
    public Calendar parse(final JsonParser jsonParser) {
        final String a = jsonParser.a((String)null);
        try {
            synchronized (CalendarTypeConverter.FORMATTER_LOCK) {
                final Calendar instance = Calendar.getInstance();
                instance.setTime(this.getDateFormat().parse(a));
                return instance;
            }
        }
        catch (ParseException ex) {
            return null;
        }
    }
    
    public void serialize(final Calendar calendar, final String s, final boolean b, final JsonGenerator jsonGenerator) {
        synchronized (CalendarTypeConverter.FORMATTER_LOCK) {
            jsonGenerator.a(s, this.getDateFormat().format(calendar.getTimeInMillis()));
        }
    }
}
