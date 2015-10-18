// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.Toast;
import com.twitter.internal.android.service.a;
import com.twitter.library.client.as;
import android.preference.Preference;
import android.content.SharedPreferences;
import android.content.Context;
import android.preference.PreferenceManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.preference.EditTextPreference;
import java.util.regex.Pattern;
import android.preference.Preference$OnPreferenceChangeListener;
import com.twitter.android.client.TwitterPreferenceActivity;

public class ProxySettingsActivity extends TwitterPreferenceActivity implements Preference$OnPreferenceChangeListener
{
    public static final Pattern a;
    private boolean b;
    private String c;
    private String d;
    private boolean e;
    private EditTextPreference f;
    
    static {
        a = Pattern.compile("^[a-zA-Z0-9.\\-]+$");
    }
    
    private boolean a(final String s) {
        return TextUtils.isEmpty((CharSequence)s) || ProxySettingsActivity.a.matcher(s.trim()).matches();
    }
    
    private boolean b(final String s) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            try {
                if (Integer.parseInt(s.trim()) >= 65535) {
                    return false;
                }
            }
            catch (NumberFormatException ex) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setTitle(2131297767);
        this.addPreferencesFromResource(2131165205);
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)this);
        this.e = defaultSharedPreferences.getBoolean("proxy_enabled", false);
        this.c = defaultSharedPreferences.getString("proxy_host", "");
        this.d = defaultSharedPreferences.getString("proxy_port", "");
        this.findPreference((CharSequence)"proxy_enabled").setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        final Preference preference = this.findPreference((CharSequence)"proxy_host");
        if (!TextUtils.isEmpty((CharSequence)this.c)) {
            preference.setSummary((CharSequence)this.c);
        }
        preference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
        this.f = (EditTextPreference)preference;
        final Preference preference2 = this.findPreference((CharSequence)"proxy_port");
        if (!TextUtils.isEmpty((CharSequence)this.d)) {
            preference2.setSummary((CharSequence)this.d);
        }
        preference2.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
    }
    
    protected void onDestroy() {
        super.onDestroy();
        if (this.b) {
            as.a((Context)this).a(new ow((Context)this));
        }
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        final String key = preference.getKey();
        if (key.equals("proxy_host")) {
            if (!this.a(((EditTextPreference)preference).getEditText().getText().toString())) {
                Toast.makeText((Context)this, 2131297113, 1).show();
                return false;
            }
            final String summary = (String)o;
            this.b = (this.b || !this.c.equals(summary));
            if (TextUtils.isEmpty((CharSequence)summary)) {
                preference.setSummary(2131297695);
            }
            else {
                preference.setSummary((CharSequence)summary);
            }
        }
        else if (key.equals("proxy_port")) {
            if (!this.b(((EditTextPreference)preference).getEditText().getText().toString())) {
                Toast.makeText((Context)this, 2131297115, 1).show();
                return false;
            }
            final String summary2 = (String)o;
            boolean b = false;
            Label_0200: {
                if (!this.b) {
                    final boolean empty = TextUtils.isEmpty((CharSequence)this.f.getText());
                    b = false;
                    if (empty) {
                        break Label_0200;
                    }
                    final boolean equals = this.d.equals(summary2);
                    b = false;
                    if (equals) {
                        break Label_0200;
                    }
                }
                b = true;
            }
            this.b = b;
            if (TextUtils.isEmpty((CharSequence)summary2)) {
                preference.setSummary(2131297698);
            }
            else {
                preference.setSummary((CharSequence)summary2);
            }
        }
        else if (key.equals("proxy_enabled")) {
            boolean b2 = false;
            Label_0288: {
                if (!this.b) {
                    final boolean booleanValue = (boolean)o;
                    final boolean e = this.e;
                    b2 = false;
                    if (booleanValue == e) {
                        break Label_0288;
                    }
                }
                b2 = true;
            }
            this.b = b2;
        }
        this.setResult(-1);
        return true;
    }
    
    public boolean onSearchRequested() {
        return false;
    }
}
