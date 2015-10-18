// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnClickListener;

public class UserApprovalView extends BaseUserView implements View$OnClickListener
{
    private c l;
    private bm m;
    private bm n;
    private ActionButton o;
    private boolean p;
    
    public UserApprovalView(final Context context, final AttributeSet set) {
        super(context, set);
        this.p = true;
    }
    
    private bm b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 0: {
                return this.m;
            }
            case 1: {
                return this.n;
            }
        }
    }
    
    public void a(final int n, final int backgroundResource) {
        Object o;
        if (n == 2) {
            o = this.o;
        }
        else {
            o = this.b(n).a;
        }
        if (backgroundResource > 0) {
            ((View)o).setBackgroundResource(backgroundResource);
            ((View)o).setPadding(this.a_, this.b, this.c, this.d);
        }
    }
    
    public void a(final int n, final int imageResource, final c l) {
        if (n == 2) {
            this.o.a(imageResource);
            this.o.setOnClickListener((View$OnClickListener)this);
            return;
        }
        final bm b = this.b(n);
        final ImageButton a = b.a;
        final FrameLayout b2 = b.b;
        if (imageResource == 0) {
            a.setVisibility(8);
            return;
        }
        a.setOnClickListener((View$OnClickListener)this);
        a.setImageResource(imageResource);
        a.setVisibility(0);
        b2.setOnClickListener((View$OnClickListener)this);
        this.l = l;
    }
    
    public void a(final int n, final boolean c) {
        final bm b = this.b(n);
        if (b == null) {
            return;
        }
        b.c = c;
        this.refreshDrawableState();
    }
    
    @Override
    public void a(final String username, final String s) {
        super.a(username, s);
        this.o.setUsername(username);
    }
    
    public boolean a(final int n) {
        if (n == 2) {
            return this.o.isChecked();
        }
        final bm b = this.b(n);
        return b != null && b.c;
    }
    
    public void b() {
        this.p = false;
    }
    
    public void c() {
        this.m.a.setVisibility(0);
        this.n.a.setVisibility(0);
        this.o.setVisibility(8);
    }
    
    public void d() {
        this.m.a.setVisibility(8);
        this.n.a.setVisibility(8);
        this.o.setVisibility(0);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.m.a.setImageState(this.getDrawableState(), true);
        this.n.a.setImageState(this.getDrawableState(), true);
    }
    
    public void g() {
        this.m.a.setVisibility(4);
        this.n.a.setVisibility(4);
        this.o.setVisibility(8);
    }
    
    public void onClick(final View view) {
        if (this.l != null) {
            final int id = view.getId();
            if (id == la.action_button_deny || id == la.action_button_deny_frame) {
                this.setState(2);
                this.g();
            }
            else if (id == la.action_button_accept || id == la.action_button_accept_frame) {
                this.setState(1);
                if (this.p) {
                    this.d();
                }
                else {
                    this.g();
                }
            }
            else if (id == la.action_button || id == la.action_button_frame) {
                this.a(0, true);
                this.a(1, false);
                this.o.toggle();
            }
            this.l.a(this, this.f, id);
        }
    }
    
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        final FrameLayout frameLayout = (FrameLayout)this.findViewById(la.action_button_accept_frame);
        this.m = new bm((ImageButton)frameLayout.getChildAt(0), frameLayout);
        final FrameLayout frameLayout2 = (FrameLayout)this.findViewById(la.action_button_deny_frame);
        this.n = new bm((ImageButton)frameLayout2.getChildAt(0), frameLayout2);
        this.o = (ActionButton)this.findViewById(la.action_button);
    }
    
    public void setState(final int n) {
        switch (n) {
            default: {
                this.a(0, false);
                this.a(1, false);
                this.o.setChecked(false);
            }
            case 1: {
                this.a(0, true);
                this.a(1, false);
                this.o.setChecked(false);
            }
            case 2: {
                this.a(0, false);
                this.a(1, true);
                this.o.setChecked(false);
            }
            case 3: {
                this.a(0, true);
                this.a(1, false);
                this.o.setChecked(true);
            }
        }
    }
}
