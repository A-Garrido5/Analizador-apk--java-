// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import java.util.Iterator;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.util.d;
import com.twitter.errorreporter.ErrorReporter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import com.twitter.util.collection.g;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.library.api.PromotedContent;
import java.util.List;
import com.twitter.library.api.geo.GeoTag;
import java.io.Serializable;

public class DraftTweet implements Serializable
{
    public String cardUrl;
    public final long draftId;
    public final GeoTag geoTag;
    private long mMediaPreparedAtTimestamp;
    private List mPreparedMediaIds;
    public final List media;
    public final PromotedContent promotedContent;
    public final QuotedTweetData quotedData;
    public final long repliedTweetId;
    public final String statusText;
    
    DraftTweet(final e e) {
        this.draftId = e.a;
        this.statusText = e.b;
        this.media = g.a().a(e.c).d();
        this.repliedTweetId = e.d;
        this.geoTag = e.e;
        this.promotedContent = e.h;
        this.quotedData = e.i;
        this.cardUrl = e.j;
        this.a(e.g, e.f);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Proxy required");
    }
    
    private Object writeReplace() {
        return new DraftTweet$SerializationProxy(this);
    }
    
    public long a() {
        return this.mMediaPreparedAtTimestamp;
    }
    
    public DraftTweet a(final List list, final long mMediaPreparedAtTimestamp) {
        // monitorenter(this)
        Label_0050: {
            if (list == null) {
                break Label_0050;
            }
            try {
                if (this.media.size() != list.size()) {
                    ErrorReporter.a(new IllegalArgumentException("The lists of media and IDs should have equal size"));
                    this.mPreparedMediaIds = null;
                    this.mMediaPreparedAtTimestamp = 0L;
                }
                else {
                    this.mPreparedMediaIds = g.a().a(list).d();
                    this.mMediaPreparedAtTimestamp = mMediaPreparedAtTimestamp;
                }
                return this;
            }
            finally {
            }
            // monitorexit(this)
        }
    }
    
    public List b() {
        return this.mPreparedMediaIds;
    }
    
    public void c() {
        d.c();
        this.a(null, 0L);
        final Iterator<EditableMedia> iterator = this.media.iterator();
        while (iterator.hasNext()) {
            iterator.next().f();
        }
    }
}
