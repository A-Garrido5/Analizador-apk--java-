// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.support.v4.app.FragmentActivity;
import com.twitter.android.client.bz;
import android.os.Bundle;
import android.content.Context;
import android.database.Cursor;
import com.twitter.util.t;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.android.si;
import android.view.View;
import com.twitter.android.SelectionFragment;

public class ComposerSelectionFragment extends SelectionFragment
{
    ag k;
    View l;
    
    public ComposerSelectionFragment() {
        super(new af((ae)null));
    }
    
    @Override
    public void D_() {
        super.D_();
        if (this.k != null) {
            this.k.b();
        }
    }
    
    @Override
    protected View a(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        final View a = super.a(layoutInflater, 2130968694, viewGroup);
        this.l = a.findViewById(2131886591);
        this.l.findViewById(2131886581).setOnClickListener((View$OnClickListener)new ae(this));
        t.c(this.l);
        this.e.setEmptyView(a.findViewById(16908292));
        return a;
    }
    
    public void a(final DraggableDrawerLayout draggableDrawerLayout) {
        draggableDrawerLayout.setDrawerDraggable(true);
        draggableDrawerLayout.setDraggableBelowUpPosition(false);
        draggableDrawerLayout.setDispatchDragToChildren(true);
        draggableDrawerLayout.setExtendDrawerInUpState(true);
        draggableDrawerLayout.setFullScreenHeaderView(this.l);
    }
    
    public void a(final ag k) {
        this.k = k;
    }
    
    public void a(final dt dt) {
        if (this.d != null) {
            if (dt != null) {
                ((af)this.a).a(dt.b);
                this.a(dt.a, dt.a.length());
            }
            else {
                ((af)this.a).a(0);
                this.a("", 0);
            }
            this.d.b();
        }
    }
    
    public void a(final dt dt, final ln ln) {
        super.a(dt, ln);
        if (this.k != null) {
            this.k.a(dt, ln);
        }
    }
    
    public boolean a(final dt dt, final long n, final Cursor cursor) {
        final String a = cj.a(dt.b, cursor);
        this.d.clearFocus();
        if (this.k != null) {
            this.k.a(a, dt);
        }
        return true;
    }
    
    public void b() {
        this.d.requestFocus();
        t.a((Context)this.getActivity(), (View)this.d, true);
    }
    
    @Override
    protected boolean d() {
        return false;
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final FragmentActivity activity = this.getActivity();
        this.f = new cu((Context)activity, new dj((Context)activity, this.c.b(), bz.h(), "compose"));
        this.g = new cj((Context)activity);
    }
}
