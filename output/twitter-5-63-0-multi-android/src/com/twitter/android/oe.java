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
import com.twitter.library.media.model.MediaFile;
import android.content.Intent;
import java.util.Iterator;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.media.model.EditableImage;
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
import com.twitter.library.media.model.MediaType;
import com.twitter.library.util.af;
import com.twitter.library.media.model.EditableMedia;
import android.net.Uri;

final class oe extends of
{
    final /* synthetic */ PhotoSelectFragment a;
    private final Uri b;
    private final String c;
    private final boolean d;
    private final AttachMediaListener e;
    
    oe(final PhotoSelectFragment a, final Uri b, final String c, final AttachMediaListener e, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    @Override
    public Uri a() {
        return this.b;
    }
    
    protected EditableMedia a(final Void... array) {
        final String a = af.a(this.a.b, this.b);
        MediaType mediaType;
        if (a != null) {
            mediaType = MediaType.a(a);
        }
        else {
            mediaType = MediaType.b;
        }
        if (mediaType == MediaType.b || mediaType == MediaType.c || (mediaType == MediaType.d && this.d)) {
            return EditableMedia.a(this.a.b, this.b, mediaType, this.c);
        }
        return null;
    }
    
    protected void a(final EditableMedia editableMedia) {
        Label_0025: {
            if (editableMedia == null) {
                break Label_0025;
            }
            try {
                this.a.a(editableMedia, this.e);
                return;
                this.a.a(AttachMediaListener$MediaAttachFailure.a, this.b, this.e);
            }
            finally {
                this.a.b(this);
            }
        }
    }
    
    protected void b(final EditableMedia editableMedia) {
        if (editableMedia != null) {
            editableMedia.g();
        }
    }
}
