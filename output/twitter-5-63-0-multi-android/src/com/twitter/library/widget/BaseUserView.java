// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import com.twitter.library.api.TwitterUser;
import com.twitter.library.view.l;
import android.text.TextUtils;
import com.twitter.library.api.TweetEntities;
import com.twitter.library.api.PromotedContent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;
import com.twitter.library.media.widget.UserImageView;
import android.widget.TextView;
import com.twitter.library.media.util.r;
import android.widget.RelativeLayout;

public class BaseUserView extends RelativeLayout implements r
{
    protected final int a_;
    protected final int b;
    protected final int c;
    protected final int d;
    protected final int e;
    protected long f;
    protected TextView g;
    protected TextView h;
    protected TextView i;
    protected TextView j;
    protected TextView k;
    private final int l;
    private final int m;
    private UserImageView n;
    private ImageView o;
    private ImageView p;
    private ImageView q;
    
    public BaseUserView(final Context context) {
        this(context, null, 0);
    }
    
    public BaseUserView(final Context context, final AttributeSet set) {
        this(context, set, kv.userViewStyle);
    }
    
    public BaseUserView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, li.UserView, n, 0);
        this.l = obtainStyledAttributes.getResourceId(li.UserView_promotedDrawable, 0);
        this.m = obtainStyledAttributes.getResourceId(li.UserView_politicalDrawable, 0);
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(li.UserView_actionButtonPadding, 0);
        this.a_ = obtainStyledAttributes.getDimensionPixelSize(li.UserView_actionButtonPaddingLeft, dimensionPixelSize);
        this.b = obtainStyledAttributes.getDimensionPixelSize(li.UserView_actionButtonPaddingTop, dimensionPixelSize);
        this.c = obtainStyledAttributes.getDimensionPixelSize(li.UserView_actionButtonPaddingRight, dimensionPixelSize);
        this.d = obtainStyledAttributes.getDimensionPixelSize(li.UserView_actionButtonPaddingBottom, dimensionPixelSize);
        this.e = obtainStyledAttributes.getColor(li.UserView_profileTextColor, 0);
        obtainStyledAttributes.recycle();
    }
    
    public void a() {
        this.k.setVisibility(8);
    }
    
    public void a(final PromotedContent tag, final boolean b) {
        final TextView i = this.i;
        if (tag == null) {
            i.setVisibility(8);
            i.setTag((Object)null);
            return;
        }
        if (tag.b()) {
            i.setVisibility(8);
            i.setTag((Object)null);
            return;
        }
        int n;
        if (tag.a()) {
            n = this.m;
        }
        else {
            n = this.l;
        }
        if (b) {
            i.setCompoundDrawablesWithIntrinsicBounds(0, 0, n, 0);
        }
        else {
            i.setCompoundDrawablesWithIntrinsicBounds(n, 0, 0, 0);
        }
        i.setVisibility(0);
        i.setTag((Object)tag);
    }
    
    public void a(final String text, final TweetEntities tweetEntities) {
        if (TextUtils.isEmpty((CharSequence)text)) {
            this.k.setVisibility(8);
            return;
        }
        if (tweetEntities != null && (!tweetEntities.urls.c() || !tweetEntities.mentions.c())) {
            this.k.setText(com.twitter.library.view.l.a(text, tweetEntities, this.e, this.e));
        }
        else {
            this.k.setText((CharSequence)text);
        }
        this.k.setVisibility(0);
    }
    
    public void a(final String s, final String title) {
        final String string = '@' + s;
        if (TextUtils.isEmpty((CharSequence)title)) {
            this.setTitle(string);
            return;
        }
        this.setTitle(title);
        this.setSubtitle(string);
    }
    
    public void e() {
        this.n.e();
    }
    
    public void f() {
        this.n.f();
    }
    
    public CharSequence getBestName() {
        CharSequence charSequence = this.g.getText();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.getUserName();
        }
        return charSequence;
    }
    
    public UserImageView getImageView() {
        return this.n;
    }
    
    public PromotedContent getPromotedContent() {
        if (this.i != null) {
            return (PromotedContent)this.i.getTag();
        }
        return null;
    }
    
    public String getTitle() {
        return this.g.getText().toString();
    }
    
    public long getUserId() {
        return this.f;
    }
    
    public CharSequence getUserName() {
        return this.h.getText();
    }
    
    protected void onFinishInflate() {
        this.h = (TextView)this.findViewById(la.screenname_item);
        this.o = (ImageView)this.findViewById(la.protected_item);
        this.p = (ImageView)this.findViewById(la.verified_item);
        this.g = (TextView)this.findViewById(la.name_item);
        this.n = (UserImageView)this.findViewById(la.user_image);
        this.j = (TextView)this.findViewById(la.extra_info);
        this.i = (TextView)this.findViewById(la.promoted);
        this.k = (TextView)this.findViewById(la.profile_description_item);
        this.q = (ImageView)this.findViewById(la.muted_item);
    }
    
    public void setExtraInfo(final String text) {
        if (TextUtils.isEmpty((CharSequence)text)) {
            this.j.setVisibility(8);
            return;
        }
        this.j.setText((CharSequence)text);
        this.j.setVisibility(0);
    }
    
    public void setMuted(final boolean b) {
        if (b) {
            this.q.setVisibility(0);
            return;
        }
        this.q.setVisibility(8);
    }
    
    public void setProtected(final boolean b) {
        if (b) {
            this.o.setVisibility(0);
            return;
        }
        this.o.setVisibility(8);
    }
    
    public void setSubtitle(final CharSequence text) {
        this.h.setText(text);
    }
    
    public void setSubtitleColor(final int textColor) {
        this.h.setTextColor(textColor);
    }
    
    public void setTitle(final CharSequence text) {
        this.g.setText(text);
    }
    
    public void setTitleColor(final int textColor) {
        this.g.setTextColor(textColor);
    }
    
    public void setUser(final TwitterUser twitterUser) {
        this.n.a(twitterUser);
        this.setUserId(twitterUser.userId);
        this.a(twitterUser.username, twitterUser.name);
        this.setVerified(twitterUser.verified);
        this.setProtected(twitterUser.isProtected);
    }
    
    public void setUserId(final long f) {
        this.f = f;
    }
    
    public void setUserImageUrl(final String s) {
        this.n.a(s);
    }
    
    public void setVerified(final boolean b) {
        if (b) {
            this.p.setVisibility(0);
            return;
        }
        this.p.setVisibility(8);
    }
}
