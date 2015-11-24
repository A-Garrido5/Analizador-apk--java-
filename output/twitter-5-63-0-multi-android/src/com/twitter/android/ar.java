// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.service.a;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.service.z;

class ar extends z
{
    final /* synthetic */ Context a;
    final /* synthetic */ BaseDMMessageDialog b;
    
    ar(final BaseDMMessageDialog b, final Context a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        if (!((aa)y.l().b()).a()) {
            Toast.makeText(this.a, 2131297275, 0).show();
        }
    }
}
