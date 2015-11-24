// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.MotionEvent;
import android.os.Build$VERSION;
import android.os.Handler;
import android.view.GestureDetector$OnGestureListener;
import android.content.Context;

public class GestureDetectorCompat
{
    private final GestureDetectorCompat$GestureDetectorCompatImpl mImpl;
    
    public GestureDetectorCompat(final Context context, final GestureDetector$OnGestureListener gestureDetector$OnGestureListener, final Handler handler) {
        if (Build$VERSION.SDK_INT > 17) {
            this.mImpl = new GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2(context, gestureDetector$OnGestureListener, handler);
            if (ViewPager.a == 0) {
                return;
            }
        }
        this.mImpl = new GestureDetectorCompat$GestureDetectorCompatImplBase(context, gestureDetector$OnGestureListener, handler);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return this.mImpl.onTouchEvent(motionEvent);
    }
}
