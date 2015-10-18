// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.fieldstats.ab;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.content.Context;
import android.widget.ArrayAdapter;

class a8h extends ArrayAdapter
{
    private static final String z;
    final SearchFAQ a;
    
    static {
        final char[] charArray = "#cfpI;]vqZ#ckzN".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '<';
                    break;
                }
                case 0: {
                    c2 = 'O';
                    break;
                }
                case 1: {
                    c2 = '\u0002';
                    break;
                }
                case 2: {
                    c2 = '\u001f';
                    break;
                }
                case 3: {
                    c2 = '\u001f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public a8h(final SearchFAQ a, final Context context, final int n, final List list) {
        this.a = a;
        super(context, n, list);
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        LinearLayout linearLayout2 = null;
        Label_0051: {
            if (view == null) {
                final LinearLayout linearLayout = new LinearLayout(this.getContext());
                alm.a((LayoutInflater)this.getContext().getSystemService(a8h.z), 2130903214, (ViewGroup)linearLayout, true);
                if (!App.I) {
                    linearLayout2 = linearLayout;
                    break Label_0051;
                }
            }
            linearLayout2 = (LinearLayout)view;
        }
        int backgroundColor;
        if (n % 2 == 0) {
            backgroundColor = -1;
        }
        else {
            backgroundColor = -1184275;
        }
        linearLayout2.setBackgroundColor(backgroundColor);
        final ada ada = (ada)this.getItem(n);
        final TextView textView = (TextView)linearLayout2.findViewById(2131755749);
        textView.setText((CharSequence)ada.b);
        textView.setOnClickListener((View$OnClickListener)new a9z(this, ada));
        SearchFAQ.e(this.a).j = (double)ab.SUGGESTED_FAQ.getCode();
        return (View)linearLayout2;
    }
}
