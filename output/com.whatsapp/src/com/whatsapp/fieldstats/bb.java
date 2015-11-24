// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import android.content.Context;

public final class bb extends b9
{
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;
    public Double h;
    
    @Override
    void updateFields(final Context context) {
        a5.a(context, o.EVENT, Integer.valueOf(a3.MESSAGE_SEND.getCode()));
        a5.a(context, o.MEDIA_CAPTION_PRESENT, this.h);
        a5.a(context, o.MESSAGE_IS_FORWARD, this.d);
        a5.a(context, o.MESSAGE_IS_INTERNATIONAL, this.c);
        a5.a(context, o.MESSAGE_MEDIA_TYPE, this.e);
        a5.a(context, o.MESSAGE_SEND_RESULT, this.g);
        a5.a(context, o.MESSAGE_TYPE, this.b);
        a5.a(context, o.RETRY_COUNT, this.a);
        if (this.f != null) {
            a5.a(context, a1.MESSAGE_SEND_T, this.f);
        }
        a5.a(context, o.EVENT);
    }
}
