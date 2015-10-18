// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import com.twitter.android.samsung.data.PollingService;
import android.os.Bundle;
import com.twitter.library.api.TwitterUser;
import android.accounts.Account;
import android.preference.CheckBoxPreference;
import android.accounts.AccountManager;
import android.preference.Preference$OnPreferenceChangeListener;
import android.preference.Preference$OnPreferenceClickListener;
import com.twitter.android.samsung.model.g;
import android.content.Intent;
import android.content.Context;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.PreferenceActivity;

@Deprecated
public class WidgetPreferencesActivity extends PreferenceActivity
{
    protected PreferenceGroup a;
    protected Preference b;
    protected int c;
    private String d;
    private ListPreference e;
    private boolean f;
    
    public WidgetPreferencesActivity() {
        this.f = false;
    }
    
    private void a(final ListPreference listPreference, final String s) {
        final CharSequence[] entries = listPreference.getEntries();
        final int indexOfValue = listPreference.findIndexOfValue(s);
        if (indexOfValue != -1) {
            listPreference.setSummary(entries[indexOfValue]);
        }
    }
    
    private void e() {
        this.c = this.getIntent().getExtras().getInt("appWidgetId");
    }
    
    private void f() {
        TwitterWidgetProvider.a((Context)this, "widget::accounts:switch:click", this.c);
        final Intent intent = new Intent((Context)this, (Class)TwitterWidgetProvider.class);
        intent.setAction(TwitterWidgetProvider.e);
        intent.putExtra("appWidgetId", this.c);
        this.sendBroadcast(intent);
    }
    
    private int g() {
        return 1 + g.a((Context)this);
    }
    
    protected void a() {
        this.b.setOnPreferenceClickListener((Preference$OnPreferenceClickListener)new k(this));
        this.e.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)new l(this));
        final CharSequence[] entries = this.e.getEntries();
        final CharSequence[] entries2 = new CharSequence[-1 + entries.length];
        final CharSequence[] entryValues = this.e.getEntryValues();
        final CharSequence[] entryValues2 = new CharSequence[-1 + entryValues.length];
        for (int i = 0; i < -1 + entries2.length; ++i) {
            entries2[i] = entries[i + 2];
            entryValues2[i] = entryValues[i + 2];
        }
        final int n = -1 + entries2.length;
        entries2[n] = this.getString(2131297734);
        entryValues2[n] = "0";
        this.e.setEntries(entries2);
        this.e.setEntryValues(entryValues2);
        final long c = i.c((Context)this, this.c);
        if (c < 0L) {
            this.f = true;
            this.e.setValue(entryValues2[0].toString());
            this.a(this.e, entryValues2[0].toString());
            i.b((Context)this, entryValues2[0].toString(), this.c);
            return;
        }
        this.e.setValue(String.valueOf(c));
        this.a(this.e, String.valueOf(c));
    }
    
    protected void b() {
        this.addPreferencesFromResource(2131165215);
    }
    
    protected void c() {
        final String a = i.a((Context)this, this.c);
        final AccountManager value = AccountManager.get((Context)this);
        final Account[] accountsByType = value.getAccountsByType(g.a);
        final int length = accountsByType.length;
        int i = 0;
        int order = 0;
        while (i < length) {
            final Account account = accountsByType[i];
            int n;
            if (g.a.equals(account.type)) {
                final CheckBoxPreference checkBoxPreference = new CheckBoxPreference((Context)this);
                final TwitterUser a2 = g.a(value, account);
                checkBoxPreference.setTitle((CharSequence)a2.name);
                checkBoxPreference.setSummary((CharSequence)("@" + a2.username));
                n = order + 1;
                checkBoxPreference.setOrder(order);
                if (a != null && a.equalsIgnoreCase(a2.username)) {
                    checkBoxPreference.setDefaultValue((Object)true);
                }
                else if (a == null && account.name.equals(accountsByType[0].name)) {
                    checkBoxPreference.setDefaultValue((Object)true);
                    com.twitter.android.samsung.single.i.a((Context)this, account.name, this.c);
                }
                checkBoxPreference.setOnPreferenceClickListener(this.d());
                this.a.addPreference((Preference)checkBoxPreference);
            }
            else {
                n = order;
            }
            ++i;
            order = n;
        }
        this.b.setOrder(this.g());
        this.a.addPreference(this.b);
    }
    
    protected Preference$OnPreferenceClickListener d() {
        return (Preference$OnPreferenceClickListener)new m(this);
    }
    
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        if (n2 == -1) {
            this.a.removeAll();
            this.c();
        }
    }
    
    public void onBackPressed() {
        this.finish();
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setResult(0);
        this.e();
        this.b();
        this.setTitle((CharSequence)this.getResources().getString(2131297667));
        this.a = (PreferenceGroup)this.findPreference((CharSequence)"accounts");
        this.b = this.a.findPreference((CharSequence)"add_account");
        this.e = (ListPreference)this.findPreference((CharSequence)"refresh_rate");
        this.a();
        this.c();
        this.d = i.a((Context)this, this.c);
    }
    
    protected void onDestroy() {
        i.e((Context)this, this.c);
        final String a = i.a((Context)this, this.c);
        if ((a == null || this.d == null) && a != this.d) {
            this.f();
        }
        else if (a != null && this.d != null && !a.equals(this.d)) {
            this.f();
        }
        final Intent intent = new Intent((Context)this, (Class)TwitterWidgetProvider.class);
        intent.setAction(TwitterWidgetProvider.b);
        intent.putExtra("appWidgetId", this.c);
        if (this.f) {
            PollingService.a((Context)this, this.c);
            this.sendBroadcast(intent);
        }
        this.setResult(-1, intent);
        super.onDestroy();
    }
    
    protected void onUserLeaveHint() {
        this.finish();
    }
}
