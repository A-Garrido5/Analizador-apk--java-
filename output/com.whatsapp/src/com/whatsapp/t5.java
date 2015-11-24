// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Map;
import java.util.Collection;
import com.whatsapp.protocol.bi;
import java.util.Iterator;
import android.database.Observable;

final class t5 extends Observable
{
    private t5() {
    }
    
    t5(final hs hs) {
        this();
    }
    
    public void a() {
        final boolean k = a_9.k;
        final Iterator<sj> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
            if (k) {
                break;
            }
        }
    }
    
    public void a(final bi bi) {
        final boolean k = a_9.k;
        final Iterator<sj> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().b(bi);
            if (k) {
                break;
            }
        }
    }
    
    public void a(final bi bi, final int n) {
        final boolean k = a_9.k;
        final Iterator<sj> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(bi, n);
            if (k) {
                break;
            }
        }
    }
    
    public void a(final bi bi, final boolean b) {
        final boolean k = a_9.k;
        final Iterator<sj> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(bi, b);
            if (k) {
                break;
            }
        }
    }
    
    public void a(final String s) {
        final boolean k = a_9.k;
        final Iterator<sj> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(s);
            if (k) {
                break;
            }
        }
    }
    
    public void a(final Collection collection, final Map map) {
        final boolean k = a_9.k;
        final Iterator<sj> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(collection, map);
            if (k) {
                break;
            }
        }
    }
    
    public void b(final bi bi) {
        final boolean k = a_9.k;
        final Iterator<sj> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().c(bi);
            if (k) {
                break;
            }
        }
    }
    
    public void b(final bi bi, final int n) {
        final boolean k = a_9.k;
        final Iterator<sj> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().b(bi, n);
            if (k) {
                break;
            }
        }
    }
    
    public void c(final bi bi) {
        final boolean k = a_9.k;
        final Iterator<sj> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(bi);
            if (k) {
                break;
            }
        }
    }
}
