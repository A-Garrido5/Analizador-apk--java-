// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.View$MeasureSpec;
import com.twitter.util.c;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.client.bk;
import com.twitter.library.view.ScrollingMarqueeTextView;
import android.view.View;
import com.twitter.library.client.bl;
import android.view.View$OnClickListener;
import com.twitter.internal.android.widget.ToolBar;

class an implements Runnable
{
    final /* synthetic */ boolean a;
    final /* synthetic */ StatusToolBar b;
    
    an(final StatusToolBar b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.b(this.a);
    }
}
