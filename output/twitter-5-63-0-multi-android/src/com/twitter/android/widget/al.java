// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.api.TweetEntities;
import com.twitter.util.f;
import com.twitter.library.api.PromotedContent;
import android.database.Cursor;
import com.twitter.library.widget.BaseUserView;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.widget.c;
import android.content.Context;
import com.twitter.android.yo;

public class al extends yo
{
    public al(final Context context, final int n, final int n2, final c c, final FriendshipCache friendshipCache, final int n3) {
        super(context, n, n2, c, friendshipCache, 0, n3, false, false);
    }
    
    @Override
    protected void a(final BaseUserView baseUserView, final Cursor cursor, final long n) {
        final int int1 = cursor.getInt(6);
        this.a(baseUserView, n, cursor.getString(5), cursor.getString(4), cursor.getString(3), "", null, (PromotedContent)com.twitter.util.f.a(cursor.getBlob(10)), cursor.getInt(0), null, cursor.getInt(7), (int1 & 0x1) != 0x0, (int1 & 0x2) != 0x0, cursor.getPosition());
    }
}
