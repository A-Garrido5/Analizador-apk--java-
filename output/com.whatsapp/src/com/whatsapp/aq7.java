// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.fieldstats.aa;
import java.io.Serializable;
import android.content.Intent;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class aq7 implements AdapterView$OnItemClickListener
{
    private static final String z;
    final LocationPicker2 a;
    
    static {
        final char[] charArray = "Lc\u0017>/".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'J';
                    break;
                }
                case 0: {
                    c2 = '<';
                    break;
                }
                case 1: {
                    c2 = '\u000f';
                    break;
                }
                case 2: {
                    c2 = 'v';
                    break;
                }
                case 3: {
                    c2 = ']';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    aq7(final LocationPicker2 a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        if (LocationPicker2.k(this.a) == null || n >= LocationPicker2.k(this.a).e()) {
            return;
        }
        Label_0105: {
            if (LocationPicker2.t(this.a) != null) {
                App.a((Context)this.a, LocationPicker2.t(this.a), LocationPicker2.k(this.a).a(n));
                if (!App.I) {
                    break Label_0105;
                }
            }
            final Intent intent = new Intent();
            intent.putExtra(aq7.z, (Serializable)LocationPicker2.k(this.a).a(n));
            this.a.setResult(-1, intent);
        }
        LocationPicker2.a(this.a, aa.PLACE, n);
        this.a.finish();
    }
}
