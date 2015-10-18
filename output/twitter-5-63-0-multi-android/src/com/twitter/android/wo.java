// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.scribe.TwitterScribeAssociation;
import android.support.v4.app.Fragment;

public class wo extends ul
{
    final /* synthetic */ TweetFragment a;
    
    public wo(final TweetFragment a, final Fragment fragment, final TwitterScribeAssociation twitterScribeAssociation) {
        this.a = a;
        super(fragment, twitterScribeAssociation);
    }
    
    @Override
    protected void a(final long n, final boolean b, final int n2) {
        this.a.a(n, b, n2);
    }
}
