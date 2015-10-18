// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.fieldstats.ag;
import com.whatsapp.fieldstats.aq;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView$OnItemClickListener;

class sd implements AdapterView$OnItemClickListener
{
    final ListView a;
    final vb b;
    
    sd(final vb b, final ListView a) {
        this.b = b;
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final boolean i = App.I;
        final fh a = ContactPicker.a(this.b.a, this.a);
        final int a2 = ContactPicker.a(this.b.a, this.a, n);
        if (ContactPicker.b(this.b.a) == null) {
            if (fh.b(a, a2)) {
                aam.a(aq.TELL_A_FRIEND, ag.CONTACTPICKER_LIST);
                App.a((Activity)this.b.a);
                if (!i) {
                    return;
                }
            }
            if (fh.a(a, a2)) {
                ContactPicker.d(this.b.a);
                if (!i) {
                    return;
                }
            }
            if (fh.c(a, a2)) {
                return;
            }
            ContactPicker.a(this.b.a, a.b(a2));
            if (!i) {
                return;
            }
        }
        if (!fh.b(a, a2) && !fh.a(a, a2) && !fh.c(a, a2)) {
            final a_9 b = a.b(a2);
            Label_0340: {
                if (ContactPicker.b(this.b.a).containsKey(b.u)) {
                    ContactPicker.b(this.b.a).remove(b.u);
                    view.setBackgroundResource(0);
                    if (!i) {
                        break Label_0340;
                    }
                }
                if (ym.b > 0 && ContactPicker.b(this.b.a).size() >= ym.b) {
                    this.b.a.f(String.format(this.b.a.getString(2131230846), ym.b));
                    if (!i) {
                        break Label_0340;
                    }
                }
                ContactPicker.b(this.b.a).put(b.u, b);
                view.setBackgroundResource(2130837749);
            }
            ContactPicker.i(this.b.a);
        }
    }
}
