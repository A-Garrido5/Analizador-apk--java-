// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import com.twitter.library.service.y;
import com.twitter.library.client.as;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.client.c;
import com.twitter.library.client.Session;
import com.twitter.library.util.aj;
import com.twitter.library.api.z;
import com.twitter.library.scribe.ScribeItem;
import android.content.Context;
import com.twitter.library.widget.CompoundDrawableAnimButton;
import com.twitter.library.api.TwitterUser;

public class ae
{
    public final TwitterUser a;
    public final CompoundDrawableAnimButton b;
    private final Context c;
    private final ScribeItem d;
    
    public ae(final Context context, final TwitterUser a, final CompoundDrawableAnimButton b, final ScribeItem d) {
        this.c = context.getApplicationContext();
        this.a = a;
        (this.b = b).setChecked(z.b(a.friendship));
        if (a.followersCount > 0) {
            this.b.setText((CharSequence)aj.a(this.c.getResources(), a.followersCount, true));
        }
        else {
            this.b.setText((CharSequence)null);
        }
        this.d = d;
    }
    
    void a(final Session session, final String s) {
        com.twitter.android.client.c.a(this.c).a(((TwitterScribeLog)StoriesActivity.a(session.g(), "story", "user", s).a(this.d)).b(this.a.userId, this.a.promotedContent, this.a.g()));
    }
    
    public void a(final as as, final Session session) {
        boolean b;
        if (!z.b(this.a.friendship)) {
            b = true;
        }
        else {
            b = false;
        }
        this.b.toggle();
        y y;
        String s;
        int n;
        if (b) {
            y = new pb(this.c, session, this.a.userId, this.a.promotedContent);
            s = "follow";
            n = 1;
        }
        else {
            final pe pe = new pe(this.c, session, this.a.userId, this.a.promotedContent);
            n = -1;
            y = pe;
            s = "unfollow";
        }
        as.a(y, (com.twitter.library.service.z)null);
        this.a(session, s);
        final TwitterUser a = this.a;
        a.followersCount += n;
        if (b) {
            this.a.friendship = z.a(this.a.friendship, 1);
        }
        else {
            this.a.friendship = z.b(this.a.friendship, 1);
        }
        if (this.a.followersCount > 0) {
            this.b.setText((CharSequence)aj.a(this.c.getResources(), this.a.followersCount, true));
            return;
        }
        this.b.setText((CharSequence)null);
    }
}
