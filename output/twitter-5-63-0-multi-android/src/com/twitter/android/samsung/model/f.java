// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.model;

import android.graphics.Bitmap;
import android.widget.RemoteViews;
import android.content.Context;

@Deprecated
public class f extends WidgetViewModel
{
    @Override
    public int a() {
        return 2130969217;
    }
    
    @Override
    public void a(final Context context, final RemoteViews remoteViews, final int n) {
    }
    
    @Override
    public void a(final Context context, final RemoteViews remoteViews, final Bitmap bitmap, final Bitmap bitmap2) {
        remoteViews.setImageViewResource(2131887369, 2130839556);
        remoteViews.setViewVisibility(2131887369, 0);
        remoteViews.setTextViewText(2131887370, (CharSequence)context.getResources().getString(2131298272));
        remoteViews.setTextViewText(2131887371, (CharSequence)("@" + context.getResources().getString(2131298272)));
        remoteViews.setTextViewText(2131886199, (CharSequence)context.getResources().getString(2131297908));
        remoteViews.setImageViewResource(2131886973, 2130839557);
        remoteViews.setViewVisibility(2131887380, 8);
        remoteViews.setViewVisibility(2131887381, 8);
        remoteViews.setViewVisibility(2131887382, 8);
        remoteViews.setViewVisibility(2131887386, 8);
    }
    
    @Override
    public WidgetViewModel$ModelType d() {
        return WidgetViewModel$ModelType.c;
    }
    
    @Override
    public long e() {
        return 0L;
    }
}
