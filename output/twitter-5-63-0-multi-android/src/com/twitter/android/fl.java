// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.featureswitch.d;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import com.twitter.library.client.bh;
import android.preference.PreferenceManager;
import com.twitter.android.metrics.e;
import com.twitter.android.metrics.a;
import com.twitter.android.metrics.LaunchTracker;
import com.twitter.android.util.ap;
import android.os.Build$VERSION;
import android.os.StatFs;
import android.os.Environment;
import android.os.Bundle;
import android.view.View;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.account.w;
import com.twitter.library.util.bq;
import android.text.TextUtils;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.net.Uri;
import android.os.Parcelable;
import android.app.Activity;
import com.twitter.android.util.x;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import android.view.View$OnClickListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.library.client.k;
import com.twitter.library.platform.TwitterDataSyncService;
import com.twitter.android.util.AppEventTrack;
import com.twitter.android.util.AppEventTrack$EventType;
import android.widget.Toast;
import android.content.Context;
import android.content.Intent;
import com.twitter.library.api.as;
import com.twitter.library.client.Session;
import com.twitter.library.client.bj;

class fl implements bj
{
    final /* synthetic */ DispatchActivity a;
    
    private fl(final DispatchActivity a) {
        this.a = a;
    }
    
    @Override
    public void a(final Session session, final int n, final int n2, final as as) {
        this.a.c.a(n2, as);
        this.a.removeDialog(1);
        this.a.c.q();
        final Intent intent = this.a.getIntent();
        int n3;
        if (as != null && as.b != null) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        Intent intent2;
        if (n3 != 0) {
            intent2 = new Intent((Context)this.a, (Class)LoginActivity.class);
            intent2.putExtra("screen_name", this.a.c.e());
            Toast.makeText(this.a.getBaseContext(), 2131297185, 1).show();
            this.a.c.d("login");
        }
        else {
            intent2 = new Intent((Context)this.a, (Class)SignUpActivity.class);
            this.a.d.b(intent2);
            this.a.c.d("signup");
        }
        if (intent.hasExtra("android.intent.extra.INTENT")) {
            intent2.putExtra("android.intent.extra.INTENT", intent.getParcelableExtra("android.intent.extra.INTENT"));
        }
        this.a.startActivity(intent2);
    }
    
    @Override
    public void a(final Session session, final as as) {
    }
    
    @Override
    public void a(final Session session, final String s) {
        this.a.c.s();
        AppEventTrack.a(this.a.getApplicationContext(), AppEventTrack$EventType.d, new String[0]);
        this.a.removeDialog(1);
        TwitterDataSyncService.e((Context)this.a, session.e());
        this.a.a(this.a.c.d(), this.a.c.f(), this.a.c.e(), this.a.c.h(), this.a.c.h(), this.a.c.i());
        new k((Context)this.a, session.e()).a().a("auto_device_follow_candidate", true).apply();
    }
}
