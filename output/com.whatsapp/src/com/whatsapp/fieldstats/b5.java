// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import android.content.Context;

public final class b5 extends b9
{
    public Double a;
    public Double b;
    public Double c;
    
    @Override
    void updateFields(final Context context) {
        a5.a(context, o.EVENT, Integer.valueOf(a3.LOGIN.getCode()));
        a5.a(context, o.LOGIN_RESULT, this.c);
        a5.a(context, o.RETRY_COUNT, this.a);
        if (this.b != null) {
            a5.a(context, a1.LOGIN_T, this.b);
        }
        a5.a(context, o.EVENT);
    }
}
