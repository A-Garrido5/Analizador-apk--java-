// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.trends;

import com.twitter.library.service.y;
import com.twitter.library.api.account.ab;
import com.twitter.library.client.as;
import com.twitter.library.api.UserSettings;
import com.twitter.internal.android.widget.ToolBar;
import android.content.Context;
import com.twitter.library.client.Session;
import android.content.Intent;

public class f
{
    public void a(final int n, final int n2, final Intent intent, final Session session, final Context context, final ToolBar toolBar, final TrendsPlusFragment trendsPlusFragment) {
        if (this.a(n, n2, intent)) {
            final long longExtra = intent.getLongExtra("woeid", 1L);
            final UserSettings j = session.j();
            if (this.a(j, longExtra)) {
                this.a(j, session, intent.getStringExtra("loc_name"), longExtra, context);
                this.a(toolBar, !j.s);
                if (trendsPlusFragment != null) {
                    trendsPlusFragment.a_(3);
                }
            }
        }
    }
    
    void a(final ToolBar toolBar, final boolean b) {
        if (toolBar != null) {
            toolBar.a(2131887479).b(b);
        }
    }
    
    void a(final UserSettings userSettings, final Session session, final String b, final long a, final Context context) {
        userSettings.s = false;
        userSettings.a = a;
        userSettings.b = b;
        as.a(context).a(ab.a(context, session, userSettings, true, null));
    }
    
    boolean a(final int n, final int n2, final Intent intent) {
        return n2 == -1 && n == 1 && intent != null && intent.hasExtra("woeid");
    }
    
    boolean a(final UserSettings userSettings, final long n) {
        return userSettings != null && (userSettings.s || userSettings.a != n);
    }
}
