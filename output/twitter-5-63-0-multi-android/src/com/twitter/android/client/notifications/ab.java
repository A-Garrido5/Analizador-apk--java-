// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client.notifications;

import com.twitter.library.platform.d;
import com.twitter.errorreporter.a;

class ab extends a
{
    public ab(final long n, final d d) {
        super(n);
        this.a("StatusBarNotifErrorLog.notification_id", d.p);
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < d.t.length; ++i) {
            final StringBuilder sb2 = new StringBuilder();
            String s;
            if (i == 0) {
                s = "";
            }
            else {
                s = ",";
            }
            sb.append(sb2.append(s).append(d.t[i].b).toString());
        }
        this.a("StatusBarNotifErrorLog.inbox_ids", sb.toString());
    }
}
