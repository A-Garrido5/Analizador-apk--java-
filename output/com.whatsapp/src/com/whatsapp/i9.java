// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.os.Message;
import android.os.Build$VERSION;
import android.app.Activity;
import java.lang.ref.WeakReference;
import android.os.Handler;

final class i9 extends Handler
{
    private static final String z;
    private final WeakReference a;
    
    static {
        final char[] charArray = "\u007fmg^NpefP[}ggR@ldeRZ&||ZMf}a".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '(';
                    break;
                }
                case 0: {
                    c2 = '\t';
                    break;
                }
                case 1: {
                    c2 = '\b';
                    break;
                }
                case 2: {
                    c2 = '\u0015';
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
    
    private i9(final WeakReference a) {
        this.a = a;
    }
    
    i9(final WeakReference weakReference, final zn zn) {
        this(weakReference);
    }
    
    private boolean a(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 17) {
            return activity.isDestroyed();
        }
        return activity.isFinishing();
    }
    
    public void handleMessage(final Message message) {
        final Activity activity = (Activity)this.a.get();
        if (activity == null) {
            this.removeMessages(1);
        }
        else {
            switch (message.what) {
                default: {}
                case 1: {
                    Log.e(i9.z);
                    this.removeMessages(1);
                    if (!this.a(activity)) {
                        activity.showDialog(200);
                        return;
                    }
                    break;
                }
            }
        }
    }
}
