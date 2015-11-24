// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import android.content.Context;

public final class bg extends b9
{
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;
    
    @Override
    void updateFields(final Context context) {
        a5.a(context, o.EVENT, Integer.valueOf(a3.MESSAGE_RECEIVE.getCode()));
        a5.a(context, o.MESSAGE_IS_INTERNATIONAL, this.c);
        a5.a(context, o.MESSAGE_IS_OFFLINE, this.b);
        a5.a(context, o.MESSAGE_MEDIA_TYPE, this.d);
        a5.a(context, o.MESSAGE_TYPE, this.e);
        a5.a(context, o.NUM_OF_WEB_URLS_IN_TEXT_MESSAGE, this.a);
        if (this.g != null) {
            a5.a(context, a1.MESSAGE_RECEIVE_T0, this.g);
        }
        if (this.f != null) {
            a5.a(context, a1.MESSAGE_RECEIVE_T1, this.f);
        }
        a5.a(context, o.EVENT);
    }
}
