// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ArrayList;
import android.widget.Filter$FilterResults;
import android.widget.Filter;

class adn extends Filter
{
    final fh a;
    
    private adn(final fh a) {
        this.a = a;
    }
    
    adn(final fh fh, final j j) {
        this(fh);
    }
    
    protected Filter$FilterResults performFiltering(final CharSequence charSequence) {
        return new Filter$FilterResults();
    }
    
    protected void publishResults(final CharSequence charSequence, final Filter$FilterResults filter$FilterResults) {
        final ContactPicker b = this.a.b;
        String string;
        if (charSequence == null) {
            string = null;
        }
        else {
            string = charSequence.toString();
        }
        ContactPicker.b(b, vy.E(string));
        Label_0075: {
            if (charSequence == null || charSequence.length() == 0) {
                ContactPicker.a(this.a.b, (ArrayList)null);
                if (!App.I) {
                    break Label_0075;
                }
            }
            ContactPicker.a(this.a.b, ContactPicker.p(this.a.b));
        }
        this.a.notifyDataSetChanged();
    }
}
