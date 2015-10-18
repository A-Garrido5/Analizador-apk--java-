// 
// Decompiled by Procyon v0.5.30
// 

package com.tonicartos.widget.stickygridheaders;

import java.util.ArrayList;
import java.util.HashMap;
import android.view.ViewGroup;
import android.view.View;
import android.database.DataSetObserver;
import java.util.List;
import android.widget.BaseAdapter;

public class m extends BaseAdapter implements t
{
    private List a;
    private c b;
    
    public m(final c b) {
        (this.b = b).registerDataSetObserver((DataSetObserver)new l(this, null));
        this.a = this.a(b);
    }
    
    static c a(final m m) {
        return m.b;
    }
    
    static List a(final m m, final List a) {
        return m.a = a;
    }
    
    public int a() {
        return this.a.size();
    }
    
    public int a(final int n) {
        return this.a.get(n).b();
    }
    
    public View a(final int n, final View view, final ViewGroup viewGroup) {
        return this.b.a(this.a.get(n).a(), view, viewGroup);
    }
    
    protected List a(final c c) {
        final int c2 = StickyGridHeadersGridView.c;
        final HashMap<Object, d> hashMap = new HashMap<Object, d>();
        final ArrayList<d> list = new ArrayList<d>();
        int n;
        for (int i = 0; i < c.getCount(); i = n) {
            final long a = c.a(i);
            d d = hashMap.get(a);
            if (d == null) {
                d = new d(this, i);
                list.add(d);
            }
            d.c();
            hashMap.put(a, d);
            n = i + 1;
            if (c2 != 0) {
                break;
            }
        }
        return list;
    }
    
    public int getCount() {
        return this.b.getCount();
    }
    
    public Object getItem(final int n) {
        return this.b.getItem(n);
    }
    
    public long getItemId(final int n) {
        return this.b.getItemId(n);
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        return this.b.getView(n, view, viewGroup);
    }
}
