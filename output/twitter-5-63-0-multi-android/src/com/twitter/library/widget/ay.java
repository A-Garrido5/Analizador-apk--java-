// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.View;
import android.view.View$OnClickListener;

class ay implements View$OnClickListener
{
    final /* synthetic */ TweetView a;
    
    ay(final TweetView a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.f(true);
    }
}
