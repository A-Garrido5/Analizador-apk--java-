// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.media;

import android.util.Log;
import android.view.KeyEvent;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class TransportMediatorJellybeanMR2$3 extends BroadcastReceiver
{
    private static final String[] z;
    final TransportMediatorJellybeanMR2 this$0;
    
    static {
        final String[] z2 = new String[2];
        String s = "!P\\ve)Z\u0016md4[Vp$%FLvknu}]U\u0005h}J^";
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
                        c2 = '\n';
                        break;
                    }
                    case 0: {
                        c2 = '@';
                        break;
                    }
                    case 1: {
                        c2 = '>';
                        break;
                    }
                    case 2: {
                        c2 = '8';
                        break;
                    }
                    case 3: {
                        c2 = '\u0004';
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
                    s = "\u0014LYjy0QJpI/PLve,R]v";
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
    
    public void onReceive(final Context context, final Intent intent) {
        try {
            this.this$0.mTransportCallback.handleKey((KeyEvent)intent.getParcelableExtra(TransportMediatorJellybeanMR2$3.z[0]));
        }
        catch (ClassCastException ex) {
            Log.w(TransportMediatorJellybeanMR2$3.z[1], (Throwable)ex);
        }
    }
}
