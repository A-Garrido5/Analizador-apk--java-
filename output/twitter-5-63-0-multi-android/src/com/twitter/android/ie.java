// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.ViewTreeObserver$OnPreDrawListener;
import java.util.Collections;
import android.net.Uri;
import com.twitter.errorreporter.ErrorReporter;
import android.app.Dialog;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import com.twitter.library.util.bj;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$OnGestureListener;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.PagerAdapter;
import com.twitter.library.provider.ae;
import com.twitter.library.widget.aj;
import com.twitter.library.view.z;
import android.app.Activity;
import java.util.Iterator;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.android.composer.au;
import com.twitter.library.api.UrlEntity;
import com.twitter.library.api.timeline.ah;
import android.text.TextUtils;
import android.database.Cursor;
import android.support.v4.content.Loader;
import java.util.HashSet;
import android.content.DialogInterface;
import android.widget.Toast;
import com.twitter.library.service.aa;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.os.AsyncTask$Status;
import com.twitter.library.widget.StatusToolBar;
import com.twitter.internal.android.widget.ToolBar;
import android.view.View$OnSystemUiVisibilityChangeListener;
import android.os.Build$VERSION;
import android.content.res.TypedArray;
import android.content.res.Resources;
import com.twitter.library.media.manager.UserImageRequest;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.TextView$BufferType;
import com.twitter.library.media.util.ag;
import com.twitter.library.media.util.q;
import com.twitter.internal.android.util.Size;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.android.client.c;
import com.twitter.library.service.y;
import com.twitter.library.api.timeline.i;
import java.util.Set;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.widget.SlidingPanel;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.client.Session;
import android.widget.TextView;
import android.view.ViewGroup;
import android.support.v4.view.ViewPager;
import com.twitter.library.widget.TweetView;
import com.twitter.library.api.MediaEntity;
import android.view.animation.Animation;
import com.twitter.ui.widget.TwitterButton;
import com.twitter.ui.dialog.e;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.api.PromotedContent;
import android.os.Parcelable;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.api.MediaTag;
import android.content.Context;
import android.content.Intent;
import com.twitter.library.api.PromotedEvent;
import android.view.View;
import com.twitter.library.provider.Tweet;
import java.util.List;
import android.view.View$OnClickListener;

class ie implements View$OnClickListener
{
    final /* synthetic */ List a;
    final /* synthetic */ Tweet b;
    final /* synthetic */ GalleryActivity c;
    
    ie(final GalleryActivity c, final List a, final Tweet b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public void onClick(final View view) {
        if (this.a.size() == 1) {
            final PromotedContent j = this.b.j;
            if (j != null) {
                this.c.G().a(PromotedEvent.f, j);
            }
            this.c.startActivity(new Intent((Context)this.c, (Class)ProfileActivity.class).putExtra("screen_name", this.a.get(0).screenName).putExtra("association", (Parcelable)((TwitterScribeAssociation)((TwitterScribeAssociation)((TwitterScribeAssociation)new TwitterScribeAssociation().a(5)).a(this.c.U().g())).b("gallery")).c("media_tag_summary")));
        }
        else {
            this.c.x.a(true);
        }
        this.c.a(4, this.b);
    }
}
