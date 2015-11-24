// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.moments.ui.guide;

import android.content.Context;
import com.twitter.android.moments.ui.fullscreen.MomentsFullScreenPagerActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class b implements AdapterView$OnItemClickListener
{
    final /* synthetic */ GuideActivity a;
    
    b(final GuideActivity a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.a.startActivity(MomentsFullScreenPagerActivity.a((Context)this.a, gt.x));
    }
}
