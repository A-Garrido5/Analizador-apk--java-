// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import java.util.Iterator;
import java.util.HashMap;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.network.a;
import java.net.URI;
import com.twitter.library.card.property.ApiRequestParameter;
import com.twitter.library.card.property.ApiRequest;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.media.manager.q;
import com.twitter.library.card.instance.BindingValue;
import java.util.Map;
import com.twitter.internal.network.j;
import java.util.List;
import com.twitter.library.network.g;
import com.twitter.library.network.t;
import com.twitter.library.util.bn;
import android.text.TextUtils;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.card.CardDebugLog;
import com.twitter.android.util.bl;
import org.apache.http.message.BasicNameValuePair;
import com.twitter.library.network.ae;
import java.util.ArrayList;
import com.twitter.library.client.az;
import com.twitter.library.card.property.Action;
import com.twitter.library.card.element.Element;
import com.twitter.library.card.Card;
import com.twitter.library.provider.Tweet;
import java.lang.ref.WeakReference;
import com.twitter.library.client.Session;
import android.content.Context;
import android.os.AsyncTask;

public class l extends AsyncTask
{
    private final Context a;
    private final Session b;
    private final WeakReference c;
    private final WeakReference d;
    private final WeakReference e;
    private final WeakReference f;
    private final WeakReference g;
    private final boolean h;
    private final int i;
    
    public l(final Context a, final Tweet tweet, final Card card, final Element element, final Action action, final n n, final boolean h) {
        this.a = a;
        this.b = az.a(this.a).b();
        this.c = new WeakReference((T)tweet);
        this.d = new WeakReference((T)card);
        this.e = new WeakReference((T)element);
        this.f = new WeakReference((T)action);
        this.g = new WeakReference((T)n);
        this.h = h;
        this.i = card.a();
    }
    
    private void a(final String s, final String s2, final boolean b, final ArrayList list, final StringBuilder sb) {
        if (b) {
            ae.a(sb, s, s2);
            return;
        }
        list.add(new BasicNameValuePair(s, s2));
    }
    
    protected com.twitter.internal.network.l a(final Void... array) {
        boolean b = true;
        final Action action = (Action)this.f.get();
        if (action != null) {
            final String url = action.url;
            if (url != null) {
                if (this.h && !bl.a(url)) {
                    CardDebugLog.c("API Url is not whitelisted " + url, null);
                    return null;
                }
                final StringBuilder a = ae.a(url, new Object[0]);
                final Tweet tweet = (Tweet)this.c.get();
                if (tweet != null) {
                    if (tweet.h()) {
                        final PromotedContent j = tweet.j;
                        if (j != null && j.impressionId != null) {
                            ae.a(a, "impression_id", j.impressionId);
                        }
                    }
                    ae.a(this.a).b(a);
                    final ApiRequest apiRequest = action.apiRequest;
                    if (apiRequest.method != (b ? 1 : 0)) {
                        b = false;
                    }
                    HttpOperation$RequestMethod httpOperation$RequestMethod;
                    if (b) {
                        httpOperation$RequestMethod = HttpOperation$RequestMethod.a;
                    }
                    else {
                        httpOperation$RequestMethod = HttpOperation$RequestMethod.b;
                    }
                    final ApiRequestParameter[] parameters = apiRequest.parameters;
                    ArrayList list;
                    if (!b) {
                        list = new ArrayList();
                    }
                    else {
                        list = null;
                    }
                    if (parameters != null) {
                        for (final ApiRequestParameter apiRequestParameter : parameters) {
                            final String key = apiRequestParameter.key;
                            final String value = apiRequestParameter.value;
                            if (!TextUtils.isEmpty((CharSequence)key) && !TextUtils.isEmpty((CharSequence)value)) {
                                this.a(key, value, b, list, a);
                            }
                        }
                    }
                    final Card card = (Card)this.d.get();
                    HttpOperation c = null;
                    Label_0700: {
                        Label_0366: {
                            if (card == null) {
                                break Label_0366;
                            }
                            if (!TextUtils.isEmpty((CharSequence)apiRequest.apiProxyRule)) {
                                this.a("__api_proxy_rule", apiRequest.apiProxyRule, b, list, a);
                            }
                            while (true) {
                                while (true) {
                                    Label_0709: {
                                        while (true) {
                                            synchronized (card) {
                                                this.a("__card_name", card.name, b, list, a);
                                                this.a("__platform_key", card.platformKey, b, list, a);
                                                // monitorexit(card)
                                                this.a("__tweet_id", Long.toString(tweet.Q), b, list, a);
                                                final String string = a.toString();
                                                final m m = new m(this.g, string);
                                                final URI a2 = bn.a(string);
                                                if (a2 == null) {
                                                    break Label_0709;
                                                }
                                                final String host = a2.getHost();
                                                if (host == null || !host.toLowerCase().endsWith(".twitter.com")) {
                                                    break Label_0709;
                                                }
                                                final a a3 = new t(this.b.h());
                                                final StringBuilder append = new StringBuilder().append(string);
                                                if (b) {
                                                    final String s = " GET";
                                                    CardDebugLog.b(append.append(s).toString(), null);
                                                    c = new g(this.a, string).a(httpOperation$RequestMethod).a(list).b(a3).a(m).a().c();
                                                    if (!c.o()) {
                                                        return null;
                                                    }
                                                    if (card == null) {
                                                        return c.l();
                                                    }
                                                    synchronized (card) {
                                                        if (this.i != card.a()) {
                                                            break Label_0700;
                                                        }
                                                        final HashMap a4 = m.a;
                                                        if (a4 != null && a4.size() != 0) {
                                                            for (final Map.Entry<String, V> entry : a4.entrySet()) {
                                                                card.a(entry.getKey(), (BindingValue)entry.getValue());
                                                            }
                                                            break;
                                                        }
                                                        break Label_0700;
                                                    }
                                                }
                                            }
                                            final String s = " POST";
                                            continue;
                                        }
                                    }
                                    final a a3 = null;
                                    continue;
                                }
                            }
                        }
                        card.n();
                        final q a5 = q.a(this.a);
                        card.a(a5.b(), a5.e());
                    }
                    // monitorexit(card)
                    return c.l();
                }
            }
        }
        return null;
    }
    
    protected void a(final com.twitter.internal.network.l l) {
        final Action action = (Action)this.f.get();
        if (action != null) {
            final Card card = (Card)this.d.get();
            Label_0110: {
                if (card == null) {
                    break Label_0110;
                }
                while (true) {
                    while (true) {
                        boolean b = false;
                        Label_0153: {
                            synchronized (card) {
                                if (card.a() == this.i) {
                                    if (l != null) {
                                        final int a = l.a;
                                        b = false;
                                        if (a == 200) {
                                            b = true;
                                        }
                                        break Label_0153;
                                    }
                                    else {
                                        final boolean b2 = false;
                                        final Element element = (Element)this.e.get();
                                        if (element != null) {
                                            card.a(element.x(), action.id, b2);
                                        }
                                        card.i();
                                    }
                                }
                                // monitorexit(card)
                                final n n = (n)this.g.get();
                                if (n != null) {
                                    n.a(action.url, l);
                                    return;
                                }
                                break;
                            }
                        }
                        final boolean b2 = b;
                        continue;
                    }
                }
            }
        }
    }
}
