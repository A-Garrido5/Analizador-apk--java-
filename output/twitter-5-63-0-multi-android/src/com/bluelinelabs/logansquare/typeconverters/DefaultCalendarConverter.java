// 
// Decompiled by Procyon v0.5.30
// 

package com.bluelinelabs.logansquare.typeconverters;

import java.text.DateFormat;

public class DefaultCalendarConverter extends CalendarTypeConverter
{
    private DateFormat mDateFormat;
    
    public DefaultCalendarConverter() {
        this.mDateFormat = new DefaultDateFormatter();
    }
    
    @Override
    public DateFormat getDateFormat() {
        return this.mDateFormat;
    }
}
