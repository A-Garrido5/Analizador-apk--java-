// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import android.view.View;
import com.twitter.library.card.m;
import com.twitter.library.media.manager.ao;
import com.twitter.android.composer.au;
import com.twitter.library.featureswitch.d;
import com.twitter.library.util.bq;
import java.io.Serializable;
import com.twitter.android.commerce.util.e;
import android.os.Parcelable;
import com.twitter.android.commerce.view.ProductSummaryActivity;
import com.twitter.android.commerce.view.OfferSummaryActivity;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import android.widget.Toast;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.client.Session;
import android.text.TextUtils;
import com.twitter.library.card.property.Action;
import com.twitter.library.card.element.Element;
import java.util.Iterator;
import java.util.Map;
import com.twitter.library.api.TwitterUser;
import java.util.ArrayList;
import java.util.HashMap;
import android.os.Bundle;
import android.content.res.Configuration;
import android.content.Intent;
import android.app.Activity;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.client.az;
import com.twitter.library.media.manager.q;
import com.twitter.android.client.c;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.card.Card;
import com.twitter.library.provider.Tweet;
import java.lang.ref.WeakReference;
import com.twitter.library.widget.tweet.content.f;
import com.twitter.library.client.r;
import com.twitter.library.card.j;

public abstract class a implements n, j, r, f
{
    protected int b;
    protected WeakReference c;
    protected Tweet d;
    protected y e;
    protected Card f;
    protected TwitterScribeAssociation g;
    protected TwitterScribeAssociation h;
    protected Context i;
    protected c j;
    protected final q k;
    protected final az l;
    protected CardInstanceData m;
    protected h n;
    protected t o;
    
    public a(final TwitterFragmentActivity twitterFragmentActivity) {
        this.c = new WeakReference((T)twitterFragmentActivity);
        this.i = twitterFragmentActivity.getApplicationContext();
        this.j = com.twitter.android.client.c.a(this.i);
        this.l = az.a(this.i);
        this.k = q.a(this.i);
        this.n = new h(twitterFragmentActivity);
        this.o = new v(this.i);
    }
    
    private String B() {
        if (this.b()) {
            return "platform_forward_card";
        }
        return "platform_card";
    }
    
    private void C() {
        String s;
        if (this.b()) {
            s = this.m.forwardCardTypeURL;
        }
        else {
            s = this.m.cardTypeURL;
        }
        this.b = (Long.toString(this.d.E) + s).hashCode();
    }
    
    public t A() {
        return this.o;
    }
    
    @Override
    public void a(final int n, final int n2, final Intent intent) {
        this.s();
    }
    
    @Override
    public void a(final long n) {
        this.o.a(n, "follow", this.B());
    }
    
    @Override
    public void a(final Configuration configuration) {
    }
    
    @Override
    public void a(final Bundle bundle) {
        this.u();
    }
    
    public void a(final y e) {
        this.e = e;
    }
    
    protected void a(final com.twitter.android.client.q q, final HashMap hashMap, final ArrayList list) {
        if (hashMap != null) {
            final Iterator<Map.Entry<K, TwitterUser>> iterator = hashMap.entrySet().iterator();
            while (iterator.hasNext()) {
                final TwitterUser twitterUser = iterator.next().getValue();
                final long userId = twitterUser.userId;
                if (this.b()) {
                    if (list.contains(userId) || q.a(userId)) {
                        continue;
                    }
                    list.add(userId);
                    q.a(userId, twitterUser.friendship);
                }
                else {
                    if (!list.contains(userId)) {
                        list.add(userId);
                    }
                    if (q.a(userId)) {
                        continue;
                    }
                    q.a(userId, twitterUser.friendship);
                }
            }
        }
    }
    
    public void a(final Card f) {
        this.f = f;
        if (this.d != null && this.f != null) {
            this.f.a(this.d);
        }
    }
    
    @Override
    public void a(final Element element, final int n, final int n2) {
        final Action action = (Action)this.f.actions.get(n2);
        if (action != null) {
            String s;
            if (TextUtils.isEmpty((CharSequence)action.scribeElement)) {
                s = this.B();
            }
            else {
                s = action.scribeElement;
            }
            this.o.c(action.scribeAction, s);
        }
    }
    
    @Override
    public void a(final Element element, final Action action) {
        new l(this.i, this.d, this.f, element, action, this, false).execute((Object[])new Void[0]);
    }
    
    public void a(final CardInstanceData m) {
        this.m = m;
        this.C();
        this.t();
    }
    
    @Override
    public void a(final Tweet d) {
        this.d = d;
        if (this.f != null && this.d != null) {
            this.f.a(d);
        }
        this.o.a(d);
    }
    
    public void a(final TwitterScribeAssociation g) {
        this.g = g;
        this.o.a(g);
    }
    
    @Override
    public void a(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s) && this.c.get() != null) {
            this.o.a("open_link", this.B());
            if (!this.d.h()) {
                this.n.a(this.g, this.d, s);
                return;
            }
            final Session b = az.a(this.i).b();
            if (b != null) {
                this.o.b(s);
                this.n.a(b, this.d, s, true);
            }
        }
    }
    
    @Override
    public void a(final String s, final com.twitter.internal.network.l l) {
        if (l == null) {
            return;
        }
        this.o.a(s, l);
    }
    
    @Override
    public void a(final String s, final String s2) {
    }
    
    @Override
    public void a(final String s, final String s2, final String s3, final boolean b, final boolean b2) {
        if (this.c.get() == null) {
            return;
        }
        this.n.a(s, s2, s3, b, b2, this.d);
    }
    
    @Override
    public void a(final ArrayList list, final int n) {
        if (this.c.get() == null) {
            return;
        }
        this.o.b("click", this.B());
        this.o.a(PromotedEvent.p);
        this.n.a(list, n, this.g);
    }
    
    @Override
    public void a(final boolean b) {
        if (this.f != null) {
            this.f.b(b);
        }
    }
    
    @Override
    public void b(final long n) {
        this.o.a(n, "unfollow", this.B());
    }
    
    @Override
    public void b(final Element element, final Action action) {
        final CardInstanceData p2 = this.p();
        final Activity activity = (Activity)this.c.get();
        if (p2 == null || p2.e() == null || p2.e().size() == 0) {
            Toast.makeText((Context)activity, 2131296666, 0).show();
            return;
        }
        final boolean b = Card.b(this.o().name);
        if (b) {
            this.o.a(PromotedEvent.ay);
        }
        else {
            this.o.a(PromotedEvent.as);
            final Session b2 = az.a(this.i).b();
            if (b2 != null) {
                final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(b2.g()).a(this.i, this.d, this.g, null).b(new String[] { "buy_now:::platform_buy_now_card:start_buy_now" })).a(this.g)).e(null);
                String s = p2.a("card_url");
                if (TextUtils.isEmpty((CharSequence)s)) {
                    s = p2.url;
                }
                twitterScribeLog.b(s, null);
                this.j.a(twitterScribeLog);
            }
        }
        Serializable s2;
        if (b) {
            s2 = OfferSummaryActivity.class;
        }
        else {
            s2 = ProductSummaryActivity.class;
        }
        final Intent intent = new Intent((Context)activity, (Class)s2);
        final Bundle bundle = new Bundle();
        bundle.putParcelable("commerce_buynow_tweet", (Parcelable)this.d);
        bundle.putSerializable("commerce_product_values", (Serializable)com.twitter.android.commerce.util.e.a(p2.e()));
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }
    
    public void b(final TwitterScribeAssociation h) {
        this.h = h;
        this.o.b(h);
    }
    
    @Override
    public void b(final String s) {
        if (this.c.get() == null) {
            return;
        }
        this.o.d("share", this.B());
        this.n.a(s);
    }
    
    @Override
    public void b(final String s, final String s2) {
        if (this.c.get() == null || this.f == null) {
            return;
        }
        this.o.d("share", this.B());
        this.n.a(s, s2);
    }
    
    @Override
    public void b(final boolean b) {
        if (this.f != null) {
            this.f.p();
        }
    }
    
    public abstract boolean b();
    
    @Override
    public void c(final long n) {
        if (this.c.get() == null) {
            return;
        }
        this.o.b("profile_click", this.B());
        this.o.a(PromotedEvent.d);
        final h n2 = this.n;
        final Tweet d = this.d;
        TwitterScribeAssociation twitterScribeAssociation;
        if (this.h != null) {
            twitterScribeAssociation = this.h;
        }
        else {
            twitterScribeAssociation = this.g;
        }
        n2.a(n, d, twitterScribeAssociation);
    }
    
    @Override
    public void c(final String s) {
        final Activity activity = (Activity)this.c.get();
        if (activity == null || this.f == null) {
            return;
        }
        this.o.d("share", this.B());
        bq.b((Context)activity, s);
    }
    
    @Override
    public void c(final String s, final String s2) {
        this.o.a("open_app", this.B());
        this.o.a(PromotedEvent.q);
        this.n.b(s, s2);
    }
    
    public abstract boolean c();
    
    @Override
    public void d(final long n) {
        this.o.a(n, "unblock", this.B());
    }
    
    @Override
    public void d(final String s) {
        this.o.a("install_app", this.B());
        this.o.a(PromotedEvent.r);
        if (this.n.b(s)) {
            this.o.a("open_link", this.B());
        }
        if (com.twitter.library.featureswitch.d.f("post_installed_logging_enabled")) {
            this.o.e(s, this.B());
        }
    }
    
    @Override
    public void d(final String s, final String s2) {
        final TwitterFragmentActivity twitterFragmentActivity = (TwitterFragmentActivity)this.c.get();
        if (twitterFragmentActivity == null) {
            return;
        }
        final Session b = az.a(this.i).b();
        w.a().a((long)this.b);
        au.a((Context)twitterFragmentActivity).a(s, null).a(b.e()).c((long)this.b).b((Context)twitterFragmentActivity);
    }
    
    public abstract boolean d();
    
    @Override
    public void e(final String s) {
        if (this.n.d(s)) {
            this.o.a("open_link", this.B());
        }
    }
    
    public abstract boolean e();
    
    @Override
    public void f() {
    }
    
    @Override
    public void g() {
    }
    
    @Override
    public void h() {
    }
    
    @Override
    public void i() {
    }
    
    @Override
    public void j() {
        if (this.f == null || this.c.get() == null) {
            return;
        }
        this.f.a(this.d, this.q(), this.r());
        this.f.j();
        this.s();
    }
    
    @Override
    public void k() {
    }
    
    public int l() {
        return this.b;
    }
    
    public Tweet m() {
        return this.d;
    }
    
    public y n() {
        return this.e;
    }
    
    public Card o() {
        return this.f;
    }
    
    public CardInstanceData p() {
        return this.m;
    }
    
    public com.twitter.library.media.manager.h q() {
        return this.k.b();
    }
    
    public ao r() {
        return this.k.e();
    }
    
    public void s() {
        final w a = w.a();
        if (this.f != null) {
            final Integer b = a.b((long)this.b);
            if (b != null) {
                this.f.c(b == -1);
            }
        }
    }
    
    protected void t() {
        final ArrayList list = new ArrayList();
        final com.twitter.android.client.q a = com.twitter.android.client.t.a();
        this.a(a, this.m.users, list);
        this.a(a, this.m.forwardUsers, list);
        a.a(list);
    }
    
    protected void u() {
        if (this.f != null) {
            final m b = this.f.b();
            if (b.a()) {
                w.a().a(this.b, b);
            }
        }
    }
    
    @Override
    public boolean v() {
        return false;
    }
    
    @Override
    public void w() {
    }
    
    @Override
    public void x() {
    }
    
    @Override
    public void y() {
        this.u();
    }
    
    @Override
    public View z() {
        if (this.f != null) {
            return this.f.z();
        }
        return null;
    }
}
