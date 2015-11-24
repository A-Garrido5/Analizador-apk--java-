// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.fieldstats.j;
import java.util.TimerTask;

class ao0 extends TimerTask
{
    final _r a;
    
    public ao0(final _r a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (!_r.b(this.a)) {
            this.a.l = true;
            _r.a().remove(_r.a(this.a).toString());
            if (!this.a.k) {
                _r.g.obtainMessage(2, (Object)this.a.b).sendToTarget();
            }
            _r.a(this.a, j.TIMEOUT);
            if (this.a.m != null) {
                l7.a(this.a.m.a, 500);
            }
        }
    }
}
