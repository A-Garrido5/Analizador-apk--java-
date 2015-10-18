// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform;

import android.support.v4.util.TimeUtils;
import android.accounts.Account;
import android.content.Context;
import com.twitter.library.client.App;
import com.twitter.errorreporter.a;

class i extends a
{
    public i() {
        this.a("PushDebugErrorLog.flavor", App.o());
    }
    
    public i(final Context context, final Account account, final int n) {
        this();
        this.a("PushDebugErrorLog.error code", n);
        this.a("PushDebugErrorLog.account", account.name);
        final StringBuilder sb = new StringBuilder();
        TimeUtils.formatDuration(System.currentTimeMillis() - PushService.a(context, account), sb);
        this.a("PushDebugErrorLog.refresh duration", sb);
    }
}
