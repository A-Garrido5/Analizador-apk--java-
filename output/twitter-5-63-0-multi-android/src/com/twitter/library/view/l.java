// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.api.MentionEntity;
import com.twitter.library.api.HashtagEntity;
import com.twitter.errorreporter.a;
import com.twitter.library.api.Entity;
import android.text.Spannable;
import java.util.Iterator;
import android.text.style.ForegroundColorSpan;
import java.lang.ref.WeakReference;
import android.text.TextUtils;
import com.twitter.library.api.UrlEntity;
import android.util.SparseArray;
import android.text.SpannableStringBuilder;
import com.twitter.library.api.TweetEntities;

public class l
{
    public static CharSequence a(CharSequence charSequence, final TweetEntities tweetEntities, final k k, final int n, final int n2, final boolean b, final boolean b2) {
        if (tweetEntities != null) {
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            if (tweetEntities.b()) {
                int n3 = 0;
                final SparseArray sparseArray = new SparseArray();
                for (final UrlEntity urlEntity : tweetEntities.c()) {
                    final int start = urlEntity.start;
                    if (sparseArray.get(start) == null) {
                        sparseArray.put(start, (Object)Boolean.TRUE);
                        final int n4 = start - n3;
                        final int n5 = urlEntity.end - n3;
                        if (n4 < 0 || n5 > spannableStringBuilder.length()) {
                            continue;
                        }
                        final String displayUrl = urlEntity.displayUrl;
                        int n8;
                        int n9;
                        if (!TextUtils.isEmpty((CharSequence)displayUrl)) {
                            spannableStringBuilder.replace(n4, n5, (CharSequence)displayUrl);
                            final int n6 = n5 - (n4 + displayUrl.length());
                            final int n7 = n5 - n6;
                            n8 = n3 + n6;
                            n9 = n7;
                        }
                        else {
                            n9 = n5;
                            n8 = n3;
                        }
                        Object o;
                        if (k != null) {
                            o = new m(n, !b2, b, new WeakReference((T)k), urlEntity);
                        }
                        else {
                            o = new ForegroundColorSpan(n2);
                        }
                        spannableStringBuilder.setSpan(o, n4, n9, 33);
                        n3 = n8;
                    }
                }
            }
            charSequence = (CharSequence)spannableStringBuilder;
        }
        return charSequence;
    }
    
    public static CharSequence a(final String s, final TweetEntities tweetEntities, final int n, final int n2) {
        return a(s, tweetEntities, null, n, n2, 0, false, false);
    }
    
    public static CharSequence a(final String s, final TweetEntities tweetEntities, final k k, final int n, final int n2) {
        return a(s, tweetEntities, k, n, 0, n2, false, false);
    }
    
    public static CharSequence a(String a, final TweetEntities tweetEntities, final k k, final int n, final int n2, final int n3, final boolean b, final boolean b2) {
        if (tweetEntities != null) {
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)a);
            a((Spannable)spannableStringBuilder, a, tweetEntities.mentions, k, n2, n, n3, b, b2);
            a((Spannable)spannableStringBuilder, a, tweetEntities.hashtags, k, n2, n, n3, b, b2);
            a((Spannable)spannableStringBuilder, a, tweetEntities.cashtags, k, n2, n, n3, b, b2);
            a = (String)a((CharSequence)spannableStringBuilder, tweetEntities, k, n3, n2, b, b2);
        }
        return a;
    }
    
    private static void a(final Spannable spannable, final String s, final Iterable iterable, final k k, final int n, final int n2, final int n3, final boolean b, final boolean b2) {
        for (final Entity entity : iterable) {
            final int start = entity.start;
            final int end = entity.end;
            if (start < end && end <= s.length()) {
                final String substring = s.substring(start, end);
                if (!b2) {
                    spannable.setSpan((Object)new ForegroundColorSpan(n2), start, start + 1, 33);
                }
                Object o;
                if (k != null) {
                    o = new n(n3, !b2, b, new WeakReference((T)k), substring);
                }
                else {
                    o = new ForegroundColorSpan(n);
                }
                spannable.setSpan(o, start + 1, end, 33);
            }
            else {
                final a a = new a();
                if (!TextUtils.isEmpty((CharSequence)s)) {
                    a.a("content", s);
                }
                if (entity instanceof HashtagEntity) {
                    final HashtagEntity hashtagEntity = (HashtagEntity)entity;
                    if (!TextUtils.isEmpty((CharSequence)hashtagEntity.text)) {
                        a.a("hashtag_text", hashtagEntity.text);
                    }
                }
                else if (entity instanceof MentionEntity) {
                    final MentionEntity mentionEntity = (MentionEntity)entity;
                    if (!TextUtils.isEmpty((CharSequence)mentionEntity.screenName)) {
                        a.a("mention screenname", mentionEntity.screenName);
                    }
                }
                a.a("start", entity.start).a("end", entity.end).a(new IllegalArgumentException("entity with invalid length"));
                ErrorReporter.a(a);
            }
        }
    }
}
