// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.tasks;

import java.io.Serializable;
import android.os.Parcelable;
import com.twitter.media.MediaUtils;
import android.content.Context;
import android.os.Parcel;
import com.twitter.internal.android.util.Size;
import java.io.File;
import android.os.Parcelable$Creator;
import com.twitter.library.media.service.core.MediaServiceTask;

public class VideoMuxTask extends MediaServiceTask
{
    public static final Parcelable$Creator CREATOR;
    private File a;
    private File b;
    private File c;
    private int d;
    private Size e;
    private Exception f;
    
    static {
        CREATOR = (Parcelable$Creator)new e();
    }
    
    private VideoMuxTask(final Parcel parcel) {
        this.a(parcel);
    }
    
    public VideoMuxTask(final File a, final File b, final File c, final int d, final Size e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public void a(final Parcel parcel) {
        super.a(parcel);
        this.a = new File(parcel.readString());
        this.b = new File(parcel.readString());
        this.c = new File(parcel.readString());
        this.d = parcel.readInt();
        this.e = (Size)parcel.readParcelable(Size.class.getClassLoader());
        this.f = (Exception)parcel.readSerializable();
    }
    
    @Override
    protected boolean b(final Context context) {
        try {
            MediaUtils.a(this.a, this.b, this.c, this.d, this.e.a(), this.e.b());
            return true;
        }
        catch (Exception f) {
            this.f = f;
            return false;
        }
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeString(this.a.getAbsolutePath());
        parcel.writeString(this.b.getAbsolutePath());
        parcel.writeString(this.c.toString());
        parcel.writeInt(this.d);
        parcel.writeParcelable((Parcelable)this.e, n);
        parcel.writeSerializable((Serializable)this.f);
    }
}
