// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.os.Build;
import android.content.pm.PackageManager;
import com.twitter.library.featureswitch.d;
import android.os.Build$VERSION;
import android.view.View;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import android.hardware.Camera$Size;

public class l
{
    public static final float[] a;
    
    static {
        a = new float[] { 0.0f, 0.2f, Float.MAX_VALUE };
    }
    
    private static float a(final int n, final Camera$Size camera$Size) {
        final int min = Math.min(camera$Size.width, camera$Size.height);
        if (min >= n) {
            return min - n;
        }
        if (min / n < 0.9f) {
            return 5.0f * (n - min);
        }
        return n - min;
    }
    
    public static float a(final Camera$Size camera$Size) {
        final float n = camera$Size.width;
        final float n2 = camera$Size.height;
        if (n < n2) {
            return n / n2;
        }
        return n2 / n;
    }
    
    public static int a(final int n) {
        final int n2 = n % 360;
        if (n2 >= 0) {
            return n2;
        }
        return n2 + 360;
    }
    
    public static int a(final int n, int n2) {
        int n3 = 1;
        if (n2 != -1) {
            final int abs = Math.abs(n - n2);
            if (Math.min(abs, 360 - abs) < 50) {
                n3 = 0;
            }
        }
        if (n3 != 0) {
            n2 = 90 * ((n + 45) / 90) % 360;
        }
        return n2;
    }
    
    public static Camera$Size a(final List list, final int n, final float n2) {
        if (list != null) {
            final float[] a = l.a;
            final int length = a.length;
            int i = 0;
            float n3 = Float.MAX_VALUE;
            Camera$Size camera$Size = null;
            while (i < length) {
                final float n4 = a[i];
                final Iterator<Camera$Size> iterator = list.iterator();
                Camera$Size camera$Size2 = camera$Size;
                float a2 = n3;
                while (iterator.hasNext()) {
                    final Camera$Size camera$Size3 = iterator.next();
                    final float a3 = a(camera$Size3);
                    if (Math.abs(a3 - n2) <= n4) {
                        if (camera$Size2 == null) {
                            a2 = a(n, camera$Size3);
                            camera$Size2 = camera$Size3;
                        }
                        else {
                            final float a4 = a(camera$Size2);
                            final float abs = Math.abs(a3 - n2);
                            final float abs2 = Math.abs(a4 - n2);
                            boolean b;
                            if (Math.abs(a3 - a4) < a4 * 0.05f) {
                                b = true;
                            }
                            else {
                                b = false;
                            }
                            final float a5 = a(n, camera$Size3);
                            Camera$Size camera$Size4;
                            float n5;
                            if (abs < abs2 || (b && a5 < a2)) {
                                camera$Size4 = camera$Size3;
                                n5 = a5;
                            }
                            else {
                                n5 = a2;
                                camera$Size4 = camera$Size2;
                            }
                            camera$Size2 = camera$Size4;
                            a2 = n5;
                        }
                    }
                }
                if (camera$Size2 != null) {
                    return camera$Size2;
                }
                ++i;
                n3 = a2;
                camera$Size = camera$Size2;
            }
            return camera$Size;
        }
        return null;
    }
    
    public static void a(final int n, final String s, final long n2, final Context context) {
        String s2;
        if (n == 0 || n == 180) {
            s2 = "portrait";
        }
        else {
            s2 = "landscape";
        }
        ScribeService.a(context, new TwitterScribeLog(n2).b(new String[] { "twitter_camera::" + s + ":rotate:" + s2 }));
    }
    
    public static void a(final View view, final int n, final int n2, final int n3) {
        view.clearAnimation();
        if (view.getRotation() == n) {
            return;
        }
        if (view.getVisibility() != 0 || n2 == 0) {
            view.setRotation((float)n);
            return;
        }
        view.post((Runnable)new m(n, view, n2, n3));
    }
    
    public static boolean a() {
        return Build$VERSION.SDK_INT >= 16 && d.a("video_compose_enabled", true) && d.a("video_compose_capture_enabled", true);
    }
    
    public static boolean a(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.camera") || packageManager.hasSystemFeature("android.hardware.camera.front");
    }
    
    public static boolean a(final View view, final int n, final int n2) {
        return n >= 0 && n < view.getWidth() && n2 >= 0 && n2 < view.getHeight();
    }
    
    public static int[] a(final List list) {
        int[] array = null;
        if (list != null) {
            int n = Integer.MAX_VALUE;
            final Iterator<int[]> iterator = list.iterator();
            int n2 = 0;
            while (iterator.hasNext()) {
                int[] array2 = iterator.next();
                final int n3 = array2[0];
                final int n4 = array2[1];
                int n5;
                int n6;
                if (n4 >= 30000 && n3 <= 30000 && (n3 < n || (n3 == n && n4 > n2))) {
                    n5 = n4;
                    n6 = n3;
                }
                else {
                    array2 = array;
                    n5 = n2;
                    n6 = n;
                }
                n = n6;
                n2 = n5;
                array = array2;
            }
        }
        return array;
    }
    
    public static boolean b() {
        return Build.MANUFACTURER.equals("samsung") && (Build.DEVICE.equals("d2att") || Build.DEVICE.equals("d2cri") || Build.DEVICE.equals("d2lte") || Build.DEVICE.equals("d2mtr") || Build.DEVICE.equals("d2spr") || Build.DEVICE.equals("d2mo") || Build.DEVICE.equals("d2usc") || Build.DEVICE.equals("d2vzw"));
    }
    
    public static boolean c() {
        return Build.MANUFACTURER.equals("samsung") && (Build.DEVICE.equals("galaxys2") || Build.DEVICE.equals("galaxys2att") || Build.DEVICE.equals("d710"));
    }
    
    public static boolean d() {
        return d.f("video_compose_capture_landscape_enabled");
    }
}
