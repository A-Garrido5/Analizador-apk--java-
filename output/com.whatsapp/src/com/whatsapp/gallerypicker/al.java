// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView$ScaleType;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

class al implements b5
{
    final aw a;
    final bj b;
    final ImageView c;
    final b8 d;
    
    al(final aw a, final ImageView c, final b8 d, final bj b) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    @Override
    public void a() {
        this.c.setBackgroundColor(GalleryPickerFragment.d(this.a.d));
        this.c.setImageDrawable((Drawable)null);
    }
    
    @Override
    public void a(final Bitmap bitmap, final boolean b) {
        final int v = MediaGalleryBase.v;
        if (this.c.getTag() == this.d && this.a.d.getActivity() != null) {
            if (bitmap == MediaGalleryBase.a(this.b, (Context)this.a.d.getActivity())) {
                this.c.setScaleType(ImageView$ScaleType.CENTER);
                this.c.setBackgroundColor(GalleryPickerFragment.d(this.a.d));
                this.c.setImageBitmap(bitmap);
                if (v == 0) {
                    return;
                }
            }
            this.c.setScaleType(ImageView$ScaleType.CENTER_CROP);
            this.c.setBackgroundResource(0);
            if (!b) {
                final TransitionDrawable imageDrawable = new TransitionDrawable(new Drawable[] { GalleryPickerFragment.e(this.a.d), new BitmapDrawable(this.a.d.getResources(), bitmap) });
                imageDrawable.setCrossFadeEnabled(true);
                imageDrawable.startTransition(150);
                this.c.setImageDrawable((Drawable)imageDrawable);
                if (v == 0) {
                    return;
                }
            }
            this.c.setImageBitmap(bitmap);
        }
    }
}
