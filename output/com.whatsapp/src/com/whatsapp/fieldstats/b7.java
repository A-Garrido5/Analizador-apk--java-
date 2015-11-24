// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import android.content.Context;

public final class b7 extends b9
{
    public Double a;
    public Double b;
    public Double c;
    
    @Override
    void updateFields(final Context context) {
        a5.a(context, o.EVENT, Integer.valueOf(a3.PUSH_RECEIVE.getCode()));
        a5.a(context, o.PUSH_RECEIVE_WHILE_OFFLINE, this.a);
        if (this.c != null) {
            a5.a(context, a1.NETWORK_CHANGE_DELAY_T, this.c);
        }
        if (this.b != null) {
            a5.a(context, a1.PUSH_RECEIVE_DELAY_T, this.b);
        }
        a5.a(context, o.EVENT);
    }
}
