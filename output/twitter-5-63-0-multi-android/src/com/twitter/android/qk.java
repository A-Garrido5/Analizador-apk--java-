// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.ListView;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.AdapterView;
import java.util.Iterator;
import android.content.res.TypedArray;
import android.view.animation.AnimationUtils;
import android.graphics.Rect;
import com.twitter.library.widget.StatusToolBar;
import android.widget.ListAdapter;
import android.support.v4.app.Fragment;
import android.graphics.drawable.Drawable;
import android.content.Context;
import com.twitter.android.util.bc;
import android.graphics.Paint;
import android.graphics.Canvas;
import com.twitter.library.media.util.m;
import android.graphics.Bitmap$Config;
import android.graphics.Matrix;
import com.twitter.internal.android.util.Size;
import android.graphics.Bitmap;
import com.twitter.android.client.TwitterListFragment;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.support.v4.view.PagerAdapter;
import java.util.Collection;
import java.util.Collections;
import com.twitter.internal.android.widget.ToolBar;
import android.content.res.Resources;
import com.twitter.android.widget.fc;
import com.twitter.android.widget.SwipeRefreshObserverLayout;
import com.twitter.android.widget.SwipeProgressBarView;
import com.twitter.internal.android.widget.HorizontalListView;
import com.twitter.android.widget.UnboundedFrameLayout;
import android.support.v4.view.ViewPager;
import java.util.List;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import com.twitter.android.widget.InterceptingRelativeLayout;
import com.twitter.android.widget.ge;
import com.twitter.android.widget.fd;
import com.twitter.android.widget.cy;
import android.widget.AdapterView$OnItemClickListener;
import com.twitter.android.client.TwitterFragmentActivity;
import android.os.Message;
import java.lang.ref.WeakReference;
import android.os.Handler;

class qk extends Handler
{
    private final WeakReference a;
    
    public qk(final ScrollingHeaderActivity scrollingHeaderActivity) {
        this.a = new WeakReference((T)scrollingHeaderActivity);
    }
    
    public void handleMessage(final Message message) {
        final ScrollingHeaderActivity scrollingHeaderActivity = (ScrollingHeaderActivity)this.a.get();
        if (scrollingHeaderActivity != null) {
            if (message.what == 1) {
                scrollingHeaderActivity.a(false);
            }
            else if (message.what == 2) {
                scrollingHeaderActivity.h();
            }
        }
    }
}
