// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.network;

import com.twitter.config.b;
import com.twitter.util.platform.k;
import com.twitter.util.m;
import com.twitter.util.platform.n;
import com.twitter.util.platform.o;

class s implements o
{
    final /* synthetic */ r a;
    
    s(final r a) {
        this.a = a;
    }
    
    @Override
    public void a(final n n, final String s) {
        if (s.equals("wifi_only_mode")) {
            this.a.a(n.a("wifi_only_mode", false), this.a.c);
        }
    }
}
