// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.util.List;
import java.io.Serializable;
import android.os.Parcel;
import java.util.ArrayList;
import android.util.SparseArray;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class TwitterTopic implements Parcelable, ab
{
    public static final Parcelable$Creator CREATOR;
    private static final SparseArray a;
    private final TwitterTopic$Metadata b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final TwitterUser k;
    private final PromotedContent l;
    private final ArrayList m;
    private final TwitterTopic$Data n;
    private final long o;
    private final long p;
    private final long q;
    private long r;
    private boolean s;
    
    static {
        CREATOR = (Parcelable$Creator)new bu();
        (a = new SparseArray(3)).put(2, (Object)TwitterTopic$SportsEvent.class);
        TwitterTopic.a.put(5, (Object)TwitterTopic$TwitterList.class);
        TwitterTopic.a.put(3, (Object)TwitterTopic$TrendsPlus.class);
    }
    
    public TwitterTopic(final Parcel parcel) {
        this.b = (TwitterTopic$Metadata)parcel.readSerializable();
        this.c = parcel.readString();
        this.e = parcel.readString();
        this.d = parcel.readString();
        this.f = parcel.readString();
        this.i = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.o = parcel.readLong();
        this.p = parcel.readLong();
        this.q = parcel.readLong();
        this.l = (PromotedContent)parcel.readSerializable();
        this.m = parcel.readArrayList(bp.class.getClassLoader());
        this.k = (TwitterUser)parcel.readSerializable();
        this.j = parcel.readString();
        this.n = (TwitterTopic$Data)parcel.readSerializable();
    }
    
    public TwitterTopic(final TwitterTopic$Metadata b, final String c, final String e, final String d, final String f, final String i, final String g, final String h, final long o, final long p16, final long q, final PromotedContent l, final ArrayList m, final TwitterTopic$Data n, final TwitterUser k, final String j) {
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
        this.f = f;
        this.i = i;
        this.g = g;
        this.h = h;
        this.o = o;
        this.p = p16;
        this.q = q;
        this.l = l;
        this.m = m;
        this.k = k;
        this.j = j;
        this.n = n;
    }
    
    public static String a(final String s) {
        return "CLIENT_" + s;
    }
    
    public static String b(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 1: {
                return "TRENDS";
            }
            case 2: {
                return "SPORTS";
            }
            case 3: {
                return "TRENDSPLUS";
            }
        }
    }
    
    public static boolean b(final String s) {
        return s != null && s.startsWith("CLIENT_");
    }
    
    public static String c(final int n) {
        return f(n);
    }
    
    public static String c(final String s) {
        if (s == null) {
            return null;
        }
        switch (s) {
            default: {
                return null;
            }
            case "planned_event_sports": {
                return "sports";
            }
            case "reflex_conversation": {
                return "tv";
            }
        }
    }
    
    public static int d(final String s) {
        if ("TRENDS".equals(s)) {
            return 1;
        }
        if ("SPORTS".equals(s)) {
            return 2;
        }
        if ("TRENDSPLUS".equals(s)) {
            return 3;
        }
        return -1;
    }
    
    public static String d(final int n) {
        return f(n);
    }
    
    public static String e(final int n) {
        return f(n);
    }
    
    private static String f(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 2: {
                return "sports_module";
            }
            case 1: {
                return "trend";
            }
            case 3: {
                return "trendsplus";
            }
        }
    }
    
    public long a() {
        return this.r;
    }
    
    public TwitterTopic$Data a(final int n) {
        return this.a((Class)TwitterTopic.a.get(n));
    }
    
    public TwitterTopic$Data a(final Class clazz) {
        if (clazz != null && this.n != null && clazz.isInstance(this.n)) {
            return clazz.cast(this.n);
        }
        return null;
    }
    
    public void a(final long r) {
        this.r = r;
    }
    
    public void a(final boolean s) {
        this.s = s;
    }
    
    public String b() {
        return this.b.id;
    }
    
    public boolean c() {
        return this.s;
    }
    
    public TwitterTopic$Metadata d() {
        return this.b;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public String e() {
        return this.c;
    }
    
    public String f() {
        return this.d;
    }
    
    public String g() {
        return this.e;
    }
    
    public String h() {
        return this.f;
    }
    
    public String i() {
        return this.g;
    }
    
    public String j() {
        return this.h;
    }
    
    public String k() {
        return this.i;
    }
    
    public String l() {
        return this.j;
    }
    
    public long m() {
        return this.o;
    }
    
    public long n() {
        return this.p;
    }
    
    public long o() {
        return this.q;
    }
    
    public TwitterUser p() {
        return this.k;
    }
    
    public PromotedContent q() {
        return this.l;
    }
    
    public ArrayList r() {
        return this.m;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeSerializable((Serializable)this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.e);
        parcel.writeString(this.d);
        parcel.writeString(this.f);
        parcel.writeString(this.i);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeLong(this.o);
        parcel.writeLong(this.p);
        parcel.writeLong(this.q);
        parcel.writeSerializable((Serializable)this.l);
        parcel.writeList((List)this.m);
        parcel.writeSerializable((Serializable)this.k);
        parcel.writeString(this.j);
        parcel.writeSerializable((Serializable)this.n);
    }
}
