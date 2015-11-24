// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import com.twitter.util.l;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Map;

public class ay
{
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    @Deprecated
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Map i;
    public final String j;
    public final long k;
    public final boolean l;
    
    public ay(final String s) {
        final StringTokenizer stringTokenizer = new StringTokenizer(s, ",");
        this.a = a(stringTokenizer);
        this.b = a(stringTokenizer);
        this.c = a(stringTokenizer);
        this.d = Boolean.parseBoolean(stringTokenizer.nextToken());
        this.e = Boolean.parseBoolean(stringTokenizer.nextToken());
        this.f = Boolean.parseBoolean(stringTokenizer.nextToken());
        this.g = Boolean.parseBoolean(stringTokenizer.nextToken());
        this.h = Boolean.parseBoolean(stringTokenizer.nextToken());
        final int int1 = Integer.parseInt(stringTokenizer.nextToken());
        final HashMap i = new HashMap<String, String>(int1);
        for (int j = 0; j < int1; ++j) {
            i.put(stringTokenizer.nextToken(), stringTokenizer.nextToken());
        }
        this.i = i;
        if (stringTokenizer.hasMoreElements()) {
            this.j = a(stringTokenizer);
        }
        else {
            this.j = null;
        }
        if (stringTokenizer.hasMoreElements()) {
            this.k = Long.parseLong(stringTokenizer.nextToken());
        }
        else {
            this.k = 86400L;
        }
        boolean l = false;
        Label_0209: {
            if (stringTokenizer.hasMoreElements()) {
                final boolean boolean1 = Boolean.parseBoolean(stringTokenizer.nextToken());
                l = false;
                if (!boolean1) {
                    break Label_0209;
                }
            }
            l = true;
        }
        this.l = l;
    }
    
    public ay(final String s, final String s2, final String s3, final boolean d, final boolean e, final boolean f, final boolean g, final boolean h, final Map i, final String s4, final long k, final boolean l) {
        this.a = this.a(s);
        this.b = this.a(s2);
        this.c = this.a(s3);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = this.a(s4);
        this.k = k;
        this.l = l;
    }
    
    private String a(final String s) {
        if (s != null) {
            return s.replace("\r", "");
        }
        return null;
    }
    
    private static String a(final StringTokenizer stringTokenizer) {
        final int int1 = Integer.parseInt(stringTokenizer.nextToken());
        if (int1 > 0) {
            final StringBuilder sb = new StringBuilder(stringTokenizer.nextToken());
            while (sb.length() < int1) {
                sb.append(",").append(stringTokenizer.nextToken());
            }
            return sb.toString();
        }
        return null;
    }
    
    private static StringBuilder a(final StringBuilder sb, final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            sb.append(s.length()).append(",").append(s);
            return sb;
        }
        sb.append(0);
        return sb;
    }
    
    public static boolean a(final ay ay, final ay ay2) {
        boolean b;
        if (ay != null && ay.a()) {
            b = true;
        }
        else {
            b = false;
        }
        boolean b2;
        if (ay2 != null && ay2.a()) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        int n;
        if (ay != null && !ay.a(ay2)) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (b == b2) {
            boolean b3 = false;
            if (!b) {
                return b3;
            }
            b3 = false;
            if (n == 0) {
                return b3;
            }
        }
        return true;
    }
    
    public boolean a() {
        return this.d && this.h && this.c != null;
    }
    
    public boolean a(final ay ay) {
        return this.c != null && ay != null && this.c.equals(ay.c);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof ay)) {
                return false;
            }
            final ay ay = (ay)o;
            if (!this.a.equals(ay.a)) {
                return false;
            }
            if (!this.b.equals(ay.b)) {
                return false;
            }
            if (!this.c.equals(ay.c)) {
                return false;
            }
            if (this.d != ay.d) {
                return false;
            }
            if (this.f != ay.f) {
                return false;
            }
            if (this.e != ay.e) {
                return false;
            }
            if (this.g != ay.g) {
                return false;
            }
            if (this.h != ay.h) {
                return false;
            }
            if (!this.i.equals(ay.i)) {
                return false;
            }
            if (!this.j.equals(ay.j)) {
                return false;
            }
            if (this.k != ay.k) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return com.twitter.util.l.a(this.a, this.b, this.c, this.d, this.f, this.e, this.g, this.h, this.i, this.j, this.k);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        a(sb, this.a).append(",");
        a(sb, this.b).append(",");
        a(sb, this.c).append(",");
        sb.append(this.d).append(",").append(this.e).append(",").append(this.f).append(",").append(this.g).append(",").append(this.h).append(",");
        final Set<Map.Entry<String, V>> entrySet = (Set<Map.Entry<String, V>>)this.i.entrySet();
        sb.append(entrySet.size()).append(",");
        for (final Map.Entry<String, V> entry : entrySet) {
            sb.append(entry.getKey()).append(",").append((String)entry.getValue()).append(",");
        }
        a(sb, this.j).append(",");
        sb.append(this.k).append(",");
        sb.append(this.l).append(",");
        return sb.toString();
    }
}
