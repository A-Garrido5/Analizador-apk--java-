// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import android.widget.ProgressBar;
import android.view.View;
import android.os.CountDownTimer;

class yl extends CountDownTimer
{
    private static final String[] z;
    final VerifySms a;
    final long b;
    final View c;
    final ProgressBar d;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u000fD\u001bD%\u0000R\u0004^l\u001aN\u001cC7\u001dN\u001eC7\u0010L\f_l\u001dN\u0007Hl\rS\u0010\u00000\u0018W\fI \u0016E\f";
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
                        c2 = 'C';
                        break;
                    }
                    case 0: {
                        c2 = 'y';
                        break;
                    }
                    case 1: {
                        c2 = '!';
                        break;
                    }
                    case 2: {
                        c2 = 'i';
                        break;
                    }
                    case 3: {
                        c2 = '-';
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
                    s = "\r@\u0019]&\u001d";
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
    
    yl(final VerifySms a, final long n, final long n2, final ProgressBar d, final long b, final View c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
        super(n, n2);
    }
    
    public void onFinish() {
        VerifySms.j(this.a).setEnabled(true);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        final String n = VerifySms.n(this.a);
        if (n != null) {
            Log.i(yl.z[0]);
            VerifySms.f(this.a);
            a8s.a(new b2(this.a), new String[] { n, yl.z[1] });
        }
    }
    
    public void onTick(final long n) {
        this.d.setProgress((int)(100.0 * (this.b - n) / this.b));
    }
}
