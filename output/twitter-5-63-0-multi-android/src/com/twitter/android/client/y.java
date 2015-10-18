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
import com.twitter.library.util.a;
import com.twitter.library.platform.d;
import com.twitter.android.client.notifications.DMNotif;
import com.twitter.library.platform.DataSyncResult;
import com.twitter.android.client.notifications.StatusBarNotif;
import android.text.TextUtils;
import android.graphics.Bitmap;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.media.manager.UserImageRequest;
import android.content.Intent;
import com.twitter.library.client.Session;
import android.app.PendingIntent;
import android.os.Looper;
import java.util.ArrayList;
import android.util.Log;
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
import android.support.v4.app.NotificationCompat$Builder;

class y implements Runnable
{
    final /* synthetic */ String a;
    final /* synthetic */ NotificationCompat$Builder b;
    final /* synthetic */ x c;
    
    y(final x c, final String a, final NotificationCompat$Builder b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        this.c.f.notify(this.a, 1001, this.b.build());
    }
}
