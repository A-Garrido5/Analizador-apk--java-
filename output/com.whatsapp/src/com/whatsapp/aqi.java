// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.notification.y;
import com.whatsapp.fieldstats.b9;
import android.content.Context;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.fieldstats.bc;
import android.content.DialogInterface;
import android.widget.CheckBox;
import android.content.DialogInterface$OnClickListener;

class aqi implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final Conversation a;
    final int[] b;
    final CheckBox c;
    final int[] d;
    
    static {
        final String[] z2 = new String[2];
        String s = "jkfT'ae\u007f\t1ytT\n\"lbn\b5ggn\t";
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
                        c2 = 'P';
                        break;
                    }
                    case 0: {
                        c2 = '\t';
                        break;
                    }
                    case 1: {
                        c2 = '\u0004';
                        break;
                    }
                    case 2: {
                        c2 = '\u000b';
                        break;
                    }
                    case 3: {
                        c2 = 'z';
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
                    s = "eex\u000e\u000fdq\u007f\u001f\u000fzag\u001f3}md\u0014";
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
    
    aqi(final Conversation a, final int[] b, final int[] d, final CheckBox c) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        App.aq.getSharedPreferences(aqi.z[0], 0).edit().putInt(aqi.z[1], this.b[0]).commit();
        final long n2 = 1000L * (60L * this.d[this.b[0]]);
        if (adc.f(this.a.s.u)) {
            final bc bc = new bc();
            bc.a = (double)n2;
            bc.b = (double)adc.a(this.a.s.u).j();
            a5.a((Context)this.a, bc);
        }
        y.a((Context)this.a, this.a.s.u, n2 + System.currentTimeMillis(), this.c.isChecked());
    }
}
