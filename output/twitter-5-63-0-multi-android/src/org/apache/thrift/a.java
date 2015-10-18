// 
// Decompiled by Procyon v0.5.30
// 

package org.apache.thrift;

import java.util.Collection;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.Comparator;

public final class a
{
    private static final Comparator a;
    
    static {
        a = new c(null);
    }
    
    public static int a(final byte b, final byte b2) {
        if (b < b2) {
            return -1;
        }
        if (b2 < b) {
            return 1;
        }
        return 0;
    }
    
    public static int a(final int n, final int n2) {
        if (n < n2) {
            return -1;
        }
        if (n2 < n) {
            return 1;
        }
        return 0;
    }
    
    public static int a(final long n, final long n2) {
        if (n < n2) {
            return -1;
        }
        if (n2 < n) {
            return 1;
        }
        return 0;
    }
    
    public static int a(final Comparable comparable, final Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }
    
    public static int a(final Object o, final Object o2) {
        if (o instanceof Comparable) {
            return a((Comparable)o, (Comparable)o2);
        }
        if (o instanceof List) {
            return a((List)o, (List)o2);
        }
        if (o instanceof Set) {
            return a((Set)o, (Set)o2);
        }
        if (o instanceof Map) {
            return a((Map)o, (Map)o2);
        }
        if (o instanceof byte[]) {
            return a((byte[])o, (byte[])o2);
        }
        throw new IllegalArgumentException("Cannot compare objects of type " + o.getClass());
    }
    
    public static int a(final String s, final String s2) {
        return s.compareTo(s2);
    }
    
    public static int a(final List list, final List list2) {
        final int a = a(list.size(), list2.size());
        if (a == 0) {
            int n = 0;
            int compare;
            while (true) {
                final int size = list.size();
                final int n2 = 0;
                if (n >= size) {
                    return n2;
                }
                compare = org.apache.thrift.a.a.compare(list.get(n), list2.get(n));
                if (compare != 0) {
                    break;
                }
                ++n;
            }
            return compare;
        }
        return a;
    }
    
    public static int a(final Map map, final Map map2) {
        final int a = a(map.size(), map2.size());
        if (a != 0) {
            return a;
        }
        final TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>(org.apache.thrift.a.a);
        treeMap.putAll(map);
        final Iterator<Map.Entry<Object, V>> iterator = treeMap.entrySet().iterator();
        final TreeMap<Object, Object> treeMap2 = new TreeMap<Object, Object>(org.apache.thrift.a.a);
        treeMap2.putAll(map2);
        final Iterator<Map.Entry<K, Object>> iterator2 = treeMap2.entrySet().iterator();
        while (iterator.hasNext() && iterator2.hasNext()) {
            final Map.Entry<Object, V> entry = iterator.next();
            final Map.Entry<K, Object> entry2 = iterator2.next();
            final int compare = org.apache.thrift.a.a.compare(entry.getKey(), entry2.getKey());
            if (compare != 0) {
                return compare;
            }
            final int compare2 = org.apache.thrift.a.a.compare(entry.getValue(), entry2.getValue());
            if (compare2 != 0) {
                return compare2;
            }
        }
        return 0;
    }
    
    public static int a(final Set set, final Set set2) {
        final int a = a(set.size(), set2.size());
        if (a != 0) {
            return a;
        }
        final TreeSet<Object> set3 = new TreeSet<Object>(org.apache.thrift.a.a);
        set3.addAll(set);
        final TreeSet<Object> set4 = new TreeSet<Object>(org.apache.thrift.a.a);
        set4.addAll(set2);
        final Iterator<Object> iterator = set3.iterator();
        final Iterator<Object> iterator2 = set4.iterator();
        while (iterator.hasNext() && iterator2.hasNext()) {
            final int compare = org.apache.thrift.a.a.compare(iterator.next(), iterator2.next());
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }
    
    public static int a(final short n, final short n2) {
        if (n < n2) {
            return -1;
        }
        if (n2 < n) {
            return 1;
        }
        return 0;
    }
    
    public static int a(final boolean b, final boolean b2) {
        return Boolean.valueOf(b).compareTo(Boolean.valueOf(b2));
    }
    
    public static int a(final byte[] array, final byte[] array2) {
        final int a = a(array.length, array2.length);
        if (a == 0) {
            int n = 0;
            int a2;
            while (true) {
                final int length = array.length;
                final int n2 = 0;
                if (n >= length) {
                    return n2;
                }
                a2 = a(array[n], array2[n]);
                if (a2 != 0) {
                    break;
                }
                ++n;
            }
            return a2;
        }
        return a;
    }
}
