// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;

class h7 implements Runnable
{
    final of a;
    final Bitmap b;
    
    h7(final of a, final Bitmap b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        if (this.a.d == this.a.a.m.N && this.a.a.isShown()) {
            if (this.a.b == null) {
                this.a.b = ConversationRowVideo.b(this.a.a).getDrawable();
            }
            final BitmapDrawable bitmapDrawable = new BitmapDrawable(this.a.a.getResources(), this.b);
            Label_0172: {
                if (this.a.b != null) {
                    final TransitionDrawable imageDrawable = new TransitionDrawable(new Drawable[] { this.a.b, bitmapDrawable });
                    imageDrawable.setCrossFadeEnabled(false);
                    imageDrawable.startTransition(500);
                    ConversationRowVideo.b(this.a.a).setImageDrawable((Drawable)imageDrawable);
                    if (!App.I) {
                        break Label_0172;
                    }
                }
                ConversationRowVideo.b(this.a.a).setImageDrawable((Drawable)bitmapDrawable);
            }
            this.a.b = (Drawable)bitmapDrawable;
        }
    }
}
