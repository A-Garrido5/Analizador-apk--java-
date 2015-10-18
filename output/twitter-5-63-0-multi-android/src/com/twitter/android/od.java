// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcelable;
import com.twitter.util.t;
import android.support.v4.app.ActivityOptionsCompat;
import com.twitter.android.media.camera.CameraActivity;
import com.twitter.library.media.service.tasks.VideoCheckTask;
import com.twitter.library.media.model.VideoFile;
import com.twitter.library.media.util.aq;
import android.os.Bundle;
import java.util.ArrayList;
import com.twitter.media.filters.g;
import com.twitter.library.media.model.EditableVideo;
import android.view.View;
import android.content.Intent;
import java.util.Iterator;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.util.d;
import android.support.v4.app.FragmentManager;
import com.twitter.util.k;
import android.support.v4.app.FragmentActivity;
import java.util.HashMap;
import java.util.EnumSet;
import com.twitter.library.client.Session;
import com.twitter.library.media.util.a;
import android.content.Context;
import java.util.Map;
import android.support.v4.app.Fragment;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.model.MediaType;
import com.twitter.library.media.model.ImageFile;
import com.twitter.library.media.model.EditableImage;
import android.net.Uri;
import android.graphics.Bitmap;
import com.twitter.library.media.util.m;
import android.graphics.Bitmap$CompressFormat;
import com.twitter.library.util.af;
import com.twitter.library.media.decoder.ImageDecoder;
import java.io.File;
import com.twitter.library.media.model.EditableMedia;

class od extends of
{
    final /* synthetic */ PhotoSelectFragment a;
    private final EditableMedia b;
    private final String c;
    private final AttachMediaListener d;
    
    public od(final PhotoSelectFragment a, final EditableMedia b, final String c, final AttachMediaListener d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private File a(final File file) {
        File file2 = null;
        final Bitmap b = ImageDecoder.a(file).b();
        if (b != null) {
            final File a = af.a(this.a.b, "jpg");
            if (a != null) {
                if (!m.a(b, a, Bitmap$CompressFormat.JPEG, 75)) {
                    a.delete();
                }
                else {
                    file2 = a;
                }
                b.recycle();
                return file2;
            }
        }
        return null;
    }
    
    @Override
    public Uri a() {
        return this.b.c();
    }
    
    protected EditableImage a(final Void... array) {
        final File file = this.b.mediaFile.file;
        final File a = this.a(file);
        if (a != null) {
            final ImageFile imageFile = (ImageFile)MediaFile.a(a, MediaType.b);
            if (imageFile != null) {
                final EditableImage editableImage = (EditableImage)EditableMedia.a(imageFile, this.c);
                af.b(file);
                return editableImage;
            }
        }
        return null;
    }
    
    protected void a(final EditableImage editableImage) {
        Label_0046: {
            if (editableImage == null) {
                break Label_0046;
            }
            try {
                this.a.a(AttachMediaListener$MediaAttachFailure.c, this.b.c(), this.d);
                this.a.a(editableImage, this.d);
                return;
                this.a.a(AttachMediaListener$MediaAttachFailure.a, this.b.c(), this.d);
            }
            finally {
                this.a.b(this);
            }
        }
    }
}
