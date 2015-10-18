// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.content.res.TypedArray;
import android.support.v7.internal.view.ContextThemeWrapper;
import android.support.v7.appcompat.R$styleable;
import android.util.AttributeSet;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.graphics.Rect;
import android.view.View;
import android.os.Build$VERSION;
import java.lang.reflect.Method;

public class ViewUtils
{
    private static Method sComputeFitSystemWindowsMethod;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[11];
        String s = "w\u001ara\u0012\u0014\u001bhyV]\u001bqb\u001dQUjl\u001dQ:wy\u001f[\u001bfa0]\u0001t^\u000fG\u0001b`!]\u001bcb\u0001G";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String z3 = null;
    Label_0279:
        while (true) {
            z3 = z(z(s));
            switch (n) {
                default: {
                    array[n2] = z3;
                    s = "b\u001cbz#@\u001ck~";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = z3;
                    s = "b\u001cbz#@\u001ck~";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = z3;
                    s = "w\u001ara\u0012\u0014\u001bhyV]\u001bqb\u001dQUjl\u001dQ:wy\u001f[\u001bfa0]\u0001t^\u000fG\u0001b`!]\u001bcb\u0001G";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = z3;
                    s = "b\u001cbz#@\u001ck~";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = z3;
                    n2 = 5;
                    array = z2;
                    s = "w\u001ara\u0012\u0014\u001bhyVR\u001ciiVY\u0010se\u0019PUjl\u001dQ:wy\u001f[\u001bfa0]\u0001t^\u000fG\u0001b`!]\u001bcb\u0001G['B\u001e\u0014\u0002ba\u001a\u001a[)";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = z3;
                    n2 = 6;
                    s = "Y\u0014lh9D\u0001nb\u0018U\u0019Ad\u0002G&~~\u0002Q\u0018Pd\u0018P\u001ap~";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = z3;
                    n2 = 7;
                    s = "w\u001ara\u0012\u0014\u001bhyV]\u001bqb\u001dQUdb\u001bD\u0000sh0]\u0001Tt\u0005@\u0010jZ\u001fZ\u0011hz\u0005";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = z3;
                    n2 = 8;
                    s = "b\u001cbz#@\u001ck~";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = z3;
                    n2 = 9;
                    s = "U\u0005w7\u0002\\\u0010jhV]\u0006'c\u0019CUch\u0006F\u0010dl\u0002Q\u0011)-&X\u0010f~\u0013\u0014\u0018h{\u0013\u0014\u0001h-\u0003G\u001cijVU\u001bc\u007f\u0019]\u0011=y\u001eQ\u0018b-\u001fZ\u0006sh\u0017P[";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = z3;
                    n2 = 10;
                    s = "b\u001cbz#@\u001ck~";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0279;
                }
            }
        }
        array[n2] = z3;
        z = z2;
        if (Build$VERSION.SDK_INT < 18) {
            return;
        }
        final String z4 = z(z("W\u001aj}\u0003@\u0010Ad\u0002g\fty\u0013Y\"nc\u0012[\u0002t"));
        try {
            ViewUtils.sComputeFitSystemWindowsMethod = View.class.getDeclaredMethod(z4, Rect.class, Rect.class);
            if (!ViewUtils.sComputeFitSystemWindowsMethod.isAccessible()) {
                ViewUtils.sComputeFitSystemWindowsMethod.setAccessible(true);
            }
        }
        catch (NoSuchMethodException ex) {
            Log.d(z(z("b\u001cbz#@\u001ck~")), z(z("w\u001ara\u0012\u0014\u001bhyVR\u001ciiVY\u0010se\u0019PUdb\u001bD\u0000sh0]\u0001Tt\u0005@\u0010jZ\u001fZ\u0011hz\u0005\u001aUHeVC\u0010kaX")));
        }
    }
    
    public static int combineMeasuredStates(final int n, final int n2) {
        return n | n2;
    }
    
    public static void computeFitSystemWindows(final View view, final Rect rect, final Rect rect2) {
        if (ViewUtils.sComputeFitSystemWindowsMethod == null) {
            return;
        }
        try {
            ViewUtils.sComputeFitSystemWindowsMethod.invoke(view, rect, rect2);
        }
        catch (Exception ex) {
            Log.d(ViewUtils.z[8], ViewUtils.z[7], (Throwable)ex);
        }
    }
    
    public static boolean isLayoutRtl(final View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }
    
    public static void makeOptionalFitsSystemWindows(final View view) {
        if (Build$VERSION.SDK_INT >= 16) {
            try {
                final Method method = view.getClass().getMethod(ViewUtils.z[6], (Class<?>[])new Class[0]);
                try {
                    if (!method.isAccessible()) {
                        method.setAccessible(true);
                    }
                    method.invoke(view, new Object[0]);
                }
                catch (NoSuchMethodException ex) {
                    throw ex;
                }
            }
            catch (NoSuchMethodException ex4) {
                Log.d(ViewUtils.z[2], ViewUtils.z[5]);
            }
            catch (InvocationTargetException ex2) {
                Log.d(ViewUtils.z[4], ViewUtils.z[0], (Throwable)ex2);
            }
            catch (IllegalAccessException ex3) {
                Log.d(ViewUtils.z[1], ViewUtils.z[3], (Throwable)ex3);
            }
        }
    }
    
    public static Context themifyContext(Context context, final AttributeSet set, final boolean b, final boolean b2) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, R$styleable.View, 0, 0);
        int n;
        if (b) {
            n = obtainStyledAttributes.getResourceId(R$styleable.View_android_theme, 0);
        }
        else {
            n = 0;
        }
        if (b2 && n == 0) {
            n = obtainStyledAttributes.getResourceId(R$styleable.View_theme, 0);
            if (n != 0) {
                Log.i(ViewUtils.z[10], ViewUtils.z[9]);
            }
        }
        final int n2 = n;
        obtainStyledAttributes.recycle();
        if (n2 != 0 && (!(context instanceof ContextThemeWrapper) || ((ContextThemeWrapper)context).getThemeResId() != n2)) {
            context = (Context)new ContextThemeWrapper(context, n2);
        }
        return context;
    }
    
    private static String z(final char[] array) {
        for (int i = array.length, n = 0; i > n; ++n) {
            final char c = array[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'v';
                    break;
                }
                case 0: {
                    c2 = '4';
                    break;
                }
                case 1: {
                    c2 = 'u';
                    break;
                }
                case 2: {
                    c2 = '\u0007';
                    break;
                }
                case 3: {
                    c2 = '\r';
                    break;
                }
            }
            array[n] = (char)(c2 ^ c);
        }
        return new String(array).intern();
    }
    
    private static char[] z(final String s) {
        final char[] charArray = s.toCharArray();
        if (charArray.length < 2) {
            charArray[0] ^= 'v';
        }
        return charArray;
    }
}
