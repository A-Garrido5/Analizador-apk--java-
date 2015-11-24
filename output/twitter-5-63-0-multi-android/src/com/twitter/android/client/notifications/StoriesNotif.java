// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import java.util.ArrayList;
import java.util.Collections;
import android.content.Intent;
import android.annotation.TargetApi;
import android.content.res.Resources;
import java.util.Iterator;
import android.os.Build$VERSION;
import android.support.v4.app.NotificationCompat$Builder;
import com.twitter.android.client.ag;
import android.app.Notification;
import com.twitter.android.highlights.StoriesActivity;
import com.twitter.android.client.NotificationService;
import com.twitter.android.highlights.StoryScribeItem;
import android.app.PendingIntent;
import com.twitter.android.client.ab;
import com.twitter.library.media.manager.j;
import com.twitter.android.client.x;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.TwitterScribeItem;
import android.content.Context;
import android.text.style.StyleSpan;
import android.text.SpannableStringBuilder;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import java.util.HashMap;
import com.twitter.library.platform.d;
import android.util.Log;
import com.twitter.library.client.App;
import java.util.Map;
import java.util.List;

public class StoriesNotif extends GenericNotif
{
    private static final boolean f;
    private List g;
    private int h;
    private boolean i;
    private boolean j;
    private final Map k;
    private ae l;
    
    static {
        f = (App.l() && Log.isLoggable("StoriesNotif", 3));
    }
    
    public StoriesNotif(final d d, final long n, final String s) {
        super(d, n, s);
        this.j = false;
        this.k = new HashMap();
    }
    
    private void a(final RemoteViews remoteViews, final boolean b) {
        for (int n = 0; n < 2 && n < this.g.size(); ++n) {
            final ad ad = this.g.get(n);
            int n2;
            int n3;
            int n4;
            int n5;
            if (n == 0) {
                n2 = 2131886837;
                n3 = 2131886828;
                n4 = 2131886830;
                n5 = 2131886829;
            }
            else {
                n2 = 2131886838;
                n3 = 2131886831;
                n4 = 2131886833;
                n5 = 2131886832;
            }
            final String d = ad.d;
            if (b) {
                remoteViews.setTextViewText(n2, (CharSequence)d);
            }
            final Bitmap bitmap = this.k.get(ad.g);
            if (bitmap != null) {
                remoteViews.setImageViewBitmap(n5, bitmap);
            }
            if (b) {
                remoteViews.setTextViewText(n4, (CharSequence)ad.f);
            }
            else {
                final String string = ad.d + ":" + " " + ad.f;
                final int n6 = d.length() + ":".length();
                final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)string);
                spannableStringBuilder.setSpan((Object)new StyleSpan(1), 0, n6, 33);
                remoteViews.setTextViewText(n4, (CharSequence)spannableStringBuilder);
            }
            remoteViews.setInt(n3, "setVisibility", 0);
            final int n7 = n + 2;
            int n8;
            if (b) {
                n8 = n7 + 2;
            }
            else {
                n8 = n7;
            }
            remoteViews.setOnClickPendingIntent(n3, this.a(this.a(this.e, this.b, ad, b, n), n8, 268435456));
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
            ScribeService.a(context, a);
        }
    }
    
    private void a(final x x, final j j) {
        final Bitmap a = x.a(j, new ab(this.w(), false));
        this.k.put(j, a);
        String s;
        if (a != null) {
            s = "image_downloaded";
        }
        else {
            s = "image_queued";
        }
        a(this, this.e, s, "tweet_media");
    }
    
    private PendingIntent b(final boolean b) {
        final StoryScribeItem a = new StoryScribeItem().a(b);
        final TwitterScribeLog k = this.K();
        if (k != null) {
            k.a(a);
        }
        final TwitterScribeLog l = this.L();
        if (l != null) {
            l.a(a);
        }
        return new w(this.e, this, NotificationService.j).a(k, l).a(this.a(this.e, StoriesActivity.class, StoriesActivity.a(this.e, true, null, 0, this.a.k, null), null)).b();
    }
    
    private StoryScribeItem r() {
        return new StoryScribeItem().a(1, this.g.size());
    }
    
    @TargetApi(16)
    @Override
    public Notification a(final Context context, final x x, final com.twitter.android.client.ae ae, final Bitmap bitmap) {
        this.c(context);
        if (this.g == null) {
            if (this.l == null) {
                x.a(this.l = new ae(x, this, context, this.b), ae);
            }
            return null;
        }
        if (this.g.isEmpty()) {
            this.i = true;
            a(this, this.e, "preload_aborted", null);
            return null;
        }
        synchronized (this.k) {
            if (!this.j) {
                this.j = true;
                final Iterator<ad> iterator = this.g.iterator();
                while (iterator.hasNext()) {
                    this.a(x, iterator.next().g);
                }
            }
        }
        // monitorexit(map)
        if (!this.t()) {
            return null;
        }
        final Resources resources = context.getResources();
        final String string = resources.getString(2131297058);
        String contentText;
        if (this.g.size() > 1) {
            if (this.h > 0) {
                contentText = resources.getString(2131297057, new Object[] { this.g.get(0).d, this.g.get(1).d, this.h });
            }
            else {
                contentText = resources.getString(2131297056, new Object[] { this.g.get(0).d, this.g.get(1).d });
            }
        }
        else if (this.h > 0) {
            contentText = resources.getString(2131297055, new Object[] { this.g.get(0).d, this.h });
        }
        else {
            contentText = resources.getString(2131297054, new Object[] { this.g.get(0).d });
        }
        final String string2 = string + '\n' + contentText;
        final String packageName = context.getPackageName();
        final RemoteViews content = new RemoteViews(packageName, 2130968819);
        this.a(content, false);
        final NotificationCompat$Builder setColor = new NotificationCompat$Builder(context).setWhen(this.x()).setDeleteIntent(this.M()).setPriority(this.D()).setSmallIcon(this.F()).setContentTitle(string).setContentText(contentText).setTicker(string2).setSubText(this.al_()).setContent(content).setColor(resources.getColor(2131689615));
        StatusBarNotif.a(context, setColor, ae);
        final Notification build = setColor.build();
        build.contentView.setOnClickPendingIntent(2131886827, this.b(false));
        if (Build$VERSION.SDK_INT >= 16) {
            final RemoteViews bigContentView = new RemoteViews(packageName, 2130968820);
            bigContentView.setTextViewText(2131886834, (CharSequence)string);
            bigContentView.setTextViewText(2131886835, (CharSequence)contentText);
            this.a(bigContentView, true);
            (build.bigContentView = bigContentView).setOnClickPendingIntent(2131886827, this.b(true));
        }
        return build;
    }
    
    public Intent a(final Context context, final long n, final ad ad, final boolean b, final int n2) {
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { "notification:status_bar::story:open_tap" });
        twitterScribeLog.a(this.r().a(ad, b, n2));
        return StoriesActivity.a(context, true, ad.a, 0, this.a.k, twitterScribeLog);
    }
    
    @Override
    public boolean a(final j j, final Bitmap bitmap) {
        boolean b = true;
        if (this.i) {
            b = false;
        }
        else if (this.j) {
            if (bitmap != null) {
                synchronized (this.k) {
                    this.k.put(j, bitmap);
                    // monitorexit(this.k)
                    a(this, this.e, "image_downloaded", "tweet_media");
                    return b;
                }
            }
            synchronized (this.k) {
                final Iterator<j> iterator = this.k.keySet().iterator();
                while (iterator.hasNext()) {
                    this.k.put(iterator.next(), null);
                }
            }
            // monitorexit(map)
            a(this, this.e, "image_download_failed", "tweet_media");
            return false;
        }
        return b;
    }
    
    @Override
    protected List am_() {
        List<StoryScribeItem> am_ = (List<StoryScribeItem>)super.am_();
        if (this.g != null) {
            if (am_ == Collections.EMPTY_LIST) {
                am_ = new ArrayList<StoryScribeItem>();
            }
            am_.add(this.r());
        }
        return am_;
    }
    
    @Override
    protected String k() {
        return "highlights";
    }
    
    @Override
    public boolean s() {
        return true;
    }
    
    @Override
    public boolean t() {
        if (this.i) {
            return true;
        }
        if (this.g == null) {
            return false;
        }
        synchronized (this.k) {
            final Iterator<Bitmap> iterator = this.k.values().iterator();
            while (iterator.hasNext()) {
                if (iterator.next() == null) {
                    return false;
                }
            }
            return this.j;
        }
    }
}
