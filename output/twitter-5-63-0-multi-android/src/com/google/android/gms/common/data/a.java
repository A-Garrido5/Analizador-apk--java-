// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.data;

import java.io.OutputStream;
import java.io.DataOutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import android.os.Parcel;
import android.util.Log;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class a implements SafeParcelable
{
    public static final Parcelable$Creator CREATOR;
    final int a;
    ParcelFileDescriptor b;
    final int c;
    private Bitmap d;
    private boolean e;
    private File f;
    
    static {
        CREATOR = (Parcelable$Creator)new d();
    }
    
    a(final int a, final ParcelFileDescriptor b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = null;
        this.e = false;
    }
    
    private FileOutputStream a() {
        if (this.f == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        File file;
        try {
            final File tempFile;
            file = (tempFile = File.createTempFile("teleporter", ".tmp", this.f));
            final FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
            final a a = this;
            final File file2 = file;
            final int n = 268435456;
            final ParcelFileDescriptor parcelFileDescriptor = ParcelFileDescriptor.open(file2, n);
            a.b = parcelFileDescriptor;
            final File file3 = file;
            file3.delete();
            return fileOutputStream;
        }
        catch (IOException ex) {
            throw new IllegalStateException("Could not create temporary file", ex);
        }
        try {
            final File tempFile = file;
            final FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
            final a a = this;
            final File file2 = file;
            final int n = 268435456;
            final ParcelFileDescriptor parcelFileDescriptor = ParcelFileDescriptor.open(file2, n);
            a.b = parcelFileDescriptor;
            final File file3 = file;
            file3.delete();
            return fileOutputStream;
        }
        catch (FileNotFoundException ex2) {
            throw new IllegalStateException("Temporary file is somehow already deleted");
        }
    }
    
    private void a(final Closeable closeable) {
        try {
            closeable.close();
        }
        catch (IOException ex) {
            Log.w("BitmapTeleporter", "Could not close stream", (Throwable)ex);
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        Label_0103: {
            if (this.b != null) {
                break Label_0103;
            }
            final Bitmap d = this.d;
            final ByteBuffer allocate = ByteBuffer.allocate(d.getRowBytes() * d.getHeight());
            d.copyPixelsToBuffer((Buffer)allocate);
            final byte[] array = allocate.array();
            final DataOutputStream dataOutputStream = new DataOutputStream(this.a());
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(d.getWidth());
                dataOutputStream.writeInt(d.getHeight());
                dataOutputStream.writeUTF(d.getConfig().toString());
                dataOutputStream.write(array);
                this.a(dataOutputStream);
                com.google.android.gms.common.data.d.a(this, parcel, n);
            }
            catch (IOException ex) {
                throw new IllegalStateException("Could not write into unlinked file", ex);
            }
            finally {
                this.a(dataOutputStream);
            }
        }
    }
}
