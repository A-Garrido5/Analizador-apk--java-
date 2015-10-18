// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import com.twitter.util.d;
import com.twitter.util.q;
import java.io.File;
import android.database.Cursor;
import android.net.Uri;

public class m
{
    public static final String[] a;
    public final long b;
    public final Uri c;
    public final MediaType d;
    
    static {
        a = new String[] { "_id", "_data", "media_type", "mime_type" };
    }
    
    public m(final Cursor cursor) {
        int n = 1;
        this.b = cursor.getLong(0);
        this.c = Uri.fromFile(new File(cursor.getString(n)));
        if (cursor.getInt(2) != 3) {
            n = 0;
        }
        final boolean a = q.a(cursor.getString(3), "image/gif");
        MediaType d;
        if (n != 0) {
            d = MediaType.d;
        }
        else if (a) {
            d = MediaType.c;
        }
        else {
            d = MediaType.b;
        }
        this.d = d;
    }
    
    public EditableMedia a(final String s) {
        com.twitter.util.d.c();
        final MediaFile a = MediaFile.a(new File(this.c.getPath()), this.d);
        if (a != null) {
            return EditableMedia.a(a, s);
        }
        return null;
    }
    
    public boolean a(final m m) {
        return this == m || (m != null && m.d.equals(this.d) && m.c.equals((Object)this.c) && m.b == this.b);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof m && this.a((m)o));
    }
    
    @Override
    public int hashCode() {
        return 31 * (0 + this.d.hashCode()) + this.c.hashCode();
    }
}
