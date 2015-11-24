// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.text.Spanned;
import android.view.ViewConfiguration;
import android.os.Handler;
import android.text.Layout;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

final class v implements View$OnTouchListener
{
    final /* synthetic */ u a;
    
    v(final u a) {
        this.a = a;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        final TextView textView = (TextView)view;
        final Layout layout = textView.getLayout();
        if (layout != null) {
            this.a.d = layout;
            this.a.e = textView.getTotalPaddingLeft() + textView.getScrollX();
            this.a.f = textView.getTotalPaddingTop() + textView.getScrollY();
            return this.a.a(motionEvent);
        }
        return false;
    }
}
