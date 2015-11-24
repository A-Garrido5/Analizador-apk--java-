// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import android.widget.ImageView;

final class ty implements Runnable
{
    private ImageView a;
    private Bitmap b;
    final a9q c;
    private a_9 d;
    
    public ty(final a9q c, final Bitmap b, final ImageView a, final a_9 d) {
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    @Override
    public void run() {
        if (this.a.getTag() != null && this.a.getTag().equals(this.d.c(a9q.c(this.c), a9q.a(this.c)))) {
            if (this.b != null) {
                final TransitionDrawable imageDrawable = new TransitionDrawable(new Drawable[] { this.a.getDrawable(), new BitmapDrawable(this.b) });
                imageDrawable.setCrossFadeEnabled(false);
                imageDrawable.startTransition(300);
                this.a.setImageDrawable((Drawable)imageDrawable);
                if (!App.I) {
                    return;
                }
            }
            final Bitmap x = this.d.x();
            if (!(this.a.getDrawable() instanceof BitmapDrawable) || ((BitmapDrawable)this.a.getDrawable()).getBitmap() != x) {
                this.a.setImageBitmap(x);
            }
        }
    }
}
