// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.library.client.Session;
import android.support.v4.app.FragmentActivity;
import android.os.Handler;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import java.util.Comparator;
import java.util.Arrays;
import android.content.Context;
import android.accounts.AccountManager;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.az;
import com.twitter.android.util.a;
import android.accounts.Account;
import com.twitter.library.widget.UserView;
import com.twitter.android.client.c;
import android.view.View$OnClickListener;
import android.accounts.OnAccountsUpdateListener;
import android.support.v4.app.Fragment;

public class AuthorizeAppFragment extends Fragment implements OnAccountsUpdateListener, View$OnClickListener
{
    private c a;
    private al b;
    private UserAccount c;
    private UserView d;
    private CharSequence e;
    private CharSequence f;
    private Account[] g;
    private a h;
    private az i;
    
    private void a(final String s) {
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.i.b().g()).b(new String[] { "sso_sdk:::", s });
        if (this.f != null) {
            twitterScribeLog.a(String.valueOf(5), this.f.toString());
        }
        this.a.a(twitterScribeLog);
    }
    
    public void a(final UserAccount c) {
        if (c != null) {
            this.d.setUser(c.b);
        }
        this.c = c;
    }
    
    public void a(final al b) {
        this.b = b;
    }
    
    public void onAccountsUpdated(final Account[] array) {
        final AccountManager value = AccountManager.get((Context)this.getActivity());
        final Account[] a = com.twitter.library.util.a.a(value);
        Arrays.sort(a, this.h);
        if (!Arrays.equals(a, this.g)) {
            if (a.length != 0) {
                final UserAccount c = this.c;
                while (true) {
                    for (final Account account : a) {
                        if (c == null || !account.equals((Object)c.a)) {
                            if (account != null) {
                                this.a(new UserAccount(account, com.twitter.library.util.a.a(value, account)));
                            }
                            this.g = a;
                            return;
                        }
                    }
                    Account account = null;
                    continue;
                }
            }
            this.a((UserAccount)null);
        }
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.c != null) {
            this.a(this.c);
        }
    }
    
    @Override
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        if (n2 == 1) {
            this.a((UserAccount)intent.getParcelableExtra("account"));
        }
    }
    
    public void onClick(final View view) {
        final int id = view.getId();
        if (id == 2131886289 || id == 2131886287) {
            this.startActivityForResult(new Intent((Context)this.getActivity(), (Class)AccountsDialogActivity.class).putExtra("authorize_account", true), 2);
        }
        else if (id == 2131886294) {
            if (this.b != null && this.c != null) {
                this.b.a(this.c.a);
                view.setEnabled(false);
                ((Button)view).setText(2131296355);
                this.a("success");
            }
        }
        else if (id == 2131886293 && this.b != null) {
            this.b.b();
            this.a("cancel");
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final FragmentActivity activity = this.getActivity();
        final c a = com.twitter.android.client.c.a((Context)activity);
        final az a2 = az.a((Context)activity);
        final Session b = a2.b();
        if (b.d()) {
            this.c = new UserAccount(com.twitter.library.util.a.a((Context)activity, b.e()), b.f());
        }
        this.a = a;
        this.i = a2;
        final Bundle arguments = this.getArguments();
        if (arguments != null) {
            this.e = arguments.getCharSequence("app_name");
            this.f = arguments.getCharSequence("app_consumer_key");
        }
        if (bundle != null) {
            if (this.e == null) {
                this.e = bundle.getCharSequence("app_name");
            }
            if (this.f == null) {
                this.f = bundle.getCharSequence("app_consumer_key");
            }
        }
        final AccountManager value = AccountManager.get((Context)activity);
        this.g = com.twitter.library.util.a.a(value);
        this.h = new a();
        Arrays.sort(this.g, this.h);
        value.addOnAccountsUpdatedListener((OnAccountsUpdateListener)this, (Handler)null, false);
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return layoutInflater.inflate(2130968600, viewGroup, false);
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        AccountManager.get((Context)this.getActivity()).removeOnAccountsUpdatedListener((OnAccountsUpdateListener)this);
    }
    
    @Override
    public void onResume() {
        super.onResume();
        this.a("impression");
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.e != null) {
            bundle.putCharSequence("app_name", this.e);
        }
        if (this.f != null) {
            bundle.putCharSequence("app_consumer_key", this.f);
        }
    }
    
    @Override
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((Button)view.findViewById(2131886294)).setOnClickListener((View$OnClickListener)this);
        ((Button)view.findViewById(2131886293)).setOnClickListener((View$OnClickListener)this);
        if (this.e != null) {
            ((TextView)view.findViewById(2131886291)).setText((CharSequence)this.getString(2131296365, this.e));
            ((TextView)view.findViewById(2131886292)).setText((CharSequence)this.getString(2131296364, this.e));
        }
        this.d = (UserView)view.findViewById(2131886288);
        this.d.getChildAt(0).setOnClickListener((View$OnClickListener)this);
        view.findViewById(2131886287).setOnClickListener((View$OnClickListener)this);
    }
}
