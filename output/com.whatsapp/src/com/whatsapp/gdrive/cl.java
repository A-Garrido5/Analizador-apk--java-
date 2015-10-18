// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import android.app.Dialog;
import com.whatsapp.util.Log;
import android.content.DialogInterface$OnCancelListener;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

class cl implements Runnable
{
    private static final String z;
    final ac a;
    
    static {
        final char[] charArray = "Z\\5n\u0011G^27\u001fMK(l\u001d\u0006^1iU\\W l\u0019@U x\u0014L\u0019/uX^X8:\fF\u0019(t\u000b]X-vV".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'x';
                    break;
                }
                case 0: {
                    c2 = ')';
                    break;
                }
                case 1: {
                    c2 = '9';
                    break;
                }
                case 2: {
                    c2 = 'A';
                    break;
                }
                case 3: {
                    c2 = '\u001a';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    cl(final ac a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        final Dialog a = a7.a(GooglePlayServicesUtil.isGooglePlayServicesAvailable((Context)this.a.a), this.a.a, 0, (DialogInterface$OnCancelListener)new d(this), true);
        if (a != null) {
            if (this.a.a.isFinishing()) {
                return;
            }
            a.show();
            if (GoogleDriveService.F == 0) {
                return;
            }
        }
        Log.e(cl.z);
    }
}
