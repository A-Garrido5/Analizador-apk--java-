// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.card.property;

import java.io.Serializable;
import java.io.ObjectOutput;
import java.io.ObjectInput;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import java.io.Externalizable;
import android.os.Parcelable;

public class ImageSpec implements Parcelable, Externalizable
{
    public static final Parcelable$Creator CREATOR;
    private static final long serialVersionUID = -5457162422758691080L;
    public Vector2F size;
    public String url;
    
    static {
        CREATOR = (Parcelable$Creator)new c();
    }
    
    public ImageSpec() {
    }
    
    public ImageSpec(final float n, final float n2) {
        this.size = new Vector2F(n, n2);
    }
    
    public ImageSpec(final Parcel parcel) {
        this.url = parcel.readString();
        this.size = (Vector2F)parcel.readSerializable();
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof ImageSpec)) {
                return false;
            }
            final ImageSpec imageSpec = (ImageSpec)o;
            Label_0051: {
                if (this.size != null) {
                    if (this.size.equals(imageSpec.size)) {
                        break Label_0051;
                    }
                }
                else if (imageSpec.size == null) {
                    break Label_0051;
                }
                return false;
            }
            if (this.url != null) {
                if (this.url.equals(imageSpec.url)) {
                    return true;
                }
            }
            else if (imageSpec.url == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.url != null) {
            hashCode = this.url.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * 31;
        final Vector2F size = this.size;
        int hashCode2 = 0;
        if (size != null) {
            hashCode2 = this.size.hashCode();
        }
        return n + hashCode2;
    }
    
    public void readExternal(final ObjectInput objectInput) {
        this.url = (String)objectInput.readObject();
        this.size = (Vector2F)objectInput.readObject();
    }
    
    public void writeExternal(final ObjectOutput objectOutput) {
        objectOutput.writeObject(this.url);
        objectOutput.writeObject(this.size);
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.url);
        parcel.writeSerializable((Serializable)this.size);
    }
}
