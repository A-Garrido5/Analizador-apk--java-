// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.library.provider.Tweet;
import com.twitter.library.provider.ad;
import android.database.Cursor;
import android.content.Context;
import android.view.View;
import com.twitter.library.util.FriendshipCache;
import com.twitter.android.vf;
import com.twitter.library.view.z;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.android.xc;

public class c extends xc
{
    public c(final TwitterFragmentActivity twitterFragmentActivity, final int n, final TwitterScribeAssociation twitterScribeAssociation) {
        super(twitterFragmentActivity, n, true, true, false, null, null, null, twitterScribeAssociation);
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final Tweet a = new ad(cursor).a();
        if (view instanceof CommerceCollectionItem) {
            ((CommerceCollectionItem)view).setTweet(a);
        }
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(2130968654, (ViewGroup)null);
    }
}
