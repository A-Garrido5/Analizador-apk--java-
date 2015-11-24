// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import com.twitter.util.e;
import com.twitter.android.util.l;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.content.res.TypedArray;
import android.view.animation.AnimationUtils;
import android.view.ViewGroup;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.Animation;
import android.view.View;
import android.widget.ImageView;
import android.widget.FrameLayout;

public class CameraShutterBar extends FrameLayout
{
    public final CameraModeButton a;
    private final ImageView b;
    private final ImageView c;
    private final View d;
    private final Animation e;
    private final Animation f;
    private final Animation g;
    private final Animation h;
    private final int i;
    private final int j;
    private b k;
    private boolean l;
    private c m;
    private int n;
    private int o;
    
    public CameraShutterBar(final Context context) {
        this(context, null);
    }
    
    public CameraShutterBar(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public CameraShutterBar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.n = 0;
        this.o = 0;
        if (set == null) {
            this.i = 0;
            this.j = 0;
        }
        else {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.CameraShutterBar, n, 0);
            try {
                this.i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
                this.j = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            }
            finally {
                obtainStyledAttributes.recycle();
            }
        }
        final View inflate = inflate(context, 2130968623, (ViewGroup)this);
        this.a = (CameraModeButton)inflate.findViewById(2131886349);
        this.d = inflate.findViewById(2131886350);
        this.b = (ImageView)this.d.findViewById(2131886351);
        this.c = (ImageView)this.d.findViewById(2131886352);
        this.f = AnimationUtils.loadAnimation(context, 2131034128);
        this.e = AnimationUtils.loadAnimation(context, 2131034129);
        this.g = AnimationUtils.loadAnimation(context, 2131034127);
        this.h = AnimationUtils.loadAnimation(context, 2131034126);
    }
    
    private void a() {
        this.clearAnimation();
        if (this.m != null) {
            this.m.onAnimationEnd(this.m);
        }
    }
    
    private void b(final boolean b) {
        this.a();
        final Resources resources = this.getResources();
        TransitionDrawable backgroundDrawable;
        if (this.n == 2) {
            final TransitionDrawable transitionDrawable = (TransitionDrawable)resources.getDrawable(2130837630);
            transitionDrawable.setCrossFadeEnabled(resources.getConfiguration().orientation == 2);
            backgroundDrawable = transitionDrawable;
        }
        else {
            backgroundDrawable = (TransitionDrawable)resources.getDrawable(2130837629);
        }
        if (b) {
            this.startAnimation((Animation)new c(this, (TransitionDrawable)this.getBackground(), backgroundDrawable));
            return;
        }
        this.setBackgroundDrawable((Drawable)backgroundDrawable);
    }
    
    private int getOrientation() {
        return this.getResources().getConfiguration().orientation;
    }
    
    public void a(final int n) {
        com.twitter.util.e.b(!com.twitter.android.util.l.d());
        final int visibility = this.getVisibility();
        int n2 = 0;
        if (visibility == 0) {
            n2 = 300;
        }
        com.twitter.android.util.l.a((View)this.a, n, n2, 2131034147);
        com.twitter.android.util.l.a(this.d, n, n2, 2131034147);
    }
    
    public void a(final int n, final boolean b) {
        if (this.n == n) {
            return;
        }
        this.n = n;
        this.o = 0;
        this.b(b);
        if (this.l) {
            this.a.setVisibility(0);
        }
        this.a.a(n, b);
        if (n == 2) {
            this.c.setImageResource(2130838762);
            this.b.setImageResource(2130838771);
        }
        else {
            this.c.setImageResource(2130838771);
            this.b.setImageResource(2130838762);
        }
        if (!b) {
            this.c.setVisibility(4);
            return;
        }
        this.c.setVisibility(0);
        if (this.d.getRotation() == 0.0f) {
            this.c.startAnimation(this.e);
            this.b.startAnimation(this.f);
            return;
        }
        this.c.startAnimation(this.g);
        this.b.startAnimation(this.h);
    }
    
    public void a(final boolean b) {
        final CameraModeButton a = this.a;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 4;
        }
        a.setVisibility(visibility);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final CameraModeButton a = this.a;
        int layoutGravity;
        if (this.getOrientation() == 1) {
            layoutGravity = 19;
        }
        else {
            layoutGravity = 81;
        }
        a.setLayoutGravity(layoutGravity);
        super.onLayout(b, n, n2, n3, n4);
    }
    
    protected void onMeasure(int measureSpec, int measureSpec2) {
        if (this.getOrientation() == 1) {
            measureSpec2 = View$MeasureSpec.makeMeasureSpec(this.j, 1073741824);
        }
        else {
            measureSpec = View$MeasureSpec.makeMeasureSpec(this.i, 1073741824);
        }
        super.onMeasure(measureSpec, measureSpec2);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.k == null) {
            return false;
        }
        switch (MotionEventCompat.getActionMasked(motionEvent)) {
            case 0: {
                if (this.k.a((View)this, motionEvent)) {
                    this.a.clearAnimation();
                    this.b.clearAnimation();
                    this.c.clearAnimation();
                    this.c.setVisibility(4);
                    this.a();
                    ((TransitionDrawable)this.getBackground()).startTransition(0);
                    return true;
                }
                return false;
            }
            case 1:
            case 3: {
                this.a();
                ((TransitionDrawable)this.getBackground()).reverseTransition(300);
                break;
            }
        }
        return this.k.a((View)this, motionEvent);
    }
    
    public void setCameraShutterBarListener(final b k) {
        this.k = k;
    }
    
    public void setEnabled(final boolean enabled) {
        super.setEnabled(enabled);
        this.a.setEnabled(enabled);
        this.d.setEnabled(enabled);
    }
    
    public void setShutterButtonMode(final int o) {
        if (this.o != o) {
            this.o = o;
            if (this.n == 2) {
                final ImageView b = this.b;
                int imageResource;
                if (o == 1) {
                    imageResource = 2130838772;
                }
                else {
                    imageResource = 2130838771;
                }
                b.setImageResource(imageResource);
            }
        }
    }
    
    public void setVideoModeAvailable(final boolean l) {
        this.l = l;
        final CameraModeButton a = this.a;
        int visibility;
        if (l) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        a.setVisibility(visibility);
    }
}
