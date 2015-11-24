// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import com.twitter.library.featureswitch.d;
import com.twitter.internal.android.util.Size;
import com.twitter.library.media.manager.n;

public enum TweetImageVariant
{
    a("THUMB", 0, Size.a(150, 150), ":thumb"), 
    b("SMALL", 1, Size.a(340, 680), ":small"), 
    c("MEDIUM", 2, Size.a(600, 1200), ":medium"), 
    d("LARGE", 3, Size.a(1024, 2048), ":large");
    
    public static final n e;
    public static final n f;
    public final Size maxSize;
    public final String postfix;
    
    static {
        e = new ai();
        f = new aj();
    }
    
    private TweetImageVariant(final String s, final int n, final Size maxSize, final String postfix) {
        this.maxSize = maxSize;
        this.postfix = postfix;
    }
    
    public static String a(final String s, final TweetImageVariant tweetImageVariant, final boolean b) {
        final boolean a = com.twitter.library.featureswitch.d.a("webp_images_3149", new String[] { "webp" });
        String s2;
        if (b && a) {
            s2 = "?format=webp";
        }
        else {
            s2 = "";
        }
        return s + tweetImageVariant.postfix + s2;
    }
    
    public static List a(final String s, final Size size, final boolean b) {
        final ArrayList<String> list = new ArrayList<String>(4);
        if (!size.c()) {
            final TweetImageVariant[] values = values();
            final int length = values.length;
            int i;
            if (size.a() == size.b()) {
                i = 0;
            }
            else {
                i = 1;
            }
            while (i < length) {
                final TweetImageVariant tweetImageVariant = values[i];
                if (tweetImageVariant.maxSize.b(size)) {
                    list.add(a(s, tweetImageVariant, b));
                }
                ++i;
            }
        }
        if (CollectionUtils.a((Collection)list)) {
            list.add(a(s, TweetImageVariant.d, b));
        }
        return list;
    }
}
