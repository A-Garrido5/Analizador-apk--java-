// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.view.View;
import android.view.View$OnLongClickListener;

class n implements View$OnLongClickListener
{
    final /* synthetic */ TweetBox a;
    final /* synthetic */ ComposerActivity b;
    
    n(final ComposerActivity b, final TweetBox a) {
        this.b = b;
        this.a = a;
    }
    
    public boolean onLongClick(final View view) {
        return this.a.d();
    }
}
