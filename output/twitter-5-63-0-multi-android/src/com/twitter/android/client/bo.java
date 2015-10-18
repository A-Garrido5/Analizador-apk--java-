// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.widget.ListView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class bo implements AdapterView$OnItemClickListener
{
    final /* synthetic */ TwitterListFragment a;
    
    bo(final TwitterListFragment a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.a.a((ListView)adapterView, view, n, n2);
    }
}
