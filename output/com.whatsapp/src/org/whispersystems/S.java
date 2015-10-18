// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import java.util.Collections;
import java.util.Set;

final class S extends R
{
    static final S b;
    private static final long serialVersionUID;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "mjF\u001ek;bYKoyxO\u0005z";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u000e';
                        break;
                    }
                    case 0: {
                        c2 = '\u001b';
                        break;
                    }
                    case 1: {
                        c2 = '\u000b';
                        break;
                    }
                    case 2: {
                        c2 = '*';
                        break;
                    }
                    case 3: {
                        c2 = 'k';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "nxOKaiE_\u0007b3\"\n\u0002`h\u007fO\nj;dLKo;X_\u001b~wbO\u0019.ocK\u001f.in^\u001e|ux\n\u0005{wg";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "T{^\u0002aujFEoyxO\u0005z3\"";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "nxOKaiE_\u0007b3\"\n\u0002`h\u007fO\nj;dLKai#D\u001ebw\"";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        b = new S();
    }
    
    private Object readResolve() {
        return S.b;
    }
    
    @Override
    public Object a(final n n) {
        return a8.a(n.a(), S.z[1]);
    }
    
    @Override
    public R a(final R r) {
        return (R)a8.a(r);
    }
    
    @Override
    public R a(final aU au) {
        a8.a(au);
        return R.a();
    }
    
    @Override
    public Object b() {
        return null;
    }
    
    @Override
    public Object c(final Object o) {
        return a8.a(o, S.z[3]);
    }
    
    @Override
    public boolean c() {
        return false;
    }
    
    @Override
    public Object d() {
        throw new IllegalStateException(S.z[0]);
    }
    
    @Override
    public Set e() {
        return Collections.emptySet();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this;
    }
    
    @Override
    public int hashCode() {
        return 1502476572;
    }
    
    @Override
    public String toString() {
        return S.z[2];
    }
}
