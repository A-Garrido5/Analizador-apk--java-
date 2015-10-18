// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ArrayList;
import android.support.v7.widget.SearchView$OnQueryTextListener;

class fi implements SearchView$OnQueryTextListener
{
    final ContactPicker a;
    
    fi(final ContactPicker a) {
        this.a = a;
    }
    
    @Override
    public boolean onQueryTextChange(final String s) {
        ContactPicker.b(this.a, vy.E(s));
        Label_0061: {
            if (!ContactPicker.p(this.a).isEmpty()) {
                ContactPicker.a(this.a, ContactPicker.p(this.a));
                if (!App.I) {
                    break Label_0061;
                }
            }
            ContactPicker.b(this.a, null);
            ContactPicker.r(this.a);
        }
        ContactPicker.w(this.a);
        return false;
    }
    
    @Override
    public boolean onQueryTextSubmit(final String s) {
        return false;
    }
}
