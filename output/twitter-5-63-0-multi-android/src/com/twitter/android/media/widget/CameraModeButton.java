// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.MotionEvent;
import android.annotation.SuppressLint;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.content.res.TypedArray;
import android.view.animation.AnimationUtils;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.Animation;
import android.widget.ImageView;

public class CameraModeButton extends ImageView
{
    private final Animation a;
    private final int b;
    private int c;
    private int d;
    private a e;
    
    public CameraModeButton(final Context context) {
        this(context, null, 0);
    }
    
    public CameraModeButton(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public CameraModeButton(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = 0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.CameraModeButton, n, 0);
        try {
            this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
            this.a = AnimationUtils.loadAnimation(context, 2131034118);
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    @SuppressLint({ "RtlHardcoded" })
    private void a() {
        int b = 0;
        final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout$LayoutParams)) {
            return;
        }
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)layoutParams;
        frameLayout$LayoutParams.gravity = this.d;
        int b2 = 0;
        int b3 = 0;
        switch (0x7 & this.d) {
            default: {
                b2 = 0;
                b3 = 0;
                break;
            }
            case 3: {
                b3 = this.b;
                b2 = 0;
                break;
            }
            case 5: {
                b2 = this.b;
                b3 = 0;
                break;
            }
        }
        int b4 = 0;
        switch (0x70 & this.d) {
            default: {
                b4 = 0;
                break;
            }
            case 48: {
                b4 = this.b;
                b = 0;
                break;
            }
            case 80: {
                b = this.b;
                b4 = 0;
                break;
            }
        }
        frameLayout$LayoutParams.setMargins(b3, b4, b2, b);
        this.requestLayout();
    }
    
    public void a(final int n, final boolean b) {
        if (n != 0) {
            if (n == 2) {
                this.c = 1;
                this.setImageResource(2130838761);
                this.setBackgroundDrawable(this.getResources().getDrawable(2130838584));
            }
            else {
                this.c = 2;
                this.setImageResource(2130838770);
                this.setBackgroundDrawable(this.getResources().getDrawable(2130839496));
            }
            if (b && this.getVisibility() == 0) {
                this.startAnimation(this.a);
            }
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 && this.c != 0 && this.e != null && this.isEnabled()) {
            this.clearAnimation();
            this.playSoundEffect(0);
            this.e.a(this.c);
        }
        return true;
    }
    
    public void setLayoutGravity(final int d) {
        this.d = d;
        this.a();
    }
    
    public void setLayoutParams(final ViewGroup$LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        this.a();
    }
    
    public void setListener(final a e) {
        this.e = e;
    }
}
