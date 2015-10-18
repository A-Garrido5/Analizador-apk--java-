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
import android.content.DialogInterface$OnClickListener;
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
import com.twitter.android.media.widget.CameraPreviewContainer;
import com.twitter.android.media.widget.VideoSegmentEditView;
import com.twitter.library.media.model.o;
import java.util.ArrayList;
import android.os.Handler;
import java.io.File;
import com.twitter.android.media.widget.be;
import com.twitter.android.media.widget.bc;
import android.view.View;
import android.view.View$OnClickListener;

class al implements View$OnClickListener
{
    final /* synthetic */ ag a;
    
    al(final ag a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (!this.a.n.a()) {
            if (this.a.Q >= 0 && this.a.Q < this.a.M.size()) {
                this.a.t();
                final ag a = this.a;
                final StringBuilder append = new StringBuilder().append("twitter_camera::video:preview:");
                String s;
                if (this.a.U) {
                    s = "pause";
                }
                else {
                    s = "play";
                }
                a.a(append.append(s).toString());
                return;
            }
            if (!this.a.M.isEmpty()) {
                this.a.a("twitter_camera::video:preview:replay");
                this.a.a(0, 0).a();
                this.a.s();
            }
        }
    }
}
