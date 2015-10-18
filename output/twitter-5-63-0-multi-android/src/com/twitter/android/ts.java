// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import com.twitter.android.widget.TopicView$TopicData;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.internal.android.widget.GroupedRowView;

public class ts
{
    public final GroupedRowView a;
    public final MediaImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public TopicView$TopicData f;
    
    public ts(final View view) {
        this.a = (GroupedRowView)view;
        this.b = (MediaImageView)view.findViewById(2131886198);
        this.c = (TextView)view.findViewById(2131886313);
        this.d = (TextView)view.findViewById(2131886138);
        this.e = (TextView)view.findViewById(2131887253);
    }
}
