// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class RichNotificationStoryScribeDetails implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public String a;
    public int b;
    public String c;
    
    static {
        CREATOR = (Parcelable$Creator)new p();
    }
    
    public RichNotificationStoryScribeDetails() {
        this.b = -1;
    }
    
    public RichNotificationStoryScribeDetails(final Parcel parcel) {
        this.b = -1;
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readString();
    }
    
    public void a(final JsonGenerator jsonGenerator) {
        jsonGenerator.c();
        if (!TextUtils.isEmpty((CharSequence)this.a)) {
            jsonGenerator.a("notification_story_type", this.a);
        }
        if (this.b != -1) {
            jsonGenerator.a("notification_story_position", this.b);
        }
        if (!TextUtils.isEmpty((CharSequence)this.c)) {
            jsonGenerator.a("notification_story_display_mode", this.c);
        }
        jsonGenerator.d();
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }
}
