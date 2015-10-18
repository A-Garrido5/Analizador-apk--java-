// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.media.camera.VideoTooltipManager$CameraTooltip;
import com.twitter.util.g;
import android.view.View$OnClickListener;
import com.twitter.library.widget.AspectRatioFrameLayout;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import com.twitter.library.media.model.MediaFile;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.media.model.EditableVideo;
import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;
import android.content.Context;
import android.view.animation.AnimationUtils;
import com.twitter.android.media.camera.VideoTooltipManager;
import com.twitter.android.media.widget.VideoClipRangeSeekBar;
import android.view.View;
import com.twitter.library.media.model.VideoFile;
import com.twitter.library.view.x;
import com.twitter.android.widget.ep;
import com.twitter.android.media.widget.aq;
import android.support.v4.app.Fragment;
import com.twitter.android.widget.ProgressReportingVideoView;
import com.twitter.android.widget.eq;

class zf implements eq
{
    final /* synthetic */ VideoEditorFragment a;
    
    zf(final VideoEditorFragment a) {
        this.a = a;
    }
    
    @Override
    public void a(final ProgressReportingVideoView progressReportingVideoView) {
        progressReportingVideoView.c();
        progressReportingVideoView.a();
        this.a.l.a(progressReportingVideoView.getCurrentPosition());
    }
}
