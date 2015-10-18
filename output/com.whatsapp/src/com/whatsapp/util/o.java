// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.widget.RelativeLayout$LayoutParams;
import android.text.SpannableString;
import android.os.Build$VERSION;
import android.view.Display;
import android.widget.TextView;
import android.view.View;

public class o
{
    public static void a(final CharSequence charSequence, final View view, final TextView textView, final Display display) {
        if (Build$VERSION.SDK_INT < 8) {
            return;
        }
        view.measure(display.getWidth(), display.getHeight());
        final int measuredHeight = view.getMeasuredHeight();
        final int measuredWidth = view.getMeasuredWidth();
        final int round = Math.round(measuredHeight / textView.getPaint().getFontSpacing());
        final SpannableString text = new SpannableString(charSequence);
        text.setSpan((Object)new a3(round, measuredWidth, view), 0, text.length(), 33);
        textView.setText((CharSequence)text);
        final int[] rules = ((RelativeLayout$LayoutParams)textView.getLayoutParams()).getRules();
        rules[rules[1] = 0] = 0;
    }
}
