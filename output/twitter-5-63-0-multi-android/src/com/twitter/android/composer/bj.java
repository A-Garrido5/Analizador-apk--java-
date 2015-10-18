// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.view.KeyEvent;
import com.twitter.android.autocomplete.b;

class bj implements b
{
    final /* synthetic */ TweetBox a;
    
    bj(final TweetBox a) {
        this.a = a;
    }
    
    @Override
    public boolean a(final int n, final KeyEvent keyEvent) {
        return n == 4 && this.a.b != null && this.a.b.a(keyEvent);
    }
}
