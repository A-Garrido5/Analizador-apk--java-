// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

import android.os.Bundle;
import android.content.Intent;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.util.Log;
import java.io.File;

public class ContextCompat
{
    public static boolean a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "64\u0017g/\u0006z\u0002jc\u0000(\u0013d7\u0006z\u0010l/\u0006)Vv6\u0001>\u001fwc";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'C';
                        break;
                    }
                    case 0: {
                        c2 = 'c';
                        break;
                    }
                    case 1: {
                        c2 = 'Z';
                        break;
                    }
                    case 2: {
                        c2 = 'v';
                        break;
                    }
                    case 3: {
                        c2 = '\u0005';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = " 5\u0018q&\u001b.5j.\u0013;\u0002";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\r5)g\"\u00001\u0003u";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private static File createFilesDir(File file) {
        synchronized (ContextCompat.class) {
            if (!file.exists() && !file.mkdirs() && !file.exists()) {
                Log.w(ContextCompat.z[1], ContextCompat.z[0] + file.getPath());
                file = null;
            }
            return file;
        }
    }
    
    public static final Drawable getDrawable(final Context context, final int n) {
        if (Build$VERSION.SDK_INT >= 21) {
            return ContextCompatApi21.getDrawable(context, n);
        }
        return context.getResources().getDrawable(n);
    }
    
    public static boolean startActivities(final Context context, final Intent[] array, final Bundle bundle) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 16) {
            ContextCompatJellybean.startActivities(context, array, bundle);
            return true;
        }
        if (sdk_INT >= 11) {
            ContextCompatHoneycomb.startActivities(context, array);
            return true;
        }
        return false;
    }
    
    public final File getNoBackupFilesDir(final Context context) {
        if (Build$VERSION.SDK_INT >= 21) {
            return ContextCompatApi21.getNoBackupFilesDir(context);
        }
        return createFilesDir(new File(context.getApplicationInfo().dataDir, ContextCompat.z[2]));
    }
}
