// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import com.whatsapp.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class MessageService$4 extends BroadcastReceiver
{
    private static final String[] z;
    final MessageService a;
    
    static {
        final String[] z2 = new String[2];
        String s = "O\u001blCiD\u0013nE/T\u00133P*^\u0013rGkG\u001frT#E[hZ+R\u00043U/E\u0013'\u00135R\u0018xZ(P5tR(Y\u0013p\u001d(^\u001a#\u000e";
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
                        c2 = 'F';
                        break;
                    }
                    case 0: {
                        c2 = '7';
                        break;
                    }
                    case 1: {
                        c2 = 'v';
                        break;
                    }
                    case 2: {
                        c2 = '\u001c';
                        break;
                    }
                    case 3: {
                        c2 = '3';
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
                    s = "B\u0018w])@\u0018<Z(C\u0013rGfE\u0013\u007fV/A\u0013x\u0013/YV\u007f_/R\u0018h\u00136^\u0018{V4\u0017\u0004yP#^\u0000yAf";
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
    
    MessageService$4(final MessageService a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        if (MessageService.k().equals(intent.getAction())) {
            final StringBuilder append = new StringBuilder().append(MessageService$4.z[0]);
            final f e = MessageService.e(this.a);
            boolean b = false;
            if (e == null) {
                b = true;
            }
            Log.i(append.append(b).toString());
            if (MessageService.e(this.a) == null) {
                return;
            }
            MessageService.e(this.a).e();
            if (!com.whatsapp.messaging.e.a) {
                return;
            }
        }
        Log.w(MessageService$4.z[1] + intent);
    }
}
