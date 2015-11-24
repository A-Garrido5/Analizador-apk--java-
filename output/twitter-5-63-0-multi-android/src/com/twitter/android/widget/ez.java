// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.LayoutInflater;
import java.util.Iterator;
import com.twitter.internal.android.widget.GroupedRowView;
import android.view.ViewGroup;
import android.view.View;
import android.database.DataSetObserver;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
import android.widget.BaseAdapter;

public class ez extends BaseAdapter implements eb
{
    boolean a;
    private final ArrayList b;
    private final boolean[] c;
    private final int d;
    private final int[] e;
    private int f;
    private eb g;
    
    public ez(final BaseAdapter[] array) {
        this(null, null, array, 2130969097, 1);
    }
    
    public ez(final BaseAdapter[] array, final int n) {
        this(null, null, array, 2130969097, n);
    }
    
    public ez(final boolean[] c, final int[] e, final BaseAdapter[] array, final int d, final int f) {
        this.a = true;
        this.c = c;
        this.b = new ArrayList((Collection<? extends E>)Arrays.asList(array));
        this.d = d;
        this.e = e;
        this.f = f;
        final fa fa = new fa(this);
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].registerDataSetObserver((DataSetObserver)fa);
        }
    }
    
    private int d(final int n) {
        int count = this.b.get(n).getCount();
        if (count > 0 && this.b(n)) {
            ++count;
        }
        return count;
    }
    
    protected View a(final BaseAdapter baseAdapter, final int n, final int n2, final int n3, final View view, final ViewGroup viewGroup) {
        int f;
        if (this.e != null) {
            f = this.e[n2];
        }
        else {
            f = this.f;
        }
        if (f != 0) {
            return baseAdapter.getView(n3, view, viewGroup);
        }
        final GroupedRowView groupedRowView = (GroupedRowView)baseAdapter.getView(n3, view, viewGroup);
        final boolean b = this.c != null && this.c[n2];
        if (n == 0 && n2 > 0) {
            groupedRowView.setGroupStyle(1);
            return (View)groupedRowView;
        }
        groupedRowView.a(n2, this.b.size(), b);
        return (View)groupedRowView;
    }
    
    public void a(final int f) {
        this.f = f;
    }
    
    public void a(final int n, final BaseAdapter baseAdapter) {
        this.b.add(n, baseAdapter);
        baseAdapter.registerDataSetObserver((DataSetObserver)new fa(this));
    }
    
    public void a(final View view, final int n, final int n2, final int n3) {
        if (this.g != null) {
            this.g.a(view, n, n2, n3);
        }
    }
    
    public void a(final eb g) {
        this.g = g;
    }
    
    public int a_(final int n, final int n2) {
        if (this.g != null) {
            return this.g.a_(n, n2);
        }
        return 0;
    }
    
    public boolean areAllItemsEnabled() {
        for (int size = this.b.size(), i = 0; i < size; ++i) {
            if (this.b(i)) {
                final int n = 1;
                return n == 0 && super.areAllItemsEnabled();
            }
        }
        final int n = 0;
        return n == 0 && super.areAllItemsEnabled();
    }
    
    public boolean b(final int n) {
        boolean b = true;
        int i = 0;
        int n2 = 0;
        while (i < n) {
            n2 += this.d(i);
            ++i;
        }
        if (n2 == 0) {
            return false;
        }
        int f;
        if (this.e != null) {
            f = this.e[n];
        }
        else {
            f = this.f;
        }
        if (f != (b ? 1 : 0)) {
            b = false;
        }
        return b;
    }
    
    public int c(final int n) {
        final Iterator<BaseAdapter> iterator = this.b.iterator();
        int n2 = 0;
        int n3 = 0;
        while (iterator.hasNext()) {
            final int count = iterator.next().getCount();
            int n4;
            if (count > 0) {
                n4 = count + n2;
                if (this.b(n3)) {
                    ++n4;
                }
            }
            else {
                n4 = n2;
            }
            if (n < n4) {
                break;
            }
            ++n3;
            n2 = n4;
        }
        return n3;
    }
    
    public int getCount() {
        int i = 0;
        int n = 0;
        while (i < this.b.size()) {
            n += this.d(i);
            ++i;
        }
        return n;
    }
    
    public Object getItem(int n) {
        final Iterator<BaseAdapter> iterator = (Iterator<BaseAdapter>)this.b.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            final BaseAdapter baseAdapter = iterator.next();
            int count = baseAdapter.getCount();
            if (count > 0) {
                if (this.b(n2)) {
                    ++count;
                    if (n == 0) {
                        return null;
                    }
                    if (n < count) {
                        return baseAdapter.getItem(n - 1);
                    }
                }
                else if (n < count) {
                    return baseAdapter.getItem(n);
                }
                n -= count;
            }
            ++n2;
        }
        return null;
    }
    
    public long getItemId(int n) {
        final Iterator<BaseAdapter> iterator = (Iterator<BaseAdapter>)this.b.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            final BaseAdapter baseAdapter = iterator.next();
            int count = baseAdapter.getCount();
            if (count > 0) {
                if (this.b(n2)) {
                    ++count;
                    if (n == 0) {
                        return 0L;
                    }
                    if (n < count) {
                        return baseAdapter.getItemId(n - 1);
                    }
                }
                else if (n < count) {
                    return baseAdapter.getItemId(n);
                }
                n -= count;
            }
            ++n2;
        }
        return 0L;
    }
    
    public int getItemViewType(int n) {
        final Iterator<BaseAdapter> iterator = (Iterator<BaseAdapter>)this.b.iterator();
        int n2 = 0;
        int n3 = 1;
        while (iterator.hasNext()) {
            final BaseAdapter baseAdapter = iterator.next();
            int count = baseAdapter.getCount();
            if (count > 0) {
                if (this.b(n2)) {
                    ++count;
                    if (n == 0) {
                        return 0;
                    }
                    if (n < count) {
                        return n3 + baseAdapter.getItemViewType(n - 1);
                    }
                }
                else if (n < count) {
                    return n3 + baseAdapter.getItemViewType(n);
                }
                n -= count;
            }
            n3 += baseAdapter.getViewTypeCount();
            ++n2;
        }
        return super.getItemViewType(n);
    }
    
    public View getView(final int n, View inflate, final ViewGroup viewGroup) {
        final LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        final Iterator<BaseAdapter> iterator = this.b.iterator();
        int n2 = 0;
        int n3 = 0;
        int n4 = n;
        while (iterator.hasNext()) {
            final BaseAdapter baseAdapter = iterator.next();
            int count = baseAdapter.getCount();
            if (count > 0) {
                if (this.b(n3)) {
                    ++count;
                    if (n4 == 0) {
                        if (inflate == null) {
                            inflate = from.inflate(this.d, viewGroup, false);
                            break;
                        }
                        break;
                    }
                    else if (n4 < count) {
                        return this.a(baseAdapter, n2, n3, n4 - 1, inflate, viewGroup);
                    }
                }
                else if (n4 < count) {
                    return this.a(baseAdapter, n2, n3, n4, inflate, viewGroup);
                }
                n4 -= count;
                ++n2;
            }
            ++n3;
        }
        return inflate;
    }
    
    public int getViewTypeCount() {
        final Iterator<BaseAdapter> iterator = this.b.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += iterator.next().getViewTypeCount();
        }
        return n + 1;
    }
    
    public boolean isEnabled(int n) {
        for (int i = 0; i < this.b.size(); ++i) {
            final BaseAdapter baseAdapter = this.b.get(i);
            int count = baseAdapter.getCount();
            if (count > 0) {
                if (this.b(i)) {
                    ++count;
                    if (n == 0) {
                        return false;
                    }
                    if (n < count) {
                        return baseAdapter.isEnabled(n - 1);
                    }
                }
                else if (n < count) {
                    return baseAdapter.isEnabled(n);
                }
                n -= count;
            }
        }
        return super.isEnabled(n);
    }
    
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.a = true;
    }
}
