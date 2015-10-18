// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.support.v4.content.CursorLoader;
import com.twitter.android.widget.RelatedTweetsFeedbackDialogFragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import com.twitter.library.experiments.RelatedTweetsExperimentHelper$DesignTreatment;
import com.twitter.library.experiments.RelatedTweetsExperimentHelper;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.android.composer.bo;
import android.os.Parcelable;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.library.util.bq;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.provider.bf;
import com.twitter.android.composer.au;
import com.twitter.library.api.timeline.ah;
import android.content.ContentUris;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.provider.ad;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.app.Activity;
import android.support.v4.app.ActivityCompat;
import android.content.Intent;
import com.twitter.android.composer.bh;
import android.content.DialogInterface;
import com.twitter.library.service.aa;
import com.twitter.android.client.bn;
import android.text.TextUtils;
import com.twitter.android.util.bd;
import java.util.Collections;
import com.twitter.android.client.ca;
import com.twitter.library.provider.DraftTweet;
import android.widget.Toast;
import com.twitter.library.provider.ae;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.media.model.MediaType;
import com.twitter.android.util.bg;
import com.twitter.library.featureswitch.d;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.android.client.c;
import com.twitter.library.media.util.ag;
import com.twitter.library.media.util.q;
import com.twitter.internal.android.util.Size;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.internal.android.widget.TypefacesTextView;
import android.os.Bundle;
import com.twitter.library.api.timeline.i;
import java.util.Set;
import java.util.List;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.media.manager.k;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.widget.ImageView;
import com.twitter.android.widget.GalleryGridFragment;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.service.z;
import android.widget.Button;
import android.widget.TextView;
import com.twitter.android.composer.TweetBox;
import com.twitter.library.client.as;
import com.twitter.library.client.Session;
import com.twitter.library.api.EntityScribeContent;
import android.widget.RelativeLayout;
import com.twitter.library.provider.Tweet;
import android.net.Uri;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.ui.dialog.e;
import com.twitter.library.media.util.a;
import com.twitter.android.widget.er;
import com.twitter.android.widget.co;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.library.scribe.TwitterScribeLog;
import android.view.View;
import android.view.View$OnClickListener;

class vu implements View$OnClickListener
{
    final /* synthetic */ TweetActivity a;
    
    vu(final TweetActivity a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        this.a.G().a(new TwitterScribeLog(this.a.c.g()).b(new String[] { ":composition::add_photo:click" }));
        final int visibility = this.a.w.getVisibility();
        if (visibility == 8 && this.a.m) {
            this.a.F = true;
            this.a.g.a(false);
            return;
        }
        final View l = this.a.w;
        int visibility2 = 0;
        if (visibility != 8) {
            visibility2 = 8;
        }
        l.setVisibility(visibility2);
    }
}
