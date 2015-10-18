// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.IOException;
import java.util.Iterator;
import java.util.Collections;
import java.util.Map;

public final class ce implements ci
{
    private static final hZ b;
    private static final ce c;
    private static final String[] z;
    private Map a;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "fyI\u001dGYuA\u001dHR<O\u001b\u0006T<Y\rRP<Z\u0006TTe\u001b\u0000NGyLTG[<r;cM\u007f^\u0004R\\sUT\u000eFtT\u0001JQ<U\u0011PPn\u001b\u001cGEl^\u001a\u000f\u001b".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c2 = charArray[n];
            char c3 = '\0';
            switch (n % 5) {
                default: {
                    c3 = '&';
                    break;
                }
                case 0: {
                    c3 = '5';
                    break;
                }
                case 1: {
                    c3 = '\u001c';
                    break;
                }
                case 2: {
                    c3 = ';';
                    break;
                }
                case 3: {
                    c3 = 't';
                    break;
                }
            }
            charArray[n] = (char)(c3 ^ c2);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "fyI\u001dGYuA\u001dHR<O\u001b\u0006T<y\rRPOO\u0006O[{\u001b\u0000NGyLTG[<r;cM\u007f^\u0004R\\sUT\u000eFtT\u0001JQ<U\u0011PPn\u001b\u001cGEl^\u001a\u000f\u001b".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c4 = charArray2[n2];
            char c5 = '\0';
            switch (n2 % 5) {
                default: {
                    c5 = '&';
                    break;
                }
                case 0: {
                    c5 = '5';
                    break;
                }
                case 1: {
                    c5 = '\u001c';
                    break;
                }
                case 2: {
                    c5 = ';';
                    break;
                }
                case 3: {
                    c5 = 't';
                    break;
                }
            }
            charArray2[n2] = (char)(c5 ^ c4);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
        c = new ce(Collections.emptyMap());
        b = new hZ();
    }
    
    private ce() {
    }
    
    private ce(final Map a) {
        this.a = a;
    }
    
    ce(final Map map, final cv cv) {
        this(map);
    }
    
    static Map a(final ce ce) {
        return ce.a;
    }
    
    public static aY b(final ce ce) {
        return g().a(ce);
    }
    
    public static ce d() {
        return ce.c;
    }
    
    public static aY g() {
        return aY.f();
    }
    
    public int a() {
        final boolean b = dt.b;
        final Iterator<Map.Entry<K, am>> iterator = this.a.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<K, am> entry = iterator.next();
            final int n2 = n + entry.getValue().a((int)entry.getKey());
            if (b) {
                return n2;
            }
            n = n2;
        }
        return n;
    }
    
    public void a(final ep ep) {
        final boolean b = dt.b;
        for (final Map.Entry<K, am> entry : this.a.entrySet()) {
            entry.getValue().a((int)entry.getKey(), ep);
            if (b) {
                break;
            }
        }
    }
    
    @Override
    public byte[] a() {
        try {
            final byte[] array = new byte[this.getSerializedSize()];
            final ep b = ep.b(array);
            this.writeTo(b);
            b.a();
            return array;
        }
        catch (IOException ex) {
            throw new RuntimeException(ce.z[0], ex);
        }
    }
    
    public aY b() {
        return g();
    }
    
    @Override
    public hv b() {
        try {
            final ap a = hv.a(this.getSerializedSize());
            this.writeTo(a.b());
            return a.a();
        }
        catch (IOException ex) {
            throw new RuntimeException(ce.z[1], ex);
        }
    }
    
    public aY c() {
        return g().a(this);
    }
    
    public Map e() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            try {
                if (!(o instanceof ce)) {
                    return false;
                }
                final ce ce = this;
                final Map map = ce.a;
                final Object o2 = o;
                final ce ce2 = (ce)o2;
                final Map map2 = ce2.a;
                final boolean b = map.equals(map2);
                if (!b) {
                    return false;
                }
                return true;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final ce ce = this;
                final Map map = ce.a;
                final Object o2 = o;
                final ce ce2 = (ce)o2;
                final Map map2 = ce2.a;
                final boolean b = map.equals(map2);
                if (b) {
                    return true;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
            return false;
        }
        return true;
    }
    
    public final hZ f() {
        return ce.b;
    }
    
    @Override
    public ci getDefaultInstanceForType() {
        return this.h();
    }
    
    @Override
    public du getParserForType() {
        return this.f();
    }
    
    @Override
    public int getSerializedSize() {
        final boolean b = dt.b;
        final Iterator<Map.Entry<K, am>> iterator = this.a.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<K, am> entry = iterator.next();
            final int n2 = n + entry.getValue().b((int)entry.getKey());
            if (b) {
                return n2;
            }
            n = n2;
        }
        return n;
    }
    
    public ce h() {
        return ce.c;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public boolean isInitialized() {
        return true;
    }
    
    @Override
    public aJ newBuilderForType() {
        return this.b();
    }
    
    @Override
    public aJ toBuilder() {
        return this.c();
    }
    
    @Override
    public String toString() {
        return com.google.a.a(this);
    }
    
    @Override
    public void writeTo(final ep ep) {
        final boolean b = dt.b;
        for (final Map.Entry<K, am> entry : this.a.entrySet()) {
            entry.getValue().b((int)entry.getKey(), ep);
            if (b) {
                break;
            }
        }
    }
}
