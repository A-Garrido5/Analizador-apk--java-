// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

final class K
{
    private static final String[] z;
    private final int a;
    private final boolean b;
    private final List c;
    
    static {
        final String[] z2 = new String[2];
        String s = "Jp";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'x';
                        break;
                    }
                    case 0: {
                        c2 = '1';
                        break;
                    }
                    case 1: {
                        c2 = 'P';
                        break;
                    }
                    case 2: {
                        c2 = '9';
                        break;
                    }
                    case 3: {
                        c2 = '#';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "\u0011-";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    K(final List list, final int a, final boolean b) {
        this.c = new ArrayList(list);
        this.a = a;
        this.b = b;
    }
    
    int a() {
        return this.a;
    }
    
    boolean a(final List list) {
        return this.c.equals(list);
    }
    
    List b() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof K) {
            final K k = (K)o;
            if (this.c.equals(k.b()) && this.b == k.b) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.c.hashCode() ^ Boolean.valueOf(this.b).hashCode();
    }
    
    @Override
    public String toString() {
        return K.z[0] + this.c + K.z[1];
    }
}
