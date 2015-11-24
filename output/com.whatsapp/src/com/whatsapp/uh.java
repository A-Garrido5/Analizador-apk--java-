// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import com.whatsapp.protocol.bi;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.view.View;
import android.app.Activity;
import com.whatsapp.util.ar;

class uh implements ar
{
    final ConversationRowVideo a;
    
    uh(final ConversationRowVideo a) {
        this.a = a;
    }
    
    @Override
    public int a() {
        final View decorView = ((Activity)this.a.getContext()).getWindow().getDecorView();
        return 70 * Math.min(decorView.getWidth(), decorView.getHeight()) / 100;
    }
    
    @Override
    public void a(final ImageView imageView, final Bitmap bitmap, final bi bi) {
        if (bitmap != null) {
            ConversationRowVideo.b(this.a).setImageDrawable((Drawable)new BitmapDrawable(this.a.getContext().getResources(), bitmap));
            if (!App.I) {
                return;
            }
        }
        ConversationRowVideo.b(this.a).setImageDrawable((Drawable)new ColorDrawable(this.a.getResources().getColor(2131623985)));
    }
}
