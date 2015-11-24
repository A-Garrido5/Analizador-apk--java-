// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import android.content.Context;

public final class bc extends b9
{
    public Double a;
    public Double b;
    
    @Override
    void updateFields(final Context context) {
        a5.a(context, o.EVENT, Integer.valueOf(a3.GROUP_MUTE.getCode()));
        a5.a(context, o.GROUP_SIZE, this.b);
        if (this.a != null) {
            a5.a(context, a1.GROUP_MUTE_T, this.a);
        }
        a5.a(context, o.EVENT);
    }
}
