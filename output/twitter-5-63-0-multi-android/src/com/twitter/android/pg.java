// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.library.util.bj;
import com.twitter.library.api.TweetEntities;
import com.twitter.library.util.bo;
import com.twitter.library.widget.UserSocialView;
import com.twitter.library.widget.BaseUserView;
import android.database.Cursor;
import com.twitter.internal.android.widget.GroupedRowView;
import com.twitter.library.widget.UserView;
import android.view.View;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.widget.c;
import android.content.Context;

public class pg extends yo
{
    protected final boolean a;
    protected boolean b;
    private boolean k;
    private final boolean l;
    
    public pg(final Context context, final int n, final int n2, final c c, final FriendshipCache friendshipCache, final int n3, final boolean a, final boolean b, final boolean l) {
        super(context, n, n2, c, friendshipCache, 0, n3, false, b);
        this.b = true;
        this.a = a;
        this.l = l;
    }
    
    public pg(final Context context, final int n, final int n2, final c c, final FriendshipCache friendshipCache, final boolean b) {
        this(context, n, n2, c, friendshipCache, 0, b, false, false);
    }
    
    @Override
    public UserView a(final View view) {
        if (this.l) {
            return (UserView)((GroupedRowView)view).getChildAt(0);
        }
        return super.a(view);
    }
    
    public void a() {
        this.k = true;
    }
    
    public void a(final boolean b) {
        this.b = b;
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        super.bindView(view, context, cursor);
        final int int1 = cursor.getInt(14);
        if (!this.a) {
            final int int2 = cursor.getInt(12);
            String extraInfo = null;
            switch (int2) {
                case 1: {
                    if (int1 == 0) {
                        extraInfo = context.getString(2131297014, new Object[] { cursor.getString(13) });
                        break;
                    }
                    extraInfo = context.getResources().getQuantityString(2131427330, int1, new Object[] { cursor.getString(13), int1 });
                    break;
                }
                case 2: {
                    extraInfo = context.getString(2131297846, new Object[] { cursor.getString(13) });
                    break;
                }
            }
            ((BaseUserView)view).setExtraInfo(extraInfo);
            return;
        }
        final UserSocialView userSocialView = (UserSocialView)this.a(view);
        userSocialView.setContentSize(bo.a);
        if (this.c) {
            userSocialView.a(cursor.getString(8), TweetEntities.a(cursor.getBlob(9)));
        }
        else {
            userSocialView.a(null, (TweetEntities)null);
        }
        if (this.k) {
            userSocialView.b();
            userSocialView.setContentSize(context.getResources().getDimension(2131558418));
            userSocialView.setScreenNameColor(context.getResources().getColor(2131689625));
        }
        int int3;
        if (this.b) {
            int3 = cursor.getInt(12);
        }
        else {
            int3 = -1;
        }
        switch (int3) {
            default: {
                userSocialView.a(int3, 0, null, 0, bj.e);
            }
            case 1:
            case 2: {
                userSocialView.a(int3, 2130838677, cursor.getString(13), int1, bj.e);
            }
        }
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        if (!this.a) {
            return super.newView(context, cursor, viewGroup);
        }
        if (!this.l) {
            int n;
            if (this.d) {
                n = 2130968637;
            }
            else {
                n = 2130969185;
            }
            return (View)this.a((UserView)LayoutInflater.from(context).inflate(n, viewGroup, false));
        }
        final GroupedRowView groupedRowView = (GroupedRowView)LayoutInflater.from(context).inflate(2130968806, (ViewGroup)null);
        groupedRowView.setStyle(2);
        this.a(this.a((View)groupedRowView));
        return (View)groupedRowView;
    }
}
