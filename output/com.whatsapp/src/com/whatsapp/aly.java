// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import java.util.Collection;
import com.whatsapp.protocol.bm;
import java.util.Vector;
import java.util.Map;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Hashtable;

class aly implements Runnable
{
    private static final String[] z;
    final Hashtable a;
    final ie b;
    
    static {
        final String[] z2 = new String[3];
        String s = "V}a\u00063Cg]\u001d'Rtg";
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
                        c2 = 'J';
                        break;
                    }
                    case 0: {
                        c2 = '3';
                        break;
                    }
                    case 1: {
                        c2 = '\u0013';
                        break;
                    }
                    case 2: {
                        c2 = '\u0002';
                        break;
                    }
                    case 3: {
                        c2 = 't';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "E|k\u0004";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "V}a\u00063Cg]\u0002x";
                    n2 = 2;
                    array = z2;
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
    
    aly(final ie b, final Hashtable a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        final ArrayList<Pair> list = new ArrayList<Pair>(this.a.size());
        final ArrayList<Pair> list2 = new ArrayList<Pair>();
        final ArrayList<Pair> list3 = new ArrayList<Pair>();
        for (final Map.Entry<String, V> entry : this.a.entrySet()) {
            final String s = entry.getKey();
            for (final bm bm : (Vector)entry.getValue()) {
                Label_0250: {
                    if (aly.z[1].equals(bm.a)) {
                        list.add(new Pair((Object)s, (Object)ad6.fromText(bm.b)));
                        if (!i) {
                            break Label_0250;
                        }
                    }
                    if (aly.z[2].equals(bm.a)) {
                        list2.add(new Pair((Object)s, (Object)o7.fromText(bm.b)));
                        if (!i) {
                            break Label_0250;
                        }
                    }
                    if (aly.z[0].equals(bm.a)) {
                        list3.add(new Pair((Object)s, (Object)xk.fromText(bm.b)));
                    }
                }
                if (i) {
                    break;
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
        App.aq.a5().post((Runnable)new a68(this));
    }
}
