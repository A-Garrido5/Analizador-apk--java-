// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.Collection;
import android.content.Context;
import android.widget.ArrayAdapter;
import com.twitter.android.util.ao;

class sn implements ao
{
    final /* synthetic */ ArrayAdapter a;
    final /* synthetic */ SignUpActivity b;
    
    sn(final SignUpActivity b, final ArrayAdapter a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a() {
        if (this.b.i.j()) {
            this.a.addAll((Collection)xi.b((Context)this.b));
        }
    }
}
