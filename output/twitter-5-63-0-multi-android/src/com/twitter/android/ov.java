// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.database.Cursor;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.view.z;
import com.twitter.android.client.TwitterFragmentActivity;

public class ov extends xc
{
    public ov(final TwitterFragmentActivity twitterFragmentActivity, final int n, final boolean b, final boolean b2, final boolean b3, final z z, final vf vf, final FriendshipCache friendshipCache, final TwitterScribeAssociation twitterScribeAssociation) {
        super(twitterFragmentActivity, n, b, b2, b3, z, vf, friendshipCache, twitterScribeAssociation);
    }
    
    static View a(final Context context) {
        final View inflate = LayoutInflater.from(context).inflate(2130969001, (ViewGroup)null);
        a(inflate, 2131886291, 2131887197, 2131887198);
        return inflate;
    }
    
    private static void a(final View view, final int... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            final View viewById = view.findViewById(array[i]);
            if (viewById != null) {
                viewById.setOnClickListener((View$OnClickListener)null);
            }
        }
    }
    
    public static boolean a_(final Cursor cursor) {
        boolean b = true;
        if (cursor == null) {
            return false;
        }
        final int int1 = cursor.getInt(27);
        final boolean b2 = (int1 & 0x3) != 0x0 && b;
        if (((int1 & 0x4) != 0x0 && b) || !b2) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int getItemViewType(final int n) {
        final int itemViewType = super.getItemViewType(n);
        if (itemViewType == 0 && a_((Cursor)this.getItem(n))) {
            return 2;
        }
        return itemViewType;
    }
    
    @Override
    public int getViewTypeCount() {
        return 3;
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        if (a_(cursor)) {
            final View a = a(context);
            this.a(a);
            return a;
        }
        return super.newView(context, cursor, viewGroup);
    }
}
