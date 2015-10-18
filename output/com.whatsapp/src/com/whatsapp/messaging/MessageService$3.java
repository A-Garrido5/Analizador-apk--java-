// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import com.whatsapp.Voip;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class MessageService$3 extends BroadcastReceiver
{
    private static final String[] z;
    final MessageService a;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0000Iuwq\u000bAwq7\u001bA*k1\u001fKpss\fMhb,WPlj;\u0017Qq";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '^';
                        break;
                    }
                    case 0: {
                        c2 = 'x';
                        break;
                    }
                    case 1: {
                        c2 = '$';
                        break;
                    }
                    case 2: {
                        c2 = '\u0005';
                        break;
                    }
                    case 3: {
                        c2 = '\u0007';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0000Iuwq\u000bAwq7\u001bA*k1\u001fKpss\fMhb,XMbi1\nMk`~\u001cQ`'*\u0017\u0004kr2\u0014\u0004vb0\u001cMk`~\u001bLdi0\u001dH";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\rJni1\u000fJ%n0\fAks~\nAfb7\u000eAa'7\u0016\u0004ih9\u0017Qq',\u001dG`n(\u001dV%";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    MessageService$3(final MessageService a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final boolean a = e.a;
        if (MessageService.j().equals(intent.getAction())) {
            Log.i(MessageService$3.z[0]);
            if (!App.n((Context)this.a)) {
                MessageService.a(this.a);
                MessageService.h(this.a);
                if (!a) {
                    return;
                }
            }
            if (Voip.d()) {
                MessageService.i(this.a);
                MessageService.e(this.a).e();
                if (!a) {
                    return;
                }
            }
            if (MessageService.e(this.a) != null) {
                MessageService.e(this.a).a(false);
                if (!a) {
                    return;
                }
            }
            Log.i(MessageService$3.z[1]);
            if (!a) {
                return;
            }
        }
        Log.w(MessageService$3.z[2] + intent);
    }
}
