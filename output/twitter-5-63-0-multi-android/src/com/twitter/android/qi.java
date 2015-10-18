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
import android.os.Handler;
import com.twitter.android.widget.ge;
import com.twitter.android.widget.fd;
import com.twitter.android.widget.cy;
import android.widget.AdapterView$OnItemClickListener;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.android.util.t;
import com.twitter.library.util.bq;
import com.twitter.android.util.r;
import android.graphics.Bitmap;
import android.os.AsyncTask;

public class qi extends AsyncTask
{
    final /* synthetic */ ScrollingHeaderActivity a;
    private boolean b;
    
    public qi(final ScrollingHeaderActivity a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    protected void a(final int[] array) {
        int n = 0;
        if (array != null) {
            for (int i = 0; i < 4; ++i) {
                if (array[i] != 0) {
                    this.a.F[i] = array[i];
                    ++n;
                }
            }
        }
        if (n > 0) {
            this.a.r.setColorScheme(this.a.F);
        }
        this.a.b(n);
    }
    
    protected int[] a(final Bitmap... array) {
        int n = 0;
        int[] array2;
        if (array == null || (!this.b && array.length != 1) || (this.b && array.length != 2)) {
            array2 = null;
        }
        else {
            while (true) {
                array2 = new int[4];
                while (true) {
                    int n2;
                    try {
                        final int length = array.length;
                        n2 = 0;
                        if (n >= length) {
                            break;
                        }
                        final Bitmap bitmap = array[n];
                        if (bitmap != null) {
                            if (this.b) {
                                final int[] b = r.b(bitmap);
                                if (b != null) {
                                    array2[n2] = b[0];
                                    array2[n2 + 1] = b[1];
                                }
                            }
                            else {
                                final t a = r.a(bitmap);
                                if (a != null) {
                                    array2[n2] = a.a;
                                    array2[n2 + 1] = a.b;
                                    array2[n2 + 2] = a.c;
                                    array2[n2 + 3] = a.d;
                                }
                            }
                        }
                    }
                    catch (OutOfMemoryError outOfMemoryError) {
                        bq.a(outOfMemoryError);
                        return array2;
                    }
                    n2 += 2;
                    ++n;
                    continue;
                }
            }
        }
        return array2;
    }
}
