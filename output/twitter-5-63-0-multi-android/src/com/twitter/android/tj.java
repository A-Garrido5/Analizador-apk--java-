// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.LayoutInflater;
import com.twitter.library.media.manager.k;
import com.twitter.library.media.manager.am;
import com.twitter.library.api.MediaEntity;
import android.view.View;
import java.util.Iterator;
import com.twitter.library.media.widget.MediaImageView;
import android.view.ViewGroup;
import com.twitter.internal.android.widget.HorizontalListView;
import java.util.Collections;
import com.twitter.library.media.util.q;
import com.twitter.internal.android.util.Size;
import com.twitter.util.f;
import com.twitter.library.api.TweetEntities;
import java.lang.ref.SoftReference;
import java.util.List;
import android.database.Cursor;
import android.content.Context;
import com.twitter.library.util.ReferenceList;
import android.support.v4.util.LruCache;
import com.twitter.internal.android.widget.t;
import com.twitter.android.client.u;
import android.support.v4.widget.CursorAdapter;

public class tj extends CursorAdapter implements u, t, gu
{
    private final LruCache a;
    private final int b;
    private final int c;
    private final ReferenceList d;
    private boolean e;
    
    public tj(final Context context, final boolean b) {
        super(context, null, 2);
        this.d = ReferenceList.a();
        this.a = new LruCache(50);
        if (b) {
            this.b = 21;
            this.c = 16;
            return;
        }
        this.b = 1;
        this.c = 2;
    }
    
    private long a(final Cursor cursor) {
        if (cursor != null) {
            return cursor.getLong(this.b);
        }
        return 0L;
    }
    
    private List b(final Cursor cursor) {
        final long a = this.a(cursor);
        final SoftReference softReference = (SoftReference)this.a.get(a);
        List<Object> list;
        if (softReference != null) {
            list = softReference.get();
        }
        else {
            list = null;
        }
        if (list == null) {
            final TweetEntities tweetEntities = (TweetEntities)f.a(cursor.getBlob(this.c));
            if (tweetEntities != null) {
                list = (List<Object>)q.d(tweetEntities.media, Size.a);
            }
            else {
                list = Collections.emptyList();
            }
        }
        this.a.put(a, new SoftReference(list));
        return list;
    }
    
    @Override
    public void a(final HorizontalListView horizontalListView, final boolean b) {
        this.b(b);
    }
    
    @Override
    public void b(final boolean e) {
        if (this.e != e && !(this.e = e)) {
            for (final ViewGroup viewGroup : this.d) {
                for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                    ((MediaImageView)viewGroup.getChildAt(i)).setFromMemoryOnly(false);
                }
            }
        }
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final ViewGroup viewGroup = (ViewGroup)view;
        final List b = this.b(cursor);
        final int childCount = viewGroup.getChildCount();
        final int min = Math.min(b.size(), childCount);
        for (int i = 0; i < min; ++i) {
            final MediaEntity mediaEntity = b.get(i);
            final MediaImageView mediaImageView = (MediaImageView)viewGroup.getChildAt(i);
            mediaImageView.setFromMemoryOnly(this.e);
            mediaImageView.a(am.a(mediaEntity.mediaUrl));
            mediaImageView.setVisibility(0);
        }
        for (int j = min; j < childCount; ++j) {
            final MediaImageView mediaImageView2 = (MediaImageView)viewGroup.getChildAt(j);
            mediaImageView2.a((k)null);
            mediaImageView2.setVisibility(8);
        }
    }
    
    @Override
    public long getItemId(final int n) {
        return this.a((Cursor)super.getItem(n));
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final ViewGroup viewGroup2 = (ViewGroup)LayoutInflater.from(context).inflate(2130968881, viewGroup, false);
        this.d.b(viewGroup2);
        return (View)viewGroup2;
    }
}
