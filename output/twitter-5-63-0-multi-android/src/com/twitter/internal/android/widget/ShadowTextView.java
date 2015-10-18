// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.Checkable;

public class ShadowTextView extends TypefacesTextView implements Checkable
{
    private static final int[] a;
    private final ColorStateList b;
    private final float c;
    private final float d;
    private final float e;
    private int f;
    private boolean g;
    
    static {
        a = new int[] { 16842912 };
    }
    
    public ShadowTextView(final Context context) {
        this(context, null);
    }
    
    public ShadowTextView(final Context context, final AttributeSet set) {
        this(context, set, kv.shadowTextViewStyle);
    }
    
    public ShadowTextView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.ShadowTextView, n, 0);
        this.b = obtainStyledAttributes.getColorStateList(li.ShadowTextView_shadowColor);
        this.d = obtainStyledAttributes.getDimension(li.ShadowTextView_shadowDx, 0.0f);
        this.c = obtainStyledAttributes.getDimension(li.ShadowTextView_shadowDy, 0.0f);
        this.e = obtainStyledAttributes.getDimension(li.ShadowTextView_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        this.a();
    }
    
    private void a() {
        final ColorStateList b = this.b;
        if (b != null && b.isStateful()) {
            final int colorForState = b.getColorForState(this.getDrawableState(), 0);
            if (colorForState != this.f) {
                this.f = colorForState;
                this.setShadowLayer(this.e, this.d, this.c, colorForState);
            }
        }
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.a();
    }
    
    public boolean isChecked() {
        return this.g;
    }
    
    public int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 1);
        if (this.g) {
            mergeDrawableStates(onCreateDrawableState, ShadowTextView.a);
        }
        return onCreateDrawableState;
    }
    
    public void setChecked(final boolean g) {
        if (this.g != g) {
            this.g = g;
            this.refreshDrawableState();
        }
    }
    
    public void toggle() {
        this.setChecked(!this.g);
    }
}
