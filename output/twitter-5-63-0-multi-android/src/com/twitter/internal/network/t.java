// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.network;

import com.twitter.config.b;
import com.twitter.util.platform.o;
import com.twitter.util.platform.k;
import com.twitter.util.m;
import com.twitter.util.platform.TwRadioType;
import com.twitter.util.platform.l;
import com.twitter.util.n;

class t implements n
{
    final /* synthetic */ r a;
    
    t(final r a) {
        this.a = a;
    }
    
    public void a(final l l) {
        this.a.a(this.a.b, l.a() == TwRadioType.s);
    }
}
