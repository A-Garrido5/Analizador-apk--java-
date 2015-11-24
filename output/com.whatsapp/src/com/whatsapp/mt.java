// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View$OnClickListener;
import com.whatsapp.util.cq;
import android.text.TextUtils;

class mt implements Runnable
{
    private static final String z;
    final String a;
    final SetStatus b;
    
    static {
        final char[] charArray = ">9AN\u0018\u001f>\u001cX\u0000\u000ed\u0001\\\u0004".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'p';
                    break;
                }
                case 0: {
                    c2 = '~';
                    break;
                }
                case 1: {
                    c2 = 'J';
                    break;
                }
                case 2: {
                    c2 = 'o';
                    break;
                }
                case 3: {
                    c2 = '9';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    mt(final SetStatus b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        if (TextUtils.equals((CharSequence)this.a, (CharSequence)(App.au() + mt.z))) {
            this.b.p.setText(cq.c(App.aB, this.b.getBaseContext()));
            this.b.m.notifyDataSetInvalidated();
            this.b.findViewById(2131755513).setVisibility(8);
            this.b.findViewById(2131755751).setVisibility(0);
            SetStatus.c(this.b).setOnClickListener((View$OnClickListener)new pv(this));
        }
    }
}
