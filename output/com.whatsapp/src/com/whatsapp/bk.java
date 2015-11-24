// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Process;
import android.content.Intent;
import android.view.View;
import android.view.View$OnClickListener;

class bk implements View$OnClickListener
{
    private static final String z;
    final ah_ a;
    
    static {
        final char[] charArray = "&\u0004:E\u001e.\u000epD\u00143\u001e7Y\u00164D\u001av%\u00025\rr%\u0013#\u0010p\"".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'q';
                    break;
                }
                case 0: {
                    c2 = 'G';
                    break;
                }
                case 1: {
                    c2 = 'j';
                    break;
                }
                case 2: {
                    c2 = '^';
                    break;
                }
                case 3: {
                    c2 = '7';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    bk(final ah_ a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.c.startActivity(new Intent(bk.z));
        this.a.c.finish();
        Process.killProcess(Process.myPid());
    }
}
