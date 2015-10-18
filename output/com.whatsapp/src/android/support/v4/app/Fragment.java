// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Parcelable;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.view.animation.Animation;
import android.view.MenuItem;
import android.content.res.Configuration;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.view.LayoutInflaterCompat;
import android.view.LayoutInflater;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.support.annotation.Nullable;
import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import android.support.v4.util.SimpleArrayMap;
import android.view.View$OnCreateContextMenuListener;
import android.content.ComponentCallbacks;

public class Fragment implements ComponentCallbacks, View$OnCreateContextMenuListener
{
    static final Object USE_DEFAULT_TRANSITION;
    public static int a;
    private static final SimpleArrayMap sClassMap;
    private static final String[] z;
    FragmentActivity mActivity;
    boolean mAdded;
    Boolean mAllowEnterTransitionOverlap;
    Boolean mAllowReturnTransitionOverlap;
    View mAnimatingAway;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mCalled;
    boolean mCheckedForLoaderManager;
    FragmentManagerImpl mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    boolean mDeferStart;
    boolean mDetached;
    Object mEnterTransition;
    SharedElementCallback mEnterTransitionCallback;
    Object mExitTransition;
    SharedElementCallback mExitTransitionCallback;
    int mFragmentId;
    FragmentManagerImpl mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mInLayout;
    int mIndex;
    View mInnerView;
    LoaderManagerImpl mLoaderManager;
    boolean mLoadersStarted;
    boolean mMenuVisible;
    int mNextAnim;
    Fragment mParentFragment;
    Object mReenterTransition;
    boolean mRemoving;
    boolean mRestored;
    boolean mResumed;
    boolean mRetainInstance;
    boolean mRetaining;
    Object mReturnTransition;
    Bundle mSavedFragmentState;
    SparseArray mSavedViewState;
    Object mSharedElementEnterTransition;
    Object mSharedElementReturnTransition;
    int mState;
    int mStateAfterAnimating;
    String mTag;
    Fragment mTarget;
    int mTargetIndex;
    int mTargetRequestCode;
    boolean mUserVisibleHint;
    View mView;
    String mWho;
    
    static {
        final String[] z2 = new String[79];
        String s = "U9`.5v%ui9\u007f9d(<jk`*,z=d";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_2007:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'X';
                        break;
                    }
                    case 0: {
                        c2 = '\u0013';
                        break;
                    }
                    case 1: {
                        c2 = 'K';
                        break;
                    }
                    case 2: {
                        c2 = '\u0001';
                        break;
                    }
                    case 3: {
                        c2 = 'I';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "3%n=xr?u(;{.ei,|k@*,z=h=!";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "U9`.5v%ui";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "U9`.5v%ui9\u007f9d(<jk`*,z=d";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "U9`.5v%ui";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "3/h-x}$ui;r'mi,{9n<?{ku&x`>q,*=$o\u001a,|;)`";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "3/h-x}$ui;r'mi,{9n<?{ku&x`>q,*=$o\u001a,r9uaq";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "U9`.5v%ui";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "3%n=xr?u(;{.ei,|k@*,z=h=!";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "U9`.5v%ui";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "U9`.5v%ui";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "3/h-x}$ui;r'mi,{9n<?{ku&x`>q,*=$o\u001f1v<R=9g.S,+g$s,<;b";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "3\"ethk";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "3h";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "3/h-x}$ui;r'mi,{9n<?{ku&x`>q,*=$o\n*v*u,p:";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "U9`.5v%ui";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "r%e;7z/;:-c;n;,)-s(?~.o=+";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "U9`.5v%ui";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "3/h-x}$ui;r'mi,{9n<?{ku&x`>q,*=$o\r=`?s&!E\"d>p:";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    s = "r%e;7z/;/*r,l,6gq";
                    n = 18;
                    n2 = 19;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    array = z2;
                    s = "3%n=xr?u(;{.ei,|k@*,z=h=!";
                    n = 19;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "U9`.5v%ui";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "U9`.5v%ui";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "3/h-x}$ui;r'mi,{9n<?{ku&x`>q,*=$o\b;g\"w ,j\bs,9g.eaq";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "~\u0018`?=w\rs(?~.o=\u000bg*u,e";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "~\ns.-~.o=+.";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "~\u001f`;?v?<";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "3&T:=a\u001dh:1q'd\u00011}?<";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "~\bn',r\"o,*.";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "~\no 5r?h'?R<`0e";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "~\u0002o'=a\u001dh,/.";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "3&I(+^.o<e";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "~\ne-=wv";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "3&H'<v3<";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "P#h%<3";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "_$`-=akL(6r,d;b";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "~\u0003h-<v%<";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "~\u0018u(,vv";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "3&S,,r\"o 6tv";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "~\u001dh,/.";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "3k";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "3&S,5|=h'?.";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "~\u0005d1,R%h$e";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "3&L,6f\u001dh:1q'dt";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "~\u001b`;=}?G;9t&d',.";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "~\rs(?~.o=\u0011wv\"";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "3&B&6g*h'=a\u0002et{";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "3&G;7~\u0007`07f?<";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "3&V!7.";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "~\u0018`?=w\u001dh,/@?`==.";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "3&H'\u0014r2n<,.";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "3&E,,r(i,<.";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "3k";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "3&U(?.";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "~\u0018u(,v\ng==a\no 5r?h'?.";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "3&C(;x\u0018u(;x\u0005d:,z%ft";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "3&U(*t.u\u001b=b>d:,P$e,e";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "~\u0019d=9z%H'+g*o*=.";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "~\nb=1e\"u0e";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "3&S,+f&d-e";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "~\rs(?~.o=\u0015r%`.=av";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    array[n2] = intern;
                    n2 = 61;
                    s = "U9`.5v%ui";
                    n = 60;
                    array = z2;
                    continue;
                }
                case 60: {
                    array[n2] = intern;
                    n2 = 62;
                    s = "3/h-x}$ui;r'mi,{9n<?{ku&x`>q,*=$o\r=`?s&!;b";
                    n = 61;
                    array = z2;
                    continue;
                }
                case 61: {
                    array[n2] = intern;
                    n2 = 63;
                    s = "r%e;7z/;:-c;n;,)-s(?~.o=+";
                    n = 62;
                    array = z2;
                    continue;
                }
                case 62: {
                    array[n2] = intern;
                    n2 = 64;
                    s = "3%n=xr?u(;{.ei,|k@*,z=h=!";
                    n = 63;
                    array = z2;
                    continue;
                }
                case 63: {
                    array[n2] = intern;
                    n2 = 65;
                    s = "U9`.5v%ui";
                    n = 64;
                    array = z2;
                    continue;
                }
                case 64: {
                    array[n2] = intern;
                    n2 = 66;
                    s = "3/h-x}$ui;r'mi,{9n<?{ku&x`>q,*=$o\u00199f8daq";
                    n = 65;
                    array = z2;
                    continue;
                }
                case 65: {
                    array[n2] = intern;
                    n2 = 67;
                    s = "U9`.5v%ui";
                    n = 66;
                    array = z2;
                    continue;
                }
                case 66: {
                    array[n2] = intern;
                    n2 = 68;
                    s = "F%`+4vku&xz%r=9}?h(,vkg;9t&d',3";
                    n = 67;
                    array = z2;
                    continue;
                }
                case 67: {
                    array[n2] = intern;
                    n2 = 69;
                    s = ")kl(3vkr<*vkb%9`8!'9~.!, z8u:t3\"ri(f)m ;?k`'<3#`:xr%";
                    n = 68;
                    array = z2;
                    continue;
                }
                case 68: {
                    array[n2] = intern;
                    n2 = 70;
                    s = "3.l9,jkb&6`?s<;g$si,{*ui1`kq<:\u007f\"b";
                    n = 69;
                    array = z2;
                    continue;
                }
                case 69: {
                    array[n2] = intern;
                    n2 = 71;
                    s = ")kl(3vkr<*vkb%9`8!'9~.!, z8u:t3\"ri(f)m ;?k`'<3#`:xr%";
                    n = 70;
                    array = z2;
                    continue;
                }
                case 70: {
                    array[n2] = intern;
                    n2 = 72;
                    s = ")kl(3vkr<*vkb%9`8!'9~.!, z8u:t3\"ri(f)m ;?k`'<3#`:xr%";
                    n = 71;
                    array = z2;
                    continue;
                }
                case 71: {
                    array[n2] = intern;
                    s = "F%`+4vku&xz%r=9}?h(,vkg;9t&d',3";
                    n = 72;
                    n2 = 73;
                    array = z2;
                    continue;
                }
                case 72: {
                    array[n2] = intern;
                    n2 = 74;
                    array = z2;
                    s = "3.l9,jkb&6`?s<;g$si,{*ui1`kq<:\u007f\"b";
                    n = 73;
                    continue;
                }
                case 73: {
                    array[n2] = intern;
                    s = "F%`+4vku&xz%r=9}?h(,vkg;9t&d',3";
                    n = 74;
                    n2 = 75;
                    array = z2;
                    continue;
                }
                case 74: {
                    array[n2] = intern;
                    n2 = 76;
                    array = z2;
                    s = "3.l9,jkb&6`?s<;g$si,{*ui1`kq<:\u007f\"b";
                    n = 75;
                    continue;
                }
                case 75: {
                    array[n2] = intern;
                    n2 = 77;
                    s = "U9`.5v%ui";
                    n = 76;
                    array = z2;
                    continue;
                }
                case 76: {
                    array[n2] = intern;
                    n2 = 78;
                    s = "3/h-x}$ui;r'mi,{9n<?{ku&x`>q,*=$o\u001b=`>l,p:";
                    n = 77;
                    array = z2;
                    continue;
                }
                case 77: {
                    break Label_2007;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        sClassMap = new SimpleArrayMap();
        USE_DEFAULT_TRANSITION = new Object();
    }
    
    public Fragment() {
        this.mState = 0;
        this.mIndex = -1;
        this.mTargetIndex = -1;
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mEnterTransition = null;
        this.mReturnTransition = Fragment.USE_DEFAULT_TRANSITION;
        this.mExitTransition = null;
        this.mReenterTransition = Fragment.USE_DEFAULT_TRANSITION;
        this.mSharedElementEnterTransition = null;
        this.mSharedElementReturnTransition = Fragment.USE_DEFAULT_TRANSITION;
        this.mEnterTransitionCallback = null;
        this.mExitTransitionCallback = null;
    }
    
    public static Fragment instantiate(final Context context, final String s) {
        return instantiate(context, s, null);
    }
    
    public static Fragment instantiate(final Context context, final String s, @Nullable final Bundle mArguments) {
        try {
            Class<?> loadClass = (Class<?>)Fragment.sClassMap.get(s);
            if (loadClass == null) {
                loadClass = context.getClassLoader().loadClass(s);
                Fragment.sClassMap.put(s, loadClass);
            }
            final Fragment fragment = (Fragment)loadClass.newInstance();
            if (mArguments == null) {
                return fragment;
            }
            try {
                mArguments.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mArguments = mArguments;
                return fragment;
            }
            catch (ClassNotFoundException ex) {
                throw ex;
            }
        }
        catch (ClassNotFoundException ex2) {
            throw new Fragment$InstantiationException(Fragment.z[75] + s + Fragment.z[72] + Fragment.z[76], ex2);
        }
        catch (InstantiationException ex3) {
            throw new Fragment$InstantiationException(Fragment.z[73] + s + Fragment.z[69] + Fragment.z[70], ex3);
        }
        catch (IllegalAccessException ex4) {
            throw new Fragment$InstantiationException(Fragment.z[68] + s + Fragment.z[71] + Fragment.z[74], ex4);
        }
    }
    
    static boolean isSupportFragmentClass(final Context context, final String s) {
        try {
            Class<?> loadClass = (Class<?>)Fragment.sClassMap.get(s);
            if (loadClass == null) {
                loadClass = context.getClassLoader().loadClass(s);
                Fragment.sClassMap.put(s, loadClass);
            }
            return Fragment.class.isAssignableFrom(loadClass);
        }
        catch (ClassNotFoundException ex) {
            return false;
        }
    }
    
    public void dump(final String p0, final FileDescriptor p1, final PrintWriter p2, final String[] p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore          5
        //     5: aload_3        
        //     6: aload_1        
        //     7: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    10: aload_3        
        //    11: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //    14: bipush          45
        //    16: aaload         
        //    17: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    20: aload_3        
        //    21: aload_0        
        //    22: getfield        android/support/v4/app/Fragment.mFragmentId:I
        //    25: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //    28: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    31: aload_3        
        //    32: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //    35: bipush          46
        //    37: aaload         
        //    38: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    41: aload_3        
        //    42: aload_0        
        //    43: getfield        android/support/v4/app/Fragment.mContainerId:I
        //    46: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //    49: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    52: aload_3        
        //    53: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //    56: bipush          53
        //    58: aaload         
        //    59: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    62: aload_3        
        //    63: aload_0        
        //    64: getfield        android/support/v4/app/Fragment.mTag:Ljava/lang/String;
        //    67: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //    70: aload_3        
        //    71: aload_1        
        //    72: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    75: aload_3        
        //    76: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //    79: bipush          37
        //    81: aaload         
        //    82: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    85: aload_3        
        //    86: aload_0        
        //    87: getfield        android/support/v4/app/Fragment.mState:I
        //    90: invokevirtual   java/io/PrintWriter.print:(I)V
        //    93: aload_3        
        //    94: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //    97: bipush          33
        //    99: aaload         
        //   100: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   103: aload_3        
        //   104: aload_0        
        //   105: getfield        android/support/v4/app/Fragment.mIndex:I
        //   108: invokevirtual   java/io/PrintWriter.print:(I)V
        //   111: aload_3        
        //   112: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   115: bipush          48
        //   117: aaload         
        //   118: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   121: aload_3        
        //   122: aload_0        
        //   123: getfield        android/support/v4/app/Fragment.mWho:Ljava/lang/String;
        //   126: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   129: aload_3        
        //   130: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   133: bipush          55
        //   135: aaload         
        //   136: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   139: aload_3        
        //   140: aload_0        
        //   141: getfield        android/support/v4/app/Fragment.mBackStackNesting:I
        //   144: invokevirtual   java/io/PrintWriter.println:(I)V
        //   147: aload_3        
        //   148: aload_1        
        //   149: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   152: aload_3        
        //   153: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   156: bipush          32
        //   158: aaload         
        //   159: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   162: aload_3        
        //   163: aload_0        
        //   164: getfield        android/support/v4/app/Fragment.mAdded:Z
        //   167: invokevirtual   java/io/PrintWriter.print:(Z)V
        //   170: aload_3        
        //   171: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   174: bipush          41
        //   176: aaload         
        //   177: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   180: aload_3        
        //   181: aload_0        
        //   182: getfield        android/support/v4/app/Fragment.mRemoving:Z
        //   185: invokevirtual   java/io/PrintWriter.print:(Z)V
        //   188: aload_3        
        //   189: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   192: bipush          59
        //   194: aaload         
        //   195: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   198: aload_3        
        //   199: aload_0        
        //   200: getfield        android/support/v4/app/Fragment.mResumed:Z
        //   203: invokevirtual   java/io/PrintWriter.print:(Z)V
        //   206: aload_3        
        //   207: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   210: bipush          47
        //   212: aaload         
        //   213: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   216: aload_3        
        //   217: aload_0        
        //   218: getfield        android/support/v4/app/Fragment.mFromLayout:Z
        //   221: invokevirtual   java/io/PrintWriter.print:(Z)V
        //   224: aload_3        
        //   225: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   228: bipush          50
        //   230: aaload         
        //   231: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   234: aload_3        
        //   235: aload_0        
        //   236: getfield        android/support/v4/app/Fragment.mInLayout:Z
        //   239: invokevirtual   java/io/PrintWriter.println:(Z)V
        //   242: aload_3        
        //   243: aload_1        
        //   244: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   247: aload_3        
        //   248: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   251: bipush          36
        //   253: aaload         
        //   254: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   257: aload_3        
        //   258: aload_0        
        //   259: getfield        android/support/v4/app/Fragment.mHidden:Z
        //   262: invokevirtual   java/io/PrintWriter.print:(Z)V
        //   265: aload_3        
        //   266: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   269: bipush          51
        //   271: aaload         
        //   272: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   275: aload_3        
        //   276: aload_0        
        //   277: getfield        android/support/v4/app/Fragment.mDetached:Z
        //   280: invokevirtual   java/io/PrintWriter.print:(Z)V
        //   283: aload_3        
        //   284: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   287: bipush          43
        //   289: aaload         
        //   290: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   293: aload_3        
        //   294: aload_0        
        //   295: getfield        android/support/v4/app/Fragment.mMenuVisible:Z
        //   298: invokevirtual   java/io/PrintWriter.print:(Z)V
        //   301: aload_3        
        //   302: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   305: bipush          31
        //   307: aaload         
        //   308: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   311: aload_3        
        //   312: aload_0        
        //   313: getfield        android/support/v4/app/Fragment.mHasMenu:Z
        //   316: invokevirtual   java/io/PrintWriter.println:(Z)V
        //   319: aload_3        
        //   320: aload_1        
        //   321: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   324: aload_3        
        //   325: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   328: bipush          57
        //   330: aaload         
        //   331: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   334: aload_3        
        //   335: aload_0        
        //   336: getfield        android/support/v4/app/Fragment.mRetainInstance:Z
        //   339: invokevirtual   java/io/PrintWriter.print:(Z)V
        //   342: aload_3        
        //   343: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   346: bipush          38
        //   348: aaload         
        //   349: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   352: aload_3        
        //   353: aload_0        
        //   354: getfield        android/support/v4/app/Fragment.mRetaining:Z
        //   357: invokevirtual   java/io/PrintWriter.print:(Z)V
        //   360: aload_3        
        //   361: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   364: bipush          27
        //   366: aaload         
        //   367: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   370: aload_3        
        //   371: aload_0        
        //   372: getfield        android/support/v4/app/Fragment.mUserVisibleHint:Z
        //   375: invokevirtual   java/io/PrintWriter.println:(Z)V
        //   378: aload_0        
        //   379: getfield        android/support/v4/app/Fragment.mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   382: ifnull          408
        //   385: aload_3        
        //   386: aload_1        
        //   387: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   390: aload_3        
        //   391: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   394: bipush          60
        //   396: aaload         
        //   397: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   400: aload_3        
        //   401: aload_0        
        //   402: getfield        android/support/v4/app/Fragment.mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   405: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   408: aload_0        
        //   409: getfield        android/support/v4/app/Fragment.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   412: ifnull          438
        //   415: aload_3        
        //   416: aload_1        
        //   417: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   420: aload_3        
        //   421: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   424: bipush          58
        //   426: aaload         
        //   427: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   430: aload_3        
        //   431: aload_0        
        //   432: getfield        android/support/v4/app/Fragment.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   435: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   438: aload_0        
        //   439: getfield        android/support/v4/app/Fragment.mParentFragment:Landroid/support/v4/app/Fragment;
        //   442: ifnull          468
        //   445: aload_3        
        //   446: aload_1        
        //   447: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   450: aload_3        
        //   451: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   454: bipush          44
        //   456: aaload         
        //   457: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   460: aload_3        
        //   461: aload_0        
        //   462: getfield        android/support/v4/app/Fragment.mParentFragment:Landroid/support/v4/app/Fragment;
        //   465: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   468: aload_0        
        //   469: getfield        android/support/v4/app/Fragment.mArguments:Landroid/os/Bundle;
        //   472: ifnull          498
        //   475: aload_3        
        //   476: aload_1        
        //   477: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   480: aload_3        
        //   481: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   484: bipush          25
        //   486: aaload         
        //   487: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   490: aload_3        
        //   491: aload_0        
        //   492: getfield        android/support/v4/app/Fragment.mArguments:Landroid/os/Bundle;
        //   495: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   498: aload_0        
        //   499: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //   502: ifnull          528
        //   505: aload_3        
        //   506: aload_1        
        //   507: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   510: aload_3        
        //   511: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   514: bipush          24
        //   516: aaload         
        //   517: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   520: aload_3        
        //   521: aload_0        
        //   522: getfield        android/support/v4/app/Fragment.mSavedFragmentState:Landroid/os/Bundle;
        //   525: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   528: aload_0        
        //   529: getfield        android/support/v4/app/Fragment.mSavedViewState:Landroid/util/SparseArray;
        //   532: ifnull          558
        //   535: aload_3        
        //   536: aload_1        
        //   537: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   540: aload_3        
        //   541: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   544: bipush          49
        //   546: aaload         
        //   547: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   550: aload_3        
        //   551: aload_0        
        //   552: getfield        android/support/v4/app/Fragment.mSavedViewState:Landroid/util/SparseArray;
        //   555: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   558: aload_0        
        //   559: getfield        android/support/v4/app/Fragment.mTarget:Landroid/support/v4/app/Fragment;
        //   562: ifnull          606
        //   565: aload_3        
        //   566: aload_1        
        //   567: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   570: aload_3        
        //   571: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   574: bipush          26
        //   576: aaload         
        //   577: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   580: aload_3        
        //   581: aload_0        
        //   582: getfield        android/support/v4/app/Fragment.mTarget:Landroid/support/v4/app/Fragment;
        //   585: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/Object;)V
        //   588: aload_3        
        //   589: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   592: bipush          56
        //   594: aaload         
        //   595: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   598: aload_3        
        //   599: aload_0        
        //   600: getfield        android/support/v4/app/Fragment.mTargetRequestCode:I
        //   603: invokevirtual   java/io/PrintWriter.println:(I)V
        //   606: aload_0        
        //   607: getfield        android/support/v4/app/Fragment.mNextAnim:I
        //   610: ifeq            636
        //   613: aload_3        
        //   614: aload_1        
        //   615: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   618: aload_3        
        //   619: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   622: bipush          42
        //   624: aaload         
        //   625: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   628: aload_3        
        //   629: aload_0        
        //   630: getfield        android/support/v4/app/Fragment.mNextAnim:I
        //   633: invokevirtual   java/io/PrintWriter.println:(I)V
        //   636: aload_0        
        //   637: getfield        android/support/v4/app/Fragment.mContainer:Landroid/view/ViewGroup;
        //   640: ifnull          666
        //   643: aload_3        
        //   644: aload_1        
        //   645: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   648: aload_3        
        //   649: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   652: bipush          28
        //   654: aaload         
        //   655: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   658: aload_3        
        //   659: aload_0        
        //   660: getfield        android/support/v4/app/Fragment.mContainer:Landroid/view/ViewGroup;
        //   663: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   666: aload_0        
        //   667: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   670: ifnull          696
        //   673: aload_3        
        //   674: aload_1        
        //   675: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   678: aload_3        
        //   679: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   682: bipush          39
        //   684: aaload         
        //   685: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   688: aload_3        
        //   689: aload_0        
        //   690: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   693: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   696: aload_0        
        //   697: getfield        android/support/v4/app/Fragment.mInnerView:Landroid/view/View;
        //   700: ifnull          726
        //   703: aload_3        
        //   704: aload_1        
        //   705: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   708: aload_3        
        //   709: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   712: bipush          30
        //   714: aaload         
        //   715: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   718: aload_3        
        //   719: aload_0        
        //   720: getfield        android/support/v4/app/Fragment.mView:Landroid/view/View;
        //   723: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   726: aload_0        
        //   727: getfield        android/support/v4/app/Fragment.mAnimatingAway:Landroid/view/View;
        //   730: ifnull          779
        //   733: aload_3        
        //   734: aload_1        
        //   735: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   738: aload_3        
        //   739: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   742: bipush          29
        //   744: aaload         
        //   745: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   748: aload_3        
        //   749: aload_0        
        //   750: getfield        android/support/v4/app/Fragment.mAnimatingAway:Landroid/view/View;
        //   753: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   756: aload_3        
        //   757: aload_1        
        //   758: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   761: aload_3        
        //   762: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   765: bipush          54
        //   767: aaload         
        //   768: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   771: aload_3        
        //   772: aload_0        
        //   773: getfield        android/support/v4/app/Fragment.mStateAfterAnimating:I
        //   776: invokevirtual   java/io/PrintWriter.println:(I)V
        //   779: aload_0        
        //   780: getfield        android/support/v4/app/Fragment.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //   783: ifnull          835
        //   786: aload_3        
        //   787: aload_1        
        //   788: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   791: aload_3        
        //   792: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   795: bipush          35
        //   797: aaload         
        //   798: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   801: aload_0        
        //   802: getfield        android/support/v4/app/Fragment.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //   805: new             Ljava/lang/StringBuilder;
        //   808: dup            
        //   809: invokespecial   java/lang/StringBuilder.<init>:()V
        //   812: aload_1        
        //   813: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   816: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   819: bipush          40
        //   821: aaload         
        //   822: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   825: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   828: aload_2        
        //   829: aload_3        
        //   830: aload           4
        //   832: invokevirtual   android/support/v4/app/LoaderManagerImpl.dump:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
        //   835: aload_0        
        //   836: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   839: ifnull          917
        //   842: aload_3        
        //   843: aload_1        
        //   844: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   847: aload_3        
        //   848: new             Ljava/lang/StringBuilder;
        //   851: dup            
        //   852: invokespecial   java/lang/StringBuilder.<init>:()V
        //   855: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   858: bipush          34
        //   860: aaload         
        //   861: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   864: aload_0        
        //   865: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   868: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   871: ldc_w           ":"
        //   874: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   877: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   880: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   883: aload_0        
        //   884: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   887: new             Ljava/lang/StringBuilder;
        //   890: dup            
        //   891: invokespecial   java/lang/StringBuilder.<init>:()V
        //   894: aload_1        
        //   895: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   898: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //   901: bipush          52
        //   903: aaload         
        //   904: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   907: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   910: aload_2        
        //   911: aload_3        
        //   912: aload           4
        //   914: invokevirtual   android/support/v4/app/FragmentManagerImpl.dump:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
        //   917: iload           5
        //   919: ifeq            930
        //   922: iconst_1       
        //   923: getstatic       android/support/v4/app/FragmentActivity.a:I
        //   926: iadd           
        //   927: putstatic       android/support/v4/app/FragmentActivity.a:I
        //   930: return         
        //   931: astore          6
        //   933: aload           6
        //   935: athrow         
        //   936: astore          7
        //   938: aload           7
        //   940: athrow         
        //   941: astore          8
        //   943: aload           8
        //   945: athrow         
        //   946: astore          9
        //   948: aload           9
        //   950: athrow         
        //   951: astore          10
        //   953: aload           10
        //   955: athrow         
        //   956: astore          11
        //   958: aload           11
        //   960: athrow         
        //   961: astore          12
        //   963: aload           12
        //   965: athrow         
        //   966: astore          13
        //   968: aload           13
        //   970: athrow         
        //   971: astore          14
        //   973: aload           14
        //   975: athrow         
        //   976: astore          15
        //   978: aload           15
        //   980: athrow         
        //   981: astore          16
        //   983: aload           16
        //   985: athrow         
        //   986: astore          17
        //   988: aload           17
        //   990: athrow         
        //   991: astore          18
        //   993: aload           18
        //   995: athrow         
        //   996: astore          19
        //   998: aload           19
        //  1000: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  5      408    931    936    Landroid/support/v4/app/Fragment$InstantiationException;
        //  408    438    936    941    Landroid/support/v4/app/Fragment$InstantiationException;
        //  438    468    941    946    Landroid/support/v4/app/Fragment$InstantiationException;
        //  468    498    946    951    Landroid/support/v4/app/Fragment$InstantiationException;
        //  498    528    951    956    Landroid/support/v4/app/Fragment$InstantiationException;
        //  528    558    956    961    Landroid/support/v4/app/Fragment$InstantiationException;
        //  558    606    961    966    Landroid/support/v4/app/Fragment$InstantiationException;
        //  606    636    966    971    Landroid/support/v4/app/Fragment$InstantiationException;
        //  636    666    971    976    Landroid/support/v4/app/Fragment$InstantiationException;
        //  666    696    976    981    Landroid/support/v4/app/Fragment$InstantiationException;
        //  696    726    981    986    Landroid/support/v4/app/Fragment$InstantiationException;
        //  726    779    986    991    Landroid/support/v4/app/Fragment$InstantiationException;
        //  779    835    991    996    Landroid/support/v4/app/Fragment$InstantiationException;
        //  835    917    996    1001   Landroid/support/v4/app/Fragment$InstantiationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 504, Size: 504
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
    public final boolean equals(final Object o) {
        return super.equals(o);
    }
    
    public final FragmentActivity getActivity() {
        return this.mActivity;
    }
    
    public boolean getAllowEnterTransitionOverlap() {
        try {
            if (this.mAllowEnterTransitionOverlap == null) {
                return true;
            }
        }
        catch (Fragment$InstantiationException ex) {
            throw ex;
        }
        return this.mAllowEnterTransitionOverlap;
    }
    
    public boolean getAllowReturnTransitionOverlap() {
        try {
            if (this.mAllowReturnTransitionOverlap == null) {
                return true;
            }
        }
        catch (Fragment$InstantiationException ex) {
            throw ex;
        }
        return this.mAllowReturnTransitionOverlap;
    }
    
    public final Bundle getArguments() {
        return this.mArguments;
    }
    
    public final FragmentManager getChildFragmentManager() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //     8: astore          10
        //    10: aload           10
        //    12: ifnonnull       103
        //    15: aload_0        
        //    16: invokevirtual   android/support/v4/app/Fragment.instantiateChildFragmentManager:()V
        //    19: aload_0        
        //    20: getfield        android/support/v4/app/Fragment.mState:I
        //    23: istore          11
        //    25: iload           11
        //    27: iconst_5       
        //    28: if_icmplt       42
        //    31: aload_0        
        //    32: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    35: invokevirtual   android/support/v4/app/FragmentManagerImpl.dispatchResume:()V
        //    38: iload_1        
        //    39: ifeq            103
        //    42: aload_0        
        //    43: getfield        android/support/v4/app/Fragment.mState:I
        //    46: istore          12
        //    48: iload           12
        //    50: iconst_4       
        //    51: if_icmplt       65
        //    54: aload_0        
        //    55: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    58: invokevirtual   android/support/v4/app/FragmentManagerImpl.dispatchStart:()V
        //    61: iload_1        
        //    62: ifeq            103
        //    65: aload_0        
        //    66: getfield        android/support/v4/app/Fragment.mState:I
        //    69: istore          13
        //    71: iload           13
        //    73: iconst_2       
        //    74: if_icmplt       88
        //    77: aload_0        
        //    78: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    81: invokevirtual   android/support/v4/app/FragmentManagerImpl.dispatchActivityCreated:()V
        //    84: iload_1        
        //    85: ifeq            103
        //    88: aload_0        
        //    89: getfield        android/support/v4/app/Fragment.mState:I
        //    92: iconst_1       
        //    93: if_icmplt       103
        //    96: aload_0        
        //    97: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   100: invokevirtual   android/support/v4/app/FragmentManagerImpl.dispatchCreate:()V
        //   103: aload_0        
        //   104: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //   107: areturn        
        //   108: astore_2       
        //   109: aload_2        
        //   110: athrow         
        //   111: astore_3       
        //   112: aload_3        
        //   113: athrow         
        //   114: astore          4
        //   116: aload           4
        //   118: athrow         
        //   119: astore          5
        //   121: aload           5
        //   123: athrow         
        //   124: astore          6
        //   126: aload           6
        //   128: athrow         
        //   129: astore          7
        //   131: aload           7
        //   133: athrow         
        //   134: astore          8
        //   136: aload           8
        //   138: athrow         
        //   139: astore          9
        //   141: aload           9
        //   143: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  4      10     108    111    Landroid/support/v4/app/Fragment$InstantiationException;
        //  15     25     111    114    Landroid/support/v4/app/Fragment$InstantiationException;
        //  31     38     114    119    Landroid/support/v4/app/Fragment$InstantiationException;
        //  42     48     119    124    Landroid/support/v4/app/Fragment$InstantiationException;
        //  54     61     124    129    Landroid/support/v4/app/Fragment$InstantiationException;
        //  65     71     129    134    Landroid/support/v4/app/Fragment$InstantiationException;
        //  77     84     134    139    Landroid/support/v4/app/Fragment$InstantiationException;
        //  88     103    139    144    Landroid/support/v4/app/Fragment$InstantiationException;
        //  109    111    111    114    Landroid/support/v4/app/Fragment$InstantiationException;
        //  112    114    114    119    Landroid/support/v4/app/Fragment$InstantiationException;
        //  116    119    119    124    Landroid/support/v4/app/Fragment$InstantiationException;
        //  121    124    124    129    Landroid/support/v4/app/Fragment$InstantiationException;
        //  126    129    129    134    Landroid/support/v4/app/Fragment$InstantiationException;
        //  131    134    134    139    Landroid/support/v4/app/Fragment$InstantiationException;
        //  136    139    139    144    Landroid/support/v4/app/Fragment$InstantiationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 76, Size: 76
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
    
    public Object getEnterTransition() {
        return this.mEnterTransition;
    }
    
    public Object getExitTransition() {
        return this.mExitTransition;
    }
    
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }
    
    public LayoutInflater getLayoutInflater(final Bundle bundle) {
        final LayoutInflater cloneInContext = this.mActivity.getLayoutInflater().cloneInContext((Context)this.mActivity);
        this.getChildFragmentManager();
        LayoutInflaterCompat.setFactory(cloneInContext, this.mChildFragmentManager.getLayoutInflaterFactory());
        return cloneInContext;
    }
    
    public LoaderManager getLoaderManager() {
        try {
            if (this.mLoaderManager != null) {
                return this.mLoaderManager;
            }
        }
        catch (Fragment$InstantiationException ex) {
            throw ex;
        }
        try {
            if (this.mActivity == null) {
                throw new IllegalStateException(Fragment.z[2] + this + Fragment.z[1]);
            }
        }
        catch (Fragment$InstantiationException ex2) {
            throw ex2;
        }
        this.mCheckedForLoaderManager = true;
        return this.mLoaderManager = this.mActivity.getLoaderManager(this.mWho, this.mLoadersStarted, true);
    }
    
    public Object getReenterTransition() {
        try {
            if (this.mReenterTransition == Fragment.USE_DEFAULT_TRANSITION) {
                return this.getExitTransition();
            }
        }
        catch (Fragment$InstantiationException ex) {
            throw ex;
        }
        return this.mReenterTransition;
    }
    
    public final Resources getResources() {
        try {
            if (this.mActivity == null) {
                throw new IllegalStateException(Fragment.z[65] + this + Fragment.z[64]);
            }
        }
        catch (Fragment$InstantiationException ex) {
            throw ex;
        }
        return this.mActivity.getResources();
    }
    
    public Object getReturnTransition() {
        try {
            if (this.mReturnTransition == Fragment.USE_DEFAULT_TRANSITION) {
                return this.getEnterTransition();
            }
        }
        catch (Fragment$InstantiationException ex) {
            throw ex;
        }
        return this.mReturnTransition;
    }
    
    public Object getSharedElementEnterTransition() {
        return this.mSharedElementEnterTransition;
    }
    
    public Object getSharedElementReturnTransition() {
        try {
            if (this.mSharedElementReturnTransition == Fragment.USE_DEFAULT_TRANSITION) {
                return this.getSharedElementEnterTransition();
            }
        }
        catch (Fragment$InstantiationException ex) {
            throw ex;
        }
        return this.mSharedElementReturnTransition;
    }
    
    public final String getString(final int n) {
        return this.getResources().getString(n);
    }
    
    public final String getString(final int n, final Object[] array) {
        return this.getResources().getString(n, array);
    }
    
    @Nullable
    public View getView() {
        return this.mView;
    }
    
    @Override
    public final int hashCode() {
        return super.hashCode();
    }
    
    void initState() {
        this.mIndex = -1;
        this.mWho = null;
        this.mAdded = false;
        this.mRemoving = false;
        this.mResumed = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = null;
        this.mActivity = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
        this.mRetaining = false;
        this.mLoaderManager = null;
        this.mLoadersStarted = false;
        this.mCheckedForLoaderManager = false;
    }
    
    void instantiateChildFragmentManager() {
        (this.mChildFragmentManager = new FragmentManagerImpl()).attachActivity(this.mActivity, new Fragment$1(this), this);
    }
    
    public final boolean isAdded() {
        try {
            if (this.mActivity == null) {
                return false;
            }
            final Fragment fragment = this;
            final boolean b = fragment.mAdded;
            if (b) {
                return true;
            }
            return false;
        }
        catch (Fragment$InstantiationException ex) {
            throw ex;
        }
        try {
            final Fragment fragment = this;
            final boolean b = fragment.mAdded;
            if (b) {
                return true;
            }
        }
        catch (Fragment$InstantiationException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public final boolean isDetached() {
        return this.mDetached;
    }
    
    public final boolean isHidden() {
        return this.mHidden;
    }
    
    final boolean isInBackStack() {
        try {
            if (this.mBackStackNesting > 0) {
                return true;
            }
        }
        catch (Fragment$InstantiationException ex) {
            throw ex;
        }
        return false;
    }
    
    public final boolean isRemoving() {
        return this.mRemoving;
    }
    
    public final boolean isResumed() {
        return this.mResumed;
    }
    
    public void onActivityCreated(@Nullable final Bundle bundle) {
        this.mCalled = true;
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
    }
    
    public void onAttach(final Activity activity) {
        this.mCalled = true;
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        this.mCalled = true;
    }
    
    public boolean onContextItemSelected(final MenuItem menuItem) {
        return false;
    }
    
    public void onCreate(@Nullable final Bundle bundle) {
        this.mCalled = true;
    }
    
    public Animation onCreateAnimation(final int n, final boolean b, final int n2) {
        return null;
    }
    
    public void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        this.getActivity().onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
    }
    
    public void onCreateOptionsMenu(final Menu menu, final MenuInflater menuInflater) {
    }
    
    @Nullable
    public View onCreateView(final LayoutInflater layoutInflater, @Nullable final ViewGroup viewGroup, @Nullable final Bundle bundle) {
        return null;
    }
    
    public void onDestroy() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: iconst_1       
        //     2: putfield        android/support/v4/app/Fragment.mCalled:Z
        //     5: aload_0        
        //     6: getfield        android/support/v4/app/Fragment.mCheckedForLoaderManager:Z
        //     9: ifne            37
        //    12: aload_0        
        //    13: iconst_1       
        //    14: putfield        android/support/v4/app/Fragment.mCheckedForLoaderManager:Z
        //    17: aload_0        
        //    18: aload_0        
        //    19: getfield        android/support/v4/app/Fragment.mActivity:Landroid/support/v4/app/FragmentActivity;
        //    22: aload_0        
        //    23: getfield        android/support/v4/app/Fragment.mWho:Ljava/lang/String;
        //    26: aload_0        
        //    27: getfield        android/support/v4/app/Fragment.mLoadersStarted:Z
        //    30: iconst_0       
        //    31: invokevirtual   android/support/v4/app/FragmentActivity.getLoaderManager:(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
        //    34: putfield        android/support/v4/app/Fragment.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //    37: aload_0        
        //    38: getfield        android/support/v4/app/Fragment.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //    41: ifnull          51
        //    44: aload_0        
        //    45: getfield        android/support/v4/app/Fragment.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //    48: invokevirtual   android/support/v4/app/LoaderManagerImpl.doDestroy:()V
        //    51: return         
        //    52: astore_1       
        //    53: aload_1        
        //    54: athrow         
        //    55: astore_2       
        //    56: aload_2        
        //    57: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  0      37     52     55     Landroid/support/v4/app/Fragment$InstantiationException;
        //  37     51     55     58     Landroid/support/v4/app/Fragment$InstantiationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0037:
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
    
    public void onDestroyOptionsMenu() {
    }
    
    public void onDestroyView() {
        this.mCalled = true;
    }
    
    public void onDetach() {
        this.mCalled = true;
    }
    
    public void onHiddenChanged(final boolean b) {
    }
    
    public void onInflate(final Activity activity, final AttributeSet set, final Bundle bundle) {
        this.mCalled = true;
    }
    
    public void onLowMemory() {
        this.mCalled = true;
    }
    
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        return false;
    }
    
    public void onOptionsMenuClosed(final Menu menu) {
    }
    
    public void onPause() {
        this.mCalled = true;
    }
    
    public void onPrepareOptionsMenu(final Menu menu) {
    }
    
    public void onResume() {
        this.mCalled = true;
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
    }
    
    public void onStart() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: iconst_1       
        //     2: putfield        android/support/v4/app/Fragment.mCalled:Z
        //     5: aload_0        
        //     6: getfield        android/support/v4/app/Fragment.mLoadersStarted:Z
        //     9: istore_3       
        //    10: iload_3        
        //    11: ifne            65
        //    14: aload_0        
        //    15: iconst_1       
        //    16: putfield        android/support/v4/app/Fragment.mLoadersStarted:Z
        //    19: aload_0        
        //    20: getfield        android/support/v4/app/Fragment.mCheckedForLoaderManager:Z
        //    23: ifne            51
        //    26: aload_0        
        //    27: iconst_1       
        //    28: putfield        android/support/v4/app/Fragment.mCheckedForLoaderManager:Z
        //    31: aload_0        
        //    32: aload_0        
        //    33: getfield        android/support/v4/app/Fragment.mActivity:Landroid/support/v4/app/FragmentActivity;
        //    36: aload_0        
        //    37: getfield        android/support/v4/app/Fragment.mWho:Ljava/lang/String;
        //    40: aload_0        
        //    41: getfield        android/support/v4/app/Fragment.mLoadersStarted:Z
        //    44: iconst_0       
        //    45: invokevirtual   android/support/v4/app/FragmentActivity.getLoaderManager:(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
        //    48: putfield        android/support/v4/app/Fragment.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //    51: aload_0        
        //    52: getfield        android/support/v4/app/Fragment.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //    55: ifnull          65
        //    58: aload_0        
        //    59: getfield        android/support/v4/app/Fragment.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //    62: invokevirtual   android/support/v4/app/LoaderManagerImpl.doStart:()V
        //    65: return         
        //    66: astore_1       
        //    67: aload_1        
        //    68: athrow         
        //    69: astore_2       
        //    70: aload_2        
        //    71: athrow         
        //    72: astore          4
        //    74: aload           4
        //    76: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  0      10     66     69     Landroid/support/v4/app/Fragment$InstantiationException;
        //  14     51     69     72     Landroid/support/v4/app/Fragment$InstantiationException;
        //  51     65     72     77     Landroid/support/v4/app/Fragment$InstantiationException;
        //  67     69     69     72     Landroid/support/v4/app/Fragment$InstantiationException;
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
    
    public void onStop() {
        this.mCalled = true;
    }
    
    public void onViewCreated(final View view, @Nullable final Bundle bundle) {
    }
    
    public void onViewStateRestored(@Nullable final Bundle bundle) {
        this.mCalled = true;
    }
    
    void performActivityCreated(final Bundle bundle) {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.noteStateNotSaved();
            }
            try {
                this.mCalled = false;
                this.onActivityCreated(bundle);
                if (!this.mCalled) {
                    throw new SuperNotCalledException(Fragment.z[22] + this + Fragment.z[23]);
                }
            }
            catch (Fragment$InstantiationException ex) {
                throw ex;
            }
        }
        catch (Fragment$InstantiationException ex2) {
            throw ex2;
        }
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchActivityCreated();
            }
        }
        catch (Fragment$InstantiationException ex3) {
            throw ex3;
        }
    }
    
    void performConfigurationChanged(final Configuration configuration) {
        try {
            this.onConfigurationChanged(configuration);
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchConfigurationChanged(configuration);
            }
        }
        catch (Fragment$InstantiationException ex) {
            throw ex;
        }
    }
    
    boolean performContextItemSelected(final MenuItem menuItem) {
        Label_0027: {
            try {
                if (this.mHidden) {
                    return false;
                }
                final Fragment fragment = this;
                final MenuItem menuItem2 = menuItem;
                final boolean b = fragment.onContextItemSelected(menuItem2);
                if (b) {
                    return true;
                }
                break Label_0027;
            }
            catch (Fragment$InstantiationException ex) {
                throw ex;
            }
            try {
                final Fragment fragment = this;
                final MenuItem menuItem2 = menuItem;
                final boolean b = fragment.onContextItemSelected(menuItem2);
                if (b) {
                    return true;
                }
            }
            catch (Fragment$InstantiationException ex2) {
                throw ex2;
            }
            try {
                if (this.mChildFragmentManager == null) {
                    return false;
                }
                final Fragment fragment2 = this;
                final FragmentManagerImpl fragmentManagerImpl = fragment2.mChildFragmentManager;
                final MenuItem menuItem3 = menuItem;
                final boolean b3 = fragmentManagerImpl.dispatchContextItemSelected(menuItem3);
                if (!b3) {
                    return false;
                }
                return true;
            }
            catch (Fragment$InstantiationException ex3) {
                throw ex3;
            }
        }
        try {
            final Fragment fragment2 = this;
            final FragmentManagerImpl fragmentManagerImpl = fragment2.mChildFragmentManager;
            final MenuItem menuItem3 = menuItem;
            final boolean b3 = fragmentManagerImpl.dispatchContextItemSelected(menuItem3);
            if (!b3) {
                return false;
            }
        }
        catch (Fragment$InstantiationException ex4) {
            throw ex4;
        }
        return true;
    }
    
    void performCreate(final Bundle bundle) {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.noteStateNotSaved();
            }
            try {
                this.mCalled = false;
                this.onCreate(bundle);
                if (!this.mCalled) {
                    throw new SuperNotCalledException(Fragment.z[15] + this + Fragment.z[14]);
                }
            }
            catch (Fragment$InstantiationException ex) {
                throw ex;
            }
        }
        catch (Fragment$InstantiationException ex2) {
            throw ex2;
        }
        if (bundle == null) {
            return;
        }
        final Parcelable parcelable = bundle.getParcelable(Fragment.z[16]);
        if (parcelable == null) {
            return;
        }
        try {
            if (this.mChildFragmentManager == null) {
                this.instantiateChildFragmentManager();
            }
            this.mChildFragmentManager.restoreAllState(parcelable, null);
            this.mChildFragmentManager.dispatchCreate();
        }
        catch (Fragment$InstantiationException ex3) {
            throw ex3;
        }
    }
    
    boolean performCreateOptionsMenu(final Menu p0, final MenuInflater p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/app/Fragment.mHidden:Z
        //     4: istore          5
        //     6: iconst_0       
        //     7: istore          6
        //     9: iload           5
        //    11: ifne            72
        //    14: aload_0        
        //    15: getfield        android/support/v4/app/Fragment.mHasMenu:Z
        //    18: istore          7
        //    20: iconst_0       
        //    21: istore          6
        //    23: iload           7
        //    25: ifeq            51
        //    28: aload_0        
        //    29: getfield        android/support/v4/app/Fragment.mMenuVisible:Z
        //    32: istore          8
        //    34: iconst_0       
        //    35: istore          6
        //    37: iload           8
        //    39: ifeq            51
        //    42: iconst_1       
        //    43: istore          6
        //    45: aload_0        
        //    46: aload_1        
        //    47: aload_2        
        //    48: invokevirtual   android/support/v4/app/Fragment.onCreateOptionsMenu:(Landroid/view/Menu;Landroid/view/MenuInflater;)V
        //    51: aload_0        
        //    52: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    55: ifnull          72
        //    58: iload           6
        //    60: aload_0        
        //    61: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    64: aload_1        
        //    65: aload_2        
        //    66: invokevirtual   android/support/v4/app/FragmentManagerImpl.dispatchCreateOptionsMenu:(Landroid/view/Menu;Landroid/view/MenuInflater;)Z
        //    69: ior            
        //    70: istore          6
        //    72: iload           6
        //    74: ireturn        
        //    75: astore_3       
        //    76: aload_3        
        //    77: athrow         
        //    78: astore          4
        //    80: aload           4
        //    82: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  0      6      75     78     Landroid/support/v4/app/Fragment$InstantiationException;
        //  14     20     78     83     Landroid/support/v4/app/Fragment$InstantiationException;
        //  28     34     78     83     Landroid/support/v4/app/Fragment$InstantiationException;
        //  76     78     78     83     Landroid/support/v4/app/Fragment$InstantiationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0051:
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
    
    View performCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.noteStateNotSaved();
            }
            return this.onCreateView(layoutInflater, viewGroup, bundle);
        }
        catch (Fragment$InstantiationException ex) {
            throw ex;
        }
    }
    
    void performDestroy() {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchDestroy();
            }
            try {
                this.mCalled = false;
                this.onDestroy();
                if (!this.mCalled) {
                    throw new SuperNotCalledException(Fragment.z[61] + this + Fragment.z[62]);
                }
            }
            catch (Fragment$InstantiationException ex) {
                throw ex;
            }
        }
        catch (Fragment$InstantiationException ex2) {
            throw ex2;
        }
    }
    
    void performDestroyView() {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchDestroyView();
            }
            try {
                this.mCalled = false;
                this.onDestroyView();
                if (!this.mCalled) {
                    throw new SuperNotCalledException(Fragment.z[17] + this + Fragment.z[18]);
                }
            }
            catch (Fragment$InstantiationException ex) {
                throw ex;
            }
        }
        catch (Fragment$InstantiationException ex2) {
            throw ex2;
        }
        try {
            if (this.mLoaderManager != null) {
                this.mLoaderManager.doReportNextStart();
            }
        }
        catch (Fragment$InstantiationException ex3) {
            throw ex3;
        }
    }
    
    void performLowMemory() {
        try {
            this.onLowMemory();
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchLowMemory();
            }
        }
        catch (Fragment$InstantiationException ex) {
            throw ex;
        }
    }
    
    boolean performOptionsItemSelected(final MenuItem p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/app/Fragment.mHidden:Z
        //     4: istore          6
        //     6: iload           6
        //     8: ifne            98
        //    11: aload_0        
        //    12: getfield        android/support/v4/app/Fragment.mHasMenu:Z
        //    15: istore          7
        //    17: iload           7
        //    19: ifeq            63
        //    22: aload_0        
        //    23: getfield        android/support/v4/app/Fragment.mMenuVisible:Z
        //    26: istore          11
        //    28: iload           11
        //    30: ifeq            63
        //    33: aload_0        
        //    34: aload_1        
        //    35: invokevirtual   android/support/v4/app/Fragment.onOptionsItemSelected:(Landroid/view/MenuItem;)Z
        //    38: istore          12
        //    40: iload           12
        //    42: ifeq            63
        //    45: iconst_1       
        //    46: ireturn        
        //    47: astore_2       
        //    48: aload_2        
        //    49: athrow         
        //    50: astore_3       
        //    51: aload_3        
        //    52: athrow         
        //    53: astore          4
        //    55: aload           4
        //    57: athrow         
        //    58: astore          5
        //    60: aload           5
        //    62: athrow         
        //    63: aload_0        
        //    64: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    67: astore          10
        //    69: aload           10
        //    71: ifnull          98
        //    74: aload_0        
        //    75: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    78: aload_1        
        //    79: invokevirtual   android/support/v4/app/FragmentManagerImpl.dispatchOptionsItemSelected:(Landroid/view/MenuItem;)Z
        //    82: ifne            45
        //    85: goto            98
        //    88: astore          8
        //    90: aload           8
        //    92: athrow         
        //    93: astore          9
        //    95: aload           9
        //    97: athrow         
        //    98: iconst_0       
        //    99: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  0      6      47     50     Landroid/support/v4/app/Fragment$InstantiationException;
        //  11     17     50     53     Landroid/support/v4/app/Fragment$InstantiationException;
        //  22     28     53     58     Landroid/support/v4/app/Fragment$InstantiationException;
        //  33     40     58     63     Landroid/support/v4/app/Fragment$InstantiationException;
        //  48     50     50     53     Landroid/support/v4/app/Fragment$InstantiationException;
        //  51     53     53     58     Landroid/support/v4/app/Fragment$InstantiationException;
        //  55     58     58     63     Landroid/support/v4/app/Fragment$InstantiationException;
        //  63     69     88     93     Landroid/support/v4/app/Fragment$InstantiationException;
        //  74     85     93     98     Landroid/support/v4/app/Fragment$InstantiationException;
        //  90     93     93     98     Landroid/support/v4/app/Fragment$InstantiationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 54, Size: 54
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
    
    void performOptionsMenuClosed(final Menu p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/app/Fragment.mHidden:Z
        //     4: istore          5
        //     6: iload           5
        //     8: ifne            49
        //    11: aload_0        
        //    12: getfield        android/support/v4/app/Fragment.mHasMenu:Z
        //    15: istore          6
        //    17: iload           6
        //    19: ifeq            34
        //    22: aload_0        
        //    23: getfield        android/support/v4/app/Fragment.mMenuVisible:Z
        //    26: ifeq            34
        //    29: aload_0        
        //    30: aload_1        
        //    31: invokevirtual   android/support/v4/app/Fragment.onOptionsMenuClosed:(Landroid/view/Menu;)V
        //    34: aload_0        
        //    35: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    38: ifnull          49
        //    41: aload_0        
        //    42: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    45: aload_1        
        //    46: invokevirtual   android/support/v4/app/FragmentManagerImpl.dispatchOptionsMenuClosed:(Landroid/view/Menu;)V
        //    49: return         
        //    50: astore_2       
        //    51: aload_2        
        //    52: athrow         
        //    53: astore_3       
        //    54: aload_3        
        //    55: athrow         
        //    56: astore          4
        //    58: aload           4
        //    60: athrow         
        //    61: astore          7
        //    63: aload           7
        //    65: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  0      6      50     53     Landroid/support/v4/app/Fragment$InstantiationException;
        //  11     17     53     56     Landroid/support/v4/app/Fragment$InstantiationException;
        //  22     34     56     61     Landroid/support/v4/app/Fragment$InstantiationException;
        //  34     49     61     66     Landroid/support/v4/app/Fragment$InstantiationException;
        //  51     53     53     56     Landroid/support/v4/app/Fragment$InstantiationException;
        //  54     56     56     61     Landroid/support/v4/app/Fragment$InstantiationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 36, Size: 36
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
    
    void performPause() {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchPause();
            }
            try {
                this.mCalled = false;
                this.onPause();
                if (!this.mCalled) {
                    throw new SuperNotCalledException(Fragment.z[67] + this + Fragment.z[66]);
                }
            }
            catch (Fragment$InstantiationException ex) {
                throw ex;
            }
        }
        catch (Fragment$InstantiationException ex2) {
            throw ex2;
        }
    }
    
    boolean performPrepareOptionsMenu(final Menu p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/app/Fragment.mHidden:Z
        //     4: istore          4
        //     6: iconst_0       
        //     7: istore          5
        //     9: iload           4
        //    11: ifne            70
        //    14: aload_0        
        //    15: getfield        android/support/v4/app/Fragment.mHasMenu:Z
        //    18: istore          6
        //    20: iconst_0       
        //    21: istore          5
        //    23: iload           6
        //    25: ifeq            50
        //    28: aload_0        
        //    29: getfield        android/support/v4/app/Fragment.mMenuVisible:Z
        //    32: istore          7
        //    34: iconst_0       
        //    35: istore          5
        //    37: iload           7
        //    39: ifeq            50
        //    42: iconst_1       
        //    43: istore          5
        //    45: aload_0        
        //    46: aload_1        
        //    47: invokevirtual   android/support/v4/app/Fragment.onPrepareOptionsMenu:(Landroid/view/Menu;)V
        //    50: aload_0        
        //    51: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    54: ifnull          70
        //    57: iload           5
        //    59: aload_0        
        //    60: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    63: aload_1        
        //    64: invokevirtual   android/support/v4/app/FragmentManagerImpl.dispatchPrepareOptionsMenu:(Landroid/view/Menu;)Z
        //    67: ior            
        //    68: istore          5
        //    70: iload           5
        //    72: ireturn        
        //    73: astore_2       
        //    74: aload_2        
        //    75: athrow         
        //    76: astore_3       
        //    77: aload_3        
        //    78: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  0      6      73     76     Landroid/support/v4/app/Fragment$InstantiationException;
        //  14     20     76     79     Landroid/support/v4/app/Fragment$InstantiationException;
        //  28     34     76     79     Landroid/support/v4/app/Fragment$InstantiationException;
        //  74     76     76     79     Landroid/support/v4/app/Fragment$InstantiationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0050:
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
    
    void performReallyStop() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //     4: ifnull          14
        //     7: aload_0        
        //     8: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    11: invokevirtual   android/support/v4/app/FragmentManagerImpl.dispatchReallyStop:()V
        //    14: aload_0        
        //    15: getfield        android/support/v4/app/Fragment.mLoadersStarted:Z
        //    18: istore          4
        //    20: iload           4
        //    22: ifeq            107
        //    25: aload_0        
        //    26: iconst_0       
        //    27: putfield        android/support/v4/app/Fragment.mLoadersStarted:Z
        //    30: aload_0        
        //    31: getfield        android/support/v4/app/Fragment.mCheckedForLoaderManager:Z
        //    34: ifne            62
        //    37: aload_0        
        //    38: iconst_1       
        //    39: putfield        android/support/v4/app/Fragment.mCheckedForLoaderManager:Z
        //    42: aload_0        
        //    43: aload_0        
        //    44: getfield        android/support/v4/app/Fragment.mActivity:Landroid/support/v4/app/FragmentActivity;
        //    47: aload_0        
        //    48: getfield        android/support/v4/app/Fragment.mWho:Ljava/lang/String;
        //    51: aload_0        
        //    52: getfield        android/support/v4/app/Fragment.mLoadersStarted:Z
        //    55: iconst_0       
        //    56: invokevirtual   android/support/v4/app/FragmentActivity.getLoaderManager:(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
        //    59: putfield        android/support/v4/app/Fragment.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //    62: aload_0        
        //    63: getfield        android/support/v4/app/Fragment.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //    66: astore          8
        //    68: aload           8
        //    70: ifnull          107
        //    73: aload_0        
        //    74: getfield        android/support/v4/app/Fragment.mActivity:Landroid/support/v4/app/FragmentActivity;
        //    77: getfield        android/support/v4/app/FragmentActivity.mRetaining:Z
        //    80: istore          9
        //    82: iload           9
        //    84: ifne            100
        //    87: aload_0        
        //    88: getfield        android/support/v4/app/Fragment.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //    91: invokevirtual   android/support/v4/app/LoaderManagerImpl.doStop:()V
        //    94: getstatic       android/support/v4/app/Fragment.a:I
        //    97: ifeq            107
        //   100: aload_0        
        //   101: getfield        android/support/v4/app/Fragment.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //   104: invokevirtual   android/support/v4/app/LoaderManagerImpl.doRetain:()V
        //   107: return         
        //   108: astore_1       
        //   109: aload_1        
        //   110: athrow         
        //   111: astore_2       
        //   112: aload_2        
        //   113: athrow         
        //   114: astore_3       
        //   115: aload_3        
        //   116: athrow         
        //   117: astore          5
        //   119: aload           5
        //   121: athrow         
        //   122: astore          6
        //   124: aload           6
        //   126: athrow         
        //   127: astore          7
        //   129: aload           7
        //   131: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  0      14     108    111    Landroid/support/v4/app/Fragment$InstantiationException;
        //  14     20     111    114    Landroid/support/v4/app/Fragment$InstantiationException;
        //  25     62     114    117    Landroid/support/v4/app/Fragment$InstantiationException;
        //  62     68     117    122    Landroid/support/v4/app/Fragment$InstantiationException;
        //  73     82     122    127    Landroid/support/v4/app/Fragment$InstantiationException;
        //  87     100    127    132    Landroid/support/v4/app/Fragment$InstantiationException;
        //  100    107    127    132    Landroid/support/v4/app/Fragment$InstantiationException;
        //  112    114    114    117    Landroid/support/v4/app/Fragment$InstantiationException;
        //  119    122    122    127    Landroid/support/v4/app/Fragment$InstantiationException;
        //  124    127    127    132    Landroid/support/v4/app/Fragment$InstantiationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 68, Size: 68
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
    
    void performResume() {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.noteStateNotSaved();
                this.mChildFragmentManager.execPendingActions();
            }
            try {
                this.mCalled = false;
                this.onResume();
                if (!this.mCalled) {
                    throw new SuperNotCalledException(Fragment.z[77] + this + Fragment.z[78]);
                }
            }
            catch (Fragment$InstantiationException ex) {
                throw ex;
            }
        }
        catch (Fragment$InstantiationException ex2) {
            throw ex2;
        }
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchResume();
                this.mChildFragmentManager.execPendingActions();
            }
        }
        catch (Fragment$InstantiationException ex3) {
            throw ex3;
        }
    }
    
    void performSaveInstanceState(final Bundle bundle) {
        this.onSaveInstanceState(bundle);
        if (this.mChildFragmentManager == null) {
            return;
        }
        final Parcelable saveAllState = this.mChildFragmentManager.saveAllState();
        if (saveAllState == null) {
            return;
        }
        try {
            bundle.putParcelable(Fragment.z[63], saveAllState);
        }
        catch (Fragment$InstantiationException ex) {
            throw ex;
        }
    }
    
    void performStart() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //     4: ifnull          22
        //     7: aload_0        
        //     8: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    11: invokevirtual   android/support/v4/app/FragmentManagerImpl.noteStateNotSaved:()V
        //    14: aload_0        
        //    15: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    18: invokevirtual   android/support/v4/app/FragmentManagerImpl.execPendingActions:()Z
        //    21: pop            
        //    22: aload_0        
        //    23: iconst_0       
        //    24: putfield        android/support/v4/app/Fragment.mCalled:Z
        //    27: aload_0        
        //    28: invokevirtual   android/support/v4/app/Fragment.onStart:()V
        //    31: aload_0        
        //    32: getfield        android/support/v4/app/Fragment.mCalled:Z
        //    35: ifne            84
        //    38: new             Landroid/support/v4/app/SuperNotCalledException;
        //    41: dup            
        //    42: new             Ljava/lang/StringBuilder;
        //    45: dup            
        //    46: invokespecial   java/lang/StringBuilder.<init>:()V
        //    49: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //    52: bipush          7
        //    54: aaload         
        //    55: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    58: aload_0        
        //    59: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    62: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //    65: bipush          6
        //    67: aaload         
        //    68: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    71: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    74: invokespecial   android/support/v4/app/SuperNotCalledException.<init>:(Ljava/lang/String;)V
        //    77: athrow         
        //    78: astore_2       
        //    79: aload_2        
        //    80: athrow         
        //    81: astore_1       
        //    82: aload_1        
        //    83: athrow         
        //    84: aload_0        
        //    85: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    88: ifnull          98
        //    91: aload_0        
        //    92: getfield        android/support/v4/app/Fragment.mChildFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    95: invokevirtual   android/support/v4/app/FragmentManagerImpl.dispatchStart:()V
        //    98: aload_0        
        //    99: getfield        android/support/v4/app/Fragment.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //   102: ifnull          112
        //   105: aload_0        
        //   106: getfield        android/support/v4/app/Fragment.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //   109: invokevirtual   android/support/v4/app/LoaderManagerImpl.doReportStart:()V
        //   112: return         
        //   113: astore_3       
        //   114: aload_3        
        //   115: athrow         
        //   116: astore          4
        //   118: aload           4
        //   120: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  0      22     81     84     Landroid/support/v4/app/Fragment$InstantiationException;
        //  22     78     78     81     Landroid/support/v4/app/Fragment$InstantiationException;
        //  84     98     113    116    Landroid/support/v4/app/Fragment$InstantiationException;
        //  98     112    116    121    Landroid/support/v4/app/Fragment$InstantiationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0098:
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
    
    void performStop() {
        try {
            if (this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchStop();
            }
            try {
                this.mCalled = false;
                this.onStop();
                if (!this.mCalled) {
                    throw new SuperNotCalledException(Fragment.z[4] + this + Fragment.z[5]);
                }
            }
            catch (Fragment$InstantiationException ex) {
                throw ex;
            }
        }
        catch (Fragment$InstantiationException ex2) {
            throw ex2;
        }
    }
    
    public void registerForContextMenu(final View view) {
        view.setOnCreateContextMenuListener((View$OnCreateContextMenuListener)this);
    }
    
    final void restoreViewState(final Bundle bundle) {
        try {
            if (this.mSavedViewState != null) {
                this.mInnerView.restoreHierarchyState(this.mSavedViewState);
                this.mSavedViewState = null;
            }
            try {
                this.mCalled = false;
                this.onViewStateRestored(bundle);
                if (!this.mCalled) {
                    throw new SuperNotCalledException(Fragment.z[10] + this + Fragment.z[11]);
                }
            }
            catch (Fragment$InstantiationException ex) {
                throw ex;
            }
        }
        catch (Fragment$InstantiationException ex2) {
            throw ex2;
        }
    }
    
    public void setArguments(final Bundle mArguments) {
        try {
            if (this.mIndex >= 0) {
                throw new IllegalStateException(Fragment.z[3]);
            }
        }
        catch (Fragment$InstantiationException ex) {
            throw ex;
        }
        this.mArguments = mArguments;
    }
    
    public void setHasOptionsMenu(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/app/Fragment.mHasMenu:Z
        //     4: istore          5
        //     6: iload           5
        //     8: iload_1        
        //     9: if_icmpeq       42
        //    12: aload_0        
        //    13: iload_1        
        //    14: putfield        android/support/v4/app/Fragment.mHasMenu:Z
        //    17: aload_0        
        //    18: invokevirtual   android/support/v4/app/Fragment.isAdded:()Z
        //    21: istore          6
        //    23: iload           6
        //    25: ifeq            42
        //    28: aload_0        
        //    29: invokevirtual   android/support/v4/app/Fragment.isHidden:()Z
        //    32: ifne            42
        //    35: aload_0        
        //    36: getfield        android/support/v4/app/Fragment.mActivity:Landroid/support/v4/app/FragmentActivity;
        //    39: invokevirtual   android/support/v4/app/FragmentActivity.supportInvalidateOptionsMenu:()V
        //    42: return         
        //    43: astore_2       
        //    44: aload_2        
        //    45: athrow         
        //    46: astore_3       
        //    47: aload_3        
        //    48: athrow         
        //    49: astore          4
        //    51: aload           4
        //    53: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  0      6      43     46     Landroid/support/v4/app/Fragment$InstantiationException;
        //  12     23     46     49     Landroid/support/v4/app/Fragment$InstantiationException;
        //  28     42     49     54     Landroid/support/v4/app/Fragment$InstantiationException;
        //  44     46     46     49     Landroid/support/v4/app/Fragment$InstantiationException;
        //  47     49     49     54     Landroid/support/v4/app/Fragment$InstantiationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 30, Size: 30
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
    
    final void setIndex(final int p0, final Fragment p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: iload_1        
        //     2: putfield        android/support/v4/app/Fragment.mIndex:I
        //     5: aload_2        
        //     6: ifnull          49
        //     9: aload_0        
        //    10: new             Ljava/lang/StringBuilder;
        //    13: dup            
        //    14: invokespecial   java/lang/StringBuilder.<init>:()V
        //    17: aload_2        
        //    18: getfield        android/support/v4/app/Fragment.mWho:Ljava/lang/String;
        //    21: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    24: ldc_w           ":"
        //    27: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    30: aload_0        
        //    31: getfield        android/support/v4/app/Fragment.mIndex:I
        //    34: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    37: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    40: putfield        android/support/v4/app/Fragment.mWho:Ljava/lang/String;
        //    43: getstatic       android/support/v4/app/Fragment.a:I
        //    46: ifeq            88
        //    49: aload_0        
        //    50: new             Ljava/lang/StringBuilder;
        //    53: dup            
        //    54: invokespecial   java/lang/StringBuilder.<init>:()V
        //    57: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //    60: bipush          19
        //    62: aaload         
        //    63: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    66: aload_0        
        //    67: getfield        android/support/v4/app/Fragment.mIndex:I
        //    70: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    73: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    76: putfield        android/support/v4/app/Fragment.mWho:Ljava/lang/String;
        //    79: return         
        //    80: astore_3       
        //    81: aload_3        
        //    82: athrow         
        //    83: astore          4
        //    85: aload           4
        //    87: athrow         
        //    88: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  0      5      80     83     Landroid/support/v4/app/Fragment$InstantiationException;
        //  9      49     83     88     Landroid/support/v4/app/Fragment$InstantiationException;
        //  49     79     83     88     Landroid/support/v4/app/Fragment$InstantiationException;
        //  81     83     83     88     Landroid/support/v4/app/Fragment$InstantiationException;
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
    
    public void setInitialSavedState(final Fragment$SavedState fragment$SavedState) {
        try {
            if (this.mIndex >= 0) {
                throw new IllegalStateException(Fragment.z[0]);
            }
        }
        catch (Fragment$InstantiationException ex) {
            throw ex;
        }
        while (true) {
            Label_0050: {
                if (fragment$SavedState == null) {
                    break Label_0050;
                }
                try {
                    if (fragment$SavedState.mState != null) {
                        final Bundle mState = fragment$SavedState.mState;
                        this.mSavedFragmentState = mState;
                        return;
                    }
                }
                catch (Fragment$InstantiationException ex2) {
                    throw ex2;
                }
            }
            final Bundle mState = null;
            continue;
        }
    }
    
    public void setMenuVisibility(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/app/Fragment.mMenuVisible:Z
        //     4: istore          6
        //     6: iload           6
        //     8: iload_1        
        //     9: if_icmpeq       53
        //    12: aload_0        
        //    13: iload_1        
        //    14: putfield        android/support/v4/app/Fragment.mMenuVisible:Z
        //    17: aload_0        
        //    18: getfield        android/support/v4/app/Fragment.mHasMenu:Z
        //    21: istore          7
        //    23: iload           7
        //    25: ifeq            53
        //    28: aload_0        
        //    29: invokevirtual   android/support/v4/app/Fragment.isAdded:()Z
        //    32: istore          8
        //    34: iload           8
        //    36: ifeq            53
        //    39: aload_0        
        //    40: invokevirtual   android/support/v4/app/Fragment.isHidden:()Z
        //    43: ifne            53
        //    46: aload_0        
        //    47: getfield        android/support/v4/app/Fragment.mActivity:Landroid/support/v4/app/FragmentActivity;
        //    50: invokevirtual   android/support/v4/app/FragmentActivity.supportInvalidateOptionsMenu:()V
        //    53: return         
        //    54: astore_2       
        //    55: aload_2        
        //    56: athrow         
        //    57: astore_3       
        //    58: aload_3        
        //    59: athrow         
        //    60: astore          4
        //    62: aload           4
        //    64: athrow         
        //    65: astore          5
        //    67: aload           5
        //    69: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  0      6      54     57     Landroid/support/v4/app/Fragment$InstantiationException;
        //  12     23     57     60     Landroid/support/v4/app/Fragment$InstantiationException;
        //  28     34     60     65     Landroid/support/v4/app/Fragment$InstantiationException;
        //  39     53     65     70     Landroid/support/v4/app/Fragment$InstantiationException;
        //  55     57     57     60     Landroid/support/v4/app/Fragment$InstantiationException;
        //  58     60     60     65     Landroid/support/v4/app/Fragment$InstantiationException;
        //  62     65     65     70     Landroid/support/v4/app/Fragment$InstantiationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 38, Size: 38
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
    
    public void setUserVisibleHint(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/app/Fragment.mUserVisibleHint:Z
        //     4: istore          5
        //     6: iload           5
        //     8: ifne            31
        //    11: iload_1        
        //    12: ifeq            31
        //    15: aload_0        
        //    16: getfield        android/support/v4/app/Fragment.mState:I
        //    19: iconst_4       
        //    20: if_icmpge       31
        //    23: aload_0        
        //    24: getfield        android/support/v4/app/Fragment.mFragmentManager:Landroid/support/v4/app/FragmentManagerImpl;
        //    27: aload_0        
        //    28: invokevirtual   android/support/v4/app/FragmentManagerImpl.performPendingDeferredStart:(Landroid/support/v4/app/Fragment;)V
        //    31: aload_0        
        //    32: iload_1        
        //    33: putfield        android/support/v4/app/Fragment.mUserVisibleHint:Z
        //    36: iload_1        
        //    37: ifne            66
        //    40: iconst_1       
        //    41: istore          7
        //    43: aload_0        
        //    44: iload           7
        //    46: putfield        android/support/v4/app/Fragment.mDeferStart:Z
        //    49: return         
        //    50: astore_2       
        //    51: aload_2        
        //    52: athrow         
        //    53: astore_3       
        //    54: aload_3        
        //    55: athrow         
        //    56: astore          4
        //    58: aload           4
        //    60: athrow         
        //    61: astore          6
        //    63: aload           6
        //    65: athrow         
        //    66: iconst_0       
        //    67: istore          7
        //    69: goto            43
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  0      6      50     56     Landroid/support/v4/app/Fragment$InstantiationException;
        //  15     31     56     61     Landroid/support/v4/app/Fragment$InstantiationException;
        //  31     36     61     66     Landroid/support/v4/app/Fragment$InstantiationException;
        //  51     53     53     56     Landroid/support/v4/app/Fragment$InstantiationException;
        //  54     56     56     61     Landroid/support/v4/app/Fragment$InstantiationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 41, Size: 41
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
    
    public void startActivity(final Intent intent) {
        try {
            if (this.mActivity == null) {
                throw new IllegalStateException(Fragment.z[9] + this + Fragment.z[8]);
            }
        }
        catch (Fragment$InstantiationException ex) {
            throw ex;
        }
        this.mActivity.startActivityFromFragment(this, intent, -1);
    }
    
    public void startActivityForResult(final Intent intent, final int n) {
        try {
            if (this.mActivity == null) {
                throw new IllegalStateException(Fragment.z[21] + this + Fragment.z[20]);
            }
        }
        catch (Fragment$InstantiationException ex) {
            throw ex;
        }
        this.mActivity.startActivityFromFragment(this, intent, n);
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
        //    11: aload_0        
        //    12: aload_1        
        //    13: invokestatic    android/support/v4/util/DebugUtils.buildShortClassTag:(Ljava/lang/Object;Ljava/lang/StringBuilder;)V
        //    16: aload_0        
        //    17: getfield        android/support/v4/app/Fragment.mIndex:I
        //    20: iflt            43
        //    23: aload_1        
        //    24: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //    27: bipush          13
        //    29: aaload         
        //    30: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    33: pop            
        //    34: aload_1        
        //    35: aload_0        
        //    36: getfield        android/support/v4/app/Fragment.mIndex:I
        //    39: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    42: pop            
        //    43: aload_0        
        //    44: getfield        android/support/v4/app/Fragment.mFragmentId:I
        //    47: ifeq            73
        //    50: aload_1        
        //    51: getstatic       android/support/v4/app/Fragment.z:[Ljava/lang/String;
        //    54: bipush          12
        //    56: aaload         
        //    57: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    60: pop            
        //    61: aload_1        
        //    62: aload_0        
        //    63: getfield        android/support/v4/app/Fragment.mFragmentId:I
        //    66: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //    69: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    72: pop            
        //    73: aload_0        
        //    74: getfield        android/support/v4/app/Fragment.mTag:Ljava/lang/String;
        //    77: ifnull          97
        //    80: aload_1        
        //    81: ldc_w           " "
        //    84: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    87: pop            
        //    88: aload_1        
        //    89: aload_0        
        //    90: getfield        android/support/v4/app/Fragment.mTag:Ljava/lang/String;
        //    93: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    96: pop            
        //    97: aload_1        
        //    98: bipush          125
        //   100: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   103: pop            
        //   104: aload_1        
        //   105: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   108: areturn        
        //   109: astore_2       
        //   110: aload_2        
        //   111: athrow         
        //   112: astore_3       
        //   113: aload_3        
        //   114: athrow         
        //   115: astore          4
        //   117: aload           4
        //   119: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                    
        //  -----  -----  -----  -----  --------------------------------------------------------
        //  11     43     109    112    Landroid/support/v4/app/Fragment$InstantiationException;
        //  43     73     112    115    Landroid/support/v4/app/Fragment$InstantiationException;
        //  73     97     115    120    Landroid/support/v4/app/Fragment$InstantiationException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 65, Size: 65
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
}
