// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.bj;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.android.util.x;
import com.twitter.android.util.al;
import com.twitter.android.util.w;
import com.twitter.android.util.ap;
import android.preference.PreferenceManager;
import com.twitter.library.client.az;
import android.app.Activity;
import com.twitter.android.client.bg;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.android.util.AppEventTrack;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.client.c;
import com.twitter.util.collection.CollectionUtils;
import android.text.TextUtils;
import android.content.Intent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import com.twitter.library.api.as;
import com.twitter.library.client.Session;
import android.content.Context;

class ss extends ax
{
    final /* synthetic */ SignUpFlowController b;
    
    public ss(final SignUpFlowController b, final Context context) {
        this.b = b;
        super(context);
    }
    
    @Override
    public void a(final Session session, final int n, final int n2, final as as) {
        this.b.a("create", "", "failure", session.g());
        this.b.a(session, false, n, as);
    }
    
    @Override
    public void a(final Session session, final as as) {
        this.b.a("create", "", "failure", session.g());
        this.b.a(session, false, 0, as);
    }
    
    @Override
    public void a(final Session session, final String s) {
        super.a(session, s);
        this.b.b(session);
        this.b.a(session, true, 0, null);
    }
}
