// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.annotation.TargetApi;
import java.lang.reflect.Field;
import android.widget.ListPopupWindow;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Spinner;

public class TintSpinner extends Spinner
{
    private static final int[] TINT_ATTRS;
    
    static {
        TINT_ATTRS = new int[] { 16842964, 16843126 };
    }
    
    public TintSpinner(final Context context) {
        this(context, null);
    }
    
    public TintSpinner(final Context context, final AttributeSet set) {
        this(context, set, 16842881);
    }
    
    public TintSpinner(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, set, TintSpinner.TINT_ATTRS, n, 0);
        this.setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
        if (obtainStyledAttributes.hasValue(1)) {
            final Drawable drawable = obtainStyledAttributes.getDrawable(1);
            if (Build$VERSION.SDK_INT >= 16) {
                this.setPopupBackgroundDrawable(drawable);
            }
            else if (Build$VERSION.SDK_INT >= 11) {
                setPopupBackgroundDrawableV11(this, drawable);
            }
        }
        obtainStyledAttributes.recycle();
    }
    
    @TargetApi(11)
    private static void setPopupBackgroundDrawableV11(final Spinner spinner, final Drawable backgroundDrawable) {
        try {
            final Field declaredField = Spinner.class.getDeclaredField("mPopup");
            declaredField.setAccessible(true);
            final Object value = declaredField.get(spinner);
            if (value instanceof ListPopupWindow) {
                ((ListPopupWindow)value).setBackgroundDrawable(backgroundDrawable);
            }
        }
        catch (NoSuchFieldException ex) {
            ex.printStackTrace();
        }
        catch (IllegalAccessException ex2) {
            ex2.printStackTrace();
        }
    }
}
