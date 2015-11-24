// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.android.kg;
import android.app.Activity;
import android.os.Parcelable;
import com.twitter.internal.android.widget.GroupedRowView;
import android.database.ContentObserver;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.k;
import android.content.Context;
import com.twitter.library.media.manager.o;
import android.text.TextUtils;
import android.app.Dialog;
import android.widget.AbsListView;
import com.twitter.refresh.widget.j;
import java.util.Iterator;
import com.twitter.library.media.manager.ResourceResponse;
import com.twitter.internal.android.widget.ToolBar;
import android.widget.TextView;
import android.support.v4.content.Loader;
import com.twitter.library.service.y;
import java.lang.ref.WeakReference;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.ui.widget.PromptView;
import com.twitter.refresh.widget.RefreshableListView;
import com.twitter.library.metrics.h;
import com.twitter.refresh.widget.a;
import android.support.v4.widget.CursorAdapter;
import android.database.Cursor;
import com.twitter.library.scribe.ScribeLog;
import android.os.Bundle;
import android.content.Intent;
import com.twitter.library.api.Prompt;
import java.util.ArrayList;
import android.widget.ListView;
import android.graphics.Bitmap;
import com.twitter.android.revenue.d;
import com.twitter.android.sl;
import android.widget.ProgressBar;
import com.twitter.android.UmfPromptView;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.widget.ListAdapter;
import com.twitter.library.client.aa;
import com.twitter.android.av.x;
import android.view.View;
import android.view.View$OnTouchListener;
import com.twitter.refresh.widget.e;
import java.util.LinkedHashSet;
import android.os.Handler;
import android.widget.AdapterView$OnItemClickListener;
import com.twitter.refresh.widget.b;
import com.twitter.library.media.manager.m;
import com.twitter.internal.android.widget.aq;
import android.widget.AbsListView$OnScrollListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.library.client.AbsFragment;

public class TwitterListFragment extends AbsFragment implements LoaderManager$LoaderCallbacks, AbsListView$OnScrollListener, p, aq, m, b
{
    private boolean A;
    private final AdapterView$OnItemClickListener B;
    private final Handler C;
    private final Runnable D;
    private final Runnable E;
    private final LinkedHashSet F;
    private final LinkedHashSet G;
    private final LinkedHashSet H;
    private final LinkedHashSet I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private e N;
    private int O;
    private int P;
    private View$OnTouchListener Q;
    private View R;
    private com.twitter.library.av.b S;
    private je T;
    private x U;
    @Deprecated
    protected aa V;
    protected ListAdapter W;
    protected long X;
    protected int Y;
    protected TwitterScribeAssociation Z;
    private UmfPromptView a;
    protected View aa;
    protected ProgressBar ab;
    protected sl ac;
    protected int ad;
    protected boolean ae;
    protected boolean af;
    private com.twitter.android.revenue.d ag;
    private com.twitter.android.client.c b;
    private Bitmap c;
    private boolean d;
    private ListView e;
    private boolean f;
    private boolean g;
    private int h;
    private int i;
    private View j;
    private ArrayList k;
    private bu l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private Prompt r;
    private com.twitter.android.util.aa s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private TwitterFragmentActivity x;
    private boolean y;
    private boolean z;
    
    public TwitterListFragment() {
        this.m = 0;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = (AdapterView$OnItemClickListener)new bo(this);
        this.C = new Handler();
        this.D = new bp(this);
        this.E = new bq(this);
        this.F = new LinkedHashSet();
        this.G = new LinkedHashSet();
        this.H = new LinkedHashSet();
        this.I = new LinkedHashSet();
        this.Q = (View$OnTouchListener)new br(this);
    }
    
    @Deprecated
    public static Bundle a(final Intent intent, final boolean b) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putBoolean("refresh", b);
        return extras;
    }
    
    protected static String a(final String s, final String s2, final int n) {
        return a(s, s2, n, -1);
    }
    
    protected static String a(final String s, final String s2, final int n, final int n2) {
        String s3 = null;
        if (n == n2) {
            s3 = "get_middle";
        }
        else {
            switch (n) {
                default: {
                    s3 = null;
                    break;
                }
                case 2: {
                    s3 = "get_newer";
                    break;
                }
                case 1: {
                    s3 = "get_older";
                    break;
                }
                case 3:
                case 4: {
                    s3 = "get_initial";
                    break;
                }
            }
        }
        if (s3 == null) {
            return null;
        }
        return ScribeLog.a(s, s2, null, null, s3);
    }
    
    private Cursor b(final Cursor cursor) {
        if (this.W instanceof CursorAdapter) {
            return ((CursorAdapter)this.W).swapCursor(cursor);
        }
        if (this.W instanceof ll) {
            final a e = this.E();
            final ll ll = (ll)this.W;
            final Cursor t = this.T();
            ll.a(new lm(cursor));
            this.a(e, cursor != t);
            return t;
        }
        return null;
    }
    
    private void d(final int n) {
        final Cursor t = this.T();
        if (t != null && this.S != null) {
            this.S.a(t, Math.min(-1 + t.getCount(), Math.max(0, n)));
        }
    }
    
    private Bundle e() {
        Bundle arguments = this.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            this.setArguments(arguments);
        }
        return arguments;
    }
    
    private void r() {
        this.T = com.twitter.library.metrics.h.a(this.an, "framerate:scroll:" + this.getClass().getSimpleName(), ih.n, ir.b(), true, 3);
        this.a(new bt(this));
    }
    
    protected boolean A_() {
        return this.m(this.m);
    }
    
    protected boolean C() {
        return false;
    }
    
    protected boolean D() {
        return false;
    }
    
    public a E() {
        final ListView e = this.e;
        final int firstVisiblePosition = e.getFirstVisiblePosition();
        int headerViewsCount = e.getHeaderViewsCount();
        View view;
        if (firstVisiblePosition < headerViewsCount) {
            view = e.getChildAt(headerViewsCount - firstVisiblePosition);
        }
        else {
            view = e.getChildAt(0);
            headerViewsCount = firstVisiblePosition;
        }
        final long itemIdAtPosition = e.getItemIdAtPosition(headerViewsCount);
        int top;
        if (view != null) {
            top = view.getTop();
        }
        else {
            top = 0;
        }
        return new a(headerViewsCount, itemIdAtPosition, top);
    }
    
    protected int N_() {
        return 2130968852;
    }
    
    protected boolean O_() {
        final boolean a = ((RefreshableListView)this.e).a();
        return this.d || a;
    }
    
    protected Cursor T() {
        if (!(this.W instanceof CursorAdapter)) {
            if (this.W instanceof ll) {
                final ln c = ((ll)this.W).c();
                if (c instanceof lm) {
                    return ((lm)c).c();
                }
            }
            return null;
        }
        final Cursor cursor = ((CursorAdapter)this.W).getCursor();
        if (cursor != null && !cursor.isClosed()) {
            return cursor;
        }
        return null;
    }
    
    public final void W() {
        if (this.getActivity() == null || !this.M) {
            this.n = true;
        }
        else if (!this.p && (!this.y || this.aF().d())) {
            this.n = false;
            this.Z_();
            if (!this.p) {
                throw new IllegalStateException("Must call through to super class");
            }
            this.f(true);
            this.C.removeCallbacks(this.E);
            this.C.postDelayed(this.E, 600L);
        }
    }
    
    public final void X() {
        if (this.p) {
            this.ae();
            if (this.p) {
                throw new IllegalStateException("Must call through to super class");
            }
            if (this.o) {
                this.ae_();
                if (this.o) {
                    throw new IllegalStateException("Must call through to super class");
                }
            }
            else {
                this.C.removeCallbacks(this.E);
            }
        }
    }
    
    public final ListView Y() {
        return this.e;
    }
    
    protected final PromptView Z() {
        return this.a;
    }
    
    protected void Z_() {
        this.af();
        this.k();
        this.p = true;
    }
    
    public int a(final long n) {
        final int j = this.j();
        if (j >= 0) {
            final Cursor t = this.T();
            if (t != null && t.moveToFirst()) {
                while (t.getLong(j) != n) {
                    if (!t.moveToNext()) {
                        return 0;
                    }
                }
                return t.getPosition() + this.e.getHeaderViewsCount();
            }
        }
        return 0;
    }
    
    protected final View a(final LayoutInflater layoutInflater, final int n, final ViewGroup viewGroup) {
        final View inflate = layoutInflater.inflate(n, viewGroup, false);
        final View viewById = inflate.findViewById(16908292);
        final ViewStub viewStub = (ViewStub)inflate.findViewById(2131886891);
        if (viewStub != null) {
            viewStub.setLayoutResource(this.N_());
            viewStub.inflate();
        }
        final ListView e = (ListView)inflate.findViewById(16908298);
        this.ab = (ProgressBar)inflate.findViewById(2131886129);
        if (viewById != null) {
            this.a(this.aa = viewById);
            e.setEmptyView(viewById);
        }
        if (!this.z) {
            e.setPadding(0, e.getPaddingTop(), 0, e.getPaddingBottom());
            e.setBackgroundColor(this.getResources().getColor(2131689602));
        }
        e.setOnItemClickListener(this.B);
        e.setScrollbarFadingEnabled(true);
        e.setOnScrollListener((AbsListView$OnScrollListener)this);
        e.setChoiceMode(this.Y);
        e.setOnTouchListener(this.Q);
        final int u = this.u;
        if (u != 0) {
            if (viewById != null) {
                viewById.setBackgroundColor(u);
            }
            e.setBackgroundColor(u);
            e.setCacheColorHint(u);
        }
        if (e instanceof RefreshableListView) {
            if (this.g) {
                final RefreshableListView refreshableListView = (RefreshableListView)e;
                refreshableListView.a(this);
                refreshableListView.setRefreshVisibilityListener(this);
                refreshableListView.setOverScrollMode(2);
                this.f = false;
            }
            else {
                e.setFooterDividersEnabled(true);
            }
        }
        this.e = e;
        return inflate;
    }
    
    protected View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        return this.a(layoutInflater, 2130968848, viewGroup);
    }
    
    public final TwitterListFragment a(final Intent intent) {
        final Bundle e = this.e();
        final Bundle extras = intent.getExtras();
        if (extras != null) {
            e.putAll(extras);
        }
        return this;
    }
    
    protected TwitterListFragment a(final View$OnTouchListener view$OnTouchListener) {
        this.H.add(view$OnTouchListener);
        return this;
    }
    
    public final TwitterListFragment a(final bw bw) {
        this.G.add(bw);
        return this;
    }
    
    protected TwitterListFragment a(final u u) {
        this.I.add(new WeakReference(u));
        return this;
    }
    
    public TwitterListFragment a(final e n) {
        this.N = n;
        return this;
    }
    
    @Override
    public void a(final int n, final y y) {
        this.c(y.b);
        this.c_(y.R());
    }
    
    protected void a(final long n, final long n2) {
    }
    
    protected void a(final Cursor cursor) {
    }
    
    public void a(final Loader loader, final Cursor cursor) {
        this.d(cursor);
    }
    
    protected void a(final View view) {
        final View viewById = view.findViewById(2131886128);
        this.c(viewById);
        if (viewById != null) {
            if (this.v > 0) {
                ((TextView)viewById.findViewById(2131886114)).setText(this.v);
            }
            if (this.w > 0) {
                ((TextView)viewById.findViewById(2131886113)).setText(this.w);
            }
        }
    }
    
    protected void a(final ListView listView, final View view, final int n, final long n2) {
    }
    
    protected final void a(final UmfPromptView a) {
        if (a == null) {
            this.Y().removeHeaderView((View)this.a);
        }
        this.a = a;
    }
    
    protected void a(final bv bv) {
        if (this.L) {
            throw new IllegalStateException("Must be called before onCreateView");
        }
        this.F.add(bv);
    }
    
    protected void a(final ToolBar toolBar) {
    }
    
    public void a(final com.twitter.library.media.manager.p p) {
        this.d = false;
        this.c = (Bitmap)p.c();
        this.ap();
    }
    
    public final void a(final TwitterScribeAssociation z) {
        this.Z = z;
    }
    
    protected void a(final a a) {
    }
    
    protected void a(final a a, final boolean b) {
    }
    
    protected void a(final Iterable iterable) {
        final Iterator<PendingRequest> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            this.c(iterator.next().a);
        }
    }
    
    protected void a(final String s, final int n, final long n2) {
        if (s != null) {
            this.k.add(new PendingRequest(s, n, n2));
        }
    }
    
    protected void a(final jv jv, final ToolBar toolBar) {
    }
    
    protected void a(final boolean b) {
    }
    
    protected boolean a(final PendingRequest pendingRequest, final int n) {
        return pendingRequest.b == n;
    }
    
    public boolean a(final jx jx) {
        return false;
    }
    
    protected void a_(final int n) {
        switch (n) {
            case 1: {
                if (this.g) {
                    ((RefreshableListView)this.e).a(true);
                    return;
                }
                break;
            }
            case 2:
            case 4: {
                if (this.g) {
                    ((RefreshableListView)this.e).b();
                    this.p(1);
                    this.f = true;
                    return;
                }
                break;
            }
            case 3:
            case 5: {
                this.g(true);
            }
        }
    }
    
    public void a_(final boolean b) {
    }
    
    protected final boolean aa() {
        return this.a != null && this.a.d();
    }
    
    public final void ab() {
        this.Z_();
        this.c();
    }
    
    public final boolean ac() {
        return this.q;
    }
    
    protected void ad() {
        if (this.e != null) {
            int n = this.e.getSelectedItemPosition();
            if (n == -1) {
                n = this.e.getFirstVisiblePosition();
            }
            this.d(n - this.e.getHeaderViewsCount());
        }
    }
    
    protected void ae() {
        this.a(this.E());
        this.am();
        this.p = false;
    }
    
    protected void ae_() {
        this.o = false;
        this.T.j();
    }
    
    protected void af() {
        if (this.k.isEmpty()) {
            return;
        }
        final ArrayList<PendingRequest> list = new ArrayList<PendingRequest>();
        for (int i = -1 + this.k.size(); i >= 0; --i) {
            final PendingRequest pendingRequest = this.k.get(i);
            if (this.d(pendingRequest.a)) {
                if (this.a(pendingRequest, pendingRequest.b)) {
                    this.a_(pendingRequest.b);
                }
            }
            else {
                this.c_(pendingRequest.b);
                list.add(pendingRequest);
            }
        }
        this.a(list);
    }
    
    public void af_() {
        if (this.N != null) {
            this.N.af_();
        }
    }
    
    protected boolean ag() {
        return this.o;
    }
    
    protected boolean ah() {
        return this.p;
    }
    
    public void ai() {
        this.p(0);
    }
    
    public void aj() {
        this.p(2);
    }
    
    public void ak() {
    }
    
    public void al() {
    }
    
    protected void am() {
        final ListView e = this.e;
        if (e != null) {
            final View child = e.getChildAt(0);
            if (child != null) {
                this.i = child.getTop();
                this.h = e.getFirstVisiblePosition();
            }
        }
    }
    
    protected final void an() {
        final Iterator iterator = this.G.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this);
        }
    }
    
    public final boolean ao() {
        return this.y;
    }
    
    protected void ap() {
        if (this.a != null && !this.O_()) {
            final boolean d = this.a.d();
            if (this.r != null) {
                this.a.a(this.r);
                this.r = null;
            }
            else if (this.a.e()) {
                this.a.f();
            }
            if (this.a.d()) {
                final int headerViewsCount = this.e.getHeaderViewsCount();
                if (!d && this.e.getFirstVisiblePosition() <= headerViewsCount) {
                    this.b(headerViewsCount, 0);
                }
            }
        }
    }
    
    protected ToolBar aq() {
        if (this.ax() != null) {
            return this.ax().M();
        }
        return null;
    }
    
    public void ar() {
        if (this.K && this.ax() != null) {
            final TwitterFragmentActivity ax = this.ax();
            ax.Q();
            this.a(ax.M());
        }
    }
    
    public int as() {
        if (this.W != null) {
            return this.W.getCount();
        }
        return 0;
    }
    
    public boolean at() {
        return this.g && this.f;
    }
    
    public boolean au() {
        return this.g;
    }
    
    protected ir av() {
        return ir.b();
    }
    
    protected final com.twitter.android.client.c aw() {
        return this.b;
    }
    
    public TwitterFragmentActivity ax() {
        return this.x;
    }
    
    public void ay() {
        final j j = (j)this.e;
        if (j != null && !j.e()) {
            this.an();
        }
    }
    
    public int az() {
        return this.ad;
    }
    
    protected View b(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        return this.a(layoutInflater, 2130968901, viewGroup);
    }
    
    protected TwitterListFragment b(final View$OnTouchListener view$OnTouchListener) {
        this.H.remove(view$OnTouchListener);
        return this;
    }
    
    protected void b(final int n, final int n2) {
        if (this.e != null) {
            this.e.setSelectionFromTop(n, n2);
            this.d(n - this.e.getHeaderViewsCount());
        }
    }
    
    @Override
    public void b(final int n, final y y) {
        final int r = y.R();
        this.a(y.b, r, this.X);
        this.a_(r);
    }
    
    protected final void b(final AbsListView absListView, final int n) {
        final Iterator iterator = this.G.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this, absListView, n);
        }
    }
    
    protected void b(final String s) {
        if (s != null) {
            this.k.add(new PendingRequest(s));
        }
    }
    
    protected Dialog b_(final int n) {
        return null;
    }
    
    protected PendingRequest c(final String s) {
        final ArrayList k = this.k;
        for (int size = k.size(), i = 0; i < size; ++i) {
            if (k.get(i).a.equals(s)) {
                return k.remove(i);
            }
        }
        return null;
    }
    
    protected void c() {
        this.o = true;
    }
    
    protected void c(final int n, final int n2) {
        final ListView e = this.e;
        if (e != null) {
            final int firstVisiblePosition = e.getFirstVisiblePosition();
            if (Math.abs(firstVisiblePosition - n) > n2) {
                int n3;
                if (firstVisiblePosition > n) {
                    n3 = n + n2;
                }
                else {
                    n3 = n - n2;
                }
                this.b(n3, e.getListPaddingTop());
            }
            e.smoothScrollToPosition(n);
        }
    }
    
    protected final void c(final View j) {
        this.j = j;
    }
    
    protected void c(final Prompt r) {
        this.r = r;
        this.c = null;
        if (r != null && !TextUtils.isEmpty((CharSequence)r.j)) {
            this.d = true;
            final o o = new o((Context)this.getActivity());
            o.a(((k)com.twitter.library.media.manager.j.a(r.j).a(this)).a());
            o.a(true);
        }
    }
    
    @TargetApi(16)
    public void c(final boolean b) {
        if (b) {
            this.i();
            if (Build$VERSION.SDK_INT >= 16) {
                this.e.announceForAccessibility((CharSequence)this.getString(2131297528));
            }
        }
    }
    
    protected void c_(final int n) {
        switch (n) {
            case 3:
            case 5: {
                this.g(false);
            }
            case 2:
            case 4: {
                if (this.g) {
                    ((RefreshableListView)this.e).c();
                    this.p(2);
                    this.f = false;
                    return;
                }
                break;
            }
            case 1: {
                if (this.g) {
                    ((RefreshableListView)this.e).a(false);
                    return;
                }
                break;
            }
        }
    }
    
    public void d(final Cursor cursor) {
        final Cursor t = this.T();
        if (this.l != null && this.A) {
            if (t != null) {
                t.unregisterContentObserver((ContentObserver)this.l);
            }
            if (cursor != null) {
                cursor.registerContentObserver((ContentObserver)this.l);
            }
        }
        this.b(cursor);
    }
    
    public void f() {
        final Cursor t = this.T();
        if (t != null) {
            t.requery();
        }
        if (com.twitter.util.a.a() && this.e != null) {
            for (int i = this.e.getFirstVisiblePosition(); i <= this.e.getLastVisiblePosition(); ++i) {
                final View child = this.e.getChildAt(i);
                if (child != null && child.getContentDescription() != null) {
                    this.C.postDelayed((Runnable)new bs(this, child), 1000L);
                    break;
                }
            }
        }
    }
    
    public final void f(final long x) {
        this.X = x;
    }
    
    @Override
    protected boolean f(final int n) {
        return !this.o(n);
    }
    
    protected final boolean f(final boolean b) {
        if (this.W != null && this.n()) {
            if (this.T() == null) {
                this.J = true;
                return false;
            }
            if (this.J || b) {
                this.o();
                this.J = false;
                return true;
            }
        }
        return false;
    }
    
    protected void g() {
        this.f();
    }
    
    public final void g(final long n) {
        final long x = this.X;
        this.f(n);
        if (this.au() && this.e instanceof RefreshableListView) {
            ((RefreshableListView)this.e).c();
        }
        this.af();
        this.k();
        this.a(x, n);
        if (!this.y || this.aF().d()) {
            this.a(true);
        }
    }
    
    protected void g(final boolean b) {
        if (this.ab != null) {
            final ListView e = this.e;
            if (b) {
                e.setVisibility(8);
                if (this.aa != null) {
                    this.aa.setVisibility(0);
                    if (this.j != null) {
                        this.j.setVisibility(8);
                    }
                }
                this.ab.setVisibility(0);
                return;
            }
            this.ab.setVisibility(8);
            final boolean p = this.p();
            if (!p) {
                e.setVisibility(0);
            }
            if (this.aa != null) {
                if (!p) {
                    this.aa.setVisibility(8);
                    return;
                }
                if (this.j != null) {
                    this.j.setVisibility(0);
                }
            }
        }
    }
    
    public final TwitterListFragment h(final boolean b) {
        this.e().putBoolean("refresh", b);
        return this;
    }
    
    protected void h() {
        final a e = this.E();
        this.g();
        this.a(e, true);
    }
    
    protected void i() {
    }
    
    public final void i(final boolean y) {
        this.y = y;
    }
    
    protected int j() {
        return -1;
    }
    
    public void j(final boolean k) {
        this.K = k;
    }
    
    protected void j_() {
    }
    
    protected void k() {
        this.b(this.h, this.i);
    }
    
    public void k(final boolean a) {
        if (a != this.A) {
            final Cursor t = this.T();
            if (this.l != null && t != null) {
                if (a) {
                    t.registerContentObserver((ContentObserver)this.l);
                }
                else {
                    t.unregisterContentObserver((ContentObserver)this.l);
                }
            }
            this.A = a;
        }
    }
    
    public void k_() {
        if (this.N != null) {
            this.N.k_();
        }
        final ListView y = this.Y();
        if (y.getCount() > 0 && y.getChildAt(1 + y.getHeaderViewsCount()) instanceof GroupedRowView) {
            if (this.R == null) {
                this.R = this.getView().findViewById(2131887212);
            }
            if (this.R != null) {
                this.R.setVisibility(0);
            }
        }
    }
    
    protected final void l(final int m) {
        if (this.l == null) {
            this.l = new bu(this, this.C);
            this.m = m;
        }
        this.getLoaderManager().initLoader(this.m, null, this);
    }
    
    public void l(final boolean f) {
        if (this.g && f != this.f) {
            this.f = f;
        }
    }
    
    protected boolean l() {
        return false;
    }
    
    protected String m() {
        return "unknown";
    }
    
    protected void m(final boolean b) {
        final Iterator iterator = this.I.iterator();
        while (iterator.hasNext()) {
            final u u = iterator.next().get();
            if (u != null) {
                u.b(b);
            }
            else {
                iterator.remove();
            }
        }
    }
    
    protected boolean m(final int n) {
        if (this.l == null) {
            return false;
        }
        this.getLoaderManager().restartLoader(n, null, this);
        return true;
    }
    
    public void n(final int ad) {
        if (this.ac != null && this.ad != ad) {
            this.ad = ad;
            this.ac.a(this.e, ad);
            this.e.requestLayout();
        }
    }
    
    protected boolean n() {
        return true;
    }
    
    protected void o() {
    }
    
    protected boolean o(final int n) {
        if (n != 0) {
            final Iterator<PendingRequest> iterator = this.k.iterator();
            while (iterator.hasNext()) {
                if (this.a(iterator.next(), n)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.K && this.ax() != null) {
            final TwitterFragmentActivity ax = this.ax();
            final jv n = ax.N();
            final ToolBar m = ax.M();
            this.a(n, m);
            this.a(m);
            ax.a(this);
        }
        this.u();
        if (this.t) {
            (this.a = new UmfPromptView((Context)this.getActivity())).setDismissVisibility(0);
            this.a.f();
            this.e.addHeaderView((View)this.a, (Object)null, false);
        }
        else {
            this.a = null;
        }
        if (bundle != null) {
            final Parcelable parcelable = bundle.getParcelable("prompt");
            if (this.a != null && parcelable != null) {
                this.a.onRestoreInstanceState(parcelable);
            }
        }
        if (this.af) {
            this.S = new com.twitter.library.av.b(this.an);
        }
        this.M = true;
        this.r();
    }
    
    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        if (activity instanceof TwitterFragmentActivity) {
            this.x = (TwitterFragmentActivity)activity;
        }
        this.ae = kg.a((Context)this.getActivity());
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.b = com.twitter.android.client.c.a((Context)this.getActivity());
        this.q = (this.ax() == null || this.ax().W() == null);
        if (bundle != null) {
            this.h = bundle.getInt("scroll_pos");
            this.i = bundle.getInt("scroll_off");
            this.k = bundle.getParcelableArrayList("pending_reqs");
        }
        else {
            this.h = 0;
            this.i = 0;
            this.k = new ArrayList(5);
        }
        final Bundle arguments = this.getArguments();
        if (arguments != null) {
            this.g = arguments.getBoolean("refresh", true);
            this.X = arguments.getLong("owner_id", this.aF().g());
            this.Y = arguments.getInt("chmode", 0);
            this.u = arguments.getInt("bg_color", 0);
            this.v = arguments.getInt("empty_title", 0);
            this.w = arguments.getInt("empty_desc", 0);
            this.t = arguments.getBoolean("prompt_host", false);
            this.ad = arguments.getInt("shim_size", 0);
            this.z = arguments.getBoolean("horizontal_padding_enabled", true);
        }
        else {
            this.g = true;
            this.X = this.aF().g();
            this.Y = 0;
            this.u = 0;
            this.v = 0;
            this.w = 0;
        }
        this.af = this.l();
        if (this.C()) {
            this.a(this.U = new x());
        }
        if (this.D()) {
            this.a(this.ag = com.twitter.android.revenue.d.a(this.an, com.twitter.android.revenue.c.c(), com.twitter.android.revenue.c.d()));
        }
    }
    
    @Override
    public Loader onCreateLoader(final int n, final Bundle bundle) {
        return null;
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        if (this.v > 0 || this.w > 0) {
            return this.b(layoutInflater, viewGroup);
        }
        return this.a(layoutInflater, viewGroup);
    }
    
    @Override
    public void onDestroy() {
        this.getActivity();
        if (this.K && this.ax() != null) {
            this.ax().b(this);
        }
        if (this.s != null) {
            this.s.a();
        }
        if (this.W != null) {
            final Cursor b = this.b((Cursor)null);
            if (b != null && this.l != null && this.A) {
                b.unregisterContentObserver((ContentObserver)this.l);
            }
        }
        if (this.S != null) {
            this.S.a();
        }
        if (this.U != null) {
            this.U.a();
        }
        if (this.ag != null) {
            this.ag.a();
        }
        super.onDestroy();
    }
    
    public void onDestroyView() {
        this.C.removeCallbacks(this.D);
        super.onDestroyView();
    }
    
    @Override
    public void onLoaderReset(final Loader loader) {
        final Cursor t = this.T();
        if (t != null && this.l != null && this.A) {
            t.unregisterContentObserver((ContentObserver)this.l);
        }
        this.b((Cursor)null);
    }
    
    @Override
    public void onPause() {
        super.onPause();
        final com.twitter.android.client.c b = this.b;
        if (b != null && this.V != null) {
            b.b(this.V);
        }
    }
    
    @Override
    public void onResume() {
        super.onResume();
        if (this.V != null) {
            this.b.a(this.V);
        }
        if (this.n) {
            this.W();
        }
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("pending_reqs", this.k);
        bundle.putInt("scroll_pos", this.h);
        bundle.putInt("scroll_off", this.i);
        if (this.a != null) {
            bundle.putParcelable("prompt", this.a.onSaveInstanceState());
        }
    }
    
    public final void onScroll(final AbsListView absListView, final int o, final int p4, final int n) {
        Label_0078: {
            if (o == this.O && p4 == this.P) {
                break Label_0078;
            }
            boolean b = true;
            while (true) {
                Label_0183: {
                    try {
                        final Iterator iterator = this.F.iterator();
                        while (iterator.hasNext()) {
                            if (iterator.next().a(absListView, o, p4, n, b)) {
                                return;
                            }
                        }
                        if (p4 == 0 || !b) {
                            return;
                        }
                        if (o == 0) {
                            this.an();
                            return;
                        }
                        if (this.O == 0) {
                            final Iterator iterator2 = this.G.iterator();
                            while (iterator2.hasNext()) {
                                iterator2.next().b(this);
                            }
                        }
                        break Label_0183;
                        b = false;
                        continue;
                    }
                    finally {
                        this.O = o;
                        this.P = p4;
                    }
                }
                if (this.W == null || o + p4 < n || this.W.getCount() <= 0) {
                    return;
                }
                final Cursor t = this.T();
                if (t != null && t.moveToLast()) {
                    this.a(t);
                }
            }
        }
    }
    
    public final void onScrollStateChanged(final AbsListView absListView, final int n) {
        final Iterator iterator = this.F.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().a(absListView, n)) {
                return;
            }
        }
        this.b(absListView, n);
        if (n != 2) {
            this.j_();
        }
    }
    
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.L = true;
        this.C.post(this.D);
    }
    
    protected int p(final int n) {
        if (!this.isRemoving() && com.twitter.library.util.bo.b) {
            if (this.s == null) {
                this.s = com.twitter.android.util.aa.a((Context)this.getActivity());
            }
            return this.s.a(n);
        }
        return 0;
    }
    
    protected boolean p() {
        final ListView e = this.e;
        return e.getCount() - e.getHeaderViewsCount() - e.getFooterViewsCount() == 0;
    }
    
    protected void q() {
        this.l(0);
    }
    
    public final void q(final int n) {
        final Dialog b_ = this.b_(n);
        if (b_ != null) {
            b_.show();
        }
    }
    
    protected void u() {
        if (this.ad > 0) {
            (this.ac = new sl((Context)this.getActivity(), this.ad)).a(this.Y());
        }
    }
}
