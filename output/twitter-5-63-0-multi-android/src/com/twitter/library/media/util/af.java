// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import java.io.File;
import android.os.Environment;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.media.model.EditableSegmentedVideo;
import com.twitter.library.media.model.SegmentedVideoFile;

public class af extends z
{
    private final SegmentedVideoFile a;
    
    public af(final EditableSegmentedVideo editableSegmentedVideo) {
        super(((SegmentedVideoFile)editableSegmentedVideo.mediaFile).file, MediaType.d);
        this.a = (SegmentedVideoFile)editableSegmentedVideo.mediaFile;
    }
    
    public boolean a(final af af) {
        return this == af || (super.a(af) && this.a.a(af.a));
    }
    
    @Override
    String b() {
        return new StringBuffer().append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).toString()).append(File.separator).append("Twitter").append(File.separator).append("VID_").append(this.hashCode()).append('.').append(this.h.extension).toString();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof af && this.a((af)o));
    }
    
    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.a.hashCode();
    }
}
