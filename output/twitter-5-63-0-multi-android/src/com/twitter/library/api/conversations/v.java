// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import java.util.Collection;
import java.util.HashSet;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.Set;
import com.twitter.library.service.p;

public class v extends p
{
    private final String a;
    private final Set e;
    
    public v(final Context context, final Session session, final String a, final long[] array) {
        super(context, v.class.getName(), session);
        final long currentTimeMillis = System.currentTimeMillis();
        this.e = new HashSet(1 + array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            this.e.add(new ay(array[i], currentTimeMillis));
        }
        this.e.add(new ay(session.g(), currentTimeMillis));
        this.a = a;
    }
    
    @Override
    protected void a() {
        int n;
        if (this.e.size() > 2) {
            n = 1;
        }
        else {
            n = 0;
        }
        this.t().a(new u().a(n).a(this.e).b(this.a).c(0L).a(), false);
    }
}
