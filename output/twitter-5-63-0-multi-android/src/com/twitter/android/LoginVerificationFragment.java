// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Arrays;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import java.util.ArrayList;
import com.twitter.library.api.account.a;
import com.twitter.library.api.account.v;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.service.aa;
import com.twitter.library.widget.UserView;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.library.api.account.h;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.api.account.p;
import android.widget.ListAdapter;
import com.twitter.library.api.account.LoginVerificationRequest;
import android.widget.Toast;
import com.twitter.android.client.c;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.service.y;
import android.widget.ArrayAdapter;
import android.app.ProgressDialog;
import android.text.style.StyleSpan;
import com.twitter.library.client.Session;
import com.twitter.android.client.TwitterListFragment;

public class LoginVerificationFragment extends TwitterListFragment
{
    private Session a;
    private StyleSpan[] b;
    private kt c;
    private ProgressDialog d;
    private ArrayAdapter e;
    
    private static int a(final int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        return array[0];
    }
    
    private void b(final int[] array) {
        switch (a(array)) {
            default: {
                this.d(2131297212);
            }
            case 236: {
                PromptDialogFragment.b(1).c(2131297224).d(2131297223).i(17039370).a(this.getFragmentManager());
            }
            case 235:
            case 237: {
                this.d(2131297227);
            }
        }
    }
    
    private void d(final int n) {
        Toast.makeText(this.an, n, 1).show();
    }
    
    private void e(final String s) {
        if (this.e != this.c) {
            for (int i = 0; i < this.e.getCount(); ++i) {
                final LoginVerificationRequest loginVerificationRequest = (LoginVerificationRequest)this.e.getItem(i);
                if (s != null && loginVerificationRequest != null && s.equals(loginVerificationRequest.b)) {
                    this.e.remove((Object)loginVerificationRequest);
                    break;
                }
            }
            if (this.e.getCount() == 1) {
                this.e = this.c;
                this.Y().setAdapter((ListAdapter)this.e);
            }
        }
    }
    
    private void f(final String s) {
        if (com.twitter.library.api.account.p.g((Context)this.getActivity(), s)) {
            this.d(2131297212);
            return;
        }
        this.startActivity(new Intent((Context)this.getActivity(), (Class)SecuritySettingsActivity.class).putExtra("SecuritySettingsActivity_account_name", s));
    }
    
    private void r() {
        this.a(new h((Context)this.getActivity(), this.a), 1, 3);
    }
    
    View a(final ViewGroup viewGroup) {
        final View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2130968577, viewGroup, false);
        ((ImageView)inflate.findViewById(2131886223)).setVisibility(4);
        final UserView userView = (UserView)inflate;
        userView.setUser(this.a.f());
        userView.setVerified(false);
        userView.setProtected(false);
        return inflate;
    }
    
    @Override
    public void a(final int n, final y y) {
        final int a = ((aa)y.l().b()).f().a;
        final com.twitter.android.client.c aw = this.aw();
        switch (n) {
            default: {}
            case 1: {
                this.c(y.b);
                this.c_(y.R());
                TwitterScribeLog twitterScribeLog;
                if (a == 200) {
                    twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.a.g()).b(new String[] { "login_verification::get_requests::success" });
                }
                else {
                    twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.a.g()).b(new String[] { "login_verification::get_requests::failure" });
                }
                twitterScribeLog.d(String.valueOf(a));
                final h h = (h)y;
                final ArrayList b = h.b();
                if (a == 200 && b != null && !b.isEmpty()) {
                    twitterScribeLog.a((long)b.size());
                    b.add(0, LoginVerificationRequest.a);
                    this.e = new kw(this, this.an, 2130968860, 2131886911, b);
                }
                else {
                    twitterScribeLog.a(0L);
                    this.e = this.c;
                    if (a != 200) {
                        final int a2 = a(h.e());
                        if (a2 == 88) {
                            aw.a(this.a.g(), "login_verification::get_requests::rate_limit");
                        }
                        twitterScribeLog.c(String.valueOf(a2));
                        this.d(2131297212);
                    }
                }
                aw.a(twitterScribeLog);
                this.Y().setAdapter((ListAdapter)this.e);
            }
            case 2: {
                this.e();
                if (a == 200) {
                    aw.a(this.a.g(), "login_verification::request:reject:success");
                    this.d(2131297228);
                    this.e(((v)y).a.a);
                    return;
                }
                final int[] b2 = ((v)y).b();
                this.b(b2);
                final int a3 = a(b2);
                if (a3 == 88) {
                    aw.a(this.a.g(), "login_verification::request:reject:rate_limit");
                }
                aw.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.a.g()).b(new String[] { "login_verification::request:reject:failure" })).d(String.valueOf(a))).c(String.valueOf(a3)));
            }
            case 3: {
                this.e();
                if (a == 200) {
                    aw.a(this.a.g(), "login_verification::request:accept:success");
                    this.d(2131297226);
                    this.e(((a)y).a.a);
                    return;
                }
                final int[] b3 = ((a)y).b();
                this.b(b3);
                final int a4 = a(b3);
                if (a4 == 88) {
                    aw.a(this.a.g(), "login_verification::request:accept:rate_limit");
                }
                aw.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.a.g()).b(new String[] { "login_verification::request:accept:failure" })).d(String.valueOf(a))).c(String.valueOf(a4)));
            }
        }
    }
    
    void a(final String message) {
        final FragmentActivity activity = this.getActivity();
        if (activity != null) {
            (this.d = new ProgressDialog((Context)activity)).setProgressStyle(0);
            this.d.setMessage((CharSequence)message);
            this.d.setIndeterminate(true);
            this.d.setCancelable(false);
            this.d.show();
        }
    }
    
    @Override
    public void b(final int n, final y y) {
        super.b(n, y);
        switch (n) {
            default: {}
            case 1: {
                this.aw().a(this.a.g(), "login_verification::::get_newer");
            }
        }
    }
    
    void e() {
        if (this.d != null) {
            this.d.dismiss();
        }
    }
    
    @Override
    protected void i() {
        this.r();
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        this.c = new kt(this, (Context)this.getActivity(), 2130968859, 2131886911, new ArrayList((Collection<? extends E>)Arrays.asList(this.getString(2131297235), this.getString(2131297235))));
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setRetainInstance(true);
        final String string = this.getArguments().getString("lv_account_name");
        if (TextUtils.isEmpty((CharSequence)string)) {
            this.a = this.aF();
        }
        else {
            this.a = this.aE().b(string);
        }
        this.V = new ku(this, null);
        this.b = new StyleSpan[] { new StyleSpan(1), new StyleSpan(1), new StyleSpan(1) };
    }
    
    @Override
    public void onResume() {
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(this.a.g()).b(new String[] { "login_verification::::impression" });
        if (this.getActivity() != null && this.getActivity().getCallingActivity() != null && this.getActivity().getCallingActivity().getPackageName() != null && this.getActivity().getCallingActivity().getPackageName().contains(".twitter.")) {
            twitterScribeLog.g("settings");
        }
        else {
            twitterScribeLog.g("push");
        }
        this.aw().a(twitterScribeLog);
        super.onResume();
        this.r();
    }
}
