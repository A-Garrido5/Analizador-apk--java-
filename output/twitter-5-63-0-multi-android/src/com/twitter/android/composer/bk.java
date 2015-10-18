// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.view.View;
import android.view.View$OnFocusChangeListener;

class bk implements View$OnFocusChangeListener
{
    final /* synthetic */ TweetBox a;
    
    bk(final TweetBox a) {
        this.a = a;
    }
    
    public void onFocusChange(final View view, final boolean b) {
        if (this.a.d) {
            this.a.d = false;
            this.a.h();
            if (this.a.b != null) {
                this.a.b.F_();
            }
        }
        if (this.a.b != null) {
            this.a.b.b(b);
        }
    }
}
