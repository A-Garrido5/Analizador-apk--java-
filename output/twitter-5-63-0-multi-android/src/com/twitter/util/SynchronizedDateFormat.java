// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

public class SynchronizedDateFormat extends SimpleDateFormat
{
    private static final long serialVersionUID = 6612933786679648650L;
    
    public SynchronizedDateFormat() {
    }
    
    public SynchronizedDateFormat(final String s) {
        super(s);
    }
    
    public SynchronizedDateFormat(final String s, final Locale locale) {
        super(s, locale);
    }
    
    @Override
    public void applyPattern(final String s) {
        synchronized (this) {
            super.applyPattern(s);
        }
    }
    
    @Override
    public Date parse(final String s) {
        synchronized (this) {
            try {
                return super.parse(s);
            }
            catch (NullPointerException ex) {
                throw new ParseException("Parsing throw a null pointer exception.", 0);
            }
        }
    }
}
