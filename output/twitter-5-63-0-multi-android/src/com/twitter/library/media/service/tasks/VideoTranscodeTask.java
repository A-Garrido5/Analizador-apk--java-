// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.tasks;

import android.os.Parcelable;
import android.content.Context;
import com.twitter.library.media.util.am;
import android.os.Parcel;
import com.twitter.internal.android.util.Size;
import java.io.File;
import android.os.Parcelable$Creator;
import com.twitter.library.media.service.core.MediaServiceTask;

public class VideoTranscodeTask extends MediaServiceTask
{
    public static final Parcelable$Creator CREATOR;
    private File a;
    private File b;
    private int c;
    private int[] d;
    private int e;
    private Size f;
    private int g;
    private Size h;
    
    static {
        CREATOR = (Parcelable$Creator)new g();
    }
    
    private VideoTranscodeTask(final Parcel parcel) {
        this.a(parcel);
    }
    
    public VideoTranscodeTask(final File a, final File b, final int c, final int[] d, final int e, final Size f) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (d != null && d.length == 2) {
            this.d = d;
        }
        else {
            this.d = am.a;
        }
        this.e = e;
        this.f = f;
    }
    
    @Override
    public void a(final Parcel parcel) {
        super.a(parcel);
        this.a = new File(parcel.readString());
        this.b = new File(parcel.readString());
        this.c = parcel.readInt();
        parcel.readIntArray(this.d = new int[2]);
        this.e = parcel.readInt();
        this.f = (Size)parcel.readParcelable(Size.class.getClassLoader());
        this.g = parcel.readInt();
        this.h = (Size)parcel.readParcelable(Size.class.getClassLoader());
    }
    
    @Override
    protected boolean b(final Context context) {
        int n = 1;
        final am a = new am(this.a, this.b, this.c).a(this.d[0], this.d[n]).a(this.e);
        if (this.f != null) {
            a.a(this.f);
        }
        try {
            a.c();
            this.g = a.a();
            this.h = a.b();
            if (this.h == null) {
                n = 0;
            }
            return n != 0;
        }
        catch (Exception ex) {
            if (this.b.exists()) {
                this.b.delete();
            }
            return false;
        }
        finally {
            a.d();
        }
    }
    
    public int c() {
        return this.g;
    }
    
    public Size d() {
        return this.h;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeString(this.a.getAbsolutePath());
        parcel.writeString(this.b.getAbsolutePath());
        parcel.writeInt(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeParcelable((Parcelable)this.f, n);
        parcel.writeInt(this.g);
        parcel.writeParcelable((Parcelable)this.h, n);
    }
}
