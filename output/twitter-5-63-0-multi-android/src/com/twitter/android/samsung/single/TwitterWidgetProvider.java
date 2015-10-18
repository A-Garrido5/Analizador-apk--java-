// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import com.twitter.android.samsung.data.PollingService;
import android.annotation.TargetApi;
import com.twitter.library.api.timeline.a;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.timeline.l;
import com.twitter.library.api.timeline.f;
import com.twitter.library.client.as;
import android.widget.Toast;
import com.twitter.library.provider.Tweet;
import android.net.Uri;
import com.twitter.android.samsung.data.WidgetDataUpdateService;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import android.app.PendingIntent;
import android.os.Bundle;
import android.content.Intent;
import com.twitter.android.samsung.data.j;
import android.accounts.Account;
import com.twitter.android.samsung.model.g;
import android.accounts.AccountManager;
import android.widget.RemoteViews;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.twitter.library.client.App;
import android.appwidget.AppWidgetProvider;

@Deprecated
public class TwitterWidgetProvider extends AppWidgetProvider
{
    protected static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    private static final String f;
    private static final String g;
    private static final String h;
    
    static {
        f = App.a(".widget.single.navigation.forward");
        g = App.a(".widget.single.navigation.back");
        h = App.a(".widget.single.flipper.item_click");
        a = App.a(".widget.single.flipper.image_update");
        b = App.a(".widget.single.APPWIDGET_DATA_UPDATE");
        c = App.a(".widget.single.update_feed");
        d = App.a(".widget.single.logged_out_feed_updated");
        e = App.a(".single.configuration_changed");
    }
    
    private RemoteViews a(final Context context, final AppWidgetManager appWidgetManager, final int n) {
        final RemoteViews b = this.b(context, appWidgetManager, n);
        this.b(context, b, n);
        this.a(context, n, b);
        return b;
    }
    
    private void a(final Context context) {
        final Account[] accountsByType = AccountManager.get(context).getAccountsByType(com.twitter.android.samsung.model.g.a);
        final int[] d = n.d(context);
        for (int i = 0; i < d.length; ++i) {
            final int n = d[i];
            if (com.twitter.android.samsung.model.g.a(context) > 0) {
                final String name = accountsByType[0].name;
                if (i.f(context, n)) {
                    i.a(context, name, n);
                    this.a(context, n, true);
                }
                else if (com.twitter.android.samsung.model.g.a(context, i.a(context, n)) == null) {
                    i.a(context, name, n);
                    this.a(context, n, true);
                }
            }
            else if (i.g(context, n)) {
                i.h(context, n);
                this.a(context, n, true);
            }
        }
    }
    
    private void a(final Context context, final int n) {
        final AppWidgetManager instance = AppWidgetManager.getInstance(context);
        final RemoteViews b = this.b(context, instance, n);
        this.b(context, b, n);
        b.setViewVisibility(2131887378, 0);
        b.setOnClickPendingIntent(2131887378, this.d(context, n));
        instance.updateAppWidget(n, b);
    }
    
    private void a(final Context context, final int n, final RemoteViews remoteViews) {
        remoteViews.setOnClickPendingIntent(2131887373, this.a(context, n, 2131887373));
        remoteViews.setOnClickPendingIntent(2131887374, this.a(context, n, 2131887374));
        remoteViews.setOnClickPendingIntent(2131887372, this.c(context, n));
        remoteViews.setOnClickPendingIntent(2131886988, this.b(context, n));
    }
    
    private void a(final Context context, final int n, final boolean b) {
        j.a(n);
        this.a(context, AppWidgetManager.getInstance(context), n, false, b);
    }
    
    private void a(final Context context, final AppWidgetManager appWidgetManager, final int n, final boolean b, final boolean b2) {
        if (!n.c(context, n)) {
            return;
        }
        final RemoteViews a = this.a(context, appWidgetManager, n);
        this.a(context, a, n);
        if (j.b(context, n) || b) {
            appWidgetManager.notifyAppWidgetViewDataChanged(n, 2131887376);
            appWidgetManager.notifyAppWidgetViewDataChanged(n, 2131887375);
        }
        a.setViewVisibility(2131887378, 8);
        appWidgetManager.updateAppWidget(n, a);
    }
    
    private void a(final Context context, final Intent intent) {
        final int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (n.c(context, intExtra)) {
            this.a(context, intExtra, false);
        }
    }
    
    private void a(final Context context, final Bundle bundle) {
        final int int1 = bundle.getInt("appWidgetId", 0);
        if (int1 != 0) {
            j.a(int1);
            this.a(context, AppWidgetManager.getInstance(context), int1, false, true);
        }
    }
    
    private void a(final Context context, final RemoteViews remoteViews, final int n) {
        final Intent intent = new Intent(context, (Class)TwitterWidgetProvider.class);
        intent.setAction(TwitterWidgetProvider.h);
        final PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728);
        remoteViews.setPendingIntentTemplate(2131887376, broadcast);
        remoteViews.setPendingIntentTemplate(2131887375, broadcast);
    }
    
    public static void a(final Context context, final String s, final int n) {
        String s2;
        if (i.f(context, n)) {
            s2 = "loggedout";
        }
        else {
            s2 = "loggedin";
        }
        com.twitter.android.client.c.a(context).a(az.a(context).b().g(), new String[] { s, s2 });
    }
    
    private void a(final Context context, final boolean b) {
        final AppWidgetManager instance = AppWidgetManager.getInstance(context);
        final int[] d = n.d(context);
        for (int i = 0; i < d.length; ++i) {
            final int n = d[i];
            if (b) {
                j.a(n);
            }
            this.a(context, instance, n, false, false);
        }
    }
    
    private static void a(final RemoteViews remoteViews, final TwitterWidgetProvider$NavDirection twitterWidgetProvider$NavDirection) {
        int n;
        if (twitterWidgetProvider$NavDirection == TwitterWidgetProvider$NavDirection.b) {
            n = 0;
        }
        else {
            n = 4;
        }
        remoteViews.setViewVisibility(2131887375, n);
        final TwitterWidgetProvider$NavDirection a = TwitterWidgetProvider$NavDirection.a;
        int n2 = 0;
        if (twitterWidgetProvider$NavDirection != a) {
            n2 = 4;
        }
        remoteViews.setViewVisibility(2131887376, n2);
        switch (com.twitter.android.samsung.single.j.a[twitterWidgetProvider$NavDirection.ordinal()]) {
            default: {}
            case 1: {
                remoteViews.showPrevious(2131887375);
                remoteViews.showPrevious(2131887376);
            }
            case 2: {
                remoteViews.showNext(2131887376);
                remoteViews.showNext(2131887375);
            }
        }
    }
    
    private boolean a(final Context context, final String s, final Bundle bundle) {
        return s.equals(TwitterWidgetProvider.c) && n.c(context);
    }
    
    private boolean a(final String s) {
        return s.equals(TwitterWidgetProvider.e);
    }
    
    private boolean a(final String s, final Bundle bundle) {
        return s.equals(TwitterWidgetProvider.b);
    }
    
    private PendingIntent b(final Context context, final int n) {
        return PendingIntent.getActivity(context, n, n.a(context, n), 134217728);
    }
    
    private RemoteViews b(final Context context, final AppWidgetManager appWidgetManager, final int n) {
        int n2;
        if (n.d(context, n)) {
            n2 = 2130969222;
        }
        else {
            n2 = 2130969215;
        }
        return new RemoteViews(context.getPackageName(), n2);
    }
    
    private void b(final Context context, final Intent intent) {
        final int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (n.c(context, intExtra)) {
            this.a(context, AppWidgetManager.getInstance(context), intExtra, true, false);
        }
    }
    
    private void b(final Context context, final Bundle bundle) {
        final int int1 = bundle.getInt("appWidgetId");
        final Integer value = bundle.getInt("direction");
        if (value != null) {
            this.a(context, Integer.valueOf(int1), value);
            WidgetDataUpdateService.a(context, int1);
        }
    }
    
    private void b(final Context context, final RemoteViews remoteViews, final int n) {
        final Intent intent = new Intent(context, (Class)BackFlipperService.class);
        final Intent intent2 = new Intent(context, (Class)ForwardFlipperService.class);
        intent.putExtra("appWidgetId", n);
        intent.setData(Uri.parse(intent.toUri(1)));
        intent2.putExtra("appWidgetId", n);
        intent2.setData(Uri.parse(intent2.toUri(1)));
        remoteViews.setRemoteAdapter(2131887376, intent2);
        remoteViews.setRemoteAdapter(2131887375, intent);
        remoteViews.setEmptyView(2131887376, 2131887377);
        remoteViews.setEmptyView(2131887375, 2131887377);
    }
    
    private boolean b(final String s) {
        return s.equals("android.intent.action.LOCALE_CHANGED");
    }
    
    private boolean b(final String s, final Bundle bundle) {
        return s.equals(TwitterWidgetProvider.a);
    }
    
    private PendingIntent c(final Context context, final int n) {
        return PendingIntent.getActivity(context, n, n.b(context, n), 134217728);
    }
    
    private void c(final Context context, final Bundle bundle) {
        final int int1 = bundle.getInt("clickType");
        final int int2 = bundle.getInt("appWidgetId", -1);
        final String a = i.a(context, int2);
        final FlipperViewsFactory$FlipperClickType flipperViewsFactory$FlipperClickType = FlipperViewsFactory$FlipperClickType.values()[int1];
        String s = "widget::tweet::action";
        Intent intent = null;
        switch (com.twitter.android.samsung.single.j.b[flipperViewsFactory$FlipperClickType.ordinal()]) {
            default: {
                intent = n.a(context, bundle, flipperViewsFactory$FlipperClickType);
                break;
            }
            case 1: {
                a(context, "widget::tweet::share", int2);
                final Tweet tweet = (Tweet)bundle.getParcelable("tweet");
                n.a(context, tweet.a(), tweet.F, tweet.y, tweet.A, tweet.D);
                return;
            }
            case 2: {
                if (!n.c(context)) {
                    Toast.makeText(context, (CharSequence)context.getResources().getString(2131296290), 0).show();
                    return;
                }
                a(context, "widget::tweet::favorite", int2);
                final az a2 = az.a(context);
                final as a3 = as.a(context);
                final Tweet tweet2 = (Tweet)bundle.getParcelable("tweet");
                a a4;
                if (!tweet2.e) {
                    a4 = new f(context, a2.b(a), tweet2.D, tweet2.E).a(tweet2.j);
                }
                else {
                    a4 = new l(context, a2.b(a), tweet2.D).a(tweet2.j);
                }
                a4.k("Widget favorites are triggered by a user action. The app will not be visible when the user is interacting with the widget.");
                a3.a(a4, (z)null);
                final Intent intent2 = new Intent();
                intent2.putExtras(bundle);
                this.a(context, intent2);
                return;
            }
            case 3: {
                intent = n.a(context);
                break;
            }
            case 4: {
                intent = n.b(context);
                break;
            }
            case 5: {
                s = "widget::tweet::retweet";
                intent = n.a(context, bundle, flipperViewsFactory$FlipperClickType);
                break;
            }
            case 6: {
                s = "widget::tweet::click";
                intent = n.a(context, bundle, flipperViewsFactory$FlipperClickType);
                break;
            }
            case 7: {
                s = "widget::tweet:profileimage:click";
                intent = n.a(context, bundle, flipperViewsFactory$FlipperClickType);
                break;
            }
            case 8: {
                s = "widget::tweet::reply";
                intent = n.a(context, bundle, flipperViewsFactory$FlipperClickType);
                break;
            }
            case 9: {
                intent = n.a(context, bundle.getInt("appWidgetId", -1));
                break;
            }
        }
        a(context, s, int2);
        if (intent != null) {
            context.startActivity(intent);
        }
    }
    
    private boolean c(final String s) {
        return s.equals(TwitterWidgetProvider.g) || s.equals(TwitterWidgetProvider.f);
    }
    
    private boolean c(final String s, final Bundle bundle) {
        return s.equals("android.net.conn.CONNECTIVITY_CHANGE") || s.equals("android.net.wifi.WIFI_STATE_CHANGED");
    }
    
    private PendingIntent d(final Context context, final int n) {
        final Intent intent = new Intent(context, (Class)DataChargesActivity.class);
        intent.setFlags(276856832);
        intent.putExtra("appWidgetId", n);
        return PendingIntent.getActivity(context, n, intent, 134217728);
    }
    
    private void d(final Context context, final Bundle bundle) {
        final int[] d = n.d(context);
        for (int i = 0; i < d.length; ++i) {
            final int n = d[i];
            if (i.f(context, n)) {
                this.a(context, n, false);
            }
        }
    }
    
    private boolean d(final String s, final Bundle bundle) {
        return s.equals(TwitterWidgetProvider.h);
    }
    
    private boolean e(final String s, final Bundle bundle) {
        return s.equals(TwitterWidgetProvider.d);
    }
    
    private boolean f(final String s, final Bundle bundle) {
        return s.equals("android.accounts.LOGIN_ACCOUNTS_CHANGED");
    }
    
    protected PendingIntent a(final Context context, final int n, final int n2) {
        final Intent intent = new Intent(context, (Class)TwitterWidgetProvider.class);
        intent.putExtra("appWidgetId", n);
        intent.putExtra("direction", n2);
        if (n2 == 2131887374) {
            intent.setAction(TwitterWidgetProvider.f);
        }
        else {
            intent.setAction(TwitterWidgetProvider.g);
        }
        return PendingIntent.getBroadcast(context, n, intent, 134217728);
    }
    
    protected void a(final Context context, final Integer n, final Integer n2) {
        final AppWidgetManager instance = AppWidgetManager.getInstance(context);
        final RemoteViews b = this.b(context, instance, n);
        if (n2 == 2131887373) {
            a(context, "widget::tweet:prev:click", n);
            a(b, TwitterWidgetProvider$NavDirection.b);
        }
        else if (n2 == 2131887374) {
            a(context, "widget::tweet:next:click", n);
            a(b, TwitterWidgetProvider$NavDirection.a);
        }
        instance.partiallyUpdateAppWidget((int)n, b);
    }
    
    @TargetApi(16)
    public void onAppWidgetOptionsChanged(final Context context, final AppWidgetManager appWidgetManager, final int n, final Bundle bundle) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, n, bundle);
        a(context, "widget::::resize", n);
        if (i.d(context, n)) {
            this.a(context, appWidgetManager, n, false, false);
            return;
        }
        this.a(context, n);
    }
    
    public void onDeleted(final Context context, final int[] array) {
        for (int i = 0; i < array.length; ++i) {
            final int n = array[i];
            i.h(context, n);
            a(context, "widget::::remove", n);
            PollingService.b(context, n);
        }
        super.onDeleted(context, array);
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final String action = intent.getAction();
        final Bundle extras = intent.getExtras();
        if ("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS".equals(action)) {
            final int int1 = extras.getInt("appWidgetId");
            if (n.d(context, int1) && !i.d(context, int1)) {
                i.e(context, int1);
                if (i.a(context, int1) == null) {
                    final Account[] accountsByType = AccountManager.get(context).getAccountsByType(com.twitter.android.samsung.model.g.a);
                    if (accountsByType.length > 0) {
                        i.a(context, accountsByType[0].name, int1);
                    }
                }
            }
        }
        else if (this.c(action)) {
            this.b(context, extras);
        }
        else if (this.a(action, extras)) {
            this.a(context, intent);
        }
        else if (this.b(action, extras)) {
            this.b(context, intent);
        }
        else if (this.a(context, action, extras)) {
            this.a(context, intent);
        }
        else if (this.c(action, extras)) {
            if (n.c(context)) {
                this.a(context, true);
                PollingService.a(context);
            }
            else {
                PollingService.b(context);
            }
        }
        else if (this.d(action, extras)) {
            this.c(context, extras);
        }
        else if (this.e(action, extras)) {
            this.d(context, extras);
        }
        else if (this.f(action, extras)) {
            this.a(context);
        }
        else if (this.b(action)) {
            WidgetDataUpdateService.a(context);
        }
        else if (this.a(action)) {
            this.a(context, extras);
        }
        super.onReceive(context, intent);
    }
    
    public void onUpdate(final Context context, final AppWidgetManager appWidgetManager, final int[] array) {
        for (int i = 0; i < array.length; ++i) {
            final int n = array[i];
            if (i.d(context, n)) {
                PollingService.a(context, array[i]);
                this.a(context, n, false);
            }
            else {
                this.a(context, n);
            }
        }
        super.onUpdate(context, appWidgetManager, array);
    }
}
