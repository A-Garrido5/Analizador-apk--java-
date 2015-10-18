// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.ListView;

public class ConversationList extends ListView
{
    public ConversationList(final Context context) {
        super(context);
    }
    
    public ConversationList(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public ConversationList(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.setSelection(-1 + this.getCount());
    }
}
