// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import com.twitter.library.api.TwitterSocialProof;
import java.util.Map;
import com.twitter.library.api.EntityScribeContent;
import com.twitter.library.api.TimelineScribeContent;
import com.twitter.util.f;
import android.database.Cursor;
import com.twitter.library.api.geo.TwitterPlace;
import com.twitter.library.api.TweetEntities;
import com.twitter.library.api.ActivitySummary;
import java.util.List;
import com.twitter.library.api.Entity;
import com.twitter.library.api.QuotedTweetData;
import java.util.HashMap;
import com.twitter.library.api.TwitterStatusCard;
import com.twitter.library.api.PromotedContent;

public class ad
{
    public String A;
    public int B;
    public int C;
    public PromotedContent D;
    public long E;
    public boolean F;
    public int G;
    public TwitterStatusCard H;
    public int I;
    public int J;
    public int K;
    public long L;
    public int M;
    public String N;
    public String O;
    public HashMap P;
    public QuotedTweetData Q;
    public long R;
    public long S;
    public long T;
    public String U;
    public String V;
    public Long W;
    public Entity[] X;
    public List Y;
    public int Z;
    public String a;
    public String aa;
    public int ab;
    public int ac;
    public int ad;
    public String ae;
    public int af;
    public boolean ag;
    public int ah;
    public ActivitySummary ai;
    public String b;
    public String c;
    public String d;
    public long e;
    public String f;
    public long g;
    public String h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public String m;
    public long n;
    public boolean o;
    public boolean p;
    public long q;
    public boolean r;
    public double s;
    public double t;
    public TweetEntities u;
    public boolean v;
    public long w;
    public boolean x;
    public TwitterPlace y;
    public long z;
    
    public ad() {
        this.e = -1L;
        this.g = -1L;
        this.z = -1L;
        this.P = new HashMap();
    }
    
    public ad(final Cursor cursor) {
        long long1 = -1L;
        int f = 1;
        this.e = long1;
        this.g = long1;
        this.z = long1;
        this.P = new HashMap();
        this.q = cursor.getLong(f);
        this.l = this.q;
        this.w = cursor.getLong(21);
        this.n = cursor.getLong(19);
        this.b = cursor.getString(20);
        this.c = cursor.getString(22);
        this.k = cursor.getLong(5);
        this.m = cursor.getString(3);
        this.d = cursor.getString(4);
        this.a = cursor.getString(2);
        this.A = cursor.getString(24);
        this.u = (TweetEntities)com.twitter.util.f.a(cursor.getBlob(16));
        this.e = cursor.getLong(23);
        this.f = cursor.getString(7);
        this.g = cursor.getLong(8);
        this.h = cursor.getString(9);
        final int int1 = cursor.getInt(18);
        this.o = (int1 == f && f);
        this.p = (cursor.getInt(42) == f && f);
        final int columnIndex = cursor.getColumnIndex("rt_orig_ref_id");
        if (columnIndex != -1 && !cursor.isNull(columnIndex)) {
            long1 = cursor.getLong(columnIndex);
        }
        this.z = long1;
        this.v = (int1 == 4 && f);
        this.ag = (int1 == 7 && f);
        this.i = (cursor.getInt(11) == f && f);
        this.M = cursor.getInt(33);
        this.I = cursor.getInt(32);
        this.ah = cursor.getInt(35);
        this.K = cursor.getInt(30);
        this.L = cursor.getLong(31);
        this.N = cursor.getString(34);
        this.B = cursor.getInt(25);
        this.C = cursor.getInt(27);
        this.G = cursor.getInt(17);
        this.J = cursor.getInt(10);
        this.j = ((0x1 & this.J) != 0x0 && f);
        this.x = ((0x2 & this.J) != 0x0 && f);
        this.D = (PromotedContent)com.twitter.util.f.a(cursor.getBlob(26));
        this.r = (!cursor.isNull(12) && !cursor.isNull(13) && f);
        double double1;
        if (this.r) {
            double1 = cursor.getDouble(12);
        }
        else {
            double1 = 0.0;
        }
        this.s = double1;
        double double2;
        if (this.r) {
            double2 = cursor.getDouble(13);
        }
        else {
            double2 = 0.0;
        }
        this.t = double2;
        this.y = (TwitterPlace)com.twitter.util.f.a(cursor.getBlob(36));
        this.Q = (QuotedTweetData)com.twitter.util.f.a(cursor.getBlob(39));
        this.R = cursor.getLong(40);
        this.H = (TwitterStatusCard)com.twitter.util.f.a(cursor.getBlob(29));
        final long long2 = cursor.getLong(41);
        Long value;
        if (long2 > 0L) {
            value = long2;
        }
        else {
            value = null;
        }
        this.W = value;
        this.Y = (List)com.twitter.util.f.a(cursor.getBlob(43));
        this.O = cursor.getString(37);
        this.P = com.twitter.util.f.a(String.class, String.class, cursor.getBlob(38));
        this.E = cursor.getLong(0);
        if (cursor.getInt(28) != f) {
            f = 0;
        }
        this.F = (f != 0);
        final int columnIndex2 = cursor.getColumnIndex("soc_type");
        int int2;
        if (columnIndex2 != -1) {
            int2 = cursor.getInt(columnIndex2);
        }
        else {
            int2 = -1;
        }
        this.Z = int2;
        final int columnIndex3 = cursor.getColumnIndex("soc_name");
        String string;
        if (columnIndex3 != -1) {
            string = cursor.getString(columnIndex3);
        }
        else {
            string = null;
        }
        this.aa = string;
        final int columnIndex4 = cursor.getColumnIndex("soc_fav_count");
        int int3;
        if (columnIndex4 != -1) {
            int3 = cursor.getInt(columnIndex4);
        }
        else {
            int3 = 0;
        }
        this.ab = int3;
        final int columnIndex5 = cursor.getColumnIndex("soc_rt_count");
        int int4;
        if (columnIndex5 != -1) {
            int4 = cursor.getInt(columnIndex5);
        }
        else {
            int4 = 0;
        }
        this.ad = int4;
        final int columnIndex6 = cursor.getColumnIndex("soc_second_name");
        String string2;
        if (columnIndex6 != -1) {
            string2 = cursor.getString(columnIndex6);
        }
        else {
            string2 = null;
        }
        this.ae = string2;
        final int columnIndex7 = cursor.getColumnIndex("soc_others_count");
        int int5;
        if (columnIndex7 != -1) {
            int5 = cursor.getInt(columnIndex7);
        }
        else {
            int5 = 0;
        }
        this.ac = int5;
        final int columnIndex8 = cursor.getColumnIndex("highlights");
        Entity[] x;
        if (columnIndex8 != -1) {
            x = (Entity[])com.twitter.util.f.a(cursor.getBlob(columnIndex8));
        }
        else {
            x = null;
        }
        this.X = x;
        final int columnIndex9 = cursor.getColumnIndex("cl_title");
        String string3 = null;
        if (columnIndex9 != -1) {
            string3 = cursor.getString(columnIndex9);
        }
        this.V = string3;
        final int columnIndex10 = cursor.getColumnIndex("t_flags");
        int int6 = 0;
        if (columnIndex10 != -1) {
            int6 = cursor.getInt(columnIndex10);
        }
        this.af = int6;
        final int columnIndex11 = cursor.getColumnIndex("scribe_content");
        if (columnIndex11 != -1) {
            final TimelineScribeContent timelineScribeContent = (TimelineScribeContent)com.twitter.util.f.a(cursor.getBlob(columnIndex11));
            if (timelineScribeContent instanceof EntityScribeContent) {
                final EntityScribeContent entityScribeContent = (EntityScribeContent)timelineScribeContent;
                if (entityScribeContent.scribeComponent != null) {
                    this.O = entityScribeContent.scribeComponent;
                }
                if (entityScribeContent.scribeItemExtras != null) {
                    if (this.P == null) {
                        this.P = entityScribeContent.scribeItemExtras;
                        return;
                    }
                    this.P.putAll(entityScribeContent.scribeItemExtras);
                }
            }
        }
    }
    
    public Tweet a() {
        return new Tweet(this, null);
    }
    
    public ad a(final long e) {
        this.e = e;
        return this;
    }
    
    public ad a(final TweetEntities u) {
        this.u = u;
        return this;
    }
    
    public ad a(final TwitterSocialProof twitterSocialProof) {
        if (twitterSocialProof != null) {
            this.Z = twitterSocialProof.type;
            this.aa = twitterSocialProof.name;
            this.ab = twitterSocialProof.favoriteCount;
            this.ac = twitterSocialProof.othersCount;
            this.ad = twitterSocialProof.retweetCount;
            this.ae = twitterSocialProof.secondName;
        }
        return this;
    }
    
    public ad a(final TwitterStatusCard h) {
        this.H = h;
        return this;
    }
    
    public ad a(final String a) {
        this.a = a;
        return this;
    }
    
    public ad a(final boolean o) {
        this.o = o;
        return this;
    }
    
    public ad b(final long k) {
        this.k = k;
        return this;
    }
    
    public ad b(final String b) {
        this.b = b;
        return this;
    }
    
    public ad c(final long l) {
        this.l = l;
        return this;
    }
    
    public ad c(final String c) {
        this.c = c;
        return this;
    }
    
    public ad d(final long n) {
        this.n = n;
        return this;
    }
    
    public ad d(final String d) {
        this.d = d;
        return this;
    }
    
    public ad e(final long q) {
        this.q = q;
        return this;
    }
    
    public ad e(final String h) {
        this.h = h;
        return this;
    }
    
    public ad f(final long w) {
        this.w = w;
        return this;
    }
    
    public ad f(final String m) {
        this.m = m;
        return this;
    }
}
