// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.sectionpager;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.widget.SeekBar;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.support.v4.view.ViewPager$OnPageChangeListener;

public class k implements ViewPager$OnPageChangeListener, SeekBar$OnSeekBarChangeListener
{
    private final int a;
    private final ViewPager b;
    private final Drawable c;
    private final SeekBar d;
    private boolean e;
    
    public k(final int a, final ViewPager b, final Drawable c, final SeekBar d) {
        this.a = a;
        this.b = b;
        this.c = c;
        (this.d = d).setMax(1000);
        this.d.setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)this);
        final int intrinsicHeight = this.c.getIntrinsicHeight();
        this.c.setBounds(new Rect(0, -intrinsicHeight / 2, this.c.getIntrinsicWidth(), intrinsicHeight / 2));
    }
    
    @Override
    public void onPageScrollStateChanged(final int n) {
    }
    
    @Override
    public void onPageScrolled(final int n, final float n2, final int n3) {
        if (!this.e) {
            final int width = this.b.getWidth();
            this.d.setProgress((int)((n3 + n * width) / (width * (-1 + this.a)) * 1000.0));
        }
    }
    
    @Override
    public void onPageSelected(final int n) {
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (b) {
            final int currentItem = (int)(n / 1000.0 * this.a);
            if (this.b.getCurrentItem() != currentItem) {
                this.b.setCurrentItem(currentItem);
            }
        }
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
        this.e = true;
        seekBar.setThumb(this.c);
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
        this.e = false;
        seekBar.setThumb((Drawable)null);
        final ObjectAnimator ofInt = ObjectAnimator.ofInt((Object)seekBar, "progress", new int[] { 1000 * this.b.getCurrentItem() / (-1 + this.a) });
        ofInt.setDuration(200L);
        ofInt.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
        ofInt.start();
    }
}
