// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ArrayList;
import java.util.Iterator;
import android.database.Observable;

class aw_ extends Observable
{
    private aw_() {
    }
    
    aw_(final aat aat) {
        this();
    }
    
    public void a(final h6 h6, final long n, final long n2) {
        final boolean i = App.I;
        final Iterator<a_e> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(h6, n, n2);
            if (i) {
                break;
            }
        }
    }
    
    public void a(final h6 h6, final long n, final long n2, final ArrayList list) {
        final boolean i = App.I;
        final Iterator<a_e> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(h6, n, n2, list);
            if (i) {
                break;
            }
        }
    }
}
