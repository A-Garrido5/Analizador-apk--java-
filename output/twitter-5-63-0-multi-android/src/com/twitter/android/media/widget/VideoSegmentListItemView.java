// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import com.twitter.library.media.decoder.ImageDecoder$ScaleType;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.manager.k;
import com.twitter.library.media.widget.e;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.BitmapDrawable;
import com.twitter.library.media.widget.BaseMediaImageView;
import android.content.res.Resources;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Bitmap;
import com.twitter.library.media.model.VideoFile;
import com.twitter.library.media.widget.VideoDurationView;
import com.twitter.internal.android.widget.RichImageView;
import com.twitter.library.media.widget.MediaImageView;
import android.widget.ImageView;
import android.view.View;
import android.view.animation.Animation;
import com.twitter.library.media.widget.o;
import com.twitter.library.widget.AspectRatioFrameLayout;

public class VideoSegmentListItemView extends AspectRatioFrameLayout implements o
{
    private Animation a;
    private Animation c;
    private int d;
    private bq e;
    private View f;
    private View g;
    private ImageView h;
    private MediaImageView i;
    private RichImageView j;
    private VideoDurationView k;
    private boolean l;
    private boolean m;
    private VideoFile n;
    private boolean o;
    private Bitmap p;
    private int q;
    private int r;
    private int s;
    
    public VideoSegmentListItemView(final Context context) {
        super(context);
        this.s = 0;
        this.b();
    }
    
    public VideoSegmentListItemView(final Context context, final AttributeSet set) {
        super(context, set);
        this.s = 0;
        this.b();
    }
    
    public VideoSegmentListItemView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.s = 0;
        this.b();
    }
    
    private void b() {
        final Resources resources = this.getResources();
        this.a = AnimationUtils.loadAnimation(this.getContext(), 2131034121);
        this.c = AnimationUtils.loadAnimation(this.getContext(), 2131034122);
        this.a.setAnimationListener((Animation$AnimationListener)new bj(this));
        this.c.setAnimationListener((Animation$AnimationListener)new bk(this));
        this.d = resources.getDimensionPixelSize(2131558991);
    }
    
    public void a(final MediaImageView mediaImageView, final Bitmap p2) {
        this.p = p2;
        this.j.invalidate();
    }
    
    public void a(final boolean o) {
        if (this.o != o) {
            this.o = o;
            final VideoDurationView k = this.k;
            Animation animation;
            if (o) {
                animation = this.a;
            }
            else {
                animation = this.c;
            }
            k.startAnimation(animation);
        }
    }
    
    public void a(final boolean l, final boolean m) {
        if (l != this.l || m != this.m) {
            float n3;
            float n4;
            if (l) {
                final float n = this.d;
                final float n2 = this.d;
                n3 = n;
                n4 = n2;
            }
            else {
                n4 = 0.0f;
                n3 = 0.0f;
            }
            float n5;
            float n6;
            if (m) {
                n5 = this.d;
                n6 = this.d;
            }
            else {
                n6 = 0.0f;
                n5 = 0.0f;
            }
            this.l = l;
            this.m = m;
            this.j.a(n3, n5, n6, n4);
            this.j.setImageBitmap(this.p);
        }
    }
    
    public boolean a() {
        return this.s == 2 || this.s == 1;
    }
    
    public BitmapDrawable getFloatingShadow() {
        final Bitmap bitmap = Bitmap.createBitmap(this.getMeasuredWidth(), this.getMeasuredHeight(), Bitmap$Config.ARGB_8888);
        this.j.draw(new Canvas(bitmap));
        return new BitmapDrawable(this.getResources(), bitmap);
    }
    
    int getStatus() {
        return this.s;
    }
    
    protected void onFinishInflate() {
        this.f = this.findViewById(2131887353);
        this.e = new bq(this.getContext());
        this.f.setBackgroundDrawable((Drawable)this.e);
        this.g = this.f.findViewById(2131887354);
        this.h = (ImageView)this.f.findViewById(2131887355);
        this.i = (MediaImageView)this.findViewById(2131886973);
        this.j = (RichImageView)this.i.findViewById(2131886127);
        this.k = (VideoDurationView)this.findViewById(2131887356);
        this.i.setOnImageLoadedListener(this);
    }
    
    public void setStatus(final int s) {
        final int orientation = this.getResources().getConfiguration().orientation;
        if (this.s != s || this.r != orientation) {
            this.s = s;
            this.r = orientation;
            if (s == 4) {
                this.f.setVisibility(0);
                this.g.setVisibility(0);
                this.h.setVisibility(8);
                this.k.setVisibility(8);
                this.i.setVisibility(8);
                this.g.startAnimation(AnimationUtils.loadAnimation(this.getContext(), 2131034125));
            }
            else {
                this.g.clearAnimation();
                if (s == 3) {
                    this.f.setVisibility(0);
                    this.h.setVisibility(0);
                    this.g.setVisibility(8);
                    this.k.setVisibility(8);
                    this.i.setVisibility(8);
                    this.h.setImageDrawable(this.getResources().getDrawable(2130839495));
                }
                else {
                    this.f.setVisibility(8);
                    this.i.setVisibility(0);
                }
            }
            this.invalidate();
        }
    }
    
    public void setThumbnailSize(final int q) {
        final int orientation = this.getResources().getConfiguration().orientation;
        if (this.q != q || this.r != orientation) {
            this.q = q;
            this.r = orientation;
            this.e.a(q);
            this.forceLayout();
        }
    }
    
    public void setVideoFile(final VideoFile n) {
        if (n == null) {
            this.n = null;
            this.i.a((k)null);
        }
        else if (this.n != n) {
            this.k.setDuration(n.duration);
            this.n = n;
            this.i.a(com.twitter.library.media.manager.j.a(n).a(ImageDecoder$ScaleType.c));
        }
    }
}
