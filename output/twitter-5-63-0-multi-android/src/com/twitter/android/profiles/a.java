// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import com.twitter.library.media.widget.BackgroundImageView;
import com.twitter.library.media.widget.MediaImageView;

public class a
{
    private final MediaImageView a;
    private final int b;
    private final BackgroundImageView c;
    private float d;
    private float e;
    private float f;
    private boolean g;
    
    public a(final MediaImageView a, final BackgroundImageView c, final int b) {
        this.g = true;
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    private void a() {
        this.d = -(this.a.getTop() - this.c.getBottom() - this.a.getPaddingTop());
        this.e = this.a.getHeight();
        this.f = this.c.getHeight();
        this.a.setPivotX(0.5f * this.a.getWidth());
        this.a.setPivotY(1.0f * this.e);
    }
    
    public void a(final int n) {
        if (this.g) {
            this.a();
            this.g = false;
        }
        final int min = Math.min(n, (int)(this.f - this.b - 1.0f));
        if (min < this.f - this.b) {
            final float n2 = 1.0f + min * this.d / (this.a.getPivotY() / this.e * this.e * (this.b - this.f));
            this.a.setScaleX(n2);
            this.a.setScaleY(n2);
        }
    }
}
