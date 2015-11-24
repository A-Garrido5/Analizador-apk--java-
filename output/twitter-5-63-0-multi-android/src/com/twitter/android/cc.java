// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.SharedPreferences$Editor;
import android.support.v4.content.CursorLoader;
import com.twitter.library.provider.bk;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.ag;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.widget.ListView;
import android.support.v4.content.Loader;
import com.twitter.library.service.y;
import com.twitter.library.api.i;
import com.twitter.library.scribe.TwitterScribeLog;
import java.util.HashSet;
import android.content.SharedPreferences;
import com.twitter.android.client.TwitterListFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Intent;
import java.util.ArrayList;
import android.os.Bundle;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.media.widget.UserImageView;
import com.twitter.library.scribe.TwitterScribeItem;
import android.view.View;
import android.database.Cursor;
import android.content.Context;
import android.support.v4.widget.CursorAdapter;

class cc extends CursorAdapter
{
    final /* synthetic */ CategoriesFragment a;
    
    public cc(final CategoriesFragment a, final Context context) {
        this.a = a;
        super(context, null, 0);
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final int position = cursor.getPosition();
        final Bundle extras = cursor.getExtras();
        final String string = extras.getString("name");
        final cd cd = (cd)view.getTag();
        cd.a.setText((CharSequence)string);
        final boolean add = this.a.e.add(string);
        if (add) {
            final TwitterScribeItem a = TwitterScribeItem.a(string, "related_query");
            a.g = position + 1;
            this.a.f.add(a);
        }
        final ArrayList parcelableArrayList = extras.getParcelableArrayList("users");
        if (parcelableArrayList != null) {
            final int childCount = cd.b.getChildCount();
            final int size = parcelableArrayList.size();
            for (int i = 0; i < childCount; ++i) {
                final UserImageView userImageView = (UserImageView)cd.b.getChildAt(i);
                if (i < size) {
                    final TwitterUser twitterUser = parcelableArrayList.get(i);
                    userImageView.a(twitterUser);
                    if (add) {
                        this.a.g.add(TwitterScribeItem.a(twitterUser.a(), twitterUser.promotedContent, twitterUser.g(), null, position + 1));
                    }
                    userImageView.setVisibility(0);
                }
                else {
                    userImageView.f();
                    userImageView.setVisibility(4);
                }
            }
        }
    }
    
    @Override
    public Object getItem(final int n) {
        final Cursor cursor = (Cursor)super.getItem(n);
        return new Intent((Context)this.a.getActivity(), (Class)UsersActivity.class).putExtra("category", cursor.getString(2)).putExtra("category_name", cursor.getString(1)).putExtra("type", 6).putExtra("follow", true).putExtra("category_position", n).putExtra("hide_bio", true).putExtra("fetch_always", true);
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final View inflate = LayoutInflater.from(context).inflate(2130969125, (ViewGroup)null);
        inflate.setTag((Object)new cd(inflate));
        return inflate;
    }
}
