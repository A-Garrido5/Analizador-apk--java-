// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp;

import java.net.SocketException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.io.Closeable;
import java.util.ArrayList;

class e implements Runnable
{
    final /* synthetic */ d a;
    
    e(final d a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        while (true) {
            final ArrayList<c> list = new ArrayList<c>(2);
            int n = 0;
            while (true) {
                int n2 = 0;
                Label_0276: {
                    while (true) {
                        int n3 = 0;
                        Label_0270: {
                            Label_0264: {
                                Label_0258: {
                                    synchronized (this.a) {
                                        final ListIterator listIterator = this.a.d.listIterator(this.a.d.size());
                                        if (listIterator.hasPrevious()) {
                                            final c c = listIterator.previous();
                                            if (!c.d() || c.a(this.a.c)) {
                                                listIterator.remove();
                                                list.add(c);
                                                if (list.size() != 2) {
                                                    break Label_0264;
                                                }
                                            }
                                            else {
                                                if (c.g()) {
                                                    n2 = n + 1;
                                                    break Label_0276;
                                                }
                                                break Label_0264;
                                            }
                                        }
                                        final ListIterator listIterator2 = this.a.d.listIterator(this.a.d.size());
                                        if (listIterator2.hasPrevious() && n > this.a.b) {
                                            final c c2 = listIterator2.previous();
                                            if (c2.g()) {
                                                list.add(c2);
                                                listIterator2.remove();
                                                n3 = n - 1;
                                                break Label_0270;
                                            }
                                            break Label_0258;
                                        }
                                        else {
                                            // monitorexit(this.a)
                                            final Iterator<Object> iterator = list.iterator();
                                            while (iterator.hasNext()) {
                                                bf.a(iterator.next());
                                            }
                                        }
                                    }
                                    break;
                                }
                                n3 = n;
                                break Label_0270;
                            }
                            n2 = n;
                            break Label_0276;
                        }
                        n = n3;
                        continue;
                    }
                }
                n = n2;
                continue;
            }
        }
    }
}
