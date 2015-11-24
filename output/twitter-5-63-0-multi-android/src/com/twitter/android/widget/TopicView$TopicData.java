// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import com.twitter.library.featureswitch.d;
import com.twitter.android.events.b;
import java.io.Serializable;
import com.twitter.util.f;
import com.twitter.library.api.TwitterTopic;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class TopicView$TopicData implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public long l;
    public byte[] m;
    private String n;
    
    static {
        CREATOR = (Parcelable$Creator)new fh();
    }
    
    public TopicView$TopicData(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.k = parcel.readInt();
        this.l = parcel.readLong();
        this.j = parcel.readString();
        final int int1 = parcel.readInt();
        if (int1 > 0) {
            parcel.readByteArray(this.m = new byte[int1]);
        }
    }
    
    public TopicView$TopicData(final TwitterTopic twitterTopic) {
        this(twitterTopic.b(), twitterTopic.d().type, twitterTopic.e(), twitterTopic.g(), twitterTopic.i(), twitterTopic.j(), twitterTopic.f(), twitterTopic.k(), twitterTopic.h(), (int)twitterTopic.m(), twitterTopic.n(), com.twitter.util.f.a(twitterTopic.a(twitterTopic.d().type)), twitterTopic.l());
    }
    
    public TopicView$TopicData(final String a, final int b, final String c, final String d, final String e, final String f, final String g, final String h, final String i, final int k, final long l, final byte[] m, final String j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.k = k;
        this.l = l;
        this.m = m;
        this.j = j;
    }
    
    public String a() {
        if (this.n == null) {
            if (this.b == 2) {
                this.n = com.twitter.android.events.b.a(this.a, this.b);
            }
            else if (this.a.equals(com.twitter.library.featureswitch.d.g("worldcup_event_id"))) {
                this.n = "WC";
            }
            else {
                this.n = TwitterTopic.b(this.b);
            }
        }
        return this.n;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.k);
        parcel.writeLong(this.l);
        parcel.writeString(this.j);
        if (this.m != null) {
            parcel.writeInt(this.m.length);
            parcel.writeByteArray(this.m);
            return;
        }
        parcel.writeInt(-1);
    }
}
