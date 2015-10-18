// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Intent;
import android.view.View;
import com.whatsapp.util.co;

class a08 extends co
{
    private static final String z;
    final ConversationRowContact b;
    
    static {
        final char[] charArray = "An0;w".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0013';
                    break;
                }
                case 0: {
                    c2 = '7';
                    break;
                }
                case 1: {
                    c2 = '\r';
                    break;
                }
                case 2: {
                    c2 = 'Q';
                    break;
                }
                case 3: {
                    c2 = 'I';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    private a08(final ConversationRowContact b) {
        this.b = b;
    }
    
    a08(final ConversationRowContact conversationRowContact, final a2e a2e) {
        this(conversationRowContact);
    }
    
    @Override
    public void a(final View view) {
        final Intent intent = new Intent(this.b.getContext(), (Class)ViewSharedContactActivity.class);
        intent.putExtra(a08.z, this.b.t.c());
        this.b.getContext().startActivity(intent);
    }
}
