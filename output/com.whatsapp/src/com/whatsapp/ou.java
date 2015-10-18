// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.os.Message;
import android.os.Looper;
import android.os.Handler;

final class ou extends Handler
{
    ou(final Looper looper) {
        super(looper);
    }
    
    private void a(final String s) {
        final a_9 e = App.S.e(s);
        if (e != null) {
            e.w();
        }
        App.y(s);
    }
    
    public void handleMessage(final Message message) {
        final boolean i = App.I;
        Label_0196: {
            switch (message.what) {
                case 1: {
                    final String s = (String)message.obj;
                    this.a(s);
                    if (adc.b(s)) {
                        App.a(App.aq.getApplicationContext(), App.aq.getString(2131231203), 0);
                        if (!i) {
                            break;
                        }
                    }
                    final a_d e = App.S.e();
                    if (e != null && s.equals(e.u)) {
                        App.a(App.aq.getApplicationContext(), App.aq.getString(2131231500), 0);
                    }
                    if (i) {
                        break Label_0196;
                    }
                    break;
                }
                case 2: {
                    final String s2 = (String)message.obj;
                    this.a(s2);
                    App.c(s2, message.arg1);
                    final Context applicationContext = App.aq.getApplicationContext();
                    final App aq = App.aq;
                    int n;
                    if (adc.b(s2)) {
                        n = 2131231120;
                    }
                    else {
                        n = 2131231123;
                    }
                    App.a(applicationContext, aq.getString(n), 0);
                    if (i) {
                        break Label_0196;
                    }
                    break;
                }
                case 3: {
                    final String s3 = (String)message.obj;
                    this.a(s3);
                    App.c(s3, message.arg1);
                    App.a(App.aq.getApplicationContext(), App.aq.getString(2131231122), 0);
                }
            }
        }
    }
}
