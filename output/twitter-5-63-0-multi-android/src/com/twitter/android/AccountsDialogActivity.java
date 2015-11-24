// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.app.Activity;
import com.twitter.library.client.az;
import com.twitter.library.util.ar;
import android.widget.ListView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.os.Bundle;
import android.view.View;
import android.accounts.Account;
import android.accounts.AccountManager;
import com.twitter.android.client.c;
import com.twitter.library.platform.PushService;
import com.twitter.library.util.a;
import android.os.Parcelable;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.twitter.android.client.TwitterListActivity;

public class AccountsDialogActivity extends TwitterListActivity
{
    private Uri a;
    private k b;
    private boolean c;
    
    private void a(final Uri uri, final String s) {
        this.startActivity(new Intent((Context)this, (Class)MainActivity.class).putExtra("AbsFragmentActivity_account_name", s).putExtra("page", (Parcelable)uri).setFlags(67108864));
    }
    
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        switch (n) {
            default: {
                super.onActivityResult(n, n2, intent);
            }
            case 3: {
                if (-1 == n2) {
                    final Account a = com.twitter.library.util.a.a((Context)this, intent.getStringExtra("AbsFragmentActivity_account_name"));
                    if (PushService.c((Context)this) && a != null && PushService.c((Context)this, a)) {
                        com.twitter.android.client.c.a((Context)this).a(a, 1570997, false);
                    }
                    if (this.a != null) {
                        this.a(this.a, intent.getStringExtra("AbsFragmentActivity_account_name"));
                    }
                    if (this.c) {
                        this.setResult(1, new Intent().putExtra("account", (Parcelable)new UserAccount(a, com.twitter.library.util.a.a(AccountManager.get((Context)this), a))));
                    }
                }
                this.finish();
            }
        }
    }
    
    public void onClickHandler(final View view) {
        final int id = view.getId();
        if (id == 2131886225) {
            this.startActivityForResult(new Intent((Context)this, (Class)LoginActivity.class).putExtra("add_account", true).putExtra("authorize_account", this.c), 3);
        }
        else if (id == 2131886226) {
            this.startActivity(new Intent((Context)this, (Class)SettingsActivity.class));
            this.finish();
        }
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968579);
        final AccountManager value = AccountManager.get((Context)this);
        final Account[] a = com.twitter.library.util.a.a(value);
        final int length = a.length;
        final UserAccount[] array = new UserAccount[length];
        for (int i = 0; i < length; ++i) {
            array[i] = new UserAccount(a[i], com.twitter.library.util.a.a(value, a[i]));
        }
        final Intent intent = this.getIntent();
        this.c = intent.getBooleanExtra("authorize_account", false);
        this.a = (Uri)intent.getParcelableExtra("page");
        this.b = new k((Context)this, array, intent.getStringExtra("AccountsDialogActivity_account_name"));
        this.getListView().setAdapter((ListAdapter)this.b);
        final Button button = (Button)this.findViewById(2131886225);
        final Button button2 = (Button)this.findViewById(2131886226);
        if (length < 2 || this.c) {
            button2.setVisibility(8);
            button.setVisibility(0);
        }
        else {
            button2.setVisibility(0);
            button.setVisibility(8);
        }
        com.twitter.android.client.c.a((Context)this).c((Context)this);
    }
    
    protected void onListItemClick(final ListView listView, final View view, final int n, final long n2) {
        final UserAccount userAccount = (UserAccount)this.b.getItem(n);
        ar.a(this.getApplicationContext()).a();
        this.setResult(1, new Intent().putExtra("account", (Parcelable)userAccount));
        this.finish();
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        if (!az.a((Context)this).b().d()) {
            DispatchActivity.a((Activity)this);
        }
    }
}
