// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.profiles;

import android.text.SpannableString;
import com.twitter.library.util.text.a;
import java.util.Date;
import com.twitter.library.api.ExtendedProfile;
import com.twitter.library.api.TwitterUser;
import com.twitter.internal.util.Optional;
import com.twitter.library.api.geo.TwitterPlace;
import android.content.res.Resources;
import com.twitter.library.api.z;
import com.twitter.library.view.u;
import com.twitter.library.view.l;
import com.twitter.library.api.TweetEntities;
import android.text.TextUtils;
import android.view.View;
import com.twitter.library.view.k;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public class v implements ViewTreeObserver$OnGlobalLayoutListener
{
    private final TextView a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final LinearLayout g;
    private final LinearLayout h;
    private final TextView i;
    private String j;
    private String k;
    private String l;
    private TextView m;
    private k n;
    private ad o;
    private boolean p;
    
    public v(final View view) {
        this.a = (TextView)view.findViewById(2131886307);
        this.b = (TextView)view.findViewById(2131886585);
        this.c = (TextView)view.findViewById(2131886157);
        this.d = (TextView)view.findViewById(2131887181);
        this.e = (TextView)view.findViewById(2131887183);
        this.m = (TextView)view.findViewById(2131886117);
        this.f = (TextView)view.findViewById(2131887182);
        this.g = (LinearLayout)view.findViewById(2131887180);
        this.h = (LinearLayout)view.findViewById(2131887175);
        this.i = (TextView)view.findViewById(2131887184);
    }
    
    private void a() {
        if (this.k != null && this.k.length() > 0) {
            this.g.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
    }
    
    private static void a(final TextView textView, final CharSequence text) {
        if (textView != null) {
            textView.setText(text);
        }
    }
    
    private void a(final TextView textView, final String s) {
        int visibility;
        if (TextUtils.isEmpty((CharSequence)s)) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        textView.setVisibility(visibility);
    }
    
    private void a(final TextView textView, final String s, final TweetEntities tweetEntities) {
        this.a(textView, s, tweetEntities, 0, 0, 0);
    }
    
    private void a(final TextView textView, final String text, final TweetEntities tweetEntities, final int n, final int n2, final int n3) {
        if (TextUtils.isEmpty((CharSequence)text)) {
            textView.setVisibility(8);
            return;
        }
        if (tweetEntities != null && (!tweetEntities.urls.c() || !tweetEntities.mentions.c()) && this.n != null) {
            textView.setText(com.twitter.library.view.l.a(text, tweetEntities, this.n, n, n2, n3, false, true));
            u.a(textView);
        }
        else {
            textView.setText((CharSequence)text);
        }
        textView.setVisibility(0);
    }
    
    private void b() {
        if (TextUtils.isEmpty((CharSequence)this.l) || TextUtils.isEmpty((CharSequence)this.k) || this.g.getOrientation() == 1) {
            this.f.setVisibility(8);
            return;
        }
        this.f.setVisibility(0);
    }
    
    private void c(final String text) {
        if (!TextUtils.isEmpty((CharSequence)text)) {
            ((TextView)this.h.findViewById(2131887176)).setText((CharSequence)text);
            if (!this.p) {
                this.h.setVisibility(0);
            }
        }
    }
    
    public void a(final int n) {
        if (this.m != null) {
            if (!z.c(n)) {
                this.m.setVisibility(8);
                return;
            }
            this.m.setVisibility(0);
        }
    }
    
    public void a(final ad o, final String s, final Resources resources) {
        this.o = o;
        final TwitterUser a = o.a();
        this.a(a.name);
        this.b(a.username);
        this.a(a.profileDescription, a.descriptionEntities);
        this.a(a.location, (TwitterPlace)Optional.a(a.structuredLocation));
        this.a(a.profileUrl, a.urlEntities, resources);
        this.a(a.friendship);
        this.a(a.extendedProfile, o, resources);
        this.c(s);
    }
    
    public void a(final ExtendedProfile extendedProfile, final ad ad, final Resources resources) {
        if (pi.b()) {
            String s = null;
            if (extendedProfile != null) {
                if (pi.a(extendedProfile, new Date())) {
                    int n;
                    if (ad.b()) {
                        n = 2131298260;
                    }
                    else {
                        n = 2131298232;
                    }
                    s = resources.getString(n);
                }
                else {
                    final String a = pi.a(extendedProfile, resources);
                    final boolean empty = TextUtils.isEmpty((CharSequence)a);
                    s = null;
                    if (!empty) {
                        s = resources.getString(2131298178, new Object[] { a });
                    }
                }
            }
            a(this.i, (CharSequence)s);
            this.a(this.i, s);
            return;
        }
        this.a(this.i, null);
    }
    
    public void a(final k n) {
        this.n = n;
    }
    
    public void a(String j) {
        final TextView a = this.a;
        if (TextUtils.isEmpty((CharSequence)j)) {
            j = this.j;
        }
        a(a, (CharSequence)j);
    }
    
    public void a(final String s, final TweetEntities tweetEntities) {
        String replaceAll;
        if (!TextUtils.isEmpty((CharSequence)s)) {
            replaceAll = com.twitter.library.util.text.a.b.matcher(s).replaceAll(" ");
        }
        else {
            replaceAll = "";
        }
        this.a(this.c, replaceAll, tweetEntities);
        this.a(this.c, replaceAll);
    }
    
    public void a(final String s, final TweetEntities tweetEntities, final Resources resources) {
        TweetEntities tweetEntities2 = null;
        String k;
        if (tweetEntities == null || tweetEntities.urls.c()) {
            k = null;
        }
        else {
            tweetEntities2 = tweetEntities;
            k = s;
        }
        this.k = k;
        this.a(this.e, k, tweetEntities2, 0, resources.getColor(2131689600), resources.getColor(2131689601));
        this.a(this.e, this.k);
        this.a();
        this.b();
        if (!TextUtils.isEmpty((CharSequence)this.k)) {
            this.g.setVisibility(0);
        }
    }
    
    public void a(final String l, final TwitterPlace twitterPlace) {
        if (twitterPlace == null) {
            this.l = l;
            a(this.d, (CharSequence)this.l);
        }
        else {
            this.l = twitterPlace.fullName;
            final w w = new w(this, this.d.getResources().getColor(2131689601), twitterPlace);
            final SpannableString spannableString = new SpannableString((CharSequence)this.l);
            spannableString.setSpan((Object)w, 0, spannableString.length(), 33);
            u.a(this.d);
            a(this.d, (CharSequence)spannableString);
        }
        this.a(this.d, this.l);
        this.b();
        if (!TextUtils.isEmpty((CharSequence)this.l)) {
            this.g.setVisibility(0);
        }
    }
    
    public void a(final boolean p) {
        this.p = p;
    }
    
    public void b(final String j) {
        this.j = j;
        a(this.b, (CharSequence)('@' + this.j));
    }
    
    public void onGlobalLayout() {
        if (this.e.isLayoutRequested()) {
            return;
        }
        if (this.e.getLineCount() > 1 && this.g.getOrientation() == 0) {
            this.g.setOrientation(1);
            this.b();
        }
        this.g.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
    }
}
