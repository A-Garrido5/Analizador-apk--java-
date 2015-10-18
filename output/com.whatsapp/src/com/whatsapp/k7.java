// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.res.Resources;
import com.whatsapp.contact.o;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import java.util.List;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

class k7 extends ArrayAdapter
{
    private final LayoutInflater a;
    private final List b;
    
    public k7(final Context context, final int n, final List b) {
        super(context, n, b);
        this.a = LayoutInflater.from(context);
        this.b = b;
    }
    
    public boolean areAllItemsEnabled() {
        return false;
    }
    
    public int getCount() {
        return Math.max(1, super.getCount());
    }
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        if (this.b.isEmpty()) {
            final View a = alm.a(this.a, 2130903193, viewGroup, false);
            ((TextView)a.findViewById(2131755411)).setText(2131230949);
            a.setTag((Object)2);
            a.setClickable(false);
            return a;
        }
        if (view == null || (int)view.getTag() != 1) {
            final View a2 = alm.a(this.a, 2130903101, viewGroup, false);
            if (!App.I) {
                view = a2;
            }
        }
        final TextView textView = (TextView)view.findViewById(2131755405);
        final TextView textView2 = (TextView)view.findViewById(2131755406);
        final o o = (o)this.getItem(n);
        textView.setText((CharSequence)o.c());
        textView2.setText((CharSequence)o.e());
        view.setTag((Object)2);
        final Resources resources = this.getContext().getResources();
        int n2;
        if (n % 2 == 0) {
            n2 = 2131624038;
        }
        else {
            n2 = 2131624039;
        }
        view.setBackgroundColor(resources.getColor(n2));
        return view;
    }
    
    public int getViewTypeCount() {
        return 2;
    }
    
    public boolean isEnabled(final int n) {
        return false;
    }
}
