// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.PendingIntent;
import java.util.Iterator;
import android.database.Observable;

class a85 extends Observable
{
    private a85() {
    }
    
    a85(final m_ m_) {
        this();
    }
    
    public void a() {
        final boolean i = App.I;
        final Iterator<kf> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
            if (i) {
                break;
            }
        }
    }
    
    public void a(final int n) {
        final boolean i = App.I;
        final Iterator<kf> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(n);
            if (i) {
                break;
            }
        }
    }
    
    public void a(final PendingIntent pendingIntent) {
        final boolean i = App.I;
        final Iterator<kf> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(pendingIntent);
            if (i) {
                break;
            }
        }
    }
    
    public void a(final g2 g2) {
        final boolean i = App.I;
        final Iterator<kf> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(g2);
            if (i) {
                break;
            }
        }
    }
    
    public void a(final Integer n, final String[] array) {
        final boolean i = App.I;
        final Iterator<kf> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(n, array);
            if (i) {
                break;
            }
        }
    }
}
