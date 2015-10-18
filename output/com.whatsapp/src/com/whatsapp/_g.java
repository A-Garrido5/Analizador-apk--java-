// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Message;
import java.util.Iterator;
import org.whispersystems.jobqueue.a;
import com.whatsapp.jobqueue.job.SendWebForwardJob;
import com.whatsapp.messaging.e;
import com.whatsapp.protocol.bi;
import com.whatsapp.protocol.cq;
import java.util.ArrayList;
import java.util.List;

final class _g implements Runnable
{
    final rs a;
    final String b;
    final boolean c;
    final int d;
    final List e;
    
    _g(final List e, final rs a, final String b, final int d, final boolean c) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    @Override
    public void run() {
        while (true) {
            final boolean i = App.I;
        Label_0181_Outer:
            while (true) {
            Label_0164_Outer:
                while (true) {
                Label_0334:
                    while (true) {
                        cq cq = null;
                        Label_0327: {
                            cq b = null;
                            Label_0320: {
                                try {
                                    final ArrayList<cq> list = new ArrayList<cq>();
                                    if (this.e != null) {
                                        final Iterator<bi> iterator = (Iterator<bi>)this.e.iterator();
                                        if (iterator.hasNext()) {
                                            final bi m = iterator.next();
                                            if (m.c == 6) {
                                                b = adc.b(m);
                                                if (!i) {
                                                    break Label_0320;
                                                }
                                            }
                                            cq = new cq();
                                            cq.m = m;
                                            if (m.s == null && z8.a(m.a.a).m()) {
                                                a_9 e;
                                                if (m.t != null) {
                                                    e = App.S.e(m.t);
                                                }
                                                else {
                                                    e = null;
                                                }
                                                final bi j = cq.m;
                                                String o;
                                                if (e != null) {
                                                    o = e.o;
                                                }
                                                else {
                                                    o = null;
                                                }
                                                j.s = o;
                                            }
                                            break Label_0327;
                                        }
                                    }
                                    this.a.b();
                                    final lr lr = new lr(new j4(this.b, this.e, this.d, this.c));
                                    String s = null;
                                    Message message = null;
                                    Label_0270: {
                                        if (this.b == null) {
                                            s = l7.o();
                                            message = com.whatsapp.messaging.e.a(s, this.d, list, lr);
                                            if (!i) {
                                                break Label_0270;
                                            }
                                        }
                                        s = this.b;
                                        message = com.whatsapp.messaging.e.a(this.b, list, 4, null, lr);
                                    }
                                    App.aq.aG.a(new SendWebForwardJob(s, message));
                                    return;
                                    // iftrue(Label_0334:, cq2 == null)
                                    final cq cq2;
                                    list.add(cq2);
                                    break Label_0334;
                                }
                                finally {
                                    this.a.a();
                                }
                            }
                            final cq cq2 = b;
                            continue;
                        }
                        final cq cq2 = cq;
                        continue;
                    }
                    if (i) {
                        continue Label_0164_Outer;
                    }
                    break;
                }
                continue Label_0181_Outer;
            }
        }
    }
}
