// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.Iterator;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import android.os.AsyncTask;

class u extends AsyncTask
{
    final ArrayList a;
    private final WeakReference b;
    
    u(final View view) {
        this.a = new ArrayList();
        this.b = new WeakReference((T)view);
        view.setTag(la.emoji_view_tag, (Object)System.identityHashCode(this));
    }
    
    private boolean a() {
        final View view = (View)this.b.get();
        if (view != null) {
            final Integer n = (Integer)view.getTag(la.emoji_view_tag);
            if (n != null && n == System.identityHashCode(this)) {
                return true;
            }
        }
        return false;
    }
    
    protected Void a(final Void... array) {
        if (this.a()) {
            final Iterator<w> iterator = this.a.iterator();
            while (iterator.hasNext()) {
                iterator.next().a();
            }
        }
        return null;
    }
    
    void a(final w w) {
        this.a.add(w);
    }
    
    protected void a(final Void void1) {
        final View view = (View)this.b.get();
        if (this.a()) {
            final Iterator<w> iterator = (Iterator<w>)this.a.iterator();
            while (iterator.hasNext()) {
                iterator.next().b();
            }
            view.invalidate();
        }
    }
}
