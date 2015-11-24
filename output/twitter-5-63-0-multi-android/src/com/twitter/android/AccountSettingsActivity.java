// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.commerce.view.OrderHistoryActivity;
import com.twitter.android.commerce.view.ProfileSummaryActivity;
import com.twitter.library.client.Session;
import com.twitter.library.util.bq;
import android.preference.ListPreference;
import com.twitter.library.client.App;
import com.twitter.library.client.k;
import com.twitter.library.platform.PushService;
import android.os.Bundle;
import android.app.Activity;
import com.twitter.library.service.aa;
import com.twitter.android.dialog.EnterPasswordDialogActivity;
import com.twitter.library.api.account.ab;
import com.twitter.android.client.c;
import com.twitter.android.dialog.RemovePhoneDialogActivity;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.library.featureswitch.d;
import android.content.Context;
import android.widget.Toast;
import android.text.TextUtils;
import android.content.Intent;
import com.twitter.library.api.UserSettings;
import android.preference.PreferenceCategory;
import android.preference.Preference;
import android.preference.CheckBoxPreference;
import android.preference.Preference$OnPreferenceClickListener;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;

public class AccountSettingsActivity extends TwitterPreferenceActivity implements Preference$OnPreferenceChangeListener, Preference$OnPreferenceClickListener
{
    boolean a;
    String b;
    int c;
    boolean d;
    CheckBoxPreference e;
    Preference f;
    Preference g;
    PreferenceCategory h;
    private long i;
    
    private void a(final Intent intent) {
        final String stringExtra = intent.getStringExtra("phone_association");
        if (!TextUtils.isEmpty((CharSequence)stringExtra)) {
            Toast.makeText((Context)this, 2131297752, 1).show();
            this.a(stringExtra);
        }
    }
    
    private void a(final String p) {
        final UserSettings f = this.f();
        if (f != null) {
            this.b(f.p = p);
        }
    }
    
    private void b(final String summary) {
        if (!TextUtils.isEmpty((CharSequence)summary)) {
            this.g.setSummary((CharSequence)summary);
            return;
        }
        this.g.setSummary(2131296301);
    }
    
    private boolean b() {
        return com.twitter.library.featureswitch.d.f("phone_association_setting_android_enabled");
    }
    
    private void c() {
        as.a((Context)this).a(new ph((Context)this, this.l().b(this.b)), new e(this));
    }
    
    private void c(final String s) {
        this.startActivityForResult(new Intent(this.getBaseContext(), (Class)RemovePhoneDialogActivity.class).putExtra("title", s), 2);
    }
    
    private void d() {
        final UserSettings f = this.f();
        final CheckBoxPreference checkBoxPreference = (CheckBoxPreference)this.findPreference((CharSequence)"display_sensitive_media");
        if (f == null) {
            checkBoxPreference.setEnabled(false);
            this.a(ab.a((Context)this, this.l().b(this.b)), 1);
            return;
        }
        checkBoxPreference.setEnabled(true);
        checkBoxPreference.setChecked(f.k);
        checkBoxPreference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
    }
    
    private void d(final String s) {
        as.a((Context)this).a(new px((Context)this, this.l().b(this.b), s), new g(this));
    }
    
    private void e() {
        this.startActivityForResult(new Intent(this.getBaseContext(), (Class)EnterPasswordDialogActivity.class).putExtra("phone", this.g()), 3);
    }
    
    private void e(final String s) {
        this.Y.a(this.i, "settings:phone:" + s);
    }
    
    private UserSettings f() {
        return this.l().b(this.b).j();
    }
    
    private String g() {
        final UserSettings f = this.f();
        if (f != null) {
            return f.p;
        }
        return null;
    }
    
    public void a(final int n, final y y) {
        if (n == 1 || n == 2) {
            final aa aa = (aa)y.l().b();
            if (aa != null && aa.a() && aa.c.getParcelable("SETTINGS") != null) {
                this.d();
            }
            return;
        }
        super.a(n, y);
    }
    
    void a(final boolean b) {
        if (b) {
            this.e.setSummary(2131297777);
            return;
        }
        this.e.setSummary(2131297776);
    }
    
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        switch (n) {
            default: {
                super.onActivityResult(n, n2, intent);
                break;
            }
            case 1: {
                if (n2 != -1) {
                    break;
                }
                if (intent.getBooleanExtra("is_last", false)) {
                    DispatchActivity.a((Activity)this);
                    return;
                }
                this.finish();
            }
            case 2: {
                if (n2 != -1) {
                    break;
                }
                if (intent.getBooleanExtra("user_choice", false)) {
                    this.e();
                    this.e("remove:confirm_dialog:ok");
                    return;
                }
                this.e("remove:confirm_dialog:cancel");
            }
            case 3: {
                if (n2 != -1) {
                    break;
                }
                if (intent.getBooleanExtra("user_choice", false)) {
                    this.d(intent.getStringExtra("password_input"));
                    this.e("password:ok:click");
                    return;
                }
                this.e("password:cancel:click");
            }
        }
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.d = PushService.c((Context)this);
        if (this.d) {
            this.addPreferencesFromResource(2131165187);
        }
        else {
            this.addPreferencesFromResource(2131165185);
        }
        final Intent intent = this.getIntent();
        this.b = intent.getStringExtra("AccountSettingsActivity_account_name");
        this.setTitle((CharSequence)('@' + this.b));
        this.i = intent.getLongExtra("account_id", 0L);
        final Preference preference = this.findPreference((CharSequence)"notif");
        preference.setIntent(new Intent((Context)this, (Class)NotificationSettingsActivity.class).putExtra("NotificationSettingsActivity_account_name", this.b));
        this.f = preference;
        this.findPreference((CharSequence)"notifications_timeline").setIntent(new Intent((Context)this, (Class)NotificationsTimelineSettingsActivity.class).putExtra("NotificationsTimelineSettingsActivity_account_name", this.b));
        final Preference preference2 = this.findPreference((CharSequence)"sync_data");
        preference2.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        this.e = (CheckBoxPreference)preference2;
        this.findPreference((CharSequence)"polling_interval").setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        this.findPreference((CharSequence)"remove_account").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        final Preference preference3 = this.findPreference((CharSequence)"change_screen_name");
        this.h = (PreferenceCategory)this.findPreference((CharSequence)"settings_other");
        if (com.twitter.library.featureswitch.d.f("screen_name_change_enabled")) {
            preference3.setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        }
        else {
            this.h.removePreference(preference3);
        }
        final Preference preference4 = this.findPreference((CharSequence)"app_graph");
        if (com.twitter.library.featureswitch.d.f("app_graph_enabled")) {
            preference4.setIntent(new Intent((Context)this, (Class)AppGraphSettingsActivity.class).putExtra("AppGraphSettingsActivity_account_name", this.b));
            final String string = new k(this.getApplicationContext(), this.b).getString("app_graph_status", "undetermined");
            int summary = 0;
            switch (string) {
                default: {
                    summary = 0;
                    break;
                }
                case "optin": {
                    summary = 2131296944;
                    break;
                }
                case "optout": {
                    summary = 2131296809;
                    break;
                }
            }
            if (summary > 0) {
                preference4.setSummary(summary);
            }
            else {
                preference4.setSummary((CharSequence)"");
            }
        }
        else {
            this.h.removePreference(preference4);
        }
        this.findPreference((CharSequence)"security").setIntent(new Intent((Context)this, (Class)SecuritySettingsActivity.class).putExtra("SecuritySettingsActivity_account_name", this.b));
        this.findPreference((CharSequence)"privacy").setIntent(new Intent((Context)this, (Class)PrivacySettingsActivity.class).putExtra("account_id", this.i));
        this.findPreference((CharSequence)"change_password").setIntent(new Intent((Context)this, (Class)ChangePasswordActivity.class).putExtra("ChangePasswordActivity_account_name", this.b));
        final Preference preference5 = this.findPreference((CharSequence)"commerce_settings_payment_shipping");
        if (com.twitter.android.commerce.util.e.a()) {
            preference5.setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        }
        else {
            this.h.removePreference(preference5);
        }
        final Preference preference6 = this.findPreference((CharSequence)"commerce_settings_order_history");
        if (com.twitter.android.commerce.util.e.c()) {
            preference6.setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        }
        else {
            this.h.removePreference(preference6);
        }
        this.g = this.findPreference((CharSequence)"phone_association");
        if (this.b()) {
            this.g.setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
            this.c();
        }
        else {
            this.h.removePreference(this.g);
        }
        if (App.f()) {
            this.addPreferencesFromResource(2131165186);
            this.findPreference((CharSequence)"change_email").setIntent(new Intent((Context)this, (Class)ChangeEmailActivity.class).putExtra("ChangeEmailActivity_account_name", this.b));
        }
        this.a(intent);
    }
    
    public void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.a(intent);
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        final String key = preference.getKey();
        if (key == null) {
            return false;
        }
        switch (key) {
            default: {
                return false;
            }
            case "sync_data": {
                this.a((boolean)o);
                break;
            }
            case "polling_interval": {
                bq.a((ListPreference)preference, (String)o);
                break;
            }
            case "display_sensitive_media": {
                final Session b = this.l().b(this.b);
                final UserSettings j = b.j();
                j.k = (boolean)o;
                this.a(ab.a((Context)this, b, j, false, null), 2);
                break;
            }
        }
        return true;
    }
    
    public boolean onPreferenceClick(final Preference preference) {
        final String key = preference.getKey();
        if ("remove_account".equals(key)) {
            this.startActivityForResult(new Intent((Context)this, (Class)RemoveAccountDialogActivity.class).putExtra("RemoveAccountDialogActivity_account_name", this.b), 1);
            return true;
        }
        if ("change_screen_name".equals(key)) {
            this.startActivity(new Intent((Context)this, (Class)ChangeScreenNameActivity.class).putExtra("ChangeScreenNameActivity_account_name", this.b));
            return true;
        }
        if ("commerce_settings_payment_shipping".equals(preference.getKey())) {
            final Intent intent = new Intent((Context)this, (Class)ProfileSummaryActivity.class);
            final Bundle bundle = new Bundle();
            bundle.putBoolean("commerce_launched_from_settings", true);
            com.twitter.android.commerce.network.c.a(bundle, this.b);
            intent.putExtras(bundle);
            this.startActivity(intent);
            this.Y.a(this.i, "settings:payment_settings:::start");
            return true;
        }
        if ("commerce_settings_order_history".equals(preference.getKey())) {
            final Intent intent2 = new Intent((Context)this, (Class)OrderHistoryActivity.class);
            final Bundle bundle2 = new Bundle();
            com.twitter.android.commerce.network.c.a(bundle2, this.b);
            intent2.putExtras(bundle2);
            this.startActivity(intent2);
            return true;
        }
        if ("phone_association".equals(preference.getKey())) {
            final String g = this.g();
            if (!TextUtils.isEmpty((CharSequence)g)) {
                this.c(g);
                this.e("remove::click");
            }
            else {
                this.startActivity(new Intent((Context)this, (Class)PhoneEntrySettingsActivity.class).putExtra("account_name", this.b));
                this.e("add::click");
            }
        }
        return false;
    }
    
    public boolean onSearchRequested() {
        return false;
    }
    
    public void onStart() {
        super.onStart();
        if (this.b != null) {
            new f(this, this.b).execute((Object[])new Void[0]);
        }
        this.d();
    }
    
    public void onStop() {
        super.onStop();
        if (this.b != null) {
            new h(this, this.b).execute((Object[])new Void[0]);
        }
    }
}
