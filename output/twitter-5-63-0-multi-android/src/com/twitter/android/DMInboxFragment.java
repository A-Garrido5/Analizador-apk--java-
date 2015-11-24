// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.res.Resources;
import java.util.ArrayList;
import android.widget.AdapterView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v4.content.CursorLoader;
import com.twitter.android.provider.l;
import com.twitter.android.provider.SuggestionsProvider;
import com.twitter.library.provider.ae;
import android.widget.ListAdapter;
import com.twitter.library.api.conversations.au;
import com.twitter.library.api.conversations.ai;
import com.twitter.util.collection.CollectionUtils;
import android.app.Activity;
import com.twitter.internal.android.widget.ToolBar;
import android.support.v4.app.FragmentActivity;
import android.annotation.TargetApi;
import com.twitter.library.api.conversations.bj;
import android.support.v4.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.content.Intent;
import android.content.DialogInterface;
import com.twitter.library.api.conversations.z;
import android.widget.Toast;
import com.twitter.library.service.aa;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.api.conversations.ak;
import com.twitter.android.util.al;
import android.view.View;
import com.twitter.android.util.ap;
import android.content.Context;
import com.twitter.library.util.n;
import com.twitter.library.client.Session;
import com.twitter.android.client.c;
import com.twitter.library.service.y;
import com.twitter.ui.widget.PromptView;
import android.widget.ListView;
import android.widget.AdapterView$OnItemClickListener;
import com.twitter.ui.widget.q;
import com.twitter.ui.dialog.e;
import com.twitter.android.autocomplete.a;
import android.widget.AdapterView$OnItemLongClickListener;
import android.view.View$OnClickListener;
import com.twitter.android.client.TwitterListFragment;

public class DMInboxFragment extends TwitterListFragment implements View$OnClickListener, AdapterView$OnItemLongClickListener, a, pz, e, q
{
    ct a;
    String b;
    boolean c;
    private final AdapterView$OnItemClickListener d;
    private ListView e;
    private boolean f;
    private PromptView g;
    private boolean h;
    
    public DMInboxFragment() {
        this.d = (AdapterView$OnItemClickListener)new dw(this);
        this.f = true;
    }
    
    private void b(final boolean f) {
        this.f = f;
        this.ar();
    }
    
    private void e() {
        final View view = this.getView();
        final PromptView g = this.g;
        final View viewById = view.findViewById(2131886634);
        if (!this.a.isEmpty()) {
            viewById.setVisibility(0);
            g.setButtonText(null);
            g.setTitle(2131296831);
            return;
        }
        viewById.setVisibility(8);
        g.setButtonText(2131296998);
        if (com.twitter.library.util.n.a((Context)this.getActivity()).b()) {
            g.setTitle(2131296834);
            return;
        }
        final com.twitter.android.util.al a = ap.a((Context)this.getActivity());
        if (a.e() || a.c()) {
            g.setTitle(2131296833);
            return;
        }
        g.setTitle(2131296832);
    }
    
    public void A() {
        int n;
        if (ak.f()) {
            if (this.c) {
                n = 2131297246;
            }
            else {
                n = 2131297247;
            }
        }
        else {
            n = 2131297245;
        }
        final PromptDialogFragment j = PromptDialogFragment.b(7).d(n).h(2131298158).j(2131297303);
        j.setTargetFragment(this, 0);
        j.a(this.getActivity().getSupportFragmentManager());
    }
    
    @Override
    protected void Z_() {
        super.Z_();
        this.a(false);
        final LoaderManager loaderManager = this.getLoaderManager();
        if (this.a.c().a() == 0) {
            loaderManager.initLoader(1, null, this);
        }
    }
    
    @Override
    public void a(final int n, final y y) {
        super.a(n, y);
        final aa aa = (aa)y.l().b();
        final int r = y.R();
        switch (n) {
            case 2: {
                if (aa.a()) {
                    this.c_(r);
                    return;
                }
                Toast.makeText(this.an, 2131296726, 1).show();
            }
            case 5: {
                if (aa.a()) {
                    this.c_(r);
                    return;
                }
                Toast.makeText(this.an, 2131297279, 1).show();
            }
            case 4: {
                if (aa.a()) {
                    this.c_(r);
                    this.h = ((z)y).e();
                    return;
                }
                Toast.makeText(this.an, 2131297279, 1).show();
            }
            case 8: {
                if (aa.a()) {
                    Toast.makeText(this.an, 2131296851, 0).show();
                    return;
                }
                break;
            }
        }
    }
    
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        if (n == 7 && n2 == -1) {
            this.startActivity(new Intent((Context)this.getActivity(), (Class)WebViewActivity.class).setData(Uri.parse(this.getString(2131298284))));
        }
    }
    
    @Override
    protected void a(final Cursor cursor) {
        if (this.au() && this.h) {
            this.a(1);
        }
    }
    
    @TargetApi(16)
    @Override
    public void a(final Loader loader, final Cursor cursor) {
        switch (loader.getId()) {
            default: {}
            case 0: {
                super.a(loader, cursor);
                if (((ds)this.W).isEmpty()) {
                    this.b(false);
                }
                else {
                    this.b(true);
                }
                this.c_(3);
                this.a(new bj((Context)this.getActivity(), this.aF()), 9, 0);
            }
            case 1: {
                final ct a = this.a;
                ln a2;
                if (cursor != null) {
                    a2 = new lm(cursor);
                }
                else {
                    a2 = ln.a;
                }
                a.a((Object)null, a2);
                this.e();
            }
        }
    }
    
    public void a(final ListView listView, final View view, final int n, final long n2) {
        boolean b = true;
        final FragmentActivity activity = this.getActivity();
        final cw cw = new cw((Context)activity, (com.twitter.library.provider.c)listView.getItemAtPosition(n), this.aF().g());
        final Intent putExtra = new Intent((Context)activity, (Class)DMActivity.class).putExtra("conversation_id", cw.a).putExtra("is_group", cw.k).putExtra("notifications_enabled", !cw.m && b).putExtra("extra_title", cw.d).putExtra("extra_subtitle", cw.e);
        if (!cw.o || ak.a(this.aF().j())) {
            b = false;
        }
        this.startActivity(putExtra.putExtra("is_trust_only", b));
    }
    
    @Override
    protected void a(final ToolBar toolBar) {
        toolBar.a(2131887451).b(this.f);
        super.a(toolBar);
    }
    
    public void a(final PromptView promptView) {
        this.aw().a(this.aF().g(), "messages:inbox::import:click");
        final FragmentActivity activity = this.getActivity();
        final com.twitter.android.util.al a = ap.a((Context)activity);
        final FollowFlowController a2 = new FollowFlowController("messages").a(true).e(a.c()).a(new Intent((Context)activity, (Class)RootDMActivity.class));
        a2.b(activity);
        if (a.e()) {
            er.a(a2.f(), activity.getApplicationContext()).a();
        }
    }
    
    @Override
    protected void a(final jv jv, final ToolBar toolBar) {
        jv.a(2131951641, toolBar);
    }
    
    @Override
    protected void a(final boolean b) {
        super.a(b);
        if (b) {
            this.a_(3);
            this.A_();
            this.getLoaderManager().restartLoader(1, null, this);
            return;
        }
        if (this.T() == null) {
            this.a_(3);
            this.q();
            return;
        }
        if (((ds)this.W).isEmpty()) {
            this.a(3);
            return;
        }
        this.c_(2);
    }
    
    protected boolean a(final int n) {
        final Session af = this.aF();
        if (CollectionUtils.a(3, 2).contains(n)) {
            final ai ai = new ai((Context)this.getActivity(), af);
            int n2 = 0;
            if (n != 3) {
                n2 = n;
            }
            this.a(ai, 5, n2);
        }
        else {
            this.a(new z((Context)this.getActivity(), this.aF()), 4, n);
        }
        this.a_(n);
        return true;
    }
    
    @Override
    public boolean a(final jx jx) {
        final int a = jx.a();
        if (a == 2131887450) {
            this.aw().a(this.aF().g(), "messages:navigation_bar::compose:click");
            this.startActivity(new Intent((Context)this.getActivity(), (Class)DMActivity.class).putExtra("start_compose", true));
            return true;
        }
        if (a == 2131887451) {
            final Session af = this.aF();
            this.aw().a(af.g(), "messages:inbox::mark_all_as_read:click");
            this.a(new com.twitter.library.api.conversations.au((Context)this.getActivity(), af), 8, 0);
            return true;
        }
        return super.a(jx);
    }
    
    public void b(final PromptView promptView) {
    }
    
    public boolean b(final long n) {
        return true;
    }
    
    public boolean b_(final long n) {
        return false;
    }
    
    public void c() {
        super.c();
        final Bundle arguments = this.getArguments();
        if (arguments != null && arguments.containsKey("ref_event")) {
            this.aw().a(this.X, "messages::::impression", arguments.getString("ref_event"));
            arguments.remove("ref_event");
            return;
        }
        this.aw().a(this.X, "messages::::impression");
    }
    
    @Override
    protected void g() {
        super.g();
        this.b(!((ds)this.W).isEmpty());
    }
    
    public void i() {
        this.a(2);
    }
    
    @Override
    protected int j() {
        return 1;
    }
    
    @Override
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        this.getActivity().setTitle(2131297076);
        if (bundle == null) {
            this.a(3);
        }
        if (this.W == null) {
            this.W = (ListAdapter)new ds((Context)this.getActivity());
        }
        final ListView y = this.Y();
        y.setAdapter(this.W);
        y.setOnItemLongClickListener((AdapterView$OnItemLongClickListener)this);
        if (this.a == null) {
            this.a = new ct((Context)this.getActivity());
        }
        this.e.setAdapter((ListAdapter)this.a);
        this.h = true;
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131886634) {
            this.aw().a(this.aF().g(), "messages:inbox:user_list:import:click");
            final FragmentActivity activity = this.getActivity();
            new FollowFlowController("messages").a(true).e(false).a(new Intent((Context)activity, (Class)RootDMActivity.class)).b(activity);
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.j(true);
        this.k(false);
        this.aw().a(this.aF().g(), "messages:inbox:::impression");
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        final long g = this.aF().g();
        switch (n) {
            default: {
                return null;
            }
            case 0: {
                return new dy((Context)this.getActivity(), com.twitter.library.provider.ae.a(com.twitter.library.provider.al.a, g), com.twitter.library.api.conversations.aa.a, null, null, null, g, null);
            }
            case 1: {
                return new CursorLoader((Context)this.getActivity(), SuggestionsProvider.e, com.twitter.android.provider.l.a, null, null, null);
            }
        }
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View a = this.a(layoutInflater, 2130968722, viewGroup);
        final FragmentActivity activity = this.getActivity();
        final ListView e = (ListView)a.findViewById(2131886128);
        e.setOnItemClickListener(this.d);
        e.setEmptyView(a.findViewById(2131887205));
        e.setScrollbarFadingEnabled(true);
        (this.g = new PromptView((Context)activity)).setIsHeader(true);
        e.addHeaderView((View)this.g, (Object)null, false);
        final View inflate = View.inflate((Context)activity, 2130968721, (ViewGroup)null);
        e.addFooterView(inflate, (Object)null, false);
        this.g.setOnPromptClickListener(this);
        inflate.findViewById(2131886634).setOnClickListener((View$OnClickListener)this);
        this.e = e;
        return a;
    }
    
    public boolean onItemLongClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final com.twitter.library.provider.c c = (com.twitter.library.provider.c)adapterView.getItemAtPosition(n);
        if (c == null) {
            return false;
        }
        final cw cw = new cw((Context)this.getActivity(), c, this.aF().g());
        this.b = cw.a;
        this.c = cw.k;
        final Resources resources = this.getResources();
        final boolean b = !cw.m;
        final ArrayList<String> list = new ArrayList<String>();
        list.add(resources.getString(2131297277));
        int n3;
        if (b) {
            n3 = 2131296881;
        }
        else {
            n3 = 2131296882;
        }
        list.add(this.getString(n3));
        list.add(resources.getString(2131296844));
        final PromptDialogFragment a = PromptDialogFragment.b(2).a(list.toArray(new CharSequence[list.size()]));
        a.a(new dx(this, cw, b));
        a.setTargetFragment(this, 0);
        a.a(this.getActivity().getSupportFragmentManager());
        return true;
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
        switch (loader.getId()) {
            default: {}
            case 0: {
                super.onLoaderReset(loader);
            }
            case 1: {
                this.a.a((Object)null, ln.a);
            }
        }
    }
    
    public void z() {
    }
}
