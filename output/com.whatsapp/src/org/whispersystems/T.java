// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import java.util.Collections;
import java.util.Set;

final class T extends R
{
    private static final long serialVersionUID;
    private static final String[] z;
    private final Object b;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0015\u007f\f\u0007%'b\u001f\u000475d\u0002\u0007v'x\u0003\n\"(b\u0003I5 c\u0003\u0006\"a\u007f\b\u001d#3cM\u0007#-aC";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'V';
                        break;
                    }
                    case 0: {
                        c2 = 'A';
                        break;
                    }
                    case 1: {
                        c2 = '\r';
                        break;
                    }
                    case 2: {
                        c2 = 'm';
                        break;
                    }
                    case 3: {
                        c2 = 'i';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u000e}\u0019\u00009/l\u0001G9'%";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "4~\bI93C\u0018\u0005:i$M\u000082y\b\b2ab\u000bI93%\u0003\u001c:-$";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    T(final Object b) {
        this.b = b;
    }
    
    @Override
    public Object a(final n n) {
        a8.a(n);
        return this.b;
    }
    
    @Override
    public R a(final R r) {
        a8.a(r);
        return this;
    }
    
    @Override
    public R a(final aU au) {
        final boolean a = R.a;
        final T t = new T(a8.a(au.a(this.b), T.z[0]));
        if (bO.s != 0) {
            boolean a2 = false;
            if (!a) {
                a2 = true;
            }
            R.a = a2;
        }
        return t;
    }
    
    @Override
    public Object b() {
        return this.b;
    }
    
    @Override
    public Object c(final Object o) {
        a8.a(o, T.z[2]);
        return this.b;
    }
    
    @Override
    public boolean c() {
        return true;
    }
    
    @Override
    public Object d() {
        return this.b;
    }
    
    @Override
    public Set e() {
        return Collections.singleton(this.b);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof T && this.b.equals(((T)o).b);
    }
    
    @Override
    public int hashCode() {
        return 1502476572 + this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final boolean a = R.a;
        final String string = T.z[1] + this.b + ")";
        if (a) {
            ++bO.s;
        }
        return string;
    }
}
