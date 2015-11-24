// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import com.twitter.library.api.z;
import android.text.TextUtils;
import java.util.Collections;
import android.net.Uri;
import java.util.HashSet;
import com.twitter.library.api.conversations.x;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.twitter.library.api.TwitterUser;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;

public class c extends CursorWrapper
{
    private final Cursor a;
    private final long b;
    private final Context c;
    private final String d;
    private Cursor e;
    private final Map f;
    private final Map g;
    private final Map h;
    private final bg i;
    private final boolean j;
    
    public c(final Cursor a, final long b, final Context c, final String d, final boolean j) {
        super(a);
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new HashMap();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.i = bg.a(this.c, this.b);
        this.j = j;
        this.n();
    }
    
    private void a(final Set set, final Map map) {
        final List a = this.i.a(CollectionUtils.c(set));
        final HashMap<Object, TwitterUser> hashMap = new HashMap<Object, TwitterUser>();
        for (final TwitterUser twitterUser : a) {
            hashMap.put(twitterUser.a(), twitterUser);
        }
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            final String s = entry.getKey();
            final List list = (List)entry.getValue();
            final ArrayList<TwitterUser> list2 = new ArrayList<TwitterUser>();
            final ArrayList<Long> list3 = new ArrayList<Long>();
            final Iterator<Long> iterator3 = list.iterator();
            int n = 0;
            while (iterator3.hasNext()) {
                final Long n2 = iterator3.next();
                int n3;
                if (n2 == this.b) {
                    n3 = 1;
                }
                else {
                    final TwitterUser twitterUser2 = hashMap.get(n2);
                    if (twitterUser2 != null) {
                        list2.add(twitterUser2);
                        n3 = n;
                    }
                    else {
                        list3.add(n2);
                        n3 = n;
                    }
                }
                n = n3;
            }
            final TwitterUser twitterUser3 = hashMap.get(this.b);
            if (n != 0 && twitterUser3 != null) {
                list2.add(twitterUser3);
            }
            else if (twitterUser3 == null) {
                list3.add(this.b);
            }
            this.f.put(s, list2);
            this.g.put(s, list3);
        }
    }
    
    private void n() {
        this.q();
        this.p();
        if (this.j) {
            this.o();
        }
    }
    
    private void o() {
        this.h.clear();
        for (final x x : this.i.c(this.d)) {
            this.h.put(x.b, x);
        }
    }
    
    private void p() {
        this.f.clear();
        this.g.clear();
        final HashSet<Long> set = new HashSet<Long>();
        final HashMap<String, ArrayList<Long>> hashMap = (HashMap<String, ArrayList<Long>>)new HashMap<Object, ArrayList<Long>>();
        final Uri a = ae.a(ak.a, this.b);
        while (true) {
            Label_0218: {
                if (this.d == null) {
                    break Label_0218;
                }
                this.e = this.c.getContentResolver().query(a, ak.c, "conversation_id=?", new String[] { this.d }, (String)null);
                if (this.e != null) {
                    Label_0242: {
                        try {
                            while (this.e.moveToNext()) {
                                final String string = this.e.getString(0);
                                final long long1 = this.e.getLong(1);
                                if (!hashMap.containsKey(string)) {
                                    hashMap.put(string, new ArrayList<Long>());
                                }
                                hashMap.get(string).add(long1);
                                set.add(long1);
                            }
                            break Label_0242;
                        }
                        finally {
                            this.e.close();
                        }
                        break Label_0218;
                    }
                    this.e.close();
                }
                this.a(set, hashMap);
                return;
            }
            this.e = this.c.getContentResolver().query(a, ak.c, (String)null, (String[])null, (String)null);
            continue;
        }
    }
    
    private void q() {
        if (this.e != null) {
            this.e.close();
        }
    }
    
    public List a() {
        List empty_LIST = this.f.get(this.d());
        if (empty_LIST == null) {
            empty_LIST = Collections.EMPTY_LIST;
        }
        return empty_LIST;
    }
    
    public List b() {
        List empty_LIST = this.g.get(this.d());
        if (empty_LIST == null) {
            empty_LIST = Collections.EMPTY_LIST;
        }
        return empty_LIST;
    }
    
    public x c() {
        return this.h.get(this.d());
    }
    
    public void close() {
        super.close();
        this.q();
    }
    
    public String d() {
        return this.a.getString(1);
    }
    
    public String e() {
        return this.a.getString(3);
    }
    
    public String f() {
        String s = this.e();
        if (TextUtils.isEmpty((CharSequence)s)) {
            s = com.twitter.library.api.conversations.ak.a(this.c, this.a(), this.h());
        }
        return s;
    }
    
    public String g() {
        final List a = this.a();
        if (this.h() || CollectionUtils.a((Collection)a) || a.size() != 2) {
            return null;
        }
        return '@' + a.get(0).username;
    }
    
    public boolean h() {
        return this.a.getInt(2) == 1;
    }
    
    public long i() {
        final List a = this.a();
        if (!CollectionUtils.a((Collection)a)) {
            return a.get(0).userId;
        }
        return -1L;
    }
    
    public boolean j() {
        return this.a.getInt(7) > 0;
    }
    
    public boolean k() {
        return this.a.getInt(5) > 0;
    }
    
    public boolean l() {
        final List a = this.a();
        if (!this.h() && !CollectionUtils.a((Collection)a)) {
            final TwitterUser twitterUser = a.get(0);
            return !this.h() && !z.b(twitterUser.friendship) && !com.twitter.library.api.conversations.ak.f() && this.b != twitterUser.userId;
        }
        return false;
    }
    
    public String m() {
        final List a = this.a();
        if (!CollectionUtils.a((Collection)a)) {
            return a.get(0).profileImageUrl;
        }
        return null;
    }
    
    public boolean requery() {
        final boolean requery = super.requery();
        if (requery) {
            this.n();
        }
        return requery;
    }
}
