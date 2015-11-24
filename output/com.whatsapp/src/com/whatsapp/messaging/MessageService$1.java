// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import com.whatsapp.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class MessageService$1 extends BroadcastReceiver
{
    private static final String[] z;
    final MessageService a;
    
    static {
        final String[] z2 = new String[4];
        String s = "}I\u0004,&\u007f\b\u0019/ckG\u001e4cx@\b#(UM\u00197,iC>4\"oMM26uF\f\"/~\u0012M";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'C';
                        break;
                    }
                    case 0: {
                        c2 = '\u001b';
                        break;
                    }
                    case 1: {
                        c2 = '(';
                        break;
                    }
                    case 2: {
                        c2 = 'm';
                        break;
                    }
                    case 3: {
                        c2 = '@';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "nF\u0006.,lFM)-oM\u00034ciM\u000e%*mM\t`*u\b\u000e/-uM\u000e4*mA\u00199ciM\u000e%*mM\u001f`";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "zF\t2,rLC.&o\u0006\u000e/-u\u0006.\u000f\rUm.\u0014\nMa9\u0019\u001cX`,\u000e\u0004^";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "}I\u0004,&\u007f\b\u0019/ckG\u001e4cx@\b#(UM\u00197,iC>4\"oMM26uF\f\"/~\u0012M";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    MessageService$1(final MessageService a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final boolean a = e.a;
        if (MessageService$1.z[2].equals(intent.getAction())) {
            if (!MessageService.f(this.a).post((Runnable)new b_(this))) {
                Log.w(MessageService$1.z[3] + intent);
            }
            if (!a) {
                return;
            }
        }
        if (MessageService.r().equals(intent.getAction())) {
            if (!MessageService.f(this.a).post((Runnable)new bt(this))) {
                Log.w(MessageService$1.z[0] + intent);
            }
            if (!a) {
                return;
            }
        }
        Log.w(MessageService$1.z[1] + intent);
    }
}
