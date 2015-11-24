// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import com.twitter.library.util.af;
import android.os.AsyncTask;
import com.twitter.util.c;
import java.util.ArrayList;
import com.twitter.library.media.util.w;
import java.io.File;

public final class o
{
    private final File a;
    private final File b;
    private final q c;
    
    private o(final File a, final File b) {
        this.c = new q();
        this.a = a;
        this.b = b;
    }
    
    public static o a() {
        final File a = w.a();
        if (a != null) {
            return new o(a, null);
        }
        return null;
    }
    
    public static o a(final SegmentedVideoFile segmentedVideoFile) {
        final File file = segmentedVideoFile.file;
        return new o(file.getParentFile(), file);
    }
    
    public static o a(final File file) {
        return new o(file, null);
    }
    
    public o a(final int d) {
        this.c.d = d;
        return this;
    }
    
    public o a(final VideoFile videoFile) {
        if (!videoFile.file.getParent().equals(this.a.getAbsolutePath())) {
            throw new IllegalArgumentException();
        }
        this.c.b.add(videoFile);
        return this;
    }
    
    public SegmentedVideoFile b() {
        final int size = this.c.b.size();
        final ArrayList c = new ArrayList<Integer>(size);
        for (int i = 0; i < size; ++i) {
            c.add(i);
        }
        this.c.c = c;
        File b;
        if (this.b != null) {
            b = this.b;
        }
        else {
            b = new File(this.a, "pic-" + String.valueOf(System.currentTimeMillis()) + '.' + "segv");
        }
        final SegmentedVideoFile segmentedVideoFile = new SegmentedVideoFile(b, this.c);
        if (com.twitter.util.c.a()) {
            AsyncTask.execute((Runnable)new p(this, segmentedVideoFile));
            return segmentedVideoFile;
        }
        segmentedVideoFile.e();
        return segmentedVideoFile;
    }
    
    public o b(final int a) {
        this.c.a = a;
        return this;
    }
    
    public File c() {
        return this.a;
    }
    
    public File d() {
        return new File(this.a, "pic-" + String.valueOf(System.currentTimeMillis()) + '.' + MediaType.d.extension);
    }
    
    public void e() {
        this.c.b.clear();
        final File[] listFiles = this.a.listFiles();
        for (int length = listFiles.length, i = 0; i < length; ++i) {
            af.b(listFiles[i]);
        }
        this.a.delete();
    }
}
