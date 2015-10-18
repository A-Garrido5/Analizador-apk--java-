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
import com.twitter.android.widget.eq;
import android.view.animation.Animation$AnimationListener;
import android.content.Context;
import android.view.animation.AnimationUtils;
import com.twitter.android.media.camera.VideoTooltipManager;
import com.twitter.android.media.widget.VideoClipRangeSeekBar;
import android.view.View;
import com.twitter.android.widget.ProgressReportingVideoView;
import com.twitter.library.media.model.VideoFile;
import com.twitter.library.view.x;
import com.twitter.android.widget.ep;
import com.twitter.android.media.widget.aq;
import android.support.v4.app.Fragment;
import android.view.animation.Animation;
import com.twitter.library.util.f;

class zg extends f
{
    final /* synthetic */ VideoEditorFragment a;
    
    zg(final VideoEditorFragment a) {
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        this.a.k.setVisibility(8);
    }
}
