// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import android.support.v4.content.LocalBroadcastManager;
import android.content.IntentFilter;
import android.support.v4.app.Fragment;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeLog;
import android.app.Activity;
import com.twitter.android.client.bn;
import android.widget.Button;
import java.text.NumberFormat;
import com.twitter.android.client.c;
import android.os.Parcelable;
import com.twitter.android.client.TwitterListFragment;
import android.os.Bundle;
import android.content.Intent;
import android.content.BroadcastReceiver;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class FollowActivity extends TwitterFragmentActivity implements View$OnClickListener, yu, yw
{
    private FollowFlowController a;
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private UsersFragment f;
    private BroadcastReceiver g;
    
    public FollowActivity() {
        this.c = true;
        this.d = 0;
        this.e = -1;
    }
    
    private Bundle a(final Intent intent) {
        int n = 2131297004;
        final Bundle a = TwitterListFragment.a(intent, false);
        a.putBoolean("override_home", true);
        a.putBoolean("follow", true);
        a.putBoolean("user_checkbox", true);
        a.putParcelable("flow_controller", (Parcelable)this.a);
        a.putBoolean("show_follow_all_button", false);
        a.putBoolean("sync_follow_state", false);
        final boolean e = this.a.e();
        if (this.a.e("follow_friends")) {
            a.putBoolean("preselect_all", false);
            if (e) {
                n = 2131298200;
            }
            a.putString("check_all_header", this.getString(n));
            a.putBoolean("upload_contacts", this.b);
            a.putBoolean("refresh", false);
            a.putInt("type", 28);
            a.putInt("empty_desc", 2131296931);
            a.putBoolean("contacts_uploaded", intent.getBooleanExtra("use_cached_contacts", false));
        }
        else {
            if (this.a.e("follow_recommendations")) {
                a.putInt("follow_all_title", 2131297920);
                a.putInt("follow_all_subtitle", 2131298157);
                a.putInt("type", 19);
                a.putBoolean("refresh", true);
                return a;
            }
            if (this.a.e("follow_referral_campaign") && this.a.c() != null) {
                a.putInt("type", 4);
                a.putLong("tag", this.a.c().f());
                a.putString("check_all_header", this.getString(2131297012));
                a.putBoolean("preselect_all", true);
                a.putBoolean("refresh", false);
                return a;
            }
            if (this.a.e("follow_interest_suggestions")) {
                a.putInt("type", 32);
                a.putStringArray("multiple_categories", this.a.d());
                if (e) {
                    n = 2131298219;
                }
                a.putString("check_all_header", this.getString(n));
                a.putInt("limit", 40);
                a.putBoolean("preselect_all", true);
                a.putBoolean("refresh", false);
                return a;
            }
        }
        return a;
    }
    
    private UsersFragment a(final Bundle arguments) {
        final UsersFragment usersFragment = new UsersFragment();
        usersFragment.setArguments(arguments);
        usersFragment.a((yw)this);
        usersFragment.a((yu)this);
        return usersFragment;
    }
    
    private void h() {
        if (this.c) {
            if (this.e != -1 || this.f.K()) {
                this.setTitle(this.getString(2131297170, new Object[] { NumberFormat.getPercentInstance().format(this.i()) }));
                return;
            }
            this.setTitle(2131297168);
        }
        else {
            final boolean e = this.a.e();
            if (this.a.e("follow_friends")) {
                int title;
                if (e) {
                    title = 2131298201;
                }
                else {
                    title = 2131297011;
                }
                this.setTitle(title);
                return;
            }
            if (this.a.e("follow_recommendations")) {
                this.setTitle(2131298146);
                return;
            }
            if (this.a.e("follow_referral_campaign") && this.a.c() != null) {
                this.setTitle(this.a.c().b());
                return;
            }
            if (this.a.e("follow_interest_suggestions")) {
                String string;
                if (e) {
                    string = this.getString(2131298220);
                }
                else {
                    string = "";
                }
                this.setTitle(string);
            }
        }
    }
    
    private float i() {
        float n;
        if (this.e > 0 && !this.f.M()) {
            n = this.d / this.e;
        }
        else {
            n = 0.0f;
        }
        if (!this.f.K()) {
            return n;
        }
        final int i = this.f.I();
        return this.f.L() / i + n / i;
    }
    
    private boolean j() {
        return this.i() >= 1.0f;
    }
    
    private String k() {
        switch (this.f.u) {
            default: {
                return "";
            }
            case 7:
            case 28: {
                return "follow_friends";
            }
            case 17: {
                return "people";
            }
            case 19:
            case 27: {
                return "who_to_follow";
            }
            case 32: {
                return "follow_interest_suggestions";
            }
        }
    }
    
    public void T_() {
        int enabled = 1;
        final Button button = (Button)this.findViewById(2131886705);
        final int f = this.f.F();
        final Object[] array = new Object[enabled];
        array[0] = f;
        button.setText((CharSequence)this.getString(2131297010, array));
        if (f <= 0) {
            enabled = 0;
        }
        button.setEnabled((boolean)(enabled != 0));
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        Parcelable parcelable;
        if (bundle == null) {
            parcelable = intent.getParcelableExtra("flow_controller");
        }
        else {
            parcelable = bundle.getParcelable("flow_controller");
        }
        this.a = (FollowFlowController)parcelable;
        bn.a(false);
        bn.a(0);
        bn.c(2130968773);
        bn.b(10);
        if (this.a == null) {
            this.a = new FollowFlowController((String)null);
        }
        return bn;
    }
    
    public void a(final int n, final int n2, final int e) {
        if (e != -1) {
            this.e = e;
            if (n2 != -1) {
                ++this.d;
            }
        }
        if ((!this.f.K() && this.e == -1) || this.j()) {
            this.c = false;
        }
        this.h();
        this.Q();
        if (this.d == 1) {
            this.G().a(this.U().g(), this.a.f() + ":follow_friends:stream::results");
        }
        if (this.f.as() == 0 && this.a.e("follow_friends") && this.j()) {
            this.G().a(this.U().g(), this.a.f() + ":follow_friends:::no_results");
        }
    }
    
    public void a(final c c, final long n) {
        this.a.a(this);
        final String f = this.a.f();
        c.a(((TwitterScribeLog)new TwitterScribeLog(n).b(f, this.k(), "", "", "followable")).a((long)this.f.as()));
        c.a(((TwitterScribeLog)new TwitterScribeLog(n).b(f, this.k(), "", "", "resolved")).a((long)this.f.as()));
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        this.b = intent.getBooleanExtra("may_upload_contacts", false);
        final c g = this.G();
        UsersFragment a;
        if (bundle == null) {
            if (intent.getBooleanExtra("use_cached_contacts", false)) {
                g.a(this.U().g(), ":find_friends::notification:click");
                UsersFragment.a((Context)this);
                new FollowFlowController("notification").a(new String[] { "follow_friends" }).b(this);
                this.finish();
            }
            if (this.a.e("follow_referral_campaign")) {
                if (this.a.c() != null) {
                    g.a(this.U().g(), new String[] { this.a.f(), "follow_campaign:::impression" });
                }
                else {
                    this.a.a(this);
                    this.finish();
                }
            }
            if (this.a.e("follow_interest_suggestions")) {
                this.setTitle("");
            }
            a = this.a(this.a(intent));
            this.getSupportFragmentManager().beginTransaction().add(2131886241, a).commit();
        }
        else {
            a = (UsersFragment)this.getSupportFragmentManager().findFragmentById(2131886241);
            a.a((yw)this);
            a.a((yu)this);
            this.d = bundle.getInt("page_count");
            this.e = bundle.getInt("page_total");
            this.c = bundle.getBoolean("loading");
        }
        this.f = a;
        this.g = new hx(this, null);
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("registration_success_broadcast");
        if (this.b && !g.c()) {
            if (!g.d()) {
                cj.a("follow_friends", (Context)this).a();
                g.b(true);
            }
            intentFilter.addAction("upload_success_broadcast");
        }
        LocalBroadcastManager.getInstance((Context)this).registerReceiver(this.g, intentFilter);
        if (this.findViewById(2131886765) != null) {
            this.findViewById(2131886704).setOnClickListener((View$OnClickListener)this);
            final Button button = (Button)this.findViewById(2131886705);
            button.setText((CharSequence)this.getResources().getString(2131297010, new Object[] { this.f.F() }));
            button.setOnClickListener((View$OnClickListener)this);
            this.T_();
        }
    }
    
    @Override
    public void onBackPressed() {
        this.G().a(this.U().g(), this.a.f(), this.k(), "", "back_button:click");
        super.onBackPressed();
    }
    
    public void onClick(final View view) {
        final c g = this.G();
        final long g2 = this.U().g();
        if (view.getId() == 2131886705) {
            ((UsersFragment)this.getSupportFragmentManager().findFragmentById(2131886241)).b(true);
            g.a(((TwitterScribeLog)new TwitterScribeLog(g2).b(this.a.f(), this.k(), "", "", "remove")).a((long)(this.f.as() - this.f.F())));
            this.a.b(this.f.F());
        }
        else if (view.getId() == 2131886704) {
            g.a(g2, this.a.f(), this.k(), "", "", "skip");
        }
        this.a(g, g2);
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        LocalBroadcastManager.getInstance((Context)this).unregisterReceiver(this.g);
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("flow_controller", (Parcelable)this.a);
        bundle.putInt("page_count", this.d);
        bundle.putInt("page_total", this.e);
        bundle.putBoolean("loading", this.c);
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        FollowFlowController.d(this);
    }
    
    @Override
    protected void onStop() {
        if (this.isFinishing()) {
            FollowFlowController.d(this);
        }
        else {
            this.a.c(this);
        }
        super.onStop();
    }
}
