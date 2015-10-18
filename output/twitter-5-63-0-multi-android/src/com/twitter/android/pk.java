// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.util.bj;
import com.twitter.library.util.bo;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.bh;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.provider.ad;
import com.twitter.internal.android.widget.GroupedRowView;
import android.view.View;
import com.twitter.library.provider.cc;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.content.Context;
import com.twitter.library.view.z;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.client.az;
import com.twitter.android.client.c;
import android.support.v4.widget.CursorAdapter;

public class pk extends CursorAdapter
{
    private final c a;
    private final az b;
    private final vf c;
    private final FriendshipCache d;
    private z e;
    private final long f;
    
    pk(final Context context, final c a, final Fragment fragment, final FriendshipCache d, final long f) {
        super(context, null, 0);
        this.a = a;
        this.b = az.a(context);
        this.d = d;
        this.f = f;
        final TwitterScribeAssociation twitterScribeAssociation = (TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(6)).b("related_tweets")).d("tweet");
        final pl pl = new pl(fragment, twitterScribeAssociation);
        this.c = new vf(context, pl);
        this.e = new xa(fragment, twitterScribeAssociation, null, TwitterScribeLog.a(twitterScribeAssociation, "tweet", "avatar", "profile_click"), TwitterScribeLog.a(twitterScribeAssociation, "tweet", "link", "open_link"), TwitterScribeLog.a(twitterScribeAssociation, "tweet", "platform_photo_card", "click"), TwitterScribeLog.a(twitterScribeAssociation, "tweet", "platform_player_card", "click"), pl);
    }
    
    public int a(final long n) {
        final Cursor cursor = this.getCursor();
        int n2 = 0;
        if (cursor != null) {
            final int position = cursor.getPosition();
            final boolean moveToFirst = cursor.moveToFirst();
            n2 = 0;
            Label_0058: {
                if (moveToFirst) {
                    int n3 = 0;
                    while (cursor.getInt(cc.d) != n) {
                        ++n3;
                        if (!cursor.moveToNext()) {
                            n2 = 0;
                            break Label_0058;
                        }
                    }
                    n2 = n3;
                }
            }
            cursor.moveToPosition(position);
        }
        return n2;
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final GroupedRowView groupedRowView = (GroupedRowView)view;
        final pm pm = (pm)view.getTag();
        final int int1 = cursor.getInt(cc.c);
        pm.g = int1;
        if (int1 != 0) {
            groupedRowView.setStyle(0);
            groupedRowView.setGroupStyle(0);
            return;
        }
        final Tweet a = new ad(cursor).a();
        a.v = this.f;
        final TwitterScribeItem scribeItem = new TwitterScribeItem();
        scribeItem.b = String.format("%d:%d", this.f, a.D);
        scribeItem.w = "related_tweet";
        pm.a.f.setTweet(a);
        pm.a.f.setScribeItem(scribeItem);
        if (!bh.a(context).a(a)) {
            a.i &= 0xFFFFFFF7;
        }
        if (this.c != null) {
            this.c.b(pm.a, cursor.getInt(cc.d));
        }
        pm.a.f.setDisplayTranslationBadge(com.twitter.library.util.text.c.a(context, a));
        if (this.d != null) {
            this.d.a(a);
        }
        groupedRowView.setSingle(false);
        if (cursor.getPosition() < -1 + cursor.getCount()) {
            groupedRowView.setStyle(2);
            return;
        }
        groupedRowView.setStyle(3);
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final GroupedRowView groupedRowView = (GroupedRowView)LayoutInflater.from(context).inflate(2130968804, viewGroup, false);
        final pm tag = new pm(new xb((View)groupedRowView));
        tag.a.f.setOnTweetViewClickListener(this.e);
        groupedRowView.setTag((Object)tag);
        tag.a.f.setReason(null);
        tag.a.f.setReasonIconResId(0);
        tag.a.f.setContentSize(bo.a);
        tag.a.f.setRenderRtl(bj.e);
        tag.a.f.setAlwaysExpand(true);
        tag.a.f.setAlwaysExpandMedia(true);
        tag.a.f.setRelatedTweet(true);
        tag.a.f.setFriendshipCache(this.d);
        return (View)groupedRowView;
    }
}
