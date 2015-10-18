// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View;
import android.view.LayoutInflater;
import com.twitter.android.client.c;
import android.view.ViewGroup;
import android.content.Context;

public abstract class bs implements bt
{
    public abstract int a(final TopicView$TopicData p0);
    
    @Override
    public TopicView a(final Context context, final ViewGroup viewGroup, final c c, final TopicView$TopicData topicView$TopicData) {
        final TopicView topicView = (TopicView)LayoutInflater.from(context).inflate(this.a(topicView$TopicData), viewGroup, false);
        topicView.a(topicView$TopicData.a, topicView$TopicData.b, topicView$TopicData.e, topicView$TopicData.c, topicView$TopicData.d, null, topicView$TopicData.f, topicView$TopicData.k, topicView$TopicData.l, topicView$TopicData.g, topicView$TopicData.h, topicView$TopicData.m, false, true, null, null, null, null, topicView$TopicData.j);
        return topicView;
    }
    
    @Override
    public void a(final c c, final View view, final TopicView$TopicData topicView$TopicData) {
        ((TopicView)view).a(topicView$TopicData.c, topicView$TopicData.d, topicView$TopicData.f, topicView$TopicData.k, topicView$TopicData.m, topicView$TopicData.a, topicView$TopicData.l, topicView$TopicData.j);
    }
}
