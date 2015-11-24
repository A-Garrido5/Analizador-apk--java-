// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.res.TypedArray;
import android.os.Parcelable;
import android.graphics.drawable.TransitionDrawable;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.client.Session;
import com.twitter.library.scribe.ScribeService;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Matrix$ScaleToFit;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.widget.Toast;
import com.twitter.android.widget.RevealClipFrameLayout;
import android.os.Bundle;
import java.util.WeakHashMap;
import android.widget.TextView;
import android.widget.ImageButton;
import java.util.Map;
import android.view.View$OnClickListener;
import com.twitter.library.client.AbsFragment;
import com.twitter.util.concurrent.i;
import java.util.concurrent.Future;
import java.util.concurrent.Executor;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.library.media.model.ImageFile;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.TwitterScribeLog;
import java.util.Iterator;
import android.content.SharedPreferences;
import com.twitter.library.util.bk;
import android.preference.PreferenceManager;
import com.twitter.android.media.widget.FilterFilmstripView;
import android.view.View;
import com.twitter.library.media.widget.g;
import com.twitter.library.media.util.ImageOrientation;
import com.twitter.library.media.widget.CroppableImageView;
import com.twitter.media.filters.Filters;
import com.twitter.library.media.widget.e;
import com.twitter.library.media.manager.l;
import com.twitter.library.media.decoder.c;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.media.model.EditableImage;
import java.util.ArrayList;
import android.graphics.RectF;
import java.util.List;
import com.twitter.library.util.ReferenceMap;
import android.content.Context;
import com.twitter.android.media.widget.t;
import android.support.v4.view.ViewPager$OnPageChangeListener;
import android.support.v4.view.PagerAdapter;
import com.twitter.library.media.widget.FilteredImageView;
import com.twitter.media.filters.d;

class ge implements d
{
    final /* synthetic */ FilteredImageView a;
    final /* synthetic */ ga b;
    
    ge(final ga b, final FilteredImageView a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a() {
        if (this.b.g) {
            if (this.b.a.p != null) {
                this.b.a.p.a();
            }
            this.a.setFilterRenderListener(null);
        }
    }
}
