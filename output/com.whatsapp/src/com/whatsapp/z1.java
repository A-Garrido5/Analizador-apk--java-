// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ArrayList;
import java.util.Iterator;
import android.database.Observable;

public class z1 extends Observable
{
    public void a(final String s) {
        final boolean i = App.I;
        final Iterator<oi> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(s);
            if (i) {
                break;
            }
        }
    }
    
    public void a(final String s, final ArrayList list) {
        final boolean i = App.I;
        final Iterator<oi> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(s, list);
            if (i) {
                break;
            }
        }
    }
    
    public void a(final String s, final boolean b) {
        final boolean i = App.I;
        final Iterator<oi> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(s, b);
            if (i) {
                break;
            }
        }
    }
    
    public void b(final String s) {
        final boolean i = App.I;
        final Iterator<oi> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().b(s);
            if (i) {
                break;
            }
        }
    }
    
    public void c(final String s) {
        final boolean i = App.I;
        final Iterator<oi> iterator = this.mObservers.iterator();
        while (iterator.hasNext()) {
            iterator.next().c(s);
            if (i) {
                break;
            }
        }
    }
}
