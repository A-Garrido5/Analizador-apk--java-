// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.internal.android.widget.GroupedRowView;
import android.database.Cursor;
import android.content.Context;
import android.view.View;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.view.z;
import com.twitter.android.client.TwitterFragmentActivity;

public class it extends xc
{
    public it(final TwitterFragmentActivity twitterFragmentActivity, final int n, final boolean b, final boolean b2, final z z, final vf vf, final FriendshipCache friendshipCache, final int n2, final TwitterScribeAssociation twitterScribeAssociation) {
        super(twitterFragmentActivity, n, b, b2, false, z, vf, friendshipCache, 2130968802, 2130968804, n2, twitterScribeAssociation);
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        super.bindView(view, context, cursor);
        ((GroupedRowView)view).a(cursor.getPosition(), cursor.getCount());
    }
}
