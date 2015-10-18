// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.annotation.TargetApi;
import android.view.View;
import java.lang.reflect.Field;
import android.util.Log;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import android.os.Build$VERSION;
import android.support.v7.appcompat.R$styleable;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.PopupWindow;

public class AppCompatPopupWindow extends PopupWindow
{
    private static final String[] z;
    private final boolean mOverlapAnchor;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u0007p\u001cq\u00146a\u0010zD5`\u0016x\u0001ba\u0011g\u0010#d\u0013}\n%(\b{\u0016)i\r{\u0011,l_[\n\u0011k\r{\b.K\u0017u\n%m\u001bX\r1|\u001az\u00010";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'd';
                        break;
                    }
                    case 0: {
                        c2 = 'B';
                        break;
                    }
                    case 1: {
                        c2 = '\b';
                        break;
                    }
                    case 2: {
                        c2 = '\u007f';
                        break;
                    }
                    case 3: {
                        c2 = '\u0014';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "/G\u0011G\u00070g\u0013x'*i\u0011s\u0001&D\u0016g\u0010'f\u001af";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "/I\u0011w\f-z";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u0003x\u000fW\u000b/x\u001e`4-x\nd3+f\u001b{\u0013";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public AppCompatPopupWindow(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, set, R$styleable.PopupWindow, n, 0);
        this.mOverlapAnchor = obtainStyledAttributes.getBoolean(R$styleable.PopupWindow_overlapAnchor, false);
        this.setBackgroundDrawable(obtainStyledAttributes.getDrawable(R$styleable.PopupWindow_android_popupBackground));
        obtainStyledAttributes.recycle();
        if (Build$VERSION.SDK_INT < 14) {
            wrapOnScrollChangedListener(this);
        }
    }
    
    private static void wrapOnScrollChangedListener(final PopupWindow popupWindow) {
        try {
            final Field declaredField = PopupWindow.class.getDeclaredField(AppCompatPopupWindow.z[2]);
            declaredField.setAccessible(true);
            final Field declaredField2 = PopupWindow.class.getDeclaredField(AppCompatPopupWindow.z[1]);
            declaredField2.setAccessible(true);
            declaredField2.set(popupWindow, new AppCompatPopupWindow$1(declaredField, popupWindow, (ViewTreeObserver$OnScrollChangedListener)declaredField2.get(popupWindow)));
        }
        catch (Exception ex) {
            Log.d(AppCompatPopupWindow.z[3], AppCompatPopupWindow.z[0], (Throwable)ex);
        }
    }
    
    public void showAsDropDown(final View view, final int n, int n2) {
        if (Build$VERSION.SDK_INT < 21 && this.mOverlapAnchor) {
            n2 -= view.getHeight();
        }
        super.showAsDropDown(view, n, n2);
    }
    
    @TargetApi(19)
    public void showAsDropDown(final View view, final int n, int n2, final int n3) {
        if (Build$VERSION.SDK_INT < 21 && this.mOverlapAnchor) {
            n2 -= view.getHeight();
        }
        super.showAsDropDown(view, n, n2, n3);
    }
    
    public void update(final View view, final int n, final int n2, final int n3, final int n4) {
        int n5;
        if (Build$VERSION.SDK_INT < 21 && this.mOverlapAnchor) {
            n5 = n2 - view.getHeight();
        }
        else {
            n5 = n2;
        }
        super.update(view, n, n5, n3, n4);
    }
}
