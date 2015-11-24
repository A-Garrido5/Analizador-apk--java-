// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.util.HashMap;
import java.util.List;
import java.util.Collections;
import com.twitter.library.provider.bb;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class at implements ab
{
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final bp e;
    public final Conversation f;
    public final TwitterTopic g;
    public final TimelineScribeContent h;
    public final String i;
    public final Recap j;
    public final WhoToFollow k;
    public final Prompt l;
    public long m;
    public long n;
    public long o;
    private LinkedHashSet p;
    private LinkedHashSet q;
    private HashSet r;
    private Collection s;
    private h t;
    
    private at(final av av) {
        this.m = Long.MAX_VALUE;
        this.n = Long.MAX_VALUE;
        this.a = av.a;
        this.e = av.e;
        this.f = av.f;
        this.j = av.n;
        if (this.j != null) {
            this.j.a(this.a(), av.j, av.m);
        }
        this.k = av.p;
        this.g = av.g;
        this.b = av.b;
        this.c = av.c;
        this.i = av.k;
        this.d = av.d;
        this.m = Long.MAX_VALUE;
        this.o = av.h;
        this.h = av.i;
        if (this.e != null) {
            this.e.H = av.j;
            if (av.l != null) {
                if (this.e.F == null) {
                    this.e.F = (xb)new xc().a(av.l).f();
                }
                else {
                    this.e.F.f = av.l;
                }
            }
            this.e.I = av.m;
        }
        this.t = av.o;
        this.l = null;
    }
    
    private at(final String a, final int b, final int c, final long d, final bp e, final Conversation f, final TwitterTopic g, final Prompt l, final long o, final TimelineScribeContent h, final Recap j, final WhoToFollow k) {
        this.m = Long.MAX_VALUE;
        this.n = Long.MAX_VALUE;
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.b = b;
        this.c = c;
        this.d = d;
        this.o = o;
        this.h = h;
        this.i = null;
        this.j = j;
        this.l = l;
        this.k = k;
    }
    
    public at(final String s, final int n, final int n2, final bp bp, final long n3, final long n4, final TimelineScribeContent timelineScribeContent) {
        this(s, n, n2, n3, bp, null, null, null, n4, timelineScribeContent, null, null);
    }
    
    public at(final String s, final Conversation conversation, final long n, final long n2) {
        this(s, 2, 0, n, null, conversation, null, null, n2, null, null, null);
    }
    
    public at(final String s, final Prompt prompt, final long n, final long n2, final TimelineScribeContent timelineScribeContent) {
        this(s, 5, 0, n2, null, null, null, prompt, n, timelineScribeContent, null, null);
    }
    
    public at(final String s, final TwitterTopic twitterTopic, final long n, final TimelineScribeContent timelineScribeContent) {
        this(s, 3, 1, 0L, null, null, twitterTopic, null, n, timelineScribeContent, null, null);
    }
    
    public static at a(final bp bp) {
        return a(bp, 1, 0, 0L, bp.G);
    }
    
    public static at a(final bp bp, final int n, final int n2, final long n3, final long n4) {
        return new at(bp.b(), n, n2, bp, n3, n4, null);
    }
    
    public static ArrayList a(final Collection collection) {
        final ArrayList<at> list = new ArrayList<at>(collection.size());
        final Iterator<bp> iterator = collection.iterator();
        while (iterator.hasNext()) {
            list.add(a(iterator.next()));
        }
        return list;
    }
    
    public static boolean a(final int n, final int n2) {
        return n == 2 || n == 1 || n == 5 || (n == 7 && bb.o(n2));
    }
    
    @Override
    public long a() {
        if (this.e != null) {
            return this.e.a();
        }
        return this.a.hashCode();
    }
    
    @Override
    public String b() {
        return String.valueOf(this.a());
    }
    
    public PromotedContent c() {
        if (this.e != null) {
            return this.e.s;
        }
        if (this.f != null) {
            for (final bp bp : this.f.b) {
                if (bp.s != null) {
                    return bp.s;
                }
            }
        }
        return null;
    }
    
    public boolean d() {
        return "RecosTweet".equals(this.i);
    }
    
    public boolean e() {
        return "ItlTweet".equals(this.i);
    }
    
    public boolean f() {
        return "Moments".equals(this.i);
    }
    
    public Collection g() {
        while (true) {
            while (true) {
                final LinkedHashSet<Object> p;
                Label_0162: {
                    synchronized (this) {
                        if (this.p == null) {
                            p = new LinkedHashSet<Object>();
                            final HashSet<Long> r = new HashSet<Long>();
                            if (this.e != null) {
                                p.add(this.e);
                            }
                            else if (this.f != null) {
                                for (final bp bp : this.f.b) {
                                    p.add(bp);
                                    r.add(bp.a());
                                }
                            }
                            else {
                                if (this.g == null) {
                                    break Label_0162;
                                }
                                final ArrayList r2 = this.g.r();
                                if (r2 != null) {
                                    p.addAll(r2);
                                }
                            }
                            this.p = p;
                            this.r = r;
                        }
                        return this.p;
                    }
                }
                if (this.j != null) {
                    p.addAll(this.j.a);
                    continue;
                }
                if (this.t != null) {
                    p.addAll(this.t.b());
                    continue;
                }
                if (this.k != null) {
                    p.addAll(this.k.b);
                    continue;
                }
                continue;
            }
        }
    }
    
    public Collection h() {
        synchronized (this) {
            if (this.q == null) {
                final LinkedHashSet q = new LinkedHashSet();
                if (this.k != null) {
                    q.addAll(this.k.a);
                }
                this.q = q;
            }
            return this.q;
        }
    }
    
    public Collection i() {
        synchronized (this) {
            if (this.r == null) {
                this.g();
            }
            return this.r;
        }
    }
    
    public Collection j() {
        synchronized (this) {
            if (this.s == null) {
                List<TwitterTopic> emptyList;
                if (this.g != null) {
                    emptyList = new ArrayList<TwitterTopic>(1);
                    emptyList.add(this.g);
                }
                else {
                    emptyList = Collections.emptyList();
                }
                this.s = emptyList;
            }
            return this.s;
        }
    }
    
    public h k() {
        return this.t;
    }
}
