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
import com.twitter.util.k;
import android.support.v4.app.FragmentActivity;
import java.util.HashMap;
import com.twitter.library.media.model.EditableMedia;
import java.util.EnumSet;
import com.twitter.library.client.Session;
import com.twitter.library.media.util.a;
import android.content.Context;
import java.util.Map;
import android.support.v4.app.Fragment;

public class PhotoSelectFragment extends Fragment
{
    private final Map a;
    private Context b;
    private a c;
    private Session d;
    private EnumSet e;
    private String f;
    private EditableMedia g;
    private boolean h;
    
    public PhotoSelectFragment() {
        this.a = new HashMap();
        this.setRetainInstance(true);
    }
    
    public static PhotoSelectFragment a(final FragmentActivity fragmentActivity, final a c, final String s, final EnumSet e, final Session d) {
        final FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        PhotoSelectFragment photoSelectFragment = (PhotoSelectFragment)supportFragmentManager.findFragmentByTag("PhotoSelectFragment");
        if (photoSelectFragment == null) {
            photoSelectFragment = new PhotoSelectFragment();
            supportFragmentManager.beginTransaction().add(photoSelectFragment, "PhotoSelectFragment").commit();
        }
        photoSelectFragment.b = fragmentActivity.getApplicationContext();
        photoSelectFragment.c = c;
        photoSelectFragment.f = k.a(s);
        photoSelectFragment.e = e;
        photoSelectFragment.d = d;
        return photoSelectFragment;
    }
    
    private void a(final AttachMediaListener$MediaAttachFailure attachMediaListener$MediaAttachFailure, final Uri uri, final AttachMediaListener attachMediaListener) {
        this.h = false;
        attachMediaListener.a(attachMediaListener$MediaAttachFailure, uri);
    }
    
    private void a(final of of) {
        com.twitter.util.d.a();
        this.a.put(of.a(), of);
        of.b();
    }
    
    private void a(final EditableImage editableImage, final long n) {
        if (editableImage.filterId != 0) {
            ScribeService.a((Context)this.getActivity(), ((TwitterScribeLog)new TwitterScribeLog(n).a((long)editableImage.filterId)).b("", this.f, editableImage.source, "filters", "filtered"));
        }
    }
    
    private void b(final of of) {
        synchronized (this) {
            this.a.remove(of.a());
        }
    }
    
    private void b(final EditableMedia editableMedia, final AttachMediaListener attachMediaListener) {
        this.h = false;
        attachMediaListener.b(editableMedia);
    }
    
    public void a() {
        com.twitter.util.d.a();
        final Iterator<of> iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().cancel(false);
        }
        this.a.clear();
    }
    
    public void a(final int n, final int n2, final Intent intent, final AttachMediaListener attachMediaListener) {
        Label_0048: {
            switch (n) {
                case 257: {
                    if (n2 != -1 || intent == null) {
                        this.a(AttachMediaListener$MediaAttachFailure.c, null, attachMediaListener);
                        return;
                    }
                    final Uri data = intent.getData();
                    if (data == null) {
                        this.a(AttachMediaListener$MediaAttachFailure.a, null, attachMediaListener);
                        return;
                    }
                    this.a(new oe(this, data, "gallery", attachMediaListener, false));
                    return;
                }
                case 261: {
                    if (n2 != -1 || intent == null) {
                        this.a(AttachMediaListener$MediaAttachFailure.c, this.g.c(), attachMediaListener);
                        return;
                    }
                    final EditableVideo a = VideoEditorActivity.a(intent);
                    if (a != null) {
                        this.a(a, attachMediaListener);
                        return;
                    }
                    break;
                }
                case 258:
                case 264: {
                    if (n2 != -1 || intent == null) {
                        this.a(AttachMediaListener$MediaAttachFailure.c, null, attachMediaListener);
                        return;
                    }
                    final MediaType mediaType = (MediaType)intent.getSerializableExtra("media_type");
                    final MediaFile mediaFile = (MediaFile)intent.getParcelableExtra("media_file");
                    switch (oc.a[mediaType.ordinal()]) {
                        default: {
                            final EditableMedia a2 = EditableMedia.a(mediaFile, "twitter_camera");
                            if (attachMediaListener.a(a2)) {
                                this.a(a2, attachMediaListener);
                                return;
                            }
                            break Label_0048;
                        }
                        case 2: {
                            this.a(EditableMedia.a(mediaFile, "twitter_camera"), null, attachMediaListener);
                            return;
                        }
                        case 3: {
                            this.a(EditableMedia.a(mediaFile, "twitter_camera"), attachMediaListener);
                            return;
                        }
                    }
                    break;
                }
                case 259: {
                    if (intent != null && n2 == -1) {
                        EditableMedia editableMedia = EditImageActivity.a(intent);
                        if (editableMedia == null) {
                            editableMedia = this.g;
                        }
                        this.a(editableMedia, attachMediaListener, EditImageActivity.b(intent));
                        return;
                    }
                    if (n2 != 0) {
                        this.a(AttachMediaListener$MediaAttachFailure.c, this.g.c(), attachMediaListener);
                        return;
                    }
                    break;
                }
            }
        }
    }
    
    public void a(final Uri uri) {
        com.twitter.util.d.a();
        final of of = this.a.get(uri);
        if (of != null) {
            of.cancel(false);
            this.a.remove(uri);
        }
    }
    
    public void a(final Uri uri, final boolean b, final AttachMediaListener attachMediaListener) {
        com.twitter.util.d.a();
        this.h = true;
        this.a(new oe(this, uri, "", attachMediaListener, b));
    }
    
    public void a(final EditableMedia g, final View view, final AttachMediaListener attachMediaListener) {
        com.twitter.util.d.a();
        switch (oc.a[g.e().ordinal()]) {
            default: {
                this.a(g, attachMediaListener);
            }
            case 1: {
                if (!g.a(this.b)) {
                    this.a(g, attachMediaListener);
                    return;
                }
                this.g = g;
                final ArrayList<EditableImage> list = new ArrayList<EditableImage>(1);
                list.add((EditableImage)g);
                this.c.a(EditImageActivity.a(this.b, list, this.f), 259, null);
            }
            case 2: {
                this.g = g;
                if (!aq.b()) {
                    this.c.a(VideoEditorActivity.a(this.b, (EditableVideo)g), 261, null);
                    return;
                }
                final EditableVideo editableVideo = (EditableVideo)g;
                new VideoCheckTask(((VideoFile)editableVideo.mediaFile).file).a(this.b, new ob(this, editableVideo, attachMediaListener));
            }
            case 3: {
                this.g = g;
                final Intent a = CameraActivity.a(this.b, g.c());
                Bundle bundle = null;
                if (view != null) {
                    bundle = ActivityOptionsCompat.makeScaleUpAnimation(view, 0, 0, view.getMeasuredWidth(), view.getMeasuredHeight()).toBundle();
                }
                this.c.a(a, 264, bundle);
            }
        }
    }
    
    public void a(final EditableMedia editableMedia, final AttachMediaListener attachMediaListener) {
        this.a(editableMedia, attachMediaListener, null);
    }
    
    public void a(final EditableMedia editableMedia, final AttachMediaListener attachMediaListener, final String s) {
        com.twitter.util.d.a();
        this.h = true;
        final MediaType e = editableMedia.e();
        if (this.e.contains(e)) {
            final boolean f = com.twitter.library.featureswitch.d.f("animated_content_5mb_limit_enabled");
            int n;
            if (f) {
                n = 5242880;
            }
            else {
                n = 3145728;
            }
            if (e == MediaType.c && editableMedia.mediaFile.file.length() > n) {
                final Context b = this.b;
                int n2;
                if (f) {
                    n2 = 2131297167;
                }
                else {
                    n2 = 2131297166;
                }
                t.a(b, n2);
                this.a(AttachMediaListener$MediaAttachFailure.b, editableMedia.c(), attachMediaListener);
                return;
            }
            if (editableMedia instanceof EditableImage) {
                final EditableImage editableImage = (EditableImage)editableMedia;
                com.twitter.library.media.util.t.a(editableImage, this.f, s, this.d.g());
                this.a(editableImage, this.d.g());
            }
            this.b(editableMedia, attachMediaListener);
        }
        else {
            if (e == MediaType.c && this.e.contains(MediaType.b)) {
                this.a(new od(this, editableMedia, editableMedia.source, attachMediaListener));
                return;
            }
            t.a(this.b, 2131297165);
            this.a(AttachMediaListener$MediaAttachFailure.a, editableMedia.c(), attachMediaListener);
        }
    }
    
    public void a(final boolean b, final int n) {
        if (n == 0) {
            return;
        }
        ScribeService.a(this.getActivity().getApplicationContext(), new TwitterScribeLog(this.d.g()).b(null, this.f, null, "twitter_camera", "click"));
        this.c.a(CameraActivity.a(this.b, n, b), 258, null);
    }
    
    public void b() {
        com.twitter.library.media.util.t.a((Context)this.getActivity(), this.c, 257, null);
    }
    
    public boolean c() {
        return this.h;
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.g = (EditableMedia)bundle.getParcelable("pending_media");
        }
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        this.a();
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("pending_media", (Parcelable)this.g);
    }
}
