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
import com.twitter.library.widget.ObservableScrollView;
import android.view.View;
import com.twitter.library.widget.ad;
import com.twitter.android.qj;
import com.twitter.android.client.bv;
import com.twitter.android.client.TwitterListFragment;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class ev implements ViewTreeObserver$OnGlobalLayoutListener
{
    final /* synthetic */ ScrollingHeaderListFragment a;
    
    ev(final ScrollingHeaderListFragment a) {
        this.a = a;
    }
    
    public void onGlobalLayout() {
        this.a.e();
        this.a.e.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
    }
}
