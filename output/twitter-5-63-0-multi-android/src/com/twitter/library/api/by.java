// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.util.Iterator;
import java.util.HashSet;
import java.util.ArrayList;
import com.twitter.library.provider.bg;
import com.twitter.library.client.az;
import com.twitter.library.client.Session;
import java.util.Collection;
import java.security.InvalidParameterException;
import java.util.List;
import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

public class by extends AsyncTaskLoader
{
    private final Context a;
    private final long[] b;
    private final String[] c;
    private List d;
    private long e;
    
    public by(final Context a, final long[] array) {
        super(a);
        this.a = a;
        this.b = (long[])a(array);
        this.c = null;
    }
    
    private static Object a(final Object o) {
        if (o == null) {
            throw new InvalidParameterException("Parameter cannot be null");
        }
        return o;
    }
    
    private List a(final Collection collection, final Collection collection2, final Session session) {
        final int n = collection2.size() + collection.size();
        if (n > 100) {
            throw new UnsupportedOperationException("Lookup users through API for more than one page is not supported in TwitterUsersLoader yet. Lookup requested: " + n + " Page limit: " + 100);
        }
        final qb b = new qb(this.a, session).a(collection).b(collection2);
        b.S();
        return b.e();
    }
    
    public List a() {
        final Session b = az.a(this.a).b();
        this.e = b.g();
        final bg a = bg.a(this.a, this.e);
        List list;
        if (this.b != null) {
            list = a.a(this.b);
        }
        else {
            list = a.a(this.c);
        }
        final ArrayList<Long> list2 = new ArrayList<Long>();
        if (this.b != null) {
            final HashSet<Long> set = new HashSet<Long>();
            final Iterator<TwitterUser> iterator = list.iterator();
            while (iterator.hasNext()) {
                set.add(iterator.next().a());
            }
            for (final long n : this.b) {
                if (!set.contains(n)) {
                    list2.add(n);
                }
            }
        }
        final ArrayList<String> list3 = new ArrayList<String>();
        if (this.c != null) {
            final HashSet<String> set2 = new HashSet<String>();
            final Iterator<TwitterUser> iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                set2.add(iterator2.next().username);
            }
            for (final String s : this.c) {
                if (!set2.contains(s)) {
                    list3.add(s);
                }
            }
        }
        if (list2.size() + list3.size() > 0) {
            list.addAll(this.a(list2, list3, b));
        }
        return list;
    }
    
    public void a(final List d) {
        if (!this.isReset() && this.isStarted()) {
            super.deliverResult(this.d = d);
        }
    }
    
    public void onReset() {
        super.onReset();
        this.onStopLoading();
        this.d = null;
    }
    
    @Override
    protected void onStartLoading() {
        if (this.d == null || this.e != az.a(this.a).b().g()) {
            this.forceLoad();
            return;
        }
        this.a(this.d);
    }
    
    @Override
    protected void onStopLoading() {
        this.cancelLoad();
    }
}
