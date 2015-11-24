// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.carousel;

import java.util.Iterator;
import android.view.View;
import java.util.ArrayDeque;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Map;

public class f
{
    private a a;
    private Map b;
    private Map c;
    
    f(final a a) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.a = a;
    }
    
    private j a(final ViewGroup viewGroup, final int n) {
        final j a = this.a.a(viewGroup, this.a.a(n));
        a.a(n);
        return a;
    }
    
    private void a(final j j, final int n) {
        this.a.a(j, n);
        j.a(n);
    }
    
    private void b(final int n) {
        if (!this.b.containsKey(n)) {
            this.b.put(n, new ArrayDeque());
        }
    }
    
    public int a() {
        return this.a.a();
    }
    
    public int a(final View view) {
        return this.c.get(view).b();
    }
    
    public View a(final ViewGroup viewGroup, final int n, final g g) {
        if (n < 0 || n >= this.a()) {
            throw new IllegalArgumentException();
        }
        final j a = this.a(n);
        if (a != null) {
            return a.a();
        }
        final int a2 = this.a.a(n);
        this.b(a2);
        final ArrayDeque<j> arrayDeque = this.b.get(a2);
        j a3;
        if (arrayDeque.isEmpty()) {
            a3 = this.a(viewGroup, n);
        }
        else {
            a3 = arrayDeque.pop();
        }
        if (g != null) {
            g.a(a3, n);
        }
        this.a(a3, n);
        this.c.put(a3.a(), a3);
        return a3.a();
    }
    
    public j a(final int n) {
        for (final j j : this.c.values()) {
            if (j.b() == n) {
                return j;
            }
        }
        return null;
    }
    
    public void b() {
        final Iterator<View> iterator = new HashMap<View, Object>(this.c).keySet().iterator();
        while (iterator.hasNext()) {
            this.b(iterator.next());
        }
    }
    
    public void b(final View view) {
        final j j = this.c.remove(view);
        final int a = this.a.a(j.b());
        this.b(a);
        ((ArrayDeque<j>)this.b.get(a)).push(j);
    }
}
