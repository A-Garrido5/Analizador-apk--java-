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
import com.twitter.android.client.bn;
import android.text.TextUtils;
import com.twitter.android.util.bd;
import java.util.Collections;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.android.client.ca;
import com.twitter.library.provider.DraftTweet;
import android.widget.Toast;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.media.model.MediaType;
import com.twitter.android.util.bg;
import com.twitter.library.featureswitch.d;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.android.client.c;
import com.twitter.library.media.util.q;
import com.twitter.internal.android.util.Size;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.internal.android.widget.TypefacesTextView;
import com.twitter.library.api.timeline.i;
import java.util.Set;
import java.util.List;
import android.content.Context;
import com.twitter.library.media.manager.k;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.widget.ImageView;
import com.twitter.android.widget.GalleryGridFragment;
import android.view.View;
import com.twitter.library.scribe.TwitterScribeAssociation;
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
import com.twitter.android.widget.er;
import com.twitter.android.widget.co;
import android.view.View$OnClickListener;
import com.twitter.internal.android.service.a;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import android.os.Bundle;
import com.twitter.library.provider.ae;
import com.twitter.library.api.upload.ag;
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.x;
import com.twitter.library.service.y;
import com.twitter.library.service.z;

class vv extends z
{
    final /* synthetic */ TweetActivity a;
    
    private vv(final TweetActivity a) {
        this.a = a;
    }
    
    private void a(final y y, final x x) {
        final int o = y.O();
        boolean b = false;
        switch (o) {
            case 2: {
                b = ((aa)x.b()).a();
                break;
            }
            case 3:
            case 4: {
                b = this.a.f(y.b);
                break;
            }
        }
        if (b) {
            if (this.a.g.hasFocus() && this.a.g.getTextLength() != 0) {
                this.a.i.setEnabled(true);
            }
            if (this.a.e != null) {
                this.a.f.d(((aa)x.b()).a());
            }
        }
    }
    
    @Override
    public void a(final y y) {
        if (y instanceof ag) {
            this.a(y, y.l());
        }
        else if (this.a.e != null && ((aa)y.l().b()).a()) {
            if (y instanceof oq) {
                final oq oq = (oq)y;
                if (this.a.e.D == oq.g()) {
                    this.a.n = ae.a(oq.t(), this.a.c.g());
                    this.a.getSupportLoaderManager().restartLoader(0, null, this.a);
                }
            }
            else if (y instanceof ol) {
                int n;
                if (this.a.e.D == ((ol)y).f()) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (n != 0) {
                    this.a.n = ae.b(this.a.e.D, this.a.c.g());
                    this.a.getSupportLoaderManager().restartLoader(0, null, this.a);
                }
            }
        }
    }
}
