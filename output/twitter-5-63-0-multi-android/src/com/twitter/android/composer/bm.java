// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.widget.EditText;

class bm implements Runnable
{
    final /* synthetic */ EditText a;
    final /* synthetic */ int b;
    final /* synthetic */ TweetBox c;
    
    bm(final TweetBox c, final EditText a, final int b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        final int textLength = this.c.getTextLength();
        this.a.setSelection(Math.min(this.b, textLength), textLength);
    }
}
