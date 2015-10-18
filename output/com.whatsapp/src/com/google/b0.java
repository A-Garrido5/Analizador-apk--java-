// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;

class b0 implements Iterable
{
    final String a;
    final CharSequence b;
    final e6 c;
    final long d;
    final a0 e;
    
    @Override
    public Iterator iterator() {
        return new cw(this.c, this.b, this.a, this.e, this.d);
    }
}
