// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import com.twitter.library.av.playback.bf;
import com.twitter.library.provider.Tweet;
import com.twitter.library.card.property.ImageSpec;
import android.view.View$MeasureSpec;
import com.twitter.library.media.manager.j;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.twitter.library.media.widget.BaseMediaImageView$ScaleType;
import android.widget.ImageView;
import com.twitter.library.experiments.b;
import com.twitter.internal.android.widget.RichImageView;
import android.content.Context;
import com.twitter.library.media.widget.MediaImageView;
import android.widget.FrameLayout;

public class VideoThumbnailView extends FrameLayout implements ao
{
    MediaImageView a;
    private float b;
    private int c;
    
    public VideoThumbnailView(final Context context) {
        super(context);
        this.b = 1.7777778f;
        this.c = 1;
    }
    
    public void a() {
        if (this.a != null) {
            this.a.setFromMemoryOnly(false);
        }
    }
    
    public void a(final String s, final boolean b) {
        final Context context = this.getContext();
        final RichImageView richImageView = new RichImageView(context);
        if (b) {
            richImageView.setOverlayDrawable(kz.player_overlay);
        }
        if (b.a()) {
            richImageView.setCornerRadius(this.getResources().getDimension(ky.smaller_corner_radius));
        }
        (this.a = new MediaImageView(context, richImageView, true)).setScaleType(BaseMediaImageView$ScaleType.b);
        this.a.setFromMemoryOnly(true);
        this.addView((View)this.a, new ViewGroup$LayoutParams(-1, -1));
        this.a.a(j.a(s));
    }
    
    public void a(final vj vj, final boolean b) {
        this.b = vj.a(1.7777778f);
        this.a(vj.a, b);
    }
    
    public void b() {
        if (this.a != null) {
            this.a.b();
        }
    }
    
    public float getAspectRatio() {
        return this.b;
    }
    
    public View getView() {
        return (View)this;
    }
    
    protected void onMeasure(final int n, final int n2) {
        final int size = View$MeasureSpec.getSize(n);
        int size2 = View$MeasureSpec.getSize(n2);
        final int n3 = (int)(size / this.b);
        int n4 = 0;
        if (n3 > size2 && size2 > 0) {
            switch (this.c) {
                default: {
                    n4 = (int)Math.rint(size2 * this.b);
                    break;
                }
                case 2: {
                    n4 = size;
                    break;
                }
            }
        }
        else {
            size2 = n3;
            n4 = size;
        }
        this.setMeasuredDimension(n4, size2);
        this.measureChildren(View$MeasureSpec.makeMeasureSpec(n4, 1073741824), View$MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
    
    public void setImageSpec(final ImageSpec imageSpec) {
        float b;
        if (imageSpec.size == null) {
            b = 1.0f;
        }
        else {
            b = imageSpec.size.x / imageSpec.size.y;
        }
        this.b = b;
        this.a(imageSpec.url, true);
    }
    
    public void setScaleType(final int c) {
        this.c = c;
    }
    
    public void setThumbnailImage(final vj vj) {
        this.a(vj, true);
    }
    
    public void setTweet(final Tweet tweet) {
        final ImageSpec f = bf.f(tweet);
        if (f != null) {
            this.setImageSpec(f);
        }
    }
}
