// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.support.v4.util.DebugUtils;
import android.support.v4.content.Loader;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.util.Log;
import android.os.Bundle;
import android.support.v4.util.SparseArrayCompat;

class LoaderManagerImpl extends LoaderManager
{
    static boolean DEBUG;
    private static final String[] z;
    FragmentActivity mActivity;
    boolean mCreatingLoader;
    final SparseArrayCompat mInactiveLoaders;
    final SparseArrayCompat mLoaders;
    boolean mRetaining;
    boolean mStarted;
    final String mWho;
    
    static {
        final String[] z2 = new String[59];
        String s = "MHgV\u0003qD}PJvC3";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1507:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'j';
                        break;
                    }
                    case 0: {
                        c2 = '\u001f';
                        break;
                    }
                    case 1: {
                        c2 = '-';
                        break;
                    }
                    case 2: {
                        c2 = '\u0013';
                        break;
                    }
                    case 3: {
                        c2 = '7';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "wHaR";
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 1;
                    array = z2;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "\\L\u007f[\u000f{\rwX8zYr^\u0004?Z{R\u0004?C|CJlYrE\u001ezI)\u0017";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "wHaR";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\\L\u007f[\u000f{\rwX9kBc\u0017\u001dwH}\u0017\u0004pY3D\u001e~_gR\u000e%\r";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "LY|G\u001avCt\u0017\u0003q\r";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "YD}^\u0019wHw\u00178zYr^\u0004vCt\u0017\u0003q\r";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "?\r0";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "?\r3\u0017";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "?\r0";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "%\r";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "VCrT\u001ev[v\u0017&pLwR\u0018l\u0017";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "%\r";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "^Ng^\u001cz\r_X\u000b{HaDP";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    s = "?\r3\u0017";
                    n = 18;
                    n2 = 19;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    array = z2;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 19;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "[H`C\u0018pTzY\r?d}V\tkDeRJvC3";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "[H`C\u0018pTzY\r?lpC\u0003iH3^\u0004?";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "LYrE\u001evCt\u0017\u0003q\r";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\\L\u007f[\u000f{\rwX9kLaCJhEvYJ~AaR\u000b{T3D\u001e~_gR\u000e%\r";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "wHaR";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "?\rVY\u001bjHf^\u0004x\rrDJqHd\u0017\u001azCw^\u0004x\r\u007fX\u000b{Ha";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 30;
                    n2 = 31;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    array = z2;
                    s = "\\L\u007f[\u000f{\rd_\u0003sH3T\u0018zLg^\u0004x\rr\u0017\u0006pLwR\u0018";
                    n = 31;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "%\rrE\rl\u0010";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "?\r^V\u0001vCt\u0017\u0006~^g\u0017\u0006pLwR\u0018?D}V\tkDeRP?";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "?\rAR\u0007p[zY\r?]vY\u000evCt\u0017\u0006pLwR\u0018%\r";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "mH`C\u000bmY_X\u000b{Ha\u0017\u0003q\r";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "?\rPB\u0018mH}CJsBrS\u000fm\rzDJlY|G\u001azI(\u0017\u0018z]\u007fV\tvCt";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "?\rAR\u0007p[zY\r?ArD\u001e?D}V\tkDeRJsBrS\u000fm\u00173";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "\\L\u007f[\u000f{\rd_\u0003sH3T\u0018zLg^\u0004x\rr\u0017\u0006pLwR\u0018";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "{H`C\u0018pT_X\u000b{Ha\u0017\u0003q\r";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    s = "?Bu\u0017";
                    n = 44;
                    n2 = 45;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    array = z2;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 45;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "?\rPE\u000f~YvSJqHd\u0017\u0006pLwR\u0018?";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    n2 = 49;
                    s = "?\rARGj^zY\r?Hk^\u0019kD}PJsBrS\u000fm\r";
                    n = 48;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    s = "\\L\u007f[\u000f{\rd_\u0003sH3T\u0018zLg^\u0004x\rr\u0017\u0006pLwR\u0018";
                    n = 49;
                    array = z2;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "vCzC&pLwR\u0018?D}\u0017";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "%\rrE\rl\u0010";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "SBrS\u000fm`rY\u000bxHa";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    s = "?D}\u0017";
                    n = 54;
                    n2 = 55;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    array = z2;
                    s = "bP";
                    n = 55;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "SBrS\u000fm`rY\u000bxHaL";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "\\L\u007f[\u000f{\rd_\u0003sH3T\u0018zLg^\u0004x\rr\u0017\u0006pLwR\u0018";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    break Label_1507;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        LoaderManagerImpl.DEBUG = false;
    }
    
    LoaderManagerImpl(final String mWho, final FragmentActivity mActivity, final boolean mStarted) {
        this.mLoaders = new SparseArrayCompat();
        this.mInactiveLoaders = new SparseArrayCompat();
        this.mWho = mWho;
        this.mActivity = mActivity;
        this.mStarted = mStarted;
    }
    
    private LoaderManagerImpl$LoaderInfo createAndInstallLoader(final int n, final Bundle bundle, final LoaderManager$LoaderCallbacks loaderManager$LoaderCallbacks) {
        try {
            this.mCreatingLoader = true;
            final LoaderManagerImpl$LoaderInfo loader = this.createLoader(n, bundle, loaderManager$LoaderCallbacks);
            this.installLoader(loader);
            return loader;
        }
        finally {
            this.mCreatingLoader = false;
        }
    }
    
    private LoaderManagerImpl$LoaderInfo createLoader(final int n, final Bundle bundle, final LoaderManager$LoaderCallbacks loaderManager$LoaderCallbacks) {
        final LoaderManagerImpl$LoaderInfo loaderManagerImpl$LoaderInfo = new LoaderManagerImpl$LoaderInfo(this, n, bundle, loaderManager$LoaderCallbacks);
        loaderManagerImpl$LoaderInfo.mLoader = loaderManager$LoaderCallbacks.onCreateLoader(n, bundle);
        return loaderManagerImpl$LoaderInfo;
    }
    
    @Override
    public void destroyLoader(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/app/LoaderManagerImpl.mCreatingLoader:Z
        //     4: ifeq            24
        //     7: new             Ljava/lang/IllegalStateException;
        //    10: dup            
        //    11: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //    14: bipush          43
        //    16: aaload         
        //    17: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    20: athrow         
        //    21: astore_2       
        //    22: aload_2        
        //    23: athrow         
        //    24: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //    27: ifeq            76
        //    30: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //    33: bipush          46
        //    35: aaload         
        //    36: new             Ljava/lang/StringBuilder;
        //    39: dup            
        //    40: invokespecial   java/lang/StringBuilder.<init>:()V
        //    43: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //    46: bipush          44
        //    48: aaload         
        //    49: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    52: aload_0        
        //    53: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    56: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //    59: bipush          45
        //    61: aaload         
        //    62: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    65: iload_1        
        //    66: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    69: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    72: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    75: pop            
        //    76: aload_0        
        //    77: getfield        android/support/v4/app/LoaderManagerImpl.mLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //    80: iload_1        
        //    81: invokevirtual   android/support/v4/util/SparseArrayCompat.indexOfKey:(I)I
        //    84: istore          4
        //    86: iload           4
        //    88: iflt            119
        //    91: aload_0        
        //    92: getfield        android/support/v4/app/LoaderManagerImpl.mLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //    95: iload           4
        //    97: invokevirtual   android/support/v4/util/SparseArrayCompat.valueAt:(I)Ljava/lang/Object;
        //   100: checkcast       Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   103: astore          10
        //   105: aload_0        
        //   106: getfield        android/support/v4/app/LoaderManagerImpl.mLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //   109: iload           4
        //   111: invokevirtual   android/support/v4/util/SparseArrayCompat.removeAt:(I)V
        //   114: aload           10
        //   116: invokevirtual   android/support/v4/app/LoaderManagerImpl$LoaderInfo.destroy:()V
        //   119: aload_0        
        //   120: getfield        android/support/v4/app/LoaderManagerImpl.mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //   123: iload_1        
        //   124: invokevirtual   android/support/v4/util/SparseArrayCompat.indexOfKey:(I)I
        //   127: istore          5
        //   129: iload           5
        //   131: iflt            162
        //   134: aload_0        
        //   135: getfield        android/support/v4/app/LoaderManagerImpl.mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //   138: iload           5
        //   140: invokevirtual   android/support/v4/util/SparseArrayCompat.valueAt:(I)Ljava/lang/Object;
        //   143: checkcast       Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   146: astore          9
        //   148: aload_0        
        //   149: getfield        android/support/v4/app/LoaderManagerImpl.mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //   152: iload           5
        //   154: invokevirtual   android/support/v4/util/SparseArrayCompat.removeAt:(I)V
        //   157: aload           9
        //   159: invokevirtual   android/support/v4/app/LoaderManagerImpl$LoaderInfo.destroy:()V
        //   162: aload_0        
        //   163: getfield        android/support/v4/app/LoaderManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   166: astore          8
        //   168: aload           8
        //   170: ifnull          190
        //   173: aload_0        
        //   174: invokevirtual   android/support/v4/app/LoaderManagerImpl.hasRunningLoaders:()Z
        //   177: ifne            190
        //   180: aload_0        
        //   181: getfield        android/support/v4/app/LoaderManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   184: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //   187: invokevirtual   android/support/v4/app/FragmentManagerImpl.startPendingDeferredFragments:()V
        //   190: return         
        //   191: astore_3       
        //   192: aload_3        
        //   193: athrow         
        //   194: astore          6
        //   196: aload           6
        //   198: athrow         
        //   199: astore          7
        //   201: aload           7
        //   203: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      21     21     24     Ljava/lang/IllegalStateException;
        //  24     76     191    194    Ljava/lang/IllegalStateException;
        //  162    168    194    199    Ljava/lang/IllegalStateException;
        //  173    190    199    204    Ljava/lang/IllegalStateException;
        //  196    199    199    204    Ljava/lang/IllegalStateException;
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
    
    void doDestroy() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        android/support/v4/app/LoaderManagerImpl.mRetaining:Z
        //     8: istore          4
        //    10: iload           4
        //    12: ifne            102
        //    15: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //    18: ifeq            54
        //    21: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //    24: bipush          20
        //    26: aaload         
        //    27: new             Ljava/lang/StringBuilder;
        //    30: dup            
        //    31: invokespecial   java/lang/StringBuilder.<init>:()V
        //    34: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //    37: bipush          23
        //    39: aaload         
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: aload_0        
        //    44: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    47: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    50: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    53: pop            
        //    54: iconst_m1      
        //    55: aload_0        
        //    56: getfield        android/support/v4/app/LoaderManagerImpl.mLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //    59: invokevirtual   android/support/v4/util/SparseArrayCompat.size:()I
        //    62: iadd           
        //    63: istore          9
        //    65: iload           9
        //    67: iflt            95
        //    70: aload_0        
        //    71: getfield        android/support/v4/app/LoaderManagerImpl.mLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //    74: iload           9
        //    76: invokevirtual   android/support/v4/util/SparseArrayCompat.valueAt:(I)Ljava/lang/Object;
        //    79: checkcast       Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //    82: invokevirtual   android/support/v4/app/LoaderManagerImpl$LoaderInfo.destroy:()V
        //    85: iload           9
        //    87: iconst_1       
        //    88: isub           
        //    89: istore          10
        //    91: iload_1        
        //    92: ifeq            208
        //    95: aload_0        
        //    96: getfield        android/support/v4/app/LoaderManagerImpl.mLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //    99: invokevirtual   android/support/v4/util/SparseArrayCompat.clear:()V
        //   102: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //   105: ifeq            141
        //   108: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //   111: bipush          22
        //   113: aaload         
        //   114: new             Ljava/lang/StringBuilder;
        //   117: dup            
        //   118: invokespecial   java/lang/StringBuilder.<init>:()V
        //   121: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //   124: bipush          21
        //   126: aaload         
        //   127: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   130: aload_0        
        //   131: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   134: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   137: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   140: pop            
        //   141: iconst_m1      
        //   142: aload_0        
        //   143: getfield        android/support/v4/app/LoaderManagerImpl.mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //   146: invokevirtual   android/support/v4/util/SparseArrayCompat.size:()I
        //   149: iadd           
        //   150: istore          6
        //   152: iload           6
        //   154: iflt            182
        //   157: aload_0        
        //   158: getfield        android/support/v4/app/LoaderManagerImpl.mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //   161: iload           6
        //   163: invokevirtual   android/support/v4/util/SparseArrayCompat.valueAt:(I)Ljava/lang/Object;
        //   166: checkcast       Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   169: invokevirtual   android/support/v4/app/LoaderManagerImpl$LoaderInfo.destroy:()V
        //   172: iload           6
        //   174: iconst_1       
        //   175: isub           
        //   176: istore          7
        //   178: iload_1        
        //   179: ifeq            201
        //   182: aload_0        
        //   183: getfield        android/support/v4/app/LoaderManagerImpl.mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //   186: invokevirtual   android/support/v4/util/SparseArrayCompat.clear:()V
        //   189: return         
        //   190: astore_2       
        //   191: aload_2        
        //   192: athrow         
        //   193: astore_3       
        //   194: aload_3        
        //   195: athrow         
        //   196: astore          5
        //   198: aload           5
        //   200: athrow         
        //   201: iload           7
        //   203: istore          6
        //   205: goto            152
        //   208: iload           10
        //   210: istore          9
        //   212: goto            65
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      10     190    193    Ljava/lang/IllegalStateException;
        //  15     54     193    196    Ljava/lang/IllegalStateException;
        //  102    141    196    201    Ljava/lang/IllegalStateException;
        //  191    193    193    196    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 103, Size: 103
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
    
    void doReportNextStart() {
        final int a = Fragment.a;
        int n;
        for (int i = -1 + this.mLoaders.size(); i >= 0; i = n) {
            ((LoaderManagerImpl$LoaderInfo)this.mLoaders.valueAt(i)).mReportNextStart = true;
            n = i - 1;
            if (a != 0) {
                break;
            }
        }
    }
    
    void doReportStart() {
        final int a = Fragment.a;
        int n;
        for (int i = -1 + this.mLoaders.size(); i >= 0; i = n) {
            ((LoaderManagerImpl$LoaderInfo)this.mLoaders.valueAt(i)).reportStart();
            n = i - 1;
            if (a != 0) {
                break;
            }
        }
    }
    
    void doRetain() {
        while (true) {
            final int a = Fragment.a;
            try {
                if (LoaderManagerImpl.DEBUG) {
                    Log.v(LoaderManagerImpl.z[2], LoaderManagerImpl.z[0] + this);
                }
                if (!this.mStarted) {
                    final RuntimeException ex = new RuntimeException(LoaderManagerImpl.z[1]);
                    ex.fillInStackTrace();
                    Log.w(LoaderManagerImpl.z[4], LoaderManagerImpl.z[3] + this, (Throwable)ex);
                    return;
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
            this.mRetaining = true;
            this.mStarted = false;
            int n;
            for (int i = -1 + this.mLoaders.size(); i >= 0; i = n) {
                ((LoaderManagerImpl$LoaderInfo)this.mLoaders.valueAt(i)).retain();
                n = i - 1;
                if (a != 0) {
                    return;
                }
            }
        }
    }
    
    void doStart() {
        while (true) {
            final int a = Fragment.a;
            try {
                if (LoaderManagerImpl.DEBUG) {
                    Log.v(LoaderManagerImpl.z[26], LoaderManagerImpl.z[24] + this);
                }
                if (this.mStarted) {
                    final RuntimeException ex = new RuntimeException(LoaderManagerImpl.z[27]);
                    ex.fillInStackTrace();
                    Log.w(LoaderManagerImpl.z[28], LoaderManagerImpl.z[25] + this, (Throwable)ex);
                    return;
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
            this.mStarted = true;
            int n;
            for (int i = -1 + this.mLoaders.size(); i >= 0; i = n) {
                ((LoaderManagerImpl$LoaderInfo)this.mLoaders.valueAt(i)).start();
                n = i - 1;
                if (a != 0) {
                    return;
                }
            }
        }
    }
    
    void doStop() {
        final int a = Fragment.a;
        try {
            if (LoaderManagerImpl.DEBUG) {
                Log.v(LoaderManagerImpl.z[5], LoaderManagerImpl.z[9] + this);
            }
            if (!this.mStarted) {
                final RuntimeException ex = new RuntimeException(LoaderManagerImpl.z[6]);
                ex.fillInStackTrace();
                Log.w(LoaderManagerImpl.z[7], LoaderManagerImpl.z[8] + this, (Throwable)ex);
                return;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        int n;
        for (int i = -1 + this.mLoaders.size(); i >= 0; i = n) {
            ((LoaderManagerImpl$LoaderInfo)this.mLoaders.valueAt(i)).stop();
            n = i - 1;
            if (a != 0) {
                break;
            }
        }
        this.mStarted = false;
    }
    
    public void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        int i = 0;
        final int a = Fragment.a;
        if (this.mLoaders.size() > 0) {
            printWriter.print(s);
            printWriter.println(LoaderManagerImpl.z[18]);
            final String string = s + LoaderManagerImpl.z[13];
            int n;
            for (int j = 0; j < this.mLoaders.size(); j = n) {
                final LoaderManagerImpl$LoaderInfo loaderManagerImpl$LoaderInfo = (LoaderManagerImpl$LoaderInfo)this.mLoaders.valueAt(j);
                printWriter.print(s);
                printWriter.print(LoaderManagerImpl.z[12]);
                printWriter.print(this.mLoaders.keyAt(j));
                printWriter.print(LoaderManagerImpl.z[17]);
                printWriter.println(loaderManagerImpl$LoaderInfo.toString());
                loaderManagerImpl$LoaderInfo.dump(string, fileDescriptor, printWriter, array);
                n = j + 1;
                if (a != 0) {
                    break;
                }
            }
        }
        if (this.mInactiveLoaders.size() > 0) {
            printWriter.print(s);
            printWriter.println(LoaderManagerImpl.z[16]);
            final String string2 = s + LoaderManagerImpl.z[19];
            while (i < this.mInactiveLoaders.size()) {
                final LoaderManagerImpl$LoaderInfo loaderManagerImpl$LoaderInfo2 = (LoaderManagerImpl$LoaderInfo)this.mInactiveLoaders.valueAt(i);
                printWriter.print(s);
                printWriter.print(LoaderManagerImpl.z[14]);
                printWriter.print(this.mInactiveLoaders.keyAt(i));
                printWriter.print(LoaderManagerImpl.z[15]);
                printWriter.println(loaderManagerImpl$LoaderInfo2.toString());
                loaderManagerImpl$LoaderInfo2.dump(string2, fileDescriptor, printWriter, array);
                ++i;
                if (a != 0) {
                    break;
                }
            }
        }
    }
    
    void finishRetain() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        android/support/v4/app/LoaderManagerImpl.mRetaining:Z
        //     8: istore          4
        //    10: iload           4
        //    12: ifeq            100
        //    15: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //    18: ifeq            54
        //    21: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //    24: bipush          10
        //    26: aaload         
        //    27: new             Ljava/lang/StringBuilder;
        //    30: dup            
        //    31: invokespecial   java/lang/StringBuilder.<init>:()V
        //    34: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //    37: bipush          11
        //    39: aaload         
        //    40: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    43: aload_0        
        //    44: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    47: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    50: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    53: pop            
        //    54: aload_0        
        //    55: iconst_0       
        //    56: putfield        android/support/v4/app/LoaderManagerImpl.mRetaining:Z
        //    59: iconst_m1      
        //    60: aload_0        
        //    61: getfield        android/support/v4/app/LoaderManagerImpl.mLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //    64: invokevirtual   android/support/v4/util/SparseArrayCompat.size:()I
        //    67: iadd           
        //    68: istore          5
        //    70: iload           5
        //    72: iflt            100
        //    75: aload_0        
        //    76: getfield        android/support/v4/app/LoaderManagerImpl.mLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //    79: iload           5
        //    81: invokevirtual   android/support/v4/util/SparseArrayCompat.valueAt:(I)Ljava/lang/Object;
        //    84: checkcast       Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //    87: invokevirtual   android/support/v4/app/LoaderManagerImpl$LoaderInfo.finishRetain:()V
        //    90: iload           5
        //    92: iconst_1       
        //    93: isub           
        //    94: istore          6
        //    96: iload_1        
        //    97: ifeq            107
        //   100: return         
        //   101: astore_2       
        //   102: aload_2        
        //   103: athrow         
        //   104: astore_3       
        //   105: aload_3        
        //   106: athrow         
        //   107: iload           6
        //   109: istore          5
        //   111: goto            70
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      10     101    104    Ljava/lang/IllegalStateException;
        //  15     54     104    107    Ljava/lang/IllegalStateException;
        //  102    104    104    107    Ljava/lang/IllegalStateException;
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
    
    @Override
    public Loader getLoader(final int n) {
        try {
            if (this.mCreatingLoader) {
                throw new IllegalStateException(LoaderManagerImpl.z[58]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        final LoaderManagerImpl$LoaderInfo loaderManagerImpl$LoaderInfo = (LoaderManagerImpl$LoaderInfo)this.mLoaders.get(n);
        if (loaderManagerImpl$LoaderInfo != null) {
            try {
                if (loaderManagerImpl$LoaderInfo.mPendingLoader != null) {
                    return loaderManagerImpl$LoaderInfo.mPendingLoader.mLoader;
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
            return loaderManagerImpl$LoaderInfo.mLoader;
        }
        return null;
    }
    
    public boolean hasRunningLoaders() {
        final int a = Fragment.a;
        final int size = this.mLoaders.size();
        int i = 0;
        boolean b = false;
        while (i < size) {
            final LoaderManagerImpl$LoaderInfo loaderManagerImpl$LoaderInfo = (LoaderManagerImpl$LoaderInfo)this.mLoaders.valueAt(i);
            boolean b3 = false;
            Label_0090: {
                Label_0071: {
                    try {
                        if (!loaderManagerImpl$LoaderInfo.mStarted) {
                            break Label_0071;
                        }
                        final LoaderManagerImpl$LoaderInfo loaderManagerImpl$LoaderInfo2 = loaderManagerImpl$LoaderInfo;
                        final boolean b2 = loaderManagerImpl$LoaderInfo2.mDeliveredData;
                        if (!b2) {
                            b3 = true;
                            break Label_0090;
                        }
                        break Label_0071;
                    }
                    catch (IllegalStateException ex) {
                        throw ex;
                    }
                    try {
                        final LoaderManagerImpl$LoaderInfo loaderManagerImpl$LoaderInfo2 = loaderManagerImpl$LoaderInfo;
                        final boolean b2 = loaderManagerImpl$LoaderInfo2.mDeliveredData;
                        if (!b2) {
                            b3 = true;
                            break Label_0090;
                        }
                    }
                    catch (IllegalStateException ex2) {
                        throw ex2;
                    }
                }
                b3 = false;
            }
            final boolean b4 = b3 | b;
            final int n = i + 1;
            if (a != 0) {
                return b4;
            }
            i = n;
            b = b4;
        }
        return b;
    }
    
    @Override
    public Loader initLoader(final int p0, final Bundle p1, final LoaderManager$LoaderCallbacks p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/app/LoaderManagerImpl.mCreatingLoader:Z
        //     4: ifeq            26
        //     7: new             Ljava/lang/IllegalStateException;
        //    10: dup            
        //    11: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //    14: bipush          50
        //    16: aaload         
        //    17: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    20: athrow         
        //    21: astore          4
        //    23: aload           4
        //    25: athrow         
        //    26: aload_0        
        //    27: getfield        android/support/v4/app/LoaderManagerImpl.mLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //    30: iload_1        
        //    31: invokevirtual   android/support/v4/util/SparseArrayCompat.get:(I)Ljava/lang/Object;
        //    34: checkcast       Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //    37: astore          5
        //    39: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //    42: ifeq            91
        //    45: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //    48: bipush          48
        //    50: aaload         
        //    51: new             Ljava/lang/StringBuilder;
        //    54: dup            
        //    55: invokespecial   java/lang/StringBuilder.<init>:()V
        //    58: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //    61: bipush          51
        //    63: aaload         
        //    64: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    67: aload_0        
        //    68: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    71: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //    74: bipush          53
        //    76: aaload         
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    80: aload_2        
        //    81: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    84: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    87: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    90: pop            
        //    91: aload           5
        //    93: ifnonnull       159
        //    96: aload_0        
        //    97: iload_1        
        //    98: aload_2        
        //    99: aload_3        
        //   100: invokespecial   android/support/v4/app/LoaderManagerImpl.createAndInstallLoader:(ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   103: astore          5
        //   105: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //   108: istore          14
        //   110: iload           14
        //   112: ifeq            205
        //   115: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //   118: bipush          52
        //   120: aaload         
        //   121: new             Ljava/lang/StringBuilder;
        //   124: dup            
        //   125: invokespecial   java/lang/StringBuilder.<init>:()V
        //   128: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //   131: bipush          47
        //   133: aaload         
        //   134: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   137: aload           5
        //   139: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   142: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   145: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   148: pop            
        //   149: getstatic       android/support/v4/app/Fragment.a:I
        //   152: istore          16
        //   154: iload           16
        //   156: ifeq            205
        //   159: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //   162: ifeq            199
        //   165: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //   168: bipush          54
        //   170: aaload         
        //   171: new             Ljava/lang/StringBuilder;
        //   174: dup            
        //   175: invokespecial   java/lang/StringBuilder.<init>:()V
        //   178: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //   181: bipush          49
        //   183: aaload         
        //   184: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   187: aload           5
        //   189: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   192: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   195: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   198: pop            
        //   199: aload           5
        //   201: aload_3        
        //   202: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
        //   205: aload           5
        //   207: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mHaveData:Z
        //   210: istore          10
        //   212: iload           10
        //   214: ifeq            239
        //   217: aload_0        
        //   218: getfield        android/support/v4/app/LoaderManagerImpl.mStarted:Z
        //   221: ifeq            239
        //   224: aload           5
        //   226: aload           5
        //   228: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //   231: aload           5
        //   233: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mData:Ljava/lang/Object;
        //   236: invokevirtual   android/support/v4/app/LoaderManagerImpl$LoaderInfo.callOnLoadFinished:(Landroid/support/v4/content/Loader;Ljava/lang/Object;)V
        //   239: aload           5
        //   241: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //   244: areturn        
        //   245: astore          6
        //   247: aload           6
        //   249: athrow         
        //   250: astore          12
        //   252: aload           12
        //   254: athrow         
        //   255: astore          13
        //   257: aload           13
        //   259: athrow         
        //   260: astore          7
        //   262: aload           7
        //   264: athrow         
        //   265: astore          8
        //   267: aload           8
        //   269: athrow         
        //   270: astore          9
        //   272: aload           9
        //   274: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      21     21     26     Ljava/lang/IllegalStateException;
        //  39     91     245    250    Ljava/lang/IllegalStateException;
        //  105    110    250    255    Ljava/lang/IllegalStateException;
        //  115    154    255    260    Ljava/lang/IllegalStateException;
        //  159    199    260    265    Ljava/lang/IllegalStateException;
        //  205    212    265    270    Ljava/lang/IllegalStateException;
        //  217    239    270    275    Ljava/lang/IllegalStateException;
        //  252    255    255    260    Ljava/lang/IllegalStateException;
        //  257    260    260    265    Ljava/lang/IllegalStateException;
        //  267    270    270    275    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 128, Size: 128
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
    
    void installLoader(final LoaderManagerImpl$LoaderInfo loaderManagerImpl$LoaderInfo) {
        try {
            this.mLoaders.put(loaderManagerImpl$LoaderInfo.mId, loaderManagerImpl$LoaderInfo);
            if (this.mStarted) {
                loaderManagerImpl$LoaderInfo.start();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    @Override
    public Loader restartLoader(final int p0, final Bundle p1, final LoaderManager$LoaderCallbacks p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore          4
        //     5: aload_0        
        //     6: getfield        android/support/v4/app/LoaderManagerImpl.mCreatingLoader:Z
        //     9: ifeq            31
        //    12: new             Ljava/lang/IllegalStateException;
        //    15: dup            
        //    16: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //    19: bipush          32
        //    21: aaload         
        //    22: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    25: athrow         
        //    26: astore          5
        //    28: aload           5
        //    30: athrow         
        //    31: aload_0        
        //    32: getfield        android/support/v4/app/LoaderManagerImpl.mLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //    35: iload_1        
        //    36: invokevirtual   android/support/v4/util/SparseArrayCompat.get:(I)Ljava/lang/Object;
        //    39: checkcast       Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //    42: astore          6
        //    44: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //    47: ifeq            96
        //    50: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //    53: bipush          36
        //    55: aaload         
        //    56: new             Ljava/lang/StringBuilder;
        //    59: dup            
        //    60: invokespecial   java/lang/StringBuilder.<init>:()V
        //    63: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //    66: bipush          39
        //    68: aaload         
        //    69: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    72: aload_0        
        //    73: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    76: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //    79: bipush          34
        //    81: aaload         
        //    82: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    85: aload_2        
        //    86: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    89: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    92: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    95: pop            
        //    96: aload           6
        //    98: ifnull          478
        //   101: aload_0        
        //   102: getfield        android/support/v4/app/LoaderManagerImpl.mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //   105: iload_1        
        //   106: invokevirtual   android/support/v4/util/SparseArrayCompat.get:(I)Ljava/lang/Object;
        //   109: checkcast       Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   112: astore          8
        //   114: aload           8
        //   116: ifnull          420
        //   119: aload           6
        //   121: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mHaveData:Z
        //   124: istore          13
        //   126: iload           13
        //   128: ifeq            205
        //   131: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //   134: ifeq            171
        //   137: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //   140: bipush          40
        //   142: aaload         
        //   143: new             Ljava/lang/StringBuilder;
        //   146: dup            
        //   147: invokespecial   java/lang/StringBuilder.<init>:()V
        //   150: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //   153: bipush          42
        //   155: aaload         
        //   156: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   159: aload           6
        //   161: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   164: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   167: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   170: pop            
        //   171: aload           8
        //   173: iconst_0       
        //   174: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mDeliveredData:Z
        //   177: aload           8
        //   179: invokevirtual   android/support/v4/app/LoaderManagerImpl$LoaderInfo.destroy:()V
        //   182: aload           6
        //   184: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //   187: invokevirtual   android/support/v4/content/Loader.abandon:()V
        //   190: aload_0        
        //   191: getfield        android/support/v4/app/LoaderManagerImpl.mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //   194: iload_1        
        //   195: aload           6
        //   197: invokevirtual   android/support/v4/util/SparseArrayCompat.put:(ILjava/lang/Object;)V
        //   200: iload           4
        //   202: ifeq            478
        //   205: aload           6
        //   207: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mStarted:Z
        //   210: istore          16
        //   212: iload           16
        //   214: ifne            258
        //   217: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //   220: ifeq            239
        //   223: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //   226: bipush          30
        //   228: aaload         
        //   229: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //   232: bipush          41
        //   234: aaload         
        //   235: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   238: pop            
        //   239: aload_0        
        //   240: getfield        android/support/v4/app/LoaderManagerImpl.mLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //   243: iload_1        
        //   244: aconst_null    
        //   245: invokevirtual   android/support/v4/util/SparseArrayCompat.put:(ILjava/lang/Object;)V
        //   248: aload           6
        //   250: invokevirtual   android/support/v4/app/LoaderManagerImpl$LoaderInfo.destroy:()V
        //   253: iload           4
        //   255: ifeq            478
        //   258: aload           6
        //   260: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   263: astore          19
        //   265: aload           19
        //   267: ifnull          327
        //   270: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //   273: ifeq            313
        //   276: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //   279: bipush          33
        //   281: aaload         
        //   282: new             Ljava/lang/StringBuilder;
        //   285: dup            
        //   286: invokespecial   java/lang/StringBuilder.<init>:()V
        //   289: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //   292: bipush          38
        //   294: aaload         
        //   295: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   298: aload           6
        //   300: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   303: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   306: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   309: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   312: pop            
        //   313: aload           6
        //   315: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   318: invokevirtual   android/support/v4/app/LoaderManagerImpl$LoaderInfo.destroy:()V
        //   321: aload           6
        //   323: aconst_null    
        //   324: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   327: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //   330: ifeq            349
        //   333: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //   336: bipush          31
        //   338: aaload         
        //   339: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //   342: bipush          29
        //   344: aaload         
        //   345: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   348: pop            
        //   349: aload           6
        //   351: aload_0        
        //   352: iload_1        
        //   353: aload_2        
        //   354: aload_3        
        //   355: invokespecial   android/support/v4/app/LoaderManagerImpl.createLoader:(ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   358: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   361: aload           6
        //   363: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   366: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //   369: areturn        
        //   370: astore          7
        //   372: aload           7
        //   374: athrow         
        //   375: astore          11
        //   377: aload           11
        //   379: athrow         
        //   380: astore          12
        //   382: aload           12
        //   384: athrow         
        //   385: astore          25
        //   387: aload           25
        //   389: athrow         
        //   390: astore          14
        //   392: aload           14
        //   394: athrow         
        //   395: astore          15
        //   397: aload           15
        //   399: athrow         
        //   400: astore          23
        //   402: aload           23
        //   404: athrow         
        //   405: astore          17
        //   407: aload           17
        //   409: athrow         
        //   410: astore          18
        //   412: aload           18
        //   414: athrow         
        //   415: astore          20
        //   417: aload           20
        //   419: athrow         
        //   420: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //   423: ifeq            460
        //   426: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //   429: bipush          35
        //   431: aaload         
        //   432: new             Ljava/lang/StringBuilder;
        //   435: dup            
        //   436: invokespecial   java/lang/StringBuilder.<init>:()V
        //   439: getstatic       android/support/v4/app/LoaderManagerImpl.z:[Ljava/lang/String;
        //   442: bipush          37
        //   444: aaload         
        //   445: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   448: aload           6
        //   450: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   453: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   456: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   459: pop            
        //   460: aload           6
        //   462: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //   465: invokevirtual   android/support/v4/content/Loader.abandon:()V
        //   468: aload_0        
        //   469: getfield        android/support/v4/app/LoaderManagerImpl.mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //   472: iload_1        
        //   473: aload           6
        //   475: invokevirtual   android/support/v4/util/SparseArrayCompat.put:(ILjava/lang/Object;)V
        //   478: aload_0        
        //   479: iload_1        
        //   480: aload_2        
        //   481: aload_3        
        //   482: invokespecial   android/support/v4/app/LoaderManagerImpl.createAndInstallLoader:(ILandroid/os/Bundle;Landroid/support/v4/app/LoaderManager$LoaderCallbacks;)Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   485: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //   488: areturn        
        //   489: astore          9
        //   491: aload           9
        //   493: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  5      26     26     31     Ljava/lang/IllegalStateException;
        //  44     96     370    375    Ljava/lang/IllegalStateException;
        //  119    126    375    380    Ljava/lang/IllegalStateException;
        //  131    171    380    385    Ljava/lang/IllegalStateException;
        //  171    200    385    390    Ljava/lang/IllegalStateException;
        //  205    212    390    395    Ljava/lang/IllegalStateException;
        //  217    239    395    400    Ljava/lang/IllegalStateException;
        //  239    253    400    405    Ljava/lang/IllegalStateException;
        //  258    265    405    410    Ljava/lang/IllegalStateException;
        //  270    313    410    415    Ljava/lang/IllegalStateException;
        //  327    349    415    420    Ljava/lang/IllegalStateException;
        //  377    380    380    385    Ljava/lang/IllegalStateException;
        //  387    390    390    395    Ljava/lang/IllegalStateException;
        //  392    395    395    400    Ljava/lang/IllegalStateException;
        //  402    405    405    410    Ljava/lang/IllegalStateException;
        //  407    410    410    415    Ljava/lang/IllegalStateException;
        //  420    460    489    494    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 230, Size: 230
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
        final StringBuilder sb = new StringBuilder(128);
        sb.append(LoaderManagerImpl.z[57]);
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(LoaderManagerImpl.z[55]);
        DebugUtils.buildShortClassTag(this.mActivity, sb);
        sb.append(LoaderManagerImpl.z[56]);
        return sb.toString();
    }
    
    void updateActivity(final FragmentActivity mActivity) {
        this.mActivity = mActivity;
    }
}
