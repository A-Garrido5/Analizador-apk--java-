// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.am;
import java.io.Serializable;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.featureswitch.d;
import com.twitter.library.util.bn;
import com.twitter.library.api.UrlEntity;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.api.MediaEntity;
import java.util.List;
import com.twitter.library.api.conversations.ParticipantsNotAddedEntry;
import com.twitter.library.widget.BaseUserView;
import com.twitter.library.api.conversations.JoinConversationEntry;
import java.util.Collections;
import com.twitter.library.api.conversations.UpdateConversationNameEntry;
import com.twitter.library.api.conversations.ak;
import com.twitter.library.api.conversations.ParticipantsJoinEntry;
import android.content.Intent;
import java.util.Iterator;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.widget.UserView;
import android.widget.RelativeLayout;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.LinearLayout$LayoutParams;
import com.twitter.internal.android.widget.TypefacesTextView;
import com.twitter.library.util.bj;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.api.conversations.DMTweet;
import android.view.View$OnLongClickListener;
import com.twitter.library.network.a;
import com.twitter.util.g;
import com.twitter.library.api.conversations.DMPhoto;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.twitter.library.api.TweetEntities;
import com.twitter.library.util.bk;
import android.text.format.DateUtils;
import android.view.View$OnClickListener;
import android.text.util.Linkify;
import com.twitter.library.view.l;
import com.twitter.library.util.bo;
import com.twitter.library.api.conversations.DMMessageEntry;
import android.text.TextUtils;
import android.view.View;
import com.twitter.library.api.conversations.x;
import android.database.Cursor;
import com.twitter.library.client.Session;
import java.util.HashSet;
import java.util.HashMap;
import android.content.res.Resources;
import android.app.Activity;
import com.twitter.library.api.UserSettings;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.android.client.c;
import com.twitter.library.network.t;
import com.twitter.library.client.az;
import android.content.Context;
import java.util.Set;
import java.util.Map;
import java.text.SimpleDateFormat;
import com.twitter.library.view.k;

public class dz extends ll implements k
{
    private static final SimpleDateFormat f;
    private static final SimpleDateFormat g;
    private static final SimpleDateFormat h;
    final boolean a;
    final Map b;
    final Map c;
    final Set d;
    boolean e;
    private final Context i;
    private final az j;
    private final t k;
    private final c l;
    private final TwitterScribeAssociation m;
    private final cs n;
    private final Set o;
    private final Set p;
    private final UserSettings q;
    private final long r;
    private boolean s;
    private final Set t;
    
    static {
        f = new SimpleDateFormat();
        g = new SimpleDateFormat();
        h = new SimpleDateFormat();
    }
    
    public dz(final Activity i, final c l, final TwitterScribeAssociation m, final Resources resources, final cs n) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.e = false;
        this.o = new HashSet();
        this.p = new HashSet();
        this.t = new HashSet();
        this.l = l;
        this.i = (Context)i;
        this.j = az.a(this.i);
        this.k = new t(this.j.b().h());
        this.n = n;
        final cs n2 = this.n;
        boolean a = false;
        if (n2 != null) {
            a = true;
        }
        this.a = a;
        this.m = m;
        final Session b = this.j.b();
        this.q = b.j();
        this.r = b.g();
        dz.f.applyPattern(resources.getString(2131298190));
        dz.g.applyPattern(resources.getString(2131298188));
        dz.h.applyPattern(resources.getString(2131298189));
    }
    
    private int a(final Cursor cursor) {
        final x x = new x(cursor, this.r, this.q);
        switch (x.d) {
            default: {
                if (this.a(x)) {
                    return 2;
                }
                if (x.c()) {
                    return 1;
                }
                return 0;
            }
            case 8:
            case 10:
            case 11:
            case 18: {
                return 2;
            }
            case 17: {
                return 3;
            }
        }
    }
    
    private void a(final View view, final Resources resources, final x x) {
        String f = x.f;
        final boolean f2 = x.f();
        boolean b;
        if (!x.c()) {
            b = true;
        }
        else {
            b = false;
        }
        final ek ek = (ek)view.getTag();
        String string;
        if (f2) {
            string = resources.getString(2131296847) + ". ";
        }
        else {
            string = "";
        }
        CharSequence text = ek.c.getText();
        if (TextUtils.isEmpty(text)) {
            text = "";
        }
        CharSequence text2 = ek.b.getText();
        if (TextUtils.isEmpty(text2)) {
            text2 = "";
        }
        if (TextUtils.isEmpty((CharSequence)f)) {
            f = "";
        }
        String contentDescription;
        if (b) {
            contentDescription = string + resources.getString(2131296869, new Object[] { f, text2, text });
        }
        else {
            contentDescription = string + resources.getString(2131296872, new Object[] { text2, text });
        }
        view.setContentDescription((CharSequence)contentDescription);
        if (f2) {
            if (!b) {
                ek.d.setContentDescription((CharSequence)resources.getString(2131296871, new Object[] { text }));
                return;
            }
            ek.d.setContentDescription((CharSequence)resources.getString(2131296867, new Object[] { x.f, text }));
        }
    }
    
    private void a(final View view, final Resources resources, final x x, final x x2) {
        final DMMessageEntry dmMessageEntry = (DMMessageEntry)x.h;
        final ek ek = (ek)view.getTag();
        ek.a(x);
        ek.b.setVisibility(0);
        final StringBuilder sb = new StringBuilder(x.g());
        this.a(ek, x, sb);
        ek.b.setTextSize(0, bo.a);
        final boolean c = x.c();
        int linkTextColor;
        if (c) {
            linkTextColor = resources.getColor(2131689554);
        }
        else {
            linkTextColor = resources.getColor(2131689600);
        }
        final String string = sb.toString();
        final TweetEntities entities = dmMessageEntry.entities;
        dz dz;
        if (this.a) {
            dz = this;
        }
        else {
            dz = null;
        }
        com.twitter.library.util.t.a(this.i, ek.b, com.twitter.library.view.l.a(string, entities, dz, resources.getColor(2131689621), linkTextColor, 0, true, c));
        ek.b.setLinkTextColor(linkTextColor);
        Linkify.addLinks(ek.b, 6);
        if (c) {
            ek.f.setBackgroundColor(resources.getColor(2131689553));
            ek.b.setTextColor(resources.getColor(2131689554));
        }
        ek.g.setVisibility(8);
        ek.c.setVisibility(0);
        ek.c.setTextColor(resources.getColor(2131689625));
        ek.f.setAlpha(1.0f);
        if (x.d()) {
            final int e = x.e();
            if (e == 0) {
                ek.c.setText(2131296806);
            }
            else {
                if (e == 1) {
                    ek.c.setText(2131296806);
                }
                else {
                    ek.c.setText(2131296805);
                }
                ek.b.setTextColor(resources.getColor(2131689550));
                ek.f.setBackgroundColor(resources.getColor(2131689549));
                ek.c.setTextColor(resources.getColor(2131689544));
            }
        }
        else if (x.d == 19) {
            ek.f.setAlpha(0.5f);
            ek.c.setText(2131297168);
        }
        else {
            if (x.h()) {
                ek.g.setVisibility(0);
                if (this.a) {
                    ek.h.setOnClickListener((View$OnClickListener)new ed(this, x));
                    ek.i.setOnClickListener((View$OnClickListener)new ee(this, x));
                }
            }
            String text;
            if (DateUtils.isToday(x.i)) {
                text = com.twitter.android.dz.f.format(x.i);
            }
            else if (DateUtils.isToday(86400000L + x.i)) {
                text = resources.getString(2131298161, new Object[] { com.twitter.android.dz.f.format(x.i) });
            }
            else if (bk.b(x.i)) {
                text = com.twitter.android.dz.g.format(x.i);
            }
            else {
                text = com.twitter.android.dz.h.format(x.i);
            }
            if (!c && this.s) {
                text = String.format(resources.getString(2131296868), x.f, text);
            }
            ek.c.setText((CharSequence)text);
        }
        this.a(ek, resources, x, x2);
        this.a(view, resources, x);
    }
    
    private void a(final ek ek, final Resources resources, final x x, final x x2) {
        if (x2 != null) {
            if (x.a(x2)) {
                ek.c.setVisibility(8);
                if (!x.c()) {
                    ek.a.setVisibility(4);
                }
            }
            final RelativeLayout$LayoutParams layoutParams = (RelativeLayout$LayoutParams)ek.g.getLayoutParams();
            final int dimensionPixelSize = resources.getDimensionPixelSize(2131558633);
            int n;
            if (x.b() || x2.h()) {
                n = resources.getDimensionPixelSize(2131558634);
            }
            else if (x.b(x2) >= 3600000L) {
                n = resources.getDimensionPixelSize(2131558631);
            }
            else {
                n = resources.getDimensionPixelSize(2131558632);
            }
            layoutParams.setMargins(0, dimensionPixelSize, 0, n);
            ek.g.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
    }
    
    private void a(final ek ek, final x x) {
        final DMMessageEntry dmMessageEntry = (DMMessageEntry)x.h;
        final int j = x.j;
        final DMPhoto dmPhoto = (DMPhoto)dmMessageEntry.attachment;
        if (dmPhoto.possiblySensitive && x.j() && !this.d.contains(dmPhoto.mediaUrl)) {
            ek.d.setVisibility(8);
            ek.j.setVisibility(0);
            if (this.a) {
                ek.j.setOnClickListener((View$OnClickListener)new ef(this, dmPhoto));
            }
        }
        else {
            ek.d.setAspectRatio(com.twitter.util.g.a(dmPhoto.width / dmPhoto.height, 0.75f, 3.0f));
            ek.d.a((com.twitter.library.media.manager.k)com.twitter.library.media.util.l.a(dmPhoto).a(this.k), false);
            ek.d.setVisibility(0);
            if (this.a) {
                ek.d.setOnClickListener((View$OnClickListener)new eg(this, x, j, dmPhoto));
                ek.d.setOnLongClickListener((View$OnLongClickListener)new eh(this, j));
            }
        }
    }
    
    private void a(final ek ek, final x x, final StringBuilder sb) {
        final DMMessageEntry dmMessageEntry = (DMMessageEntry)x.h;
        final int j = x.j;
        final boolean d = x.d();
        final String b = x.b;
        ek.e.setVisibility(8);
        ek.d.a((com.twitter.library.media.manager.k)null);
        ek.d.setVisibility(8);
        ek.j.setVisibility(8);
        if (dmMessageEntry.a("photo")) {
            this.a(ek, x);
        }
        else if (dmMessageEntry.f()) {
            final c l = this.l;
            final long r = this.r;
            final DMTweet dmTweet = (DMTweet)dmMessageEntry.attachment;
            final long statusId = dmTweet.quotedTweetData.statusId;
            String impressionId;
            if (dmTweet.quotedTweetData.promotedContent == null) {
                impressionId = null;
            }
            else {
                impressionId = dmTweet.quotedTweetData.promotedContent.impressionId;
            }
            if (!this.t.contains(dmMessageEntry.id)) {
                l.a(((TwitterScribeLog)new TwitterScribeLog(r).b(new String[] { "messages:thread::shared_tweet_dm:impression" })).a(b, statusId, impressionId));
                this.t.add(dmMessageEntry.id);
            }
            ek.e.setDisplaySensitiveMedia(this.q != null && this.q.k);
            ek.e.setQuoteData(dmTweet.quotedTweetData);
            ek.e.setRenderRtl(bj.e);
            ek.e.setVisibility(0);
            if (this.a) {
                ek.e.setOnClickListener((View$OnClickListener)new eb(this, d, j, l, r, b, statusId, impressionId, dmTweet));
                ek.e.setOnLongClickListener((View$OnLongClickListener)new ec(this, j));
            }
        }
        if (sb.toString().trim().length() == 0) {
            ek.b.setVisibility(8);
        }
    }
    
    private void a(final TypefacesTextView typefacesTextView, final Resources resources, final x x) {
        final LinearLayout$LayoutParams layoutParams = (LinearLayout$LayoutParams)typefacesTextView.getLayoutParams();
        final int dimensionPixelSize = resources.getDimensionPixelSize(2131558620);
        int n;
        if (x != null) {
            if (x.b()) {
                n = resources.getDimensionPixelSize(2131558620);
            }
            else {
                n = resources.getDimensionPixelSize(2131558619);
            }
        }
        else {
            n = resources.getDimensionPixelSize(2131558619);
        }
        layoutParams.setMargins(0, dimensionPixelSize, 0, n);
        typefacesTextView.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    private boolean a(final x x) {
        return x.h() && !this.o.contains(x.c);
    }
    
    protected View a(final Cursor cursor, final ViewGroup viewGroup) {
        final x x = new x(cursor, this.r, this.q);
        switch (x.d) {
            default: {
                return null;
            }
            case 0:
            case 1:
            case 19: {
                if (this.a(x)) {
                    final LinearLayout linearLayout = (LinearLayout)LayoutInflater.from(this.i).inflate(2130968717, viewGroup, false);
                    linearLayout.setTag((Object)linearLayout.findViewById(2131886631));
                    return (View)linearLayout;
                }
                RelativeLayout relativeLayout;
                if (x.c()) {
                    relativeLayout = (RelativeLayout)LayoutInflater.from(this.i).inflate(2130968727, viewGroup, false);
                }
                else {
                    relativeLayout = (RelativeLayout)LayoutInflater.from(this.i).inflate(2130968726, viewGroup, false);
                }
                relativeLayout.setTag((Object)new ek(this, (View)relativeLayout, this.a));
                return (View)relativeLayout;
            }
            case 17: {
                final LinearLayout linearLayout2 = (LinearLayout)LayoutInflater.from(this.i).inflate(2130968724, viewGroup, false);
                linearLayout2.setTag((Object)new ei((View)linearLayout2));
                return (View)linearLayout2;
            }
            case 8:
            case 10:
            case 11:
            case 18: {
                final LinearLayout linearLayout3 = (LinearLayout)LayoutInflater.from(this.i).inflate(2130968717, viewGroup, false);
                linearLayout3.setTag((Object)linearLayout3.findViewById(2131886631));
                return (View)linearLayout3;
            }
        }
    }
    
    void a() {
        for (final Map.Entry<Object, V> entry : this.b.entrySet()) {
            ((UserView)entry.getValue()).getImageView().a((TwitterUser)this.c.get(entry.getKey()));
        }
    }
    
    public void a(final long n) {
        this.i.startActivity(new Intent(this.i, (Class)ProfileActivity.class).putExtra("user_id", n));
    }
    
    protected void a(final View view, final Cursor cursor) {
        final x x = new x(cursor, this.r, this.q);
        x x2;
        if (cursor.moveToNext()) {
            x2 = new x(cursor, this.r, this.q);
        }
        else {
            x2 = null;
        }
        cursor.moveToPosition(x.j);
        final Resources resources = this.i.getResources();
        switch (x.d) {
            case 0:
            case 1:
            case 19: {
                if (this.a(x)) {
                    final long g = this.j.b().g();
                    final c l = this.l;
                    if (!this.p.contains(x.c)) {
                        l.a(((TwitterScribeLog)new TwitterScribeLog(g).b(new String[] { "messages:thread:rtf_message::impression" })).a(x.c, x.i));
                        this.p.add(x.c);
                    }
                    final TypefacesTextView typefacesTextView = (TypefacesTextView)view.getTag();
                    typefacesTextView.setText((CharSequence)resources.getString(2131296879));
                    if (this.a) {
                        typefacesTextView.setOnClickListener((View$OnClickListener)new ea(this, l, g, x));
                    }
                    this.a(typefacesTextView, resources, x2);
                    return;
                }
                this.a(view, resources, x, x2);
            }
            case 10: {
                final TypefacesTextView typefacesTextView2 = (TypefacesTextView)view.getTag();
                typefacesTextView2.setText((CharSequence)ak.a(resources, x.f, TextUtils.join((CharSequence)", ", (Iterable)((ParticipantsJoinEntry)x.h).addedUserNames), x.c()));
                this.a(typefacesTextView2, resources, x2);
            }
            case 11: {
                final TypefacesTextView typefacesTextView3 = (TypefacesTextView)view.getTag();
                typefacesTextView3.setText((CharSequence)ak.a(resources, x.f));
                this.a(typefacesTextView3, resources, x2);
            }
            case 8: {
                final TypefacesTextView typefacesTextView4 = (TypefacesTextView)view.getTag();
                typefacesTextView4.setText((CharSequence)ak.b(this.i.getResources(), x.f, ((UpdateConversationNameEntry)x.h).newConversationName, x.c()));
                this.a(typefacesTextView4, resources, x2);
            }
            case 17: {
                List list;
                if (x.h == null) {
                    list = Collections.EMPTY_LIST;
                }
                else {
                    list = ((JoinConversationEntry)x.h).participants;
                }
                final long g2 = this.j.b().g();
                list.remove(g2);
                final ei ei = (ei)view.getTag();
                ei.a.setText((CharSequence)ak.a(resources, x.f, false));
                ei.d.setVisibility(8);
                final LinearLayout c = ei.c;
                if (list.size() <= 0) {
                    ei.b.setVisibility(8);
                    c.setVisibility(8);
                    return;
                }
                ei.b.setVisibility(0);
                c.setVisibility(0);
                ei.b.setText((CharSequence)resources.getString(2131296852, new Object[] { list.size() }));
                c.removeAllViews();
                this.b.clear();
                for (int n = 0; n < 6 && n < list.size(); ++n) {
                    final UserView userView = (UserView)View.inflate(this.i, 2130968715, (ViewGroup)null);
                    userView.setTag((Object)new yk(userView));
                    c.addView((View)userView);
                    this.b.put(list.get(n), userView);
                }
                if (this.c.size() < this.b.size()) {
                    if (!this.e) {
                        this.e = true;
                        new ej(this, list, this.i, g2).execute((Object[])new Void[0]);
                    }
                }
                else {
                    this.a();
                }
                if (this.q != null && this.q.j) {
                    ei.d.setVisibility(0);
                    return;
                }
                break;
            }
            case 18: {
                final TypefacesTextView typefacesTextView5 = (TypefacesTextView)view.getTag();
                final List notAddedUserNames = ((ParticipantsNotAddedEntry)x.h).notAddedUserNames;
                final String join = TextUtils.join((CharSequence)", ", (Iterable)notAddedUserNames);
                if (notAddedUserNames.size() == 1) {
                    typefacesTextView5.setText((CharSequence)resources.getString(2131296860, new Object[] { join }));
                }
                else {
                    typefacesTextView5.setText((CharSequence)resources.getString(2131296859, new Object[] { join }));
                }
                this.a(typefacesTextView5, resources, x2);
            }
        }
    }
    
    @Override
    public void a(final MediaEntity mediaEntity) {
    }
    
    @Override
    public void a(final TweetClassicCard tweetClassicCard) {
    }
    
    @Override
    public void a(final UrlEntity urlEntity) {
        final String c = bn.c(urlEntity.expandedUrl);
        final long g = this.j.b().g();
        final String a = com.twitter.library.featureswitch.d.a("in_app_youtube_player_android_2413");
        if (c != null && !"control".equals(a) && !"unassigned".equals(a)) {
            this.l.a(new TwitterScribeLog(g).b(new String[] { "messages:thread:::open_link_youtube" }));
            this.l.a(((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(g).b(new String[] { "messages:thread:::open_link" })).a(this.m)).b(urlEntity.expandedUrl, urlEntity.url));
            final Intent putExtra = new Intent(this.i, (Class)YouTubeActivity.class).putExtra("video_id", c);
            if ("youtube_embedded".equals(a)) {
                putExtra.putExtra("url", (Serializable)urlEntity);
            }
            this.i.startActivity(putExtra);
            return;
        }
        am.a(this.i, null, urlEntity, g, "messages:thread:::open_link", null, this.m, null);
    }
    
    @Override
    public void a(final TwitterPlace twitterPlace) {
    }
    
    @Override
    public void a(final String s) {
        if (s.length() > 1) {
            if (s.charAt(0) == '@') {
                this.i.startActivity(new Intent(this.i, (Class)ProfileActivity.class).putExtra("screen_name", s.substring(1)));
            }
            else {
                if (s.charAt(0) == '#') {
                    this.i.startActivity(new Intent(this.i, (Class)SearchActivity.class).putExtra("query", s).putExtra("q_source", "hashtag_click").putExtra("scribe_context", "hashtag"));
                    return;
                }
                if (s.charAt(0) == '$') {
                    this.i.startActivity(new Intent(this.i, (Class)SearchActivity.class).putExtra("query", s).putExtra("q_source", "cashtag_click").putExtra("scribe_context", "cashtag"));
                }
            }
        }
    }
    
    public void a(final boolean s) {
        this.s = s;
        this.notifyDataSetChanged();
    }
    
    @Override
    public void b(final long n) {
    }
    
    @Override
    public long getItemId(final int n) {
        final Cursor cursor = (Cursor)this.getItem(n);
        if (cursor == null) {
            return super.getItemId(n);
        }
        return cursor.getLong(0);
    }
    
    public int getItemViewType(final int n) {
        return this.a((Cursor)this.getItem(n));
    }
    
    public int getViewTypeCount() {
        return 4;
    }
}
