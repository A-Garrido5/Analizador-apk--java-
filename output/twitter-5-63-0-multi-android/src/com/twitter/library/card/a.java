// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card;

import com.twitter.library.card.element.ElementState;
import com.twitter.library.card.element.Element;
import com.twitter.library.card.element.d;

class a extends d
{
    final /* synthetic */ m a;
    final /* synthetic */ Card b;
    
    a(final Card b, final m a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final Element element) {
        final ElementState c = element.C();
        if (c.a()) {
            this.a.a.put(element.id, (Object)c);
        }
    }
}
