// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.MotionEvent;

class MotionEventCompat$BaseMotionEventVersionImpl implements MotionEventCompat$MotionEventVersionImpl
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "5kY`\u0014\u0006u]$#E}S(\"EwS9q\u0016lL=>\u0017m\u001c $\tmU==\u00009L\"8\u000bmY?\"";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'Q';
                        break;
                    }
                    case 0: {
                        c2 = 'e';
                        break;
                    }
                    case 1: {
                        c2 = '\u0019';
                        break;
                    }
                    case 2: {
                        c2 = '<';
                        break;
                    }
                    case 3: {
                        c2 = 'M';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "5kY`\u0014\u0006u]$#E}S(\"EwS9q\u0016lL=>\u0017m\u001c $\tmU==\u00009L\"8\u000bmY?\"";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "5kY`\u0014\u0006u]$#E}S(\"EwS9q\u0016lL=>\u0017m\u001c $\tmU==\u00009L\"8\u000bmY?\"";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    @Override
    public int findPointerIndex(final MotionEvent motionEvent, final int n) {
        if (n == 0) {
            return 0;
        }
        return -1;
    }
    
    @Override
    public float getAxisValue(final MotionEvent motionEvent, final int n) {
        return 0.0f;
    }
    
    @Override
    public int getPointerCount(final MotionEvent motionEvent) {
        return 1;
    }
    
    @Override
    public int getPointerId(final MotionEvent motionEvent, final int n) {
        if (n == 0) {
            return 0;
        }
        throw new IndexOutOfBoundsException(MotionEventCompat$BaseMotionEventVersionImpl.z[0]);
    }
    
    @Override
    public int getSource(final MotionEvent motionEvent) {
        return 0;
    }
    
    @Override
    public float getX(final MotionEvent motionEvent, final int n) {
        if (n == 0) {
            try {
                return motionEvent.getX();
            }
            catch (IndexOutOfBoundsException ex) {
                throw ex;
            }
        }
        throw new IndexOutOfBoundsException(MotionEventCompat$BaseMotionEventVersionImpl.z[1]);
    }
    
    @Override
    public float getY(final MotionEvent motionEvent, final int n) {
        if (n == 0) {
            try {
                return motionEvent.getY();
            }
            catch (IndexOutOfBoundsException ex) {
                throw ex;
            }
        }
        throw new IndexOutOfBoundsException(MotionEventCompat$BaseMotionEventVersionImpl.z[2]);
    }
}
