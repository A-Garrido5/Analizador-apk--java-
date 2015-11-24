// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import android.content.Context;

final class ll extends lh
{
    final boolean n;
    final PlaceInfo o;
    
    ll(final Context context, final bi bi, final PlaceInfo o, final boolean n) {
        this.o = o;
        this.n = n;
        super(context, bi);
    }
    
    @Override
    public Boolean a(final Void[] array) {
        if (!this.o.hasDetails) {
            this.o.downloadDetails();
            this.i.d = this.o.url;
            if (this.n && this.o.address != null) {
                final StringBuilder sb = new StringBuilder();
                final bi i = this.i;
                i.k = sb.append(i.k).append("\n").append(this.o.address).toString();
            }
        }
        return super.a(array);
    }
    
    @Override
    public Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
}
