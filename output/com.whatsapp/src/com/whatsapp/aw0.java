// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ListIterator;
import java.util.Collection;
import java.util.ArrayList;
import android.text.TextUtils;
import android.widget.Filter$FilterResults;
import android.widget.Filter;

class aw0 extends Filter
{
    final CallsFragment a;
    
    private aw0(final CallsFragment a) {
        this.a = a;
    }
    
    aw0(final CallsFragment callsFragment, final a83 a83) {
        this(callsFragment);
    }
    
    protected Filter$FilterResults performFiltering(final CharSequence charSequence) {
        final boolean i = App.I;
        final Filter$FilterResults filter$FilterResults = new Filter$FilterResults();
        ArrayList<e_> j = null;
        Label_0108: {
            if (!TextUtils.isEmpty(charSequence)) {
                final ArrayList<e_> list = new ArrayList<e_>(CallsFragment.i(this.a));
                final ArrayList e = vy.E(charSequence.toString());
                final ListIterator<e_> listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    if (!listIterator.next().e().a(e)) {
                        listIterator.remove();
                    }
                    if (i) {
                        break;
                    }
                }
                if (!i) {
                    j = list;
                    break Label_0108;
                }
            }
            j = (ArrayList<e_>)CallsFragment.i(this.a);
        }
        filter$FilterResults.values = j;
        filter$FilterResults.count = j.size();
        return filter$FilterResults;
    }
    
    protected void publishResults(final CharSequence charSequence, final Filter$FilterResults filter$FilterResults) {
        CallsFragment.g(this.a);
        CallsFragment.c(this.a, (ArrayList)filter$FilterResults.values);
        if (CallsFragment.a(this.a) == null) {
            CallsFragment.c(this.a, CallsFragment.i(this.a));
        }
        CallsFragment.a(this.a, charSequence);
        final CallsFragment a = this.a;
        String string;
        if (charSequence == null) {
            string = null;
        }
        else {
            string = charSequence.toString();
        }
        CallsFragment.a(a, vy.E(string));
        CallsFragment.c(this.a).notifyDataSetChanged();
    }
}
