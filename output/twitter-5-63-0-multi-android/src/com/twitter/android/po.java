// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Collection;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.android.util.bb;
import com.twitter.library.client.as;
import com.twitter.util.q;
import com.twitter.library.client.Session;
import com.twitter.android.client.c;
import com.twitter.library.client.az;
import android.content.Context;
import com.twitter.library.provider.bg;
import com.twitter.library.client.ay;
import com.twitter.library.util.ak;
import android.util.Pair;
import android.support.v4.util.LruCache;

class po extends LruCache
{
    final /* synthetic */ pn a;
    
    po(final pn a, final int n) {
        this.a = a;
        super(n);
    }
    
    protected void a(final boolean b, final Long n, final Pair pair, final Pair pair2) {
        this.a.d.j((long)pair.first);
    }
}
