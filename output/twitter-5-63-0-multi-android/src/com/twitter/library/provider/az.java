// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public final class az implements BaseColumns
{
    public static final Uri a;
    public static final Uri b;
    public static final Uri c;
    public static final Uri d;
    public static final Uri e;
    public static final Uri f;
    public static final Uri g;
    public static final Uri h;
    public static final Uri i;
    public static final Uri j;
    public static final Uri k;
    public static final Uri l;
    public static final Uri m;
    public static final Uri n;
    public static final Uri o;
    public static final Uri p;
    public static final Uri q;
    public static final Uri r;
    public static final Uri s;
    public static final Uri t;
    
    static {
        a = Uri.parse(ae.d + "status_groups_view");
        b = Uri.parse(ae.d + "status_groups_view" + "/custom_timeline_users");
        c = Uri.parse(ae.d + "status_groups_view" + "/ref_id");
        d = Uri.parse(ae.d + "status_groups_view" + "/id");
        e = Uri.parse(ae.d + "status_groups_view" + "/list");
        f = Uri.parse(ae.d + "status_groups_view" + "/category");
        g = Uri.parse(ae.d + "status_groups_view" + "/mentions");
        h = Uri.parse(ae.d + "status_groups_view" + "/replies");
        i = Uri.parse(ae.d + "status_groups_view" + "/home");
        j = Uri.parse(ae.d + "status_groups_view" + "/favorites");
        k = Uri.parse(ae.d + "status_groups_view" + "/timeline");
        l = Uri.parse(ae.d + "status_groups_view" + "/mentions_and_rts");
        m = Uri.parse(ae.d + "status_groups_view" + "/conversation");
        n = Uri.parse(ae.d + "status_groups_view" + "/conversation_older");
        o = Uri.parse(ae.d + "status_groups_view" + "/conversation_newer");
        p = Uri.parse(ae.d + "status_groups_view" + "/activity_targets");
        q = Uri.parse(ae.d + "status_groups_view" + "/activity_target_objects");
        r = Uri.parse(ae.d + "status_groups_view" + "/activity");
        s = Uri.parse(ae.d + "status_groups_view" + "/media");
        t = Uri.parse(ae.d + "status_groups_view" + "/moments");
    }
}
