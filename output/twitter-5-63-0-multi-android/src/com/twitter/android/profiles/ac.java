// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import android.os.Parcelable;
import java.io.Serializable;
import com.twitter.android.ProfileActivity;
import android.widget.AdapterView;
import android.net.Uri$Builder;
import com.twitter.library.util.k;
import com.twitter.library.provider.cw;
import android.content.ContentUris;
import android.net.Uri;
import java.util.Iterator;
import com.twitter.android.kg;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.android.yk;
import com.twitter.library.widget.UserView;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.widget.BaseUserView;
import android.view.View;
import android.support.v4.content.Loader;
import android.database.Cursor;
import android.widget.Toast;
import com.twitter.android.pg;
import android.os.Bundle;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;
import com.twitter.library.client.as;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.client.az;
import com.twitter.android.ou;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.client.Session;
import com.twitter.library.widget.c;
import com.twitter.android.mz;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.library.api.TwitterUser;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.errorreporter.a;
import com.twitter.library.client.App;
import com.twitter.library.client.au;
import com.twitter.library.service.y;
import com.twitter.library.provider.bg;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class ac extends BroadcastReceiver
{
    final /* synthetic */ ab a;
    
    ac(final ab a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final long longExtra = intent.getLongExtra("USER_FOLLOWED_USERID_KEY", -1L);
        final bg a = bg.a(this.a.c, this.a.a.g());
        TwitterUser a2;
        if (this.a.b != null) {
            a2 = this.a.b.a();
        }
        else {
            a2 = null;
        }
        if (a2 != null && a.a(longExtra, a2.userId, this.a.d(), -1L)) {
            this.a.j.a(new pv(this.a.c, this.a.a, a2.userId, this.a.d(), -1L, longExtra, null), 4, 0, this.a);
        }
        else if (a2 == null && (App.a() || App.b() || App.c())) {
            ErrorReporter.a(new a().a("mProfile.null", this.a.b == null).a("mProfile.getUser().null", a2 == null).a("this.getClass()", this.getClass()).a("mRecommendationsAdapter.null", this.a.e == null).a(new IllegalStateException("Trying to replenish ProfileRecommendationModule when user is null.")));
        }
    }
}
