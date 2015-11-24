// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Build$VERSION;
import android.support.v4.app.Fragment;
import android.widget.ListView;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v4.view.ViewPager;

public class HomeActivity$TabsPager extends ViewPager
{
    private boolean b;
    
    public HomeActivity$TabsPager(final Context context, final AttributeSet set) {
        super(context, set);
        this.b = true;
    }
    
    @Override
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return this.b && super.onInterceptTouchEvent(motionEvent);
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return this.b && super.onTouchEvent(motionEvent);
    }
    
    @Override
    public void setCurrentItem(final int currentItem) {
        if (currentItem == this.getCurrentItem()) {
            final HomeActivity homeActivity = (HomeActivity)this.getContext();
            final ga b = HomeActivity.b(homeActivity, currentItem);
            if (b != null) {
                final ListView listView = (ListView)((Fragment)b).getView().findViewById(16908298);
                if (listView != null) {
                    Label_0084: {
                        if (Build$VERSION.SDK_INT >= 8 && listView.getFirstVisiblePosition() < 8) {
                            listView.smoothScrollToPosition(0);
                            if (!App.I) {
                                break Label_0084;
                            }
                        }
                        listView.setSelection(0);
                    }
                    HomeActivity.j(homeActivity);
                }
            }
        }
        super.setCurrentItem(currentItem);
    }
}
