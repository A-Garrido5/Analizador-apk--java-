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
import com.twitter.util.SynchronizedDateFormat;
import com.twitter.library.client.App;
import com.twitter.library.media.manager.q;
import android.content.Context;
import android.text.style.TextAppearanceSpan;
import java.text.SimpleDateFormat;
import android.graphics.Bitmap;
import com.twitter.library.media.manager.p;
import com.twitter.library.media.manager.ResourceResponse;
import com.twitter.library.provider.Tweet;
import java.util.concurrent.atomic.AtomicBoolean;
import com.twitter.library.media.manager.m;

class cg implements m
{
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Tweet b;
    final /* synthetic */ ck c;
    final /* synthetic */ int d;
    final /* synthetic */ WidgetControl e;
    
    cg(final WidgetControl e, final AtomicBoolean a, final Tweet b, final ck c, final int d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void a(final p p) {
        if (this.a.get()) {
            this.e.a(this.b, (Bitmap)p.c(), this.c, this.d);
        }
    }
}
