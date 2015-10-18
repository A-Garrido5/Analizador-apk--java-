// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Parcelable;
import android.content.Context;
import android.net.Uri;
import android.content.Intent;
import android.os.Message;
import com.whatsapp.messaging.af;

final class kt implements af
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u0002q\u0000o7\u0006q<g;\u0003g\u0002m;";
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
                        c2 = '^';
                        break;
                    }
                    case 0: {
                        c2 = 'p';
                        break;
                    }
                    case 1: {
                        c2 = '\u0014';
                        break;
                    }
                    case 2: {
                        c2 = 'c';
                        break;
                    }
                    case 3: {
                        c2 = '\n';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001fv\t*7\u001e4 k2\u001c4.o-\u0003u\u0004o~\u0019gCd1\u000443k,\u0013q\u000fk<\u001cq";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0015l\u0017x?/f\u0006i;\u0019b\u0006U3\u0015g\u0010k9\u0015";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u0015l\u0017x?/f\u0006i;\u0019b\u0006U3\u0015g\u0010k9\u0015K\fh4";
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
    
    @Override
    public void a(final Message message) {
        final Intent intent = new Intent(kt.z[0], (Uri)null, (Context)App.aq, (Class)VoiceService.class);
        Label_0052: {
            if (message.obj == null) {
                break Label_0052;
            }
            try {
                final Parcelable parcelable = (Parcelable)message.obj;
                message.obj = null;
                intent.putExtra(kt.z[3], parcelable);
                intent.putExtra(kt.z[2], (Parcelable)message);
                App.aq.startService(intent);
            }
            catch (ClassCastException ex) {
                throw new RuntimeException(kt.z[1]);
            }
        }
    }
}
