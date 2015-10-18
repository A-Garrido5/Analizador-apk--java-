// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.tasks;

import java.io.Serializable;
import com.twitter.media.MediaUtils;
import android.content.Context;
import android.os.Parcel;
import java.io.File;
import android.os.Parcelable$Creator;
import com.twitter.library.media.service.core.MediaServiceTask;

public class VideoCheckTask extends MediaServiceTask
{
    public static final Parcelable$Creator CREATOR;
    private File a;
    private Exception b;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    private VideoCheckTask(final Parcel parcel) {
        this.a(parcel);
    }
    
    public VideoCheckTask(final File a) {
        this.a = a;
    }
    
    @Override
    public void a(final Parcel parcel) {
        super.a(parcel);
        this.a = new File(parcel.readString());
        this.b = (Exception)parcel.readSerializable();
    }
    
    @Override
    protected boolean b(final Context context) {
        try {
            return MediaUtils.b(this.a);
        }
        catch (Exception b) {
            this.b = b;
            return false;
        }
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeString(this.a.getAbsolutePath());
        parcel.writeSerializable((Serializable)this.b);
    }
}
