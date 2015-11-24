// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.preference.PreferenceManager;
import android.os.Build$VERSION;
import java.util.regex.Matcher;
import com.twitter.android.UrlInterpreterActivity;
import com.twitter.android.util.aj;
import com.twitter.android.TweetActivity;
import com.twitter.library.util.text.d;
import android.os.Parcelable;
import android.net.Uri;
import android.content.Intent;
import com.twitter.android.browser.BrowserActivity;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.util.bn;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.api.UrlEntity;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.az;
import android.view.View;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.app.AlertDialog$Builder;
import android.content.Context;
import android.app.AlertDialog;
import android.content.DialogInterface$OnClickListener;
import android.app.Activity;
import com.twitter.util.collection.CollectionUtils;
import java.util.Set;
import java.util.regex.Pattern;

public abstract class am
{
    public static final Pattern a;
    public static final Set b;
    public static final Set c;
    
    static {
        a = Pattern.compile("^https?://twitter\\.com(/#!)?/(mentions|i/connect)$");
        b = CollectionUtils.a("com.android.chrome", "com.android.browser", "org.mozilla.firefox", "com.opera.mini.android", "com.opera.browser", "mobi.mgeek.TunnyBrowser", "com.UCMobile.intl");
        c = CollectionUtils.a("www.periscope.tv", "periscope.tv");
    }
    
    public static AlertDialog a(final Activity activity, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        final bh a = bh.a((Context)activity);
        final AlertDialog create = new AlertDialog$Builder((Context)activity).setTitle(2131296800).setPositiveButton(2131297362, dialogInterface$OnClickListener).setNegativeButton(2131296445, dialogInterface$OnClickListener).setCancelable(false).create();
        final View inflate = activity.getLayoutInflater().inflate(2130968709, (ViewGroup)null, false);
        final String f = a.f();
        if (!TextUtils.isEmpty((CharSequence)f)) {
            final TextView textView = (TextView)inflate.findViewById(2131886625);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText((CharSequence)Html.fromHtml(f));
        }
        create.setView(inflate);
        return create;
    }
    
    public static void a(final Context context, final n n) {
        final c a = com.twitter.android.client.c.a(context);
        final bh a2 = bh.a(context);
        final long g = az.a(context).b().g();
        a((Activity)context, (DialogInterface$OnClickListener)new an(n, a2, a, g)).show();
        if (n.b() == 1) {
            a.a(g, "tweet:accept_data:::impression");
        }
    }
    
    public static void a(final Context context, final Tweet tweet, final UrlEntity urlEntity, final long n, final String s, final String s2, final TwitterScribeAssociation twitterScribeAssociation, final String s3) {
        final c a = com.twitter.android.client.c.a(context);
        if (tweet != null && tweet.j != null) {
            a.a(PromotedEvent.b, tweet.j, urlEntity.url, null, null, null, null, null, null);
        }
        if (urlEntity instanceof MediaEntity && tweet != null) {
            final aq aq = new aq(context, tweet, twitterScribeAssociation, (MediaEntity)urlEntity);
            if (bh.a(context).g() && !urlEntity.displayUrl.startsWith("pic.twitter.com")) {
                a(context, aq);
            }
            else {
                aq.a();
            }
        }
        else if (tweet != null && (tweet.j != null || tweet.P)) {
            final String b = bn.b(urlEntity.url);
            a(context, b, urlEntity.expandedUrl, n, new ao(context, b, tweet));
            if (tweet.j != null) {
                WebsiteDwellMonitor.a(context, tweet.j, b);
            }
        }
        else {
            final String b2 = bn.b(urlEntity.url);
            n n2;
            if (a.k()) {
                n2 = new ap(context, b2);
            }
            else {
                n2 = new ao(context, b2, tweet);
            }
            a(context, b2, urlEntity.expandedUrl, n, n2);
        }
        if (s != null) {
            a.a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(n).a(context, tweet, twitterScribeAssociation, null).b(new String[] { s })).c(new String[] { s2 })).a(twitterScribeAssociation)).b(urlEntity.expandedUrl, urlEntity.url)).e(s3));
        }
    }
    
    public static void a(final Context context, final Tweet tweet, final String s, final long n, final String s2, final String s3, final TwitterScribeAssociation twitterScribeAssociation) {
        final c a = com.twitter.android.client.c.a(context);
        if (tweet != null && tweet.j != null) {
            a.a(PromotedEvent.n, tweet.j);
        }
        final String b = bn.b(s);
        a(context, b, null, n, new ar(context, b, tweet));
        if (s2 != null && n != 0L) {
            a.a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(n).a(context, tweet, twitterScribeAssociation, null).b(new String[] { s2 })).c(new String[] { s3 })).a(twitterScribeAssociation)).c(s)).a(s));
        }
    }
    
    public static void a(final Context context, final String s, final long n) {
        a(context, s, n, null);
    }
    
    public static void a(final Context context, final String s, final long n, final Tweet tweet) {
        final String b = bn.b(s);
        a(context, b, null, n, new ar(context, b, tweet));
    }
    
    public static void a(final Context context, final String s, final Tweet tweet) {
        context.startActivity(new Intent(context, (Class)BrowserActivity.class).setData(Uri.parse(s)).putExtra("tweet", (Parcelable)tweet));
    }
    
    private static void a(final Context context, final String s, String s2, final long n, final n n2) {
        if (s2 == null) {
            s2 = s;
        }
        final Matcher matcher = d.e.matcher(s2);
        if (matcher.matches()) {
            final String group = matcher.group();
            context.startActivity(new Intent(context, (Class)TweetActivity.class).setData(com.twitter.library.provider.az.c.buildUpon().appendEncodedPath(group.substring(1 + group.lastIndexOf(47))).appendQueryParameter("ownerId", String.valueOf(n)).build()));
            return;
        }
        if (am.a.matcher(s2).matches()) {
            context.startActivity(aj.a(context, az.a(context).b().f(), false, false));
            return;
        }
        final Uri parse = Uri.parse(s2);
        final bh a = bh.a(context);
        if (UrlInterpreterActivity.b(parse)) {
            context.startActivity(new Intent(context, (Class)UrlInterpreterActivity.class).setData(parse));
            return;
        }
        if (a.g() && bn.e(s)) {
            a(context, n2);
            return;
        }
        n2.a();
    }
    
    public static boolean a() {
        return Build$VERSION.SDK_INT >= 19;
    }
    
    public static boolean a(final Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("in_app_browser", true);
    }
    
    public static boolean a(final Context context, final String s) {
        return !b(context, s) && a(context) && a();
    }
    
    private static boolean a(final Uri uri) {
        final String authority = uri.getAuthority();
        return authority != null && am.c.contains(authority.toLowerCase());
    }
    
    public static boolean b(final Context context, final String s) {
        boolean b;
        if (!bn.e(s)) {
            b = true;
        }
        else {
            final Uri parse = Uri.parse(s);
            final ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", parse), 0);
            b = false;
            if (resolveActivity != null) {
                final ActivityInfo activityInfo = resolveActivity.activityInfo;
                b = false;
                if (activityInfo != null) {
                    final String packageName = resolveActivity.activityInfo.packageName;
                    final boolean empty = TextUtils.isEmpty((CharSequence)packageName);
                    b = false;
                    if (!empty) {
                        final boolean equals = packageName.equals("android");
                        if (am.b.contains(packageName) || equals) {
                            final boolean a = a(parse);
                            b = false;
                            if (!a) {
                                return b;
                            }
                            b = false;
                            if (!equals) {
                                return b;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return b;
    }
}
