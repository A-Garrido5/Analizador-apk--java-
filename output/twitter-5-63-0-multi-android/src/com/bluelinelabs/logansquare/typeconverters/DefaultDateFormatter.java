// 
// Decompiled by Procyon v0.5.30
// 

package com.bluelinelabs.logansquare.typeconverters;

import java.text.ParsePosition;
import java.util.Date;
import java.util.TimeZone;
import java.util.Locale;
import java.text.SimpleDateFormat;

public class DefaultDateFormatter extends SimpleDateFormat
{
    public DefaultDateFormatter() {
        super("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
        this.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
    
    private String getFixedInputString(final String s) {
        return s.replaceAll("Z$", "+00:00");
    }
    
    @Override
    public Date parse(final String s) {
        return super.parse(this.getFixedInputString(s));
    }
    
    @Override
    public Date parse(final String s, final ParsePosition parsePosition) {
        return super.parse(this.getFixedInputString(s), parsePosition);
    }
    
    @Override
    public Object parseObject(final String s) {
        return super.parseObject(this.getFixedInputString(s));
    }
    
    @Override
    public Object parseObject(final String s, final ParsePosition parsePosition) {
        return super.parseObject(this.getFixedInputString(s), parsePosition);
    }
}
