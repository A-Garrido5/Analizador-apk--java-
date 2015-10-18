// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.io.Serializable;
import android.text.TextUtils;
import android.os.Parcel;
import com.twitter.library.provider.bb;
import com.twitter.library.provider.cn;
import android.database.Cursor;
import com.twitter.library.view.TweetActionType;
import android.text.format.Time;
import java.util.HashMap;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class Prompt implements Parcelable, ab
{
    public static final Parcelable$Creator CREATOR;
    private static final HashMap t;
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final String j;
    public final TweetEntities k;
    public final TweetEntities l;
    public final String m;
    public long n;
    public int o;
    public boolean p;
    public final String q;
    public final boolean r;
    public final String s;
    private Time u;
    private boolean v;
    
    static {
        CREATOR = (Parcelable$Creator)new am();
        (t = new HashMap()).put("reply_action", TweetActionType.d);
        Prompt.t.put("favorite_action", TweetActionType.b);
        Prompt.t.put("retweet_action", TweetActionType.c);
        Prompt.t.put("follow_action", TweetActionType.e);
        Prompt.t.put("long_press_action", TweetActionType.p);
    }
    
    public Prompt(final Cursor cursor) {
        this(cursor.getString(48), cursor.getString(47), cursor.getString(49), cursor.getString(50), cursor.getString(58), cursor.getString(51), cursor.getString(45), cursor.getString(52), cursor.getInt(53), cursor.getInt(44), TweetEntities.a(cursor.getBlob(54)), TweetEntities.a(cursor.getBlob(55)), cursor.getString(46), cursor.getLong(56), cursor.getInt(57), null, cursor.getColumnIndex("t_flags") != -1 && bb.u(cursor.getInt(cn.h)), null);
    }
    
    public Prompt(final Parcel parcel) {
        boolean r = true;
        this.u = new Time();
        this.a = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.c = parcel.readString();
        this.j = parcel.readString();
        this.i = parcel.readInt();
        this.b = parcel.readInt();
        this.k = (TweetEntities)parcel.readSerializable();
        this.l = (TweetEntities)parcel.readSerializable();
        this.m = parcel.readString();
        this.n = parcel.readLong();
        this.o = parcel.readInt();
        this.q = parcel.readString();
        this.u.set(parcel.readLong());
        this.p = (parcel.readInt() == (r ? 1 : 0) && r);
        if (parcel.readInt() != (r ? 1 : 0)) {
            r = false;
        }
        this.r = r;
        this.s = parcel.readString();
    }
    
    public Prompt(final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final int n, final int n2) {
        this(s, s2, s3, s4, null, s5, s6, s7, n, n2, null, null, null, 0L, 0, null, false, null);
    }
    
    public Prompt(final String a, final String d, final String e, final String f, final String g, final String h, final String c, final String j, final int i, final int b, final TweetEntities k, final TweetEntities l, final String m, final long n, final int o, final String q, final boolean r, final String s) {
        this.u = new Time();
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.c = c;
        this.j = j;
        this.i = i;
        this.b = b;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.q = q;
        this.r = r;
        this.s = s;
        this.d();
    }
    
    public long a() {
        return this.b;
    }
    
    public void a(final boolean v) {
        this.v = v;
    }
    
    public String b() {
        return String.valueOf(this.b);
    }
    
    public boolean c() {
        final Time time = new Time();
        time.setToNow();
        return time.after(this.u);
    }
    
    public void d() {
        this.u.setToNow();
        final Time u = this.u;
        u.second += this.i;
        this.u.normalize(false);
    }
    
    public int describeContents() {
        return 0;
    }
    
    public boolean e() {
        return "fullscreen_takeover".equals(this.m);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final Prompt prompt = (Prompt)o;
            if (this.b != prompt.b) {
                return false;
            }
            if (!TextUtils.equals((CharSequence)this.d, (CharSequence)prompt.d)) {
                return false;
            }
            if (!TextUtils.equals((CharSequence)this.f, (CharSequence)prompt.f)) {
                return false;
            }
            if (!TextUtils.equals((CharSequence)this.e, (CharSequence)prompt.e)) {
                return false;
            }
            if (!TextUtils.equals((CharSequence)this.g, (CharSequence)prompt.g)) {
                return false;
            }
            if (!TextUtils.equals((CharSequence)this.j, (CharSequence)prompt.j)) {
                return false;
            }
            if (this.r != prompt.r) {
                return false;
            }
            if (!TextUtils.equals((CharSequence)this.s, (CharSequence)prompt.s)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean f() {
        return "inline_tooltip_prompt".equals(this.m);
    }
    
    public boolean g() {
        return this.r;
    }
    
    public boolean h() {
        return "inline_prompt".equals(this.m);
    }
    
    @Override
    public int hashCode() {
        return this.b;
    }
    
    public TweetActionType i() {
        if (Prompt.t.containsKey(this.q)) {
            return Prompt.t.get(this.q);
        }
        return TweetActionType.a;
    }
    
    public void j() {
        this.p = true;
    }
    
    public boolean k() {
        return this.v;
    }
    
    @Override
    public String toString() {
        return "text=" + this.a + ", header=" + this.d + ", actionText=" + this.e + ", actionUrl=" + this.f + ", trigger=" + this.g + ", icon=" + this.h + ", format=" + this.c + ", backgroundImageUrl=" + this.j + ", persistence=" + this.i + ", entities=" + this.k + ", headerEntities=" + this.l + ", id=" + this.b + ", template=" + this.m + ", statusId=" + this.n + ", insertionIndex=" + this.o + ", tooltipTarget=" + this.q + ", mDeadline=" + this.u + ", isAppGraphPrompt=" + this.r + ", selectionAlgo=" + this.s;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        int n2 = 1;
        parcel.writeString(this.a);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.c);
        parcel.writeString(this.j);
        parcel.writeInt(this.i);
        parcel.writeInt(this.b);
        parcel.writeSerializable((Serializable)this.k);
        parcel.writeSerializable((Serializable)this.l);
        parcel.writeString(this.m);
        parcel.writeLong(this.n);
        parcel.writeInt(this.o);
        parcel.writeString(this.q);
        parcel.writeLong(this.u.toMillis(false));
        int n3;
        if (this.p) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        parcel.writeInt(n3);
        if (!this.r) {
            n2 = 0;
        }
        parcel.writeInt(n2);
        parcel.writeString(this.s);
    }
}
