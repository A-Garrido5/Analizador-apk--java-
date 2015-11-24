// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.content.res.Resources;
import android.content.Context;
import android.os.Bundle;
import android.widget.AbsListView;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.ScrollingHeaderActivity;
import android.widget.ProgressBar;
import android.view.ViewStub;
import com.twitter.library.service.y;
import android.widget.ListView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsListView$LayoutParams;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.library.widget.ObservableScrollView;
import android.view.View;
import com.twitter.library.widget.ad;
import com.twitter.android.qj;
import com.twitter.android.client.bv;
import com.twitter.android.client.TwitterListFragment;

public abstract class ScrollingHeaderListFragment extends TwitterListFragment implements bv, qj, ad
{
    private View a;
    protected int ag;
    protected int ah;
    protected int ai;
    protected int aj;
    protected int ak;
    protected boolean al;
    private View b;
    private View c;
    private View d;
    private ObservableScrollView e;
    private int f;
    private boolean g;
    private boolean h;
    private final boolean i;
    private ViewTreeObserver$OnGlobalLayoutListener j;
    
    public ScrollingHeaderListFragment() {
        this.i = this.z_();
        this.j = (ViewTreeObserver$OnGlobalLayoutListener)new ev(this);
    }
    
    private void d(final int ah) {
        this.r();
        if (this.i && this.ah != ah) {
            if (this.a != null) {
                this.a.setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, ah));
            }
            if (this.c != null) {
                this.c.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-1, ah));
            }
            this.ah = ah;
        }
    }
    
    private void e() {
        if (this.g) {
            final int height = this.e.getHeight();
            final int n = this.ah - this.ag;
            final int height2 = this.e.getChildAt(0).getHeight();
            if (height2 < height + n) {
                this.d.getLayoutParams().height = height + n - height2;
                this.d.requestLayout();
            }
        }
        this.e.post((Runnable)new ew(this));
    }
    
    private void r() {
        if (this.ab != null) {
            this.ab.setPadding(0, this.ah - this.ag + this.ak, 0, 0);
        }
    }
    
    @Override
    public View G() {
        return (View)this.e;
    }
    
    @Override
    protected View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        if (this.i) {
            int n;
            if (this.aA()) {
                n = 2130969086;
            }
            else {
                n = 2130969085;
            }
            return this.a(layoutInflater, n, viewGroup);
        }
        return super.a(layoutInflater, viewGroup);
    }
    
    @Override
    public void a(final int n, final int ak) {
        if (this.i) {
            this.ak = ak;
            this.d(n);
            final ListView y = this.Y();
            if (y != null) {
                if (this.p()) {
                    final int n2 = -ak;
                    if (this.h) {
                        this.e.scrollTo(this.e.getScrollX(), n2);
                    }
                }
                else {
                    final int count = y.getCount();
                    final int lastVisiblePosition = y.getLastVisiblePosition();
                    if (!this.al && lastVisiblePosition > 0 && count > 1 && 1 + (lastVisiblePosition - y.getFirstVisiblePosition()) >= y.getAdapter().getCount()) {
                        this.b.setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, this.f - (y.getChildAt(1).getHeight() * (count - 2) + 2 * this.ag), -1));
                        this.b(1, ak + n);
                        this.al = true;
                        return;
                    }
                    this.al = true;
                    if (ak + n > this.ag) {
                        this.b(1, ak + n);
                        return;
                    }
                    int firstVisiblePosition = y.getFirstVisiblePosition();
                    final View child = y.getChildAt(0);
                    int n3;
                    if (firstVisiblePosition >= 1 && child != null) {
                        n3 = child.getTop();
                    }
                    else {
                        n3 = this.ag;
                        firstVisiblePosition = 1;
                    }
                    this.b(firstVisiblePosition, n3);
                }
            }
        }
    }
    
    @Override
    public void a(final int n, final y y) {
        super.a(n, y);
        this.aC();
    }
    
    @Override
    protected void a(View inflate) {
        if (inflate instanceof ViewStub) {
            final ViewStub viewStub = (ViewStub)inflate;
            viewStub.setLayoutResource(this.aB());
            inflate = viewStub.inflate();
            this.ab = (ProgressBar)inflate.findViewById(2131886129);
        }
        super.a(inflate);
    }
    
    @Override
    public void a(final ObservableScrollView observableScrollView) {
    }
    
    @Override
    public void a(final ObservableScrollView observableScrollView, final int n, final int n2, final int n3, final int n4) {
        if (this.p() && this.ag()) {
            final int max = Math.max(-n2, -(this.ah - this.ag));
            final FragmentActivity activity = this.getActivity();
            if (activity instanceof ScrollingHeaderActivity) {
                ((ScrollingHeaderActivity)activity).b(max, this.ai);
            }
        }
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n) {
        return false;
    }
    
    @Override
    public boolean a(final AbsListView absListView, final int n, final int n2, final int n3, final boolean b) {
        if (n <= 1 && this.i && n2 > 0 && this.ah > 0) {
            int ah;
            if (n == 0) {
                final View child = absListView.getChildAt(0);
                if (child != null) {
                    final int top = child.getTop();
                    final int n4 = -top;
                    int aj;
                    if (top == 0) {
                        aj = 0;
                    }
                    else {
                        aj = this.aj;
                    }
                    ah = n4 - aj;
                }
                else {
                    ah = 0;
                }
            }
            else {
                ah = this.ah;
            }
            final int max = Math.max(-ah, -(this.ah - this.ag));
            final FragmentActivity activity = this.getActivity();
            if (activity instanceof ScrollingHeaderActivity) {
                if (this.al) {
                    ((ScrollingHeaderActivity)activity).b(max, this.ai);
                    return false;
                }
                absListView.post((Runnable)new ex(this));
                return false;
            }
        }
        return false;
    }
    
    protected boolean aA() {
        return false;
    }
    
    protected int aB() {
        return 0;
    }
    
    protected void aC() {
        if (this.i && this.p()) {
            if (this.e.getHeight() == 0 || this.e.getChildAt(0).getHeight() == 0) {
                this.e.getViewTreeObserver().addOnGlobalLayoutListener(this.j);
            }
            else {
                this.e();
            }
        }
        this.h = true;
    }
    
    @Override
    protected View b(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        if (this.i) {
            int n;
            if (this.aA()) {
                n = 2130968904;
            }
            else {
                n = 2130968903;
            }
            return this.a(layoutInflater, n, viewGroup);
        }
        return super.b(layoutInflater, viewGroup);
    }
    
    @Override
    public void b(final ObservableScrollView observableScrollView) {
    }
    
    @Override
    public void b(final ObservableScrollView observableScrollView, final int n, final int n2, final int n3, final int n4) {
    }
    
    @Override
    public void h(final int n) {
        if (this.i) {
            final int firstVisiblePosition = this.Y().getFirstVisiblePosition();
            if (firstVisiblePosition >= 1) {
                if (firstVisiblePosition > 15) {
                    this.b(1, n);
                    return;
                }
                this.Y().smoothScrollToPositionFromTop(1, n);
            }
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (this.i) {
            final Bundle arguments = this.getArguments();
            final FragmentActivity activity = this.getActivity();
            final Resources resources = activity.getResources();
            this.ag = resources.getDimensionPixelSize(2131558806);
            this.f = resources.getDisplayMetrics().heightPixels;
            this.a = new View((Context)activity);
            this.b = new View((Context)activity);
            this.a.setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, Math.max(this.ag, this.ah), -1));
            this.ai = arguments.getInt("fragment_page_number", 0);
            final int orientation = resources.getConfiguration().orientation;
            boolean g = false;
            if (orientation != 2) {
                g = true;
            }
            this.g = g;
            this.a((bv)this);
        }
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.i) {
            this.e = (ObservableScrollView)onCreateView.findViewById(2131886965);
            this.c = onCreateView.findViewById(2131886966);
            ((LinearLayout$LayoutParams)this.c.getLayoutParams()).height = this.ah;
            this.d = onCreateView.findViewById(2131886967);
            this.e.setObservableScrollViewListener(this);
            this.aj = this.Y().getDividerHeight();
        }
        return onCreateView;
    }
    
    @Override
    public void onViewCreated(final View view, final Bundle bundle) {
        if (this.i) {
            final ListView y = this.Y();
            y.addHeaderView(this.a, (Object)null, false);
            y.addFooterView(this.b, (Object)null, false);
        }
        super.onViewCreated(view, bundle);
    }
    
    protected boolean z_() {
        return false;
    }
}
