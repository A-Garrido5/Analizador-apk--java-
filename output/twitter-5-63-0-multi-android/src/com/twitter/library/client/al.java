// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import android.util.Log;
import com.twitter.errorreporter.a;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.util.error.LeakedResourceErrorLog;
import java.util.Collections;
import com.twitter.library.util.bk;
import java.util.WeakHashMap;
import com.twitter.library.util.ReferenceList;
import java.util.concurrent.atomic.AtomicInteger;

public class al
{
    private final AtomicInteger a;
    private final ReferenceList b;
    private final WeakHashMap c;
    private final long d;
    private final long e;
    private final int f;
    private long g;
    private am h;
    
    public al(final long d, final long e, final int f) {
        this.a = new AtomicInteger();
        this.b = ReferenceList.a();
        this.c = new WeakHashMap();
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    private void e() {
        final long a = bk.a();
        if (this.c.size() >= this.f && a - this.g > this.d) {
            List list = Collections.EMPTY_LIST;
            synchronized (this.c) {
                if (this.c.size() >= this.f) {
                    list = this.d();
                }
                // monitorexit(this.c)
                if (list.size() < this.f) {
                    return;
                }
                this.g = a;
                ErrorReporter.a(new LeakedResourceErrorLog(list));
                if (App.a()) {
                    final Iterator<Object> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        Log.e("LifecycleTracker", iterator.next().getClass().getSimpleName());
                    }
                }
            }
            if (this.h != null) {
                this.h.a(list);
            }
        }
    }
    
    public int a() {
        return this.a.get();
    }
    
    public void a(final am h) {
        this.h = h;
    }
    
    public void a(final Object o) {
        this.a.incrementAndGet();
        synchronized (this.b) {
            this.b.b(o);
        }
    }
    
    public List b() {
        final ArrayList<Object> list = new ArrayList<Object>(this.b.c());
        synchronized (this.b) {
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next());
            }
        }
        // monitorexit(list2)
        return list;
    }
    
    public void b(final Object o) {
        final ReferenceList b = this.b;
        synchronized (b) {
            this.b.c(o);
            // monitorexit(b)
            final WeakHashMap c = this.c;
            // monitorenter(c)
            final al al = this;
            al.e();
            final al al2 = this;
            final WeakHashMap weakHashMap = al2.c;
            final Object o2 = o;
            final long n = bk.a();
            final Long n2 = n;
            weakHashMap.put(o2, n2);
            return;
        }
        try {
            final al al = this;
            al.e();
            final al al2 = this;
            final WeakHashMap weakHashMap = al2.c;
            final Object o2 = o;
            final long n = bk.a();
            final Long n2 = n;
            weakHashMap.put(o2, n2);
        }
        finally {
        }
        // monitorexit(c)
    }
    
    public List c() {
        final int size = this.c.size();
        if (size == 0) {
            return Collections.EMPTY_LIST;
        }
        final ArrayList list = new ArrayList<Object>(size);
        synchronized (this.c) {
            final Iterator<Object> iterator = this.c.keySet().iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next());
            }
        }
        // monitorexit(weakHashMap)
        return list;
    }
    
    public List d() {
        final int size = this.c.size();
        Object empty_LIST;
        if (size == 0) {
            empty_LIST = Collections.EMPTY_LIST;
        }
        else {
            while (true) {
                empty_LIST = null;
                while (true) {
                    List list = null;
                    Label_0154: {
                        Label_0151: {
                            while (true) {
                                synchronized (this.c) {
                                    final Iterator<Map.Entry<K, Long>> iterator = this.c.entrySet().iterator();
                                    if (iterator.hasNext()) {
                                        final Map.Entry<K, Long> entry = iterator.next();
                                        final long longValue = entry.getValue();
                                        final K key = entry.getKey();
                                        if (bk.a() - longValue <= this.e) {
                                            break Label_0151;
                                        }
                                        if (empty_LIST == null) {
                                            list = new ArrayList<Object>(size);
                                            list.add(key);
                                            break Label_0154;
                                        }
                                    }
                                    else {
                                        // monitorexit(this.c)
                                        if (empty_LIST == null) {
                                            return Collections.EMPTY_LIST;
                                        }
                                        break;
                                    }
                                }
                                list = (List)empty_LIST;
                                continue;
                            }
                        }
                        list = (List)empty_LIST;
                    }
                    empty_LIST = list;
                    continue;
                }
            }
        }
        return (List)empty_LIST;
    }
}
