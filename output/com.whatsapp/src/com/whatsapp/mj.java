// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class mj implements View$OnClickListener
{
    private static final String[] z;
    final Conversation a;
    
    static {
        final String[] z2 = new String[2];
        String s = "~U/i7v_er6k^%ov~X?r7q\u0015\u001bR\u001bT";
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
                        c2 = 'X';
                        break;
                    }
                    case 0: {
                        c2 = '\u001f';
                        break;
                    }
                    case 1: {
                        c2 = ';';
                        break;
                    }
                    case 2: {
                        c2 = 'K';
                        break;
                    }
                    case 3: {
                        c2 = '\u001b';
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
                    s = "iU/59q_9t1{\u0015(n*lT95<vIdx7qO*x,";
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
    
    mj(final Conversation a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Conversation.G(this.a).dismiss();
        final Intent intent = new Intent(mj.z[0]);
        intent.setType(mj.z[1]);
        try {
            this.a.startActivityForResult(intent, 7);
            Conversation.a_ = false;
        }
        catch (ActivityNotFoundException ex) {
            App.a((Context)this.a, 2131230786, 0);
        }
    }
}
