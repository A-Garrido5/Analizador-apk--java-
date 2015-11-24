// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

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
import com.twitter.library.media.model.EditableImage;
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
import android.content.Context;
import com.twitter.ui.widget.Tooltip;
import android.view.View;

class fz implements Runnable
{
    final /* synthetic */ View a;
    final /* synthetic */ EditImageFragment b;
    
    fz(final EditImageFragment b, final View a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        Tooltip.a((Context)this.b.getActivity(), this.a.getId()).d(2131886671).a(2131296997).c(0).a(true).a(this.b.getFragmentManager(), "tooltip");
        this.b.e.a();
    }
}
