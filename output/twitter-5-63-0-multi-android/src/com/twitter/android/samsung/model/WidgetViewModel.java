// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.model;

import android.graphics.Bitmap;
import android.widget.RemoteViews;
import android.content.Context;

@Deprecated
public abstract class WidgetViewModel
{
    public abstract int a();
    
    public abstract void a(final Context p0, final RemoteViews p1, final int p2);
    
    public abstract void a(final Context p0, final RemoteViews p1, final Bitmap p2, final Bitmap p3);
    
    public String b() {
        return null;
    }
    
    public String c() {
        return null;
    }
    
    public abstract WidgetViewModel$ModelType d();
    
    public abstract long e();
}
