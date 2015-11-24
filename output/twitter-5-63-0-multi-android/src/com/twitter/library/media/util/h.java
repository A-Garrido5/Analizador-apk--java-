// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import java.util.Date;
import android.media.ExifInterface;
import java.io.File;
import java.util.TimeZone;
import com.twitter.util.SynchronizedDateFormat;
import java.text.SimpleDateFormat;

public class h
{
    private static final SimpleDateFormat a;
    
    static {
        (a = new SynchronizedDateFormat("yyyy:MM:dd HH:mm:ss")).setTimeZone(TimeZone.getTimeZone("UTC"));
    }
    
    public static ImageOrientation a(final File file) {
        if (file == null) {
            return ImageOrientation.a;
        }
        try {
            return ImageOrientation.b(new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 0));
        }
        catch (Throwable t) {
            return ImageOrientation.a;
        }
    }
    
    public static k a(final File file, final boolean b) {
        try {
            return new k(file.getAbsolutePath(), b);
        }
        catch (Throwable t) {
            return null;
        }
    }
    
    public static boolean a(final File file, final int n) {
        return n % 360 == 0 || (n % 90 == 0 && a(file, a(file).c(n)));
    }
    
    public static boolean a(final File file, final ImageOrientation imageOrientation) {
        return a(file, imageOrientation, false);
    }
    
    public static boolean a(final File file, final ImageOrientation imageOrientation, final boolean b) {
        try {
            final k a = a(file, true);
            if (a != null) {
                a.a(imageOrientation);
                if (b) {
                    a.setAttribute("DateTime", h.a.format(new Date(file.lastModified())));
                }
                a.saveAttributes();
                return true;
            }
        }
        catch (Throwable t) {}
        return false;
    }
    
    public static boolean a(final File file, final File file2, final ImageOrientation imageOrientation) {
        try {
            final k a = a(file, true);
            if (a != null) {
                final k a2 = a(file2, false);
                if (a2 != null) {
                    a2.a(a);
                    if (imageOrientation != ImageOrientation.a) {
                        a2.a(imageOrientation);
                    }
                    a2.saveAttributes();
                    return true;
                }
            }
        }
        catch (Throwable t) {}
        return false;
    }
}
