// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.cq;
import android.graphics.Color;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.content.Context;
import java.util.ArrayList;
import android.widget.ArrayAdapter;

class xo extends ArrayAdapter
{
    private static final String z;
    final SetStatus a;
    private ArrayList b;
    
    static {
        final char[] charArray = "6\u0015^eD.+NdW6\u0015SoC".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '1';
                    break;
                }
                case 0: {
                    c2 = 'Z';
                    break;
                }
                case 1: {
                    c2 = 't';
                    break;
                }
                case 2: {
                    c2 = '\'';
                    break;
                }
                case 3: {
                    c2 = '\n';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public xo(final SetStatus a, final Context context, final int n, final ArrayList b) {
        this.a = a;
        super(context, n, (List)b);
        this.b = b;
    }
    
    public View getView(final int n, View a, final ViewGroup viewGroup) {
        if (a == null) {
            a = alm.a((LayoutInflater)this.a.getSystemService(xo.z), 2130903219, null);
        }
        final String s = this.b.get(n);
        if (s != null) {
            final TextView textView = (TextView)a.findViewById(2131755756);
            if (textView != null) {
                Label_0100: {
                    if (s.equals(App.aB)) {
                        textView.setTextColor(Color.argb(255, 51, 102, 153));
                        if (!App.I) {
                            break Label_0100;
                        }
                    }
                    textView.setTextColor(-16777216);
                }
                textView.setText(cq.c(s, this.a.getBaseContext()));
            }
        }
        return a;
    }
}
