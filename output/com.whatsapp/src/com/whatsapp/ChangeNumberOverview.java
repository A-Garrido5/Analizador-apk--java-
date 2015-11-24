// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View$OnClickListener;
import android.app.Activity;
import com.whatsapp.fieldstats.aq;
import com.whatsapp.util.Log;
import android.os.Bundle;

public class ChangeNumberOverview extends DialogToastActivity
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        String s = "$\b\u000f~\u0011\"\u000e\u001b}\u0014\"\u0012\u0001f\u00135\u0016\u0007u\u0001h\u0004\u000bc\u00025\u000f\u0017";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'v';
                        break;
                    }
                    case 0: {
                        c2 = 'G';
                        break;
                    }
                    case 1: {
                        c2 = '`';
                        break;
                    }
                    case 2: {
                        c2 = 'n';
                        break;
                    }
                    case 3: {
                        c2 = '\u0010';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "$\b\u000f~\u0011\"\u000e\u001b}\u0014\"\u0012\u0001f\u00135\u0016\u0007u\u0001h\u0003\u001cu\u00173\u0005";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        Log.i(ChangeNumberOverview.z[1]);
        super.onCreate(bundle);
        aam.a(aq.CHANGE_NUMBER);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setDisplayShowCustomEnabled(true);
        this.setContentView(2130903091);
        a81.a(this, this.getSupportActionBar(), this.getString(2131231410).toUpperCase(), (View$OnClickListener)new jt(this));
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(ChangeNumberOverview.z[0]);
    }
}
