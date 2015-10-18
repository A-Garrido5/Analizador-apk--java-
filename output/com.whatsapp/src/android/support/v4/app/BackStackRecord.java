// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.util.Map;
import java.util.List;
import java.util.Collection;
import android.content.Context;
import android.view.View;
import android.util.SparseArray;
import android.support.v4.util.ArrayMap;
import android.os.Build$VERSION;
import java.util.ArrayList;

final class BackStackRecord extends FragmentTransaction implements FragmentManager$BackStackEntry, Runnable
{
    static final boolean SUPPORTS_TRANSITIONS;
    private static final String[] z;
    boolean mAddToBackStack;
    boolean mAllowAddToBackStack;
    int mBreadCrumbShortTitleRes;
    CharSequence mBreadCrumbShortTitleText;
    int mBreadCrumbTitleRes;
    CharSequence mBreadCrumbTitleText;
    boolean mCommitted;
    int mEnterAnim;
    int mExitAnim;
    BackStackRecord$Op mHead;
    int mIndex;
    final FragmentManagerImpl mManager;
    String mName;
    int mNumOp;
    int mPopEnterAnim;
    int mPopExitAnim;
    ArrayList mSharedElementSourceNames;
    ArrayList mSharedElementTargetNames;
    BackStackRecord$Op mTail;
    int mTransition;
    int mTransitionStyle;
    
    static {
        int supports_TRANSITIONS = 1;
        final String[] z2 = new String[71];
        String s = "}.\u0003$\u001f^2\u0016\u000e\u0013U=\u0005&\u0000";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
    Label_0019:
        while (true) {
            while (true) {
                final char[] charArray = s.toCharArray();
                final int length = charArray.length;
                int n3 = 0;
                while (true) {
                    Label_1975: {
                        if (length > n3) {
                            break Label_1975;
                        }
                        final String intern = new String(charArray).intern();
                        switch (n) {
                            default: {
                                array[n2] = intern;
                                s = "n2\t-\u001dL2B \u001f_fB";
                                n2 = supports_TRANSITIONS;
                                array = z2;
                                n = 0;
                                continue Label_0019;
                            }
                            case 0: {
                                array[n2] = intern;
                                n2 = 2;
                                array = z2;
                                s = "K3\u0012\u0005\u0000T1 \"\u0011P\u000f\u0016\"\u0011PfB";
                                n = supports_TRANSITIONS;
                                continue Label_0019;
                            }
                            case 1: {
                                array[n2] = intern;
                                n2 = 3;
                                s = "\u001b|";
                                n = 2;
                                array = z2;
                                continue Label_0019;
                            }
                            case 2: {
                                array[n2] = intern;
                                n2 = 4;
                                s = "}.\u0003$\u001f^2\u0016\u000e\u0013U=\u0005&\u0000";
                                n = 3;
                                array = z2;
                                continue Label_0019;
                            }
                            case 3: {
                                array[n2] = intern;
                                n2 = 5;
                                s = "y)\u000f3RU9\u00117\u001bU;B,\u0014\u001b";
                                n = 4;
                                array = z2;
                                continue Label_0019;
                            }
                            case 4: {
                                array[n2] = intern;
                                n2 = 6;
                                s = "y)\u000f3RU9\u00117\u001bU;B,\u0014\u001b";
                                n = 5;
                                array = z2;
                                continue Label_0019;
                            }
                            case 5: {
                                array[n2] = intern;
                                n2 = 7;
                                s = "}.\u0003$\u001f^2\u0016\u000e\u0013U=\u0005&\u0000";
                                n = 6;
                                array = z2;
                                continue Label_0019;
                            }
                            case 6: {
                                array[n2] = intern;
                                n2 = 8;
                                s = "}.\u0003$\u001f^2\u0016\u000e\u0013U=\u0005&\u0000";
                                n = 7;
                                array = z2;
                                continue Label_0019;
                            }
                            case 7: {
                                array[n2] = intern;
                                n2 = 9;
                                s = "y)\u000f3RU9\u00117\u001bU;B*\u001c\u001b";
                                n = 8;
                                array = z2;
                                continue Label_0019;
                            }
                            case 8: {
                                array[n2] = intern;
                                n2 = 10;
                                s = "\u001b(\rc";
                                n = 9;
                                array = z2;
                                continue Label_0019;
                            }
                            case 9: {
                                array[n2] = intern;
                                n2 = 11;
                                s = "\u001b(\rc";
                                n = 10;
                                array = z2;
                                continue Label_0019;
                            }
                            case 10: {
                                array[n2] = intern;
                                n2 = 12;
                                s = "}.\u0003$\u001f^2\u0016\u000e\u0013U=\u0005&\u0000";
                                n = 11;
                                array = z2;
                                continue Label_0019;
                            }
                            case 11: {
                                array[n2] = intern;
                                n2 = 13;
                                s = "\u001b>\u001bc";
                                n = 12;
                                array = z2;
                                continue Label_0019;
                            }
                            case 12: {
                                array[n2] = intern;
                                n2 = 14;
                                s = "\u001b|A";
                                n = 13;
                                array = z2;
                                continue Label_0019;
                            }
                            case 13: {
                                array[n2] = intern;
                                n2 = 15;
                                s = "\u001b1 1\u0017Z8!1\u0007V>6*\u0006W96&\nOa";
                                n = 14;
                                array = z2;
                                continue Label_0019;
                            }
                            case 14: {
                                array[n2] = intern;
                                n2 = 16;
                                s = "s\u0015&\u0006";
                                n = 15;
                                array = z2;
                                continue Label_0019;
                            }
                            case 15: {
                                array[n2] = intern;
                                n2 = 17;
                                s = "\u001b|-3R\u0018";
                                n = 16;
                                array = z2;
                                continue Label_0019;
                            }
                            case 16: {
                                array[n2] = intern;
                                n2 = 18;
                                s = "i\u0019/\f$~";
                                n = 17;
                                array = z2;
                                continue Label_0019;
                            }
                            case 17: {
                                array[n2] = intern;
                                n2 = 19;
                                s = "\u0001|";
                                n = 18;
                                array = z2;
                                continue Label_0019;
                            }
                            case 18: {
                                array[n2] = intern;
                                n2 = 20;
                                s = "V\u0019\f7\u0017I\u001d\f*\u001f\u0006\u007f";
                                n = 19;
                                array = z2;
                                continue Label_0019;
                            }
                            case 19: {
                                array[n2] = intern;
                                s = "\u0001|";
                                n = 20;
                                n2 = 21;
                                array = z2;
                                continue Label_0019;
                            }
                            case 20: {
                                array[n2] = intern;
                                n2 = 22;
                                array = z2;
                                s = "i9\u000f,\u0004^8Xc";
                                n = 21;
                                continue Label_0019;
                            }
                            case 21: {
                                array[n2] = intern;
                                n2 = 23;
                                s = "V\b\u0010\"\u001cH5\u0016*\u001dUaA";
                                n = 22;
                                array = z2;
                                continue Label_0019;
                            }
                            case 22: {
                                array[n2] = intern;
                                n2 = 24;
                                s = "V\u001e\u0010&\u0013_\u001f\u00106\u001fY\b\u000b7\u001e^\u000e\u00070O\u0018";
                                n = 23;
                                array = z2;
                                continue Label_0019;
                            }
                            case 23: {
                                array[n2] = intern;
                                n2 = 25;
                                s = "V\u0012\u0003.\u0017\u0006";
                                n = 24;
                                array = z2;
                                continue Label_0019;
                            }
                            case 24: {
                                array[n2] = intern;
                                n2 = 26;
                                s = "\u001b1+-\u0016^$_";
                                n = 25;
                                array = z2;
                                continue Label_0019;
                            }
                            case 25: {
                                array[n2] = intern;
                                n2 = 27;
                                s = "\u001b9\u001a*\u0006z2\u000b.O\u0018";
                                n = 26;
                                array = z2;
                                continue Label_0019;
                            }
                            case 26: {
                                array[n2] = intern;
                                n2 = 28;
                                s = "\u001b161\u0013U/\u000b7\u001bT217\u000bW9_`";
                                n = 27;
                                array = z2;
                                continue Label_0019;
                            }
                            case 27: {
                                array[n2] = intern;
                                n2 = 29;
                                s = "h\u0014-\u0014";
                                n = 28;
                                array = z2;
                                continue Label_0019;
                            }
                            case 28: {
                                array[n2] = intern;
                                n2 = 30;
                                s = "V\f\r37U(\u000713U5\u000f~Q";
                                n = 29;
                                array = z2;
                                continue Label_0019;
                            }
                            case 29: {
                                array[n2] = intern;
                                n2 = 31;
                                s = "\u001b12,\u0002~$\u000b73U5\u000f~Q";
                                n = 30;
                                array = z2;
                                continue Label_0019;
                            }
                            case 30: {
                                array[n2] = intern;
                                n2 = 32;
                                s = "z\u0018&";
                                n = 31;
                                array = z2;
                                continue Label_0019;
                            }
                            case 31: {
                                array[n2] = intern;
                                n2 = 33;
                                s = "i\u00192\u000f3x\u0019";
                                n = 32;
                                array = z2;
                                continue Label_0019;
                            }
                            case 32: {
                                array[n2] = intern;
                                n2 = 34;
                                s = "\u001b1 1\u0017Z8!1\u0007V>1+\u001dI(6*\u0006W96&\nOa";
                                n = 33;
                                array = z2;
                                continue Label_0019;
                            }
                            case 33: {
                                array[n2] = intern;
                                n2 = 35;
                                s = "\u001b1';\u001bO\u001d\f*\u001f\u0006\u007f";
                                n = 34;
                                array = z2;
                                continue Label_0019;
                            }
                            case 34: {
                                array[n2] = intern;
                                n2 = 36;
                                s = "\u007f\u00196\u00021s";
                                n = 35;
                                array = z2;
                                continue Label_0019;
                            }
                            case 35: {
                                array[n2] = intern;
                                n2 = 37;
                                s = "\u001b1!,\u001fV5\u00167\u0017_a";
                                n = 36;
                                array = z2;
                                continue Label_0019;
                            }
                            case 36: {
                                array[n2] = intern;
                                n2 = 38;
                                s = "u\t.\u000f";
                                n = 37;
                                array = z2;
                                continue Label_0019;
                            }
                            case 37: {
                                array[n2] = intern;
                                n2 = 39;
                                s = "V\u001e\u0010&\u0013_\u001f\u00106\u001fY\u000f\n,\u0000O\b\u000b7\u001e^\u000e\u00070O\u0018";
                                n = 38;
                                array = z2;
                                continue Label_0019;
                            }
                            case 38: {
                                array[n2] = intern;
                                n2 = 40;
                                s = "t,\u00071\u0013O5\r-\u0001\u0001";
                                n = 39;
                                array = z2;
                                continue Label_0019;
                            }
                            case 39: {
                                array[n2] = intern;
                                n2 = 41;
                                s = "z\b6\u00021s";
                                n = 40;
                                array = z2;
                                continue Label_0019;
                            }
                            case 40: {
                                array[n2] = intern;
                                n2 = 42;
                                s = "\u001b|Bc";
                                n = 41;
                                array = z2;
                                continue Label_0019;
                            }
                            case 41: {
                                array[n2] = intern;
                                n2 = 43;
                                s = "K3\u0012\u0006\u001cO9\u0010\u0002\u001cR1_`";
                                n = 42;
                                array = z2;
                                continue Label_0019;
                            }
                            case 42: {
                                array[n2] = intern;
                                n2 = 44;
                                s = "\u001b,\r37C5\u0016\u0002\u001cR1_`";
                                n = 43;
                                array = z2;
                                continue Label_0019;
                            }
                            case 43: {
                                array[n2] = intern;
                                n2 = 45;
                                s = "^2\u0016&\u0000z2\u000b.O\u0018";
                                n = 44;
                                array = z2;
                                continue Label_0019;
                            }
                            case 44: {
                                array[n2] = intern;
                                n2 = 46;
                                s = "i9\u000f,\u0004^8X";
                                n = 45;
                                array = z2;
                                continue Label_0019;
                            }
                            case 45: {
                                array[n2] = intern;
                                n2 = 47;
                                s = "X1\u0006~";
                                n = 46;
                                array = z2;
                                continue Label_0019;
                            }
                            case 46: {
                                array[n2] = intern;
                                n2 = 48;
                                s = "y=\u0001(!O=\u0001(7U(\u0010:\t";
                                n = 47;
                                array = z2;
                                continue Label_0019;
                            }
                            case 47: {
                                array[n2] = intern;
                                n2 = 49;
                                s = "\u001b\u007f";
                                n = 48;
                                array = z2;
                                continue Label_0019;
                            }
                            case 48: {
                                array[n2] = intern;
                                n2 = 50;
                                s = "x=\fd\u0006\u001b?\n\"\u001c\\9B7\u0013\\|\r%R].\u0003$\u001f^2\u0016c";
                                n = 49;
                                array = z2;
                                continue Label_0019;
                            }
                            case 49: {
                                array[n2] = intern;
                                n2 = 51;
                                s = "\u0001|\u0015\"\u0001\u001b";
                                n = 50;
                                array = z2;
                                continue Label_0019;
                            }
                            case 50: {
                                array[n2] = intern;
                                n2 = 52;
                                s = "\u001b2\r4R";
                                n = 51;
                                array = z2;
                                continue Label_0019;
                            }
                            case 51: {
                                array[n2] = intern;
                                n2 = 53;
                                s = "x=\fd\u0006\u001b?\n\"\u001c\\9B \u001dU(\u0003*\u001c^.B\n6\u001b3\u0004c\u0014I=\u0005.\u0017U(B";
                                n = 52;
                                array = z2;
                                continue Label_0019;
                            }
                            case 52: {
                                array[n2] = intern;
                                n2 = 54;
                                s = "\u0001|\u0015\"\u0001\u001b";
                                n = 53;
                                array = z2;
                                continue Label_0019;
                            }
                            case 53: {
                                array[n2] = intern;
                                n2 = 55;
                                s = "\u001b2\r4R";
                                n = 54;
                                array = z2;
                                continue Label_0019;
                            }
                            case 54: {
                                array[n2] = intern;
                                n2 = 56;
                                s = "i)\fyR";
                                n = 55;
                                array = z2;
                                continue Label_0019;
                            }
                            case 55: {
                                array[n2] = intern;
                                n2 = 57;
                                s = "}.\u0003$\u001f^2\u0016\u000e\u0013U=\u0005&\u0000";
                                n = 56;
                                array = z2;
                                continue Label_0019;
                            }
                            case 56: {
                                array[n2] = intern;
                                n2 = 58;
                                s = "\u001b(\rc";
                                n = 57;
                                array = z2;
                                continue Label_0019;
                            }
                            case 57: {
                                array[n2] = intern;
                                s = "Z8\u0006\u0017\u001dy=\u0001(!O=\u0001(Z\u0012|\u0001\"\u001eW9\u0006c\u0013](\u00071RX3\u000f.\u001bOtK";
                                n = 58;
                                n2 = 59;
                                array = z2;
                                continue Label_0019;
                            }
                            case 58: {
                                array[n2] = intern;
                                n2 = 60;
                                array = z2;
                                s = "}.\u0003$\u001f^2\u0016\u000e\u0013U=\u0005&\u0000";
                                n = 59;
                                continue Label_0019;
                            }
                            case 59: {
                                array[n2] = intern;
                                n2 = 61;
                                s = "n2\t-\u001dL2B \u001f_fB";
                                n = 60;
                                array = z2;
                                continue Label_0019;
                            }
                            case 60: {
                                array[n2] = intern;
                                n2 = 62;
                                s = "y)\u000f3RU9\u00117\u001bU;B,\u0014\u001b";
                                n = 61;
                                array = z2;
                                continue Label_0019;
                            }
                            case 61: {
                                array[n2] = intern;
                                n2 = 63;
                                s = "t\f=\u00117k\u0010#\u00007\u0001|\u0003'\u0016R2\u0005~";
                                n = 62;
                                array = z2;
                                continue Label_0019;
                            }
                            case 62: {
                                array[n2] = intern;
                                n2 = 64;
                                s = "\u001b3\u000e'O";
                                n = 63;
                                array = z2;
                                continue Label_0019;
                            }
                            case 63: {
                                array[n2] = intern;
                                n2 = 65;
                                s = "}.\u0003$\u001f^2\u0016\u000e\u0013U=\u0005&\u0000";
                                n = 64;
                                array = z2;
                                continue Label_0019;
                            }
                            case 64: {
                                array[n2] = intern;
                                n2 = 66;
                                s = "}.\u0003$\u001f^2\u0016\u000e\u0013U=\u0005&\u0000";
                                n = 65;
                                array = z2;
                                continue Label_0019;
                            }
                            case 65: {
                                array[n2] = intern;
                                s = "X3\u000f.\u001bO|\u0003/\u0000^=\u0006:RX=\u000e/\u0017_";
                                n = 66;
                                n2 = 67;
                                array = z2;
                                continue Label_0019;
                            }
                            case 66: {
                                array[n2] = intern;
                                n2 = 68;
                                array = z2;
                                s = "\u001b|";
                                n = 67;
                                continue Label_0019;
                            }
                            case 67: {
                                array[n2] = intern;
                                n2 = 69;
                                s = "}.\u0003$\u001f^2\u0016\u000e\u0013U=\u0005&\u0000";
                                n = 68;
                                array = z2;
                                continue Label_0019;
                            }
                            case 68: {
                                array[n2] = intern;
                                n2 = 70;
                                s = "x3\u000f.\u001bOfB";
                                n = 69;
                                array = z2;
                                continue Label_0019;
                            }
                            case 69: {
                                break;
                            }
                        }
                        while (true) {
                            array[n2] = intern;
                            z = z2;
                            while (true) {
                                Label_2070: {
                                    try {
                                        if (Build$VERSION.SDK_INT >= 21) {
                                            SUPPORTS_TRANSITIONS = (supports_TRANSITIONS != 0);
                                            return;
                                        }
                                        break Label_2070;
                                        Label_2016: {
                                            final char c = 'r';
                                        }
                                        while (true) {
                                            break Label_2020;
                                            final char c2 = charArray[n3];
                                            Label_2044:
                                            char c = '\\';
                                            charArray[n3] = (char)(c ^ c2);
                                            ++n3;
                                            break;
                                            Label_2037:
                                            c = ';';
                                            continue;
                                            Label_2051:
                                            c = 'b';
                                            continue;
                                            Label_2058:
                                            c = 'C';
                                            continue;
                                        }
                                    }
                                    // switch([Lcom.strobel.decompiler.ast.Label;@7effa21e, n3 % 5)
                                    catch (IllegalStateException ex) {
                                        throw ex;
                                    }
                                }
                                supports_TRANSITIONS = 0;
                                continue;
                            }
                        }
                    }
                }
            }
            break;
        }
    }
    
    public BackStackRecord(final FragmentManagerImpl mManager) {
        this.mAllowAddToBackStack = true;
        this.mIndex = -1;
        this.mManager = mManager;
    }
    
    static ArrayMap access$000(final BackStackRecord backStackRecord, final BackStackRecord$TransitionState backStackRecord$TransitionState, final boolean b, final Fragment fragment) {
        return backStackRecord.mapSharedElementsIn(backStackRecord$TransitionState, b, fragment);
    }
    
    static void access$100(final BackStackRecord backStackRecord, final ArrayMap arrayMap, final BackStackRecord$TransitionState backStackRecord$TransitionState) {
        backStackRecord.setEpicenterIn(arrayMap, backStackRecord$TransitionState);
    }
    
    static void access$200(final BackStackRecord backStackRecord, final BackStackRecord$TransitionState backStackRecord$TransitionState, final Fragment fragment, final Fragment fragment2, final boolean b, final ArrayMap arrayMap) {
        backStackRecord.callSharedElementEnd(backStackRecord$TransitionState, fragment, fragment2, b, arrayMap);
    }
    
    static void access$300(final BackStackRecord backStackRecord, final BackStackRecord$TransitionState backStackRecord$TransitionState, final int n, final Object o) {
        backStackRecord.excludeHiddenFragments(backStackRecord$TransitionState, n, o);
    }
    
    private BackStackRecord$TransitionState beginTransition(final SparseArray sparseArray, final SparseArray sparseArray2, final boolean b) {
        int n = 0;
        final int a = Fragment.a;
        BackStackRecord$TransitionState backStackRecord$TransitionState = new BackStackRecord$TransitionState(this);
        backStackRecord$TransitionState.nonExistentView = new View((Context)this.mManager.mActivity);
        int i = 0;
        int n2 = 0;
        while (true) {
            while (i < sparseArray.size()) {
                int n3;
                if (this.configureTransitions(sparseArray.keyAt(i), backStackRecord$TransitionState, b, sparseArray, sparseArray2)) {
                    n3 = 1;
                }
                else {
                    n3 = n2;
                }
                final int n4 = i + 1;
                if (a != 0) {
                    int n5 = n3;
                    while (true) {
                        int n6 = 0;
                        Label_0143: {
                            if (n >= sparseArray2.size()) {
                                n6 = n5;
                                break Label_0143;
                            }
                            while (true) {
                                final int key = sparseArray2.keyAt(n);
                                while (true) {
                                    Label_0166: {
                                        try {
                                            if (sparseArray.get(key) != null || !this.configureTransitions(key, backStackRecord$TransitionState, b, sparseArray, sparseArray2)) {
                                                break Label_0166;
                                            }
                                            n6 = 1;
                                            ++n;
                                            if (a != 0) {
                                                if (n6 == 0) {
                                                    backStackRecord$TransitionState = null;
                                                }
                                                return backStackRecord$TransitionState;
                                            }
                                        }
                                        catch (IllegalStateException ex) {
                                            throw ex;
                                        }
                                        break;
                                    }
                                    n6 = n5;
                                    continue;
                                }
                            }
                        }
                        n5 = n6;
                    }
                }
                else {
                    i = n4;
                    n2 = n3;
                }
            }
            int n3 = n2;
            continue;
        }
    }
    
    private void calculateFragments(final SparseArray p0, final SparseArray p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //     8: getfield        android/support/v4/app/FragmentManagerImpl.mContainer:Landroid/support/v4/app/FragmentContainer;
        //    11: invokeinterface android/support/v4/app/FragmentContainer.hasView:()Z
        //    16: istore          5
        //    18: iload           5
        //    20: ifne            29
        //    23: return         
        //    24: astore          4
        //    26: aload           4
        //    28: athrow         
        //    29: aload_0        
        //    30: getfield        android/support/v4/app/BackStackRecord.mHead:Landroid/support/v4/app/BackStackRecord$Op;
        //    33: astore          6
        //    35: aload           6
        //    37: ifnull          23
        //    40: aload           6
        //    42: getfield        android/support/v4/app/BackStackRecord$Op.cmd:I
        //    45: istore          8
        //    47: iload           8
        //    49: tableswitch {
        //                2: 110
        //                3: 124
        //                4: 237
        //                5: 250
        //                6: 263
        //                7: 277
        //                8: 290
        //          default: 92
        //        }
        //    92: aload           6
        //    94: getfield        android/support/v4/app/BackStackRecord$Op.next:Landroid/support/v4/app/BackStackRecord$Op;
        //    97: astore          10
        //    99: iload_3        
        //   100: ifne            23
        //   103: aload           10
        //   105: astore          6
        //   107: goto            35
        //   110: aload_0        
        //   111: aload_2        
        //   112: aload           6
        //   114: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   117: invokespecial   android/support/v4/app/BackStackRecord.setLastIn:(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
        //   120: iload_3        
        //   121: ifeq            92
        //   124: aload           6
        //   126: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   129: astore          14
        //   131: aload_0        
        //   132: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   135: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   138: ifnull          354
        //   141: aload           14
        //   143: astore          15
        //   145: iconst_0       
        //   146: istore          17
        //   148: iload           17
        //   150: aload_0        
        //   151: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   154: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   157: invokevirtual   java/util/ArrayList.size:()I
        //   160: if_icmpge       226
        //   163: aload_0        
        //   164: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   167: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   170: iload           17
        //   172: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   175: checkcast       Landroid/support/v4/app/Fragment;
        //   178: astore          18
        //   180: aload           15
        //   182: ifnull          206
        //   185: aload           18
        //   187: getfield        android/support/v4/app/Fragment.mContainerId:I
        //   190: istore          21
        //   192: aload           15
        //   194: getfield        android/support/v4/app/Fragment.mContainerId:I
        //   197: istore          22
        //   199: iload           21
        //   201: iload           22
        //   203: if_icmpne       216
        //   206: aload           18
        //   208: aload           15
        //   210: if_acmpne       318
        //   213: aconst_null    
        //   214: astore          15
        //   216: iload           17
        //   218: iconst_1       
        //   219: iadd           
        //   220: istore          19
        //   222: iload_3        
        //   223: ifeq            347
        //   226: aload_0        
        //   227: aload_2        
        //   228: aload           15
        //   230: invokespecial   android/support/v4/app/BackStackRecord.setLastIn:(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
        //   233: iload_3        
        //   234: ifeq            92
        //   237: aload_1        
        //   238: aload           6
        //   240: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   243: invokestatic    android/support/v4/app/BackStackRecord.setFirstOut:(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
        //   246: iload_3        
        //   247: ifeq            92
        //   250: aload_1        
        //   251: aload           6
        //   253: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   256: invokestatic    android/support/v4/app/BackStackRecord.setFirstOut:(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
        //   259: iload_3        
        //   260: ifeq            92
        //   263: aload_0        
        //   264: aload_2        
        //   265: aload           6
        //   267: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   270: invokespecial   android/support/v4/app/BackStackRecord.setLastIn:(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
        //   273: iload_3        
        //   274: ifeq            92
        //   277: aload_1        
        //   278: aload           6
        //   280: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   283: invokestatic    android/support/v4/app/BackStackRecord.setFirstOut:(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
        //   286: iload_3        
        //   287: ifeq            92
        //   290: aload_0        
        //   291: aload_2        
        //   292: aload           6
        //   294: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   297: invokespecial   android/support/v4/app/BackStackRecord.setLastIn:(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
        //   300: goto            92
        //   303: astore          9
        //   305: aload           9
        //   307: athrow         
        //   308: astore          7
        //   310: aload           7
        //   312: athrow         
        //   313: astore          20
        //   315: aload           20
        //   317: athrow         
        //   318: aload_1        
        //   319: aload           18
        //   321: invokestatic    android/support/v4/app/BackStackRecord.setFirstOut:(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
        //   324: goto            216
        //   327: astore          16
        //   329: aload           16
        //   331: athrow         
        //   332: astore          13
        //   334: aload           13
        //   336: athrow         
        //   337: astore          12
        //   339: aload           12
        //   341: athrow         
        //   342: astore          11
        //   344: aload           11
        //   346: athrow         
        //   347: iload           19
        //   349: istore          17
        //   351: goto            148
        //   354: aload           14
        //   356: astore          15
        //   358: goto            226
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      18     24     29     Ljava/lang/IllegalStateException;
        //  40     47     308    313    Ljava/lang/IllegalStateException;
        //  110    120    308    313    Ljava/lang/IllegalStateException;
        //  185    199    313    318    Ljava/lang/IllegalStateException;
        //  226    233    327    332    Ljava/lang/IllegalStateException;
        //  237    246    332    337    Ljava/lang/IllegalStateException;
        //  250    259    337    342    Ljava/lang/IllegalStateException;
        //  263    273    342    347    Ljava/lang/IllegalStateException;
        //  277    286    303    308    Ljava/lang/IllegalStateException;
        //  290    300    303    308    Ljava/lang/IllegalStateException;
        //  329    332    332    337    Ljava/lang/IllegalStateException;
        //  334    337    337    342    Ljava/lang/IllegalStateException;
        //  339    342    342    347    Ljava/lang/IllegalStateException;
        //  344    347    303    308    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 152, Size: 152
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
    
    private void callSharedElementEnd(final BackStackRecord$TransitionState backStackRecord$TransitionState, final Fragment fragment, final Fragment fragment2, final boolean b, final ArrayMap arrayMap) {
        while (true) {
            Label_0052: {
                if (!b) {
                    break Label_0052;
                }
                try {
                    final SharedElementCallback sharedElementCallback = fragment2.mEnterTransitionCallback;
                    if (sharedElementCallback != null) {
                        sharedElementCallback.onSharedElementEnd(new ArrayList(arrayMap.keySet()), new ArrayList(arrayMap.values()), null);
                    }
                    return;
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
            final SharedElementCallback sharedElementCallback = fragment.mEnterTransitionCallback;
            continue;
        }
    }
    
    private static Object captureExitingViews(Object captureExitingViews, final Fragment fragment, final ArrayList list, final ArrayMap arrayMap, final View view) {
        if (captureExitingViews != null) {
            captureExitingViews = FragmentTransitionCompat21.captureExitingViews(captureExitingViews, fragment.getView(), list, arrayMap, view);
        }
        return captureExitingViews;
    }
    
    private boolean configureTransitions(final int p0, final BackStackRecord$TransitionState p1, final boolean p2, final SparseArray p3, final SparseArray p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //     4: getfield        android/support/v4/app/FragmentManagerImpl.mContainer:Landroid/support/v4/app/FragmentContainer;
        //     7: iload_1        
        //     8: invokeinterface android/support/v4/app/FragmentContainer.findViewById:(I)Landroid/view/View;
        //    13: checkcast       Landroid/view/ViewGroup;
        //    16: astore          6
        //    18: aload           6
        //    20: ifnonnull       25
        //    23: iconst_0       
        //    24: ireturn        
        //    25: aload           5
        //    27: iload_1        
        //    28: invokevirtual   android/util/SparseArray.get:(I)Ljava/lang/Object;
        //    31: checkcast       Landroid/support/v4/app/Fragment;
        //    34: astore          7
        //    36: aload           4
        //    38: iload_1        
        //    39: invokevirtual   android/util/SparseArray.get:(I)Ljava/lang/Object;
        //    42: checkcast       Landroid/support/v4/app/Fragment;
        //    45: astore          8
        //    47: aload           7
        //    49: iload_3        
        //    50: invokestatic    android/support/v4/app/BackStackRecord.getEnterTransition:(Landroid/support/v4/app/Fragment;Z)Ljava/lang/Object;
        //    53: astore          9
        //    55: aload           7
        //    57: aload           8
        //    59: iload_3        
        //    60: invokestatic    android/support/v4/app/BackStackRecord.getSharedElementTransition:(Landroid/support/v4/app/Fragment;Landroid/support/v4/app/Fragment;Z)Ljava/lang/Object;
        //    63: astore          10
        //    65: aload           8
        //    67: iload_3        
        //    68: invokestatic    android/support/v4/app/BackStackRecord.getExitTransition:(Landroid/support/v4/app/Fragment;Z)Ljava/lang/Object;
        //    71: astore          11
        //    73: aload           9
        //    75: ifnonnull       90
        //    78: aload           10
        //    80: ifnonnull       90
        //    83: aload           11
        //    85: ifnonnull       90
        //    88: iconst_0       
        //    89: ireturn        
        //    90: new             Ljava/util/ArrayList;
        //    93: dup            
        //    94: invokespecial   java/util/ArrayList.<init>:()V
        //    97: astore          12
        //    99: aconst_null    
        //   100: astore          13
        //   102: aload           10
        //   104: ifnull          184
        //   107: aload_0        
        //   108: aload_2        
        //   109: aload           8
        //   111: iload_3        
        //   112: invokespecial   android/support/v4/app/BackStackRecord.remapSharedElements:(Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/support/v4/app/Fragment;Z)Landroid/support/v4/util/ArrayMap;
        //   115: astore          13
        //   117: aload           12
        //   119: aload_2        
        //   120: getfield        android/support/v4/app/BackStackRecord$TransitionState.nonExistentView:Landroid/view/View;
        //   123: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   126: pop            
        //   127: aload           12
        //   129: aload           13
        //   131: invokevirtual   android/support/v4/util/ArrayMap.values:()Ljava/util/Collection;
        //   134: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   137: pop            
        //   138: iload_3        
        //   139: ifeq            462
        //   142: aload           8
        //   144: getfield        android/support/v4/app/Fragment.mEnterTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
        //   147: astore          33
        //   149: aload           33
        //   151: ifnull          184
        //   154: aload           33
        //   156: new             Ljava/util/ArrayList;
        //   159: dup            
        //   160: aload           13
        //   162: invokevirtual   android/support/v4/util/ArrayMap.keySet:()Ljava/util/Set;
        //   165: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //   168: new             Ljava/util/ArrayList;
        //   171: dup            
        //   172: aload           13
        //   174: invokevirtual   android/support/v4/util/ArrayMap.values:()Ljava/util/Collection;
        //   177: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //   180: aconst_null    
        //   181: invokevirtual   android/support/v4/app/SharedElementCallback.onSharedElementStart:(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
        //   184: new             Ljava/util/ArrayList;
        //   187: dup            
        //   188: invokespecial   java/util/ArrayList.<init>:()V
        //   191: astore          14
        //   193: aload           11
        //   195: aload           8
        //   197: aload           14
        //   199: aload           13
        //   201: aload_2        
        //   202: getfield        android/support/v4/app/BackStackRecord$TransitionState.nonExistentView:Landroid/view/View;
        //   205: invokestatic    android/support/v4/app/BackStackRecord.captureExitingViews:(Ljava/lang/Object;Landroid/support/v4/app/Fragment;Ljava/util/ArrayList;Landroid/support/v4/util/ArrayMap;Landroid/view/View;)Ljava/lang/Object;
        //   208: astore          15
        //   210: aload_0        
        //   211: getfield        android/support/v4/app/BackStackRecord.mSharedElementTargetNames:Ljava/util/ArrayList;
        //   214: astore          17
        //   216: aload           17
        //   218: ifnull          273
        //   221: aload           13
        //   223: ifnull          273
        //   226: aload           13
        //   228: aload_0        
        //   229: getfield        android/support/v4/app/BackStackRecord.mSharedElementTargetNames:Ljava/util/ArrayList;
        //   232: iconst_0       
        //   233: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   236: invokevirtual   android/support/v4/util/ArrayMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   239: checkcast       Landroid/view/View;
        //   242: astore          27
        //   244: aload           27
        //   246: ifnull          273
        //   249: aload           15
        //   251: ifnull          261
        //   254: aload           15
        //   256: aload           27
        //   258: invokestatic    android/support/v4/app/FragmentTransitionCompat21.setEpicenter:(Ljava/lang/Object;Landroid/view/View;)V
        //   261: aload           10
        //   263: ifnull          273
        //   266: aload           10
        //   268: aload           27
        //   270: invokestatic    android/support/v4/app/FragmentTransitionCompat21.setEpicenter:(Ljava/lang/Object;Landroid/view/View;)V
        //   273: new             Landroid/support/v4/app/BackStackRecord$1;
        //   276: dup            
        //   277: aload_0        
        //   278: aload           7
        //   280: invokespecial   android/support/v4/app/BackStackRecord$1.<init>:(Landroid/support/v4/app/BackStackRecord;Landroid/support/v4/app/Fragment;)V
        //   283: astore          18
        //   285: aload           10
        //   287: ifnull          306
        //   290: aload_0        
        //   291: aload_2        
        //   292: aload           6
        //   294: aload           10
        //   296: aload           7
        //   298: aload           8
        //   300: iload_3        
        //   301: aload           12
        //   303: invokespecial   android/support/v4/app/BackStackRecord.prepareSharedElementTransition:(Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/view/View;Ljava/lang/Object;Landroid/support/v4/app/Fragment;Landroid/support/v4/app/Fragment;ZLjava/util/ArrayList;)V
        //   306: new             Ljava/util/ArrayList;
        //   309: dup            
        //   310: invokespecial   java/util/ArrayList.<init>:()V
        //   313: astore          19
        //   315: new             Landroid/support/v4/util/ArrayMap;
        //   318: dup            
        //   319: invokespecial   android/support/v4/util/ArrayMap.<init>:()V
        //   322: astore          20
        //   324: iload_3        
        //   325: ifeq            497
        //   328: aload           7
        //   330: invokevirtual   android/support/v4/app/Fragment.getAllowReturnTransitionOverlap:()Z
        //   333: istore          25
        //   335: iload           25
        //   337: istore          21
        //   339: aload           9
        //   341: aload           15
        //   343: aload           10
        //   345: iload           21
        //   347: invokestatic    android/support/v4/app/FragmentTransitionCompat21.mergeTransitions:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
        //   350: astore          22
        //   352: aload           22
        //   354: ifnull          450
        //   357: aload           9
        //   359: aload           10
        //   361: aload           6
        //   363: aload           18
        //   365: aload_2        
        //   366: getfield        android/support/v4/app/BackStackRecord$TransitionState.nonExistentView:Landroid/view/View;
        //   369: aload_2        
        //   370: getfield        android/support/v4/app/BackStackRecord$TransitionState.enteringEpicenterView:Landroid/support/v4/app/FragmentTransitionCompat21$EpicenterView;
        //   373: aload_2        
        //   374: getfield        android/support/v4/app/BackStackRecord$TransitionState.nameOverrides:Landroid/support/v4/util/ArrayMap;
        //   377: aload           19
        //   379: aload           20
        //   381: aload           12
        //   383: invokestatic    android/support/v4/app/FragmentTransitionCompat21.addTransitionTargets:(Ljava/lang/Object;Ljava/lang/Object;Landroid/view/View;Landroid/support/v4/app/FragmentTransitionCompat21$ViewRetriever;Landroid/view/View;Landroid/support/v4/app/FragmentTransitionCompat21$EpicenterView;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/Map;Ljava/util/ArrayList;)V
        //   386: aload_0        
        //   387: aload           6
        //   389: aload_2        
        //   390: iload_1        
        //   391: aload           22
        //   393: invokespecial   android/support/v4/app/BackStackRecord.excludeHiddenFragmentsAfterEnter:(Landroid/view/View;Landroid/support/v4/app/BackStackRecord$TransitionState;ILjava/lang/Object;)V
        //   396: aload           22
        //   398: aload_2        
        //   399: getfield        android/support/v4/app/BackStackRecord$TransitionState.nonExistentView:Landroid/view/View;
        //   402: iconst_1       
        //   403: invokestatic    android/support/v4/app/FragmentTransitionCompat21.excludeTarget:(Ljava/lang/Object;Landroid/view/View;Z)V
        //   406: aload_0        
        //   407: aload_2        
        //   408: iload_1        
        //   409: aload           22
        //   411: invokespecial   android/support/v4/app/BackStackRecord.excludeHiddenFragments:(Landroid/support/v4/app/BackStackRecord$TransitionState;ILjava/lang/Object;)V
        //   414: aload           6
        //   416: aload           22
        //   418: invokestatic    android/support/v4/app/FragmentTransitionCompat21.beginDelayedTransition:(Landroid/view/ViewGroup;Ljava/lang/Object;)V
        //   421: aload           6
        //   423: aload_2        
        //   424: getfield        android/support/v4/app/BackStackRecord$TransitionState.nonExistentView:Landroid/view/View;
        //   427: aload           9
        //   429: aload           19
        //   431: aload           15
        //   433: aload           14
        //   435: aload           10
        //   437: aload           12
        //   439: aload           22
        //   441: aload_2        
        //   442: getfield        android/support/v4/app/BackStackRecord$TransitionState.hiddenFragmentViews:Ljava/util/ArrayList;
        //   445: aload           20
        //   447: invokestatic    android/support/v4/app/FragmentTransitionCompat21.cleanupTransitions:(Landroid/view/View;Landroid/view/View;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/Map;)V
        //   450: aload           22
        //   452: ifnull          512
        //   455: iconst_1       
        //   456: ireturn        
        //   457: astore          30
        //   459: aload           30
        //   461: athrow         
        //   462: aload           7
        //   464: getfield        android/support/v4/app/Fragment.mEnterTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
        //   467: astore          33
        //   469: goto            149
        //   472: astore          16
        //   474: aload           16
        //   476: athrow         
        //   477: astore          29
        //   479: aload           29
        //   481: athrow         
        //   482: astore          28
        //   484: aload           28
        //   486: athrow         
        //   487: astore          26
        //   489: aload           26
        //   491: athrow         
        //   492: astore          24
        //   494: aload           24
        //   496: athrow         
        //   497: aload           7
        //   499: invokevirtual   android/support/v4/app/Fragment.getAllowEnterTransitionOverlap:()Z
        //   502: istore          21
        //   504: goto            339
        //   507: astore          23
        //   509: aload           23
        //   511: athrow         
        //   512: iconst_0       
        //   513: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  117    138    457    462    Ljava/lang/IllegalStateException;
        //  142    149    457    462    Ljava/lang/IllegalStateException;
        //  210    216    472    477    Ljava/lang/IllegalStateException;
        //  254    261    477    482    Ljava/lang/IllegalStateException;
        //  266    273    482    487    Ljava/lang/IllegalStateException;
        //  290    306    487    492    Ljava/lang/IllegalStateException;
        //  328    335    492    497    Ljava/lang/IllegalStateException;
        //  357    450    507    512    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 247, Size: 247
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
    
    private void doAddOp(final int n, final Fragment fragment, final String mTag, final int cmd) {
        Label_0114: {
            Label_0109: {
                try {
                    fragment.mFragmentManager = this.mManager;
                    if (mTag == null) {
                        break Label_0114;
                    }
                    final Fragment fragment2 = fragment;
                    final String mTag2 = fragment2.mTag;
                    final String mTag3 = mTag2;
                    if (mTag3 == null) {
                        break Label_0109;
                    }
                    try {
                        final String s = mTag;
                        final Fragment fragment3 = fragment;
                        final String s2 = fragment3.mTag;
                        final boolean b = s.equals(s2);
                        if (!b) {
                            final StringBuilder sb = new StringBuilder();
                            final String[] array = BackStackRecord.z;
                            final int n2 = 50;
                            final String s3 = array[n2];
                            final StringBuilder sb2 = sb.append(s3);
                            final Fragment fragment4 = fragment;
                            final StringBuilder sb3 = sb2.append(fragment4);
                            final String[] array2 = BackStackRecord.z;
                            final int n3 = 51;
                            final String s4 = array2[n3];
                            final StringBuilder sb4 = sb3.append(s4);
                            final Fragment fragment5 = fragment;
                            final String s5 = fragment5.mTag;
                            final StringBuilder sb5 = sb4.append(s5);
                            final String[] array3 = BackStackRecord.z;
                            final int n4 = 55;
                            final String s6 = array3[n4];
                            final StringBuilder sb6 = sb5.append(s6);
                            final String s7 = mTag;
                            final StringBuilder sb7 = sb6.append(s7);
                            final String s8 = sb7.toString();
                            throw new IllegalStateException(s8);
                        }
                        break Label_0109;
                    }
                    catch (IllegalStateException ex2) {
                        throw ex2;
                    }
                }
                catch (IllegalStateException ex3) {
                    throw ex3;
                }
                try {
                    final Fragment fragment2 = fragment;
                    final String mTag3;
                    final String mTag2 = mTag3 = fragment2.mTag;
                    if (mTag3 != null) {
                        final String s = mTag;
                        final Fragment fragment3 = fragment;
                        final String s2 = fragment3.mTag;
                        final boolean b = s.equals(s2);
                        if (!b) {
                            final StringBuilder sb = new StringBuilder();
                            final String[] array = BackStackRecord.z;
                            final int n2 = 50;
                            final String s3 = array[n2];
                            final StringBuilder sb2 = sb.append(s3);
                            final Fragment fragment4 = fragment;
                            final StringBuilder sb3 = sb2.append(fragment4);
                            final String[] array2 = BackStackRecord.z;
                            final int n3 = 51;
                            final String s4 = array2[n3];
                            final StringBuilder sb4 = sb3.append(s4);
                            final Fragment fragment5 = fragment;
                            final String s5 = fragment5.mTag;
                            final StringBuilder sb5 = sb4.append(s5);
                            final String[] array3 = BackStackRecord.z;
                            final int n4 = 55;
                            final String s6 = array3[n4];
                            final StringBuilder sb6 = sb5.append(s6);
                            final String s7 = mTag;
                            final StringBuilder sb7 = sb6.append(s7);
                            final String s8 = sb7.toString();
                            throw new IllegalStateException(s8);
                        }
                    }
                }
                catch (IllegalStateException ex4) {
                    throw ex4;
                }
            }
            fragment.mTag = mTag;
        }
        if (n != 0) {
            try {
                if (fragment.mFragmentId != 0) {
                    try {
                        if (fragment.mFragmentId != n) {
                            throw new IllegalStateException(BackStackRecord.z[53] + fragment + BackStackRecord.z[54] + fragment.mFragmentId + BackStackRecord.z[52] + n);
                        }
                    }
                    catch (IllegalStateException ex5) {
                        throw ex5;
                    }
                }
            }
            catch (IllegalStateException ex6) {
                throw ex6;
            }
            fragment.mFragmentId = n;
            fragment.mContainerId = n;
        }
        final BackStackRecord$Op backStackRecord$Op = new BackStackRecord$Op();
        backStackRecord$Op.cmd = cmd;
        backStackRecord$Op.fragment = fragment;
        this.addOp(backStackRecord$Op);
    }
    
    private void excludeHiddenFragments(final BackStackRecord$TransitionState p0, final int p1, final Object p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore          4
        //     5: aload_0        
        //     6: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //     9: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //    12: ifnull          180
        //    15: iconst_0       
        //    16: istore          5
        //    18: iload           5
        //    20: aload_0        
        //    21: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    24: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //    27: invokevirtual   java/util/ArrayList.size:()I
        //    30: if_icmpge       180
        //    33: aload_0        
        //    34: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    37: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //    40: iload           5
        //    42: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    45: checkcast       Landroid/support/v4/app/Fragment;
        //    48: astore          6
        //    50: aload           6
        //    52: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //    55: astore          13
        //    57: aload           13
        //    59: ifnull          169
        //    62: aload           6
        //    64: getfield        android/support/v4/app/Fragment.mContainer:Landroid/view/ViewGroup;
        //    67: astore          15
        //    69: aload           15
        //    71: ifnull          169
        //    74: aload           6
        //    76: getfield        android/support/v4/app/Fragment.mContainerId:I
        //    79: istore          16
        //    81: iload           16
        //    83: iload_2        
        //    84: if_icmpne       169
        //    87: aload           6
        //    89: getfield        android/support/v4/app/Fragment.mHidden:Z
        //    92: istore          17
        //    94: iload           17
        //    96: ifeq            146
        //    99: aload_1        
        //   100: getfield        android/support/v4/app/BackStackRecord$TransitionState.hiddenFragmentViews:Ljava/util/ArrayList;
        //   103: aload           6
        //   105: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   108: invokevirtual   java/util/ArrayList.contains:(Ljava/lang/Object;)Z
        //   111: istore          19
        //   113: iload           19
        //   115: ifne            169
        //   118: aload_3        
        //   119: aload           6
        //   121: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   124: iconst_1       
        //   125: invokestatic    android/support/v4/app/FragmentTransitionCompat21.excludeTarget:(Ljava/lang/Object;Landroid/view/View;Z)V
        //   128: aload_1        
        //   129: getfield        android/support/v4/app/BackStackRecord$TransitionState.hiddenFragmentViews:Ljava/util/ArrayList;
        //   132: aload           6
        //   134: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   137: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   140: pop            
        //   141: iload           4
        //   143: ifeq            169
        //   146: aload_3        
        //   147: aload           6
        //   149: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   152: iconst_0       
        //   153: invokestatic    android/support/v4/app/FragmentTransitionCompat21.excludeTarget:(Ljava/lang/Object;Landroid/view/View;Z)V
        //   156: aload_1        
        //   157: getfield        android/support/v4/app/BackStackRecord$TransitionState.hiddenFragmentViews:Ljava/util/ArrayList;
        //   160: aload           6
        //   162: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   165: invokevirtual   java/util/ArrayList.remove:(Ljava/lang/Object;)Z
        //   168: pop            
        //   169: iload           5
        //   171: iconst_1       
        //   172: iadd           
        //   173: istore          14
        //   175: iload           4
        //   177: ifeq            211
        //   180: return         
        //   181: astore          7
        //   183: aload           7
        //   185: athrow         
        //   186: astore          8
        //   188: aload           8
        //   190: athrow         
        //   191: astore          9
        //   193: aload           9
        //   195: athrow         
        //   196: astore          10
        //   198: aload           10
        //   200: athrow         
        //   201: astore          11
        //   203: aload           11
        //   205: athrow         
        //   206: astore          12
        //   208: aload           12
        //   210: athrow         
        //   211: iload           14
        //   213: istore          5
        //   215: goto            18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  50     57     181    186    Ljava/lang/IllegalStateException;
        //  62     69     186    191    Ljava/lang/IllegalStateException;
        //  74     81     191    196    Ljava/lang/IllegalStateException;
        //  87     94     196    201    Ljava/lang/IllegalStateException;
        //  99     113    201    206    Ljava/lang/IllegalStateException;
        //  118    141    206    211    Ljava/lang/IllegalStateException;
        //  146    169    206    211    Ljava/lang/IllegalStateException;
        //  183    186    186    191    Ljava/lang/IllegalStateException;
        //  188    191    191    196    Ljava/lang/IllegalStateException;
        //  193    196    196    201    Ljava/lang/IllegalStateException;
        //  198    201    201    206    Ljava/lang/IllegalStateException;
        //  203    206    206    211    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 102, Size: 102
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
    
    private void excludeHiddenFragmentsAfterEnter(final View view, final BackStackRecord$TransitionState backStackRecord$TransitionState, final int n, final Object o) {
        view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new BackStackRecord$3(this, view, backStackRecord$TransitionState, n, o));
    }
    
    private static Object getEnterTransition(final Fragment fragment, final boolean b) {
        if (fragment == null) {
            return null;
        }
        while (true) {
            Label_0027: {
                if (!b) {
                    break Label_0027;
                }
                try {
                    final Object o = fragment.getReenterTransition();
                    return FragmentTransitionCompat21.cloneTransition(o);
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
            final Object o = fragment.getEnterTransition();
            continue;
        }
    }
    
    private static Object getExitTransition(final Fragment fragment, final boolean b) {
        if (fragment == null) {
            return null;
        }
        while (true) {
            Label_0027: {
                if (!b) {
                    break Label_0027;
                }
                try {
                    final Object o = fragment.getReturnTransition();
                    return FragmentTransitionCompat21.cloneTransition(o);
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
            final Object o = fragment.getExitTransition();
            continue;
        }
    }
    
    private static Object getSharedElementTransition(final Fragment fragment, final Fragment fragment2, final boolean b) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        while (true) {
            Label_0033: {
                if (!b) {
                    break Label_0033;
                }
                try {
                    final Object o = fragment2.getSharedElementReturnTransition();
                    return FragmentTransitionCompat21.cloneTransition(o);
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
            final Object o = fragment.getSharedElementEnterTransition();
            continue;
        }
    }
    
    private ArrayMap mapEnteringSharedElements(final BackStackRecord$TransitionState p0, final Fragment p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Landroid/support/v4/util/ArrayMap;
        //     3: dup            
        //     4: invokespecial   android/support/v4/util/ArrayMap.<init>:()V
        //     7: astore          4
        //     9: aload_2        
        //    10: invokevirtual   android/support/v4/app/Fragment.getView:()Landroid/view/View;
        //    13: astore          5
        //    15: aload           5
        //    17: ifnull          69
        //    20: aload_0        
        //    21: getfield        android/support/v4/app/BackStackRecord.mSharedElementSourceNames:Ljava/util/ArrayList;
        //    24: ifnull          69
        //    27: aload           4
        //    29: aload           5
        //    31: invokestatic    android/support/v4/app/FragmentTransitionCompat21.findNamedViews:(Ljava/util/Map;Landroid/view/View;)V
        //    34: iload_3        
        //    35: ifeq            59
        //    38: aload_0        
        //    39: getfield        android/support/v4/app/BackStackRecord.mSharedElementSourceNames:Ljava/util/ArrayList;
        //    42: aload_0        
        //    43: getfield        android/support/v4/app/BackStackRecord.mSharedElementTargetNames:Ljava/util/ArrayList;
        //    46: aload           4
        //    48: invokestatic    android/support/v4/app/BackStackRecord.remapNames:(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/support/v4/util/ArrayMap;)Landroid/support/v4/util/ArrayMap;
        //    51: astore          4
        //    53: getstatic       android/support/v4/app/Fragment.a:I
        //    56: ifeq            69
        //    59: aload           4
        //    61: aload_0        
        //    62: getfield        android/support/v4/app/BackStackRecord.mSharedElementTargetNames:Ljava/util/ArrayList;
        //    65: invokevirtual   android/support/v4/util/ArrayMap.retainAll:(Ljava/util/Collection;)Z
        //    68: pop            
        //    69: aload           4
        //    71: areturn        
        //    72: astore          6
        //    74: aload           6
        //    76: athrow         
        //    77: astore          7
        //    79: aload           7
        //    81: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  20     34     72     77     Ljava/lang/IllegalStateException;
        //  53     59     77     82     Ljava/lang/IllegalStateException;
        //  59     69     77     82     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0059:
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
    
    private ArrayMap mapSharedElementsIn(final BackStackRecord$TransitionState p0, final boolean p1, final Fragment p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: aload_3        
        //     3: iload_2        
        //     4: invokespecial   android/support/v4/app/BackStackRecord.mapEnteringSharedElements:(Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/support/v4/app/Fragment;Z)Landroid/support/v4/util/ArrayMap;
        //     7: astore          4
        //     9: iload_2        
        //    10: ifeq            51
        //    13: aload_3        
        //    14: getfield        android/support/v4/app/Fragment.mExitTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
        //    17: ifnull          33
        //    20: aload_3        
        //    21: getfield        android/support/v4/app/Fragment.mExitTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
        //    24: aload_0        
        //    25: getfield        android/support/v4/app/BackStackRecord.mSharedElementTargetNames:Ljava/util/ArrayList;
        //    28: aload           4
        //    30: invokevirtual   android/support/v4/app/SharedElementCallback.onMapSharedElements:(Ljava/util/List;Ljava/util/Map;)V
        //    33: aload_0        
        //    34: aload_1        
        //    35: aload           4
        //    37: iconst_1       
        //    38: invokespecial   android/support/v4/app/BackStackRecord.setBackNameOverrides:(Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/support/v4/util/ArrayMap;Z)V
        //    41: getstatic       android/support/v4/app/Fragment.a:I
        //    44: istore          8
        //    46: iload           8
        //    48: ifeq            79
        //    51: aload_3        
        //    52: getfield        android/support/v4/app/Fragment.mEnterTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
        //    55: ifnull          71
        //    58: aload_3        
        //    59: getfield        android/support/v4/app/Fragment.mEnterTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
        //    62: aload_0        
        //    63: getfield        android/support/v4/app/BackStackRecord.mSharedElementTargetNames:Ljava/util/ArrayList;
        //    66: aload           4
        //    68: invokevirtual   android/support/v4/app/SharedElementCallback.onMapSharedElements:(Ljava/util/List;Ljava/util/Map;)V
        //    71: aload_0        
        //    72: aload_1        
        //    73: aload           4
        //    75: iconst_1       
        //    76: invokespecial   android/support/v4/app/BackStackRecord.setNameOverrides:(Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/support/v4/util/ArrayMap;Z)V
        //    79: aload           4
        //    81: areturn        
        //    82: astore          6
        //    84: aload           6
        //    86: athrow         
        //    87: astore          7
        //    89: aload           7
        //    91: athrow         
        //    92: astore          5
        //    94: aload           5
        //    96: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  13     33     82     87     Ljava/lang/IllegalStateException;
        //  33     46     87     92     Ljava/lang/IllegalStateException;
        //  51     71     92     97     Ljava/lang/IllegalStateException;
        //  89     92     92     97     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 51, Size: 51
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
    
    private void prepareSharedElementTransition(final BackStackRecord$TransitionState backStackRecord$TransitionState, final View view, final Object o, final Fragment fragment, final Fragment fragment2, final boolean b, final ArrayList list) {
        view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new BackStackRecord$2(this, view, o, list, backStackRecord$TransitionState, b, fragment, fragment2));
    }
    
    private static ArrayMap remapNames(final ArrayList list, final ArrayList list2, final ArrayMap arrayMap) {
        final int a = Fragment.a;
        try {
            if (arrayMap.isEmpty()) {
                return arrayMap;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        final ArrayMap arrayMap2 = new ArrayMap();
        final int size = list.size();
        int n = 0;
        while (true) {
            if (n >= size) {
                return arrayMap2;
            }
            final View view = (View)arrayMap.get(list.get(n));
            int n2 = 0;
            Label_0081: {
                if (view == null) {
                    break Label_0081;
                }
                try {
                    arrayMap2.put(list2.get(n), view);
                    n2 = n + 1;
                    if (a != 0) {
                        return arrayMap2;
                    }
                }
                catch (IllegalStateException ex2) {
                    throw ex2;
                }
            }
            n = n2;
        }
    }
    
    private ArrayMap remapSharedElements(final BackStackRecord$TransitionState p0, final Fragment p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore          4
        //     5: new             Landroid/support/v4/util/ArrayMap;
        //     8: dup            
        //     9: invokespecial   android/support/v4/util/ArrayMap.<init>:()V
        //    12: astore          5
        //    14: aload_0        
        //    15: getfield        android/support/v4/app/BackStackRecord.mSharedElementSourceNames:Ljava/util/ArrayList;
        //    18: astore          8
        //    20: aload           8
        //    22: ifnull          68
        //    25: aload           5
        //    27: aload_2        
        //    28: invokevirtual   android/support/v4/app/Fragment.getView:()Landroid/view/View;
        //    31: invokestatic    android/support/v4/app/FragmentTransitionCompat21.findNamedViews:(Ljava/util/Map;Landroid/view/View;)V
        //    34: iload_3        
        //    35: ifeq            53
        //    38: aload           5
        //    40: aload_0        
        //    41: getfield        android/support/v4/app/BackStackRecord.mSharedElementTargetNames:Ljava/util/ArrayList;
        //    44: invokevirtual   android/support/v4/util/ArrayMap.retainAll:(Ljava/util/Collection;)Z
        //    47: pop            
        //    48: iload           4
        //    50: ifeq            68
        //    53: aload_0        
        //    54: getfield        android/support/v4/app/BackStackRecord.mSharedElementSourceNames:Ljava/util/ArrayList;
        //    57: aload_0        
        //    58: getfield        android/support/v4/app/BackStackRecord.mSharedElementTargetNames:Ljava/util/ArrayList;
        //    61: aload           5
        //    63: invokestatic    android/support/v4/app/BackStackRecord.remapNames:(Ljava/util/ArrayList;Ljava/util/ArrayList;Landroid/support/v4/util/ArrayMap;)Landroid/support/v4/util/ArrayMap;
        //    66: astore          5
        //    68: iload_3        
        //    69: ifeq            105
        //    72: aload_2        
        //    73: getfield        android/support/v4/app/Fragment.mEnterTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
        //    76: ifnull          92
        //    79: aload_2        
        //    80: getfield        android/support/v4/app/Fragment.mEnterTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
        //    83: aload_0        
        //    84: getfield        android/support/v4/app/BackStackRecord.mSharedElementTargetNames:Ljava/util/ArrayList;
        //    87: aload           5
        //    89: invokevirtual   android/support/v4/app/SharedElementCallback.onMapSharedElements:(Ljava/util/List;Ljava/util/Map;)V
        //    92: aload_0        
        //    93: aload_1        
        //    94: aload           5
        //    96: iconst_0       
        //    97: invokespecial   android/support/v4/app/BackStackRecord.setBackNameOverrides:(Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/support/v4/util/ArrayMap;Z)V
        //   100: iload           4
        //   102: ifeq            133
        //   105: aload_2        
        //   106: getfield        android/support/v4/app/Fragment.mExitTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
        //   109: ifnull          125
        //   112: aload_2        
        //   113: getfield        android/support/v4/app/Fragment.mExitTransitionCallback:Landroid/support/v4/app/SharedElementCallback;
        //   116: aload_0        
        //   117: getfield        android/support/v4/app/BackStackRecord.mSharedElementTargetNames:Ljava/util/ArrayList;
        //   120: aload           5
        //   122: invokevirtual   android/support/v4/app/SharedElementCallback.onMapSharedElements:(Ljava/util/List;Ljava/util/Map;)V
        //   125: aload_0        
        //   126: aload_1        
        //   127: aload           5
        //   129: iconst_0       
        //   130: invokespecial   android/support/v4/app/BackStackRecord.setNameOverrides:(Landroid/support/v4/app/BackStackRecord$TransitionState;Landroid/support/v4/util/ArrayMap;Z)V
        //   133: aload           5
        //   135: areturn        
        //   136: astore          6
        //   138: aload           6
        //   140: athrow         
        //   141: astore          7
        //   143: aload           7
        //   145: athrow         
        //   146: astore          10
        //   148: aload           10
        //   150: athrow         
        //   151: astore          11
        //   153: aload           11
        //   155: athrow         
        //   156: astore          9
        //   158: aload           9
        //   160: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  14     20     136    141    Ljava/lang/IllegalStateException;
        //  25     34     141    146    Ljava/lang/IllegalStateException;
        //  38     48     141    146    Ljava/lang/IllegalStateException;
        //  72     92     146    151    Ljava/lang/IllegalStateException;
        //  92     100    151    156    Ljava/lang/IllegalStateException;
        //  105    125    156    161    Ljava/lang/IllegalStateException;
        //  138    141    141    146    Ljava/lang/IllegalStateException;
        //  153    156    156    161    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 80, Size: 80
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
    
    private void setBackNameOverrides(final BackStackRecord$TransitionState p0, final ArrayMap p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore          4
        //     5: aload_0        
        //     6: getfield        android/support/v4/app/BackStackRecord.mSharedElementTargetNames:Ljava/util/ArrayList;
        //     9: astore          6
        //    11: aload           6
        //    13: ifnonnull       124
        //    16: iconst_0       
        //    17: istore          7
        //    19: iconst_0       
        //    20: istore          8
        //    22: iload           8
        //    24: iload           7
        //    26: if_icmpge       118
        //    29: aload_0        
        //    30: getfield        android/support/v4/app/BackStackRecord.mSharedElementSourceNames:Ljava/util/ArrayList;
        //    33: iload           8
        //    35: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    38: checkcast       Ljava/lang/String;
        //    41: astore          9
        //    43: aload_2        
        //    44: aload_0        
        //    45: getfield        android/support/v4/app/BackStackRecord.mSharedElementTargetNames:Ljava/util/ArrayList;
        //    48: iload           8
        //    50: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    53: checkcast       Ljava/lang/String;
        //    56: invokevirtual   android/support/v4/util/ArrayMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    59: checkcast       Landroid/view/View;
        //    62: astore          10
        //    64: aload           10
        //    66: ifnull          107
        //    69: aload           10
        //    71: invokestatic    android/support/v4/app/FragmentTransitionCompat21.getTransitionName:(Landroid/view/View;)Ljava/lang/String;
        //    74: astore          12
        //    76: iload_3        
        //    77: ifeq            96
        //    80: aload_1        
        //    81: getfield        android/support/v4/app/BackStackRecord$TransitionState.nameOverrides:Landroid/support/v4/util/ArrayMap;
        //    84: aload           9
        //    86: aload           12
        //    88: invokestatic    android/support/v4/app/BackStackRecord.setNameOverride:(Landroid/support/v4/util/ArrayMap;Ljava/lang/String;Ljava/lang/String;)V
        //    91: iload           4
        //    93: ifeq            107
        //    96: aload_1        
        //    97: getfield        android/support/v4/app/BackStackRecord$TransitionState.nameOverrides:Landroid/support/v4/util/ArrayMap;
        //   100: aload           12
        //   102: aload           9
        //   104: invokestatic    android/support/v4/app/BackStackRecord.setNameOverride:(Landroid/support/v4/util/ArrayMap;Ljava/lang/String;Ljava/lang/String;)V
        //   107: iload           8
        //   109: iconst_1       
        //   110: iadd           
        //   111: istore          11
        //   113: iload           4
        //   115: ifeq            141
        //   118: return         
        //   119: astore          5
        //   121: aload           5
        //   123: athrow         
        //   124: aload_0        
        //   125: getfield        android/support/v4/app/BackStackRecord.mSharedElementTargetNames:Ljava/util/ArrayList;
        //   128: invokevirtual   java/util/ArrayList.size:()I
        //   131: istore          7
        //   133: goto            19
        //   136: astore          13
        //   138: aload           13
        //   140: athrow         
        //   141: iload           11
        //   143: istore          8
        //   145: goto            22
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  5      11     119    124    Ljava/lang/IllegalStateException;
        //  80     91     136    141    Ljava/lang/IllegalStateException;
        //  96     107    136    141    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0096:
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
    
    private void setEpicenterIn(final ArrayMap p0, final BackStackRecord$TransitionState p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/app/BackStackRecord.mSharedElementTargetNames:Ljava/util/ArrayList;
        //     4: ifnull          49
        //     7: aload_1        
        //     8: invokevirtual   android/support/v4/util/ArrayMap.isEmpty:()Z
        //    11: istore          4
        //    13: iload           4
        //    15: ifne            49
        //    18: aload_1        
        //    19: aload_0        
        //    20: getfield        android/support/v4/app/BackStackRecord.mSharedElementTargetNames:Ljava/util/ArrayList;
        //    23: iconst_0       
        //    24: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    27: invokevirtual   android/support/v4/util/ArrayMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    30: checkcast       Landroid/view/View;
        //    33: astore          5
        //    35: aload           5
        //    37: ifnull          49
        //    40: aload_2        
        //    41: getfield        android/support/v4/app/BackStackRecord$TransitionState.enteringEpicenterView:Landroid/support/v4/app/FragmentTransitionCompat21$EpicenterView;
        //    44: aload           5
        //    46: putfield        android/support/v4/app/FragmentTransitionCompat21$EpicenterView.epicenter:Landroid/view/View;
        //    49: return         
        //    50: astore_3       
        //    51: aload_3        
        //    52: athrow         
        //    53: astore          6
        //    55: aload           6
        //    57: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      13     50     53     Ljava/lang/IllegalStateException;
        //  40     49     53     58     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0049:
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
    
    private static void setFirstOut(final SparseArray p0, final Fragment p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnull          60
        //     4: aload_1        
        //     5: getfield        android/support/v4/app/Fragment.mContainerId:I
        //     8: istore_2       
        //     9: iload_2        
        //    10: ifeq            60
        //    13: aload_1        
        //    14: invokevirtual   android/support/v4/app/Fragment.isHidden:()Z
        //    17: istore          7
        //    19: iload           7
        //    21: ifne            60
        //    24: aload_1        
        //    25: invokevirtual   android/support/v4/app/Fragment.isAdded:()Z
        //    28: istore          8
        //    30: iload           8
        //    32: ifeq            60
        //    35: aload_1        
        //    36: invokevirtual   android/support/v4/app/Fragment.getView:()Landroid/view/View;
        //    39: astore          9
        //    41: aload           9
        //    43: ifnull          60
        //    46: aload_0        
        //    47: iload_2        
        //    48: invokevirtual   android/util/SparseArray.get:(I)Ljava/lang/Object;
        //    51: ifnonnull       60
        //    54: aload_0        
        //    55: iload_2        
        //    56: aload_1        
        //    57: invokevirtual   android/util/SparseArray.put:(ILjava/lang/Object;)V
        //    60: return         
        //    61: astore_3       
        //    62: aload_3        
        //    63: athrow         
        //    64: astore          4
        //    66: aload           4
        //    68: athrow         
        //    69: astore          5
        //    71: aload           5
        //    73: athrow         
        //    74: astore          6
        //    76: aload           6
        //    78: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  13     19     61     64     Ljava/lang/IllegalStateException;
        //  24     30     64     69     Ljava/lang/IllegalStateException;
        //  35     41     69     74     Ljava/lang/IllegalStateException;
        //  46     60     74     79     Ljava/lang/IllegalStateException;
        //  62     64     64     69     Ljava/lang/IllegalStateException;
        //  66     69     69     74     Ljava/lang/IllegalStateException;
        //  71     74     74     79     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 43, Size: 43
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
    
    private void setLastIn(final SparseArray sparseArray, final Fragment fragment) {
        if (fragment == null) {
            return;
        }
        final int mContainerId = fragment.mContainerId;
        if (mContainerId == 0) {
            return;
        }
        try {
            sparseArray.put(mContainerId, (Object)fragment);
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    private static void setNameOverride(final ArrayMap p0, final String p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore_3       
        //     4: aload_1        
        //     5: ifnull          57
        //     8: aload_2        
        //     9: ifnull          57
        //    12: aload_1        
        //    13: aload_2        
        //    14: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    17: istore          5
        //    19: iload           5
        //    21: ifne            57
        //    24: iconst_0       
        //    25: istore          6
        //    27: iload           6
        //    29: aload_0        
        //    30: invokevirtual   android/support/v4/util/ArrayMap.size:()I
        //    33: if_icmpge       75
        //    36: aload_1        
        //    37: aload_0        
        //    38: iload           6
        //    40: invokevirtual   android/support/v4/util/ArrayMap.valueAt:(I)Ljava/lang/Object;
        //    43: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    46: ifeq            68
        //    49: aload_0        
        //    50: iload           6
        //    52: aload_2        
        //    53: invokevirtual   android/support/v4/util/ArrayMap.setValueAt:(ILjava/lang/Object;)Ljava/lang/Object;
        //    56: pop            
        //    57: return         
        //    58: astore          4
        //    60: aload           4
        //    62: athrow         
        //    63: astore          8
        //    65: aload           8
        //    67: athrow         
        //    68: iinc            6, 1
        //    71: iload_3        
        //    72: ifeq            27
        //    75: aload_0        
        //    76: aload_1        
        //    77: aload_2        
        //    78: invokevirtual   android/support/v4/util/ArrayMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    81: pop            
        //    82: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  12     19     58     63     Ljava/lang/IllegalStateException;
        //  36     57     63     68     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0057:
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
    
    private void setNameOverrides(final BackStackRecord$TransitionState backStackRecord$TransitionState, final ArrayMap arrayMap, final boolean b) {
        final int a = Fragment.a;
        final int size = arrayMap.size();
        int n = 0;
        while (true) {
            if (n >= size) {
                return;
            }
            final String s = (String)arrayMap.keyAt(n);
            final String transitionName = FragmentTransitionCompat21.getTransitionName((View)arrayMap.valueAt(n));
            int n2 = 0;
            Label_0066: {
                if (!b) {
                    break Label_0066;
                }
                try {
                    setNameOverride(backStackRecord$TransitionState.nameOverrides, s, transitionName);
                    if (a != 0) {
                        setNameOverride(backStackRecord$TransitionState.nameOverrides, transitionName, s);
                    }
                    n2 = n + 1;
                    if (a != 0) {
                        return;
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
            }
            n = n2;
        }
    }
    
    private static void setNameOverrides(final BackStackRecord$TransitionState backStackRecord$TransitionState, final ArrayList list, final ArrayList list2) {
        final int a = Fragment.a;
        if (list != null) {
            int n;
            for (int i = 0; i < list.size(); i = n) {
                setNameOverride(backStackRecord$TransitionState.nameOverrides, list.get(i), list2.get(i));
                n = i + 1;
                if (a != 0) {
                    break;
                }
            }
        }
    }
    
    @Override
    public FragmentTransaction add(final int n, final Fragment fragment) {
        this.doAddOp(n, fragment, null, 1);
        return this;
    }
    
    @Override
    public FragmentTransaction add(final int n, final Fragment fragment, final String s) {
        this.doAddOp(n, fragment, s, 1);
        return this;
    }
    
    @Override
    public FragmentTransaction add(final Fragment fragment, final String s) {
        this.doAddOp(0, fragment, s, 1);
        return this;
    }
    
    void addOp(final BackStackRecord$Op p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/app/BackStackRecord.mHead:Landroid/support/v4/app/BackStackRecord$Op;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnonnull       27
        //    11: aload_0        
        //    12: aload_1        
        //    13: putfield        android/support/v4/app/BackStackRecord.mTail:Landroid/support/v4/app/BackStackRecord$Op;
        //    16: aload_0        
        //    17: aload_1        
        //    18: putfield        android/support/v4/app/BackStackRecord.mHead:Landroid/support/v4/app/BackStackRecord$Op;
        //    21: getstatic       android/support/v4/app/Fragment.a:I
        //    24: ifeq            48
        //    27: aload_1        
        //    28: aload_0        
        //    29: getfield        android/support/v4/app/BackStackRecord.mTail:Landroid/support/v4/app/BackStackRecord$Op;
        //    32: putfield        android/support/v4/app/BackStackRecord$Op.prev:Landroid/support/v4/app/BackStackRecord$Op;
        //    35: aload_0        
        //    36: getfield        android/support/v4/app/BackStackRecord.mTail:Landroid/support/v4/app/BackStackRecord$Op;
        //    39: aload_1        
        //    40: putfield        android/support/v4/app/BackStackRecord$Op.next:Landroid/support/v4/app/BackStackRecord$Op;
        //    43: aload_0        
        //    44: aload_1        
        //    45: putfield        android/support/v4/app/BackStackRecord.mTail:Landroid/support/v4/app/BackStackRecord$Op;
        //    48: aload_1        
        //    49: aload_0        
        //    50: getfield        android/support/v4/app/BackStackRecord.mEnterAnim:I
        //    53: putfield        android/support/v4/app/BackStackRecord$Op.enterAnim:I
        //    56: aload_1        
        //    57: aload_0        
        //    58: getfield        android/support/v4/app/BackStackRecord.mExitAnim:I
        //    61: putfield        android/support/v4/app/BackStackRecord$Op.exitAnim:I
        //    64: aload_1        
        //    65: aload_0        
        //    66: getfield        android/support/v4/app/BackStackRecord.mPopEnterAnim:I
        //    69: putfield        android/support/v4/app/BackStackRecord$Op.popEnterAnim:I
        //    72: aload_1        
        //    73: aload_0        
        //    74: getfield        android/support/v4/app/BackStackRecord.mPopExitAnim:I
        //    77: putfield        android/support/v4/app/BackStackRecord$Op.popExitAnim:I
        //    80: aload_0        
        //    81: iconst_1       
        //    82: aload_0        
        //    83: getfield        android/support/v4/app/BackStackRecord.mNumOp:I
        //    86: iadd           
        //    87: putfield        android/support/v4/app/BackStackRecord.mNumOp:I
        //    90: return         
        //    91: astore_2       
        //    92: aload_2        
        //    93: athrow         
        //    94: astore_3       
        //    95: aload_3        
        //    96: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      91     94     Ljava/lang/IllegalStateException;
        //  11     27     94     97     Ljava/lang/IllegalStateException;
        //  27     48     94     97     Ljava/lang/IllegalStateException;
        //  92     94     94     97     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0027:
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
    public FragmentTransaction attach(final Fragment fragment) {
        final BackStackRecord$Op backStackRecord$Op = new BackStackRecord$Op();
        backStackRecord$Op.cmd = 7;
        backStackRecord$Op.fragment = fragment;
        this.addOp(backStackRecord$Op);
        return this;
    }
    
    void bumpBackStackNesting(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        android/support/v4/app/BackStackRecord.mAddToBackStack:Z
        //     8: istore          4
        //    10: iload           4
        //    12: ifne            19
        //    15: return         
        //    16: astore_3       
        //    17: aload_3        
        //    18: athrow         
        //    19: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //    22: ifeq            71
        //    25: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    28: bipush          7
        //    30: aaload         
        //    31: new             Ljava/lang/StringBuilder;
        //    34: dup            
        //    35: invokespecial   java/lang/StringBuilder.<init>:()V
        //    38: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    41: bipush          9
        //    43: aaload         
        //    44: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    47: aload_0        
        //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    51: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    54: bipush          13
        //    56: aaload         
        //    57: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    60: iload_1        
        //    61: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    64: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    67: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    70: pop            
        //    71: aload_0        
        //    72: getfield        android/support/v4/app/BackStackRecord.mHead:Landroid/support/v4/app/BackStackRecord$Op;
        //    75: astore          6
        //    77: aload           6
        //    79: ifnull          15
        //    82: aload           6
        //    84: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //    87: astore          9
        //    89: aload           9
        //    91: ifnull          175
        //    94: aload           6
        //    96: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //    99: astore          16
        //   101: aload           16
        //   103: iload_1        
        //   104: aload           16
        //   106: getfield        android/support/v4/app/Fragment.mBackStackNesting:I
        //   109: iadd           
        //   110: putfield        android/support/v4/app/Fragment.mBackStackNesting:I
        //   113: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   116: ifeq            175
        //   119: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   122: bipush          8
        //   124: aaload         
        //   125: new             Ljava/lang/StringBuilder;
        //   128: dup            
        //   129: invokespecial   java/lang/StringBuilder.<init>:()V
        //   132: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   135: iconst_5       
        //   136: aaload         
        //   137: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   140: aload           6
        //   142: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   145: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   148: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   151: bipush          10
        //   153: aaload         
        //   154: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   157: aload           6
        //   159: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   162: getfield        android/support/v4/app/Fragment.mBackStackNesting:I
        //   165: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   168: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   171: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   174: pop            
        //   175: aload           6
        //   177: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   180: ifnull          294
        //   183: iconst_m1      
        //   184: aload           6
        //   186: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   189: invokevirtual   java/util/ArrayList.size:()I
        //   192: iadd           
        //   193: istore          11
        //   195: iload           11
        //   197: iflt            294
        //   200: aload           6
        //   202: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   205: iload           11
        //   207: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   210: checkcast       Landroid/support/v4/app/Fragment;
        //   213: astore          12
        //   215: aload           12
        //   217: iload_1        
        //   218: aload           12
        //   220: getfield        android/support/v4/app/Fragment.mBackStackNesting:I
        //   223: iadd           
        //   224: putfield        android/support/v4/app/Fragment.mBackStackNesting:I
        //   227: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   230: ifeq            284
        //   233: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   236: bipush          12
        //   238: aaload         
        //   239: new             Ljava/lang/StringBuilder;
        //   242: dup            
        //   243: invokespecial   java/lang/StringBuilder.<init>:()V
        //   246: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   249: bipush          6
        //   251: aaload         
        //   252: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   255: aload           12
        //   257: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   260: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   263: bipush          11
        //   265: aaload         
        //   266: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   269: aload           12
        //   271: getfield        android/support/v4/app/Fragment.mBackStackNesting:I
        //   274: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   277: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   280: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   283: pop            
        //   284: iload           11
        //   286: iconst_1       
        //   287: isub           
        //   288: istore          14
        //   290: iload_2        
        //   291: ifeq            332
        //   294: aload           6
        //   296: getfield        android/support/v4/app/BackStackRecord$Op.next:Landroid/support/v4/app/BackStackRecord$Op;
        //   299: astore          10
        //   301: iload_2        
        //   302: ifne            15
        //   305: aload           10
        //   307: astore          6
        //   309: goto            77
        //   312: astore          5
        //   314: aload           5
        //   316: athrow         
        //   317: astore          7
        //   319: aload           7
        //   321: athrow         
        //   322: astore          8
        //   324: aload           8
        //   326: athrow         
        //   327: astore          13
        //   329: aload           13
        //   331: athrow         
        //   332: iload           14
        //   334: istore          11
        //   336: goto            195
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      10     16     19     Ljava/lang/IllegalStateException;
        //  19     71     312    317    Ljava/lang/IllegalStateException;
        //  82     89     317    322    Ljava/lang/IllegalStateException;
        //  94     175    322    327    Ljava/lang/IllegalStateException;
        //  215    284    327    332    Ljava/lang/IllegalStateException;
        //  319    322    322    327    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 155, Size: 155
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
    
    public void calculateBackFragments(final SparseArray p0, final SparseArray p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //     8: getfield        android/support/v4/app/FragmentManagerImpl.mContainer:Landroid/support/v4/app/FragmentContainer;
        //    11: invokeinterface android/support/v4/app/FragmentContainer.hasView:()Z
        //    16: istore          5
        //    18: iload           5
        //    20: ifne            29
        //    23: return         
        //    24: astore          4
        //    26: aload           4
        //    28: athrow         
        //    29: aload_0        
        //    30: getfield        android/support/v4/app/BackStackRecord.mHead:Landroid/support/v4/app/BackStackRecord$Op;
        //    33: astore          6
        //    35: aload           6
        //    37: ifnull          23
        //    40: aload           6
        //    42: getfield        android/support/v4/app/BackStackRecord$Op.cmd:I
        //    45: istore          9
        //    47: iload           9
        //    49: tableswitch {
        //                2: 110
        //                3: 123
        //                4: 193
        //                5: 207
        //                6: 221
        //                7: 234
        //                8: 248
        //          default: 92
        //        }
        //    92: aload           6
        //    94: getfield        android/support/v4/app/BackStackRecord$Op.next:Landroid/support/v4/app/BackStackRecord$Op;
        //    97: astore          11
        //    99: iload_3        
        //   100: ifne            23
        //   103: aload           11
        //   105: astore          6
        //   107: goto            35
        //   110: aload_1        
        //   111: aload           6
        //   113: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   116: invokestatic    android/support/v4/app/BackStackRecord.setFirstOut:(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
        //   119: iload_3        
        //   120: ifeq            92
        //   123: aload           6
        //   125: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   128: astore          15
        //   130: aload           15
        //   132: ifnull          180
        //   135: iconst_m1      
        //   136: aload           6
        //   138: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   141: invokevirtual   java/util/ArrayList.size:()I
        //   144: iadd           
        //   145: istore          17
        //   147: iload           17
        //   149: iflt            180
        //   152: aload_0        
        //   153: aload_2        
        //   154: aload           6
        //   156: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   159: iload           17
        //   161: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   164: checkcast       Landroid/support/v4/app/Fragment;
        //   167: invokespecial   android/support/v4/app/BackStackRecord.setLastIn:(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
        //   170: iload           17
        //   172: iconst_1       
        //   173: isub           
        //   174: istore          18
        //   176: iload_3        
        //   177: ifeq            295
        //   180: aload_1        
        //   181: aload           6
        //   183: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   186: invokestatic    android/support/v4/app/BackStackRecord.setFirstOut:(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
        //   189: iload_3        
        //   190: ifeq            92
        //   193: aload_0        
        //   194: aload_2        
        //   195: aload           6
        //   197: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   200: invokespecial   android/support/v4/app/BackStackRecord.setLastIn:(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
        //   203: iload_3        
        //   204: ifeq            92
        //   207: aload_0        
        //   208: aload_2        
        //   209: aload           6
        //   211: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   214: invokespecial   android/support/v4/app/BackStackRecord.setLastIn:(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
        //   217: iload_3        
        //   218: ifeq            92
        //   221: aload_1        
        //   222: aload           6
        //   224: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   227: invokestatic    android/support/v4/app/BackStackRecord.setFirstOut:(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
        //   230: iload_3        
        //   231: ifeq            92
        //   234: aload_0        
        //   235: aload_2        
        //   236: aload           6
        //   238: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   241: invokespecial   android/support/v4/app/BackStackRecord.setLastIn:(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
        //   244: iload_3        
        //   245: ifeq            92
        //   248: aload_1        
        //   249: aload           6
        //   251: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   254: invokestatic    android/support/v4/app/BackStackRecord.setFirstOut:(Landroid/util/SparseArray;Landroid/support/v4/app/Fragment;)V
        //   257: goto            92
        //   260: astore          10
        //   262: aload           10
        //   264: athrow         
        //   265: astore          7
        //   267: aload           7
        //   269: athrow         
        //   270: astore          8
        //   272: aload           8
        //   274: athrow         
        //   275: astore          16
        //   277: aload           16
        //   279: athrow         
        //   280: astore          14
        //   282: aload           14
        //   284: athrow         
        //   285: astore          13
        //   287: aload           13
        //   289: athrow         
        //   290: astore          12
        //   292: aload           12
        //   294: athrow         
        //   295: iload           18
        //   297: istore          17
        //   299: goto            147
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      18     24     29     Ljava/lang/IllegalStateException;
        //  40     47     265    270    Ljava/lang/IllegalStateException;
        //  110    119    270    275    Ljava/lang/IllegalStateException;
        //  123    130    270    275    Ljava/lang/IllegalStateException;
        //  180    189    275    280    Ljava/lang/IllegalStateException;
        //  193    203    280    285    Ljava/lang/IllegalStateException;
        //  207    217    285    290    Ljava/lang/IllegalStateException;
        //  221    230    290    295    Ljava/lang/IllegalStateException;
        //  234    244    260    265    Ljava/lang/IllegalStateException;
        //  248    257    260    265    Ljava/lang/IllegalStateException;
        //  267    270    270    275    Ljava/lang/IllegalStateException;
        //  277    280    280    285    Ljava/lang/IllegalStateException;
        //  282    285    285    290    Ljava/lang/IllegalStateException;
        //  287    290    290    295    Ljava/lang/IllegalStateException;
        //  292    295    260    265    Ljava/lang/IllegalStateException;
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
    public int commit() {
        return this.commitInternal(false);
    }
    
    @Override
    public int commitAllowingStateLoss() {
        return this.commitInternal(true);
    }
    
    int commitInternal(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/app/BackStackRecord.mCommitted:Z
        //     4: ifeq            24
        //     7: new             Ljava/lang/IllegalStateException;
        //    10: dup            
        //    11: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    14: bipush          67
        //    16: aaload         
        //    17: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    20: athrow         
        //    21: astore_2       
        //    22: aload_2        
        //    23: athrow         
        //    24: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //    27: ifeq            99
        //    30: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    33: bipush          69
        //    35: aaload         
        //    36: new             Ljava/lang/StringBuilder;
        //    39: dup            
        //    40: invokespecial   java/lang/StringBuilder.<init>:()V
        //    43: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    46: bipush          70
        //    48: aaload         
        //    49: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    52: aload_0        
        //    53: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    56: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    59: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    62: pop            
        //    63: new             Ljava/io/PrintWriter;
        //    66: dup            
        //    67: new             Landroid/support/v4/util/LogWriter;
        //    70: dup            
        //    71: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    74: bipush          66
        //    76: aaload         
        //    77: invokespecial   android/support/v4/util/LogWriter.<init>:(Ljava/lang/String;)V
        //    80: invokespecial   java/io/PrintWriter.<init>:(Ljava/io/Writer;)V
        //    83: astore          7
        //    85: aload_0        
        //    86: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    89: bipush          68
        //    91: aaload         
        //    92: aconst_null    
        //    93: aload           7
        //    95: aconst_null    
        //    96: invokevirtual   android/support/v4/app/BackStackRecord.dump:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
        //    99: aload_0        
        //   100: iconst_1       
        //   101: putfield        android/support/v4/app/BackStackRecord.mCommitted:Z
        //   104: aload_0        
        //   105: getfield        android/support/v4/app/BackStackRecord.mAddToBackStack:Z
        //   108: istore          5
        //   110: iload           5
        //   112: ifeq            133
        //   115: aload_0        
        //   116: aload_0        
        //   117: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   120: aload_0        
        //   121: invokevirtual   android/support/v4/app/FragmentManagerImpl.allocBackStackIndex:(Landroid/support/v4/app/BackStackRecord;)I
        //   124: putfield        android/support/v4/app/BackStackRecord.mIndex:I
        //   127: getstatic       android/support/v4/app/Fragment.a:I
        //   130: ifeq            138
        //   133: aload_0        
        //   134: iconst_m1      
        //   135: putfield        android/support/v4/app/BackStackRecord.mIndex:I
        //   138: aload_0        
        //   139: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   142: aload_0        
        //   143: iload_1        
        //   144: invokevirtual   android/support/v4/app/FragmentManagerImpl.enqueueAction:(Ljava/lang/Runnable;Z)V
        //   147: aload_0        
        //   148: getfield        android/support/v4/app/BackStackRecord.mIndex:I
        //   151: ireturn        
        //   152: astore_3       
        //   153: aload_3        
        //   154: athrow         
        //   155: astore          4
        //   157: aload           4
        //   159: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      21     21     24     Ljava/lang/IllegalStateException;
        //  99     110    152    155    Ljava/lang/IllegalStateException;
        //  115    133    155    160    Ljava/lang/IllegalStateException;
        //  133    138    155    160    Ljava/lang/IllegalStateException;
        //  153    155    155    160    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0133:
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
    public FragmentTransaction detach(final Fragment fragment) {
        final BackStackRecord$Op backStackRecord$Op = new BackStackRecord$Op();
        backStackRecord$Op.cmd = 6;
        backStackRecord$Op.fragment = fragment;
        this.addOp(backStackRecord$Op);
        return this;
    }
    
    public void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        this.dump(s, printWriter, true);
    }
    
    public void dump(final String p0, final PrintWriter p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore          4
        //     5: iload_3        
        //     6: ifeq            376
        //     9: aload_2        
        //    10: aload_1        
        //    11: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    14: aload_2        
        //    15: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    18: bipush          25
        //    20: aaload         
        //    21: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    24: aload_2        
        //    25: aload_0        
        //    26: getfield        android/support/v4/app/BackStackRecord.mName:Ljava/lang/String;
        //    29: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    32: aload_2        
        //    33: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    36: bipush          26
        //    38: aaload         
        //    39: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    42: aload_2        
        //    43: aload_0        
        //    44: getfield        android/support/v4/app/BackStackRecord.mIndex:I
        //    47: invokevirtual   java/io/PrintWriter.print:(I)V
        //    50: aload_2        
        //    51: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    54: bipush          37
        //    56: aaload         
        //    57: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    60: aload_2        
        //    61: aload_0        
        //    62: getfield        android/support/v4/app/BackStackRecord.mCommitted:Z
        //    65: invokevirtual   java/io/PrintWriter.println:(Z)V
        //    68: aload_0        
        //    69: getfield        android/support/v4/app/BackStackRecord.mTransition:I
        //    72: ifeq            122
        //    75: aload_2        
        //    76: aload_1        
        //    77: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    80: aload_2        
        //    81: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    84: bipush          23
        //    86: aaload         
        //    87: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    90: aload_2        
        //    91: aload_0        
        //    92: getfield        android/support/v4/app/BackStackRecord.mTransition:I
        //    95: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //    98: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   101: aload_2        
        //   102: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   105: bipush          28
        //   107: aaload         
        //   108: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   111: aload_2        
        //   112: aload_0        
        //   113: getfield        android/support/v4/app/BackStackRecord.mTransitionStyle:I
        //   116: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   119: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   122: aload_0        
        //   123: getfield        android/support/v4/app/BackStackRecord.mEnterAnim:I
        //   126: istore          28
        //   128: iload           28
        //   130: ifne            140
        //   133: aload_0        
        //   134: getfield        android/support/v4/app/BackStackRecord.mExitAnim:I
        //   137: ifeq            187
        //   140: aload_2        
        //   141: aload_1        
        //   142: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   145: aload_2        
        //   146: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   149: bipush          20
        //   151: aaload         
        //   152: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   155: aload_2        
        //   156: aload_0        
        //   157: getfield        android/support/v4/app/BackStackRecord.mEnterAnim:I
        //   160: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   163: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   166: aload_2        
        //   167: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   170: bipush          35
        //   172: aaload         
        //   173: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   176: aload_2        
        //   177: aload_0        
        //   178: getfield        android/support/v4/app/BackStackRecord.mExitAnim:I
        //   181: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   184: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   187: aload_0        
        //   188: getfield        android/support/v4/app/BackStackRecord.mPopEnterAnim:I
        //   191: istore          31
        //   193: iload           31
        //   195: ifne            205
        //   198: aload_0        
        //   199: getfield        android/support/v4/app/BackStackRecord.mPopExitAnim:I
        //   202: ifeq            252
        //   205: aload_2        
        //   206: aload_1        
        //   207: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   210: aload_2        
        //   211: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   214: bipush          30
        //   216: aaload         
        //   217: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   220: aload_2        
        //   221: aload_0        
        //   222: getfield        android/support/v4/app/BackStackRecord.mPopEnterAnim:I
        //   225: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   228: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   231: aload_2        
        //   232: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   235: bipush          31
        //   237: aaload         
        //   238: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   241: aload_2        
        //   242: aload_0        
        //   243: getfield        android/support/v4/app/BackStackRecord.mPopExitAnim:I
        //   246: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   249: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   252: aload_0        
        //   253: getfield        android/support/v4/app/BackStackRecord.mBreadCrumbTitleRes:I
        //   256: istore          34
        //   258: iload           34
        //   260: ifne            270
        //   263: aload_0        
        //   264: getfield        android/support/v4/app/BackStackRecord.mBreadCrumbTitleText:Ljava/lang/CharSequence;
        //   267: ifnull          314
        //   270: aload_2        
        //   271: aload_1        
        //   272: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   275: aload_2        
        //   276: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   279: bipush          24
        //   281: aaload         
        //   282: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   285: aload_2        
        //   286: aload_0        
        //   287: getfield        android/support/v4/app/BackStackRecord.mBreadCrumbTitleRes:I
        //   290: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   293: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   296: aload_2        
        //   297: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   300: bipush          15
        //   302: aaload         
        //   303: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   306: aload_2        
        //   307: aload_0        
        //   308: getfield        android/support/v4/app/BackStackRecord.mBreadCrumbTitleText:Ljava/lang/CharSequence;
        //   311: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   314: aload_0        
        //   315: getfield        android/support/v4/app/BackStackRecord.mBreadCrumbShortTitleRes:I
        //   318: istore          37
        //   320: iload           37
        //   322: ifne            332
        //   325: aload_0        
        //   326: getfield        android/support/v4/app/BackStackRecord.mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
        //   329: ifnull          376
        //   332: aload_2        
        //   333: aload_1        
        //   334: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   337: aload_2        
        //   338: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   341: bipush          39
        //   343: aaload         
        //   344: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   347: aload_2        
        //   348: aload_0        
        //   349: getfield        android/support/v4/app/BackStackRecord.mBreadCrumbShortTitleRes:I
        //   352: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   355: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   358: aload_2        
        //   359: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   362: bipush          34
        //   364: aaload         
        //   365: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   368: aload_2        
        //   369: aload_0        
        //   370: getfield        android/support/v4/app/BackStackRecord.mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
        //   373: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   376: aload_0        
        //   377: getfield        android/support/v4/app/BackStackRecord.mHead:Landroid/support/v4/app/BackStackRecord$Op;
        //   380: ifnull          879
        //   383: aload_2        
        //   384: aload_1        
        //   385: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   388: aload_2        
        //   389: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   392: bipush          40
        //   394: aaload         
        //   395: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   398: new             Ljava/lang/StringBuilder;
        //   401: dup            
        //   402: invokespecial   java/lang/StringBuilder.<init>:()V
        //   405: aload_1        
        //   406: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   409: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   412: bipush          42
        //   414: aaload         
        //   415: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   418: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   421: astore          5
        //   423: aload_0        
        //   424: getfield        android/support/v4/app/BackStackRecord.mHead:Landroid/support/v4/app/BackStackRecord$Op;
        //   427: astore          6
        //   429: iconst_0       
        //   430: istore          7
        //   432: aload           6
        //   434: astore          8
        //   436: aload           8
        //   438: ifnull          879
        //   441: aload           8
        //   443: getfield        android/support/v4/app/BackStackRecord$Op.cmd:I
        //   446: tableswitch {
        //                0: 925
        //                1: 938
        //                2: 951
        //                3: 964
        //                4: 977
        //                5: 990
        //                6: 1003
        //                7: 1016
        //          default: 492
        //        }
        //   492: new             Ljava/lang/StringBuilder;
        //   495: dup            
        //   496: invokespecial   java/lang/StringBuilder.<init>:()V
        //   499: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   502: bipush          47
        //   504: aaload         
        //   505: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   508: aload           8
        //   510: getfield        android/support/v4/app/BackStackRecord$Op.cmd:I
        //   513: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   516: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   519: astore          9
        //   521: aload_2        
        //   522: aload_1        
        //   523: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   526: aload_2        
        //   527: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   530: bipush          17
        //   532: aaload         
        //   533: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   536: aload_2        
        //   537: iload           7
        //   539: invokevirtual   java/io/PrintWriter.print:(I)V
        //   542: aload_2        
        //   543: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   546: bipush          21
        //   548: aaload         
        //   549: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   552: aload_2        
        //   553: aload           9
        //   555: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   558: aload_2        
        //   559: ldc_w           " "
        //   562: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   565: aload_2        
        //   566: aload           8
        //   568: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   571: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   574: iload_3        
        //   575: ifeq            716
        //   578: aload           8
        //   580: getfield        android/support/v4/app/BackStackRecord$Op.enterAnim:I
        //   583: istore          21
        //   585: iload           21
        //   587: ifne            598
        //   590: aload           8
        //   592: getfield        android/support/v4/app/BackStackRecord$Op.exitAnim:I
        //   595: ifeq            647
        //   598: aload_2        
        //   599: aload_1        
        //   600: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   603: aload_2        
        //   604: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   607: bipush          45
        //   609: aaload         
        //   610: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   613: aload_2        
        //   614: aload           8
        //   616: getfield        android/support/v4/app/BackStackRecord$Op.enterAnim:I
        //   619: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   622: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   625: aload_2        
        //   626: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   629: bipush          27
        //   631: aaload         
        //   632: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   635: aload_2        
        //   636: aload           8
        //   638: getfield        android/support/v4/app/BackStackRecord$Op.exitAnim:I
        //   641: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   644: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   647: aload           8
        //   649: getfield        android/support/v4/app/BackStackRecord$Op.popEnterAnim:I
        //   652: istore          24
        //   654: iload           24
        //   656: ifne            667
        //   659: aload           8
        //   661: getfield        android/support/v4/app/BackStackRecord$Op.popExitAnim:I
        //   664: ifeq            716
        //   667: aload_2        
        //   668: aload_1        
        //   669: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   672: aload_2        
        //   673: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   676: bipush          43
        //   678: aaload         
        //   679: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   682: aload_2        
        //   683: aload           8
        //   685: getfield        android/support/v4/app/BackStackRecord$Op.popEnterAnim:I
        //   688: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   691: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   694: aload_2        
        //   695: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   698: bipush          44
        //   700: aaload         
        //   701: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   704: aload_2        
        //   705: aload           8
        //   707: getfield        android/support/v4/app/BackStackRecord$Op.popExitAnim:I
        //   710: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   713: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   716: aload           8
        //   718: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   721: ifnull          861
        //   724: aload           8
        //   726: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   729: invokevirtual   java/util/ArrayList.size:()I
        //   732: istore          15
        //   734: iload           15
        //   736: ifle            861
        //   739: iconst_0       
        //   740: istore          16
        //   742: iload           16
        //   744: aload           8
        //   746: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   749: invokevirtual   java/util/ArrayList.size:()I
        //   752: if_icmpge       861
        //   755: aload_2        
        //   756: aload           5
        //   758: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   761: aload           8
        //   763: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   766: invokevirtual   java/util/ArrayList.size:()I
        //   769: istore          20
        //   771: iload           20
        //   773: iconst_1       
        //   774: if_icmpne       792
        //   777: aload_2        
        //   778: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   781: bipush          22
        //   783: aaload         
        //   784: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   787: iload           4
        //   789: ifeq            839
        //   792: iload           16
        //   794: ifne            807
        //   797: aload_2        
        //   798: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   801: bipush          46
        //   803: aaload         
        //   804: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   807: aload_2        
        //   808: aload           5
        //   810: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   813: aload_2        
        //   814: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   817: bipush          14
        //   819: aaload         
        //   820: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   823: aload_2        
        //   824: iload           16
        //   826: invokevirtual   java/io/PrintWriter.print:(I)V
        //   829: aload_2        
        //   830: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   833: bipush          19
        //   835: aaload         
        //   836: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   839: aload_2        
        //   840: aload           8
        //   842: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   845: iload           16
        //   847: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   850: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   853: iinc            16, 1
        //   856: iload           4
        //   858: ifeq            742
        //   861: aload           8
        //   863: getfield        android/support/v4/app/BackStackRecord$Op.next:Landroid/support/v4/app/BackStackRecord$Op;
        //   866: astore          8
        //   868: iload           7
        //   870: iconst_1       
        //   871: iadd           
        //   872: istore          14
        //   874: iload           4
        //   876: ifeq            1077
        //   879: return         
        //   880: astore          25
        //   882: aload           25
        //   884: athrow         
        //   885: astore          26
        //   887: aload           26
        //   889: athrow         
        //   890: astore          27
        //   892: aload           27
        //   894: athrow         
        //   895: astore          29
        //   897: aload           29
        //   899: athrow         
        //   900: astore          30
        //   902: aload           30
        //   904: athrow         
        //   905: astore          32
        //   907: aload           32
        //   909: athrow         
        //   910: astore          33
        //   912: aload           33
        //   914: athrow         
        //   915: astore          35
        //   917: aload           35
        //   919: athrow         
        //   920: astore          36
        //   922: aload           36
        //   924: athrow         
        //   925: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   928: bipush          38
        //   930: aaload         
        //   931: astore          9
        //   933: iload           4
        //   935: ifeq            521
        //   938: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   941: bipush          32
        //   943: aaload         
        //   944: astore          9
        //   946: iload           4
        //   948: ifeq            521
        //   951: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   954: bipush          33
        //   956: aaload         
        //   957: astore          9
        //   959: iload           4
        //   961: ifeq            521
        //   964: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   967: bipush          18
        //   969: aaload         
        //   970: astore          9
        //   972: iload           4
        //   974: ifeq            521
        //   977: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   980: bipush          16
        //   982: aaload         
        //   983: astore          9
        //   985: iload           4
        //   987: ifeq            521
        //   990: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   993: bipush          29
        //   995: aaload         
        //   996: astore          9
        //   998: iload           4
        //  1000: ifeq            521
        //  1003: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //  1006: bipush          36
        //  1008: aaload         
        //  1009: astore          9
        //  1011: iload           4
        //  1013: ifeq            521
        //  1016: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //  1019: bipush          41
        //  1021: aaload         
        //  1022: astore          9
        //  1024: iload           4
        //  1026: ifeq            521
        //  1029: goto            492
        //  1032: astore          10
        //  1034: aload           10
        //  1036: athrow         
        //  1037: astore          11
        //  1039: aload           11
        //  1041: athrow         
        //  1042: astore          12
        //  1044: aload           12
        //  1046: athrow         
        //  1047: astore          22
        //  1049: aload           22
        //  1051: athrow         
        //  1052: astore          23
        //  1054: aload           23
        //  1056: athrow         
        //  1057: astore          13
        //  1059: aload           13
        //  1061: athrow         
        //  1062: astore          17
        //  1064: aload           17
        //  1066: athrow         
        //  1067: astore          18
        //  1069: aload           18
        //  1071: athrow         
        //  1072: astore          19
        //  1074: aload           19
        //  1076: athrow         
        //  1077: iload           14
        //  1079: istore          7
        //  1081: goto            436
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  9      122    880    885    Ljava/lang/IllegalStateException;
        //  122    128    885    890    Ljava/lang/IllegalStateException;
        //  133    140    890    895    Ljava/lang/IllegalStateException;
        //  140    187    890    895    Ljava/lang/IllegalStateException;
        //  187    193    895    900    Ljava/lang/IllegalStateException;
        //  198    205    900    905    Ljava/lang/IllegalStateException;
        //  205    252    900    905    Ljava/lang/IllegalStateException;
        //  252    258    905    910    Ljava/lang/IllegalStateException;
        //  263    270    910    915    Ljava/lang/IllegalStateException;
        //  270    314    910    915    Ljava/lang/IllegalStateException;
        //  314    320    915    920    Ljava/lang/IllegalStateException;
        //  325    332    920    925    Ljava/lang/IllegalStateException;
        //  332    376    920    925    Ljava/lang/IllegalStateException;
        //  521    574    1032   1037   Ljava/lang/IllegalStateException;
        //  578    585    1037   1042   Ljava/lang/IllegalStateException;
        //  590    598    1042   1047   Ljava/lang/IllegalStateException;
        //  598    647    1042   1047   Ljava/lang/IllegalStateException;
        //  647    654    1047   1052   Ljava/lang/IllegalStateException;
        //  659    667    1052   1057   Ljava/lang/IllegalStateException;
        //  667    716    1052   1057   Ljava/lang/IllegalStateException;
        //  716    734    1057   1062   Ljava/lang/IllegalStateException;
        //  755    771    1062   1067   Ljava/lang/IllegalStateException;
        //  777    787    1067   1072   Ljava/lang/IllegalStateException;
        //  797    807    1072   1077   Ljava/lang/IllegalStateException;
        //  887    890    890    895    Ljava/lang/IllegalStateException;
        //  897    900    900    905    Ljava/lang/IllegalStateException;
        //  907    910    910    915    Ljava/lang/IllegalStateException;
        //  917    920    920    925    Ljava/lang/IllegalStateException;
        //  1034   1037   1037   1042   Ljava/lang/IllegalStateException;
        //  1039   1042   1042   1047   Ljava/lang/IllegalStateException;
        //  1049   1052   1052   1057   Ljava/lang/IllegalStateException;
        //  1064   1067   1067   1072   Ljava/lang/IllegalStateException;
        //  1069   1072   1072   1077   Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 499, Size: 499
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
    
    public String getName() {
        return this.mName;
    }
    
    public BackStackRecord$TransitionState popFromBackStack(final boolean p0, final BackStackRecord$TransitionState p1, final SparseArray p2, final SparseArray p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore          5
        //     5: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //     8: ifeq            76
        //    11: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    14: iconst_4       
        //    15: aaload         
        //    16: new             Ljava/lang/StringBuilder;
        //    19: dup            
        //    20: invokespecial   java/lang/StringBuilder.<init>:()V
        //    23: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    26: iconst_2       
        //    27: aaload         
        //    28: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    31: aload_0        
        //    32: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    35: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    38: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    41: pop            
        //    42: new             Ljava/io/PrintWriter;
        //    45: dup            
        //    46: new             Landroid/support/v4/util/LogWriter;
        //    49: dup            
        //    50: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    53: iconst_0       
        //    54: aaload         
        //    55: invokespecial   android/support/v4/util/LogWriter.<init>:(Ljava/lang/String;)V
        //    58: invokespecial   java/io/PrintWriter.<init>:(Ljava/io/Writer;)V
        //    61: astore          35
        //    63: aload_0        
        //    64: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    67: iconst_3       
        //    68: aaload         
        //    69: aconst_null    
        //    70: aload           35
        //    72: aconst_null    
        //    73: invokevirtual   android/support/v4/app/BackStackRecord.dump:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
        //    76: getstatic       android/support/v4/app/BackStackRecord.SUPPORTS_TRANSITIONS:Z
        //    79: istore          9
        //    81: iload           9
        //    83: ifeq            747
        //    86: aload_2        
        //    87: ifnonnull       123
        //    90: aload_3        
        //    91: invokevirtual   android/util/SparseArray.size:()I
        //    94: ifne            109
        //    97: aload           4
        //    99: invokevirtual   android/util/SparseArray.size:()I
        //   102: istore          33
        //   104: iload           33
        //   106: ifeq            747
        //   109: aload_0        
        //   110: aload_3        
        //   111: aload           4
        //   113: iconst_1       
        //   114: invokespecial   android/support/v4/app/BackStackRecord.beginTransition:(Landroid/util/SparseArray;Landroid/util/SparseArray;Z)Landroid/support/v4/app/BackStackRecord$TransitionState;
        //   117: astore_2       
        //   118: iload           5
        //   120: ifeq            747
        //   123: iload_1        
        //   124: ifne            747
        //   127: aload_2        
        //   128: aload_0        
        //   129: getfield        android/support/v4/app/BackStackRecord.mSharedElementTargetNames:Ljava/util/ArrayList;
        //   132: aload_0        
        //   133: getfield        android/support/v4/app/BackStackRecord.mSharedElementSourceNames:Ljava/util/ArrayList;
        //   136: invokestatic    android/support/v4/app/BackStackRecord.setNameOverrides:(Landroid/support/v4/app/BackStackRecord$TransitionState;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
        //   139: aload_2        
        //   140: astore          10
        //   142: aload_0        
        //   143: iconst_m1      
        //   144: invokevirtual   android/support/v4/app/BackStackRecord.bumpBackStackNesting:(I)V
        //   147: aload           10
        //   149: ifnull          300
        //   152: iconst_0       
        //   153: istore          12
        //   155: aload           10
        //   157: ifnull          309
        //   160: iconst_0       
        //   161: istore          13
        //   163: aload_0        
        //   164: getfield        android/support/v4/app/BackStackRecord.mTail:Landroid/support/v4/app/BackStackRecord$Op;
        //   167: astore          14
        //   169: aload           14
        //   171: ifnull          661
        //   174: aload           10
        //   176: ifnull          318
        //   179: iconst_0       
        //   180: istore          17
        //   182: aload           10
        //   184: ifnull          328
        //   187: iconst_0       
        //   188: istore          18
        //   190: aload           14
        //   192: getfield        android/support/v4/app/BackStackRecord$Op.cmd:I
        //   195: tableswitch {
        //                2: 338
        //                3: 373
        //                4: 480
        //                5: 509
        //                6: 544
        //                7: 579
        //                8: 614
        //          default: 236
        //        }
        //   236: new             Ljava/lang/IllegalArgumentException;
        //   239: dup            
        //   240: new             Ljava/lang/StringBuilder;
        //   243: dup            
        //   244: invokespecial   java/lang/StringBuilder.<init>:()V
        //   247: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   250: iconst_1       
        //   251: aaload         
        //   252: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   255: aload           14
        //   257: getfield        android/support/v4/app/BackStackRecord$Op.cmd:I
        //   260: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   263: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   266: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   269: athrow         
        //   270: astore          21
        //   272: aload           21
        //   274: athrow         
        //   275: astore          6
        //   277: aload           6
        //   279: athrow         
        //   280: astore          7
        //   282: aload           7
        //   284: athrow         
        //   285: astore          8
        //   287: aload           8
        //   289: athrow         
        //   290: astore          32
        //   292: aload           32
        //   294: athrow         
        //   295: astore          11
        //   297: aload           11
        //   299: athrow         
        //   300: aload_0        
        //   301: getfield        android/support/v4/app/BackStackRecord.mTransitionStyle:I
        //   304: istore          12
        //   306: goto            155
        //   309: aload_0        
        //   310: getfield        android/support/v4/app/BackStackRecord.mTransition:I
        //   313: istore          13
        //   315: goto            163
        //   318: aload           14
        //   320: getfield        android/support/v4/app/BackStackRecord$Op.popEnterAnim:I
        //   323: istore          17
        //   325: goto            182
        //   328: aload           14
        //   330: getfield        android/support/v4/app/BackStackRecord$Op.popExitAnim:I
        //   333: istore          18
        //   335: goto            190
        //   338: aload           14
        //   340: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   343: astore          31
        //   345: aload           31
        //   347: iload           18
        //   349: putfield        android/support/v4/app/Fragment.mNextAnim:I
        //   352: aload_0        
        //   353: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   356: aload           31
        //   358: iload           13
        //   360: invokestatic    android/support/v4/app/FragmentManagerImpl.reverseTransit:(I)I
        //   363: iload           12
        //   365: invokevirtual   android/support/v4/app/FragmentManagerImpl.removeFragment:(Landroid/support/v4/app/Fragment;II)V
        //   368: iload           5
        //   370: ifeq            649
        //   373: aload           14
        //   375: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   378: astore          26
        //   380: aload           26
        //   382: ifnull          408
        //   385: aload           26
        //   387: iload           18
        //   389: putfield        android/support/v4/app/Fragment.mNextAnim:I
        //   392: aload_0        
        //   393: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   396: aload           26
        //   398: iload           13
        //   400: invokestatic    android/support/v4/app/FragmentManagerImpl.reverseTransit:(I)I
        //   403: iload           12
        //   405: invokevirtual   android/support/v4/app/FragmentManagerImpl.removeFragment:(Landroid/support/v4/app/Fragment;II)V
        //   408: aload           14
        //   410: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   413: ifnull          475
        //   416: iconst_0       
        //   417: istore          27
        //   419: iload           27
        //   421: aload           14
        //   423: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   426: invokevirtual   java/util/ArrayList.size:()I
        //   429: if_icmpge       475
        //   432: aload           14
        //   434: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   437: iload           27
        //   439: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   442: checkcast       Landroid/support/v4/app/Fragment;
        //   445: astore          28
        //   447: aload           28
        //   449: iload           17
        //   451: putfield        android/support/v4/app/Fragment.mNextAnim:I
        //   454: aload_0        
        //   455: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   458: aload           28
        //   460: iconst_0       
        //   461: invokevirtual   android/support/v4/app/FragmentManagerImpl.addFragment:(Landroid/support/v4/app/Fragment;Z)V
        //   464: iload           27
        //   466: iconst_1       
        //   467: iadd           
        //   468: istore          29
        //   470: iload           5
        //   472: ifeq            740
        //   475: iload           5
        //   477: ifeq            649
        //   480: aload           14
        //   482: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   485: astore          25
        //   487: aload           25
        //   489: iload           17
        //   491: putfield        android/support/v4/app/Fragment.mNextAnim:I
        //   494: aload_0        
        //   495: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   498: aload           25
        //   500: iconst_0       
        //   501: invokevirtual   android/support/v4/app/FragmentManagerImpl.addFragment:(Landroid/support/v4/app/Fragment;Z)V
        //   504: iload           5
        //   506: ifeq            649
        //   509: aload           14
        //   511: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   514: astore          24
        //   516: aload           24
        //   518: iload           17
        //   520: putfield        android/support/v4/app/Fragment.mNextAnim:I
        //   523: aload_0        
        //   524: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   527: aload           24
        //   529: iload           13
        //   531: invokestatic    android/support/v4/app/FragmentManagerImpl.reverseTransit:(I)I
        //   534: iload           12
        //   536: invokevirtual   android/support/v4/app/FragmentManagerImpl.showFragment:(Landroid/support/v4/app/Fragment;II)V
        //   539: iload           5
        //   541: ifeq            649
        //   544: aload           14
        //   546: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   549: astore          23
        //   551: aload           23
        //   553: iload           18
        //   555: putfield        android/support/v4/app/Fragment.mNextAnim:I
        //   558: aload_0        
        //   559: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   562: aload           23
        //   564: iload           13
        //   566: invokestatic    android/support/v4/app/FragmentManagerImpl.reverseTransit:(I)I
        //   569: iload           12
        //   571: invokevirtual   android/support/v4/app/FragmentManagerImpl.hideFragment:(Landroid/support/v4/app/Fragment;II)V
        //   574: iload           5
        //   576: ifeq            649
        //   579: aload           14
        //   581: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   584: astore          22
        //   586: aload           22
        //   588: iload           17
        //   590: putfield        android/support/v4/app/Fragment.mNextAnim:I
        //   593: aload_0        
        //   594: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   597: aload           22
        //   599: iload           13
        //   601: invokestatic    android/support/v4/app/FragmentManagerImpl.reverseTransit:(I)I
        //   604: iload           12
        //   606: invokevirtual   android/support/v4/app/FragmentManagerImpl.attachFragment:(Landroid/support/v4/app/Fragment;II)V
        //   609: iload           5
        //   611: ifeq            649
        //   614: aload           14
        //   616: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   619: astore          19
        //   621: aload           19
        //   623: iload           17
        //   625: putfield        android/support/v4/app/Fragment.mNextAnim:I
        //   628: aload_0        
        //   629: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   632: aload           19
        //   634: iload           13
        //   636: invokestatic    android/support/v4/app/FragmentManagerImpl.reverseTransit:(I)I
        //   639: iload           12
        //   641: invokevirtual   android/support/v4/app/FragmentManagerImpl.detachFragment:(Landroid/support/v4/app/Fragment;II)V
        //   644: iload           5
        //   646: ifne            236
        //   649: aload           14
        //   651: getfield        android/support/v4/app/BackStackRecord$Op.prev:Landroid/support/v4/app/BackStackRecord$Op;
        //   654: astore          20
        //   656: iload           5
        //   658: ifeq            733
        //   661: iload_1        
        //   662: ifeq            726
        //   665: aload_0        
        //   666: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   669: aload_0        
        //   670: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   673: getfield        android/support/v4/app/FragmentManagerImpl.mCurState:I
        //   676: iload           13
        //   678: invokestatic    android/support/v4/app/FragmentManagerImpl.reverseTransit:(I)I
        //   681: iload           12
        //   683: iconst_1       
        //   684: invokevirtual   android/support/v4/app/FragmentManagerImpl.moveToState:(IIIZ)V
        //   687: aconst_null    
        //   688: astore          15
        //   690: aload_0        
        //   691: getfield        android/support/v4/app/BackStackRecord.mIndex:I
        //   694: iflt            713
        //   697: aload_0        
        //   698: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   701: aload_0        
        //   702: getfield        android/support/v4/app/BackStackRecord.mIndex:I
        //   705: invokevirtual   android/support/v4/app/FragmentManagerImpl.freeBackStackIndex:(I)V
        //   708: aload_0        
        //   709: iconst_m1      
        //   710: putfield        android/support/v4/app/BackStackRecord.mIndex:I
        //   713: aload           15
        //   715: areturn        
        //   716: astore          30
        //   718: aload           30
        //   720: athrow         
        //   721: astore          16
        //   723: aload           16
        //   725: athrow         
        //   726: aload           10
        //   728: astore          15
        //   730: goto            690
        //   733: aload           20
        //   735: astore          14
        //   737: goto            169
        //   740: iload           29
        //   742: istore          27
        //   744: goto            419
        //   747: aload_2        
        //   748: astore          10
        //   750: goto            142
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  76     81     275    285    Ljava/lang/IllegalStateException;
        //  90     104    285    290    Ljava/lang/IllegalStateException;
        //  127    139    290    295    Ljava/lang/IllegalStateException;
        //  142    147    295    300    Ljava/lang/IllegalStateException;
        //  236    270    270    275    Ljava/lang/IllegalStateException;
        //  277    280    280    285    Ljava/lang/IllegalStateException;
        //  282    285    285    290    Ljava/lang/IllegalStateException;
        //  385    408    716    721    Ljava/lang/IllegalStateException;
        //  621    644    270    275    Ljava/lang/IllegalStateException;
        //  690    713    721    726    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 330, Size: 330
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
    public FragmentTransaction remove(final Fragment fragment) {
        final BackStackRecord$Op backStackRecord$Op = new BackStackRecord$Op();
        backStackRecord$Op.cmd = 3;
        backStackRecord$Op.fragment = fragment;
        this.addOp(backStackRecord$Op);
        return this;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore_1       
        //     4: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //     7: ifeq            43
        //    10: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    13: bipush          65
        //    15: aaload         
        //    16: new             Ljava/lang/StringBuilder;
        //    19: dup            
        //    20: invokespecial   java/lang/StringBuilder.<init>:()V
        //    23: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    26: bipush          56
        //    28: aaload         
        //    29: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    32: aload_0        
        //    33: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    36: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    39: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    42: pop            
        //    43: aload_0        
        //    44: getfield        android/support/v4/app/BackStackRecord.mAddToBackStack:Z
        //    47: istore          5
        //    49: iload           5
        //    51: ifeq            86
        //    54: aload_0        
        //    55: getfield        android/support/v4/app/BackStackRecord.mIndex:I
        //    58: ifge            86
        //    61: new             Ljava/lang/IllegalStateException;
        //    64: dup            
        //    65: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    68: bipush          59
        //    70: aaload         
        //    71: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    74: athrow         
        //    75: astore          4
        //    77: aload           4
        //    79: athrow         
        //    80: astore_2       
        //    81: aload_2        
        //    82: athrow         
        //    83: astore_3       
        //    84: aload_3        
        //    85: athrow         
        //    86: aload_0        
        //    87: iconst_1       
        //    88: invokevirtual   android/support/v4/app/BackStackRecord.bumpBackStackNesting:(I)V
        //    91: getstatic       android/support/v4/app/BackStackRecord.SUPPORTS_TRANSITIONS:Z
        //    94: ifeq            909
        //    97: new             Landroid/util/SparseArray;
        //   100: dup            
        //   101: invokespecial   android/util/SparseArray.<init>:()V
        //   104: astore          6
        //   106: new             Landroid/util/SparseArray;
        //   109: dup            
        //   110: invokespecial   android/util/SparseArray.<init>:()V
        //   113: astore          7
        //   115: aload_0        
        //   116: aload           6
        //   118: aload           7
        //   120: invokespecial   android/support/v4/app/BackStackRecord.calculateFragments:(Landroid/util/SparseArray;Landroid/util/SparseArray;)V
        //   123: aload_0        
        //   124: aload           6
        //   126: aload           7
        //   128: iconst_0       
        //   129: invokespecial   android/support/v4/app/BackStackRecord.beginTransition:(Landroid/util/SparseArray;Landroid/util/SparseArray;Z)Landroid/support/v4/app/BackStackRecord$TransitionState;
        //   132: astore          8
        //   134: aload           8
        //   136: ifnull          264
        //   139: iconst_0       
        //   140: istore          9
        //   142: aload           8
        //   144: ifnull          273
        //   147: iconst_0       
        //   148: istore          10
        //   150: aload_0        
        //   151: getfield        android/support/v4/app/BackStackRecord.mHead:Landroid/support/v4/app/BackStackRecord$Op;
        //   154: astore          11
        //   156: aload           11
        //   158: ifnull          684
        //   161: aload           8
        //   163: ifnull          282
        //   166: iconst_0       
        //   167: istore          13
        //   169: aload           8
        //   171: ifnull          292
        //   174: iconst_0       
        //   175: istore          14
        //   177: aload           11
        //   179: getfield        android/support/v4/app/BackStackRecord$Op.cmd:I
        //   182: tableswitch {
        //                2: 302
        //                3: 330
        //                4: 518
        //                5: 549
        //                6: 580
        //                7: 611
        //                8: 642
        //          default: 224
        //        }
        //   224: new             Ljava/lang/IllegalArgumentException;
        //   227: dup            
        //   228: new             Ljava/lang/StringBuilder;
        //   231: dup            
        //   232: invokespecial   java/lang/StringBuilder.<init>:()V
        //   235: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   238: bipush          61
        //   240: aaload         
        //   241: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   244: aload           11
        //   246: getfield        android/support/v4/app/BackStackRecord$Op.cmd:I
        //   249: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   252: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   255: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   258: athrow         
        //   259: astore          17
        //   261: aload           17
        //   263: athrow         
        //   264: aload_0        
        //   265: getfield        android/support/v4/app/BackStackRecord.mTransitionStyle:I
        //   268: istore          9
        //   270: goto            142
        //   273: aload_0        
        //   274: getfield        android/support/v4/app/BackStackRecord.mTransition:I
        //   277: istore          10
        //   279: goto            150
        //   282: aload           11
        //   284: getfield        android/support/v4/app/BackStackRecord$Op.enterAnim:I
        //   287: istore          13
        //   289: goto            169
        //   292: aload           11
        //   294: getfield        android/support/v4/app/BackStackRecord$Op.exitAnim:I
        //   297: istore          14
        //   299: goto            177
        //   302: aload           11
        //   304: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   307: astore          39
        //   309: aload           39
        //   311: iload           13
        //   313: putfield        android/support/v4/app/Fragment.mNextAnim:I
        //   316: aload_0        
        //   317: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   320: aload           39
        //   322: iconst_0       
        //   323: invokevirtual   android/support/v4/app/FragmentManagerImpl.addFragment:(Landroid/support/v4/app/Fragment;Z)V
        //   326: iload_1        
        //   327: ifeq            673
        //   330: aload           11
        //   332: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   335: astore          22
        //   337: aload_0        
        //   338: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   341: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   344: ifnull          902
        //   347: aload           22
        //   349: astore          23
        //   351: iconst_0       
        //   352: istore          25
        //   354: iload           25
        //   356: aload_0        
        //   357: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   360: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   363: invokevirtual   java/util/ArrayList.size:()I
        //   366: if_icmpge       492
        //   369: aload_0        
        //   370: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   373: getfield        android/support/v4/app/FragmentManagerImpl.mAdded:Ljava/util/ArrayList;
        //   376: iload           25
        //   378: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   381: checkcast       Landroid/support/v4/app/Fragment;
        //   384: astore          26
        //   386: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   389: ifeq            440
        //   392: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   395: bipush          60
        //   397: aaload         
        //   398: new             Ljava/lang/StringBuilder;
        //   401: dup            
        //   402: invokespecial   java/lang/StringBuilder.<init>:()V
        //   405: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   408: bipush          63
        //   410: aaload         
        //   411: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   414: aload           23
        //   416: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   419: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   422: bipush          64
        //   424: aaload         
        //   425: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   428: aload           26
        //   430: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   433: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   436: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   439: pop            
        //   440: aload           23
        //   442: ifnull          466
        //   445: aload           26
        //   447: getfield        android/support/v4/app/Fragment.mContainerId:I
        //   450: istore          36
        //   452: aload           23
        //   454: getfield        android/support/v4/app/Fragment.mContainerId:I
        //   457: istore          37
        //   459: iload           36
        //   461: iload           37
        //   463: if_icmpne       482
        //   466: aload           26
        //   468: aload           23
        //   470: if_acmpne       729
        //   473: aconst_null    
        //   474: astore          23
        //   476: aload           11
        //   478: aconst_null    
        //   479: putfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   482: iload           25
        //   484: iconst_1       
        //   485: iadd           
        //   486: istore          33
        //   488: iload_1        
        //   489: ifeq            895
        //   492: aload           23
        //   494: ifnull          514
        //   497: aload           23
        //   499: iload           13
        //   501: putfield        android/support/v4/app/Fragment.mNextAnim:I
        //   504: aload_0        
        //   505: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   508: aload           23
        //   510: iconst_0       
        //   511: invokevirtual   android/support/v4/app/FragmentManagerImpl.addFragment:(Landroid/support/v4/app/Fragment;Z)V
        //   514: iload_1        
        //   515: ifeq            673
        //   518: aload           11
        //   520: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   523: astore          21
        //   525: aload           21
        //   527: iload           14
        //   529: putfield        android/support/v4/app/Fragment.mNextAnim:I
        //   532: aload_0        
        //   533: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   536: aload           21
        //   538: iload           10
        //   540: iload           9
        //   542: invokevirtual   android/support/v4/app/FragmentManagerImpl.removeFragment:(Landroid/support/v4/app/Fragment;II)V
        //   545: iload_1        
        //   546: ifeq            673
        //   549: aload           11
        //   551: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   554: astore          20
        //   556: aload           20
        //   558: iload           14
        //   560: putfield        android/support/v4/app/Fragment.mNextAnim:I
        //   563: aload_0        
        //   564: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   567: aload           20
        //   569: iload           10
        //   571: iload           9
        //   573: invokevirtual   android/support/v4/app/FragmentManagerImpl.hideFragment:(Landroid/support/v4/app/Fragment;II)V
        //   576: iload_1        
        //   577: ifeq            673
        //   580: aload           11
        //   582: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   585: astore          19
        //   587: aload           19
        //   589: iload           13
        //   591: putfield        android/support/v4/app/Fragment.mNextAnim:I
        //   594: aload_0        
        //   595: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   598: aload           19
        //   600: iload           10
        //   602: iload           9
        //   604: invokevirtual   android/support/v4/app/FragmentManagerImpl.showFragment:(Landroid/support/v4/app/Fragment;II)V
        //   607: iload_1        
        //   608: ifeq            673
        //   611: aload           11
        //   613: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   616: astore          18
        //   618: aload           18
        //   620: iload           14
        //   622: putfield        android/support/v4/app/Fragment.mNextAnim:I
        //   625: aload_0        
        //   626: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   629: aload           18
        //   631: iload           10
        //   633: iload           9
        //   635: invokevirtual   android/support/v4/app/FragmentManagerImpl.detachFragment:(Landroid/support/v4/app/Fragment;II)V
        //   638: iload_1        
        //   639: ifeq            673
        //   642: aload           11
        //   644: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   647: astore          15
        //   649: aload           15
        //   651: iload           13
        //   653: putfield        android/support/v4/app/Fragment.mNextAnim:I
        //   656: aload_0        
        //   657: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   660: aload           15
        //   662: iload           10
        //   664: iload           9
        //   666: invokevirtual   android/support/v4/app/FragmentManagerImpl.attachFragment:(Landroid/support/v4/app/Fragment;II)V
        //   669: iload_1        
        //   670: ifne            224
        //   673: aload           11
        //   675: getfield        android/support/v4/app/BackStackRecord$Op.next:Landroid/support/v4/app/BackStackRecord$Op;
        //   678: astore          16
        //   680: iload_1        
        //   681: ifeq            888
        //   684: aload_0        
        //   685: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   688: aload_0        
        //   689: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   692: getfield        android/support/v4/app/FragmentManagerImpl.mCurState:I
        //   695: iload           10
        //   697: iload           9
        //   699: iconst_1       
        //   700: invokevirtual   android/support/v4/app/FragmentManagerImpl.moveToState:(IIIZ)V
        //   703: aload_0        
        //   704: getfield        android/support/v4/app/BackStackRecord.mAddToBackStack:Z
        //   707: ifeq            718
        //   710: aload_0        
        //   711: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   714: aload_0        
        //   715: invokevirtual   android/support/v4/app/FragmentManagerImpl.addBackStackState:(Landroid/support/v4/app/BackStackRecord;)V
        //   718: return         
        //   719: astore          27
        //   721: aload           27
        //   723: athrow         
        //   724: astore          35
        //   726: aload           35
        //   728: athrow         
        //   729: aload           11
        //   731: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   734: ifnonnull       749
        //   737: aload           11
        //   739: new             Ljava/util/ArrayList;
        //   742: dup            
        //   743: invokespecial   java/util/ArrayList.<init>:()V
        //   746: putfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   749: aload           11
        //   751: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   754: aload           26
        //   756: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   759: pop            
        //   760: aload           26
        //   762: iload           14
        //   764: putfield        android/support/v4/app/Fragment.mNextAnim:I
        //   767: aload_0        
        //   768: getfield        android/support/v4/app/BackStackRecord.mAddToBackStack:Z
        //   771: istore          32
        //   773: iload           32
        //   775: ifeq            847
        //   778: aload           26
        //   780: iconst_1       
        //   781: aload           26
        //   783: getfield        android/support/v4/app/Fragment.mBackStackNesting:I
        //   786: iadd           
        //   787: putfield        android/support/v4/app/Fragment.mBackStackNesting:I
        //   790: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   793: ifeq            847
        //   796: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   799: bipush          57
        //   801: aaload         
        //   802: new             Ljava/lang/StringBuilder;
        //   805: dup            
        //   806: invokespecial   java/lang/StringBuilder.<init>:()V
        //   809: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   812: bipush          62
        //   814: aaload         
        //   815: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   818: aload           26
        //   820: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   823: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //   826: bipush          58
        //   828: aaload         
        //   829: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   832: aload           26
        //   834: getfield        android/support/v4/app/Fragment.mBackStackNesting:I
        //   837: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   840: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   843: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   846: pop            
        //   847: aload_0        
        //   848: getfield        android/support/v4/app/BackStackRecord.mManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   851: aload           26
        //   853: iload           10
        //   855: iload           9
        //   857: invokevirtual   android/support/v4/app/FragmentManagerImpl.removeFragment:(Landroid/support/v4/app/Fragment;II)V
        //   860: goto            482
        //   863: astore          28
        //   865: aload           28
        //   867: athrow         
        //   868: astore          29
        //   870: aload           29
        //   872: athrow         
        //   873: astore          30
        //   875: aload           30
        //   877: athrow         
        //   878: astore          24
        //   880: aload           24
        //   882: athrow         
        //   883: astore          12
        //   885: aload           12
        //   887: athrow         
        //   888: aload           16
        //   890: astore          11
        //   892: goto            156
        //   895: iload           33
        //   897: istore          25
        //   899: goto            354
        //   902: aload           22
        //   904: astore          23
        //   906: goto            492
        //   909: aconst_null    
        //   910: astore          8
        //   912: goto            134
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      43     80     83     Ljava/lang/IllegalStateException;
        //  43     49     83     86     Ljava/lang/IllegalStateException;
        //  54     75     75     80     Ljava/lang/IllegalStateException;
        //  84     86     75     80     Ljava/lang/IllegalStateException;
        //  224    259    259    264    Ljava/lang/IllegalStateException;
        //  386    440    719    724    Ljava/lang/IllegalStateException;
        //  445    459    724    729    Ljava/lang/IllegalStateException;
        //  497    514    878    883    Ljava/lang/IllegalStateException;
        //  649    669    259    264    Ljava/lang/IllegalStateException;
        //  684    718    883    888    Ljava/lang/IllegalStateException;
        //  729    749    863    868    Ljava/lang/IllegalStateException;
        //  749    773    868    873    Ljava/lang/IllegalStateException;
        //  778    847    873    878    Ljava/lang/IllegalStateException;
        //  870    873    873    878    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 404, Size: 404
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
        //    12: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    15: bipush          48
        //    17: aaload         
        //    18: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    21: pop            
        //    22: aload_1        
        //    23: aload_0        
        //    24: invokestatic    java/lang/System.identityHashCode:(Ljava/lang/Object;)I
        //    27: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //    30: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    33: pop            
        //    34: aload_0        
        //    35: getfield        android/support/v4/app/BackStackRecord.mIndex:I
        //    38: iflt            61
        //    41: aload_1        
        //    42: getstatic       android/support/v4/app/BackStackRecord.z:[Ljava/lang/String;
        //    45: bipush          49
        //    47: aaload         
        //    48: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    51: pop            
        //    52: aload_1        
        //    53: aload_0        
        //    54: getfield        android/support/v4/app/BackStackRecord.mIndex:I
        //    57: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    60: pop            
        //    61: aload_0        
        //    62: getfield        android/support/v4/app/BackStackRecord.mName:Ljava/lang/String;
        //    65: ifnull          85
        //    68: aload_1        
        //    69: ldc_w           " "
        //    72: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    75: pop            
        //    76: aload_1        
        //    77: aload_0        
        //    78: getfield        android/support/v4/app/BackStackRecord.mName:Ljava/lang/String;
        //    81: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    84: pop            
        //    85: aload_1        
        //    86: ldc_w           "}"
        //    89: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    92: pop            
        //    93: aload_1        
        //    94: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    97: areturn        
        //    98: astore_2       
        //    99: aload_2        
        //   100: athrow         
        //   101: astore          5
        //   103: aload           5
        //   105: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  11     61     98     101    Ljava/lang/IllegalStateException;
        //  61     85     101    106    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0061:
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
