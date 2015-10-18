// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import com.twitter.internal.android.util.Size;
import com.twitter.library.media.manager.n;

final class i implements n
{
    @Override
    public List a(final String s, final Size size) {
        final ArrayList<String> list = new ArrayList<String>(3);
        if (!size.c()) {
            final float e = size.e();
            for (final HeaderImageVariant headerImageVariant : HeaderImageVariant.values()) {
                if (e <= headerImageVariant.maxAspectRatio && headerImageVariant.maxSize.b(size)) {
                    list.add(s + headerImageVariant.postfix);
                }
            }
            if (CollectionUtils.a((Collection)list)) {
                String s2;
                if (e <= 2.5f) {
                    s2 = HeaderImageVariant.f.postfix;
                }
                else {
                    s2 = HeaderImageVariant.i.postfix;
                }
                list.add(s + s2);
            }
            return list;
        }
        list.add(s + HeaderImageVariant.i.postfix);
        return list;
    }
}
