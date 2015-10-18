// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import com.twitter.util.collection.CollectionUtils;
import java.io.ObjectOutput;
import java.util.List;
import java.io.ObjectInput;
import java.io.Serializable;
import java.util.Iterator;
import android.text.TextUtils;
import android.util.SparseArray;
import com.twitter.util.f;
import java.io.Externalizable;

public class TweetEntities implements Externalizable
{
    public static final TweetEntities a;
    private static final long serialVersionUID = -5337896425238019090L;
    public EntityList cashtags;
    public EntityList hashtags;
    public MediaEntityList media;
    public EntityList mentions;
    public EntityList urls;
    
    static {
        a = (TweetEntities)new ax().f();
    }
    
    public TweetEntities() {
        this(new ax());
    }
    
    public TweetEntities(final ax ax) {
        this.urls = (EntityList)ax.a.f();
        this.media = (MediaEntityList)ax.b.f();
        this.mentions = (EntityList)ax.c.f();
        this.hashtags = (EntityList)ax.d.f();
        this.cashtags = (EntityList)ax.e.f();
    }
    
    public static TweetEntities a(final byte[] array) {
        final TweetEntities tweetEntities = (TweetEntities)f.a(array);
        if (tweetEntities != null) {
            return tweetEntities;
        }
        return TweetEntities.a;
    }
    
    public static StringBuilder a(final StringBuilder sb, final TweetEntities tweetEntities) {
        if (tweetEntities != null) {
            for (final HashtagEntity hashtagEntity : tweetEntities.hashtags) {
                hashtagEntity.displayStart = hashtagEntity.start;
                hashtagEntity.displayEnd = hashtagEntity.end;
            }
            if (tweetEntities.b()) {
                final SparseArray sparseArray = new SparseArray();
                final Iterator<UrlEntity> iterator2 = tweetEntities.c().iterator();
                int n = 0;
                while (iterator2.hasNext()) {
                    final UrlEntity urlEntity = iterator2.next();
                    final int start = urlEntity.start;
                    final UrlEntity urlEntity2 = (UrlEntity)sparseArray.get(start);
                    if (urlEntity2 != null) {
                        urlEntity.displayStart = urlEntity2.displayStart;
                        urlEntity.displayEnd = urlEntity2.displayEnd;
                    }
                    else {
                        sparseArray.put(start, (Object)urlEntity);
                        final int displayStart = start - n;
                        final int n2 = urlEntity.end - n;
                        if (displayStart >= 0 && n2 <= sb.length()) {
                            final String displayUrl = urlEntity.displayUrl;
                            if (!TextUtils.isEmpty((CharSequence)displayUrl)) {
                                sb.replace(displayStart, n2, displayUrl);
                                final int displayEnd = displayStart + displayUrl.length();
                                n += n2 - displayEnd;
                                urlEntity.displayStart = displayStart;
                                urlEntity.displayEnd = displayEnd;
                            }
                        }
                        for (final HashtagEntity hashtagEntity2 : tweetEntities.hashtags) {
                            if (urlEntity.displayStart < hashtagEntity2.displayStart) {
                                hashtagEntity2.b(-n);
                            }
                        }
                    }
                }
            }
        }
        return sb;
    }
    
    public void a(final int n, final int n2) {
        this.urls.a(n, n2);
        this.media.a(n, n2);
        this.mentions.a(n, n2);
        this.hashtags.a(n, n2);
        this.cashtags.a(n, n2);
    }
    
    public boolean a(final long n) {
        final Iterator iterator = this.mentions.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().userId == n) {
                return true;
            }
        }
        return false;
    }
    
    public boolean a(final TweetEntities tweetEntities) {
        return this == tweetEntities || (tweetEntities != null && this.urls.equals(tweetEntities.urls) && this.media.equals(tweetEntities.media) && this.mentions.equals(tweetEntities.mentions) && this.hashtags.equals(tweetEntities.hashtags) && this.cashtags.equals(tweetEntities.cashtags));
    }
    
    public byte[] a() {
        return f.a(this);
    }
    
    public boolean b() {
        return !this.urls.c() || !this.media.c();
    }
    
    public Iterable c() {
        return xy.a(this.urls, this.media, Entity.a);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof TweetEntities && this.a((TweetEntities)o));
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * this.urls.hashCode() + this.media.hashCode()) + this.mentions.hashCode()) + this.hashtags.hashCode()) + this.cashtags.hashCode();
    }
    
    @Override
    public void readExternal(final ObjectInput objectInput) {
        final List list = (List)objectInput.readObject();
        if (list != null) {
            for (int i = -1 + this.urls.b(); i >= 0; --i) {
                if (list.get(i) instanceof MediaEntity) {
                    list.remove(i);
                }
            }
            this.urls = new EntityList(list);
        }
        final List list2 = (List)objectInput.readObject();
        if (list2 != null) {
            this.mentions = new EntityList(list2);
        }
        final List list3 = (List)objectInput.readObject();
        if (list3 != null) {
            this.media = new MediaEntityList(list3);
        }
        final List list4 = (List)objectInput.readObject();
        if (list4 != null) {
            this.hashtags = new EntityList(list4);
        }
        try {
            objectInput.readObject();
            final List list5 = (List)objectInput.readObject();
            if (list5 != null) {
                this.cashtags = new EntityList(list5);
            }
        }
        catch (Exception ex) {}
    }
    
    @Override
    public String toString() {
        return this.urls + ";" + this.media + ";" + this.mentions + ";" + this.hashtags + ";" + this.cashtags;
    }
    
    @Override
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(CollectionUtils.b(this.urls.d()));
        objectOutput.writeObject(CollectionUtils.b(this.mentions.d()));
        objectOutput.writeObject(CollectionUtils.b(this.media.d()));
        objectOutput.writeObject(CollectionUtils.b(this.hashtags.d()));
        objectOutput.writeObject(null);
        objectOutput.writeObject(CollectionUtils.b(this.cashtags.d()));
    }
}
