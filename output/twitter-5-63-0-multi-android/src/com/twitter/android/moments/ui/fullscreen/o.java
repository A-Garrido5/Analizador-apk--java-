// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.fullscreen;

import android.view.View;
import android.view.LayoutInflater;
import com.twitter.android.moments.ui.FillCropFrameLayout;
import android.content.Context;
import android.graphics.Rect;
import com.twitter.internal.android.util.Size;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.api.moments.CropData;
import com.twitter.library.media.manager.k;
import com.twitter.library.media.widget.BaseMediaImageView$ScaleType;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.android.moments.viewmodels.MomentTweetPhotoPage;
import com.twitter.util.n;
import com.twitter.util.m;
import android.view.ViewGroup;
import com.twitter.android.moments.ui.sectionpager.a;

public class o implements a
{
    private final ViewGroup a;
    private final u b;
    private final m c;
    private final n d;
    
    o(final MomentTweetPhotoPage momentTweetPhotoPage, final ViewGroup a, final MediaImageView mediaImageView, final u b, final m c) {
        this.d = new p(this);
        this.a = a;
        this.b = b;
        this.c = c;
        final CropData f = momentTweetPhotoPage.f();
        final MediaEntity g = momentTweetPhotoPage.g();
        mediaImageView.setScaleType(BaseMediaImageView$ScaleType.a);
        mediaImageView.setScaleFactor(2.0f);
        mediaImageView.a(new k(g.mediaUrl));
        final u b2 = this.b;
        final Size size = g.size;
        Rect a2;
        if (f == null) {
            a2 = null;
        }
        else {
            a2 = f.a();
        }
        b2.a(size, a2);
    }
    
    public static o a(final Context context, final MomentTweetPhotoPage momentTweetPhotoPage, final m m) {
        final FillCropFrameLayout fillCropFrameLayout = (FillCropFrameLayout)LayoutInflater.from(context).inflate(2130968888, (ViewGroup)null, false);
        final MediaImageView mediaImageView = (MediaImageView)fillCropFrameLayout.findViewById(2131886953);
        return new o(momentTweetPhotoPage, (ViewGroup)fillCropFrameLayout, mediaImageView, new u(fillCropFrameLayout, (View)mediaImageView), m);
    }
    
    @Override
    public View a() {
        return (View)this.a;
    }
    
    @Override
    public void a(final float n) {
    }
    
    @Override
    public void b() {
        this.c.a(this.d);
    }
    
    @Override
    public void c() {
        this.c.b(this.d);
    }
    
    @Override
    public void d() {
    }
}
