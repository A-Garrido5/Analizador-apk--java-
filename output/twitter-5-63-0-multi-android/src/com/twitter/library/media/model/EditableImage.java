// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import com.twitter.util.collection.CollectionUtils;
import android.os.Parcelable;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.manager.k;
import com.twitter.util.l;
import android.content.Context;
import com.twitter.library.media.util.m;
import android.os.Parcel;
import java.util.List;
import android.graphics.RectF;
import android.os.Parcelable$Creator;

public class EditableImage extends EditableMedia
{
    public static final Parcelable$Creator CREATOR;
    public RectF cropRect;
    public boolean enhanced;
    public int filterId;
    public float intensity;
    public int rotation;
    public List tags;
    
    static {
        CREATOR = (Parcelable$Creator)new c();
    }
    
    EditableImage(final Parcel parcel) {
        super(parcel);
        this.enhanced = (parcel.readByte() != 0);
        this.filterId = parcel.readInt();
        this.intensity = parcel.readFloat();
        this.cropRect = (RectF)parcel.readParcelable(RectF.class.getClassLoader());
        this.rotation = parcel.readInt();
        this.tags = (List)parcel.readSerializable();
    }
    
    public EditableImage(final ImageFile imageFile, final String s) {
        super(imageFile, s);
    }
    
    private Object writeReplace() {
        return new EditableImage$SerializationProxy(this);
    }
    
    @Override
    public float a() {
        float n;
        if (!m.a(this.cropRect)) {
            n = this.cropRect.width() / this.cropRect.height();
        }
        else {
            n = 1.0f;
        }
        return n * ((ImageFile)this.mediaFile).size.e();
    }
    
    public ImageFile a(final Context context) {
        return m.a(context, this);
    }
    
    public boolean a(final EditableImage editableImage) {
        return this == editableImage || (editableImage != null && this.b(editableImage) && editableImage.enhanced == this.enhanced && editableImage.filterId == this.filterId && editableImage.intensity == this.intensity && l.a(editableImage.cropRect, this.cropRect) && editableImage.rotation == this.rotation && l.a(editableImage.tags, this.tags));
    }
    
    @Override
    public k b(final Context context) {
        final k a = j.a(this.mediaFile).a(this.cropRect).a(this.rotation);
        if (this.filterId != 0 || this.enhanced) {
            a.a(new com.twitter.library.media.decoder.c(context, this.filterId, this.enhanced, this.intensity));
        }
        return a;
    }
    
    public List b() {
        return com.twitter.util.k.a(this.tags);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof EditableImage && this.a((EditableImage)o));
    }
    
    @Override
    public int hashCode() {
        final int n = 31 * super.hashCode();
        int n2;
        if (this.enhanced) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final int n3 = 31 * (31 * (n2 + n) + this.filterId);
        int floatToIntBits;
        if (this.intensity != 0.0f) {
            floatToIntBits = Float.floatToIntBits(this.intensity);
        }
        else {
            floatToIntBits = 0;
        }
        final int n4 = 31 * (floatToIntBits + n3);
        int hashCode;
        if (this.cropRect != null) {
            hashCode = this.cropRect.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n5 = 31 * (31 * (hashCode + n4) + this.rotation);
        final List tags = this.tags;
        int hashCode2 = 0;
        if (tags != null) {
            hashCode2 = this.tags.hashCode();
        }
        return n5 + hashCode2;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        byte b;
        if (this.enhanced) {
            b = 1;
        }
        else {
            b = 0;
        }
        parcel.writeByte(b);
        parcel.writeInt(this.filterId);
        parcel.writeFloat(this.intensity);
        parcel.writeParcelable((Parcelable)this.cropRect, n);
        parcel.writeInt(this.rotation);
        parcel.writeSerializable(CollectionUtils.b(this.tags));
    }
}
