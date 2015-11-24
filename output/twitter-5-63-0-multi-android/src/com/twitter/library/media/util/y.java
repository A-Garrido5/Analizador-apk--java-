// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import com.twitter.library.util.af;
import com.twitter.util.d;
import android.database.Cursor;
import android.net.Uri;
import com.twitter.util.SynchronizedDateFormat;
import android.content.Context;
import java.text.DateFormat;
import android.os.Environment;
import java.util.Date;
import com.twitter.library.media.model.MediaType;
import java.io.File;

public class y extends z
{
    public y(final File file) {
        super(file, MediaType.b);
    }
    
    protected String a() {
        return w.a.format(new Date());
    }
    
    @Override
    String b() {
        return new StringBuffer().append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString()).append(File.separator).append("Twitter").append(File.separator).append("IMG_").append(this.a()).append('.').append(MediaType.b.extension).toString();
    }
}
