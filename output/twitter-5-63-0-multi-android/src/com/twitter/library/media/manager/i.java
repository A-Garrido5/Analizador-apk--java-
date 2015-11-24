// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import java.util.concurrent.ConcurrentHashMap;
import com.twitter.library.util.aa;

class i implements aa
{
    final /* synthetic */ ConcurrentHashMap a;
    final /* synthetic */ h b;
    
    i(final h b, final ConcurrentHashMap a) {
        this.b = b;
        this.a = a;
    }
    
    public void a(final String s) {
        this.a.remove(s);
    }
}
