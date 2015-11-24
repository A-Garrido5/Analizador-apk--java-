// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import com.twitter.util.c;
import android.view.View;
import android.widget.ImageButton;
import android.content.Context;
import android.view.View$OnClickListener;

class q implements View$OnClickListener
{
    final /* synthetic */ Context a;
    final /* synthetic */ ImageButton b;
    final /* synthetic */ TweetMediaView c;
    
    q(final TweetMediaView c, final Context a, final ImageButton b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        if (com.twitter.util.c.f(this.a)) {
            this.b.setVisibility(4);
            this.c.d();
        }
    }
}
