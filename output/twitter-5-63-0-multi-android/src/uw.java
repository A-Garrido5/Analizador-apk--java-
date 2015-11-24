import android.net.Uri;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class uw
{
    public static Uri a(final Uri uri, final Uri uri2) {
        return uri2.buildUpon().appendEncodedPath(uri.getAuthority() + uri.getPath()).build();
    }
}
