// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.audio;

import android.graphics.Bitmap;
import com.twitter.library.media.manager.p;
import com.twitter.library.media.manager.ResourceResponse;
import android.widget.ImageView;
import com.twitter.library.media.manager.m;

class c implements m
{
    final /* synthetic */ ImageView a;
    final /* synthetic */ AudioCardPlayerView b;
    
    c(final AudioCardPlayerView b, final ImageView a) {
        this.b = b;
        this.a = a;
    }
    
    public void a(final p p) {
        final Bitmap imageBitmap = (Bitmap)p.c();
        if (imageBitmap != null) {
            this.a.setImageBitmap(imageBitmap);
        }
    }
}
