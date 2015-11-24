// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;

class u2 implements ServiceConnection
{
    private static final String[] z;
    final VoipActivity a;
    
    static {
        final String[] z2 = new String[2];
        String s = "?i\u001ek}\u001fi\u001ek\u0013*r\u001em;=\u007fXt<\u001ac\u0005m;*c4t<'c\u0014o7-";
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
                        c2 = 'R';
                        break;
                    }
                    case 0: {
                        c2 = 'I';
                        break;
                    }
                    case 1: {
                        c2 = '\u0006';
                        break;
                    }
                    case 2: {
                        c2 = 'w';
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
                    s = "?i\u001ek}\u001fi\u001ek\u0013*r\u001em;=\u007fXt<\u001ac\u0005m;*c3r!*i\u0019u7*r\u0012\u007f";
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
    
    u2(final VoipActivity a) {
        this.a = a;
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        Log.i(u2.z[0]);
        final pk pk = (pk)binder;
        VoipActivity.a(this.a, true);
        VoipActivity.a(this.a, pk.a());
        VoipActivity.f(this.a).a(this.a);
        this.a.a(Voip$CallState.NONE, Voip.getCallInfo());
        VoipActivity.b(this.a);
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        Log.i(u2.z[1]);
        VoipActivity.f(this.a).a((px)null);
        VoipActivity.a(this.a, null);
        VoipActivity.a(this.a, false);
    }
}
