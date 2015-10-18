// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import android.os.Handler;
import android.os.Looper;
import com.twitter.library.provider.b;
import android.os.Parcelable;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.library.api.UserSettings;
import com.twitter.library.service.aa;
import com.twitter.errorreporter.a;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.bg;
import com.twitter.library.client.ap;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.client.as;

class x implements Runnable
{
    final /* synthetic */ w a;
    
    x(final w a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        as.a(this.a.p).a(new qd(this.a.p, this.a.P(), this.a.a.userId, this.a.a.username), (z)null);
    }
}
