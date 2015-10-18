// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v7.widget.ActionMenuPresenter;
import android.view.View;
import android.support.v7.widget.ActionMenuView;
import android.view.ViewGroup$OnHierarchyChangeListener;

class kn implements ViewGroup$OnHierarchyChangeListener
{
    final ActionMenuView a;
    final BidiToolbar b;
    
    kn(final BidiToolbar b, final ActionMenuView a) {
        this.b = b;
        this.a = a;
    }
    
    public void onChildViewAdded(final View view, final View view2) {
        if (view2.getClass().getName().startsWith(ActionMenuPresenter.class.getName())) {
            this.a.removeView(view2);
        }
    }
    
    public void onChildViewRemoved(final View view, final View view2) {
    }
}
