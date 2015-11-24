// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.View;
import android.view.View$OnLongClickListener;

class ax implements View$OnLongClickListener
{
    final /* synthetic */ TweetView a;
    
    ax(final TweetView a) {
        this.a = a;
    }
    
    public boolean onLongClick(final View view) {
        return this.a.n();
    }
}
