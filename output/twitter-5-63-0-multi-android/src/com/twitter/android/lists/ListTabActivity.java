// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.lists;

import android.support.v4.app.FragmentActivity;
import com.twitter.android.UsersFragment;
import com.twitter.android.TimelineFragment;
import com.twitter.android.hz;
import com.twitter.library.provider.aq;
import android.text.TextUtils;
import com.twitter.android.widget.PromptDialogFragment;
import android.content.Intent;
import com.twitter.android.ListCreateEditActivity;
import android.content.DialogInterface;
import com.twitter.library.api.be;
import com.twitter.library.util.bq;
import android.content.Context;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.service.y;
import android.widget.ProgressBar;
import com.twitter.internal.android.widget.DockLayout;
import com.twitter.android.client.c;
import com.twitter.library.client.Session;
import android.widget.RadioGroup;
import com.twitter.android.ia;
import com.twitter.ui.dialog.e;
import android.widget.RadioGroup$OnCheckedChangeListener;
import com.twitter.android.client.TwitterFragmentActivity;

public class ListTabActivity extends TwitterFragmentActivity implements RadioGroup$OnCheckedChangeListener, e
{
    public static final String[] a;
    long b;
    long c;
    String d;
    String e;
    long f;
    String g;
    int h;
    String i;
    String j;
    String k;
    int l;
    ia m;
    int n;
    private a o;
    private RadioGroup p;
    
    static {
        a = new String[] { "ev_content" };
    }
    
    public ListTabActivity() {
        this.h = 0;
    }
    
    private void a(final String s) {
        this.m.a(s);
        final c g = this.G();
        if (s.equals("list_tweets")) {
            g.a(this.U().g(), "list:tweets:::impression");
            this.H().b("tweets");
        }
        else if (s.equals("list_members")) {
            g.a(this.U().g(), "list:members:::impression");
            this.H().b("members");
        }
    }
    
    private void a(final boolean b) {
        final DockLayout dockLayout = (DockLayout)this.findViewById(2131886401);
        final ProgressBar progressBar = (ProgressBar)this.findViewById(2131886400);
        if (b) {
            dockLayout.setVisibility(8);
            progressBar.setVisibility(0);
            return;
        }
        dockLayout.setVisibility(0);
        progressBar.setVisibility(8);
    }
    
    public int a(final ToolBar toolBar) {
        super.a(toolBar);
        final boolean b = this.c == this.U().g();
        toolBar.a(2131887442).b(b);
        toolBar.a(2131887443).b(b);
        toolBar.a(2131887444).b(!b && this.h == 2);
        toolBar.a(2131887445).b(!b && this.h == 1);
        final jx a = toolBar.a(2131887461);
        final int l = this.l;
        boolean b2 = false;
        if (l == 0) {
            b2 = true;
        }
        a.b(b2);
        return 1;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        super.a(bundle, bn);
        bn.d(false);
        bn.c(2130968846);
        return bn;
    }
    
    public void a(final int n, final y y) {
        final aa aa = (aa)y.l().b();
        switch (n) {
            case 1: {
                if (!aa.a()) {
                    Toast.makeText((Context)this, 2131297151, 1).show();
                    return;
                }
            }
            case 2: {
                if (this.f(y.b)) {
                    int n2;
                    if (aa.c() == 200) {
                        this.h = 1;
                        n2 = 2131297161;
                        this.G().a(this.U().g(), "list::::subscribe");
                    }
                    else {
                        n2 = 2131297147;
                    }
                    this.Q();
                    Toast.makeText((Context)this, n2, 1).show();
                    return;
                }
                break;
            }
            case 3: {
                if (this.f(y.b)) {
                    int n3;
                    if (aa.c() == 200) {
                        this.h = 2;
                        n3 = 2131297163;
                        this.G().a(this.U().g(), "list::::unsubscribe");
                    }
                    else {
                        n3 = 2131297160;
                    }
                    this.Q();
                    Toast.makeText((Context)this, n3, 1).show();
                    return;
                }
                break;
            }
            case 4: {
                if (aa.c() == 200 || aa.c() == 404) {
                    this.h();
                    return;
                }
                break;
            }
            case 5: {
                this.a(false);
                final be a = ((ni)y).a;
                if (aa.a()) {
                    this.c = a.h.a();
                    this.b = a.a();
                    this.j = a.d;
                    this.d = a.h.username;
                    this.e = a.h.c();
                    this.g = a.a;
                    this.k = a.c;
                    if (this.n == 1) {
                        bq.a((Context)this, this.e, this.d, this.j, this.g, this.k);
                        this.G().a(y.P().c, "list::list::share");
                        return;
                    }
                    this.i();
                    if (this.g != null) {
                        this.setTitle(this.g);
                        return;
                    }
                    break;
                }
                else {
                    if (aa.c() == 404) {
                        Toast.makeText((Context)this, 2131297139, 1).show();
                        this.finish();
                        return;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n == 1 && n2 == -1) {
            final Session b = this.T().b();
            this.a(new nc(this.getApplicationContext(), b, this.b, b.g()), 1);
            this.G().a(this.U().g(), "me:lists:list::delete");
            this.finish();
        }
    }
    
    public boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        jv.a(2131951637, toolBar);
        jv.a(2131951658, toolBar);
        return true;
    }
    
    @Override
    public boolean a(final jx jx) {
        final int a = jx.a();
        if (a == 2131887442) {
            final Intent intent = this.getIntent();
            final Intent intent2 = new Intent((Context)this, (Class)ListCreateEditActivity.class);
            intent2.putExtra("list_id", this.b);
            intent2.putExtra("name", intent.getStringExtra("list_name"));
            intent2.putExtra("description", intent.getStringExtra("list_description"));
            intent2.putExtra("full_name", intent.getStringExtra("list_fullname"));
            intent2.putExtra("mode", intent.getIntExtra("list_mode", 0));
            this.startActivityForResult(intent2, 1);
            return true;
        }
        if (a == 2131887443) {
            PromptDialogFragment.b(1).c(2131297152).d(2131297153).h(2131298158).j(2131297303).a(this.getSupportFragmentManager());
            return true;
        }
        if (a == 2131887445) {
            this.a(new nh(this.getApplicationContext(), this.U(), this.f, this.U().g(), this.b, 5), 3);
        }
        else if (a == 2131887444) {
            this.a(new na(this.getApplicationContext(), this.U(), this.f, this.U().g(), this.b, 5), 2);
        }
        else if (a == 2131887461) {
            if (!TextUtils.isEmpty((CharSequence)this.d) && !TextUtils.isEmpty((CharSequence)this.j) && !TextUtils.isEmpty((CharSequence)this.e)) {
                bq.a((Context)this, this.d, this.d, this.j, this.g, this.k);
                this.G().a(this.U().g(), "list::list::share");
            }
            else {
                this.n = 1;
                this.a(new ni((Context)this, this.U(), this.b, this.d, this.j), 5);
            }
        }
        return super.a(jx);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final Intent intent = this.getIntent();
        this.o = new a(this, (Context)this);
        this.f = intent.getLongExtra("owner_id", 0L);
        this.e = intent.getStringExtra("creator_full_name");
        this.l = intent.getIntExtra("list_mode", 0);
        this.d = intent.getStringExtra("screen_name");
        this.j = intent.getStringExtra("slug");
        if (bundle != null) {
            this.i = bundle.getString("state_cur_tag");
        }
        this.c = intent.getLongExtra("creator_id", 0L);
        this.b = intent.getLongExtra("list_id", -1L);
        if ((this.b <= 0L || this.c <= 0L) && !TextUtils.isEmpty((CharSequence)this.d) && !TextUtils.isEmpty((CharSequence)this.j)) {
            this.a(new ni((Context)this, this.U(), this.b, this.d, this.j), 5);
        }
        else {
            this.i();
        }
        this.g = intent.getStringExtra("list_name");
        if (this.g != null) {
            this.setTitle(this.g);
        }
        this.H().a("list");
    }
    
    void h() {
        this.o.startQuery(2, (Object)null, aq.b.buildUpon().appendEncodedPath(String.valueOf(this.b)).appendQueryParameter("ownerId", String.valueOf(this.U().g())).build(), ListTabActivity.a, "list_mapping_user_id=?", new String[] { Long.toString(this.f) }, (String)null);
    }
    
    void i() {
        final Intent intent = this.getIntent();
        if (this.m == null) {
            final hz[] array = new hz[2];
            final Bundle bundle = new Bundle();
            bundle.putInt("type", 9);
            bundle.putLong("owner_id", this.c);
            bundle.putLong("tag", this.b);
            bundle.putInt("shim_size", this.getResources().getDimensionPixelSize(2131558806));
            array[0] = new hz(bundle, TimelineFragment.class, "list_tweets");
            final Bundle bundle2 = new Bundle();
            bundle2.putInt("type", intent.getIntExtra("type", 4));
            bundle2.putLong("owner_id", this.c);
            bundle2.putLong("tag", this.b);
            bundle2.putBoolean("follow", intent.getBooleanExtra("follow", false));
            bundle2.putInt("shim_size", this.getResources().getDimensionPixelSize(2131558806));
            array[1] = new hz(bundle2, UsersFragment.class, "list_members");
            this.m = new ia(this, 2131886241, array);
            (this.p = (RadioGroup)this.findViewById(2131886402)).setOnCheckedChangeListener((RadioGroup$OnCheckedChangeListener)this);
        }
        if (this.i != null) {
            this.a(this.i);
        }
        else if (intent.hasExtra("tab")) {
            this.a(intent.getStringExtra("tab"));
        }
        else {
            this.a("list_tweets");
        }
        this.e();
        if (this.b > 0L && this.f > 0L) {
            this.o.startQuery(1, (Object)null, aq.b.buildUpon().appendEncodedPath(String.valueOf(this.b)).appendQueryParameter("ownerId", String.valueOf(this.U().g())).build(), ListTabActivity.a, "list_mapping_user_id=?", new String[] { Long.toString(this.f) }, (String)null);
        }
        else if (this.b <= 0L || this.c <= 0L) {
            Toast.makeText((Context)this, 2131297158, 1).show();
        }
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        if (n2 == 0) {
            return;
        }
        switch (n) {
            default: {}
            case 1: {
                final Intent intent2 = this.getIntent();
                final String stringExtra = intent.getStringExtra("name");
                intent2.putExtra("list_name", stringExtra);
                intent2.putExtra("list_description", intent.getStringExtra("description"));
                intent2.putExtra("list_fullname", intent.getStringExtra("full_name"));
                intent2.putExtra("list_mode", intent.getIntExtra("mode", 0));
                this.setTitle(stringExtra);
            }
        }
    }
    
    public void onCheckedChanged(final RadioGroup radioGroup, final int n) {
        final c g = this.G();
        if (n == 2131886892) {
            this.m.a(0);
            g.a(this.U().g(), "list:tweets:::impression");
            this.H().b("tweets");
        }
        else if (n == 2131886893) {
            this.m.a(1);
            g.a(this.U().g(), "list:members:::impression");
            this.H().b("members");
        }
    }
    
    @Override
    protected void onResume() {
        if (this.U().d() && this.f > 0L && this.b > 0L) {
            final boolean v = this.V();
            super.onResume();
            if (v && !this.V()) {
                this.h = 0;
                this.h();
            }
            return;
        }
        super.onResume();
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.m != null) {
            bundle.putString("state_cur_tag", this.m.a());
        }
    }
}
