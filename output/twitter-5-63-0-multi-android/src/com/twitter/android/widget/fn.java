// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View;
import android.view.View$OnClickListener;

class fn implements View$OnClickListener
{
    final /* synthetic */ TweetDetailView a;
    
    fn(final TweetDetailView a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.i.b(this.a.h.Q().id);
    }
}
