// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.view.View;
import com.whatsapp.DialogToastActivity;
import android.view.WindowManager;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class CameraLayout extends FrameLayout
{
    private static final String z;
    
    static {
        final char[] charArray = "\\f?CE\\".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '*';
                    break;
                }
                case 0: {
                    c2 = '+';
                    break;
                }
                case 1: {
                    c2 = '\u000f';
                    break;
                }
                case 2: {
                    c2 = 'Q';
                    break;
                }
                case 3: {
                    c2 = '\'';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public CameraLayout(final Context context) {
        super(context);
    }
    
    public CameraLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public CameraLayout(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final boolean m = CameraActivity.m;
        super.onLayout(b, n, n2, n3, n4);
        final View viewById = this.findViewById(2131755323);
        final View viewById2 = this.findViewById(2131755325);
        final View viewById3 = this.findViewById(2131755324);
        final int measuredWidth = viewById.getMeasuredWidth();
        final int measuredHeight = viewById.getMeasuredHeight();
        final int measuredWidth2 = viewById2.getMeasuredWidth();
        final int measuredHeight2 = viewById2.getMeasuredHeight();
        final int measuredWidth3 = viewById3.getMeasuredWidth();
        final int measuredHeight3 = viewById3.getMeasuredHeight();
        Label_0565: {
            if (n4 - n2 > n3 - n) {
                viewById.layout((n + n3 - measuredWidth) / 2, n4 - measuredHeight, (measuredWidth + (n + n3)) / 2, n4);
                final int n5 = (n3 - n - measuredWidth) / 4;
                viewById3.layout(n3 - n5 - measuredWidth3 / 2, n4 - measuredHeight / 2 - measuredHeight3 / 2, n3 - n5 + measuredWidth3 / 2, n4 - measuredHeight / 2 + measuredHeight3 / 2);
                viewById2.layout(n + n5 - measuredWidth2 / 2, n4 - measuredHeight / 2 - measuredHeight2 / 2, n5 + n + measuredWidth2 / 2, n4 - measuredHeight / 2 + measuredHeight2 / 2);
                if (!m) {
                    break Label_0565;
                }
            }
            final int orientation = ((WindowManager)this.getContext().getSystemService(CameraLayout.z)).getDefaultDisplay().getOrientation();
            final int n6 = n2 + this.findViewById(2131755086).getMeasuredHeight();
            if (orientation == 0 || orientation == 1) {
                viewById.layout(n3 - measuredWidth, (n6 + n4 - measuredHeight) / 2, n3, (measuredHeight + (n6 + n4)) / 2);
                final int n7 = (n4 - n6 - measuredHeight) / 4;
                viewById3.layout(n3 - measuredWidth / 2 - measuredWidth3 / 2, n6 + n7 - measuredHeight3 / 2, n3 - measuredWidth / 2 + measuredWidth3 / 2, n6 + n7 + measuredHeight3 / 2);
                viewById2.layout(n3 - measuredWidth / 2 - measuredWidth2 / 2, n4 - n7 - measuredHeight2 / 2, n3 - measuredWidth / 2 + measuredWidth2 / 2, n4 - n7 + measuredHeight2 / 2);
                if (!m) {
                    break Label_0565;
                }
            }
            viewById.layout(n, (n6 + n4 - measuredHeight) / 2, n + measuredWidth, (measuredHeight + (n6 + n4)) / 2);
            final int n8 = (n4 - n6 - measuredHeight) / 4;
            viewById3.layout(n + measuredWidth / 2 - measuredWidth3 / 2, n6 + n8 - measuredHeight3 / 2, n + measuredWidth / 2 + measuredWidth3 / 2, n6 + n8 + measuredHeight3 / 2);
            viewById2.layout(n + measuredWidth / 2 - measuredWidth2 / 2, n4 - n8 - measuredHeight2 / 2, n + measuredWidth / 2 + measuredWidth2 / 2, n4 - n8 + measuredHeight2 / 2);
        }
        if (DialogToastActivity.h) {
            CameraActivity.m = !m;
        }
    }
}
