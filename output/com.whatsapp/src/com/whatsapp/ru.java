// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import com.whatsapp.observablescrollview.ObservableListView;
import com.whatsapp.notification.w;
import android.support.v4.view.ViewPager$SimpleOnPageChangeListener;

class ru extends ViewPager$SimpleOnPageChangeListener
{
    final HomeActivity a;
    
    ru(final HomeActivity a) {
        this.a = a;
    }
    
    @Override
    public void onPageSelected(final int n) {
        final boolean i = App.I;
        super.onPageSelected(n);
        HomeActivity.a(this.a, true);
        HomeActivity.a(this.a, n);
        HomeActivity.e(this.a);
        this.a.supportInvalidateOptionsMenu();
        if (HomeActivity.h(this.a) == 0) {
            w.b().c();
        }
        final ObservableListView d = HomeActivity.d(this.a);
        int n4;
        if (d != null && d.getChildCount() > 0) {
            final int height = this.a.findViewById(2131755396).getHeight();
            int n2;
            if (d.getFirstVisiblePosition() <= 0 || i) {
                n2 = -d.getChildAt(0).getTop();
            }
            else {
                n2 = height;
            }
            final View child = d.getChildAt(-1 + d.getChildCount());
            int n3;
            if (child.getBottom() > d.getBottom()) {
                n3 = child.getBottom() - d.getBottom();
            }
            else {
                n3 = 0;
            }
            if (n2 + n3 >= height) {
                n4 = 1;
            }
            else {
                n4 = 0;
            }
        }
        else {
            n4 = 0;
        }
        if (n4 == 0) {
            HomeActivity.j(this.a);
            if (!i) {
                return;
            }
        }
        if (HomeActivity.a(this.a)) {
            if (d.c() <= 0) {
                return;
            }
            d.setSelection(0);
            if (!i) {
                return;
            }
        }
        if (d.c() < HomeActivity.c(this.a).getHeight()) {
            d.setSelection(1);
        }
    }
}
