// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.card.element.Element;
import com.twitter.library.card.element.d;

final class bz extends d
{
    public int a;
    public int b;
    public int c;
    public int d;
    private int e;
    
    @Override
    public void a() {
        ++this.e;
    }
    
    @Override
    public void a(final Element element) {
        ++this.a;
        this.c = Math.max(this.c, this.e);
        if (element.F()) {
            ++this.b;
            this.d = Math.max(this.d, this.e);
        }
    }
    
    @Override
    public void b() {
        --this.e;
    }
}
