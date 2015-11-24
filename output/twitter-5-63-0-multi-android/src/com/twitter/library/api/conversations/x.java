// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.twitter.library.provider.aj;
import android.database.Cursor;
import com.twitter.library.api.UserSettings;

public class x
{
    public static final String[] a;
    public final String b;
    public final long c;
    public final int d;
    public final long e;
    public final String f;
    public final String g;
    public final f h;
    public final long i;
    public final int j;
    public final long k;
    private final UserSettings l;
    
    static {
        a = new String[] { "_id", "entry_id", "conversation_id", "user_id", "s_name", "entry_type", "created", "s_profile_image_url", "data" };
    }
    
    public x(final Cursor cursor, final long n, final UserSettings userSettings) {
        this(cursor.getString(2), cursor.getLong(1), cursor.getInt(5), cursor.getLong(3), cursor.getString(4), cursor.getString(7), (f)com.twitter.util.f.a(cursor.getBlob(8)), cursor.getLong(6), cursor.getPosition(), n, userSettings);
    }
    
    public x(final String b, final long c, final int d, final long e, final String f, final String g, final f h, final long i, final int j, final long k, final UserSettings l) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    private boolean k() {
        return this.j() && this.a() && ((DMMessageEntry)this.h).a("tweet") && ((DMTweet)((DMMessageEntry)this.h).attachment).quotedTweetData.possiblySensitive;
    }
    
    public boolean a() {
        return aj.d.contains(this.d);
    }
    
    public boolean a(final x x) {
        return x.e == this.e && this.b(x) <= 60000L && !this.d() && this.i() && x.i();
    }
    
    public long b(final x x) {
        return x.i - this.i;
    }
    
    public boolean b() {
        return aj.e.contains(this.d);
    }
    
    public boolean c() {
        return this.e == this.k;
    }
    
    public boolean d() {
        return this.d == 1;
    }
    
    public int e() {
        if (this.d()) {
            return ((DMLocalMessageEntry)this.h).status;
        }
        return -1;
    }
    
    public boolean f() {
        return this.a() && ((DMMessageEntry)this.h).a("photo");
    }
    
    public String g() {
        if (this.a() && ((DMMessageEntry)this.h).text != null) {
            if (this.k()) {
                ak.a((DMMessageEntry)this.h);
            }
            return ((DMMessageEntry)this.h).text;
        }
        return "";
    }
    
    public boolean h() {
        return this.a() && ((DMMessageEntry)this.h).isSpam;
    }
    
    public boolean i() {
        return this.a() && !((DMMessageEntry)this.h).isSpam;
    }
    
    public boolean j() {
        return this.l != null && !this.l.k;
    }
}
