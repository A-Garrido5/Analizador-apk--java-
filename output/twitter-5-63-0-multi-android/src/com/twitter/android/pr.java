// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Collection;
import android.util.Pair;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.android.util.bb;
import com.twitter.library.client.as;
import com.twitter.util.q;
import com.twitter.android.client.c;
import com.twitter.library.client.az;
import android.content.Context;
import android.support.v4.util.LruCache;
import com.twitter.library.util.ak;
import com.twitter.library.provider.bg;
import com.twitter.library.client.Session;
import com.twitter.library.client.ay;

class pr extends ay
{
    final /* synthetic */ pn a;
    
    private pr(final pn a) {
        this.a = a;
    }
    
    @Override
    public void a(final Session session) {
        this.a.a();
        this.a.d = bg.a(this.a.e, session.g());
    }
}
