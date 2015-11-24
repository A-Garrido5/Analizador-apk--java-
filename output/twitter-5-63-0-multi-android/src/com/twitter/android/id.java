// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.graphics.Canvas;
import android.view.KeyEvent;
import com.twitter.library.widget.SlidingUpPanelLayout;
import java.util.Collections;
import android.net.Uri;
import com.twitter.errorreporter.ErrorReporter;
import android.app.Dialog;
import java.util.ArrayList;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import com.twitter.library.util.bj;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$OnGestureListener;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v4.view.PagerAdapter;
import android.os.Parcelable;
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
import com.twitter.library.api.PromotedEvent;
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
import android.content.Context;
import com.twitter.library.api.timeline.i;
import java.util.Set;
import java.util.List;
import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.widget.SlidingPanel;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.client.Session;
import android.widget.TextView;
import android.view.ViewGroup;
import android.support.v4.view.ViewPager;
import com.twitter.library.widget.TweetView;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.provider.Tweet;
import android.view.animation.Animation;
import com.twitter.ui.widget.TwitterButton;
import android.view.View;
import com.twitter.ui.dialog.e;
import android.view.View$OnClickListener;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.android.client.TwitterFragmentActivity;
import android.view.ViewTreeObserver$OnPreDrawListener;

class id implements ViewTreeObserver$OnPreDrawListener
{
    final /* synthetic */ GalleryActivity a;
    
    id(final GalleryActivity a) {
        this.a = a;
    }
    
    public boolean onPreDraw() {
        this.a.y.d();
        this.a.y.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        return false;
    }
}
