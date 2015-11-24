// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.videoapp;

import android.view.View;
import android.view.View$OnClickListener;

class a implements View$OnClickListener
{
    final /* synthetic */ VideoCardCanvasActivity a;
    
    a(final VideoCardCanvasActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.setRequestedOrientation(11);
    }
}
