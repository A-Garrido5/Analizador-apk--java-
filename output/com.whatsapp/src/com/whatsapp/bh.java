// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class bh implements AdapterView$OnItemClickListener
{
    final MultipleContactsSelector a;
    
    bh(final MultipleContactsSelector a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        if (view == null) {
            return;
        }
        Label_0113: {
            if (this.a.f() > 0 && this.a.l.size() >= this.a.f()) {
                this.a.f(String.format(this.a.getString(this.a.e()), this.a.f()));
                if (!App.I) {
                    break Label_0113;
                }
            }
            this.a.l.add(view.getTag());
        }
        this.a.t.setText((CharSequence)"");
        MultipleContactsSelector.b(this.a).notifyDataSetChanged();
        this.a.i();
    }
}
