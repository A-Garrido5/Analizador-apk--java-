// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.resilient;

import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.client.ay;

class f extends ay
{
    private final Context a;
    
    public f(final Context a) {
        this.a = a;
    }
    
    @Override
    public void a(final Session session, final boolean b) {
        d.a(this.a).a(this.a, session.g());
    }
}
