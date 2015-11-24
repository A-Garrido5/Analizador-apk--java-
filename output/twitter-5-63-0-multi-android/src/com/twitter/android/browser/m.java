// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.browser;

import android.content.Context;
import android.util.LruCache;

class m implements p
{
    final /* synthetic */ l a;
    
    m(final l a) {
        this.a = a;
    }
    
    @Override
    public void a(final String s, final k k) {
        if (this.a.b.get((Object)s) == null) {
            return;
        }
        this.a.b.remove((Object)s);
        if (k != null) {
            this.a.a.put((Object)s, (Object)k);
            return;
        }
        this.a.c.put((Object)s, (Object)s);
    }
}
