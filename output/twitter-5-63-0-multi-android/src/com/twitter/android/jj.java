// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.Context;
import android.widget.Toast;
import com.twitter.library.media.widget.MediaImageView;
import android.graphics.Bitmap;
import com.twitter.library.media.widget.BaseMediaImageView;
import com.twitter.library.media.widget.o;

class jj implements o
{
    final /* synthetic */ ImageActivity a;
    
    jj(final ImageActivity a) {
        this.a = a;
    }
    
    public void a(final MediaImageView mediaImageView, final Bitmap c) {
        this.a.b.setVisibility(4);
        this.a.c = c;
        this.a.Q();
        if (c == null) {
            Toast.makeText((Context)this.a, 2131297165, 1).show();
        }
    }
}
