// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.view.View;
import com.whatsapp.util.co;

class a0r extends co
{
    private static final String z;
    final ConversationRowMedia b;
    
    static {
        final char[] charArray = ":\"pJH-czKP7/qECy.{@N8csAT*\"yA\u0007.*jL\u00077,>IB=*\u007f\u0004F-7\u007fGO<'".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\'';
                    break;
                }
                case 0: {
                    c2 = 'Y';
                    break;
                }
                case 1: {
                    c2 = 'C';
                    break;
                }
                case 2: {
                    c2 = '\u001e';
                    break;
                }
                case 3: {
                    c2 = '$';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a0r(final ConversationRowMedia b) {
        this.b = b;
    }
    
    @Override
    public void a(final View view) {
        if (this.b.t.d != null) {
            App.a((DialogToastActivity)this.b.getContext(), this.b.t);
            if (!App.I) {
                return;
            }
        }
        Log.e(a0r.z);
        App.a(this.b.getContext(), 2131231256, 0);
    }
}
