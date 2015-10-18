// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.view.animation.AnimationUtils;

class AutoScrollHelper$ClampedScroller
{
    private static final String z;
    private long mDeltaTime;
    private int mDeltaX;
    private int mDeltaY;
    private int mEffectiveRampDown;
    private int mRampDownDuration;
    private int mRampUpDuration;
    private long mStartTime;
    private long mStopTime;
    private float mStopValue;
    private float mTargetVelocityX;
    private float mTargetVelocityY;
    
    static {
        final char[] charArray = "o\u001c4\\SX]9]Q\\\b.W\u001c_\u001e(]P@]>WPX\u001czPYJ\u0012(W\u001cO\u001c6^UB\u001azAHM\u000f.\u001a\u0015".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '<';
                    break;
                }
                case 0: {
                    c2 = ',';
                    break;
                }
                case 1: {
                    c2 = '}';
                    break;
                }
                case 2: {
                    c2 = 'Z';
                    break;
                }
                case 3: {
                    c2 = '2';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public AutoScrollHelper$ClampedScroller() {
        this.mStartTime = Long.MIN_VALUE;
        this.mStopTime = -1L;
        this.mDeltaTime = 0L;
        this.mDeltaX = 0;
        this.mDeltaY = 0;
    }
    
    private float getValueAt(final long n) {
        try {
            if (n < this.mStartTime) {
                return 0.0f;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        try {
            if (this.mStopTime < 0L || n < this.mStopTime) {
                return 0.5f * AutoScrollHelper.access$900((n - this.mStartTime) / this.mRampUpDuration, 0.0f, 1.0f);
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        return 1.0f - this.mStopValue + this.mStopValue * AutoScrollHelper.access$900((n - this.mStopTime) / this.mEffectiveRampDown, 0.0f, 1.0f);
    }
    
    private float interpolateValue(final float n) {
        return n * (-4.0f * n) + 4.0f * n;
    }
    
    public void computeScrollDelta() {
        try {
            if (this.mDeltaTime == 0L) {
                throw new RuntimeException(AutoScrollHelper$ClampedScroller.z);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        final float interpolateValue = this.interpolateValue(this.getValueAt(currentAnimationTimeMillis));
        final long n = currentAnimationTimeMillis - this.mDeltaTime;
        this.mDeltaTime = currentAnimationTimeMillis;
        this.mDeltaX = (int)(interpolateValue * n * this.mTargetVelocityX);
        this.mDeltaY = (int)(interpolateValue * n * this.mTargetVelocityY);
    }
    
    public int getDeltaX() {
        return this.mDeltaX;
    }
    
    public int getDeltaY() {
        return this.mDeltaY;
    }
    
    public int getHorizontalDirection() {
        return (int)(this.mTargetVelocityX / Math.abs(this.mTargetVelocityX));
    }
    
    public int getVerticalDirection() {
        return (int)(this.mTargetVelocityY / Math.abs(this.mTargetVelocityY));
    }
    
    public boolean isFinished() {
        try {
            if (this.mStopTime <= 0L) {
                return false;
            }
            final long n = AnimationUtils.currentAnimationTimeMillis();
            final AutoScrollHelper$ClampedScroller autoScrollHelper$ClampedScroller = this;
            final long n2 = autoScrollHelper$ClampedScroller.mStopTime;
            final AutoScrollHelper$ClampedScroller autoScrollHelper$ClampedScroller2 = this;
            final int n3 = autoScrollHelper$ClampedScroller2.mEffectiveRampDown;
            final long n4 = n3;
            final long n5 = n2 + n4;
            final long n6 = lcmp(n, n5);
            if (n6 > 0) {
                return true;
            }
            return false;
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        try {
            final long n = AnimationUtils.currentAnimationTimeMillis();
            final AutoScrollHelper$ClampedScroller autoScrollHelper$ClampedScroller = this;
            final long n2 = autoScrollHelper$ClampedScroller.mStopTime;
            final AutoScrollHelper$ClampedScroller autoScrollHelper$ClampedScroller2 = this;
            final int n3 = autoScrollHelper$ClampedScroller2.mEffectiveRampDown;
            final long n4 = n3;
            final long n5 = n2 + n4;
            final long n6 = lcmp(n, n5);
            if (n6 > 0) {
                return true;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public void requestStop() {
        final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.mEffectiveRampDown = AutoScrollHelper.access$800((int)(currentAnimationTimeMillis - this.mStartTime), 0, this.mRampDownDuration);
        this.mStopValue = this.getValueAt(currentAnimationTimeMillis);
        this.mStopTime = currentAnimationTimeMillis;
    }
    
    public void setRampDownDuration(final int mRampDownDuration) {
        this.mRampDownDuration = mRampDownDuration;
    }
    
    public void setRampUpDuration(final int mRampUpDuration) {
        this.mRampUpDuration = mRampUpDuration;
    }
    
    public void setTargetVelocity(final float mTargetVelocityX, final float mTargetVelocityY) {
        this.mTargetVelocityX = mTargetVelocityX;
        this.mTargetVelocityY = mTargetVelocityY;
    }
    
    public void start() {
        this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
        this.mStopTime = -1L;
        this.mDeltaTime = this.mStartTime;
        this.mStopValue = 0.5f;
        this.mDeltaX = 0;
        this.mDeltaY = 0;
    }
}
