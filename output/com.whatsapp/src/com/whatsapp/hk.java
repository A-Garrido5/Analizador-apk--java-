// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.content.Context;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.fieldstats.a1;
import android.view.View;
import android.view.View$OnClickListener;

class hk implements View$OnClickListener
{
    private static final String[] z;
    final ConversationsFragment a;
    
    static {
        final String[] z2 = new String[4];
        String s = "PpJ\u0002NV]H\u0011UFrp\u0017SC]L\fO]v";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ':';
                        break;
                    }
                    case 0: {
                        c2 = '3';
                        break;
                    }
                    case 1: {
                        c2 = '\u0002';
                        break;
                    }
                    case 2: {
                        c2 = '/';
                        break;
                    }
                    case 3: {
                        c2 = 'c';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "PpJ\u0002NV]H\u0011UFrp\u0017SC][\nWV";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "PmBMM[c[\u0010[Crp\u0013HVdJ\u0011_]aJ\u0010";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "PpJ\u0002NV]H\u0011UFrp\u0017SC]L\fO]v";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    hk(final ConversationsFragment a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        a5.a((Context)App.aq, a1.GROUP_CREATE_BANNER_CANCEL, Integer.valueOf(1));
        this.a.i.setVisibility(8);
        final SharedPreferences sharedPreferences = App.aq.getSharedPreferences(hk.z[2], 0);
        final int int1 = sharedPreferences.getInt(hk.z[3], 0);
        final SharedPreferences$Editor edit = sharedPreferences.edit();
        edit.putInt(hk.z[0], int1 + 1);
        edit.putLong(hk.z[1], System.currentTimeMillis());
        edit.commit();
    }
}
