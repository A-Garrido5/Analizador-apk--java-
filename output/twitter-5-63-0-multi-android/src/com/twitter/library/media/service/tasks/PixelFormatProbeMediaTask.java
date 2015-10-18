// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.service.tasks;

import java.io.Serializable;
import android.database.Cursor;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.media.util.ah;
import com.twitter.library.util.af;
import android.net.Uri;
import android.provider.MediaStore$Video$Media;
import android.content.Context;
import android.os.Parcel;
import java.io.File;
import android.os.Parcelable$Creator;
import com.twitter.library.media.service.core.MediaServiceTask;

public class PixelFormatProbeMediaTask extends MediaServiceTask
{
    public static final Parcelable$Creator CREATOR;
    private File a;
    private boolean b;
    private int c;
    private Exception d;
    
    static {
        CREATOR = (Parcelable$Creator)new b();
    }
    
    public PixelFormatProbeMediaTask() {
    }
    
    private PixelFormatProbeMediaTask(final Parcel parcel) {
        this.a(parcel);
    }
    
    @Override
    public void a(final Parcel parcel) {
        super.a(parcel);
        this.a = new File(parcel.readString());
        this.b = (parcel.readByte() != 0);
        this.c = parcel.readInt();
        this.d = (Exception)parcel.readSerializable();
    }
    
    @Override
    protected boolean b(final Context context) {
        final Cursor query = context.getContentResolver().query(MediaStore$Video$Media.EXTERNAL_CONTENT_URI, new String[] { "_id" }, "width >= 720 AND height >= 720 AND _size > 0", (String[])null, "datetaken");
        if (query != null) {
            if (query.moveToFirst()) {
                this.a = af.b(context, Uri.withAppendedPath(MediaStore$Video$Media.EXTERNAL_CONTENT_URI, Integer.toString(query.getInt(query.getColumnIndex("_id")))));
            }
            query.close();
        }
        if (this.a == null) {
            return false;
        }
        final ah ah = new ah(this.a);
        try {
            ah.b();
            this.c = ah.a();
            this.b = ah.e();
            this.d = ah.d();
            return this.d == null;
        }
        catch (Exception d) {
            ErrorReporter.a(this.d = d);
            return false;
        }
        finally {
            ah.c();
        }
    }
    
    public boolean c() {
        return this.b;
    }
    
    public int d() {
        return this.c;
    }
    
    public Exception e() {
        return this.d;
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeString(this.a.getAbsolutePath());
        boolean b;
        if (this.b) {
            b = true;
        }
        else {
            b = false;
        }
        parcel.writeByte((byte)(byte)(b ? 1 : 0));
        parcel.writeInt(this.c);
        parcel.writeSerializable((Serializable)this.d);
    }
}
