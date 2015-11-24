// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.widget.RemoteViews;
import android.text.TextUtils;
import android.graphics.Bitmap;
import android.app.Notification;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.library.media.manager.UserImageRequest;
import com.twitter.library.media.manager.j;
import android.support.v4.app.NotificationCompat$Action;
import android.content.Context;
import com.twitter.library.platform.d;
import java.util.HashMap;
import android.os.Parcel;
import java.util.Arrays;
import com.twitter.library.platform.notifications.a;
import java.util.Map;
import java.util.List;
import android.os.Parcelable$Creator;

public class MagicRecFollowNotif extends MagicRecNotif
{
    public static final Parcelable$Creator CREATOR;
    private static final List f;
    private final Map g;
    
    static {
        CREATOR = (Parcelable$Creator)new q();
        f = Arrays.asList(a.a);
    }
    
    protected MagicRecFollowNotif(final Parcel parcel) {
        super(parcel);
        this.g = new HashMap();
    }
    
    public MagicRecFollowNotif(final d d, final long n, final String s) {
        super(d, n, s);
        this.g = new HashMap();
    }
    
    public static boolean a(final StatusBarNotif statusBarNotif) {
        return a(statusBarNotif.a);
    }
    
    public static boolean a(final d d) {
        return "magic_rec_user_7".equals(d.j) || "magic_rec_user_8".equals(d.j);
    }
    
    @Override
    protected CharSequence a(final Context context, final int n, final NotificationCompat$Action notificationCompat$Action) {
        if (n >= 0 && n < MagicRecFollowNotif.f.size() && MagicRecFollowNotif.f.get(n) == com.twitter.library.platform.notifications.a.a) {
            return context.getString(2131297236, new Object[] { this.a.v.b.b });
        }
        return super.a(context, n, notificationCompat$Action);
    }
    
    @Override
    protected String a(final j j) {
        final String f = this.a.v.b.f;
        if (f != null && this.g.get(f) == j) {
            return "user_header";
        }
        final String e = this.a.v.b.e;
        if (e != null && this.g.get(e) == j) {
            return "user_image";
        }
        return null;
    }
    
    @Override
    protected List a(final Context context) {
        final String f = this.a.v.b.f;
        if (f != null) {
            this.g.put(f, com.twitter.library.media.manager.j.a(f, MagicRecNotif.b(context)).a());
        }
        final String e = this.a.v.b.e;
        if (e != null) {
            this.g.put(e, UserImageRequest.a(e, context.getResources().getDimensionPixelSize(2131558761)).a());
        }
        return new ArrayList(this.g.values());
    }
    
    @TargetApi(16)
    @Override
    protected boolean a(final Context context, final Notification notification, final Map map, final Bitmap bitmap, final boolean b, final boolean b2) {
        if (b) {
            MagicRecNotif.a(notification, this.A());
        }
        Bitmap bitmap2;
        if (!TextUtils.isEmpty((CharSequence)this.a.v.b.e)) {
            bitmap2 = map.get(this.g.get(this.a.v.b.e));
        }
        else {
            bitmap2 = null;
        }
        final boolean b3 = bitmap2 != null;
        if (b2) {
            if (b3) {
                final Resources resources = context.getResources();
                final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2130968863);
                remoteViews.setImageViewBitmap(2131886915, bitmap2);
                notification.bigContentView.addView(resources.getIdentifier("actions", "id", "android"), remoteViews);
            }
            return b3;
        }
        return true;
    }
    
    @Override
    protected boolean b(final j j) {
        return this.g.get(this.a.v.b.f) == j;
    }
    
    @Override
    protected String n() {
        return this.A();
    }
    
    @Override
    protected List r() {
        return MagicRecFollowNotif.f;
    }
}
