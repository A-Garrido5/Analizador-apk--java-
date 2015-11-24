// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.bm;
import com.whatsapp.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class pp implements DialogInterface$OnClickListener
{
    private static final String[] z;
    final ConversationsFragment$ExitGroupDialogFragment a;
    final a_9 b;
    
    static {
        final String[] z2 = new String[2];
        String s = "m(C\ra|4L\u000fma)^Tq}\"_Vp|>\u0000\u0017ao1H<va2]";
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
                        c2 = '\u0004';
                        break;
                    }
                    case 0: {
                        c2 = '\u000e';
                        break;
                    }
                    case 1: {
                        c2 = 'G';
                        break;
                    }
                    case 2: {
                        c2 = '-';
                        break;
                    }
                    case 3: {
                        c2 = '{';
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
                    s = "m(C\ra|4L\u000fma)^Tav.YTc|(X\u000b>";
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
    
    pp(final ConversationsFragment$ExitGroupDialogFragment a, final a_9 b) {
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        Log.i(pp.z[0]);
        Label_0086: {
            if (App.O()) {
                Log.i(pp.z[1] + this.b);
                App.a(this.b.u, true);
                bm.a(new _9(this));
                if (!App.I) {
                    break Label_0086;
                }
            }
            App.a(this.a.getActivity().getBaseContext(), 2131231115, 0);
        }
        ConversationsFragment.c(1 + ConversationsFragment.g());
        this.a.dismiss();
    }
}
