// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View$OnClickListener;
import java.util.TimeZone;
import android.content.Context;
import com.whatsapp.util.b6;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.util.Date;
import android.os.Bundle;
import android.app.Activity;

final class ah_ extends ahw
{
    private static final String z;
    final Activity c;
    
    static {
        final char[] charArray = "|gC!\u000em{L#\u0002pf^x\bsgN<FhzB9\f2|D:\u000e?".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'k';
                    break;
                }
                case 0: {
                    c2 = '\u001f';
                    break;
                }
                case 1: {
                    c2 = '\b';
                    break;
                }
                case 2: {
                    c2 = '-';
                    break;
                }
                case 3: {
                    c2 = 'W';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ah_(final Activity activity, final int n, final Activity c) {
        this.c = c;
        super(activity, n);
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Date date = new Date();
        Log.w(ah_.z + date.toString());
        long n;
        if (App.aU == null) {
            n = date.getTime();
        }
        else {
            n = App.aU.getTime();
        }
        ((TextView)this.findViewById(2131755354)).setText((CharSequence)this.c.getString(2131230902, new Object[] { b6.j((Context)App.aq, n), TimeZone.getDefault().getDisplayName() }));
        this.findViewById(2131755355).setOnClickListener((View$OnClickListener)new bk(this));
    }
}
