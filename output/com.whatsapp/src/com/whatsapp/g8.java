// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.view.View;
import android.app.Activity;
import com.whatsapp.util.ar;

class g8 implements ar
{
    final ConversationRowImage a;
    
    g8(final ConversationRowImage a) {
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
            ConversationRowImage$RowImageView.a(ConversationRowImage.a(this.a), bitmap);
            ConversationRowImage.a(this.a).invalidate();
        }
    }
}
