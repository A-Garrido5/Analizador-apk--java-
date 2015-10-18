// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.provider.ad;
import java.util.ArrayList;
import java.util.Collections;
import android.database.Cursor;
import java.util.Iterator;
import com.twitter.library.media.util.l;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.media.util.q;
import com.twitter.internal.android.util.Size;
import com.twitter.library.provider.Tweet;
import android.text.TextUtils;
import android.net.Uri;
import android.content.Context;
import java.util.List;
import android.support.v4.content.CursorLoader;

class il extends CursorLoader
{
    private final long a;
    private List b;
    
    il(final Context context, final Uri uri, final String[] array, final String s, final String[] array2, final String s2, final long a) {
        String s3;
        if (TextUtils.isEmpty((CharSequence)s2)) {
            s3 = "type DESC";
        }
        else {
            s3 = s2;
        }
        super(context, uri, array, s, array2, s3);
        this.a = a;
    }
    
    private static void a(final List list, final Tweet tweet, final long n) {
        if (!tweet.G.media.c()) {
            List list2;
            if (n == -1L) {
                list2 = q.a(tweet, Size.a);
            }
            else {
                list2 = q.a(tweet, n, Size.a);
            }
            final Iterator<MediaEntity> iterator = list2.iterator();
            while (iterator.hasNext()) {
                list.add(new ii(tweet, l.a(iterator.next())));
            }
        }
    }
    
    public List a() {
        return this.b;
    }
    
    @Override
    public Cursor loadInBackground() {
        final Cursor loadInBackground = super.loadInBackground();
        if (loadInBackground == null || !loadInBackground.moveToFirst()) {
            this.b = Collections.emptyList();
            return loadInBackground;
        }
        final ArrayList<ii> b = new ArrayList<ii>();
        do {
            final Tweet a = new ad(loadInBackground).a();
            if (a.l != null && a.l.classicCard != null) {
                b.add(new ii(a, l.a(a.l.classicCard)));
            }
            else {
                a(b, a, this.a);
            }
        } while (loadInBackground.moveToNext());
        this.b = b;
        return loadInBackground;
    }
}
