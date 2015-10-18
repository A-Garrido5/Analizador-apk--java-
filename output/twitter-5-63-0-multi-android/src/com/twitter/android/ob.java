// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.os.Parcelable;
import android.support.v4.app.ActivityOptionsCompat;
import com.twitter.android.media.camera.CameraActivity;
import com.twitter.library.media.service.tasks.VideoCheckTask;
import com.twitter.library.media.util.aq;
import java.util.ArrayList;
import com.twitter.media.filters.g;
import android.view.View;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.model.MediaType;
import android.content.Intent;
import java.util.Iterator;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.media.model.EditableImage;
import com.twitter.util.d;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import java.util.HashMap;
import java.util.EnumSet;
import com.twitter.library.client.Session;
import com.twitter.library.media.util.a;
import android.content.Context;
import java.util.Map;
import android.support.v4.app.Fragment;
import com.twitter.util.t;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.media.model.VideoFile;
import android.os.Bundle;
import com.twitter.library.media.service.core.MediaServiceTask;
import com.twitter.library.media.model.EditableVideo;
import com.twitter.library.media.service.core.k;

class ob implements k
{
    final /* synthetic */ EditableVideo a;
    final /* synthetic */ AttachMediaListener b;
    final /* synthetic */ PhotoSelectFragment c;
    
    ob(final PhotoSelectFragment c, final EditableVideo a, final AttachMediaListener b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a(final boolean b, final MediaServiceTask mediaServiceTask) {
        if (this.c.g != this.a) {
            return;
        }
        if (b) {
            this.c.c.a(VideoEditorActivity.a(this.c.b, this.a), 261, null);
            return;
        }
        if (((VideoFile)this.a.mediaFile).file.length() < 15728640L && ((VideoFile)this.a.mediaFile).duration < 30000) {
            this.c.a(this.a, this.b);
            return;
        }
        t.a(this.c.b, 2131297101);
        this.b.a(AttachMediaListener$MediaAttachFailure.b, this.a.c());
    }
}
