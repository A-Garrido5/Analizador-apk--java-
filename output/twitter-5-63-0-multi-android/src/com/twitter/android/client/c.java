// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.app.SearchManager$OnDismissListener;
import android.app.SearchManager$OnCancelListener;
import android.app.SearchManager;
import android.app.PendingIntent;
import java.io.Serializable;
import android.os.Parcelable;
import android.app.AlarmManager;
import android.widget.Toast;
import android.net.Uri;
import android.preference.PreferenceManager;
import com.twitter.library.platform.TwitterDataSyncService;
import java.util.Collection;
import com.twitter.library.media.manager.q;
import com.twitter.library.media.manager.UserImageRequest;
import android.os.Handler;
import com.twitter.eventreporter.EventReporter;
import com.twitter.library.provider.Tweet;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import com.twitter.library.provider.ae;
import com.twitter.library.platform.PushService;
import com.twitter.library.client.App;
import com.twitter.library.api.timeline.o;
import com.twitter.library.service.ab;
import com.twitter.library.api.Recap$Metadata;
import android.accounts.Account;
import com.twitter.library.client.u;
import com.twitter.library.util.bj;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.api.timeline.ad;
import com.twitter.library.client.ag;
import com.twitter.internal.android.service.a;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.api.an;
import com.twitter.library.api.TwitterUser;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.client.k;
import android.annotation.TargetApi;
import android.view.Display;
import com.twitter.library.scribe.TwitterScribeLog;
import android.util.DisplayMetrics;
import android.hardware.display.DisplayManager;
import android.os.Build$VERSION;
import android.content.Intent;
import com.twitter.library.platform.DataSyncResult;
import com.twitter.library.service.y;
import com.twitter.library.api.timeline.w;
import com.twitter.internal.android.service.x;
import com.twitter.library.service.aa;
import com.twitter.library.featureswitch.d;
import com.twitter.library.client.Session;
import com.twitter.android.browser.l;
import com.twitter.library.featureswitch.b;
import com.twitter.library.service.z;
import com.twitter.library.client.ay;
import com.twitter.library.scribe.ScribeService;
import com.twitter.android.browser.g;
import com.twitter.library.client.az;
import com.twitter.library.client.as;
import java.util.HashMap;
import java.util.ArrayList;
import android.content.Context;
import java.util.regex.Pattern;
import com.twitter.library.featureswitch.n;

public class c implements n
{
    private static final Pattern b;
    private static c c;
    final Context a;
    private final ArrayList d;
    private final HashMap e;
    private final HashMap f;
    private as g;
    private az h;
    private boolean i;
    private boolean j;
    private g k;
    private bg l;
    
    static {
        b = Pattern.compile("^https?://\\S+\\/parser$");
    }
    
    private c(final Context a) {
        this.e = new HashMap();
        this.f = new HashMap();
        this.i = false;
        this.j = false;
        ScribeService.a(this.a = a);
        (this.h = az.a(a)).a(new h(this));
        final Session b = this.h.b();
        final long g = b.g();
        this.a(b);
        this.d(g);
        this.d = new ArrayList();
        (this.g = as.a(a)).a(new j(this.a));
        if (b.d()) {
            cj.a(this.a).a(b, false);
            ix.a("fs:first_download_req", ir.b(), ih.m).k();
        }
        else {
            ix.a("fs:first_download_req", ir.b(), ih.m).j();
            com.twitter.library.featureswitch.b.a(g);
        }
        this.k = new l(this.a, 10);
    }
    
    public static c a(final Context context) {
        synchronized (c.class) {
            if (com.twitter.android.client.c.c == null) {
                d.a(com.twitter.android.client.c.c = new c(context.getApplicationContext()));
            }
            return com.twitter.android.client.c.c;
        }
    }
    
    private void a(final Session session, final com.twitter.library.platform.d d) {
        final int c = d.c;
        final aa aa = new aa();
        final x x = new x();
        aa.a(true);
        x.a(aa);
        this.g.a(new w(this.a, session, session.f()).d(c).e(c), x);
    }
    
    private void a(final DataSyncResult dataSyncResult, final Intent intent) {
        final Session b = this.h.b(dataSyncResult.a);
        if (b != null) {
            this.a(b, dataSyncResult, intent);
        }
    }
    
    @TargetApi(17)
    private void d(final long n) {
        final Context a = this.a;
        DisplayMetrics displayMetrics = a.getResources().getDisplayMetrics();
        if (Build$VERSION.SDK_INT >= 17) {
            final Display display = ((DisplayManager)a.getSystemService("display")).getDisplay(0);
            if (display != null) {
                final DisplayMetrics displayMetrics2 = new DisplayMetrics();
                display.getRealMetrics(displayMetrics2);
                displayMetrics = displayMetrics2;
            }
        }
        int n2;
        int n3;
        if (displayMetrics.widthPixels > displayMetrics.heightPixels) {
            final int widthPixels = displayMetrics.widthPixels;
            final int heightPixels = displayMetrics.heightPixels;
            n2 = widthPixels;
            n3 = heightPixels;
        }
        else {
            final int heightPixels2 = displayMetrics.heightPixels;
            final int widthPixels2 = displayMetrics.widthPixels;
            n2 = heightPixels2;
            n3 = widthPixels2;
        }
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { "app::::launch" })).c("display_info:" + n2 + "x" + n3 + "," + displayMetrics.densityDpi);
        String s;
        if (sk.a().d()) {
            s = "location_enabled";
        }
        else {
            s = "location_disabled";
        }
        ScribeService.a(a, ((TwitterScribeLog)twitterScribeLog.g(s)).b(a));
    }
    
    private void n() {
        final Session b = this.h.b();
        final k k = new k(this.a, b.e());
        if (!k.getBoolean("auto_device_follow_candidate", false) || !com.twitter.library.featureswitch.d.a("intp_nux_autodevicefollow_3263", new String[] { "auto_devicefollow_bucket" })) {
            return;
        }
        try {
            final pb pb = new pb(this.a, b, Long.parseLong(com.twitter.library.featureswitch.d.g("intp_nux_autodevicefollow_account")), null);
            pb.a(true);
            pb.j("background device follow");
            this.g.a(pb, new e(this, pb, k));
        }
        catch (NumberFormatException ex) {
            ErrorReporter.a(ex);
        }
    }
    
    private void o() {
        int i = 0;
        final TwitterUser f = this.h.b().f();
        Label_0088: {
            if (f == null || !f.verified) {
                break Label_0088;
            }
            boolean b = true;
            while (true) {
                com.crashlytics.android.d.a("verified_user", b);
                try {
                    for (ArrayList a = com.twitter.library.featureswitch.d.a(1024); i < a.size(); ++i) {
                        com.crashlytics.android.d.a("feature_switch_" + i, a.get(i));
                    }
                    break;
                    b = false;
                    continue;
                }
                catch (Exception ex) {
                    ErrorReporter.a(ex);
                }
                break;
            }
        }
    }
    
    public az a() {
        return this.h;
    }
    
    public void a(final int n) {
        final Session b = this.h.b();
        this.g.a(new an(this.a, b).g(3).b("user_id", b.g()).a("prompt_id", n));
    }
    
    public void a(final int n, final long n2, final String s, final PromotedEvent promotedEvent) {
        this.g.a(new nt(this.a, this.h.b(), n, n2).a(s).a(promotedEvent));
    }
    
    @Override
    public void a(final long n) {
        ag.a(this.a).a(n);
        this.n();
    }
    
    public void a(final long n, final long n2) {
        this.g.a(new ad(this.a, this.h.b(), n, n2));
    }
    
    public void a(final long n, final String s, final String s2) {
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { s });
        if (s2 != null) {
            twitterScribeLog.c(new String[] { s2 });
        }
        ScribeService.a(this.a, twitterScribeLog);
    }
    
    public void a(final long n, final String s, final boolean b) {
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { s })).f("app_download_client_event")).a("4", bj.a());
        if (b) {
            twitterScribeLog.b(this.a);
        }
        final com.twitter.library.api.b a = u.a.a();
        if (a != null) {
            twitterScribeLog.a("6", a.a());
            twitterScribeLog.a(a.b());
        }
        ScribeService.a(this.a, twitterScribeLog);
    }
    
    public void a(final long n, final String... array) {
        ScribeService.a(this.a, new TwitterScribeLog(n).b(array));
    }
    
    public void a(final Account account, final int n) {
        this.a(account, n, true);
    }
    
    public void a(final Account e, final int f, final boolean g) {
        final com.twitter.library.api.account.aa aa = (com.twitter.library.api.account.aa)new com.twitter.library.api.account.aa(this.a, this.h.b()).c(2);
        aa.e = e;
        aa.f = f;
        aa.g = g;
        this.g.a(aa);
    }
    
    public void a(final Context context, final String s, final TwitterScribeLog twitterScribeLog, final TwitterScribeLog twitterScribeLog2, final PromotedContent promotedContent, final long n, final long n2, final long n3) {
        if (com.twitter.util.c.a(context, s)) {
            if (twitterScribeLog != null) {
                twitterScribeLog.g(2);
                this.a(twitterScribeLog);
            }
            if (twitterScribeLog2 != null) {
                twitterScribeLog2.g(2);
                this.b(twitterScribeLog2);
            }
            if (promotedContent != null) {
                this.a(PromotedEvent.s, promotedContent);
            }
        }
        else if (System.currentTimeMillis() < n + n2) {
            this.b(context, s, twitterScribeLog, twitterScribeLog2, promotedContent, n, n2, n3);
        }
    }
    
    void a(final Intent intent) {
        while (true) {
            try {
                final DataSyncResult dataSyncResult = (DataSyncResult)intent.getParcelableExtra("data");
                if (dataSyncResult != null) {
                    this.a(dataSyncResult, intent);
                }
            }
            catch (Exception ex) {
                final DataSyncResult dataSyncResult = null;
                continue;
            }
            break;
        }
    }
    
    public void a(final bg l) {
        this.l = l;
    }
    
    public void a(final PromotedEvent promotedEvent, final PromotedContent promotedContent) {
        this.a(promotedEvent, promotedContent, null);
    }
    
    public void a(final PromotedEvent promotedEvent, final PromotedContent promotedContent, final String s) {
        this.a(promotedEvent, promotedContent, null, null, null, null, null, null, null, s);
    }
    
    public void a(final PromotedEvent promotedEvent, final PromotedContent promotedContent, final String s, final String s2) {
        this.a(promotedEvent, promotedContent, null, s, null, null, null, null, null, s2);
    }
    
    public void a(final PromotedEvent promotedEvent, final PromotedContent promotedContent, final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7) {
        this.a(promotedEvent, promotedContent, s, s2, s3, s4, s5, s6, s7, null);
    }
    
    public void a(final PromotedEvent promotedEvent, final PromotedContent promotedContent, final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final String s8) {
        this.g.a(new nu(this.a, this.h.b(), promotedEvent).b(promotedContent.impressionId).a(promotedContent.b()).a(s).c(s2).d(s3).e(s4).f(s5).g(s6).h(s7).i(s8));
    }
    
    public void a(final Recap$Metadata recap$Metadata) {
        this.g.a(new o(this.a, new ab(this.h.b()), recap$Metadata));
    }
    
    void a(final Session session) {
        final long g = session.g();
        com.crashlytics.android.d.d(session.e());
        com.twitter.library.featureswitch.d.a(g);
        this.o();
        ea.a(this.a).a();
        if (com.twitter.library.client.ad.a().c()) {
            com.twitter.library.featureswitch.b.a(g, 60000L);
        }
        this.i = false;
        this.j = false;
    }
    
    void a(final Session session, final DataSyncResult dataSyncResult, final Intent intent) {
        final boolean booleanExtra = intent.getBooleanExtra("from_push", false);
        final String a = dataSyncResult.a;
        if (session.f() == null) {
            if (App.c()) {
                ErrorReporter.a(new i(a, session, com.twitter.library.util.a.a(this.a), booleanExtra).a(new IllegalStateException("ANDFRAME-286")));
            }
        }
        else {
            final ArrayList d = this.d;
            final cj a2 = cj.a(this.a);
            if (dataSyncResult.g != null) {
                a2.a(session, false);
                this.a(session, dataSyncResult.g);
            }
            if (dataSyncResult.j != null) {
                a2.a(session, false);
                for (int i = -1 + d.size(); i >= 0; --i) {
                    d.get(i).a(session, null, 200, null, 0, 0L, 0L, dataSyncResult.j.c, booleanExtra);
                }
            }
            if (dataSyncResult.k != null) {
                for (int n = -1 + d.size(); n >= 0 && !d.get(n).a(dataSyncResult.a); --n) {}
            }
            final Account a3 = com.twitter.library.util.a.a(this.a, a);
            if (a3 != null) {
                final boolean c = PushService.c(this.a);
                boolean b;
                if ((c && PushService.d(this.a, a3)) || (!c && ContentResolver.getIsSyncable(a3, ae.c) > 0 && ContentResolver.getSyncAutomatically(a3, ae.c))) {
                    b = true;
                }
                else {
                    b = false;
                }
                if (b && intent.getBooleanExtra("show_notif", true)) {
                    final Account[] accountsByType = AccountManager.get(this.a).getAccountsByType(com.twitter.library.util.a.a);
                    if (accountsByType != null && accountsByType.length > 0) {
                        com.twitter.android.client.x.a(this.a).a(dataSyncResult);
                    }
                }
            }
        }
    }
    
    public void a(final com.twitter.library.client.aa aa) {
        if (this.d.contains(aa)) {
            return;
        }
        this.d.add(aa);
    }
    
    public void a(final Tweet tweet) {
        this.g.a(new com.twitter.library.api.timeline.n(this.a, new ab(this.h.b()), tweet));
    }
    
    public void a(final ScribeLog scribeLog) {
        EventReporter.a(scribeLog);
    }
    
    public void a(final String s) {
        if (this.l != null) {
            this.l.a(s);
        }
    }
    
    void a(final String s, final long n, final long n2) {
        final Context a = this.a;
        new Handler(a.getMainLooper()).postDelayed((Runnable)new com.twitter.android.client.d(this, a, s, n), n2);
    }
    
    public void a(final ArrayList list) {
        ScribeService.a(this.a, list);
    }
    
    public void a(final boolean i) {
        this.i = i;
    }
    
    public void a(final String[] array, final int[] array2) {
        if (array != null && array.length > 0 && array2 != null && array2.length > 0) {
            final ArrayList<String> list = new ArrayList<String>(array.length * array2.length);
            for (final String s : array) {
                for (int length2 = array2.length, j = 0; j < length2; ++j) {
                    list.add(UserImageRequest.a(s, array2[j]).a().n());
                }
            }
            q.a(this.a).c().a(list);
        }
    }
    
    boolean a(final Session session, final boolean b) {
        final Context a = this.a;
        final String e = session.e();
        final long g = session.g();
        final WidgetControl a2 = cj.a(this.a).a(g);
        if (a2 != null) {
            a2.a(b);
        }
        if (b) {
            this.g.a();
            q.a(a).f();
            this.a(this.h.b());
        }
        new k(this.a, e).a().a().apply();
        this.a(e, g, 300000L);
        com.twitter.library.featureswitch.d.b(this.a, g);
        TwitterDataSyncService.a(a);
        return b;
    }
    
    public g b() {
        return this.k;
    }
    
    public void b(final int n) {
        final Session b = this.h.b();
        this.g.a(new an(this.a, b).g(1).b("user_id", b.g()).a("prompt_id", n));
    }
    
    public void b(final long n) {
        PreferenceManager.getDefaultSharedPreferences(this.a).edit().putLong("fft", n).apply();
    }
    
    public void b(final Context context) {
        if (com.twitter.library.util.an.a(context)) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(com.twitter.library.util.an.a(context, context.getPackageName()))).addFlags(1073741824));
            return;
        }
        Toast.makeText(context, 2131297444, 1).show();
    }
    
    public void b(final Context context, final String s, final TwitterScribeLog twitterScribeLog, final TwitterScribeLog twitterScribeLog2, final PromotedContent promotedContent, final long n, final long n2, final long n3) {
        ((AlarmManager)context.getSystemService("alarm")).set(0, n3 + System.currentTimeMillis(), PendingIntent.getBroadcast(context, 0, new Intent(context, (Class)AppBroadcastReceiver.class).putExtra("app_id", s).putExtra("scribe_log", (Parcelable)twitterScribeLog).putExtra("scribe_download_log", (Parcelable)twitterScribeLog2).putExtra("promoted_content", (Serializable)promotedContent).putExtra("timestamp", n).putExtra("timeframe", n2).putExtra("polling_interval", n3).setAction(com.twitter.android.card.u.a).setData(Uri.withAppendedPath(com.twitter.android.card.u.b, s)), 134217728));
    }
    
    public void b(final com.twitter.library.client.aa aa) {
        this.d.remove(aa);
    }
    
    public void b(final ScribeLog scribeLog) {
        ScribeService.b(this.a, scribeLog);
    }
    
    public void b(final boolean j) {
        this.j = j;
    }
    
    public String c(final long n) {
        return this.g.a(new com.twitter.library.api.timeline.j(this.a, this.h.b(), n));
    }
    
    public void c(final int n) {
        final Session b = this.h.b();
        this.g.a(new an(this.a, b).g(2).b("user_id", b.g()).a("prompt_id", n));
    }
    
    public void c(final Context context) {
        final SearchManager searchManager = (SearchManager)context.getSystemService("search");
        searchManager.setOnCancelListener((SearchManager$OnCancelListener)new f(this));
        searchManager.setOnDismissListener((SearchManager$OnDismissListener)new com.twitter.android.client.g(this));
    }
    
    public boolean c() {
        return this.i;
    }
    
    public boolean d() {
        return this.j;
    }
    
    public boolean e() {
        if (com.twitter.library.featureswitch.d.c(this.h.b().g())) {
            return com.twitter.library.featureswitch.d.a("nux_copy_improvements_3303", new String[] { "new_copy" });
        }
        return "new_copy".equals(com.twitter.library.featureswitch.d.b("nux_copy_improvements_3303"));
    }
    
    public y f() {
        final Session b = this.h.b();
        if (b.d()) {
            final TwitterUser f = b.f();
            if (f != null && (f.userId > 0L || f.username != null)) {
                final Long n = this.f.get(f.userId);
                final long currentTimeMillis = System.currentTimeMillis();
                if (n == null || currentTimeMillis - n > 60000L) {
                    this.f.put(f.userId, currentTimeMillis);
                    return new qd(this.a, b, f.userId, f.username);
                }
            }
        }
        return null;
    }
    
    public void g() {
        this.l = null;
    }
    
    public void h() {
        final Session b = this.h.b();
        final Long n = this.e.get(b);
        final long currentTimeMillis = System.currentTimeMillis();
        if (n == null || currentTimeMillis - n > 60000L) {
            this.e.put(b, currentTimeMillis);
            this.g.a(new com.twitter.library.api.account.e(this.a, b, bh.a(this.a).k()));
        }
    }
    
    public long i() {
        return PreferenceManager.getDefaultSharedPreferences(this.a).getLong("fft", 0L);
    }
    
    public void j() {
        PreferenceManager.getDefaultSharedPreferences(this.a).edit().putLong("ffft", System.currentTimeMillis()).apply();
    }
    
    public boolean k() {
        return this.l() && PreferenceManager.getDefaultSharedPreferences(this.a).getBoolean("readability_mode", true);
    }
    
    public boolean l() {
        return com.twitter.library.featureswitch.d.f("readability_v2_enabled") && com.twitter.android.client.c.b.matcher(com.twitter.library.featureswitch.d.g("readability_v2_proxy_uri")).matches();
    }
    
    public boolean m() {
        return com.twitter.library.featureswitch.d.f("home_timeline_subheader_enabled");
    }
}
