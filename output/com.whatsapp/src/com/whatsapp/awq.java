// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.google.android.maps.Projection;
import android.graphics.Paint$Style;
import com.google.android.maps.GeoPoint;
import android.location.Location;
import android.graphics.Canvas;
import com.google.android.maps.MapView;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Paint;
import android.os.Handler;
import android.graphics.drawable.Drawable;
import com.google.android.maps.MyLocationOverlay;

public class awq extends MyLocationOverlay
{
    private Drawable a;
    private Handler b;
    private Paint c;
    private Drawable d;
    private Point e;
    private Drawable f;
    private Point g;
    
    public awq(final Context context, final MapView mapView) {
        super(context, mapView);
        this.g = new Point();
        this.e = new Point();
        this.a = context.getResources().getDrawable(2130838890);
        this.d = context.getResources().getDrawable(2130838891);
        this.f = this.a;
        (this.c = new Paint()).setAntiAlias(true);
        this.c.setStrokeWidth(2.0f);
        (this.b = new pl(this, mapView)).sendEmptyMessageDelayed(0, 500L);
    }
    
    static Drawable a(final awq awq) {
        return awq.f;
    }
    
    static Drawable a(final awq awq, final Drawable f) {
        return awq.f = f;
    }
    
    static Drawable b(final awq awq) {
        return awq.d;
    }
    
    static Drawable c(final awq awq) {
        return awq.a;
    }
    
    public void disableMyLocation() {
        super.disableMyLocation();
        this.b.removeMessages(0);
    }
    
    protected void drawMyLocation(final Canvas canvas, final MapView mapView, final Location location, final GeoPoint geoPoint, final long n) {
        final int intrinsicWidth = this.f.getIntrinsicWidth();
        final int intrinsicHeight = this.f.getIntrinsicHeight();
        final Projection projection = mapView.getProjection();
        final double latitude = location.getLatitude();
        final double longitude = location.getLongitude();
        final float accuracy = location.getAccuracy();
        final float[] array = { 0.0f };
        Location.distanceBetween(latitude, longitude, latitude, longitude + 1.0, array);
        projection.toPixels(new GeoPoint((int)(latitude * 1000000.0), (int)(1000000.0 * (longitude - accuracy / array[0]))), this.e);
        projection.toPixels(geoPoint, this.g);
        final int n2 = this.g.x - this.e.x;
        this.c.setColor(-10066177);
        this.c.setStyle(Paint$Style.STROKE);
        canvas.drawCircle((float)this.g.x, (float)this.g.y, (float)n2, this.c);
        this.c.setColor(409364223);
        this.c.setStyle(Paint$Style.FILL);
        canvas.drawCircle((float)this.g.x, (float)this.g.y, (float)n2, this.c);
        this.f.setBounds(this.g.x - intrinsicWidth / 2, this.g.y - intrinsicHeight / 2, this.g.x + intrinsicWidth / 2, this.g.y + intrinsicHeight / 2);
        this.f.draw(canvas);
    }
}
