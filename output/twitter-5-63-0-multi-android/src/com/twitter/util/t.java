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
import android.view.inputmethod.InputMethodManager;
import android.os.ResultReceiver;
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
import android.view.View;
import android.app.Activity;
import android.os.Looper;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.Handler;

public class t
{
    private static final Handler a;
    private static final AtomicInteger b;
    private static Runnable c;
    private static Constructor d;
    private static Object e;
    private static boolean f;
    
    static {
        a = new Handler(Looper.getMainLooper());
        b = new AtomicInteger(1);
    }
    
    public static int a() {
        int value;
        int n;
        do {
            value = t.b.get();
            n = value + 1;
            if (n > 16777215) {
                n = 1;
            }
        } while (!t.b.compareAndSet(value, n));
        return value;
    }
    
    public static int a(final int n, final int n2) {
        if (n > n2) {
            return (int)Math.ceil((n - n2) / 2);
        }
        return (int)Math.ceil((n2 - n) / 2);
    }
    
    public static int a(final Activity activity) {
        final View decorView = activity.getWindow().getDecorView();
        return decorView.getHeight() - b(decorView.findViewById(16908290), decorView);
    }
    
    public static int a(View view, final View view2) {
        int n = 0;
        while (view != view2) {
            final int n2 = n + view.getLeft();
            view = (View)view.getParent();
            n = n2;
        }
        return n;
    }
    
    public static int a(final CharSequence charSequence, final TextPaint textPaint) {
        return (int)Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
    }
    
    public static Point a(final WindowManager windowManager) {
        final Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point;
    }
    
    public static RectF a(final Activity activity, final View view) {
        final int[] array = new int[2];
        final Rect rect = new Rect();
        if (activity != null) {
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        }
        if (view != null) {
            view.getLocationOnScreen(array);
            final PointF pointF = new PointF((float)array[0], (float)(array[1] - rect.top));
            return new RectF(pointF.x, pointF.y, pointF.x + view.getWidth(), pointF.y + view.getHeight());
        }
        return null;
    }
    
    public static StaticLayout a(final CharSequence charSequence, final int n, final int n2, final TextPaint textPaint, final int n3, final Layout$Alignment layout$Alignment, final float n4, final float n5, final boolean b, final TextUtils$TruncateAt textUtils$TruncateAt, final int n6, final int n7) {
        if (!t.f) {
            t.f = true;
            b();
        }
        if (t.e != null && t.d != null) {
            try {
                return t.d.newInstance(charSequence, n, n2, textPaint, n3, layout$Alignment, t.e, n4, n5, b, textUtils$TruncateAt, n6, n7);
            }
            catch (Exception ex) {
                ErrorReporter.a(ex);
            }
        }
        return null;
    }
    
    public static Size a(final Context context) {
        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return Size.a(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
    
    public static void a(final Context context, final int n) {
        final Toast text = Toast.makeText(context, n, 1);
        text.setGravity(17, 0, 0);
        text.show();
    }
    
    public static void a(final Context context, final View view, final boolean b) {
        a(context, view, b, null);
    }
    
    public static void a(final Context context, final View view, final boolean b, final ResultReceiver resultReceiver) {
        com.twitter.util.d.a();
        if (t.c != null) {
            t.a.removeCallbacks(t.c);
            t.c = null;
        }
        final InputMethodManager inputMethodManager = (InputMethodManager)context.getSystemService("input_method");
        if (inputMethodManager != null && !b(inputMethodManager, view, b, resultReceiver)) {
            t.c = new u(inputMethodManager, view, b, resultReceiver);
            t.a.post(t.c);
        }
    }
    
    public static boolean a(final View view) {
        for (ViewParent viewParent = view.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
            if (viewParent instanceof ListView) {
                return true;
            }
        }
        return false;
    }
    
    public static int b(final Context context) {
        int n = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (n == 0) {
            n = p.status_bar_height_fallback;
        }
        return context.getResources().getDimensionPixelSize(n);
    }
    
    public static int b(View view, final View view2) {
        int n = 0;
        while (view != view2) {
            final int n2 = n + view.getTop();
            view = (View)view.getParent();
            n = n2;
        }
        return n;
    }
    
    public static List b(final View view) {
        final g a = g.a();
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                a.a(b(viewGroup.getChildAt(i)));
            }
        }
        else {
            a.a(view);
        }
        return a.d();
    }
    
    @TargetApi(18)
    private static void b() {
        try {
            Class<?> forName;
            if (Build$VERSION.SDK_INT < 18) {
                forName = Class.forName("android.text.TextDirectionHeuristic");
                t.e = Class.forName("android.text.TextDirectionHeuristics").getField("FIRSTSTRONG_LTR").get(null);
            }
            else {
                t.e = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                forName = TextDirectionHeuristic.class;
            }
            t.d = StaticLayout.class.getConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout$Alignment.class, forName, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils$TruncateAt.class, Integer.TYPE, Integer.TYPE);
        }
        catch (Exception ex) {
            ErrorReporter.a(ex);
        }
    }
    
    private static boolean b(final InputMethodManager inputMethodManager, final View view, final boolean b, final ResultReceiver resultReceiver) {
        t.c = null;
        if (b) {
            return inputMethodManager.showSoftInput(view, 0, resultReceiver);
        }
        return inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0, resultReceiver);
    }
    
    public static boolean c(final View view) {
        final ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup)parent).removeView(view);
            return true;
        }
        return false;
    }
    
    public static Bitmap d(final View view) {
        view.setDrawingCacheEnabled(true);
        Label_0061: {
            try {
                final Bitmap drawingCache = view.getDrawingCache();
                if (drawingCache == null) {
                    break Label_0061;
                }
                try {
                    return Bitmap.createBitmap(drawingCache, 0, 0, drawingCache.getWidth(), drawingCache.getHeight(), (Matrix)null, false);
                }
                finally {
                    drawingCache.recycle();
                }
            }
            catch (OutOfMemoryError outOfMemoryError) {
                return null;
                view.setDrawingCacheEnabled(false);
                return null;
            }
            finally {
                view.setDrawingCacheEnabled(false);
            }
        }
    }
}
