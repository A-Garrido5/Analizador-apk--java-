// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import android.annotation.TargetApi;
import android.appwidget.AppWidgetManager;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import com.twitter.android.SignUpActivity;
import android.os.Build$VERSION;
import java.util.Iterator;
import android.content.pm.PackageManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import android.content.pm.ResolveInfo$DisplayNameComparator;
import java.text.SimpleDateFormat;
import com.twitter.android.composer.au;
import com.twitter.library.provider.ae;
import com.twitter.android.TweetActivity;
import com.twitter.library.scribe.TwitterScribeAssociation;
import java.io.Serializable;
import com.twitter.android.ProfileActivity;
import android.os.Parcelable;
import com.twitter.library.provider.Tweet;
import com.twitter.android.DispatchActivity;
import com.twitter.android.LoginActivity;
import android.content.Context;
import android.os.Bundle;
import android.content.Intent;

@Deprecated
public class n
{
    public static Intent a(final int n) {
        final Bundle bundle = new Bundle();
        bundle.putInt("appWidgetId", n);
        bundle.putInt("clickType", FlipperViewsFactory$FlipperClickType.g.ordinal());
        final Intent intent = new Intent();
        intent.putExtras(bundle);
        return intent;
    }
    
    public static Intent a(final Context context) {
        final Intent intent = new Intent(context, (Class)LoginActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268468224);
        intent.putExtra("from_widget", true);
        return intent;
    }
    
    public static Intent a(final Context context, final int n) {
        final Intent intent = new Intent(context, (Class)DispatchActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(276856832);
        intent.putExtra("scribe_event", "widget::twitterlogo::click");
        String s;
        if (i.f(context, n)) {
            s = "loggedout";
        }
        else {
            s = "loggedin";
        }
        intent.putExtra("scribe_context", s);
        intent.putExtra("from_widget", true);
        return intent;
    }
    
    public static Intent a(final Context context, final int n, final long n2, final Tweet tweet) {
        final Intent intent = new Intent(context, (Class)RetweetOptionsActivity.class);
        intent.putExtra("tweet", (Parcelable)tweet);
        intent.putExtra("appWidgetId", n);
        intent.setFlags(276856832);
        return intent;
    }
    
    public static Intent a(final Context context, final Bundle bundle, final FlipperViewsFactory$FlipperClickType flipperViewsFactory$FlipperClickType) {
        final int int1 = bundle.getInt("appWidgetId");
        final String a = i.a(context, int1);
        final long longValue = i.b(context, int1);
        final Tweet tweet = (Tweet)bundle.getParcelable("tweet");
        switch (o.a[flipperViewsFactory$FlipperClickType.ordinal()]) {
            default: {
                return null;
            }
            case 1: {
                return a(context, a, longValue, tweet);
            }
            case 2: {
                return a(context, a, tweet);
            }
            case 3: {
                return a(context, int1, longValue, tweet);
            }
            case 4: {
                return a(context, tweet);
            }
        }
    }
    
    public static Intent a(final Context context, final Tweet tweet) {
        final Intent intent = new Intent(context, (Class)ProfileActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("user_id", tweet.f);
        if (tweet.j != null) {
            intent.putExtra("pc", (Serializable)tweet.j);
        }
        intent.putExtra("association", (Parcelable)((TwitterScribeAssociation)new TwitterScribeAssociation((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(1)).b("tweet")).a(1)).a(tweet.D));
        return intent;
    }
    
    public static Intent a(final Context context, final String s, final long n, final Tweet tweet) {
        final Intent intent = new Intent(context, (Class)TweetActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(ae.a(tweet.E, n));
        intent.setFlags(268435456);
        intent.putExtra("AbsFragmentActivity_account_name", s);
        intent.putExtra("ref_event", "widget:::click");
        return intent;
    }
    
    public static Intent a(final Context context, final String s, final Tweet tweet) {
        return au.a(context).a(tweet.D).c(335544320).a(s).b("widget::::click").p();
    }
    
    private static Intent a(final Context context, final String s, final String s2, final String s3, final long n, final long n2, final SimpleDateFormat simpleDateFormat) {
        final Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.setFlags(268435456);
        intent.putExtra("android.intent.extra.TEXT", context.getString(2131298009, new Object[] { s, s2, simpleDateFormat.format(n), s3, n2 }));
        intent.putExtra("android.intent.extra.SUBJECT", context.getString(2131298012, new Object[] { s, s2 }));
        return intent;
    }
    
    private static void a(final Context context, final Intent intent, final int n) {
        final PackageManager packageManager = context.getPackageManager();
        final List queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Collections.sort((List<Object>)queryIntentActivities, (Comparator<? super Object>)new ResolveInfo$DisplayNameComparator(packageManager));
        final String packageName = context.getPackageName();
        final ArrayList<Intent> list = new ArrayList<Intent>();
        for (final ResolveInfo resolveInfo : queryIntentActivities) {
            final String packageName2 = resolveInfo.activityInfo.packageName;
            if (!packageName2.equals(packageName)) {
                list.add(new Intent(intent).setPackage(packageName2).setFlags(268435456).setComponent(new ComponentName(packageName2, resolveInfo.activityInfo.name)));
            }
        }
        if (list.isEmpty()) {
            return;
        }
        final Intent putExtra = Intent.createChooser((Intent)list.remove(-1 + list.size()), (CharSequence)context.getString(n)).putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[])list.toArray(new Parcelable[list.size()]));
        putExtra.setFlags(268435456);
        try {
            context.startActivity(putExtra);
        }
        catch (ActivityNotFoundException ex) {}
    }
    
    public static void a(final Context context, final String s, final String s2, final String s3, final long n, final long n2) {
        a(context, a(context, s, s2, s3, n, n2, new SimpleDateFormat(context.getString(2131298279))), 2131298011);
    }
    
    public static boolean a() {
        return Build$VERSION.SDK_INT >= 17;
    }
    
    public static Intent b(final int n) {
        final Bundle bundle = new Bundle();
        bundle.putInt("appWidgetId", n);
        bundle.putInt("clickType", FlipperViewsFactory$FlipperClickType.h.ordinal());
        final Intent intent = new Intent();
        intent.putExtras(bundle);
        return intent;
    }
    
    public static Intent b(final Context context) {
        final Intent intent = new Intent(context, (Class)SignUpActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268468224);
        intent.putExtra("from_widget", true);
        return intent;
    }
    
    public static Intent b(final Context context, final int n) {
        final Intent intent = new Intent(context, (Class)WidgetPreferencesActivity.class);
        intent.setFlags(276856832);
        intent.putExtra("appWidgetId", n);
        return intent;
    }
    
    public static boolean b() {
        return Build$VERSION.SDK_INT < 16;
    }
    
    public static boolean c(final Context context) {
        final NetworkInfo activeNetworkInfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
    
    @TargetApi(16)
    public static boolean c(final Context context, final int n) {
        final AppWidgetManager instance = AppWidgetManager.getInstance(context);
        if (b()) {
            if (instance.getAppWidgetInfo(n) == null || !i.d(context, n)) {
                return false;
            }
        }
        else if (instance.getAppWidgetInfo(n) == null || instance.getAppWidgetOptions(n) == null || !i.d(context, n)) {
            return false;
        }
        return true;
    }
    
    @TargetApi(17)
    public static boolean d(final Context context, final int n) {
        final boolean a = a();
        boolean b = false;
        if (a) {
            final int int1 = AppWidgetManager.getInstance(context).getAppWidgetOptions(n).getInt("appWidgetCategory", -1);
            b = false;
            if (int1 == 2) {
                b = true;
            }
        }
        return b;
    }
    
    public static int[] d(final Context context) {
        int i = 0;
        final int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class)TwitterWidgetProvider.class));
        final ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = 0; j < appWidgetIds.length; ++j) {
            if (com.twitter.android.samsung.single.i.d(context, appWidgetIds[j])) {
                list.add(appWidgetIds[j]);
            }
        }
        final int[] array = new int[list.size()];
        while (i < list.size()) {
            array[i] = list.get(i);
            ++i;
        }
        return array;
    }
}
