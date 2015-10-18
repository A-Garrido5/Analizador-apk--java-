// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;

class si extends sj
{
    final MessageDetailsActivity a;
    
    si(final MessageDetailsActivity a) {
        this.a = a;
    }
    
    private void d(final bi bi) {
        this.a.runOnUiThread((Runnable)new te(this, bi));
    }
    
    @Override
    public void a(final bi bi) {
        this.d(bi);
    }
    
    @Override
    public void a(final String s) {
        if (s != null && s.equals(MessageDetailsActivity.e(this.a).a.a) && App.ak.a(MessageDetailsActivity.e(this.a).a) == null) {
            this.a.finish();
        }
    }
    
    @Override
    public void b(final bi bi, final int n) {
        this.d(bi);
    }
}
