// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import android.content.Context;

public final class b0 extends b9
{
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    
    @Override
    void updateFields(final Context context) {
        a5.a(context, o.EVENT, Integer.valueOf(a3.E2E_MESSAGE_RECV.getCode()));
        a5.a(context, o.E2E_CIPHERTEXT_TYPE, this.d);
        a5.a(context, o.E2E_CIPHERTEXT_VERSION, this.a);
        a5.a(context, o.E2E_DESTINATION, this.f);
        a5.a(context, o.E2E_FAILURE_REASON, this.c);
        a5.a(context, o.E2E_SUCCESSFUL, this.e);
        a5.a(context, o.RETRY_COUNT, this.b);
        a5.a(context, o.EVENT);
    }
}
