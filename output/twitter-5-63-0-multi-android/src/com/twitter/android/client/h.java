// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.util.a;
import com.twitter.library.platform.TwitterDataSyncService;
import com.twitter.library.client.Session;
import com.twitter.library.client.ay;

final class h extends ay
{
    final /* synthetic */ c a;
    
    public h(final c a) {
        this.a = a;
    }
    
    @Override
    public void a(final Session session) {
        this.a.a(session);
    }
    
    @Override
    public void a(final Session session, final boolean b) {
        this.a.a(session, b);
    }
    
    @Override
    public void b(final Session session, final boolean b) {
        if (b) {
            this.a.a(session);
        }
        final cj a = cj.a(this.a.a);
        final WidgetControl a2 = a.a(session.g());
        if (a2 != null) {
            a2.b();
            a.a(session, false);
        }
        TwitterDataSyncService.a(this.a.a);
    }
    
    @Override
    public void c(final Session session, final boolean b) {
        this.a.a(session.g(), "notification:status_bar::unauthorised:impression");
        com.twitter.library.util.a.b(this.a.a, session.e());
        x.a(this.a.a).a(session);
        this.a.a(session, b);
    }
}
