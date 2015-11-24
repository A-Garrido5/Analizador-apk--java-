// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Handler;
import android.accounts.AccountManager;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import com.twitter.library.util.a;
import java.util.ArrayList;
import android.accounts.Account;
import com.twitter.android.client.WidgetControl;
import com.twitter.android.client.cj;
import android.content.Intent;
import android.widget.RemoteViews;
import com.twitter.library.provider.k;
import com.twitter.library.client.az;
import android.text.TextUtils;
import android.content.Context;
import android.appwidget.AppWidgetManager;
import android.preference.ListPreference;
import com.twitter.android.widget.RadioButtonPreference;
import android.view.View$OnClickListener;
import android.preference.Preference$OnPreferenceChangeListener;
import android.accounts.OnAccountsUpdateListener;
import com.twitter.android.client.TwitterPreferenceActivity;

public class WidgetSettingsActivity extends TwitterPreferenceActivity implements OnAccountsUpdateListener, Preference$OnPreferenceChangeListener, View$OnClickListener
{
    private int a;
    private String b;
    private int c;
    private RadioButtonPreference d;
    private RadioButtonPreference e;
    
    public WidgetSettingsActivity() {
        this.a = 0;
        this.b = "";
        this.c = 0;
    }
    
    private static void a(final ListPreference listPreference, final String s) {
        final CharSequence[] entries = listPreference.getEntries();
        final int indexOfValue = listPreference.findIndexOfValue(s);
        if (indexOfValue != -1) {
            listPreference.setTitle(entries[indexOfValue]);
        }
    }
    
    private void b() {
        final AppWidgetManager instance = AppWidgetManager.getInstance((Context)this);
        final int initialLayout = instance.getAppWidgetInfo(this.a).initialLayout;
        int n;
        int n2;
        if (initialLayout == 2130969208) {
            n = 2131165190;
            n2 = 0;
        }
        else {
            n2 = 1;
            n = 2131165189;
        }
        if (TextUtils.isEmpty((CharSequence)this.b)) {
            this.b = az.a((Context)this).b().e();
        }
        final String b = this.b;
        k.a((Context)this).a(this.a, n2, b, this.c);
        instance.updateAppWidget(this.a, new RemoteViews(this.getPackageName(), initialLayout));
        final Intent intent = new Intent();
        intent.putExtra("appWidgetId", this.a);
        this.setResult(-1, intent);
        if (!TextUtils.isEmpty((CharSequence)b)) {
            cj.a((Context)this).a(az.a((Context)this).b(b), false);
        }
        else {
            WidgetControl.a((Context)this, n);
        }
        this.finish();
    }
    
    public void onAccountsUpdated(final Account[] array) {
        if (array != null && array.length != 0 && this.getPreferenceScreen() != null) {
            this.b = az.a((Context)this).b().e();
            final ArrayList<String> list = new ArrayList<String>();
            final int length = array.length;
            int i = 0;
            int valueIndex = -1;
            while (i < length) {
                final Account account = array[i];
                if (com.twitter.library.util.a.a.equals(account.type)) {
                    list.add(account.name);
                    if (valueIndex == -1 && account.name.equals(this.b)) {
                        valueIndex = -1 + list.size();
                    }
                }
                ++i;
            }
            final int size = list.size();
            if (size > 1 && valueIndex >= 0) {
                final ListPreference listPreference = new ListPreference((Context)this);
                listPreference.setKey("widget_account");
                listPreference.setDialogTitle(2131297787);
                listPreference.setPersistent(false);
                final CharSequence[] array2 = new CharSequence[size];
                list.toArray(array2);
                listPreference.setEntries(array2);
                listPreference.setEntryValues(array2);
                listPreference.setValueIndex(valueIndex);
                listPreference.setTitle((CharSequence)this.b);
                listPreference.setSummary((CharSequence)null);
                listPreference.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
                final PreferenceCategory preferenceCategory = new PreferenceCategory((Context)this);
                preferenceCategory.setTitle(2131297787);
                preferenceCategory.setOrder(0);
                this.getPreferenceScreen().addPreference((Preference)preferenceCategory);
                preferenceCategory.addPreference((Preference)listPreference);
            }
        }
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131886249) {
            this.b();
        }
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        if (this.getIntent().hasExtra(":android:show_fragment")) {
            throw new IllegalArgumentException("Invalid fragment for this activity.");
        }
        super.onCreate(bundle);
        this.setContentView(2130969213);
        this.setResult(0);
        final Bundle extras = this.getIntent().getExtras();
        if (extras != null) {
            this.a = extras.getInt("appWidgetId", 0);
        }
        if (this.a == 0) {
            this.finish();
        }
        if (!az.a((Context)this).b().d()) {
            this.b();
        }
        else {
            this.addPreferencesFromResource(2131165213);
            final RadioButtonPreference d = (RadioButtonPreference)this.findPreference((CharSequence)"widget_content_tweets");
            d.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
            this.d = d;
            final RadioButtonPreference e = (RadioButtonPreference)this.findPreference((CharSequence)"widget_content_mentions");
            e.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
            this.e = e;
            ((Button)this.findViewById(2131886249)).setOnClickListener((View$OnClickListener)this);
        }
        AccountManager.get((Context)this).addOnAccountsUpdatedListener((OnAccountsUpdateListener)this, (Handler)null, true);
    }
    
    protected void onDestroy() {
        super.onDestroy();
        AccountManager.get((Context)this).removeOnAccountsUpdatedListener((OnAccountsUpdateListener)this);
    }
    
    public boolean onPreferenceChange(final Preference preference, final Object o) {
        final String key = preference.getKey();
        if ("widget_account".equals(key)) {
            this.b = (String)o;
            a((ListPreference)preference, this.b);
            return true;
        }
        if ("widget_content_tweets".equals(key)) {
            this.c = 0;
            this.e.setChecked(false);
            return true;
        }
        if ("widget_content_mentions".equals(key)) {
            this.c = 1;
            this.d.setChecked(false);
            return true;
        }
        return false;
    }
    
    public boolean onSearchRequested() {
        return false;
    }
}
