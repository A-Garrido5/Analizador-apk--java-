// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.model;

import com.twitter.library.api.MediaEntity;
import android.graphics.Bitmap;
import com.twitter.android.samsung.single.i;
import android.widget.RemoteViews;
import android.content.Context;
import android.os.Parcelable;
import android.os.Bundle;
import android.content.Intent;
import com.twitter.android.samsung.single.FlipperViewsFactory$FlipperClickType;
import com.twitter.library.provider.Tweet;

@Deprecated
public class a extends WidgetViewModel
{
    private Tweet a;
    
    private Intent a(final FlipperViewsFactory$FlipperClickType flipperViewsFactory$FlipperClickType, final int n) {
        final Bundle bundle = new Bundle();
        bundle.putParcelable("tweet", (Parcelable)this.a);
        bundle.putInt("appWidgetId", n);
        bundle.putInt("clickType", flipperViewsFactory$FlipperClickType.ordinal());
        final Intent intent = new Intent();
        intent.putExtras(bundle);
        return intent;
    }
    
    @Override
    public int a() {
        return 2130969217;
    }
    
    @Override
    public void a(final Context context, final RemoteViews remoteViews, final int n) {
        final Long b = i.b(context, n);
        if (b != null) {
            b;
            remoteViews.setOnClickFillInIntent(2131887369, this.a(FlipperViewsFactory$FlipperClickType.a, n));
            remoteViews.setOnClickFillInIntent(2131886881, this.a(FlipperViewsFactory$FlipperClickType.b, n));
            remoteViews.setOnClickFillInIntent(2131887383, this.a(FlipperViewsFactory$FlipperClickType.c, n));
            remoteViews.setOnClickFillInIntent(2131887384, this.a(FlipperViewsFactory$FlipperClickType.d, n));
            remoteViews.setOnClickFillInIntent(2131887385, this.a(FlipperViewsFactory$FlipperClickType.e, n));
            remoteViews.setOnClickFillInIntent(2131886973, this.a(FlipperViewsFactory$FlipperClickType.f, n));
            remoteViews.setOnClickFillInIntent(2131887370, this.a(FlipperViewsFactory$FlipperClickType.f, n));
            remoteViews.setOnClickFillInIntent(2131887371, this.a(FlipperViewsFactory$FlipperClickType.f, n));
            remoteViews.setOnClickFillInIntent(2131886199, this.a(FlipperViewsFactory$FlipperClickType.a, n));
            if (this.a.h) {
                remoteViews.setInt(2131887383, "setImageResource", 2130839549);
            }
            else {
                remoteViews.setInt(2131887383, "setImageResource", 2130839548);
            }
            if (!this.a.e) {
                remoteViews.setInt(2131887384, "setImageResource", 2130839544);
                return;
            }
            remoteViews.setInt(2131887384, "setImageResource", 2130839545);
        }
    }
    
    @Override
    public void a(final Context context, final RemoteViews remoteViews, final Bitmap bitmap, final Bitmap bitmap2) {
        remoteViews.setTextViewText(2131887370, (CharSequence)this.a.M);
        remoteViews.setTextViewText(2131887371, (CharSequence)("@" + this.a.F));
        remoteViews.setTextViewText(2131886199, (CharSequence)this.a.c());
        remoteViews.setViewVisibility(2131887380, 8);
        remoteViews.setViewVisibility(2131887381, 0);
        remoteViews.setViewVisibility(2131887382, 0);
        if (bitmap != null) {
            remoteViews.setViewVisibility(2131887369, 0);
            remoteViews.setImageViewBitmap(2131887369, bitmap);
        }
        if (bitmap2 != null) {
            remoteViews.setViewVisibility(2131886973, 0);
            remoteViews.setImageViewBitmap(2131886973, bitmap2);
        }
    }
    
    public void a(final Tweet a) {
        this.a = a;
    }
    
    @Override
    public String b() {
        final MediaEntity q = this.a.Q();
        if (q != null) {
            return q.mediaUrl;
        }
        return null;
    }
    
    @Override
    public String c() {
        return this.a.B;
    }
    
    @Override
    public WidgetViewModel$ModelType d() {
        return WidgetViewModel$ModelType.d;
    }
    
    @Override
    public long e() {
        return this.a.Q;
    }
}
