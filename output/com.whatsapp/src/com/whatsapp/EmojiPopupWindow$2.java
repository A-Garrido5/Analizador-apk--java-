// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.widget.RelativeLayout;

class EmojiPopupWindow$2 extends RelativeLayout
{
    int a;
    final n7 b;
    
    EmojiPopupWindow$2(final n7 b, final Context context) {
        this.b = b;
        super(context);
        this.a = -1;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final int orientation = n7.a(this.b).getWindowManager().getDefaultDisplay().getOrientation();
        if (this.a != -1 && this.a != orientation) {
            n7.b(this.b).post((Runnable)new yp(this));
        }
        this.a = orientation;
    }
}
