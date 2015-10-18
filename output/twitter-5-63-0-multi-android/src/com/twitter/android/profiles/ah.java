// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import com.twitter.library.featureswitch.d;
import com.twitter.library.platform.PushService;
import android.text.TextUtils;
import com.twitter.library.api.z;
import com.twitter.android.ReportFlowWebViewActivity;
import android.widget.Toast;
import com.twitter.library.client.AbsFragmentActivity;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.client.Session;
import android.content.Intent;
import com.twitter.android.DMActivity;
import com.twitter.library.api.TwitterUser;
import android.text.method.LinkMovementMethod;
import com.twitter.library.util.bq;
import android.widget.TextView;
import com.twitter.android.lists.b;
import com.twitter.android.DraftsActivity;
import com.twitter.library.view.c;
import android.content.Context;

public class ah
{
    private static c a(final Context context, final int n) {
        return new ai(context.getResources().getColor(2131689601), n, context);
    }
    
    public static String a(final String s, final String s2) {
        return s + ":" + s2;
    }
    
    public static String a(final boolean b) {
        if (b) {
            return "me";
        }
        return "profile";
    }
    
    public static void a(final Context context) {
        context.startActivity(DraftsActivity.a(context, true));
    }
    
    public static void a(final Context context, final long n) {
        context.startActivity(new b(n).a(context));
    }
    
    public static void a(final Context context, final TextView textView, final String s) {
        textView.setText((CharSequence)bq.a(new Object[] { a(context, 0) }, context.getString(2131296380, new Object[] { s, s }), "{{}}"));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    
    public static void a(final Context context, final TwitterUser twitterUser) {
        final Intent intent = new Intent(context, (Class)DMActivity.class);
        if (twitterUser != null) {
            intent.putExtra("user_ids", new long[] { twitterUser.userId });
        }
        intent.putExtra("keyboard_open", true);
        context.startActivity(intent);
    }
    
    public static void a(final com.twitter.android.client.c c, final Session session, final long n, final long n2, final String s, final PromotedContent promotedContent, final String s2, final TwitterScribeAssociation twitterScribeAssociation) {
        c.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(session.g()).b(n, promotedContent, s2).b(new String[] { s })).a(twitterScribeAssociation)).h(String.valueOf(n2)));
    }
    
    public static void a(final AbsFragmentActivity absFragmentActivity, final long n, final long n2) {
        absFragmentActivity.startActivityForResult(new b(n2, n).a((Context)absFragmentActivity), 1);
    }
    
    public static void a(final AbsFragmentActivity absFragmentActivity, final TwitterUser twitterUser, final int n) {
        if (twitterUser == null) {
            Toast.makeText((Context)absFragmentActivity, 2131298040, 0).show();
            return;
        }
        absFragmentActivity.startActivityForResult(new Intent((Context)absFragmentActivity, (Class)ReportFlowWebViewActivity.class).putExtra("spammer_id", twitterUser.userId).putExtra("friendship", n), 5);
    }
    
    public static boolean a() {
        return aj.a();
    }
    
    public static boolean a(final int n) {
        return z.h(n) || z.c(n);
    }
    
    private static boolean a(final int n, final boolean b) {
        return !b && a(n) && !a(b, n);
    }
    
    public static boolean a(final long n, final String s, final Session session) {
        final String e = session.e();
        return (n != 0L && n == session.g()) || (!TextUtils.isEmpty((CharSequence)e) && e.equalsIgnoreCase(s));
    }
    
    public static boolean a(final Context context, final TwitterUser twitterUser, final int n, final boolean b) {
        return PushService.c(context) && !b && !twitterUser.isLifelineInstitution && z.b(n) && !z.d(n) && !a(b, n);
    }
    
    public static boolean a(final TwitterUser twitterUser) {
        return twitterUser.isLifelineInstitution && !twitterUser.isProtected;
    }
    
    public static boolean a(final TwitterUser twitterUser, final int n, final boolean b) {
        return a(n, b) && !a(twitterUser);
    }
    
    public static boolean a(final boolean b, final int n) {
        final boolean f = d.f("blocked_by_profile_bellbird_enabled");
        return !b && f && z.f(n);
    }
    
    public static boolean a(final boolean b, final ad ad) {
        final TwitterUser a = ad.a();
        final int d = ad.d();
        return com.twitter.library.featureswitch.d.f("device_follow_prompt_android_enabled") && a != null && !a.isProtected && !z.f(d) && !z.d(d) && z.b(d) && !a.isLifelineInstitution && b && !ad.b();
    }
    
    public static boolean a(final boolean b, final TwitterUser twitterUser) {
        return b && twitterUser != null && twitterUser.isProtected;
    }
    
    public static boolean a(final boolean b, final TwitterUser twitterUser, final int n) {
        return !b && twitterUser != null && twitterUser.isProtected && !z.b(n);
    }
    
    public static int b(final int n) {
        if (z.d(n)) {
            return 0;
        }
        return 8;
    }
    
    public static String b(final TwitterUser twitterUser) {
        if (twitterUser != null) {
            return twitterUser.g();
        }
        return null;
    }
    
    public static boolean b() {
        return d.f("rich_profile_timeline_enabled");
    }
    
    public static boolean b(final TwitterUser twitterUser, final int n, final boolean b) {
        return a(n, b) && !a(twitterUser, n, b);
    }
    
    public static boolean b(final boolean b, final TwitterUser twitterUser, final int n) {
        if (!a(b, n) && !a(b, twitterUser, n)) {
            final boolean f = d.f("blocker_interstitial_bellbird_enabled");
            if (!b && f && z.e(n)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean c() {
        return d.f("profile_spotlight_enabled");
    }
    
    public static boolean d() {
        return d.a("promoted_tweet_in_profile_android_3067", new String[] { "allow_pc" });
    }
}
