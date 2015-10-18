// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.whatsapp.util.Log;

final class a6l implements Runnable
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "N-|ILK-Z\u001b@Q)BW@[\u007fLK\t[-LKYV1D\u0001\t";
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
                        c2 = ')';
                        break;
                    }
                    case 0: {
                        c2 = '?';
                        break;
                    }
                    case 1: {
                        c2 = '_';
                        break;
                    }
                    case 2: {
                        c2 = '#';
                        break;
                    }
                    case 3: {
                        c2 = ';';
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
                    s = "N-|ILK-Z\u001bFOe\u0003";
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
    
    @Override
    public void run() {
        while (true) {
            final boolean i = App.I;
        Label_0120_Outer:
            while (true) {
                while (true) {
                    Label_0136: {
                        synchronized (l7.s) {
                            final Iterator iterator = l7.s.iterator();
                            if (!iterator.hasNext()) {
                                l7.s.clear();
                                return;
                            }
                            final j1 j1 = iterator.next();
                            if (j1.a()) {
                                Log.i(a6l.z[1] + j1.toString());
                                j1.c();
                                if (!i) {
                                    break Label_0136;
                                }
                            }
                            Log.i(a6l.z[0] + j1.toString());
                        }
                    }
                    if (i) {
                        continue;
                    }
                    break;
                }
                continue Label_0120_Outer;
            }
        }
    }
}
