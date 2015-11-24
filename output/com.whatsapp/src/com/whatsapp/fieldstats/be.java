// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import android.content.Context;

public final class be extends b9
{
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    
    @Override
    void updateFields(final Context context) {
        a5.a(context, o.EVENT, Integer.valueOf(a3.MEDIA_UPLOAD.getCode()));
        a5.a(context, o.MEDIA_TYPE, this.f);
        a5.a(context, o.MEDIA_UPLOAD_RESULT, this.e);
        a5.a(context, o.MESSAGE_IS_FORWARD, this.a);
        a5.a(context, o.RETRY_COUNT, this.c);
        if (this.d != null) {
            a5.a(context, a1.MEDIA_SIZE, this.d);
        }
        if (this.b != null) {
            a5.a(context, a1.MEDIA_UPLOAD_T, this.b);
        }
        a5.a(context, o.EVENT);
    }
}
