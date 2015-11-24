// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.platform.notifications;

import android.os.Parcel;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class a
{
    public static final a a;
    public static final List b;
    public static final List c;
    public static final List d;
    private static final HashMap g;
    public final int e;
    public final String f;
    
    static {
        a = new a(4, "follow");
        g = new HashMap(8);
        final ArrayList<a> list = new ArrayList<a>(3);
        list.add(new a(0, "reply"));
        list.add(new a(1, null));
        list.add(new a(2, "favorite"));
        b = Collections.unmodifiableList((List<?>)list);
        final ArrayList<a> list2 = new ArrayList<a>(2);
        list2.add(com.twitter.library.platform.notifications.a.a);
        list2.add(new a(5, "tweet_to"));
        c = Collections.unmodifiableList((List<?>)list2);
        final ArrayList<a> list3 = new ArrayList<a>(2);
        list3.add(new a(6, "accept"));
        list3.add(new a(7, "deny"));
        d = Collections.unmodifiableList((List<?>)list3);
        com.twitter.library.platform.notifications.a.g.put("reply", 0);
        com.twitter.library.platform.notifications.a.g.put("retweet", 1);
        com.twitter.library.platform.notifications.a.g.put("favorite", 2);
        com.twitter.library.platform.notifications.a.g.put("share", 3);
        com.twitter.library.platform.notifications.a.g.put("follow", 4);
        com.twitter.library.platform.notifications.a.g.put("tweet_to", 5);
        com.twitter.library.platform.notifications.a.g.put("accept", 6);
        com.twitter.library.platform.notifications.a.g.put("deny", 7);
    }
    
    public a(final int e, final String f) {
        this.e = e;
        this.f = f;
    }
    
    public a(final Parcel parcel) {
        this.e = parcel.readInt();
        this.f = parcel.readString();
    }
    
    public a(final String s, final String s2) {
        this(com.twitter.library.platform.notifications.a.g.get(s), s2);
    }
    
    public void a(final Parcel parcel) {
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
    }
}
