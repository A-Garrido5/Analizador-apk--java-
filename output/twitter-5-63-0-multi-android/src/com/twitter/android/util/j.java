// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import java.util.Calendar;

public class j
{
    public boolean a(final Calendar calendar) {
        final Calendar instance = Calendar.getInstance();
        instance.add(5, -1);
        return this.a(calendar, instance);
    }
    
    public boolean a(final Calendar calendar, final Calendar calendar2) {
        return calendar2.get(5) == calendar.get(5) && calendar2.get(2) == calendar.get(2) && calendar2.get(1) == calendar.get(1);
    }
}
