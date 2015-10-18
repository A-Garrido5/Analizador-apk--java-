// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.HashMap;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemLongClickListener;

class hg implements AdapterView$OnItemLongClickListener
{
    final ContactsFragment a;
    
    hg(final ContactsFragment a) {
        this.a = a;
    }
    
    public boolean onItemLongClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final int n3 = n - 1;
        if (!aqw.a(ContactsFragment.a(this.a), n3) && !aqw.c(ContactsFragment.a(this.a), n3) && !aqw.b(ContactsFragment.a(this.a), n3)) {
            final a_9 b = ContactsFragment.a(this.a).b(n3);
            if (b.b) {
                if (App.p(b.u)) {
                    return false;
                }
                ContactsFragment.a(this.a, new HashMap());
                ContactsFragment.b(this.a).put(b.u, b);
                this.a.e();
                ContactsFragment.h(this.a);
            }
        }
        return true;
    }
}
