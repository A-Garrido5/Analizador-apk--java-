// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class lb implements AdapterView$OnItemClickListener
{
    final /* synthetic */ MainActivity a;
    
    lb(final MainActivity a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int currentItem, final long n) {
        if (currentItem == this.a.k.getCurrentItem()) {
            this.a.i();
            return;
        }
        this.a.l.a(currentItem, "navigation_bar", null, null);
        this.a.k.setCurrentItem(currentItem);
    }
}
