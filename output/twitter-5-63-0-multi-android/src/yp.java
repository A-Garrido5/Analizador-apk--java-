import java.io.InputStream;
import com.twitter.util.d;
import java.io.File;
import android.net.Uri;
import android.content.Context;
import android.database.Cursor;
import java.io.IOException;
import android.content.res.AssetFileDescriptor;

// 
// Decompiled by Procyon v0.5.30
// 

public final class yp extends yh
{
    public static void a(final AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor == null) {
            return;
        }
        try {
            assetFileDescriptor.close();
        }
        catch (IOException ex) {}
    }
    
    public static void a(final Cursor cursor) {
        if (cursor == null) {
            return;
        }
        try {
            cursor.close();
        }
        catch (Exception ex) {}
    }
    
    public static boolean a(final Context context, final Uri uri, final File file) {
        d.c();
        InputStream openInputStream = null;
        try {
            openInputStream = context.getContentResolver().openInputStream(uri);
            return openInputStream != null && yh.a(openInputStream, file);
        }
        catch (IOException ex) {}
        catch (SecurityException ex2) {}
    }
}
