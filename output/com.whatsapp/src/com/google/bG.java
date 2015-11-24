// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.Method;

final class bG extends b3
{
    private static final String[] z;
    private final Method k;
    private final Method l;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "\u000eT.B\u00047S".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'a';
                    break;
                }
                case 0: {
                    c2 = 'x';
                    break;
                }
                case 1: {
                    c2 = '5';
                    break;
                }
                case 2: {
                    c2 = 'B';
                    break;
                }
                case 3: {
                    c2 = '7';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u001fP6a\u0000\u0014@'s\u0004\u000bV0^\u0011\fZ0".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'a';
                    break;
                }
                case 0: {
                    c4 = 'x';
                    break;
                }
                case 1: {
                    c4 = '5';
                    break;
                }
                case 2: {
                    c4 = 'B';
                    break;
                }
                case 3: {
                    c4 = '7';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
    }
    
    bG(final hg hg, final String s, final Class clazz, final Class clazz2) {
        super(hg, s, clazz, clazz2);
        this.l = dS.b(this.h, bG.z[0], new Class[] { dV.class });
        this.k = dS.b(this.h, bG.z[1], new Class[0]);
    }
    
    @Override
    public Object a(final dS ds, final int n) {
        return dS.a(this.k, super.a(ds, n), new Object[0]);
    }
    
    @Override
    public Object b(final dS ds) {
        final boolean b = dt.b;
        final ArrayList<Object> list = new ArrayList<Object>();
        final Iterator<Object> iterator = ((List)super.b(ds)).iterator();
        while (iterator.hasNext()) {
            list.add(dS.a(this.k, iterator.next(), new Object[0]));
            if (b) {
                break;
            }
        }
        return Collections.unmodifiableList((List<?>)list);
    }
    
    @Override
    public Object b(final fp fp) {
        final boolean b = dt.b;
        final ArrayList<Object> list = new ArrayList<Object>();
        final Iterator<Object> iterator = ((List)super.b(fp)).iterator();
        while (iterator.hasNext()) {
            list.add(dS.a(this.k, iterator.next(), new Object[0]));
            if (b) {
                break;
            }
        }
        return Collections.unmodifiableList((List<?>)list);
    }
    
    @Override
    public void b(final fp fp, final Object o) {
        super.b(fp, dS.a(this.l, null, new Object[] { o }));
    }
}
