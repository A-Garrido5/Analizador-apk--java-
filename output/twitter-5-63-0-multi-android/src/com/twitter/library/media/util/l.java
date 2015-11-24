// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import com.twitter.library.card.property.ImageSpec;
import com.twitter.internal.android.util.Size;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.api.conversations.DMPhoto;
import com.twitter.library.util.bj;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.manager.k;
import com.twitter.library.api.MediaEntity;

public class l
{
    public static k a(final MediaEntity mediaEntity) {
        return j.a(mediaEntity.mediaUrl).a(mediaEntity.size).a(TweetImageVariant.f);
    }
    
    public static k a(final TweetClassicCard tweetClassicCard) {
        if (tweetClassicCard.imageUrlLarge != null && bj.a > 1.0f) {
            return j.a(tweetClassicCard.imageUrlLarge, tweetClassicCard.imageSize.a(2.0f));
        }
        return j.a(tweetClassicCard.imageUrl, tweetClassicCard.imageSize);
    }
    
    public static k a(final DMPhoto dmPhoto) {
        return j.a(dmPhoto.mediaUrl, dmPhoto.width, dmPhoto.height).a(TweetImageVariant.e);
    }
    
    public static k a(final CardInstanceData cardInstanceData) {
        final ImageSpec j = cardInstanceData.j();
        if (j != null) {
            return com.twitter.library.media.manager.j.a(j.url, Size.a(j.size.x, j.size.y));
        }
        return null;
    }
}
