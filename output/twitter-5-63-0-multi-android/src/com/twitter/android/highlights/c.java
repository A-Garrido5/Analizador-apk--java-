// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.view.View;
import com.twitter.android.ProfileActivity;
import android.content.Intent;
import android.content.Context;
import com.twitter.library.util.bk;
import com.twitter.library.view.l;
import android.text.TextUtils;
import android.text.SpannableStringBuilder;
import com.twitter.library.view.k;
import android.content.res.Resources;
import com.twitter.library.provider.Tweet;
import com.twitter.library.api.TwitterUser;

public class c extends af
{
    public final TwitterUser a;
    public final Tweet b;
    public final boolean c;
    public final boolean d;
    private CharSequence m;
    private CharSequence n;
    
    public c(final String s, final long n, final mx mx, final boolean b, final String s2, final String s3, final TwitterUser a, final Tweet b2) {
        super(s, n, 9, mx, b, s2, s3);
        this.a = a;
        this.b = b2;
        this.c = this.a(a);
        this.d = this.a(a, b2);
    }
    
    private static CharSequence a(final TwitterUser twitterUser, final Resources resources, final k k) {
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty((CharSequence)twitterUser.location)) {
            spannableStringBuilder.append((CharSequence)twitterUser.location);
        }
        if (!TextUtils.isEmpty((CharSequence)twitterUser.profileUrl)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append((CharSequence)resources.getString(2131298184));
            }
            spannableStringBuilder.append(l.a(twitterUser.profileUrl, twitterUser.urlEntities, k, 0, 0, 0, false, true));
        }
        if (spannableStringBuilder.length() > 0) {
            return (CharSequence)spannableStringBuilder;
        }
        final String c = bk.c(resources, twitterUser.createdAt);
        if (c != null) {
            return resources.getString(2131297117, new Object[] { c });
        }
        return resources.getString(2131297118);
    }
    
    @Override
    public int a() {
        return 5;
    }
    
    @Override
    public Intent a(final Context context) {
        return new Intent(context, (Class)ProfileActivity.class).putExtra("user_id", this.a.a()).putExtra("screen_name", this.a.username).putExtra("extra_up_as_back", true);
    }
    
    @Override
    public ag a(final View view) {
        return new d(view);
    }
    
    public CharSequence a(final Context context, final k k) {
        if (this.d && this.m == null) {
            final Resources resources = context.getResources();
            if (!TextUtils.isEmpty((CharSequence)this.a.profileDescription)) {
                if (this.a.descriptionEntities != null && (!this.a.descriptionEntities.urls.c() || !this.a.descriptionEntities.mentions.c())) {
                    this.m = com.twitter.library.view.l.a(this.a.profileDescription, this.a.descriptionEntities, k, resources.getColor(2131689621), resources.getColor(2131689600), resources.getColor(2131689601), false, false);
                }
                else {
                    this.m = this.a.profileDescription;
                }
            }
            else if (this.b != null) {
                this.m = com.twitter.library.view.l.a(this.b.y, this.b.G, resources.getColor(2131689621), resources.getColor(2131689600));
            }
        }
        return this.m;
    }
    
    public boolean a(final TwitterUser twitterUser) {
        return !TextUtils.isEmpty((CharSequence)twitterUser.profileHeaderImageUrl);
    }
    
    public boolean a(final TwitterUser twitterUser, final Tweet tweet) {
        return !TextUtils.isEmpty((CharSequence)twitterUser.profileDescription) || tweet != null;
    }
    
    public CharSequence b(final Context context, final k k) {
        if (this.n == null) {
            final Resources resources = context.getResources();
            if (!TextUtils.isEmpty((CharSequence)this.a.profileDescription)) {
                this.n = a(this.a, resources, k);
            }
            else if (this.b != null) {
                final String c = bk.c(resources, this.b.A);
                if (c != null) {
                    this.n = resources.getString(2131297990, new Object[] { c });
                }
                else {
                    this.n = resources.getString(2131297991);
                }
            }
            else {
                this.n = a(this.a, resources, k);
            }
        }
        return this.n;
    }
    
    @Override
    public String b() {
        return "TYPE_FOLLOW";
    }
}
