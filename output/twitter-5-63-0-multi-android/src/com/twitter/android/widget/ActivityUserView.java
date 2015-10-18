// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.View$OnClickListener;
import com.twitter.library.api.z;
import com.twitter.library.util.FriendshipCache;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.widget.ActionButton;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.internal.android.widget.n;
import com.twitter.library.widget.UserView;

public class ActivityUserView extends UserView implements n
{
    private String n;
    private boolean o;
    
    public ActivityUserView(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public static void a(final ActionButton actionButton, final TwitterUser twitterUser, final FriendshipCache friendshipCache, final boolean b, final long n) {
        if (actionButton != null) {
            if (friendshipCache == null) {
                actionButton.setVisibility(0);
                actionButton.setChecked(false);
                return;
            }
            if (!friendshipCache.a(twitterUser.userId)) {
                friendshipCache.a(twitterUser);
            }
            final int intValue = friendshipCache.j(twitterUser.userId);
            boolean b2;
            if ((intValue & 0x40) != 0x0) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            final boolean b3 = z.b(intValue);
            actionButton.setChecked(b3);
            if (twitterUser.userId != n && (!b || !b3 || b2)) {
                actionButton.setVisibility(0);
                return;
            }
            actionButton.setVisibility(8);
        }
    }
    
    public void a(final int n, final View$OnClickListener onClickListener) {
        this.l.a(n);
        this.l.setOnClickListener(onClickListener);
    }
    
    public void a(final FriendshipCache friendshipCache, final TwitterUser twitterUser, final boolean b, final long n) {
        this.h.setText((CharSequence)("@" + twitterUser.username));
        this.g.setText((CharSequence)twitterUser.name);
        this.a();
        this.setUserImageUrl(twitterUser.profileImageUrl);
        a(this.l, twitterUser, friendshipCache, b, n);
    }
    
    public String getReason() {
        return this.n;
    }
    
    @Override
    public void setHighlighted(final boolean o) {
        if (this.o != o) {
            this.o = o;
            this.refreshDrawableState();
        }
    }
    
    public void setReason(final String n) {
        this.n = n;
    }
}
