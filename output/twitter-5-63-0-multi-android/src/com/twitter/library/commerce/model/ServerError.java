// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.commerce.model;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import java.io.Serializable;
import android.os.Parcelable;

public class ServerError implements Parcelable, Serializable
{
    public static final Parcelable$Creator CREATOR;
    private final ServerErrorType mErrorType;
    private final String mMessage;
    private final String mRefId;
    
    static {
        CREATOR = (Parcelable$Creator)new e();
    }
    
    private ServerError(final Parcel parcel) {
        this.mMessage = parcel.readString();
        this.mRefId = parcel.readString();
        this.mErrorType = ServerErrorType.a(parcel.readInt());
    }
    
    public ServerError(final String mMessage, final String mRefId, final ServerErrorType mErrorType) {
        this.mMessage = mMessage;
        this.mRefId = mRefId;
        this.mErrorType = mErrorType;
    }
    
    public String a() {
        return this.mRefId;
    }
    
    public ServerErrorType b() {
        return this.mErrorType;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof ServerError)) {
                return false;
            }
            final ServerError serverError = (ServerError)o;
            Label_0051: {
                if (this.mMessage != null) {
                    if (this.mMessage.equals(serverError.mMessage)) {
                        break Label_0051;
                    }
                }
                else if (serverError.mMessage == null) {
                    break Label_0051;
                }
                return false;
            }
            Label_0081: {
                if (this.mRefId != null) {
                    if (this.mRefId.equals(serverError.mRefId)) {
                        break Label_0081;
                    }
                }
                else if (serverError.mRefId == null) {
                    break Label_0081;
                }
                return false;
            }
            if (this.mErrorType.a() != serverError.mErrorType.a()) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * this.mMessage.hashCode() + this.mRefId.hashCode()) + this.mErrorType.a();
    }
    
    @Override
    public String toString() {
        return "ServerError{mMessage='" + this.mMessage + '\'' + ", mRefId='" + this.mRefId + '\'' + ", mErrorcode=" + this.mErrorType + '}';
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.mMessage);
        parcel.writeString(this.mRefId);
        parcel.writeInt(this.mErrorType.a());
    }
}
