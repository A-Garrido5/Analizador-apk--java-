// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.internal.android.service.a;
import com.twitter.library.client.as;
import com.twitter.internal.android.service.c;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.client.az;
import java.util.ArrayList;
import com.twitter.library.api.z;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.LruCache;
import android.content.Context;

public class q
{
    private static Context a;
    private LruCache b;
    private LongSparseArray c;
    
    public q() {
        this.b = new LruCache(250);
        this.c = new LongSparseArray();
    }
    
    static void a(final Context a) {
        q.a = a;
    }
    
    public void a(final long n, int a) {
        synchronized (this) {
            if (!z.a(a)) {
                final Integer n2 = (Integer)this.b.get(n);
                if (n2 != null) {
                    a = z.a(n2, a);
                }
                this.b(n, a);
            }
        }
    }
    
    public void a(final long n, final s s) {
        synchronized (this) {
            ArrayList<s> list = (ArrayList<s>)this.c.get(n);
            if (list == null) {
                list = new ArrayList<s>();
                this.c.put(n, list);
            }
            if (!list.contains(s)) {
                list.add(s);
            }
        }
    }
    
    public void a(final ArrayList list) {
        if (list != null && list.size() > 0) {
            final pp pp = new pp(q.a, az.a(q.a).b(), CollectionUtils.c(list));
            pp.a(new r(this));
            as.a(q.a).a((a)pp);
        }
    }
    
    public boolean a(final long n) {
        synchronized (this) {
            return this.b.get(n) != null;
        }
    }
    
    public int b(final long n) {
        synchronized (this) {
            final Integer n2 = (Integer)this.b.get(n);
            int intValue;
            if (n2 != null) {
                intValue = n2;
            }
            else {
                intValue = 128;
            }
            return intValue;
        }
    }
    
    public void b(final long n, final int n2) {
        synchronized (this) {
            this.b.put(n, n2);
            this.d(n, n2);
        }
    }
    
    public void b(final long n, final s s) {
        synchronized (this) {
            final ArrayList list = (ArrayList)this.c.get(n);
            if (list != null) {
                list.remove(s);
                if (list.isEmpty()) {
                    this.c.delete(n);
                }
            }
        }
    }
    
    public void c(final long n, final int n2) {
        synchronized (this) {
            final Integer n3 = (Integer)this.b.get(n);
            int intValue;
            if (n3 == null) {
                intValue = 0;
            }
            else {
                intValue = n3;
            }
            final int b = z.b(intValue, n2);
            this.b.put(n, b);
            this.d(n, b);
        }
    }
    
    protected void d(final long n, final int n2) {
        final ArrayList list = (ArrayList)this.c.get(n);
        if (list != null) {
            for (int i = -1 + list.size(); i >= 0; --i) {
                list.get(i).a(n, n2);
            }
        }
    }
}
