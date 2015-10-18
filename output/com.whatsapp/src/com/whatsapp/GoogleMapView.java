// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MotionEvent;
import android.graphics.Canvas;
import android.location.Location;
import android.util.AttributeSet;
import android.content.Context;
import android.view.GestureDetector;
import com.google.android.maps.GeoPoint;
import android.view.GestureDetector$OnGestureListener;
import android.view.GestureDetector$OnDoubleTapListener;
import com.google.android.maps.MapView;

public class GoogleMapView extends MapView implements GestureDetector$OnDoubleTapListener, GestureDetector$OnGestureListener
{
    private ast a;
    private int b;
    private int c;
    private GeoPoint d;
    private GestureDetector e;
    
    public GoogleMapView(final Context context) {
        super(context, context.getString(2131232089));
        this.d = new GeoPoint(0, 0);
        this.c = 0;
        this.b = 0;
        this.a();
    }
    
    public GoogleMapView(final Context context, final AttributeSet set) {
        super(context, set);
        this.d = new GeoPoint(0, 0);
        this.c = 0;
        this.b = 0;
        this.a();
    }
    
    public GoogleMapView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.d = new GeoPoint(0, 0);
        this.c = 0;
        this.b = 0;
        this.a();
    }
    
    public static GeoPoint a(final Location location) {
        return new GeoPoint((int)(1000000.0 * location.getLatitude()), (int)(1000000.0 * location.getLongitude()));
    }
    
    private void a() {
        (this.e = new GestureDetector((GestureDetector$OnGestureListener)this)).setOnDoubleTapListener((GestureDetector$OnDoubleTapListener)this);
    }
    
    public static Location b(final GeoPoint geoPoint) {
        final Location location = new Location("");
        location.setLatitude(geoPoint.getLatitudeE6() / 1000000.0);
        location.setLongitude(geoPoint.getLongitudeE6() / 1000000.0);
        return location;
    }
    
    public void a(final GeoPoint center) {
        if (center == null) {
            return;
        }
        try {
            this.getController().animateTo(center);
        }
        catch (Exception ex) {
            try {
                this.getController().setCenter(center);
            }
            catch (Exception ex2) {}
        }
    }
    
    public int b() {
        final Location b = b(this.getMapCenter());
        return (int)Math.min(b.distanceTo(b(this.getProjection().fromPixels(this.getWidth() / 2, 0))), b.distanceTo(b(this.getProjection().fromPixels(0, this.getHeight() / 2))));
    }
    
    public Location c() {
        return b(this.getMapCenter());
    }
    
    public void dispatchDraw(final Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.a != null) {
            final GeoPoint mapCenter = this.getMapCenter();
            final int latitudeSpan = this.getLatitudeSpan();
            final int longitudeSpan = this.getLongitudeSpan();
            if (!this.d.equals((Object)mapCenter) || this.c != latitudeSpan || this.b != longitudeSpan) {
                this.d = mapCenter;
                this.c = latitudeSpan;
                this.b = longitudeSpan;
                this.a.a(mapCenter, latitudeSpan, longitudeSpan);
            }
        }
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        this.e.onTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
    
    public boolean onDoubleTap(final MotionEvent motionEvent) {
        return this.getController().zoomInFixing((int)motionEvent.getX(), (int)motionEvent.getY());
    }
    
    public boolean onDoubleTapEvent(final MotionEvent motionEvent) {
        return false;
    }
    
    public boolean onDown(final MotionEvent motionEvent) {
        return false;
    }
    
    public boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        return false;
    }
    
    public void onLongPress(final MotionEvent motionEvent) {
    }
    
    public boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        return false;
    }
    
    public void onShowPress(final MotionEvent motionEvent) {
    }
    
    public boolean onSingleTapConfirmed(final MotionEvent motionEvent) {
        return false;
    }
    
    public boolean onSingleTapUp(final MotionEvent motionEvent) {
        return false;
    }
    
    public void setMapListener(final ast a) {
        this.a = a;
    }
}
