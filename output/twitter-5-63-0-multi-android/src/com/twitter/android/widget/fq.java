// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View;
import com.twitter.library.api.TweetClassicCard;
import android.view.View$OnClickListener;

class fq implements View$OnClickListener
{
    final /* synthetic */ TweetClassicCard a;
    final /* synthetic */ TweetDetailView b;
    
    fq(final TweetDetailView b, final TweetClassicCard a) {
        this.b = b;
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.b.i.a(this.a);
    }
}
