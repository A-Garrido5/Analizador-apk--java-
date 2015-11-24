// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.support.annotation.Nullable;
import android.view.View;
import android.content.res.ColorStateList;
import android.support.v7.internal.widget.TintTypedArray;
import android.support.v7.internal.widget.TintContextWrapper;
import android.support.v7.appcompat.R$attr;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintInfo;
import android.support.v4.view.TintableBackgroundView;
import android.widget.MultiAutoCompleteTextView;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements TintableBackgroundView
{
    private static final int[] TINT_ATTRS;
    private TintInfo mBackgroundTint;
    private TintManager mTintManager;
    
    static {
        TINT_ATTRS = new int[] { 16842964, 16843126 };
    }
    
    public AppCompatMultiAutoCompleteTextView(final Context context) {
        this(context, null);
    }
    
    public AppCompatMultiAutoCompleteTextView(final Context context, final AttributeSet set) {
        this(context, set, R$attr.autoCompleteTextViewStyle);
    }
    
    public AppCompatMultiAutoCompleteTextView(final Context context, final AttributeSet set, final int n) {
        super(TintContextWrapper.wrap(context), set, n);
        if (TintManager.SHOULD_BE_USED) {
            final TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.getContext(), set, AppCompatMultiAutoCompleteTextView.TINT_ATTRS, n, 0);
            this.mTintManager = obtainStyledAttributes.getTintManager();
            if (obtainStyledAttributes.hasValue(0)) {
                final ColorStateList tintList = obtainStyledAttributes.getTintManager().getTintList(obtainStyledAttributes.getResourceId(0, -1));
                if (tintList != null) {
                    this.setSupportBackgroundTintList(tintList);
                }
            }
            if (obtainStyledAttributes.hasValue(1)) {
                this.setDropDownBackgroundDrawable(obtainStyledAttributes.getDrawable(1));
            }
            obtainStyledAttributes.recycle();
        }
    }
    
    private void applySupportBackgroundTint() {
        if (this.getBackground() != null && this.mBackgroundTint != null) {
            TintManager.tintViewBackground((View)this, this.mBackgroundTint);
        }
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.applySupportBackgroundTint();
    }
    
    public void setDropDownBackgroundResource(final int dropDownBackgroundResource) {
        if (this.mTintManager != null) {
            this.setDropDownBackgroundDrawable(this.mTintManager.getDrawable(dropDownBackgroundResource));
            if (!LinearLayoutCompat.a) {
                return;
            }
        }
        super.setDropDownBackgroundResource(dropDownBackgroundResource);
    }
    
    public void setSupportBackgroundTintList(@Nullable final ColorStateList mTintList) {
        if (this.mBackgroundTint == null) {
            this.mBackgroundTint = new TintInfo();
        }
        this.mBackgroundTint.mTintList = mTintList;
        this.mBackgroundTint.mHasTintList = true;
        this.applySupportBackgroundTint();
    }
}
