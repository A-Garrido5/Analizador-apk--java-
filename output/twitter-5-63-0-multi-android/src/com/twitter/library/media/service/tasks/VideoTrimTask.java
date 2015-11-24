// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.tasks;

import java.io.Serializable;
import com.twitter.media.MediaUtils;
import android.content.Context;
import android.os.Parcel;
import java.io.File;
import android.net.Uri;
import android.os.Parcelable$Creator;
import com.twitter.library.media.service.core.MediaServiceTask;

public class VideoTrimTask extends MediaServiceTask
{
    public static final Parcelable$Creator CREATOR;
    private Uri a;
    private File b;
    private long c;
    private long d;
    private int e;
    private int f;
    private Exception g;
    
    static {
        CREATOR = (Parcelable$Creator)new h();
    }
    
    public VideoTrimTask(final Uri a, final File b, final long c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private VideoTrimTask(final Parcel parcel) {
        this.a(parcel);
    }
    
    @Override
    public void a(final Parcel parcel) {
        super.a(parcel);
        this.a = Uri.parse(parcel.readString());
        this.b = new File(parcel.readString());
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (Exception)parcel.readSerializable();
    }
    
    @Override
    protected boolean b(final Context context) {
        try {
            final int[] a = MediaUtils.a(context, this.a, this.b, this.c, this.d);
            this.e = a[0];
            this.f = a[1];
            return true;
        }
        catch (Exception g) {
            this.g = g;
            return false;
        }
    }
    
    public int c() {
        return this.e;
    }
    
    public int d() {
        return this.f;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeString(this.a.toString());
        parcel.writeString(this.b.getAbsolutePath());
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeSerializable((Serializable)this.g);
    }
}
