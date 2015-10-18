// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.media.widget.MediaImageView;
import android.graphics.Bitmap;
import com.twitter.library.media.widget.BaseMediaImageView;
import com.twitter.library.media.widget.o;

class gc implements o
{
    final /* synthetic */ gb a;
    
    gc(final gb a) {
        this.a = a;
    }
    
    public void a(final MediaImageView mediaImageView, final Bitmap bitmap) {
        if (bitmap != null) {
            this.a.e.a.a(true);
        }
    }
}
