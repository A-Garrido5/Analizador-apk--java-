// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import android.widget.RelativeLayout$LayoutParams;
import android.text.Layout;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.view.View;
import android.text.style.LeadingMarginSpan$LeadingMarginSpan2;

public class a3 implements LeadingMarginSpan$LeadingMarginSpan2
{
    private View a;
    private int b;
    private int c;
    
    public a3(final int b, final int c, final View a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public void drawLeadingMargin(final Canvas canvas, final Paint paint, final int n, final int n2, final int n3, final int n4, final int n5, final CharSequence charSequence, final int n6, final int n7, final boolean b, final Layout layout) {
        if (n2 < 0) {
            final RelativeLayout$LayoutParams relativeLayout$LayoutParams = (RelativeLayout$LayoutParams)this.a.getLayoutParams();
            final int[] rules = relativeLayout$LayoutParams.getRules();
            if (rules[11] != -1 || rules[9] != 0) {
                relativeLayout$LayoutParams.addRule(11);
                relativeLayout$LayoutParams.addRule(9, 0);
                this.a.requestLayout();
            }
            if (!Log.l) {
                return;
            }
        }
        final RelativeLayout$LayoutParams relativeLayout$LayoutParams2 = (RelativeLayout$LayoutParams)this.a.getLayoutParams();
        final int[] rules2 = relativeLayout$LayoutParams2.getRules();
        if (rules2[9] != -1 || rules2[11] != 0) {
            relativeLayout$LayoutParams2.addRule(9);
            relativeLayout$LayoutParams2.addRule(11, 0);
            this.a.requestLayout();
        }
    }
    
    public int getLeadingMargin(final boolean b) {
        if (b) {
            return this.c;
        }
        return 0;
    }
    
    public int getLeadingMarginLineCount() {
        return this.b;
    }
}
