// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import com.twitter.library.api.MediaEntity;
import com.twitter.library.api.MediaEntityList;
import com.twitter.library.api.ax;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.media.util.q;
import com.twitter.library.util.text.d;
import java.util.Iterator;
import com.twitter.util.l;
import com.twitter.library.api.UrlEntity;
import com.twitter.util.k;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.api.TweetEntities;

public class j
{
    static final /* synthetic */ boolean a;
    private final String b;
    private final String c;
    private final TweetEntities d;
    private final CardInstanceData e;
    private final TweetClassicCard f;
    private final long g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    
    static {
        a = !i.class.desiredAssertionStatus();
    }
    
    public j(final QuotedTweetData quotedTweetData) {
        this.l = true;
        this.d = quotedTweetData.entities;
        this.e = quotedTweetData.cardInstanceData;
        this.f = quotedTweetData.b();
        String renderedText;
        if (quotedTweetData.renderedText != null) {
            renderedText = quotedTweetData.renderedText;
        }
        else {
            renderedText = "";
        }
        this.b = renderedText;
        this.c = this.b;
        this.g = 0L;
        this.m = false;
        this.n = true;
    }
    
    public j(final Tweet tweet) {
        this.l = true;
        this.d = tweet.G;
        this.e = tweet.W();
        this.f = tweet.S();
        this.b = com.twitter.util.k.a(tweet.c());
        this.c = tweet.y;
        this.g = tweet.J;
        this.m = tweet.O();
        this.n = tweet.N();
    }
    
    static UrlEntity a(final CardInstanceData cardInstanceData, final Iterable iterable) {
        if (cardInstanceData != null) {
            int n;
            if (l.a(cardInstanceData.name, "amplify") || l.a(cardInstanceData.name, "video")) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                for (final UrlEntity urlEntity : iterable) {
                    if (urlEntity.url.equals(cardInstanceData.url)) {
                        return urlEntity;
                    }
                }
            }
        }
        return null;
    }
    
    private static UrlEntity a(final Iterable iterable) {
        for (final UrlEntity urlEntity : iterable) {
            if (urlEntity.displayUrl.contains("cards.twitter.com/cards/")) {
                return urlEntity;
            }
        }
        return null;
    }
    
    private static String a(final String s) {
        int length;
        for (length = s.length(); length > 0 && s.charAt(length - 1) <= ' '; --length) {}
        return s.substring(0, length);
    }
    
    private int b() {
        final Iterator iterator = this.d.urls.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            int n2;
            if (com.twitter.library.util.text.d.e.matcher(iterator.next().expandedUrl).find()) {
                n2 = n + 1;
            }
            else {
                n2 = n;
            }
            n = n2;
        }
        return n;
    }
    
    public i a() {
        int n = 1;
        final MediaEntityList media = this.d.media;
        final MediaEntity a = q.a(media);
        String s;
        if (this.h) {
            s = this.b;
        }
        else {
            s = this.c;
        }
        int n2;
        if (this.i && (a != null || (this.e != null && this.e.q()) || (this.e != null && this.e.n()))) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        int n3;
        if ((q.d(media) || (this.e != null && (this.e.a() || this.e.p()))) && com.twitter.library.featureswitch.d.f("strip_amplify_urls_from_tweet_text_enabled")) {
            n3 = n;
        }
        else {
            n3 = 0;
        }
        int n4;
        if (this.k && this.m) {
            n4 = n;
        }
        else {
            n4 = 0;
        }
        int n5;
        if (n2 != 0 || n3 != 0 || this.j || this.n || n4 != 0) {
            n5 = n;
        }
        else {
            n5 = 0;
        }
        TweetEntities d = null;
        Label_0599: {
            if (n5 != 0 && this.d.b()) {
                final UrlEntity urlEntity = (UrlEntity)CollectionUtils.b(this.d.c());
                if (!com.twitter.library.provider.j.a && urlEntity == null) {
                    throw new AssertionError();
                }
                String substring;
                if (s.endsWith(Character.toString('\u200e'))) {
                    substring = s.substring(0, -1 + s.length());
                }
                else {
                    substring = s;
                }
                if ((a == null || !urlEntity.url.equals(a.url)) && (this.f == null || !urlEntity.url.equals(this.f.url)) && (this.e == null || !urlEntity.url.equals(this.e.url)) && (n4 == 0 || this.b() != n || !com.twitter.library.util.text.d.e.matcher(urlEntity.expandedUrl).find())) {
                    n = 0;
                }
                while (true) {
                    Label_0730: {
                        if (n == 0) {
                            break Label_0730;
                        }
                        String s2;
                        if (this.h) {
                            s2 = urlEntity.displayUrl;
                        }
                        else {
                            s2 = urlEntity.url;
                        }
                        if (!substring.endsWith(s2)) {
                            break Label_0730;
                        }
                        int n6;
                        if (this.h) {
                            n6 = urlEntity.displayStart;
                        }
                        else {
                            n6 = urlEntity.start;
                        }
                        final String substring2 = substring.substring(0, n6);
                        UrlEntity urlEntity2;
                        if (n3 != 0) {
                            urlEntity2 = a(this.e, this.d.urls);
                        }
                        else {
                            urlEntity2 = a(this.d.urls);
                        }
                        if (urlEntity2 == null || (this.e == null && this.f == null)) {
                            s = substring2;
                            d = null;
                            break Label_0599;
                        }
                        String s3;
                        if (this.h) {
                            s3 = urlEntity2.displayUrl;
                        }
                        else {
                            s3 = urlEntity2.url;
                        }
                        final String replaceAll = substring2.replaceAll(s3 + " | " + s3 + "|" + s3, "");
                        if (this.l) {
                            d = (TweetEntities)new ax(this.d).b(urlEntity2).c().f();
                            int n7;
                            if (this.h) {
                                n7 = urlEntity2.displayStart;
                            }
                            else {
                                n7 = urlEntity2.start;
                            }
                            d.a(n7, -(1 + s3.length()));
                            s = replaceAll;
                            break Label_0599;
                        }
                        s = replaceAll;
                        d = null;
                        break Label_0599;
                    }
                    final String substring2 = s;
                    continue;
                }
            }
            else {
                d = null;
            }
        }
        final String a2 = a(s);
        if (!this.l) {
            return new i(a2, null);
        }
        if (d == null) {
            d = this.d;
        }
        return new i(a2, d);
    }
    
    public j a(final boolean h) {
        this.h = h;
        return this;
    }
    
    public j b(final boolean i) {
        this.i = i;
        return this;
    }
    
    public j c(final boolean j) {
        this.j = j;
        return this;
    }
    
    public j d(final boolean k) {
        this.k = k;
        return this;
    }
    
    public j e(final boolean l) {
        this.l = l;
        return this;
    }
}
