// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import com.fasterxml.jackson.core.JsonGenerator;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class RichNotificationScribeDetails implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public int b;
    
    static {
        CREATOR = (Parcelable$Creator)new o();
    }
    
    public RichNotificationScribeDetails() {
        this.a = -1;
        this.b = -1;
    }
    
    public RichNotificationScribeDetails(final Parcel parcel) {
        this.a = -1;
        this.b = -1;
        this.a = parcel.readInt();
        this.b = parcel.readInt();
    }
    
    public void a(final JsonGenerator jsonGenerator) {
        jsonGenerator.c();
        if (this.a != -1) {
            jsonGenerator.a("notification_frequency", this.a);
        }
        if (this.b != -1) {
            jsonGenerator.a("notification_story_count", this.b);
        }
        jsonGenerator.d();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
