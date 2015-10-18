// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform;

import android.preference.PreferenceManager;
import com.twitter.library.api.conversations.DMPhoto;
import com.twitter.library.api.conversations.BaseConversationEntry;
import java.util.Collection;
import com.twitter.library.api.conversations.u;
import com.twitter.library.api.conversations.ay;
import java.util.HashSet;
import android.os.Build$VERSION;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import android.provider.Settings$Secure;
import android.text.TextUtils;
import android.content.ContentResolver;
import android.net.Uri;
import com.twitter.library.provider.n;
import android.os.Parcelable;
import android.content.SharedPreferences$Editor;
import com.twitter.library.client.az;
import com.twitter.library.client.m;
import com.twitter.library.api.TweetEntities;
import com.twitter.library.api.conversations.BaseDMAttachment;
import com.twitter.library.api.conversations.y;
import com.twitter.library.api.conversations.DMMessageEntry;
import java.util.List;
import com.twitter.library.platform.notifications.f;
import org.json.JSONException;
import com.twitter.library.api.conversations.DMTweet;
import com.twitter.library.api.conversations.ak;
import com.twitter.library.api.conversations.s;
import com.twitter.library.api.conversations.JoinConversationEntry;
import java.io.Serializable;
import com.twitter.library.featureswitch.d;
import com.twitter.library.platform.notifications.NotificationParser;
import com.twitter.library.experiments.c;
import org.json.JSONObject;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.database.Cursor;
import android.content.Intent;
import com.twitter.errorreporter.ErrorReporter;
import java.util.Iterator;
import java.util.Map;
import android.os.Looper;
import android.util.Log;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.HashMap;
import com.google.android.gcm.GCMBaseIntentService;
import android.accounts.AccountManager;
import com.twitter.library.provider.b;
import com.twitter.library.network.a;
import com.twitter.library.network.t;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.network.g;
import com.twitter.internal.network.l;
import java.util.Locale;
import android.content.ContentValues;
import com.twitter.library.provider.NotificationSetting;
import com.twitter.library.client.App;
import com.twitter.internal.network.j;
import com.twitter.library.api.bg;
import com.twitter.util.i;
import com.twitter.library.network.ae;
import com.twitter.library.network.OAuthToken;
import android.accounts.Account;
import android.content.Context;

class k
{
    int a(final Context context, final Account account, final OAuthToken oAuthToken, final String s, final int n) {
        return this.a(context, account, oAuthToken, s, n, true);
    }
    
    int a(final Context context, final Account account, final OAuthToken oAuthToken, final String s, final int n, final boolean b) {
        if (oAuthToken != null) {
            final StringBuilder append = ae.a(context).a(new Object[] { "account", "push_destinations" }).append(".json");
            ae.a(append, "udid", PushService.b(context));
            ae.a(append, "enabled_for", n);
            ae.a(append, "app_version", 11);
            b(append);
            final Locale locale = context.getResources().getConfiguration().locale;
            if (locale != null) {
                ae.a(append, "lang", i.b(locale));
            }
            if (s != null) {
                ae.a(append, "token", s);
            }
            final bg a = bg.a(49);
            final l a2 = this.a(context, append.toString(), oAuthToken, b, a);
            if (App.f()) {
                PushService.m = append.toString();
            }
            final String s2 = (String)a.a();
            int n3;
            if (a2.a() || a2.a == 304) {
                final int n2 = 0x0 | NotificationSetting.a.e(n) | NotificationSetting.c.e(n) | NotificationSetting.b.e(n) | NotificationSetting.d.e(n) | NotificationSetting.h.e(n) | NotificationSetting.l.e(n) | NotificationSetting.m.e(n) | NotificationSetting.o.e(n);
                final int e = NotificationSetting.e.e(n);
                final int e2 = NotificationSetting.g.e(n);
                final int e3 = NotificationSetting.i.e(n);
                final int e4 = NotificationSetting.f.e(n);
                final int e5 = NotificationSetting.j.e(n);
                final int e6 = NotificationSetting.k.e(n);
                final int e7 = NotificationSetting.n.e(n);
                final int e8 = NotificationSetting.p.e(n);
                final int e9 = NotificationSetting.q.e(n);
                final ContentValues contentValues = new ContentValues();
                contentValues.put("notif_mention", n2);
                contentValues.put("notif_message", e);
                contentValues.put("notif_tweet", e2);
                contentValues.put("notif_experimental", e3);
                contentValues.put("notif_lifeline_alerts", e4);
                contentValues.put("notif_recommendations", e5);
                contentValues.put("notif_news", e6);
                contentValues.put("notif_vit_notable_event", e7);
                contentValues.put("notif_offer_redemption", e8);
                contentValues.put("notif_highlights", e9);
                this.a(context, account, contentValues);
                n3 = 1;
            }
            else {
                n3 = 3;
            }
            if (a2.a == 401 && "Too many devices".equals(s2)) {
                n3 = 2;
            }
            return n3;
        }
        return 3;
    }
    
    l a(final Context context, final String s, final OAuthToken oAuthToken, final boolean b, final j j) {
        final g a = new g(context, s).a(HttpOperation$RequestMethod.b).a(new t(oAuthToken)).a(j);
        if (b) {
            a.a("Push refreshes and registrations are not triggered by user actions.");
        }
        return a.a().c().l();
    }
    
    void a(final Context context, final Account account, final ContentValues contentValues) {
        final b b = new b(context.getContentResolver());
        com.twitter.library.provider.k.a(context).a(account.name, contentValues, true, b);
        b.a();
    }
    
    boolean a(final Context context, final AccountManager accountManager, final Account account) {
        if (!PushService.d(context, account)) {
            return true;
        }
        final OAuthToken b = com.twitter.library.util.a.b(accountManager, account);
        if (b != null && this.a(context, b, PushService.b(context))) {
            PushService.a(context, account, false);
            PushService.a(context, account, 0L);
            return true;
        }
        return false;
    }
    
    boolean a(final Context context, final OAuthToken oAuthToken, final String s) {
        final StringBuilder append = ae.a(context).a(new Object[] { "account", "push_destinations", "destroy" }).append(".json");
        ae.a(append, "udid", s);
        b(append);
        return this.a(context, append.toString(), oAuthToken, false, null).a();
    }
    
    int b(final Context context, final Account account, final OAuthToken oAuthToken, final String s, final int n) {
        return this.a(context, account, oAuthToken, s, n, false);
    }
}
