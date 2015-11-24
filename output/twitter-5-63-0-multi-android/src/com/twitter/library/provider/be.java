// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.net.Uri;
import android.provider.BaseColumns;

public final class be implements BaseColumns
{
    public static final Uri A;
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
    public static final Uri u;
    public static final Uri v;
    public static final Uri w;
    public static final Uri x;
    public static final Uri y;
    public static final Uri z;
    
    static {
        a = Uri.parse(ae.d + "user_groups_view");
        b = Uri.parse(ae.d + "user_groups_view" + "/subscribers");
        c = Uri.parse(ae.d + "user_groups_view" + "/members");
        d = Uri.parse(ae.d + "user_groups_view" + "/search");
        e = Uri.parse(ae.d + "user_groups_view" + "/event");
        f = Uri.parse(ae.d + "user_groups_view" + "/blocked");
        g = Uri.parse(ae.d + "user_groups_view" + "/following");
        h = Uri.parse(ae.d + "user_groups_view" + "/followers");
        i = Uri.parse(ae.d + "user_groups_view" + "/verified_followers");
        j = Uri.parse(ae.d + "user_groups_view" + "/people");
        k = Uri.parse(ae.d + "user_groups_view" + "/contacts");
        l = Uri.parse(ae.d + "user_groups_view" + "/dm_contacts");
        m = Uri.parse(ae.d + "user_groups_view" + "/device_following");
        n = Uri.parse(ae.d + "user_groups_view" + "/category_users");
        o = Uri.parse(ae.d + "user_groups_view" + "/activity_sources");
        p = Uri.parse(ae.d + "user_groups_view" + "/activity_targets");
        q = Uri.parse(ae.d + "user_groups_view" + "/favorited");
        r = Uri.parse(ae.d + "user_groups_view" + "/retweeted");
        s = Uri.parse(ae.d + "user_groups_view" + "/media_tagged");
        t = Uri.parse(ae.d + "user_groups_view" + "/incoming_friendships");
        u = Uri.parse(ae.d + "user_groups_view" + "/mutual_follows");
        v = Uri.parse(ae.d + "user_groups_view" + "/welcome_wtf");
        w = Uri.parse(ae.d + "user_groups_view" + "/find_people");
        x = Uri.parse(ae.d + "user_groups_view" + "/streamified_wtf");
        y = Uri.parse(ae.d + "user_groups_view" + "/similar_to");
        z = Uri.parse(ae.d + "user_groups_view" + "/follow_recommendations");
        A = Uri.parse(ae.d + "user_groups_view" + "/geo_wtf");
    }
}
