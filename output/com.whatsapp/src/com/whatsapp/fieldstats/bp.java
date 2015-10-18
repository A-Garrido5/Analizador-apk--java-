// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import android.content.Context;

public final class bp extends b9
{
    public Double a;
    public Double b;
    
    @Override
    void updateFields(final Context context) {
        a5.a(context, o.EVENT, Integer.valueOf(a3.UI_USAGE.getCode()));
        a5.a(context, o.ENTRY_POINT, this.a);
        a5.a(context, o.UI_USAGE_TYPE, this.b);
        a5.a(context, o.EVENT);
    }
}
