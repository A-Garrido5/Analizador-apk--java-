// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import java.util.Set;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import com.google.android.gms.internal.c;
import java.util.Map;
import java.util.List;

class bf
{
    private static final Object a;
    private static Long b;
    private static Double c;
    private static dh d;
    private static String e;
    private static Boolean f;
    private static List g;
    private static Map h;
    private static c i;
    
    static {
        a = null;
        bf.b = new Long(0L);
        bf.c = new Double(0.0);
        bf.d = dh.a(0L);
        bf.e = new String("");
        bf.f = new Boolean(false);
        bf.g = new ArrayList(0);
        bf.h = new HashMap();
        bf.i = c(bf.e);
    }
    
    public static c a() {
        return bf.i;
    }
    
    private static Boolean a(final String s) {
        if ("true".equalsIgnoreCase(s)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(s)) {
            return Boolean.FALSE;
        }
        return bf.f;
    }
    
    public static String a(final c c) {
        return a(c(c));
    }
    
    public static String a(final Object o) {
        if (o == null) {
            return bf.e;
        }
        return o.toString();
    }
    
    public static Boolean b(final c c) {
        return b(c(c));
    }
    
    public static Boolean b(final Object o) {
        if (o instanceof Boolean) {
            return (Boolean)o;
        }
        return a(a(o));
    }
    
    public static c c(final Object o) {
        boolean l = false;
        final c c = new c();
        if (o instanceof c) {
            return (c)o;
        }
        if (o instanceof String) {
            c.a = 1;
            c.b = (String)o;
        }
        else if (o instanceof List) {
            c.a = 2;
            final List list = (List)o;
            final ArrayList list2 = new ArrayList<c>(list.size());
            final Iterator<Object> iterator = list.iterator();
            boolean b = false;
            while (iterator.hasNext()) {
                final c c2 = c(iterator.next());
                if (c2 == bf.i) {
                    return bf.i;
                }
                final boolean b2 = b || c2.l;
                list2.add(c2);
                b = b2;
            }
            c.c = list2.toArray(new c[0]);
            l = b;
        }
        else if (o instanceof Map) {
            c.a = 3;
            final Set entrySet = ((Map)o).entrySet();
            final ArrayList list3 = new ArrayList<c>(entrySet.size());
            final ArrayList list4 = new ArrayList<c>(entrySet.size());
            final Iterator<Map.Entry<Object, V>> iterator2 = entrySet.iterator();
            boolean b3 = false;
            while (iterator2.hasNext()) {
                final Map.Entry<Object, V> entry = iterator2.next();
                final c c3 = c(entry.getKey());
                final c c4 = c(entry.getValue());
                if (c3 == bf.i || c4 == bf.i) {
                    return bf.i;
                }
                final boolean b4 = b3 || c3.l || c4.l;
                list3.add(c3);
                list4.add(c4);
                b3 = b4;
            }
            c.d = list3.toArray(new c[0]);
            c.e = list4.toArray(new c[0]);
            l = b3;
        }
        else if (d(o)) {
            c.a = 1;
            c.b = o.toString();
            l = false;
        }
        else if (e(o)) {
            c.a = 6;
            c.h = f(o);
            l = false;
        }
        else {
            if (!(o instanceof Boolean)) {
                final StringBuilder append = new StringBuilder().append("Converting to Value from unknown object type: ");
                String string;
                if (o == null) {
                    string = "null";
                }
                else {
                    string = o.getClass().toString();
                }
                z.a(append.append(string).toString());
                return bf.i;
            }
            c.a = 8;
            c.i = (boolean)o;
            l = false;
        }
        c.l = l;
        return c;
    }
    
    public static Object c(final c c) {
        int i = 0;
        if (c == null) {
            return bf.a;
        }
        switch (c.a) {
            default: {
                z.a("Failed to convert a value of type: " + c.a);
                return bf.a;
            }
            case 1: {
                return c.b;
            }
            case 2: {
                final ArrayList<Object> list = new ArrayList<Object>(c.c.length);
                for (c[] c2 = c.c; i < c2.length; ++i) {
                    final Object c3 = c(c2[i]);
                    if (c3 == bf.a) {
                        return bf.a;
                    }
                    list.add(c3);
                }
                return list;
            }
            case 3: {
                if (c.d.length != c.e.length) {
                    z.a("Converting an invalid value to object: " + c.toString());
                    return bf.a;
                }
                final HashMap<Object, Object> hashMap = new HashMap<Object, Object>(c.e.length);
                while (i < c.d.length) {
                    final Object c4 = c(c.d[i]);
                    final Object c5 = c(c.e[i]);
                    if (c4 == bf.a || c5 == bf.a) {
                        return bf.a;
                    }
                    hashMap.put(c4, c5);
                    ++i;
                }
                return hashMap;
            }
            case 4: {
                z.a("Trying to convert a macro reference to object");
                return bf.a;
            }
            case 5: {
                z.a("Trying to convert a function id to object");
                return bf.a;
            }
            case 6: {
                return c.h;
            }
            case 7: {
                final StringBuffer sb = new StringBuffer();
                for (c[] j = c.j; i < j.length; ++i) {
                    final String a = a(j[i]);
                    if (a == bf.e) {
                        return bf.a;
                    }
                    sb.append(a);
                }
                return sb.toString();
            }
            case 8: {
                return c.i;
            }
        }
    }
    
    private static boolean d(final Object o) {
        return o instanceof Double || o instanceof Float || (o instanceof dh && ((dh)o).a());
    }
    
    private static boolean e(final Object o) {
        return o instanceof Byte || o instanceof Short || o instanceof Integer || o instanceof Long || (o instanceof dh && ((dh)o).b());
    }
    
    private static long f(final Object o) {
        if (o instanceof Number) {
            return ((Number)o).longValue();
        }
        z.a("getInt64 received non-Number");
        return 0L;
    }
}
