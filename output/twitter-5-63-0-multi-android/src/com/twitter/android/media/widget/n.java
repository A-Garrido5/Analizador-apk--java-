// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.media.manager.p;
import com.twitter.library.media.manager.ResourceResponse;
import android.util.SparseArray;
import com.twitter.library.media.manager.m;

class n implements m
{
    final /* synthetic */ SparseArray a;
    final /* synthetic */ FilterFilmstripView b;
    
    n(final FilterFilmstripView b, final SparseArray a) {
        this.b = b;
        this.a = a;
    }
    
    public void a(final p p) {
        if (p.c() != null) {
            for (int i = 0; i < this.a.size(); ++i) {
                ((MediaImageView)this.a.get(this.a.keyAt(i))).setDefaultDrawable((Drawable)new BitmapDrawable(this.b.getResources(), (Bitmap)p.c()));
            }
        }
    }
}
