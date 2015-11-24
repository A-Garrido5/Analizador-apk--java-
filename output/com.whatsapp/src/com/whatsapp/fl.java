// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.TextUtils;
import android.content.Context;
import java.util.ArrayList;
import android.widget.SectionIndexer;

class fl extends fh implements SectionIndexer
{
    private ArrayList e;
    private ArrayList f;
    final ContactPicker g;
    
    public fl(final ContactPicker g, final Context context, final ArrayList list) {
        super(this.g = g, context, list);
        this.f = new ArrayList();
        this.e = new ArrayList();
    }
    
    private void a() {
        final boolean i = App.I;
        this.f = new ArrayList();
        this.e = new ArrayList();
        final int size = this.c.size();
        int j = 0;
        String s = "";
        while (j < size) {
            final String a = this.c.get(j).a((Context)this.g);
            if (!TextUtils.isEmpty((CharSequence)a)) {
                String upperCase = a.substring(0, 1).toUpperCase();
                if (Character.isDigit(upperCase.charAt(0)) || upperCase.charAt(0) == '+') {
                    upperCase = "#";
                }
                if (!s.equals(upperCase)) {
                    this.f.add(upperCase);
                    this.e.add(j);
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
        if (this.e == null || n >= this.e.size() || n < 0) {
            return -1;
        }
        return this.e.get(n);
    }
    
    public int getSectionForPosition(final int n) {
        final boolean i = App.I;
        if (n < 0) {
            return 0;
        }
        if (n >= this.c.size()) {
            return -1 + this.f.size();
        }
        int j = -1 + this.e.size();
        while (j >= 0) {
            if ((int)this.e.get(j) <= n) {
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
        return this.f.toArray(new String[1]);
    }
    
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.a();
    }
}
