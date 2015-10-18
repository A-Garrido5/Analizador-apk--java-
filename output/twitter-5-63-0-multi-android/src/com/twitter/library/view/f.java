// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import java.util.TimerTask;
import java.util.Timer;
import com.twitter.library.media.manager.q;
import java.util.ArrayList;
import com.twitter.library.util.bk;
import java.util.concurrent.Future;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import android.graphics.drawable.BitmapDrawable;
import com.twitter.library.media.manager.p;
import android.graphics.Bitmap;
import com.twitter.library.media.manager.k;
import android.text.SpannableStringBuilder;
import com.twitter.library.provider.Tweet;
import java.util.LinkedHashMap;
import android.content.Context;
import com.twitter.internal.android.util.Size;
import java.util.Map;
import com.twitter.library.featureswitch.d;
import com.twitter.library.featureswitch.n;

final class f implements n
{
    @Override
    public void a(final long n) {
        e.g = d.f("hashflags_settings_enabled");
        e.i = d.g("hashflags_settings_location_prefix");
        final int a = d.a("hashflags_settings_version", 0);
        if (a == 0 || a != e.k) {
            g();
            h();
            e.k = a;
        }
    }
}
