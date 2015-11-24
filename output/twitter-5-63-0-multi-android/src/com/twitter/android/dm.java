// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import android.widget.AdapterView;
import com.twitter.library.widget.PageableListView;
import android.widget.AdapterView$OnItemLongClickListener;

class dm implements AdapterView$OnItemLongClickListener
{
    final /* synthetic */ PageableListView a;
    final /* synthetic */ DMConversationFragment b;
    
    dm(final DMConversationFragment b, final PageableListView a) {
        this.b = b;
        this.a = a;
    }
    
    public boolean onItemLongClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        return this.b.a(n - this.a.getHeaderViewsCount());
    }
}
