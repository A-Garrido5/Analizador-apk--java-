// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.widget.LinearLayout;

class EmojiPicker$EmojiAdapter$1 extends LinearLayout
{
    final io a;
    
    EmojiPicker$EmojiAdapter$1(final io a, final Context context) {
        this.a = a;
        super(context);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final boolean i = App.I;
        final float n5 = n3 - n;
        final int n6 = n4 - n2;
        final float n7 = n5 / bi.c(this.a.b);
        final int childCount = this.getChildCount();
        int j = 0;
        while (j < childCount) {
            final float n8 = n7 * j;
            this.getChildAt(j).layout((int)n8, 0, (int)(n8 + n7), n6);
            ++j;
            if (i) {
                break;
            }
        }
    }
}
