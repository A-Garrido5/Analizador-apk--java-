// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.util.al;
import com.twitter.android.util.ap;
import android.preference.PreferenceManager;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import android.os.Parcelable;
import com.twitter.android.composer.au;
import com.twitter.library.util.bn;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.TextUtils;
import android.net.Uri$Builder;
import android.app.Activity;
import android.content.Context;
import com.twitter.library.client.az;
import android.content.Intent;
import com.twitter.library.api.EntityList;
import com.twitter.library.api.ax;
import com.twitter.library.api.TweetEntities;
import com.twitter.library.api.ah;
import com.twitter.library.api.Entity;
import com.twitter.library.api.w;
import com.twitter.library.provider.ad;
import com.twitter.library.provider.Tweet;
import android.net.Uri;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import com.twitter.library.featureswitch.d;
import com.twitter.library.scribe.TwitterScribeAssociation;
import java.util.Set;
import android.content.UriMatcher;
import java.util.regex.Pattern;
import com.twitter.android.client.TwitterFragmentActivity;

public class UrlInterpreterActivity extends TwitterFragmentActivity implements pi
{
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    private static final UriMatcher d;
    private static final UriMatcher e;
    private static final Set f;
    private static final Set g;
    private static final Set h;
    private TwitterScribeAssociation i;
    private boolean j;
    
    static {
        a = Pattern.compile("(www\\.)?twitter.com");
        b = Pattern.compile("https?");
        c = Pattern.compile("twitter");
        d = new UriMatcher(-1);
        (e = new UriMatcher(-1)).addURI("session", "new", 100);
        UrlInterpreterActivity.e.addURI("hashtag", "*", 101);
        UrlInterpreterActivity.e.addURI("signup", (String)null, 112);
        UrlInterpreterActivity.e.addURI("front", (String)null, 113);
        UrlInterpreterActivity.e.addURI("internal", "who_to_follow", 13);
        UrlInterpreterActivity.e.addURI("internal", "special_events/world_cup_2014/opt_in", 102);
        UrlInterpreterActivity.e.addURI("internal", "special_events/world_cup_2014/choose_team_full", 103);
        UrlInterpreterActivity.e.addURI("internal", "special_events/world_cup_2014/choose_team_lite", 104);
        UrlInterpreterActivity.e.addURI("internal", "special_events/world_cup_2014/find_friends", 105);
        UrlInterpreterActivity.e.addURI("internal", "worldcup", 107);
        UrlInterpreterActivity.e.addURI("internal", "*", 106);
        UrlInterpreterActivity.e.addURI("followers", "verified", 108);
        UrlInterpreterActivity.e.addURI("discover", (String)null, 109);
        UrlInterpreterActivity.e.addURI("account", (String)null, 110);
        UrlInterpreterActivity.e.addURI("settings", (String)null, 111);
        UrlInterpreterActivity.e.addURI("settings", "notifications_tab", 132);
        UrlInterpreterActivity.e.addURI("interest_picker", (String)null, 114);
        UrlInterpreterActivity.e.addURI("flow", "ad_hoc", 115);
        UrlInterpreterActivity.e.addURI("mentions", (String)null, 116);
        UrlInterpreterActivity.e.addURI("list", (String)null, 117);
        UrlInterpreterActivity.e.addURI("user", (String)null, 118);
        UrlInterpreterActivity.e.addURI("custom_timeline", (String)null, 119);
        UrlInterpreterActivity.e.addURI("explore", (String)null, 120);
        UrlInterpreterActivity.e.addURI("search", (String)null, 121);
        UrlInterpreterActivity.e.addURI("login", (String)null, 122);
        UrlInterpreterActivity.e.addURI("login-token", (String)null, 122);
        UrlInterpreterActivity.e.addURI("timeline", (String)null, 123);
        UrlInterpreterActivity.e.addURI("tweet", (String)null, 124);
        UrlInterpreterActivity.e.addURI("status", (String)null, 124);
        UrlInterpreterActivity.e.addURI("intent", "favorite", 125);
        UrlInterpreterActivity.e.addURI("intent", "retweet", 125);
        UrlInterpreterActivity.e.addURI("intent", "follow", 130);
        UrlInterpreterActivity.e.addURI("post", (String)null, 126);
        UrlInterpreterActivity.e.addURI("quote", (String)null, 126);
        UrlInterpreterActivity.e.addURI("photo", (String)null, 127);
        UrlInterpreterActivity.e.addURI("follow", (String)null, 128);
        UrlInterpreterActivity.e.addURI("unfollow", (String)null, 128);
        UrlInterpreterActivity.e.addURI("storystream", (String)null, 129);
        UrlInterpreterActivity.e.addURI("dm_conversation", (String)null, 131);
        UrlInterpreterActivity.e.addURI("card_previewer", (String)null, 45);
        UrlInterpreterActivity.e.addURI("who_to_follow", "interests/*", 133);
        UrlInterpreterActivity.e.addURI("flow", "add_phone", 136);
        UrlInterpreterActivity.d.addURI("analytics.twitter.com", "user/*/tweet/*", 81);
        UrlInterpreterActivity.d.addURI("ads.twitter.com", "mobile/*/accounts", 84);
        UrlInterpreterActivity.d.addURI("ads.twitter.com", "mobile/*/accounts/*", 85);
        UrlInterpreterActivity.d.addURI("ads.twitter.com", "mobile/*/accounts/*/*", 85);
        UrlInterpreterActivity.d.addURI("ads.twitter.com", "mobile/*/accounts/*/*/*", 85);
        UrlInterpreterActivity.d.addURI("ads.twitter.com", "mobile/*/accounts/*/*/*/*", 85);
        UrlInterpreterActivity.d.addURI("ads.twitter.com", "mobile/*/accounts/*/*/*/*/*", 85);
        UrlInterpreterActivity.d.addURI("*", "i/app_link", 75);
        UrlInterpreterActivity.d.addURI("*", "i/redirect", 53);
        UrlInterpreterActivity.d.addURI("*", "i/cricket", 79);
        UrlInterpreterActivity.d.addURI("*", "i/cricket/*", 80);
        UrlInterpreterActivity.d.addURI("*", "i/t/special_events/world_cup_2014/opt_in", 64);
        UrlInterpreterActivity.d.addURI("*", "i/t/special_events/world_cup_2014/choose_team_full", 65);
        UrlInterpreterActivity.d.addURI("*", "i/t/special_events/world_cup_2014/choose_team_lite", 66);
        UrlInterpreterActivity.d.addURI("*", "i/t/special_events/world_cup_2014/find_friends", 67);
        UrlInterpreterActivity.d.addURI("*", "i/t/worldcup", 69);
        UrlInterpreterActivity.d.addURI("*", "i/t/*", 60);
        UrlInterpreterActivity.d.addURI("*", "i/t/*/*", 61);
        UrlInterpreterActivity.d.addURI("*", "i/discover", 74);
        UrlInterpreterActivity.d.addURI("*", "i/notifications", 82);
        UrlInterpreterActivity.d.addURI("*", "i/connect", 83);
        UrlInterpreterActivity.d.addURI("*", "i/verified_followers", 77);
        UrlInterpreterActivity.d.addURI("*", "hashtag/*", 58);
        UrlInterpreterActivity.d.addURI("*", "portal/mobile", 70);
        UrlInterpreterActivity.d.addURI("*", "search", 1);
        UrlInterpreterActivity.d.addURI("*", "search/users/*", 2);
        UrlInterpreterActivity.d.addURI("*", "search/realtime/*", 3);
        UrlInterpreterActivity.d.addURI("*", "search/links/*", 4);
        UrlInterpreterActivity.d.addURI("*", "search/*/grid/*", 6);
        UrlInterpreterActivity.d.addURI("*", "search/*", 5);
        UrlInterpreterActivity.d.addURI("*", "compose/tweet", 7);
        UrlInterpreterActivity.d.addURI("*", "compose/dm", 8);
        UrlInterpreterActivity.d.addURI("*", "compose/dm/*", 9);
        UrlInterpreterActivity.d.addURI("*", "direct_messages/create/*", 57);
        UrlInterpreterActivity.d.addURI("*", "open_play_store", 46);
        UrlInterpreterActivity.d.addURI("*", "enable_device_follow", 47);
        UrlInterpreterActivity.d.addURI("*", "follow_user/#", 48);
        UrlInterpreterActivity.d.addURI("*", "mentions", 10);
        UrlInterpreterActivity.d.addURI("*", "messages", 11);
        UrlInterpreterActivity.d.addURI("*", "direct_messages", 56);
        UrlInterpreterActivity.d.addURI("*", "messages/compose", 86);
        UrlInterpreterActivity.d.addURI("*", "messages/*/#", 12);
        UrlInterpreterActivity.d.addURI("*", "messages/*", 51);
        UrlInterpreterActivity.d.addURI("*", "who_to_follow", 13);
        UrlInterpreterActivity.d.addURI("*", "who_to_follow/suggestions", 14);
        UrlInterpreterActivity.d.addURI("*", "who_to_follow/interests", 15);
        UrlInterpreterActivity.d.addURI("*", "who_to_follow/interests/*", 16);
        UrlInterpreterActivity.d.addURI("*", "who_to_follow/import", 17);
        UrlInterpreterActivity.d.addURI("*", "who_to_follow/search/*", 18);
        UrlInterpreterActivity.d.addURI("*", "lists", 19);
        UrlInterpreterActivity.d.addURI("*", "favorites", 20);
        UrlInterpreterActivity.d.addURI("*", "find_friends", 41);
        UrlInterpreterActivity.d.addURI("*", "turn_on_push", 44);
        UrlInterpreterActivity.d.addURI("*", "settings/profile", 21);
        UrlInterpreterActivity.d.addURI("*", "similar_to/*", 22);
        UrlInterpreterActivity.d.addURI("*", "share", 36);
        UrlInterpreterActivity.d.addURI("*", "intent/tweet", 37);
        UrlInterpreterActivity.d.addURI("*", "intent/user", 38);
        UrlInterpreterActivity.d.addURI("*", "intent/retweet", 62);
        UrlInterpreterActivity.d.addURI("*", "intent/favorite", 63);
        UrlInterpreterActivity.d.addURI("*", "intent/follow", 76);
        UrlInterpreterActivity.d.addURI("*", "intent/session", 40);
        UrlInterpreterActivity.d.addURI("*", "session/new", 40);
        UrlInterpreterActivity.d.addURI("*", "signup", 39);
        UrlInterpreterActivity.d.addURI("*", "people_timeline", 43);
        UrlInterpreterActivity.d.addURI("*", "settings/devices/create", 49);
        UrlInterpreterActivity.d.addURI("*", "start_phone_ownership_verification", 71);
        UrlInterpreterActivity.d.addURI("*", "account/confirm_email_reset", 78);
        UrlInterpreterActivity.d.addURI("*", "download", 55);
        UrlInterpreterActivity.d.addURI("*", "home", 68);
        UrlInterpreterActivity.d.addURI("*", "*/status/#/photo/#/large", 59);
        UrlInterpreterActivity.d.addURI("*", "*/status/#/photo/#", 23);
        UrlInterpreterActivity.d.addURI("*", "*/status/#", 23);
        UrlInterpreterActivity.d.addURI("*", "*/statuses/#", 54);
        UrlInterpreterActivity.d.addURI("*", "*/lists", 24);
        UrlInterpreterActivity.d.addURI("*", "*/lists/*", 25);
        UrlInterpreterActivity.d.addURI("*", "*/following", 26);
        UrlInterpreterActivity.d.addURI("*", "*/following/*", 27);
        UrlInterpreterActivity.d.addURI("*", "*/followers", 28);
        UrlInterpreterActivity.d.addURI("*", "*/followers_you_follow", 29);
        UrlInterpreterActivity.d.addURI("*", "*/favorites", 30);
        UrlInterpreterActivity.d.addURI("*", "*/activity", 31);
        UrlInterpreterActivity.d.addURI("*", "*/alerts", 50);
        UrlInterpreterActivity.d.addURI("*", "*/with_replies", 72);
        UrlInterpreterActivity.d.addURI("*", "*/media", 73);
        if (com.twitter.library.featureswitch.d.f("custom_timelines_handle_link_enabled")) {
            UrlInterpreterActivity.d.addURI("*", "*/timelines/*", 52);
        }
        UrlInterpreterActivity.d.addURI("*", "*/*/members", 33);
        UrlInterpreterActivity.d.addURI("*", "*/*/subscribers", 34);
        UrlInterpreterActivity.d.addURI("*", "*", 35);
        UrlInterpreterActivity.d.addURI("*", "i/soccer/*", 134);
        UrlInterpreterActivity.d.addURI("*", "i/soccer/*/*", 135);
        h = new HashSet(Arrays.asList(78, 20, 76, 38, 31, 50, 30, 28, 29, 26, 73, 35, 72));
        f = new HashSet(Arrays.asList(55, 57, 8, 9, 7, 56, 20, 41, 37, 38, 19, 10, 11, 12, 43, 1, 4, 3, 5, 6, 2, 21, 36, 22, 31, 50, 52, 30, 28, 29, 26, 27, 24, 25, 35, 33, 34, 59, 23, 54, 13, 17, 15, 16, 18, 14, 58, 64, 67, 65, 66, 68, 62, 63, 72, 73, 74, 75, 76, 51, 78, 79, 80, 81, 84, 85, 135, 134));
        g = new HashSet();
    }
    
    private static int a(final Uri uri, final String s, final String s2) {
        if (UrlInterpreterActivity.c.matcher(s).matches()) {
            return UrlInterpreterActivity.e.match(uri);
        }
        return -1;
    }
    
    private static int a(final Uri uri, final String s, final String s2, final boolean b) {
        if (UrlInterpreterActivity.b.matcher(s).matches()) {
            if (!b) {
                return UrlInterpreterActivity.d.match(uri);
            }
            if (UrlInterpreterActivity.a.matcher(s2).matches()) {
                return UrlInterpreterActivity.d.match(uri);
            }
        }
        return -1;
    }
    
    private static Tweet a(final Long n, final String[] array) {
        final ad f = new ad().c(n).f(array[0].trim());
        if (array.length > 1) {
            final w w = new w(-1 + array.length);
            for (int i = 1; i < array.length; ++i) {
                w.a((Entity)new ah().a(array[i].trim()).f());
            }
            f.a((TweetEntities)new ax().a((EntityList)w.f()).f());
        }
        return f.a();
    }
    
    private void a(final Intent intent, final boolean b) {
        final boolean d = az.a((Context)this).b().d();
        if (b && !d) {
            DispatchActivity.a(this);
            return;
        }
        intent.setData(this.getIntent().getData());
        this.startActivity(intent);
    }
    
    private static void a(final Uri$Builder uri$Builder, final String s, final String s2) {
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            uri$Builder.appendQueryParameter(s, s2);
        }
    }
    
    private void a(final Uri data, final int n) {
        final String queryParameter = data.getQueryParameter("tweet_id");
        if (queryParameter == null) {
            this.startActivity(new Intent((Context)this, (Class)WebViewActivity.class).setData(data));
            return;
        }
        String s = null;
        switch (n) {
            case 62: {
                s = "email_redirect_retweet";
                break;
            }
            case 63: {
                s = "email_redirect_favorite";
                break;
            }
        }
        this.startActivity(new Intent((Context)this, (Class)TweetActivity.class).putExtra(s, true).setData(new Uri$Builder().scheme("twitter").authority("tweet").appendQueryParameter("status_id", queryParameter).build()));
    }
    
    private void a(final Uri uri, final Uri uri2, final boolean b) {
        if (b) {
            this.j = true;
        }
        final FragmentManager supportFragmentManager = this.getSupportFragmentManager();
        final RedirectServiceFragment redirectServiceFragment = new RedirectServiceFragment();
        final Bundle arguments = new Bundle();
        arguments.putString("redirect_uri", uri.toString());
        arguments.putBoolean("wait_for_response", b);
        redirectServiceFragment.setArguments(arguments);
        supportFragmentManager.beginTransaction().add(16908290, redirectServiceFragment, "redirect_service_fragment").commit();
        if (!b) {
            this.c(uri2);
        }
    }
    
    private void a(final Uri uri, final String s) {
    Label_0101_Outer:
        while (true) {
            final Uri$Builder authority = new Uri$Builder().scheme("twitter").authority("post");
            a(authority, "text", s);
            a(authority, "url", uri.getQueryParameter("url"));
            a(authority, "hashtags", bn.b(uri.getQueryParameter("hashtags"), "UTF8"));
            a(authority, "via", uri.getQueryParameter("via"));
            while (true) {
                Long value;
                while (true) {
                    try {
                        value = Long.valueOf(uri.getQueryParameter("in_reply_to"));
                        if (value == null) {
                            final com.twitter.android.composer.au a = com.twitter.android.composer.au.a((Context)this);
                            a.a(authority.build()).b((Context)this);
                            return;
                        }
                    }
                    catch (NumberFormatException ex) {
                        value = null;
                        continue Label_0101_Outer;
                    }
                    break;
                }
                final String queryParameter = uri.getQueryParameter("in_reply_to_usernames");
                final boolean empty = TextUtils.isEmpty((CharSequence)queryParameter);
                String[] split = null;
                if (!empty) {
                    split = queryParameter.split(",");
                }
                a(authority, "in_reply_to_status_id", value.toString());
                final com.twitter.android.composer.au a2 = com.twitter.android.composer.au.a((Context)this);
                if (split != null && split.length > 0) {
                    a2.a(a(value, split));
                }
                final com.twitter.android.composer.au a = a2;
                continue;
            }
        }
    }
    
    private static int b(final Uri uri, final boolean b) {
        final String lowerCase = uri.getScheme().toLowerCase();
        String lowerCase2;
        if (uri.getAuthority() == null) {
            lowerCase2 = null;
        }
        else {
            lowerCase2 = uri.getAuthority().toLowerCase();
        }
        final int a = a(uri, lowerCase, lowerCase2, b);
        if (a == -1) {
            return a(uri, lowerCase, lowerCase2);
        }
        return a;
    }
    
    private void b(final Intent intent, final boolean b) {
        if (this.getIntent().getExtras() != null) {
            this.a(intent.putExtras(this.getIntent().getExtras()), b);
            return;
        }
        this.a(intent, b);
    }
    
    private void b(final String s) {
        this.startActivity(new Intent((Context)this, (Class)UsersActivity.class).putExtra("category", s).putExtra("type", 6).putExtra("scribe_item", "url_interpreter").putExtra("follow", true).putExtra("hide_bio", true).putExtra("show_category_name", true));
    }
    
    public static boolean b(final Uri uri) {
        return b(uri, true) != -1;
    }
    
    private Intent c(final String s) {
        final Uri build = new Uri$Builder().scheme("twitter").authority("user").appendQueryParameter("screen_name", s).build();
        final Intent intent = new Intent((Context)this, (Class)ProfileActivity.class);
        intent.setData(build).putExtra("association", (Parcelable)this.i);
        return intent;
    }
    
    Uri a(final Uri uri, final boolean b) {
        if (UrlInterpreterActivity.d.match(uri) == 53) {
            this.a("impression", uri);
            final String queryParameter = uri.getQueryParameter("url");
            if (queryParameter != null) {
                final Uri parse = Uri.parse(queryParameter);
                final int match = UrlInterpreterActivity.d.match(parse);
                if (match != -1) {
                    Set set;
                    if (b) {
                        set = UrlInterpreterActivity.f;
                    }
                    else {
                        set = UrlInterpreterActivity.h;
                    }
                    if (!set.contains(match)) {
                        this.a("resolvable_not_whitelisted", parse);
                        return null;
                    }
                    this.a("resolvable", parse);
                    return parse;
                }
            }
        }
        return null;
    }
    
    @Override
    public com.twitter.android.client.bn a(final Bundle bundle, final com.twitter.android.client.bn bn) {
        bn.b(26);
        bn.d(false);
        bn.a(false);
        bn.a(0);
        return bn;
    }
    
    @Override
    public void a(final String s) {
        this.a(s, null);
    }
    
    @Override
    public void a(final String s, final Uri uri) {
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.U().g()).c(2)).b(new String[] { "app:url_interpreter:redirect_service:", s });
        if (uri != null) {
            twitterScribeLog.a(uri.toString());
        }
        this.G().a(twitterScribeLog);
    }
    
    void a(final String s, final boolean b) {
        if (!b) {
            PreferenceManager.getDefaultSharedPreferences((Context)this).edit().putString("pref_referral_campaign", s).apply();
            this.h();
            return;
        }
        final al a = ap.a((Context)this);
        if (lj.a(s) == null) {
            this.h();
            return;
        }
        final FollowFlowController g = new FollowFlowController("referral_campaign").d(true).a(true).a(s).g(a.c());
        PreferenceManager.getDefaultSharedPreferences((Context)this).edit().putString("pref_referral_campaign", s).apply();
        if (a.e()) {
            er.a(g.f(), this.getApplicationContext()).a();
        }
        this.G().a(this.U().g(), g.f(), "url_interpreter", "referral_campaign", "", "impression");
        g.b(this);
    }
    
    @Override
    public void b(final Bundle bundle, final com.twitter.android.client.bn bn) {
        this.i = (TwitterScribeAssociation)new TwitterScribeAssociation().b("permalink");
        this.j = (bundle != null && bundle.getBoolean("is_processing_redirect"));
        final Uri data = this.getIntent().getData();
        if (!this.j && data != null) {
            this.c(bn.b(data));
        }
    }
    
    protected void c(final Uri p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokestatic    com/twitter/library/client/az.a:(Landroid/content/Context;)Lcom/twitter/library/client/az;
        //     4: astore_2       
        //     5: aload_0        
        //     6: invokevirtual   com/twitter/android/UrlInterpreterActivity.getApplicationContext:()Landroid/content/Context;
        //     9: astore_3       
        //    10: aload_0        
        //    11: invokevirtual   com/twitter/android/UrlInterpreterActivity.U:()Lcom/twitter/library/client/Session;
        //    14: astore          4
        //    16: aload           4
        //    18: invokevirtual   com/twitter/library/client/Session.d:()Z
        //    21: istore          5
        //    23: aload           4
        //    25: invokevirtual   com/twitter/library/client/Session.g:()J
        //    28: lstore          6
        //    30: aload           4
        //    32: invokevirtual   com/twitter/library/client/Session.e:()Ljava/lang/String;
        //    35: astore          8
        //    37: aload           4
        //    39: invokevirtual   com/twitter/library/client/Session.f:()Lcom/twitter/library/api/TwitterUser;
        //    42: astore          9
        //    44: aload_0        
        //    45: aload_1        
        //    46: iload           5
        //    48: invokevirtual   com/twitter/android/UrlInterpreterActivity.a:(Landroid/net/Uri;Z)Landroid/net/Uri;
        //    51: astore          10
        //    53: aload           10
        //    55: ifnull          85
        //    58: aload_0        
        //    59: aload_1        
        //    60: aload           10
        //    62: getstatic       com/twitter/android/UrlInterpreterActivity.g:Ljava/util/Set;
        //    65: getstatic       com/twitter/android/UrlInterpreterActivity.d:Landroid/content/UriMatcher;
        //    68: aload           10
        //    70: invokevirtual   android/content/UriMatcher.match:(Landroid/net/Uri;)I
        //    73: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    76: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //    81: invokespecial   com/twitter/android/UrlInterpreterActivity.a:(Landroid/net/Uri;Landroid/net/Uri;Z)V
        //    84: return         
        //    85: aload_1        
        //    86: invokevirtual   android/net/Uri.getPathSegments:()Ljava/util/List;
        //    89: astore          11
        //    91: aload_1        
        //    92: iconst_0       
        //    93: invokestatic    com/twitter/android/UrlInterpreterActivity.b:(Landroid/net/Uri;Z)I
        //    96: istore          12
        //    98: iload           12
        //   100: tableswitch {
        //                2: 1059
        //                3: 2414
        //                4: 1246
        //                5: 1308
        //                6: 1191
        //                7: 1191
        //                8: 2128
        //                9: 2726
        //               10: 2751
        //               11: 3085
        //               12: 3115
        //               13: 3003
        //               14: 3160
        //               15: 3160
        //               16: 3289
        //               17: 2396
        //               18: 3178
        //               19: 2414
        //               20: 3307
        //               21: 3352
        //               22: 3400
        //               23: 3508
        //               24: 788
        //               25: 2476
        //               26: 1730
        //               27: 1908
        //               28: 1908
        //               29: 1908
        //               30: 1908
        //               31: 1646
        //               32: 1908
        //               33: 660
        //               34: 2067
        //               35: 2015
        //               36: 1834
        //               37: 3610
        //               38: 3610
        //               39: 3625
        //               40: 3752
        //               41: 3793
        //               42: 3219
        //               43: 660
        //               44: 4139
        //               45: 3252
        //               46: 3271
        //               47: 2217
        //               48: 2228
        //               49: 2322
        //               50: 702
        //               51: 1908
        //               52: 2888
        //               53: 4163
        //               54: 660
        //               55: 788
        //               56: 4751
        //               57: 3115
        //               58: 2751
        //               59: 1363
        //               60: 745
        //               61: 4823
        //               62: 4823
        //               63: 4853
        //               64: 4843
        //               65: 4247
        //               66: 4247
        //               67: 4247
        //               68: 4247
        //               69: 3580
        //               70: 4247
        //               71: 3271
        //               72: 727
        //               73: 1908
        //               74: 1908
        //               75: 1533
        //               76: 4960
        //               77: 4863
        //               78: 1628
        //               79: 5175
        //               80: 4308
        //               81: 4370
        //               82: 4628
        //               83: 3100
        //               84: 3100
        //               85: 4689
        //               86: 4700
        //               87: 2506
        //               88: 660
        //               89: 660
        //               90: 660
        //               91: 660
        //               92: 660
        //               93: 660
        //               94: 660
        //               95: 660
        //               96: 660
        //               97: 660
        //               98: 660
        //               99: 660
        //              100: 660
        //              101: 3793
        //              102: 1448
        //              103: 4247
        //              104: 4247
        //              105: 4247
        //              106: 4247
        //              107: 4803
        //              108: 4247
        //              109: 1628
        //              110: 1533
        //              111: 1543
        //              112: 1556
        //              113: 3752
        //              114: 5034
        //              115: 5053
        //              116: 5093
        //              117: 3085
        //              118: 1782
        //              119: 3625
        //              120: 4163
        //              121: 4960
        //              122: 850
        //              123: 3968
        //              124: 5034
        //              125: 3987
        //              126: 4006
        //              127: 4044
        //              128: 4082
        //              129: 4101
        //              130: 4120
        //              131: 4025
        //              132: 4063
        //              133: 1590
        //              134: 2378
        //              135: 4456
        //              136: 4542
        //              137: 5203
        //          default: 660
        //        }
        //   660: aload_1        
        //   661: invokevirtual   android/net/Uri.getHost:()Ljava/lang/String;
        //   664: ldc_w           "twitter.com"
        //   667: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   670: ifeq            5254
        //   673: aload           11
        //   675: ifnull          688
        //   678: aload           11
        //   680: invokeinterface java/util/List.isEmpty:()Z
        //   685: ifeq            5254
        //   688: iload           5
        //   690: ifeq            5236
        //   693: aload_0        
        //   694: invokevirtual   com/twitter/android/UrlInterpreterActivity.h:()V
        //   697: aload_0        
        //   698: invokevirtual   com/twitter/android/UrlInterpreterActivity.finish:()V
        //   701: return         
        //   702: new             Lcom/twitter/android/FollowFlowController;
        //   705: dup            
        //   706: ldc_w           "add_phone_prompt"
        //   709: invokespecial   com/twitter/android/FollowFlowController.<init>:(Ljava/lang/String;)V
        //   712: iconst_0       
        //   713: invokevirtual   com/twitter/android/FollowFlowController.a:(Z)Lcom/twitter/android/FollowFlowController;
        //   716: iconst_1       
        //   717: invokevirtual   com/twitter/android/FollowFlowController.e:(Z)Lcom/twitter/android/FollowFlowController;
        //   720: aload_0        
        //   721: invokevirtual   com/twitter/android/FollowFlowController.b:(Landroid/app/Activity;)V
        //   724: goto            697
        //   727: aload_0        
        //   728: new             Landroid/content/Intent;
        //   731: dup            
        //   732: aload_0        
        //   733: ldc_w           Lcom/twitter/android/PhoneOwnershipActivity;.class
        //   736: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   739: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //   742: goto            697
        //   745: aload           11
        //   747: ifnull          697
        //   750: aload_0        
        //   751: new             Landroid/content/Intent;
        //   754: dup            
        //   755: aload_0        
        //   756: ldc_w           Lcom/twitter/android/GalleryActivity;.class
        //   759: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   762: ldc_w           "statusId"
        //   765: aload           11
        //   767: iconst_2       
        //   768: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   773: checkcast       Ljava/lang/String;
        //   776: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   779: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;J)Landroid/content/Intent;
        //   782: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //   785: goto            697
        //   788: new             Landroid/net/Uri$Builder;
        //   791: dup            
        //   792: invokespecial   android/net/Uri$Builder.<init>:()V
        //   795: ldc             "twitter"
        //   797: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   800: ldc             "tweet"
        //   802: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   805: ldc_w           "status_id"
        //   808: aload           11
        //   810: iconst_2       
        //   811: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   816: checkcast       Ljava/lang/String;
        //   819: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //   822: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //   825: astore          140
        //   827: aload_0        
        //   828: new             Landroid/content/Intent;
        //   831: dup            
        //   832: aload_0        
        //   833: ldc_w           Lcom/twitter/android/TweetActivity;.class
        //   836: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   839: aload           140
        //   841: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //   844: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //   847: goto            697
        //   850: aload_1        
        //   851: ldc_w           "query"
        //   854: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //   857: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   860: ifeq            890
        //   863: aload_0        
        //   864: new             Landroid/content/Intent;
        //   867: dup            
        //   868: aload_0        
        //   869: ldc_w           Lcom/twitter/android/MainActivity;.class
        //   872: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   875: ldc_w           "focus_search_bar"
        //   878: iconst_1       
        //   879: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   882: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //   885: aload_0        
        //   886: invokevirtual   com/twitter/android/UrlInterpreterActivity.finish:()V
        //   889: return         
        //   890: new             Landroid/content/Intent;
        //   893: dup            
        //   894: aload_0        
        //   895: ldc_w           Lcom/twitter/android/SearchActivity;.class
        //   898: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   901: astore          133
        //   903: aload_1        
        //   904: ldc_w           "query"
        //   907: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //   910: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   913: astore          134
        //   915: aload           133
        //   917: ldc_w           "query"
        //   920: aload           134
        //   922: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   925: pop            
        //   926: aload_1        
        //   927: ldc_w           "event_id"
        //   930: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //   933: astore          136
        //   935: aload           136
        //   937: ifnull          964
        //   940: aload           133
        //   942: ldc_w           "event_id"
        //   945: aload           136
        //   947: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   950: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   953: pop            
        //   954: aload           133
        //   956: ldc_w           "terminal"
        //   959: iconst_1       
        //   960: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //   963: pop            
        //   964: ldc_w           "sports"
        //   967: aload           133
        //   969: ldc_w           "notification_setting_key"
        //   972: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   975: invokestatic    com/twitter/library/api/TwitterTopic.c:(Ljava/lang/String;)Ljava/lang/String;
        //   978: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   981: ifeq            1050
        //   984: ldc_w           "search_features_nfl_enabled"
        //   987: invokestatic    com/twitter/library/featureswitch/d.f:(Ljava/lang/String;)Z
        //   990: ifeq            1050
        //   993: aload           136
        //   995: invokestatic    com/twitter/android/events/b.c:(Ljava/lang/String;)Z
        //   998: ifeq            1050
        //  1001: aload           133
        //  1003: ldc_w           "com.twitter.android.action.SEARCH_TAKEOVER"
        //  1006: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //  1009: pop            
        //  1010: aload_0        
        //  1011: new             Landroid/content/Intent;
        //  1014: dup            
        //  1015: aload_0        
        //  1016: ldc_w           Lcom/twitter/android/EventLandingActivity;.class
        //  1019: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  1022: ldc_w           "com.twitter.android.action.SEARCH_TAKEOVER"
        //  1025: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //  1028: ldc_w           "event_id"
        //  1031: aload           136
        //  1033: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1036: ldc_w           "query"
        //  1039: aload           134
        //  1041: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1044: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  1047: goto            697
        //  1050: aload_0        
        //  1051: aload           133
        //  1053: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  1056: goto            697
        //  1059: aload_1        
        //  1060: ldc_w           "q"
        //  1063: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  1066: astore          126
        //  1068: aload           126
        //  1070: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1073: ifne            697
        //  1076: aload_1        
        //  1077: ldc_w           "src"
        //  1080: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  1083: astore          127
        //  1085: aload           127
        //  1087: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1090: ifeq            1098
        //  1093: ldc_w           "api_call"
        //  1096: astore          127
        //  1098: new             Landroid/content/Intent;
        //  1101: dup            
        //  1102: aload_0        
        //  1103: ldc_w           Lcom/twitter/android/SearchActivity;.class
        //  1106: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  1109: ldc_w           "query"
        //  1112: aload           126
        //  1114: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1117: ldc_w           "q_source"
        //  1120: aload           127
        //  1122: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1125: astore          128
        //  1127: iconst_1       
        //  1128: aload_0        
        //  1129: aload           128
        //  1131: invokestatic    com/twitter/android/kg.a:(ZLandroid/content/Context;Landroid/content/Intent;)V
        //  1134: aload_1        
        //  1135: ldc_w           "event_id"
        //  1138: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  1141: astore          129
        //  1143: aload           129
        //  1145: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1148: ifne            1182
        //  1151: aload           128
        //  1153: ldc_w           "event_id"
        //  1156: aload           129
        //  1158: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1161: pop            
        //  1162: aload           128
        //  1164: ldc_w           "from_push"
        //  1167: iconst_1       
        //  1168: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  1171: pop            
        //  1172: aload           128
        //  1174: ldc_w           "terminal"
        //  1177: iconst_1       
        //  1178: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  1181: pop            
        //  1182: aload_0        
        //  1183: aload           128
        //  1185: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  1188: goto            697
        //  1191: new             Landroid/content/Intent;
        //  1194: dup            
        //  1195: aload_0        
        //  1196: ldc_w           Lcom/twitter/android/SearchActivity;.class
        //  1199: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  1202: ldc_w           "query"
        //  1205: aload           11
        //  1207: iconst_1       
        //  1208: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1213: checkcast       Ljava/lang/String;
        //  1216: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1219: ldc_w           "q_source"
        //  1222: ldc_w           "api_call"
        //  1225: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1228: astore          125
        //  1230: iconst_1       
        //  1231: aload_0        
        //  1232: aload           125
        //  1234: invokestatic    com/twitter/android/kg.a:(ZLandroid/content/Context;Landroid/content/Intent;)V
        //  1237: aload_0        
        //  1238: aload           125
        //  1240: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  1243: goto            697
        //  1246: new             Landroid/content/Intent;
        //  1249: dup            
        //  1250: aload_0        
        //  1251: ldc_w           Lcom/twitter/android/SearchActivity;.class
        //  1254: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  1257: ldc_w           "query"
        //  1260: aload           11
        //  1262: iconst_2       
        //  1263: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1268: checkcast       Ljava/lang/String;
        //  1271: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1274: ldc_w           "realtime"
        //  1277: iconst_1       
        //  1278: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  1281: ldc_w           "q_source"
        //  1284: ldc_w           "api_call"
        //  1287: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1290: astore          124
        //  1292: iconst_1       
        //  1293: aload_0        
        //  1294: aload           124
        //  1296: invokestatic    com/twitter/android/kg.a:(ZLandroid/content/Context;Landroid/content/Intent;)V
        //  1299: aload_0        
        //  1300: aload           124
        //  1302: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  1305: goto            697
        //  1308: new             Landroid/content/Intent;
        //  1311: dup            
        //  1312: aload_0        
        //  1313: ldc_w           Lcom/twitter/android/SearchActivity;.class
        //  1316: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  1319: ldc_w           "query"
        //  1322: aload           11
        //  1324: iconst_2       
        //  1325: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1330: checkcast       Ljava/lang/String;
        //  1333: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1336: ldc_w           "q_source"
        //  1339: ldc_w           "api_call"
        //  1342: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1345: astore          123
        //  1347: iconst_1       
        //  1348: aload_0        
        //  1349: aload           123
        //  1351: invokestatic    com/twitter/android/kg.a:(ZLandroid/content/Context;Landroid/content/Intent;)V
        //  1354: aload_0        
        //  1355: aload           123
        //  1357: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  1360: goto            697
        //  1363: new             Ljava/lang/StringBuilder;
        //  1366: dup            
        //  1367: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1370: bipush          35
        //  1372: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //  1375: aload           11
        //  1377: iconst_1       
        //  1378: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1383: checkcast       Ljava/lang/String;
        //  1386: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1389: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1392: astore          120
        //  1394: aload_1        
        //  1395: ldc_w           "src"
        //  1398: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  1401: astore          121
        //  1403: new             Landroid/content/Intent;
        //  1406: dup            
        //  1407: aload_0        
        //  1408: ldc_w           Lcom/twitter/android/SearchActivity;.class
        //  1411: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  1414: ldc_w           "query"
        //  1417: aload           120
        //  1419: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1422: ldc_w           "q_source"
        //  1425: aload           121
        //  1427: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1430: astore          122
        //  1432: iconst_1       
        //  1433: aload_0        
        //  1434: aload           122
        //  1436: invokestatic    com/twitter/android/kg.a:(ZLandroid/content/Context;Landroid/content/Intent;)V
        //  1439: aload_0        
        //  1440: aload           122
        //  1442: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  1445: goto            697
        //  1448: new             Ljava/lang/StringBuilder;
        //  1451: dup            
        //  1452: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1455: bipush          35
        //  1457: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //  1460: aload           11
        //  1462: iconst_0       
        //  1463: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1468: checkcast       Ljava/lang/String;
        //  1471: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1474: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1477: astore          117
        //  1479: aload_1        
        //  1480: ldc_w           "src"
        //  1483: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  1486: astore          118
        //  1488: new             Landroid/content/Intent;
        //  1491: dup            
        //  1492: aload_0        
        //  1493: ldc_w           Lcom/twitter/android/SearchActivity;.class
        //  1496: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  1499: ldc_w           "query"
        //  1502: aload           117
        //  1504: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1507: ldc_w           "q_source"
        //  1510: aload           118
        //  1512: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1515: astore          119
        //  1517: iconst_1       
        //  1518: aload_0        
        //  1519: aload           119
        //  1521: invokestatic    com/twitter/android/kg.a:(ZLandroid/content/Context;Landroid/content/Intent;)V
        //  1524: aload_0        
        //  1525: aload           119
        //  1527: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  1530: goto            697
        //  1533: aload_0        
        //  1534: getstatic       com/twitter/android/MainActivity.d:Landroid/net/Uri;
        //  1537: invokestatic    com/twitter/android/MainActivity.a:(Landroid/app/Activity;Landroid/net/Uri;)V
        //  1540: goto            697
        //  1543: aload_0        
        //  1544: lload           6
        //  1546: aload           8
        //  1548: aconst_null    
        //  1549: aconst_null    
        //  1550: invokestatic    com/twitter/android/ProfileActivity.a:(Landroid/content/Context;JLjava/lang/String;Lcom/twitter/library/api/PromotedContent;Lcom/twitter/library/scribe/TwitterScribeAssociation;)V
        //  1553: goto            697
        //  1556: aload_0        
        //  1557: new             Landroid/content/Intent;
        //  1560: dup            
        //  1561: aload_0        
        //  1562: ldc_w           Lcom/twitter/android/AccountSettingsActivity;.class
        //  1565: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  1568: ldc_w           "AccountSettingsActivity_account_name"
        //  1571: aload           8
        //  1573: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1576: ldc_w           "account_id"
        //  1579: lload           6
        //  1581: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;J)Landroid/content/Intent;
        //  1584: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  1587: goto            697
        //  1590: iload           5
        //  1592: ifeq            1621
        //  1595: aload_0        
        //  1596: new             Landroid/content/Intent;
        //  1599: dup            
        //  1600: aload_0        
        //  1601: ldc_w           Lcom/twitter/android/NotificationsTimelineSettingsActivity;.class
        //  1604: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  1607: ldc_w           "NotificationSettingsActivity_account_name"
        //  1610: aload           8
        //  1612: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1615: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  1618: goto            697
        //  1621: aload_0        
        //  1622: invokevirtual   com/twitter/android/UrlInterpreterActivity.h:()V
        //  1625: goto            697
        //  1628: aload_0        
        //  1629: aload_0        
        //  1630: lload           6
        //  1632: aload           9
        //  1634: getstatic       com/twitter/android/TabbedVitFollowersActivity.b:Landroid/net/Uri;
        //  1637: invokestatic    com/twitter/android/util/v.a:(Landroid/content/Context;JLcom/twitter/library/api/TwitterUser;Landroid/net/Uri;)Landroid/content/Intent;
        //  1640: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  1643: goto            697
        //  1646: new             Landroid/net/Uri$Builder;
        //  1649: dup            
        //  1650: invokespecial   android/net/Uri$Builder.<init>:()V
        //  1653: ldc             "twitter"
        //  1655: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  1658: ldc             "favorites"
        //  1660: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  1663: ldc_w           "screen_name"
        //  1666: aload           11
        //  1668: iconst_0       
        //  1669: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1674: checkcast       Ljava/lang/String;
        //  1677: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  1680: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //  1683: astore          116
        //  1685: aload_0        
        //  1686: new             Landroid/content/Intent;
        //  1689: dup            
        //  1690: aload_0        
        //  1691: ldc_w           Lcom/twitter/android/ProfileActivity;.class
        //  1694: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  1697: ldc_w           "start_page"
        //  1700: getstatic       com/twitter/android/ProfileActivity.c:Landroid/net/Uri;
        //  1703: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  1706: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1709: ldc_w           "association"
        //  1712: aload_0        
        //  1713: getfield        com/twitter/android/UrlInterpreterActivity.i:Lcom/twitter/library/scribe/TwitterScribeAssociation;
        //  1716: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //  1719: aload           116
        //  1721: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //  1724: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  1727: goto            697
        //  1730: aload_0        
        //  1731: new             Landroid/content/Intent;
        //  1734: dup            
        //  1735: aload_0        
        //  1736: ldc_w           Lcom/twitter/android/lists/ListTabActivity;.class
        //  1739: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  1742: ldc_w           "screen_name"
        //  1745: aload           11
        //  1747: iconst_0       
        //  1748: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1753: checkcast       Ljava/lang/String;
        //  1756: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1759: ldc_w           "slug"
        //  1762: aload           11
        //  1764: iconst_2       
        //  1765: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1770: checkcast       Ljava/lang/String;
        //  1773: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1776: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  1779: goto            697
        //  1782: aload_1        
        //  1783: ldc_w           "screen_name"
        //  1786: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  1789: astore          114
        //  1791: aload_1        
        //  1792: ldc_w           "slug"
        //  1795: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  1798: astore          115
        //  1800: aload_0        
        //  1801: new             Landroid/content/Intent;
        //  1804: dup            
        //  1805: aload_0        
        //  1806: ldc_w           Lcom/twitter/android/lists/ListTabActivity;.class
        //  1809: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  1812: ldc_w           "screen_name"
        //  1815: aload           114
        //  1817: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1820: ldc_w           "slug"
        //  1823: aload           115
        //  1825: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1828: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  1831: goto            697
        //  1834: aload           11
        //  1836: iconst_0       
        //  1837: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1842: checkcast       Ljava/lang/String;
        //  1845: astore          112
        //  1847: aload_0        
        //  1848: invokestatic    com/twitter/android/client/cd.a:(Landroid/content/Context;)Lcom/twitter/android/client/cd;
        //  1851: invokevirtual   com/twitter/android/client/cd.a:()Ljava/util/List;
        //  1854: astore          113
        //  1856: aload           113
        //  1858: ifnull          1873
        //  1861: aload           113
        //  1863: aload           112
        //  1865: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //  1870: ifne            1886
        //  1873: aload_0        
        //  1874: aload_0        
        //  1875: aload           112
        //  1877: invokespecial   com/twitter/android/UrlInterpreterActivity.c:(Ljava/lang/String;)Landroid/content/Intent;
        //  1880: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  1883: goto            697
        //  1886: aload_0        
        //  1887: new             Landroid/content/Intent;
        //  1890: dup            
        //  1891: aload_0        
        //  1892: ldc_w           Lcom/twitter/android/WebViewActivity;.class
        //  1895: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  1898: aload_1        
        //  1899: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //  1902: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  1905: goto            697
        //  1908: aload_0        
        //  1909: aload           11
        //  1911: iconst_0       
        //  1912: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  1917: checkcast       Ljava/lang/String;
        //  1920: invokespecial   com/twitter/android/UrlInterpreterActivity.c:(Ljava/lang/String;)Landroid/content/Intent;
        //  1923: astore          109
        //  1925: iload           12
        //  1927: lookupswitch {
        //               26: 2007
        //               28: 1999
        //               73: 1991
        //          default: 1960
        //        }
        //  1960: aconst_null    
        //  1961: astore          110
        //  1963: aload           110
        //  1965: ifnull          1982
        //  1968: aload           109
        //  1970: ldc_w           "start_page"
        //  1973: aload           110
        //  1975: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  1978: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  1981: pop            
        //  1982: aload_0        
        //  1983: aload           109
        //  1985: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  1988: goto            697
        //  1991: getstatic       com/twitter/android/ProfileActivity.b:Landroid/net/Uri;
        //  1994: astore          110
        //  1996: goto            1963
        //  1999: getstatic       com/twitter/android/ProfileActivity.g:Landroid/net/Uri;
        //  2002: astore          110
        //  2004: goto            1963
        //  2007: getstatic       com/twitter/android/ProfileActivity.h:Landroid/net/Uri;
        //  2010: astore          110
        //  2012: goto            1963
        //  2015: aload_0        
        //  2016: new             Landroid/content/Intent;
        //  2019: dup            
        //  2020: aload_0        
        //  2021: ldc_w           Lcom/twitter/android/lists/ListTabActivity;.class
        //  2024: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  2027: ldc_w           "screen_name"
        //  2030: aload           11
        //  2032: iconst_0       
        //  2033: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2038: checkcast       Ljava/lang/String;
        //  2041: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  2044: ldc_w           "slug"
        //  2047: aload           11
        //  2049: iconst_1       
        //  2050: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2055: checkcast       Ljava/lang/String;
        //  2058: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  2061: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  2064: goto            697
        //  2067: aload_0        
        //  2068: new             Landroid/content/Intent;
        //  2071: dup            
        //  2072: aload_0        
        //  2073: ldc_w           Lcom/twitter/android/lists/ListTabActivity;.class
        //  2076: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  2079: ldc_w           "screen_name"
        //  2082: aload           11
        //  2084: iconst_0       
        //  2085: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2090: checkcast       Ljava/lang/String;
        //  2093: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  2096: ldc_w           "slug"
        //  2099: aload           11
        //  2101: iconst_1       
        //  2102: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2107: checkcast       Ljava/lang/String;
        //  2110: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  2113: ldc_w           "tab"
        //  2116: ldc_w           "list_members"
        //  2119: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  2122: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  2125: goto            697
        //  2128: aload_0        
        //  2129: invokestatic    com/twitter/android/composer/au.a:(Landroid/content/Context;)Lcom/twitter/android/composer/au;
        //  2132: astore          103
        //  2134: aload_1        
        //  2135: ldc             "status"
        //  2137: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  2140: astore          104
        //  2142: aload           104
        //  2144: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2147: ifne            2159
        //  2150: aload           103
        //  2152: aload           104
        //  2154: aconst_null    
        //  2155: invokevirtual   com/twitter/android/composer/au.a:(Ljava/lang/String;[I)Lcom/twitter/android/composer/au;
        //  2158: pop            
        //  2159: aload_1        
        //  2160: ldc_w           "cursor"
        //  2163: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  2166: astore          105
        //  2168: aload           105
        //  2170: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2173: ifne            2202
        //  2176: aload           105
        //  2178: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //  2181: istore          106
        //  2183: aload           103
        //  2185: iconst_2       
        //  2186: newarray        I
        //  2188: dup            
        //  2189: iconst_0       
        //  2190: iload           106
        //  2192: iastore        
        //  2193: dup            
        //  2194: iconst_1       
        //  2195: iload           106
        //  2197: iastore        
        //  2198: invokevirtual   com/twitter/android/composer/au.a:([I)Lcom/twitter/android/composer/au;
        //  2201: pop            
        //  2202: aload           103
        //  2204: ldc_w           67108864
        //  2207: invokevirtual   com/twitter/android/composer/au.c:(I)Lcom/twitter/android/composer/au;
        //  2210: aload_0        
        //  2211: invokevirtual   com/twitter/android/composer/au.b:(Landroid/content/Context;)V
        //  2214: goto            697
        //  2217: aload_0        
        //  2218: invokevirtual   com/twitter/android/UrlInterpreterActivity.G:()Lcom/twitter/android/client/c;
        //  2221: aload_0        
        //  2222: invokevirtual   com/twitter/android/client/c.b:(Landroid/content/Context;)V
        //  2225: goto            697
        //  2228: aload_1        
        //  2229: ldc_w           "screen_name"
        //  2232: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  2235: ldc_w           "UTF8"
        //  2238: invokestatic    com/twitter/library/util/bn.b:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //  2241: astore          98
        //  2243: aload           98
        //  2245: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  2248: ifne            697
        //  2251: aload_0        
        //  2252: lload           6
        //  2254: invokestatic    com/twitter/library/provider/bg.a:(Landroid/content/Context;J)Lcom/twitter/library/provider/bg;
        //  2257: astore          99
        //  2259: aload_0        
        //  2260: invokevirtual   com/twitter/android/UrlInterpreterActivity.getApplicationContext:()Landroid/content/Context;
        //  2263: astore          100
        //  2265: aload           99
        //  2267: aload           98
        //  2269: invokevirtual   com/twitter/library/provider/bg.a:(Ljava/lang/String;)Lcom/twitter/library/api/TwitterUser;
        //  2272: astore          101
        //  2274: aload           101
        //  2276: ifnull          697
        //  2279: aload_0        
        //  2280: new             Lpy;
        //  2283: dup            
        //  2284: aload_0        
        //  2285: aload           4
        //  2287: aload           101
        //  2289: invokespecial   py.<init>:(Landroid/content/Context;Lcom/twitter/library/client/Session;Lcom/twitter/library/api/TwitterUser;)V
        //  2292: iconst_1       
        //  2293: iconst_1       
        //  2294: invokevirtual   py.a:(IZ)Lpy;
        //  2297: new             Lcom/twitter/android/xo;
        //  2300: dup            
        //  2301: aload_0        
        //  2302: aload           100
        //  2304: aload           8
        //  2306: invokespecial   com/twitter/android/xo.<init>:(Lcom/twitter/android/UrlInterpreterActivity;Landroid/content/Context;Ljava/lang/String;)V
        //  2309: invokevirtual   py.a:(Lcom/twitter/internal/android/service/c;)Lcom/twitter/internal/android/service/a;
        //  2312: checkcast       Lcom/twitter/library/service/y;
        //  2315: invokevirtual   com/twitter/android/UrlInterpreterActivity.a:(Lcom/twitter/library/service/y;)Ljava/lang/String;
        //  2318: pop            
        //  2319: goto            697
        //  2322: aload           11
        //  2324: iconst_1       
        //  2325: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2330: checkcast       Ljava/lang/String;
        //  2333: invokestatic    java/lang/Long.valueOf:(Ljava/lang/String;)Ljava/lang/Long;
        //  2336: astore          96
        //  2338: aload_0        
        //  2339: new             Lpb;
        //  2342: dup            
        //  2343: aload_0        
        //  2344: invokevirtual   com/twitter/android/UrlInterpreterActivity.getApplicationContext:()Landroid/content/Context;
        //  2347: aload           4
        //  2349: aload           96
        //  2351: invokevirtual   java/lang/Long.longValue:()J
        //  2354: aconst_null    
        //  2355: invokespecial   pb.<init>:(Landroid/content/Context;Lcom/twitter/library/client/Session;JLcom/twitter/library/api/PromotedContent;)V
        //  2358: iconst_1       
        //  2359: invokevirtual   pb.d:(Z)Lpb;
        //  2362: invokevirtual   com/twitter/android/UrlInterpreterActivity.a:(Lcom/twitter/library/service/y;)Ljava/lang/String;
        //  2365: pop            
        //  2366: goto            697
        //  2369: astore          95
        //  2371: aload_0        
        //  2372: invokevirtual   com/twitter/android/UrlInterpreterActivity.h:()V
        //  2375: goto            697
        //  2378: aload_0        
        //  2379: aload           11
        //  2381: iconst_1       
        //  2382: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2387: checkcast       Ljava/lang/String;
        //  2390: invokespecial   com/twitter/android/UrlInterpreterActivity.b:(Ljava/lang/String;)V
        //  2393: goto            697
        //  2396: aload_0        
        //  2397: aload           11
        //  2399: iconst_2       
        //  2400: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2405: checkcast       Ljava/lang/String;
        //  2408: invokespecial   com/twitter/android/UrlInterpreterActivity.b:(Ljava/lang/String;)V
        //  2411: goto            697
        //  2414: new             Landroid/content/Intent;
        //  2417: dup            
        //  2418: aload_0        
        //  2419: ldc_w           Lcom/twitter/android/SearchActivity;.class
        //  2422: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  2425: ldc_w           "query"
        //  2428: aload           11
        //  2430: iconst_2       
        //  2431: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2436: checkcast       Ljava/lang/String;
        //  2439: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  2442: ldc_w           "search_type"
        //  2445: iconst_2       
        //  2446: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //  2449: ldc_w           "q_source"
        //  2452: ldc_w           "api_call"
        //  2455: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  2458: astore          94
        //  2460: iconst_1       
        //  2461: aload_0        
        //  2462: aload           94
        //  2464: invokestatic    com/twitter/android/kg.a:(ZLandroid/content/Context;Landroid/content/Intent;)V
        //  2467: aload_0        
        //  2468: aload           94
        //  2470: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  2473: goto            697
        //  2476: aload_0        
        //  2477: new             Lcom/twitter/android/lists/b;
        //  2480: dup            
        //  2481: aload           11
        //  2483: iconst_0       
        //  2484: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2489: checkcast       Ljava/lang/String;
        //  2492: iconst_1       
        //  2493: invokespecial   com/twitter/android/lists/b.<init>:(Ljava/lang/String;Z)V
        //  2496: aload_0        
        //  2497: invokevirtual   com/twitter/android/lists/b.a:(Landroid/content/Context;)Landroid/content/Intent;
        //  2500: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  2503: goto            697
        //  2506: aload_1        
        //  2507: ldc_w           "user_id"
        //  2510: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  2513: astore          80
        //  2515: aload_1        
        //  2516: ldc_w           "recipient_id"
        //  2519: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  2522: astore          81
        //  2524: aload_1        
        //  2525: ldc_w           "text"
        //  2528: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  2531: astore          82
        //  2533: ldc2_w          -1
        //  2536: lstore          83
        //  2538: ldc2_w          -1
        //  2541: lstore          85
        //  2543: aload           80
        //  2545: invokestatic    java/lang/Long.valueOf:(Ljava/lang/String;)Ljava/lang/Long;
        //  2548: invokevirtual   java/lang/Long.longValue:()J
        //  2551: lstore          92
        //  2553: lload           92
        //  2555: lstore          83
        //  2557: aload           81
        //  2559: invokestatic    java/lang/Long.valueOf:(Ljava/lang/String;)Ljava/lang/Long;
        //  2562: invokevirtual   java/lang/Long.longValue:()J
        //  2565: lstore          90
        //  2567: lload           90
        //  2569: lstore          85
        //  2571: aload_2        
        //  2572: lload           83
        //  2574: invokevirtual   com/twitter/library/client/az.a:(J)Lcom/twitter/library/client/Session;
        //  2577: astore          89
        //  2579: aload           89
        //  2581: invokevirtual   com/twitter/library/client/Session.d:()Z
        //  2584: ifeq            2689
        //  2587: aload_2        
        //  2588: aload           89
        //  2590: invokevirtual   com/twitter/library/client/az.c:(Lcom/twitter/library/client/Session;)V
        //  2593: lload           85
        //  2595: ldc2_w          -1
        //  2598: lcmp           
        //  2599: ifeq            2649
        //  2602: aload_0        
        //  2603: new             Landroid/content/Intent;
        //  2606: dup            
        //  2607: aload_0        
        //  2608: ldc_w           Lcom/twitter/android/DMActivity;.class
        //  2611: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  2614: ldc_w           "user_ids"
        //  2617: iconst_1       
        //  2618: newarray        J
        //  2620: dup            
        //  2621: iconst_0       
        //  2622: lload           85
        //  2624: lastore        
        //  2625: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;[J)Landroid/content/Intent;
        //  2628: ldc_w           "from_ext_url"
        //  2631: iconst_1       
        //  2632: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  2635: ldc_w           "android.intent.extra.TEXT"
        //  2638: aload           82
        //  2640: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  2643: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  2646: goto            697
        //  2649: aload_0        
        //  2650: new             Landroid/content/Intent;
        //  2653: dup            
        //  2654: aload_0        
        //  2655: ldc_w           Lcom/twitter/android/DMActivity;.class
        //  2658: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  2661: ldc_w           "start_compose"
        //  2664: iconst_1       
        //  2665: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  2668: ldc_w           "from_ext_url"
        //  2671: iconst_1       
        //  2672: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  2675: ldc_w           "android.intent.extra.TEXT"
        //  2678: aload           82
        //  2680: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  2683: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  2686: goto            697
        //  2689: iload           5
        //  2691: ifeq            2719
        //  2694: aload_0        
        //  2695: new             Landroid/content/Intent;
        //  2698: dup            
        //  2699: aload_0        
        //  2700: ldc_w           Lcom/twitter/android/DMActivity;.class
        //  2703: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  2706: ldc_w           "from_ext_url"
        //  2709: iconst_1       
        //  2710: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  2713: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  2716: goto            697
        //  2719: aload_0        
        //  2720: invokestatic    com/twitter/android/kg.c:(Landroid/app/Activity;)V
        //  2723: goto            697
        //  2726: aload_0        
        //  2727: new             Landroid/content/Intent;
        //  2730: dup            
        //  2731: aload_0        
        //  2732: ldc_w           Lcom/twitter/android/DMActivity;.class
        //  2735: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  2738: ldc_w           "start_compose"
        //  2741: iconst_1       
        //  2742: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  2745: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  2748: goto            697
        //  2751: aload           11
        //  2753: iconst_2       
        //  2754: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2759: checkcast       Ljava/lang/String;
        //  2762: astore          74
        //  2764: aload_1        
        //  2765: ldc_w           "user_id"
        //  2768: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  2771: astore          75
        //  2773: aload           75
        //  2775: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  2778: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  2781: astore          79
        //  2783: aload           79
        //  2785: astore          77
        //  2787: iload           12
        //  2789: bipush          57
        //  2791: if_icmpne       2829
        //  2794: aload           77
        //  2796: ifnonnull       2829
        //  2799: aload_0        
        //  2800: new             Landroid/content/Intent;
        //  2803: dup            
        //  2804: aload_0        
        //  2805: ldc_w           Lcom/twitter/android/WebViewActivity;.class
        //  2808: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  2811: aload_1        
        //  2812: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //  2815: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  2818: goto            697
        //  2821: astore          76
        //  2823: aconst_null    
        //  2824: astore          77
        //  2826: goto            2787
        //  2829: aload           77
        //  2831: ifnull          2882
        //  2834: iconst_1       
        //  2835: newarray        J
        //  2837: astore          78
        //  2839: aload           78
        //  2841: iconst_0       
        //  2842: aload           77
        //  2844: invokevirtual   java/lang/Long.longValue:()J
        //  2847: lastore        
        //  2848: aload_0        
        //  2849: new             Landroid/content/Intent;
        //  2852: dup            
        //  2853: aload_0        
        //  2854: ldc_w           Lcom/twitter/android/DMActivity;.class
        //  2857: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  2860: ldc_w           "user_ids"
        //  2863: aload           78
        //  2865: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;[J)Landroid/content/Intent;
        //  2868: ldc_w           "username"
        //  2871: aload           74
        //  2873: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  2876: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  2879: goto            697
        //  2882: aconst_null    
        //  2883: astore          78
        //  2885: goto            2848
        //  2888: aload_2        
        //  2889: aload_1        
        //  2890: ldc_w           "user_id"
        //  2893: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  2896: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  2899: invokevirtual   com/twitter/library/client/az.b:(J)Lcom/twitter/library/client/Session;
        //  2902: astore          72
        //  2904: aload           72
        //  2906: invokevirtual   com/twitter/library/client/Session.d:()Z
        //  2909: ifeq            2966
        //  2912: aload_2        
        //  2913: aload           72
        //  2915: invokevirtual   com/twitter/library/client/az.c:(Lcom/twitter/library/client/Session;)V
        //  2918: aload           11
        //  2920: iconst_1       
        //  2921: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  2926: checkcast       Ljava/lang/String;
        //  2929: astore          73
        //  2931: aload_0        
        //  2932: new             Landroid/content/Intent;
        //  2935: dup            
        //  2936: aload_0        
        //  2937: ldc_w           Lcom/twitter/android/DMActivity;.class
        //  2940: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  2943: ldc_w           "conversation_id"
        //  2946: aload           73
        //  2948: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  2951: ldc_w           "from_ext_url"
        //  2954: iconst_1       
        //  2955: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  2958: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  2961: goto            697
        //  2964: astore          71
        //  2966: iload           5
        //  2968: ifeq            2996
        //  2971: aload_0        
        //  2972: new             Landroid/content/Intent;
        //  2975: dup            
        //  2976: aload_0        
        //  2977: ldc_w           Lcom/twitter/android/DMActivity;.class
        //  2980: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  2983: ldc_w           "from_ext_url"
        //  2986: iconst_1       
        //  2987: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  2990: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  2993: goto            697
        //  2996: aload_0        
        //  2997: invokestatic    com/twitter/android/kg.c:(Landroid/app/Activity;)V
        //  3000: goto            697
        //  3003: new             Landroid/content/Intent;
        //  3006: dup            
        //  3007: aload_0        
        //  3008: ldc_w           Lcom/twitter/android/DMActivity;.class
        //  3011: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3014: astore          68
        //  3016: iconst_1       
        //  3017: newarray        J
        //  3019: astore          70
        //  3021: aload           70
        //  3023: iconst_0       
        //  3024: aload           11
        //  3026: iconst_2       
        //  3027: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  3032: checkcast       Ljava/lang/String;
        //  3035: invokestatic    java/lang/Long.valueOf:(Ljava/lang/String;)Ljava/lang/Long;
        //  3038: invokevirtual   java/lang/Long.longValue:()J
        //  3041: lastore        
        //  3042: aload_0        
        //  3043: aload           68
        //  3045: ldc_w           "user_ids"
        //  3048: aload           70
        //  3050: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;[J)Landroid/content/Intent;
        //  3053: ldc_w           "username"
        //  3056: aload           11
        //  3058: iconst_1       
        //  3059: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  3064: checkcast       Ljava/lang/String;
        //  3067: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  3070: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  3073: goto            697
        //  3076: astore          69
        //  3078: aload_0        
        //  3079: invokevirtual   com/twitter/android/UrlInterpreterActivity.h:()V
        //  3082: goto            697
        //  3085: aload_0        
        //  3086: aload_0        
        //  3087: aload           9
        //  3089: iconst_0       
        //  3090: iconst_1       
        //  3091: invokestatic    com/twitter/android/util/aj.a:(Landroid/content/Context;Lcom/twitter/library/api/TwitterUser;ZZ)Landroid/content/Intent;
        //  3094: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  3097: goto            697
        //  3100: aload_0        
        //  3101: aload_0        
        //  3102: aload           9
        //  3104: iconst_0       
        //  3105: iconst_0       
        //  3106: invokestatic    com/twitter/android/util/aj.a:(Landroid/content/Context;Lcom/twitter/library/api/TwitterUser;ZZ)Landroid/content/Intent;
        //  3109: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  3112: goto            697
        //  3115: new             Landroid/net/Uri$Builder;
        //  3118: dup            
        //  3119: invokespecial   android/net/Uri$Builder.<init>:()V
        //  3122: ldc             "twitter"
        //  3124: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  3127: ldc             "messages"
        //  3129: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  3132: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //  3135: astore          67
        //  3137: aload_0        
        //  3138: new             Landroid/content/Intent;
        //  3141: dup            
        //  3142: aload_0        
        //  3143: ldc_w           Lcom/twitter/android/DMActivity;.class
        //  3146: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3149: aload           67
        //  3151: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //  3154: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  3157: goto            697
        //  3160: aload_0        
        //  3161: new             Landroid/content/Intent;
        //  3164: dup            
        //  3165: aload_0        
        //  3166: ldc_w           Lcom/twitter/android/TabbedFindPeopleActivity;.class
        //  3169: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3172: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  3175: goto            697
        //  3178: aload_0        
        //  3179: new             Landroid/content/Intent;
        //  3182: dup            
        //  3183: aload_0        
        //  3184: ldc_w           Lcom/twitter/android/UsersActivity;.class
        //  3187: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3190: ldc_w           "type"
        //  3193: bipush          7
        //  3195: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //  3198: ldc_w           "scribe_item"
        //  3201: ldc_w           "url_interpreter"
        //  3204: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  3207: ldc_w           "com.twitter.android.intent.action.FOLLOW"
        //  3210: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //  3213: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  3216: goto            697
        //  3219: aload_0        
        //  3220: new             Landroid/content/Intent;
        //  3223: dup            
        //  3224: aload_0        
        //  3225: ldc_w           Lcom/twitter/android/DialogActivity;.class
        //  3228: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3231: ldc_w           "ff"
        //  3234: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //  3237: ldc_w           "scribe_page"
        //  3240: ldc_w           "app"
        //  3243: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  3246: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  3249: goto            697
        //  3252: aload_0        
        //  3253: invokestatic    com/twitter/library/platform/PushService.c:(Landroid/content/Context;)Z
        //  3256: ifeq            697
        //  3259: aload           8
        //  3261: invokestatic    com/twitter/library/platform/PushService.a:(Ljava/lang/String;)V
        //  3264: aload_0        
        //  3265: invokestatic    com/twitter/library/platform/PushService.e:(Landroid/content/Context;)V
        //  3268: goto            697
        //  3271: aload_0        
        //  3272: new             Landroid/content/Intent;
        //  3275: dup            
        //  3276: aload_0        
        //  3277: ldc_w           Lcom/twitter/android/CardPreviewerActivity;.class
        //  3280: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3283: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  3286: goto            697
        //  3289: aload_0        
        //  3290: new             Landroid/content/Intent;
        //  3293: dup            
        //  3294: aload_0        
        //  3295: ldc_w           Lcom/twitter/android/CategoriesActivity;.class
        //  3298: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3301: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  3304: goto            697
        //  3307: new             Landroid/net/Uri$Builder;
        //  3310: dup            
        //  3311: invokespecial   android/net/Uri$Builder.<init>:()V
        //  3314: ldc             "twitter"
        //  3316: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  3319: ldc             "list"
        //  3321: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  3324: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //  3327: astore          66
        //  3329: aload_0        
        //  3330: new             Landroid/content/Intent;
        //  3333: dup            
        //  3334: aload_0        
        //  3335: ldc_w           Lcom/twitter/android/MainActivity;.class
        //  3338: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3341: aload           66
        //  3343: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //  3346: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  3349: goto            697
        //  3352: aload_0        
        //  3353: new             Landroid/content/Intent;
        //  3356: dup            
        //  3357: aload_0        
        //  3358: ldc_w           Lcom/twitter/android/ProfileActivity;.class
        //  3361: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3364: ldc_w           "user_id"
        //  3367: lload           6
        //  3369: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;J)Landroid/content/Intent;
        //  3372: ldc_w           "start_page"
        //  3375: getstatic       com/twitter/android/ProfileActivity.c:Landroid/net/Uri;
        //  3378: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  3381: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  3384: ldc_w           "association"
        //  3387: aload_0        
        //  3388: getfield        com/twitter/android/UrlInterpreterActivity.i:Lcom/twitter/library/scribe/TwitterScribeAssociation;
        //  3391: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //  3394: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  3397: goto            697
        //  3400: aload_1        
        //  3401: ldc_w           "action"
        //  3404: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  3407: astore          61
        //  3409: lload           6
        //  3411: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //  3414: astore          62
        //  3416: invokestatic    com/twitter/android/avatars/b.a:()Z
        //  3419: ifeq            3500
        //  3422: ldc_w           Lcom/twitter/android/EditProfileWithAvatarDrawerActivity;.class
        //  3425: astore          63
        //  3427: new             Landroid/content/Intent;
        //  3430: dup            
        //  3431: aload_0        
        //  3432: aload           63
        //  3434: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3437: getstatic       com/twitter/library/provider/bf.b:Landroid/net/Uri;
        //  3440: invokevirtual   android/net/Uri.buildUpon:()Landroid/net/Uri$Builder;
        //  3443: aload           62
        //  3445: invokevirtual   android/net/Uri$Builder.appendEncodedPath:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  3448: ldc_w           "ownerId"
        //  3451: aload           62
        //  3453: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  3456: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //  3459: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //  3462: astore          64
        //  3464: ldc_w           "change_avatar"
        //  3467: aload           61
        //  3469: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3472: ifeq            3491
        //  3475: invokestatic    com/twitter/android/avatars/b.b:()Z
        //  3478: ifeq            3491
        //  3481: aload           64
        //  3483: ldc_w           "extra_show_avatar_picker"
        //  3486: iconst_1       
        //  3487: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  3490: pop            
        //  3491: aload_0        
        //  3492: aload           64
        //  3494: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  3497: goto            697
        //  3500: ldc_w           Lcom/twitter/android/EditProfileActivity;.class
        //  3503: astore          63
        //  3505: goto            3427
        //  3508: new             Landroid/net/Uri$Builder;
        //  3511: dup            
        //  3512: invokespecial   android/net/Uri$Builder.<init>:()V
        //  3515: ldc             "twitter"
        //  3517: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  3520: ldc             "user"
        //  3522: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  3525: ldc_w           "screen_name"
        //  3528: aload           11
        //  3530: iconst_1       
        //  3531: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  3536: checkcast       Ljava/lang/String;
        //  3539: invokevirtual   android/net/Uri$Builder.appendQueryParameter:(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  3542: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //  3545: astore          60
        //  3547: aload_0        
        //  3548: new             Landroid/content/Intent;
        //  3551: dup            
        //  3552: aload_0        
        //  3553: ldc_w           Lcom/twitter/android/ProfileActivity;.class
        //  3556: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3559: aload           60
        //  3561: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //  3564: ldc_w           "association"
        //  3567: aload_0        
        //  3568: getfield        com/twitter/android/UrlInterpreterActivity.i:Lcom/twitter/library/scribe/TwitterScribeAssociation;
        //  3571: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //  3574: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  3577: goto            697
        //  3580: aload_1        
        //  3581: ldc             "status"
        //  3583: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  3586: astore          59
        //  3588: aload           59
        //  3590: ifnull          3603
        //  3593: aload_0        
        //  3594: aload_1        
        //  3595: aload           59
        //  3597: invokespecial   com/twitter/android/UrlInterpreterActivity.a:(Landroid/net/Uri;Ljava/lang/String;)V
        //  3600: goto            697
        //  3603: aload_0        
        //  3604: invokevirtual   com/twitter/android/UrlInterpreterActivity.h:()V
        //  3607: goto            697
        //  3610: aload_0        
        //  3611: aload_1        
        //  3612: aload_1        
        //  3613: ldc_w           "text"
        //  3616: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  3619: invokespecial   com/twitter/android/UrlInterpreterActivity.a:(Landroid/net/Uri;Ljava/lang/String;)V
        //  3622: goto            697
        //  3625: lconst_0       
        //  3626: lstore          49
        //  3628: aload_1        
        //  3629: ldc_w           "user_id"
        //  3632: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  3635: astore          51
        //  3637: aload           51
        //  3639: ifnonnull       3651
        //  3642: aload_1        
        //  3643: ldc_w           "id"
        //  3646: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  3649: astore          51
        //  3651: aload           51
        //  3653: ifnull          3667
        //  3656: aload           51
        //  3658: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  3661: lstore          57
        //  3663: lload           57
        //  3665: lstore          49
        //  3667: aload_1        
        //  3668: ldc_w           "screen_name"
        //  3671: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  3674: astore          52
        //  3676: ldc_w           "1"
        //  3679: aload_1        
        //  3680: ldc_w           "df"
        //  3683: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  3686: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  3689: ifeq            3746
        //  3692: aload           52
        //  3694: ifnull          3746
        //  3697: iconst_1       
        //  3698: istore          53
        //  3700: aload_0        
        //  3701: lload           49
        //  3703: aload           52
        //  3705: aconst_null    
        //  3706: aload_0        
        //  3707: getfield        com/twitter/android/UrlInterpreterActivity.i:Lcom/twitter/library/scribe/TwitterScribeAssociation;
        //  3710: iconst_m1      
        //  3711: aconst_null    
        //  3712: invokestatic    com/twitter/android/ProfileActivity.a:(Landroid/content/Context;JLjava/lang/String;Lcom/twitter/library/api/PromotedContent;Lcom/twitter/library/scribe/TwitterScribeAssociation;ILcom/twitter/library/api/PromotedEvent;)Landroid/content/Intent;
        //  3715: astore          54
        //  3717: iload           53
        //  3719: ifeq            3737
        //  3722: aload           54
        //  3724: ldc_w           "start_page"
        //  3727: getstatic       com/twitter/android/ProfileActivity.j:Landroid/net/Uri;
        //  3730: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  3733: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  3736: pop            
        //  3737: aload_0        
        //  3738: aload           54
        //  3740: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  3743: goto            697
        //  3746: iconst_0       
        //  3747: istore          53
        //  3749: goto            3700
        //  3752: iload           5
        //  3754: ifeq            3762
        //  3757: aload_0        
        //  3758: invokevirtual   com/twitter/android/UrlInterpreterActivity.h:()V
        //  3761: return         
        //  3762: new             Landroid/content/Intent;
        //  3765: dup            
        //  3766: aload_0        
        //  3767: ldc_w           Lcom/twitter/android/SignUpActivity;.class
        //  3770: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3773: astore          48
        //  3775: aload_0        
        //  3776: invokestatic    com/twitter/android/SignUpFlowController.a:(Landroid/content/Context;)Lcom/twitter/android/SignUpFlowController;
        //  3779: aload           48
        //  3781: invokevirtual   com/twitter/android/SignUpFlowController.b:(Landroid/content/Intent;)V
        //  3784: aload_0        
        //  3785: aload           48
        //  3787: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  3790: goto            697
        //  3793: aload_3        
        //  3794: aload_1        
        //  3795: invokestatic    com/twitter/android/util/ak.a:(Landroid/content/Context;Landroid/net/Uri;)V
        //  3798: aload_1        
        //  3799: ldc_w           "user_id"
        //  3802: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  3805: astore          37
        //  3807: aload           37
        //  3809: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  3812: ifne            3885
        //  3815: lconst_0       
        //  3816: lstore          42
        //  3818: aload           37
        //  3820: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  3823: lstore          46
        //  3825: lload           46
        //  3827: lstore          42
        //  3829: lload           42
        //  3831: lconst_0       
        //  3832: lcmp           
        //  3833: ifle            3885
        //  3836: aload_2        
        //  3837: lload           42
        //  3839: invokevirtual   com/twitter/library/client/az.b:(J)Lcom/twitter/library/client/Session;
        //  3842: astore          45
        //  3844: aload           45
        //  3846: invokevirtual   com/twitter/library/client/Session.g:()J
        //  3849: lload           42
        //  3851: lcmp           
        //  3852: ifne            3885
        //  3855: aload_2        
        //  3856: aload           45
        //  3858: invokevirtual   com/twitter/library/client/az.c:(Lcom/twitter/library/client/Session;)V
        //  3861: aload_0        
        //  3862: new             Landroid/content/Intent;
        //  3865: dup            
        //  3866: aload_0        
        //  3867: ldc_w           Lcom/twitter/android/MainActivity;.class
        //  3870: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3873: ldc_w           67108864
        //  3876: invokevirtual   android/content/Intent.setFlags:(I)Landroid/content/Intent;
        //  3879: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  3882: goto            697
        //  3885: new             Landroid/content/Intent;
        //  3888: dup            
        //  3889: aload_0        
        //  3890: ldc_w           Lcom/twitter/android/LoginActivity;.class
        //  3893: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3896: astore          38
        //  3898: aload_1        
        //  3899: ldc_w           "screen_name"
        //  3902: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  3905: astore          39
        //  3907: aload           39
        //  3909: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  3912: ifne            3926
        //  3915: aload           38
        //  3917: ldc_w           "screen_name"
        //  3920: aload           39
        //  3922: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  3925: pop            
        //  3926: iload           5
        //  3928: ifeq            3939
        //  3931: aload_0        
        //  3932: aload           38
        //  3934: iconst_2       
        //  3935: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivityForResult:(Landroid/content/Intent;I)V
        //  3938: return         
        //  3939: aload           38
        //  3941: ldc_w           "android.intent.extra.INTENT"
        //  3944: new             Landroid/content/Intent;
        //  3947: dup            
        //  3948: aload_0        
        //  3949: ldc_w           Lcom/twitter/android/MainActivity;.class
        //  3952: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3955: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //  3958: pop            
        //  3959: aload_0        
        //  3960: aload           38
        //  3962: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  3965: goto            697
        //  3968: aload_0        
        //  3969: new             Landroid/content/Intent;
        //  3972: dup            
        //  3973: aload_0        
        //  3974: ldc_w           Lcom/twitter/android/LoginActivity;.class
        //  3977: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3980: iconst_0       
        //  3981: invokespecial   com/twitter/android/UrlInterpreterActivity.a:(Landroid/content/Intent;Z)V
        //  3984: goto            697
        //  3987: aload_0        
        //  3988: new             Landroid/content/Intent;
        //  3991: dup            
        //  3992: aload_0        
        //  3993: ldc_w           Lcom/twitter/android/TweetActivity;.class
        //  3996: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  3999: iconst_0       
        //  4000: invokespecial   com/twitter/android/UrlInterpreterActivity.a:(Landroid/content/Intent;Z)V
        //  4003: goto            697
        //  4006: aload_0        
        //  4007: new             Landroid/content/Intent;
        //  4010: dup            
        //  4011: aload_0        
        //  4012: ldc_w           Lcom/twitter/android/TweetActivity;.class
        //  4015: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  4018: iconst_1       
        //  4019: invokespecial   com/twitter/android/UrlInterpreterActivity.a:(Landroid/content/Intent;Z)V
        //  4022: goto            697
        //  4025: aload_0        
        //  4026: new             Landroid/content/Intent;
        //  4029: dup            
        //  4030: aload_0        
        //  4031: ldc_w           Lcom/twitter/android/ProfileActivity;.class
        //  4034: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  4037: iconst_0       
        //  4038: invokespecial   com/twitter/android/UrlInterpreterActivity.a:(Landroid/content/Intent;Z)V
        //  4041: goto            697
        //  4044: aload_0        
        //  4045: new             Landroid/content/Intent;
        //  4048: dup            
        //  4049: aload_0        
        //  4050: ldc_w           Lcom/twitter/android/composer/ComposerActivity;.class
        //  4053: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  4056: iconst_1       
        //  4057: invokespecial   com/twitter/android/UrlInterpreterActivity.a:(Landroid/content/Intent;Z)V
        //  4060: goto            697
        //  4063: aload_0        
        //  4064: new             Landroid/content/Intent;
        //  4067: dup            
        //  4068: aload_0        
        //  4069: ldc_w           Lcom/twitter/android/RootDMActivity;.class
        //  4072: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  4075: iconst_1       
        //  4076: invokespecial   com/twitter/android/UrlInterpreterActivity.b:(Landroid/content/Intent;Z)V
        //  4079: goto            697
        //  4082: aload_0        
        //  4083: new             Landroid/content/Intent;
        //  4086: dup            
        //  4087: aload_0        
        //  4088: ldc_w           Lcom/twitter/android/GalleryActivity;.class
        //  4091: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  4094: iconst_0       
        //  4095: invokespecial   com/twitter/android/UrlInterpreterActivity.b:(Landroid/content/Intent;Z)V
        //  4098: goto            697
        //  4101: aload_0        
        //  4102: new             Landroid/content/Intent;
        //  4105: dup            
        //  4106: aload_0        
        //  4107: ldc_w           Lcom/twitter/android/DialogActivity;.class
        //  4110: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  4113: iconst_1       
        //  4114: invokespecial   com/twitter/android/UrlInterpreterActivity.a:(Landroid/content/Intent;Z)V
        //  4117: goto            697
        //  4120: aload_0        
        //  4121: new             Landroid/content/Intent;
        //  4124: dup            
        //  4125: aload_0        
        //  4126: ldc_w           Lcom/twitter/android/highlights/StoriesActivity;.class
        //  4129: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  4132: iconst_1       
        //  4133: invokespecial   com/twitter/android/UrlInterpreterActivity.a:(Landroid/content/Intent;Z)V
        //  4136: goto            697
        //  4139: aload_0        
        //  4140: new             Landroid/content/Intent;
        //  4143: dup            
        //  4144: aload_0        
        //  4145: ldc_w           Lcom/twitter/android/TabbedFindPeopleActivity;.class
        //  4148: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  4151: ldc_w           67108864
        //  4154: invokevirtual   android/content/Intent.addFlags:(I)Landroid/content/Intent;
        //  4157: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  4160: goto            697
        //  4163: aload_1        
        //  4164: ldc_w           "timeline_id"
        //  4167: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  4170: astore          36
        //  4172: aload           36
        //  4174: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  4177: ifeq            4186
        //  4180: aload_1        
        //  4181: invokevirtual   android/net/Uri.getLastPathSegment:()Ljava/lang/String;
        //  4184: astore          36
        //  4186: aload           36
        //  4188: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  4191: ifne            697
        //  4194: aload_0        
        //  4195: new             Landroid/content/Intent;
        //  4198: dup            
        //  4199: aload_0        
        //  4200: ldc_w           Lcom/twitter/android/CollectionPermalinkActivity;.class
        //  4203: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  4206: ldc_w           "type"
        //  4209: bipush          27
        //  4211: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //  4214: ldc_w           "timeline_tag"
        //  4217: new             Ljava/lang/StringBuilder;
        //  4220: dup            
        //  4221: invokespecial   java/lang/StringBuilder.<init>:()V
        //  4224: ldc_w           "custom-"
        //  4227: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4230: aload           36
        //  4232: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4235: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  4238: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  4241: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  4244: goto            697
        //  4247: new             Lcom/twitter/android/FollowFlowController;
        //  4250: dup            
        //  4251: ldc_w           "referral_campaign"
        //  4254: invokespecial   com/twitter/android/FollowFlowController.<init>:(Ljava/lang/String;)V
        //  4257: iconst_1       
        //  4258: anewarray       Ljava/lang/String;
        //  4261: dup            
        //  4262: iconst_0       
        //  4263: ldc_w           "follow_friends"
        //  4266: aastore        
        //  4267: invokevirtual   com/twitter/android/FollowFlowController.a:([Ljava/lang/String;)Lcom/twitter/android/FollowFlowController;
        //  4270: astore          35
        //  4272: aload           35
        //  4274: aload_0        
        //  4275: invokevirtual   com/twitter/android/FollowFlowController.b:(Landroid/app/Activity;)V
        //  4278: aload_0        
        //  4279: invokestatic    com/twitter/android/util/ap.a:(Landroid/content/Context;)Lcom/twitter/android/util/al;
        //  4282: invokeinterface com/twitter/android/util/al.e:()Z
        //  4287: ifeq            697
        //  4290: aload           35
        //  4292: invokevirtual   com/twitter/android/FollowFlowController.f:()Ljava/lang/String;
        //  4295: aload_0        
        //  4296: invokevirtual   com/twitter/android/UrlInterpreterActivity.getApplicationContext:()Landroid/content/Context;
        //  4299: invokestatic    com/twitter/android/er.a:(Ljava/lang/String;Landroid/content/Context;)Lcom/twitter/android/er;
        //  4302: invokevirtual   com/twitter/android/er.a:()V
        //  4305: goto            697
        //  4308: ldc_w           "cricket_experience_tournament_hashtag_takeover"
        //  4311: invokestatic    com/twitter/library/featureswitch/d.g:(Ljava/lang/String;)Ljava/lang/String;
        //  4314: astore          32
        //  4316: aload_1        
        //  4317: ldc_w           "src"
        //  4320: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  4323: astore          33
        //  4325: new             Landroid/content/Intent;
        //  4328: dup            
        //  4329: aload_0        
        //  4330: ldc_w           Lcom/twitter/android/SearchActivity;.class
        //  4333: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  4336: ldc_w           "query"
        //  4339: aload           32
        //  4341: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  4344: ldc_w           "q_source"
        //  4347: aload           33
        //  4349: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  4352: astore          34
        //  4354: iconst_1       
        //  4355: aload_0        
        //  4356: aload           34
        //  4358: invokestatic    com/twitter/android/kg.a:(ZLandroid/content/Context;Landroid/content/Intent;)V
        //  4361: aload_0        
        //  4362: aload           34
        //  4364: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  4367: goto            697
        //  4370: new             Ljava/lang/StringBuilder;
        //  4373: dup            
        //  4374: invokespecial   java/lang/StringBuilder.<init>:()V
        //  4377: ldc_w           "#"
        //  4380: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4383: aload           11
        //  4385: iconst_2       
        //  4386: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  4391: checkcast       Ljava/lang/String;
        //  4394: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4397: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  4400: astore          29
        //  4402: aload_1        
        //  4403: ldc_w           "src"
        //  4406: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  4409: astore          30
        //  4411: new             Landroid/content/Intent;
        //  4414: dup            
        //  4415: aload_0        
        //  4416: ldc_w           Lcom/twitter/android/SearchActivity;.class
        //  4419: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  4422: ldc_w           "query"
        //  4425: aload           29
        //  4427: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  4430: ldc_w           "q_source"
        //  4433: aload           30
        //  4435: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  4438: astore          31
        //  4440: iconst_1       
        //  4441: aload_0        
        //  4442: aload           31
        //  4444: invokestatic    com/twitter/android/kg.a:(ZLandroid/content/Context;Landroid/content/Intent;)V
        //  4447: aload_0        
        //  4448: aload           31
        //  4450: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  4453: goto            697
        //  4456: new             Ljava/lang/StringBuilder;
        //  4459: dup            
        //  4460: invokespecial   java/lang/StringBuilder.<init>:()V
        //  4463: ldc_w           "#"
        //  4466: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4469: aload           11
        //  4471: iconst_2       
        //  4472: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  4477: checkcast       Ljava/lang/String;
        //  4480: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4483: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  4486: astore          26
        //  4488: aload_1        
        //  4489: ldc_w           "src"
        //  4492: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  4495: astore          27
        //  4497: new             Landroid/content/Intent;
        //  4500: dup            
        //  4501: aload_0        
        //  4502: ldc_w           Lcom/twitter/android/SearchActivity;.class
        //  4505: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  4508: ldc_w           "query"
        //  4511: aload           26
        //  4513: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  4516: ldc_w           "q_source"
        //  4519: aload           27
        //  4521: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  4524: astore          28
        //  4526: iconst_1       
        //  4527: aload_0        
        //  4528: aload           28
        //  4530: invokestatic    com/twitter/android/kg.a:(ZLandroid/content/Context;Landroid/content/Intent;)V
        //  4533: aload_0        
        //  4534: aload           28
        //  4536: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  4539: goto            697
        //  4542: new             Ljava/lang/StringBuilder;
        //  4545: dup            
        //  4546: invokespecial   java/lang/StringBuilder.<init>:()V
        //  4549: ldc_w           "#"
        //  4552: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4555: aload           11
        //  4557: iconst_3       
        //  4558: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  4563: checkcast       Ljava/lang/String;
        //  4566: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4569: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  4572: astore          23
        //  4574: aload_1        
        //  4575: ldc_w           "src"
        //  4578: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  4581: astore          24
        //  4583: new             Landroid/content/Intent;
        //  4586: dup            
        //  4587: aload_0        
        //  4588: ldc_w           Lcom/twitter/android/SearchActivity;.class
        //  4591: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  4594: ldc_w           "query"
        //  4597: aload           23
        //  4599: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  4602: ldc_w           "q_source"
        //  4605: aload           24
        //  4607: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  4610: astore          25
        //  4612: iconst_1       
        //  4613: aload_0        
        //  4614: aload           25
        //  4616: invokestatic    com/twitter/android/kg.a:(ZLandroid/content/Context;Landroid/content/Intent;)V
        //  4619: aload_0        
        //  4620: aload           25
        //  4622: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  4625: goto            697
        //  4628: aload           11
        //  4630: iconst_1       
        //  4631: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  4636: checkcast       Ljava/lang/String;
        //  4639: astore          21
        //  4641: aload           21
        //  4643: aload           8
        //  4645: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  4648: ifne            4657
        //  4651: aload_2        
        //  4652: aload           21
        //  4654: invokevirtual   com/twitter/library/client/az.d:(Ljava/lang/String;)V
        //  4657: aload_0        
        //  4658: aload_0        
        //  4659: aload           21
        //  4661: aload           11
        //  4663: iconst_3       
        //  4664: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  4669: checkcast       Ljava/lang/String;
        //  4672: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  4675: invokestatic    com/twitter/android/TweetAnalyticsWebViewActivity.a:(Landroid/content/Context;Ljava/lang/String;J)Landroid/content/Intent;
        //  4678: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  4681: goto            697
        //  4684: astore          22
        //  4686: goto            697
        //  4689: aload_0        
        //  4690: aload_0        
        //  4691: invokestatic    com/twitter/android/AdsCompanionWebViewActivity.a:(Landroid/content/Context;)Landroid/content/Intent;
        //  4694: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  4697: goto            697
        //  4700: aload_1        
        //  4701: ldc             "user"
        //  4703: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  4706: astore          20
        //  4708: aload           20
        //  4710: ifnull          697
        //  4713: aload           20
        //  4715: aload           8
        //  4717: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  4720: ifne            4729
        //  4723: aload_2        
        //  4724: aload           20
        //  4726: invokevirtual   com/twitter/library/client/az.d:(Ljava/lang/String;)V
        //  4729: aload_0        
        //  4730: new             Landroid/content/Intent;
        //  4733: dup            
        //  4734: aload_3        
        //  4735: ldc_w           Lcom/twitter/android/AdsCompanionWebViewActivity;.class
        //  4738: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  4741: aload_1        
        //  4742: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //  4745: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  4748: goto            697
        //  4751: aload_0        
        //  4752: invokestatic    com/twitter/library/util/an.a:(Landroid/content/Context;)Z
        //  4755: ifeq            4790
        //  4758: aload_0        
        //  4759: aload_0        
        //  4760: invokevirtual   com/twitter/android/UrlInterpreterActivity.getPackageName:()Ljava/lang/String;
        //  4763: invokestatic    com/twitter/library/util/an.a:(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
        //  4766: astore          19
        //  4768: aload_0        
        //  4769: new             Landroid/content/Intent;
        //  4772: dup            
        //  4773: ldc_w           "android.intent.action.VIEW"
        //  4776: aload           19
        //  4778: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //  4781: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
        //  4784: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  4787: goto            697
        //  4790: aload_0        
        //  4791: aload_0        
        //  4792: invokevirtual   com/twitter/android/UrlInterpreterActivity.getPackageName:()Ljava/lang/String;
        //  4795: invokestatic    com/twitter/library/util/an.b:(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
        //  4798: astore          19
        //  4800: goto            4768
        //  4803: aload_0        
        //  4804: aload           11
        //  4806: iconst_0       
        //  4807: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  4812: checkcast       Ljava/lang/String;
        //  4815: iload           5
        //  4817: invokevirtual   com/twitter/android/UrlInterpreterActivity.a:(Ljava/lang/String;Z)V
        //  4820: goto            697
        //  4823: aload_0        
        //  4824: aload           11
        //  4826: iconst_2       
        //  4827: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //  4832: checkcast       Ljava/lang/String;
        //  4835: iload           5
        //  4837: invokevirtual   com/twitter/android/UrlInterpreterActivity.a:(Ljava/lang/String;Z)V
        //  4840: goto            697
        //  4843: aload_0        
        //  4844: aload_1        
        //  4845: bipush          63
        //  4847: invokespecial   com/twitter/android/UrlInterpreterActivity.a:(Landroid/net/Uri;I)V
        //  4850: goto            697
        //  4853: aload_0        
        //  4854: aload_1        
        //  4855: bipush          62
        //  4857: invokespecial   com/twitter/android/UrlInterpreterActivity.a:(Landroid/net/Uri;I)V
        //  4860: goto            697
        //  4863: new             Landroid/net/Uri$Builder;
        //  4866: dup            
        //  4867: invokespecial   android/net/Uri$Builder.<init>:()V
        //  4870: ldc             "twitter"
        //  4872: invokevirtual   android/net/Uri$Builder.scheme:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  4875: ldc             "user"
        //  4877: invokevirtual   android/net/Uri$Builder.authority:(Ljava/lang/String;)Landroid/net/Uri$Builder;
        //  4880: astore          18
        //  4882: aload           18
        //  4884: ldc_w           "screen_name"
        //  4887: aload_1        
        //  4888: ldc_w           "screen_name"
        //  4891: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  4894: invokestatic    com/twitter/android/UrlInterpreterActivity.a:(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)V
        //  4897: aload           18
        //  4899: ldc_w           "user_id"
        //  4902: aload_1        
        //  4903: ldc_w           "user_id"
        //  4906: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  4909: invokestatic    com/twitter/android/UrlInterpreterActivity.a:(Landroid/net/Uri$Builder;Ljava/lang/String;Ljava/lang/String;)V
        //  4912: aload_0        
        //  4913: new             Landroid/content/Intent;
        //  4916: dup            
        //  4917: aload_0        
        //  4918: ldc_w           Lcom/twitter/android/ProfileActivity;.class
        //  4921: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  4924: ldc_w           "start_page"
        //  4927: getstatic       com/twitter/android/ProfileActivity.i:Landroid/net/Uri;
        //  4930: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  4933: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  4936: aload           18
        //  4938: invokevirtual   android/net/Uri$Builder.build:()Landroid/net/Uri;
        //  4941: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //  4944: ldc_w           "association"
        //  4947: aload_0        
        //  4948: getfield        com/twitter/android/UrlInterpreterActivity.i:Lcom/twitter/library/scribe/TwitterScribeAssociation;
        //  4951: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //  4954: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  4957: goto            697
        //  4960: ldc_w           "android_email_explore_enabled"
        //  4963: invokestatic    com/twitter/library/featureswitch/d.f:(Ljava/lang/String;)Z
        //  4966: ifeq            5027
        //  4969: aload_1        
        //  4970: ldc_w           "id"
        //  4973: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  4976: astore          16
        //  4978: aload_1        
        //  4979: ldc_w           "country"
        //  4982: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  4985: astore          17
        //  4987: aload_0        
        //  4988: new             Landroid/content/Intent;
        //  4991: dup            
        //  4992: aload_0        
        //  4993: ldc_w           Lcom/twitter/android/EmailExploreFetchCategoryUsersActivity;.class
        //  4996: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  4999: ldc_w           "explore_email_category"
        //  5002: aload           16
        //  5004: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  5007: ldc_w           "explore_email_country"
        //  5010: aload           17
        //  5012: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  5015: ldc_w           1073741824
        //  5018: invokevirtual   android/content/Intent.addFlags:(I)Landroid/content/Intent;
        //  5021: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  5024: goto            697
        //  5027: aload_0        
        //  5028: invokevirtual   com/twitter/android/UrlInterpreterActivity.h:()V
        //  5031: goto            697
        //  5034: aload_0        
        //  5035: new             Landroid/content/Intent;
        //  5038: dup            
        //  5039: aload_0        
        //  5040: ldc_w           Lcom/twitter/android/MainActivity;.class
        //  5043: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  5046: iconst_1       
        //  5047: invokespecial   com/twitter/android/UrlInterpreterActivity.a:(Landroid/content/Intent;Z)V
        //  5050: goto            697
        //  5053: new             Lcom/twitter/android/FollowFlowController;
        //  5056: dup            
        //  5057: ldc_w           "url_interpreter"
        //  5060: invokespecial   com/twitter/android/FollowFlowController.<init>:(Ljava/lang/String;)V
        //  5063: aload_1        
        //  5064: ldc_w           "allow_continue"
        //  5067: iconst_0       
        //  5068: invokevirtual   android/net/Uri.getBooleanQueryParameter:(Ljava/lang/String;Z)Z
        //  5071: invokevirtual   com/twitter/android/FollowFlowController.b:(Z)Lcom/twitter/android/FollowFlowController;
        //  5074: iconst_1       
        //  5075: anewarray       Ljava/lang/String;
        //  5078: dup            
        //  5079: iconst_0       
        //  5080: ldc             "interest_picker"
        //  5082: aastore        
        //  5083: invokevirtual   com/twitter/android/FollowFlowController.a:([Ljava/lang/String;)Lcom/twitter/android/FollowFlowController;
        //  5086: aload_0        
        //  5087: invokevirtual   com/twitter/android/FollowFlowController.b:(Landroid/app/Activity;)V
        //  5090: goto            697
        //  5093: aload_1        
        //  5094: ldc_w           "steps"
        //  5097: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //  5100: astore          13
        //  5102: iload           5
        //  5104: ifeq            5168
        //  5107: aload           13
        //  5109: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  5112: ifne            5168
        //  5115: new             Lcom/twitter/android/FollowFlowController;
        //  5118: dup            
        //  5119: ldc_w           "url_interpreter"
        //  5122: invokespecial   com/twitter/android/FollowFlowController.<init>:(Ljava/lang/String;)V
        //  5125: iconst_0       
        //  5126: invokevirtual   com/twitter/android/FollowFlowController.a:(Z)Lcom/twitter/android/FollowFlowController;
        //  5129: astore          14
        //  5131: aload_0        
        //  5132: invokestatic    com/twitter/android/util/ap.a:(Landroid/content/Context;)Lcom/twitter/android/util/al;
        //  5135: invokeinterface com/twitter/android/util/al.l:()Z
        //  5140: ifne            5162
        //  5143: iconst_1       
        //  5144: istore          15
        //  5146: aload           14
        //  5148: aload           13
        //  5150: iload           15
        //  5152: invokevirtual   com/twitter/android/FollowFlowController.a:(Ljava/lang/String;Z)Lcom/twitter/android/FollowFlowController;
        //  5155: aload_0        
        //  5156: invokevirtual   com/twitter/android/FollowFlowController.b:(Landroid/app/Activity;)V
        //  5159: goto            697
        //  5162: iconst_0       
        //  5163: istore          15
        //  5165: goto            5146
        //  5168: aload_0        
        //  5169: invokevirtual   com/twitter/android/UrlInterpreterActivity.h:()V
        //  5172: goto            697
        //  5175: aload_0        
        //  5176: new             Landroid/content/Intent;
        //  5179: dup            
        //  5180: aload_0        
        //  5181: ldc_w           Lcom/twitter/android/PasswordResetActivity;.class
        //  5184: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  5187: ldc_w           "init_url"
        //  5190: aload_1        
        //  5191: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //  5194: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  5197: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  5200: goto            697
        //  5203: aload_0        
        //  5204: new             Landroid/content/Intent;
        //  5207: dup            
        //  5208: aload_0        
        //  5209: ldc_w           Lcom/twitter/android/PhoneEntrySettingsActivity;.class
        //  5212: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  5215: ldc_w           "account_name"
        //  5218: aload           8
        //  5220: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //  5223: ldc_w           "umf_flow"
        //  5226: iconst_1       
        //  5227: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  5230: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  5233: goto            697
        //  5236: aload_0        
        //  5237: new             Landroid/content/Intent;
        //  5240: dup            
        //  5241: aload_0        
        //  5242: ldc_w           Lcom/twitter/android/LoginActivity;.class
        //  5245: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  5248: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  5251: goto            697
        //  5254: aload_0        
        //  5255: new             Landroid/content/Intent;
        //  5258: dup            
        //  5259: aload_0        
        //  5260: ldc_w           Lcom/twitter/android/WebViewActivity;.class
        //  5263: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  5266: aload_1        
        //  5267: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //  5270: invokevirtual   com/twitter/android/UrlInterpreterActivity.startActivity:(Landroid/content/Intent;)V
        //  5273: goto            697
        //  5276: astore          56
        //  5278: goto            3667
        //  5281: astore          44
        //  5283: goto            3829
        //  5286: astore          88
        //  5288: goto            2571
        //  5291: astore          87
        //  5293: goto            2557
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  2322   2366   2369   2378   Ljava/lang/NumberFormatException;
        //  2543   2553   5291   5296   Ljava/lang/NumberFormatException;
        //  2557   2567   5286   5291   Ljava/lang/NumberFormatException;
        //  2773   2783   2821   2829   Ljava/lang/NumberFormatException;
        //  2888   2961   2964   2966   Ljava/lang/NumberFormatException;
        //  3003   3073   3076   3085   Ljava/lang/NumberFormatException;
        //  3656   3663   5276   5281   Ljava/lang/NumberFormatException;
        //  3818   3825   5281   5286   Ljava/lang/NumberFormatException;
        //  4657   4681   4684   4689   Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_3829:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void d_(final Uri uri) {
        this.j = false;
        this.c(uri);
    }
    
    void h() {
        this.startActivity(new Intent((Context)this, (Class)MainActivity.class));
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        switch (n) {
            case 1: {
                if (-1 != n2) {
                    break;
                }
                final String stringExtra = intent.getStringExtra("AbsFragmentActivity_account_name");
                if (!TextUtils.isEmpty((CharSequence)stringExtra)) {
                    this.startActivity(new Intent((Context)this, (Class)MainActivity.class).putExtra("AbsFragmentActivity_account_name", stringExtra));
                    break;
                }
                break;
            }
            case 2: {
                if (-1 != n2) {
                    break;
                }
                final String stringExtra2 = intent.getStringExtra("AbsFragmentActivity_account_name");
                if (!TextUtils.isEmpty((CharSequence)stringExtra2)) {
                    this.startActivity(new Intent((Context)this, (Class)MainActivity.class).putExtra("AbsFragmentActivity_account_name", stringExtra2));
                    break;
                }
                break;
            }
        }
        this.finish();
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("is_processing_redirect", this.j);
    }
}
