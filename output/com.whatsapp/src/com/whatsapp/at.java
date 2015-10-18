// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;

class at extends a9
{
    final ie s;
    
    at(final ie s, final bi bi, final long n, final boolean b) {
        this.s = s;
        super(bi, n, b);
    }
    
    @Override
    public void a(final t8 t8) {
        super.a(t8);
        if (t8 == t8.SUCCESS && this.n) {
            final bi bi = new bi(this.h);
            bi.e = true;
            App.b(bi, false);
        }
    }
    
    @Override
    public void onPostExecute(final Object o) {
        this.a((t8)o);
    }
}
