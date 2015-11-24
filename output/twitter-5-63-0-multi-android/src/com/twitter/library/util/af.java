// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.io.Closeable;
import android.annotation.TargetApi;
import android.os.Environment;
import android.content.ContentUris;
import android.provider.MediaStore$Audio$Media;
import android.provider.MediaStore$Video$Media;
import android.provider.MediaStore$Images$Media;
import android.provider.DocumentsContract;
import android.os.Build$VERSION;
import com.twitter.library.media.util.w;
import android.webkit.MimeTypeMap;
import java.io.FilenameFilter;
import android.net.Uri;
import android.text.TextUtils;
import com.twitter.util.q;
import com.twitter.library.client.az;
import com.twitter.util.d;
import java.io.InputStream;
import com.twitter.errorreporter.ErrorReporter;
import java.io.File;
import android.content.Context;
import com.twitter.util.concurrent.ObservablePromise;
import java.util.concurrent.Callable;
import android.os.AsyncTask;
import com.twitter.util.concurrent.b;
import com.twitter.util.concurrent.i;
import java.util.List;

public class af
{
    public static i a(final List list, final boolean b) {
        if (list != null && list.size() > 0) {
            return new b().a(AsyncTask.THREAD_POOL_EXECUTOR).a(new ah(list, b)).a();
        }
        return ObservablePromise.a(false);
    }
    
    public static File a(final Context context) {
        try {
            return context.getExternalCacheDir();
        }
        catch (Exception ex) {
            ErrorReporter.a(ex);
        }
        catch (ArrayIndexOutOfBoundsException ex2) {
            goto Label_0012;
        }
    }
    
    public static File a(final Context context, final InputStream inputStream, final String s) {
        d.c();
        File a = a(context, s);
        if (a == null) {
            return null;
        }
        if (!yh.a(inputStream, a)) {
            a = null;
        }
        return a;
    }
    
    public static File a(final Context context, final String s) {
        final File c = c(context);
        if (c == null) {
            return null;
        }
        final StringBuilder append = new StringBuilder().append("pic-").append(az.a(context).b().g()).append("-").append(q.a(6));
        String string;
        if (!TextUtils.isEmpty((CharSequence)s)) {
            string = "." + s;
        }
        else {
            string = "";
        }
        return new File(c, append.append(string).toString());
    }
    
    public static String a(final Context context, final Uri uri) {
        d.c();
        if ("file".equals(uri.getScheme())) {
            return a(uri.getLastPathSegment());
        }
        return context.getContentResolver().getType(uri);
    }
    
    public static String a(final String s) {
        return b(c(s));
    }
    
    public static void a(final Context context, final long n) {
        final File c = c(context);
        if (c != null) {
            final File[] listFiles = c.listFiles(new ai(n));
            if (listFiles != null) {
                for (final File file : listFiles) {
                    if (!file.isDirectory()) {
                        file.delete();
                    }
                }
            }
        }
    }
    
    public static boolean a(final Uri uri) {
        String lastPathSegment;
        if (uri != null) {
            lastPathSegment = uri.getLastPathSegment();
        }
        else {
            lastPathSegment = null;
        }
        return lastPathSegment != null && lastPathSegment.startsWith("pic-");
    }
    
    public static boolean a(final File file) {
        return file != null && a(Uri.fromFile(file));
    }
    
    public static File b(final Context context) {
        final File a = a(context);
        if (a != null) {
            return a;
        }
        return context.getCacheDir();
    }
    
    public static File b(final Context context, final Uri uri) {
        final String c = c(context, uri);
        if (c == null) {
            return null;
        }
        final File file = new File(c);
        if (file.exists()) {
            return file;
        }
        return null;
    }
    
    public static String b(final String s) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(s);
    }
    
    public static boolean b(final File file) {
        return a(file) && file.delete();
    }
    
    public static i c(final File file) {
        if (file != null && file.exists() && a(file)) {
            return new b().a(AsyncTask.THREAD_POOL_EXECUTOR).a(new ag(file)).a();
        }
        return ObservablePromise.a(false);
    }
    
    public static File c(final Context context) {
        try {
            final File externalFilesDir = context.getExternalFilesDir((String)null);
            if (externalFilesDir != null) {
                return externalFilesDir;
            }
            return context.getFilesDir();
        }
        catch (Exception ex) {
            ErrorReporter.a(ex);
        }
        catch (ArrayIndexOutOfBoundsException ex2) {
            goto Label_0026;
        }
    }
    
    @TargetApi(19)
    public static String c(final Context context, final Uri uri) {
        int n = -1;
        final String scheme = uri.getScheme();
        String path;
        if (scheme == null || "file".equals(scheme)) {
            path = uri.getPath();
        }
        else {
            final boolean equals = "content".equals(scheme);
            path = null;
            if (equals) {
                final w a = w.a(context);
                if (Build$VERSION.SDK_INT < 19 || !DocumentsContract.isDocumentUri(context, uri)) {
                    return a.a(uri, "_data", null, null);
                }
                final String authority = uri.getAuthority();
                int n2 = 0;
                Label_0115: {
                    switch (authority.hashCode()) {
                        case 1734583286: {
                            if (authority.equals("com.android.providers.media.documents")) {
                                n2 = 0;
                                break Label_0115;
                            }
                            break;
                        }
                        case 320699453: {
                            if (authority.equals("com.android.providers.downloads.documents")) {
                                n2 = 1;
                                break Label_0115;
                            }
                            break;
                        }
                        case 596745902: {
                            if (authority.equals("com.android.externalstorage.documents")) {
                                n2 = 2;
                                break Label_0115;
                            }
                            break;
                        }
                    }
                    n2 = n;
                }
                switch (n2) {
                    default: {
                        return null;
                    }
                    case 0: {
                        final String[] split = DocumentsContract.getDocumentId(uri).split(":");
                        final String s = split[0];
                        switch (s.hashCode()) {
                            case 100313435: {
                                if (s.equals("image")) {
                                    n = 0;
                                    break;
                                }
                                break;
                            }
                            case 112202875: {
                                if (s.equals("video")) {
                                    n = 1;
                                    break;
                                }
                                break;
                            }
                            case 93166550: {
                                if (s.equals("audio")) {
                                    n = 2;
                                    break;
                                }
                                break;
                            }
                        }
                        Uri uri2 = null;
                        switch (n) {
                            default: {
                                return null;
                            }
                            case 0: {
                                uri2 = MediaStore$Images$Media.EXTERNAL_CONTENT_URI;
                                break;
                            }
                            case 1: {
                                uri2 = MediaStore$Video$Media.EXTERNAL_CONTENT_URI;
                                break;
                            }
                            case 2: {
                                uri2 = MediaStore$Audio$Media.EXTERNAL_CONTENT_URI;
                                break;
                            }
                        }
                        return a.a(uri2, "_data", "_id=?", new String[] { split[1] });
                    }
                    case 1: {
                        return a.a(ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(DocumentsContract.getDocumentId(uri))), "_data", null, null);
                    }
                    case 2: {
                        final String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                        final boolean equalsIgnoreCase = "primary".equalsIgnoreCase(split2[0]);
                        path = null;
                        if (equalsIgnoreCase) {
                            return Environment.getExternalStorageDirectory() + "/" + split2[1];
                        }
                        break;
                    }
                }
            }
        }
        return path;
    }
    
    public static String c(final String s) {
        if (s != null) {
            final int lastIndex = s.lastIndexOf(46);
            if (lastIndex > 0 && lastIndex < -1 + s.length()) {
                return s.substring(lastIndex + 1).toLowerCase();
            }
        }
        return null;
    }
    
    public static int d(final Context context, final Uri uri) {
        int n = 0;
        InputStream openInputStream = null;
        try {
            openInputStream = context.getContentResolver().openInputStream(uri);
            final byte[] array = new byte[4096];
            while (true) {
                final int read = openInputStream.read(array, 0, array.length);
                if (read == -1) {
                    break;
                }
                n += read;
            }
            return n;
        }
        finally {
            yh.a((Closeable)openInputStream);
        }
    }
    
    public static File e(final Context context, final Uri uri) {
        d.c();
        File file = b(context, uri);
        if (file == null || file.length() <= 0L) {
            file = a(context, MimeTypeMap.getSingleton().getExtensionFromMimeType(a(context, uri)));
            if (file == null) {
                return null;
            }
            if (!yp.a(context, uri, file)) {
                return null;
            }
        }
        return file;
    }
}
