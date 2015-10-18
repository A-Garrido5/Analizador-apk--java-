// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.graphics.Bitmap;

class ap implements Runnable
{
    final b7 a;
    private String b;
    private Bitmap c;
    private ImageView d;
    
    public ap(final b7 a, final Bitmap c, final ImageView d, final String b) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    @Override
    public void run() {
        final boolean l = Log.l;
        if (this.d.getTag() != null && this.d.getTag().equals(this.b)) {
            if (this.c != null) {
                if (this.d.getDrawable() == null) {
                    final TransitionDrawable imageDrawable = new TransitionDrawable(new Drawable[] { new ColorDrawable(0), new BitmapDrawable(this.d.getResources(), this.c) });
                    imageDrawable.setCrossFadeEnabled(true);
                    imageDrawable.startTransition(200);
                    this.d.setImageDrawable((Drawable)imageDrawable);
                    if (!l) {
                        return;
                    }
                }
                this.d.setImageBitmap(this.c);
                if (!l) {
                    return;
                }
            }
            this.d.setImageDrawable(b7.b(this.a));
        }
    }
}
