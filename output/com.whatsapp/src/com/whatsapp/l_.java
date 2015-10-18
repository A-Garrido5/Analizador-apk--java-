// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.ImageView;
import com.whatsapp.util.cq;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import java.util.List;
import android.widget.ArrayAdapter;

class l_ extends ArrayAdapter
{
    final ContactInfo a;
    protected List b;
    private LayoutInflater c;
    
    public l_(final ContactInfo a, final Context context) {
        this.a = a;
        super(context, 2130903201, (List)null);
        this.c = LayoutInflater.from(context);
        this.b = new ArrayList();
    }
    
    public a_9 a(final int n) {
        return this.b.get(n);
    }
    
    public void a(final List b) {
        this.b = b;
        this.notifyDataSetChanged();
    }
    
    public int getCount() {
        if (this.b == null) {
            return 0;
        }
        return this.b.size();
    }
    
    public Object getItem(final int n) {
        return this.a(n);
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        final boolean i = App.I;
        if (view == null) {
            final View a = alm.a(this.c, 2130903201, viewGroup, false);
            if (!i) {
                view = a;
            }
        }
        Label_0075: {
            if (n == -1 + this.getCount()) {
                view.setBackgroundResource(2130838967);
                view.findViewById(2131755309).setVisibility(8);
                if (!i) {
                    break Label_0075;
                }
            }
            view.setBackgroundResource(2130838971);
            view.findViewById(2131755309).setVisibility(0);
        }
        final a_9 a2 = this.a(n);
        final TextView textView = (TextView)view.findViewById(2131755405);
        final TextView textView2 = (TextView)view.findViewById(2131755296);
        textView.setText(cq.c(a2.a((Context)this.a), (Context)this.a));
        textView2.setText((CharSequence)adc.h(a2.u));
        ContactInfo.g(this.a).b(a2, (ImageView)view.findViewById(2131755583));
        view.setTag((Object)a2);
        return view;
    }
    
    public int getViewTypeCount() {
        return 1;
    }
}
