// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

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
import com.twitter.library.scribe.ScribeService;
import com.twitter.util.q;
import android.widget.RemoteViews;
import android.content.Context;
import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.app.Notification;
import com.twitter.library.media.manager.UserImageRequest;
import com.twitter.library.media.manager.j;
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
import java.util.Map;
import android.graphics.Bitmap;
import com.twitter.android.client.x;
import java.util.List;
import android.content.res.Resources;
import com.twitter.android.client.ag;

class r extends ag
{
    private final Resources a;
    private final List e;
    
    public r(final x x, final MagicRecNotif magicRecNotif, final Resources a, final List e) {
        super("com.twitter.android.client.notifications.MagicRecNotif.FacePileOperation", x, magicRecNotif);
        this.a = a;
        this.e = e;
    }
    
    protected Bitmap a() {
        return gs.a(this.a, this.e);
    }
    
    @Override
    protected boolean a(final StatusBarNotif statusBarNotif, final com.twitter.internal.android.service.x x) {
        ((MagicRecNotif)statusBarNotif).k = (Bitmap)x.b();
        return true;
    }
    
    protected Bitmap b() {
        return null;
    }
}
