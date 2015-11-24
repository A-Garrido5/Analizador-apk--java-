// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.carousel;

import android.animation.TimeInterpolator;
import android.animation.ObjectAnimator;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.content.Context;
import android.view.animation.Interpolator;

public class ViewMoreCarouselView extends CarouselView
{
    k a;
    b b;
    private Interpolator c;
    private boolean d;
    
    public ViewMoreCarouselView(final Context context) {
        super(context);
        this.c = (Interpolator)new DecelerateInterpolator();
        this.d = true;
    }
    
    public ViewMoreCarouselView(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = (Interpolator)new DecelerateInterpolator();
        this.d = true;
    }
    
    public ViewMoreCarouselView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = (Interpolator)new DecelerateInterpolator();
        this.d = true;
    }
    
    private void a(final boolean d, final boolean b) {
        float n = 1.0f;
        if (this.a != null) {
            this.a.a(d, b);
        }
        if (this.b != null) {
            if (b) {
                final b b2 = this.b;
                final float[] array = { this.b.a(), 0.0f };
                if (!d) {
                    n = 0.0f;
                }
                array[1] = n;
                final ObjectAnimator setDuration = ObjectAnimator.ofFloat((Object)b2, "fullscreenSpacingFraction", array).setDuration(499L);
                setDuration.setInterpolator((TimeInterpolator)this.c);
                setDuration.start();
            }
            else {
                final b b3 = this.b;
                if (!d) {
                    n = 0.0f;
                }
                b3.a(n);
            }
        }
        this.d = d;
    }
    
    public boolean c() {
        return this.d;
    }
    
    @Override
    public void setAdapter(final a adapter) {
        super.setAdapter(adapter);
        if (adapter instanceof k) {
            (this.a = (k)adapter).a(this.c(), false);
        }
    }
    
    public void setIsExpanded(final boolean b) {
        this.a(b, false);
    }
    
    public void setIsExpandedAnimated(final boolean b) {
        this.a(b, true);
    }
    
    @Override
    public void setLayoutManager(final b b) {
        super.setLayoutManager(b);
        this.b = b;
    }
}
