// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.internal.android.widget.GroupedRowView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.database.DataSetObserver;
import android.widget.ListAdapter;
import android.widget.BaseAdapter;

public abstract class ct extends BaseAdapter
{
    protected final ListAdapter a;
    private final int b;
    private final int c;
    private boolean d;
    
    protected ct(final ListAdapter a, final int c) {
        this.a = a;
        this.b = a.getViewTypeCount();
        this.c = c;
        this.d = this.g();
        a.registerDataSetObserver((DataSetObserver)new cu(this));
    }
    
    public static View a(final View view, final ViewGroup viewGroup, final String s) {
        return a(view, viewGroup, s, 2130969098);
    }
    
    public static View a(View inflate, final ViewGroup viewGroup, final String text, final int n) {
        TextView tag;
        if (inflate == null) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(n, viewGroup, false);
            tag = (TextView)inflate.findViewById(2131886291);
            inflate.setTag((Object)tag);
        }
        else {
            tag = (TextView)inflate.getTag();
        }
        tag.setText((CharSequence)text);
        return inflate;
    }
    
    private boolean d(final int n) {
        return this.g() && this.d && n == -1 + this.getCount();
    }
    
    private int e(int n) {
        if (this.f()) {
            --n;
        }
        return n;
    }
    
    private boolean f() {
        return (0x1 & this.c) != 0x0;
    }
    
    private boolean g() {
        return (0x4 & this.c) != 0x0;
    }
    
    protected abstract View a(final View p0, final ViewGroup p1);
    
    protected abstract Object a();
    
    protected Object a(final int n) {
        return this.a.getItem(n);
    }
    
    protected abstract View b(final View p0, final ViewGroup p1);
    
    protected abstract Object b();
    
    public boolean b(final int n) {
        return this.f() && n == 0;
    }
    
    public ListAdapter c() {
        return this.a;
    }
    
    public boolean c(final int n) {
        return this.d() && n == -1 + this.getCount();
    }
    
    protected boolean d() {
        return (0x2 & this.c) != 0x0;
    }
    
    protected boolean e() {
        return (0x20 & this.c) != 0x0;
    }
    
    public int getCount() {
        int count;
        if (this.g() && this.d) {
            count = 1;
            if (this.f()) {
                count = 2;
            }
        }
        else {
            count = this.a.getCount();
            if (count != 0) {
                if (this.f()) {
                    ++count;
                }
                if (this.d()) {
                    return count + 1;
                }
            }
        }
        return count;
    }
    
    public Object getItem(final int n) {
        if (this.b(n)) {
            return this.a();
        }
        if (this.d(n)) {
            return null;
        }
        if (this.c(n)) {
            return this.b();
        }
        return this.a(this.e(n));
    }
    
    public long getItemId(final int n) {
        if (this.b(n) || this.d(n) || this.c(n)) {
            return 0L;
        }
        return this.a.getItemId(this.e(n));
    }
    
    public int getItemViewType(final int n) {
        if (this.b(n)) {
            return 1 + (-1 + this.b);
        }
        if (this.d(n)) {
            return 3 + (-1 + this.b);
        }
        if (this.c(n)) {
            return 2 + (-1 + this.b);
        }
        return this.a.getItemViewType(this.e(n));
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        View view2;
        if (this.b(n)) {
            view2 = this.a(view, viewGroup);
        }
        else if (this.d(n)) {
            if (view == null) {
                view2 = LayoutInflater.from(viewGroup.getContext()).inflate(2130968853, viewGroup, false);
            }
            else {
                view2 = view;
            }
        }
        else if (this.c(n)) {
            view2 = this.b(view, viewGroup);
        }
        else {
            view2 = this.a.getView(this.e(n), view, viewGroup);
        }
        if ((0x8 & this.c) != 0x0) {
            ((GroupedRowView)view2).a(n, this.getCount());
        }
        return view2;
    }
    
    public int getViewTypeCount() {
        return 3 + this.b;
    }
    
    public boolean isEnabled(final int n) {
        if (this.b(n)) {
            if (this.a() == null) {
                return false;
            }
        }
        else {
            if (this.d(n)) {
                return false;
            }
            if (!this.c(n)) {
                return this.a.isEnabled(this.e(n));
            }
            if (this.b() == null) {
                return false;
            }
        }
        return true;
    }
}
