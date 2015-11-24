// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.TextUtils;
import android.content.Context;
import java.util.ArrayList;
import android.widget.SectionIndexer;

class aq6 extends aqw implements SectionIndexer
{
    final ContactsFragment e;
    private ArrayList f;
    private ArrayList g;
    
    public aq6(final ContactsFragment e, final Context context, final ArrayList list) {
        super(this.e = e, context, list);
        this.g = new ArrayList();
        this.f = new ArrayList();
    }
    
    private void a() {
        final boolean i = App.I;
        this.g = new ArrayList();
        this.f = new ArrayList();
        final int size = this.d.size();
        int j = 0;
        String s = "";
        while (j < size) {
            final String a = this.d.get(j).a(this.getContext());
            if (!TextUtils.isEmpty((CharSequence)a)) {
                String upperCase = a.substring(0, 1).toUpperCase();
                if (Character.isDigit(upperCase.charAt(0)) || upperCase.charAt(0) == '+') {
                    upperCase = "#";
                }
                if (!s.equals(upperCase)) {
                    this.g.add(upperCase);
                    this.f.add(j);
                    s = upperCase;
                }
            }
            final int n = j + 1;
            if (i) {
                break;
            }
            j = n;
        }
    }
    
    public int getPositionForSection(final int n) {
        if (this.f == null || n >= this.f.size() || n < 0) {
            return -1;
        }
        return this.f.get(n);
    }
    
    public int getSectionForPosition(final int n) {
        final boolean i = App.I;
        if (n < 0) {
            return 0;
        }
        if (n >= this.d.size()) {
            return -1 + this.g.size();
        }
        int j = -1 + this.f.size();
        while (j >= 0) {
            if ((int)this.f.get(j) <= n) {
                return j;
            }
            --j;
            if (i) {
                break;
            }
        }
        return 0;
    }
    
    public Object[] getSections() {
        return this.g.toArray(new String[1]);
    }
    
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.a();
    }
}
