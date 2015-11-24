// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import java.util.Iterator;
import com.twitter.util.f;
import java.util.ArrayList;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.be;
import java.io.Serializable;

public class ActivityDataList implements Serializable
{
    private static final long serialVersionUID = 9162906027873032150L;
    public final long creatorUserId;
    public final String fullName;
    public final long id;
    public final String name;
    
    public ActivityDataList(final be be) {
        this.id = be.a();
        this.name = be.a;
        this.fullName = be.b;
        final TwitterUser h = be.h;
        long userId;
        if (h == null) {
            userId = 0L;
        }
        else {
            userId = h.userId;
        }
        this.creatorUserId = userId;
    }
    
    public static ArrayList a(final byte[] array) {
        return (ArrayList)f.a(array);
    }
    
    public static byte[] a(final ArrayList list) {
        final ArrayList<ActivityDataList> list2 = new ArrayList<ActivityDataList>(list.size());
        final Iterator<be> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(new ActivityDataList(iterator.next()));
        }
        return f.a(list2);
    }
}
