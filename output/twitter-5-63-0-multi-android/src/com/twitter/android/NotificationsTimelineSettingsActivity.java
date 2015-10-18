// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.preference.Preference;
import android.preference.CheckBoxPreference;
import com.twitter.android.util.aj;
import android.content.Context;
import com.twitter.library.client.az;
import android.text.TextUtils;
import android.os.Bundle;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.client.k;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;

public class NotificationsTimelineSettingsActivity extends TwitterPreferenceActivity implements Preference$OnPreferenceChangeListener
{
    private k a;
    private TwitterUser b;
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final String stringExtra = this.getIntent().getStringExtra("NotificationsTimelineSettingsActivity_account_name");
        if (TextUtils.isEmpty((CharSequence)stringExtra)) {
            throw new IllegalArgumentException("NotificationsTimelineSettingsActivity expects an account name but none was specified.");
        }
        this.setTitle(2131297739);
        this.a = new k(this.getApplicationContext(), stringExtra);
        this.b = az.a((Context)this).b(stringExtra).f();
        if (aj.a(this.b)) {
            this.addPreferencesFromResource(2131165212);
            this.findPreference((CharSequence)"quality_filter").setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
            if (this.b != null) {
                this.Y.a(this.b.a(), "settings:notifications:vit::impression");
            }
            return;
        }
        this.addPreferencesFromResource(2131165201);
        final CheckBoxPreference checkBoxPreference = (CheckBoxPreference)this.findPreference((CharSequence)"connect_tab");
        checkBoxPreference.setChecked(this.a.getBoolean("connect_tab", false));
        checkBoxPreference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        final CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference)this.findPreference((CharSequence)"notifications_follow_only");
        checkBoxPreference2.setChecked(this.a.getBoolean("notifications_follow_only", false));
        checkBoxPreference2.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        final String key = preference.getKey();
        if (key == null) {
            return false;
        }
        switch (key) {
            case "notifications_follow_only": {
                this.a.a().a("notifications_follow_only", (boolean)o).apply();
                break;
            }
            case "connect_tab": {
                this.a.a().a("connect_tab", (boolean)o).apply();
                break;
            }
            case "quality_filter": {
                final boolean booleanValue = (boolean)o;
                this.a.a().a("quality_filter", booleanValue).apply();
                if (this.b != null) {
                    final StringBuilder append = new StringBuilder().append("settings:notifications:vit:quality_filter:");
                    String s;
                    if (booleanValue) {
                        s = "select";
                    }
                    else {
                        s = "deselect";
                    }
                    this.Y.a(this.b.a(), append.append(s).toString());
                    break;
                }
                break;
            }
        }
        return true;
    }
}
