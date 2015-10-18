// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import android.view.MotionEvent;
import android.view.View;
import com.twitter.ui.widget.TwitterButton;
import com.twitter.library.util.ap;

class f extends ap
{
    final /* synthetic */ a a;
    
    f(final a a, final TwitterButton twitterButton) {
        this.a = a;
        super(twitterButton);
    }
    
    @Override
    public void a(final View view, final MotionEvent motionEvent) {
        this.a.a(view, motionEvent);
    }
}
