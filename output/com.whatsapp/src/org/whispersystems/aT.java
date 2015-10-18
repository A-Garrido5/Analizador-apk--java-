// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class aT
{
    public static boolean a;
    private static final String[] z;
    private List b;
    
    static {
        final String[] z2 = new String[2];
        String s = "4)$b\r\u0003fw}\t\u000e#$`\u0006Z4aj\u0007\b\"%";
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
                        c2 = 'h';
                        break;
                    }
                    case 0: {
                        c2 = 'z';
                        break;
                    }
                    case 1: {
                        c2 = 'F';
                        break;
                    }
                    case 2: {
                        c2 = '\u0004';
                        break;
                    }
                    case 3: {
                        c2 = '\t';
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
                    s = "4)$b\r\u00035$o\u0007\b|$";
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
    
    public aT() {
        this.b = new LinkedList();
    }
    
    public aT(final byte[] array) {
        final boolean a = aT.a;
        this.b = new LinkedList();
        final Iterator<af> iterator = an.a(array).i().iterator();
        while (iterator.hasNext()) {
            this.b.add(new X(iterator.next()));
            if (a) {
                break;
            }
        }
    }
    
    public X a(final int n) {
        final boolean a = aT.a;
        for (final X x : this.b) {
            if (x.b() == n) {
                return x;
            }
            if (a) {
                break;
            }
        }
        throw new aW(aT.z[1] + n);
    }
    
    public void a(final int n, final int n2, final byte[] array, final ak ak) {
        this.b.add(new X(n, n2, array, ak));
    }
    
    public void a(final int n, final int n2, final byte[] array, final w w) {
        this.b.clear();
        this.b.add(new X(n, n2, array, w));
    }
    
    public boolean a() {
        return this.b.isEmpty();
    }
    
    public X b() {
        if (!this.b.isEmpty()) {
            return this.b.get(0);
        }
        throw new aW(aT.z[0]);
    }
    
    public byte[] c() {
        final boolean a = aT.a;
        final aX l = an.l();
        final Iterator<X> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            l.a(iterator.next().c());
            if (a) {
                break;
            }
        }
        return l.g().a();
    }
}
