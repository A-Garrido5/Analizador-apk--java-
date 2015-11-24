// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.TimerTask;

class r6 extends TimerTask
{
    private static final String z;
    a0p a;
    
    static {
        final char[] charArray = "][\u001f\b\n[R.\u001f\u001dKK\u0014\u001e\feJ\u0018\u0000\u001dUK\u0005B\fCN\u0014W".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'x';
                    break;
                }
                case 0: {
                    c2 = ':';
                    break;
                }
                case 1: {
                    c2 = '>';
                    break;
                }
                case 2: {
                    c2 = 'q';
                    break;
                }
                case 3: {
                    c2 = 'm';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public r6(final a0p a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (this.a.n) {
            return;
        }
        Log.i(r6.z + this.a.d);
        this.a.g = true;
        switch (this.a.d) {
            case 2: {
                App.aq.a5().post(a0p.a(this.a));
                break;
            }
        }
        a0p.l.remove(this.a.e);
    }
}
