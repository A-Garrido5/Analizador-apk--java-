import java.util.List;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.api.TimelineScribeContent;
import com.twitter.library.api.TwitterSocialProof;
import com.twitter.library.provider.ad;
import com.twitter.util.f;
import com.twitter.library.api.WhoToFollow$Metadata;
import com.twitter.library.provider.bb;
import com.twitter.library.provider.cn;
import android.database.Cursor;

// 
// Decompiled by Procyon v0.5.30
// 

public class hr extends lv
{
    public boolean a(final Cursor cursor) {
        final int int1 = cursor.getInt(cn.h);
        return bb.n(int1) || bb.p(int1) || bb.o(int1);
    }
    
    public hs b(final Cursor cursor) {
        final long long1 = cursor.getLong(cn.d);
        final long long2 = cursor.getLong(21);
        final WhoToFollow$Metadata whoToFollow$Metadata = (WhoToFollow$Metadata)f.a(cursor.getBlob(cn.g));
        if (bb.o(cursor.getInt(cn.h)) && whoToFollow$Metadata != null) {
            final ad ad = new ad(cursor);
            final TwitterSocialProof twitterSocialProof = whoToFollow$Metadata.userIdToSocialProofMap.get(String.valueOf(ad.n));
            if (twitterSocialProof != null) {
                ad.a(twitterSocialProof);
            }
            return new hs(long1, long2, null, CollectionUtils.d(new hk(long1, long2, ad.a(), null)), whoToFollow$Metadata);
        }
        return new hs(long1, long2, null, null, whoToFollow$Metadata);
    }
}
