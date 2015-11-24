// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.view.ViewGroup$MarginLayoutParams;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.model.MediaType;
import android.annotation.TargetApi;
import android.hardware.Camera$CameraInfo;
import android.os.Build$VERSION;
import android.media.AudioManager;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.support.v4.view.ViewCompat;
import android.view.View$MeasureSpec;
import android.app.AlertDialog;
import android.content.DialogInterface$OnDismissListener;
import android.app.AlertDialog$Builder;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.widget.Toast;
import com.twitter.android.media.widget.VideoSegmentListItemView;
import com.twitter.util.d;
import com.twitter.library.media.model.SegmentedVideoFile;
import java.util.Iterator;
import android.net.Uri;
import android.os.Bundle;
import android.content.res.Resources;
import android.view.WindowManager;
import android.graphics.Point;
import com.twitter.android.media.widget.bi;
import com.twitter.library.media.model.VideoFile;
import android.content.Intent;
import android.view.ViewGroup$LayoutParams;
import android.support.v4.app.FragmentActivity;
import com.twitter.android.util.l;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.ScribeSection;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.ScribeSectionSegmentedVideo;
import android.graphics.drawable.TransitionDrawable;
import com.twitter.android.media.widget.CameraToolbar;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.content.Context;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import com.twitter.android.media.widget.VideoSegmentListView;
import com.twitter.library.media.widget.VideoDurationView;
import com.twitter.android.media.widget.CameraShutterBar;
import com.twitter.android.media.widget.VideoEditGarbageCanView;
import android.view.View;
import com.twitter.android.media.widget.CameraPreviewContainer;
import com.twitter.android.media.widget.VideoSegmentEditView;
import com.twitter.library.media.model.o;
import java.util.ArrayList;
import android.os.Handler;
import android.view.View$OnClickListener;
import java.io.File;
import com.twitter.android.media.widget.be;
import com.twitter.android.media.widget.bc;
import android.os.AsyncTask;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

class ap implements DialogInterface$OnClickListener
{
    final /* synthetic */ ag a;
    
    ap(final ag a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        if (!this.a.N) {
            this.a.a("twitter_camera::video:segment:dismiss", this.a.a(0, 0L));
            AsyncTask.execute((Runnable)new aq(this));
        }
        this.a.d.h();
    }
}
