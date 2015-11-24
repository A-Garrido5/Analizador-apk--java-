// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

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
import com.twitter.media.filters.d;
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
import android.graphics.Bitmap;
import com.twitter.library.media.widget.BaseMediaImageView;
import com.twitter.library.media.widget.FilteredImageView;
import com.twitter.library.media.widget.e;

class gf implements e
{
    final /* synthetic */ FilteredImageView a;
    final /* synthetic */ ga b;
    
    gf(final ga b, final FilteredImageView a) {
        this.b = b;
        this.a = a;
    }
    
    public void a(final FilteredImageView filteredImageView, final Bitmap bitmap) {
        if (bitmap != null) {
            this.b.g = true;
            this.a.setOnImageLoadedListener(null);
        }
    }
}
