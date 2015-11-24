// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Collection;
import java.util.ArrayList;
import android.widget.Filter$FilterResults;
import android.widget.Filter;

class xq extends Filter
{
    final aqw a;
    
    private xq(final aqw a) {
        this.a = a;
    }
    
    xq(final aqw aqw, final a0t a0t) {
        this(aqw);
    }
    
    protected Filter$FilterResults performFiltering(final CharSequence charSequence) {
        final Filter$FilterResults filter$FilterResults = new Filter$FilterResults();
        final ArrayList a = ContactsFragment.a(this.a.c, charSequence);
        filter$FilterResults.values = a;
        filter$FilterResults.count = a.size();
        return filter$FilterResults;
    }
    
    protected void publishResults(final CharSequence charSequence, final Filter$FilterResults filter$FilterResults) {
        if (!ContactsFragment.d(this.a.c).isEmpty()) {
            ContactsFragment.b(this.a.c, charSequence);
            final ContactsFragment c = this.a.c;
            String string;
            if (charSequence == null) {
                string = null;
            }
            else {
                string = charSequence.toString();
            }
            ContactsFragment.a(c, vy.E(string));
            ContactsFragment.f(this.a.c).clear();
            Label_0119: {
                if (filter$FilterResults.count == 0) {
                    ContactsFragment.f(this.a.c).add(ContactsFragment.d());
                    if (!App.I) {
                        break Label_0119;
                    }
                }
                ContactsFragment.f(this.a.c).addAll((Collection)filter$FilterResults.values);
            }
            ContactsFragment.f(this.a.c).add(ContactsFragment.g());
            ContactsFragment.f(this.a.c).add(ContactsFragment.i());
        }
        this.a.notifyDataSetChanged();
    }
}
