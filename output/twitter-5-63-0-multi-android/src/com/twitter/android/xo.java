// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.service.a;
import com.twitter.library.api.TwitterUser;
import com.twitter.android.client.x;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.library.platform.PushService;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.service.z;

class xo extends z
{
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ UrlInterpreterActivity c;
    
    xo(final UrlInterpreterActivity c, final Context a, final String b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final y y) {
        final boolean g = PushService.g(this.a, this.b);
        final TwitterUser a = ((py)y).a;
        final aa aa = (aa)y.l().b();
        if (a != null && aa.a() && g) {
            Toast.makeText(this.a, (CharSequence)this.c.getString(2131298062, new Object[] { a.c() }), 0).show();
            return;
        }
        if (a != null && (aa.c() == 1001 || !g)) {
            x.a(this.a).a(this.b, !g);
            return;
        }
        Toast.makeText(this.a, 2131296784, 1).show();
    }
}
