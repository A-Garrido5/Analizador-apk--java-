// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.card.Card;
import com.twitter.android.card.y;
import com.twitter.android.card.z;

class wg implements z
{
    final /* synthetic */ wj a;
    final /* synthetic */ TweetFragment b;
    
    wg(final TweetFragment b, final wj a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a() {
        this.a.a((y)null);
    }
    
    @Override
    public void a(final Card card) {
        this.a.a((y)null);
        this.a.a(card, false);
    }
    
    @Override
    public void a(final String s) {
        this.a.a((y)null);
        if (this.b.f != null) {
            this.b.f.g();
            this.b.f.c();
        }
    }
}
