// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.TransitionDrawable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Checkable;
import com.twitter.internal.android.widget.TypefacesTextView;

public class CompoundDrawableAnimButton extends TypefacesTextView implements Checkable
{
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    private static final int[] d;
    private final int e;
    private int[] f;
    private boolean g;
    private boolean h;
    
    static {
        a = new int[] { 16842912 };
        b = new int[] { kv.state_animate_to_checked };
        c = new int[] { kv.state_animate_to_default };
        d = new int[0];
    }
    
    public CompoundDrawableAnimButton(final Context context) {
        this(context, null);
    }
    
    public CompoundDrawableAnimButton(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public CompoundDrawableAnimButton(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.f = CompoundDrawableAnimButton.d;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.CompoundDrawableAnimButton, n, 0);
        this.e = obtainStyledAttributes.getInteger(li.CompoundDrawableAnimButton_transition_duration, 0);
        obtainStyledAttributes.recycle();
        this.setClickable(true);
    }
    
    public void a(final boolean g, final boolean b) {
        if (this.g != g) {
            this.g = g;
            if (b) {
                this.h = true;
                if (this.g) {
                    this.f = CompoundDrawableAnimButton.b;
                }
                else {
                    this.f = CompoundDrawableAnimButton.c;
                }
            }
            else if (this.g) {
                this.f = CompoundDrawableAnimButton.a;
            }
            else {
                this.f = CompoundDrawableAnimButton.d;
            }
            this.refreshDrawableState();
        }
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.h) {
            this.h = false;
            for (final Drawable drawable : this.getCompoundDrawables()) {
                if (drawable != null) {
                    final Drawable current = drawable.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        final TransitionDrawable transitionDrawable = (TransitionDrawable)current;
                        transitionDrawable.setCrossFadeEnabled(true);
                        transitionDrawable.startTransition(this.e);
                    }
                    else if (current instanceof Animatable) {
                        ((Animatable)current).start();
                    }
                }
            }
        }
    }
    
    public boolean isChecked() {
        return this.g;
    }
    
    public int[] onCreateDrawableState(final int n) {
        int length;
        if (this.f != null) {
            length = this.f.length;
        }
        else {
            length = 0;
        }
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + length);
        if (length > 0) {
            mergeDrawableStates(onCreateDrawableState, this.f);
        }
        return onCreateDrawableState;
    }
    
    public void setChecked(final boolean b) {
        this.a(b, false);
    }
    
    public void toggle() {
        this.setChecked(!this.g);
    }
}
