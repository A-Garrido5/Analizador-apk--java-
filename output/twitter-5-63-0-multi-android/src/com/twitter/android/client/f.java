// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.app.SearchManager$OnDismissListener;
import android.app.SearchManager;
import android.app.PendingIntent;
import java.io.Serializable;
import android.os.Parcelable;
import android.app.AlarmManager;
import android.widget.Toast;
import android.net.Uri;
import android.preference.PreferenceManager;
import com.twitter.library.platform.TwitterDataSyncService;
import java.util.Collection;
import com.twitter.library.media.manager.q;
import com.twitter.library.media.manager.UserImageRequest;
import android.os.Handler;
import com.twitter.eventreporter.EventReporter;
import com.twitter.library.provider.Tweet;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import com.twitter.library.provider.ae;
import com.twitter.library.platform.PushService;
import com.twitter.library.client.App;
import com.twitter.library.api.timeline.o;
import com.twitter.library.service.ab;
import com.twitter.library.api.Recap$Metadata;
import android.accounts.Account;
import com.twitter.library.client.u;
import com.twitter.library.util.bj;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.api.timeline.ad;
import com.twitter.library.client.ag;
import com.twitter.internal.android.service.a;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.api.an;
import com.twitter.library.api.TwitterUser;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.client.k;
import android.annotation.TargetApi;
import android.view.Display;
import com.twitter.library.scribe.TwitterScribeLog;
import android.util.DisplayMetrics;
import android.hardware.display.DisplayManager;
import android.os.Build$VERSION;
import android.content.Intent;
import com.twitter.library.platform.DataSyncResult;
import com.twitter.library.service.y;
import com.twitter.library.api.timeline.w;
import com.twitter.internal.android.service.x;
import com.twitter.library.service.aa;
import com.twitter.library.featureswitch.d;
import com.twitter.library.client.Session;
import com.twitter.android.browser.l;
import com.twitter.library.featureswitch.b;
import com.twitter.library.service.z;
import com.twitter.library.client.ay;
import com.twitter.library.scribe.ScribeService;
import com.twitter.android.browser.g;
import com.twitter.library.client.az;
import com.twitter.library.client.as;
import java.util.HashMap;
import java.util.ArrayList;
import android.content.Context;
import java.util.regex.Pattern;
import com.twitter.library.featureswitch.n;
import android.app.SearchManager$OnCancelListener;

class f implements SearchManager$OnCancelListener
{
    final /* synthetic */ c a;
    
    f(final c a) {
        this.a = a;
    }
    
    public void onCancel() {
        this.a.a(this.a.h.b().g(), "::search_box:cancel");
    }
}
