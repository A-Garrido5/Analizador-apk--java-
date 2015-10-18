// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.library.card.j;
import com.twitter.library.card.Card;

class ah implements z
{
    final /* synthetic */ ag a;
    final /* synthetic */ ag b;
    
    ah(final ag b, final ag a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a() {
        this.b.e = null;
    }
    
    @Override
    public void a(final Card card) {
        this.b.e = null;
        card.a(this.a);
        this.a.a(card);
        card.j();
        this.a.s();
        this.b.a.r();
    }
    
    @Override
    public void a(final String s) {
        this.b.e = null;
    }
}
