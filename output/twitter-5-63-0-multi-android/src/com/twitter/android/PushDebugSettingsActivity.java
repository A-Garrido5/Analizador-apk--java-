// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Handler;
import android.view.View;
import java.util.List;
import android.accounts.AccountManager;
import com.twitter.library.util.a;
import java.util.ArrayList;
import android.accounts.Account;
import android.widget.SpinnerAdapter;
import com.twitter.library.client.d;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.library.api.TwitterUser;
import android.widget.Toast;
import android.content.Intent;
import android.content.Context;
import java.io.InputStream;
import java.util.Scanner;
import android.content.res.AssetManager;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.view.View$OnClickListener;
import android.accounts.OnAccountsUpdateListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class PushDebugSettingsActivity extends TwitterFragmentActivity implements OnAccountsUpdateListener, View$OnClickListener
{
    private Spinner a;
    private ox b;
    private RadioGroup c;
    
    static String a(final AssetManager assetManager, final String s) {
        InputStream open = null;
        try {
            open = assetManager.open(s);
            final Scanner useDelimiter = new Scanner(open).useDelimiter("\\A");
            String next;
            if (useDelimiter.hasNext()) {
                next = useDelimiter.next();
            }
            else {
                next = "";
            }
            return next;
        }
        finally {
            if (open != null) {
                open.close();
            }
        }
    }
    
    public static void a(final Context context) {
        context.sendBroadcast(new Intent().setAction("com.google.android.c2dm.intent.RECEIVE").putExtra("priority", "1").putExtra("schema", "1").putExtra("type", String.valueOf(285)).putExtra("title", "You are logged out...").putExtra("text", "But you still got a notification!").putExtra("uri", "twitter://user?screen_name=dickc"));
    }
    
    private void h() {
        final TwitterUser a = this.b.a(this.a.getSelectedItemPosition());
        if (a == null) {
            return;
        }
    Label_1357:
        while (true) {
            final Intent putExtra = new Intent().setAction("com.google.android.c2dm.intent.RECEIVE").putExtra("priority", "1").putExtra("schema", "1");
            while (true) {
                String format = null;
                Label_1295: {
                    Label_1233: {
                        Label_1150: {
                            AssetManager assets = null;
                            Label_0992: {
                                Label_0852: {
                                    Label_0789: {
                                        Label_0731: {
                                            String a2 = null;
                                            Label_0667: {
                                                Label_0603: {
                                                    Label_0546: {
                                                        String format2 = null;
                                                        Label_0488: {
                                                            Label_0432: {
                                                                try {
                                                                    assets = this.getAssets();
                                                                    format = String.format(a(assets, "push/user_recipient_and_sender.json"), a.a(), a.username, a.c());
                                                                    format2 = String.format(a(assets, "push/user_recipient.json"), a.a(), a.username, a.c());
                                                                    a2 = a(assets, "push/tweet.json");
                                                                    switch (this.c.getCheckedRadioButtonId()) {
                                                                        case 2131886229: {
                                                                            putExtra.putExtra("scribe_target", "retweeted").putExtra("uri", "twitter://tweet?status_id=483010988338184193").putExtra("collapse_key", "retweeted").putExtra("type", String.valueOf(6)).putExtra("tweet", a2).putExtra("users", format);
                                                                            break;
                                                                        }
                                                                        case 2131887218: {
                                                                            putExtra.putExtra("scribe_target", "event_parrot").putExtra("uri", "twitter://search?query=motorola%20lenovo%20google&event_id=EVENT_NEWS:428637429881638912").putExtra("from", "49625052041").putExtra("text", "This is a fake Event Parrot notification").putExtra("collapse_key", "event_parrot").putExtra("type", String.valueOf(175)).putExtra("users", format2);
                                                                            break;
                                                                        }
                                                                        case 2131886230: {
                                                                            break Label_0432;
                                                                        }
                                                                        case 2131887219: {
                                                                            break Label_0488;
                                                                        }
                                                                        case 2131887216: {
                                                                            break Label_0546;
                                                                        }
                                                                        case 2131887215: {
                                                                            break Label_0603;
                                                                        }
                                                                        case 2131887217: {
                                                                            break Label_0667;
                                                                        }
                                                                        case 2131887220: {
                                                                            break Label_0731;
                                                                        }
                                                                        case 2131887221: {
                                                                            break Label_0789;
                                                                        }
                                                                        case 2131887222: {
                                                                            break Label_0852;
                                                                        }
                                                                        case 2131887223: {
                                                                            break Label_0992;
                                                                        }
                                                                        case 2131887224: {
                                                                            break Label_1150;
                                                                        }
                                                                        case 2131887225: {
                                                                            break Label_1233;
                                                                        }
                                                                        case 2131886841: {
                                                                            break Label_1295;
                                                                        }
                                                                        default: {
                                                                            break Label_1357;
                                                                        }
                                                                    }
                                                                    this.sendBroadcast(putExtra);
                                                                    return;
                                                                }
                                                                catch (Exception ex) {
                                                                    Toast.makeText((Context)this, (CharSequence)("Push failed due to exception: " + ex), 0).show();
                                                                    return;
                                                                }
                                                            }
                                                            putExtra.putExtra("scribe_target", "favorited").putExtra("uri", "twitter://tweet?status_id=483010988338184193").putExtra("from", "49625052041").putExtra("tweet", a2).putExtra("collapse_key", "favorited").putExtra("type", String.valueOf(5)).putExtra("users", format);
                                                            continue;
                                                        }
                                                        putExtra.putExtra("scribe_target", "planned_event_sports").putExtra("uri", "twitter://search?query=%23WorldCup&event_id=MOCKINGJAY_TWO_TEAM_SPORTS_LEAGUE|WC").putExtra("from", "49625052041").putExtra("text", "Fake World Cup push!").putExtra("collapse_key", "planned_event_sports").putExtra("type", String.valueOf(251)).putExtra("users", format2);
                                                        continue;
                                                    }
                                                    putExtra.putExtra("scribe_target", "followed_request").putExtra("uri", "twitter://user?screen_name=chestcoast").putExtra("from", "49625052041").putExtra("collapse_key", "followed_request").putExtra("type", String.valueOf(24)).putExtra("text", "Requested to follow you").putExtra("users", format);
                                                    continue;
                                                }
                                                putExtra.putExtra("scribe_target", "followed").putExtra("uri", "twitter://user?screen_name=chestcoast").putExtra("from", "49625052041").putExtra("collapse_key", "followed").putExtra("type", String.valueOf(23)).putExtra("tweet", a2).putExtra("text", "@chestcoast is now following you!").putExtra("users", format);
                                                continue;
                                            }
                                            putExtra.putExtra("scribe_target", "tweet").putExtra("uri", "twitter://tweet?status_id=483010988338184193").putExtra("from", "49625052041").putExtra("collapse_key", "tweet").putExtra("type", String.valueOf(74)).putExtra("tweet", a2).putExtra("text", "Google's understanding of...").putExtra("users", format);
                                            continue;
                                        }
                                        putExtra.putExtra("scribe_target", "magic_rec_user_2").putExtra("uri", "twitter://user?screen_name=chestcoast").putExtra("from", "49625052041").putExtra("collapse_key", "magic_rec_user").putExtra("type", String.valueOf(154)).putExtra("text", "@truthseeker1985, @vzhabiuk, @ajeet, and 2 more just followed @chestcoast").putExtra("users", format);
                                        continue;
                                    }
                                    putExtra.putExtra("scribe_target", "magic_rec_tweet_2").putExtra("uri", "twitter://tweet?status_id=490934786223898626").putExtra("from", "49625052041").putExtra("collapse_key", "magic_rec_tweet").putExtra("type", String.valueOf(153)).putExtra("tweet", a(assets, "push/magic_rec_tweet.json")).putExtra("users", format);
                                    continue;
                                }
                                putExtra.putExtra("collapse_key", "magic_rec_user");
                                putExtra.putExtra("type", String.valueOf(154));
                                putExtra.putExtra("text", "@ramnathb was just followed by @truthseeker1985, @vzhabiuk, @ajeet, and 2 more.");
                                putExtra.putExtra("title", "Quannan + 4");
                                putExtra.putExtra("from", "49625052041");
                                putExtra.putExtra("uri", "twitter://user?screen_name=ramnathb");
                                putExtra.putExtra("scribe_target", "magic_rec_user_7");
                                putExtra.putExtra("users", String.format(a(assets, "push/magic_rec_exp_user_users.json"), a.a(), a.username, a.c()));
                                putExtra.putExtra("actions", a(assets, "push/magic_rec_exp_user_actions.json"));
                                continue;
                            }
                            putExtra.putExtra("collapse_key", "magic_rec_tweet");
                            putExtra.putExtra("type", String.valueOf(153));
                            putExtra.putExtra("text", "@ramnathb's Tweet was just retweeted by @truthseeker1985, @vzhabiuk, @ajeet, and 2 more.");
                            putExtra.putExtra("title", "Quannan + 4");
                            putExtra.putExtra("from", "49625052041");
                            putExtra.putExtra("uri", "twitter://tweet?status_id=489160104734773248");
                            putExtra.putExtra("scribe_target", "magic_rec_tweet_7");
                            putExtra.putExtra("users", String.format(a(assets, "push/magic_rec_exp_tweet_users.json"), a.a(), a.username, a.c()));
                            putExtra.putExtra("actions", a(assets, "push/magic_rec_exp_tweet_actions.json"));
                            putExtra.putExtra("tweet", a(assets, "push/magic_rec_exp_tweet.json"));
                            continue;
                        }
                        putExtra.putExtra("collapse_key", "magic_rec_user");
                        putExtra.putExtra("type", String.valueOf(154));
                        putExtra.putExtra("text", "Would you like us to notify you when @ramnathb tweets?");
                        putExtra.putExtra("title", "Twitter");
                        putExtra.putExtra("from", "49625052041");
                        putExtra.putExtra("uri", "twitter://user?screen_name=ramnathb&df=1");
                        putExtra.putExtra("scribe_target", "magic_rec_user_10");
                        putExtra.putExtra("users", format);
                        continue;
                    }
                    putExtra.putExtra("schema", "2").putExtra("type", String.valueOf(270)).putExtra("text", "Stories from Gordon, Todd and 12 more").putExtra("from", "49625052041").putExtra("scribe_target", "highlights").putExtra("uri", "twitter://storystream").putExtra("users", format);
                    continue;
                }
                putExtra.putExtra("schema", "2").putExtra("type", String.valueOf(270)).putExtra("text", "Stories from Gordon, Todd and 12 more").putExtra("from", "49625052041").putExtra("scribe_target", "highlights").putExtra("uri", "twitter://storystream?allow_optout=true").putExtra("users", format);
                continue;
            }
        }
    }
    
    @Override
    protected void S_() {
        this.a.setVisibility(8);
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130969014);
        bn.a(false);
        bn.b(false);
        bn.d(false);
        return bn;
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        this.setTitle("Send a push Notification");
        this.a = (Spinner)this.findViewById(2131887213);
        this.b = new ox((Context)this);
        this.a.setAdapter((SpinnerAdapter)this.b);
        this.c = (RadioGroup)this.findViewById(2131887214);
        this.findViewById(2131887226).setOnClickListener((View$OnClickListener)this);
    }
    
    @Override
    protected void g_() {
        this.onBackPressed();
    }
    
    public void onAccountsUpdated(final Account[] array) {
        final String e = this.T().b().e();
        TwitterUser twitterUser = null;
        final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>(array.length);
        final int length = array.length;
        int i = 0;
    Label_0096_Outer:
        while (i < length) {
            final Account account = array[i];
            while (true) {
                Label_0158: {
                    if (!com.twitter.library.util.a.a.equals(account.type)) {
                        break Label_0158;
                    }
                    final TwitterUser a = com.twitter.library.util.a.a(AccountManager.get((Context)this), account);
                    if (a == null) {
                        break Label_0158;
                    }
                    list.add(a);
                    if (!a.username.equals(e)) {
                        break Label_0158;
                    }
                    ++i;
                    twitterUser = a;
                    continue Label_0096_Outer;
                }
                final TwitterUser a = twitterUser;
                continue;
            }
        }
        this.b.a(list);
        if (!list.isEmpty()) {
            final Spinner a2 = this.a;
            int index;
            if (twitterUser != null) {
                index = list.indexOf(twitterUser);
            }
            else {
                index = 0;
            }
            a2.setSelection(index);
        }
    }
    
    public void onClick(final View view) {
        switch (view.getId()) {
            default: {}
            case 2131887226: {
                this.h();
            }
        }
    }
    
    @Override
    protected void onPause() {
        AccountManager.get((Context)this).removeOnAccountsUpdatedListener((OnAccountsUpdateListener)this);
        super.onPause();
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        AccountManager.get((Context)this).addOnAccountsUpdatedListener((OnAccountsUpdateListener)this, (Handler)null, true);
    }
}
