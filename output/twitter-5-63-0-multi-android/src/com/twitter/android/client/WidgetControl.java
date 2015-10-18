// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import java.util.Collection;
import java.util.ArrayList;
import android.net.Uri;
import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.UserImageRequest;
import com.twitter.library.media.manager.k;
import com.twitter.library.api.bh;
import android.content.res.ColorStateList;
import com.twitter.android.WidgetSettingsActivity;
import android.appwidget.AppWidgetManager;
import com.twitter.library.api.PromotedContent;
import android.content.res.Resources;
import com.twitter.library.provider.ae;
import com.twitter.android.TweetActivity;
import com.twitter.library.util.bk;
import com.twitter.library.api.UrlEntity;
import android.text.SpannableStringBuilder;
import android.graphics.Bitmap;
import com.twitter.android.composer.au;
import android.app.PendingIntent;
import com.twitter.library.client.az;
import android.widget.RemoteViews;
import com.twitter.android.util.aj;
import android.os.Parcelable;
import com.twitter.android.MainActivity;
import com.twitter.android.DispatchActivity;
import android.text.TextUtils;
import android.content.Intent;
import com.twitter.library.api.TwitterUser;
import java.util.Iterator;
import com.twitter.library.provider.Tweet;
import com.twitter.util.SynchronizedDateFormat;
import com.twitter.library.client.App;
import com.twitter.library.media.manager.q;
import java.util.concurrent.atomic.AtomicBoolean;
import android.content.Context;
import android.text.style.TextAppearanceSpan;
import java.text.SimpleDateFormat;

public class WidgetControl
{
    public static final String a;
    public static final String b;
    public static final String c;
    private static final SimpleDateFormat f;
    private static final Object g;
    private static volatile TextAppearanceSpan h;
    private static int i;
    public final String d;
    public final long e;
    private final WidgetControl$WidgetList[] j;
    private final ck k;
    private final ck l;
    private final Context m;
    private final AtomicBoolean n;
    private final q o;
    
    static {
        a = App.a(".widget.button.next");
        b = App.a(".widget.button.prev");
        c = App.a(".widget.update");
        f = new SynchronizedDateFormat();
        g = new Object();
        WidgetControl.i = 1;
    }
    
    public WidgetControl(final Context m, final String d, final long e) {
        this.m = m;
        this.o = q.a(m);
        this.d = d;
        this.e = e;
        this.j = new WidgetControl$WidgetList[] { new WidgetControl$WidgetList(), new WidgetControl$WidgetList() };
        this.k = new ck(2131165189, 2130969212, 2130969207, d);
        this.l = new ck(2131165190, 2130969223, 2130969208, d);
        this.n = new AtomicBoolean(false);
        WidgetControl.f.applyPattern(m.getResources().getString(2131298164));
    }
    
    private long a(final WidgetControl$WidgetList list) {
        if (list != null) {
            for (final Tweet tweet : list) {
                if (tweet != null) {
                    return tweet.A;
                }
            }
        }
        return 0L;
    }
    
    public static Intent a(final Context context, final String s, final TwitterUser twitterUser, final int n) {
        Intent intent;
        if (TextUtils.isEmpty((CharSequence)s)) {
            intent = new Intent(context, (Class)DispatchActivity.class);
        }
        else if (n == 0) {
            intent = new Intent(context, (Class)MainActivity.class).putExtra("AbsFragmentActivity_account_name", s).putExtra("page", (Parcelable)MainActivity.c);
        }
        else {
            intent = aj.a(context, twitterUser, false, false);
        }
        intent.setAction("android.intent.action.VIEW" + d()).setFlags(67108864).putExtra("ref_event", "widget::::click");
        return intent;
    }
    
    private static RemoteViews a(final Context context, final int n, final int n2, final int n3, final String s, final int n4) {
        final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), n2);
        if (n == 2131165189) {
            int n5;
            if (n4 == 5) {
                n5 = 2130839089;
            }
            else {
                n5 = 2130839391;
            }
            remoteViews.setImageViewResource(2131887365, n5);
            remoteViews.setTextViewText(2131887366, (CharSequence)s);
            final PendingIntent activity = PendingIntent.getActivity(context, 0, a(context, s, az.a(context).b().f(), n4), 268435456);
            remoteViews.setOnClickPendingIntent(2131887365, activity);
            remoteViews.setOnClickPendingIntent(2131887366, activity);
            switch (n3) {
                default: {
                    remoteViews.setViewVisibility(2131886101, 0);
                    remoteViews.setOnClickPendingIntent(2131887367, PendingIntent.getActivity(context, d(), au.a(context).c(335544320).a(s).b("widget::::click").a(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME").setFlags(268435456)).p(), 268435456));
                    break;
                }
                case 0:
                case 1: {
                    remoteViews.setViewVisibility(2131886920, 8);
                    return remoteViews;
                }
                case 2: {
                    remoteViews.setViewVisibility(2131886920, 8);
                    remoteViews.setTextViewText(2131887366, (CharSequence)context.getResources().getString(2131297168));
                    return remoteViews;
                }
            }
        }
        return remoteViews;
    }
    
    private void a(final long n, final WidgetControl$WidgetList list) {
        final Iterator<Tweet> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().Q == n) {
                this.b(true);
                break;
            }
        }
    }
    
    public static void a(final Context context, final int n) {
        context.startService(new Intent(context, (Class)WidgetService.class).setAction("clear_logged_out").putExtra("widget_provider", n));
    }
    
    static void a(final Context context, final RemoteViews remoteViews, final Tweet tweet, final Bitmap bitmap, final long n, final String s) {
        final Resources resources = context.getResources();
        remoteViews.setTextViewText(2131886307, (CharSequence)tweet.M);
        remoteViews.setTextViewText(2131886308, (CharSequence)("@" + tweet.F));
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)tweet.y);
        final Iterator<UrlEntity> iterator = (Iterator<UrlEntity>)tweet.G.c().iterator();
        int n2 = 0;
    Label_0177_Outer:
        while (iterator.hasNext()) {
            final UrlEntity urlEntity = iterator.next();
            final int n3 = urlEntity.start - n2;
            final int n4 = urlEntity.end - n2;
            while (true) {
                Label_0527: {
                    if (n3 < 0 || n4 > spannableStringBuilder.length()) {
                        break Label_0527;
                    }
                    final String displayUrl = urlEntity.displayUrl;
                    if (TextUtils.isEmpty((CharSequence)displayUrl)) {
                        break Label_0527;
                    }
                    spannableStringBuilder.replace(n3, n4, (CharSequence)displayUrl);
                    final int n5 = n2 + (n4 - (n3 + displayUrl.length()));
                    n2 = n5;
                    continue Label_0177_Outer;
                }
                final int n5 = n2;
                continue;
            }
        }
        remoteViews.setTextViewText(2131886313, (CharSequence)spannableStringBuilder);
        remoteViews.setTextViewText(2131886276, (CharSequence)bk.a(resources, tweet.A));
        int n6;
        if (tweet.d()) {
            n6 = 0;
        }
        else {
            n6 = 8;
        }
        remoteViews.setViewVisibility(2131886310, n6);
        int n7;
        if (tweet.e()) {
            n7 = 0;
        }
        else {
            n7 = 8;
        }
        remoteViews.setViewVisibility(2131886311, n7);
        int n8;
        if (tweet.g()) {
            n8 = 0;
        }
        else {
            n8 = 8;
        }
        remoteViews.setViewVisibility(2131886312, n8);
        if (bitmap != null) {
            remoteViews.setImageViewBitmap(2131886159, bitmap);
        }
        else {
            remoteViews.setImageViewResource(2131886159, 2130837564);
        }
        remoteViews.setOnClickPendingIntent(2131887391, PendingIntent.getActivity(context, 0, new Intent(context, (Class)TweetActivity.class).setAction("android.intent.action.VIEW" + d()).setData(ae.a(tweet.E, n)).setFlags(67108864).putExtra("AbsFragmentActivity_account_name", s).putExtra("ref_event", "widget::::click"), 268435456));
        if (tweet.g) {
            remoteViews.setTextViewText(2131886315, (CharSequence)resources.getString(2131298008, new Object[] { tweet.z }));
            remoteViews.setViewVisibility(2131886315, 0);
        }
        else {
            remoteViews.setViewVisibility(2131886315, 8);
        }
        if (tweet.m()) {
            final PromotedContent j = tweet.j;
            String s2;
            if (j != null) {
                s2 = j.advertiserName;
            }
            else {
                s2 = tweet.L;
            }
            remoteViews.setTextViewText(2131886316, (CharSequence)resources.getString(2131297492, new Object[] { s2 }));
            remoteViews.setViewVisibility(2131886316, 0);
            return;
        }
        remoteViews.setViewVisibility(2131886316, 8);
    }
    
    public static void a(final Context context, final ck ck, final int n, final String s, final int n2) {
        if (n != 1) {
            RemoteViews remoteViews;
            int[] array = null;
            if (n == 0) {
                final int[] a = ck.a(context);
                if (a == null || a.length == 0) {
                    return;
                }
                remoteViews = a(context, ck.a, ck.c, n, "", 0);
                a(remoteViews, context.getString(2131298149), context.getString(2131298148));
                array = a;
            }
            else {
                final int[] a2 = a(ck, n2);
                if (a2 == null || a2.length == 0) {
                    return;
                }
                remoteViews = a(context, ck.a, ck.c, n, s, n2);
                switch (n) {
                    default: {
                        a(remoteViews, null, context.getString(2131298002));
                        array = a2;
                        break;
                    }
                    case 2: {
                        a(remoteViews, null, (String)null);
                        array = a2;
                        break;
                    }
                }
            }
            remoteViews.setOnClickPendingIntent(2131887363, PendingIntent.getActivity(context, 0, a(context, s, az.a(context).b().f(), n2), 67108864));
            AppWidgetManager.getInstance(context).updateAppWidget(array, remoteViews);
            return;
        }
        final int[] a3 = ck.a();
        if (a3 != null && a3.length != 0) {
            final String string = context.getString(2131298154);
            for (final int n3 : a3) {
                final RemoteViews a4 = a(context, ck.a, ck.c, n, "", 0);
                a(a4, null, string);
                a4.setOnClickPendingIntent(2131887363, PendingIntent.getActivity(context, 0, new Intent(context, (Class)WidgetSettingsActivity.class).setAction("android.intent.action.VIEW" + d()).putExtra("appWidgetId", n3), 67108864));
                AppWidgetManager.getInstance(context).updateAppWidget(n3, a4);
            }
        }
    }
    
    private void a(final Bitmap bitmap, final ck ck, final int n) {
        final int[] a = a(ck, n);
        if (a == null || a.length == 0) {
            return;
        }
        final RemoteViews remoteViews = new RemoteViews(this.m.getPackageName(), 2130969223);
        final WidgetControl$WidgetList e = this.e(n);
        if (e.size() > 0) {
            final Tweet tweet = e.get(0);
            this.a(remoteViews, tweet, bitmap);
            if (tweet.C == this.e) {
                remoteViews.setViewVisibility(2131887392, 4);
            }
            else {
                remoteViews.setViewVisibility(2131887392, 0);
                remoteViews.setOnClickPendingIntent(2131887392, PendingIntent.getActivity(this.m, 0, au.a(this.m).a(tweet.D).c(335544320).a(this.d).b("widget::::click").p(), 268435456));
            }
        }
        else {
            remoteViews.setViewVisibility(2131887392, 4);
        }
        AppWidgetManager.getInstance(this.m).updateAppWidget(a, remoteViews);
    }
    
    private void a(final RemoteViews remoteViews, final Tweet tweet, final Bitmap bitmap) {
        final Resources resources = this.m.getResources();
        while (true) {
            if (WidgetControl.h == null) {
                long a = 0L;
                String a2 = null;
                SpannableStringBuilder spannableStringBuilder = null;
            Label_0271_Outer:
                while (true) {
                    while (true) {
                        int n = 0;
                    Label_0540:
                        while (true) {
                            synchronized (WidgetControl.g) {
                                if (WidgetControl.h == null) {
                                    WidgetControl.h = new TextAppearanceSpan((String)null, 1, (int)(14.0f * resources.getDisplayMetrics().density), ColorStateList.valueOf(resources.getColor(2131689600)), (ColorStateList)null);
                                }
                                // monitorexit(WidgetControl.g)
                                final String f = tweet.F;
                                final String y = tweet.y;
                                a = tweet.A;
                                if (tweet.O > 0L) {
                                    a2 = bh.a(y);
                                    spannableStringBuilder = new SpannableStringBuilder();
                                    if (f != null) {
                                        spannableStringBuilder.append((CharSequence)f);
                                        spannableStringBuilder.setSpan((Object)WidgetControl.h, 0, f.length(), 33);
                                    }
                                    spannableStringBuilder.append(' ').append((CharSequence)y);
                                    final Iterator<UrlEntity> iterator = (Iterator<UrlEntity>)tweet.G.c().iterator();
                                    n = 0;
                                    while (iterator.hasNext()) {
                                        final UrlEntity urlEntity = iterator.next();
                                        final int n2 = urlEntity.start - n;
                                        final int n3 = urlEntity.end - n;
                                        if (n2 < 0 || n3 > spannableStringBuilder.length()) {
                                            break Label_0540;
                                        }
                                        final String displayUrl = urlEntity.displayUrl;
                                        if (TextUtils.isEmpty((CharSequence)displayUrl)) {
                                            break Label_0540;
                                        }
                                        spannableStringBuilder.replace(n2, n3, (CharSequence)displayUrl);
                                        final int n4 = n + (n3 - (n2 + displayUrl.length()));
                                        n = n4;
                                    }
                                    break;
                                }
                            }
                            a2 = null;
                            continue Label_0271_Outer;
                        }
                        final int n4 = n;
                        continue;
                    }
                }
                remoteViews.setTextViewText(2131886313, (CharSequence)spannableStringBuilder);
                final String format = WidgetControl.f.format(a);
                if (a2 != null) {
                    remoteViews.setTextViewText(2131886309, (CharSequence)resources.getString(2131298014, new Object[] { format, a2 }));
                }
                else if (tweet.W != null && tweet.W.fullName != null) {
                    remoteViews.setTextViewText(2131886309, (CharSequence)resources.getString(2131298013, new Object[] { format, tweet.W.fullName }));
                }
                else {
                    remoteViews.setTextViewText(2131886309, (CharSequence)format);
                }
                if (bitmap != null) {
                    remoteViews.setImageViewBitmap(2131886159, bitmap);
                }
                else {
                    remoteViews.setImageViewResource(2131886159, 2130837565);
                }
                remoteViews.setOnClickPendingIntent(2131887391, PendingIntent.getActivity(this.m, 0, new Intent(this.m, (Class)TweetActivity.class).setAction("android.intent.action.VIEW" + d()).setData(ae.a(tweet.E, this.e)).setFlags(67108864).putExtra("AbsFragmentActivity_account_name", this.d).putExtra("ref_event", "widget::::click"), 268435456));
                return;
            }
            continue;
        }
    }
    
    private static void a(final RemoteViews remoteViews, final String s, final String s2) {
        int n = 1;
        int n2;
        if (!TextUtils.isEmpty((CharSequence)s)) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (TextUtils.isEmpty((CharSequence)s2)) {
            n = 0;
        }
        if (n2 != 0) {
            remoteViews.setTextViewText(2131887361, (CharSequence)s);
            remoteViews.setViewVisibility(2131887361, 0);
        }
        else {
            remoteViews.setViewVisibility(2131887361, 8);
        }
        if (n != 0) {
            remoteViews.setTextViewText(2131887362, (CharSequence)s2);
            remoteViews.setViewVisibility(2131887362, 0);
        }
        else {
            remoteViews.setViewVisibility(2131887362, 8);
        }
        if (n2 != 0 || n != 0) {
            remoteViews.setViewVisibility(2131887364, 0);
            remoteViews.setViewVisibility(2131886400, 8);
            return;
        }
        remoteViews.setViewVisibility(2131887364, 8);
        remoteViews.setViewVisibility(2131886400, 0);
    }
    
    private void a(final Tweet tweet, final Bitmap bitmap, final ck ck, final int n) {
        if (ck.a == 2131165189) {
            this.c(ck, n);
        }
        else {
            this.a(bitmap, ck, n);
        }
        a(this.m, ck, 1, "", n);
    }
    
    private static int[] a(final ck ck, final int n) {
        if (n == 5) {
            return ck.c();
        }
        return ck.b();
    }
    
    private void b(final ck ck, final int n) {
        if (!this.n.get()) {
            return;
        }
        final WidgetControl$WidgetList e = this.e(n);
        int mCurrentListIndex;
        if (ck.a == 2131165189) {
            mCurrentListIndex = e.mCurrentListIndex;
        }
        else {
            mCurrentListIndex = 0;
        }
        if (e.size() == 0) {
            a(this.m, ck, 3, this.d, n);
            return;
        }
        final Tweet tweet = e.get(mCurrentListIndex);
        this.o.a((k)UserImageRequest.a(tweet.B, -1).a(new cg(this, this.n, tweet, ck, n)));
    }
    
    private void c(final ck ck, final int n) {
        final int[] a = a(ck, n);
        if (a == null) {
            return;
        }
        final AppWidgetManager instance = AppWidgetManager.getInstance(this.m);
        for (final int n2 : a) {
            final Intent intent = new Intent(this.m, (Class)ScrollableWidgetService.class);
            intent.putExtra("appWidgetId", n2);
            intent.putExtra("ownerId", this.e);
            intent.putExtra("contentType", n);
            intent.putExtra("accountName", this.d);
            intent.setData(Uri.parse(intent.toUri(1)));
            final RemoteViews a2 = a(this.m, ck.a, ck.b, 4, this.d, n);
            a2.setRemoteAdapter(n2, 2131886656, intent);
            a2.setEmptyView(2131886656, 2131887368);
            a2.setPendingIntentTemplate(2131886656, PendingIntent.getActivity(this.m, 0, new Intent(this.m, (Class)TweetActivity.class).setAction("android.intent.action.VIEW" + d()).setFlags(67108864), 268435456));
            instance.updateAppWidget(n2, a2);
        }
        instance.notifyAppWidgetViewDataChanged(ck.b(), 2131886656);
    }
    
    private static int d() {
        synchronized (WidgetControl.class) {
            return ++WidgetControl.i;
        }
    }
    
    private WidgetControl$WidgetList e(final int n) {
        if (n == 5) {
            return this.j[1];
        }
        return this.j[0];
    }
    
    void a() {
        final Context m = this.m;
        this.k.a(m, this.k.a(m));
        this.l.a(m, this.l.a(m));
    }
    
    public void a(final int n) {
        if (this.n.get()) {
            final WidgetControl$WidgetList e = this.e(n);
            final int size = e.size();
            final int mCurrentListIndex = e.mCurrentListIndex;
            if (size > 0 && mCurrentListIndex < size - 1) {
                e.a();
                this.b(this.k, n);
            }
        }
    }
    
    void a(final int n, final long n2, final ArrayList list) {
        if (!this.n.get()) {
            return;
        }
        final WidgetControl$WidgetList e = this.e(n);
        if (n2 == 0L) {
            e.clear();
        }
        final boolean b = e.size() == 0;
        e.addAll(0, list);
        int i = e.size();
        if (i == 0) {
            a(this.m, this.k, 3, this.d, n);
            a(this.m, this.l, 3, this.d, n);
            return;
        }
        while (i > 20) {
            e.remove(20);
            i = e.size();
        }
        final int mCurrentListIndex = e.mCurrentListIndex;
        final int size = list.size();
        if (b || mCurrentListIndex <= size || mCurrentListIndex + size >= 20) {
            e.mCurrentListIndex = 0;
            this.b(this.k, n);
        }
        this.b(this.l, n);
    }
    
    public void a(final long n) {
        if (this.n.get()) {
            this.a(n, this.e(0));
            this.a(n, this.e(5));
        }
    }
    
    public void a(final boolean b) {
        if (!this.n.get()) {
            return;
        }
        this.n.set(false);
        final Context m = this.m;
        final Intent putExtra = new Intent(this.m, (Class)WidgetService.class).setAction("close").putExtra("owner_id", this.e);
        int n = 0;
        if (!b) {
            n = 1;
        }
        m.startService(putExtra.putExtra("widget_state", n));
    }
    
    public void b() {
        if (this.n.get()) {
            return;
        }
        this.n.set(true);
        this.m.startService(new Intent(this.m, (Class)WidgetService.class).setAction("open").putExtra("owner_id", this.e));
    }
    
    public void b(final int n) {
        if (this.n.get()) {
            final WidgetControl$WidgetList e = this.e(n);
            final int size = e.size();
            final int mCurrentListIndex = e.mCurrentListIndex;
            if (size > 0 && mCurrentListIndex > 0) {
                e.b();
                this.b(this.k, n);
            }
        }
    }
    
    public void b(final boolean b) {
        long a = 0L;
        if (this.n.get()) {
            final Context m = this.m;
            final Intent putExtra = new Intent(this.m, (Class)WidgetService.class).setAction("refresh").putExtra("owner_id", this.e);
            long a2;
            if (b) {
                a2 = a;
            }
            else {
                a2 = this.a(this.j[0]);
            }
            final Intent putExtra2 = putExtra.putExtra("latest_time_tweets", a2);
            if (!b) {
                a = this.a(this.j[1]);
            }
            m.startService(putExtra2.putExtra("latest_time_mentions", a));
        }
    }
    
    public q c() {
        return this.o;
    }
    
    public void c(final int n) {
        if (!this.n.get()) {
            return;
        }
        ck ck;
        if (n == 2131165189) {
            ck = this.k;
        }
        else {
            ck = this.l;
        }
        this.b(ck, 0);
        this.b(ck, 5);
    }
    
    public void d(final int n) {
        if (n == 4) {
            return;
        }
        final Context m = this.m;
        a(m, this.k, n, this.d, 0);
        a(m, this.k, n, this.d, 5);
        a(m, this.l, n, this.d, 0);
        a(m, this.l, n, this.d, 5);
    }
}
