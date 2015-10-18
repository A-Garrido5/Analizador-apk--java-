// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class pu
{
    public ConcurrentHashMap a;
    
    public pu() {
        this.a = new ConcurrentHashMap();
    }
    
    public int a(final int n) {
        final boolean k = a_9.k;
        final Iterator<wg> iterator = this.a.values().iterator();
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (true) {
            while (iterator.hasNext()) {
                int n5 = 0;
                int n6 = 0;
                int n7 = 0;
                switch (iterator.next().a()) {
                    default: {
                        n5 = n2;
                        n6 = n3;
                        n7 = n4;
                        break;
                    }
                    case 8: {
                        ++n2;
                    }
                    case 13: {
                        ++n3;
                    }
                    case 5: {
                        final int n8 = n4 + 1;
                        n5 = n2;
                        n6 = n3;
                        n7 = n8;
                        break;
                    }
                }
                if (k) {
                    if (n5 >= n) {
                        return 8;
                    }
                    if (n6 >= n) {
                        return 13;
                    }
                    if (n7 >= n) {
                        return 5;
                    }
                    return 4;
                }
                else {
                    n4 = n7;
                    n3 = n6;
                    n2 = n5;
                }
            }
            int n5 = n2;
            int n6 = n3;
            int n7 = n4;
            continue;
        }
    }
    
    public void a(final String s, final int n, final long a) {
        final boolean k = a_9.k;
        wg wg = this.a.get(s);
        if (wg == null) {
            wg = new wg();
            this.a.put(s, wg);
        }
        Label_0103: {
            switch (n) {
                case 8: {
                    wg.b = a;
                    if (k) {
                        break Label_0103;
                    }
                    break;
                }
                case 13: {
                    wg.c = a;
                    if (k) {
                        break Label_0103;
                    }
                    break;
                }
                case 5: {
                    wg.a = a;
                }
            }
        }
    }
}
