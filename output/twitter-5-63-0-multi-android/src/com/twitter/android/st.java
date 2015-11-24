// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.bj;
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
import android.text.TextUtils;
import android.content.Intent;
import com.twitter.library.client.Session;
import com.twitter.library.api.as;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import com.twitter.internal.android.service.a;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.service.z;

class st extends z
{
    private Context a;
    
    public st(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    @Override
    public void a(final y y) {
        final aa aa = (aa)y.l().b();
        final oj oj = (oj)y;
        final boolean a = aa.a();
        final int[] e = oj.e();
        final SignUpFlowController a2 = SignUpFlowController.a(this.a);
        a2.a(a, "begin", e);
        if (a) {
            a2.a(SignUpFlowController$PhoneState.b);
        }
        else if (e != null && CollectionUtils.a(e, 287)) {
            a2.a(SignUpFlowController$PhoneState.d);
        }
        else {
            a2.a(SignUpFlowController$PhoneState.a);
        }
        if (a2.j()) {
            a2.b(true, null);
            return;
        }
        a2.a(a, e);
    }
}
