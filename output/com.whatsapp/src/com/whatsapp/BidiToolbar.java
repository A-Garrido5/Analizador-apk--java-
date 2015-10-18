// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewGroup$OnHierarchyChangeListener;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.internal.view.ActionBarPolicy;
import android.support.v7.widget.ActionMenuView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.Toolbar;

public class BidiToolbar extends Toolbar
{
    public BidiToolbar(final Context context) {
        super(context);
    }
    
    public BidiToolbar(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public BidiToolbar(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    private void a(final View view, final int n) {
        final boolean i = App.I;
        if (view instanceof ViewGroup && view.getId() != 2131755164) {
            final ViewGroup viewGroup = (ViewGroup)view;
            final int childCount = viewGroup.getChildCount();
            int j = 0;
            while (j < childCount) {
                final View child = viewGroup.getChildAt(j);
                child.layout(n - child.getRight(), child.getTop(), n - child.getLeft(), child.getBottom());
                this.a(child, child.getRight() - child.getLeft());
                ++j;
                if (i) {
                    break;
                }
            }
        }
    }
    
    public void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (view instanceof ActionMenuView && !ActionBarPolicy.get(this.getContext()).showsOverflowMenuButton() && (0xF & this.getResources().getConfiguration().screenLayout) != 0x4) {
            final ActionMenuView actionMenuView = (ActionMenuView)view;
            if (actionMenuView.getChildCount() > 0 && actionMenuView.getChildAt(0).getClass().getName().startsWith(ActionMenuPresenter.class.getName())) {
                actionMenuView.removeViewAt(0);
            }
            actionMenuView.setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)new kn(this, actionMenuView));
        }
        super.addView(view, viewGroup$LayoutParams);
    }
    
    @Override
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (App.W && !alm.c) {
            this.a((View)this, n3 - n);
        }
    }
}
