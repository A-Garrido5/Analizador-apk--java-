// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.featureswitch;

import com.twitter.library.client.as;
import java.io.File;
import com.crashlytics.android.d;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import com.twitter.library.util.bq;
import com.twitter.library.network.ae;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import java.util.Collection;
import com.twitter.library.client.az;
import java.util.Iterator;
import com.twitter.library.client.af;
import com.twitter.library.client.ad;
import org.json.JSONException;
import java.util.Map;
import android.os.Looper;
import android.util.Log;
import com.twitter.library.client.App;
import android.os.Handler;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import com.twitter.config.c;
import com.twitter.internal.android.service.a;
import android.preference.PreferenceManager;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class l extends z
{
    final /* synthetic */ long a;
    final /* synthetic */ i b;
    
    l(final i b, final long a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final y y) {
        final boolean a = ((aa)y.l().b()).a();
        this.b.f.get(this.a).a(a);
        if (a) {
            PreferenceManager.getDefaultSharedPreferences(this.b.l).edit().putLong("feature_timestamp_" + this.a, System.currentTimeMillis()).apply();
            ix.a("fs:load:fetched_manifest", ir.b(), this.a, ih.m).j();
        }
    }
}
