// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import com.fasterxml.jackson.core.JsonGenerator;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.twitter.library.scribe.ScribeItem;

public class SegmentedMediaUploadDetails extends ScribeItem
{
    public static final Parcelable$Creator CREATOR;
    private final Integer a;
    private final Integer b;
    private final Integer c;
    private final Integer d;
    private final Integer e;
    
    static {
        CREATOR = (Parcelable$Creator)new g();
    }
    
    protected SegmentedMediaUploadDetails(final Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
    }
    
    @Override
    protected void a(final JsonGenerator jsonGenerator) {
        jsonGenerator.a("segment_size", this.a);
        jsonGenerator.a("uploaded_segment_count", this.b);
        jsonGenerator.a("initialize_retry_count", this.c);
        jsonGenerator.a("append_retry_count", this.d);
        jsonGenerator.a("finalize_retry_count", this.e);
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
            final SegmentedMediaUploadDetails segmentedMediaUploadDetails = (SegmentedMediaUploadDetails)o;
            if (!this.d.equals(segmentedMediaUploadDetails.d)) {
                return false;
            }
            if (!this.e.equals(segmentedMediaUploadDetails.e)) {
                return false;
            }
            if (!this.c.equals(segmentedMediaUploadDetails.c)) {
                return false;
            }
            if (!this.a.equals(segmentedMediaUploadDetails.a)) {
                return false;
            }
            if (!this.b.equals(segmentedMediaUploadDetails.b)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * this.a.hashCode() + this.b.hashCode()) + this.c.hashCode()) + this.d.hashCode()) + this.e.hashCode();
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt((int)this.a);
        parcel.writeInt((int)this.b);
        parcel.writeInt((int)this.c);
        parcel.writeInt((int)this.d);
        parcel.writeInt((int)this.e);
    }
}
