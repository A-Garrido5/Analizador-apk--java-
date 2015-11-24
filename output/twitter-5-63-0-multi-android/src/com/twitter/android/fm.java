// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.featureswitch.d;
import android.app.ProgressDialog;
import android.app.Dialog;
import com.twitter.library.client.Session;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import com.twitter.library.client.bh;
import android.preference.PreferenceManager;
import com.twitter.android.metrics.e;
import com.twitter.android.metrics.LaunchTracker;
import com.twitter.android.util.ap;
import com.twitter.android.util.AppEventTrack;
import com.twitter.android.util.AppEventTrack$EventType;
import android.os.Build$VERSION;
import android.os.StatFs;
import android.os.Environment;
import android.os.Bundle;
import android.view.View;
import com.twitter.library.client.as;
import com.twitter.library.util.bq;
import android.text.TextUtils;
import android.database.Cursor;
import android.support.v4.content.Loader;
import com.twitter.library.client.bj;
import android.net.Uri;
import android.os.Parcelable;
import android.content.Context;
import android.content.Intent;
import android.app.Activity;
import com.twitter.android.util.x;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import android.view.View$OnClickListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.internal.android.service.a;
import java.util.List;
import com.twitter.library.api.account.w;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import java.lang.ref.WeakReference;
import com.twitter.library.service.z;

class fm extends z
{
    final WeakReference a;
    
    public fm(final DispatchActivity dispatchActivity) {
        this.a = new WeakReference((T)dispatchActivity);
    }
    
    @Override
    public void a(final y y) {
        final DispatchActivity dispatchActivity = (DispatchActivity)this.a.get();
        if (dispatchActivity != null && ((aa)y.l().b()).a()) {
            final List f = ((w)y).f();
            if (f != null && f.size() > 0 && !dispatchActivity.e) {
                dispatchActivity.c.b(f.get(0));
            }
        }
    }
}
