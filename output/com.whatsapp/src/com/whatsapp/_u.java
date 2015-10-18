// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class _u implements AdapterView$OnItemClickListener
{
    final WebSessionsActivity a;
    
    _u(final WebSessionsActivity a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final nl a = WebSessionsActivity.c(this.a).a(n - 1);
        if (a.a == 0.0 && a.i == 0.0 && a.j == 0.0) {
            App.a((Context)this.a, 2131231281, 0);
            if (!App.I) {
                return;
            }
        }
        ConversationRowLocation.a((Context)this.a, a.a, a.i, null);
    }
}
