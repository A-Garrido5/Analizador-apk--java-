// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.util.Iterator;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public final class y
{
    static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    private static final Comparator f;
    
    static {
        f = new z();
        a = ba.a().b();
        b = y.a + "-Sent-Millis";
        c = y.a + "-Received-Millis";
        d = y.a + "-Response-Source";
        e = y.a + "-Selected-Protocol";
    }
    
    public static long a(final ab ab) {
        return a(ab.d());
    }
    
    public static long a(final ah ah) {
        return a(ah.g());
    }
    
    public static long a(final f f) {
        return a(f.a("Content-Length"));
    }
    
    private static long a(final String s) {
        if (s == null) {
            return -1L;
        }
        try {
            return Long.parseLong(s);
        }
        catch (NumberFormatException ex) {
            return -1L;
        }
    }
    
    private static String a(final List list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); ++i) {
            if (i > 0) {
                sb.append("; ");
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }
    
    public static Map a(final f f, final String s) {
        final TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>(y.f);
        for (int i = 0; i < f.a(); ++i) {
            final String a = f.a(i);
            final String b = f.b(i);
            final ArrayList<String> list = new ArrayList<String>();
            final List<Object> list2 = treeMap.get(a);
            if (list2 != null) {
                list.addAll((Collection<?>)list2);
            }
            list.add(b);
            treeMap.put(a, Collections.unmodifiableList((List<?>)list));
        }
        if (s != null) {
            treeMap.put(null, Collections.unmodifiableList((List<?>)Collections.singletonList((T)s)));
        }
        return Collections.unmodifiableMap((Map<?, ?>)treeMap);
    }
    
    public static void a(final ae ae, final Map map) {
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            final String s = entry.getKey();
            if (("Cookie".equalsIgnoreCase(s) || "Cookie2".equalsIgnoreCase(s)) && !((List)entry.getValue()).isEmpty()) {
                ae.b(s, a((List)entry.getValue()));
            }
        }
    }
}
