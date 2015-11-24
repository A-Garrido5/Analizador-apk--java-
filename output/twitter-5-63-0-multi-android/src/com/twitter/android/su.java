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
import com.twitter.util.collection.CollectionUtils;
import android.text.TextUtils;
import android.content.Intent;
import com.twitter.library.client.Session;
import com.twitter.library.api.as;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import com.twitter.internal.android.service.a;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.service.z;

class su extends z
{
    private Context a;
    
    private su(final Context context) {
        this.a = context.getApplicationContext();
    }
    
    @Override
    public void a(final y y) {
        final aa aa = (aa)y.l().b();
        final ok ok = (ok)y;
        final boolean a = aa.a();
        final int[] e = ok.e();
        final SignUpFlowController a2 = SignUpFlowController.a(this.a);
        a2.a(a, "complete", e);
        if (a) {
            final boolean f = ok.f();
            if (f) {
                a2.a(SignUpFlowController$PhoneState.d);
            }
            a2.b(f, e);
            return;
        }
        a2.a(SignUpFlowController$PhoneState.b);
        a2.b(false, e);
    }
}
