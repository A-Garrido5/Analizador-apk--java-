// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.View;
import android.view.View$OnClickListener;

class d implements View$OnClickListener
{
    final /* synthetic */ BottomSheet a;
    
    d(final BottomSheet a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.cancel();
    }
}
