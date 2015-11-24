// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.os.Parcelable;
import android.content.res.TypedArray;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageButton;

public class ToggleImageButton extends ImageButton
{
    private static final int[] a;
    private boolean b;
    private String c;
    private String d;
    private final boolean e;
    
    static {
        a = new int[] { 2130772428 };
    }
    
    public ToggleImageButton(final Context context) {
        this(context, null);
    }
    
    public ToggleImageButton(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ToggleImageButton(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.b = false;
        TypedArray obtainStyledAttributes = null;
        try {
            obtainStyledAttributes = context.getTheme().obtainStyledAttributes(set, pa.ToggleImageButton, n, 0);
            String string = obtainStyledAttributes.getString(2);
            final String string2 = obtainStyledAttributes.getString(3);
            if (string == null) {
                string = (String)this.getContentDescription();
            }
            this.c = string;
            String d;
            if (string2 == null) {
                d = (String)this.getContentDescription();
            }
            else {
                d = string2;
            }
            this.d = d;
            this.e = obtainStyledAttributes.getBoolean(4, true);
            this.setToggledOn(obtainStyledAttributes.getBoolean(1, false));
        }
        finally {
            if (obtainStyledAttributes != null) {
                obtainStyledAttributes.recycle();
            }
        }
    }
    
    public void a() {
        this.setToggledOn(!this.b);
    }
    
    public boolean b() {
        return this.b;
    }
    
    public int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 2);
        if (this.b) {
            mergeDrawableStates(onCreateDrawableState, ToggleImageButton.a);
        }
        return onCreateDrawableState;
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final ToggleImageButton$SavedState toggleImageButton$SavedState = (ToggleImageButton$SavedState)parcelable;
        super.onRestoreInstanceState(toggleImageButton$SavedState.getSuperState());
        this.setToggledOn(toggleImageButton$SavedState.a);
    }
    
    public Parcelable onSaveInstanceState() {
        return (Parcelable)new ToggleImageButton$SavedState(super.onSaveInstanceState(), this.b);
    }
    
    public boolean performClick() {
        if (this.e) {
            this.a();
        }
        return super.performClick();
    }
    
    public void setToggledOn(final boolean b) {
        this.b = b;
        String contentDescription;
        if (b) {
            contentDescription = this.c;
        }
        else {
            contentDescription = this.d;
        }
        this.setContentDescription((CharSequence)contentDescription);
        this.refreshDrawableState();
    }
}
