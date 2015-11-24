// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.library.featureswitch.d;
import com.twitter.library.card.m;
import com.twitter.library.card.element.BasePlayer;
import com.twitter.library.util.bq;
import com.twitter.library.card.element.Player;
import com.twitter.library.card.element.FollowButtonElement;
import com.twitter.library.card.j;
import android.os.Build$VERSION;
import com.twitter.android.commerce.util.e;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.card.Card;
import android.preference.PreferenceManager;
import com.twitter.library.client.App;
import com.twitter.library.card.element.Element;
import android.content.Context;
import com.twitter.library.card.element.b;

public class w implements b, vw
{
    private static int a;
    private static int b;
    private static w c;
    private Context d;
    private ac e;
    private o f;
    private ab g;
    private long h;
    private Integer i;
    private aa j;
    
    static {
        w.a = 10;
        w.b = 5;
    }
    
    w(final Context d) {
        this.d = d;
        this.e = new ac(d);
        this.f = new o(w.a);
        this.g = new ab(w.b);
        Element.a(this);
        vu.a().a(this);
        if (App.f()) {
            Card.a(PreferenceManager.getDefaultSharedPreferences(this.d).getBoolean("debug_show_card_overlay", false));
        }
    }
    
    public static w a() {
        return w.c;
    }
    
    public static void a(final Context context) {
        w.c = new w(context);
    }
    
    public static boolean a(final CardInstanceData cardInstanceData) {
        if (cardInstanceData != null && cardInstanceData.name != null) {
            final boolean a = Card.a(cardInstanceData.name);
            final boolean b = Card.b(cardInstanceData.name);
            if (a) {
                return e.a();
            }
            if (b) {
                return e.d();
            }
        }
        return true;
    }
    
    public static boolean b() {
        return b(Build$VERSION.SDK_INT);
    }
    
    public static boolean b(final int n) {
        return n >= 9;
    }
    
    public static boolean c() {
        return c(Build$VERSION.SDK_INT);
    }
    
    public static boolean c(final int n) {
        return n >= 16;
    }
    
    public y a(final a a, final boolean b, final j j, final z z) {
        final q q = new q(this.e, this.f, this.g, a, b, j, new x(this, z));
        final y y = new y(q);
        q.execute((Object[])new Void[0]);
        return y;
    }
    
    @Override
    public com.twitter.library.card.element.e a(final Context context, final FollowButtonElement followButtonElement) {
        return new com.twitter.android.card.b(context, followButtonElement);
    }
    
    @Override
    public com.twitter.library.card.element.j a(final Context context, final Player player) {
        final boolean c = player.y().c();
        com.twitter.library.card.element.j j = null;
        if (!c) {
            if (bq.f(player.htmlUrl)) {
                j = new ap(context, player);
            }
            else {
                final boolean equals = "animated_gif".equals(player.y().name);
                j = null;
                if (equals) {
                    final boolean b = b();
                    j = null;
                    if (b) {
                        if (c()) {
                            return new ak(context, player);
                        }
                        return new ao(context, player);
                    }
                }
            }
        }
        return j;
    }
    
    public m a(final int n) {
        return this.g.a(n);
    }
    
    public void a(final int n, final m m) {
        this.g.a(n, m);
    }
    
    public void a(final long h) {
        this.h = h;
        this.i = null;
    }
    
    public void a(final long n, final int n2) {
        if (this.h == n) {
            this.i = n2;
            if (this.j != null) {
                this.j.a(n2);
            }
        }
    }
    
    public void a(final a a, final Card card) {
        if (card != null) {
            new ad(this.f, a, card).execute((Object[])new Void[0]);
        }
    }
    
    public Integer b(final long n) {
        if (this.h == n && this.i != null) {
            final Integer i = this.i;
            this.h = 0L;
            this.i = null;
            return i;
        }
        return null;
    }
    
    @Override
    public boolean b(final CardInstanceData cardInstanceData) {
        return a(cardInstanceData);
    }
    
    @Override
    public boolean c(final CardInstanceData cardInstanceData) {
        return (!cardInstanceData.a() || com.twitter.library.featureswitch.d.f("legacy_deciders_amplify_player_enabled")) && a(cardInstanceData);
    }
}
