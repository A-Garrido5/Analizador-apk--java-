// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.az;
import android.os.Handler;
import android.app.AlertDialog;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import com.twitter.library.client.k;
import android.preference.Preference$OnPreferenceClickListener;
import android.os.Bundle;
import com.twitter.library.platform.PushService;
import android.preference.PreferenceScreen;
import android.accounts.AccountManager;
import android.preference.Preference;
import com.twitter.library.util.a;
import android.accounts.Account;
import android.content.Context;
import com.twitter.library.widget.StatusToolBar;
import com.twitter.internal.android.widget.ToolBar;
import android.content.Intent;
import com.twitter.library.client.App;
import android.accounts.OnAccountsUpdateListener;

public class SettingsActivity extends DebugSettingsActivity implements OnAccountsUpdateListener
{
    private String a;
    
    private void d() {
        if (App.f()) {
            final Intent intent = this.getIntent();
            final String stringExtra = intent.getStringExtra("scribe");
            if (stringExtra != null) {
                this.a = stringExtra;
                intent.removeExtra("scribe");
                this.showDialog(1);
            }
        }
    }
    
    private boolean e() {
        final Intent intent = this.getIntent();
        return intent != null && intent.hasCategory("android.intent.category.NOTIFICATION_PREFERENCES");
    }
    
    protected boolean a(final ToolBar toolBar) {
        if (toolBar instanceof StatusToolBar) {
            ((StatusToolBar)toolBar).setDisplayShowStatusBarEnabled(false);
        }
        return super.a(toolBar);
    }
    
    public void finish() {
        if (this.e()) {
            this.startActivity(new Intent((Context)this, (Class)MainActivity.class));
        }
        super.finish();
    }
    
    public void onAccountsUpdated(final Account[] array) {
        final PreferenceScreen preferenceScreen = this.getPreferenceScreen();
        for (int i = -1 + preferenceScreen.getPreferenceCount(); i >= 0; --i) {
            final Preference preference = preferenceScreen.getPreference(i);
            if (preference.getTitle().toString().startsWith("@")) {
                preferenceScreen.removePreference(preference);
            }
        }
        int order = 1;
        int n;
        for (int length = array.length, j = 0; j < length; ++j, order = n) {
            final Account account = array[j];
            if (com.twitter.library.util.a.a.equals(account.type)) {
                final Preference preference2 = new Preference((Context)this);
                preference2.setTitle((CharSequence)("@" + account.name));
                n = order + 1;
                preference2.setOrder(order);
                preference2.setIntent(new Intent((Context)this, (Class)AccountSettingsActivity.class).putExtra("AccountSettingsActivity_account_name", account.name).putExtra("account_id", com.twitter.library.util.a.a(AccountManager.get((Context)this), account).a()));
                preferenceScreen.addPreference(preference2);
            }
            else {
                n = order;
            }
        }
    }
    
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        if (n == 1 && n2 == -1 && PushService.c((Context)this)) {
            final Account a = com.twitter.library.util.a.a((Context)this, intent.getStringExtra("AbsFragmentActivity_account_name"));
            if (PushService.c((Context)this, a)) {
                this.Y.a(a, 1570997);
            }
        }
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getString("scribe");
        }
        this.addPreferencesFromResource(2131165203);
        this.findPreference((CharSequence)"add_account").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        final Preference preference = this.findPreference((CharSequence)"about");
        preference.setTitle((CharSequence)AboutActivity.a((Context)this));
        preference.setIntent(new Intent((Context)this, (Class)AboutActivity.class));
        if (App.f()) {
            this.b();
            this.c();
        }
        if (new k((Context)this, this.m().e(), "settings").getBoolean("developer_settings_enabled", false) | App.f()) {
            this.addPreferencesFromResource(2131165194);
            this.findPreference((CharSequence)"pref_developer").setOrder(1004);
            this.findPreference((CharSequence)"pref_developer_start_card_previewer").setOnPreferenceClickListener((Preference$OnPreferenceClickListener)this);
        }
        this.d();
    }
    
    protected Dialog onCreateDialog(final int n) {
        if (n == 1) {
            return (Dialog)new AlertDialog$Builder((Context)this).setMessage((CharSequence)"").setNegativeButton(2131297362, (DialogInterface$OnClickListener)new sj(this)).create();
        }
        return null;
    }
    
    protected void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.setIntent(intent);
        this.d();
    }
    
    protected void onPause() {
        super.onPause();
        AccountManager.get((Context)this).removeOnAccountsUpdatedListener((OnAccountsUpdateListener)this);
    }
    
    @Override
    public boolean onPreferenceClick(final Preference preference) {
        if ("add_account".equals(preference.getKey())) {
            this.startActivityForResult(new Intent((Context)this, (Class)LoginActivity.class).putExtra("add_account", true), 1);
            return true;
        }
        return super.onPreferenceClick(preference);
    }
    
    protected void onPrepareDialog(final int n, final Dialog dialog) {
        super.onPrepareDialog(n, dialog);
        if (n == 1) {
            ((AlertDialog)dialog).setMessage((CharSequence)this.a);
        }
    }
    
    protected void onResume() {
        super.onResume();
        AccountManager.get((Context)this).addOnAccountsUpdatedListener((OnAccountsUpdateListener)this, (Handler)null, true);
        if (!az.a((Context)this).b().d()) {
            this.getPreferenceScreen().setEnabled(false);
            this.finish();
            return;
        }
        this.getPreferenceScreen().setEnabled(true);
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("scribe", this.a);
    }
    
    public boolean onSearchRequested() {
        return false;
    }
}
