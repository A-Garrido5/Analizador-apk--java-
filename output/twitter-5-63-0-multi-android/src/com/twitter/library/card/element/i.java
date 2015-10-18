// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.element;

import com.twitter.library.card.CardDebugLog;
import com.twitter.library.media.manager.j;
import android.graphics.Bitmap;
import com.twitter.library.media.manager.p;
import com.twitter.library.media.manager.ResourceResponse;
import java.lang.ref.WeakReference;
import com.twitter.library.media.manager.m;

class i implements m
{
    private WeakReference a;
    
    private i(final Image image) {
        this.a = new WeakReference((T)image);
    }
    
    public void a(final p p) {
        final Bitmap bitmap = (Bitmap)p.c();
        if (bitmap != null) {
            final Image image = (Image)this.a.get();
            if (image != null) {
                image.a(bitmap);
            }
            CardDebugLog.b("Fetched Image " + ((j)p.b()).a(), null);
        }
    }
}
