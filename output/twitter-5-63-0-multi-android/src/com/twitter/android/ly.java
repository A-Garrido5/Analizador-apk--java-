// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.vineloops.i;
import com.twitter.library.client.as;
import com.twitter.android.vineloops.VineLoopAggregator;
import android.support.v4.content.CursorLoader;
import android.app.Dialog;
import android.view.KeyEvent;
import android.widget.Toast;
import java.util.ArrayList;
import android.content.Intent;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.widget.BaseMediaImageView$ScaleType;
import android.text.TextUtils;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import com.twitter.library.util.bq;
import android.widget.ImageButton;
import com.twitter.library.media.model.MediaDescriptor;
import android.preference.PreferenceManager;
import com.twitter.library.provider.ae;
import com.twitter.util.c;
import com.twitter.android.composer.au;
import android.content.Context;
import com.twitter.library.provider.ad;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.view.View;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.internal.android.widget.ToolBar;
import android.view.View$OnSystemUiVisibilityChangeListener;
import android.os.Build$VERSION;
import com.twitter.library.media.manager.aj;
import com.twitter.library.media.manager.al;
import com.twitter.library.media.manager.ap;
import com.twitter.library.media.manager.aq;
import java.util.concurrent.Future;
import com.twitter.android.vineloops.b;
import android.view.animation.Animation;
import android.net.Uri;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.library.widget.TweetView;
import com.twitter.library.media.widget.MediaImageView;
import android.widget.ProgressBar;
import com.twitter.library.media.player.InlineVideoView;
import android.widget.LinearLayout;
import com.twitter.android.widget.MediaPlayerView;
import com.twitter.android.widget.dj;
import com.twitter.android.vineloops.a;
import android.view.View$OnClickListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.media.model.VideoFile;
import com.twitter.library.media.manager.ResourceResponse;
import com.twitter.library.media.manager.ar;

class ly implements ar
{
    final /* synthetic */ MediaPlayerActivity a;
    
    ly(final MediaPlayerActivity a) {
        this.a = a;
    }
    
    @Override
    public void a(final ResourceResponse resourceResponse) {
        final VideoFile videoFile = (VideoFile)resourceResponse.c();
        if (videoFile != null && this.a.c != null) {
            this.a.c.post((Runnable)new lz(this, videoFile));
        }
    }
}
