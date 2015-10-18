// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class jc implements View$OnClickListener
{
    private static final String[] z;
    final VoipActivity a;
    
    static {
        final String[] z2 = new String[2];
        String s = "i\u0002s8\u0002z\u0003~hA~\u0001vh@j\u0019n'L?\u001dh-Ql\b~hKqMT\u0007lZMi<Ck\b";
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
                        c2 = '\"';
                        break;
                    }
                    case 0: {
                        c2 = '\u001f';
                        break;
                    }
                    case 1: {
                        c2 = 'm';
                        break;
                    }
                    case 2: {
                        c2 = '\u001a';
                        break;
                    }
                    case 3: {
                        c2 = 'H';
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
                    s = "i\u0002s8\u0002z\u0003~hA~\u0001vh@j\u0019n'L?\u001dh-Ql\b~";
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
    
    jc(final VoipActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final boolean i = App.I;
        Log.i(jc.z[1]);
        final Voip$CallState currentCallState = Voip.getCurrentCallState();
        if (currentCallState == Voip$CallState.NONE) {
            Log.e(jc.z[0]);
            this.a.finish();
            if (!i) {
                return;
            }
        }
        if (currentCallState == Voip$CallState.RECEIVED_CALL) {
            VoipActivity.d(this.a);
            if (!i) {
                return;
            }
        }
        VoipActivity.h(this.a);
    }
}
