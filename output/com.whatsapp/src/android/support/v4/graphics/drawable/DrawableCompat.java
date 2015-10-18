// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.graphics.drawable;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.support.v4.app.FragmentActivity;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;

public class DrawableCompat
{
    static final DrawableCompat$DrawableImpl IMPL;
    public static boolean a;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 22) {
            IMPL = new DrawableCompat$LollipopMr1DrawableImpl();
            return;
        }
        if (sdk_INT >= 21) {
            IMPL = new DrawableCompat$LollipopDrawableImpl();
            return;
        }
        if (sdk_INT >= 19) {
            IMPL = new DrawableCompat$KitKatDrawableImpl();
            return;
        }
        if (sdk_INT >= 11) {
            IMPL = new DrawableCompat$HoneycombDrawableImpl();
            return;
        }
        IMPL = new DrawableCompat$BaseDrawableImpl();
    }
    
    public static boolean isAutoMirrored(final Drawable drawable) {
        return DrawableCompat.IMPL.isAutoMirrored(drawable);
    }
    
    public static void jumpToCurrentState(final Drawable drawable) {
        DrawableCompat.IMPL.jumpToCurrentState(drawable);
    }
    
    public static void setAutoMirrored(final Drawable drawable, final boolean b) {
        DrawableCompat.IMPL.setAutoMirrored(drawable, b);
    }
    
    public static void setHotspot(final Drawable drawable, final float n, final float n2) {
        DrawableCompat.IMPL.setHotspot(drawable, n, n2);
    }
    
    public static void setHotspotBounds(final Drawable drawable, final int n, final int n2, final int n3, final int n4) {
        final boolean a = DrawableCompat.a;
        DrawableCompat.IMPL.setHotspotBounds(drawable, n, n2, n3, n4);
        if (a) {
            ++FragmentActivity.a;
        }
    }
    
    public static void setTint(final Drawable drawable, final int n) {
        DrawableCompat.IMPL.setTint(drawable, n);
    }
    
    public static void setTintList(final Drawable drawable, final ColorStateList list) {
        DrawableCompat.IMPL.setTintList(drawable, list);
    }
    
    public static void setTintMode(final Drawable drawable, final PorterDuff$Mode porterDuff$Mode) {
        DrawableCompat.IMPL.setTintMode(drawable, porterDuff$Mode);
    }
    
    public static Drawable unwrap(Drawable wrappedDrawable) {
        if (wrappedDrawable instanceof DrawableWrapper) {
            wrappedDrawable = ((DrawableWrapper)wrappedDrawable).getWrappedDrawable();
        }
        return wrappedDrawable;
    }
    
    public static Drawable wrap(final Drawable drawable) {
        return DrawableCompat.IMPL.wrap(drawable);
    }
}
