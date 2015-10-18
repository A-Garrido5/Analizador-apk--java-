// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import java.util.List;
import com.twitter.internal.android.util.Size;
import com.twitter.library.media.manager.n;

final class aj implements n
{
    @Override
    public List a(final String s, final Size size) {
        return TweetImageVariant.a(s, size, true);
    }
}
