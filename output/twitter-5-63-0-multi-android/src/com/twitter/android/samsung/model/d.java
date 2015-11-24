// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.model;

import android.graphics.Bitmap;
import com.twitter.android.samsung.single.n;
import android.widget.RemoteViews;
import android.content.Context;

@Deprecated
public class d extends WidgetViewModel
{
    private static long a;
    private long b;
    
    static {
        d.a = -1L;
    }
    
    public d() {
        this.b = -1L;
        final long a = d.a;
        d.a = a - 1L;
        this.b = a;
    }
    
    @Override
    public int a() {
        return 2130969221;
    }
    
    @Override
    public void a(final Context context, final RemoteViews remoteViews, final int n) {
        remoteViews.setOnClickFillInIntent(2131887390, n.a(n));
        remoteViews.setOnClickFillInIntent(2131887389, n.b(n));
    }
    
    @Override
    public void a(final Context context, final RemoteViews remoteViews, final Bitmap bitmap, final Bitmap bitmap2) {
    }
    
    @Override
    public WidgetViewModel$ModelType d() {
        return WidgetViewModel$ModelType.a;
    }
    
    @Override
    public long e() {
        return this.b;
    }
}
