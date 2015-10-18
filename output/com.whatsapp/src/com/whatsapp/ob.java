// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;

class ob implements Runnable
{
    final dt a;
    
    ob(final dt a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        while (true) {
            final boolean i = App.I;
            final ArrayList<Map.Entry<K, Long>> list = new ArrayList<Map.Entry<K, Long>>();
        Label_0105_Outer:
            while (true) {
                while (true) {
                    synchronized (dt.c(this.a)) {
                        final Iterator<Map.Entry<K, Long>> iterator = dt.d(this.a).entrySet().iterator();
                        if (!iterator.hasNext()) {
                            // monitorexit(dt.c(this.a))
                            final Iterator<Map.Entry<K, Long>> iterator2 = list.iterator();
                            while (iterator2.hasNext()) {
                                final String s = (String)iterator2.next().getKey();
                                this.a.c(s);
                                final Iterator<gt> iterator3 = dt.a(this.a).iterator();
                                while (iterator3.hasNext()) {
                                    iterator3.next().a(s);
                                    App.d(s);
                                    if (i) {
                                        break;
                                    }
                                }
                                if (i) {
                                    break;
                                }
                            }
                            dt.b(this.a);
                            return;
                        }
                        final Map.Entry<K, Long> entry = iterator.next();
                        final Long n = entry.getValue();
                        if (n != 0L && n < System.currentTimeMillis()) {
                            list.add(entry);
                        }
                    }
                    if (i) {
                        continue;
                    }
                    break;
                }
                continue Label_0105_Outer;
            }
        }
    }
}
