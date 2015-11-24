// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewGroup$LayoutParams;
import android.widget.ListView;
import android.widget.ScrollView;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import com.whatsapp.contact.g;
import java.util.Collection;
import com.whatsapp.util.Log;
import com.whatsapp.contact.j;
import com.whatsapp.contact.b;
import java.util.Set;
import android.os.AsyncTask;

class alc extends AsyncTask
{
    private static final String z;
    final ContactPickerHelp a;
    
    static {
        final char[] charArray = "e-V2!e6P#,vmK./q+V0)u+Z*%)!Z54g6M5`".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '@';
                    break;
                }
                case 0: {
                    c2 = '\u0006';
                    break;
                }
                case 1: {
                    c2 = 'B';
                    break;
                }
                case 2: {
                    c2 = '8';
                    break;
                }
                case 3: {
                    c2 = 'F';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    private alc(final ContactPickerHelp a) {
        this.a = a;
    }
    
    alc(final ContactPickerHelp contactPickerHelp, final mo mo) {
        this(contactPickerHelp);
    }
    
    protected Set a(final Void[] array) {
        return j.a(b.INVISIBLE_ONLY);
    }
    
    protected void a(final Set set) {
        this.a.c();
        if (set != null) {
            if (!set.isEmpty()) {
                this.a.findViewById(2131755401).setVisibility(0);
                Log.i(alc.z + this.a.u.isChecked());
                this.a.findViewById(2131755400).setVisibility(0);
                this.a.findViewById(2131755403).setVisibility(0);
            }
            this.a.s.setVisibility(0);
            this.a.s.setText((CharSequence)this.a.getString(2131230947, new Object[] { set.size() }));
            this.a.c().setVisibility(0);
            this.a.r.clear();
            this.a.r.addAll(set);
            Collections.sort((List<Object>)this.a.r, new g());
            this.a.q.notifyDataSetChanged();
            final ListView c = this.a.c();
            final ViewGroup$LayoutParams layoutParams = c.getLayoutParams();
            layoutParams.height = (int)(set.size() * this.a.getResources().getDimension(2131361883));
            c.setLayoutParams(layoutParams);
            if (!set.isEmpty()) {
                ((ScrollView)this.a.findViewById(2131755344)).post((Runnable)new ol(this));
            }
            if (!App.I) {
                return;
            }
        }
        this.a.a(2131230946);
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Set)o);
    }
    
    protected void onPreExecute() {
        this.a.c(2131231553);
        this.a.s.setVisibility(4);
        this.a.c().setVisibility(4);
        this.a.findViewById(2131755401).setVisibility(8);
        this.a.findViewById(2131755400).setVisibility(8);
        this.a.findViewById(2131755403).setVisibility(8);
    }
}
