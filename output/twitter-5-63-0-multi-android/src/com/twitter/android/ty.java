// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.service.a;
import com.twitter.library.client.as;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.client.az;
import com.twitter.library.api.z;
import java.util.HashSet;
import android.database.Cursor;
import android.content.Context;
import com.twitter.library.util.k;

public class ty extends k
{
    public ty(final Context context, final oy oy) {
        super(context, oy.a, oy.b, oy.c, oy.d, oy.e);
    }
    
    public static pp a(final Context context, final Cursor cursor) {
        final HashSet<Long> set = new HashSet<Long>();
        for (int n = 0; cursor.moveToNext() && n < 400 && set.size() < 100; ++n) {
            if (cursor.getInt(18) == 1 && z.a(cursor.getInt(30))) {
                set.add(cursor.getLong(5));
            }
        }
        final int size = set.size();
        pp pp = null;
        if (size > 0) {
            pp = new pp(context, az.a(context).b(), CollectionUtils.c(set));
        }
        cursor.moveToFirst();
        return pp;
    }
    
    @Override
    public Cursor a() {
        final Cursor a = super.a();
        if (a != null) {
            final Context context = this.getContext();
            final pp a2 = a(context, a);
            if (a2 != null) {
                as.a(context).a((a)a2);
            }
        }
        return a;
    }
}
