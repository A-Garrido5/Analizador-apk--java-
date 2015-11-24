// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import android.widget.CheckBox;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class hi implements AdapterView$OnItemClickListener
{
    final MultipleContactPicker a;
    
    hi(final MultipleContactPicker a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        int n3 = 0;
        final boolean i = App.I;
        final CheckBox checkBox = (CheckBox)view.findViewById(2131755677);
        final a_9 a_9 = (a_9)checkBox.getTag();
        if (!App.p(a_9.u)) {
            Label_0165: {
                if (a_9.g) {
                    checkBox.setChecked(false);
                    a_9.g = false;
                    if (!i) {
                        break Label_0165;
                    }
                }
                if (MultipleContactPicker.i(this.a).size() == MultipleContactPicker.g(this.a)) {
                    this.a.f(String.format(this.a.getString(MultipleContactPicker.k(this.a)), MultipleContactPicker.g(this.a)));
                    checkBox.setChecked(false);
                    if (!i) {
                        break Label_0165;
                    }
                }
                checkBox.setChecked(true);
                a_9.g = true;
            }
            Label_0214: {
                if (a_9.g) {
                    MultipleContactPicker.i(this.a).add(a_9.u);
                    if (!i) {
                        break Label_0214;
                    }
                }
                MultipleContactPicker.i(this.a).remove(a_9.u);
            }
            MultipleContactPicker.a(this.a, MultipleContactPicker.i(this.a).size());
            while (true) {
                for (final a_9 a_10 : MultipleContactPicker.j(this.a)) {
                    int n4;
                    if (a_10 != a_9 && a_9.u.equals(a_10.u)) {
                        a_10.g = a_9.g;
                        n4 = 1;
                    }
                    else {
                        n4 = n3;
                    }
                    if (i) {
                        if (n4 != 0) {
                            MultipleContactPicker.d(this.a).notifyDataSetChanged();
                        }
                        return;
                    }
                    else {
                        n3 = n4;
                    }
                }
                int n4 = n3;
                continue;
            }
        }
    }
}
