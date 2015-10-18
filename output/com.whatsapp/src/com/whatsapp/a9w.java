// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.util.undobar.UndoBarController;
import android.widget.AbsListView;
import android.widget.AbsListView$OnScrollListener;

class a9w implements AbsListView$OnScrollListener
{
    final ConversationsFragment a;
    
    a9w(final ConversationsFragment a) {
        this.a = a;
    }
    
    public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
    }
    
    public void onScrollStateChanged(final AbsListView absListView, final int n) {
        if (n != 0) {
            UndoBarController.b(this.a.getActivity());
        }
    }
}
