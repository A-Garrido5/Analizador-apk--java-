// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import android.content.Context;

public final class bt extends b9
{
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    
    @Override
    void updateFields(final Context context) {
        a5.a(context, o.EVENT, Integer.valueOf(a3.ADDRESSBOOK_SYNC.getCode()));
        a5.a(context, o.ADDRESSBOOK_SYNC_ERROR_CODE, this.a);
        a5.a(context, o.ADDRESSBOOK_SYNC_IS_REG, this.b);
        a5.a(context, o.ADDRESSBOOK_SYNC_RESULT_TYPE, this.c);
        if (this.d != null) {
            a5.a(context, a1.ADDRESSBOOK_SYNC_T, this.d);
        }
        a5.a(context, o.EVENT);
    }
}
