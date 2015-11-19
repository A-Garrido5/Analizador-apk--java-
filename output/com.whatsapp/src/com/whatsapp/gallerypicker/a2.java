// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.graphics.Rect;
import android.graphics.BitmapFactory;
import java.io.FileDescriptor;
import android.provider.MediaStore$Images$Thumbnails;
import android.provider.MediaStore$Video$Thumbnails;
import android.os.Build$VERSION;
import android.graphics.Bitmap;
import android.content.ContentResolver;
import android.graphics.BitmapFactory$Options;
import java.util.WeakHashMap;

public class a2
{
    private static a2 b;
    private final WeakHashMap a;
    
    static {
        a2.b = null;
    }
    
    private a2() {
        this.a = new WeakHashMap();
    }
    
    public static a2 a() {
        synchronized (a2.class) {
            if (a2.b == null) {
                a2.b = new a2();
            }
            return a2.b;
        }
    }
    
    private void a(final Thread thread, final BitmapFactory$Options a) {
        synchronized (this) {
            this.b(thread).a = a;
        }
    }
    
    private o b(final Thread thread) {
        synchronized (this) {
            o o = this.a.get(thread);
            if (o == null) {
                o = new o(null);
                this.a.put(thread, o);
            }
            return o;
        }
    }
    
    public Bitmap a(final ContentResolver contentResolver, final long n, final int n2, final BitmapFactory$Options bitmapFactory$Options, final boolean b) {
        final Thread currentThread = Thread.currentThread();
        final o b2 = this.b(currentThread);
        if (!this.a(currentThread)) {
            return null;
        }
        Label_0123: {
            try {
                synchronized (b2) {
                    b2.c = true;
                    // monitorexit(b2)
                    if (!b) {
                        break Label_0123;
                    }
                    if (Build$VERSION.SDK_INT < 8) {
                        break Label_0123;
                    }
                    final Bitmap thumbnail = MediaStore$Video$Thumbnails.getThumbnail(contentResolver, n, currentThread.getId(), n2, bitmapFactory$Options);
                    synchronized (b2) {
                        b2.c = false;
                        b2.notifyAll();
                        return thumbnail;
                    }
                }
            }
            finally {
                EndFinally_6: {
                    synchronized (b2) {
                        b2.c = false;
                        b2.notifyAll();
                        // monitorexit(b2)
                        break EndFinally_6;
                        while (true) {
                            final Bitmap thumbnail2 = MediaStore$Images$Thumbnails.getThumbnail(contentResolver, n, n2, bitmapFactory$Options);
                            synchronized (b2) {
                                b2.c = false;
                                b2.notifyAll();
                                return thumbnail2;
                            }
                            final Bitmap thumbnail3 = MediaStore$Images$Thumbnails.getThumbnail(contentResolver, n, currentThread.getId(), n2, bitmapFactory$Options);
                            synchronized (b2) {
                                b2.c = false;
                                b2.notifyAll();
                                return thumbnail3;
                            }
                            continue;
                        }
                        final Bitmap thumbnail4 = MediaStore$Video$Thumbnails.getThumbnail(contentResolver, n, n2, bitmapFactory$Options);
                        synchronized (b2) {
                            b2.c = false;
                            b2.notifyAll();
                            return thumbnail4;
                        }
                    }
                    // iftrue(Label_0214:, Build$VERSION.SDK_INT < 8)
                }
            }
        }
    }
    
    public Bitmap a(final FileDescriptor fileDescriptor, final BitmapFactory$Options bitmapFactory$Options) {
        if (!bitmapFactory$Options.mCancel) {
            final Thread currentThread = Thread.currentThread();
            if (this.a(currentThread)) {
                this.a(currentThread, bitmapFactory$Options);
                final Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, (Rect)null, bitmapFactory$Options);
                this.d(currentThread);
                return decodeFileDescriptor;
            }
        }
        return null;
    }
    
    public void a(final Thread thread, final ContentResolver contentResolver) {
        synchronized (this) {
            final o b = this.b(thread);
            b.b = an.CANCEL;
            if (b.a != null) {
                b.a.requestCancelDecode();
            }
            this.notifyAll();
            synchronized (b) {
                if (b.c && Build$VERSION.SDK_INT >= 8) {
                    MediaStore$Images$Thumbnails.cancelThumbnailRequest(contentResolver, -1L, thread.getId());
                    MediaStore$Video$Thumbnails.cancelThumbnailRequest(contentResolver, -1L, thread.getId());
                }
            }
        }
    }
    
    public boolean a(final Thread thread) {
        boolean b = true;
        synchronized (this) {
            final o o = this.a.get(thread);
            if (o != null) {
                b = (o.b != an.CANCEL && b);
            }
            return b;
        }
    }
    
    public void c(final Thread thread) {
        synchronized (this) {
            this.b(thread).b = an.ALLOW;
        }
    }
    
    void d(final Thread thread) {
        synchronized (this) {
            this.a.get(thread).a = null;
        }
    }
}
