// 
// Decompiled by Procyon v0.5.30
// 

package com.tonicartos.widget.stickygridheaders;

import android.view.ViewGroup;
import android.view.View;
import android.widget.ListAdapter;
import android.database.DataSetObserver;
import android.widget.BaseAdapter;

public class k extends BaseAdapter implements t
{
    private DataSetObserver a;
    private ListAdapter b;
    
    public k(final ListAdapter b) {
        this.a = new s(this);
        (this.b = b).registerDataSetObserver(this.a);
    }
    
    public int a() {
        return 0;
    }
    
    public int a(final int n) {
        return 0;
    }
    
    public View a(final int n, final View view, final ViewGroup viewGroup) {
        return null;
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
