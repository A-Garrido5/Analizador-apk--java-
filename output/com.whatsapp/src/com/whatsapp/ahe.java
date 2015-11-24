// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import java.util.LinkedList;

public class ahe
{
    private int a;
    private LinkedList b;
    
    public ahe() {
        this.a = 0;
        this.b = new LinkedList();
    }
    
    public void a() {
        synchronized (this) {
            this.b.clear();
            this.a = 0;
        }
    }
    
    public void a(final byte[] array) {
        // monitorenter(this)
        if (array == null) {
            return;
        }
        try {
            this.b.addFirst(array);
        }
        finally {
        }
        // monitorexit(this)
    }
    
    public byte[] a(final int n) {
        while (true) {
            final boolean i = App.I;
        Label_0056_Outer:
            while (true) {
                while (true) {
                    synchronized (this) {
                        final Iterator iterator = this.b.iterator();
                        if (!iterator.hasNext()) {
                            this.a += n;
                            return new byte[n];
                        }
                        final byte[] array = iterator.next();
                        if (array.length >= n) {
                            iterator.remove();
                            return array;
                        }
                    }
                    if (i) {
                        continue;
                    }
                    break;
                }
                continue Label_0056_Outer;
            }
        }
    }
}
