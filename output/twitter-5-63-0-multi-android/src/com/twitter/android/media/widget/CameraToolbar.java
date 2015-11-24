// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.graphics.drawable.TransitionDrawable;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.util.Collection;
import java.util.Set;
import android.view.View$MeasureSpec;
import android.view.View;
import com.twitter.android.util.l;
import android.content.res.TypedArray;
import com.twitter.android.pa;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.hardware.Camera;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.Animation;
import android.widget.ImageButton;
import com.twitter.android.widget.MultiToggleButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.twitter.android.widget.dq;
import android.view.View$OnTouchListener;
import android.widget.LinearLayout;

public class CameraToolbar extends LinearLayout implements View$OnTouchListener, dq
{
    public final TextView a;
    private final ImageView b;
    private final MultiToggleButton c;
    private final ImageButton d;
    private final Animation e;
    private final Animation f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private h m;
    
    public CameraToolbar(final Context context) {
        this(context, null, 0);
    }
    
    public CameraToolbar(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public CameraToolbar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        inflate(context, 2130968620, (ViewGroup)this);
        (this.b = (ImageView)this.findViewById(2131886328)).setOnClickListener((View$OnClickListener)new e(this));
        (this.c = (MultiToggleButton)this.findViewById(2131886329)).setOnTouchListener((View$OnTouchListener)this);
        this.c.setOnToggleListener(this);
        this.d = (ImageButton)this.findViewById(2131886330);
        Label_0259: {
            if (Camera.getNumberOfCameras() >= 2) {
                break Label_0259;
            }
            this.d.setVisibility(8);
            while (true) {
                this.a = (TextView)this.findViewById(2131886249);
                (this.e = AnimationUtils.loadAnimation(context, 2131034130)).setAnimationListener((Animation$AnimationListener)new f(this));
                (this.f = AnimationUtils.loadAnimation(context, 2131034131)).setAnimationListener((Animation$AnimationListener)new g(this));
                final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.CameraToolbar, n, 0);
                try {
                    this.g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
                    this.h = obtainStyledAttributes.getDimensionPixelSize(1, 0);
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
                    this.j = obtainStyledAttributes.getDimensionPixelSize(3, 0);
                    this.k = obtainStyledAttributes.getDimensionPixelSize(4, 0);
                    this.l = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                    obtainStyledAttributes.recycle();
                    this.onConfigurationChanged(this.getResources().getConfiguration());
                    return;
                    this.d.setOnTouchListener((View$OnTouchListener)this);
                }
                finally {
                    obtainStyledAttributes.recycle();
                }
            }
        }
    }
    
    public void a(final int n) {
        com.twitter.util.e.b(!com.twitter.android.util.l.d());
        com.twitter.android.util.l.a((View)this.c, n, 300, 2131034147);
        com.twitter.android.util.l.a((View)this.d, n, 300, 2131034147);
    }
    
    public void a(final int n, final int n2, final int n3, final int n4) {
        this.measure(View$MeasureSpec.makeMeasureSpec(n3 - n, 1073741824), View$MeasureSpec.makeMeasureSpec(n4 - n2, 1073741824));
        this.layout(n, n2, n3, n4);
    }
    
    public void a(final MultiToggleButton multiToggleButton, final CharSequence charSequence) {
        if (this.m != null && multiToggleButton == this.c) {
            this.m.a(charSequence);
        }
    }
    
    public void a(final CharSequence charSequence) {
        if (charSequence.equals("flash")) {
            this.c.b();
        }
    }
    
    public void a(final Set set, final CharSequence charSequence) {
        this.c.a(set, charSequence);
    }
    
    public void a(final boolean b) {
        this.clearAnimation();
        if (this.getVisibility() != 0) {
            if (!b) {
                this.setVisibility(0);
                return;
            }
            this.startAnimation(this.e);
        }
    }
    
    public void b(final boolean b) {
        this.clearAnimation();
        if (this.getVisibility() == 0) {
            if (!b) {
                this.setVisibility(8);
                return;
            }
            this.startAnimation(this.f);
        }
    }
    
    protected void onConfigurationChanged(final Configuration configuration) {
        final Resources resources = this.getResources();
        this.setBackgroundDrawable(resources.getDrawable(2130837531));
        if (configuration.orientation == 1) {
            this.b.setImageResource(2130838768);
            this.a.setTextColor(resources.getColor(2131689634));
            this.setPadding(this.k, 0, this.k, this.l);
        }
        else {
            this.b.setImageResource(2130838769);
            this.a.setTextColor(resources.getColor(2131689637));
            this.setPadding(this.h, 0, this.h, this.i);
        }
        this.requestLayout();
    }
    
    protected void onMeasure(final int n, final int n2) {
        int n3;
        if (this.getResources().getConfiguration().orientation == 1) {
            n3 = this.j;
        }
        else {
            n3 = this.g;
        }
        super.onMeasure(n, View$MeasureSpec.makeMeasureSpec(n3, 1073741824));
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (!this.isEnabled() || this.m == null) {
            return false;
        }
        switch (MotionEventCompat.getActionMasked(motionEvent)) {
            default: {
                return false;
            }
            case 0: {
                ((TransitionDrawable)view.getBackground()).startTransition(0);
                return true;
            }
            case 1: {
                ((TransitionDrawable)view.getBackground()).reverseTransition(300);
                if (com.twitter.android.util.l.a(view, (int)motionEvent.getX(), (int)motionEvent.getY())) {
                    if (view == this.d) {
                        this.m.b();
                        return true;
                    }
                    if (view == this.c) {
                        this.c.performClick();
                    }
                }
                return false;
            }
            case 3: {
                ((TransitionDrawable)view.getBackground()).reverseTransition(300);
                return false;
            }
        }
    }
    
    public void setControlsEnabled(final boolean b) {
        this.b.setEnabled(b);
        this.setFlashEnabled(b);
        this.setFlipCameraButtonEnabled(b);
        this.a.setEnabled(b);
    }
    
    public void setDoneButtonEnabled(final boolean b) {
        int n;
        if (b) {
            n = 0;
        }
        else {
            n = 8;
        }
        this.a.setVisibility(n);
        this.findViewById(2131886331).setVisibility(n);
    }
    
    public void setFlashEnabled(final boolean enabled) {
        this.c.setEnabled(enabled);
        final MultiToggleButton c = this.c;
        float alpha;
        if (enabled) {
            alpha = 1.0f;
        }
        else {
            alpha = 0.5f;
        }
        c.setAlpha(alpha);
    }
    
    public void setFlipCameraButtonEnabled(final boolean enabled) {
        if (this.d.isEnabled() == enabled) {
            return;
        }
        this.d.setEnabled(enabled);
        final ImageButton d = this.d;
        float alpha;
        if (enabled) {
            alpha = 1.0f;
        }
        else {
            alpha = 0.5f;
        }
        d.setAlpha(alpha);
    }
    
    public void setOnCameraToolbarClickListener(final h m) {
        this.m = m;
    }
}
