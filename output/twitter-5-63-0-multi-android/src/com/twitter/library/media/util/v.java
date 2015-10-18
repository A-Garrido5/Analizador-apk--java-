// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import com.twitter.library.featureswitch.d;
import com.twitter.library.media.model.m;
import android.provider.MediaStore$Files;
import android.content.Context;
import com.twitter.library.util.k;

public class v extends k
{
    public v(final Context context, final boolean b, final boolean b2) {
        super(context, MediaStore$Files.getContentUri("external"), m.a, a(b2), b(b), "date_added DESC");
    }
    
    private static String a(final boolean b) {
        final StringBuilder append = new StringBuilder().append("_data NOT NULL AND _data != ? AND _size > 0 AND (mime_type!= ? OR _size <= ?) AND (");
        String s;
        if (b) {
            s = "media_type = 1 OR media_type = 3)";
        }
        else {
            s = "media_type = 1)";
        }
        return append.append(s).toString();
    }
    
    private static String[] b(final boolean b) {
        final boolean f = d.f("animated_content_5mb_limit_enabled");
        final String[] array = { "", "image/gif", null };
        String string;
        if (b) {
            int n;
            if (f) {
                n = 5242880;
            }
            else {
                n = 3145728;
            }
            string = Integer.toString(n);
        }
        else {
            string = "0";
        }
        array[2] = string;
        return array;
    }
}
