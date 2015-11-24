// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.service.ab;
import com.twitter.internal.network.l;
import com.twitter.android.util.ap;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.client.az;
import com.twitter.library.client.as;
import android.content.Intent;
import android.content.Context;
import android.support.v4.content.LocalBroadcastManager;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.os.Bundle;
import android.util.Log;
import com.twitter.library.client.App;
import android.os.Handler;
import com.twitter.android.client.c;
import com.twitter.library.client.au;
import com.twitter.android.client.bg;
import android.app.IntentService;

class eq implements Runnable
{
    final /* synthetic */ DeviceRegistrationService a;
    
    eq(final DeviceRegistrationService a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        this.a.b.g();
    }
}
