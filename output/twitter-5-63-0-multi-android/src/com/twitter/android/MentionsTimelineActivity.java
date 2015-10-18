// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.d;
import android.os.Bundle;
import android.content.Context;
import com.twitter.android.client.bn;
import android.content.Intent;

public class MentionsTimelineActivity extends NotificationsBaseTimelineActivity
{
    @Override
    protected jy a(final Intent intent, final bn bn) {
        return new jy(new mk((Context)this, this.T()).a(), "connect");
    }
    
    public void a(final Bundle bundle, final d d) {
        super.a(bundle, d);
        this.H().a("connect");
    }
}
