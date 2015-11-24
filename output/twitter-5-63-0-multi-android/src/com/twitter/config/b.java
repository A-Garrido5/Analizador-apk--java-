// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Set;
import java.util.List;

public class b
{
    public static yv a;
    private static List b;
    private static Set c;
    private static long d;
    
    static {
        com.twitter.config.b.a = new yv("TestConfig");
        com.twitter.config.b.b = new CopyOnWriteArrayList();
        com.twitter.config.b.c = new HashSet();
    }
    
    public static float a(final long n, final String s, final float n2) {
        return ((Number)a(n, s, n2, Number.class)).floatValue();
    }
    
    public static int a(final long n, final String s, final int n2) {
        return ((Number)a(n, s, n2, Number.class)).intValue();
    }
    
    public static int a(final String s, final int n) {
        return a(com.twitter.config.b.d, s, n);
    }
    
    private static Object a(final long n, final String s, final Object o, final Class clazz) {
        return a(n, s, o, clazz, true);
    }
    
    private static Object a(final long n, final String s, final Object o, final Class clazz, final boolean b) {
        for (final c c : b.b) {
            try {
                final Object cast = clazz.cast(c.a(n, s, b));
                if (cast != null) {
                    return cast;
                }
                continue;
            }
            catch (Exception ex) {
                c.a("Error retrieving configuration value. Key: " + s, ex);
                continue;
            }
            break;
        }
        d(s);
        return o;
    }
    
    public static String a(final long n, final String s, final String s2) {
        return (String)a(n, s, s2, String.class);
    }
    
    public static String a(final String s, final String s2) {
        return a(com.twitter.config.b.d, s, s2);
    }
    
    public static ArrayList a(final long n, final String s, final ArrayList list) {
        return (ArrayList)a(n, s, list, ArrayList.class);
    }
    
    public static ArrayList a(final String s, final ArrayList list) {
        return a(com.twitter.config.b.d, s, list);
    }
    
    public static void a(final long d) {
        com.twitter.config.b.d = d;
    }
    
    public static void a(final c c) {
        com.twitter.config.b.a.a();
        com.twitter.config.b.b.add(c);
    }
    
    public static boolean a() {
        return !com.twitter.config.b.b.isEmpty();
    }
    
    public static boolean a(final long n, final String s, final boolean b) {
        return (boolean)a(n, s, b, Boolean.class);
    }
    
    public static boolean a(final String s) {
        return a(s, false);
    }
    
    public static boolean a(final String s, final boolean b) {
        return a(b.d, s, b);
    }
    
    public static String b(final String s) {
        return a(s, "");
    }
    
    public static String b(final String s, final String s2) {
        return (String)a(com.twitter.config.b.d, s, s2, String.class, false);
    }
    
    public static Object c(final String s) {
        return a(com.twitter.config.b.d, s, null, Object.class);
    }
    
    private static void d(final String s) {
        if (yw.b() && !com.twitter.config.b.c.contains(s)) {
            throw new IllegalStateException("Undefined configuration value for key " + s);
        }
    }
}
