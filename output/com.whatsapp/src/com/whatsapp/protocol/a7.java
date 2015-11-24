// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.util.Vector;
import java.util.Hashtable;

class a7 extends a
{
    private static final String[] z;
    final bf a;
    final String[] b;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u001f\u001a7\u00053";
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
                        c2 = 'i';
                        break;
                    }
                    case 1: {
                        c2 = '{';
                        break;
                    }
                    case 2: {
                        c2 = '[';
                        break;
                    }
                    case 3: {
                        c2 = 'p';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001c\b>\u0002";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u0003\u0012?";
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
    
    a7(final bf a, final String[] b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final int n) {
        bf.d(this.a).b(n);
    }
    
    @Override
    public void a(final c0 c0, final String s) {
        final int o = bi.O;
        final Hashtable<String, Vector<Object>> hashtable = new Hashtable<String, Vector<Object>>(this.b.length);
        int i = 0;
        while (i < this.b.length) {
            hashtable.put(this.b[i], new Vector<Object>());
            ++i;
            if (o != 0) {
                break;
            }
        }
        final c0 a = c0.a(0);
        if (a != null && a.d != null && a.d.length > 0) {
            int n;
            for (int j = 0; j < a.d.length; j = n) {
                final c0 c2 = a.d[j];
                c0.b(c2, a7.z[1]);
                final String d = c2.d(a7.z[2]);
                if (hashtable.containsKey(d)) {
                    final Vector<Object> vector = hashtable.get(d);
                    int k = 0;
                    while (k < c2.d.length) {
                        vector.addElement(new bm(c2.d[k].f, c2.d[k].d(a7.z[0])));
                        ++k;
                        if (o != 0) {
                            break;
                        }
                    }
                }
                n = j + 1;
                if (o != 0) {
                    break;
                }
            }
        }
        bf.d(this.a).b(hashtable);
    }
    
    @Override
    public void a(final Exception ex) {
        bf.d(this.a).a(ex);
    }
}
