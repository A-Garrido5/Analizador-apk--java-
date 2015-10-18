// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import android.view.View$OnClickListener;
import android.content.Context;
import com.whatsapp.util.cq;
import android.os.Message;
import android.os.Handler;

class cb extends Handler
{
    final SetStatus a;
    
    cb(final SetStatus a) {
        this.a = a;
    }
    
    public void handleMessage(final Message message) {
        final boolean i = App.I;
        Label_0128: {
            Label_0119: {
                if (message.what == 1) {
                    this.a.p.setText(cq.c(App.aB, this.a.getBaseContext()));
                    final Iterator<String> iterator = SetStatus.r.iterator();
                    int n = 0;
                Label_0083:
                    while (true) {
                        while (iterator.hasNext()) {
                            int n2;
                            if (iterator.next().equals(App.aB)) {
                                if (!i) {
                                    n2 = 1;
                                    break Label_0083;
                                }
                                n2 = 1;
                            }
                            else {
                                n2 = n;
                            }
                            if (!i) {
                                n = n2;
                                continue;
                            }
                            if (n2 == 0) {
                                SetStatus.r.add(0, App.aB);
                            }
                            this.a.m.notifyDataSetInvalidated();
                            SetStatus.d(this.a);
                            if (i) {
                                break Label_0119;
                            }
                            break Label_0128;
                        }
                        int n2 = n;
                        continue Label_0083;
                    }
                }
            }
            App.a((Context)App.aq, 2131231789, 0);
        }
        this.a.removeDialog(2);
        SetStatus.c(this.a).setOnClickListener((View$OnClickListener)new v0(this));
    }
}
