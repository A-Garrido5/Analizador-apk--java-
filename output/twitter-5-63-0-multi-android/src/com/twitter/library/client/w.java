// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.text.TextUtils;
import com.twitter.library.api.b;
import com.twitter.library.featureswitch.d;
import com.twitter.library.util.bk;
import android.content.Context;
import java.util.Iterator;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import android.util.Pair;
import com.twitter.library.util.bq;
import android.os.AsyncTask;

class w extends AsyncTask
{
    final /* synthetic */ v a;
    
    w(final v a) {
        this.a = a;
    }
    
    protected Void a(final Void... array) {
        for (final Pair pair : bq.d(this.a.b)) {
            as.a(this.a.b).a(new ot(this.a.b, this.a.c.b(), (String)pair.first, (String)pair.second), new x(this.a, null));
        }
        return null;
    }
}
