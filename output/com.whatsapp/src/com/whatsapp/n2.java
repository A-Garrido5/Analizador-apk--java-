// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.c_;
import java.util.Vector;

class n2 extends n9
{
    final GroupChatInfo j;
    
    n2(final GroupChatInfo j, final String s, final String s2, final Vector vector, final int n, final c_ c_) {
        this.j = j;
        super(s, s2, vector, n, c_);
    }
    
    @Override
    public void a(final int n) {
        this.j.runOnUiThread((Runnable)new pd(this, n));
    }
    
    @Override
    public void b() {
        super.b();
        if (!this.j.isFinishing()) {
            GroupChatInfo.i(this.j).postDelayed((Runnable)new d2(this), 300L);
        }
    }
}
