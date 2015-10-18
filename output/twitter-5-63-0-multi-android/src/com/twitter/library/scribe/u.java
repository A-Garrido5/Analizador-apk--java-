// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import com.twitter.eventreporter.b;
import android.content.Context;
import com.twitter.eventreporter.a;

public class u implements a
{
    private final Context a;
    
    public u(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    @Override
    public boolean a(final b b) {
        return b instanceof ScribeLog;
    }
    
    @Override
    public void b(final b b) {
        if (!(b instanceof ScribeLog)) {
            throw new IllegalArgumentException("Event must be a ScribeLog, is a " + b.getClass().getCanonicalName());
        }
        ScribeService.a(this.a, (ScribeLog)b);
    }
}
