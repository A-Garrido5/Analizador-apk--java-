// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.MotionEvent;
import android.os.Handler;
import android.view.GestureDetector$OnGestureListener;
import android.content.Context;
import android.view.GestureDetector;

class GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2 implements GestureDetectorCompat$GestureDetectorCompatImpl
{
    private final GestureDetector mDetector;
    
    public GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2(final Context context, final GestureDetector$OnGestureListener gestureDetector$OnGestureListener, final Handler handler) {
        this.mDetector = new GestureDetector(context, gestureDetector$OnGestureListener, handler);
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return this.mDetector.onTouchEvent(motionEvent);
    }
}
