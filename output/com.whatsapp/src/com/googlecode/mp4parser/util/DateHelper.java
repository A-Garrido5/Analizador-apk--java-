// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.util;

import java.util.Date;

public class DateHelper
{
    public static long convert(final Date date) {
        return 2082844800L + date.getTime() / 1000L;
    }
    
    public static Date convert(final long n) {
        return new Date(1000L * (n - 2082844800L));
    }
}
