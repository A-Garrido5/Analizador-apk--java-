// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.res.Resources;
import android.view.View$OnClickListener;
import com.twitter.library.client.r;
import com.twitter.library.network.ae;
import com.twitter.library.provider.ad;
import com.twitter.android.client.TwitterFragmentActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.twitter.library.card.element.d;
import com.twitter.library.client.k;
import com.twitter.library.card.CardDebugLog;
import com.twitter.android.card.y;
import com.twitter.internal.network.l;
import android.widget.Toast;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.os.Handler;
import android.support.v4.app.Fragment;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.Session;
import com.twitter.android.card.z;
import com.twitter.android.card.w;
import com.twitter.library.api.TwitterStatusCard;
import com.twitter.library.card.Card;
import com.twitter.library.client.az;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.twitter.internal.network.j;
import com.twitter.library.network.a;
import com.twitter.library.network.g;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.network.t;
import java.lang.ref.WeakReference;
import android.os.AsyncTask;

class ca extends AsyncTask
{
    private final WeakReference a;
    
    public ca(final CardPreviewerFragment cardPreviewerFragment) {
        this.a = new WeakReference((T)cardPreviewerFragment);
    }
    
    private CardInstanceData a(final CardPreviewerFragment cardPreviewerFragment, final t t) {
        final String c = cardPreviewerFragment.l;
        final bw bw = new bw(cardPreviewerFragment, c);
        final FragmentActivity activity = cardPreviewerFragment.getActivity();
        if (activity == null) {
            return null;
        }
        final Context applicationContext = activity.getApplicationContext();
        final StringBuilder sb = new StringBuilder(c);
        int n = 0;
        CardInstanceData a2;
        while (true) {
            cardPreviewerFragment.c(c + " GET");
            final int a = new g(applicationContext, sb).a(t).a(bw).a().c().l().a;
            if (a == 200) {
                cardPreviewerFragment.c(c + " HTTP 200 OK");
                a2 = bw.a;
                if (a2 == null || TextUtils.isEmpty((CharSequence)cardPreviewerFragment.k)) {
                    break;
                }
                if (!TextUtils.isEmpty((CharSequence)a2.cardTypeURL)) {
                    a2.cardTypeURL = a2.cardTypeURL.replace("localhost.twitter.com", cardPreviewerFragment.k);
                }
                if (!TextUtils.isEmpty((CharSequence)a2.forwardCardTypeURL)) {
                    a2.forwardCardTypeURL = a2.forwardCardTypeURL.replace("localhost.twitter.com", cardPreviewerFragment.k);
                    break;
                }
                break;
            }
            else {
                if (a != 202) {
                    cardPreviewerFragment.a(c, activity.getString(2131296793, new Object[] { a }));
                    a2 = null;
                    break;
                }
                cardPreviewerFragment.c(c + " HTTP 202 Retry");
                if (n >= 15) {
                    cardPreviewerFragment.a(c, activity.getString(2131296795));
                    a2 = null;
                    break;
                }
                ++n;
                try {
                    Thread.sleep(2000L);
                }
                catch (Exception ex) {}
            }
        }
        return a2;
    }
    
    protected CardInstanceData a(final Void... array) {
        final CardPreviewerFragment cardPreviewerFragment = (CardPreviewerFragment)this.a.get();
        if (cardPreviewerFragment == null) {
            return null;
        }
        final FragmentActivity activity = cardPreviewerFragment.getActivity();
        if (activity == null) {
            return null;
        }
        return this.a(cardPreviewerFragment, new t(az.a(activity.getApplicationContext()).b().h()));
    }
    
    protected void a(final CardInstanceData cardInstanceData) {
        final CardPreviewerFragment cardPreviewerFragment = (CardPreviewerFragment)this.a.get();
        if (cardPreviewerFragment != null) {
            final FragmentActivity activity = cardPreviewerFragment.getActivity();
            if (activity != null) {
                if (cardInstanceData == null) {
                    cardPreviewerFragment.f();
                    return;
                }
                cardPreviewerFragment.j.l.cardInstanceData = cardInstanceData;
                cardPreviewerFragment.o.a((Card)null);
                final Session b = az.a((Context)activity).b();
                if (b != null) {
                    final Tweet h = cardPreviewerFragment.j;
                    h.f = b.g();
                    h.l = new TwitterStatusCard();
                    h.l.cardInstanceData = cardInstanceData;
                    cardPreviewerFragment.o.a(cardInstanceData);
                    cardPreviewerFragment.o.a(w.a().a(cardPreviewerFragment.o, cardPreviewerFragment.p, cardPreviewerFragment.o, cardPreviewerFragment));
                }
            }
        }
    }
    
    protected void onPreExecute() {
        final CardPreviewerFragment cardPreviewerFragment = (CardPreviewerFragment)this.a.get();
        if (cardPreviewerFragment == null) {
            return;
        }
        cardPreviewerFragment.a(false);
        cardPreviewerFragment.c();
        cardPreviewerFragment.e();
        cardPreviewerFragment.o.a((Card)null);
        cardPreviewerFragment.j.l.cardInstanceData = null;
        cardPreviewerFragment.d();
    }
}
