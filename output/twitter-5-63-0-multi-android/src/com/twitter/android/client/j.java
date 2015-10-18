// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.library.api.ay;
import com.twitter.library.api.UrlConfiguration;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.ClientConfiguration;
import com.twitter.library.api.account.e;
import com.twitter.library.util.a;
import com.twitter.library.network.ae;
import com.twitter.library.service.y;
import com.twitter.library.api.PromotedContent;
import android.os.Bundle;
import com.twitter.android.dialog.RateLimitDialogFragmentActivity;
import android.content.Intent;
import com.twitter.android.DialogActivity;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.service.aa;
import com.twitter.library.client.Session;
import com.twitter.library.api.timeline.w;
import android.widget.Toast;
import com.twitter.library.client.az;
import android.content.Context;
import com.twitter.library.service.z;

public class j extends z
{
    private final Context a;
    private final az b;
    
    protected j(final Context a) {
        this.a = a;
        this.b = az.a(a);
    }
    
    private void a(final int n) {
        Toast.makeText(this.a, n, 1).show();
    }
    
    private void a(final int n, final Object... array) {
        Toast.makeText(this.a, (CharSequence)this.a.getString(n, array), 1).show();
    }
    
    private void a(final w w, final Session session) {
        if (((aa)w.l().b()).a() && w.H() == 0L && w.K() > 0) {
            cj.a(this.a).a(session, false);
        }
    }
    
    private void a(final pb pb, final Context context, final Session session) {
        final int c = ((aa)pb.l().b()).c();
        final int[] f = pb.f();
        if (c == 403) {
            if (CollectionUtils.a(f, 226)) {
                context.startActivity(new Intent(context, (Class)DialogActivity.class).setAction("blocked_spammer_follow").setFlags(268435456));
            }
            else {
                if (CollectionUtils.a(f, 225)) {
                    context.startActivity(new Intent(context, (Class)DialogActivity.class).setAction("blocked_automated_spammer").setFlags(268435456));
                    return;
                }
                if (CollectionUtils.a(f, 162)) {
                    this.a(2131298055);
                    return;
                }
                if (CollectionUtils.a(f, 344)) {
                    RateLimitDialogFragmentActivity.a(context);
                    return;
                }
                if (!CollectionUtils.a(f, 250)) {
                    this.a(2131298054);
                    ce.a(this.a).a(f);
                    return;
                }
                if (ce.a(this.a).b()) {
                    this.a(2131296309);
                    return;
                }
                if (session.d()) {
                    final Bundle bundle = new Bundle();
                    bundle.putLong("user_id", pb.u());
                    final PromotedContent v = pb.v();
                    if (v != null) {
                        bundle.putString("impression_id", v.impressionId);
                        bundle.putBoolean("earned", v.b());
                    }
                    bundle.putLong("age_before_timestamp", pb.g());
                    x.a(context).a(bundle, session);
                }
            }
            return;
        }
        this.a(2131298054);
    }
    
    @Override
    public void a(final y y) {
        final Session c = az.a(this.a).c(y.P().a);
        if (c != null) {
            final aa aa = (aa)y.l().b();
            if (!aa.a() && ae.a(aa)) {
                ce.a(this.a).a(c, aa);
            }
            if (y instanceof w) {
                this.a((w)y, c);
                return;
            }
            if (y instanceof oe) {
                if (aa.a()) {
                    this.a(2131297289, aa.c.getString("muted_username"));
                    return;
                }
                this.a(2131297288);
            }
            else if (y instanceof of) {
                if (aa.a()) {
                    this.a(2131298032, aa.c.getString("muted_username"));
                    return;
                }
                this.a(2131298031);
            }
            else if (y instanceof od) {
                final od od = (od)y;
                if (od.O() == 3) {
                    if (aa.a()) {
                        this.a(2131298024, od.h.username);
                        return;
                    }
                    this.a(2131298090);
                    t.a(od.P().a).b(od.a, 4);
                }
                else if (od.O() == 1) {
                    if (aa.a()) {
                        this.a(2131296377, od.g.username);
                        return;
                    }
                    this.a(2131298049);
                    t.a(od.P().a).c(od.a, 4);
                }
                else if (od.O() == 2) {
                    final boolean f = od.f;
                    final String i = od.i;
                    if (!aa.a()) {
                        this.a(2131298080);
                        return;
                    }
                    if (!"abuse".equals(i) && f) {
                        this.a(2131296377, od.g.username);
                    }
                }
            }
            else if (y instanceof pb) {
                final pb pb = (pb)y;
                final Context a = this.a;
                if (aa.a()) {
                    if (pb.t() != null && pb.x()) {
                        this.a(2131298056, pb.t().c());
                    }
                }
                else {
                    t.a(c).c(pb.u(), 1);
                    if (!y.isCancelled()) {
                        this.a(pb, a, c);
                    }
                }
            }
            else if (y instanceof qd) {
                if (aa.a()) {
                    final TwitterUser a2 = ((qd)y).a;
                    if (a2 != null && a2.a() == c.g()) {
                        c.a(a2);
                        com.twitter.library.util.a.a(this.a, c.e(), a2);
                    }
                }
            }
            else if (y instanceof pe) {
                if (!aa.a()) {
                    t.a(c).b(((pe)y).f(), 1);
                }
            }
            else if (y instanceof oq) {
                if (aa.a()) {
                    cj.a(this.a).a(c, true);
                    return;
                }
                if (aa.c() == 403) {
                    ce.a(this.a).a(((oq)y).f());
                }
            }
            else if (y instanceof op) {
                final long e = ((op)y).e();
                if (aa.a()) {
                    final WidgetControl a3 = cj.a(this.a).a(c.g());
                    if (a3 != null) {
                        a3.a(e);
                    }
                }
            }
            else if (y instanceof oh) {
                if (!aa.a()) {
                    Toast.makeText(this.a, 2131297984, 0).show();
                }
            }
            else if (y instanceof pd) {
                if (!aa.a()) {
                    final q a4 = t.a(c);
                    final long[] a5 = ((pd)y).a();
                    for (int length = a5.length, j = 0; j < length; ++j) {
                        a4.c(a5[j], 1);
                    }
                }
            }
            else if (y instanceof e && aa.a()) {
                final ClientConfiguration clientConfiguration = (ClientConfiguration)aa.c.getParcelable("extra_settings");
                UrlConfiguration a6;
                if (clientConfiguration != null) {
                    a6 = clientConfiguration.a;
                }
                else {
                    a6 = null;
                }
                if (a6 != null) {
                    cd.a(this.a).a(a6);
                }
                ay b;
                if (clientConfiguration != null) {
                    b = clientConfiguration.b;
                }
                else {
                    b = null;
                }
                bh.a(this.a).a(b);
            }
        }
    }
    
    @Override
    public void b(final y y) {
        final Session a = this.b.a(y);
        if (y instanceof od) {
            final od od = (od)y;
            if (od.O() == 3) {
                t.a(od.P().a).c(od.a, 4);
            }
            else if (od.O() == 1 || od.f) {
                t.a(od.P().a).b(od.a, 4);
            }
        }
        else if (y instanceof pb) {
            if (a != null) {
                t.a(a).b(((pb)y).u(), 1);
            }
        }
        else if (y instanceof pe) {
            if (a != null) {
                t.a(a).c(((pe)y).f(), 1);
            }
        }
        else if (y instanceof pd && a != null) {
            final q a2 = t.a(a);
            final long[] a3 = ((pd)y).a();
            for (int length = a3.length, i = 0; i < length; ++i) {
                a2.b(a3[i], 1);
            }
        }
    }
}
