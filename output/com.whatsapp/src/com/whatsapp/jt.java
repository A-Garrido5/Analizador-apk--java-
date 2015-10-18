// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class jt implements View$OnClickListener
{
    private static final String z;
    final ChangeNumberOverview a;
    
    static {
        final char[] charArray = ",6kRi*0\u007fQl*,eJk=(cYy`0oDz".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u000e';
                    break;
                }
                case 0: {
                    c2 = 'O';
                    break;
                }
                case 1: {
                    c2 = '^';
                    break;
                }
                case 2: {
                    c2 = '\n';
                    break;
                }
                case 3: {
                    c2 = '<';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    jt(final ChangeNumberOverview a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Log.i(jt.z);
        this.a.startActivity(new Intent((Context)this.a, (Class)ChangeNumber.class));
        this.a.finish();
    }
}
