// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public final class q4 extends qy
{
    public q4(final a_9 a_9) {
        super(a_9);
    }
    
    @Override
    protected boolean b(final a_9 a_9) {
        ad6 ad6;
        if (a_9.x != null) {
            ad6 = a_9.x;
        }
        else {
            ad6 = com.whatsapp.ad6.getDefault();
        }
        ad6 ad7;
        if (this.a.x != null) {
            ad7 = this.a.x;
        }
        else {
            ad7 = com.whatsapp.ad6.getDefault();
        }
        final boolean b = ad6 != ad7;
        a_9.x = this.a.x;
        return b;
    }
}
