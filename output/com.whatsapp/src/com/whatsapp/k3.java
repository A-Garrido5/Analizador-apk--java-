// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.util.Log;

class k3 implements Runnable
{
    private static final String[] z;
    final Voip$CallState a;
    final VoipActivity b;
    
    static {
        final String[] z2 = new String[3];
        String s = "p:;%?P:;%Qe!;#yr,}6qj9\u0001!qr0\u0011=qh2710u!3!u&hou^I\u001b\u0017ucn:%<~au&0hror";
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
                        c2 = '\u0010';
                        break;
                    }
                    case 0: {
                        c2 = '\u0006';
                        break;
                    }
                    case 1: {
                        c2 = 'U';
                        break;
                    }
                    case 2: {
                        c2 = 'R';
                        break;
                    }
                    case 3: {
                        c2 = 'U';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "e4<u~i!r&xi\"r6qj9r3qo9710k0!&qa0r7ue4'&u&#=<scu!0bp<100o&r;ej9|";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "p:;%?P:;%Qe!;#yr,}6qj9\u0001!qr0\u0011=qh2710u!3!u&hou^I\u001b\u0017uvo;;&xo;5uss' 0~ru36do#;!i";
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
    
    k3(final VoipActivity b, final Voip$CallState a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        Label_0192: {
            if (this.a == Voip$CallState.NONE) {
                if (VoipActivity.i(this.b) != null) {
                    Log.i(k3.z[0] + VoipActivity.i(this.b));
                    if (VoipActivity.c(this.b)) {
                        this.b.i();
                        if (!i) {
                            break Label_0192;
                        }
                    }
                    if (App.I()) {
                        App.b((Context)App.aq, VoipActivity.i(this.b), 1);
                        this.b.finish();
                        if (!i) {
                            break Label_0192;
                        }
                    }
                    if (VoipActivity.f(this.b) != null) {
                        VoipActivity.f(this.b).b(VoipActivity.i(this.b));
                        if (!i) {
                            break Label_0192;
                        }
                    }
                    Log.w(k3.z[1]);
                    if (!i) {
                        break Label_0192;
                    }
                }
                Log.i(k3.z[2]);
                this.b.finish();
                if (!i) {
                    break Label_0192;
                }
            }
            if (this.a == Voip$CallState.ACTIVE) {
                this.b.getWindow().clearFlags(128);
            }
        }
        VoipActivity.b(this.b);
    }
}
