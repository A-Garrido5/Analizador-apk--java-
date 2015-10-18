// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.library.card.Card;

class x implements s
{
    final /* synthetic */ z a;
    final /* synthetic */ w b;
    
    x(final w b, final z a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a() {
        if (this.a != null) {
            this.a.a();
        }
    }
    
    @Override
    public void a(Card i) {
        if (i != null) {
            i = i.i();
        }
        if (this.a != null) {
            this.a.a(i);
        }
    }
    
    @Override
    public void a(final String s) {
        if (this.a != null) {
            this.a.a(s);
        }
    }
}
