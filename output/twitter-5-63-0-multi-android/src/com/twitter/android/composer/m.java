// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.view.View;
import android.view.View$OnClickListener;

class m implements View$OnClickListener
{
    final /* synthetic */ TweetBox a;
    final /* synthetic */ ComposerActivity b;
    
    m(final ComposerActivity b, final TweetBox a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.a(this.a.getText(), null);
        this.b.m();
    }
}
