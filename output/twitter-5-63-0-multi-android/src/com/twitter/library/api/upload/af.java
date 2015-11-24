// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import com.twitter.library.provider.b;
import android.os.Parcelable;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.service.ab;
import android.content.Context;

public class af extends w
{
    public af(final Context context, final ab ab, final TwitterUser twitterUser) {
        super(context, af.class.getName(), ab, twitterUser);
    }
    
    @Override
    protected void a(final aa aa) {
        this.l = new ah(this.p, this.P()).a(ae.a(this.q.d, "1.1", "account", "remove_profile_banner").append(".json"));
        this.u();
        this.l.a(this.l.c().c(), aa);
        this.v();
        if (aa.a()) {
            final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>();
            this.a.g(null);
            list.add(this.a);
            final b w = this.W();
            this.V().a(list, -1L, -1, -1L, null, null, true, w);
            w.a();
        }
        this.o.putParcelable("user", (Parcelable)this.a);
    }
}
