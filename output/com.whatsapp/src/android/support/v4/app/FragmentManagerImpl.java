// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Parcelable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import java.util.List;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.content.res.Configuration;
import java.io.FileDescriptor;
import java.io.Writer;
import java.io.PrintWriter;
import android.support.v4.util.LogWriter;
import android.util.Log;
import android.view.animation.ScaleAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.content.Context;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import android.view.animation.Interpolator;
import android.support.v4.view.LayoutInflaterFactory;

final class FragmentManagerImpl extends FragmentManager implements LayoutInflaterFactory
{
    static final Interpolator ACCELERATE_CUBIC;
    static final Interpolator ACCELERATE_QUINT;
    static boolean DEBUG;
    static final Interpolator DECELERATE_CUBIC;
    static final Interpolator DECELERATE_QUINT;
    static final boolean HONEYCOMB;
    private static final String[] z;
    ArrayList mActive;
    FragmentActivity mActivity;
    ArrayList mAdded;
    ArrayList mAvailBackStackIndices;
    ArrayList mAvailIndices;
    ArrayList mBackStack;
    ArrayList mBackStackChangeListeners;
    ArrayList mBackStackIndices;
    FragmentContainer mContainer;
    ArrayList mCreatedMenus;
    int mCurState;
    boolean mDestroyed;
    Runnable mExecCommit;
    boolean mExecutingActions;
    boolean mHavePendingDeferredStart;
    boolean mNeedMenuInvalidate;
    String mNoTransactionsBecause;
    Fragment mParent;
    ArrayList mPendingActions;
    SparseArray mStateArray;
    Bundle mStateBundle;
    boolean mStateSaved;
    Runnable[] mTmpActions;
    
    static {
        int honeycomb = 1;
        final String[] z2 = new String[187];
        String s = "b\u0011N\u0003e*";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
    Label_0020:
        while (true) {
            while (true) {
                final char[] charArray = s.toCharArray();
                final int length = charArray.length;
                int n3 = 0;
                while (true) {
                    Label_5303: {
                        if (length > n3) {
                            break Label_5303;
                        }
                        final String intern = new String(charArray).intern();
                        switch (n) {
                            default: {
                                array[n2] = intern;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n2 = honeycomb;
                                array = z2;
                                n = 0;
                                continue Label_0020;
                            }
                            case 0: {
                                array[n2] = intern;
                                n2 = 2;
                                array = z2;
                                s = "K\u001b^\u000f)c\fSF,~\u0019^\u0003e";
                                n = honeycomb;
                                continue Label_0020;
                            }
                            case 1: {
                                array[n2] = intern;
                                n2 = 3;
                                s = "L\u0019C\n:nXN\u00132z\u0011D\u0001\u007fy\fK\u0012:";
                                n = 2;
                                array = z2;
                                continue Label_0020;
                            }
                            case 2: {
                                array[n2] = intern;
                                n2 = 4;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 3;
                                array = z2;
                                continue Label_0020;
                            }
                            case 3: {
                                array[n2] = intern;
                                n2 = 5;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 4;
                                array = z2;
                                continue Label_0020;
                            }
                            case 4: {
                                array[n2] = intern;
                                n2 = 6;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 5;
                                array = z2;
                                continue Label_0020;
                            }
                            case 5: {
                                array[n2] = intern;
                                n2 = 7;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 6;
                                array = z2;
                                continue Label_0020;
                            }
                            case 6: {
                                array[n2] = intern;
                                n2 = 8;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 7;
                                array = z2;
                                continue Label_0020;
                            }
                            case 7: {
                                array[n2] = intern;
                                n2 = 9;
                                s = "L\u0019C\n:nXN\u00132z\u0011D\u0001\u007fy\fK\u0012:";
                                n = 8;
                                array = z2;
                                continue Label_0020;
                            }
                            case 8: {
                                array[n2] = intern;
                                s = "*X";
                                n = 9;
                                n2 = 10;
                                array = z2;
                                continue Label_0020;
                            }
                            case 9: {
                                array[n2] = intern;
                                s = "*X";
                                n2 = 11;
                                array = z2;
                                n = 10;
                                continue Label_0020;
                            }
                            case 10: {
                                array[n2] = intern;
                                n2 = 12;
                                array = z2;
                                s = "L\nO\u00036d\u001f\n\u0004>i\u0013\n\u0015+k\u001bAF6d\u001cO\u001e\u007f";
                                n = 11;
                                continue Label_0020;
                            }
                            case 11: {
                                array[n2] = intern;
                                n2 = 13;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 12;
                                array = z2;
                                continue Label_0020;
                            }
                            case 12: {
                                array[n2] = intern;
                                n2 = 14;
                                s = "L\nK\u00012o\u0016^F>f\nO\u0007;sXK\u0002;o\u001c\u0010F";
                                n = 13;
                                array = z2;
                                continue Label_0020;
                            }
                            case 13: {
                                array[n2] = intern;
                                n2 = 15;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 14;
                                array = z2;
                                continue Label_0020;
                            }
                            case 14: {
                                array[n2] = intern;
                                n2 = 16;
                                s = "k\u001cN\\\u007f";
                                n = 15;
                                array = z2;
                                continue Label_0020;
                            }
                            case 15: {
                                array[n2] = intern;
                                n2 = 17;
                                s = "y\u0010E\u0011e*";
                                n = 16;
                                array = z2;
                                continue Label_0020;
                            }
                            case 16: {
                                array[n2] = intern;
                                n2 = 18;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 17;
                                array = z2;
                                continue Label_0020;
                            }
                            case 17: {
                                array[n2] = intern;
                                n2 = 19;
                                s = "L\nK\u00012o\u0016^F";
                                n = 18;
                                array = z2;
                                continue Label_0020;
                            }
                            case 18: {
                                array[n2] = intern;
                                n2 = 20;
                                s = "*\u0011YF1e\f\n\u0005*x\nO\b+f\u0001\n\u000f1*\fB\u0003\u007fL\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 19;
                                array = z2;
                                continue Label_0020;
                            }
                            case 19: {
                                array[n2] = intern;
                                n2 = 21;
                                s = "D\u0017\n\u0007<~\u0011\\\u000f+s";
                                n = 20;
                                array = z2;
                                continue Label_0020;
                            }
                            case 20: {
                                array[n2] = intern;
                                n2 = 22;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 21;
                                array = z2;
                                continue Label_0020;
                            }
                            case 21: {
                                array[n2] = intern;
                                n2 = 23;
                                s = "x\u001d^\u00076d6E\b\u001ce\u0016L\u000f80XA\u0003:z\u0011D\u0001\u007fx\u001d^\u00076d\u001dNF";
                                n = 22;
                                array = z2;
                                continue Label_0020;
                            }
                            case 22: {
                                array[n2] = intern;
                                n2 = 24;
                                s = "g\u0017\\\u0003+eXi4\u001aK,o\"e*";
                                n = 23;
                                array = z2;
                                continue Label_0020;
                            }
                            case 23: {
                                array[n2] = intern;
                                n2 = 25;
                                s = "L\nK\u00012o\u0016^F";
                                n = 24;
                                array = z2;
                                continue Label_0020;
                            }
                            case 24: {
                                array[n2] = intern;
                                n2 = 26;
                                s = "#XL\t-*\u001eX\u00078g\u001dD\u0012\u007f";
                                n = 25;
                                array = z2;
                                continue Label_0020;
                            }
                            case 25: {
                                array[n2] = intern;
                                n2 = 27;
                                s = "g\u0017\\\u00039x\u0017GF\f^9x2\u001aNB\n";
                                n = 26;
                                array = z2;
                                continue Label_0020;
                            }
                            case 26: {
                                array[n2] = intern;
                                n2 = 28;
                                s = "k\u0016N\u00140c\u001c\u0010\u0013,o\nu\u00106y\u0011H\n:U\u0010C\b+";
                                n = 27;
                                array = z2;
                                continue Label_0020;
                            }
                            case 27: {
                                array[n2] = intern;
                                n2 = 29;
                                s = "g\u0017\\\u00039x\u0017GF\f^7z6\u001aNB\n";
                                n = 28;
                                array = z2;
                                continue Label_0020;
                            }
                            case 28: {
                                array[n2] = intern;
                                n2 = 30;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 29;
                                array = z2;
                                continue Label_0020;
                            }
                            case 29: {
                                array[n2] = intern;
                                n2 = 31;
                                s = "k\u0016N\u00140c\u001c\u0010\u00106o\u000fu\u0015+k\fO";
                                n = 30;
                                array = z2;
                                continue Label_0020;
                            }
                            case 30: {
                                array[n2] = intern;
                                n2 = 32;
                                s = "g\u0017\\\u00039x\u0017GF\u001eI,c0\u0016^!u%\rO9~#\u001b0X";
                                n = 31;
                                array = z2;
                                continue Label_0020;
                            }
                            case 31: {
                                array[n2] = intern;
                                n2 = 33;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 32;
                                array = z2;
                                continue Label_0020;
                            }
                            case 32: {
                                array[n2] = intern;
                                n2 = 34;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 33;
                                array = z2;
                                continue Label_0020;
                            }
                            case 33: {
                                array[n2] = intern;
                                n2 = 35;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 34;
                                array = z2;
                                continue Label_0020;
                            }
                            case 34: {
                                array[n2] = intern;
                                n2 = 36;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 35;
                                array = z2;
                                continue Label_0020;
                            }
                            case 35: {
                                array[n2] = intern;
                                n2 = 37;
                                s = "D\u0017\n\u00106o\u000f\n\u00000\u007f\u0016NF9e\n\n\u000f;*HR";
                                n = 36;
                                array = z2;
                                continue Label_0020;
                            }
                            case 36: {
                                array[n2] = intern;
                                n2 = 38;
                                s = "g\u0017\\\u0003+eXy2\u001eX,o\"e*";
                                n = 37;
                                array = z2;
                                continue Label_0020;
                            }
                            case 37: {
                                array[n2] = intern;
                                n2 = 39;
                                s = "*P";
                                n = 38;
                                array = z2;
                                continue Label_0020;
                            }
                            case 38: {
                                array[n2] = intern;
                                n2 = 40;
                                s = "g\u0017\\\u00039x\u0017GF\u001cX=k2\u001aNB\n";
                                n = 39;
                                array = z2;
                                continue Label_0020;
                            }
                            case 39: {
                                array[n2] = intern;
                                n2 = 41;
                                s = "k\u0016N\u00140c\u001c\u0010\u0012>x\u001fO\u0012\u0000x\u001d[9,~\u0019^\u0003";
                                n = 40;
                                array = z2;
                                continue Label_0020;
                            }
                            case 40: {
                                array[n2] = intern;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 41;
                                n2 = 42;
                                array = z2;
                                continue Label_0020;
                            }
                            case 41: {
                                array[n2] = intern;
                                n2 = 43;
                                array = z2;
                                s = "*\u001cC\u0002\u007fd\u0017^F<k\u0014FF+b\nE\u00138bX^\t\u007fy\rZ\u0003-$\u0017D'+~\u0019I\u000ew#";
                                n = 42;
                                continue Label_0020;
                            }
                            case 42: {
                                array[n2] = intern;
                                n2 = 44;
                                s = "*\u001cC\u0002\u007fd\u0017^F<k\u0014FF+b\nE\u00138bX^\t\u007fy\rZ\u0003-$\u0017D\":~\u0019I\u000ew#";
                                n = 43;
                                array = z2;
                                continue Label_0020;
                            }
                            case 43: {
                                array[n2] = intern;
                                n2 = 45;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 44;
                                array = z2;
                                continue Label_0020;
                            }
                            case 44: {
                                array[n2] = intern;
                                n2 = 46;
                                s = "g\u0017\\\u0003+eXx#\f_5o\"e*";
                                n = 45;
                                array = z2;
                                continue Label_0020;
                            }
                            case 45: {
                                array[n2] = intern;
                                n2 = 47;
                                s = "k\u0016N\u00140c\u001c\u0010\u0012>x\u001fO\u0012\u0000y\fK\u0012:";
                                n = 46;
                                array = z2;
                                continue Label_0020;
                            }
                            case 46: {
                                array[n2] = intern;
                                n2 = 48;
                                s = "L\nK\u00012o\u0016^F";
                                n = 47;
                                array = z2;
                                continue Label_0020;
                            }
                            case 47: {
                                array[n2] = intern;
                                n2 = 49;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 48;
                                array = z2;
                                continue Label_0020;
                            }
                            case 48: {
                                array[n2] = intern;
                                n2 = 50;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 49;
                                array = z2;
                                continue Label_0020;
                            }
                            case 49: {
                                array[n2] = intern;
                                n2 = 51;
                                s = "g\u0017\\\u00039x\u0017GF\rO+\u007f+\u001aNB\n";
                                n = 50;
                                array = z2;
                                continue Label_0020;
                            }
                            case 50: {
                                array[n2] = intern;
                                n2 = 52;
                                s = "g\u0017\\\u0003+eXk%\u000bC.c2\u0006U;x#\u001e^=n\\\u007f";
                                n = 51;
                                array = z2;
                                continue Label_0020;
                            }
                            case 51: {
                                array[n2] = intern;
                                n2 = 53;
                                s = "&X^\u00078*";
                                n = 52;
                                array = z2;
                                continue Label_0020;
                            }
                            case 52: {
                                array[n2] = intern;
                                n2 = 54;
                                s = "*\u001cC\u0002\u007fd\u0017^F<x\u001dK\u0012:*\u0019\n\u00106o\u000f\u0004";
                                n = 53;
                                array = z2;
                                continue Label_0020;
                            }
                            case 53: {
                                array[n2] = intern;
                                n2 = 55;
                                s = "0Xn\u0013/f\u0011I\u0007+oXC\u0002\u007f:\u0000";
                                n = 54;
                                array = z2;
                                continue Label_0020;
                            }
                            case 54: {
                                array[n2] = intern;
                                n2 = 56;
                                s = "l\nK\u00012o\u0016^";
                                n = 55;
                                array = z2;
                                continue Label_0020;
                            }
                            case 55: {
                                array[n2] = intern;
                                n2 = 57;
                                s = "e\u0016i\u0014:k\fO06o\u000f\u0010F6nE\u001a\u001e";
                                n = 56;
                                array = z2;
                                continue Label_0020;
                            }
                            case 56: {
                                array[n2] = intern;
                                n2 = 58;
                                s = "0Xg\u0013,~XY\u0016:i\u0011L\u001f\u007f\u007f\u0016C\u0017*oXK\b;x\u0017C\u0002ec\u001c\u0006F>d\u001cX\t6nB^\u00078&XE\u0014\u007fb\u0019\\\u0003\u007fkXZ\u0007-o\u0016^F(c\fBF>dXC\u0002\u007fl\u0017XF";
                                n = 57;
                                array = z2;
                                continue Label_0020;
                            }
                            case 57: {
                                array[n2] = intern;
                                n2 = 59;
                                s = "*\u001dR\u000f,~\u0011D\u0001b";
                                n = 58;
                                array = z2;
                                continue Label_0020;
                            }
                            case 58: {
                                array[n2] = intern;
                                n2 = 60;
                                s = "*\u000fC\u00127*\u0019D\t+b\u001dXF9x\u0019M\u000b:d\f\n\u00000xX";
                                n = 59;
                                array = z2;
                                continue Label_0020;
                            }
                            case 59: {
                                array[n2] = intern;
                                n2 = 61;
                                s = "&XE\u0014\u007fz\u0019X\u00031~XC\u0002\u007f:\u0000";
                                n = 60;
                                array = z2;
                                continue Label_0020;
                            }
                            case 60: {
                                array[n2] = intern;
                                n2 = 62;
                                s = "L\nK\u00012o\u0016^F";
                                n = 61;
                                array = z2;
                                continue Label_0020;
                            }
                            case 61: {
                                array[n2] = intern;
                                n2 = 63;
                                s = "*\u001eD\u00072oE";
                                n = 62;
                                array = z2;
                                continue Label_0020;
                            }
                            case 62: {
                                array[n2] = intern;
                                n2 = 64;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 63;
                                array = z2;
                                continue Label_0020;
                            }
                            case 63: {
                                array[n2] = intern;
                                n2 = 65;
                                s = "i\u0014K\u0015,";
                                n = 64;
                                array = z2;
                                continue Label_0020;
                            }
                            case 64: {
                                array[n2] = intern;
                                n2 = 66;
                                s = "*\u0010K\u0015\u007fi\u0014O\u0007-o\u001c\n\u000f1n\u001dR\\\u007f";
                                n = 65;
                                array = z2;
                                continue Label_0020;
                            }
                            case 65: {
                                array[n2] = intern;
                                n2 = 67;
                                s = "y\u0019\\\u0003\u001ef\u0014y\u0012>~\u001d\u0010F1eXL\u0014>m\u0015O\b+yY";
                                n = 66;
                                array = z2;
                                continue Label_0020;
                            }
                            case 66: {
                                array[n2] = intern;
                                n2 = 68;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 67;
                                array = z2;
                                continue Label_0020;
                            }
                            case 67: {
                                array[n2] = intern;
                                n2 = 69;
                                s = "y\u0019\\\u0003\u001ef\u0014y\u0012>~\u001d\u0010F>n\u001cC\b8*\u001aK\u00054*\u000b^\u0007<aX\t";
                                n = 68;
                                array = z2;
                                continue Label_0020;
                            }
                            case 68: {
                                array[n2] = intern;
                                n2 = 70;
                                s = "L\u0019C\n*x\u001d\n\u0015>|\u0011D\u0001\u007fy\fK\u0012:0XK\u0005+c\u000eOF";
                                n = 69;
                                array = z2;
                                continue Label_0020;
                            }
                            case 69: {
                                array[n2] = intern;
                                n2 = 71;
                                s = "0X";
                                n = 70;
                                array = z2;
                                continue Label_0020;
                            }
                            case 70: {
                                array[n2] = intern;
                                n2 = 72;
                                s = "*\u0010K\u0015\u007fi\u0014O\u0007-o\u001c\n\u000f1n\u001dR\\\u007f";
                                n = 71;
                                array = z2;
                                continue Label_0020;
                            }
                            case 71: {
                                array[n2] = intern;
                                n2 = 73;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 72;
                                array = z2;
                                continue Label_0020;
                            }
                            case 72: {
                                array[n2] = intern;
                                n2 = 74;
                                s = "Y\u0019\\\u0003;*\u000b^\u0007+oXE\u0000\u007f";
                                n = 73;
                                array = z2;
                                continue Label_0020;
                            }
                            case 73: {
                                array[n2] = intern;
                                n2 = 75;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 74;
                                array = z2;
                                continue Label_0020;
                            }
                            case 74: {
                                array[n2] = intern;
                                n2 = 76;
                                s = "k\u0016N\u00140c\u001c\u0010\u0012>x\u001fO\u0012\u0000x\u001d[9,~\u0019^\u0003";
                                n = 75;
                                array = z2;
                                continue Label_0020;
                            }
                            case 75: {
                                array[n2] = intern;
                                n2 = 77;
                                s = "*\u0010K\u0015\u007f~\u0019X\u0001:~XD\t+*\u0011DF9x\u0019M\u000b:d\f\n\u000b>d\u0019M\u0003-0X";
                                n = 76;
                                array = z2;
                                continue Label_0020;
                            }
                            case 76: {
                                array[n2] = intern;
                                n2 = 78;
                                s = "L\u0019C\n*x\u001d\n\u0015>|\u0011D\u0001\u007fy\fK\u0012:0X";
                                n = 77;
                                array = z2;
                                continue Label_0020;
                            }
                            case 77: {
                                array[n2] = intern;
                                n2 = 79;
                                s = "0X";
                                n = 78;
                                array = z2;
                                continue Label_0020;
                            }
                            case 78: {
                                array[n2] = intern;
                                n2 = 80;
                                s = "k\u0016N\u00140c\u001c\u0010\u0012>x\u001fO\u0012\u0000y\fK\u0012:";
                                n = 79;
                                array = z2;
                                continue Label_0020;
                            }
                            case 79: {
                                array[n2] = intern;
                                n2 = 81;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 80;
                                array = z2;
                                continue Label_0020;
                            }
                            case 80: {
                                array[n2] = intern;
                                n2 = 82;
                                s = "L\u0019C\n*x\u001d\n\u0015>|\u0011D\u0001\u007fy\fK\u0012:0XK\u0005+c\u000eOF";
                                n = 81;
                                array = z2;
                                continue Label_0020;
                            }
                            case 81: {
                                array[n2] = intern;
                                n2 = 83;
                                s = "y\u0019\\\u0003\u001ef\u0014y\u0012>~\u001d\u0010F>n\u001cC\b8*\u001eX\u00078g\u001dD\u0012\u007f)";
                                n = 82;
                                array = z2;
                                continue Label_0020;
                            }
                            case 82: {
                                array[n2] = intern;
                                n2 = 84;
                                s = "0X";
                                n = 83;
                                array = z2;
                                continue Label_0020;
                            }
                            case 83: {
                                array[n2] = intern;
                                n2 = 85;
                                s = "H\u0019NF6nB\n";
                                n = 84;
                                array = z2;
                                continue Label_0020;
                            }
                            case 84: {
                                array[n2] = intern;
                                n2 = 86;
                                s = "*XG%0d\fK\u000f1o\n\u0017";
                                n = 85;
                                array = z2;
                                continue Label_0020;
                            }
                            case 85: {
                                array[n2] = intern;
                                n2 = 87;
                                s = "*XG%*x+^\u0007+oE";
                                n = 86;
                                array = z2;
                                continue Label_0020;
                            }
                            case 86: {
                                array[n2] = intern;
                                n2 = 88;
                                s = "0X";
                                n = 87;
                                array = z2;
                                continue Label_0020;
                            }
                            case 87: {
                                array[n2] = intern;
                                n2 = 89;
                                s = "0X";
                                n = 88;
                                array = z2;
                                continue Label_0020;
                            }
                            case 88: {
                                array[n2] = intern;
                                n2 = 90;
                                s = "*X\t";
                                n = 89;
                                array = z2;
                                continue Label_0020;
                            }
                            case 89: {
                                array[n2] = intern;
                                n2 = 91;
                                s = "K\u001b^\u000f)oXl\u0014>m\u0015O\b+yXC\b\u007f";
                                n = 90;
                                array = z2;
                                continue Label_0020;
                            }
                            case 90: {
                                array[n2] = intern;
                                n2 = 92;
                                s = "*XG')k\u0011F/1n\u0011I\u0003,0X";
                                n = 91;
                                array = z2;
                                continue Label_0020;
                            }
                            case 91: {
                                array[n2] = intern;
                                n2 = 93;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-*\u0015C\u0015<*\u000b^\u0007+oB";
                                n = 92;
                                array = z2;
                                continue Label_0020;
                            }
                            case 92: {
                                array[n2] = intern;
                                n2 = 94;
                                s = "*X\t";
                                n = 93;
                                array = z2;
                                continue Label_0020;
                            }
                            case 93: {
                                array[n2] = intern;
                                n2 = 95;
                                s = "0X";
                                n = 94;
                                array = z2;
                                continue Label_0020;
                            }
                            case 94: {
                                array[n2] = intern;
                                n2 = 96;
                                s = "K\u001cN\u0003;*>X\u00078g\u001dD\u0012,0";
                                n = 95;
                                array = z2;
                                continue Label_0020;
                            }
                            case 95: {
                                array[n2] = intern;
                                n2 = 97;
                                s = "*\u0015y\u0012>~\u001dy\u0007)o\u001c\u0017";
                                n = 96;
                                array = z2;
                                continue Label_0020;
                            }
                            case 96: {
                                array[n2] = intern;
                                n2 = 98;
                                s = "L\nK\u00012o\u0016^\u0015\u007fI\nO\u0007+o\u001c\n+:d\rY\\";
                                n = 97;
                                array = z2;
                                continue Label_0020;
                            }
                            case 97: {
                                array[n2] = intern;
                                n2 = 99;
                                s = "*XG(0^\nK\b,k\u001b^\u000f0d\u000bh\u0003<k\rY\u0003b";
                                n = 98;
                                array = z2;
                                continue Label_0020;
                            }
                            case 98: {
                                array[n2] = intern;
                                n2 = 100;
                                s = "*X\t";
                                n = 99;
                                array = z2;
                                continue Label_0020;
                            }
                            case 99: {
                                array[n2] = intern;
                                n2 = 101;
                                s = "g9\\\u00076f:K\u00054Y\fK\u00054C\u0016N\u000f<o\u000b\u0010F";
                                n = 100;
                                array = z2;
                                continue Label_0020;
                            }
                            case 100: {
                                array[n2] = intern;
                                n2 = 102;
                                s = "Z\u001dD\u00026d\u001f\n'<~\u0011E\b,0";
                                n = 101;
                                array = z2;
                                continue Label_0020;
                            }
                            case 101: {
                                array[n2] = intern;
                                n2 = 103;
                                s = "0X";
                                n = 102;
                                array = z2;
                                continue Label_0020;
                            }
                            case 102: {
                                array[n2] = intern;
                                n2 = 104;
                                s = "*X\nF";
                                n = 103;
                                array = z2;
                                continue Label_0020;
                            }
                            case 103: {
                                array[n2] = intern;
                                n2 = 105;
                                s = "0X";
                                n = 104;
                                array = z2;
                                continue Label_0020;
                            }
                            case 104: {
                                array[n2] = intern;
                                n2 = 106;
                                s = "*X\t";
                                n = 105;
                                array = z2;
                                continue Label_0020;
                            }
                            case 105: {
                                array[n2] = intern;
                                n2 = 107;
                                s = "*XG'<~\u0011\\\u000f+sE";
                                n = 106;
                                array = z2;
                                continue Label_0020;
                            }
                            case 106: {
                                array[n2] = intern;
                                n2 = 108;
                                s = "*XG(:o\u001cg\u00031\u007f1D\u0010>f\u0011N\u0007+oE";
                                n = 107;
                                array = z2;
                                continue Label_0020;
                            }
                            case 107: {
                                array[n2] = intern;
                                n2 = 109;
                                s = "H\u0019I\r\u007fY\fK\u00054*1D\u00026i\u001dY\\";
                                n = 108;
                                array = z2;
                                continue Label_0020;
                            }
                            case 108: {
                                array[n2] = intern;
                                n2 = 110;
                                s = "*X\t";
                                n = 109;
                                array = z2;
                                continue Label_0020;
                            }
                            case 109: {
                                array[n2] = intern;
                                n2 = 111;
                                s = "H\u0019I\r\u007fY\fK\u000540";
                                n = 110;
                                array = z2;
                                continue Label_0020;
                            }
                            case 110: {
                                array[n2] = intern;
                                n2 = 112;
                                s = "*X\t";
                                n = 111;
                                array = z2;
                                continue Label_0020;
                            }
                            case 111: {
                                array[n2] = intern;
                                n2 = 113;
                                s = "*XG6>x\u001dD\u0012b";
                                n = 112;
                                array = z2;
                                continue Label_0020;
                            }
                            case 112: {
                                array[n2] = intern;
                                n2 = 114;
                                s = "*\u0015n\u0003,~\nE\u001f:nE";
                                n = 113;
                                array = z2;
                                continue Label_0020;
                            }
                            case 113: {
                                array[n2] = intern;
                                n2 = 115;
                                s = "0X";
                                n = 114;
                                array = z2;
                                continue Label_0020;
                            }
                            case 114: {
                                array[n2] = intern;
                                n2 = 116;
                                s = "0X";
                                n = 115;
                                array = z2;
                                continue Label_0020;
                            }
                            case 115: {
                                array[n2] = intern;
                                n2 = 117;
                                s = "k\u0016N\u00140c\u001c\u0010\u00106o\u000fu\u0015+k\fO";
                                n = 116;
                                array = z2;
                                continue Label_0020;
                            }
                            case 116: {
                                array[n2] = intern;
                                n2 = 118;
                                s = "X\u001d\u0007\u0007+~\u0019I\u000e6d\u001f\n\u0014:~\u0019C\b:nXL\u0014>m\u0015O\b+*";
                                n = 117;
                                array = z2;
                                continue Label_0020;
                            }
                            case 117: {
                                array[n2] = intern;
                                n2 = 119;
                                s = "0X";
                                n = 118;
                                array = z2;
                                continue Label_0020;
                            }
                            case 118: {
                                array[n2] = intern;
                                n2 = 120;
                                s = "x\u001dY\u00120x\u001dk\n3Y\fK\u0012:0XK\u0002;o\u001c\nE";
                                n = 119;
                                array = z2;
                                continue Label_0020;
                            }
                            case 119: {
                                array[n2] = intern;
                                n2 = 121;
                                s = "x\u001dY\u00120x\u001dk\n3Y\fK\u0012:0XK\u0005+c\u000eOF|";
                                n = 120;
                                array = z2;
                                continue Label_0020;
                            }
                            case 120: {
                                array[n2] = intern;
                                n2 = 122;
                                s = "*\fK\u00148o\f\n\b0*\u0014E\b8o\n\n\u0003'c\u000b^\u0015e*";
                                n = 121;
                                array = z2;
                                continue Label_0020;
                            }
                            case 121: {
                                array[n2] = intern;
                                n2 = 123;
                                s = "K\u0014X\u0003>n\u0001\n\u0007;n\u001dNG";
                                n = 122;
                                array = z2;
                                continue Label_0020;
                            }
                            case 122: {
                                array[n2] = intern;
                                n2 = 124;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 123;
                                array = z2;
                                continue Label_0020;
                            }
                            case 123: {
                                array[n2] = intern;
                                n2 = 125;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 124;
                                array = z2;
                                continue Label_0020;
                            }
                            case 124: {
                                array[n2] = intern;
                                n2 = 126;
                                s = "*X";
                                n = 125;
                                array = z2;
                                continue Label_0020;
                            }
                            case 125: {
                                array[n2] = intern;
                                n2 = 127;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 126;
                                array = z2;
                                continue Label_0020;
                            }
                            case 126: {
                                array[n2] = intern;
                                n2 = 128;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 127;
                                array = z2;
                                continue Label_0020;
                            }
                            case 127: {
                                array[n2] = intern;
                                n2 = 129;
                                s = "x\u001dY\u00120x\u001dk\n3Y\fK\u0012:0XH\u0007<aXY\u0012>i\u0013\nE";
                                n = 128;
                                array = z2;
                                continue Label_0020;
                            }
                            case 128: {
                                array[n2] = intern;
                                n2 = 130;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 129;
                                array = z2;
                                continue Label_0020;
                            }
                            case 129: {
                                array[n2] = intern;
                                n2 = 131;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 130;
                                array = z2;
                                continue Label_0020;
                            }
                            case 130: {
                                array[n2] = intern;
                                n2 = 132;
                                s = "*PC\b;o\u0000\n";
                                n = 131;
                                array = z2;
                                continue Label_0020;
                            }
                            case 131: {
                                array[n2] = intern;
                                n2 = 133;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 132;
                                array = z2;
                                continue Label_0020;
                            }
                            case 132: {
                                array[n2] = intern;
                                n2 = 134;
                                s = "D\u0017\n\u000f1y\fK\b+c\u0019^\u0003;*\u001eX\u00078g\u001dD\u0012\u007fl\u0017XF6d\u001cO\u001e\u007f)";
                                n = 133;
                                array = z2;
                                continue Label_0020;
                            }
                            case 133: {
                                array[n2] = intern;
                                n2 = 135;
                                s = "x\u001dY\u00120x\u001dk\n3Y\fK\u0012:0XK\u0010>c\u0014\nE";
                                n = 134;
                                array = z2;
                                continue Label_0020;
                            }
                            case 134: {
                                array[n2] = intern;
                                n2 = 136;
                                s = "#B\n";
                                n = 135;
                                array = z2;
                                continue Label_0020;
                            }
                            case 135: {
                                array[n2] = intern;
                                n2 = 137;
                                s = "x\u001dY\u00120x\u001dk\n3Y\fK\u0012:0XX\u0003rk\f^\u0007<b\u0011D\u0001\u007fx\u001d^\u00076d\u001dNF";
                                n = 136;
                                array = z2;
                                continue Label_0020;
                            }
                            case 136: {
                                array[n2] = intern;
                                n2 = 138;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 137;
                                array = z2;
                                continue Label_0020;
                            }
                            case 137: {
                                array[n2] = intern;
                                n2 = 139;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 138;
                                array = z2;
                                continue Label_0020;
                            }
                            case 138: {
                                array[n2] = intern;
                                n2 = 140;
                                s = "x\u001dG\t)oXL\u00140gXN\u0003+k\u001bB\\\u007f";
                                n = 139;
                                array = z2;
                                continue Label_0020;
                            }
                            case 139: {
                                array[n2] = intern;
                                n2 = 141;
                                s = "n\u001d^\u0007<bB\n";
                                n = 140;
                                array = z2;
                                continue Label_0020;
                            }
                            case 140: {
                                array[n2] = intern;
                                n2 = 142;
                                s = "k\u0016N\u00140c\u001c\u0010\u0013,o\nu\u00106y\u0011H\n:U\u0010C\b+";
                                n = 141;
                                array = z2;
                                continue Label_0020;
                            }
                            case 141: {
                                array[n2] = intern;
                                n2 = 143;
                                s = "k\u0016N\u00140c\u001c\u0010\u00106o\u000fu\u0015+k\fO";
                                n = 142;
                                array = z2;
                                continue Label_0020;
                            }
                            case 142: {
                                array[n2] = intern;
                                n2 = 144;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 143;
                                array = z2;
                                continue Label_0020;
                            }
                            case 143: {
                                array[n2] = intern;
                                n2 = 145;
                                s = "L\nO\u00036d\u001f\n\u0000-k\u001fG\u00031~XC\b;o\u0000\n";
                                n = 144;
                                array = z2;
                                continue Label_0020;
                            }
                            case 144: {
                                array[n2] = intern;
                                n2 = 146;
                                s = "G\rY\u0012\u007fh\u001d\n\u0005>f\u0014O\u0002\u007fl\nE\u000b\u007fg\u0019C\b\u007f~\u0010X\u0003>nXE\u0000\u007fz\nE\u0005:y\u000b";
                                n = 145;
                                array = z2;
                                continue Label_0020;
                            }
                            case 145: {
                                array[n2] = intern;
                                n2 = 147;
                                s = "X\u001dI\u0013-y\u0011\\\u0003\u007fo\u0016^\u0014&*\fEF:r\u001dI\u0013+o(O\b;c\u0016M2-k\u0016Y\u0007<~\u0011E\b,";
                                n = 146;
                                array = z2;
                                continue Label_0020;
                            }
                            case 146: {
                                array[n2] = intern;
                                n2 = 148;
                                s = "w\u0005";
                                n = 147;
                                array = z2;
                                continue Label_0020;
                            }
                            case 147: {
                                array[n2] = intern;
                                n2 = 149;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-q";
                                n = 148;
                                array = z2;
                                continue Label_0020;
                            }
                            case 148: {
                                array[n2] = intern;
                                n2 = 150;
                                s = "*\u0011DF";
                                n = 149;
                                array = z2;
                                continue Label_0020;
                            }
                            case 149: {
                                array[n2] = intern;
                                n2 = 151;
                                s = "I\u0019DF1e\f\n\u0016:x\u001eE\u00142*\fB\u000f,*\u0019I\u00126e\u0016\n\u00079~\u001dXF0d+K\u0010:C\u0016Y\u0012>d\u001bO5+k\fO";
                                n = 150;
                                array = z2;
                                continue Label_0020;
                            }
                            case 150: {
                                array[n2] = intern;
                                n2 = 152;
                                s = "I\u0019DF1e\f\n\u0016:x\u001eE\u00142*\fB\u000f,*\u0019I\u00126e\u0016\n\u000f1y\u0011N\u0003\u007fe\u001e\n";
                                n = 151;
                                array = z2;
                                continue Label_0020;
                            }
                            case 151: {
                                array[n2] = intern;
                                n2 = 153;
                                s = "k\f^\u0007<bB\n";
                                n = 152;
                                array = z2;
                                continue Label_0020;
                            }
                            case 152: {
                                array[n2] = intern;
                                n2 = 154;
                                s = "L\nK\u00012o\u0016^F>f\nO\u0007;sXK\u0002;o\u001c\u0010F";
                                n = 153;
                                array = z2;
                                continue Label_0020;
                            }
                            case 153: {
                                array[n2] = intern;
                                n2 = 155;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 154;
                                array = z2;
                                continue Label_0020;
                            }
                            case 154: {
                                array[n2] = intern;
                                n2 = 156;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 155;
                                array = z2;
                                continue Label_0020;
                            }
                            case 155: {
                                array[n2] = intern;
                                n2 = 157;
                                s = "k\u001cNF9x\u0017GF>~\fK\u000570X";
                                n = 156;
                                array = z2;
                                continue Label_0020;
                            }
                            case 156: {
                                array[n2] = intern;
                                n2 = 158;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 157;
                                array = z2;
                                continue Label_0020;
                            }
                            case 157: {
                                array[n2] = intern;
                                n2 = 159;
                                s = "Z\u0017Z\u00166d\u001f\n\u0004>i\u0013\n\u0015+k\u001bAF,~\u0019^\u0003e*";
                                n = 158;
                                array = z2;
                                continue Label_0020;
                            }
                            case 158: {
                                array[n2] = intern;
                                n2 = 160;
                                s = "L\nK\u00012o\u0016^F";
                                n = 159;
                                array = z2;
                                continue Label_0020;
                            }
                            case 159: {
                                array[n2] = intern;
                                n2 = 161;
                                s = "*\u0011YF1e\f\n\u0005*x\nO\b+f\u0001\n\u000f1*\fB\u0003\u007fL\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 160;
                                array = z2;
                                continue Label_0020;
                            }
                            case 160: {
                                array[n2] = intern;
                                n2 = 162;
                                s = "K\u001b^\u000f)c\fSF7k\u000b\n\u0004:o\u0016\n\u0002:y\fX\t&o\u001c";
                                n = 161;
                                array = z2;
                                continue Label_0020;
                            }
                            case 161: {
                                array[n2] = intern;
                                n2 = 163;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 162;
                                array = z2;
                                continue Label_0020;
                            }
                            case 162: {
                                array[n2] = intern;
                                n2 = 164;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 163;
                                array = z2;
                                continue Label_0020;
                            }
                            case 163: {
                                array[n2] = intern;
                                n2 = 165;
                                s = "*\u000fC\u00127*";
                                n = 164;
                                array = z2;
                                continue Label_0020;
                            }
                            case 164: {
                                array[n2] = intern;
                                n2 = 166;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 165;
                                array = z2;
                                continue Label_0020;
                            }
                            case 165: {
                                array[n2] = intern;
                                n2 = 167;
                                s = "K\u001cN\u000f1mXK\u0010>c\u0014K\u00043oXH\u0007<aXY\u0012>i\u0013\n\u000f1n\u001dRF";
                                n = 166;
                                array = z2;
                                continue Label_0020;
                            }
                            case 166: {
                                array[n2] = intern;
                                n2 = 168;
                                s = "Y\u001d^\u00126d\u001f\n\u0004>i\u0013\n\u0015+k\u001bAF6d\u001cO\u001e\u007f";
                                n = 167;
                                array = z2;
                                continue Label_0020;
                            }
                            case 167: {
                                array[n2] = intern;
                                n2 = 169;
                                s = "*\fEF";
                                n = 168;
                                array = z2;
                                continue Label_0020;
                            }
                            case 168: {
                                array[n2] = intern;
                                n2 = 170;
                                s = "K\u001cN\u000f1mXH\u0007<aXY\u0012>i\u0013\n\u000f1n\u001dRF";
                                n = 169;
                                array = z2;
                                continue Label_0020;
                            }
                            case 169: {
                                array[n2] = intern;
                                n2 = 171;
                                s = "K\u0014F\t<k\fO\u0002\u007fl\nK\u00012o\u0016^F6d\u001cO\u001e\u007f";
                                n = 170;
                                array = z2;
                                continue Label_0020;
                            }
                            case 170: {
                                array[n2] = intern;
                                n2 = 172;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 171;
                                array = z2;
                                continue Label_0020;
                            }
                            case 171: {
                                array[n2] = intern;
                                n2 = 173;
                                s = "L\nK\u00012o\u0016^F1eXF\t1m\u001dXF:r\u0011Y\u0012,*\u001eE\u0014\u007fa\u001dSF";
                                n = 172;
                                array = z2;
                                continue Label_0020;
                            }
                            case 172: {
                                array[n2] = intern;
                                n2 = 174;
                                s = "0XC\b;o\u0000\n";
                                n = 173;
                                array = z2;
                                continue Label_0020;
                            }
                            case 173: {
                                array[n2] = intern;
                                n2 = 175;
                                s = "0XC\b;o\u0000\n";
                                n = 174;
                                array = z2;
                                continue Label_0020;
                            }
                            case 174: {
                                array[n2] = intern;
                                n2 = 176;
                                s = "L\nK\u00012o\u0016^F1eXF\t1m\u001dXF:r\u0011Y\u0012,*\u001eE\u0014\u007fa\u001dSF";
                                n = 175;
                                array = z2;
                                continue Label_0020;
                            }
                            case 175: {
                                array[n2] = intern;
                                n2 = 177;
                                s = "K\u0014X\u0003>n\u0001\n\u0007+~\u0019I\u000e:n";
                                n = 176;
                                array = z2;
                                continue Label_0020;
                            }
                            case 176: {
                                array[n2] = intern;
                                n2 = 178;
                                s = "*\fEF";
                                n = 177;
                                array = z2;
                                continue Label_0020;
                            }
                            case 177: {
                                array[n2] = intern;
                                n2 = 179;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 178;
                                array = z2;
                                continue Label_0020;
                            }
                            case 178: {
                                array[n2] = intern;
                                n2 = 180;
                                s = "Y\u001d^\u00126d\u001f\n\u0004>i\u0013\n\u0015+k\u001bAF6d\u001cO\u001e\u007f";
                                n = 179;
                                array = z2;
                                continue Label_0020;
                            }
                            case 179: {
                                array[n2] = intern;
                                n2 = 181;
                                s = "*\u000fC\u00127*";
                                n = 180;
                                array = z2;
                                continue Label_0020;
                            }
                            case 180: {
                                array[n2] = intern;
                                n2 = 182;
                                s = "K\u001cN\u000f1mXH\u0007<aXY\u0012>i\u0013\n\u000f1n\u001dRF";
                                n = 181;
                                array = z2;
                                continue Label_0020;
                            }
                            case 181: {
                                array[n2] = intern;
                                n2 = 183;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 182;
                                array = z2;
                                continue Label_0020;
                            }
                            case 182: {
                                array[n2] = intern;
                                n2 = 184;
                                s = "*\u0016O\u0015+c\u0016M[";
                                n = 183;
                                array = z2;
                                continue Label_0020;
                            }
                            case 183: {
                                array[n2] = intern;
                                n2 = 185;
                                s = "L\nK\u00012o\u0016^+>d\u0019M\u0003-";
                                n = 184;
                                array = z2;
                                continue Label_0020;
                            }
                            case 184: {
                                array[n2] = intern;
                                n2 = 186;
                                s = "x\u001dG\t)oB\n";
                                n = 185;
                                array = z2;
                                continue Label_0020;
                            }
                            case 185: {
                                break;
                            }
                        }
                        while (true) {
                            array[n2] = intern;
                            z = z2;
                            while (true) {
                                Label_5398: {
                                    try {
                                        FragmentManagerImpl.DEBUG = false;
                                        if (Build$VERSION.SDK_INT >= 11) {
                                            HONEYCOMB = (honeycomb != 0);
                                            DECELERATE_QUINT = (Interpolator)new DecelerateInterpolator(2.5f);
                                            DECELERATE_CUBIC = (Interpolator)new DecelerateInterpolator(1.5f);
                                            ACCELERATE_QUINT = (Interpolator)new AccelerateInterpolator(2.5f);
                                            ACCELERATE_CUBIC = (Interpolator)new AccelerateInterpolator(1.5f);
                                            return;
                                        }
                                        break Label_5398;
                                        while (true) {
                                            char c = '\0';
                                            final char c2;
                                            charArray[n3] = (char)(c ^ c2);
                                            ++n3;
                                            break;
                                            Label_5365: {
                                                c = '\n';
                                            }
                                            continue;
                                            c2 = charArray[n3];
                                            Label_5379:
                                            c = '*';
                                            continue;
                                            Label_5344:
                                            c = '_';
                                            continue;
                                            Label_5372:
                                            c = 'x';
                                            continue;
                                            Label_5386:
                                            c = 'f';
                                            continue;
                                        }
                                    }
                                    // switch([Lcom.strobel.decompiler.ast.Label;@4b612966, n3 % 5)
                                    catch (IllegalArgumentException ex) {
                                        throw ex;
                                    }
                                }
                                honeycomb = 0;
                                continue;
                            }
                        }
                    }
                }
            }
            break;
        }
    }
    
    FragmentManagerImpl() {
        this.mCurState = 0;
        this.mStateBundle = null;
        this.mStateArray = null;
        this.mExecCommit = new FragmentManagerImpl$1(this);
    }
    
    private void checkStateLoss() {
        try {
            if (this.mStateSaved) {
                throw new IllegalStateException(FragmentManagerImpl.z[151]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (this.mNoTransactionsBecause != null) {
                throw new IllegalStateException(FragmentManagerImpl.z[152] + this.mNoTransactionsBecause);
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
    }
    
    static Animation makeFadeAnimation(final Context context, final float n, final float n2) {
        final AlphaAnimation alphaAnimation = new AlphaAnimation(n, n2);
        alphaAnimation.setInterpolator(FragmentManagerImpl.DECELERATE_CUBIC);
        alphaAnimation.setDuration(220L);
        return (Animation)alphaAnimation;
    }
    
    static Animation makeOpenCloseAnimation(final Context context, final float n, final float n2, final float n3, final float n4) {
        final AnimationSet set = new AnimationSet(false);
        final ScaleAnimation scaleAnimation = new ScaleAnimation(n, n2, n, n2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(FragmentManagerImpl.DECELERATE_QUINT);
        scaleAnimation.setDuration(220L);
        set.addAnimation((Animation)scaleAnimation);
        final AlphaAnimation alphaAnimation = new AlphaAnimation(n3, n4);
        alphaAnimation.setInterpolator(FragmentManagerImpl.DECELERATE_CUBIC);
        alphaAnimation.setDuration(220L);
        set.addAnimation((Animation)alphaAnimation);
        return (Animation)set;
    }
    
    public static int reverseTransit(final int n) {
        final int a = Fragment.a;
        int n2 = 0;
        Label_0050: {
            switch (n) {
                case 4097: {
                    n2 = 8194;
                    if (a != 0) {
                        break Label_0050;
                    }
                    break;
                }
                case 8194: {
                    n2 = 4097;
                    if (a != 0) {
                        return 4099;
                    }
                    break;
                }
                case 4099: {
                    return 4099;
                }
            }
        }
        return n2;
    }
    
    private void throwException(final RuntimeException ex) {
        Log.e(FragmentManagerImpl.z[8], ex.getMessage());
        Log.e(FragmentManagerImpl.z[7], FragmentManagerImpl.z[2]);
        final PrintWriter printWriter = new PrintWriter(new LogWriter(FragmentManagerImpl.z[4]));
        while (true) {
            Label_0104: {
                if (this.mActivity == null) {
                    break Label_0104;
                }
                try {
                    this.mActivity.dump(FragmentManagerImpl.z[11], null, printWriter, new String[0]);
                    throw ex;
                }
                catch (Exception ex2) {
                    Log.e(FragmentManagerImpl.z[5], FragmentManagerImpl.z[9], (Throwable)ex2);
                    if (Fragment.a == 0) {
                        throw ex;
                    }
                }
                try {
                    this.dump(FragmentManagerImpl.z[10], null, printWriter, new String[0]);
                    continue;
                }
                catch (Exception ex3) {
                    Log.e(FragmentManagerImpl.z[6], FragmentManagerImpl.z[3], (Throwable)ex3);
                    continue;
                }
            }
            continue;
        }
    }
    
    public static int transitToStyleIndex(final int n, final boolean b) {
        final int a = Fragment.a;
        int n2 = -1;
        Label_0062: {
            switch (n) {
                case 4097: {
                    if (b) {
                        n2 = 1;
                    }
                    else {
                        n2 = 2;
                    }
                    if (a != 0) {
                        break Label_0062;
                    }
                    break;
                }
                case 8194: {
                    if (b) {
                        n2 = 3;
                    }
                    else {
                        n2 = 4;
                    }
                    if (a != 0) {
                        break Label_0062;
                    }
                    break;
                }
                case 4099: {
                    if (b) {
                        return 5;
                    }
                    return 6;
                }
            }
        }
        return n2;
    }
    
    void addBackStackState(final BackStackRecord backStackRecord) {
        try {
            if (this.mBackStack == null) {
                this.mBackStack = new ArrayList();
            }
            this.mBackStack.add(backStackRecord);
            this.reportBackStackChanged();
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void addFragment(final Fragment p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //     4: ifnonnull       18
        //     7: aload_0        
        //     8: new             Ljava/util/ArrayList;
        //    11: dup            
        //    12: invokespecial   java/util/ArrayList.<init>:()V
        //    15: putfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //    18: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //    21: ifeq            57
        //    24: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    27: bipush          15
        //    29: aaload         
        //    30: new             Ljava/lang/StringBuilder;
        //    33: dup            
        //    34: invokespecial   java/lang/StringBuilder.<init>:()V
        //    37: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    40: bipush          16
        //    42: aaload         
        //    43: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    46: aload_1        
        //    47: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    50: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    53: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    56: pop            
        //    57: aload_0        
        //    58: aload_1        
        //    59: invokevirtual   android/support/v4/app/FragmentManagerImpl.makeActive:(Landroid/support/v4/app/Fragment;)V
        //    62: aload_1        
        //    63: getfield        android/support/v4/app/Fragment.mDetached:Z
        //    66: istore          7
        //    68: iload           7
        //    70: ifne            184
        //    73: aload_0        
        //    74: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //    77: aload_1        
        //    78: invokevirtual   java/util/ArrayList.contains:(Ljava/lang/Object;)Z
        //    81: ifeq            133
        //    84: new             Ljava/lang/IllegalStateException;
        //    87: dup            
        //    88: new             Ljava/lang/StringBuilder;
        //    91: dup            
        //    92: invokespecial   java/lang/StringBuilder.<init>:()V
        //    95: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    98: bipush          14
        //   100: aaload         
        //   101: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   104: aload_1        
        //   105: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   108: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   111: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   114: athrow         
        //   115: astore          6
        //   117: aload           6
        //   119: athrow         
        //   120: astore_3       
        //   121: aload_3        
        //   122: athrow         
        //   123: astore          4
        //   125: aload           4
        //   127: athrow         
        //   128: astore          5
        //   130: aload           5
        //   132: athrow         
        //   133: aload_0        
        //   134: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   137: aload_1        
        //   138: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   141: pop            
        //   142: aload_1        
        //   143: iconst_1       
        //   144: putfield        android/support/v4/app/Fragment.mAdded:Z
        //   147: aload_1        
        //   148: iconst_0       
        //   149: putfield        android/support/v4/app/Fragment.mRemoving:Z
        //   152: aload_1        
        //   153: getfield        android/support/v4/app/Fragment.mHasMenu:Z
        //   156: istore          11
        //   158: iload           11
        //   160: ifeq            175
        //   163: aload_1        
        //   164: getfield        android/support/v4/app/Fragment.mMenuVisible:Z
        //   167: ifeq            175
        //   170: aload_0        
        //   171: iconst_1       
        //   172: putfield        android/support/v4/app/FragmentManagerImpl.mNeedMenuInvalidate:Z
        //   175: iload_2        
        //   176: ifeq            184
        //   179: aload_0        
        //   180: aload_1        
        //   181: invokevirtual   android/support/v4/app/FragmentManagerImpl.moveToState:(Landroid/support/v4/app/Fragment;)V
        //   184: return         
        //   185: astore          8
        //   187: aload           8
        //   189: athrow         
        //   190: astore          9
        //   192: aload           9
        //   194: athrow         
        //   195: astore          12
        //   197: aload           12
        //   199: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      18     120    123    Ljava/lang/IllegalArgumentException;
        //  18     57     123    128    Ljava/lang/IllegalArgumentException;
        //  57     68     128    133    Ljava/lang/IllegalArgumentException;
        //  73     115    115    120    Ljava/lang/IllegalArgumentException;
        //  130    133    115    120    Ljava/lang/IllegalArgumentException;
        //  133    158    185    190    Ljava/lang/IllegalArgumentException;
        //  163    175    190    195    Ljava/lang/IllegalArgumentException;
        //  179    184    195    200    Ljava/lang/IllegalArgumentException;
        //  187    190    190    195    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 101, Size: 101
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public int allocBackStackIndex(final BackStackRecord p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        android/support/v4/app/FragmentManagerImpl.mAvailBackStackIndices:Ljava/util/ArrayList;
        //     6: astore_3       
        //     7: aload_3        
        //     8: ifnull          21
        //    11: aload_0        
        //    12: getfield        android/support/v4/app/FragmentManagerImpl.mAvailBackStackIndices:Ljava/util/ArrayList;
        //    15: invokevirtual   java/util/ArrayList.size:()I
        //    18: ifgt            142
        //    21: aload_0        
        //    22: getfield        android/support/v4/app/FragmentManagerImpl.mBackStackIndices:Ljava/util/ArrayList;
        //    25: astore          6
        //    27: aload           6
        //    29: ifnonnull       43
        //    32: aload_0        
        //    33: new             Ljava/util/ArrayList;
        //    36: dup            
        //    37: invokespecial   java/util/ArrayList.<init>:()V
        //    40: putfield        android/support/v4/app/FragmentManagerImpl.mBackStackIndices:Ljava/util/ArrayList;
        //    43: aload_0        
        //    44: getfield        android/support/v4/app/FragmentManagerImpl.mBackStackIndices:Ljava/util/ArrayList;
        //    47: invokevirtual   java/util/ArrayList.size:()I
        //    50: istore          7
        //    52: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //    55: ifeq            108
        //    58: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    61: sipush          179
        //    64: aaload         
        //    65: new             Ljava/lang/StringBuilder;
        //    68: dup            
        //    69: invokespecial   java/lang/StringBuilder.<init>:()V
        //    72: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    75: sipush          180
        //    78: aaload         
        //    79: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    82: iload           7
        //    84: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    87: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    90: sipush          178
        //    93: aaload         
        //    94: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    97: aload_1        
        //    98: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   101: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   104: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   107: pop            
        //   108: aload_0        
        //   109: getfield        android/support/v4/app/FragmentManagerImpl.mBackStackIndices:Ljava/util/ArrayList;
        //   112: aload_1        
        //   113: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   116: pop            
        //   117: aload_0        
        //   118: monitorexit    
        //   119: iload           7
        //   121: ireturn        
        //   122: astore          4
        //   124: aload           4
        //   126: athrow         
        //   127: astore          5
        //   129: aload           5
        //   131: athrow         
        //   132: astore_2       
        //   133: aload_0        
        //   134: monitorexit    
        //   135: aload_2        
        //   136: athrow         
        //   137: astore          8
        //   139: aload           8
        //   141: athrow         
        //   142: aload_0        
        //   143: getfield        android/support/v4/app/FragmentManagerImpl.mAvailBackStackIndices:Ljava/util/ArrayList;
        //   146: iconst_m1      
        //   147: aload_0        
        //   148: getfield        android/support/v4/app/FragmentManagerImpl.mAvailBackStackIndices:Ljava/util/ArrayList;
        //   151: invokevirtual   java/util/ArrayList.size:()I
        //   154: iadd           
        //   155: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //   158: checkcast       Ljava/lang/Integer;
        //   161: invokevirtual   java/lang/Integer.intValue:()I
        //   164: istore          11
        //   166: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   169: ifeq            222
        //   172: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   175: sipush          183
        //   178: aaload         
        //   179: new             Ljava/lang/StringBuilder;
        //   182: dup            
        //   183: invokespecial   java/lang/StringBuilder.<init>:()V
        //   186: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   189: sipush          182
        //   192: aaload         
        //   193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   196: iload           11
        //   198: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   201: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   204: sipush          181
        //   207: aaload         
        //   208: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   211: aload_1        
        //   212: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   215: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   218: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   221: pop            
        //   222: aload_0        
        //   223: getfield        android/support/v4/app/FragmentManagerImpl.mBackStackIndices:Ljava/util/ArrayList;
        //   226: iload           11
        //   228: aload_1        
        //   229: invokevirtual   java/util/ArrayList.set:(ILjava/lang/Object;)Ljava/lang/Object;
        //   232: pop            
        //   233: aload_0        
        //   234: monitorexit    
        //   235: iload           11
        //   237: ireturn        
        //   238: astore          12
        //   240: aload           12
        //   242: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  2      7      132    137    Any
        //  11     21     122    127    Ljava/lang/IllegalArgumentException;
        //  11     21     132    137    Any
        //  21     27     122    127    Ljava/lang/IllegalArgumentException;
        //  21     27     132    137    Any
        //  32     43     127    132    Ljava/lang/IllegalArgumentException;
        //  32     43     132    137    Any
        //  43     52     132    137    Any
        //  52     108    137    142    Ljava/lang/IllegalArgumentException;
        //  52     108    132    137    Any
        //  108    119    132    137    Any
        //  124    127    127    132    Ljava/lang/IllegalArgumentException;
        //  124    127    132    137    Any
        //  129    132    132    137    Any
        //  133    135    132    137    Any
        //  139    142    132    137    Any
        //  142    166    132    137    Any
        //  166    222    238    243    Ljava/lang/IllegalArgumentException;
        //  166    222    132    137    Any
        //  222    235    132    137    Any
        //  240    243    132    137    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0043:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void attachActivity(final FragmentActivity mActivity, final FragmentContainer mContainer, final Fragment mParent) {
        try {
            if (this.mActivity != null) {
                throw new IllegalStateException(FragmentManagerImpl.z[177]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        this.mActivity = mActivity;
        this.mContainer = mContainer;
        this.mParent = mParent;
    }
    
    public void attachFragment(final Fragment p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //     3: ifeq            41
        //     6: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //     9: sipush          156
        //    12: aaload         
        //    13: new             Ljava/lang/StringBuilder;
        //    16: dup            
        //    17: invokespecial   java/lang/StringBuilder.<init>:()V
        //    20: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    23: sipush          153
        //    26: aaload         
        //    27: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    30: aload_1        
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    34: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    37: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    40: pop            
        //    41: aload_1        
        //    42: getfield        android/support/v4/app/Fragment.mDetached:Z
        //    45: istore          8
        //    47: iload           8
        //    49: ifeq            244
        //    52: aload_1        
        //    53: iconst_0       
        //    54: putfield        android/support/v4/app/Fragment.mDetached:Z
        //    57: aload_1        
        //    58: getfield        android/support/v4/app/Fragment.mAdded:Z
        //    61: istore          9
        //    63: iload           9
        //    65: ifne            244
        //    68: aload_0        
        //    69: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //    72: ifnonnull       86
        //    75: aload_0        
        //    76: new             Ljava/util/ArrayList;
        //    79: dup            
        //    80: invokespecial   java/util/ArrayList.<init>:()V
        //    83: putfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //    86: aload_0        
        //    87: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //    90: aload_1        
        //    91: invokevirtual   java/util/ArrayList.contains:(Ljava/lang/Object;)Z
        //    94: ifeq            154
        //    97: new             Ljava/lang/IllegalStateException;
        //   100: dup            
        //   101: new             Ljava/lang/StringBuilder;
        //   104: dup            
        //   105: invokespecial   java/lang/StringBuilder.<init>:()V
        //   108: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   111: sipush          154
        //   114: aaload         
        //   115: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   118: aload_1        
        //   119: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   122: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   125: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   128: athrow         
        //   129: astore          10
        //   131: aload           10
        //   133: athrow         
        //   134: astore          4
        //   136: aload           4
        //   138: athrow         
        //   139: astore          5
        //   141: aload           5
        //   143: athrow         
        //   144: astore          6
        //   146: aload           6
        //   148: athrow         
        //   149: astore          7
        //   151: aload           7
        //   153: athrow         
        //   154: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   157: ifeq            195
        //   160: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   163: sipush          155
        //   166: aaload         
        //   167: new             Ljava/lang/StringBuilder;
        //   170: dup            
        //   171: invokespecial   java/lang/StringBuilder.<init>:()V
        //   174: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   177: sipush          157
        //   180: aaload         
        //   181: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   184: aload_1        
        //   185: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   188: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   191: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   194: pop            
        //   195: aload_0        
        //   196: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   199: aload_1        
        //   200: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   203: pop            
        //   204: aload_1        
        //   205: iconst_1       
        //   206: putfield        android/support/v4/app/Fragment.mAdded:Z
        //   209: aload_1        
        //   210: getfield        android/support/v4/app/Fragment.mHasMenu:Z
        //   213: istore          15
        //   215: iload           15
        //   217: ifeq            232
        //   220: aload_1        
        //   221: getfield        android/support/v4/app/Fragment.mMenuVisible:Z
        //   224: ifeq            232
        //   227: aload_0        
        //   228: iconst_1       
        //   229: putfield        android/support/v4/app/FragmentManagerImpl.mNeedMenuInvalidate:Z
        //   232: aload_0        
        //   233: aload_1        
        //   234: aload_0        
        //   235: getfield        android/support/v4/app/FragmentManagerImpl.mCurState:I
        //   238: iload_2        
        //   239: iload_3        
        //   240: iconst_0       
        //   241: invokevirtual   android/support/v4/app/FragmentManagerImpl.moveToState:(Landroid/support/v4/app/Fragment;IIIZ)V
        //   244: return         
        //   245: astore          11
        //   247: aload           11
        //   249: athrow         
        //   250: astore          12
        //   252: aload           12
        //   254: athrow         
        //   255: astore          13
        //   257: aload           13
        //   259: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      41     134    139    Ljava/lang/IllegalArgumentException;
        //  41     47     139    144    Ljava/lang/IllegalArgumentException;
        //  52     63     144    149    Ljava/lang/IllegalArgumentException;
        //  68     86     149    154    Ljava/lang/IllegalArgumentException;
        //  86     129    129    134    Ljava/lang/IllegalArgumentException;
        //  141    144    144    149    Ljava/lang/IllegalArgumentException;
        //  146    149    149    154    Ljava/lang/IllegalArgumentException;
        //  154    195    245    250    Ljava/lang/IllegalArgumentException;
        //  195    215    250    255    Ljava/lang/IllegalArgumentException;
        //  220    232    255    260    Ljava/lang/IllegalArgumentException;
        //  252    255    255    260    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 126, Size: 126
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public FragmentTransaction beginTransaction() {
        return new BackStackRecord(this);
    }
    
    public void detachFragment(final Fragment p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //     3: ifeq            41
        //     6: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //     9: sipush          139
        //    12: aaload         
        //    13: new             Ljava/lang/StringBuilder;
        //    16: dup            
        //    17: invokespecial   java/lang/StringBuilder.<init>:()V
        //    20: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    23: sipush          141
        //    26: aaload         
        //    27: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    30: aload_1        
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    34: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    37: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    40: pop            
        //    41: aload_1        
        //    42: getfield        android/support/v4/app/Fragment.mDetached:Z
        //    45: istore          9
        //    47: iload           9
        //    49: ifne            166
        //    52: aload_1        
        //    53: iconst_1       
        //    54: putfield        android/support/v4/app/Fragment.mDetached:Z
        //    57: aload_1        
        //    58: getfield        android/support/v4/app/Fragment.mAdded:Z
        //    61: istore          10
        //    63: iload           10
        //    65: ifeq            166
        //    68: aload_0        
        //    69: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //    72: astore          11
        //    74: aload           11
        //    76: ifnull          129
        //    79: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //    82: ifeq            120
        //    85: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    88: sipush          138
        //    91: aaload         
        //    92: new             Ljava/lang/StringBuilder;
        //    95: dup            
        //    96: invokespecial   java/lang/StringBuilder.<init>:()V
        //    99: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   102: sipush          140
        //   105: aaload         
        //   106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   109: aload_1        
        //   110: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   113: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   116: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   119: pop            
        //   120: aload_0        
        //   121: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   124: aload_1        
        //   125: invokevirtual   java/util/ArrayList.remove:(Ljava/lang/Object;)Z
        //   128: pop            
        //   129: aload_1        
        //   130: getfield        android/support/v4/app/Fragment.mHasMenu:Z
        //   133: istore          14
        //   135: iload           14
        //   137: ifeq            152
        //   140: aload_1        
        //   141: getfield        android/support/v4/app/Fragment.mMenuVisible:Z
        //   144: ifeq            152
        //   147: aload_0        
        //   148: iconst_1       
        //   149: putfield        android/support/v4/app/FragmentManagerImpl.mNeedMenuInvalidate:Z
        //   152: aload_1        
        //   153: iconst_0       
        //   154: putfield        android/support/v4/app/Fragment.mAdded:Z
        //   157: aload_0        
        //   158: aload_1        
        //   159: iconst_1       
        //   160: iload_2        
        //   161: iload_3        
        //   162: iconst_0       
        //   163: invokevirtual   android/support/v4/app/FragmentManagerImpl.moveToState:(Landroid/support/v4/app/Fragment;IIIZ)V
        //   166: return         
        //   167: astore          4
        //   169: aload           4
        //   171: athrow         
        //   172: astore          5
        //   174: aload           5
        //   176: athrow         
        //   177: astore          6
        //   179: aload           6
        //   181: athrow         
        //   182: astore          7
        //   184: aload           7
        //   186: athrow         
        //   187: astore          8
        //   189: aload           8
        //   191: athrow         
        //   192: astore          12
        //   194: aload           12
        //   196: athrow         
        //   197: astore          13
        //   199: aload           13
        //   201: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      41     167    172    Ljava/lang/IllegalArgumentException;
        //  41     47     172    177    Ljava/lang/IllegalArgumentException;
        //  52     63     177    182    Ljava/lang/IllegalArgumentException;
        //  68     74     182    187    Ljava/lang/IllegalArgumentException;
        //  79     120    187    192    Ljava/lang/IllegalArgumentException;
        //  129    135    192    197    Ljava/lang/IllegalArgumentException;
        //  140    152    197    202    Ljava/lang/IllegalArgumentException;
        //  174    177    177    182    Ljava/lang/IllegalArgumentException;
        //  179    182    182    187    Ljava/lang/IllegalArgumentException;
        //  184    187    187    192    Ljava/lang/IllegalArgumentException;
        //  194    197    197    202    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 100, Size: 100
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void dispatchActivityCreated() {
        this.moveToState(2, this.mStateSaved = false);
    }
    
    public void dispatchConfigurationChanged(final Configuration configuration) {
        final int a = Fragment.a;
        if (this.mAdded == null) {
            return;
        }
        int n = 0;
        while (true) {
            if (n >= this.mAdded.size()) {
                return;
            }
            final Fragment fragment = this.mAdded.get(n);
            int n2 = 0;
            Label_0048: {
                if (fragment == null) {
                    break Label_0048;
                }
                try {
                    fragment.performConfigurationChanged(configuration);
                    n2 = n + 1;
                    if (a != 0) {
                        return;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            n = n2;
            continue;
        }
    }
    
    public boolean dispatchContextItemSelected(final MenuItem menuItem) {
        final int a = Fragment.a;
        final ArrayList mAdded = this.mAdded;
        boolean b = false;
        if (mAdded == null) {
            return b;
        }
        int n = 0;
        while (true) {
            final int size = this.mAdded.size();
            b = false;
            if (n >= size) {
                return b;
            }
            final Fragment fragment = this.mAdded.get(n);
            Label_0081: {
                if (fragment == null) {
                    break Label_0081;
                }
                try {
                    if (fragment.performContextItemSelected(menuItem)) {
                        b = true;
                        return b;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            final int n2 = n + 1;
            b = false;
            if (a == 0) {
                n = n2;
                continue;
            }
            break;
        }
        return b;
    }
    
    public void dispatchCreate() {
        this.moveToState(1, this.mStateSaved = false);
    }
    
    public boolean dispatchCreateOptionsMenu(final Menu p0, final MenuInflater p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore_3       
        //     4: aconst_null    
        //     5: astore          4
        //     7: aload_0        
        //     8: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //    11: ifnull          193
        //    14: iconst_0       
        //    15: istore          10
        //    17: iconst_0       
        //    18: istore          5
        //    20: iload           10
        //    22: aload_0        
        //    23: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //    26: invokevirtual   java/util/ArrayList.size:()I
        //    29: if_icmpge       100
        //    32: aload_0        
        //    33: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //    36: iload           10
        //    38: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    41: checkcast       Landroid/support/v4/app/Fragment;
        //    44: astore          11
        //    46: aload           11
        //    48: ifnull          90
        //    51: aload           11
        //    53: aload_1        
        //    54: aload_2        
        //    55: invokevirtual   android/support/v4/app/Fragment.performCreateOptionsMenu:(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
        //    58: istore          14
        //    60: iload           14
        //    62: ifeq            90
        //    65: iconst_1       
        //    66: istore          5
        //    68: aload           4
        //    70: ifnonnull       82
        //    73: new             Ljava/util/ArrayList;
        //    76: dup            
        //    77: invokespecial   java/util/ArrayList.<init>:()V
        //    80: astore          4
        //    82: aload           4
        //    84: aload           11
        //    86: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    89: pop            
        //    90: iload           10
        //    92: iconst_1       
        //    93: iadd           
        //    94: istore          12
        //    96: iload_3        
        //    97: ifeq            186
        //   100: aload_0        
        //   101: getfield        android/support/v4/app/FragmentManagerImpl.mCreatedMenus:Ljava/util/ArrayList;
        //   104: astore          6
        //   106: iconst_0       
        //   107: istore          7
        //   109: aload           6
        //   111: ifnull          167
        //   114: iload           7
        //   116: aload_0        
        //   117: getfield        android/support/v4/app/FragmentManagerImpl.mCreatedMenus:Ljava/util/ArrayList;
        //   120: invokevirtual   java/util/ArrayList.size:()I
        //   123: if_icmpge       167
        //   126: aload_0        
        //   127: getfield        android/support/v4/app/FragmentManagerImpl.mCreatedMenus:Ljava/util/ArrayList;
        //   130: iload           7
        //   132: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   135: checkcast       Landroid/support/v4/app/Fragment;
        //   138: astore          8
        //   140: aload           4
        //   142: ifnull          155
        //   145: aload           4
        //   147: aload           8
        //   149: invokevirtual   java/util/ArrayList.contains:(Ljava/lang/Object;)Z
        //   152: ifne            160
        //   155: aload           8
        //   157: invokevirtual   android/support/v4/app/Fragment.onDestroyOptionsMenu:()V
        //   160: iinc            7, 1
        //   163: iload_3        
        //   164: ifeq            114
        //   167: aload_0        
        //   168: aload           4
        //   170: putfield        android/support/v4/app/FragmentManagerImpl.mCreatedMenus:Ljava/util/ArrayList;
        //   173: iload           5
        //   175: ireturn        
        //   176: astore          13
        //   178: aload           13
        //   180: athrow         
        //   181: astore          9
        //   183: aload           9
        //   185: athrow         
        //   186: iload           12
        //   188: istore          10
        //   190: goto            20
        //   193: aconst_null    
        //   194: astore          4
        //   196: iconst_0       
        //   197: istore          5
        //   199: goto            100
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  51     60     176    181    Ljava/lang/IllegalArgumentException;
        //  145    155    181    186    Ljava/lang/IllegalArgumentException;
        //  155    160    181    186    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0155:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void dispatchDestroy() {
        this.mDestroyed = true;
        this.execPendingActions();
        this.moveToState(0, false);
        this.mActivity = null;
        this.mContainer = null;
        this.mParent = null;
    }
    
    public void dispatchDestroyView() {
        this.moveToState(1, false);
    }
    
    public void dispatchLowMemory() {
        final int a = Fragment.a;
        if (this.mAdded == null) {
            return;
        }
        int n = 0;
        while (true) {
            if (n >= this.mAdded.size()) {
                return;
            }
            final Fragment fragment = this.mAdded.get(n);
            int n2 = 0;
            Label_0044: {
                if (fragment == null) {
                    break Label_0044;
                }
                try {
                    fragment.performLowMemory();
                    n2 = n + 1;
                    if (a != 0) {
                        return;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            n = n2;
            continue;
        }
    }
    
    public boolean dispatchOptionsItemSelected(final MenuItem menuItem) {
        final int a = Fragment.a;
        final ArrayList mAdded = this.mAdded;
        boolean b = false;
        if (mAdded == null) {
            return b;
        }
        int n = 0;
        while (true) {
            final int size = this.mAdded.size();
            b = false;
            if (n >= size) {
                return b;
            }
            final Fragment fragment = this.mAdded.get(n);
            Label_0081: {
                if (fragment == null) {
                    break Label_0081;
                }
                try {
                    if (fragment.performOptionsItemSelected(menuItem)) {
                        b = true;
                        return b;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            final int n2 = n + 1;
            b = false;
            if (a == 0) {
                n = n2;
                continue;
            }
            break;
        }
        return b;
    }
    
    public void dispatchOptionsMenuClosed(final Menu menu) {
        final int a = Fragment.a;
        if (this.mAdded == null) {
            return;
        }
        int n = 0;
        while (true) {
            if (n >= this.mAdded.size()) {
                return;
            }
            final Fragment fragment = this.mAdded.get(n);
            int n2 = 0;
            Label_0048: {
                if (fragment == null) {
                    break Label_0048;
                }
                try {
                    fragment.performOptionsMenuClosed(menu);
                    n2 = n + 1;
                    if (a != 0) {
                        return;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            n = n2;
            continue;
        }
    }
    
    public void dispatchPause() {
        this.moveToState(4, false);
    }
    
    public boolean dispatchPrepareOptionsMenu(final Menu menu) {
        final int a = Fragment.a;
        if (this.mAdded == null) {
            return false;
        }
        int n = 0;
        boolean b = false;
        while (true) {
            if (n >= this.mAdded.size()) {
                return b;
            }
            final Fragment fragment = this.mAdded.get(n);
            int n2 = 0;
            Label_0061: {
                if (fragment == null) {
                    break Label_0061;
                }
                try {
                    if (fragment.performPrepareOptionsMenu(menu)) {
                        b = true;
                    }
                    n2 = n + 1;
                    if (a != 0) {
                        return b;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
            }
            n = n2;
        }
    }
    
    public void dispatchReallyStop() {
        this.moveToState(2, false);
    }
    
    public void dispatchResume() {
        this.moveToState(5, this.mStateSaved = false);
    }
    
    public void dispatchStart() {
        this.moveToState(4, this.mStateSaved = false);
    }
    
    public void dispatchStop() {
        this.mStateSaved = true;
        this.moveToState(3, false);
    }
    
    public void dump(final String p0, final FileDescriptor p1, final PrintWriter p2, final String[] p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore          5
        //     3: getstatic       android/support/v4/app/Fragment.a:I
        //     6: istore          6
        //     8: new             Ljava/lang/StringBuilder;
        //    11: dup            
        //    12: invokespecial   java/lang/StringBuilder.<init>:()V
        //    15: aload_1        
        //    16: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    19: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    22: bipush          104
        //    24: aaload         
        //    25: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    28: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    31: astore          7
        //    33: aload_0        
        //    34: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //    37: ifnull          175
        //    40: aload_0        
        //    41: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //    44: invokevirtual   java/util/ArrayList.size:()I
        //    47: istore          37
        //    49: iload           37
        //    51: ifle            175
        //    54: aload_3        
        //    55: aload_1        
        //    56: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    59: aload_3        
        //    60: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    63: bipush          91
        //    65: aaload         
        //    66: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    69: aload_3        
        //    70: aload_0        
        //    71: invokestatic    java/lang/System.identityHashCode:(Ljava/lang/Object;)I
        //    74: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //    77: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    80: aload_3        
        //    81: ldc_w           ":"
        //    84: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //    87: iconst_0       
        //    88: istore          38
        //    90: iload           38
        //    92: iload           37
        //    94: if_icmpge       175
        //    97: aload_0        
        //    98: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //   101: iload           38
        //   103: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   106: checkcast       Landroid/support/v4/app/Fragment;
        //   109: astore          39
        //   111: aload_3        
        //   112: aload_1        
        //   113: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   116: aload_3        
        //   117: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   120: bipush          90
        //   122: aaload         
        //   123: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   126: aload_3        
        //   127: iload           38
        //   129: invokevirtual   java/io/PrintWriter.print:(I)V
        //   132: aload_3        
        //   133: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   136: bipush          115
        //   138: aaload         
        //   139: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   142: aload_3        
        //   143: aload           39
        //   145: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   148: aload           39
        //   150: ifnull          164
        //   153: aload           39
        //   155: aload           7
        //   157: aload_2        
        //   158: aload_3        
        //   159: aload           4
        //   161: invokevirtual   android/support/v4/app/Fragment.dump:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
        //   164: iload           38
        //   166: iconst_1       
        //   167: iadd           
        //   168: istore          41
        //   170: iload           6
        //   172: ifeq            1129
        //   175: aload_0        
        //   176: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   179: ifnull          286
        //   182: aload_0        
        //   183: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   186: invokevirtual   java/util/ArrayList.size:()I
        //   189: istore          33
        //   191: iload           33
        //   193: ifle            286
        //   196: aload_3        
        //   197: aload_1        
        //   198: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   201: aload_3        
        //   202: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   205: bipush          96
        //   207: aaload         
        //   208: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   211: iconst_0       
        //   212: istore          34
        //   214: iload           34
        //   216: iload           33
        //   218: if_icmpge       286
        //   221: aload_0        
        //   222: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   225: iload           34
        //   227: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   230: checkcast       Landroid/support/v4/app/Fragment;
        //   233: astore          35
        //   235: aload_3        
        //   236: aload_1        
        //   237: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   240: aload_3        
        //   241: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   244: bipush          94
        //   246: aaload         
        //   247: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   250: aload_3        
        //   251: iload           34
        //   253: invokevirtual   java/io/PrintWriter.print:(I)V
        //   256: aload_3        
        //   257: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   260: bipush          88
        //   262: aaload         
        //   263: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   266: aload_3        
        //   267: aload           35
        //   269: invokevirtual   android/support/v4/app/Fragment.toString:()Ljava/lang/String;
        //   272: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   275: iload           34
        //   277: iconst_1       
        //   278: iadd           
        //   279: istore          36
        //   281: iload           6
        //   283: ifeq            1122
        //   286: aload_0        
        //   287: getfield        android/support/v4/app/FragmentManagerImpl.mCreatedMenus:Ljava/util/ArrayList;
        //   290: ifnull          397
        //   293: aload_0        
        //   294: getfield        android/support/v4/app/FragmentManagerImpl.mCreatedMenus:Ljava/util/ArrayList;
        //   297: invokevirtual   java/util/ArrayList.size:()I
        //   300: istore          29
        //   302: iload           29
        //   304: ifle            397
        //   307: aload_3        
        //   308: aload_1        
        //   309: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   312: aload_3        
        //   313: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   316: bipush          98
        //   318: aaload         
        //   319: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   322: iconst_0       
        //   323: istore          30
        //   325: iload           30
        //   327: iload           29
        //   329: if_icmpge       397
        //   332: aload_0        
        //   333: getfield        android/support/v4/app/FragmentManagerImpl.mCreatedMenus:Ljava/util/ArrayList;
        //   336: iload           30
        //   338: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   341: checkcast       Landroid/support/v4/app/Fragment;
        //   344: astore          31
        //   346: aload_3        
        //   347: aload_1        
        //   348: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   351: aload_3        
        //   352: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   355: bipush          106
        //   357: aaload         
        //   358: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   361: aload_3        
        //   362: iload           30
        //   364: invokevirtual   java/io/PrintWriter.print:(I)V
        //   367: aload_3        
        //   368: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   371: bipush          89
        //   373: aaload         
        //   374: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   377: aload_3        
        //   378: aload           31
        //   380: invokevirtual   android/support/v4/app/Fragment.toString:()Ljava/lang/String;
        //   383: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   386: iload           30
        //   388: iconst_1       
        //   389: iadd           
        //   390: istore          32
        //   392: iload           6
        //   394: ifeq            1115
        //   397: aload_0        
        //   398: getfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //   401: ifnull          519
        //   404: aload_0        
        //   405: getfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //   408: invokevirtual   java/util/ArrayList.size:()I
        //   411: istore          25
        //   413: iload           25
        //   415: ifle            519
        //   418: aload_3        
        //   419: aload_1        
        //   420: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   423: aload_3        
        //   424: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   427: bipush          111
        //   429: aaload         
        //   430: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   433: iconst_0       
        //   434: istore          26
        //   436: iload           26
        //   438: iload           25
        //   440: if_icmpge       519
        //   443: aload_0        
        //   444: getfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //   447: iload           26
        //   449: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   452: checkcast       Landroid/support/v4/app/BackStackRecord;
        //   455: astore          27
        //   457: aload_3        
        //   458: aload_1        
        //   459: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   462: aload_3        
        //   463: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   466: bipush          100
        //   468: aaload         
        //   469: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   472: aload_3        
        //   473: iload           26
        //   475: invokevirtual   java/io/PrintWriter.print:(I)V
        //   478: aload_3        
        //   479: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   482: bipush          95
        //   484: aaload         
        //   485: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   488: aload_3        
        //   489: aload           27
        //   491: invokevirtual   android/support/v4/app/BackStackRecord.toString:()Ljava/lang/String;
        //   494: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   497: aload           27
        //   499: aload           7
        //   501: aload_2        
        //   502: aload_3        
        //   503: aload           4
        //   505: invokevirtual   android/support/v4/app/BackStackRecord.dump:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
        //   508: iload           26
        //   510: iconst_1       
        //   511: iadd           
        //   512: istore          28
        //   514: iload           6
        //   516: ifeq            1108
        //   519: aload_0        
        //   520: monitorenter   
        //   521: aload_0        
        //   522: getfield        android/support/v4/app/FragmentManagerImpl.mBackStackIndices:Ljava/util/ArrayList;
        //   525: ifnull          629
        //   528: aload_0        
        //   529: getfield        android/support/v4/app/FragmentManagerImpl.mBackStackIndices:Ljava/util/ArrayList;
        //   532: invokevirtual   java/util/ArrayList.size:()I
        //   535: istore          21
        //   537: iload           21
        //   539: ifle            629
        //   542: aload_3        
        //   543: aload_1        
        //   544: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   547: aload_3        
        //   548: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   551: bipush          109
        //   553: aaload         
        //   554: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   557: iconst_0       
        //   558: istore          22
        //   560: iload           22
        //   562: iload           21
        //   564: if_icmpge       629
        //   567: aload_0        
        //   568: getfield        android/support/v4/app/FragmentManagerImpl.mBackStackIndices:Ljava/util/ArrayList;
        //   571: iload           22
        //   573: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   576: checkcast       Landroid/support/v4/app/BackStackRecord;
        //   579: astore          23
        //   581: aload_3        
        //   582: aload_1        
        //   583: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   586: aload_3        
        //   587: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   590: bipush          112
        //   592: aaload         
        //   593: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   596: aload_3        
        //   597: iload           22
        //   599: invokevirtual   java/io/PrintWriter.print:(I)V
        //   602: aload_3        
        //   603: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   606: bipush          105
        //   608: aaload         
        //   609: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   612: aload_3        
        //   613: aload           23
        //   615: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   618: iload           22
        //   620: iconst_1       
        //   621: iadd           
        //   622: istore          24
        //   624: iload           6
        //   626: ifeq            1101
        //   629: aload_0        
        //   630: getfield        android/support/v4/app/FragmentManagerImpl.mAvailBackStackIndices:Ljava/util/ArrayList;
        //   633: ifnull          679
        //   636: aload_0        
        //   637: getfield        android/support/v4/app/FragmentManagerImpl.mAvailBackStackIndices:Ljava/util/ArrayList;
        //   640: invokevirtual   java/util/ArrayList.size:()I
        //   643: istore          20
        //   645: iload           20
        //   647: ifle            679
        //   650: aload_3        
        //   651: aload_1        
        //   652: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   655: aload_3        
        //   656: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   659: bipush          101
        //   661: aaload         
        //   662: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   665: aload_3        
        //   666: aload_0        
        //   667: getfield        android/support/v4/app/FragmentManagerImpl.mAvailBackStackIndices:Ljava/util/ArrayList;
        //   670: invokevirtual   java/util/ArrayList.toArray:()[Ljava/lang/Object;
        //   673: invokestatic    java/util/Arrays.toString:([Ljava/lang/Object;)Ljava/lang/String;
        //   676: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   679: aload_0        
        //   680: monitorexit    
        //   681: aload_0        
        //   682: getfield        android/support/v4/app/FragmentManagerImpl.mPendingActions:Ljava/util/ArrayList;
        //   685: ifnull          786
        //   688: aload_0        
        //   689: getfield        android/support/v4/app/FragmentManagerImpl.mPendingActions:Ljava/util/ArrayList;
        //   692: invokevirtual   java/util/ArrayList.size:()I
        //   695: istore          17
        //   697: iload           17
        //   699: ifle            786
        //   702: aload_3        
        //   703: aload_1        
        //   704: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   707: aload_3        
        //   708: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   711: bipush          102
        //   713: aaload         
        //   714: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   717: iload           5
        //   719: iload           17
        //   721: if_icmpge       786
        //   724: aload_0        
        //   725: getfield        android/support/v4/app/FragmentManagerImpl.mPendingActions:Ljava/util/ArrayList;
        //   728: iload           5
        //   730: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   733: checkcast       Ljava/lang/Runnable;
        //   736: astore          18
        //   738: aload_3        
        //   739: aload_1        
        //   740: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   743: aload_3        
        //   744: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   747: bipush          110
        //   749: aaload         
        //   750: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   753: aload_3        
        //   754: iload           5
        //   756: invokevirtual   java/io/PrintWriter.print:(I)V
        //   759: aload_3        
        //   760: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   763: bipush          103
        //   765: aaload         
        //   766: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   769: aload_3        
        //   770: aload           18
        //   772: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   775: iload           5
        //   777: iconst_1       
        //   778: iadd           
        //   779: istore          19
        //   781: iload           6
        //   783: ifeq            1094
        //   786: aload_3        
        //   787: aload_1        
        //   788: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   791: aload_3        
        //   792: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   795: bipush          93
        //   797: aaload         
        //   798: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   801: aload_3        
        //   802: aload_1        
        //   803: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   806: aload_3        
        //   807: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   810: bipush          107
        //   812: aaload         
        //   813: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   816: aload_3        
        //   817: aload_0        
        //   818: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   821: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   824: aload_3        
        //   825: aload_1        
        //   826: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   829: aload_3        
        //   830: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   833: bipush          86
        //   835: aaload         
        //   836: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   839: aload_3        
        //   840: aload_0        
        //   841: getfield        android/support/v4/app/FragmentManagerImpl.mContainer:Landroid/support/v4/app/FragmentContainer;
        //   844: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   847: aload_0        
        //   848: getfield        android/support/v4/app/FragmentManagerImpl.mParent:Landroid/support/v4/app/Fragment;
        //   851: ifnull          877
        //   854: aload_3        
        //   855: aload_1        
        //   856: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   859: aload_3        
        //   860: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   863: bipush          113
        //   865: aaload         
        //   866: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   869: aload_3        
        //   870: aload_0        
        //   871: getfield        android/support/v4/app/FragmentManagerImpl.mParent:Landroid/support/v4/app/Fragment;
        //   874: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   877: aload_3        
        //   878: aload_1        
        //   879: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   882: aload_3        
        //   883: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   886: bipush          87
        //   888: aaload         
        //   889: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   892: aload_3        
        //   893: aload_0        
        //   894: getfield        android/support/v4/app/FragmentManagerImpl.mCurState:I
        //   897: invokevirtual   java/io/PrintWriter.print:(I)V
        //   900: aload_3        
        //   901: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   904: bipush          97
        //   906: aaload         
        //   907: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   910: aload_3        
        //   911: aload_0        
        //   912: getfield        android/support/v4/app/FragmentManagerImpl.mStateSaved:Z
        //   915: invokevirtual   java/io/PrintWriter.print:(Z)V
        //   918: aload_3        
        //   919: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   922: bipush          114
        //   924: aaload         
        //   925: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   928: aload_3        
        //   929: aload_0        
        //   930: getfield        android/support/v4/app/FragmentManagerImpl.mDestroyed:Z
        //   933: invokevirtual   java/io/PrintWriter.println:(Z)V
        //   936: aload_0        
        //   937: getfield        android/support/v4/app/FragmentManagerImpl.mNeedMenuInvalidate:Z
        //   940: ifeq            966
        //   943: aload_3        
        //   944: aload_1        
        //   945: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   948: aload_3        
        //   949: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   952: bipush          108
        //   954: aaload         
        //   955: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   958: aload_3        
        //   959: aload_0        
        //   960: getfield        android/support/v4/app/FragmentManagerImpl.mNeedMenuInvalidate:Z
        //   963: invokevirtual   java/io/PrintWriter.println:(Z)V
        //   966: aload_0        
        //   967: getfield        android/support/v4/app/FragmentManagerImpl.mNoTransactionsBecause:Ljava/lang/String;
        //   970: ifnull          996
        //   973: aload_3        
        //   974: aload_1        
        //   975: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   978: aload_3        
        //   979: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   982: bipush          99
        //   984: aaload         
        //   985: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   988: aload_3        
        //   989: aload_0        
        //   990: getfield        android/support/v4/app/FragmentManagerImpl.mNoTransactionsBecause:Ljava/lang/String;
        //   993: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   996: aload_0        
        //   997: getfield        android/support/v4/app/FragmentManagerImpl.mAvailIndices:Ljava/util/ArrayList;
        //  1000: astore          16
        //  1002: aload           16
        //  1004: ifnull          1046
        //  1007: aload_0        
        //  1008: getfield        android/support/v4/app/FragmentManagerImpl.mAvailIndices:Ljava/util/ArrayList;
        //  1011: invokevirtual   java/util/ArrayList.size:()I
        //  1014: ifle            1046
        //  1017: aload_3        
        //  1018: aload_1        
        //  1019: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //  1022: aload_3        
        //  1023: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1026: bipush          92
        //  1028: aaload         
        //  1029: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //  1032: aload_3        
        //  1033: aload_0        
        //  1034: getfield        android/support/v4/app/FragmentManagerImpl.mAvailIndices:Ljava/util/ArrayList;
        //  1037: invokevirtual   java/util/ArrayList.toArray:()[Ljava/lang/Object;
        //  1040: invokestatic    java/util/Arrays.toString:([Ljava/lang/Object;)Ljava/lang/String;
        //  1043: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //  1046: return         
        //  1047: astore          40
        //  1049: aload           40
        //  1051: athrow         
        //  1052: astore          9
        //  1054: aload           9
        //  1056: athrow         
        //  1057: astore          10
        //  1059: aload           10
        //  1061: athrow         
        //  1062: astore          8
        //  1064: aload_0        
        //  1065: monitorexit    
        //  1066: aload           8
        //  1068: athrow         
        //  1069: astore          11
        //  1071: aload           11
        //  1073: athrow         
        //  1074: astore          12
        //  1076: aload           12
        //  1078: athrow         
        //  1079: astore          13
        //  1081: aload           13
        //  1083: athrow         
        //  1084: astore          14
        //  1086: aload           14
        //  1088: athrow         
        //  1089: astore          15
        //  1091: aload           15
        //  1093: athrow         
        //  1094: iload           19
        //  1096: istore          5
        //  1098: goto            717
        //  1101: iload           24
        //  1103: istore          22
        //  1105: goto            560
        //  1108: iload           28
        //  1110: istore          26
        //  1112: goto            436
        //  1115: iload           32
        //  1117: istore          30
        //  1119: goto            325
        //  1122: iload           36
        //  1124: istore          34
        //  1126: goto            214
        //  1129: iload           41
        //  1131: istore          38
        //  1133: goto            90
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  111    148    1047   1052   Ljava/lang/IllegalArgumentException;
        //  153    164    1047   1052   Ljava/lang/IllegalArgumentException;
        //  521    537    1062   1069   Any
        //  542    557    1062   1069   Any
        //  567    618    1062   1069   Any
        //  629    645    1052   1057   Ljava/lang/IllegalArgumentException;
        //  629    645    1062   1069   Any
        //  650    679    1057   1062   Ljava/lang/IllegalArgumentException;
        //  650    679    1062   1069   Any
        //  679    681    1062   1069   Any
        //  786    877    1069   1074   Ljava/lang/IllegalArgumentException;
        //  877    966    1074   1079   Ljava/lang/IllegalArgumentException;
        //  966    996    1079   1084   Ljava/lang/IllegalArgumentException;
        //  996    1002   1084   1089   Ljava/lang/IllegalArgumentException;
        //  1007   1046   1089   1094   Ljava/lang/IllegalArgumentException;
        //  1054   1057   1057   1062   Ljava/lang/IllegalArgumentException;
        //  1054   1057   1062   1069   Any
        //  1059   1062   1062   1069   Any
        //  1064   1066   1062   1069   Any
        //  1086   1089   1089   1094   Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 561, Size: 561
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void enqueueAction(final Runnable p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_2        
        //     1: ifne            8
        //     4: aload_0        
        //     5: invokespecial   android/support/v4/app/FragmentManagerImpl.checkStateLoss:()V
        //     8: aload_0        
        //     9: monitorenter   
        //    10: aload_0        
        //    11: getfield        android/support/v4/app/FragmentManagerImpl.mDestroyed:Z
        //    14: istore          4
        //    16: iload           4
        //    18: ifne            28
        //    21: aload_0        
        //    22: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //    25: ifnonnull       58
        //    28: new             Ljava/lang/IllegalStateException;
        //    31: dup            
        //    32: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    35: sipush          162
        //    38: aaload         
        //    39: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    42: athrow         
        //    43: astore          5
        //    45: aload           5
        //    47: athrow         
        //    48: astore_3       
        //    49: aload_0        
        //    50: monitorexit    
        //    51: aload_3        
        //    52: athrow         
        //    53: astore          10
        //    55: aload           10
        //    57: athrow         
        //    58: aload_0        
        //    59: getfield        android/support/v4/app/FragmentManagerImpl.mPendingActions:Ljava/util/ArrayList;
        //    62: ifnonnull       76
        //    65: aload_0        
        //    66: new             Ljava/util/ArrayList;
        //    69: dup            
        //    70: invokespecial   java/util/ArrayList.<init>:()V
        //    73: putfield        android/support/v4/app/FragmentManagerImpl.mPendingActions:Ljava/util/ArrayList;
        //    76: aload_0        
        //    77: getfield        android/support/v4/app/FragmentManagerImpl.mPendingActions:Ljava/util/ArrayList;
        //    80: aload_1        
        //    81: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    84: pop            
        //    85: aload_0        
        //    86: getfield        android/support/v4/app/FragmentManagerImpl.mPendingActions:Ljava/util/ArrayList;
        //    89: invokevirtual   java/util/ArrayList.size:()I
        //    92: iconst_1       
        //    93: if_icmpne       125
        //    96: aload_0        
        //    97: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   100: getfield        android/support/v4/app/FragmentActivity.mHandler:Landroid/os/Handler;
        //   103: aload_0        
        //   104: getfield        android/support/v4/app/FragmentManagerImpl.mExecCommit:Ljava/lang/Runnable;
        //   107: invokevirtual   android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
        //   110: aload_0        
        //   111: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   114: getfield        android/support/v4/app/FragmentActivity.mHandler:Landroid/os/Handler;
        //   117: aload_0        
        //   118: getfield        android/support/v4/app/FragmentManagerImpl.mExecCommit:Ljava/lang/Runnable;
        //   121: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //   124: pop            
        //   125: aload_0        
        //   126: monitorexit    
        //   127: return         
        //   128: astore          6
        //   130: aload           6
        //   132: athrow         
        //   133: astore          7
        //   135: aload           7
        //   137: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      8      53     58     Ljava/lang/IllegalArgumentException;
        //  10     16     48     53     Any
        //  21     28     43     48     Ljava/lang/IllegalArgumentException;
        //  21     28     48     53     Any
        //  28     43     43     48     Ljava/lang/IllegalArgumentException;
        //  28     43     48     53     Any
        //  45     48     48     53     Any
        //  49     51     48     53     Any
        //  58     76     128    133    Ljava/lang/IllegalArgumentException;
        //  58     76     48     53     Any
        //  76     125    133    138    Ljava/lang/IllegalArgumentException;
        //  76     125    48     53     Any
        //  125    127    48     53     Any
        //  130    133    48     53     Any
        //  135    138    48     53     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0076:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public boolean execPendingActions() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        android/support/v4/app/FragmentManagerImpl.mExecutingActions:Z
        //     8: ifeq            29
        //    11: new             Ljava/lang/IllegalStateException;
        //    14: dup            
        //    15: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    18: sipush          147
        //    21: aaload         
        //    22: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    25: athrow         
        //    26: astore_2       
        //    27: aload_2        
        //    28: athrow         
        //    29: invokestatic    android/os/Looper.myLooper:()Landroid/os/Looper;
        //    32: aload_0        
        //    33: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //    36: getfield        android/support/v4/app/FragmentActivity.mHandler:Landroid/os/Handler;
        //    39: invokevirtual   android/os/Handler.getLooper:()Landroid/os/Looper;
        //    42: if_acmpeq       63
        //    45: new             Ljava/lang/IllegalStateException;
        //    48: dup            
        //    49: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    52: sipush          146
        //    55: aaload         
        //    56: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    59: athrow         
        //    60: astore_3       
        //    61: aload_3        
        //    62: athrow         
        //    63: iconst_0       
        //    64: istore          4
        //    66: aload_0        
        //    67: monitorenter   
        //    68: aload_0        
        //    69: getfield        android/support/v4/app/FragmentManagerImpl.mPendingActions:Ljava/util/ArrayList;
        //    72: ifnull          85
        //    75: aload_0        
        //    76: getfield        android/support/v4/app/FragmentManagerImpl.mPendingActions:Ljava/util/ArrayList;
        //    79: invokevirtual   java/util/ArrayList.size:()I
        //    82: ifne            91
        //    85: aload_0        
        //    86: monitorexit    
        //    87: iload_1        
        //    88: ifeq            235
        //    91: aload_0        
        //    92: getfield        android/support/v4/app/FragmentManagerImpl.mPendingActions:Ljava/util/ArrayList;
        //    95: invokevirtual   java/util/ArrayList.size:()I
        //    98: istore          13
        //   100: aload_0        
        //   101: getfield        android/support/v4/app/FragmentManagerImpl.mTmpActions:[Ljava/lang/Runnable;
        //   104: ifnull          121
        //   107: aload_0        
        //   108: getfield        android/support/v4/app/FragmentManagerImpl.mTmpActions:[Ljava/lang/Runnable;
        //   111: arraylength    
        //   112: istore          18
        //   114: iload           18
        //   116: iload           13
        //   118: if_icmpge       130
        //   121: aload_0        
        //   122: iload           13
        //   124: anewarray       Ljava/lang/Runnable;
        //   127: putfield        android/support/v4/app/FragmentManagerImpl.mTmpActions:[Ljava/lang/Runnable;
        //   130: aload_0        
        //   131: getfield        android/support/v4/app/FragmentManagerImpl.mPendingActions:Ljava/util/ArrayList;
        //   134: aload_0        
        //   135: getfield        android/support/v4/app/FragmentManagerImpl.mTmpActions:[Ljava/lang/Runnable;
        //   138: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   141: pop            
        //   142: aload_0        
        //   143: getfield        android/support/v4/app/FragmentManagerImpl.mPendingActions:Ljava/util/ArrayList;
        //   146: invokevirtual   java/util/ArrayList.clear:()V
        //   149: aload_0        
        //   150: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   153: getfield        android/support/v4/app/FragmentActivity.mHandler:Landroid/os/Handler;
        //   156: aload_0        
        //   157: getfield        android/support/v4/app/FragmentManagerImpl.mExecCommit:Ljava/lang/Runnable;
        //   160: invokevirtual   android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
        //   163: aload_0        
        //   164: monitorexit    
        //   165: aload_0        
        //   166: iconst_1       
        //   167: putfield        android/support/v4/app/FragmentManagerImpl.mExecutingActions:Z
        //   170: iconst_0       
        //   171: istore          17
        //   173: iload           17
        //   175: iload           13
        //   177: if_icmpge       207
        //   180: aload_0        
        //   181: getfield        android/support/v4/app/FragmentManagerImpl.mTmpActions:[Ljava/lang/Runnable;
        //   184: iload           17
        //   186: aaload         
        //   187: invokeinterface java/lang/Runnable.run:()V
        //   192: aload_0        
        //   193: getfield        android/support/v4/app/FragmentManagerImpl.mTmpActions:[Ljava/lang/Runnable;
        //   196: iload           17
        //   198: aconst_null    
        //   199: aastore        
        //   200: iinc            17, 1
        //   203: iload_1        
        //   204: ifeq            173
        //   207: aload_0        
        //   208: iconst_0       
        //   209: putfield        android/support/v4/app/FragmentManagerImpl.mExecutingActions:Z
        //   212: iconst_1       
        //   213: istore          4
        //   215: goto            66
        //   218: astore          14
        //   220: aload           14
        //   222: athrow         
        //   223: astore          15
        //   225: aload           15
        //   227: athrow         
        //   228: astore          5
        //   230: aload_0        
        //   231: monitorexit    
        //   232: aload           5
        //   234: athrow         
        //   235: aload_0        
        //   236: getfield        android/support/v4/app/FragmentManagerImpl.mHavePendingDeferredStart:Z
        //   239: ifeq            328
        //   242: iconst_0       
        //   243: istore          6
        //   245: iconst_0       
        //   246: istore          7
        //   248: iload           6
        //   250: aload_0        
        //   251: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //   254: invokevirtual   java/util/ArrayList.size:()I
        //   257: if_icmpge       314
        //   260: aload_0        
        //   261: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //   264: iload           6
        //   266: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   269: checkcast       Landroid/support/v4/app/Fragment;
        //   272: astore          9
        //   274: aload           9
        //   276: ifnull          304
        //   279: aload           9
        //   281: getfield        android/support/v4/app/Fragment.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //   284: astore          12
        //   286: aload           12
        //   288: ifnull          304
        //   291: iload           7
        //   293: aload           9
        //   295: getfield        android/support/v4/app/Fragment.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //   298: invokevirtual   android/support/v4/app/LoaderManagerImpl.hasRunningLoaders:()Z
        //   301: ior            
        //   302: istore          7
        //   304: iload           6
        //   306: iconst_1       
        //   307: iadd           
        //   308: istore          10
        //   310: iload_1        
        //   311: ifeq            341
        //   314: iload           7
        //   316: ifne            328
        //   319: aload_0        
        //   320: iconst_0       
        //   321: putfield        android/support/v4/app/FragmentManagerImpl.mHavePendingDeferredStart:Z
        //   324: aload_0        
        //   325: invokevirtual   android/support/v4/app/FragmentManagerImpl.startPendingDeferredFragments:()V
        //   328: iload           4
        //   330: ireturn        
        //   331: astore          11
        //   333: aload           11
        //   335: athrow         
        //   336: astore          8
        //   338: aload           8
        //   340: athrow         
        //   341: iload           10
        //   343: istore          6
        //   345: goto            248
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      26     26     29     Ljava/lang/IllegalArgumentException;
        //  29     60     60     63     Ljava/lang/IllegalArgumentException;
        //  68     85     228    235    Any
        //  85     87     228    235    Any
        //  91     100    228    235    Any
        //  100    114    218    223    Ljava/lang/IllegalArgumentException;
        //  100    114    228    235    Any
        //  121    130    223    228    Ljava/lang/IllegalArgumentException;
        //  121    130    228    235    Any
        //  130    165    228    235    Any
        //  220    223    223    228    Ljava/lang/IllegalArgumentException;
        //  220    223    228    235    Any
        //  225    228    228    235    Any
        //  230    232    228    235    Any
        //  279    286    331    336    Ljava/lang/IllegalArgumentException;
        //  319    328    336    341    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0121:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public boolean executePendingTransactions() {
        return this.execPendingActions();
    }
    
    public Fragment findFragmentById(final int n) {
        final int a = Fragment.a;
        Label_0077: {
            if (this.mAdded == null) {
                break Label_0077;
            }
            int n2 = -1 + this.mAdded.size();
            while (true) {
                if (n2 < 0) {
                    break Label_0077;
                }
                final Fragment fragment = this.mAdded.get(n2);
                Label_0067: {
                    if (fragment == null) {
                        break Label_0067;
                    }
                    try {
                        if (fragment.mFragmentId == n) {
                            return fragment;
                        }
                    }
                    catch (IllegalArgumentException ex) {
                        throw ex;
                    }
                }
                final int n3 = n2 - 1;
                if (a == 0) {
                    n2 = n3;
                    continue;
                }
                break;
            }
        }
        while (true) {
            int n5 = 0;
            Label_0138: {
                if (this.mActive == null) {
                    break Label_0138;
                }
                final int n4 = -1 + this.mActive.size();
                if (n4 < 0) {
                    break Label_0138;
                }
                final Fragment fragment = (Fragment)this.mActive.get(n4);
                Label_0129: {
                    if (fragment == null) {
                        break Label_0129;
                    }
                    try {
                        if (fragment.mFragmentId == n) {
                            return fragment;
                        }
                        n5 = n4 - 1;
                        if (a != 0) {
                            return null;
                        }
                    }
                    catch (IllegalArgumentException ex2) {
                        throw ex2;
                    }
                }
            }
            final int n4 = n5;
            continue;
        }
    }
    
    @Override
    public Fragment findFragmentByTag(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //     8: astore          4
        //    10: aload           4
        //    12: ifnull          91
        //    15: aload_1        
        //    16: ifnull          91
        //    19: iconst_m1      
        //    20: aload_0        
        //    21: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //    24: invokevirtual   java/util/ArrayList.size:()I
        //    27: iadd           
        //    28: istore          12
        //    30: iload           12
        //    32: iflt            91
        //    35: aload_0        
        //    36: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //    39: iload           12
        //    41: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    44: checkcast       Landroid/support/v4/app/Fragment;
        //    47: astore          8
        //    49: aload           8
        //    51: ifnull          81
        //    54: aload_1        
        //    55: aload           8
        //    57: getfield        android/support/v4/app/Fragment.mTag:Ljava/lang/String;
        //    60: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    63: istore          15
        //    65: iload           15
        //    67: ifeq            81
        //    70: aload           8
        //    72: areturn        
        //    73: astore_3       
        //    74: aload_3        
        //    75: athrow         
        //    76: astore          14
        //    78: aload           14
        //    80: athrow         
        //    81: iload           12
        //    83: iconst_1       
        //    84: isub           
        //    85: istore          13
        //    87: iload_2        
        //    88: ifeq            186
        //    91: aload_0        
        //    92: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //    95: astore          6
        //    97: aload           6
        //    99: ifnull          167
        //   102: aload_1        
        //   103: ifnull          167
        //   106: iconst_m1      
        //   107: aload_0        
        //   108: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //   111: invokevirtual   java/util/ArrayList.size:()I
        //   114: iadd           
        //   115: istore          7
        //   117: iload           7
        //   119: iflt            167
        //   122: aload_0        
        //   123: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //   126: iload           7
        //   128: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   131: checkcast       Landroid/support/v4/app/Fragment;
        //   134: astore          8
        //   136: aload           8
        //   138: ifnull          157
        //   141: aload_1        
        //   142: aload           8
        //   144: getfield        android/support/v4/app/Fragment.mTag:Ljava/lang/String;
        //   147: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   150: istore          11
        //   152: iload           11
        //   154: ifne            70
        //   157: iload           7
        //   159: iconst_1       
        //   160: isub           
        //   161: istore          9
        //   163: iload_2        
        //   164: ifeq            179
        //   167: aconst_null    
        //   168: areturn        
        //   169: astore          5
        //   171: aload           5
        //   173: athrow         
        //   174: astore          10
        //   176: aload           10
        //   178: athrow         
        //   179: iload           9
        //   181: istore          7
        //   183: goto            117
        //   186: iload           13
        //   188: istore          12
        //   190: goto            30
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      10     73     76     Ljava/lang/IllegalArgumentException;
        //  54     65     76     81     Ljava/lang/IllegalArgumentException;
        //  91     97     169    174    Ljava/lang/IllegalArgumentException;
        //  141    152    174    179    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0070:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void freeBackStackIndex(final int n) {
        synchronized (this) {
            this.mBackStackIndices.set(n, null);
            if (this.mAvailBackStackIndices == null) {
                this.mAvailBackStackIndices = new ArrayList();
            }
            try {
                if (FragmentManagerImpl.DEBUG) {
                    Log.v(FragmentManagerImpl.z[13], FragmentManagerImpl.z[12] + n);
                }
                this.mAvailBackStackIndices.add(n);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    @Override
    public Fragment getFragment(final Bundle bundle, final String s) {
        final int int1 = bundle.getInt(s, -1);
        Fragment fragment;
        if (int1 == -1) {
            fragment = null;
        }
        else {
            try {
                if (int1 >= this.mActive.size()) {
                    this.throwException(new IllegalStateException(FragmentManagerImpl.z[176] + s + FragmentManagerImpl.z[175] + int1));
                }
                fragment = this.mActive.get(int1);
                if (fragment == null) {
                    try {
                        this.throwException(new IllegalStateException(FragmentManagerImpl.z[173] + s + FragmentManagerImpl.z[174] + int1));
                        return fragment;
                    }
                    catch (IllegalArgumentException ex) {
                        throw ex;
                    }
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        return fragment;
    }
    
    @Override
    public List getFragments() {
        return this.mActive;
    }
    
    LayoutInflaterFactory getLayoutInflaterFactory() {
        return this;
    }
    
    public void hideFragment(final Fragment p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //     3: ifeq            37
        //     6: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //     9: iconst_1       
        //    10: aaload         
        //    11: new             Ljava/lang/StringBuilder;
        //    14: dup            
        //    15: invokespecial   java/lang/StringBuilder.<init>:()V
        //    18: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    21: iconst_0       
        //    22: aaload         
        //    23: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    26: aload_1        
        //    27: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    30: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    33: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    36: pop            
        //    37: aload_1        
        //    38: getfield        android/support/v4/app/Fragment.mHidden:Z
        //    41: ifne            132
        //    44: aload_1        
        //    45: iconst_1       
        //    46: putfield        android/support/v4/app/Fragment.mHidden:Z
        //    49: aload_1        
        //    50: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //    53: astore          6
        //    55: aload           6
        //    57: ifnull          93
        //    60: aload_0        
        //    61: aload_1        
        //    62: iload_2        
        //    63: iconst_0       
        //    64: iload_3        
        //    65: invokevirtual   android/support/v4/app/FragmentManagerImpl.loadAnimation:(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;
        //    68: astore          12
        //    70: aload           12
        //    72: ifnull          84
        //    75: aload_1        
        //    76: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //    79: aload           12
        //    81: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //    84: aload_1        
        //    85: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //    88: bipush          8
        //    90: invokevirtual   android/view/View.setVisibility:(I)V
        //    93: aload_1        
        //    94: getfield        android/support/v4/app/Fragment.mAdded:Z
        //    97: istore          10
        //    99: iload           10
        //   101: ifeq            127
        //   104: aload_1        
        //   105: getfield        android/support/v4/app/Fragment.mHasMenu:Z
        //   108: istore          11
        //   110: iload           11
        //   112: ifeq            127
        //   115: aload_1        
        //   116: getfield        android/support/v4/app/Fragment.mMenuVisible:Z
        //   119: ifeq            127
        //   122: aload_0        
        //   123: iconst_1       
        //   124: putfield        android/support/v4/app/FragmentManagerImpl.mNeedMenuInvalidate:Z
        //   127: aload_1        
        //   128: iconst_1       
        //   129: invokevirtual   android/support/v4/app/Fragment.onHiddenChanged:(Z)V
        //   132: return         
        //   133: astore          4
        //   135: aload           4
        //   137: athrow         
        //   138: astore          5
        //   140: aload           5
        //   142: athrow         
        //   143: astore          13
        //   145: aload           13
        //   147: athrow         
        //   148: astore          7
        //   150: aload           7
        //   152: athrow         
        //   153: astore          8
        //   155: aload           8
        //   157: athrow         
        //   158: astore          9
        //   160: aload           9
        //   162: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      37     133    138    Ljava/lang/IllegalArgumentException;
        //  37     55     138    143    Ljava/lang/IllegalArgumentException;
        //  75     84     143    148    Ljava/lang/IllegalArgumentException;
        //  93     99     148    153    Ljava/lang/IllegalArgumentException;
        //  104    110    153    158    Ljava/lang/IllegalArgumentException;
        //  115    127    158    163    Ljava/lang/IllegalArgumentException;
        //  150    153    153    158    Ljava/lang/IllegalArgumentException;
        //  155    158    158    163    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 83, Size: 83
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    Animation loadAnimation(final Fragment fragment, final int n, final boolean b, int windowAnimations) {
        Animation animation = fragment.onCreateAnimation(n, b, fragment.mNextAnim);
        if (animation == null) {
            if (fragment.mNextAnim != 0) {
                animation = AnimationUtils.loadAnimation((Context)this.mActivity, fragment.mNextAnim);
                if (animation != null) {
                    return animation;
                }
            }
            if (n == 0) {
                return null;
            }
            final int transitToStyleIndex = transitToStyleIndex(n, b);
            if (transitToStyleIndex < 0) {
                return null;
            }
        Label_0182_Outer:
            while (true) {
            Label_0168_Outer:
                while (true) {
                Label_0220_Outer:
                    while (true) {
                    Label_0196_Outer:
                        while (true) {
                            while (true) {
                                switch (transitToStyleIndex) {
                                    default: {
                                        if (windowAnimations == 0) {
                                            break Label_0182_Outer;
                                        }
                                        break Label_0182_Outer;
                                    }
                                    case 1: {
                                        Label_0145: {
                                            break Label_0145;
                                            try {
                                                if (this.mActivity.getWindow() != null) {
                                                    windowAnimations = this.mActivity.getWindow().getAttributes().windowAnimations;
                                                }
                                                if (windowAnimations == 0) {
                                                    return null;
                                                }
                                                return null;
                                                return makeFadeAnimation((Context)this.mActivity, 0.0f, 1.0f);
                                                return makeOpenCloseAnimation((Context)this.mActivity, 0.975f, 1.0f, 0.0f, 1.0f);
                                                return makeOpenCloseAnimation((Context)this.mActivity, 1.0f, 0.975f, 1.0f, 0.0f);
                                                try {
                                                    return makeOpenCloseAnimation((Context)this.mActivity, 1.125f, 1.0f, 0.0f, 1.0f);
                                                }
                                                catch (IllegalArgumentException ex) {
                                                    throw ex;
                                                }
                                                return makeOpenCloseAnimation((Context)this.mActivity, 1.0f, 0.975f, 1.0f, 0.0f);
                                                return makeFadeAnimation((Context)this.mActivity, 1.0f, 0.0f);
                                                return makeOpenCloseAnimation((Context)this.mActivity, 1.0f, 1.075f, 1.0f, 0.0f);
                                            }
                                            catch (IllegalArgumentException ex2) {
                                                throw ex2;
                                            }
                                        }
                                        return null;
                                    }
                                    case 2: {
                                        continue Label_0220_Outer;
                                    }
                                    case 3: {
                                        continue Label_0168_Outer;
                                    }
                                    case 4: {
                                        continue;
                                    }
                                    case 5: {
                                        continue Label_0182_Outer;
                                    }
                                    case 6: {
                                        continue Label_0196_Outer;
                                    }
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
                break;
            }
        }
        return animation;
    }
    
    void makeActive(final Fragment p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/app/Fragment.mIndex:I
        //     4: istore_3       
        //     5: iload_3        
        //     6: iflt            13
        //     9: return         
        //    10: astore_2       
        //    11: aload_2        
        //    12: athrow         
        //    13: aload_0        
        //    14: getfield        android/support/v4/app/FragmentManagerImpl.mAvailIndices:Ljava/util/ArrayList;
        //    17: astore          7
        //    19: aload           7
        //    21: ifnull          38
        //    24: aload_0        
        //    25: getfield        android/support/v4/app/FragmentManagerImpl.mAvailIndices:Ljava/util/ArrayList;
        //    28: invokevirtual   java/util/ArrayList.size:()I
        //    31: istore          13
        //    33: iload           13
        //    35: ifgt            86
        //    38: aload_0        
        //    39: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //    42: ifnonnull       56
        //    45: aload_0        
        //    46: new             Ljava/util/ArrayList;
        //    49: dup            
        //    50: invokespecial   java/util/ArrayList.<init>:()V
        //    53: putfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //    56: aload_1        
        //    57: aload_0        
        //    58: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //    61: invokevirtual   java/util/ArrayList.size:()I
        //    64: aload_0        
        //    65: getfield        android/support/v4/app/FragmentManagerImpl.mParent:Landroid/support/v4/app/Fragment;
        //    68: invokevirtual   android/support/v4/app/Fragment.setIndex:(ILandroid/support/v4/app/Fragment;)V
        //    71: aload_0        
        //    72: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //    75: aload_1        
        //    76: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    79: pop            
        //    80: getstatic       android/support/v4/app/Fragment.a:I
        //    83: ifeq            129
        //    86: aload_1        
        //    87: aload_0        
        //    88: getfield        android/support/v4/app/FragmentManagerImpl.mAvailIndices:Ljava/util/ArrayList;
        //    91: iconst_m1      
        //    92: aload_0        
        //    93: getfield        android/support/v4/app/FragmentManagerImpl.mAvailIndices:Ljava/util/ArrayList;
        //    96: invokevirtual   java/util/ArrayList.size:()I
        //    99: iadd           
        //   100: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //   103: checkcast       Ljava/lang/Integer;
        //   106: invokevirtual   java/lang/Integer.intValue:()I
        //   109: aload_0        
        //   110: getfield        android/support/v4/app/FragmentManagerImpl.mParent:Landroid/support/v4/app/Fragment;
        //   113: invokevirtual   android/support/v4/app/Fragment.setIndex:(ILandroid/support/v4/app/Fragment;)V
        //   116: aload_0        
        //   117: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //   120: aload_1        
        //   121: getfield        android/support/v4/app/Fragment.mIndex:I
        //   124: aload_1        
        //   125: invokevirtual   java/util/ArrayList.set:(ILjava/lang/Object;)Ljava/lang/Object;
        //   128: pop            
        //   129: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   132: ifeq            9
        //   135: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   138: sipush          172
        //   141: aaload         
        //   142: new             Ljava/lang/StringBuilder;
        //   145: dup            
        //   146: invokespecial   java/lang/StringBuilder.<init>:()V
        //   149: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   152: sipush          171
        //   155: aaload         
        //   156: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   159: aload_1        
        //   160: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   163: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   166: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   169: pop            
        //   170: return         
        //   171: astore          11
        //   173: aload           11
        //   175: athrow         
        //   176: astore          4
        //   178: aload           4
        //   180: athrow         
        //   181: astore          5
        //   183: aload           5
        //   185: athrow         
        //   186: astore          6
        //   188: aload           6
        //   190: athrow         
        //   191: astore          8
        //   193: aload           8
        //   195: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      10     13     Ljava/lang/IllegalArgumentException;
        //  13     19     176    181    Ljava/lang/IllegalArgumentException;
        //  24     33     181    186    Ljava/lang/IllegalArgumentException;
        //  38     56     186    191    Ljava/lang/IllegalArgumentException;
        //  56     86     191    196    Ljava/lang/IllegalArgumentException;
        //  86     129    191    196    Ljava/lang/IllegalArgumentException;
        //  129    170    171    176    Ljava/lang/IllegalArgumentException;
        //  178    181    181    186    Ljava/lang/IllegalArgumentException;
        //  183    186    186    191    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 96, Size: 96
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    void makeInactive(final Fragment p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/app/Fragment.mIndex:I
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifge            13
        //     9: return         
        //    10: astore_2       
        //    11: aload_2        
        //    12: athrow         
        //    13: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //    16: ifeq            54
        //    19: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    22: sipush          144
        //    25: aaload         
        //    26: new             Ljava/lang/StringBuilder;
        //    29: dup            
        //    30: invokespecial   java/lang/StringBuilder.<init>:()V
        //    33: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    36: sipush          145
        //    39: aaload         
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: aload_1        
        //    44: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    47: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    50: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    53: pop            
        //    54: aload_0        
        //    55: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //    58: aload_1        
        //    59: getfield        android/support/v4/app/Fragment.mIndex:I
        //    62: aconst_null    
        //    63: invokevirtual   java/util/ArrayList.set:(ILjava/lang/Object;)Ljava/lang/Object;
        //    66: pop            
        //    67: aload_0        
        //    68: getfield        android/support/v4/app/FragmentManagerImpl.mAvailIndices:Ljava/util/ArrayList;
        //    71: ifnonnull       85
        //    74: aload_0        
        //    75: new             Ljava/util/ArrayList;
        //    78: dup            
        //    79: invokespecial   java/util/ArrayList.<init>:()V
        //    82: putfield        android/support/v4/app/FragmentManagerImpl.mAvailIndices:Ljava/util/ArrayList;
        //    85: aload_0        
        //    86: getfield        android/support/v4/app/FragmentManagerImpl.mAvailIndices:Ljava/util/ArrayList;
        //    89: aload_1        
        //    90: getfield        android/support/v4/app/Fragment.mIndex:I
        //    93: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    96: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    99: pop            
        //   100: aload_0        
        //   101: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   104: aload_1        
        //   105: getfield        android/support/v4/app/Fragment.mWho:Ljava/lang/String;
        //   108: invokevirtual   android/support/v4/app/FragmentActivity.invalidateSupportFragment:(Ljava/lang/String;)V
        //   111: aload_1        
        //   112: invokevirtual   android/support/v4/app/Fragment.initState:()V
        //   115: return         
        //   116: astore          4
        //   118: aload           4
        //   120: athrow         
        //   121: astore          5
        //   123: aload           5
        //   125: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      10     13     Ljava/lang/IllegalArgumentException;
        //  13     54     116    121    Ljava/lang/IllegalArgumentException;
        //  54     85     121    126    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0054:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    void moveToState(final int p0, final int p1, final int p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: aload_0        
        //     6: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //     9: astore          8
        //    11: aload           8
        //    13: ifnonnull       44
        //    16: iload_1        
        //    17: ifeq            44
        //    20: new             Ljava/lang/IllegalStateException;
        //    23: dup            
        //    24: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    27: bipush          21
        //    29: aaload         
        //    30: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    33: athrow         
        //    34: astore          7
        //    36: aload           7
        //    38: athrow         
        //    39: astore          6
        //    41: aload           6
        //    43: athrow         
        //    44: iload           4
        //    46: ifne            67
        //    49: aload_0        
        //    50: getfield        android/support/v4/app/FragmentManagerImpl.mCurState:I
        //    53: istore          23
        //    55: iload           23
        //    57: iload_1        
        //    58: if_icmpne       67
        //    61: return         
        //    62: astore          22
        //    64: aload           22
        //    66: athrow         
        //    67: aload_0        
        //    68: iload_1        
        //    69: putfield        android/support/v4/app/FragmentManagerImpl.mCurState:I
        //    72: aload_0        
        //    73: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //    76: ifnull          61
        //    79: iconst_0       
        //    80: istore          9
        //    82: iconst_0       
        //    83: istore          10
        //    85: iload           9
        //    87: aload_0        
        //    88: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //    91: invokevirtual   java/util/ArrayList.size:()I
        //    94: if_icmpge       257
        //    97: aload_0        
        //    98: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //   101: iload           9
        //   103: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   106: checkcast       Landroid/support/v4/app/Fragment;
        //   109: astore          18
        //   111: aload           18
        //   113: ifnull          250
        //   116: aload_0        
        //   117: aload           18
        //   119: iload_1        
        //   120: iload_2        
        //   121: iload_3        
        //   122: iconst_0       
        //   123: invokevirtual   android/support/v4/app/FragmentManagerImpl.moveToState:(Landroid/support/v4/app/Fragment;IIIZ)V
        //   126: aload           18
        //   128: getfield        android/support/v4/app/Fragment.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //   131: astore          21
        //   133: aload           21
        //   135: ifnull          250
        //   138: iload           10
        //   140: aload           18
        //   142: getfield        android/support/v4/app/Fragment.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //   145: invokevirtual   android/support/v4/app/LoaderManagerImpl.hasRunningLoaders:()Z
        //   148: ior            
        //   149: istore          11
        //   151: iload           9
        //   153: iconst_1       
        //   154: iadd           
        //   155: istore          19
        //   157: iload           5
        //   159: ifeq            239
        //   162: iload           11
        //   164: ifne            171
        //   167: aload_0        
        //   168: invokevirtual   android/support/v4/app/FragmentManagerImpl.startPendingDeferredFragments:()V
        //   171: aload_0        
        //   172: getfield        android/support/v4/app/FragmentManagerImpl.mNeedMenuInvalidate:Z
        //   175: istore          15
        //   177: iload           15
        //   179: ifeq            61
        //   182: aload_0        
        //   183: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   186: astore          16
        //   188: aload           16
        //   190: ifnull          61
        //   193: aload_0        
        //   194: getfield        android/support/v4/app/FragmentManagerImpl.mCurState:I
        //   197: iconst_5       
        //   198: if_icmpne       61
        //   201: aload_0        
        //   202: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   205: invokevirtual   android/support/v4/app/FragmentActivity.supportInvalidateOptionsMenu:()V
        //   208: aload_0        
        //   209: iconst_0       
        //   210: putfield        android/support/v4/app/FragmentManagerImpl.mNeedMenuInvalidate:Z
        //   213: return         
        //   214: astore          14
        //   216: aload           14
        //   218: athrow         
        //   219: astore          20
        //   221: aload           20
        //   223: athrow         
        //   224: astore          17
        //   226: aload           17
        //   228: athrow         
        //   229: astore          12
        //   231: aload           12
        //   233: athrow         
        //   234: astore          13
        //   236: aload           13
        //   238: athrow         
        //   239: iload           19
        //   241: istore          9
        //   243: iload           11
        //   245: istore          10
        //   247: goto            85
        //   250: iload           10
        //   252: istore          11
        //   254: goto            151
        //   257: iload           10
        //   259: istore          11
        //   261: goto            162
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  5      11     39     44     Ljava/lang/IllegalArgumentException;
        //  20     34     34     39     Ljava/lang/IllegalArgumentException;
        //  41     44     34     39     Ljava/lang/IllegalArgumentException;
        //  49     55     62     67     Ljava/lang/IllegalArgumentException;
        //  116    133    219    224    Ljava/lang/IllegalArgumentException;
        //  167    171    224    229    Ljava/lang/IllegalArgumentException;
        //  171    177    229    234    Ljava/lang/IllegalArgumentException;
        //  182    188    234    239    Ljava/lang/IllegalArgumentException;
        //  193    213    214    219    Ljava/lang/IllegalArgumentException;
        //  231    234    234    239    Ljava/lang/IllegalArgumentException;
        //  236    239    214    219    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 132, Size: 132
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    void moveToState(final int n, final boolean b) {
        this.moveToState(n, 0, 0, b);
    }
    
    void moveToState(final Fragment fragment) {
        this.moveToState(fragment, this.mCurState, 0, 0, false);
    }
    
    void moveToState(final Fragment p0, final int p1, final int p2, final int p3, final boolean p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: aload_1        
        //     6: getfield        android/support/v4/app/Fragment.mAdded:Z
        //     9: istore          9
        //    11: iload           9
        //    13: ifeq            27
        //    16: aload_1        
        //    17: getfield        android/support/v4/app/Fragment.mDetached:Z
        //    20: istore          100
        //    22: iload           100
        //    24: ifeq            2038
        //    27: iload_2        
        //    28: iconst_1       
        //    29: if_icmple       2038
        //    32: iconst_1       
        //    33: istore          10
        //    35: aload_1        
        //    36: getfield        android/support/v4/app/Fragment.mRemoving:Z
        //    39: ifeq            61
        //    42: aload_1        
        //    43: getfield        android/support/v4/app/Fragment.mState:I
        //    46: istore          99
        //    48: iload           10
        //    50: iload           99
        //    52: if_icmple       61
        //    55: aload_1        
        //    56: getfield        android/support/v4/app/Fragment.mState:I
        //    59: istore          10
        //    61: aload_1        
        //    62: getfield        android/support/v4/app/Fragment.mDeferStart:Z
        //    65: istore          14
        //    67: iload           14
        //    69: ifeq            93
        //    72: aload_1        
        //    73: getfield        android/support/v4/app/Fragment.mState:I
        //    76: istore          98
        //    78: iload           98
        //    80: iconst_4       
        //    81: if_icmpge       93
        //    84: iload           10
        //    86: iconst_3       
        //    87: if_icmple       93
        //    90: iconst_3       
        //    91: istore          10
        //    93: aload_1        
        //    94: getfield        android/support/v4/app/Fragment.mState:I
        //    97: istore          18
        //    99: iload           18
        //   101: iload           10
        //   103: if_icmpge       2031
        //   106: aload_1        
        //   107: getfield        android/support/v4/app/Fragment.mFromLayout:Z
        //   110: istore          54
        //   112: iload           54
        //   114: ifeq            169
        //   117: aload_1        
        //   118: getfield        android/support/v4/app/Fragment.mInLayout:Z
        //   121: istore          97
        //   123: iload           97
        //   125: ifne            169
        //   128: return         
        //   129: astore          7
        //   131: aload           7
        //   133: athrow         
        //   134: astore          8
        //   136: aload           8
        //   138: athrow         
        //   139: astore          11
        //   141: aload           11
        //   143: athrow         
        //   144: astore          12
        //   146: aload           12
        //   148: athrow         
        //   149: astore          13
        //   151: aload           13
        //   153: athrow         
        //   154: astore          15
        //   156: aload           15
        //   158: athrow         
        //   159: astore          16
        //   161: aload           16
        //   163: athrow         
        //   164: astore          17
        //   166: aload           17
        //   168: athrow         
        //   169: aload_1        
        //   170: getfield        android/support/v4/app/Fragment.mAnimatingAway:Landroid/view/View;
        //   173: ifnull          193
        //   176: aload_1        
        //   177: aconst_null    
        //   178: putfield        android/support/v4/app/Fragment.mAnimatingAway:Landroid/view/View;
        //   181: aload_0        
        //   182: aload_1        
        //   183: aload_1        
        //   184: getfield        android/support/v4/app/Fragment.mStateAfterAnimating:I
        //   187: iconst_0       
        //   188: iconst_0       
        //   189: iconst_1       
        //   190: invokevirtual   android/support/v4/app/FragmentManagerImpl.moveToState:(Landroid/support/v4/app/Fragment;IIIZ)V
        //   193: aload_1        
        //   194: getfield        android/support/v4/app/Fragment.mState:I
        //   197: istore          58
        //   199: iload           58
        //   201: tableswitch {
        //                0: 312
        //                1: 780
        //                2: 1140
        //                3: 1140
        //                4: 2024
        //          default: 236
        //        }
        //   236: iload           10
        //   238: istore          19
        //   240: iload           6
        //   242: ifeq            300
        //   245: aload_1        
        //   246: getfield        android/support/v4/app/Fragment.mState:I
        //   249: istore          24
        //   251: iload           24
        //   253: iload           19
        //   255: if_icmple       300
        //   258: aload_1        
        //   259: getfield        android/support/v4/app/Fragment.mState:I
        //   262: istore          25
        //   264: iload           25
        //   266: tableswitch {
        //                2: 1738
        //                3: 1527
        //                4: 1478
        //                5: 1429
        //                6: 1375
        //          default: 300
        //        }
        //   300: aload_1        
        //   301: iload           19
        //   303: putfield        android/support/v4/app/Fragment.mState:I
        //   306: return         
        //   307: astore          55
        //   309: aload           55
        //   311: athrow         
        //   312: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   315: ifeq            351
        //   318: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   321: bipush          34
        //   323: aaload         
        //   324: new             Ljava/lang/StringBuilder;
        //   327: dup            
        //   328: invokespecial   java/lang/StringBuilder.<init>:()V
        //   331: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   334: bipush          24
        //   336: aaload         
        //   337: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   340: aload_1        
        //   341: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   344: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   347: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   350: pop            
        //   351: aload_1        
        //   352: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //   355: astore          80
        //   357: aload           80
        //   359: ifnull          475
        //   362: aload_1        
        //   363: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //   366: aload_0        
        //   367: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   370: invokevirtual   android/support/v4/app/FragmentActivity.getClassLoader:()Ljava/lang/ClassLoader;
        //   373: invokevirtual   android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
        //   376: aload_1        
        //   377: aload_1        
        //   378: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //   381: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   384: bipush          31
        //   386: aaload         
        //   387: invokevirtual   android/os/Bundle.getSparseParcelableArray:(Ljava/lang/String;)Landroid/util/SparseArray;
        //   390: putfield        android/support/v4/app/Fragment.mSavedViewState:Landroid/util/SparseArray;
        //   393: aload_1        
        //   394: aload_0        
        //   395: aload_1        
        //   396: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //   399: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   402: bipush          47
        //   404: aaload         
        //   405: invokevirtual   android/support/v4/app/FragmentManagerImpl.getFragment:(Landroid/os/Bundle;Ljava/lang/String;)Landroid/support/v4/app/Fragment;
        //   408: putfield        android/support/v4/app/Fragment.mTarget:Landroid/support/v4/app/Fragment;
        //   411: aload_1        
        //   412: getfield        android/support/v4/app/Fragment.mTarget:Landroid/support/v4/app/Fragment;
        //   415: ifnull          436
        //   418: aload_1        
        //   419: aload_1        
        //   420: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //   423: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   426: bipush          41
        //   428: aaload         
        //   429: iconst_0       
        //   430: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;I)I
        //   433: putfield        android/support/v4/app/Fragment.mTargetRequestCode:I
        //   436: aload_1        
        //   437: aload_1        
        //   438: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //   441: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   444: bipush          28
        //   446: aaload         
        //   447: iconst_1       
        //   448: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
        //   451: putfield        android/support/v4/app/Fragment.mUserVisibleHint:Z
        //   454: aload_1        
        //   455: getfield        android/support/v4/app/Fragment.mUserVisibleHint:Z
        //   458: ifne            475
        //   461: aload_1        
        //   462: iconst_1       
        //   463: putfield        android/support/v4/app/Fragment.mDeferStart:Z
        //   466: iload           10
        //   468: iconst_3       
        //   469: if_icmple       475
        //   472: iconst_3       
        //   473: istore          10
        //   475: aload_1        
        //   476: aload_0        
        //   477: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   480: putfield        android/support/v4/app/Fragment.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   483: aload_1        
        //   484: aload_0        
        //   485: getfield        android/support/v4/app/FragmentManagerImpl.mParent:Landroid/support/v4/app/Fragment;
        //   488: putfield        android/support/v4/app/Fragment.mParentFragment:Landroid/support/v4/app/Fragment;
        //   491: aload_0        
        //   492: getfield        android/support/v4/app/FragmentManagerImpl.mParent:Landroid/support/v4/app/Fragment;
        //   495: ifnull          608
        //   498: aload_0        
        //   499: getfield        android/support/v4/app/FragmentManagerImpl.mParent:Landroid/support/v4/app/Fragment;
        //   502: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   505: astore          82
        //   507: aload_1        
        //   508: aload           82
        //   510: putfield        android/support/v4/app/Fragment.mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   513: aload_1        
        //   514: iconst_0       
        //   515: putfield        android/support/v4/app/Fragment.mCalled:Z
        //   518: aload_1        
        //   519: aload_0        
        //   520: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   523: invokevirtual   android/support/v4/app/Fragment.onAttach:(Landroid/app/Activity;)V
        //   526: aload_1        
        //   527: getfield        android/support/v4/app/Fragment.mCalled:Z
        //   530: ifne            620
        //   533: new             Landroid/support/v4/app/SuperNotCalledException;
        //   536: dup            
        //   537: new             Ljava/lang/StringBuilder;
        //   540: dup            
        //   541: invokespecial   java/lang/StringBuilder.<init>:()V
        //   544: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   547: bipush          25
        //   549: aaload         
        //   550: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   553: aload_1        
        //   554: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   557: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   560: bipush          43
        //   562: aaload         
        //   563: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   566: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   569: invokespecial   android/support/v4/app/SuperNotCalledException.<init>:(Ljava/lang/String;)V
        //   572: athrow         
        //   573: astore          83
        //   575: aload           83
        //   577: athrow         
        //   578: astore          56
        //   580: aload           56
        //   582: athrow         
        //   583: astore          57
        //   585: aload           57
        //   587: athrow         
        //   588: astore          78
        //   590: aload           78
        //   592: athrow         
        //   593: astore          79
        //   595: aload           79
        //   597: athrow         
        //   598: astore          95
        //   600: aload           95
        //   602: athrow         
        //   603: astore          81
        //   605: aload           81
        //   607: athrow         
        //   608: aload_0        
        //   609: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   612: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //   615: astore          82
        //   617: goto            507
        //   620: aload_1        
        //   621: getfield        android/support/v4/app/Fragment.mParentFragment:Landroid/support/v4/app/Fragment;
        //   624: ifnonnull       635
        //   627: aload_0        
        //   628: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   631: aload_1        
        //   632: invokevirtual   android/support/v4/app/FragmentActivity.onAttachFragment:(Landroid/support/v4/app/Fragment;)V
        //   635: aload_1        
        //   636: getfield        android/support/v4/app/Fragment.mRetaining:Z
        //   639: ifne            650
        //   642: aload_1        
        //   643: aload_1        
        //   644: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //   647: invokevirtual   android/support/v4/app/Fragment.performCreate:(Landroid/os/Bundle;)V
        //   650: aload_1        
        //   651: iconst_0       
        //   652: putfield        android/support/v4/app/Fragment.mRetaining:Z
        //   655: aload_1        
        //   656: getfield        android/support/v4/app/Fragment.mFromLayout:Z
        //   659: istore          90
        //   661: iload           90
        //   663: ifeq            780
        //   666: aload_1        
        //   667: aload_1        
        //   668: aload_1        
        //   669: aload_1        
        //   670: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //   673: invokevirtual   android/support/v4/app/Fragment.getLayoutInflater:(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
        //   676: aconst_null    
        //   677: aload_1        
        //   678: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //   681: invokevirtual   android/support/v4/app/Fragment.performCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
        //   684: putfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   687: aload_1        
        //   688: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   691: astore          91
        //   693: aload           91
        //   695: ifnull          775
        //   698: aload_1        
        //   699: aload_1        
        //   700: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   703: putfield        android/support/v4/app/Fragment.mInnerView:Landroid/view/View;
        //   706: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   709: istore          93
        //   711: iload           93
        //   713: bipush          11
        //   715: if_icmplt       731
        //   718: aload_1        
        //   719: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   722: iconst_0       
        //   723: invokestatic    android/support/v4/view/ViewCompat.setSaveFromParentEnabled:(Landroid/view/View;Z)V
        //   726: iload           6
        //   728: ifeq            742
        //   731: aload_1        
        //   732: aload_1        
        //   733: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   736: invokestatic    android/support/v4/app/NoSaveStateFrameLayout.wrap:(Landroid/view/View;)Landroid/view/ViewGroup;
        //   739: putfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   742: aload_1        
        //   743: getfield        android/support/v4/app/Fragment.mHidden:Z
        //   746: ifeq            758
        //   749: aload_1        
        //   750: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   753: bipush          8
        //   755: invokevirtual   android/view/View.setVisibility:(I)V
        //   758: aload_1        
        //   759: aload_1        
        //   760: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   763: aload_1        
        //   764: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //   767: invokevirtual   android/support/v4/app/Fragment.onViewCreated:(Landroid/view/View;Landroid/os/Bundle;)V
        //   770: iload           6
        //   772: ifeq            780
        //   775: aload_1        
        //   776: aconst_null    
        //   777: putfield        android/support/v4/app/Fragment.mInnerView:Landroid/view/View;
        //   780: iload           10
        //   782: iconst_1       
        //   783: if_icmple       1140
        //   786: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   789: ifeq            825
        //   792: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   795: bipush          50
        //   797: aaload         
        //   798: new             Ljava/lang/StringBuilder;
        //   801: dup            
        //   802: invokespecial   java/lang/StringBuilder.<init>:()V
        //   805: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   808: bipush          52
        //   810: aaload         
        //   811: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   814: aload_1        
        //   815: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   818: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   821: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   824: pop            
        //   825: aload_1        
        //   826: getfield        android/support/v4/app/Fragment.mFromLayout:Z
        //   829: ifne            1112
        //   832: aload_1        
        //   833: getfield        android/support/v4/app/Fragment.mContainerId:I
        //   836: istore          65
        //   838: aconst_null    
        //   839: astore          66
        //   841: iload           65
        //   843: ifeq            952
        //   846: aload_0        
        //   847: getfield        android/support/v4/app/FragmentManagerImpl.mContainer:Landroid/support/v4/app/FragmentContainer;
        //   850: aload_1        
        //   851: getfield        android/support/v4/app/Fragment.mContainerId:I
        //   854: invokeinterface android/support/v4/app/FragmentContainer.findViewById:(I)Landroid/view/View;
        //   859: checkcast       Landroid/view/ViewGroup;
        //   862: astore          66
        //   864: aload           66
        //   866: ifnonnull       952
        //   869: aload_1        
        //   870: getfield        android/support/v4/app/Fragment.mRestored:Z
        //   873: ifne            952
        //   876: aload_0        
        //   877: new             Ljava/lang/IllegalArgumentException;
        //   880: dup            
        //   881: new             Ljava/lang/StringBuilder;
        //   884: dup            
        //   885: invokespecial   java/lang/StringBuilder.<init>:()V
        //   888: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   891: bipush          37
        //   893: aaload         
        //   894: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   897: aload_1        
        //   898: getfield        android/support/v4/app/Fragment.mContainerId:I
        //   901: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   904: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   907: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   910: bipush          39
        //   912: aaload         
        //   913: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   916: aload_1        
        //   917: invokevirtual   android/support/v4/app/Fragment.getResources:()Landroid/content/res/Resources;
        //   920: aload_1        
        //   921: getfield        android/support/v4/app/Fragment.mContainerId:I
        //   924: invokevirtual   android/content/res/Resources.getResourceName:(I)Ljava/lang/String;
        //   927: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   930: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   933: bipush          26
        //   935: aaload         
        //   936: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   939: aload_1        
        //   940: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   943: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   946: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   949: invokespecial   android/support/v4/app/FragmentManagerImpl.throwException:(Ljava/lang/RuntimeException;)V
        //   952: aload_1        
        //   953: aload           66
        //   955: putfield        android/support/v4/app/Fragment.mContainer:Landroid/view/ViewGroup;
        //   958: aload_1        
        //   959: aload_1        
        //   960: aload_1        
        //   961: aload_1        
        //   962: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //   965: invokevirtual   android/support/v4/app/Fragment.getLayoutInflater:(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
        //   968: aload           66
        //   970: aload_1        
        //   971: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //   974: invokevirtual   android/support/v4/app/Fragment.performCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
        //   977: putfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   980: aload_1        
        //   981: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   984: astore          70
        //   986: aload           70
        //   988: ifnull          1107
        //   991: aload_1        
        //   992: aload_1        
        //   993: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   996: putfield        android/support/v4/app/Fragment.mInnerView:Landroid/view/View;
        //   999: getstatic       android/os/Build$VERSION.SDK_INT:I
        //  1002: istore          72
        //  1004: iload           72
        //  1006: bipush          11
        //  1008: if_icmplt       1024
        //  1011: aload_1        
        //  1012: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //  1015: iconst_0       
        //  1016: invokestatic    android/support/v4/view/ViewCompat.setSaveFromParentEnabled:(Landroid/view/View;Z)V
        //  1019: iload           6
        //  1021: ifeq            1035
        //  1024: aload_1        
        //  1025: aload_1        
        //  1026: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //  1029: invokestatic    android/support/v4/app/NoSaveStateFrameLayout.wrap:(Landroid/view/View;)Landroid/view/ViewGroup;
        //  1032: putfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //  1035: aload           66
        //  1037: ifnull          1074
        //  1040: aload_0        
        //  1041: aload_1        
        //  1042: iload_3        
        //  1043: iconst_1       
        //  1044: iload           4
        //  1046: invokevirtual   android/support/v4/app/FragmentManagerImpl.loadAnimation:(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;
        //  1049: astore          74
        //  1051: aload           74
        //  1053: ifnull          1065
        //  1056: aload_1        
        //  1057: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //  1060: aload           74
        //  1062: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //  1065: aload           66
        //  1067: aload_1        
        //  1068: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //  1071: invokevirtual   android/view/ViewGroup.addView:(Landroid/view/View;)V
        //  1074: aload_1        
        //  1075: getfield        android/support/v4/app/Fragment.mHidden:Z
        //  1078: ifeq            1090
        //  1081: aload_1        
        //  1082: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //  1085: bipush          8
        //  1087: invokevirtual   android/view/View.setVisibility:(I)V
        //  1090: aload_1        
        //  1091: aload_1        
        //  1092: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //  1095: aload_1        
        //  1096: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //  1099: invokevirtual   android/support/v4/app/Fragment.onViewCreated:(Landroid/view/View;Landroid/os/Bundle;)V
        //  1102: iload           6
        //  1104: ifeq            1112
        //  1107: aload_1        
        //  1108: aconst_null    
        //  1109: putfield        android/support/v4/app/Fragment.mInnerView:Landroid/view/View;
        //  1112: aload_1        
        //  1113: aload_1        
        //  1114: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //  1117: invokevirtual   android/support/v4/app/Fragment.performActivityCreated:(Landroid/os/Bundle;)V
        //  1120: aload_1        
        //  1121: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //  1124: ifnull          1135
        //  1127: aload_1        
        //  1128: aload_1        
        //  1129: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //  1132: invokevirtual   android/support/v4/app/Fragment.restoreViewState:(Landroid/os/Bundle;)V
        //  1135: aload_1        
        //  1136: aconst_null    
        //  1137: putfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //  1140: iload           10
        //  1142: istore          19
        //  1144: iload           19
        //  1146: iconst_3       
        //  1147: if_icmple       1193
        //  1150: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //  1153: ifeq            1189
        //  1156: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1159: bipush          33
        //  1161: aaload         
        //  1162: new             Ljava/lang/StringBuilder;
        //  1165: dup            
        //  1166: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1169: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1172: bipush          38
        //  1174: aaload         
        //  1175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1178: aload_1        
        //  1179: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1182: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1185: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //  1188: pop            
        //  1189: aload_1        
        //  1190: invokevirtual   android/support/v4/app/Fragment.performStart:()V
        //  1193: iload           19
        //  1195: iconst_4       
        //  1196: if_icmple       240
        //  1199: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //  1202: ifeq            1238
        //  1205: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1208: bipush          36
        //  1210: aaload         
        //  1211: new             Ljava/lang/StringBuilder;
        //  1214: dup            
        //  1215: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1218: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1221: bipush          46
        //  1223: aaload         
        //  1224: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1227: aload_1        
        //  1228: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1231: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1234: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //  1237: pop            
        //  1238: aload_1        
        //  1239: iconst_1       
        //  1240: putfield        android/support/v4/app/Fragment.mResumed:Z
        //  1243: aload_1        
        //  1244: invokevirtual   android/support/v4/app/Fragment.performResume:()V
        //  1247: aload_1        
        //  1248: aconst_null    
        //  1249: putfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //  1252: aload_1        
        //  1253: aconst_null    
        //  1254: putfield        android/support/v4/app/Fragment.mSavedViewState:Landroid/util/SparseArray;
        //  1257: goto            240
        //  1260: astore          84
        //  1262: aload           84
        //  1264: athrow         
        //  1265: astore          85
        //  1267: aload           85
        //  1269: athrow         
        //  1270: astore          86
        //  1272: aload           86
        //  1274: athrow         
        //  1275: astore          87
        //  1277: aload           87
        //  1279: athrow         
        //  1280: astore          88
        //  1282: aload           88
        //  1284: athrow         
        //  1285: astore          89
        //  1287: aload           89
        //  1289: athrow         
        //  1290: astore          94
        //  1292: aload           94
        //  1294: athrow         
        //  1295: astore          92
        //  1297: aload           92
        //  1299: athrow         
        //  1300: astore          63
        //  1302: aload           63
        //  1304: athrow         
        //  1305: astore          76
        //  1307: aload           76
        //  1309: athrow         
        //  1310: astore          67
        //  1312: aload           67
        //  1314: athrow         
        //  1315: astore          68
        //  1317: aload           68
        //  1319: athrow         
        //  1320: astore          69
        //  1322: aload           69
        //  1324: athrow         
        //  1325: astore          75
        //  1327: aload           75
        //  1329: athrow         
        //  1330: astore          73
        //  1332: aload           73
        //  1334: athrow         
        //  1335: astore          71
        //  1337: aload           71
        //  1339: athrow         
        //  1340: astore          64
        //  1342: aload           64
        //  1344: athrow         
        //  1345: astore          61
        //  1347: aload           61
        //  1349: athrow         
        //  1350: astore          59
        //  1352: aload           59
        //  1354: athrow         
        //  1355: astore          20
        //  1357: aload           20
        //  1359: athrow         
        //  1360: astore          21
        //  1362: aload           21
        //  1364: athrow         
        //  1365: astore          22
        //  1367: aload           22
        //  1369: athrow         
        //  1370: astore          23
        //  1372: aload           23
        //  1374: athrow         
        //  1375: iload           19
        //  1377: iconst_5       
        //  1378: if_icmpge       1429
        //  1381: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //  1384: ifeq            1420
        //  1387: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1390: bipush          35
        //  1392: aaload         
        //  1393: new             Ljava/lang/StringBuilder;
        //  1396: dup            
        //  1397: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1400: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1403: bipush          51
        //  1405: aaload         
        //  1406: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1409: aload_1        
        //  1410: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1413: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1416: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //  1419: pop            
        //  1420: aload_1        
        //  1421: invokevirtual   android/support/v4/app/Fragment.performPause:()V
        //  1424: aload_1        
        //  1425: iconst_0       
        //  1426: putfield        android/support/v4/app/Fragment.mResumed:Z
        //  1429: iload           19
        //  1431: iconst_4       
        //  1432: if_icmpge       1478
        //  1435: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //  1438: ifeq            1474
        //  1441: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1444: bipush          49
        //  1446: aaload         
        //  1447: new             Ljava/lang/StringBuilder;
        //  1450: dup            
        //  1451: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1454: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1457: bipush          27
        //  1459: aaload         
        //  1460: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1463: aload_1        
        //  1464: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1467: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1470: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //  1473: pop            
        //  1474: aload_1        
        //  1475: invokevirtual   android/support/v4/app/Fragment.performStop:()V
        //  1478: iload           19
        //  1480: iconst_3       
        //  1481: if_icmpge       1527
        //  1484: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //  1487: ifeq            1523
        //  1490: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1493: bipush          30
        //  1495: aaload         
        //  1496: new             Ljava/lang/StringBuilder;
        //  1499: dup            
        //  1500: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1503: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1506: bipush          29
        //  1508: aaload         
        //  1509: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1512: aload_1        
        //  1513: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1516: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1519: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //  1522: pop            
        //  1523: aload_1        
        //  1524: invokevirtual   android/support/v4/app/Fragment.performReallyStop:()V
        //  1527: iload           19
        //  1529: iconst_2       
        //  1530: if_icmpge       1738
        //  1533: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //  1536: ifeq            1572
        //  1539: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1542: bipush          42
        //  1544: aaload         
        //  1545: new             Ljava/lang/StringBuilder;
        //  1548: dup            
        //  1549: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1552: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1555: bipush          32
        //  1557: aaload         
        //  1558: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1561: aload_1        
        //  1562: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1565: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1568: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //  1571: pop            
        //  1572: aload_1        
        //  1573: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //  1576: astore          40
        //  1578: aload           40
        //  1580: ifnull          1609
        //  1583: aload_0        
        //  1584: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //  1587: invokevirtual   android/support/v4/app/FragmentActivity.isFinishing:()Z
        //  1590: istore          47
        //  1592: iload           47
        //  1594: ifne            1609
        //  1597: aload_1        
        //  1598: getfield        android/support/v4/app/Fragment.mSavedViewState:Landroid/util/SparseArray;
        //  1601: ifnonnull       1609
        //  1604: aload_0        
        //  1605: aload_1        
        //  1606: invokevirtual   android/support/v4/app/FragmentManagerImpl.saveFragmentViewState:(Landroid/support/v4/app/Fragment;)V
        //  1609: aload_1        
        //  1610: invokevirtual   android/support/v4/app/Fragment.performDestroyView:()V
        //  1613: aload_1        
        //  1614: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //  1617: ifnull          1723
        //  1620: aload_1        
        //  1621: getfield        android/support/v4/app/Fragment.mContainer:Landroid/view/ViewGroup;
        //  1624: astore          42
        //  1626: aload           42
        //  1628: ifnull          1723
        //  1631: aload_0        
        //  1632: getfield        android/support/v4/app/FragmentManagerImpl.mCurState:I
        //  1635: istore          44
        //  1637: aconst_null    
        //  1638: astore          45
        //  1640: iload           44
        //  1642: ifle            1670
        //  1645: aload_0        
        //  1646: getfield        android/support/v4/app/FragmentManagerImpl.mDestroyed:Z
        //  1649: istore          46
        //  1651: aconst_null    
        //  1652: astore          45
        //  1654: iload           46
        //  1656: ifne            1670
        //  1659: aload_0        
        //  1660: aload_1        
        //  1661: iload_3        
        //  1662: iconst_0       
        //  1663: iload           4
        //  1665: invokevirtual   android/support/v4/app/FragmentManagerImpl.loadAnimation:(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;
        //  1668: astore          45
        //  1670: aload           45
        //  1672: ifnull          1712
        //  1675: aload_1        
        //  1676: aload_1        
        //  1677: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //  1680: putfield        android/support/v4/app/Fragment.mAnimatingAway:Landroid/view/View;
        //  1683: aload_1        
        //  1684: iload           19
        //  1686: putfield        android/support/v4/app/Fragment.mStateAfterAnimating:I
        //  1689: aload           45
        //  1691: new             Landroid/support/v4/app/FragmentManagerImpl$5;
        //  1694: dup            
        //  1695: aload_0        
        //  1696: aload_1        
        //  1697: invokespecial   android/support/v4/app/FragmentManagerImpl$5.<init>:(Landroid/support/v4/app/FragmentManagerImpl;Landroid/support/v4/app/Fragment;)V
        //  1700: invokevirtual   android/view/animation/Animation.setAnimationListener:(Landroid/view/animation/Animation$AnimationListener;)V
        //  1703: aload_1        
        //  1704: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //  1707: aload           45
        //  1709: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //  1712: aload_1        
        //  1713: getfield        android/support/v4/app/Fragment.mContainer:Landroid/view/ViewGroup;
        //  1716: aload_1        
        //  1717: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //  1720: invokevirtual   android/view/ViewGroup.removeView:(Landroid/view/View;)V
        //  1723: aload_1        
        //  1724: aconst_null    
        //  1725: putfield        android/support/v4/app/Fragment.mContainer:Landroid/view/ViewGroup;
        //  1728: aload_1        
        //  1729: aconst_null    
        //  1730: putfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //  1733: aload_1        
        //  1734: aconst_null    
        //  1735: putfield        android/support/v4/app/Fragment.mInnerView:Landroid/view/View;
        //  1738: iload           19
        //  1740: iconst_1       
        //  1741: if_icmpge       300
        //  1744: aload_0        
        //  1745: getfield        android/support/v4/app/FragmentManagerImpl.mDestroyed:Z
        //  1748: ifeq            1778
        //  1751: aload_1        
        //  1752: getfield        android/support/v4/app/Fragment.mAnimatingAway:Landroid/view/View;
        //  1755: astore          34
        //  1757: aload           34
        //  1759: ifnull          1778
        //  1762: aload_1        
        //  1763: getfield        android/support/v4/app/Fragment.mAnimatingAway:Landroid/view/View;
        //  1766: astore          35
        //  1768: aload_1        
        //  1769: aconst_null    
        //  1770: putfield        android/support/v4/app/Fragment.mAnimatingAway:Landroid/view/View;
        //  1773: aload           35
        //  1775: invokevirtual   android/view/View.clearAnimation:()V
        //  1778: aload_1        
        //  1779: getfield        android/support/v4/app/Fragment.mAnimatingAway:Landroid/view/View;
        //  1782: ifnull          1799
        //  1785: aload_1        
        //  1786: iload           19
        //  1788: putfield        android/support/v4/app/Fragment.mStateAfterAnimating:I
        //  1791: iconst_1       
        //  1792: istore          19
        //  1794: iload           6
        //  1796: ifeq            300
        //  1799: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //  1802: ifeq            1838
        //  1805: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1808: bipush          45
        //  1810: aaload         
        //  1811: new             Ljava/lang/StringBuilder;
        //  1814: dup            
        //  1815: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1818: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1821: bipush          40
        //  1823: aaload         
        //  1824: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1827: aload_1        
        //  1828: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1831: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1834: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //  1837: pop            
        //  1838: aload_1        
        //  1839: getfield        android/support/v4/app/Fragment.mRetaining:Z
        //  1842: ifne            1849
        //  1845: aload_1        
        //  1846: invokevirtual   android/support/v4/app/Fragment.performDestroy:()V
        //  1849: aload_1        
        //  1850: iconst_0       
        //  1851: putfield        android/support/v4/app/Fragment.mCalled:Z
        //  1854: aload_1        
        //  1855: invokevirtual   android/support/v4/app/Fragment.onDetach:()V
        //  1858: aload_1        
        //  1859: getfield        android/support/v4/app/Fragment.mCalled:Z
        //  1862: ifne            1965
        //  1865: new             Landroid/support/v4/app/SuperNotCalledException;
        //  1868: dup            
        //  1869: new             Ljava/lang/StringBuilder;
        //  1872: dup            
        //  1873: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1876: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1879: bipush          48
        //  1881: aaload         
        //  1882: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1885: aload_1        
        //  1886: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1889: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1892: bipush          44
        //  1894: aaload         
        //  1895: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1898: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1901: invokespecial   android/support/v4/app/SuperNotCalledException.<init>:(Ljava/lang/String;)V
        //  1904: athrow         
        //  1905: astore          29
        //  1907: aload           29
        //  1909: athrow         
        //  1910: astore          51
        //  1912: aload           51
        //  1914: athrow         
        //  1915: astore          49
        //  1917: aload           49
        //  1919: athrow         
        //  1920: astore          36
        //  1922: aload           36
        //  1924: athrow         
        //  1925: astore          37
        //  1927: aload           37
        //  1929: athrow         
        //  1930: astore          38
        //  1932: aload           38
        //  1934: athrow         
        //  1935: astore          39
        //  1937: aload           39
        //  1939: athrow         
        //  1940: astore          41
        //  1942: aload           41
        //  1944: athrow         
        //  1945: astore          43
        //  1947: aload           43
        //  1949: athrow         
        //  1950: astore          26
        //  1952: aload           26
        //  1954: athrow         
        //  1955: astore          27
        //  1957: aload           27
        //  1959: athrow         
        //  1960: astore          28
        //  1962: aload           28
        //  1964: athrow         
        //  1965: iload           5
        //  1967: ifne            300
        //  1970: aload_1        
        //  1971: getfield        android/support/v4/app/Fragment.mRetaining:Z
        //  1974: istore          32
        //  1976: iload           32
        //  1978: ifne            1991
        //  1981: aload_0        
        //  1982: aload_1        
        //  1983: invokevirtual   android/support/v4/app/FragmentManagerImpl.makeInactive:(Landroid/support/v4/app/Fragment;)V
        //  1986: iload           6
        //  1988: ifeq            300
        //  1991: aload_1        
        //  1992: aconst_null    
        //  1993: putfield        android/support/v4/app/Fragment.mActivity:Landroid/support/v4/app/FragmentActivity;
        //  1996: aload_1        
        //  1997: aconst_null    
        //  1998: putfield        android/support/v4/app/Fragment.mParentFragment:Landroid/support/v4/app/Fragment;
        //  2001: aload_1        
        //  2002: aconst_null    
        //  2003: putfield        android/support/v4/app/Fragment.mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //  2006: aload_1        
        //  2007: aconst_null    
        //  2008: putfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //  2011: goto            300
        //  2014: astore          31
        //  2016: aload           31
        //  2018: athrow         
        //  2019: astore          30
        //  2021: aload           30
        //  2023: athrow         
        //  2024: iload           10
        //  2026: istore          19
        //  2028: goto            1193
        //  2031: iload           10
        //  2033: istore          19
        //  2035: goto            245
        //  2038: iload_2        
        //  2039: istore          10
        //  2041: goto            35
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  5      11     129    134    Ljava/lang/IllegalArgumentException;
        //  16     22     134    139    Ljava/lang/IllegalArgumentException;
        //  35     48     139    144    Ljava/lang/IllegalArgumentException;
        //  61     67     144    149    Ljava/lang/IllegalArgumentException;
        //  72     78     149    154    Ljava/lang/IllegalArgumentException;
        //  93     99     154    159    Ljava/lang/IllegalArgumentException;
        //  106    112    159    164    Ljava/lang/IllegalArgumentException;
        //  117    123    164    169    Ljava/lang/IllegalArgumentException;
        //  131    134    134    139    Ljava/lang/IllegalArgumentException;
        //  146    149    149    154    Ljava/lang/IllegalArgumentException;
        //  156    159    159    164    Ljava/lang/IllegalArgumentException;
        //  161    164    164    169    Ljava/lang/IllegalArgumentException;
        //  169    193    307    312    Ljava/lang/IllegalArgumentException;
        //  193    199    578    583    Ljava/lang/IllegalArgumentException;
        //  245    251    1355   1360   Ljava/lang/IllegalArgumentException;
        //  258    264    1360   1370   Ljava/lang/IllegalArgumentException;
        //  312    351    583    588    Ljava/lang/IllegalArgumentException;
        //  351    357    588    593    Ljava/lang/IllegalArgumentException;
        //  362    436    593    598    Ljava/lang/IllegalArgumentException;
        //  436    466    598    603    Ljava/lang/IllegalArgumentException;
        //  475    507    603    608    Ljava/lang/IllegalArgumentException;
        //  507    573    573    578    Ljava/lang/IllegalArgumentException;
        //  580    583    583    588    Ljava/lang/IllegalArgumentException;
        //  590    593    593    598    Ljava/lang/IllegalArgumentException;
        //  620    635    1260   1265   Ljava/lang/IllegalArgumentException;
        //  635    650    1265   1270   Ljava/lang/IllegalArgumentException;
        //  650    661    1270   1275   Ljava/lang/IllegalArgumentException;
        //  666    693    1275   1280   Ljava/lang/IllegalArgumentException;
        //  698    711    1280   1285   Ljava/lang/IllegalArgumentException;
        //  718    726    1285   1290   Ljava/lang/IllegalArgumentException;
        //  731    742    1285   1290   Ljava/lang/IllegalArgumentException;
        //  742    758    1290   1295   Ljava/lang/IllegalArgumentException;
        //  758    770    1295   1300   Ljava/lang/IllegalArgumentException;
        //  775    780    1295   1300   Ljava/lang/IllegalArgumentException;
        //  786    825    1300   1305   Ljava/lang/IllegalArgumentException;
        //  869    952    1305   1310   Ljava/lang/IllegalArgumentException;
        //  952    986    1310   1315   Ljava/lang/IllegalArgumentException;
        //  991    1004   1315   1320   Ljava/lang/IllegalArgumentException;
        //  1011   1019   1320   1325   Ljava/lang/IllegalArgumentException;
        //  1024   1035   1320   1325   Ljava/lang/IllegalArgumentException;
        //  1056   1065   1325   1330   Ljava/lang/IllegalArgumentException;
        //  1074   1090   1330   1335   Ljava/lang/IllegalArgumentException;
        //  1090   1102   1335   1340   Ljava/lang/IllegalArgumentException;
        //  1107   1112   1335   1340   Ljava/lang/IllegalArgumentException;
        //  1112   1135   1340   1345   Ljava/lang/IllegalArgumentException;
        //  1150   1189   1345   1350   Ljava/lang/IllegalArgumentException;
        //  1199   1238   1350   1355   Ljava/lang/IllegalArgumentException;
        //  1272   1275   1275   1280   Ljava/lang/IllegalArgumentException;
        //  1277   1280   1280   1285   Ljava/lang/IllegalArgumentException;
        //  1282   1285   1285   1290   Ljava/lang/IllegalArgumentException;
        //  1312   1315   1315   1320   Ljava/lang/IllegalArgumentException;
        //  1317   1320   1320   1325   Ljava/lang/IllegalArgumentException;
        //  1357   1360   1360   1370   Ljava/lang/IllegalArgumentException;
        //  1362   1365   1365   1370   Ljava/lang/IllegalArgumentException;
        //  1367   1370   1370   1375   Ljava/lang/IllegalArgumentException;
        //  1381   1420   1370   1375   Ljava/lang/IllegalArgumentException;
        //  1435   1474   1910   1915   Ljava/lang/IllegalArgumentException;
        //  1484   1523   1915   1920   Ljava/lang/IllegalArgumentException;
        //  1533   1572   1920   1925   Ljava/lang/IllegalArgumentException;
        //  1572   1578   1925   1930   Ljava/lang/IllegalArgumentException;
        //  1583   1592   1930   1935   Ljava/lang/IllegalArgumentException;
        //  1597   1609   1935   1940   Ljava/lang/IllegalArgumentException;
        //  1609   1626   1940   1945   Ljava/lang/IllegalArgumentException;
        //  1631   1637   1945   1950   Ljava/lang/IllegalArgumentException;
        //  1645   1651   1945   1950   Ljava/lang/IllegalArgumentException;
        //  1744   1757   1950   1955   Ljava/lang/IllegalArgumentException;
        //  1799   1838   1955   1960   Ljava/lang/IllegalArgumentException;
        //  1838   1849   1960   1965   Ljava/lang/IllegalArgumentException;
        //  1849   1905   1905   1910   Ljava/lang/IllegalArgumentException;
        //  1927   1930   1930   1935   Ljava/lang/IllegalArgumentException;
        //  1932   1935   1935   1940   Ljava/lang/IllegalArgumentException;
        //  1970   1976   2019   2024   Ljava/lang/IllegalArgumentException;
        //  1981   1986   2014   2019   Ljava/lang/IllegalArgumentException;
        //  1991   2011   2014   2019   Ljava/lang/IllegalArgumentException;
        //  2021   2024   2014   2019   Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 966, Size: 966
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void noteStateNotSaved() {
        this.mStateSaved = false;
    }
    
    @Override
    public View onCreateView(final View p0, final String p1, final Context p2, final AttributeSet p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore          5
        //     5: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //     8: bipush          56
        //    10: aaload         
        //    11: aload_2        
        //    12: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    15: istore          7
        //    17: iload           7
        //    19: ifne            29
        //    22: aconst_null    
        //    23: areturn        
        //    24: astore          6
        //    26: aload           6
        //    28: athrow         
        //    29: aload           4
        //    31: aconst_null    
        //    32: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    35: bipush          65
        //    37: aaload         
        //    38: invokeinterface android/util/AttributeSet.getAttributeValue:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    43: astore          8
        //    45: aload_3        
        //    46: aload           4
        //    48: getstatic       android/support/v4/app/FragmentManagerImpl$FragmentTag.Fragment:[I
        //    51: invokevirtual   android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
        //    54: astore          9
        //    56: aload           8
        //    58: ifnonnull       753
        //    61: aload           9
        //    63: iconst_0       
        //    64: invokevirtual   android/content/res/TypedArray.getString:(I)Ljava/lang/String;
        //    67: astore          10
        //    69: aload           9
        //    71: iconst_1       
        //    72: iconst_m1      
        //    73: invokevirtual   android/content/res/TypedArray.getResourceId:(II)I
        //    76: istore          11
        //    78: aload           9
        //    80: iconst_2       
        //    81: invokevirtual   android/content/res/TypedArray.getString:(I)Ljava/lang/String;
        //    84: astore          12
        //    86: aload           9
        //    88: invokevirtual   android/content/res/TypedArray.recycle:()V
        //    91: aload_0        
        //    92: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //    95: aload           10
        //    97: invokestatic    android/support/v4/app/Fragment.isSupportFragmentClass:(Landroid/content/Context;Ljava/lang/String;)Z
        //   100: istore          14
        //   102: iload           14
        //   104: ifeq            22
        //   107: aload_1        
        //   108: ifnull          195
        //   111: aload_1        
        //   112: invokevirtual   android/view/View.getId:()I
        //   115: istore          36
        //   117: iload           36
        //   119: istore          15
        //   121: iload           15
        //   123: iconst_m1      
        //   124: if_icmpne       201
        //   127: iload           11
        //   129: iconst_m1      
        //   130: if_icmpne       201
        //   133: aload           12
        //   135: ifnonnull       201
        //   138: new             Ljava/lang/IllegalArgumentException;
        //   141: dup            
        //   142: new             Ljava/lang/StringBuilder;
        //   145: dup            
        //   146: invokespecial   java/lang/StringBuilder.<init>:()V
        //   149: aload           4
        //   151: invokeinterface android/util/AttributeSet.getPositionDescription:()Ljava/lang/String;
        //   156: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   159: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   162: bipush          58
        //   164: aaload         
        //   165: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   168: aload           10
        //   170: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   173: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   176: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   179: athrow         
        //   180: astore          34
        //   182: aload           34
        //   184: athrow         
        //   185: astore          13
        //   187: aload           13
        //   189: athrow         
        //   190: astore          35
        //   192: aload           35
        //   194: athrow         
        //   195: iconst_0       
        //   196: istore          15
        //   198: goto            121
        //   201: iload           11
        //   203: iconst_m1      
        //   204: if_icmpeq       524
        //   207: aload_0        
        //   208: iload           11
        //   210: invokevirtual   android/support/v4/app/FragmentManagerImpl.findFragmentById:(I)Landroid/support/v4/app/Fragment;
        //   213: astore          33
        //   215: aload           33
        //   217: astore          16
        //   219: aload           16
        //   221: ifnonnull       237
        //   224: aload           12
        //   226: ifnull          237
        //   229: aload_0        
        //   230: aload           12
        //   232: invokevirtual   android/support/v4/app/FragmentManagerImpl.findFragmentByTag:(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
        //   235: astore          16
        //   237: aload           16
        //   239: ifnonnull       256
        //   242: iload           15
        //   244: iconst_m1      
        //   245: if_icmpeq       256
        //   248: aload_0        
        //   249: iload           15
        //   251: invokevirtual   android/support/v4/app/FragmentManagerImpl.findFragmentById:(I)Landroid/support/v4/app/Fragment;
        //   254: astore          16
        //   256: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   259: ifeq            327
        //   262: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   265: bipush          64
        //   267: aaload         
        //   268: new             Ljava/lang/StringBuilder;
        //   271: dup            
        //   272: invokespecial   java/lang/StringBuilder.<init>:()V
        //   275: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   278: bipush          57
        //   280: aaload         
        //   281: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   284: iload           11
        //   286: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   289: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   292: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   295: bipush          63
        //   297: aaload         
        //   298: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   301: aload           10
        //   303: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   306: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   309: bipush          59
        //   311: aaload         
        //   312: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   315: aload           16
        //   317: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   320: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   323: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   326: pop            
        //   327: aload           16
        //   329: ifnonnull       416
        //   332: aload_3        
        //   333: aload           10
        //   335: invokestatic    android/support/v4/app/Fragment.instantiate:(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v4/app/Fragment;
        //   338: astore          16
        //   340: aload           16
        //   342: iconst_1       
        //   343: putfield        android/support/v4/app/Fragment.mFromLayout:Z
        //   346: iload           11
        //   348: ifeq            540
        //   351: iload           11
        //   353: istore          29
        //   355: aload           16
        //   357: iload           29
        //   359: putfield        android/support/v4/app/Fragment.mFragmentId:I
        //   362: aload           16
        //   364: iload           15
        //   366: putfield        android/support/v4/app/Fragment.mContainerId:I
        //   369: aload           16
        //   371: aload           12
        //   373: putfield        android/support/v4/app/Fragment.mTag:Ljava/lang/String;
        //   376: aload           16
        //   378: iconst_1       
        //   379: putfield        android/support/v4/app/Fragment.mInLayout:Z
        //   382: aload           16
        //   384: aload_0        
        //   385: putfield        android/support/v4/app/Fragment.mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   388: aload           16
        //   390: aload_0        
        //   391: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   394: aload           4
        //   396: aload           16
        //   398: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //   401: invokevirtual   android/support/v4/app/Fragment.onInflate:(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
        //   404: aload_0        
        //   405: aload           16
        //   407: iconst_1       
        //   408: invokevirtual   android/support/v4/app/FragmentManagerImpl.addFragment:(Landroid/support/v4/app/Fragment;Z)V
        //   411: iload           5
        //   413: ifeq            582
        //   416: aload           16
        //   418: getfield        android/support/v4/app/Fragment.mInLayout:Z
        //   421: ifeq            552
        //   424: new             Ljava/lang/IllegalArgumentException;
        //   427: dup            
        //   428: new             Ljava/lang/StringBuilder;
        //   431: dup            
        //   432: invokespecial   java/lang/StringBuilder.<init>:()V
        //   435: aload           4
        //   437: invokeinterface android/util/AttributeSet.getPositionDescription:()Ljava/lang/String;
        //   442: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   445: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   448: bipush          55
        //   450: aaload         
        //   451: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   454: iload           11
        //   456: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   459: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   462: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   465: bipush          53
        //   467: aaload         
        //   468: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   471: aload           12
        //   473: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   476: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   479: bipush          61
        //   481: aaload         
        //   482: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   485: iload           15
        //   487: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   490: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   493: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   496: bipush          60
        //   498: aaload         
        //   499: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   502: aload           10
        //   504: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   507: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   510: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   513: athrow         
        //   514: astore          18
        //   516: aload           18
        //   518: athrow         
        //   519: astore          32
        //   521: aload           32
        //   523: athrow         
        //   524: aconst_null    
        //   525: astore          16
        //   527: goto            219
        //   530: astore          17
        //   532: aload           17
        //   534: athrow         
        //   535: astore          28
        //   537: aload           28
        //   539: athrow         
        //   540: iload           15
        //   542: istore          29
        //   544: goto            355
        //   547: astore          30
        //   549: aload           30
        //   551: athrow         
        //   552: aload           16
        //   554: iconst_1       
        //   555: putfield        android/support/v4/app/Fragment.mInLayout:Z
        //   558: aload           16
        //   560: getfield        android/support/v4/app/Fragment.mRetaining:Z
        //   563: ifne            582
        //   566: aload           16
        //   568: aload_0        
        //   569: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   572: aload           4
        //   574: aload           16
        //   576: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //   579: invokevirtual   android/support/v4/app/Fragment.onInflate:(Landroid/app/Activity;Landroid/util/AttributeSet;Landroid/os/Bundle;)V
        //   582: aload_0        
        //   583: getfield        android/support/v4/app/FragmentManagerImpl.mCurState:I
        //   586: istore          23
        //   588: iload           23
        //   590: iconst_1       
        //   591: if_icmpge       621
        //   594: aload           16
        //   596: getfield        android/support/v4/app/Fragment.mFromLayout:Z
        //   599: istore          27
        //   601: iload           27
        //   603: ifeq            621
        //   606: aload_0        
        //   607: aload           16
        //   609: iconst_1       
        //   610: iconst_0       
        //   611: iconst_0       
        //   612: iconst_0       
        //   613: invokevirtual   android/support/v4/app/FragmentManagerImpl.moveToState:(Landroid/support/v4/app/Fragment;IIIZ)V
        //   616: iload           5
        //   618: ifeq            627
        //   621: aload_0        
        //   622: aload           16
        //   624: invokevirtual   android/support/v4/app/FragmentManagerImpl.moveToState:(Landroid/support/v4/app/Fragment;)V
        //   627: aload           16
        //   629: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   632: ifnonnull       701
        //   635: new             Ljava/lang/IllegalStateException;
        //   638: dup            
        //   639: new             Ljava/lang/StringBuilder;
        //   642: dup            
        //   643: invokespecial   java/lang/StringBuilder.<init>:()V
        //   646: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   649: bipush          62
        //   651: aaload         
        //   652: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   655: aload           10
        //   657: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   660: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   663: bipush          54
        //   665: aaload         
        //   666: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   669: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   672: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   675: athrow         
        //   676: astore          24
        //   678: aload           24
        //   680: athrow         
        //   681: astore          19
        //   683: aload           19
        //   685: athrow         
        //   686: astore          20
        //   688: aload           20
        //   690: athrow         
        //   691: astore          21
        //   693: aload           21
        //   695: athrow         
        //   696: astore          22
        //   698: aload           22
        //   700: athrow         
        //   701: iload           11
        //   703: ifeq            716
        //   706: aload           16
        //   708: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   711: iload           11
        //   713: invokevirtual   android/view/View.setId:(I)V
        //   716: aload           16
        //   718: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   721: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //   724: ifnonnull       737
        //   727: aload           16
        //   729: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   732: aload           12
        //   734: invokevirtual   android/view/View.setTag:(Ljava/lang/Object;)V
        //   737: aload           16
        //   739: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   742: areturn        
        //   743: astore          26
        //   745: aload           26
        //   747: athrow         
        //   748: astore          25
        //   750: aload           25
        //   752: athrow         
        //   753: aload           8
        //   755: astore          10
        //   757: goto            69
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  5      17     24     29     Ljava/lang/IllegalArgumentException;
        //  86     102    185    190    Ljava/lang/IllegalArgumentException;
        //  111    117    190    195    Ljava/lang/IllegalArgumentException;
        //  138    180    180    185    Ljava/lang/IllegalArgumentException;
        //  207    215    519    524    Ljava/lang/IllegalArgumentException;
        //  256    327    530    535    Ljava/lang/IllegalArgumentException;
        //  340    346    535    540    Ljava/lang/IllegalArgumentException;
        //  355    411    547    552    Ljava/lang/IllegalArgumentException;
        //  416    514    514    519    Ljava/lang/IllegalArgumentException;
        //  549    552    514    519    Ljava/lang/IllegalArgumentException;
        //  552    582    681    686    Ljava/lang/IllegalArgumentException;
        //  582    588    686    691    Ljava/lang/IllegalArgumentException;
        //  594    601    691    696    Ljava/lang/IllegalArgumentException;
        //  606    616    696    701    Ljava/lang/IllegalArgumentException;
        //  621    627    696    701    Ljava/lang/IllegalArgumentException;
        //  627    676    676    681    Ljava/lang/IllegalArgumentException;
        //  688    691    691    696    Ljava/lang/IllegalArgumentException;
        //  693    696    696    701    Ljava/lang/IllegalArgumentException;
        //  706    716    743    748    Ljava/lang/IllegalArgumentException;
        //  716    737    748    753    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 351, Size: 351
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void performPendingDeferredStart(final Fragment fragment) {
        Label_0030: {
            try {
                if (!fragment.mDeferStart) {
                    return;
                }
                final FragmentManagerImpl fragmentManagerImpl = this;
                final boolean b = fragmentManagerImpl.mExecutingActions;
                if (b) {
                    final FragmentManagerImpl fragmentManagerImpl2 = this;
                    final boolean b2 = true;
                    fragmentManagerImpl2.mHavePendingDeferredStart = b2;
                    return;
                }
                break Label_0030;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                final FragmentManagerImpl fragmentManagerImpl = this;
                final boolean b = fragmentManagerImpl.mExecutingActions;
                if (b) {
                    final FragmentManagerImpl fragmentManagerImpl2 = this;
                    final boolean b2 = true;
                    fragmentManagerImpl2.mHavePendingDeferredStart = b2;
                    return;
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        fragment.mDeferStart = false;
        this.moveToState(fragment, this.mCurState, 0, 0, false);
    }
    
    @Override
    public void popBackStack(final int n, final int n2) {
        if (n < 0) {
            try {
                throw new IllegalArgumentException(FragmentManagerImpl.z[85] + n);
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
        this.enqueueAction(new FragmentManagerImpl$4(this, n, n2), false);
    }
    
    public boolean popBackStackImmediate() {
        this.checkStateLoss();
        this.executePendingTransactions();
        return this.popBackStackState(this.mActivity.mHandler, null, -1, 0);
    }
    
    boolean popBackStackState(final Handler p0, final String p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: aload_0        
        //     6: getfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //     9: astore          7
        //    11: aload           7
        //    13: ifnonnull       23
        //    16: iconst_0       
        //    17: ireturn        
        //    18: astore          6
        //    20: aload           6
        //    22: athrow         
        //    23: aload_2        
        //    24: ifnonnull       118
        //    27: iload_3        
        //    28: ifge            118
        //    31: iload           4
        //    33: iconst_1       
        //    34: iand           
        //    35: ifne            118
        //    38: iconst_m1      
        //    39: aload_0        
        //    40: getfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //    43: invokevirtual   java/util/ArrayList.size:()I
        //    46: iadd           
        //    47: istore          45
        //    49: iload           45
        //    51: ifge            56
        //    54: iconst_0       
        //    55: ireturn        
        //    56: aload_0        
        //    57: getfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //    60: iload           45
        //    62: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //    65: checkcast       Landroid/support/v4/app/BackStackRecord;
        //    68: astore          46
        //    70: new             Landroid/util/SparseArray;
        //    73: dup            
        //    74: invokespecial   android/util/SparseArray.<init>:()V
        //    77: astore          47
        //    79: new             Landroid/util/SparseArray;
        //    82: dup            
        //    83: invokespecial   android/util/SparseArray.<init>:()V
        //    86: astore          48
        //    88: aload           46
        //    90: aload           47
        //    92: aload           48
        //    94: invokevirtual   android/support/v4/app/BackStackRecord.calculateBackFragments:(Landroid/util/SparseArray;Landroid/util/SparseArray;)V
        //    97: aload           46
        //    99: iconst_1       
        //   100: aconst_null    
        //   101: aload           47
        //   103: aload           48
        //   105: invokevirtual   android/support/v4/app/BackStackRecord.popFromBackStack:(ZLandroid/support/v4/app/BackStackRecord$TransitionState;Landroid/util/SparseArray;Landroid/util/SparseArray;)Landroid/support/v4/app/BackStackRecord$TransitionState;
        //   108: pop            
        //   109: aload_0        
        //   110: invokevirtual   android/support/v4/app/FragmentManagerImpl.reportBackStackChanged:()V
        //   113: iload           5
        //   115: ifeq            600
        //   118: iconst_m1      
        //   119: istore          8
        //   121: aload_2        
        //   122: ifnonnull       129
        //   125: iload_3        
        //   126: iflt            643
        //   129: iconst_m1      
        //   130: aload_0        
        //   131: getfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //   134: invokevirtual   java/util/ArrayList.size:()I
        //   137: iadd           
        //   138: istore          9
        //   140: iload           9
        //   142: iflt            657
        //   145: aload_0        
        //   146: getfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //   149: iload           9
        //   151: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   154: checkcast       Landroid/support/v4/app/BackStackRecord;
        //   157: astore          37
        //   159: aload_2        
        //   160: ifnull          184
        //   163: aload_2        
        //   164: aload           37
        //   166: invokevirtual   android/support/v4/app/BackStackRecord.getName:()Ljava/lang/String;
        //   169: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   172: istore          44
        //   174: iload           44
        //   176: ifeq            184
        //   179: iload           5
        //   181: ifeq            657
        //   184: iload_3        
        //   185: iflt            206
        //   188: aload           37
        //   190: getfield        android/support/v4/app/BackStackRecord.mIndex:I
        //   193: istore          40
        //   195: iload_3        
        //   196: iload           40
        //   198: if_icmpne       206
        //   201: iload           5
        //   203: ifeq            657
        //   206: iload           9
        //   208: iconst_1       
        //   209: isub           
        //   210: istore          8
        //   212: iload           5
        //   214: ifeq            650
        //   217: iload           8
        //   219: ifge            249
        //   222: iconst_0       
        //   223: ireturn        
        //   224: astore          41
        //   226: aload           41
        //   228: athrow         
        //   229: astore          42
        //   231: aload           42
        //   233: athrow         
        //   234: astore          43
        //   236: aload           43
        //   238: athrow         
        //   239: astore          38
        //   241: aload           38
        //   243: athrow         
        //   244: astore          39
        //   246: aload           39
        //   248: athrow         
        //   249: iload           4
        //   251: iconst_1       
        //   252: iand           
        //   253: ifeq            643
        //   256: iload           8
        //   258: iconst_1       
        //   259: isub           
        //   260: istore          10
        //   262: iload           10
        //   264: iflt            333
        //   267: aload_0        
        //   268: getfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //   271: iload           10
        //   273: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   276: checkcast       Landroid/support/v4/app/BackStackRecord;
        //   279: astore          30
        //   281: aload_2        
        //   282: ifnull          301
        //   285: aload_2        
        //   286: aload           30
        //   288: invokevirtual   android/support/v4/app/BackStackRecord.getName:()Ljava/lang/String;
        //   291: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   294: istore          36
        //   296: iload           36
        //   298: ifne            318
        //   301: iload_3        
        //   302: iflt            333
        //   305: aload           30
        //   307: getfield        android/support/v4/app/BackStackRecord.mIndex:I
        //   310: istore          32
        //   312: iload_3        
        //   313: iload           32
        //   315: if_icmpne       333
        //   318: iload           10
        //   320: iconst_1       
        //   321: isub           
        //   322: istore          33
        //   324: iload           5
        //   326: ifeq            636
        //   329: iload           33
        //   331: istore          10
        //   333: aload_0        
        //   334: getfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //   337: invokevirtual   java/util/ArrayList.size:()I
        //   340: istore          12
        //   342: iload           10
        //   344: iload           12
        //   346: iconst_1       
        //   347: isub           
        //   348: if_icmpne       373
        //   351: iconst_0       
        //   352: ireturn        
        //   353: astore          34
        //   355: aload           34
        //   357: athrow         
        //   358: astore          35
        //   360: aload           35
        //   362: athrow         
        //   363: astore          31
        //   365: aload           31
        //   367: athrow         
        //   368: astore          11
        //   370: aload           11
        //   372: athrow         
        //   373: new             Ljava/util/ArrayList;
        //   376: dup            
        //   377: invokespecial   java/util/ArrayList.<init>:()V
        //   380: astore          13
        //   382: iconst_m1      
        //   383: aload_0        
        //   384: getfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //   387: invokevirtual   java/util/ArrayList.size:()I
        //   390: iadd           
        //   391: istore          14
        //   393: iload           14
        //   395: iload           10
        //   397: if_icmple       423
        //   400: aload           13
        //   402: aload_0        
        //   403: getfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //   406: iload           14
        //   408: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //   411: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   414: pop            
        //   415: iinc            14, -1
        //   418: iload           5
        //   420: ifeq            393
        //   423: iconst_m1      
        //   424: aload           13
        //   426: invokevirtual   java/util/ArrayList.size:()I
        //   429: iadd           
        //   430: istore          15
        //   432: new             Landroid/util/SparseArray;
        //   435: dup            
        //   436: invokespecial   android/util/SparseArray.<init>:()V
        //   439: astore          16
        //   441: new             Landroid/util/SparseArray;
        //   444: dup            
        //   445: invokespecial   android/util/SparseArray.<init>:()V
        //   448: astore          17
        //   450: iconst_0       
        //   451: istore          18
        //   453: iload           18
        //   455: iload           15
        //   457: if_icmpgt       488
        //   460: aload           13
        //   462: iload           18
        //   464: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   467: checkcast       Landroid/support/v4/app/BackStackRecord;
        //   470: aload           16
        //   472: aload           17
        //   474: invokevirtual   android/support/v4/app/BackStackRecord.calculateBackFragments:(Landroid/util/SparseArray;Landroid/util/SparseArray;)V
        //   477: iload           18
        //   479: iconst_1       
        //   480: iadd           
        //   481: istore          28
        //   483: iload           5
        //   485: ifeq            629
        //   488: iconst_0       
        //   489: istore          19
        //   491: aconst_null    
        //   492: astore          20
        //   494: iload           19
        //   496: iload           15
        //   498: if_icmpgt       596
        //   501: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   504: ifeq            548
        //   507: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   510: sipush          158
        //   513: aaload         
        //   514: new             Ljava/lang/StringBuilder;
        //   517: dup            
        //   518: invokespecial   java/lang/StringBuilder.<init>:()V
        //   521: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   524: sipush          159
        //   527: aaload         
        //   528: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   531: aload           13
        //   533: iload           19
        //   535: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   538: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   541: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   544: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   547: pop            
        //   548: aload           13
        //   550: iload           19
        //   552: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   555: checkcast       Landroid/support/v4/app/BackStackRecord;
        //   558: astore          23
        //   560: iload           19
        //   562: iload           15
        //   564: if_icmpne       612
        //   567: iconst_1       
        //   568: istore          24
        //   570: aload           23
        //   572: iload           24
        //   574: aload           20
        //   576: aload           16
        //   578: aload           17
        //   580: invokevirtual   android/support/v4/app/BackStackRecord.popFromBackStack:(ZLandroid/support/v4/app/BackStackRecord$TransitionState;Landroid/util/SparseArray;Landroid/util/SparseArray;)Landroid/support/v4/app/BackStackRecord$TransitionState;
        //   583: astore          25
        //   585: iload           19
        //   587: iconst_1       
        //   588: iadd           
        //   589: istore          26
        //   591: iload           5
        //   593: ifeq            618
        //   596: aload_0        
        //   597: invokevirtual   android/support/v4/app/FragmentManagerImpl.reportBackStackChanged:()V
        //   600: iconst_1       
        //   601: ireturn        
        //   602: astore          21
        //   604: aload           21
        //   606: athrow         
        //   607: astore          22
        //   609: aload           22
        //   611: athrow         
        //   612: iconst_0       
        //   613: istore          24
        //   615: goto            570
        //   618: iload           26
        //   620: istore          19
        //   622: aload           25
        //   624: astore          20
        //   626: goto            494
        //   629: iload           28
        //   631: istore          18
        //   633: goto            453
        //   636: iload           33
        //   638: istore          10
        //   640: goto            262
        //   643: iload           8
        //   645: istore          10
        //   647: goto            333
        //   650: iload           8
        //   652: istore          9
        //   654: goto            140
        //   657: iload           9
        //   659: istore          8
        //   661: goto            217
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  5      11     18     23     Ljava/lang/IllegalArgumentException;
        //  163    174    224    239    Ljava/lang/IllegalArgumentException;
        //  188    195    239    249    Ljava/lang/IllegalArgumentException;
        //  226    229    229    239    Ljava/lang/IllegalArgumentException;
        //  231    234    234    239    Ljava/lang/IllegalArgumentException;
        //  236    239    239    249    Ljava/lang/IllegalArgumentException;
        //  241    244    244    249    Ljava/lang/IllegalArgumentException;
        //  285    296    353    363    Ljava/lang/IllegalArgumentException;
        //  305    312    363    368    Ljava/lang/IllegalArgumentException;
        //  333    342    368    373    Ljava/lang/IllegalArgumentException;
        //  355    358    358    363    Ljava/lang/IllegalArgumentException;
        //  360    363    363    368    Ljava/lang/IllegalArgumentException;
        //  501    548    602    607    Ljava/lang/IllegalArgumentException;
        //  548    560    607    612    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 325, Size: 325
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void putFragment(final Bundle bundle, final String s, final Fragment fragment) {
        try {
            if (fragment.mIndex < 0) {
                this.throwException(new IllegalStateException(FragmentManagerImpl.z[19] + fragment + FragmentManagerImpl.z[20]));
            }
            bundle.putInt(s, fragment.mIndex);
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void removeFragment(final Fragment p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //     3: ifeq            58
        //     6: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //     9: sipush          185
        //    12: aaload         
        //    13: new             Ljava/lang/StringBuilder;
        //    16: dup            
        //    17: invokespecial   java/lang/StringBuilder.<init>:()V
        //    20: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    23: sipush          186
        //    26: aaload         
        //    27: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    30: aload_1        
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    34: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    37: sipush          184
        //    40: aaload         
        //    41: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    44: aload_1        
        //    45: getfield        android/support/v4/app/Fragment.mBackStackNesting:I
        //    48: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    51: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    54: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    57: pop            
        //    58: aload_1        
        //    59: invokevirtual   android/support/v4/app/Fragment.isInBackStack:()Z
        //    62: istore          6
        //    64: iload           6
        //    66: ifne            166
        //    69: iconst_1       
        //    70: istore          7
        //    72: aload_1        
        //    73: getfield        android/support/v4/app/Fragment.mDetached:Z
        //    76: istore          11
        //    78: iload           11
        //    80: ifeq            88
        //    83: iload           7
        //    85: ifeq            155
        //    88: aload_0        
        //    89: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //    92: ifnull          104
        //    95: aload_0        
        //    96: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //    99: aload_1        
        //   100: invokevirtual   java/util/ArrayList.remove:(Ljava/lang/Object;)Z
        //   103: pop            
        //   104: aload_1        
        //   105: getfield        android/support/v4/app/Fragment.mHasMenu:Z
        //   108: istore          14
        //   110: iload           14
        //   112: ifeq            127
        //   115: aload_1        
        //   116: getfield        android/support/v4/app/Fragment.mMenuVisible:Z
        //   119: ifeq            127
        //   122: aload_0        
        //   123: iconst_1       
        //   124: putfield        android/support/v4/app/FragmentManagerImpl.mNeedMenuInvalidate:Z
        //   127: aload_1        
        //   128: iconst_0       
        //   129: putfield        android/support/v4/app/Fragment.mAdded:Z
        //   132: aload_1        
        //   133: iconst_1       
        //   134: putfield        android/support/v4/app/Fragment.mRemoving:Z
        //   137: iload           7
        //   139: ifeq            202
        //   142: iconst_0       
        //   143: istore          16
        //   145: aload_0        
        //   146: aload_1        
        //   147: iload           16
        //   149: iload_2        
        //   150: iload_3        
        //   151: iconst_0       
        //   152: invokevirtual   android/support/v4/app/FragmentManagerImpl.moveToState:(Landroid/support/v4/app/Fragment;IIIZ)V
        //   155: return         
        //   156: astore          4
        //   158: aload           4
        //   160: athrow         
        //   161: astore          5
        //   163: aload           5
        //   165: athrow         
        //   166: iconst_0       
        //   167: istore          7
        //   169: goto            72
        //   172: astore          8
        //   174: aload           8
        //   176: athrow         
        //   177: astore          9
        //   179: aload           9
        //   181: athrow         
        //   182: astore          10
        //   184: aload           10
        //   186: athrow         
        //   187: astore          12
        //   189: aload           12
        //   191: athrow         
        //   192: astore          13
        //   194: aload           13
        //   196: athrow         
        //   197: astore          15
        //   199: aload           15
        //   201: athrow         
        //   202: iconst_1       
        //   203: istore          16
        //   205: goto            145
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      58     156    161    Ljava/lang/IllegalArgumentException;
        //  58     64     161    166    Ljava/lang/IllegalArgumentException;
        //  72     78     172    182    Ljava/lang/IllegalArgumentException;
        //  88     104    182    187    Ljava/lang/IllegalArgumentException;
        //  104    110    187    192    Ljava/lang/IllegalArgumentException;
        //  115    127    192    197    Ljava/lang/IllegalArgumentException;
        //  127    137    197    202    Ljava/lang/IllegalArgumentException;
        //  174    177    177    182    Ljava/lang/IllegalArgumentException;
        //  179    182    182    187    Ljava/lang/IllegalArgumentException;
        //  189    192    192    197    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 105, Size: 105
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    void reportBackStackChanged() {
        final int a = Fragment.a;
        if (this.mBackStackChangeListeners != null) {
            int n;
            for (int i = 0; i < this.mBackStackChangeListeners.size(); i = n) {
                ((FragmentManager$OnBackStackChangedListener)this.mBackStackChangeListeners.get(i)).onBackStackChanged();
                n = i + 1;
                if (a != 0) {
                    break;
                }
            }
        }
    }
    
    void restoreAllState(final Parcelable p0, final ArrayList p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_1        
        //     5: ifnonnull       9
        //     8: return         
        //     9: aload_1        
        //    10: checkcast       Landroid/support/v4/app/FragmentManagerState;
        //    13: astore          4
        //    15: aload           4
        //    17: getfield        android/support/v4/app/FragmentManagerState.mActive:[Landroid/support/v4/app/FragmentState;
        //    20: astore          6
        //    22: aload           6
        //    24: ifnull          8
        //    27: aload_2        
        //    28: ifnull          208
        //    31: iconst_0       
        //    32: istore          46
        //    34: iload           46
        //    36: aload_2        
        //    37: invokevirtual   java/util/ArrayList.size:()I
        //    40: if_icmpge       208
        //    43: aload_2        
        //    44: iload           46
        //    46: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    49: checkcast       Landroid/support/v4/app/Fragment;
        //    52: astore          47
        //    54: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //    57: ifeq            96
        //    60: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    63: sipush          131
        //    66: aaload         
        //    67: new             Ljava/lang/StringBuilder;
        //    70: dup            
        //    71: invokespecial   java/lang/StringBuilder.<init>:()V
        //    74: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    77: sipush          137
        //    80: aaload         
        //    81: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    84: aload           47
        //    86: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    89: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    92: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    95: pop            
        //    96: aload           4
        //    98: getfield        android/support/v4/app/FragmentManagerState.mActive:[Landroid/support/v4/app/FragmentState;
        //   101: aload           47
        //   103: getfield        android/support/v4/app/Fragment.mIndex:I
        //   106: aaload         
        //   107: astore          49
        //   109: aload           49
        //   111: aload           47
        //   113: putfield        android/support/v4/app/FragmentState.mInstance:Landroid/support/v4/app/Fragment;
        //   116: aload           47
        //   118: aconst_null    
        //   119: putfield        android/support/v4/app/Fragment.mSavedViewState:Landroid/util/SparseArray;
        //   122: aload           47
        //   124: iconst_0       
        //   125: putfield        android/support/v4/app/Fragment.mBackStackNesting:I
        //   128: aload           47
        //   130: iconst_0       
        //   131: putfield        android/support/v4/app/Fragment.mInLayout:Z
        //   134: aload           47
        //   136: iconst_0       
        //   137: putfield        android/support/v4/app/Fragment.mAdded:Z
        //   140: aload           47
        //   142: aconst_null    
        //   143: putfield        android/support/v4/app/Fragment.mTarget:Landroid/support/v4/app/Fragment;
        //   146: aload           49
        //   148: getfield        android/support/v4/app/FragmentState.mSavedFragmentState:Landroid/os/Bundle;
        //   151: ifnull          198
        //   154: aload           49
        //   156: getfield        android/support/v4/app/FragmentState.mSavedFragmentState:Landroid/os/Bundle;
        //   159: aload_0        
        //   160: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   163: invokevirtual   android/support/v4/app/FragmentActivity.getClassLoader:()Ljava/lang/ClassLoader;
        //   166: invokevirtual   android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
        //   169: aload           47
        //   171: aload           49
        //   173: getfield        android/support/v4/app/FragmentState.mSavedFragmentState:Landroid/os/Bundle;
        //   176: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   179: bipush          117
        //   181: aaload         
        //   182: invokevirtual   android/os/Bundle.getSparseParcelableArray:(Ljava/lang/String;)Landroid/util/SparseArray;
        //   185: putfield        android/support/v4/app/Fragment.mSavedViewState:Landroid/util/SparseArray;
        //   188: aload           47
        //   190: aload           49
        //   192: getfield        android/support/v4/app/FragmentState.mSavedFragmentState:Landroid/os/Bundle;
        //   195: putfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //   198: iload           46
        //   200: iconst_1       
        //   201: iadd           
        //   202: istore          51
        //   204: iload_3        
        //   205: ifeq            1130
        //   208: aload_0        
        //   209: new             Ljava/util/ArrayList;
        //   212: dup            
        //   213: aload           4
        //   215: getfield        android/support/v4/app/FragmentManagerState.mActive:[Landroid/support/v4/app/FragmentState;
        //   218: arraylength    
        //   219: invokespecial   java/util/ArrayList.<init>:(I)V
        //   222: putfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //   225: aload_0        
        //   226: getfield        android/support/v4/app/FragmentManagerImpl.mAvailIndices:Ljava/util/ArrayList;
        //   229: ifnull          239
        //   232: aload_0        
        //   233: getfield        android/support/v4/app/FragmentManagerImpl.mAvailIndices:Ljava/util/ArrayList;
        //   236: invokevirtual   java/util/ArrayList.clear:()V
        //   239: iconst_0       
        //   240: istore          8
        //   242: iload           8
        //   244: aload           4
        //   246: getfield        android/support/v4/app/FragmentManagerState.mActive:[Landroid/support/v4/app/FragmentState;
        //   249: arraylength    
        //   250: if_icmpge       445
        //   253: aload           4
        //   255: getfield        android/support/v4/app/FragmentManagerState.mActive:[Landroid/support/v4/app/FragmentState;
        //   258: iload           8
        //   260: aaload         
        //   261: astore          35
        //   263: aload           35
        //   265: ifnull          357
        //   268: aload           35
        //   270: aload_0        
        //   271: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   274: aload_0        
        //   275: getfield        android/support/v4/app/FragmentManagerImpl.mParent:Landroid/support/v4/app/Fragment;
        //   278: invokevirtual   android/support/v4/app/FragmentState.instantiate:(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment;
        //   281: astore          41
        //   283: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   286: ifeq            337
        //   289: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   292: bipush          127
        //   294: aaload         
        //   295: new             Ljava/lang/StringBuilder;
        //   298: dup            
        //   299: invokespecial   java/lang/StringBuilder.<init>:()V
        //   302: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   305: bipush          121
        //   307: aaload         
        //   308: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   311: iload           8
        //   313: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   316: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   319: bipush          119
        //   321: aaload         
        //   322: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   325: aload           41
        //   327: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   330: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   333: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   336: pop            
        //   337: aload_0        
        //   338: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //   341: aload           41
        //   343: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   346: pop            
        //   347: aload           35
        //   349: aconst_null    
        //   350: putfield        android/support/v4/app/FragmentState.mInstance:Landroid/support/v4/app/Fragment;
        //   353: iload_3        
        //   354: ifeq            438
        //   357: aload_0        
        //   358: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //   361: aconst_null    
        //   362: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   365: pop            
        //   366: aload_0        
        //   367: getfield        android/support/v4/app/FragmentManagerImpl.mAvailIndices:Ljava/util/ArrayList;
        //   370: ifnonnull       384
        //   373: aload_0        
        //   374: new             Ljava/util/ArrayList;
        //   377: dup            
        //   378: invokespecial   java/util/ArrayList.<init>:()V
        //   381: putfield        android/support/v4/app/FragmentManagerImpl.mAvailIndices:Ljava/util/ArrayList;
        //   384: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   387: ifeq            425
        //   390: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   393: bipush          125
        //   395: aaload         
        //   396: new             Ljava/lang/StringBuilder;
        //   399: dup            
        //   400: invokespecial   java/lang/StringBuilder.<init>:()V
        //   403: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   406: sipush          135
        //   409: aaload         
        //   410: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   413: iload           8
        //   415: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   418: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   421: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   424: pop            
        //   425: aload_0        
        //   426: getfield        android/support/v4/app/FragmentManagerImpl.mAvailIndices:Ljava/util/ArrayList;
        //   429: iload           8
        //   431: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   434: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   437: pop            
        //   438: iinc            8, 1
        //   441: iload_3        
        //   442: ifeq            242
        //   445: aload_2        
        //   446: ifnull          599
        //   449: iconst_0       
        //   450: istore          25
        //   452: iload           25
        //   454: aload_2        
        //   455: invokevirtual   java/util/ArrayList.size:()I
        //   458: if_icmpge       599
        //   461: aload_2        
        //   462: iload           25
        //   464: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   467: checkcast       Landroid/support/v4/app/Fragment;
        //   470: astore          26
        //   472: aload           26
        //   474: getfield        android/support/v4/app/Fragment.mTargetIndex:I
        //   477: istore          30
        //   479: iload           30
        //   481: iflt            589
        //   484: aload           26
        //   486: getfield        android/support/v4/app/Fragment.mTargetIndex:I
        //   489: istore          32
        //   491: aload_0        
        //   492: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //   495: invokevirtual   java/util/ArrayList.size:()I
        //   498: istore          33
        //   500: iload           32
        //   502: iload           33
        //   504: if_icmpge       531
        //   507: aload           26
        //   509: aload_0        
        //   510: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //   513: aload           26
        //   515: getfield        android/support/v4/app/Fragment.mTargetIndex:I
        //   518: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   521: checkcast       Landroid/support/v4/app/Fragment;
        //   524: putfield        android/support/v4/app/Fragment.mTarget:Landroid/support/v4/app/Fragment;
        //   527: iload_3        
        //   528: ifeq            589
        //   531: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   534: sipush          128
        //   537: aaload         
        //   538: new             Ljava/lang/StringBuilder;
        //   541: dup            
        //   542: invokespecial   java/lang/StringBuilder.<init>:()V
        //   545: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   548: bipush          118
        //   550: aaload         
        //   551: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   554: aload           26
        //   556: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   559: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   562: bipush          122
        //   564: aaload         
        //   565: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   568: aload           26
        //   570: getfield        android/support/v4/app/Fragment.mTargetIndex:I
        //   573: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   576: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   579: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   582: pop            
        //   583: aload           26
        //   585: aconst_null    
        //   586: putfield        android/support/v4/app/Fragment.mTarget:Landroid/support/v4/app/Fragment;
        //   589: iload           25
        //   591: iconst_1       
        //   592: iadd           
        //   593: istore          31
        //   595: iload_3        
        //   596: ifeq            1123
        //   599: aload           4
        //   601: getfield        android/support/v4/app/FragmentManagerState.mAdded:[I
        //   604: ifnull          886
        //   607: aload_0        
        //   608: new             Ljava/util/ArrayList;
        //   611: dup            
        //   612: aload           4
        //   614: getfield        android/support/v4/app/FragmentManagerState.mAdded:[I
        //   617: arraylength    
        //   618: invokespecial   java/util/ArrayList.<init>:(I)V
        //   621: putfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   624: iconst_0       
        //   625: istore          17
        //   627: iload           17
        //   629: aload           4
        //   631: getfield        android/support/v4/app/FragmentManagerState.mAdded:[I
        //   634: arraylength    
        //   635: if_icmpge       882
        //   638: aload_0        
        //   639: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //   642: aload           4
        //   644: getfield        android/support/v4/app/FragmentManagerState.mAdded:[I
        //   647: iload           17
        //   649: iaload         
        //   650: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   653: checkcast       Landroid/support/v4/app/Fragment;
        //   656: astore          18
        //   658: aload           18
        //   660: ifnonnull       705
        //   663: aload_0        
        //   664: new             Ljava/lang/IllegalStateException;
        //   667: dup            
        //   668: new             Ljava/lang/StringBuilder;
        //   671: dup            
        //   672: invokespecial   java/lang/StringBuilder.<init>:()V
        //   675: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   678: sipush          134
        //   681: aaload         
        //   682: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   685: aload           4
        //   687: getfield        android/support/v4/app/FragmentManagerState.mAdded:[I
        //   690: iload           17
        //   692: iaload         
        //   693: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   696: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   699: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   702: invokespecial   android/support/v4/app/FragmentManagerImpl.throwException:(Ljava/lang/RuntimeException;)V
        //   705: aload           18
        //   707: iconst_1       
        //   708: putfield        android/support/v4/app/Fragment.mAdded:Z
        //   711: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   714: ifeq            766
        //   717: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   720: sipush          130
        //   723: aaload         
        //   724: new             Ljava/lang/StringBuilder;
        //   727: dup            
        //   728: invokespecial   java/lang/StringBuilder.<init>:()V
        //   731: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   734: bipush          120
        //   736: aaload         
        //   737: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   740: iload           17
        //   742: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   745: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   748: bipush          116
        //   750: aaload         
        //   751: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   754: aload           18
        //   756: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   759: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   762: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   765: pop            
        //   766: aload_0        
        //   767: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   770: aload           18
        //   772: invokevirtual   java/util/ArrayList.contains:(Ljava/lang/Object;)Z
        //   775: ifeq            862
        //   778: new             Ljava/lang/IllegalStateException;
        //   781: dup            
        //   782: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   785: bipush          123
        //   787: aaload         
        //   788: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   791: athrow         
        //   792: astore          20
        //   794: aload           20
        //   796: athrow         
        //   797: astore          5
        //   799: aload           5
        //   801: athrow         
        //   802: astore          48
        //   804: aload           48
        //   806: athrow         
        //   807: astore          50
        //   809: aload           50
        //   811: athrow         
        //   812: astore          7
        //   814: aload           7
        //   816: athrow         
        //   817: astore          42
        //   819: aload           42
        //   821: athrow         
        //   822: astore          43
        //   824: aload           43
        //   826: athrow         
        //   827: astore          36
        //   829: aload           36
        //   831: athrow         
        //   832: astore          38
        //   834: aload           38
        //   836: athrow         
        //   837: astore          27
        //   839: aload           27
        //   841: athrow         
        //   842: astore          28
        //   844: aload           28
        //   846: athrow         
        //   847: astore          29
        //   849: aload           29
        //   851: athrow         
        //   852: astore          24
        //   854: aload           24
        //   856: athrow         
        //   857: astore          19
        //   859: aload           19
        //   861: athrow         
        //   862: aload_0        
        //   863: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   866: aload           18
        //   868: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   871: pop            
        //   872: iload           17
        //   874: iconst_1       
        //   875: iadd           
        //   876: istore          22
        //   878: iload_3        
        //   879: ifeq            1116
        //   882: iload_3        
        //   883: ifeq            891
        //   886: aload_0        
        //   887: aconst_null    
        //   888: putfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   891: aload           4
        //   893: getfield        android/support/v4/app/FragmentManagerState.mBackStack:[Landroid/support/v4/app/BackStackState;
        //   896: ifnull          1095
        //   899: aload_0        
        //   900: new             Ljava/util/ArrayList;
        //   903: dup            
        //   904: aload           4
        //   906: getfield        android/support/v4/app/FragmentManagerState.mBackStack:[Landroid/support/v4/app/BackStackState;
        //   909: arraylength    
        //   910: invokespecial   java/util/ArrayList.<init>:(I)V
        //   913: putfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //   916: iconst_0       
        //   917: istore          11
        //   919: iload           11
        //   921: aload           4
        //   923: getfield        android/support/v4/app/FragmentManagerState.mBackStack:[Landroid/support/v4/app/BackStackState;
        //   926: arraylength    
        //   927: if_icmpge       1091
        //   930: aload           4
        //   932: getfield        android/support/v4/app/FragmentManagerState.mBackStack:[Landroid/support/v4/app/BackStackState;
        //   935: iload           11
        //   937: aaload         
        //   938: aload_0        
        //   939: invokevirtual   android/support/v4/app/BackStackState.instantiate:(Landroid/support/v4/app/FragmentManagerImpl;)Landroid/support/v4/app/BackStackRecord;
        //   942: astore          12
        //   944: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   947: ifeq            1055
        //   950: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   953: bipush          124
        //   955: aaload         
        //   956: new             Ljava/lang/StringBuilder;
        //   959: dup            
        //   960: invokespecial   java/lang/StringBuilder.<init>:()V
        //   963: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   966: sipush          129
        //   969: aaload         
        //   970: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   973: iload           11
        //   975: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   978: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   981: sipush          132
        //   984: aaload         
        //   985: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   988: aload           12
        //   990: getfield        android/support/v4/app/BackStackRecord.mIndex:I
        //   993: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   996: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   999: sipush          136
        //  1002: aaload         
        //  1003: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1006: aload           12
        //  1008: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1011: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1014: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //  1017: pop            
        //  1018: new             Ljava/io/PrintWriter;
        //  1021: dup            
        //  1022: new             Landroid/support/v4/util/LogWriter;
        //  1025: dup            
        //  1026: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1029: sipush          133
        //  1032: aaload         
        //  1033: invokespecial   android/support/v4/util/LogWriter.<init>:(Ljava/lang/String;)V
        //  1036: invokespecial   java/io/PrintWriter.<init>:(Ljava/io/Writer;)V
        //  1039: astore          16
        //  1041: aload           12
        //  1043: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //  1046: bipush          126
        //  1048: aaload         
        //  1049: aload           16
        //  1051: iconst_0       
        //  1052: invokevirtual   android/support/v4/app/BackStackRecord.dump:(Ljava/lang/String;Ljava/io/PrintWriter;Z)V
        //  1055: aload_0        
        //  1056: getfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //  1059: aload           12
        //  1061: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1064: pop            
        //  1065: aload           12
        //  1067: getfield        android/support/v4/app/BackStackRecord.mIndex:I
        //  1070: iflt            1084
        //  1073: aload_0        
        //  1074: aload           12
        //  1076: getfield        android/support/v4/app/BackStackRecord.mIndex:I
        //  1079: aload           12
        //  1081: invokevirtual   android/support/v4/app/FragmentManagerImpl.setBackStackIndex:(ILandroid/support/v4/app/BackStackRecord;)V
        //  1084: iinc            11, 1
        //  1087: iload_3        
        //  1088: ifeq            919
        //  1091: iload_3        
        //  1092: ifeq            8
        //  1095: aload_0        
        //  1096: aconst_null    
        //  1097: putfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //  1100: return         
        //  1101: astore          10
        //  1103: aload           10
        //  1105: athrow         
        //  1106: astore          9
        //  1108: aload           9
        //  1110: athrow         
        //  1111: astore          13
        //  1113: aload           13
        //  1115: athrow         
        //  1116: iload           22
        //  1118: istore          17
        //  1120: goto            627
        //  1123: iload           31
        //  1125: istore          25
        //  1127: goto            452
        //  1130: iload           51
        //  1132: istore          46
        //  1134: goto            34
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  15     22     797    802    Ljava/lang/IllegalArgumentException;
        //  54     96     802    807    Ljava/lang/IllegalArgumentException;
        //  109    198    807    812    Ljava/lang/IllegalArgumentException;
        //  208    239    812    817    Ljava/lang/IllegalArgumentException;
        //  283    337    817    822    Ljava/lang/IllegalArgumentException;
        //  337    353    822    827    Ljava/lang/IllegalArgumentException;
        //  357    384    827    832    Ljava/lang/IllegalArgumentException;
        //  384    425    832    837    Ljava/lang/IllegalArgumentException;
        //  472    479    837    842    Ljava/lang/IllegalArgumentException;
        //  484    500    842    847    Ljava/lang/IllegalArgumentException;
        //  507    527    847    852    Ljava/lang/IllegalArgumentException;
        //  531    589    847    852    Ljava/lang/IllegalArgumentException;
        //  663    705    852    857    Ljava/lang/IllegalArgumentException;
        //  705    766    857    862    Ljava/lang/IllegalArgumentException;
        //  766    792    792    797    Ljava/lang/IllegalArgumentException;
        //  824    827    827    832    Ljava/lang/IllegalArgumentException;
        //  839    842    842    847    Ljava/lang/IllegalArgumentException;
        //  844    847    847    852    Ljava/lang/IllegalArgumentException;
        //  886    891    1106   1111   Ljava/lang/IllegalArgumentException;
        //  1055   1084   1111   1116   Ljava/lang/IllegalArgumentException;
        //  1095   1100   1101   1106   Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 525, Size: 525
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    ArrayList retainNonConfig() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //     8: ifnull          184
        //    11: aconst_null    
        //    12: astore_2       
        //    13: iconst_0       
        //    14: istore_3       
        //    15: iload_3        
        //    16: aload_0        
        //    17: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //    20: invokevirtual   java/util/ArrayList.size:()I
        //    23: if_icmpge       155
        //    26: aload_0        
        //    27: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //    30: iload_3        
        //    31: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    34: checkcast       Landroid/support/v4/app/Fragment;
        //    37: astore          4
        //    39: aload           4
        //    41: ifnull          146
        //    44: aload           4
        //    46: getfield        android/support/v4/app/Fragment.mRetainInstance:Z
        //    49: istore          7
        //    51: iload           7
        //    53: ifeq            146
        //    56: aload_2        
        //    57: ifnonnull       68
        //    60: new             Ljava/util/ArrayList;
        //    63: dup            
        //    64: invokespecial   java/util/ArrayList.<init>:()V
        //    67: astore_2       
        //    68: aload_2        
        //    69: aload           4
        //    71: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    74: pop            
        //    75: aload           4
        //    77: iconst_1       
        //    78: putfield        android/support/v4/app/Fragment.mRetaining:Z
        //    81: aload           4
        //    83: getfield        android/support/v4/app/Fragment.mTarget:Landroid/support/v4/app/Fragment;
        //    86: ifnull          167
        //    89: aload           4
        //    91: getfield        android/support/v4/app/Fragment.mTarget:Landroid/support/v4/app/Fragment;
        //    94: getfield        android/support/v4/app/Fragment.mIndex:I
        //    97: istore          10
        //    99: aload           4
        //   101: iload           10
        //   103: putfield        android/support/v4/app/Fragment.mTargetIndex:I
        //   106: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   109: ifeq            146
        //   112: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   115: bipush          22
        //   117: aaload         
        //   118: new             Ljava/lang/StringBuilder;
        //   121: dup            
        //   122: invokespecial   java/lang/StringBuilder.<init>:()V
        //   125: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   128: bipush          23
        //   130: aaload         
        //   131: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   134: aload           4
        //   136: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   139: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   142: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   145: pop            
        //   146: iload_3        
        //   147: iconst_1       
        //   148: iadd           
        //   149: istore          5
        //   151: iload_1        
        //   152: ifeq            178
        //   155: aload_2        
        //   156: areturn        
        //   157: astore          6
        //   159: aload           6
        //   161: athrow         
        //   162: astore          8
        //   164: aload           8
        //   166: athrow         
        //   167: iconst_m1      
        //   168: istore          10
        //   170: goto            99
        //   173: astore          11
        //   175: aload           11
        //   177: athrow         
        //   178: iload           5
        //   180: istore_3       
        //   181: goto            15
        //   184: aconst_null    
        //   185: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  44     51     157    162    Ljava/lang/IllegalArgumentException;
        //  68     99     162    167    Ljava/lang/IllegalArgumentException;
        //  99     146    173    178    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 92, Size: 92
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    Parcelable saveAllState() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_1       
        //     2: getstatic       android/support/v4/app/Fragment.a:I
        //     5: istore_2       
        //     6: aload_0        
        //     7: invokevirtual   android/support/v4/app/FragmentManagerImpl.execPendingActions:()Z
        //    10: pop            
        //    11: getstatic       android/support/v4/app/FragmentManagerImpl.HONEYCOMB:Z
        //    14: ifeq            22
        //    17: aload_0        
        //    18: iconst_1       
        //    19: putfield        android/support/v4/app/FragmentManagerImpl.mStateSaved:Z
        //    22: aload_0        
        //    23: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //    26: astore          7
        //    28: aload           7
        //    30: ifnull          47
        //    33: aload_0        
        //    34: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //    37: invokevirtual   java/util/ArrayList.size:()I
        //    40: istore          8
        //    42: iload           8
        //    44: ifgt            62
        //    47: aconst_null    
        //    48: areturn        
        //    49: astore_3       
        //    50: aload_3        
        //    51: athrow         
        //    52: astore          5
        //    54: aload           5
        //    56: athrow         
        //    57: astore          6
        //    59: aload           6
        //    61: athrow         
        //    62: aload_0        
        //    63: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //    66: invokevirtual   java/util/ArrayList.size:()I
        //    69: istore          9
        //    71: iload           9
        //    73: anewarray       Landroid/support/v4/app/FragmentState;
        //    76: astore          10
        //    78: iconst_0       
        //    79: istore          11
        //    81: iconst_0       
        //    82: istore          12
        //    84: iload           11
        //    86: iload           9
        //    88: if_icmpge       953
        //    91: aload_0        
        //    92: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //    95: iload           11
        //    97: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   100: checkcast       Landroid/support/v4/app/Fragment;
        //   103: astore          30
        //   105: aload           30
        //   107: ifnull          946
        //   110: aload           30
        //   112: getfield        android/support/v4/app/Fragment.mIndex:I
        //   115: ifge            170
        //   118: aload_0        
        //   119: new             Ljava/lang/IllegalStateException;
        //   122: dup            
        //   123: new             Ljava/lang/StringBuilder;
        //   126: dup            
        //   127: invokespecial   java/lang/StringBuilder.<init>:()V
        //   130: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   133: bipush          82
        //   135: aaload         
        //   136: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   139: aload           30
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   144: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   147: bipush          72
        //   149: aaload         
        //   150: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   153: aload           30
        //   155: getfield        android/support/v4/app/Fragment.mIndex:I
        //   158: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   161: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   164: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   167: invokespecial   android/support/v4/app/FragmentManagerImpl.throwException:(Ljava/lang/RuntimeException;)V
        //   170: new             Landroid/support/v4/app/FragmentState;
        //   173: dup            
        //   174: aload           30
        //   176: invokespecial   android/support/v4/app/FragmentState.<init>:(Landroid/support/v4/app/Fragment;)V
        //   179: astore          33
        //   181: aload           10
        //   183: iload           11
        //   185: aload           33
        //   187: aastore        
        //   188: aload           30
        //   190: getfield        android/support/v4/app/Fragment.mState:I
        //   193: istore          38
        //   195: iload           38
        //   197: ifle            373
        //   200: aload           33
        //   202: getfield        android/support/v4/app/FragmentState.mSavedFragmentState:Landroid/os/Bundle;
        //   205: astore          42
        //   207: aload           42
        //   209: ifnonnull       373
        //   212: aload           33
        //   214: aload_0        
        //   215: aload           30
        //   217: invokevirtual   android/support/v4/app/FragmentManagerImpl.saveFragmentBasicState:(Landroid/support/v4/app/Fragment;)Landroid/os/Bundle;
        //   220: putfield        android/support/v4/app/FragmentState.mSavedFragmentState:Landroid/os/Bundle;
        //   223: aload           30
        //   225: getfield        android/support/v4/app/Fragment.mTarget:Landroid/support/v4/app/Fragment;
        //   228: astore          43
        //   230: aload           43
        //   232: ifnull          383
        //   235: aload           30
        //   237: getfield        android/support/v4/app/Fragment.mTarget:Landroid/support/v4/app/Fragment;
        //   240: getfield        android/support/v4/app/Fragment.mIndex:I
        //   243: ifge            298
        //   246: aload_0        
        //   247: new             Ljava/lang/IllegalStateException;
        //   250: dup            
        //   251: new             Ljava/lang/StringBuilder;
        //   254: dup            
        //   255: invokespecial   java/lang/StringBuilder.<init>:()V
        //   258: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   261: bipush          78
        //   263: aaload         
        //   264: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   267: aload           30
        //   269: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   272: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   275: bipush          77
        //   277: aaload         
        //   278: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   281: aload           30
        //   283: getfield        android/support/v4/app/Fragment.mTarget:Landroid/support/v4/app/Fragment;
        //   286: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   289: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   292: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   295: invokespecial   android/support/v4/app/FragmentManagerImpl.throwException:(Ljava/lang/RuntimeException;)V
        //   298: aload           33
        //   300: getfield        android/support/v4/app/FragmentState.mSavedFragmentState:Landroid/os/Bundle;
        //   303: ifnonnull       318
        //   306: aload           33
        //   308: new             Landroid/os/Bundle;
        //   311: dup            
        //   312: invokespecial   android/os/Bundle.<init>:()V
        //   315: putfield        android/support/v4/app/FragmentState.mSavedFragmentState:Landroid/os/Bundle;
        //   318: aload_0        
        //   319: aload           33
        //   321: getfield        android/support/v4/app/FragmentState.mSavedFragmentState:Landroid/os/Bundle;
        //   324: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   327: bipush          80
        //   329: aaload         
        //   330: aload           30
        //   332: getfield        android/support/v4/app/Fragment.mTarget:Landroid/support/v4/app/Fragment;
        //   335: invokevirtual   android/support/v4/app/FragmentManagerImpl.putFragment:(Landroid/os/Bundle;Ljava/lang/String;Landroid/support/v4/app/Fragment;)V
        //   338: aload           30
        //   340: getfield        android/support/v4/app/Fragment.mTargetRequestCode:I
        //   343: istore          46
        //   345: iload           46
        //   347: ifeq            383
        //   350: aload           33
        //   352: getfield        android/support/v4/app/FragmentState.mSavedFragmentState:Landroid/os/Bundle;
        //   355: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   358: bipush          76
        //   360: aaload         
        //   361: aload           30
        //   363: getfield        android/support/v4/app/Fragment.mTargetRequestCode:I
        //   366: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //   369: iload_2        
        //   370: ifeq            383
        //   373: aload           33
        //   375: aload           30
        //   377: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //   380: putfield        android/support/v4/app/FragmentState.mSavedFragmentState:Landroid/os/Bundle;
        //   383: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   386: ifeq            940
        //   389: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   392: bipush          81
        //   394: aaload         
        //   395: new             Ljava/lang/StringBuilder;
        //   398: dup            
        //   399: invokespecial   java/lang/StringBuilder.<init>:()V
        //   402: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   405: bipush          74
        //   407: aaload         
        //   408: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   411: aload           30
        //   413: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   416: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   419: bipush          84
        //   421: aaload         
        //   422: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   425: aload           33
        //   427: getfield        android/support/v4/app/FragmentState.mSavedFragmentState:Landroid/os/Bundle;
        //   430: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   433: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   436: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   439: pop            
        //   440: iconst_1       
        //   441: istore          13
        //   443: iload           11
        //   445: iconst_1       
        //   446: iadd           
        //   447: istore          31
        //   449: iload_2        
        //   450: ifeq            929
        //   453: iload           13
        //   455: ifne            532
        //   458: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   461: ifeq            47
        //   464: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   467: bipush          73
        //   469: aaload         
        //   470: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   473: bipush          67
        //   475: aaload         
        //   476: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   479: pop            
        //   480: aconst_null    
        //   481: areturn        
        //   482: astore          28
        //   484: aload           28
        //   486: athrow         
        //   487: astore          32
        //   489: aload           32
        //   491: athrow         
        //   492: astore          34
        //   494: aload           34
        //   496: athrow         
        //   497: astore          35
        //   499: aload           35
        //   501: athrow         
        //   502: astore          36
        //   504: aload           36
        //   506: athrow         
        //   507: astore          37
        //   509: aload           37
        //   511: athrow         
        //   512: astore          44
        //   514: aload           44
        //   516: athrow         
        //   517: astore          45
        //   519: aload           45
        //   521: athrow         
        //   522: astore          39
        //   524: aload           39
        //   526: athrow         
        //   527: astore          40
        //   529: aload           40
        //   531: athrow         
        //   532: aload_0        
        //   533: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   536: ifnull          923
        //   539: aload_0        
        //   540: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   543: invokevirtual   java/util/ArrayList.size:()I
        //   546: istore          22
        //   548: iload           22
        //   550: ifle            923
        //   553: iload           22
        //   555: newarray        I
        //   557: astore          14
        //   559: iconst_0       
        //   560: istore          23
        //   562: iload           23
        //   564: iload           22
        //   566: if_icmpge       727
        //   569: aload           14
        //   571: iload           23
        //   573: aload_0        
        //   574: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   577: iload           23
        //   579: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   582: checkcast       Landroid/support/v4/app/Fragment;
        //   585: getfield        android/support/v4/app/Fragment.mIndex:I
        //   588: iastore        
        //   589: aload           14
        //   591: iload           23
        //   593: iaload         
        //   594: ifge            656
        //   597: aload_0        
        //   598: new             Ljava/lang/IllegalStateException;
        //   601: dup            
        //   602: new             Ljava/lang/StringBuilder;
        //   605: dup            
        //   606: invokespecial   java/lang/StringBuilder.<init>:()V
        //   609: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   612: bipush          70
        //   614: aaload         
        //   615: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   618: aload_0        
        //   619: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   622: iload           23
        //   624: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   627: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   630: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   633: bipush          66
        //   635: aaload         
        //   636: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   639: aload           14
        //   641: iload           23
        //   643: iaload         
        //   644: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   647: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   650: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   653: invokespecial   android/support/v4/app/FragmentManagerImpl.throwException:(Ljava/lang/RuntimeException;)V
        //   656: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   659: ifeq            717
        //   662: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   665: bipush          68
        //   667: aaload         
        //   668: new             Ljava/lang/StringBuilder;
        //   671: dup            
        //   672: invokespecial   java/lang/StringBuilder.<init>:()V
        //   675: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   678: bipush          83
        //   680: aaload         
        //   681: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   684: iload           23
        //   686: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   689: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   692: bipush          71
        //   694: aaload         
        //   695: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   698: aload_0        
        //   699: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   702: iload           23
        //   704: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   707: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   710: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   713: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   716: pop            
        //   717: iload           23
        //   719: iconst_1       
        //   720: iadd           
        //   721: istore          26
        //   723: iload_2        
        //   724: ifeq            916
        //   727: aload_0        
        //   728: getfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //   731: astore          15
        //   733: aconst_null    
        //   734: astore          16
        //   736: aload           15
        //   738: ifnull          862
        //   741: aload_0        
        //   742: getfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //   745: invokevirtual   java/util/ArrayList.size:()I
        //   748: istore          18
        //   750: aconst_null    
        //   751: astore          16
        //   753: iload           18
        //   755: ifle            862
        //   758: iload           18
        //   760: anewarray       Landroid/support/v4/app/BackStackState;
        //   763: astore          16
        //   765: iload_1        
        //   766: iload           18
        //   768: if_icmpge       862
        //   771: aload           16
        //   773: iload_1        
        //   774: new             Landroid/support/v4/app/BackStackState;
        //   777: dup            
        //   778: aload_0        
        //   779: aload_0        
        //   780: getfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //   783: iload_1        
        //   784: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   787: checkcast       Landroid/support/v4/app/BackStackRecord;
        //   790: invokespecial   android/support/v4/app/BackStackState.<init>:(Landroid/support/v4/app/FragmentManagerImpl;Landroid/support/v4/app/BackStackRecord;)V
        //   793: aastore        
        //   794: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   797: ifeq            853
        //   800: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   803: bipush          75
        //   805: aaload         
        //   806: new             Ljava/lang/StringBuilder;
        //   809: dup            
        //   810: invokespecial   java/lang/StringBuilder.<init>:()V
        //   813: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   816: bipush          69
        //   818: aaload         
        //   819: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   822: iload_1        
        //   823: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   826: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   829: bipush          79
        //   831: aaload         
        //   832: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   835: aload_0        
        //   836: getfield        android/support/v4/app/FragmentManagerImpl.mBackStack:Ljava/util/ArrayList;
        //   839: iload_1        
        //   840: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   843: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   846: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   849: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   852: pop            
        //   853: iload_1        
        //   854: iconst_1       
        //   855: iadd           
        //   856: istore          20
        //   858: iload_2        
        //   859: ifeq            910
        //   862: new             Landroid/support/v4/app/FragmentManagerState;
        //   865: dup            
        //   866: invokespecial   android/support/v4/app/FragmentManagerState.<init>:()V
        //   869: astore          17
        //   871: aload           17
        //   873: aload           10
        //   875: putfield        android/support/v4/app/FragmentManagerState.mActive:[Landroid/support/v4/app/FragmentState;
        //   878: aload           17
        //   880: aload           14
        //   882: putfield        android/support/v4/app/FragmentManagerState.mAdded:[I
        //   885: aload           17
        //   887: aload           16
        //   889: putfield        android/support/v4/app/FragmentManagerState.mBackStack:[Landroid/support/v4/app/BackStackState;
        //   892: aload           17
        //   894: areturn        
        //   895: astore          24
        //   897: aload           24
        //   899: athrow         
        //   900: astore          25
        //   902: aload           25
        //   904: athrow         
        //   905: astore          19
        //   907: aload           19
        //   909: athrow         
        //   910: iload           20
        //   912: istore_1       
        //   913: goto            765
        //   916: iload           26
        //   918: istore          23
        //   920: goto            562
        //   923: aconst_null    
        //   924: astore          14
        //   926: goto            727
        //   929: iload           31
        //   931: istore          11
        //   933: iload           13
        //   935: istore          12
        //   937: goto            84
        //   940: iconst_1       
        //   941: istore          13
        //   943: goto            443
        //   946: iload           12
        //   948: istore          13
        //   950: goto            443
        //   953: iload           12
        //   955: istore          13
        //   957: goto            453
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  6      22     49     52     Ljava/lang/IllegalArgumentException;
        //  22     28     52     57     Ljava/lang/IllegalArgumentException;
        //  33     42     57     62     Ljava/lang/IllegalArgumentException;
        //  54     57     57     62     Ljava/lang/IllegalArgumentException;
        //  110    170    487    492    Ljava/lang/IllegalArgumentException;
        //  181    195    492    497    Ljava/lang/IllegalArgumentException;
        //  200    207    497    502    Ljava/lang/IllegalArgumentException;
        //  212    230    502    507    Ljava/lang/IllegalArgumentException;
        //  235    298    507    512    Ljava/lang/IllegalArgumentException;
        //  298    318    512    517    Ljava/lang/IllegalArgumentException;
        //  318    345    517    522    Ljava/lang/IllegalArgumentException;
        //  350    369    522    527    Ljava/lang/IllegalArgumentException;
        //  373    383    522    527    Ljava/lang/IllegalArgumentException;
        //  383    440    527    532    Ljava/lang/IllegalArgumentException;
        //  458    480    482    487    Ljava/lang/IllegalArgumentException;
        //  494    497    497    502    Ljava/lang/IllegalArgumentException;
        //  499    502    502    507    Ljava/lang/IllegalArgumentException;
        //  504    507    507    512    Ljava/lang/IllegalArgumentException;
        //  519    522    522    527    Ljava/lang/IllegalArgumentException;
        //  569    656    895    900    Ljava/lang/IllegalArgumentException;
        //  656    717    900    905    Ljava/lang/IllegalArgumentException;
        //  771    853    905    910    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 448, Size: 448
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    Bundle saveFragmentBasicState(final Fragment p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/app/FragmentManagerImpl.mStateBundle:Landroid/os/Bundle;
        //     4: ifnonnull       18
        //     7: aload_0        
        //     8: new             Landroid/os/Bundle;
        //    11: dup            
        //    12: invokespecial   android/os/Bundle.<init>:()V
        //    15: putfield        android/support/v4/app/FragmentManagerImpl.mStateBundle:Landroid/os/Bundle;
        //    18: aload_1        
        //    19: aload_0        
        //    20: getfield        android/support/v4/app/FragmentManagerImpl.mStateBundle:Landroid/os/Bundle;
        //    23: invokevirtual   android/support/v4/app/Fragment.performSaveInstanceState:(Landroid/os/Bundle;)V
        //    26: aload_0        
        //    27: getfield        android/support/v4/app/FragmentManagerImpl.mStateBundle:Landroid/os/Bundle;
        //    30: invokevirtual   android/os/Bundle.isEmpty:()Z
        //    33: ifne            154
        //    36: aload_0        
        //    37: getfield        android/support/v4/app/FragmentManagerImpl.mStateBundle:Landroid/os/Bundle;
        //    40: astore_3       
        //    41: aload_0        
        //    42: aconst_null    
        //    43: putfield        android/support/v4/app/FragmentManagerImpl.mStateBundle:Landroid/os/Bundle;
        //    46: aload_1        
        //    47: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //    50: ifnull          58
        //    53: aload_0        
        //    54: aload_1        
        //    55: invokevirtual   android/support/v4/app/FragmentManagerImpl.saveFragmentViewState:(Landroid/support/v4/app/Fragment;)V
        //    58: aload_1        
        //    59: getfield        android/support/v4/app/Fragment.mSavedViewState:Landroid/util/SparseArray;
        //    62: astore          6
        //    64: aload           6
        //    66: ifnull          96
        //    69: aload_3        
        //    70: ifnonnull       81
        //    73: new             Landroid/os/Bundle;
        //    76: dup            
        //    77: invokespecial   android/os/Bundle.<init>:()V
        //    80: astore_3       
        //    81: aload_3        
        //    82: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    85: sipush          143
        //    88: aaload         
        //    89: aload_1        
        //    90: getfield        android/support/v4/app/Fragment.mSavedViewState:Landroid/util/SparseArray;
        //    93: invokevirtual   android/os/Bundle.putSparseParcelableArray:(Ljava/lang/String;Landroid/util/SparseArray;)V
        //    96: aload_1        
        //    97: getfield        android/support/v4/app/Fragment.mUserVisibleHint:Z
        //   100: istore          8
        //   102: iload           8
        //   104: ifne            134
        //   107: aload_3        
        //   108: ifnonnull       119
        //   111: new             Landroid/os/Bundle;
        //   114: dup            
        //   115: invokespecial   android/os/Bundle.<init>:()V
        //   118: astore_3       
        //   119: aload_3        
        //   120: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   123: sipush          142
        //   126: aaload         
        //   127: aload_1        
        //   128: getfield        android/support/v4/app/Fragment.mUserVisibleHint:Z
        //   131: invokevirtual   android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
        //   134: aload_3        
        //   135: areturn        
        //   136: astore_2       
        //   137: aload_2        
        //   138: athrow         
        //   139: astore          4
        //   141: aload           4
        //   143: athrow         
        //   144: astore          5
        //   146: aload           5
        //   148: athrow         
        //   149: astore          7
        //   151: aload           7
        //   153: athrow         
        //   154: aconst_null    
        //   155: astore_3       
        //   156: goto            46
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      18     136    139    Ljava/lang/IllegalArgumentException;
        //  46     58     139    144    Ljava/lang/IllegalArgumentException;
        //  58     64     144    149    Ljava/lang/IllegalArgumentException;
        //  96     102    149    154    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 81, Size: 81
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public Fragment$SavedState saveFragmentInstanceState(final Fragment p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: getfield        android/support/v4/app/Fragment.mIndex:I
        //     4: ifge            52
        //     7: aload_0        
        //     8: new             Ljava/lang/IllegalStateException;
        //    11: dup            
        //    12: new             Ljava/lang/StringBuilder;
        //    15: dup            
        //    16: invokespecial   java/lang/StringBuilder.<init>:()V
        //    19: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    22: sipush          160
        //    25: aaload         
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    29: aload_1        
        //    30: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    33: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    36: sipush          161
        //    39: aaload         
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    46: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    49: invokespecial   android/support/v4/app/FragmentManagerImpl.throwException:(Ljava/lang/RuntimeException;)V
        //    52: aload_1        
        //    53: getfield        android/support/v4/app/Fragment.mState:I
        //    56: istore_3       
        //    57: aconst_null    
        //    58: astore          4
        //    60: iload_3        
        //    61: ifle            90
        //    64: aload_0        
        //    65: aload_1        
        //    66: invokevirtual   android/support/v4/app/FragmentManagerImpl.saveFragmentBasicState:(Landroid/support/v4/app/Fragment;)Landroid/os/Bundle;
        //    69: astore          5
        //    71: aconst_null    
        //    72: astore          4
        //    74: aload           5
        //    76: ifnull          90
        //    79: new             Landroid/support/v4/app/Fragment$SavedState;
        //    82: dup            
        //    83: aload           5
        //    85: invokespecial   android/support/v4/app/Fragment$SavedState.<init>:(Landroid/os/Bundle;)V
        //    88: astore          4
        //    90: aload           4
        //    92: areturn        
        //    93: astore_2       
        //    94: aload_2        
        //    95: athrow         
        //    96: astore          6
        //    98: aload           6
        //   100: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      52     93     96     Ljava/lang/IllegalArgumentException;
        //  79     90     96     101    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0090:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    void saveFragmentViewState(final Fragment p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/app/Fragment.mInnerView:Landroid/view/View;
        //     4: astore_3       
        //     5: aload_3        
        //     6: ifnonnull       13
        //     9: return         
        //    10: astore_2       
        //    11: aload_2        
        //    12: athrow         
        //    13: aload_0        
        //    14: getfield        android/support/v4/app/FragmentManagerImpl.mStateArray:Landroid/util/SparseArray;
        //    17: astore          6
        //    19: aload           6
        //    21: ifnonnull       41
        //    24: aload_0        
        //    25: new             Landroid/util/SparseArray;
        //    28: dup            
        //    29: invokespecial   android/util/SparseArray.<init>:()V
        //    32: putfield        android/support/v4/app/FragmentManagerImpl.mStateArray:Landroid/util/SparseArray;
        //    35: getstatic       android/support/v4/app/Fragment.a:I
        //    38: ifeq            48
        //    41: aload_0        
        //    42: getfield        android/support/v4/app/FragmentManagerImpl.mStateArray:Landroid/util/SparseArray;
        //    45: invokevirtual   android/util/SparseArray.clear:()V
        //    48: aload_1        
        //    49: getfield        android/support/v4/app/Fragment.mInnerView:Landroid/view/View;
        //    52: aload_0        
        //    53: getfield        android/support/v4/app/FragmentManagerImpl.mStateArray:Landroid/util/SparseArray;
        //    56: invokevirtual   android/view/View.saveHierarchyState:(Landroid/util/SparseArray;)V
        //    59: aload_0        
        //    60: getfield        android/support/v4/app/FragmentManagerImpl.mStateArray:Landroid/util/SparseArray;
        //    63: invokevirtual   android/util/SparseArray.size:()I
        //    66: ifle            9
        //    69: aload_1        
        //    70: aload_0        
        //    71: getfield        android/support/v4/app/FragmentManagerImpl.mStateArray:Landroid/util/SparseArray;
        //    74: putfield        android/support/v4/app/Fragment.mSavedViewState:Landroid/util/SparseArray;
        //    77: aload_0        
        //    78: aconst_null    
        //    79: putfield        android/support/v4/app/FragmentManagerImpl.mStateArray:Landroid/util/SparseArray;
        //    82: return         
        //    83: astore          7
        //    85: aload           7
        //    87: athrow         
        //    88: astore          4
        //    90: aload           4
        //    92: athrow         
        //    93: astore          5
        //    95: aload           5
        //    97: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      10     13     Ljava/lang/IllegalArgumentException;
        //  13     19     88     93     Ljava/lang/IllegalArgumentException;
        //  24     41     93     98     Ljava/lang/IllegalArgumentException;
        //  41     48     93     98     Ljava/lang/IllegalArgumentException;
        //  48     82     83     88     Ljava/lang/IllegalArgumentException;
        //  90     93     93     98     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0041:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void setBackStackIndex(final int p0, final BackStackRecord p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: monitorenter   
        //     6: aload_0        
        //     7: getfield        android/support/v4/app/FragmentManagerImpl.mBackStackIndices:Ljava/util/ArrayList;
        //    10: ifnonnull       24
        //    13: aload_0        
        //    14: new             Ljava/util/ArrayList;
        //    17: dup            
        //    18: invokespecial   java/util/ArrayList.<init>:()V
        //    21: putfield        android/support/v4/app/FragmentManagerImpl.mBackStackIndices:Ljava/util/ArrayList;
        //    24: aload_0        
        //    25: getfield        android/support/v4/app/FragmentManagerImpl.mBackStackIndices:Ljava/util/ArrayList;
        //    28: invokevirtual   java/util/ArrayList.size:()I
        //    31: istore          5
        //    33: iload           5
        //    35: istore          6
        //    37: iload_1        
        //    38: iload           6
        //    40: if_icmpge       116
        //    43: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //    46: istore          17
        //    48: iload           17
        //    50: ifeq            102
        //    53: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    56: sipush          166
        //    59: aaload         
        //    60: new             Ljava/lang/StringBuilder;
        //    63: dup            
        //    64: invokespecial   java/lang/StringBuilder.<init>:()V
        //    67: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    70: sipush          168
        //    73: aaload         
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    77: iload_1        
        //    78: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    81: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    84: sipush          169
        //    87: aaload         
        //    88: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    91: aload_2        
        //    92: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    95: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    98: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   101: pop            
        //   102: aload_0        
        //   103: getfield        android/support/v4/app/FragmentManagerImpl.mBackStackIndices:Ljava/util/ArrayList;
        //   106: iload_1        
        //   107: aload_2        
        //   108: invokevirtual   java/util/ArrayList.set:(ILjava/lang/Object;)Ljava/lang/Object;
        //   111: pop            
        //   112: iload_3        
        //   113: ifeq            275
        //   116: iload           6
        //   118: iload_1        
        //   119: if_icmpge       211
        //   122: aload_0        
        //   123: getfield        android/support/v4/app/FragmentManagerImpl.mBackStackIndices:Ljava/util/ArrayList;
        //   126: aconst_null    
        //   127: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   130: pop            
        //   131: aload_0        
        //   132: getfield        android/support/v4/app/FragmentManagerImpl.mAvailBackStackIndices:Ljava/util/ArrayList;
        //   135: ifnonnull       149
        //   138: aload_0        
        //   139: new             Ljava/util/ArrayList;
        //   142: dup            
        //   143: invokespecial   java/util/ArrayList.<init>:()V
        //   146: putfield        android/support/v4/app/FragmentManagerImpl.mAvailBackStackIndices:Ljava/util/ArrayList;
        //   149: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   152: ifeq            191
        //   155: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   158: sipush          164
        //   161: aaload         
        //   162: new             Ljava/lang/StringBuilder;
        //   165: dup            
        //   166: invokespecial   java/lang/StringBuilder.<init>:()V
        //   169: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   172: sipush          167
        //   175: aaload         
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: iload           6
        //   181: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   184: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   187: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   190: pop            
        //   191: aload_0        
        //   192: getfield        android/support/v4/app/FragmentManagerImpl.mAvailBackStackIndices:Ljava/util/ArrayList;
        //   195: iload           6
        //   197: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   200: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   203: pop            
        //   204: iinc            6, 1
        //   207: iload_3        
        //   208: ifeq            116
        //   211: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   214: ifeq            266
        //   217: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   220: sipush          163
        //   223: aaload         
        //   224: new             Ljava/lang/StringBuilder;
        //   227: dup            
        //   228: invokespecial   java/lang/StringBuilder.<init>:()V
        //   231: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   234: sipush          170
        //   237: aaload         
        //   238: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   241: iload_1        
        //   242: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   245: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //   248: sipush          165
        //   251: aaload         
        //   252: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   255: aload_2        
        //   256: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   259: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   262: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   265: pop            
        //   266: aload_0        
        //   267: getfield        android/support/v4/app/FragmentManagerImpl.mBackStackIndices:Ljava/util/ArrayList;
        //   270: aload_2        
        //   271: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   274: pop            
        //   275: aload_0        
        //   276: monitorexit    
        //   277: return         
        //   278: astore          15
        //   280: aload           15
        //   282: athrow         
        //   283: astore          16
        //   285: aload           16
        //   287: athrow         
        //   288: astore          4
        //   290: aload_0        
        //   291: monitorexit    
        //   292: aload           4
        //   294: athrow         
        //   295: astore          18
        //   297: aload           18
        //   299: athrow         
        //   300: astore          10
        //   302: aload           10
        //   304: athrow         
        //   305: astore          12
        //   307: aload           12
        //   309: athrow         
        //   310: astore          7
        //   312: aload           7
        //   314: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  6      24     288    295    Any
        //  24     33     288    295    Any
        //  43     48     278    283    Ljava/lang/IllegalArgumentException;
        //  43     48     288    295    Any
        //  53     102    283    288    Ljava/lang/IllegalArgumentException;
        //  53     102    288    295    Any
        //  102    112    295    300    Ljava/lang/IllegalArgumentException;
        //  102    112    288    295    Any
        //  122    149    300    305    Ljava/lang/IllegalArgumentException;
        //  122    149    288    295    Any
        //  149    191    305    310    Ljava/lang/IllegalArgumentException;
        //  149    191    288    295    Any
        //  191    204    288    295    Any
        //  211    266    310    315    Ljava/lang/IllegalArgumentException;
        //  211    266    288    295    Any
        //  266    275    288    295    Any
        //  275    277    288    295    Any
        //  280    283    283    288    Ljava/lang/IllegalArgumentException;
        //  280    283    288    295    Any
        //  285    288    288    295    Any
        //  290    292    288    295    Any
        //  297    300    288    295    Any
        //  302    305    288    295    Any
        //  307    310    288    295    Any
        //  312    315    288    295    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 150, Size: 150
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void showFragment(final Fragment p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //     3: ifeq            39
        //     6: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //     9: bipush          18
        //    11: aaload         
        //    12: new             Ljava/lang/StringBuilder;
        //    15: dup            
        //    16: invokespecial   java/lang/StringBuilder.<init>:()V
        //    19: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    22: bipush          17
        //    24: aaload         
        //    25: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    28: aload_1        
        //    29: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    32: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    35: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    38: pop            
        //    39: aload_1        
        //    40: getfield        android/support/v4/app/Fragment.mHidden:Z
        //    43: ifeq            133
        //    46: aload_1        
        //    47: iconst_0       
        //    48: putfield        android/support/v4/app/Fragment.mHidden:Z
        //    51: aload_1        
        //    52: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //    55: astore          6
        //    57: aload           6
        //    59: ifnull          94
        //    62: aload_0        
        //    63: aload_1        
        //    64: iload_2        
        //    65: iconst_1       
        //    66: iload_3        
        //    67: invokevirtual   android/support/v4/app/FragmentManagerImpl.loadAnimation:(Landroid/support/v4/app/Fragment;IZI)Landroid/view/animation/Animation;
        //    70: astore          12
        //    72: aload           12
        //    74: ifnull          86
        //    77: aload_1        
        //    78: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //    81: aload           12
        //    83: invokevirtual   android/view/View.startAnimation:(Landroid/view/animation/Animation;)V
        //    86: aload_1        
        //    87: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //    90: iconst_0       
        //    91: invokevirtual   android/view/View.setVisibility:(I)V
        //    94: aload_1        
        //    95: getfield        android/support/v4/app/Fragment.mAdded:Z
        //    98: istore          10
        //   100: iload           10
        //   102: ifeq            128
        //   105: aload_1        
        //   106: getfield        android/support/v4/app/Fragment.mHasMenu:Z
        //   109: istore          11
        //   111: iload           11
        //   113: ifeq            128
        //   116: aload_1        
        //   117: getfield        android/support/v4/app/Fragment.mMenuVisible:Z
        //   120: ifeq            128
        //   123: aload_0        
        //   124: iconst_1       
        //   125: putfield        android/support/v4/app/FragmentManagerImpl.mNeedMenuInvalidate:Z
        //   128: aload_1        
        //   129: iconst_0       
        //   130: invokevirtual   android/support/v4/app/Fragment.onHiddenChanged:(Z)V
        //   133: return         
        //   134: astore          4
        //   136: aload           4
        //   138: athrow         
        //   139: astore          5
        //   141: aload           5
        //   143: athrow         
        //   144: astore          13
        //   146: aload           13
        //   148: athrow         
        //   149: astore          7
        //   151: aload           7
        //   153: athrow         
        //   154: astore          8
        //   156: aload           8
        //   158: athrow         
        //   159: astore          9
        //   161: aload           9
        //   163: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      39     134    139    Ljava/lang/IllegalArgumentException;
        //  39     57     139    144    Ljava/lang/IllegalArgumentException;
        //  77     86     144    149    Ljava/lang/IllegalArgumentException;
        //  94     100    149    154    Ljava/lang/IllegalArgumentException;
        //  105    111    154    159    Ljava/lang/IllegalArgumentException;
        //  116    128    159    164    Ljava/lang/IllegalArgumentException;
        //  151    154    154    159    Ljava/lang/IllegalArgumentException;
        //  156    159    159    164    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 83, Size: 83
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    void startPendingDeferredFragments() {
        while (true) {
            final int a = Fragment.a;
            try {
                if (this.mActive == null) {
                    return;
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            int i = 0;
            while (i < this.mActive.size()) {
                final Fragment fragment = this.mActive.get(i);
                Label_0057: {
                    if (fragment == null) {
                        break Label_0057;
                    }
                    try {
                        this.performPendingDeferredStart(fragment);
                        final int n = i + 1;
                        if (a != 0) {
                            return;
                        }
                        i = n;
                    }
                    catch (IllegalArgumentException ex2) {
                        throw ex2;
                    }
                }
            }
        }
    }
    
    @Override
    public String toString() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/lang/StringBuilder;
        //     3: dup            
        //     4: sipush          128
        //     7: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    10: astore_1       
        //    11: aload_1        
        //    12: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    15: sipush          149
        //    18: aaload         
        //    19: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    22: pop            
        //    23: aload_1        
        //    24: aload_0        
        //    25: invokestatic    java/lang/System.identityHashCode:(Ljava/lang/Object;)I
        //    28: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //    31: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    34: pop            
        //    35: aload_1        
        //    36: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    39: sipush          150
        //    42: aaload         
        //    43: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    46: pop            
        //    47: aload_0        
        //    48: getfield        android/support/v4/app/FragmentManagerImpl.mParent:Landroid/support/v4/app/Fragment;
        //    51: astore          7
        //    53: aload           7
        //    55: ifnull          72
        //    58: aload_0        
        //    59: getfield        android/support/v4/app/FragmentManagerImpl.mParent:Landroid/support/v4/app/Fragment;
        //    62: aload_1        
        //    63: invokestatic    android/support/v4/util/DebugUtils.buildShortClassTag:(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
        //    66: getstatic       android/support/v4/app/Fragment.a:I
        //    69: ifeq            80
        //    72: aload_0        
        //    73: getfield        android/support/v4/app/FragmentManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //    76: aload_1        
        //    77: invokestatic    android/support/v4/util/DebugUtils.buildShortClassTag:(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
        //    80: aload_1        
        //    81: getstatic       android/support/v4/app/FragmentManagerImpl.z:[Ljava/lang/String;
        //    84: sipush          148
        //    87: aaload         
        //    88: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    91: pop            
        //    92: aload_1        
        //    93: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    96: areturn        
        //    97: astore_2       
        //    98: aload_2        
        //    99: athrow         
        //   100: astore_3       
        //   101: aload_3        
        //   102: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  11     53     97     100    Ljava/lang/IllegalArgumentException;
        //  58     72     100    103    Ljava/lang/IllegalArgumentException;
        //  72     80     100    103    Ljava/lang/IllegalArgumentException;
        //  98     100    100    103    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0072:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
