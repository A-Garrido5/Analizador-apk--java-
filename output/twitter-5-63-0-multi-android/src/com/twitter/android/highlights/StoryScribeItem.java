// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.os.Parcelable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.twitter.android.client.notifications.ad;
import com.twitter.library.provider.Tweet;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.twitter.library.scribe.ScribeItem;

public class StoryScribeItem extends ScribeItem
{
    public static final Parcelable$Creator CREATOR;
    public RichNotificationScribeDetails a;
    public RichNotificationStoryScribeDetails b;
    public String c;
    public String d;
    public long e;
    
    static {
        CREATOR = (Parcelable$Creator)new ab();
    }
    
    public StoryScribeItem() {
        this.e = -1L;
    }
    
    protected StoryScribeItem(final Parcel parcel) {
        super(parcel);
        this.e = -1L;
        this.a = (RichNotificationScribeDetails)parcel.readParcelable(RichNotificationScribeDetails.class.getClassLoader());
        this.b = (RichNotificationStoryScribeDetails)parcel.readParcelable(RichNotificationStoryScribeDetails.class.getClassLoader());
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readLong();
    }
    
    public static StoryScribeItem a(final af af) {
        if (af instanceof aw) {
            return a(af, ((aw)af).b);
        }
        if (af instanceof c) {
            final StoryScribeItem b = b(af);
            b.e = ((c)af).a.a();
            return b;
        }
        return b(af);
    }
    
    public static StoryScribeItem a(final af af, final Tweet tweet) {
        final StoryScribeItem b = b(af);
        b.e = tweet.Q;
        return b;
    }
    
    public static StoryScribeItem a(final String c) {
        final StoryScribeItem storyScribeItem = new StoryScribeItem();
        storyScribeItem.c = c;
        return storyScribeItem;
    }
    
    private static StoryScribeItem b(final af af) {
        final StoryScribeItem storyScribeItem = new StoryScribeItem();
        storyScribeItem.c = af.e;
        storyScribeItem.b = new RichNotificationStoryScribeDetails();
        storyScribeItem.b.a = af.h;
        storyScribeItem.b.b = af.j;
        storyScribeItem.b.c = af.b();
        storyScribeItem.d = af.i;
        return storyScribeItem;
    }
    
    public StoryScribeItem a(final int a, final int b) {
        this.a = new RichNotificationScribeDetails();
        this.a.a = a;
        this.a.b = b;
        return this;
    }
    
    public StoryScribeItem a(final ad ad, final boolean b, final int b2) {
        this.a(b);
        this.c = ad.a;
        this.b.a = ad.b;
        this.b.b = b2;
        this.d = ad.c;
        return this;
    }
    
    public StoryScribeItem a(final boolean b) {
        if (this.b == null) {
            this.b = new RichNotificationStoryScribeDetails();
        }
        final RichNotificationStoryScribeDetails b2 = this.b;
        String c;
        if (b) {
            c = "expanded";
        }
        else {
            c = "collapsed";
        }
        b2.c = c;
        return this;
    }
    
    @Override
    protected void a(final JsonGenerator jsonGenerator) {
        if (this.a != null) {
            jsonGenerator.a("notification_details");
            this.a.a(jsonGenerator);
        }
        if (this.b != null) {
            jsonGenerator.a("notification_story_details");
            this.b.a(jsonGenerator);
        }
        if (this.c != null) {
            jsonGenerator.a("description", this.c);
        }
        if (this.d != null) {
            jsonGenerator.a("token", this.d);
        }
        if (this.e != -1L) {
            jsonGenerator.a("id", this.e);
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeParcelable((Parcelable)this.a, n);
        parcel.writeParcelable((Parcelable)this.b, n);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
    }
}
