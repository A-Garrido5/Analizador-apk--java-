// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import android.content.Context;

public final class br extends b9
{
    public Double a;
    
    @Override
    void updateFields(final Context context) {
        a5.a(context, o.EVENT, Integer.valueOf(a3.GROUP_CREATE.getCode()));
        a5.a(context, o.GROUP_CREATE_ENTRY_POINT, this.a);
        a5.a(context, o.EVENT);
    }
}
