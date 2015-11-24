// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.location.Location;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

class b6 implements Runnable
{
    final ao2 a;
    
    b6(final ao2 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.g = dt.c.b(ao2.a(this.a));
        ao2.b(this.a);
        ao2.c(this.a).notifyDataSetChanged();
        final Location e = this.a.e();
        if (e != null) {
            Collections.sort((List<Object>)this.a.g, new jz(this, e.getLatitude(), e.getLongitude()));
        }
        this.a.a();
    }
}
