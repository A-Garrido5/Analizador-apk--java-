// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import java.util.concurrent.CountedCompleter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Spliterator;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Contended;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.ToIntBiFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.ToLongBiFunction;
import java.util.function.DoubleBinaryOperator;
import java.util.function.ToDoubleBiFunction;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Enumeration;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.BiConsumer;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Set;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import sun.misc.Unsafe;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.concurrent.ConcurrentMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

public class d
{
    public static final Object a;
    static final String[] b;
    private static final Pattern c;
    private final ConcurrentHashMap d;
    private final Map e;
    private final ReentrantLock f;
    private final LinkedList g;
    private final i h;
    private final CountDownLatch i;
    
    static {
        a = new Object();
        b = "gtm.lifetime".toString().split("\\.");
        c = Pattern.compile("(\\d+)\\s*([smhd]?)");
    }
    
    d() {
        this(new e());
    }
    
    d(final i h) {
        this.h = h;
        this.d = new ConcurrentHashMap();
        this.e = new HashMap();
        this.f = new ReentrantLock();
        this.g = new LinkedList();
        this.i = new CountDownLatch(1);
        this.a();
    }
    
    static Long a(final String s) {
        final Matcher matcher = d.c.matcher(s);
        if (!matcher.matches()) {
            z.c("unknown _lifetime: " + s);
            return null;
        }
        long long1;
        while (true) {
            try {
                long1 = Long.parseLong(matcher.group(1));
                if (long1 <= 0L) {
                    z.c("non-positive _lifetime: " + s);
                    return null;
                }
            }
            catch (NumberFormatException ex) {
                z.b("illegal number in _lifetime value: " + s);
                long1 = 0L;
                continue;
            }
            break;
        }
        final String group = matcher.group(2);
        if (group.length() == 0) {
            return long1;
        }
        switch (group.charAt(0)) {
            default: {
                z.b("unknown units in _lifetime: " + s);
                return null;
            }
            case 's': {
                return long1 * 1000L;
            }
            case 'm': {
                return 60L * (long1 * 1000L);
            }
            case 'h': {
                return 60L * (60L * (long1 * 1000L));
            }
            case 'd': {
                return 24L * (60L * (60L * (long1 * 1000L)));
            }
        }
    }
    
    private void a() {
        this.h.a(new f(this));
    }
    
    private void a(final Map map, final String s, final Collection collection) {
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            final StringBuilder append = new StringBuilder().append(s);
            String s2;
            if (s.length() == 0) {
                s2 = "";
            }
            else {
                s2 = ".";
            }
            final String string = append.append(s2).append(entry.getKey()).toString();
            if (entry.getValue() instanceof Map) {
                this.a((Map)entry.getValue(), string, collection);
            }
            else {
                if (string.equals("gtm.lifetime")) {
                    continue;
                }
                collection.add(new g(string, entry.getValue()));
            }
        }
    }
    
    private void b() {
        int n = 0;
        while (true) {
            final Map map = this.g.poll();
            if (map == null) {
                return;
            }
            this.g(map);
            final int n2 = n + 1;
            if (n2 > 500) {
                this.g.clear();
                throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
            }
            n = n2;
        }
    }
    
    private void b(final Map map) {
        this.f.lock();
        try {
            this.g.offer(map);
            if (this.f.getHoldCount() == 1) {
                this.b();
            }
            this.c(map);
        }
        finally {
            this.f.unlock();
        }
    }
    
    private void c(final Map map) {
        final Long d = this.d(map);
        if (d == null) {
            return;
        }
        final List f = this.f(map);
        f.remove("gtm.lifetime");
        this.h.a(f, d);
    }
    
    private Long d(final Map map) {
        final Object e = this.e(map);
        if (e == null) {
            return null;
        }
        return a(e.toString());
    }
    
    private Object e(final Map map) {
        final String[] b = com.google.android.gms.tagmanager.d.b;
        final int length = b.length;
        int i = 0;
        Object o = map;
        while (i < length) {
            final String s = b[i];
            if (!(o instanceof Map)) {
                o = null;
                break;
            }
            final Object value = ((Map<K, Object>)o).get(s);
            ++i;
            o = value;
        }
        return o;
    }
    
    private List f(final Map map) {
        final ArrayList list = new ArrayList();
        this.a(map, "", list);
        return list;
    }
    
    private void g(final Map map) {
        synchronized (this.e) {
            for (final String s : map.keySet()) {
                this.a(this.a(s, map.get(s)), this.e);
            }
        }
        // monitorexit(map2)
        this.h(map);
    }
    
    private void h(final Map map) {
        final Iterator iterator = this.d.keySet().iterator();
        while (iterator.hasNext()) {
            iterator.next().a(map);
        }
    }
    
    Map a(final String s, final Object o) {
        final HashMap<String, Map<String, Object>> hashMap = new HashMap<String, Map<String, Object>>();
        final String[] split = s.toString().split("\\.");
        int i = 0;
        Object o2 = hashMap;
        while (i < -1 + split.length) {
            final HashMap<String, Map<String, Object>> hashMap2 = new HashMap<String, Map<String, Object>>();
            ((Map<String, Map<String, Object>>)o2).put(split[i], (Map<String, Object>)hashMap2);
            ++i;
            o2 = hashMap2;
        }
        ((Map<String, Map<String, Object>>)o2).put(split[-1 + split.length], (Map<String, Object>)o);
        return hashMap;
    }
    
    void a(final h h) {
        this.d.put(h, 0);
    }
    
    void a(final List list, final List list2) {
        while (list2.size() < list.size()) {
            list2.add(null);
        }
        for (int i = 0; i < list.size(); ++i) {
            final ArrayList value = list.get(i);
            if (value instanceof List) {
                if (!(list2.get(i) instanceof List)) {
                    list2.set(i, new ArrayList());
                }
                this.a(value, (List)list2.get(i));
            }
            else if (value instanceof Map) {
                if (!(list2.get(i) instanceof Map)) {
                    list2.set(i, new HashMap());
                }
                this.a((Map)value, list2.get(i));
            }
            else if (value != com.google.android.gms.tagmanager.d.a) {
                list2.set(i, value);
            }
        }
    }
    
    public void a(final Map map) {
        while (true) {
            try {
                this.i.await();
                this.b(map);
            }
            catch (InterruptedException ex) {
                z.b("DataLayer.push: unexpected InterruptedException");
                continue;
            }
            break;
        }
    }
    
    void a(final Map map, final Map map2) {
        for (final String s : map.keySet()) {
            final V value = map.get(s);
            if (value instanceof List) {
                if (!(map2.get(s) instanceof List)) {
                    map2.put(s, new ArrayList());
                }
                this.a((List)value, map2.get(s));
            }
            else if (value instanceof Map) {
                if (!(map2.get(s) instanceof Map)) {
                    map2.put(s, new HashMap());
                }
                this.a((Map)value, (Map)map2.get(s));
            }
            else {
                map2.put(s, value);
            }
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb;
        synchronized (this.e) {
            sb = new StringBuilder();
            for (final Map.Entry<Object, V> entry : this.e.entrySet()) {
                sb.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", entry.getKey(), entry.getValue()));
            }
        }
        // monitorexit(map)
        return sb.toString();
    }
}
