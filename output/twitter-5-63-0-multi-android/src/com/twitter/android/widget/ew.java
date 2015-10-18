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

class ew implements Runnable
{
    final /* synthetic */ ScrollingHeaderListFragment a;
    
    ew(final ScrollingHeaderListFragment a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.e.scrollTo(this.a.e.getScrollX(), -this.a.ak);
    }
}
