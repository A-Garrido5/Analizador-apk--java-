// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.MotionEvent;
import android.os.Build$VERSION;

public class MotionEventCompat
{
    static final MotionEventCompat$MotionEventVersionImpl IMPL;
    
    static {
        if (Build$VERSION.SDK_INT >= 12) {
            IMPL = new MotionEventCompat$HoneycombMr1MotionEventVersionImpl();
            return;
        }
        if (Build$VERSION.SDK_INT >= 9) {
            IMPL = new MotionEventCompat$GingerbreadMotionEventVersionImpl();
            return;
        }
        if (Build$VERSION.SDK_INT >= 5) {
            IMPL = new MotionEventCompat$EclairMotionEventVersionImpl();
            return;
        }
        IMPL = new MotionEventCompat$BaseMotionEventVersionImpl();
    }
    
    public static int findPointerIndex(final MotionEvent motionEvent, final int n) {
        return MotionEventCompat.IMPL.findPointerIndex(motionEvent, n);
    }
    
    public static int getActionIndex(final MotionEvent motionEvent) {
        return (0xFF00 & motionEvent.getAction()) >> 8;
    }
    
    public static int getActionMasked(final MotionEvent motionEvent) {
        return 0xFF & motionEvent.getAction();
    }
    
    public static float getAxisValue(final MotionEvent motionEvent, final int n) {
        return MotionEventCompat.IMPL.getAxisValue(motionEvent, n);
    }
    
    public static int getPointerCount(final MotionEvent motionEvent) {
        return MotionEventCompat.IMPL.getPointerCount(motionEvent);
    }
    
    public static int getPointerId(final MotionEvent motionEvent, final int n) {
        return MotionEventCompat.IMPL.getPointerId(motionEvent, n);
    }
    
    public static int getSource(final MotionEvent motionEvent) {
        return MotionEventCompat.IMPL.getSource(motionEvent);
    }
    
    public static float getX(final MotionEvent motionEvent, final int n) {
        return MotionEventCompat.IMPL.getX(motionEvent, n);
    }
    
    public static float getY(final MotionEvent motionEvent, final int n) {
        return MotionEventCompat.IMPL.getY(motionEvent, n);
    }
}
