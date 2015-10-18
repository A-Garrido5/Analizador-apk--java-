// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.model;

import com.twitter.library.api.MediaEntity;
import com.twitter.library.api.TweetEntities;
import com.twitter.library.media.util.q;
import com.twitter.library.api.MediaEntity$Type;
import com.twitter.library.api.bp;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import android.content.Context;
import android.os.Parcelable;
import com.twitter.library.provider.ad;
import org.json.JSONException;
import org.json.JSONObject;
import com.twitter.android.samsung.single.FlipperViewsFactory$FlipperClickType;
import android.os.Bundle;
import android.content.Intent;

@Deprecated
public class b extends WidgetViewModel
{
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private long f;
    private long g;
    private String h;
    private String i;
    private long j;
    
    private Intent a(final int n) {
        final Bundle bundle = new Bundle();
        bundle.putInt("clickType", FlipperViewsFactory$FlipperClickType.i.ordinal());
        bundle.putInt("appWidgetId", n);
        final Intent intent = new Intent();
        intent.putExtras(bundle);
        return intent;
    }
    
    public static b a(final JSONObject jsonObject) {
        final b b = new b();
        try {
            b.a = jsonObject.getString("name");
            b.b = jsonObject.getString("username");
            b.c = jsonObject.getString("originalStatusName");
            b.d = jsonObject.getString("originalStatusUsername");
            b.e = jsonObject.getString("content");
            b.f = jsonObject.getLong("createdAt");
            b.g = jsonObject.getLong("originalStatusId");
            b.h = jsonObject.getString("imageUrl");
            b.i = jsonObject.getString("profileImageUrl");
            b.j = jsonObject.getLong("id");
            return b;
        }
        catch (JSONException ex) {
            return b;
        }
    }
    
    private Intent b(final int n) {
        final Bundle bundle = new Bundle();
        bundle.putParcelable("tweet", (Parcelable)new ad().d(this.c).f(this.d).a(this.e).a(this.f).c(this.g).a());
        bundle.putInt("appWidgetId", n);
        bundle.putInt("clickType", FlipperViewsFactory$FlipperClickType.e.ordinal());
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
        remoteViews.setOnClickFillInIntent(2131887380, this.b(n));
        remoteViews.setOnClickFillInIntent(2131887369, this.a(n));
    }
    
    @Override
    public void a(final Context context, final RemoteViews remoteViews, final Bitmap bitmap, final Bitmap bitmap2) {
        remoteViews.setTextViewText(2131887370, (CharSequence)this.a);
        remoteViews.setTextViewText(2131887371, (CharSequence)("@" + this.b));
        remoteViews.setTextViewText(2131886199, (CharSequence)this.e);
        remoteViews.setViewVisibility(2131887380, 0);
        remoteViews.setViewVisibility(2131887381, 8);
        remoteViews.setViewVisibility(2131887382, 8);
    }
    
    public void a(final bp bp) {
        this.a = bp.y.name;
        this.b = bp.y.username;
        this.e = bp.c().d;
        this.c = bp.c().y.name;
        this.d = bp.c().y.username;
        this.f = bp.f;
        this.g = bp.c().a;
        final TweetEntities c = bp.c().c;
        this.h = null;
        if (!c.media.c()) {
            final MediaEntity a = q.a(c.media, MediaEntity$Type.b);
            if (a != null) {
                this.h = a.mediaUrl;
            }
        }
        this.i = bp.c().y.profileImageUrl;
        this.j = bp.a;
    }
    
    @Override
    public String b() {
        return this.h;
    }
    
    @Override
    public String c() {
        return this.i;
    }
    
    @Override
    public WidgetViewModel$ModelType d() {
        return WidgetViewModel$ModelType.e;
    }
    
    @Override
    public long e() {
        return this.j;
    }
    
    public JSONObject f() {
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("name", (Object)this.a);
            jsonObject.put("username", (Object)this.b);
            jsonObject.put("originalStatusName", (Object)this.c);
            jsonObject.put("originalStatusUsername", (Object)this.d);
            jsonObject.put("content", (Object)this.e);
            jsonObject.put("createdAt", this.f);
            jsonObject.put("originalStatusId", this.g);
            jsonObject.put("imageUrl", (Object)this.h);
            jsonObject.put("profileImageUrl", (Object)this.i);
            jsonObject.put("id", this.j);
            return jsonObject;
        }
        catch (JSONException ex) {
            return jsonObject;
        }
    }
}
