// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.format.DateUtils;
import com.whatsapp.util.Log;
import android.os.CountDownTimer;

class ahk extends CountDownTimer
{
    private static final String[] z;
    final VerifySms a;
    
    static {
        final String[] z2 = new String[3];
        String s = "wSVtIwSTvIp_Ww\u000bqB";
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
                        c2 = 'd';
                        break;
                    }
                    case 0: {
                        c2 = '\u0004';
                        break;
                    }
                    case 1: {
                        c2 = '6';
                        break;
                    }
                    case 2: {
                        c2 = ':';
                        break;
                    }
                    case 3: {
                        c2 = '\u0012';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "rSH{\u0002}EWaKp_Ww\u000bqB\u001a";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "rSH{\u0002}EWaKp_Ww\u000bqB\u0017t\rjWV";
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
    
    ahk(final VerifySms a, final long n, final long n2) {
        this.a = a;
        super(n, n2);
    }
    
    public void onFinish() {
        Log.i(ahk.z[1] + VerifySms.i());
        if (VerifySms.i() == 1) {
            if ("".equals(VerifyNumber.m)) {
                this.a.c(ahk.z[0]);
            }
            VerifySms.g(this.a);
            if (!App.I) {
                return;
            }
        }
        VerifySms.i(this.a);
        Log.i(ahk.z[2]);
        if (this.a.q || this.a.isFinishing()) {
            this.a.g();
        }
    }
    
    public void onTick(final long n) {
        VerifySms.a(this.a, VerifySms.h(this.a) + VerifySms.b() - n);
        VerifySms.b(this.a).setProgress((int)(100.0 * VerifySms.q(this.a) / VerifySms.c(this.a)));
        VerifySms.e(n);
        VerifySms.B(this.a).setText((CharSequence)DateUtils.formatElapsedTime((VerifySms.c(this.a) - VerifySms.q(this.a)) / 1000L));
    }
}
