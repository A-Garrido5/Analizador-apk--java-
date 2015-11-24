// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.d;
import java.util.Iterator;
import com.twitter.library.api.bp;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.provider.Tweet;
import java.util.List;

public class t extends u
{
    private final List a;
    private boolean e;
    private Tweet f;
    private List h;
    
    public t(final Context context, final Session session, final long n) {
        this(context, new ab(session), n);
    }
    
    public t(final Context context, final ab ab, final long n) {
        super(context, ab, n);
        this.a = new ArrayList();
        this.e = false;
    }
    
    private List t() {
        final HashSet<Object> set = new HashSet<Object>(this.h);
        if (this.f != null) {
            set.remove(this.f.Q);
        }
        final ArrayList list = new ArrayList<Comparable>(set);
        Collections.sort((List<Comparable>)list);
        final int size = list.size();
        return list.subList(size - Math.min(size, 10), size);
    }
    
    public t a(final Tweet f, final List list) {
        this.e = true;
        this.f = f;
        this.h = new ArrayList(list);
        return this;
    }
    
    @Override
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        final boolean j = httpOperation.j();
        super.a(httpOperation, aa, bg);
        if (j && this.e) {
            final ArrayList list = (ArrayList)bg.a();
            if (list.size() <= 10) {
                final Iterator<bp> iterator = list.iterator();
                while (iterator.hasNext()) {
                    this.h.add(iterator.next().a());
                }
                final s s = new s(this.p, this.P(), this.f, this.t());
                s.S();
                this.a.clear();
                this.a.addAll(s.b());
            }
        }
    }
    
    public List e() {
        return this.a;
    }
}
