// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class Conversation$60 extends BroadcastReceiver
{
    private static final String z;
    final Conversation a;
    
    static {
        final char[] charArray = "B\bBFLS\u0014MD@N\t\u0003BLR\u0002X\u001d@L\u0002".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ')';
                    break;
                }
                case 0: {
                    c2 = '!';
                    break;
                }
                case 1: {
                    c2 = 'g';
                    break;
                }
                case 2: {
                    c2 = ',';
                    break;
                }
                case 3: {
                    c2 = '0';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    Conversation$60(final Conversation a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        this.a.unregisterReceiver((BroadcastReceiver)this);
        Log.i(Conversation$60.z);
        this.a.aL.restartInput((View)Conversation.m(this.a));
    }
}
