// 
// Decompiled by Procyon v0.5.30
// 

package com.bluelinelabs.logansquare.typeconverters;

import java.text.DateFormat;

public class DefaultDateConverter extends DateTypeConverter
{
    private DateFormat mDateFormat;
    
    public DefaultDateConverter() {
        this.mDateFormat = new DefaultDateFormatter();
    }
    
    @Override
    public DateFormat getDateFormat() {
        return this.mDateFormat;
    }
}
