// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.whatsapp.util.Log;
import android.text.TextUtils;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class z8
{
    private static final Comparator a;
    private static final oi b;
    private static final ArrayList c;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[7];
        String s = "1s\\\u001a-\u0015rO\u00068";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c2 = charArray[n3];
                char c3 = '\0';
                switch (n3 % 5) {
                    default: {
                        c3 = 'L';
                        break;
                    }
                    case 0: {
                        c3 = 'q';
                        break;
                    }
                    case 1: {
                        c3 = '\u0011';
                        break;
                    }
                    case 2: {
                        c3 = '.';
                        break;
                    }
                    case 3: {
                        c3 = 'u';
                        break;
                    }
                }
                charArray[n3] = (char)(c3 ^ c2);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "1s\\\u001a-\u0015rO\u00068";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0010uJ2>\u001ed^6$\u0010em\u001a\"\u0005pM\u0001";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0012~@\u0003)\u0003bO\u0001%\u001e\u007f\u0001\u0006)\u001fuI\u001086cA\u0000<8\u007fH\u001avQ";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0012~@\u0003!\u0016c\u0001\u0012)\u0005rA\u001b:\u0014c]\u00148\u0018~@\u0016#\u001feO\u00168^v\\\u001a9\u0001rF\u00148^r\\\u0010-\u0005t\u0003\u0016#\u001feO\u00168Q";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "Q<\u0010U";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0012~@\u0003)\u0003bO\u0001%\u001e\u007f]\u0018+\u0003>\\\u0010<\u001dpM\u0010/\u001e\u007fZ\u0014/\u0005+";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        c = new ArrayList();
        b = new o1();
        a = new wa();
    }
    
    public static int a() {
        synchronized (z8.c) {
            return z8.c.size();
        }
    }
    
    private static int a(final n4 n4) {
        return Collections.binarySearch(z8.c, n4, z8.a);
    }
    
    public static a_9 a(final String s) {
        a_9 a_9;
        if (!adc.b(s)) {
            a_9 = App.S.e(s);
        }
        else {
            a_9 = App.S.c(s);
            if (a_9 != null) {
                if ((a_9.r() || TextUtils.isEmpty((CharSequence)a_9.m)) && !a_9.o()) {
                    Log.e(z8.z[3] + a_9.u);
                    App.c(s);
                    return a_9;
                }
            }
            else {
                Log.e(z8.z[4] + s);
                a_9 = new a_9(s);
                App.S.m(a_9);
                if (!com.whatsapp.a_9.c(s)) {
                    App.c(s);
                    return a_9;
                }
            }
        }
        return a_9;
    }
    
    public static a_9 a(final String s, final String t, final long n) {
        Log.i(z8.z[2]);
        final a_9 a_9 = new a_9(s);
        a_9.t = t;
        a_9.m = Long.toString(n);
        App.S.i(a_9);
        return a_9;
    }
    
    public static void a(final String s, final String s2, final String s3) {
        Log.i(z8.z[6] + s + z8.z[5] + s2);
        synchronized (z8.c) {
            n4 d = d(s);
            if (d == null) {
                d = new n4(null);
                d.a = s2;
            }
            z8.c.remove(d);
            d.a = s2;
            z8.c.add(0, d);
        }
    }
    
    public static ArrayList b() {
        while (true) {
            final boolean i = App.I;
            final ArrayList<String> list = new ArrayList<String>(z8.c.size());
            while (true) {
                synchronized (z8.c) {
                    final Iterator<n4> iterator = (Iterator<n4>)z8.c.iterator();
                    if (!iterator.hasNext()) {
                        return list;
                    }
                    final n4 n4 = iterator.next();
                    if (!App.ak.n(n4.a)) {
                        list.add(n4.a);
                    }
                }
                if (i) {
                    return list;
                }
                continue;
            }
        }
    }
    
    public static boolean b(final String s) {
        return d(s) != null;
    }
    
    public static int c() {
    Label_0074_Outer:
        while (true) {
            final boolean i = App.I;
            int n = 0;
            while (true) {
                int n2 = 0;
                Label_0092: {
                Label_0080:
                    while (true) {
                        synchronized (z8.c) {
                            final Iterator<n4> iterator = (Iterator<n4>)z8.c.iterator();
                            if (!iterator.hasNext()) {
                                return n;
                            }
                            if (App.ak.n(iterator.next().a)) {
                                n2 = n + 1;
                                break Label_0092;
                            }
                            break Label_0080;
                        }
                        n = n2;
                        continue Label_0074_Outer;
                    }
                    n2 = n;
                    break Label_0092;
                    n2 = n;
                    return n2;
                }
                if (i) {
                    return n2;
                }
                continue;
            }
        }
    }
    
    private static boolean c(final String a) {
        while (true) {
            synchronized (z8.c) {
                n4 d = d(a);
                if (d == null) {
                    d = new n4(null);
                    d.a = a;
                }
                d.b = App.ak.m(a);
                final int e = e(a);
                final int a2 = a(d);
                z8.c.add(-1 + -a2, d);
                if (-1 + -a2 != e) {
                    return true;
                }
            }
            return false;
        }
    }
    
    private static n4 d(final String s) {
        while (true) {
            final boolean i = App.I;
        Label_0057_Outer:
            while (true) {
                while (true) {
                    synchronized (z8.c) {
                        final Iterator<n4> iterator = (Iterator<n4>)z8.c.iterator();
                        if (!iterator.hasNext()) {
                            return null;
                        }
                        final n4 n4 = iterator.next();
                        if (n4.a.equals(s)) {
                            return n4;
                        }
                    }
                    if (i) {
                        continue;
                    }
                    break;
                }
                continue Label_0057_Outer;
            }
        }
    }
    
    public static ArrayList d() {
        while (true) {
            final boolean i = App.I;
            final ArrayList<String> list = new ArrayList<String>(z8.c.size());
            while (true) {
                synchronized (z8.c) {
                    final Iterator<n4> iterator = (Iterator<n4>)z8.c.iterator();
                    if (!iterator.hasNext()) {
                        return list;
                    }
                    final n4 n4 = iterator.next();
                    if (App.ak.n(n4.a)) {
                        list.add(n4.a);
                    }
                }
                if (i) {
                    return list;
                }
                continue;
            }
        }
    }
    
    private static int e(final String s) {
        final boolean i = App.I;
        int n = -1;
        final ArrayList c = z8.c;
        // monitorenter(c)
        int n2 = 0;
    Label_0075_Outer:
        while (true) {
            while (true) {
                int n3 = 0;
                Label_0093: {
                    Label_0081: {
                        try {
                            if (n2 >= z8.c.size()) {
                                return n;
                            }
                            if (((n4)z8.c.get(n2)).a.equals(s)) {
                                z8.c.remove(n2);
                                n3 = n2;
                                break Label_0093;
                            }
                            break Label_0081;
                        }
                        finally {
                        }
                        // monitorexit(c)
                        n = n3;
                        continue Label_0075_Outer;
                    }
                    n3 = n;
                    break Label_0093;
                    n3 = n;
                    return n3;
                }
                ++n2;
                if (i) {
                    return n3;
                }
                continue;
            }
        }
    }
    
    public static void e() {
        App.ak.a(z8.b);
    }
    
    public static boolean f() {
        while (true) {
            final boolean i = App.I;
            while (true) {
                synchronized (z8.c) {
                    final Iterator<n4> iterator = (Iterator<n4>)z8.c.iterator();
                    if (!iterator.hasNext()) {
                        return false;
                    }
                    if (adc.b(iterator.next().a)) {
                        return true;
                    }
                }
                if (i) {
                    return false;
                }
                continue;
            }
        }
    }
    
    static boolean f(final String s) {
        return c(s);
    }
    
    static int g(final String s) {
        return e(s);
    }
    
    public static String g() {
        final boolean i = App.I;
        long n = System.currentTimeMillis() / 1000L;
        synchronized (z8.c) {
            while (b(Long.toString(n) + z8.z[1])) {
                ++n;
                if (i) {
                    break;
                }
            }
            // monitorexit(z8.c)
            return Long.toString(n) + z8.z[0];
        }
    }
    
    public static int h() {
    Label_0074_Outer:
        while (true) {
            final boolean i = App.I;
            int n = 0;
            while (true) {
                int n2 = 0;
                Label_0092: {
                Label_0080:
                    while (true) {
                        synchronized (z8.c) {
                            final Iterator<n4> iterator = (Iterator<n4>)z8.c.iterator();
                            if (!iterator.hasNext()) {
                                return n;
                            }
                            if (!App.ak.n(iterator.next().a)) {
                                n2 = n + 1;
                                break Label_0092;
                            }
                            break Label_0080;
                        }
                        n = n2;
                        continue Label_0074_Outer;
                    }
                    n2 = n;
                    break Label_0092;
                    n2 = n;
                    return n2;
                }
                if (i) {
                    return n2;
                }
                continue;
            }
        }
    }
    
    public static void i() {
        synchronized (z8.c) {
            z8.c.clear();
        }
    }
    
    public static ArrayList j() {
        final boolean i = App.I;
        synchronized (z8.c) {
            final ArrayList<String> list = new ArrayList<String>(z8.c.size());
            final Iterator<n4> iterator = z8.c.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().a);
                if (i) {
                    break;
                }
            }
            return list;
        }
    }
    
    public static void k() {
        App.s.a();
    }
}
