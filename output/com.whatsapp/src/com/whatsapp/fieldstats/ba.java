// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import android.content.Context;

public final class ba extends b9
{
    public String a;
    public String b;
    
    @Override
    void updateFields(final Context context) {
        a5.a(context, o.EVENT, Integer.valueOf(a3.CRASH_LOG.getCode()));
        a5.a(context, o.CRASH_EXCEPTION, this.a);
        a5.a(context, o.CRASH_REASON, this.b);
        a5.a(context, o.EVENT);
    }
}
