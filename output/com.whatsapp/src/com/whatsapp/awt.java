// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import com.google.f9;
import com.google.e6;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.content.Context;
import android.widget.ArrayAdapter;

class awt extends ArrayAdapter
{
    private static final String[] z;
    final BlockList a;
    
    static {
        final String[] z2 = new String[3];
        String s = "nD";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '|';
                        break;
                    }
                    case 0: {
                        c2 = ';';
                        break;
                    }
                    case 1: {
                        c2 = '\u0017';
                        break;
                    }
                    case 2: {
                        c2 = '1';
                        break;
                    }
                    case 3: {
                        c2 = '\u0004';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "WvHk\tOHXj\u001aWvEa\u000e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "Y{^g\u0017W~BpS^eCk\u000e\u0014";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public awt(final BlockList a, final Context context, final int n, final List list) {
        this.a = a;
        super(context, n, list);
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        final a_9 a_9 = (a_9)this.getItem(n);
        while (true) {
            final LinearLayout linearLayout;
            Label_0230: {
                if (view == null) {
                    linearLayout = new LinearLayout(this.getContext());
                    alm.a((LayoutInflater)this.getContext().getSystemService(awt.z[1]), 2130903104, (ViewGroup)linearLayout, true);
                    linearLayout.findViewById(2131755414).setVisibility(8);
                    if (!App.I) {
                        break Label_0230;
                    }
                }
                final LinearLayout linearLayout2 = (LinearLayout)view;
                BlockList.a(this.a).b(a_9, (ImageView)linearLayout2.findViewById(2131755275));
                final TextView textView = (TextView)linearLayout2.findViewById(2131755413);
                vc.b(textView);
                textView.setText((CharSequence)a_9.a(this.getContext()));
                final TextView textView2 = (TextView)linearLayout2.findViewById(2131755415);
                vc.a(textView2);
                String text = a_9.f();
                while (true) {
                    try {
                        final e6 a = e6.a();
                        text = a.a(a.b(text, awt.z[0]), f9.INTERNATIONAL);
                        textView2.setText((CharSequence)text);
                        return (View)linearLayout2;
                    }
                    catch (Exception ex) {
                        Log.c(awt.z[2] + text, ex);
                        continue;
                    }
                    break;
                }
            }
            final LinearLayout linearLayout2 = linearLayout;
            continue;
        }
    }
}
