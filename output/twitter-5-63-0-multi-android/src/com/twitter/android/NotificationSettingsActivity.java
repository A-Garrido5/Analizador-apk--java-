// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.util.bq;
import android.content.DialogInterface$OnCancelListener;
import android.app.ProgressDialog;
import android.app.Dialog;
import com.twitter.android.widget.CheckBoxListPreference;
import android.os.Bundle;
import android.widget.Toast;
import com.twitter.library.api.account.p;
import android.os.Handler;
import android.content.BroadcastReceiver;
import com.twitter.library.provider.ae;
import com.twitter.library.platform.PushService;
import android.content.IntentFilter;
import com.google.android.gcm.b;
import com.twitter.android.commerce.util.e;
import com.twitter.library.client.az;
import com.twitter.android.util.bi;
import java.io.Serializable;
import com.twitter.library.featureswitch.d;
import com.twitter.errorreporter.ErrorReporter;
import android.preference.PreferenceGroup;
import android.content.SharedPreferences;
import android.view.View;
import android.view.View$OnClickListener;
import com.twitter.android.client.c;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.ViewGroup;
import com.twitter.internal.android.service.a;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.client.Session;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import com.twitter.library.featureswitch.n;
import android.preference.Preference$OnPreferenceClickListener;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;

public class NotificationSettingsActivity extends TwitterPreferenceActivity implements Preference$OnPreferenceChangeListener, Preference$OnPreferenceClickListener, n
{
    private static final String[] Z;
    int A;
    int B;
    int C;
    boolean D;
    boolean E;
    String F;
    boolean G;
    PreferenceCategory H;
    Preference I;
    Preference J;
    Preference K;
    Preference L;
    Preference M;
    Preference N;
    Preference O;
    Preference P;
    Preference Q;
    Preference R;
    Preference S;
    Preference T;
    Preference U;
    Preference V;
    ListPreference W;
    String a;
    private boolean aa;
    private mv ab;
    Session b;
    TwitterUser c;
    boolean d;
    String e;
    boolean f;
    int g;
    boolean h;
    int i;
    boolean j;
    int k;
    boolean l;
    int m;
    int n;
    int o;
    int p;
    int q;
    int r;
    int s;
    int t;
    int u;
    int v;
    int w;
    int x;
    int y;
    int z;
    
    static {
        Z = new String[] { "use_led", "vibrate" };
    }
    
    public static void a(final Intent intent, final ViewGroup viewGroup) {
        a(intent, viewGroup, viewGroup.getContext());
    }
    
    static void a(final Intent intent, final ViewGroup viewGroup, final Context context) {
        final String stringExtra = intent.getStringExtra("NotificationSettingsActivity_text");
        final String stringExtra2 = intent.getStringExtra("NotificationSettingsActivity_notif_random_id");
        final String stringExtra3 = intent.getStringExtra("NotificationSettingsActivity_notif_type");
        final String stringExtra4 = intent.getStringExtra("NotificationSettingsActivity_scribe_component");
        final String string = "notif_settings_link_num_times_shown_" + stringExtra3;
        final View viewById = viewGroup.findViewById(2131887314);
        final TextView textView = (TextView)viewGroup.findViewById(2131887064);
        int a;
        if (!TextUtils.isEmpty((CharSequence)stringExtra)) {
            a = 1;
        }
        else {
            a = 0;
        }
        if (a != 0) {
            final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            a = (a(defaultSharedPreferences, stringExtra3) ? 1 : 0);
            final String string2 = string + "_" + stringExtra2;
            boolean b;
            if (defaultSharedPreferences.getInt(string2, 0) > 0) {
                b = true;
            }
            else {
                b = false;
            }
            if (a != 0) {
                if (!b) {
                    defaultSharedPreferences.edit().putInt(string, 1 + defaultSharedPreferences.getInt(string, 0)).apply();
                    defaultSharedPreferences.edit().putInt(string2, 1).apply();
                }
            }
            else if (b) {
                if (defaultSharedPreferences.getInt(string, 0) > 0) {
                    a = 1;
                }
                else {
                    a = 0;
                }
            }
        }
        if (a == 0) {
            viewById.setVisibility(8);
            return;
        }
        textView.setText((CharSequence)stringExtra);
        viewById.setVisibility(0);
        final String stringExtra5 = intent.getStringExtra("NotificationSettingsActivity_username");
        final long longExtra = intent.getLongExtra("NotificationSettingsActivity_user_id", -1L);
        String s;
        if (stringExtra3.indexOf("follow") == 0) {
            s = "profile";
        }
        else {
            s = "tweet";
        }
        final String string3 = s + ":notification_landing:" + stringExtra4 + ":header";
        final String string4 = string3 + ":show";
        final String string5 = string3 + ":click";
        final c a2 = c.a(context);
        a2.a(longExtra, string4);
        textView.setOnClickListener((View$OnClickListener)new mt(stringExtra5, stringExtra3, string, a2, longExtra, string5));
    }
    
    private void a(final Preference preference, final int n) {
        if (n == 0) {
            preference.setSummary(2131297734);
        }
        else {
            if (n == 1) {
                preference.setSummary(2131297729);
                return;
            }
            if (n == 2) {
                preference.setSummary(2131297728);
            }
        }
    }
    
    private void a(final PreferenceGroup preferenceGroup, final Preference preference, final String s) {
        if (preference != null) {
            preferenceGroup.removePreference(preference);
            return;
        }
        ErrorReporter.a(new IllegalStateException("NotificationSettingsActivity preference (key: " + s + ") was unexpectedly null when trying to remove it."));
    }
    
    public static boolean a(final SharedPreferences sharedPreferences, final String s) {
        if (d.f("notif_settings_link_on_push_landing_pages_enabled")) {
            final int int1 = sharedPreferences.getInt("notif_settings_link_num_times_shown_" + s, 0);
            if (int1 >= 0 && int1 < 3) {
                return true;
            }
        }
        return false;
    }
    
    private static Intent b(final Context context, final String s, final String s2) {
        boolean b;
        if (s2.indexOf("tweet_") == 0) {
            b = true;
        }
        else {
            b = false;
        }
        Serializable s3;
        if (b) {
            s3 = TweetSettingsActivity.class;
        }
        else {
            s3 = NotificationSettingsActivity.class;
        }
        final Intent intent = new Intent(context, (Class)s3);
        if (b) {
            intent.putExtra("TweetSettingsActivity_account_name", s).putExtra("enabled", TweetSettingsActivity.a(context, s)).putExtra("from_notification_landing", true);
            return intent;
        }
        intent.putExtra("NotificationSettingsActivity_account_name", s);
        return intent;
    }
    
    void a(final int g, final boolean h) {
        this.a(this.K, g);
        this.g = g;
        this.h = h;
    }
    
    public void a(final long n) {
        if (this.d && n == this.b.g()) {
            this.runOnUiThread((Runnable)new ms(this));
        }
    }
    
    void a(final Preference preference) {
        this.H.addPreference(preference);
    }
    
    protected void a(final TwitterUser twitterUser) {
        final boolean a = bi.a(twitterUser);
        final Preference e = this.e();
        if (a) {
            this.a(e);
            e.setEnabled(true);
            return;
        }
        e.setEnabled(false);
        this.b(e);
    }
    
    void a(final boolean b) {
        if (!b) {
            return;
        }
        this.a(this.c);
        this.b(this.c);
        this.c();
        this.d();
    }
    
    void a(final boolean f, final int n) {
        final Preference i = this.I;
        if (f) {
            i.setSummary((CharSequence)this.getResources().getQuantityString(2131427351, n, new Object[] { n }));
        }
        else {
            i.setSummary(2131297734);
        }
        this.f = f;
    }
    
    protected void b() {
        if (az.a(this.getApplicationContext()).b().g() != this.b.g()) {
            com.twitter.library.featureswitch.d.a(this.b);
        }
    }
    
    void b(final int i, final boolean j) {
        this.a(this.L, i);
        this.i = i;
        this.j = j;
    }
    
    void b(final Preference preference) {
        this.H.removePreference(preference);
    }
    
    protected void b(final TwitterUser twitterUser) {
        this.l = bi.b(twitterUser);
        final Preference f = this.f();
        if (this.l) {
            this.a(f);
            f.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
            this.b(this.g());
            return;
        }
        this.b(f);
    }
    
    protected void c() {
        if (com.twitter.android.commerce.util.e.d()) {
            this.H.addPreference(this.U);
            this.U.setEnabled(true);
            return;
        }
        this.U.setEnabled(false);
        this.H.removePreference(this.U);
    }
    
    protected void d() {
        if (com.twitter.android.highlights.e.a(this.b.g())) {
            this.H.addPreference(this.V);
            this.V.setEnabled(true);
            return;
        }
        this.V.setEnabled(false);
        this.H.removePreference(this.V);
    }
    
    Preference e() {
        return this.T;
    }
    
    Preference f() {
        return (Preference)this.W;
    }
    
    Preference g() {
        return this.M;
    }
    
    protected boolean h() {
        return this.d;
    }
    
    protected boolean i() {
        if (!com.google.android.gcm.b.g((Context)this)) {
            this.showDialog(1);
            final IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(PushService.d);
            intentFilter.addAction(PushService.e);
            this.registerReceiver((BroadcastReceiver)(this.ab = new mv(this, null)), intentFilter, ae.a, (Handler)null);
            PushService.e((Context)this);
        }
        return true;
    }
    
    protected boolean j() {
        int n = 1;
        if (com.google.android.gcm.b.g((Context)this) && com.twitter.library.api.account.p.f((Context)this, this.a)) {
            Toast.makeText((Context)this, (CharSequence)this.getString(2131296448), n).show();
            n = 0;
        }
        return n != 0;
    }
    
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        if (n == 1) {
            if (n2 == -1 && intent.hasExtra("enabled")) {
                this.a(intent.getBooleanExtra("enabled", false), intent.getIntExtra("count", 0));
            }
        }
        else if (n == 2) {
            if (n2 == -1 && (intent.hasExtra("pref_mention") || intent.hasExtra("pref_choice"))) {
                this.a(intent.getIntExtra("pref_choice", 0), intent.getBooleanExtra("pref_mention", false));
            }
        }
        else {
            if (n != 3) {
                super.onActivityResult(n, n2, intent);
                return;
            }
            if (n2 == -1 && (intent.hasExtra("pref_mention") || intent.hasExtra("pref_choice"))) {
                this.b(intent.getIntExtra("pref_choice", 0), intent.getBooleanExtra("pref_mention", false));
            }
        }
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        this.d = PushService.c((Context)this);
        super.onCreate(bundle);
        this.setTitle(2131297745);
        this.a = this.getIntent().getStringExtra("NotificationSettingsActivity_account_name");
        this.b = this.l().b(this.a);
        this.c = this.b.f();
        this.aa = true;
        if (this.d) {
            this.addPreferencesFromResource(2131165200);
        }
        else {
            this.addPreferencesFromResource(2131165199);
        }
        boolean b;
        if (!com.twitter.library.featureswitch.d.f("legacy_deciders_lifeline_alerts_enabled")) {
            b = true;
        }
        else {
            b = false;
        }
        this.Q = this.findPreference((CharSequence)"notif_lifeline_alerts");
        if (this.d) {
            (this.I = this.findPreference((CharSequence)"notif_tweets")).setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
            this.J = this.findPreference((CharSequence)"notif_mentions_choice");
            this.N = this.findPreference((CharSequence)"notif_address_book");
            this.O = this.findPreference((CharSequence)"notif_experimental");
            this.R = this.findPreference((CharSequence)"notif_recommendations");
            this.S = this.findPreference((CharSequence)"notif_news");
            this.T = this.findPreference((CharSequence)"notif_vit_notable_event");
            this.W = (ListPreference)this.findPreference((CharSequence)"notif_vit_follows");
            this.U = this.findPreference((CharSequence)"notif_offer_redemption");
            this.V = this.findPreference((CharSequence)"notif_highlights");
            this.a((PreferenceGroup)(this.H = (PreferenceCategory)this.getPreferenceScreen().findPreference((CharSequence)"notif_pref_category")), this.findPreference((CharSequence)"notif_retweets"), "notif_retweets");
            this.a((PreferenceGroup)this.H, this.findPreference((CharSequence)"notif_favorites"), "notif_favorites");
            this.K = this.findPreference((CharSequence)"notif_retweets_choice");
            this.L = this.findPreference((CharSequence)"notif_favorites_choice");
            if (b) {
                this.a((PreferenceGroup)this.H, this.Q, "notif_lifeline_alerts");
            }
        }
        else {
            this.I = this.findPreference((CharSequence)"notif_timeline");
            this.J = this.findPreference((CharSequence)"notif_mentions");
            this.K = this.findPreference((CharSequence)"notif_retweets");
            this.L = this.findPreference((CharSequence)"notif_favorites");
            if (b) {
                this.a((PreferenceGroup)this.getPreferenceScreen(), this.Q, "notif_lifeline_alerts");
            }
        }
        this.M = this.findPreference((CharSequence)"notif_follows");
        this.P = this.findPreference((CharSequence)"notif_direct_messages");
        this.J.setTitle(2131297719);
        if (this.d) {
            ((CheckBoxListPreference)this.J).setDialogTitle(2131297719);
        }
        this.findPreference((CharSequence)"ringtone").setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
    }
    
    protected Dialog onCreateDialog(final int n) {
        if (n == 1) {
            final ProgressDialog progressDialog = new ProgressDialog((Context)this);
            progressDialog.setMessage(this.getText(2131297689));
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(true);
            progressDialog.setOnCancelListener((DialogInterface$OnCancelListener)new mr(this));
            return (Dialog)progressDialog;
        }
        return super.onCreateDialog(n);
    }
    
    protected void onDestroy() {
        super.onDestroy();
        if (this.ab != null) {
            this.unregisterReceiver((BroadcastReceiver)this.ab);
        }
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        com.twitter.library.featureswitch.d.b(this);
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        if ("ringtone".equals(preference.getKey())) {
            this.e = (String)o;
        }
        else if (preference instanceof ListPreference) {
            bq.a((ListPreference)preference, (String)o);
        }
        return true;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        if ("notif_tweets".equals(preference.getKey())) {
            this.aa = false;
            this.startActivityForResult(new Intent((Context)this, (Class)TweetSettingsActivity.class).putExtra("TweetSettingsActivity_account_name", this.a).putExtra("enabled", this.f), 1);
        }
        else {
            if ("notif_retweets".equals(preference.getKey())) {
                this.aa = false;
                this.startActivityForResult(new Intent((Context)this, (Class)RtFavSettingsActivity.class).putExtra("pref_choice", this.g).putExtra("pref_choice_key", "notif_retweets_choice").putExtra("pref_mention", this.h).putExtra("pref_mention_key", "notif_retweeted_mention").putExtra("pref_title", 2131297727).putExtra("pref_xml", 2131165207), 2);
                return true;
            }
            if ("notif_favorites".equals(preference.getKey())) {
                this.aa = false;
                this.startActivityForResult(new Intent((Context)this, (Class)RtFavSettingsActivity.class).putExtra("pref_choice", this.i).putExtra("pref_choice_key", "notif_favorites_choice").putExtra("pref_mention", this.j).putExtra("pref_mention_key", "notif_favorited_mention").putExtra("pref_title", 2131297714).putExtra("pref_xml", 2131165195), 3);
                return true;
            }
        }
        return true;
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        com.twitter.library.featureswitch.d.a(this);
        this.b();
        this.a(this.d);
    }
    
    public boolean onSearchRequested() {
        return false;
    }
    
    protected void onStart() {
        super.onStart();
        if (this.aa && this.a != null) {
            new mu(this, this.a).execute((Object[])new Void[0]);
        }
        else if (!this.aa) {
            this.aa = true;
        }
    }
    
    public void onStop() {
        super.onStop();
        if (this.aa && this.a != null) {
            new mw(this, this.a).execute((Object[])new Void[0]);
        }
    }
}
