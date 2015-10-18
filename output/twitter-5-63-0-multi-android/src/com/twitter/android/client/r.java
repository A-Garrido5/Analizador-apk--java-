// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.internal.android.service.a;
import java.util.Iterator;
import java.util.Map;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class r extends z
{
    final /* synthetic */ q a;
    
    r(final q a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        if (((aa)y.l().b()).a()) {
            for (final Map.Entry<Long, V> entry : ((pp)y).e().entrySet()) {
                this.a.a(entry.getKey(), (int)entry.getValue());
            }
        }
    }
}
