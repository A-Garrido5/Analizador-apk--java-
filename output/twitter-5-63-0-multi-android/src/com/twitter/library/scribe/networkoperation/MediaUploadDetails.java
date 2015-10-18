// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.os.Parcelable;
import com.fasterxml.jackson.core.JsonGenerator;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.twitter.library.scribe.ScribeItem;

public class MediaUploadDetails extends ScribeItem
{
    public static final Parcelable$Creator CREATOR;
    private final Long a;
    private final MediaUploadDetails$MediaType b;
    private final MediaUploadDetails$MediaSourceType c;
    private final SegmentedMediaUploadDetails d;
    
    static {
        CREATOR = (Parcelable$Creator)new e();
    }
    
    protected MediaUploadDetails(final Parcel parcel) {
        super(parcel);
        this.a = parcel.readLong();
        this.b = MediaUploadDetails$MediaType.a(parcel.readInt());
        this.c = MediaUploadDetails$MediaSourceType.a(parcel.readInt());
        if (parcel.readByte() != 0) {
            this.d = (SegmentedMediaUploadDetails)parcel.readParcelable(SegmentedMediaUploadDetails.class.getClassLoader());
            return;
        }
        this.d = null;
    }
    
    @Override
    protected void a(final JsonGenerator jsonGenerator) {
        jsonGenerator.a("file_size", this.a);
        jsonGenerator.a("type", this.b.a());
        jsonGenerator.a("source_type", this.c.a());
        if (this.d != null) {
            jsonGenerator.a("segmented_media_upload_details");
            this.d.b(jsonGenerator);
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final MediaUploadDetails mediaUploadDetails = (MediaUploadDetails)o;
            if (!this.a.equals(mediaUploadDetails.a)) {
                return false;
            }
            Label_0075: {
                if (this.d != null) {
                    if (this.d.equals(mediaUploadDetails.d)) {
                        break Label_0075;
                    }
                }
                else if (mediaUploadDetails.d == null) {
                    break Label_0075;
                }
                return false;
            }
            if (this.c != mediaUploadDetails.c) {
                return false;
            }
            if (this.b != mediaUploadDetails.b) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * (31 * (31 * this.a.hashCode() + this.b.hashCode()) + this.c.hashCode());
        int hashCode;
        if (this.d != null) {
            hashCode = this.d.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode + n;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeLong((long)this.a);
        parcel.writeInt(this.b.a());
        parcel.writeInt(this.c.a());
        wv.a(parcel, this.d);
        if (this.d != null) {
            parcel.writeParcelable((Parcelable)this.d, n);
        }
    }
}
