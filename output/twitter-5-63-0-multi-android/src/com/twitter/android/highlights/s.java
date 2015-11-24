// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import com.twitter.internal.android.service.a;
import com.twitter.library.client.k;
import android.content.Context;
import com.twitter.library.client.az;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import java.lang.ref.WeakReference;
import com.twitter.library.service.z;

class s extends z
{
    private WeakReference a;
    
    public s(final StoriesActivity storiesActivity) {
        this.a = new WeakReference((T)storiesActivity);
    }
    
    @Override
    public void a(final y y) {
        final StoriesActivity storiesActivity = (StoriesActivity)this.a.get();
        if (storiesActivity == null) {
            return;
        }
        final aa aa = (aa)y.l().b();
        final k k = new k((Context)storiesActivity, az.a((Context)storiesActivity).b().e());
        if (aa.a()) {
            storiesActivity.a(true);
            k.a().a("highlights_last_user_view_time", System.currentTimeMillis()).apply();
        }
        else {
            storiesActivity.a(false);
            k.a().a("highlights_last_user_view_time").apply();
        }
        storiesActivity.e();
    }
}
