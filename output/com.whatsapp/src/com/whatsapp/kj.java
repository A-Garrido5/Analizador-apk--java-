// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.view.View;
import android.widget.BaseAdapter;

class kj extends BaseAdapter
{
    final MultipleContactsSelector a;
    
    private kj(final MultipleContactsSelector a) {
        this.a = a;
    }
    
    kj(final MultipleContactsSelector multipleContactsSelector, final mx mx) {
        this(multipleContactsSelector);
    }
    
    public int getCount() {
        return this.a.l.size();
    }
    
    public Object getItem(final int n) {
        return this.a.l.get(n);
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        if (view == null) {
            final View a = alm.a(this.a.getLayoutInflater(), 2130903196, viewGroup, false);
            if (!App.I) {
                view = a;
            }
        }
        final a_9 a_9 = this.a.l.get(n);
        ((ImageView)view.findViewById(2131755688)).setOnClickListener((View$OnClickListener)new rx(this, a_9));
        final TextView textView = (TextView)view.findViewById(2131755297);
        vc.b(textView);
        textView.setText((CharSequence)a_9.a((Context)this.a));
        MultipleContactsSelector.c(this.a).b(a_9, (ImageView)view.findViewById(2131755295));
        return view;
    }
}
