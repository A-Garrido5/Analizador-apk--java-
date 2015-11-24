// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import java.io.IOException;
import android.accounts.OperationCanceledException;
import android.accounts.AuthenticatorException;
import android.os.Bundle;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.provider.b;
import java.util.HashSet;
import java.util.List;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.internal.network.j;
import com.twitter.library.network.g;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import com.twitter.library.api.conversations.ai;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.twitter.library.provider.k;
import android.accounts.AccountManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import java.util.Iterator;
import java.util.ArrayList;
import com.twitter.library.api.bp;
import com.twitter.library.api.az;
import com.twitter.library.client.t;
import android.content.SyncStats;
import com.twitter.library.provider.bg;
import com.twitter.library.provider.af;
import com.twitter.library.service.ab;
import android.content.SyncResult;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.network.OAuthToken;
import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.twitter.library.client.App;
import android.content.AbstractThreadedSyncAdapter;

public final class a extends AbstractThreadedSyncAdapter
{
    static final boolean a;
    
    static {
        a = (App.l() && Log.isLoggable("TwitterDataSync", 3));
    }
    
    public a(final Context context) {
        super(context, true);
    }
    
    private void a(final int n, final Context context, final Account account, final OAuthToken oAuthToken, final TwitterUser twitterUser, final SyncResult syncResult, final DataSyncResult dataSyncResult, final boolean b, final boolean b2) {
        if (this.a(n, context, twitterUser, b2)) {
            if (com.twitter.library.platform.a.a) {
                Log.d("TwitterDataSync", "=====> Sync activity");
            }
            final ma ma = (ma)new ma(context, new ab(twitterUser.userId, account.name, oAuthToken, true), n).a(b).c(20).j("Data sync happens in the background and is not triggered by a user action.");
            final int a = ma.S().f().a;
            if (a == 200) {
                TwitterDataSyncService.b(context, account.name);
                if (af.a(n) && b) {
                    this.a(n, context, account, dataSyncResult, ma, bg.a(context, twitterUser.userId));
                }
            }
            else {
                if (a == 0) {
                    final SyncStats stats = syncResult.stats;
                    ++stats.numParseExceptions;
                    return;
                }
                if (a == 401) {
                    final SyncStats stats2 = syncResult.stats;
                    ++stats2.numAuthExceptions;
                }
            }
        }
    }
    
    private void a(final int n, final Context context, final Account account, final DataSyncResult dataSyncResult, final ma ma, final bg bg) {
        final long a = t.a(context, account.name);
        final ArrayList e = ma.e();
        final d j = new d();
        if (e != null) {
            final Iterator<az> iterator = e.iterator();
            int n2 = 0;
            while (iterator.hasNext()) {
                final az az = iterator.next();
                if (az.b > a) {
                    final boolean b = !dataSyncResult.c && n2 == 0;
                    int n3 = 0;
                    Label_0132: {
                        switch (az.a) {
                            case 3: {
                                if (b && !az.k.isEmpty()) {
                                    final bp bp = az.k.get(0);
                                    j.a(bp).a(bp.y);
                                    n3 = 1;
                                    break Label_0132;
                                }
                                break;
                            }
                            case 2: {
                                if (b && !az.o.isEmpty()) {
                                    final bp bp2 = az.o.get(0);
                                    j.a(bp2).a(bp2.y);
                                    n3 = 1;
                                    break Label_0132;
                                }
                                break;
                            }
                            case 1: {
                                if (b && !az.k.isEmpty() && !az.g.isEmpty()) {
                                    j.a((bp)az.k.get(0)).a((TwitterUser)az.g.get(0));
                                    n3 = 1;
                                    break Label_0132;
                                }
                                break;
                            }
                            case 5: {
                                if (b && !az.g.isEmpty()) {
                                    j.a((TwitterUser)az.g.get(0));
                                    n3 = 1;
                                    break Label_0132;
                                }
                                break;
                            }
                            case 4: {
                                if (b && !az.o.isEmpty() && !az.g.isEmpty()) {
                                    j.a((bp)az.o.get(0)).a((TwitterUser)az.g.get(0));
                                    n3 = 1;
                                    break Label_0132;
                                }
                                break;
                            }
                        }
                        n3 = n2;
                    }
                    n2 = n3;
                }
            }
        }
        int size;
        if (e != null) {
            size = e.size();
        }
        else {
            size = 0;
        }
        j.c = size;
        if (com.twitter.library.platform.a.a) {
            Log.d("TwitterDataSync", "sync about me activities, newCount=" + size);
        }
        if (size > 0) {
            if (!dataSyncResult.c) {
                j.p = bg.a(account.name, 6, null, j.a(), j.g, j.e, true);
                j.b = bg.e(n);
            }
            dataSyncResult.e = ma.f();
            dataSyncResult.j = j;
        }
    }
    
    static void a(final Context context) {
        final Intent setAction = new Intent(context, (Class)TwitterDataSyncService.class).setAction("on_poll_alarm_ev");
        final PendingIntent service = PendingIntent.getService(context, 0, setAction, 536870912);
        final AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        final AccountManager value = AccountManager.get(context);
        final k a = k.a(context);
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        final int int1 = defaultSharedPreferences.getInt("alarm_interval", -1);
        final Account[] accountsByType = value.getAccountsByType(com.twitter.library.util.a.a);
        final int length = accountsByType.length;
        int i = 0;
        int n = Integer.MAX_VALUE;
        while (i < length) {
            final Account account = accountsByType[i];
            final int min = Math.min(n, a.a(account.name, PushService.d(context, account)));
            ++i;
            n = min;
        }
        if (n < Integer.MAX_VALUE) {
            if (n != int1 || service == null) {
                final long n2 = 60000L * n;
                if (service != null) {
                    alarmManager.cancel(service);
                }
                alarmManager.setInexactRepeating(0, n2 + System.currentTimeMillis(), n2, PendingIntent.getService(context, 0, setAction, 0));
                defaultSharedPreferences.edit().putInt("alarm_interval", n).apply();
            }
        }
        else if (service != null) {
            alarmManager.cancel(service);
            defaultSharedPreferences.edit().remove("alarm_interval").apply();
        }
    }
    
    private void a(final Context context, final Account account, final OAuthToken oAuthToken, final TwitterUser twitterUser) {
        final oc a = oi.a(context, new ab(twitterUser.userId, account.name, oAuthToken, true), true);
        if (a != null) {
            a.S();
        }
    }
    
    private void a(final Context context, final SyncResult syncResult) {
        final aa s = new ai(context, com.twitter.library.client.az.a(context).b()).j("Data sync happens in the background and is not triggered by a user action.").S();
        if (!s.a()) {
            final int c = s.c();
            if (c == 0) {
                final SyncStats stats = syncResult.stats;
                ++stats.numParseExceptions;
            }
            else if (c == 404) {
                final SyncStats stats2 = syncResult.stats;
                ++stats2.numAuthExceptions;
            }
        }
    }
    
    private static void a(final Context context, final com.twitter.library.network.a a, final long n, final int n2, final int n3) {
        final bg a2 = bg.a(context, n);
        final long[] a3 = a2.a(n2, n3);
        if (a3 != null) {
            final String string = ae.a(ae.a(context).d, "1.1", "users", "lookup").append(".json").toString();
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            ae.a(sb, "user_id", a3, 0, a3.length);
            ae.a(sb, "include_user_entities", true);
            final com.twitter.library.service.a a4 = new com.twitter.library.service.a(n, sb);
            final com.twitter.library.api.bg a5 = com.twitter.library.api.bg.a(22);
            a5.a(a4);
            final HttpOperation c = new g(context, sb).a(n).a(a).a("Data sync happens in the background and is not triggered by a user action.").a(a5).a().c();
            ErrorReporter.a(a4);
            if (c.j()) {
                final List list = (List)a5.a();
                final HashSet<Long> set = new HashSet<Long>();
                final Iterator<TwitterUser> iterator = list.iterator();
                while (iterator.hasNext()) {
                    set.add(iterator.next().a());
                }
                for (final long n4 : a3) {
                    if (!set.contains(n4)) {
                        final b b = new b(context.getContentResolver());
                        a2.b(n, n4, b);
                        b.a();
                    }
                }
            }
        }
    }
    
    public void a(final Account account, final Bundle bundle, final SyncResult syncResult) {
        if (account != null) {
            final AccountManager value = AccountManager.get(this.getContext());
            if (value.getUserData(account, "account_user_info") == null) {
                final SyncStats stats = syncResult.stats;
                ++stats.numAuthExceptions;
                Log.e("TwitterDataSync", "ACCOUNT_USER_INFO_KEY content not found.");
                return;
            }
            try {
                final String blockingGetAuthToken = value.blockingGetAuthToken(account, "com.twitter.android.oauth.token", false);
                final String blockingGetAuthToken2 = value.blockingGetAuthToken(account, "com.twitter.android.oauth.token.secret", false);
                if (blockingGetAuthToken == null || blockingGetAuthToken2 == null) {
                    final SyncStats stats2 = syncResult.stats;
                    ++stats2.numAuthExceptions;
                    Log.e("TwitterDataSync", "Token not found.");
                    return;
                }
                goto Label_0145;
            }
            catch (AuthenticatorException ex) {
                final SyncStats stats3 = syncResult.stats;
                ++stats3.numAuthExceptions;
            }
            catch (OperationCanceledException ex2) {
                if (com.twitter.library.platform.a.a) {
                    Log.d("TwitterDataSync", "Sync canceled.");
                }
            }
            catch (IOException ex3) {
                final SyncStats stats4 = syncResult.stats;
                ++stats4.numIoExceptions;
            }
        }
    }
    
    boolean a(final int n, final Context context, final TwitterUser twitterUser, final boolean b) {
        boolean b2 = true;
        switch (n) {
            default: {
                b2 = false;
                return b2;
            }
            case 0: {
                return b2;
            }
            case 1: {
                if ("trends_plus_plus_enabled".equals(com.twitter.library.experiments.a.a(false, context))) {
                    return false;
                }
                return b2;
            }
            case 2:
            case 4: {
                return twitterUser.verified;
            }
            case 3: {
                if (!twitterUser.verified) {
                    final boolean b3 = false;
                    if (!b) {
                        return b3;
                    }
                }
                return b2;
            }
        }
    }
    
    boolean a(final Account account) {
        return account != null && ContentResolver.getSyncAutomatically(account, com.twitter.library.provider.ae.c) && ContentResolver.getIsSyncable(account, com.twitter.library.provider.ae.c) > 0 && System.currentTimeMillis() - new com.twitter.library.client.k(this.getContext(), account.name).getLong("last_sync", 0L) > 60000L * k.a(this.getContext()).a(account.name, PushService.d(this.getContext(), account)) - 60000L;
    }
    
    public void onPerformSync(final Account account, final Bundle bundle, final String s, final ContentProviderClient contentProviderClient, final SyncResult syncResult) {
        this.a(account, bundle, syncResult);
    }
}
