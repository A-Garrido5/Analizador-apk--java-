// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.featureswitch;

import com.twitter.library.service.z;
import com.twitter.library.api.y;
import com.twitter.library.client.as;
import android.preference.PreferenceManager;
import com.twitter.library.util.l;
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
import com.twitter.library.client.ab;
import com.twitter.library.client.ad;

class j implements Runnable
{
    final /* synthetic */ i a;
    
    j(final i a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        if (!ad.a().c()) {
            ab.a(this.a.l).c();
            System.exit(0);
        }
    }
}
