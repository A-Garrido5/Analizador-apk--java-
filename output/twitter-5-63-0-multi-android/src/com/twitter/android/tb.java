// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.widget.eb;
import com.twitter.library.featureswitch.d;
import com.twitter.android.widget.PinnedHeaderRefreshableListView;
import com.twitter.library.media.manager.j;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ListView;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import com.twitter.library.media.widget.MediaImageView;
import android.widget.TextView;
import android.view.View;
import android.content.Context;
import com.twitter.library.client.k;
import com.twitter.android.client.c;
import android.view.View$OnClickListener;
import android.widget.RelativeLayout;
import com.twitter.library.util.bk;
import android.os.Handler;

class tb implements Runnable
{
    boolean a;
    final /* synthetic */ SubheaderView b;
    private final Handler c;
    private int d;
    private int e;
    private long f;
    
    tb(final SubheaderView b, final Handler c) {
        this.b = b;
        this.c = c;
    }
    
    private void a(final int n) {
        if (!this.a) {
            this.a = true;
            this.e = this.b.y;
            this.d = this.e - n;
            this.f = bk.a();
            this.c.post((Runnable)this);
        }
    }
    
    @Override
    public void run() {
        final long n = bk.a() - this.f;
        float n2;
        if (n >= 200.0f) {
            n2 = 1.0f;
        }
        else {
            n2 = n / 200.0f;
        }
        this.b.b(this.e - (int)(n2 * this.d));
        if (n2 >= 1.0f) {
            this.a = false;
            return;
        }
        this.c.post((Runnable)this);
    }
}
