// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Handler;
import com.twitter.android.widget.eb;
import com.twitter.library.featureswitch.d;
import com.twitter.android.widget.PinnedHeaderRefreshableListView;
import com.twitter.library.media.manager.j;
import android.net.Uri;
import com.twitter.library.util.bk;
import android.text.TextUtils;
import android.widget.ListView;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import com.twitter.library.media.widget.MediaImageView;
import android.widget.TextView;
import android.view.View;
import android.content.Context;
import com.twitter.library.client.k;
import com.twitter.android.client.c;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;

public class SubheaderView extends RelativeLayout implements View$OnClickListener
{
    tb a;
    private c b;
    private k c;
    private long d;
    private Context e;
    private View f;
    private TextView g;
    private MediaImageView h;
    private RelativeLayout i;
    private boolean j;
    private tc k;
    private boolean l;
    private int m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private boolean s;
    private int t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private int y;
    
    public SubheaderView(final Context context) {
        super(context);
        this.a(context);
    }
    
    public SubheaderView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a(context);
    }
    
    public SubheaderView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a(context);
    }
    
    private void a(final Context e) {
        this.e = e;
        (this.f = LayoutInflater.from(this.e).inflate(2130969121, (ViewGroup)this, true)).setOnClickListener((View$OnClickListener)this);
        this.f.findViewById(2131887297).setOnClickListener((View$OnClickListener)this);
        this.h = (MediaImageView)this.f.findViewById(2131887296);
        this.g = (TextView)this.f.findViewById(2131886123);
        this.i = (RelativeLayout)this.f.findViewById(2131887295);
        this.b();
    }
    
    private void a(final boolean b) {
        if (b) {
            this.g.setVisibility(0);
        }
        else {
            this.g.setVisibility(8);
        }
        final RelativeLayout$LayoutParams layoutParams = (RelativeLayout$LayoutParams)this.f.getLayoutParams();
        final RelativeLayout$LayoutParams layoutParams2 = (RelativeLayout$LayoutParams)this.i.getLayoutParams();
        final ViewGroup$MarginLayoutParams layoutParams3 = (ViewGroup$MarginLayoutParams)this.h.getLayoutParams();
        final Resources resources = this.getResources();
        int n;
        if (b) {
            n = 2131558810;
        }
        else {
            n = 2131558809;
        }
        final int dimensionPixelSize = resources.getDimensionPixelSize(n);
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(2131558806);
        if (this.l) {
            layoutParams.height = dimensionPixelSize - dimensionPixelSize2;
            layoutParams2.topMargin = 0;
            layoutParams3.topMargin = 0;
        }
        else {
            layoutParams.height = dimensionPixelSize;
            layoutParams2.topMargin = dimensionPixelSize2;
            layoutParams3.topMargin = dimensionPixelSize2;
        }
        this.i.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
        this.h.setLayoutParams((ViewGroup$LayoutParams)layoutParams3);
        this.f.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        if (this.k != null) {
            this.k.k();
        }
    }
    
    private void a(final boolean u, final int w) {
        if (this.t != 1) {
            this.t = 1;
            this.u = u;
            this.w = w;
            final RelativeLayout$LayoutParams relativeLayout$LayoutParams = (RelativeLayout$LayoutParams)this.i.getLayoutParams();
            final int measuredHeight = this.f.getMeasuredHeight();
            int topMargin;
            if (this.u) {
                topMargin = relativeLayout$LayoutParams.topMargin;
            }
            else {
                topMargin = 0;
            }
            this.v = measuredHeight - topMargin;
            final boolean u2 = this.u;
            int x = 0;
            if (!u2) {
                x = -this.v;
            }
            this.x = x;
            this.b(this.w);
            if (!this.u) {
                this.a();
            }
        }
    }
    
    private void b(final int y) {
        int n = 1;
        if (this.t == n) {
            int n2;
            if (this.u && y > this.w) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 == 0) {
                n = -1;
            }
            final int n3 = n * (this.w - y);
            int topMargin = n3 + this.x;
            if ((n3 < 0 && topMargin + this.v <= 0) || (n3 > 0 && topMargin >= 0)) {
                this.t = 2;
                if (this.u) {
                    topMargin = -this.v;
                }
                else {
                    topMargin = 0;
                }
            }
            this.setTopMargin(topMargin);
            this.y = y;
            if (this.t == 2) {
                this.d();
            }
        }
    }
    
    private void b(final ListView listView) {
        if (this.g.getHeight() == 0 || !this.e()) {
            return;
        }
        View child;
        if (listView != null) {
            child = listView.getChildAt(0);
        }
        else {
            child = null;
        }
        int top;
        if (child != null) {
            top = child.getTop();
        }
        else {
            top = 0;
        }
        if (top + this.g.getHeight() < 0) {
            this.a(false);
            return;
        }
        final RelativeLayout$LayoutParams layoutParams = (RelativeLayout$LayoutParams)this.g.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, top, layoutParams.rightMargin, layoutParams.bottomMargin);
        this.g.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    private void d() {
        this.s = this.u;
        if (this.t != 2) {
            if (!this.a.a) {
                final tb a = this.a;
                final int w = this.w;
                int n;
                if (this.s) {
                    n = -1;
                }
                else {
                    n = 1;
                }
                a.a(w + n * this.v);
            }
        }
        else {
            this.t = 0;
            if (this.s) {
                this.b();
            }
            if (this.k != null) {
                this.k.k();
            }
        }
    }
    
    private boolean e() {
        if (!TextUtils.isEmpty((CharSequence)this.o) && !TextUtils.isEmpty((CharSequence)this.p)) {
            while (true) {
                try {
                    if (Long.parseLong(this.r) >= bk.a() / 1000L) {
                        if (this.m != this.c.getInt("subheader_id", -1)) {
                            return UrlInterpreterActivity.b(Uri.parse(this.p));
                        }
                    }
                }
                catch (NumberFormatException ex) {
                    continue;
                }
                break;
            }
        }
        return false;
    }
    
    private void setTopMargin(final int topMargin) {
        final RelativeLayout$LayoutParams layoutParams = (RelativeLayout$LayoutParams)this.getLayoutParams();
        layoutParams.topMargin = topMargin;
        this.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public void a() {
        if (this.e()) {
            this.setVisibility(0);
            if (!this.j) {
                this.b.a(this.m);
                this.b.a(this.d, "home", "", "", "subheader", "impression");
                this.j = true;
            }
            if (this.k != null) {
                this.k.k();
            }
            return;
        }
        this.b();
    }
    
    void a(final int n) {
        if (this.t == 1 && n != 1) {
            this.d();
        }
    }
    
    public void a(final ListView listView) {
        this.g.setText((CharSequence)this.n);
        if (TextUtils.isEmpty((CharSequence)this.n)) {
            this.a(false);
        }
        else {
            this.a(true);
        }
        ((TextView)this.f.findViewById(2131886391)).setText((CharSequence)this.o);
        if (!TextUtils.isEmpty((CharSequence)this.q)) {
            this.h.setVisibility(0);
            this.h.a(com.twitter.library.media.manager.j.a(this.q));
        }
        else {
            this.h.setVisibility(4);
        }
        this.a();
        if (listView instanceof PinnedHeaderRefreshableListView) {
            this.a((PinnedHeaderRefreshableListView)listView);
        }
        else if (this.k != null) {
            this.k.k();
        }
    }
    
    public void a(final c b, final long d, final k c, final tc k, final boolean l, final ListView listView) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.k = k;
        this.l = l;
        this.m = d.a("home_timeline_subheader_id", -1);
        this.o = d.g("home_timeline_subheader_text");
        this.p = d.g("home_timeline_subheader_href");
        this.q = d.g("home_timeline_subheader_image_url");
        this.r = d.g("home_timeline_subheader_valid_until");
        this.a(listView);
    }
    
    void a(final PinnedHeaderRefreshableListView pinnedHeaderRefreshableListView) {
        final boolean a = this.a(pinnedHeaderRefreshableListView.getPinnedHeaderAdapter(), pinnedHeaderRefreshableListView.getFirstVisiblePosition(), pinnedHeaderRefreshableListView.getHeaderViewsCount());
        if (!a) {
            this.setTopMargin(0);
            this.a();
        }
        else {
            this.b();
        }
        this.s = a;
    }
    
    void a(final PinnedHeaderRefreshableListView pinnedHeaderRefreshableListView, final int n, final boolean b) {
        this.b(pinnedHeaderRefreshableListView);
        if (b || this.t == 1) {
            final int headerViewsCount = pinnedHeaderRefreshableListView.getHeaderViewsCount();
            int n2;
            if (n < headerViewsCount) {
                n2 = headerViewsCount - n;
            }
            else {
                n2 = 0;
            }
            final View child = pinnedHeaderRefreshableListView.getChildAt(n2);
            if (child != null) {
                if (!b || this.t == 1) {
                    this.b(child.getTop());
                    return;
                }
                final boolean a = this.a(pinnedHeaderRefreshableListView.getPinnedHeaderAdapter(), n, headerViewsCount);
                if (this.s != a) {
                    this.a(a, child.getTop());
                }
            }
        }
    }
    
    boolean a(final eb eb, int n, final int n2) {
        if (n < n2) {
            n = n2;
        }
        return eb.a_(n - 1, n2) != 0 || eb.a_(n + 1, n2) != 0 || eb.a_(n, n2) != 0;
    }
    
    public void b() {
        this.setVisibility(8);
        if (this.k != null) {
            this.k.k();
        }
    }
    
    public boolean c() {
        return !TextUtils.isEmpty((CharSequence)this.n);
    }
    
    int getStartingHeight() {
        return this.v;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a = new tb(this, this.getHandler());
    }
    
    public void onClick(final View view) {
        if (this.b == null) {
            return;
        }
        final int id = view.getId();
        if (id == 2131887297) {
            this.b();
            this.c.a().a("subheader_id", this.m).apply();
        }
        else if (this.k != null) {
            this.k.d(this.p);
        }
        final c b = this.b;
        final long d = this.d;
        final String[] array = { "home", "", "", "subheader", null };
        String s;
        if (id == 2131887297) {
            s = "dismiss";
        }
        else {
            s = "click";
        }
        array[4] = s;
        b.a(d, array);
    }
}
