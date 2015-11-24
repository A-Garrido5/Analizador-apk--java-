// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import android.os.Bundle;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.content.Context;
import com.twitter.library.scribe.NativeCardUserAction;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.HashMap;
import com.twitter.android.card.CardActionHelper;
import android.view.View;
import java.util.Map;

public abstract class aj
{
    private static final Map a;
    static final Map l;
    protected View m;
    protected long n;
    protected CardActionHelper o;
    protected l p;
    
    static {
        l = new HashMap();
        a = new HashMap();
        aj.l.put("play", 2131296765);
        aj.l.put("shop", 2131296772);
        aj.l.put("book", 2131296746);
        aj.l.put("connect", 2131296749);
        aj.l.put("order", 2131296762);
        aj.a.put("cta_learn_more", 2131296757);
        aj.a.put("cta_read_more", 2131296769);
        aj.a.put("cta_book_now", 2131296747);
        aj.a.put("cta_visit_now", 2131296779);
        aj.a.put("cta_view_now", 2131296777);
        aj.a.put("cta_shop_now", 2131296773);
        aj.a.put("cta_play_now", 2131296766);
        aj.a.put("cta_bet_now", 2131296745);
        aj.a.put("cta_donate", 2131296750);
        aj.a.put("cta_apply_here", 2131296744);
        aj.a.put("cta_quote_here", 2131296768);
        aj.a.put("cta_order_now", 2131296763);
        aj.a.put("cta_book_tickets", 2131296748);
        aj.a.put("cta_enroll_now", 2131296751);
        aj.a.put("cta_find_a_card", 2131296752);
        aj.a.put("cta_get_a_quote", 2131296753);
        aj.a.put("cta_get_tickets", 2131296756);
        aj.a.put("cta_locate_a_dealer", 2131296758);
        aj.a.put("cta_order_online", 2131296764);
        aj.a.put("cta_preorder_now", 2131296767);
        aj.a.put("cta_schedule_now", 2131296771);
        aj.a.put("cta_sign_up_now", 2131296774);
        aj.a.put("cta_subscribe", 2131296775);
        aj.a.put("cta_register_now", 2131296770);
    }
    
    protected aj(final l p2, final String s) {
        this.p = p2;
        if (s != null) {
            this.p.f().c(s);
        }
        this.o = p2.m();
    }
    
    protected static int a(final vc vc, int intValue) {
        final Iterator<String> iterator = vc.a().iterator();
        while (iterator.hasNext()) {
            final Integer n = aj.a.get(iterator.next());
            if (n != null) {
                intValue = n;
                break;
            }
        }
        return intValue;
    }
    
    protected void a() {
    }
    
    protected void a(final long n, final View view, final MotionEvent motionEvent) {
        this.p.a(n, NativeCardUserAction.a(this.h(), view, motionEvent, 0));
    }
    
    protected abstract void a(final Context p0, final DisplayMode p1);
    
    protected void a(final Bundle bundle) {
    }
    
    protected void a(final View view, final MotionEvent motionEvent, final String s) {
        this.o.a(s, NativeCardUserAction.a(this.h(), view, motionEvent, 0));
    }
    
    protected void a(final vq vq, final Bundle bundle) {
        this.n = vq.b;
    }
    
    protected View h() {
        return this.m;
    }
}
