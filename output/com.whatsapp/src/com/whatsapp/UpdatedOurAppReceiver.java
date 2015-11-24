// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class UpdatedOurAppReceiver extends BroadcastReceiver
{
    private static final String z;
    
    static {
        final char[] charArray = " \"Is)06Bg/4\"]`867Dd8'}_w>0;[w".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ']';
                    break;
                }
                case 0: {
                    c2 = 'U';
                    break;
                }
                case 1: {
                    c2 = 'R';
                    break;
                }
                case 2: {
                    c2 = '-';
                    break;
                }
                case 3: {
                    c2 = '\u0012';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public void onReceive(final Context context, final Intent intent) {
        Log.i(UpdatedOurAppReceiver.z);
        UpdatedAnyAppReceiver.a();
    }
}
