// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.view.View;
import android.content.Intent;
import android.text.style.ClickableSpan;

public final class ah9 extends ClickableSpan
{
    private static final String z;
    private final Intent a;
    
    static {
        final char[] charArray = "sz$)\u0005{m)m\u001a|m5.\u0007?j !\u001d=~?`\u001a|m5.\u0007/".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 's';
                    break;
                }
                case 0: {
                    c2 = '\u0012';
                    break;
                }
                case 1: {
                    c2 = '\u0019';
                    break;
                }
                case 2: {
                    c2 = 'P';
                    break;
                }
                case 3: {
                    c2 = '@';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public ah9(final Intent a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Log.i(ah9.z + this.a);
        view.getContext().startActivity(this.a);
    }
}
