// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.grid;

import android.database.DataSetObserver;
import android.view.ViewGroup;
import android.widget.Filter;
import android.view.View;
import java.util.Iterator;
import android.widget.ListAdapter;
import java.util.ArrayList;
import android.widget.WrapperListAdapter;
import android.widget.Filterable;

public class l implements Filterable, WrapperListAdapter
{
    static final ArrayList a;
    protected ArrayList b;
    protected ArrayList c;
    protected boolean d;
    private final ListAdapter e;
    private final boolean f;
    
    static {
        a = new ArrayList();
    }
    
    public l(final ArrayList b, final ArrayList c, final ListAdapter e) {
        this.e = e;
        this.f = (e instanceof Filterable);
        if (b == null) {
            this.b = l.a;
        }
        else {
            this.b = b;
        }
        if (c == null) {
            this.c = l.a;
        }
        else {
            this.c = c;
        }
        this.d = (this.a(this.b) && this.a(this.c));
    }
    
    private boolean a(final ArrayList list) {
        if (list != null) {
            final Iterator<f> iterator = list.iterator();
            while (iterator.hasNext()) {
                if (!iterator.next().c) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public int a() {
        return this.b.size();
    }
    
    public boolean a(final View view) {
        for (int i = 0; i < this.b.size(); ++i) {
            if (((f)this.b.get(i)).a == view) {
                this.b.remove(i);
                final boolean a = this.a(this.b);
                boolean d = false;
                if (a) {
                    final boolean a2 = this.a(this.c);
                    d = false;
                    if (a2) {
                        d = true;
                    }
                }
                this.d = d;
                return true;
            }
        }
        return false;
    }
    
    public boolean areAllItemsEnabled() {
        return this.e == null || (this.d && this.e.areAllItemsEnabled());
    }
    
    public int b() {
        return this.c.size();
    }
    
    public boolean b(final View view) {
        for (int i = 0; i < this.c.size(); ++i) {
            if (((f)this.c.get(i)).a == view) {
                this.c.remove(i);
                final boolean a = this.a(this.b);
                boolean d = false;
                if (a) {
                    final boolean a2 = this.a(this.c);
                    d = false;
                    if (a2) {
                        d = true;
                    }
                }
                this.d = d;
                return true;
            }
        }
        return false;
    }
    
    public int getCount() {
        if (this.e != null) {
            return this.b() + this.a() + this.e.getCount();
        }
        return this.b() + this.a();
    }
    
    public Filter getFilter() {
        if (this.f) {
            return ((Filterable)this.e).getFilter();
        }
        return null;
    }
    
    public Object getItem(final int n) {
        final int a = this.a();
        if (n < a) {
            return this.b.get(n).b;
        }
        final int n2 = n - a;
        final ListAdapter e = this.e;
        int count = 0;
        if (e != null) {
            count = this.e.getCount();
            if (n2 < count) {
                return this.e.getItem(n2);
            }
        }
        return ((f)this.c.get(n2 - count)).b;
    }
    
    public long getItemId(final int n) {
        final int a = this.a();
        if (this.e != null && n >= a) {
            final int n2 = n - a;
            if (n2 < this.e.getCount()) {
                return this.e.getItemId(n2);
            }
        }
        return -1L;
    }
    
    public int getItemViewType(final int n) {
        final int a = this.a();
        if (this.e != null && n >= a) {
            final int n2 = n - a;
            if (n2 < this.e.getCount()) {
                return this.e.getItemViewType(n2);
            }
        }
        return -2;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        final int a = this.a();
        if (n < a) {
            return this.b.get(n).a;
        }
        final int n2 = n - a;
        final ListAdapter e = this.e;
        int count = 0;
        if (e != null) {
            count = this.e.getCount();
            if (n2 < count) {
                return this.e.getView(n2, view, viewGroup);
            }
        }
        return ((f)this.c.get(n2 - count)).a;
    }
    
    public int getViewTypeCount() {
        if (this.e != null) {
            return this.e.getViewTypeCount();
        }
        return 1;
    }
    
    public ListAdapter getWrappedAdapter() {
        return this.e;
    }
    
    public boolean hasStableIds() {
        return this.e != null && this.e.hasStableIds();
    }
    
    public boolean isEmpty() {
        return this.e == null || this.e.isEmpty();
    }
    
    public boolean isEnabled(final int n) {
        final int a = this.a();
        if (n < a) {
            return this.b.get(n).c;
        }
        final int n2 = n - a;
        final ListAdapter e = this.e;
        int count = 0;
        if (e != null) {
            count = this.e.getCount();
            if (n2 < count) {
                return this.e.isEnabled(n2);
            }
        }
        return ((f)this.c.get(n2 - count)).c;
    }
    
    public void registerDataSetObserver(final DataSetObserver dataSetObserver) {
        if (this.e != null) {
            this.e.registerDataSetObserver(dataSetObserver);
        }
    }
    
    public void unregisterDataSetObserver(final DataSetObserver dataSetObserver) {
        if (this.e != null) {
            this.e.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
