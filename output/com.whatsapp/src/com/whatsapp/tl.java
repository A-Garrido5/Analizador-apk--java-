// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import java.util.ArrayList;
import android.text.TextUtils;
import android.widget.Filter$FilterResults;
import android.content.Context;
import android.widget.Filter;

class tl extends Filter
{
    final o4 a;
    
    private tl(final o4 a) {
        this.a = a;
    }
    
    tl(final o4 o4, final mx mx) {
        this(o4);
    }
    
    public CharSequence convertResultToString(final Object o) {
        if (o != null && o instanceof a_9) {
            return ((a_9)o).a((Context)this.a.c);
        }
        return super.convertResultToString(o);
    }
    
    protected Filter$FilterResults performFiltering(final CharSequence charSequence) {
        final boolean i = App.I;
        final Filter$FilterResults filter$FilterResults = new Filter$FilterResults();
        if (!TextUtils.isEmpty(charSequence)) {
            final ArrayList<a_9> values = new ArrayList<a_9>();
            final ArrayList e = vy.E(charSequence.toString());
            for (final a_9 a_9 : MultipleContactsSelector.a(this.a.c)) {
                if (a_9.a(e) && !MultipleContactsSelector.a(this.a.c, a_9.u)) {
                    values.add(a_9);
                }
                if (i) {
                    break;
                }
            }
            filter$FilterResults.values = values;
            filter$FilterResults.count = values.size();
        }
        return filter$FilterResults;
    }
    
    protected void publishResults(final CharSequence charSequence, final Filter$FilterResults filter$FilterResults) {
        o4.a(this.a, (ArrayList)filter$FilterResults.values);
        final MultipleContactsSelector c = this.a.c;
        String string;
        if (charSequence == null) {
            string = null;
        }
        else {
            string = charSequence.toString();
        }
        MultipleContactsSelector.a(c, vy.E(string));
        this.a.notifyDataSetChanged();
    }
}
