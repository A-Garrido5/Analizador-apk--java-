// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.library.widget.BaseUserView;
import com.twitter.library.widget.UserApprovalView;
import android.database.Cursor;
import android.view.View;
import com.twitter.library.util.FriendshipCache;
import android.content.Context;
import com.twitter.library.widget.c;
import java.util.Map;

public class jl extends yo
{
    private final Map a;
    private final c b;
    
    public jl(final Context context, final int n, final c b, final Map a) {
        super(context, n, 0, null, null, 0, 0, false, false);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void bindView(final View view, final Context context, final Cursor cursor) {
        final long long1 = cursor.getLong(2);
        final UserApprovalView userApprovalView = (UserApprovalView)view;
        this.a(userApprovalView, cursor, long1);
        if (this.j == long1) {
            userApprovalView.setState(0);
            userApprovalView.g();
            return;
        }
        final Integer n = this.a.get(long1);
        if (n == null) {
            userApprovalView.setState(0);
            userApprovalView.c();
            return;
        }
        switch (n) {
            default: {
                userApprovalView.setState(0);
                userApprovalView.c();
            }
            case 1: {
                userApprovalView.setState(1);
                userApprovalView.d();
            }
            case 2: {
                userApprovalView.setState(2);
                userApprovalView.g();
            }
            case 3: {
                userApprovalView.setState(3);
                userApprovalView.d();
            }
        }
    }
    
    @Override
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        final UserApprovalView userApprovalView = (UserApprovalView)LayoutInflater.from(context).inflate(2130969173, viewGroup, false);
        userApprovalView.b();
        final c b = this.b;
        userApprovalView.a(0, 2130838609, b);
        userApprovalView.a(1, 2130838839, b);
        userApprovalView.a(2, 2130837600, b);
        userApprovalView.a(2, 2130837601);
        userApprovalView.setTag((Object)new yk(userApprovalView));
        return (View)userApprovalView;
    }
}
