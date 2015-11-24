// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.LayoutInflater;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.cq;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.aq;
import android.view.View;
import com.twitter.android.widget.PromptDialogFragment;
import android.content.Intent;
import com.twitter.library.util.bq;
import com.twitter.refresh.widget.a;
import com.twitter.library.featureswitch.d;
import com.twitter.internal.android.widget.ToolBar;
import android.support.v4.app.FragmentActivity;
import android.view.ViewGroup;
import android.database.Cursor;
import android.support.v4.content.Loader;
import com.twitter.library.api.timeline.k;
import android.content.DialogInterface;
import android.widget.Toast;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.os.Bundle;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.api.timeline.v;
import com.twitter.android.widget.x;
import android.widget.FrameLayout;
import com.twitter.ui.dialog.e;
import android.view.View$OnClickListener;

public class CollectionPermalinkFragment extends TimelineFragment implements View$OnClickListener, e
{
    private FrameLayout k;
    private x l;
    
    private void a(final x x) {
        final v v = new v((Context)this.getActivity(), this.aF(), this.l.d);
        String s;
        int n;
        int n2;
        if (x.k) {
            s = "unfollow";
            n = 102;
            n2 = 1;
        }
        else {
            s = "follow";
            n = 101;
            n2 = 0;
        }
        v.g(n2);
        this.a(v, n, 0);
        this.aw().a(this.X, this.m(), null, null, "custom_timeline", s);
    }
    
    @Override
    public void a(final int n, final com.twitter.library.service.y y) {
        final aa aa = (aa)y.l().b();
        switch (n) {
            default: {
                super.a(n, y);
                if (y.R() == 3 && aa.a() && this.aD()) {
                    this.getLoaderManager().restartLoader(1, null, this);
                }
            }
            case 100: {
                this.c(y.b);
                if (!aa.a()) {
                    Toast.makeText(this.an, 2131296460, 1).show();
                    return;
                }
                this.getActivity().finish();
            }
            case 101:
            case 102: {
                this.c(y.b);
                if (!aa.a()) {
                    int n2;
                    if (n == 101) {
                        n2 = 2131296467;
                    }
                    else {
                        n2 = 2131296472;
                    }
                    Toast.makeText(this.an, n2, 1).show();
                    return;
                }
                this.l.a(this.aF().g());
            }
        }
    }
    
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n2 == -1) {
            switch (n) {
                case 1: {
                    this.a(new k((Context)this.getActivity(), this.aF(), this.l.d), 100, 0);
                    this.aw().a(this.X, this.m(), null, null, "custom_timeline", "delete");
                }
                case 2: {
                    this.a(this.l);
                }
            }
        }
    }
    
    @Override
    public void a(final Loader loader, final Cursor cursor) {
        switch (loader.getId()) {
            default: {
                super.a(loader, cursor);
                break;
            }
            case 1: {
                if (cursor != null && cursor.moveToFirst()) {
                    final FragmentActivity activity = this.getActivity();
                    final x l = this.l;
                    l.a((Context)activity, cursor);
                    l.a(this.aF().g());
                    this.aq().setTitle(l.e);
                    l.a((ViewGroup)this.k);
                    this.ar();
                    return;
                }
                break;
            }
        }
    }
    
    protected void a(final ToolBar toolBar) {
        boolean b = true;
        super.a(toolBar);
        toolBar.a(2131887461).b(this.l.d != null && b);
        if (this.X != this.l.g) {
            b = false;
        }
        if (com.twitter.library.featureswitch.d.f("custom_timelines_update_enabled")) {
            toolBar.a(2131887477).b(b);
        }
        if (com.twitter.library.featureswitch.d.f("custom_timelines_destroy_enabled")) {
            toolBar.a(2131887476).b(b);
        }
    }
    
    @Override
    protected void a(final a a, final boolean b) {
    }
    
    protected void a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        jv.a(2131951658, toolBar);
        if (com.twitter.library.featureswitch.d.f("custom_timelines_update_enabled")) {
            jv.a(2131951655, toolBar);
        }
        if (com.twitter.library.featureswitch.d.f("custom_timelines_destroy_enabled")) {
            jv.a(2131951654, toolBar);
        }
    }
    
    public boolean a(final jx jx) {
        final x l = this.l;
        switch (jx.a()) {
            default: {
                return super.a(jx);
            }
            case 2131887461: {
                bq.b((Context)this.getActivity(), l.h, l.i, l.e, l.f, l.j);
                this.aw().a(this.X, this.m(), null, null, "custom_timeline", "share");
                return true;
            }
            case 2131887477: {
                this.startActivity(new Intent((Context)this.getActivity(), (Class)CollectionCreateEditActivity.class).putExtra("timeline_id", l.d).putExtra("timeline_name", l.e).putExtra("timeline_description", l.f));
                return true;
            }
            case 2131887476: {
                PromptDialogFragment.b(1).d(2131296461).h(2131298158).j(2131296445).c(2131297480).a(this).a(this.getFragmentManager());
                return true;
            }
        }
    }
    
    public void onClick(final View view) {
        switch (view.getId()) {
            default: {}
            case 2131886393: {
                this.startActivity(new Intent((Context)this.getActivity(), (Class)ProfileActivity.class).putExtra("user_id", this.l.g));
            }
            case 2131886394: {
                this.a(this.l);
            }
            case 2131886395: {
                PromptDialogFragment.b(2).d(2131296473).h(2131298158).j(2131296445).a(this.l.e).a(this).a(this.getFragmentManager());
            }
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        if (bundle == null) {
            final Bundle arguments = this.getArguments();
            arguments.putInt("empty_title", 2131296465);
            arguments.putInt("empty_desc", 2131296471);
        }
        super.onCreate(bundle);
        this.j(true);
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        switch (n) {
            default: {
                return super.onCreateLoader(n, bundle);
            }
            case 1: {
                return new CursorLoader((Context)this.getActivity(), com.twitter.library.provider.ae.a(com.twitter.library.provider.aq.a, this.X), cq.a, "ev_id=?", new String[] { this.a }, null);
            }
        }
    }
    
    public void onLoaderReset(final Loader loader) {
        switch (loader.getId()) {
            default: {
                super.onLoaderReset(loader);
            }
            case 1: {}
        }
    }
    
    @Override
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        final FragmentActivity activity = this.getActivity();
        this.k = new FrameLayout((Context)activity);
        this.Y().addHeaderView((View)this.k);
        final x l = new x(LayoutInflater.from((Context)activity).inflate(2130968644, (ViewGroup)null));
        l.a.setOnClickListener((View$OnClickListener)this);
        l.b.setOnClickListener((View$OnClickListener)this);
        l.c.setOnClickListener((View$OnClickListener)this);
        this.l = l;
    }
    
    protected void q() {
        super.q();
        this.getLoaderManager().initLoader(1, null, this);
    }
    
    @Override
    protected boolean r() {
        return ((xc)this.W).isEmpty() || !this.b;
    }
    
    @Override
    protected int s() {
        if (((xc)this.W).isEmpty()) {
            return 3;
        }
        return 4;
    }
}
