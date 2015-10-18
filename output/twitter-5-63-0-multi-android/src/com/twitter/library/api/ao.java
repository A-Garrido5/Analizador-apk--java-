// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import android.content.SharedPreferences;
import com.twitter.library.service.f;
import android.os.Bundle;
import com.twitter.library.client.App;
import com.twitter.library.util.an;
import com.twitter.library.platform.PushService;
import android.accounts.Account;
import com.twitter.library.service.e;
import java.util.Locale;
import com.twitter.util.i;
import android.os.Parcelable;
import com.twitter.library.util.a;
import com.twitter.library.client.Session;
import com.twitter.library.service.ab;
import android.content.Context;
import com.twitter.library.service.c;

public class ao extends c
{
    public ao(final Context context, final ab ab) {
        super(context, ao.class.getName(), ab);
    }
    
    public static ao a(final Context context, final Session session, final String s, final boolean b) {
        return a(context, new ab(session), s, b);
    }
    
    public static ao a(final Context context, final ab ab, final String s, final boolean b) {
        final ao ao = (ao)new ao(context, ab).b("user_id", ab.c).b("format", s).a("account", (Parcelable)com.twitter.library.util.a.a(context, ab.e)).a("has_unknown_phone_number", b);
        final Locale locale = context.getResources().getConfiguration().locale;
        if (locale != null) {
            ao.b("lang", i.b(locale));
        }
        return ao;
    }
    
    @Override
    protected e a() {
        final Context p = this.p;
        final Bundle o = this.o;
        final boolean boolean1 = o.getBoolean("phone");
        final String string = o.getString("format");
        final String string2 = o.getString("lang");
        final Account account = (Account)o.getParcelable("account");
        final f a = this.M().a(new Object[] { "prompts", "suggest" }).a("format", string).a("client_namespace", "native").a("force_user_language", string2).a("has_unknown_phone_number", boolean1).a("notifications_device", PushService.c(p)).a("notifications_twitter", PushService.b(p, account));
        if (account != null) {
            a.a("notifications_app", PushService.g(p, account.name));
        }
        if (!an.a(p)) {
            a.a("no_play_store", true);
        }
        if (App.f()) {
            final SharedPreferences sharedPreferences = this.p.getSharedPreferences("debug_prefs", 0);
            String s = o.getString("force_campaign");
            if (s == null && sharedPreferences.getBoolean("pb_force_campaign_enabled", false)) {
                s = sharedPreferences.getString("pb_force_campaign_id", (String)null);
            }
            if (s != null) {
                final String string3 = sharedPreferences.getString("pb_force_campaign_cookie", "");
                final Boolean value = sharedPreferences.getBoolean("pb_force_campaign_sticky", false);
                a.a("force_campaign", "targeting_" + s);
                a.a("force_fatigue_on_override", true);
                a.a("force_cookie", string3);
                sharedPreferences.edit().putBoolean("pb_force_campaign_enabled", (boolean)value).apply();
            }
        }
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            aa.c.putParcelable("prompt", (Parcelable)bg.a());
        }
    }
    
    protected bg b() {
        return bg.a(41);
    }
}
