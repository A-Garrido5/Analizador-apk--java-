// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.android.widget;

import android.view.ContextThemeWrapper;
import android.widget.ImageView$ScaleType;
import android.view.View$OnLongClickListener;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnKeyListener;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnClickListener;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import android.widget.FrameLayout;
import android.view.View$MeasureSpec;
import android.widget.ListAdapter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.graphics.Rect;
import android.widget.PopupWindow;
import android.widget.ImageView;
import android.view.View;
import android.view.ViewGroup;

public class ToolBar extends ViewGroup
{
    private boolean A;
    private int B;
    private View C;
    private boolean D;
    private ImageView E;
    private PopupWindow F;
    private int G;
    private Rect H;
    private int I;
    private ViewGroup J;
    private View K;
    private boolean L;
    private int M;
    private boolean N;
    private int O;
    private int P;
    private int Q;
    private final int a;
    private Context b;
    private int c;
    private Context d;
    private final int e;
    private final boolean f;
    private final Drawable g;
    private final int h;
    private final int i;
    private final ap j;
    private final int k;
    private final int l;
    private final int m;
    private final List n;
    private final ar o;
    private final ao p;
    private final as q;
    private final String r;
    private aq s;
    private LinkedHashMap t;
    private ArrayList u;
    private ArrayList v;
    private ArrayList w;
    private ToolBarHomeView x;
    private boolean y;
    private boolean z;
    
    public ToolBar(final Context context) {
        this(context, null);
    }
    
    public ToolBar(final Context context, final AttributeSet set) {
        this(context, set, kv.toolBarStyle);
    }
    
    public ToolBar(final Context b, final AttributeSet set, final int n) {
        super(b, set, n);
        this.t = new LinkedHashMap();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.H = new Rect();
        this.b = b;
        final TypedArray obtainStyledAttributes = b.obtainStyledAttributes(set, li.ToolBar, n, 0);
        this.setThemeId(obtainStyledAttributes.getResourceId(li.ToolBar_toolBarTheme, 0));
        this.a = obtainStyledAttributes.getResourceId(li.ToolBar_toolBarItemBackground, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(li.ToolBar_toolBarItemPadding, 0);
        this.f = obtainStyledAttributes.getBoolean(li.ToolBar_stackFromRight, false);
        final int a = lk.a(b);
        this.g = lk.a(obtainStyledAttributes.getDrawable(li.ToolBar_toolBarOverflowDrawable), a);
        this.r = obtainStyledAttributes.getString(li.ToolBar_toolBarOverflowContentDescription);
        this.k = obtainStyledAttributes.getResourceId(li.ToolBar_toolBarHomeStyle, 0);
        this.l = obtainStyledAttributes.getResourceId(li.ToolBar_toolBarItemStyle, 0);
        this.setTitle(obtainStyledAttributes.getString(li.ToolBar_toolBarTitle));
        Object drawable = obtainStyledAttributes.getDrawable(li.ToolBar_toolBarIcon);
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        this.setIcon(lk.a((Drawable)drawable, a));
        this.setUpIndicator(lk.a(obtainStyledAttributes.getDrawable(li.ToolBar_toolBarUpIndicator), a));
        super.setPadding(0, 0, 0, 0);
        final Resources resources = this.getResources();
        this.i = resources.getDimensionPixelSize(ky.preferred_popup_width);
        this.h = Math.max(resources.getDisplayMetrics().widthPixels / 2, this.i);
        this.o = new ar();
        this.q = new as();
        this.p = new ao();
        this.j = new ap(this.o, null);
        this.n = new ArrayList();
        this.M = obtainStyledAttributes.getInt(li.ToolBar_toolBarDisplayOptions, 46);
        this.m = obtainStyledAttributes.getDimensionPixelOffset(li.ToolBar_popupMenuXOffset, 0);
        this.I = obtainStyledAttributes.getResourceId(li.ToolBar_toolBarCustomViewId, 0);
        this.i();
        obtainStyledAttributes.recycle();
    }
    
    private int a(final ListAdapter listAdapter) {
        if (listAdapter.isEmpty()) {
            return 0;
        }
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int count = listAdapter.getCount();
        if (this.J == null) {
            this.J = (ViewGroup)new FrameLayout(this.getThemedContext());
        }
        int i = 0;
        int n = 0;
        View view = null;
        int max = 0;
        while (i < count) {
            int itemViewType = listAdapter.getItemViewType(i);
            View view2;
            if (itemViewType != n) {
                view2 = null;
            }
            else {
                itemViewType = n;
                view2 = view;
            }
            view = listAdapter.getView(i, view2, this.J);
            view.measure(measureSpec, measureSpec2);
            max = Math.max(max, view.getMeasuredWidth() + view.getPaddingLeft() + view.getPaddingRight());
            ++i;
            n = itemViewType;
        }
        return max;
    }
    
    static ArrayList a(final Collection collection, final ar ar) {
        final ArrayList<jx> list = new ArrayList<jx>(collection.size());
        final ArrayList<Object> list2 = new ArrayList<Object>(collection);
        Collections.sort(list2, ar);
        final Iterator<jx> iterator = list2.iterator();
        final Iterator<? extends jx> iterator2 = collection.iterator();
        jx jx = null;
        while (iterator.hasNext()) {
            final jx jx2 = iterator.next();
            final int r = jx2.r();
            int r2;
            if (jx != null) {
                r2 = jx.r();
            }
            else {
                r2 = 0;
            }
            int n;
            if (r != -1) {
                n = -1 + (r - r2);
            }
            else {
                n = 0;
            }
            while ((n > 0 || r == -1) && iterator2.hasNext()) {
                final jx jx3 = (jx)iterator2.next();
                int n2;
                if (jx3.r() == -1) {
                    list.add(jx3);
                    n2 = n - 1;
                }
                else {
                    n2 = n;
                }
                n = n2;
            }
            if (r != -1) {
                list.add(jx2);
            }
            jx = jx2;
        }
        return list;
    }
    
    private void a(final int n, final int n2, final int n3, final int n4) {
        if (this.L) {
            switch (((ToolBar$LayoutParams)this.K.getLayoutParams()).a) {
                default: {
                    this.K.layout(n, n2, n3, n4);
                    break;
                }
                case 5: {
                    this.K.layout(n3 - this.K.getMeasuredWidth(), n2, n3, n4);
                }
            }
        }
    }
    
    private void a(final View view) {
        if (view.getParent() == this) {
            this.detachViewFromParent(view);
        }
    }
    
    private void a(final jx jx, final View view) {
        this.n.add(jx);
        this.a(view);
    }
    
    private void b(final View view) {
        if (view.getParent() == null) {
            this.attachViewToParent(view, -1 + this.getChildCount(), view.getLayoutParams());
        }
    }
    
    private boolean e(final jx jx) {
        final int j = jx.j();
        return (jx.c() == 0 && (j & 0x2) == 0x0) || j == 0;
    }
    
    private int getStartIndex() {
        if (this.x == null) {
            return 0;
        }
        return 1;
    }
    
    private ToolBarHomeView h() {
        if (this.x == null) {
            final Context context = this.getContext();
            this.x = new ToolBarHomeView(context);
            this.O = this.x.getPaddingLeft();
            this.P = this.x.getPaddingRight();
            if (this.k != 0) {
                this.x.a(context, this.k);
            }
            this.x.setId(la.home);
            this.x.setOnClickListener((View$OnClickListener)new ai(this, new jx(this, false).a(la.home)));
            this.addView((View)this.x, 0);
        }
        this.x.setClickable(this.y || this.A);
        final ToolBarHomeView x = this.x;
        boolean longClickable = false;
        Label_0176: {
            if (!this.y) {
                final boolean a = this.A;
                longClickable = false;
                if (!a) {
                    break Label_0176;
                }
            }
            longClickable = true;
        }
        x.setLongClickable(longClickable);
        this.x.a(this.y);
        return this.x;
    }
    
    private void i() {
        boolean displayHomeClickable = true;
        final int m = this.M;
        this.setDisplayShowHomeAsUpEnabled((m & 0x4) != 0x0 && displayHomeClickable);
        this.setDisplayHomeEnabled((m & 0x2) != 0x0 && displayHomeClickable);
        this.setDisplayShowTitleEnabled((m & 0x8) != 0x0 && displayHomeClickable);
        this.setDisplayFullExpandEnabled((m & 0x10) != 0x0 && displayHomeClickable);
        if ((m & 0x20) == 0x0) {
            displayHomeClickable = false;
        }
        this.setDisplayHomeClickable(displayHomeClickable);
    }
    
    private void setDisplayHomeClickable(final boolean b) {
        if (this.x != null) {
            this.x.setClickable(b);
            this.A = b;
        }
    }
    
    private void setDisplayHomeEnabled(final boolean b) {
        if (this.x != null) {
            this.x.c(b);
        }
    }
    
    private void setExtraWidth(final int n) {
        if (!this.N || this.x == null) {
            return;
        }
        this.h().a(n);
    }
    
    private void setUpIndicator(final Drawable drawable) {
        if (drawable == null && this.x == null) {
            return;
        }
        this.h().b(drawable);
    }
    
    View a(final jx jx) {
        if (jx.j() == 2 && jx.e() != null) {
            return jx.e();
        }
        return jx.d();
    }
    
    public jx a(final int n) {
        return this.t.get(n);
    }
    
    void a() {
        if (this.F == null) {
            final Context themedContext = this.getThemedContext();
            final DropDownListView contentView = new DropDownListView(themedContext, null, kv.dropDownListViewStyle);
            contentView.setFocusable(true);
            contentView.setFocusableInTouchMode(true);
            contentView.setAdapter((ListAdapter)this.j);
            contentView.setOnItemClickListener((AdapterView$OnItemClickListener)new ak(this));
            contentView.setSelection(-1);
            contentView.setOnKeyListener((View$OnKeyListener)new al(this));
            final PopupWindow f = new PopupWindow(themedContext, (AttributeSet)null, kv.toolBarPopupWindowStyle);
            f.setInputMethodMode(2);
            f.setOutsideTouchable(true);
            f.setContentView((View)contentView);
            f.setFocusable(true);
            this.F = f;
        }
        this.j.a(this.n);
        final PopupWindow f2 = this.F;
        f2.setWindowLayoutMode(0, -2);
        this.setContentWidth(Math.max(this.i, Math.min(this.a((ListAdapter)this.j), this.h)));
        final int n = -this.E.getHeight();
        if (f2.isShowing()) {
            f2.update((View)this.E, this.m, n, this.G, 0);
            return;
        }
        f2.setWidth(this.G);
        f2.showAsDropDown((View)this.E, this.m, n);
    }
    
    protected void a(int n, final int n2, int n3, final int n4, final boolean b) {
        final ArrayList w = this.w;
        if (b) {
            final Iterator<jx> iterator = w.iterator();
            int n5 = 0;
            int n6 = n;
            int extraWidth = 0;
            while (iterator.hasNext()) {
                final jx jx = iterator.next();
                final View a = this.a(jx);
                final int measuredWidth = a.getMeasuredWidth();
                final int n7 = n3 - measuredWidth;
                boolean b2;
                if (n7 < n6) {
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                final int j = jx.j();
                int n8;
                int n9;
                int n10;
                if (b2 && (j & 0x2) == 0x0) {
                    this.a(jx, a);
                    n8 = extraWidth;
                    n9 = n5;
                    n10 = n6;
                }
                else if (jx.i()) {
                    this.b(a);
                    if (jx.b() && n5 == 0) {
                        a.layout(n, n2, measuredWidth, n4);
                        n5 = 1;
                        n6 = measuredWidth;
                    }
                    else {
                        a.layout(n7, n2, n3, n4);
                        n3 = n7;
                    }
                    n8 = extraWidth + measuredWidth;
                    n9 = n5;
                    n10 = n6;
                }
                else {
                    this.a(a);
                    n8 = extraWidth;
                    n9 = n5;
                    n10 = n6;
                }
                n6 = n10;
                n5 = n9;
                extraWidth = n8;
            }
            this.setExtraWidth(extraWidth);
            this.a(n, n2, n3, n4);
            return;
        }
        final Iterator<jx> iterator2 = w.iterator();
        int n11 = 0;
        int extraWidth2 = 0;
        while (iterator2.hasNext()) {
            final jx jx2 = iterator2.next();
            final View a2 = this.a(jx2);
            final int measuredWidth2 = a2.getMeasuredWidth();
            final int n12 = n + measuredWidth2;
            boolean b3;
            if (n12 > n3) {
                b3 = true;
            }
            else {
                b3 = false;
            }
            final int i = jx2.j();
            int n13;
            int n14;
            if (b3 && (i & 0x2) == 0x0) {
                this.a(jx2, a2);
                n13 = extraWidth2;
                n14 = n11;
            }
            else if (jx2.i()) {
                this.b(a2);
                if (jx2.b() && n11 == 0) {
                    final int n15 = n3 - measuredWidth2;
                    a2.layout(n15, n2, n3, n4);
                    n11 = 1;
                    n3 = n15;
                }
                else {
                    a2.layout(n, n2, n12, n4);
                    n = n12;
                }
                n13 = extraWidth2 + measuredWidth2;
                n14 = n11;
            }
            else {
                this.a(a2);
                n13 = extraWidth2;
                n14 = n11;
            }
            n11 = n14;
            extraWidth2 = n13;
        }
        this.setExtraWidth(extraWidth2);
        this.a(n, n2, n3, n4);
    }
    
    public void a(final View k, final ToolBar$LayoutParams layoutParams) {
        boolean b;
        if (this.K != null) {
            b = true;
        }
        else {
            b = false;
        }
        if (b) {
            if (this.K.getParent() == this) {
                this.removeView(this.K);
            }
            else {
                this.removeDetachedView(this.K, false);
            }
            this.K = null;
        }
        if (k != null) {
            if (layoutParams != null) {
                k.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            }
            else {
                k.setLayoutParams((ViewGroup$LayoutParams)new ToolBar$LayoutParams(-1, -1));
            }
        }
        this.K = k;
        this.L = false;
        if (b || this.K != null) {
            this.requestLayout();
            this.invalidate();
        }
    }
    
    public final void a(final CharSequence charSequence, final boolean b) {
        if (charSequence == null && this.x == null) {
            return;
        }
        this.h().a(charSequence, b);
    }
    
    public void a(final Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        final int childCount = this.getChildCount();
        final Iterator<jx> iterator = collection.iterator();
        int n = childCount;
        while (iterator.hasNext()) {
            final jx jx = iterator.next();
            final int a = jx.a();
            final int j = jx.j();
            boolean b;
            if ((j & 0x2) != 0x0) {
                b = true;
            }
            else {
                b = false;
            }
            final Context themedContext = this.getThemedContext();
            final ToolBarItemView toolBarItemView = new ToolBarItemView(themedContext);
            if (this.l != 0) {
                toolBarItemView.a(themedContext, this.l);
            }
            toolBarItemView.setId(a);
            toolBarItemView.setImageResource(jx.c());
            toolBarItemView.setLabel(jx.k());
            toolBarItemView.setWithText((j & 0x4) != 0x0 || (jx.c() == 0 && b));
            toolBarItemView.setEnabled(jx.m());
            if (this.a != 0) {
                toolBarItemView.setBackgroundResource(this.a);
            }
            toolBarItemView.setOnClickListener((View$OnClickListener)new am(this, jx));
            toolBarItemView.setOnLongClickListener((View$OnLongClickListener)new an(this, jx));
            jx.a(toolBarItemView);
            final View a2 = this.a(jx);
            final int n2 = n + 1;
            this.addViewInLayout(a2, n, this.generateDefaultLayoutParams(), true);
            this.t.put(a, jx);
            n = n2;
        }
        final Collection values = this.t.values();
        this.u = a(values, this.o);
        Collections.sort((List<Object>)(this.v = a(values, this.o)), this.q);
        Collections.sort((List<Object>)this.v, this.p);
        this.requestLayout();
    }
    
    public void b(final int n) {
        this.M |= n;
        this.i();
    }
    
    public final void b(final CharSequence charSequence, final boolean b) {
        if (this.x == null) {
            return;
        }
        this.x.b(charSequence, b);
    }
    
    public boolean b() {
        final Iterator<jx> iterator = this.t.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().i()) {
                return true;
            }
        }
        return false;
    }
    
    public boolean b(final jx jx) {
        if (this.C == null) {
            return false;
        }
        if (this.C != jx.e()) {
            return false;
        }
        this.removeView(this.C);
        for (int childCount = this.getChildCount(), i = this.getStartIndex(); i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final jx jx2 = this.t.get(child.getId());
            if (jx2 == null || jx2.i()) {
                child.setVisibility(0);
            }
        }
        this.C = null;
        jx.a(false);
        if (this.x != null) {
            if (this.z) {
                this.x.setVisibility(this.B);
            }
            else {
                this.x.d(false);
                if (!this.y) {
                    this.x.setPadding(this.O, this.x.getPaddingTop(), this.P, this.x.getPaddingBottom());
                }
                this.x.a(this.y);
            }
        }
        this.requestLayout();
        return true;
    }
    
    public void c() {
        this.setVisibility(0);
    }
    
    public void c(final int n) {
        this.M &= ~n;
        this.i();
    }
    
    public boolean c(final jx jx) {
        if (this.C != null) {
            return false;
        }
        this.C = jx.e();
        for (int childCount = this.getChildCount(), i = this.getStartIndex(); i < childCount; ++i) {
            this.getChildAt(i).setVisibility(8);
        }
        this.addView(this.C);
        jx.a(true);
        if (this.x != null) {
            if (this.z) {
                this.B = this.x.getVisibility();
                this.x.setVisibility(8);
            }
            else {
                this.x.d(true);
                if (!this.y) {
                    this.x.setPadding(0, 0, 0, 0);
                }
                this.x.a(true);
            }
        }
        this.requestLayout();
        return true;
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof ToolBar$LayoutParams && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public void d() {
        this.setVisibility(8);
    }
    
    public void d(final jx jx) {
        if (this.C == null) {
            final View a = this.a(jx);
            if (a != null) {
                if (!jx.i()) {
                    a.setVisibility(8);
                    return;
                }
                a.setVisibility(0);
            }
        }
    }
    
    public boolean e() {
        if (this.D) {
            this.a();
            return true;
        }
        return false;
    }
    
    public boolean f() {
        if (this.F != null) {
            this.F.dismiss();
            return true;
        }
        return false;
    }
    
    public void g() {
        if (this.F != null && this.F.isShowing()) {
            this.j.notifyDataSetChanged();
        }
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new ToolBar$LayoutParams(-2, -2);
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new ToolBar$LayoutParams(this.getThemedContext(), set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new ToolBar$LayoutParams(viewGroup$LayoutParams);
    }
    
    public int getDisplayOptions() {
        return this.M;
    }
    
    public final CharSequence getSubtitle() {
        if (this.x == null) {
            return null;
        }
        return this.x.a();
    }
    
    public int getThemeId() {
        return this.c;
    }
    
    public Context getThemedContext() {
        if (this.d == null) {
            return this.b;
        }
        return this.d;
    }
    
    public final CharSequence getTitle() {
        if (this.x == null) {
            return null;
        }
        return this.x.b();
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f();
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        View viewById;
        if (this.I != 0) {
            viewById = this.findViewById(this.I);
        }
        else {
            viewById = null;
        }
        if (viewById != null) {
            this.a(viewById, (ToolBar$LayoutParams)viewById.getLayoutParams());
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int n5 = n4 - n2;
        int n6 = n3 - n;
        final int q = this.Q;
        int measuredWidth;
        if (this.x != null && this.x.getVisibility() != 8) {
            measuredWidth = this.x.getMeasuredWidth();
            this.x.layout(0, q, measuredWidth, n5);
        }
        else {
            measuredWidth = 0;
        }
        if (this.C != null) {
            this.C.layout(measuredWidth, q, n6, n5);
            return;
        }
        this.n.clear();
        if (this.E != null) {
            if (this.D) {
                final int measuredWidth2 = this.E.getMeasuredWidth();
                if (this.E.getParent() == null) {
                    this.addViewInLayout((View)this.E, this.getChildCount(), this.E.getLayoutParams(), true);
                }
                this.E.layout(n6 - measuredWidth2, q, n6, n5);
                n6 -= measuredWidth2;
            }
            else {
                this.a((View)this.E);
            }
        }
        this.w.clear();
        ArrayList list;
        if (this.N) {
            list = this.v;
        }
        else {
            list = this.u;
        }
        for (final jx jx : list) {
            final View a = this.a(jx);
            if (this.e(jx)) {
                this.a(jx, a);
            }
            else {
                this.w.add(jx);
            }
        }
        this.a(measuredWidth, q, n6, n5, this.f);
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 1073741824);
        final int measuredWidth = this.getMeasuredWidth();
        int measuredWidth2;
        if (this.x != null && this.x.getVisibility() != 8) {
            this.x.measure(View$MeasureSpec.makeMeasureSpec(measuredWidth, 0), measureSpec);
            measuredWidth2 = this.x.getMeasuredWidth();
        }
        else {
            measuredWidth2 = 0;
        }
        if (this.C != null) {
            this.C.measure(View$MeasureSpec.makeMeasureSpec(measuredWidth - measuredWidth2, 0), measureSpec);
        }
        else {
            final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
            final int n3 = measuredWidth - measuredWidth2;
            final Iterator<jx> iterator = this.t.values().iterator();
            int n4 = n3;
            boolean b = false;
            boolean b2 = false;
        Label_0293_Outer:
            while (iterator.hasNext()) {
                final jx jx = iterator.next();
                final int j = jx.j();
                boolean b3;
                if ((j & 0x2) != 0x0) {
                    b3 = true;
                }
                else {
                    b3 = false;
                }
                final boolean i = jx.i();
                boolean b4;
                if (i && (j == 0 || (jx.c() == 0 && !b3))) {
                    b4 = true;
                }
                else {
                    b4 = false;
                }
                b |= b4;
                boolean b5;
                if (!b3 && i) {
                    b5 = true;
                }
                else {
                    b5 = false;
                }
                b2 |= b5;
                final View a = this.a(jx);
                while (true) {
                    Label_0637: {
                        if (j == 0 || !i) {
                            break Label_0637;
                        }
                        a.setPadding(this.e, 0, this.e, 0);
                        a.measure(measureSpec2, measureSpec);
                        if (this.e(jx)) {
                            break Label_0637;
                        }
                        final int n5 = n4 - a.getMeasuredWidth();
                        n4 = n5;
                        continue Label_0293_Outer;
                    }
                    final int n5 = n4;
                    continue;
                }
            }
            if (this.K != null) {
                this.L = (n4 > 0);
                if (this.L) {
                    if (this.K.getParent() == null) {
                        this.addViewInLayout(this.K, -1 + this.getChildCount(), this.K.getLayoutParams());
                    }
                    this.K.measure(View$MeasureSpec.makeMeasureSpec(n4, Integer.MIN_VALUE), measureSpec);
                    n4 = 0;
                }
                else {
                    this.a(this.K);
                }
            }
            this.N = (n4 < 0);
            this.D = (b || (this.N && b2));
            if (this.D) {
                if (this.E == null) {
                    final ImageView e = new ImageView(this.getThemedContext());
                    e.setScaleType(ImageView$ScaleType.CENTER);
                    if (this.a != 0) {
                        e.setBackgroundResource(this.a);
                    }
                    e.setImageDrawable(this.g);
                    e.setOnClickListener((View$OnClickListener)new aj(this));
                    e.setId(la.overflow);
                    e.setLayoutParams(this.generateDefaultLayoutParams());
                    e.setPadding(this.e, 0, this.e, 0);
                    e.measure(measureSpec2, measureSpec);
                    if (this.r != null) {
                        e.setContentDescription((CharSequence)this.r);
                    }
                    this.E = e;
                }
                this.E.setVisibility(0);
                this.E.measure(measureSpec2, measureSpec);
                return;
            }
            if (this.E != null) {
                this.E.setVisibility(8);
            }
        }
    }
    
    public void setContentWidth(final int g) {
        final Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.H);
            this.G = g + (this.H.left + this.H.right);
            return;
        }
        this.G = g;
    }
    
    public void setCustomView(final View view) {
        this.a(view, null);
    }
    
    public void setDisplayFullExpandEnabled(final boolean z) {
        if (this.z == z) {
            return;
        }
        final ToolBarHomeView x = this.x;
        if (x != null && this.C != null) {
            if (z) {
                this.B = this.x.getVisibility();
                x.d(false);
                x.setVisibility(8);
            }
            else {
                x.setVisibility(this.B);
                x.d(true);
            }
        }
        this.z = z;
    }
    
    public void setDisplayOptions(final int m) {
        this.M = m;
        this.i();
    }
    
    public void setDisplayShowHomeAsUpEnabled(final boolean y) {
        if (this.y == y) {
            return;
        }
        if (this.x != null) {
            this.x.a(y);
        }
        this.y = y;
    }
    
    public void setDisplayShowTitleEnabled(final boolean b) {
        if (this.x != null) {
            this.x.b(b);
        }
    }
    
    public final void setIcon(final Drawable drawable) {
        if (drawable == null && this.x == null) {
            return;
        }
        this.h().a(drawable);
    }
    
    public void setNumber(final int n) {
        if (n <= 0 && this.x == null) {
            return;
        }
        this.h().b(n);
    }
    
    protected void setOffsetLayoutTopPx(final int q) {
        this.Q = q;
    }
    
    public void setOnToolBarItemSelectedListener(final aq s) {
        this.s = s;
    }
    
    public final void setPadding(final int n, final int n2, final int n3, final int n4) {
    }
    
    public final void setSubtitle(final CharSequence charSequence) {
        if (this.x == null) {
            return;
        }
        this.x.b(charSequence);
    }
    
    public void setThemeId(final int c) {
        if (this.c != c) {
            this.c = c;
            this.d = null;
            if (this.c > 0) {
                this.d = (Context)new ContextThemeWrapper(this.b, this.c);
            }
        }
    }
    
    public final void setTitle(final CharSequence charSequence) {
        if (charSequence == null && this.x == null) {
            return;
        }
        this.h().a(charSequence);
    }
    
    public final void setTitleDescription(final CharSequence charSequence) {
        if (this.x == null) {
            return;
        }
        this.x.c(charSequence);
    }
}
