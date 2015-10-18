// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import java.util.HashMap;
import java.util.Map;

public class bv extends bs
{
    @Override
    public int a(final TopicView$TopicData topicView$TopicData) {
        final String a = topicView$TopicData.a();
        if (br.a.containsKey(a)) {
            return (int)br.a.get(a);
        }
        return 2130968763;
    }
}
