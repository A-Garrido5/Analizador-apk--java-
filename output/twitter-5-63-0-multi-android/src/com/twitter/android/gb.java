// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.util.concurrent.Executor;
import com.twitter.library.media.widget.g;
import com.twitter.library.media.manager.l;
import com.twitter.library.media.decoder.c;
import com.twitter.library.media.manager.j;
import java.util.ArrayList;
import java.util.List;
import com.twitter.library.util.ReferenceMap;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.support.v4.view.PagerAdapter;
import android.os.Parcelable;
import com.twitter.library.media.util.ImageOrientation;
import com.twitter.library.media.widget.CroppableImageView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.SharedPreferences;
import com.twitter.library.util.bk;
import android.preference.PreferenceManager;
import android.graphics.drawable.TransitionDrawable;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.android.media.widget.t;
import android.content.Context;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.client.Session;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import java.util.Iterator;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Matrix$ScaleToFit;
import android.graphics.Matrix;
import com.twitter.library.media.model.ImageFile;
import android.graphics.Rect;
import android.graphics.RectF;
import com.twitter.util.concurrent.i;
import java.util.concurrent.Future;
import android.widget.Toast;
import com.twitter.android.widget.RevealClipFrameLayout;
import android.os.Bundle;
import java.util.WeakHashMap;
import android.widget.TextView;
import android.widget.ImageButton;
import com.twitter.media.filters.Filters;
import com.twitter.android.media.widget.FilterFilmstripView;
import java.util.Map;
import android.view.View$OnClickListener;
import com.twitter.library.client.AbsFragment;
import com.twitter.library.media.widget.e;
import com.twitter.library.media.model.EditableImage;
import android.view.View;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.media.widget.FilteredImageView;
import com.twitter.util.concurrent.d;

class gb implements d
{
    final /* synthetic */ FilteredImageView a;
    final /* synthetic */ MediaImageView b;
    final /* synthetic */ View c;
    final /* synthetic */ int d;
    final /* synthetic */ ga e;
    
    gb(final ga e, final FilteredImageView a, final MediaImageView b, final View c, final int d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public void a(final EditableImage editableImage) {
        if (editableImage != null) {
            final gg tag = new gg(this.e, this.a, this.b, editableImage, null);
            this.c.setTag((Object)tag);
            this.e.a(this.a, editableImage, this.d == this.e.a.z);
            this.b.setOnImageLoadedListener(new gc(this));
            this.e.a(tag, this.d);
            this.e.a(tag.b, tag.c);
            if (this.d == this.e.d) {
                if (this.e.j) {
                    this.e.b();
                    this.e.j = false;
                }
                this.e.a.a(editableImage);
            }
        }
    }
}
