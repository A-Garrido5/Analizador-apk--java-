// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import java.util.Iterator;
import android.view.View;
import android.view.ViewGroup;
import com.twitter.library.api.PromotedContent;
import com.twitter.util.f;
import com.twitter.library.api.TweetEntities;
import android.net.Uri;
import com.twitter.util.q;
import com.twitter.library.provider.ad;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.util.InvalidDataException;
import com.twitter.library.provider.Tweet;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.provider.cm;
import android.database.Cursor;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import android.view.LayoutInflater;
import android.content.Context;
import android.support.v4.view.PagerAdapter;

public class x extends PagerAdapter
{
    private final Context a;
    private final LayoutInflater b;
    private final y c;
    private final z d;
    private final List e;
    private Map f;
    private Map g;
    private Map h;
    private int i;
    private int j;
    private af k;
    
    public x(final Context a, final z d, final y c) {
        this.e = new ArrayList();
        this.f = new HashMap();
        this.g = null;
        this.h = null;
        this.i = 0;
        this.a = a;
        this.d = d;
        this.c = c;
        this.b = LayoutInflater.from(a);
    }
    
    private static af a(final Cursor cursor, final Context context) {
        for (int i = cursor.getInt(cm.D); i != 1; i = cursor.getInt(cm.D)) {
            if (!cursor.moveToNext()) {
                return null;
            }
        }
        final int b = b(cursor.getInt(cm.t));
        if (b == -1) {
            cursor.moveToNext();
            return null;
        }
        final String string = cursor.getString(cm.r);
        final long long1 = cursor.getLong(cm.s);
        final int int1 = cursor.getInt(cm.u);
        final int int2 = cursor.getInt(cm.v);
        final String string2 = cursor.getString(cm.A);
        final String string3 = cursor.getString(cm.B);
        final boolean b2 = cursor.getInt(cm.E) == 1;
        final String string4 = cursor.getString(cm.w);
        final String string5 = cursor.getString(cm.x);
        final String string6 = cursor.getString(cm.y);
        final String string7 = cursor.getString(cm.z);
        final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>();
        final ArrayList<TwitterUser> list2 = new ArrayList<TwitterUser>();
        final ArrayList<Tweet> list3 = new ArrayList<Tweet>();
        int n = -1;
        int position = -1;
        while (true) {
            while (cursor.moveToNext()) {
                final int int3 = cursor.getInt(cm.D);
                switch (int3) {
                    case 2: {
                        final TwitterUser a = a(cursor);
                        if (a != null) {
                            list.add(a);
                            break;
                        }
                        ErrorReporter.a(new InvalidDataException("Failed reading highlights proof user from DB"));
                        break;
                    }
                    case 3: {
                        final TwitterUser a2 = a(cursor);
                        if (a2 != null) {
                            list2.add(a2);
                            break;
                        }
                        ErrorReporter.a(new InvalidDataException("Failed reading highlights story user from DB"));
                        break;
                    }
                    case 4: {
                        if (b != 6 && b != 7 && b != 8 && b != 9) {
                            list3.add(new ad(cursor).a());
                            break;
                        }
                        position = cursor.getPosition();
                        if (n == -1) {
                            n = position;
                            break;
                        }
                        break;
                    }
                }
                if (int3 == 1) {
                    final int n2 = position;
                    final int n3 = n;
                    final mx mx = new mx(int1, int2, list);
                    switch (b) {
                        default: {
                            return null;
                        }
                        case 0: {
                            if (!list3.isEmpty()) {
                                return new aw(string, long1, mx, b2, string2, string3, list3.get(0), false);
                            }
                            ErrorReporter.a(new InvalidDataException("Tweet story should have at least 1 tweet."));
                            return null;
                        }
                        case 1: {
                            if (!list3.isEmpty()) {
                                return new as(string, long1, mx, b2, string2, string3, list3.get(0));
                            }
                            ErrorReporter.a(new InvalidDataException("Media tweet story should have at least 1 tweet."));
                            return null;
                        }
                        case 2: {
                            if (list3.size() >= 2) {
                                return new au(string, long1, mx, b2, string2, string3, list3.get(0), list3.get(1));
                            }
                            ErrorReporter.a(new InvalidDataException("In reply to story should have at least 2 tweets"));
                            return null;
                        }
                        case 3: {
                            if (!list3.isEmpty() && !q.a(string7)) {
                                return new aj(string, long1, mx, b2, string2, string3, list3.get(0), string7);
                            }
                            ErrorReporter.a(new InvalidDataException("Summary tweet story should have at least 1 tweet & fallback header."));
                            return null;
                        }
                        case 5: {
                            if (!list2.isEmpty()) {
                                Tweet tweet;
                                if (!list3.isEmpty()) {
                                    tweet = list3.get(0);
                                }
                                else {
                                    tweet = null;
                                }
                                return new c(string, long1, mx, b2, string2, string3, list2.get(0), tweet);
                            }
                            ErrorReporter.a(new InvalidDataException("Follows story should have at least 1 user."));
                            return null;
                        }
                        case 4:
                        case 11: {
                            if (!list3.isEmpty()) {
                                return new l(string, long1, mx, b2, string2, string3, list3.get(0));
                            }
                            ErrorReporter.a(new InvalidDataException("Player tweet story should have at least 1 tweet."));
                            return null;
                        }
                        case 6:
                        case 7:
                        case 8:
                        case 9: {
                            if (n3 == -1 || n2 < n3) {
                                ErrorReporter.a(new InvalidDataException("Tweet list story should have at least 1 tweet."));
                                return null;
                            }
                            return a(cursor, context, b, string, long1, string2, string3, b2, string4, string5, string6, string7, n3, n2, mx);
                        }
                    }
                }
            }
            final int n2 = position;
            final int n3 = n;
            continue;
        }
    }
    
    private static af a(final Cursor cursor, final Context context, final int n, final String s, final long n2, final String s2, final String s3, final boolean b, final String s4, final String s5, final String s6, final String s7, final int n3, final int n4, final mx mx) {
        int n5 = 0;
        String s9 = null;
        switch (n) {
            default: {
                String s8 = Uri.parse(s6).getHost();
                if (s8.startsWith("www.")) {
                    s8 = s8.substring(4);
                }
                n5 = 2130838595;
                s9 = s8;
                break;
            }
            case 6:
            case 7: {
                s9 = context.getString(2131297063);
                n5 = 2130838594;
                break;
            }
            case 8: {
                s9 = context.getString(2131297062);
                n5 = 2130838594;
                break;
            }
        }
        return new ah(s, n2, mx, b, s2, s3, n, s4, s5, s6, s9, s7, n5, (Cursor)new com.twitter.library.provider.z(cursor, n3, n4));
    }
    
    private g a(final boolean b, final int n) {
        if (this.k == null || this.k.a() != 10) {
            this.k = new g(b);
        }
        final g g = (g)this.k;
        g.a(n);
        return g;
    }
    
    public static TwitterUser a(final Cursor cursor) {
        boolean isLifelineInstitution = true;
        final String string = cursor.getString(cm.c);
        if (q.a(string)) {
            return null;
        }
        final TwitterUser twitterUser = new TwitterUser();
        twitterUser.username = string;
        twitterUser.userId = cursor.getLong(cm.b);
        twitterUser.name = cursor.getString(cm.d);
        twitterUser.profileImageUrl = cursor.getString(cm.f);
        twitterUser.profileHeaderImageUrl = cursor.getString(cm.g);
        twitterUser.flags = cursor.getInt(cm.h);
        twitterUser.profileDescription = cursor.getString(cm.i);
        twitterUser.descriptionEntities = (TweetEntities)f.a(cursor.getBlob(cm.j));
        twitterUser.location = cursor.getString(cm.k);
        twitterUser.profileUrl = cursor.getString(cm.l);
        twitterUser.urlEntities = (TweetEntities)f.a(cursor.getBlob(cm.m));
        twitterUser.friendship = cursor.getInt(cm.n);
        twitterUser.followersCount = cursor.getInt(cm.o);
        twitterUser.createdAt = cursor.getLong(cm.p);
        twitterUser.promotedContent = (PromotedContent)f.a(cursor.getBlob(cm.q));
        final int int1 = cursor.getInt(cm.h);
        twitterUser.verified = ((int1 & 0x2) != 0x0 && isLifelineInstitution);
        twitterUser.isProtected = ((int1 & 0x1) != 0x0 && isLifelineInstitution);
        twitterUser.isTranslator = ((int1 & 0x4) != 0x0 && isLifelineInstitution);
        if ((int1 & 0x8) == 0x0) {
            isLifelineInstitution = false;
        }
        twitterUser.isLifelineInstitution = isLifelineInstitution;
        return twitterUser;
    }
    
    private static int b(final int n) {
        switch (n) {
            default: {
                return -1;
            }
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            case 4: {
                return 2;
            }
            case 5: {
                return 3;
            }
            case 6: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 6;
            }
            case 9: {
                return 7;
            }
            case 10: {
                return 8;
            }
        }
    }
    
    private void b(final Cursor cursor) {
        if (cursor != null && cursor.moveToFirst()) {
            int j = 0;
            while (!cursor.isAfterLast()) {
                final af a = a(cursor, this.a);
                if (a != null) {
                    a.j = j;
                    this.e.add(a);
                    ++j;
                }
            }
        }
    }
    
    public int a() {
        return this.i;
    }
    
    public af a(final int n) {
        if (n >= 0 && n < this.e.size()) {
            return this.e.get(n);
        }
        return null;
    }
    
    public void a(final Cursor cursor, final int i, final int j) {
        boolean b = false;
        this.e.clear();
        this.i = i;
        switch (this.j = j) {
            default: {
                throw new IllegalArgumentException("Method argument 'event' should be one of the StoriesPagerAdapter.EVENT_* constants.");
            }
            case 100: {
                if (i == 0 || i == 2) {
                    this.k = new j();
                    break;
                }
                if (i == 1) {
                    this.k = this.a(true, 0);
                    b = false;
                    break;
                }
                this.k = null;
                b = false;
                break;
            }
            case 101: {
                if (i == 0 || i == 2) {
                    this.k = new j();
                    b = false;
                    break;
                }
                if (i == 1) {
                    this.k = this.a(true, 2);
                    b = false;
                    break;
                }
                this.k = null;
                b = false;
                break;
            }
            case 102: {
                if (i == 1) {
                    this.k = this.a(true, 3);
                    b = true;
                    break;
                }
                if (i == 2) {
                    this.k = this.a(false, 0);
                    b = true;
                    break;
                }
                this.k = null;
                b = false;
                break;
            }
            case 103: {
                this.k = new a(1);
                b = false;
                break;
            }
            case 104: {
                this.k = new a(0);
                b = true;
                break;
            }
        }
        if (this.k != null) {
            this.e.add(this.k);
        }
        if (this.e.size() == 0 && (cursor == null || cursor.isClosed())) {
            this.h = null;
            this.g = null;
        }
        if (this.k == null || b) {
            this.b(cursor);
        }
        this.notifyDataSetChanged();
    }
    
    public void a(final Object o, final int e) {
        if (!(o instanceof ViewGroup)) {
            throw new IllegalArgumentException("Item not expected type!");
        }
        final ViewGroup viewGroup = (ViewGroup)o;
        final af a = this.a(e);
        if (a == null) {
            return;
        }
        final View viewById = viewGroup.findViewById(2131886125);
        if (viewById == null) {
            throw new IllegalStateException("No story container???");
        }
        final ag ag = (ag)viewById.getTag();
        if (ag == null) {
            throw new IllegalStateException("No holder in tag");
        }
        ag.E = e;
        this.d.a(a, ag, this.a, this.c);
        this.f.put(viewById, a.e);
    }
    
    public int b() {
        return this.j;
    }
    
    @Override
    public void destroyItem(final ViewGroup viewGroup, final int n, final Object o) {
        final View view = (View)o;
        ((ag)view.getTag()).E = Integer.MIN_VALUE;
        viewGroup.removeView(view);
        this.f.remove(view);
    }
    
    @Override
    public int getCount() {
        return this.e.size();
    }
    
    @Override
    public int getItemPosition(final Object o) {
        int intValue = -2;
        final String s = this.f.get(o);
        int intValue2;
        if (s == null || this.g == null) {
            intValue2 = intValue;
        }
        else {
            if (this.g.containsKey(s)) {
                intValue2 = this.g.get(s);
            }
            else {
                intValue2 = intValue;
            }
            if (this.h != null && intValue2 != intValue) {
                if (this.h.containsKey(s)) {
                    intValue = (int)this.h.get(s);
                }
                if (intValue == intValue2) {
                    return -1;
                }
            }
        }
        return intValue2;
    }
    
    @Override
    public Object instantiateItem(final ViewGroup viewGroup, final int e) {
        final af a = this.a(e);
        if (a == null) {
            return null;
        }
        final View a2 = this.d.a(a, this.a, this.b, this.c);
        final ag ag = (ag)a2.getTag();
        ag.E = e;
        this.d.a(a, ag, this.a, this.c);
        viewGroup.addView(a2);
        this.f.put(a2, a.e);
        return a2;
    }
    
    @Override
    public boolean isViewFromObject(final View view, final Object o) {
        return o == view;
    }
    
    @Override
    public void notifyDataSetChanged() {
        this.h = this.g;
        final HashMap<String, Integer> g = new HashMap<String, Integer>(this.e.size());
        final Iterator<af> iterator = (Iterator<af>)this.e.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final String e = iterator.next().e;
            final int n2 = n + 1;
            g.put(e, n);
            n = n2;
        }
        this.g = g;
        super.notifyDataSetChanged();
    }
}
