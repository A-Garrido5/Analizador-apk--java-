// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import com.twitter.android.geo.GeoTagState;
import com.twitter.android.AccountsDialogActivity;
import java.io.Serializable;
import com.twitter.android.provider.SuggestionsProvider;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.accounts.Account;
import com.twitter.android.DraftsActivity;
import com.twitter.android.UserAccount;
import android.os.Parcelable;
import com.twitter.android.MediaTagActivity;
import com.twitter.library.api.geo.GeoTag;
import com.twitter.library.api.UserSettings;
import com.twitter.library.api.account.ab;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.cm;
import com.twitter.library.api.TwitterUser;
import android.graphics.Rect;
import android.animation.ObjectAnimator;
import android.support.v4.app.ActivityCompat;
import android.content.Intent;
import android.text.TextUtils;
import com.twitter.errorreporter.ErrorReporter;
import android.widget.Toast;
import com.twitter.library.scribe.ScribeSection;
import com.twitter.eventreporter.EventReporter;
import com.twitter.library.scribe.ScribeSectionSegmentedVideo;
import com.twitter.library.media.model.EditableSegmentedVideo;
import com.twitter.library.scribe.ScribeSectionImportedVideo;
import com.twitter.library.util.bj;
import android.view.View$OnLongClickListener;
import com.twitter.library.widget.ad;
import com.twitter.android.j;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.os.Handler;
import android.os.Looper;
import com.twitter.library.client.App;
import android.graphics.drawable.Drawable;
import android.view.View$OnTouchListener;
import android.view.GestureDetector$OnGestureListener;
import android.view.GestureDetector;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import java.util.Iterator;
import com.twitter.library.util.p;
import com.twitter.library.provider.ae;
import android.content.ContentUris;
import com.twitter.library.provider.az;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.provider.DraftTweet;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.content.res.Resources;
import java.util.concurrent.Future;
import com.twitter.util.concurrent.h;
import java.util.concurrent.Callable;
import com.twitter.library.provider.f;
import android.os.AsyncTask;
import com.twitter.android.geo.e;
import android.support.v4.app.FragmentActivity;
import android.view.View$OnClickListener;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.ViewStub;
import com.twitter.android.widget.y;
import com.twitter.android.widget.ag;
import android.text.TextWatcher;
import android.os.Bundle;
import com.twitter.android.AttachMediaListener;
import android.net.Uri;
import android.content.Context;
import android.widget.ProgressBar;
import android.app.Activity;
import com.twitter.library.featureswitch.d;
import java.util.LinkedHashMap;
import com.twitter.android.widget.DraggableDrawerLayout;
import com.twitter.android.widget.ToggleImageButton;
import android.widget.ImageButton;
import com.twitter.library.media.widget.UserImageView;
import com.twitter.android.media.widget.MediaAttachmentsView;
import java.util.HashMap;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.provider.Tweet;
import android.view.animation.Animation;
import com.twitter.android.i;
import com.twitter.android.ac;
import com.twitter.library.api.QuotedTweetData;
import com.twitter.library.client.as;
import com.twitter.android.nativecards.c;
import java.util.regex.Pattern;
import android.animation.Animator;
import com.twitter.library.client.Session;
import com.twitter.android.widget.ComposerSelectionFragment;
import com.twitter.android.widget.ComposerPoiFragment;
import com.twitter.android.widget.GalleryGridFragment;
import com.twitter.android.PhotoSelectFragment;
import com.twitter.android.widget.RevealClipFrameLayout;
import com.twitter.library.view.QuoteView;
import com.twitter.android.nativecards.CardPreviewView;
import com.twitter.ui.widget.TwitterButton;
import android.widget.ImageView;
import android.widget.FrameLayout;
import android.widget.Button;
import android.widget.TextView;
import com.twitter.library.media.util.a;
import com.twitter.android.widget.co;
import com.twitter.android.widget.bn;
import com.twitter.android.bd;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.library.media.model.MediaType;
import android.support.v4.app.Fragment;
import com.twitter.android.gi;
import com.twitter.android.gh;
import com.twitter.android.EditImageFragment;
import com.twitter.library.media.model.EditableImage;
import android.view.View;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.android.media.widget.af;

class o implements af
{
    final /* synthetic */ ComposerActivity a;
    
    o(final ComposerActivity a) {
        this.a = a;
    }
    
    @Override
    public void a(final EditableMedia editableMedia) {
        this.a.a(editableMedia.c(), true);
    }
    
    @Override
    public void a(final EditableMedia editableMedia, View view) {
        final MediaType e = editableMedia.e();
        if (editableMedia instanceof EditableImage && this.a.l) {
            this.a.a(0, false);
            this.a.aF = EditImageFragment.a(this.a.q, this.a, view, this.a.O, "composer");
            if (this.a.aF != null) {
                this.a.getSupportFragmentManager().beginTransaction().add(this.a.O.getId(), this.a.aF, "image_edit").commit();
            }
        }
        else if (e == MediaType.b || e == MediaType.d || e == MediaType.e) {
            final ComposerActivity a = this.a;
            if (!this.a.l) {
                view = null;
            }
            a.b(editableMedia, view);
        }
        av.a(e);
        av.b();
    }
}
