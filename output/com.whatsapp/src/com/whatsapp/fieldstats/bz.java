// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

import android.content.Context;

public final class bz extends b9
{
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    
    @Override
    void updateFields(final Context context) {
        a5.a(context, o.EVENT, Integer.valueOf(a3.PROFILE_PIC_UPLOAD.getCode()));
        a5.a(context, o.PROFILE_PIC_UPLOAD_RESULT, this.d);
        a5.a(context, o.RETRY_COUNT, this.b);
        if (this.a != null) {
            a5.a(context, a1.PROFILE_PIC_SIZE, this.a);
        }
        if (this.c != null) {
            a5.a(context, a1.PROFILE_PIC_UPLOAD_T, this.c);
        }
        a5.a(context, o.EVENT);
    }
}
