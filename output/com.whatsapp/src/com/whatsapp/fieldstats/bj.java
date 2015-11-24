// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import android.content.Context;

public final class bj extends b9
{
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    
    @Override
    void updateFields(final Context context) {
        a5.a(context, o.EVENT, Integer.valueOf(a3.MEDIA_DOWNLOAD.getCode()));
        a5.a(context, o.MEDIA_DOWNLOAD_RESULT, this.e);
        a5.a(context, o.MEDIA_TYPE, this.c);
        a5.a(context, o.MEDIA_USED_CDN, this.f);
        a5.a(context, o.RETRY_COUNT, this.d);
        if (this.a != null) {
            a5.a(context, a1.MEDIA_DOWNLOAD_T, this.a);
        }
        if (this.b != null) {
            a5.a(context, a1.MEDIA_SIZE, this.b);
        }
        a5.a(context, o.EVENT);
    }
}
