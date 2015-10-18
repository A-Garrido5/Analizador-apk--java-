// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.widget.ImageView;
import android.graphics.Bitmap;
import com.whatsapp.protocol.bi;

class a8 implements Runnable
{
    private bi a;
    final b b;
    private Bitmap c;
    private ar d;
    private ImageView e;
    
    public a8(final b b, final Bitmap c, final ImageView e, final bi a, final ar d) {
        this.b = b;
        this.c = c;
        this.e = e;
        this.a = a;
        this.d = d;
    }
    
    @Override
    public void run() {
        if (this.e.getTag() != null && this.e.getTag().equals(this.a.a)) {
            this.d.a(this.e, this.c, this.a);
            com.whatsapp.util.b.a(this.b).remove(this.a.a);
            if (this.c == null) {
                return;
            }
            com.whatsapp.util.b.d(this.b).put(this.a.a, this.c);
            com.whatsapp.util.b.b(this.b).add(this.a.a);
            if (!Log.l) {
                return;
            }
        }
        if (this.c != null) {
            this.c.recycle();
        }
    }
}
