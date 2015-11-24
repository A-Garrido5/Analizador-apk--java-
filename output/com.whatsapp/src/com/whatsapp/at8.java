// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.whispersystems.jobqueue.a;
import com.whatsapp.jobqueue.job.SendWebForwardJob;
import com.whatsapp.messaging.e;
import java.util.List;

final class at8 implements Runnable
{
    final List a;
    final String b;
    
    at8(final List a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        final List a = App.a(this.a);
        if (a.size() > 0) {
            String s;
            if (this.b == null) {
                s = Integer.toString(App.S.h());
            }
            else {
                s = this.b;
            }
            final lr lr = new lr(new jk(this.a, s));
            final String o = l7.o();
            App.aq.aG.a(new SendWebForwardJob(o, e.a(o, a, s, lr)));
        }
    }
}
