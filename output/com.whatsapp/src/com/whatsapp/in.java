// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.Serializable;
import android.content.Intent;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class in implements AdapterView$OnItemClickListener
{
    private static final String z;
    final LocationPicker a;
    
    static {
        final char[] charArray = "i\u0006%^S".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '6';
                    break;
                }
                case 0: {
                    c2 = '\u0019';
                    break;
                }
                case 1: {
                    c2 = 'j';
                    break;
                }
                case 2: {
                    c2 = 'D';
                    break;
                }
                case 3: {
                    c2 = '=';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    in(final LocationPicker a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        if (LocationPicker.a(this.a) == null || n >= LocationPicker.a(this.a).e()) {
            return;
        }
        Label_0105: {
            if (LocationPicker.f(this.a) != null) {
                App.a((Context)this.a, LocationPicker.f(this.a), LocationPicker.a(this.a).a(n));
                if (!App.I) {
                    break Label_0105;
                }
            }
            final Intent intent = new Intent();
            intent.putExtra(in.z, (Serializable)LocationPicker.a(this.a).a(n));
            this.a.setResult(-1, intent);
        }
        this.a.finish();
    }
}
