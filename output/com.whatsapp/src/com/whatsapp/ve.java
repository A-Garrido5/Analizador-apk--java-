// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.fieldstats.ak;
import android.content.Intent;
import android.content.Context;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.fieldstats.a1;
import android.view.View;
import android.view.View$OnClickListener;

class ve implements View$OnClickListener
{
    private static final String z;
    final ConversationsFragment a;
    
    static {
        final char[] charArray = "\u001bm\u0016Pb!s\rKu\n".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001b';
                    break;
                }
                case 0: {
                    c2 = '~';
                    break;
                }
                case 1: {
                    c2 = '\u0003';
                    break;
                }
                case 2: {
                    c2 = 'b';
                    break;
                }
                case 3: {
                    c2 = '\"';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ve(final ConversationsFragment a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        a5.a((Context)App.aq, a1.GROUP_CREATE_BANNER_CLICK, Integer.valueOf(1));
        final Intent intent = new Intent((Context)this.a.getActivity(), (Class)NewGroup.class);
        intent.putExtra(ve.z, ak.BANNER.getCode());
        this.a.startActivity(intent);
    }
}
