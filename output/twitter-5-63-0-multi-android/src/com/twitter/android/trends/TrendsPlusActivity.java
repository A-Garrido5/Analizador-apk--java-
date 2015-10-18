// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.trends;

import com.twitter.library.service.z;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.library.api.UserSettings;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.service.y;
import com.twitter.library.api.account.ab;
import com.twitter.android.client.c;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.DialogInterface;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.android.jy;
import android.content.Intent;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.view.View;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.library.client.Session;
import android.widget.TextView;
import com.twitter.ui.dialog.e;
import com.twitter.ui.dialog.b;
import android.view.View$OnClickListener;
import com.twitter.android.ListFragmentActivity;

public class TrendsPlusActivity extends ListFragmentActivity implements View$OnClickListener, b, e
{
    private final l a;
    private final f b;
    private TextView c;
    
    public TrendsPlusActivity() {
        this.a = new l(this, null);
        this.b = new f();
    }
    
    private void a(final ToolBar toolBar, final Session session) {
        toolBar.a(2131887479).b(com.twitter.android.trends.n.a(session));
    }
    
    protected int a(final ToolBar toolBar) {
        super.a(toolBar);
        final jx a = toolBar.a(2131887418);
        final boolean booleanExtra = this.getIntent().getBooleanExtra("expanded_search", true);
        final Session u = this.U();
        if (booleanExtra) {
            a.b(false);
            toolBar.setCustomView((View)this.c);
        }
        else {
            a.b(true);
            toolBar.setCustomView(null);
        }
        this.a(toolBar, u);
        return 1;
    }
    
    public bn a(final Bundle bundle, final bn bn) {
        super.a(bundle, bn);
        bn.e(true);
        return bn;
    }
    
    @Override
    protected jy a(final Intent intent, final bn bn) {
        final TrendsPlusFragment trendsPlusFragment = new TrendsPlusFragment();
        final Bundle arguments = new Bundle();
        if (intent != null) {
            arguments.putBoolean("show_header", intent.getBooleanExtra("show_header", true));
        }
        else {
            arguments.putBoolean("show_header", true);
        }
        arguments.putInt("type", 28);
        arguments.putString("timeline_tag", "TRENDSPLUS");
        arguments.putInt("empty_title", 2131297961);
        arguments.putInt("empty_desc", 2131297962);
        trendsPlusFragment.setArguments(arguments);
        return new jy(trendsPlusFragment);
    }
    
    @Override
    protected CharSequence a(final Intent intent) {
        if (intent != null && !intent.getBooleanExtra("show_header", true)) {
            return this.getResources().getString(2131297947);
        }
        return null;
    }
    
    public void a(final DialogInterface dialogInterface, final int n) {
        if (n == 1) {
            this.G().a(new TwitterScribeLog(this.U().g()).b("trendsplus", "search", "trends_dialog", "keep_tailored_trends", "click"));
        }
    }
    
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n == 1 && n2 == -1) {
            final c g = this.G();
            final Session u = this.U();
            this.startActivityForResult(new Intent((Context)this, (Class)TrendsLocationsActivity.class), 1);
            g.a(new TwitterScribeLog(u.g()).b("trendsplus", "search", "trends_dialog", "confirm_change_location", "click"));
        }
    }
    
    protected boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        this.K();
        if (this.U().d()) {
            jv.a(2131951659, toolBar);
        }
        return true;
    }
    
    public boolean a(final jx jx) {
        final int a = jx.a();
        if (a == 2131887479) {
            final c g = this.G();
            final Session u = this.U();
            final UserSettings j = u.j();
            if (j != null) {
                j.s = true;
                this.a(ab.a((Context)this, u, j, true, null));
            }
            jx.b(false);
            g.a(new TwitterScribeLog(u.g()).b("trendsplus", "search", "menu", "get_tailored_trends", "click"));
            return true;
        }
        if (a == 2131887478) {
            final Session u2 = this.U();
            final c g2 = this.G();
            final UserSettings i = u2.j();
            if (i != null && i.s) {
                ((PromptDialogFragment)PromptDialogFragment.b(1).c(2131297956).d(2131297955).h(2131297954).a((b)this).a((e)this)).a(this.getSupportFragmentManager());
            }
            else {
                this.startActivityForResult(new Intent((Context)this, (Class)TrendsLocationsActivity.class), 1);
            }
            g2.a(new TwitterScribeLog(u2.g()).b("trendsplus", "search", "menu", "change_location", "click"));
            return true;
        }
        return super.a(jx);
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        super.b(bundle, bn);
        (this.c = (TextView)LayoutInflater.from((Context)this).inflate(2130969096, (ViewGroup)null)).setOnClickListener((View$OnClickListener)this);
    }
    
    public TrendsPlusFragment h() {
        final Fragment fragmentById = this.getSupportFragmentManager().findFragmentById(2131886241);
        if (fragmentById instanceof TrendsPlusFragment) {
            return (TrendsPlusFragment)fragmentById;
        }
        return null;
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        super.onActivityResult(n, n2, intent);
        this.b.a(n, n2, intent, this.U(), (Context)this, this.M(), this.h());
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131887142) {
            this.D();
            this.H().b(this.c.getText());
        }
    }
    
    protected void onPause() {
        this.b(this.a);
        super.onPause();
    }
    
    protected void onResume() {
        super.onResume();
        this.a(this.a);
    }
}
