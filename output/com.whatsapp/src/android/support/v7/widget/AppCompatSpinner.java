// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.support.annotation.Nullable;
import android.annotation.TargetApi;
import java.lang.reflect.Field;
import android.widget.ListPopupWindow;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.os.Build$VERSION;
import android.support.v7.internal.widget.TintTypedArray;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.appcompat.R$attr;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.internal.widget.TintInfo;
import android.support.v4.view.TintableBackgroundView;
import android.widget.Spinner;

public class AppCompatSpinner extends Spinner implements TintableBackgroundView
{
    private static final int[] TINT_ATTRS;
    private static final String z;
    private TintInfo mBackgroundTint;
    
    static {
        final char[] charArray = "xV@dDe".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '1';
                    break;
                }
                case 0: {
                    c2 = '\u0015';
                    break;
                }
                case 1: {
                    c2 = '\u0006';
                    break;
                }
                case 2: {
                    c2 = '/';
                    break;
                }
                case 3: {
                    c2 = '\u0014';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
        TINT_ATTRS = new int[] { 16842964, 16843126 };
    }
    
    public AppCompatSpinner(final Context context) {
        this(context, null);
    }
    
    public AppCompatSpinner(final Context context, final AttributeSet set) {
        this(context, set, R$attr.spinnerStyle);
    }
    
    public AppCompatSpinner(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        if (TintManager.SHOULD_BE_USED) {
            final TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.getContext(), set, AppCompatSpinner.TINT_ATTRS, n, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                final ColorStateList tintList = obtainStyledAttributes.getTintManager().getTintList(obtainStyledAttributes.getResourceId(0, -1));
                if (tintList != null) {
                    this.setSupportBackgroundTintList(tintList);
                }
            }
            Label_0116: {
                if (obtainStyledAttributes.hasValue(1)) {
                    final Drawable drawable = obtainStyledAttributes.getDrawable(1);
                    if (Build$VERSION.SDK_INT >= 16) {
                        this.setPopupBackgroundDrawable(drawable);
                        if (!LinearLayoutCompat.a) {
                            break Label_0116;
                        }
                    }
                    if (Build$VERSION.SDK_INT >= 11) {
                        setPopupBackgroundDrawableV11(this, drawable);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
    
    private void applySupportBackgroundTint() {
        if (this.getBackground() != null && this.mBackgroundTint != null) {
            TintManager.tintViewBackground((View)this, this.mBackgroundTint);
        }
    }
    
    @TargetApi(11)
    private static void setPopupBackgroundDrawableV11(final Spinner spinner, final Drawable backgroundDrawable) {
        try {
            final Field declaredField = Spinner.class.getDeclaredField(AppCompatSpinner.z);
            declaredField.setAccessible(true);
            final Object value = declaredField.get(spinner);
            try {
                if (value instanceof ListPopupWindow) {
                    ((ListPopupWindow)value).setBackgroundDrawable(backgroundDrawable);
                }
            }
            catch (NoSuchFieldException ex) {
                throw ex;
            }
        }
        catch (NoSuchFieldException ex2) {
            ex2.printStackTrace();
        }
        catch (IllegalAccessException ex3) {
            ex3.printStackTrace();
        }
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.applySupportBackgroundTint();
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
