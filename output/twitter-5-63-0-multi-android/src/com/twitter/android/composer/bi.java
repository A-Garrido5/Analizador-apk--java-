// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

class bi implements View$OnTouchListener
{
    final /* synthetic */ TweetBox a;
    
    bi(final TweetBox a) {
        this.a = a;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (1 == motionEvent.getAction() && this.a.b != null) {
            this.a.b.v();
        }
        return false;
    }
}
