// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.metrics;

import com.twitter.library.client.af;
import com.twitter.library.client.ad;
import com.twitter.library.scribe.ScribeService;
import com.twitter.util.n;
import com.twitter.library.network.f;
import com.twitter.library.client.az;
import com.twitter.library.featureswitch.d;
import com.twitter.library.util.an;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;
import com.twitter.library.client.Session;
import com.twitter.library.client.ay;

class i extends ay
{
    final /* synthetic */ h a;
    
    i(final h a) {
        this.a = a;
    }
    
    @Override
    public void a(final Session session) {
        final ir b = ir.b();
        final long g = session.g();
        if (b != null) {
            final Iterator<String> iterator = (Iterator<String>)h.c.iterator();
            while (iterator.hasNext()) {
                final ig a = b.a(iterator.next());
                if (a != null) {
                    a.b(g);
                }
            }
        }
    }
}
