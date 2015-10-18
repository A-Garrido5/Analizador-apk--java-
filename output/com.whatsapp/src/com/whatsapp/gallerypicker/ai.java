// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.view.ViewTreeObserver$OnPreDrawListener;
import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView$ScaleType;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

class ai implements b5
{
    final u a;
    final int b;
    final bj c;
    final b8 d;
    final MediaGalleryBase$MediaItemView e;
    
    ai(final u a, final MediaGalleryBase$MediaItemView e, final b8 d, final bj c, final int b) {
        this.a = a;
        this.e = e;
        this.d = d;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public void a() {
        this.e.setBackgroundColor(MediaGalleryBase.d(this.a.d));
        this.e.setImageDrawable((Drawable)null);
    }
    
    @Override
    public void a(final Bitmap bitmap, final boolean b) {
        final int v = MediaGalleryBase.v;
        if (this.e.getTag() == this.d) {
            Label_0238: {
                if (bitmap == MediaGalleryBase.a(this.c, this.a.d.getBaseContext())) {
                    this.e.setScaleType(ImageView$ScaleType.CENTER);
                    Label_0102: {
                        if (bd.c(this.c)) {
                            this.e.setBackgroundColor(this.a.d.getResources().getColor(2131624021));
                            if (v == 0) {
                                break Label_0102;
                            }
                        }
                        this.e.setBackgroundColor(MediaGalleryBase.d(this.a.d));
                    }
                    this.e.setImageBitmap(bitmap);
                    if (v == 0) {
                        break Label_0238;
                    }
                }
                this.e.setScaleType(ImageView$ScaleType.CENTER_CROP);
                this.e.setBackgroundResource(0);
                if (!b && !u.a(this.a, this.b)) {
                    final TransitionDrawable imageDrawable = new TransitionDrawable(new Drawable[] { MediaGalleryBase.b(this.a.d), new BitmapDrawable(this.a.d.getResources(), bitmap) });
                    imageDrawable.setCrossFadeEnabled(true);
                    imageDrawable.startTransition(150);
                    this.e.setImageDrawable((Drawable)imageDrawable);
                    if (v == 0) {
                        break Label_0238;
                    }
                }
                this.e.setImageBitmap(bitmap);
            }
            if (u.a(this.a, this.b)) {
                u.a(this.a).put(this.b, true);
                this.e.setVisibility(0);
                this.e.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new av(this));
            }
        }
    }
}
