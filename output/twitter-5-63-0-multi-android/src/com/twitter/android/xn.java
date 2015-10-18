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

class xn extends z
{
    final /* synthetic */ Context a;
    final /* synthetic */ xm b;
    
    xn(final xm b, final Context a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        final aa aa = (aa)y.l().b();
        if (!aa.a()) {
            final int c = aa.c();
            int n;
            if (400 == c) {
                n = 2131296838;
            }
            else if (401 == c) {
                n = 2131296839;
            }
            else {
                n = 2131296837;
            }
            Toast.makeText(this.a, n, 0).show();
        }
    }
}
