// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public final class ay implements BaseColumns
{
    public static final Uri a;
    public static final Uri b;
    public static final Uri c;
    public static final Uri d;
    public static final Uri e;
    public static final Uri f;
    
    static {
        a = Uri.parse(ae.d + "status_groups_retweets_view");
        b = Uri.parse(ae.d + "status_groups_retweets_view" + "/rt_timeline");
        c = Uri.parse(ae.d + "status_groups_retweets_view" + "/rt_timeline_unlimited");
        d = Uri.parse(ae.d + "status_groups_retweets_view" + "/activity");
        e = Uri.parse(ae.d + "status_groups_retweets_view" + "/rt_media");
        f = Uri.parse(ae.d + "status_groups_retweets_view" + "/ref_id");
    }
}
