// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.HashMap;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView$OnItemLongClickListener;

class l2 implements AdapterView$OnItemLongClickListener
{
    final ListView a;
    final vb b;
    
    l2(final vb b, final ListView a) {
        this.b = b;
        this.a = a;
    }
    
    public boolean onItemLongClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final fh a = ContactPicker.a(this.b.a, this.a);
        final int a2 = ContactPicker.a(this.b.a, this.a, n);
        if (!fh.b(a, a2) && !fh.a(a, a2) && !fh.c(a, a2)) {
            final a_9 b = a.b(a2);
            if (App.p(b.u)) {
                return false;
            }
            ContactPicker.a(this.b.a, new HashMap());
            ContactPicker.b(this.b.a).put(b.u, b);
            this.b.a.h();
            ContactPicker.i(this.b.a);
        }
        return true;
    }
}
