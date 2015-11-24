// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.Layout;
import android.view.View;
import android.view.MotionEvent;
import android.text.Spannable;
import android.widget.TextView;
import android.text.method.LinkMovementMethod;

public class aav extends LinkMovementMethod
{
    iq a;
    
    public boolean onTouchEvent(final TextView textView, final Spannable spannable, final MotionEvent motionEvent) {
        final boolean i = App.I;
        final int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            final int n = (int)motionEvent.getX();
            final int n2 = (int)motionEvent.getY();
            final int n3 = n - textView.getTotalPaddingLeft();
            final int n4 = n2 - textView.getTotalPaddingTop();
            final int n5 = n3 + textView.getScrollX();
            final int n6 = n4 + textView.getScrollY();
            final Layout layout = textView.getLayout();
            final int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(n6), (float)n5);
            final iq[] array = (iq[])spannable.getSpans(offsetForHorizontal, offsetForHorizontal, (Class)iq.class);
            if (array.length != 0) {
                this.a = array[0];
                if (action == 1) {
                    this.a.a((View)textView, motionEvent);
                    if (!i) {
                        return true;
                    }
                }
                if (action == 0) {
                    this.a.a((View)textView, motionEvent);
                }
                return true;
            }
            if (!i) {
                return false;
            }
        }
        if (action == 3 && this.a != null) {
            this.a.a((View)textView, motionEvent);
        }
        return false;
    }
}
