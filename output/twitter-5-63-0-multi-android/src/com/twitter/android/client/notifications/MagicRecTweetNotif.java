// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import com.twitter.library.platform.notifications.a;
import android.annotation.TargetApi;
import android.content.res.Resources;
import android.widget.RemoteViews;
import android.text.TextUtils;
import android.graphics.Bitmap;
import android.app.Notification;
import com.twitter.internal.android.util.Size;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.library.media.manager.l;
import com.twitter.library.media.decoder.h;
import java.util.List;
import android.content.Context;
import com.twitter.library.media.manager.j;
import com.twitter.library.platform.d;
import java.util.HashMap;
import android.os.Parcel;
import java.util.Map;
import android.os.Parcelable$Creator;

public class MagicRecTweetNotif extends MagicRecNotif
{
    public static final Parcelable$Creator CREATOR;
    private final Map f;
    private final String g;
    private final String h;
    
    static {
        CREATOR = (Parcelable$Creator)new s();
    }
    
    protected MagicRecTweetNotif(final Parcel parcel) {
        super(parcel);
        this.f = new HashMap();
        this.g = this.a.u.e;
        String string;
        if (this.a.u.e != null) {
            string = this.a.u.e + "_UNTINTED";
        }
        else {
            string = null;
        }
        this.h = string;
    }
    
    public MagicRecTweetNotif(final d d, final long n, final String s) {
        super(d, n, s);
        this.f = new HashMap();
        this.g = d.u.e;
        String string;
        if (d.u.e != null) {
            string = d.u.e + "_UNTINTED";
        }
        else {
            string = null;
        }
        this.h = string;
    }
    
    public static boolean a(final StatusBarNotif statusBarNotif) {
        return a(statusBarNotif.a);
    }
    
    public static boolean a(final d d) {
        return "magic_rec_tweet_7".equals(d.j) || "magic_rec_tweet_8".equals(d.j);
    }
    
    @Override
    protected String a(final j j) {
        final String e = this.a.u.e;
        if (e != null && this.f.get(e) == j) {
            return "tweet_media";
        }
        return null;
    }
    
    @Override
    protected List a(final Context context) {
        final String e = this.a.u.e;
        if (e != null) {
            final Size b = MagicRecNotif.b(context);
            this.f.put(this.g, com.twitter.library.media.manager.j.a(e, b).a(new h(context.getResources().getColor(2131689477))).a());
            this.f.put(this.h, com.twitter.library.media.manager.j.a(e, b).a());
        }
        return new ArrayList(this.f.values());
    }
    
    @TargetApi(16)
    @Override
    protected boolean a(final Context context, final Notification notification, final Map map, final Bitmap bitmap, final boolean b, final boolean b2) {
        MagicRecNotif.a(notification, this.A());
        final Resources resources = context.getResources();
        if (b) {
            int n;
            if (!TextUtils.isEmpty((CharSequence)this.al_())) {
                n = 1;
            }
            else {
                n = 0;
            }
            int dimensionPixelOffset;
            if (n != 0) {
                dimensionPixelOffset = resources.getDimensionPixelOffset(2131558430);
            }
            else {
                dimensionPixelOffset = 0;
            }
            int dimensionPixelOffset2;
            if (b2) {
                dimensionPixelOffset2 = resources.getDimensionPixelOffset(2131558760);
            }
            else {
                dimensionPixelOffset2 = 0;
            }
            final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2130968862);
            remoteViews.setTextViewText(2131886914, (CharSequence)this.a.u.d);
            remoteViews.setViewPadding(2131886914, 0, dimensionPixelOffset, 0, dimensionPixelOffset2);
            notification.bigContentView.addView(resources.getIdentifier("status_bar_latest_event_content", "id", "android"), remoteViews);
            return true;
        }
        MagicRecNotif.b(resources, notification);
        return true;
    }
    
    @Override
    protected boolean b(final j j) {
        return this.f.get(this.g) == j;
    }
    
    @Override
    protected boolean c(final j j) {
        return this.f.get(this.h) == j;
    }
    
    @Override
    protected String n() {
        return this.a.u.d;
    }
    
    @Override
    protected List r() {
        return com.twitter.library.platform.notifications.a.b;
    }
}
