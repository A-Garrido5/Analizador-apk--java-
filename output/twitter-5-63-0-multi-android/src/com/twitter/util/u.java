// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util;

import android.graphics.Matrix;
import android.graphics.Bitmap;
import android.annotation.TargetApi;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.os.Build$VERSION;
import android.view.ViewGroup;
import com.twitter.util.collection.g;
import java.util.List;
import android.view.ViewParent;
import android.widget.ListView;
import android.widget.Toast;
import android.util.DisplayMetrics;
import com.twitter.internal.android.util.Size;
import android.content.Context;
import com.twitter.errorreporter.ErrorReporter;
import android.text.StaticLayout;
import android.text.TextUtils$TruncateAt;
import android.text.Layout$Alignment;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Point;
import android.view.WindowManager;
import android.text.Layout;
import android.text.TextPaint;
import android.app.Activity;
import android.os.Looper;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

final class u implements Runnable
{
    final /* synthetic */ InputMethodManager a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ResultReceiver d;
    
    u(final InputMethodManager a, final View b, final boolean c, final ResultReceiver d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public void run() {
        b(this.a, this.b, this.c, this.d);
    }
}
