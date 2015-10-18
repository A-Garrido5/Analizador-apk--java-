// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.text.TextUtils;
import com.twitter.library.api.b;
import com.twitter.library.featureswitch.d;
import com.twitter.library.util.bk;
import android.content.Context;
import com.twitter.internal.android.service.a;
import com.twitter.library.util.bq;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class x extends z
{
    final /* synthetic */ v a;
    
    private x(final v a) {
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        final boolean a = ((aa)y.l().b()).a();
        final String e = this.a.c.b().e();
        final k k = new k(this.a.b, e);
        if (a) {
            if (y instanceof ot) {
                k.a().a("app_graph_timestamp", System.currentTimeMillis() + 1000L * bq.a.nextInt(600)).apply();
            }
            else {
                String s = "";
                if (y instanceof ov) {
                    s = ((ov)y).f();
                }
                else if (y instanceof ow) {
                    s = ((ow)y).f();
                }
                this.a.b(s);
                if ("optin".equals(s)) {
                    this.a.c(e);
                }
            }
        }
    }
}
