// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.collection;

import java.util.Map;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.io.Serializable;
import java.util.Set;
import java.util.Comparator;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class CollectionUtils
{
    private static final ArrayList a;
    private static final HashMap b;
    
    static {
        a = new CollectionUtils$ImmutableArrayList();
        b = new CollectionUtils$EmptyHashMap((d)null);
    }
    
    public static int a(final List list, final Object o, final Comparator comparator) {
        int i = 0;
        int n;
        int n2;
        for (int size = list.size(); i != size; i = n2, size = n) {
            n = (i + size) / 2;
            if (comparator.compare(o, list.get(n)) < 0) {
                n2 = i;
            }
            else {
                final int n3 = n + 1;
                final int n4 = size;
                n2 = n3;
                n = n4;
            }
        }
        return i;
    }
    
    public static Serializable a(final Set set) {
        if (set == null || set instanceof Serializable) {
            return (Serializable)set;
        }
        return new HashSet<Object>(set);
    }
    
    public static Object a(final Iterable iterable) {
        if (iterable != null) {
            final Iterator<Object> iterator = iterable.iterator();
            if (iterator.hasNext()) {
                return iterator.next();
            }
        }
        return null;
    }
    
    public static Object a(final List list) {
        if (!a((Collection)list)) {
            return list.get(0);
        }
        return null;
    }
    
    public static ArrayList a() {
        return CollectionUtils.a;
    }
    
    public static List a(final long[] array) {
        if (array == null) {
            return Collections.emptyList();
        }
        final ArrayList<Long> list = new ArrayList<Long>(array.length);
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(array[i]);
        }
        return Collections.unmodifiableList((List<?>)list);
    }
    
    @SafeVarargs
    public static Set a(final Object... array) {
        return Collections.unmodifiableSet((Set<?>)new HashSet<Object>(Arrays.asList(array)));
    }
    
    public static boolean a(final Collection collection) {
        return collection == null || collection.isEmpty();
    }
    
    public static boolean a(final Map map) {
        return map == null || map.isEmpty();
    }
    
    public static boolean a(final int[] array, final int n) {
        final int length = array.length;
        int n2 = 0;
        boolean b;
        while (true) {
            b = false;
            if (n2 >= length) {
                break;
            }
            if (n == array[n2]) {
                b = true;
                break;
            }
            ++n2;
        }
        return b;
    }
    
    public static Serializable b(final List list) {
        if (list == null || list instanceof Serializable) {
            return (Serializable)list;
        }
        return new ArrayList<Object>(list);
    }
    
    public static Serializable b(final Map map) {
        if (map == null || map instanceof Serializable) {
            return (Serializable)map;
        }
        return new HashMap<Object, Object>(map);
    }
    
    public static Object b(final Iterable iterable) {
        Object next = null;
        if (iterable != null) {
            final Iterator<Object> iterator = iterable.iterator();
            while (iterator.hasNext()) {
                next = iterator.next();
            }
        }
        return next;
    }
    
    public static Object b(final Object[] array) {
        if (!c(array)) {
            return array[-1 + array.length];
        }
        return null;
    }
    
    public static void b(final List list, final Object o, final Comparator comparator) {
        list.add(a(list, o, comparator), o);
    }
    
    public static int[] b(final Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        final int[] array = new int[collection.size()];
        final Iterator<Integer> iterator = collection.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            array[n] = iterator.next();
            ++n;
        }
        return array;
    }
    
    public static boolean c(final Iterable iterable) {
        return iterable == null || !iterable.iterator().hasNext();
    }
    
    public static boolean c(final Object[] array) {
        return array == null || array.length == 0;
    }
    
    public static long[] c(final Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        final long[] array = new long[collection.size()];
        final Iterator<Long> iterator = collection.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            array[n] = iterator.next();
            ++n;
        }
        return array;
    }
    
    public static ArrayList d(final Object... array) {
        final ArrayList<Object> list = new ArrayList<Object>(array.length);
        Collections.addAll(list, array);
        return list;
    }
}
