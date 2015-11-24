// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import com.twitter.android.DialogActivity;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.util.InvalidDataException;
import com.twitter.android.DraftsActivity;
import android.content.ComponentName;
import com.twitter.android.UrlInterpreterActivity;
import android.support.v4.app.NotificationCompat$Style;
import android.support.v4.app.NotificationCompat$BigTextStyle;
import com.twitter.android.platform.TwitterAccessCwcNotificationReceiver;
import com.twitter.android.highlights.e;
import com.twitter.library.media.manager.p;
import com.twitter.library.media.manager.ResourceResponse;
import android.content.res.Resources;
import com.twitter.android.LoginActivity;
import android.app.Notification;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.android.MainActivity;
import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.j;
import com.twitter.android.client.notifications.GenericNotif;
import com.twitter.android.client.notifications.MagicRecNotif;
import com.twitter.android.client.notifications.MagicRecFollowNotif;
import com.twitter.android.client.notifications.MagicRecTweetNotif;
import com.twitter.android.client.notifications.StoriesNotif;
import com.twitter.library.service.w;
import com.twitter.android.client.notifications.LifelineTweetNotif;
import com.twitter.android.client.notifications.DeviceTweetNotif;
import com.twitter.android.client.notifications.MediaTagNotif;
import com.twitter.android.client.notifications.FollowRequestNotif;
import com.twitter.android.client.notifications.FollowNotif;
import com.twitter.android.client.notifications.RetweetNotif;
import com.twitter.android.client.notifications.FavoriteNotif;
import com.twitter.android.client.notifications.MentionNotif;
import com.twitter.android.AgeGateActivity;
import com.twitter.android.client.notifications.LoginVerificationNotif;
import android.database.Cursor;
import android.content.ContentResolver;
import android.net.Uri;
import com.twitter.library.provider.n;
import java.io.Serializable;
import com.twitter.library.provider.bf;
import com.twitter.android.EditProfileActivity;
import com.twitter.android.EditProfileWithAvatarDrawerActivity;
import com.twitter.android.avatars.b;
import android.os.Bundle;
import android.accounts.Account;
import com.twitter.library.provider.NotificationSetting;
import com.twitter.library.platform.PushService;
import com.twitter.library.provider.k;
import com.twitter.library.platform.d;
import com.twitter.android.client.notifications.DMNotif;
import com.twitter.library.platform.DataSyncResult;
import android.text.TextUtils;
import android.graphics.Bitmap;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.media.manager.UserImageRequest;
import android.content.Intent;
import com.twitter.library.client.Session;
import android.support.v4.app.NotificationCompat$Builder;
import android.app.PendingIntent;
import android.os.Looper;
import java.util.ArrayList;
import com.twitter.library.client.App;
import android.os.Handler;
import java.util.Map;
import java.util.List;
import com.twitter.library.client.as;
import android.util.SparseArray;
import com.twitter.library.client.ay;
import java.util.HashMap;
import com.twitter.library.client.az;
import android.app.NotificationManager;
import android.content.Context;
import com.twitter.library.media.manager.q;
import com.twitter.library.media.manager.m;
import android.util.Log;
import com.twitter.android.client.notifications.StatusBarNotif;
import com.twitter.internal.android.service.c;
import com.twitter.internal.android.service.a;

public abstract class ag extends a implements c
{
    private final x a;
    private final StatusBarNotif e;
    
    public ag(final String s, final x a, final StatusBarNotif e) {
        super(s);
        this.a = a;
        this.e = e;
        this.a((c)this);
    }
    
    public final void a(final ag ag) {
    }
    
    public final void a(final Object o, final ag ag) {
    }
    
    protected abstract boolean a(final StatusBarNotif p0, final com.twitter.internal.android.service.x p1);
    
    public final void b(final ag ag) {
        if (this.a(this.e, ag.l())) {
            final ae q = this.e.Q();
            if (q != null) {
                if (x.a) {
                    Log.d("NotificationController", "Background operation successful, proceeding to notify.");
                }
                this.a.a(q, this.e);
            }
            else if (x.a) {
                Log.e("NotificationController", "Background operation successful, but missing notification settings. Not displaying notification.");
            }
        }
        else if (x.a) {
            Log.e("NotificationController", "Background operation failed. Not displaying notification.");
        }
    }
}
