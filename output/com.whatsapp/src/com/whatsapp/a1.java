// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import java.util.Collection;
import com.whatsapp.protocol.bm;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Vector;
import com.whatsapp.protocol.cr;

class a1 implements Runnable
{
    private static final String[] z;
    final ie a;
    final cr b;
    final Vector c;
    
    static {
        final String[] z2 = new String[3];
        String s = "Ku%1\u001c^o\u0019*\bO|#";
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
                        c2 = 'e';
                        break;
                    }
                    case 0: {
                        c2 = '.';
                        break;
                    }
                    case 1: {
                        c2 = '\u001b';
                        break;
                    }
                    case 2: {
                        c2 = 'F';
                        break;
                    }
                    case 3: {
                        c2 = 'C';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Ku%1\u001c^o\u00195W";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "Xt/3";
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
    
    a1(final ie a, final Vector c, final cr b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        final ArrayList<Pair> list = new ArrayList<Pair>();
        final ArrayList<Pair> list2 = new ArrayList<Pair>();
        final ArrayList<Pair> list3 = new ArrayList<Pair>();
        for (final bm bm : this.c) {
            Label_0204: {
                if (a1.z[2].equals(bm.a)) {
                    list.add(new Pair((Object)this.b.a, (Object)ad6.fromText(bm.b)));
                    if (!i) {
                        break Label_0204;
                    }
                }
                if (a1.z[1].equals(bm.a)) {
                    list2.add(new Pair((Object)this.b.a, (Object)o7.fromText(bm.b)));
                    if (!i) {
                        break Label_0204;
                    }
                }
                if (a1.z[0].equals(bm.a)) {
                    list3.add(new Pair((Object)this.b.a, (Object)xk.fromText(bm.b)));
                }
            }
            if (i) {
                break;
            }
        }
        if (!list.isEmpty()) {
            App.S.d((Collection)list);
        }
        if (!list2.isEmpty()) {
            App.S.c((Collection)list2);
        }
        if (!list3.isEmpty()) {
            App.S.g(list3);
        }
        App.aq.a5().post((Runnable)new awh(this));
    }
}
