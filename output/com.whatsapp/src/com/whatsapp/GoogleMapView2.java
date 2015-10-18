// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.location.Location;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.CameraPosition;
import android.view.MotionEvent;
import android.hardware.Sensor;
import android.view.WindowManager;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.GoogleMapOptions;
import android.util.AttributeSet;
import android.content.Context;
import android.hardware.SensorManager;
import android.hardware.SensorEventListener;
import android.view.Display;
import android.annotation.TargetApi;
import com.google.android.gms.maps.MapView;

@TargetApi(8)
public class GoogleMapView2 extends MapView
{
    private static final String[] z;
    private float[] b;
    private float c;
    private int d;
    private float e;
    private boolean f;
    private float[] g;
    private long h;
    private float i;
    private Display j;
    private SensorEventListener k;
    private SensorManager l;
    private float[] m;
    
    static {
        final String[] z2 = new String[2];
        String s = "\t\u001a_\u000e<\t";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'S';
                        break;
                    }
                    case 0: {
                        c2 = '~';
                        break;
                    }
                    case 1: {
                        c2 = 's';
                        break;
                    }
                    case 2: {
                        c2 = '1';
                        break;
                    }
                    case 3: {
                        c2 = 'j';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "\r\u0016_\u0019<\f";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public GoogleMapView2(final Context context) {
        super(context);
        this.d = 2;
        this.b = new float[16];
        this.m = new float[3];
        this.g = new float[3];
        this.k = (SensorEventListener)new a8i(this);
        this.a(context);
    }
    
    public GoogleMapView2(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = 2;
        this.b = new float[16];
        this.m = new float[3];
        this.g = new float[3];
        this.k = (SensorEventListener)new a8i(this);
        this.a(context);
    }
    
    public GoogleMapView2(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d = 2;
        this.b = new float[16];
        this.m = new float[3];
        this.g = new float[3];
        this.k = (SensorEventListener)new a8i(this);
        this.a(context);
    }
    
    public GoogleMapView2(final Context context, final GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
        this.d = 2;
        this.b = new float[16];
        this.m = new float[3];
        this.g = new float[3];
        this.k = (SensorEventListener)new a8i(this);
        this.a(context);
    }
    
    private float a(float n, final float n2) {
        float n3 = 1.0f;
        final boolean i = App.I;
        final long currentTimeMillis = System.currentTimeMillis();
        final float n4 = (currentTimeMillis - this.h) / 400.0f;
        if (n4 <= n3) {
            n3 = n4;
        }
        this.h = currentTimeMillis;
        if (Math.abs(n - n2) < 180.0f) {
            if (Math.abs(n - n2) > 60.0f && !i) {
                return n;
            }
            final float n5 = n2 + n3 * (n - n2);
            if (!i) {
                return n5;
            }
        }
        if (360.0 - Math.abs(n - n2) <= 60.0 || i) {
            if (n2 > n) {
                final float n5 = (360.0f + (n2 + n3 * ((360.0f + n - n2) % 360.0f))) % 360.0f;
                if (!i) {
                    return n5;
                }
            }
            n = (360.0f + (n2 - n3 * ((n2 + (360.0f - n)) % 360.0f))) % 360.0f;
        }
        return n;
    }
    
    public static float a(final float n, final float n2, final float n3) {
        return Math.max(Math.min(n, n3), n2);
    }
    
    static float a(final GoogleMapView2 googleMapView2) {
        return googleMapView2.e;
    }
    
    static float a(final GoogleMapView2 googleMapView2, final float i) {
        return googleMapView2.i = i;
    }
    
    static float a(final GoogleMapView2 googleMapView2, final float n, final float n2) {
        return googleMapView2.a(n, n2);
    }
    
    static int a(final GoogleMapView2 googleMapView2, final int d) {
        return googleMapView2.d = d;
    }
    
    public static LatLng a(final LatLng latLng, final double n, final double n2) {
        final double n3 = n / 6378137.0;
        final double radians = Math.toRadians(n2);
        final double radians2 = Math.toRadians(latLng.latitude);
        final double radians3 = Math.toRadians(latLng.longitude);
        final double cos = Math.cos(n3);
        final double sin = Math.sin(n3);
        final double sin2 = Math.sin(radians2);
        final double cos2 = Math.cos(radians2);
        final double n4 = cos * sin2 + sin * cos2 * Math.cos(radians);
        return new LatLng(Math.toDegrees(Math.asin(n4)), Math.toDegrees(Math.atan2(sin * cos2 * Math.sin(radians), cos - sin2 * n4) + radians3));
    }
    
    private void a(final Context context) {
        this.l = (SensorManager)context.getSystemService(GoogleMapView2.z[1]);
        this.j = ((WindowManager)context.getSystemService(GoogleMapView2.z[0])).getDefaultDisplay();
    }
    
    static float b(final GoogleMapView2 googleMapView2, final float e) {
        return googleMapView2.e = e;
    }
    
    static float[] b(final GoogleMapView2 googleMapView2) {
        return googleMapView2.b;
    }
    
    static float[] c(final GoogleMapView2 googleMapView2) {
        return googleMapView2.m;
    }
    
    static Display d(final GoogleMapView2 googleMapView2) {
        return googleMapView2.j;
    }
    
    static int e(final GoogleMapView2 googleMapView2) {
        return googleMapView2.d;
    }
    
    static float f(final GoogleMapView2 googleMapView2) {
        return googleMapView2.i;
    }
    
    static float g(final GoogleMapView2 googleMapView2) {
        return googleMapView2.c;
    }
    
    static float[] h(final GoogleMapView2 googleMapView2) {
        return googleMapView2.g;
    }
    
    public void a() {
        if (this.l != null) {
            final Sensor defaultSensor = this.l.getDefaultSensor(11);
            this.f = (defaultSensor != null);
            if (defaultSensor != null) {
                this.l.registerListener(this.k, defaultSensor, 16000);
            }
        }
    }
    
    public void a(final int n) {
    }
    
    public void b() {
        final boolean i = App.I;
        Label_0055: {
            switch (this.d) {
                case 0: {
                    this.setLocationMode(1);
                    if (i) {
                        break Label_0055;
                    }
                    break;
                }
                case 1: {
                    this.setLocationMode(0);
                    if (i) {
                        break Label_0055;
                    }
                    break;
                }
                case 2: {
                    this.setLocationMode(1);
                }
            }
        }
    }
    
    public void c() {
        if (this.l != null) {
            this.l.unregisterListener(this.k);
        }
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        if (this.d != 2) {
            this.a(this.d = 2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }
    
    public void setLocationMode(final int n) {
        final boolean i = App.I;
        final CameraPosition cameraPosition = this.getMap().getCameraPosition();
        Label_0307: {
            switch (n) {
                case 0: {
                    if (!this.f) {
                        break;
                    }
                    this.c = cameraPosition.zoom;
                    this.a(0);
                    final Location myLocation = this.getMap().getMyLocation();
                    LatLng target = null;
                    Label_0104: {
                        if (myLocation != null) {
                            target = new LatLng(myLocation.getLatitude(), myLocation.getLongitude());
                            if (!i) {
                                break Label_0104;
                            }
                        }
                        target = cameraPosition.target;
                    }
                    if (target != null) {
                        this.getMap().animateCamera(CameraUpdateFactory.newCameraPosition(CameraPosition.builder().tilt(a(this.i, 0.0f, 67.5f)).bearing(this.e).zoom(Math.max(this.c, 15.0f)).target(a(target, 50.0, this.e)).build()));
                    }
                    this.postDelayed((Runnable)new cn(this), 1000L);
                    if (i) {
                        break Label_0307;
                    }
                    break;
                }
                case 1: {
                    final Location myLocation2 = this.getMap().getMyLocation();
                    LatLng target2 = null;
                    Label_0255: {
                        if (myLocation2 != null) {
                            target2 = new LatLng(myLocation2.getLatitude(), myLocation2.getLongitude());
                            this.d = 1;
                            if (!i) {
                                break Label_0255;
                            }
                        }
                        target2 = cameraPosition.target;
                        this.d = 2;
                    }
                    this.getMap().animateCamera(CameraUpdateFactory.newCameraPosition(CameraPosition.builder().target(target2).zoom(cameraPosition.zoom).tilt(0.0f).bearing(0.0f).build()));
                    this.a(this.d);
                    if (i) {
                        break Label_0307;
                    }
                    break;
                }
                case 2: {
                    this.a(this.d = 2);
                }
            }
        }
    }
}
