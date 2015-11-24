// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import com.twitter.android.client.ag;
import com.twitter.library.platform.notifications.NotificationContextUser;
import java.util.Iterator;
import android.support.v4.app.NotificationCompat$BigPictureStyle;
import android.support.v4.app.NotificationCompat$Style;
import android.support.v4.app.NotificationCompat$BigTextStyle;
import com.twitter.util.t;
import android.view.WindowManager;
import com.twitter.internal.android.util.Size;
import android.support.v4.app.NotificationCompat$Action;
import java.util.Collection;
import com.twitter.library.experiments.c;
import android.support.v4.app.NotificationCompat$Builder;
import com.twitter.android.client.ae;
import com.twitter.android.client.ab;
import com.twitter.android.client.x;
import com.twitter.library.scribe.ScribeService;
import com.twitter.util.q;
import android.widget.RemoteViews;
import android.content.Context;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.app.Notification;
import com.twitter.library.media.manager.UserImageRequest;
import com.twitter.library.media.manager.j;
import android.content.res.Resources;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import android.app.PendingIntent;
import com.twitter.library.platform.d;
import java.util.ArrayList;
import java.util.HashMap;
import android.os.Parcel;
import android.util.Log;
import com.twitter.library.client.App;
import android.graphics.Bitmap;
import java.util.List;
import java.util.Map;

public abstract class MagicRecNotif extends GenericNotif
{
    private static final boolean f;
    private final Map g;
    private final Map h;
    private final Object i;
    private final List j;
    private Bitmap k;
    private int l;
    
    static {
        f = (App.l() && Log.isLoggable("MagicRecNotif", 3));
    }
    
    protected MagicRecNotif(final Parcel parcel) {
        super(parcel);
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new Object();
        this.j = new ArrayList();
        this.l = 0;
    }
    
    public MagicRecNotif(final d d, final long n, final String s) {
        super(d, n, s);
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new Object();
        this.j = new ArrayList();
        this.l = 0;
    }
    
    private PendingIntent a(final int n, final String w) {
        final TwitterScribeLog k = this.K();
        final TwitterScribeLog l = this.L();
        final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
        twitterScribeItem.w = w;
        if (k != null) {
            k.a(twitterScribeItem);
        }
        if (l != null) {
            l.a(twitterScribeItem);
        }
        return this.a(n, k, l);
    }
    
    private static j a(final Resources resources, final String s, final int n) {
        int n2;
        if (n > 1) {
            n2 = 2131558754;
        }
        else {
            n2 = 2131558756;
        }
        return UserImageRequest.a(s, resources.getDimensionPixelSize(n2)).a();
    }
    
    @TargetApi(16)
    static void a(final Notification notification) {
        if (notification.largeIcon != null) {
            notification.contentView.setInt(16908294, "setBackgroundResource", 0);
            if (Build$VERSION.SDK_INT >= 16) {
                notification.bigContentView.setInt(16908294, "setBackgroundResource", 0);
            }
        }
    }
    
    @TargetApi(16)
    protected static void a(final Notification notification, final String s) {
        notification.bigContentView.setBoolean(16908309, "setSingleLine", false);
        notification.bigContentView.setInt(16908309, "setMaxLines", 2);
        notification.bigContentView.setTextViewText(16908309, (CharSequence)s);
        notification.bigContentView.setViewVisibility(16908309, 0);
    }
    
    static void a(final Context context, final Notification notification, final Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        final RemoteViews contentView = new RemoteViews(context.getPackageName(), 2130968861);
        contentView.addView(2131886912, notification.contentView);
        contentView.setImageViewBitmap(2131886913, bitmap);
        if (Build$VERSION.SDK_INT <= 19) {
            contentView.setInt(context.getResources().getIdentifier("status_bar_latest_event_content", "id", "android"), "setBackgroundResource", 0);
        }
        notification.contentView = contentView;
    }
    
    @TargetApi(16)
    static void a(final Resources resources, final Notification notification, final String s, final boolean b) {
        if (!q.a(s)) {
            final int identifier = resources.getIdentifier("line3", "id", "android");
            final int identifier2 = resources.getIdentifier("text", "id", "android");
            notification.contentView.setViewVisibility(identifier, 8);
            if (b) {
                if (Build$VERSION.SDK_INT >= 21) {
                    notification.bigContentView.setViewVisibility(identifier, 8);
                    return;
                }
                final int dimensionPixelOffset = resources.getDimensionPixelOffset(2131558764);
                final int dimensionPixelOffset2 = resources.getDimensionPixelOffset(2131558763);
                final int color = resources.getColor(2131689476);
                notification.bigContentView.setViewPadding(identifier, 0, dimensionPixelOffset, 0, dimensionPixelOffset2);
                notification.bigContentView.setTextColor(identifier2, color);
            }
        }
    }
    
    public static void a(final StatusBarNotif statusBarNotif, final Context context, final String s, final String w) {
        final TwitterScribeLog a = statusBarNotif.a(s);
        if (a != null) {
            if (w != null) {
                final TwitterScribeItem twitterScribeItem = new TwitterScribeItem();
                twitterScribeItem.w = w;
                a.a(twitterScribeItem);
            }
            if (MagicRecNotif.f) {
                Log.d("MagicRecNotif", "Scribing: " + a);
            }
            ScribeService.a(context, a);
        }
    }
    
    private void a(final x x, final j j) {
        while (true) {
            while (true) {
                synchronized (this.i) {
                    final Bitmap a = x.a(j, new ab(this.w(), false));
                    this.g.put(j, a);
                    boolean b = false;
                    if (a != null) {
                        b = true;
                    }
                    this.h.put(j, b);
                    if (b) {
                        final String s = "image_downloaded";
                        String a2;
                        if (this.j.contains(j)) {
                            a2 = "user_image";
                        }
                        else {
                            a2 = this.a(j);
                        }
                        a(this, this.e, s, a2);
                        return;
                    }
                }
                final String s = "image_queued";
                continue;
            }
        }
    }
    
    private NotificationCompat$Builder b(final Context context, final ae ae) {
        final NotificationCompat$Builder setAutoCancel = new NotificationCompat$Builder(context).setSmallIcon(2130839309).setColor(context.getResources().getColor(2131689615)).setContentTitle(this.B()).setContentText(this.A()).setTicker(this.C()).setSubText(this.al_()).setAutoCancel(true);
        if (com.twitter.library.experiments.c.d()) {
            setAutoCancel.setPriority(2);
        }
        if (com.twitter.library.experiments.c.e()) {
            (this.a.w = new ArrayList()).addAll(this.r());
            final ArrayList n = this.N();
            for (int i = 0; i < n.size(); ++i) {
                final NotificationCompat$Action notificationCompat$Action = n.get(i);
                setAutoCancel.addAction(notificationCompat$Action.icon, this.a(context, i, notificationCompat$Action), notificationCompat$Action.actionIntent);
            }
        }
        else {
            this.a.w = null;
        }
        StatusBarNotif.a(context, setAutoCancel, ae);
        return setAutoCancel;
    }
    
    static Size b(final Context context) {
        return Size.a(t.a((WindowManager)context.getSystemService("window")).x);
    }
    
    @TargetApi(16)
    static void b(final Resources resources, final Notification notification) {
        final int identifier = resources.getIdentifier("big_text", "id", "android");
        notification.bigContentView.setViewPadding(identifier, 0, resources.getDimensionPixelOffset(2131558758), 0, resources.getDimensionPixelOffset(2131558757));
        notification.bigContentView.setTextViewTextSize(identifier, 2, (float)resources.getInteger(2131623967));
        notification.bigContentView.setInt(identifier, "setMaxLines", 4);
        notification.bigContentView.setTextColor(identifier, resources.getColor(2131689478));
    }
    
    Notification a(final Context context, final ae ae) {
        final Notification build = this.b(context, ae).setStyle(new NotificationCompat$BigTextStyle().bigText(this.A())).build();
        final Resources resources = context.getResources();
        a(resources, build, this.al_(), false);
        this.a(resources, build);
        build.deleteIntent = this.M();
        return build;
    }
    
    Notification a(final Context context, final ae ae, final Map map, final Bitmap largeIcon) {
        boolean b = true;
        final Iterator<j> iterator = map.keySet().iterator();
        j j = null;
        Object o = null;
        boolean b2 = false;
        while (iterator.hasNext()) {
            j i = iterator.next();
            if (map.get(i) != null) {
                b2 = b;
            }
            if (this.b(i)) {
                o = i;
            }
            if (!this.c(i)) {
                i = j;
            }
            if (o != null && i != null) {
                j = i;
                break;
            }
            j = i;
        }
        final boolean b3 = largeIcon != null && b;
        if (!b2 && !b3 && b) {
            this.l = 3;
            a(this, context, "preload_abort", null);
            return null;
        }
        Bitmap bitmap;
        if (o != null) {
            bitmap = (Bitmap)map.get(o);
        }
        else {
            bitmap = null;
        }
        final boolean b4 = bitmap != null && b;
        Bitmap bitmap2;
        if (j != null) {
            bitmap2 = (Bitmap)map.get(j);
        }
        else {
            bitmap2 = null;
        }
        final boolean b5 = bitmap2 != null && b;
        final String n = this.n();
        final NotificationCompat$Builder setLargeIcon = this.b(context, ae).setLargeIcon(largeIcon);
        NotificationCompat$Style style;
        if (b4) {
            style = new NotificationCompat$BigPictureStyle().bigPicture(bitmap);
        }
        else {
            style = new NotificationCompat$BigTextStyle().bigText(n);
        }
        final Notification build = setLargeIcon.setStyle(style).build();
        a(build);
        a(context, build, bitmap2);
        final Resources resources = context.getResources();
        a(resources, build, this.al_(), b4);
        this.a(resources, build);
        build.deleteIntent = this.M();
        final boolean a = this.a(context, build, map, largeIcon, b4, com.twitter.library.experiments.c.e());
        if (!b3 || !b5 || !b4 || !a) {
            b = false;
        }
        int l;
        if (b) {
            l = 5;
        }
        else {
            l = 4;
        }
        this.l = l;
        return build;
    }
    
    @Override
    public final Notification a(final Context context, final x x, final ae ae, final Bitmap bitmap) {
        Resources resources = null;
    Label_0100_Outer:
        while (true) {
            resources = context.getResources();
            while (true) {
                Label_0425: {
                    while (true) {
                        int n2 = 0;
                        Label_0418: {
                            final int n;
                            Label_0414: {
                                synchronized (this.i) {
                                    this.c(context);
                                    if (this.l == 0) {
                                        this.l = 1;
                                        final List a = this.a(context);
                                        if (a == null) {
                                            break Label_0425;
                                        }
                                        final Iterator<j> iterator = a.iterator();
                                        n = 0;
                                        if (iterator.hasNext()) {
                                            final j j = iterator.next();
                                            this.a(x, j);
                                            if (this.b(j)) {
                                                n2 = 1;
                                                break Label_0418;
                                            }
                                            break Label_0414;
                                        }
                                        else {
                                            if (n == 0) {
                                                a(this, context, "no_image", null);
                                            }
                                            final List d = this.a.v.d;
                                            if (d != null) {
                                                final int size = d.size();
                                                final Iterator<NotificationContextUser> iterator2 = d.iterator();
                                                while (iterator2.hasNext()) {
                                                    final j a2 = a(resources, iterator2.next().b, size);
                                                    this.j.add(a2);
                                                    this.a(x, a2);
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            n2 = n;
                        }
                        int n = n2;
                        continue Label_0100_Outer;
                    }
                }
                int n = 0;
                continue;
            }
        }
        // monitorexit(o)
        if (this.t()) {
            int n3;
            if (this.l >= 2) {
                n3 = 1;
            }
            else {
                n3 = 0;
            }
            this.l = 2;
            if (n3 == 0) {
                final boolean empty = this.j.isEmpty();
                boolean b = false;
                if (!empty) {
                    final ArrayList<Bitmap> list = new ArrayList<Bitmap>();
                    for (int i = -1 + this.j.size(); i >= 0; --i) {
                        final Bitmap bitmap2 = this.g.get(this.j.get(i));
                        if (bitmap2 != null) {
                            list.add(bitmap2);
                        }
                    }
                    final boolean empty2 = list.isEmpty();
                    b = false;
                    if (!empty2) {
                        x.a(new r(x, this, resources, list), ae);
                        b = true;
                    }
                }
                if (b) {
                    return null;
                }
            }
            return this.a(context, ae, this.g, this.k);
        }
        return this.a(context, ae);
    }
    
    protected CharSequence a(final Context context, final int n, final NotificationCompat$Action notificationCompat$Action) {
        return notificationCompat$Action.title;
    }
    
    protected abstract String a(final j p0);
    
    protected abstract List a(final Context p0);
    
    @TargetApi(16)
    protected void a(final Resources resources, final Notification notification) {
        final int identifier = resources.getIdentifier("status_bar_latest_event_content", "id", "android");
        notification.contentView.setOnClickPendingIntent(identifier, this.a(22850000, "collapsed"));
        notification.bigContentView.setOnClickPendingIntent(identifier, this.a(22850001, "expanded"));
    }
    
    @TargetApi(16)
    protected abstract boolean a(final Context p0, final Notification p1, final Map p2, final Bitmap p3, final boolean p4, final boolean p5);
    
    @Override
    public boolean a(final j j, final Bitmap bitmap) {
        while (true) {
            while (true) {
                synchronized (this.i) {
                    this.h.put(j, true);
                    this.g.put(j, bitmap);
                    // monitorexit(this.i)
                    if (bitmap == null) {
                        break;
                    }
                    if (this.j.contains(j)) {
                        final String a = "user_image";
                        a(this, this.e, "image_downloaded", a);
                        return true;
                    }
                }
                final String a = this.a(j);
                continue;
            }
        }
        a(this, this.e, "image_download_failed", null);
        return true;
    }
    
    protected abstract boolean b(final j p0);
    
    protected boolean c(final j j) {
        return this.b(j);
    }
    
    protected abstract String n();
    
    protected abstract List r();
    
    @Override
    public boolean s() {
        return true;
    }
    
    @Override
    public boolean t() {
        while (true) {
            synchronized (this.i) {
                final Iterator<Boolean> iterator = this.h.values().iterator();
                while (iterator.hasNext()) {
                    if (!iterator.next()) {
                        return false;
                    }
                }
                if (this.l != 0) {
                    return true;
                }
            }
            return false;
        }
    }
    
    @Override
    public void u() {
        if (this.l == 4) {
            a(this, this.e, "enhance_partial", null);
        }
        else if (this.l == 5) {
            a(this, this.e, "enhance", null);
        }
    }
}
