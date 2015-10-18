// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.View;
import com.twitter.library.api.UrlEntity;
import com.twitter.library.provider.Tweet;
import com.twitter.library.view.c;

class ba extends c
{
    final /* synthetic */ Tweet a;
    final /* synthetic */ UrlEntity b;
    final /* synthetic */ TweetView c;
    
    ba(final TweetView c, final int n, final Tweet a, final UrlEntity b) {
        this.c = c;
        this.a = a;
        this.b = b;
        super(n);
    }
    
    public void onClick(final View view) {
        this.c.a(this.a, this.b);
    }
}
