// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.graphics.Rect;
import android.graphics.PointF;
import android.annotation.TargetApi;
import android.view.ViewGroup;
import android.view.TextureView;
import android.widget.ImageView$ScaleType;
import android.view.ViewGroup$LayoutParams;
import com.twitter.library.media.util.m;
import android.graphics.Bitmap$Config;
import com.twitter.internal.android.util.Size;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.view.View;
import com.twitter.library.av.ar;
import com.twitter.library.av.playback.AVPlayer;
import com.twitter.library.av.n;

public class gh extends az implements n
{
    private AVPlayer a;
    private ar b;
    private View c;
    private Bitmap d;
    private ImageView e;
    private FrameLayout f;
    
    public gh(final Context context, final ap ap) {
        this(context, ap, new ar());
    }
    
    gh(final Context context, final ap ap, final ar b) {
        super(context, ap);
        this.b = b;
    }
    
    private void k() {
        final int width = this.a().width;
        final int height = this.a().height;
        if (width != 0 && height != 0) {
            this.d = m.a(Size.a(width, height), Bitmap$Config.ARGB_8888);
            (this.e = new ImageView(this.g())).setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
            this.e.setScaleType(ImageView$ScaleType.FIT_XY);
        }
    }
    
    @TargetApi(16)
    private void l() {
        if (this.c != null) {
            if (this.d == null) {
                this.k();
            }
            if (this.d != null) {
                this.e.setImageBitmap(((TextureView)this.c).getBitmap(this.d));
                if (this.e.getParent() != null) {
                    ((ViewGroup)this.e.getParent()).removeView((View)this.e);
                }
                this.f.addView((View)this.e);
            }
            this.f.removeView(this.c);
        }
    }
    
    public void a(final AVPlayer a) {
        this.a = a;
        this.c = this.b.b(this.g(), this.a, this).a();
        (this.f = new FrameLayout(this.g())).setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
        while (true) {
            try {
                this.f.setForeground(this.g().getResources().getDrawable(2130839540));
                this.f.addView(this.c);
                this.a((View)this.f);
                this.k();
            }
            catch (OutOfMemoryError outOfMemoryError) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public void b(final PointF pointF, final int n, final Rect rect, final Runnable runnable) {
        this.l();
        super.b(pointF, n, rect, runnable);
    }
    
    @Override
    public void j() {
        if (this.c != null && this.c.getParent() != null) {
            this.f.removeView(this.c);
        }
    }
}
