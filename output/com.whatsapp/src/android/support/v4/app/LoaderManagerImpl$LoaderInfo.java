// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.support.v4.util.DebugUtils;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.util.Log;
import android.support.v4.content.Loader;
import android.os.Bundle;
import android.support.v4.content.Loader$OnLoadCompleteListener;

final class LoaderManagerImpl$LoaderInfo implements Loader$OnLoadCompleteListener
{
    private static final String[] z;
    final Bundle mArgs;
    LoaderManager$LoaderCallbacks mCallbacks;
    Object mData;
    boolean mDeliveredData;
    boolean mDestroyed;
    boolean mHaveData;
    final int mId;
    boolean mListenerRegistered;
    Loader mLoader;
    LoaderManagerImpl$LoaderInfo mPendingLoader;
    boolean mReportNextStart;
    boolean mRetaining;
    boolean mRetainingStarted;
    boolean mStarted;
    final LoaderManagerImpl this$0;
    
    static {
        final String[] z2 = new String[46];
        String s = "\u0012Hw+U,jw!Q9Bd";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1182:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '0';
                        break;
                    }
                    case 0: {
                        c2 = '^';
                        break;
                    }
                    case 1: {
                        c2 = '\'';
                        break;
                    }
                    case 2: {
                        c2 = '\u0016';
                        break;
                    }
                    case 3: {
                        c2 = 'O';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0012Hw+U,jw!Q9Bd";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "~\u0007E8Y*D~&^9\u0007b \u0010.Bx+Y0@6#_?Cs=\n~";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u0012Hw+U,jw!Q9Bd";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "\u0012Hw+U,jw!Q9Bd";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "~\u0007_(^1U\u007f!W~Ky.T~Dy\"@2Bb*\u0010s\n6!_*\u0007w,D7Qs";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "~\u0007_(^1U\u007f!W~Ky.T~Dy\"@2Bb*\u0010s\n6+U-Sd I;C";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "1IZ Q:dy\"@2Bb*\n~";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0011E|*S*\u0007d*D+Ux*T~Ad ]~Hx\fB;Fb*|1Fr*B~Jc<D~Iy;\u0010<B6.\u00100HxbC*Fb&S~Nx!U,\u0007{*]<BdoS2Fe<\n~";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0012Hw+U,jw!Q9Bd";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "~\u0007E;Q,S\u007f!Wd\u0007";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "3ky.T;U+";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "3cw;Qc";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "3us;Q7I\u007f!Wc";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "~\u0007";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "~\u0007";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "3dw#\\<Fu$Cc";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "~JD*D?Nx&^9tb.B*Brr";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "~\u0007{\u000bU2N`*B;CR.D?\u001a";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u000eBx+Y0@6\u0003_?Cs=\u0010";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "3nrr";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "~JZ&C*Bx*B\fBq&C*Bd*Tc";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    s = "3ow9U\u001aFb.\r";
                    n = 21;
                    n2 = 22;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    array = z2;
                    s = "~JR*C*Uy6U:\u001a";
                    n = 22;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "~JW=W-\u001a";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "~JD*@1Ub\u0001U&SE;Q,S+";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "3tb.B*Brr";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u0012Hw+U,jw!Q9Bd";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "~\u0007E;_.W\u007f!Wd\u0007";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "~\u0007D*D?Nx&^9\u001d6";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "\u0012Hw+U,jw!Q9Bd";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "~\u0007y!|1Fr\tY0Ne'U:\u0007\u007f!\u0010";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "\u0012Hw+U,jw!Q9Bd";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "1IZ Q:a\u007f!Y-Os+";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "d\u0007";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "~\u0007R*C*Uy6Y0@,o";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "~\u0007D*C;S\u007f!Wd\u0007";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "\u0012Hw+U,jw!Q9Bd";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "\u0012Hw+U,jw!Q9Bd";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    s = "1IZ Q:Bd\u001dU-Bb";
                    n = 38;
                    n2 = 39;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    array = z2;
                    s = "\u0012Hw+U,jw!Q9Bd";
                    n = 39;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "~\u0007P&^7T~*T~us;Q7I\u007f!Wd\u0007";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "~\u0004";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "#Z";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "~\u001d6";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "\u0012Hw+U,nx)_%";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    break Label_1182;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public LoaderManagerImpl$LoaderInfo(final LoaderManagerImpl this$0, final int mId, final Bundle mArgs, final LoaderManager$LoaderCallbacks mCallbacks) {
        this.this$0 = this$0;
        this.mId = mId;
        this.mArgs = mArgs;
        this.mCallbacks = mCallbacks;
    }
    
    void callOnLoadFinished(final Loader loader, final Object o) {
        if (this.mCallbacks == null) {
            return;
        }
        while (true) {
            Label_0190: {
                if (this.this$0.mActivity == null) {
                    break Label_0190;
                }
                final String mNoTransactionsBecause = this.this$0.mActivity.mFragments.mNoTransactionsBecause;
                this.this$0.mActivity.mFragments.mNoTransactionsBecause = LoaderManagerImpl$LoaderInfo.z[33];
                final String s = mNoTransactionsBecause;
                try {
                    if (LoaderManagerImpl.DEBUG) {
                        Log.v(LoaderManagerImpl$LoaderInfo.z[32], LoaderManagerImpl$LoaderInfo.z[31] + loader + LoaderManagerImpl$LoaderInfo.z[34] + loader.dataToString(o));
                    }
                    this.mCallbacks.onLoadFinished(loader, o);
                    if (this.this$0.mActivity != null) {
                        this.this$0.mActivity.mFragments.mNoTransactionsBecause = s;
                    }
                    this.mDeliveredData = true;
                    return;
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                finally {
                    try {
                        if (this.this$0.mActivity != null) {
                            this.this$0.mActivity.mFragments.mNoTransactionsBecause = s;
                        }
                    }
                    catch (IllegalArgumentException ex2) {
                        throw ex2;
                    }
                }
            }
            final String s = null;
            continue;
        }
    }
    
    void destroy() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            39
        //     6: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //     9: bipush          38
        //    11: aaload         
        //    12: new             Ljava/lang/StringBuilder;
        //    15: dup            
        //    16: invokespecial   java/lang/StringBuilder.<init>:()V
        //    19: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //    22: bipush          35
        //    24: aaload         
        //    25: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    28: aload_0        
        //    29: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    32: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    35: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    38: pop            
        //    39: aload_0        
        //    40: iconst_1       
        //    41: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mDestroyed:Z
        //    44: aload_0        
        //    45: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mDeliveredData:Z
        //    48: istore_2       
        //    49: aload_0        
        //    50: iconst_0       
        //    51: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mDeliveredData:Z
        //    54: aload_0        
        //    55: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
        //    58: ifnull          216
        //    61: aload_0        
        //    62: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //    65: astore          12
        //    67: aload           12
        //    69: ifnull          216
        //    72: aload_0        
        //    73: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mHaveData:Z
        //    76: istore          13
        //    78: iload           13
        //    80: ifeq            216
        //    83: iload_2        
        //    84: ifeq            216
        //    87: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //    90: istore          14
        //    92: iload           14
        //    94: ifeq            130
        //    97: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   100: bipush          37
        //   102: aaload         
        //   103: new             Ljava/lang/StringBuilder;
        //   106: dup            
        //   107: invokespecial   java/lang/StringBuilder.<init>:()V
        //   110: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   113: bipush          36
        //   115: aaload         
        //   116: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   119: aload_0        
        //   120: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   123: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   126: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   129: pop            
        //   130: aload_0        
        //   131: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.this$0:Landroid/support/v4/app/LoaderManagerImpl;
        //   134: getfield        android/support/v4/app/LoaderManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   137: ifnull          360
        //   140: aload_0        
        //   141: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.this$0:Landroid/support/v4/app/LoaderManagerImpl;
        //   144: getfield        android/support/v4/app/LoaderManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   147: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //   150: getfield        android/support/v4/app/FragmentManagerImpl.mNoTransactionsBecause:Ljava/lang/String;
        //   153: astore          18
        //   155: aload_0        
        //   156: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.this$0:Landroid/support/v4/app/LoaderManagerImpl;
        //   159: getfield        android/support/v4/app/LoaderManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   162: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //   165: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   168: bipush          39
        //   170: aaload         
        //   171: putfield        android/support/v4/app/FragmentManagerImpl.mNoTransactionsBecause:Ljava/lang/String;
        //   174: aload           18
        //   176: astore          15
        //   178: aload_0        
        //   179: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
        //   182: aload_0        
        //   183: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //   186: invokeinterface android/support/v4/app/LoaderManager$LoaderCallbacks.onLoaderReset:(Landroid/support/v4/content/Loader;)V
        //   191: aload_0        
        //   192: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.this$0:Landroid/support/v4/app/LoaderManagerImpl;
        //   195: getfield        android/support/v4/app/LoaderManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   198: ifnull          216
        //   201: aload_0        
        //   202: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.this$0:Landroid/support/v4/app/LoaderManagerImpl;
        //   205: getfield        android/support/v4/app/LoaderManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   208: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //   211: aload           15
        //   213: putfield        android/support/v4/app/FragmentManagerImpl.mNoTransactionsBecause:Ljava/lang/String;
        //   216: aload_0        
        //   217: aconst_null    
        //   218: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
        //   221: aload_0        
        //   222: aconst_null    
        //   223: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mData:Ljava/lang/Object;
        //   226: aload_0        
        //   227: iconst_0       
        //   228: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mHaveData:Z
        //   231: aload_0        
        //   232: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //   235: astore          10
        //   237: aload           10
        //   239: ifnull          269
        //   242: aload_0        
        //   243: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mListenerRegistered:Z
        //   246: ifeq            262
        //   249: aload_0        
        //   250: iconst_0       
        //   251: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mListenerRegistered:Z
        //   254: aload_0        
        //   255: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //   258: aload_0        
        //   259: invokevirtual   android/support/v4/content/Loader.unregisterListener:(Landroid/support/v4/content/Loader$OnLoadCompleteListener;)V
        //   262: aload_0        
        //   263: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //   266: invokevirtual   android/support/v4/content/Loader.reset:()V
        //   269: aload_0        
        //   270: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   273: ifnull          283
        //   276: aload_0        
        //   277: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   280: invokevirtual   android/support/v4/app/LoaderManagerImpl$LoaderInfo.destroy:()V
        //   283: return         
        //   284: astore_1       
        //   285: aload_1        
        //   286: athrow         
        //   287: astore_3       
        //   288: aload_3        
        //   289: athrow         
        //   290: astore          4
        //   292: aload           4
        //   294: athrow         
        //   295: astore          5
        //   297: aload           5
        //   299: athrow         
        //   300: astore          6
        //   302: aload           6
        //   304: athrow         
        //   305: astore          7
        //   307: aload           7
        //   309: athrow         
        //   310: astore          16
        //   312: aload_0        
        //   313: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.this$0:Landroid/support/v4/app/LoaderManagerImpl;
        //   316: getfield        android/support/v4/app/LoaderManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   319: ifnull          337
        //   322: aload_0        
        //   323: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.this$0:Landroid/support/v4/app/LoaderManagerImpl;
        //   326: getfield        android/support/v4/app/LoaderManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   329: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //   332: aload           15
        //   334: putfield        android/support/v4/app/FragmentManagerImpl.mNoTransactionsBecause:Ljava/lang/String;
        //   337: aload           16
        //   339: athrow         
        //   340: astore          17
        //   342: aload           17
        //   344: athrow         
        //   345: astore          8
        //   347: aload           8
        //   349: athrow         
        //   350: astore          9
        //   352: aload           9
        //   354: athrow         
        //   355: astore          11
        //   357: aload           11
        //   359: athrow         
        //   360: aconst_null    
        //   361: astore          15
        //   363: goto            178
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      39     284    287    Ljava/lang/IllegalArgumentException;
        //  49     67     287    290    Ljava/lang/IllegalArgumentException;
        //  72     78     290    300    Ljava/lang/IllegalArgumentException;
        //  87     92     300    305    Ljava/lang/IllegalArgumentException;
        //  97     130    305    310    Ljava/lang/IllegalArgumentException;
        //  178    191    310    345    Any
        //  216    237    345    350    Ljava/lang/IllegalArgumentException;
        //  242    262    350    355    Ljava/lang/IllegalArgumentException;
        //  269    283    355    360    Ljava/lang/IllegalArgumentException;
        //  288    290    290    300    Ljava/lang/IllegalArgumentException;
        //  292    295    295    300    Ljava/lang/IllegalArgumentException;
        //  297    300    300    305    Ljava/lang/IllegalArgumentException;
        //  302    305    305    310    Ljava/lang/IllegalArgumentException;
        //  312    337    340    345    Ljava/lang/IllegalArgumentException;
        //  347    350    350    355    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 175, Size: 175
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
    
    public void dump(final String p0, final FileDescriptor p1, final PrintWriter p2, final String[] p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_3        
        //     1: aload_1        
        //     2: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //     5: aload_3        
        //     6: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //     9: bipush          20
        //    11: aaload         
        //    12: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    15: aload_3        
        //    16: aload_0        
        //    17: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mId:I
        //    20: invokevirtual   java/io/PrintWriter.print:(I)V
        //    23: aload_3        
        //    24: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //    27: bipush          24
        //    29: aaload         
        //    30: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    33: aload_3        
        //    34: aload_0        
        //    35: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mArgs:Landroid/os/Bundle;
        //    38: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //    41: aload_3        
        //    42: aload_1        
        //    43: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    46: aload_3        
        //    47: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //    50: bipush          16
        //    52: aaload         
        //    53: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    56: aload_3        
        //    57: aload_0        
        //    58: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
        //    61: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //    64: aload_3        
        //    65: aload_1        
        //    66: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    69: aload_3        
        //    70: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //    73: bipush          11
        //    75: aaload         
        //    76: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    79: aload_3        
        //    80: aload_0        
        //    81: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //    84: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //    87: aload_0        
        //    88: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //    91: ifnull          128
        //    94: aload_0        
        //    95: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //    98: new             Ljava/lang/StringBuilder;
        //   101: dup            
        //   102: invokespecial   java/lang/StringBuilder.<init>:()V
        //   105: aload_1        
        //   106: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   109: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   112: bipush          15
        //   114: aaload         
        //   115: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   118: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   121: aload_2        
        //   122: aload_3        
        //   123: aload           4
        //   125: invokevirtual   android/support/v4/content/Loader.dump:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
        //   128: aload_0        
        //   129: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mHaveData:Z
        //   132: istore          8
        //   134: iload           8
        //   136: ifne            146
        //   139: aload_0        
        //   140: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mDeliveredData:Z
        //   143: ifeq            210
        //   146: aload_3        
        //   147: aload_1        
        //   148: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   151: aload_3        
        //   152: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   155: bipush          22
        //   157: aaload         
        //   158: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   161: aload_3        
        //   162: aload_0        
        //   163: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mHaveData:Z
        //   166: invokevirtual   java/io/PrintWriter.print:(Z)V
        //   169: aload_3        
        //   170: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   173: bipush          18
        //   175: aaload         
        //   176: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   179: aload_3        
        //   180: aload_0        
        //   181: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mDeliveredData:Z
        //   184: invokevirtual   java/io/PrintWriter.println:(Z)V
        //   187: aload_3        
        //   188: aload_1        
        //   189: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   192: aload_3        
        //   193: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   196: bipush          12
        //   198: aaload         
        //   199: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   202: aload_3        
        //   203: aload_0        
        //   204: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mData:Ljava/lang/Object;
        //   207: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //   210: aload_3        
        //   211: aload_1        
        //   212: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   215: aload_3        
        //   216: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   219: bipush          26
        //   221: aaload         
        //   222: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   225: aload_3        
        //   226: aload_0        
        //   227: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mStarted:Z
        //   230: invokevirtual   java/io/PrintWriter.print:(Z)V
        //   233: aload_3        
        //   234: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   237: bipush          25
        //   239: aaload         
        //   240: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   243: aload_3        
        //   244: aload_0        
        //   245: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mReportNextStart:Z
        //   248: invokevirtual   java/io/PrintWriter.print:(Z)V
        //   251: aload_3        
        //   252: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   255: bipush          23
        //   257: aaload         
        //   258: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   261: aload_3        
        //   262: aload_0        
        //   263: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mDestroyed:Z
        //   266: invokevirtual   java/io/PrintWriter.println:(Z)V
        //   269: aload_3        
        //   270: aload_1        
        //   271: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   274: aload_3        
        //   275: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   278: bipush          13
        //   280: aaload         
        //   281: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   284: aload_3        
        //   285: aload_0        
        //   286: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mRetaining:Z
        //   289: invokevirtual   java/io/PrintWriter.print:(Z)V
        //   292: aload_3        
        //   293: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   296: bipush          17
        //   298: aaload         
        //   299: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   302: aload_3        
        //   303: aload_0        
        //   304: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mRetainingStarted:Z
        //   307: invokevirtual   java/io/PrintWriter.print:(Z)V
        //   310: aload_3        
        //   311: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   314: bipush          21
        //   316: aaload         
        //   317: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   320: aload_3        
        //   321: aload_0        
        //   322: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mListenerRegistered:Z
        //   325: invokevirtual   java/io/PrintWriter.println:(Z)V
        //   328: aload_0        
        //   329: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   332: ifnull          398
        //   335: aload_3        
        //   336: aload_1        
        //   337: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   340: aload_3        
        //   341: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   344: bipush          19
        //   346: aaload         
        //   347: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   350: aload_3        
        //   351: aload_0        
        //   352: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   355: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/Object;)V
        //   358: aload_3        
        //   359: ldc             ":"
        //   361: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/String;)V
        //   364: aload_0        
        //   365: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   368: new             Ljava/lang/StringBuilder;
        //   371: dup            
        //   372: invokespecial   java/lang/StringBuilder.<init>:()V
        //   375: aload_1        
        //   376: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   379: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   382: bipush          14
        //   384: aaload         
        //   385: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   388: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   391: aload_2        
        //   392: aload_3        
        //   393: aload           4
        //   395: invokevirtual   android/support/v4/app/LoaderManagerImpl$LoaderInfo.dump:(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
        //   398: return         
        //   399: astore          5
        //   401: aload           5
        //   403: athrow         
        //   404: astore          6
        //   406: aload           6
        //   408: athrow         
        //   409: astore          7
        //   411: aload           7
        //   413: athrow         
        //   414: astore          9
        //   416: aload           9
        //   418: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      128    399    404    Ljava/lang/IllegalArgumentException;
        //  128    134    404    409    Ljava/lang/IllegalArgumentException;
        //  139    146    409    414    Ljava/lang/IllegalArgumentException;
        //  146    210    409    414    Ljava/lang/IllegalArgumentException;
        //  210    398    414    419    Ljava/lang/IllegalArgumentException;
        //  406    409    409    414    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 212, Size: 212
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
    
    void finishRetain() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mRetaining:Z
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifeq            83
        //     9: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //    12: ifeq            48
        //    15: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //    18: bipush          40
        //    20: aaload         
        //    21: new             Ljava/lang/StringBuilder;
        //    24: dup            
        //    25: invokespecial   java/lang/StringBuilder.<init>:()V
        //    28: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //    31: bipush          41
        //    33: aaload         
        //    34: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    37: aload_0        
        //    38: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    41: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    44: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    47: pop            
        //    48: aload_0        
        //    49: iconst_0       
        //    50: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mRetaining:Z
        //    53: aload_0        
        //    54: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mStarted:Z
        //    57: istore          11
        //    59: aload_0        
        //    60: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mRetainingStarted:Z
        //    63: istore          12
        //    65: iload           11
        //    67: iload           12
        //    69: if_icmpeq       83
        //    72: aload_0        
        //    73: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mStarted:Z
        //    76: ifne            83
        //    79: aload_0        
        //    80: invokevirtual   android/support/v4/app/LoaderManagerImpl$LoaderInfo.stop:()V
        //    83: aload_0        
        //    84: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mStarted:Z
        //    87: istore          7
        //    89: iload           7
        //    91: ifeq            124
        //    94: aload_0        
        //    95: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mHaveData:Z
        //    98: istore          8
        //   100: iload           8
        //   102: ifeq            124
        //   105: aload_0        
        //   106: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mReportNextStart:Z
        //   109: ifne            124
        //   112: aload_0        
        //   113: aload_0        
        //   114: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //   117: aload_0        
        //   118: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mData:Ljava/lang/Object;
        //   121: invokevirtual   android/support/v4/app/LoaderManagerImpl$LoaderInfo.callOnLoadFinished:(Landroid/support/v4/content/Loader;Ljava/lang/Object;)V
        //   124: return         
        //   125: astore_1       
        //   126: aload_1        
        //   127: athrow         
        //   128: astore_2       
        //   129: aload_2        
        //   130: athrow         
        //   131: astore          9
        //   133: aload           9
        //   135: athrow         
        //   136: astore          10
        //   138: aload           10
        //   140: athrow         
        //   141: astore          4
        //   143: aload           4
        //   145: athrow         
        //   146: astore          5
        //   148: aload           5
        //   150: athrow         
        //   151: astore          6
        //   153: aload           6
        //   155: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      125    128    Ljava/lang/IllegalArgumentException;
        //  9      48     128    131    Ljava/lang/IllegalArgumentException;
        //  48     65     131    136    Ljava/lang/IllegalArgumentException;
        //  72     83     136    141    Ljava/lang/IllegalArgumentException;
        //  83     89     141    146    Ljava/lang/IllegalArgumentException;
        //  94     100    146    151    Ljava/lang/IllegalArgumentException;
        //  105    124    151    156    Ljava/lang/IllegalArgumentException;
        //  126    128    128    131    Ljava/lang/IllegalArgumentException;
        //  133    136    136    141    Ljava/lang/IllegalArgumentException;
        //  143    146    146    151    Ljava/lang/IllegalArgumentException;
        //  148    151    151    156    Ljava/lang/IllegalArgumentException;
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
    
    @Override
    public void onLoadComplete(final Loader p0, final Object p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //     3: ifeq            38
        //     6: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //     9: iconst_1       
        //    10: aaload         
        //    11: new             Ljava/lang/StringBuilder;
        //    14: dup            
        //    15: invokespecial   java/lang/StringBuilder.<init>:()V
        //    18: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //    21: bipush          7
        //    23: aaload         
        //    24: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    27: aload_0        
        //    28: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    31: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    34: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    37: pop            
        //    38: aload_0        
        //    39: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mDestroyed:Z
        //    42: istore          6
        //    44: iload           6
        //    46: ifeq            84
        //    49: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //    52: ifeq            70
        //    55: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //    58: iconst_3       
        //    59: aaload         
        //    60: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //    63: bipush          6
        //    65: aaload         
        //    66: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    69: pop            
        //    70: return         
        //    71: astore_3       
        //    72: aload_3        
        //    73: athrow         
        //    74: astore          4
        //    76: aload           4
        //    78: athrow         
        //    79: astore          5
        //    81: aload           5
        //    83: athrow         
        //    84: aload_0        
        //    85: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.this$0:Landroid/support/v4/app/LoaderManagerImpl;
        //    88: getfield        android/support/v4/app/LoaderManagerImpl.mLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //    91: aload_0        
        //    92: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mId:I
        //    95: invokevirtual   android/support/v4/util/SparseArrayCompat.get:(I)Ljava/lang/Object;
        //    98: astore          9
        //   100: aload           9
        //   102: aload_0        
        //   103: if_acmpeq       137
        //   106: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //   109: ifeq            70
        //   112: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   115: iconst_4       
        //   116: aaload         
        //   117: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   120: iconst_5       
        //   121: aaload         
        //   122: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   125: pop            
        //   126: return         
        //   127: astore          8
        //   129: aload           8
        //   131: athrow         
        //   132: astore          7
        //   134: aload           7
        //   136: athrow         
        //   137: aload_0        
        //   138: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   141: astore          10
        //   143: aload           10
        //   145: ifnull          225
        //   148: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //   151: ifeq            186
        //   154: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   157: iconst_0       
        //   158: aaload         
        //   159: new             Ljava/lang/StringBuilder;
        //   162: dup            
        //   163: invokespecial   java/lang/StringBuilder.<init>:()V
        //   166: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   169: iconst_2       
        //   170: aaload         
        //   171: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   174: aload           10
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   179: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   182: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   185: pop            
        //   186: aload_0        
        //   187: aconst_null    
        //   188: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mPendingLoader:Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   191: aload_0        
        //   192: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.this$0:Landroid/support/v4/app/LoaderManagerImpl;
        //   195: getfield        android/support/v4/app/LoaderManagerImpl.mLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //   198: aload_0        
        //   199: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mId:I
        //   202: aconst_null    
        //   203: invokevirtual   android/support/v4/util/SparseArrayCompat.put:(ILjava/lang/Object;)V
        //   206: aload_0        
        //   207: invokevirtual   android/support/v4/app/LoaderManagerImpl$LoaderInfo.destroy:()V
        //   210: aload_0        
        //   211: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.this$0:Landroid/support/v4/app/LoaderManagerImpl;
        //   214: aload           10
        //   216: invokevirtual   android/support/v4/app/LoaderManagerImpl.installLoader:(Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;)V
        //   219: return         
        //   220: astore          21
        //   222: aload           21
        //   224: athrow         
        //   225: aload_0        
        //   226: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mData:Ljava/lang/Object;
        //   229: astore          14
        //   231: aload           14
        //   233: aload_2        
        //   234: if_acmpne       248
        //   237: aload_0        
        //   238: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mHaveData:Z
        //   241: istore          20
        //   243: iload           20
        //   245: ifne            271
        //   248: aload_0        
        //   249: aload_2        
        //   250: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mData:Ljava/lang/Object;
        //   253: aload_0        
        //   254: iconst_1       
        //   255: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mHaveData:Z
        //   258: aload_0        
        //   259: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mStarted:Z
        //   262: ifeq            271
        //   265: aload_0        
        //   266: aload_1        
        //   267: aload_2        
        //   268: invokevirtual   android/support/v4/app/LoaderManagerImpl$LoaderInfo.callOnLoadFinished:(Landroid/support/v4/content/Loader;Ljava/lang/Object;)V
        //   271: aload_0        
        //   272: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.this$0:Landroid/support/v4/app/LoaderManagerImpl;
        //   275: getfield        android/support/v4/app/LoaderManagerImpl.mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //   278: aload_0        
        //   279: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mId:I
        //   282: invokevirtual   android/support/v4/util/SparseArrayCompat.get:(I)Ljava/lang/Object;
        //   285: checkcast       Landroid/support/v4/app/LoaderManagerImpl$LoaderInfo;
        //   288: astore          15
        //   290: aload           15
        //   292: ifnull          326
        //   295: aload           15
        //   297: aload_0        
        //   298: if_acmpeq       326
        //   301: aload           15
        //   303: iconst_0       
        //   304: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mDeliveredData:Z
        //   307: aload           15
        //   309: invokevirtual   android/support/v4/app/LoaderManagerImpl$LoaderInfo.destroy:()V
        //   312: aload_0        
        //   313: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.this$0:Landroid/support/v4/app/LoaderManagerImpl;
        //   316: getfield        android/support/v4/app/LoaderManagerImpl.mInactiveLoaders:Landroid/support/v4/util/SparseArrayCompat;
        //   319: aload_0        
        //   320: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mId:I
        //   323: invokevirtual   android/support/v4/util/SparseArrayCompat.remove:(I)V
        //   326: aload_0        
        //   327: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.this$0:Landroid/support/v4/app/LoaderManagerImpl;
        //   330: getfield        android/support/v4/app/LoaderManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   333: astore          18
        //   335: aload           18
        //   337: ifnull          70
        //   340: aload_0        
        //   341: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.this$0:Landroid/support/v4/app/LoaderManagerImpl;
        //   344: invokevirtual   android/support/v4/app/LoaderManagerImpl.hasRunningLoaders:()Z
        //   347: ifne            70
        //   350: aload_0        
        //   351: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.this$0:Landroid/support/v4/app/LoaderManagerImpl;
        //   354: getfield        android/support/v4/app/LoaderManagerImpl.mActivity:Landroid/support/v4/app/FragmentActivity;
        //   357: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //   360: invokevirtual   android/support/v4/app/FragmentManagerImpl.startPendingDeferredFragments:()V
        //   363: return         
        //   364: astore          17
        //   366: aload           17
        //   368: athrow         
        //   369: astore          11
        //   371: aload           11
        //   373: athrow         
        //   374: astore          12
        //   376: aload           12
        //   378: athrow         
        //   379: astore          13
        //   381: aload           13
        //   383: athrow         
        //   384: astore          19
        //   386: aload           19
        //   388: athrow         
        //   389: astore          16
        //   391: aload           16
        //   393: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      38     71     74     Ljava/lang/IllegalArgumentException;
        //  38     44     74     79     Ljava/lang/IllegalArgumentException;
        //  49     70     79     84     Ljava/lang/IllegalArgumentException;
        //  76     79     79     84     Ljava/lang/IllegalArgumentException;
        //  84     100    132    137    Ljava/lang/IllegalArgumentException;
        //  106    126    127    132    Ljava/lang/IllegalArgumentException;
        //  134    137    127    132    Ljava/lang/IllegalArgumentException;
        //  148    186    220    225    Ljava/lang/IllegalArgumentException;
        //  225    231    369    374    Ljava/lang/IllegalArgumentException;
        //  237    243    374    379    Ljava/lang/IllegalArgumentException;
        //  248    271    379    384    Ljava/lang/IllegalArgumentException;
        //  301    326    384    389    Ljava/lang/IllegalArgumentException;
        //  326    335    389    394    Ljava/lang/IllegalArgumentException;
        //  340    363    364    369    Ljava/lang/IllegalArgumentException;
        //  371    374    374    379    Ljava/lang/IllegalArgumentException;
        //  376    379    379    384    Ljava/lang/IllegalArgumentException;
        //  391    394    364    369    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 193, Size: 193
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
    
    void reportStart() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mStarted:Z
        //     4: istore          4
        //     6: iload           4
        //     8: ifeq            46
        //    11: aload_0        
        //    12: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mReportNextStart:Z
        //    15: istore          5
        //    17: iload           5
        //    19: ifeq            46
        //    22: aload_0        
        //    23: iconst_0       
        //    24: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mReportNextStart:Z
        //    27: aload_0        
        //    28: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mHaveData:Z
        //    31: ifeq            46
        //    34: aload_0        
        //    35: aload_0        
        //    36: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //    39: aload_0        
        //    40: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mData:Ljava/lang/Object;
        //    43: invokevirtual   android/support/v4/app/LoaderManagerImpl$LoaderInfo.callOnLoadFinished:(Landroid/support/v4/content/Loader;Ljava/lang/Object;)V
        //    46: return         
        //    47: astore_1       
        //    48: aload_1        
        //    49: athrow         
        //    50: astore_2       
        //    51: aload_2        
        //    52: athrow         
        //    53: astore_3       
        //    54: aload_3        
        //    55: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      6      47     50     Ljava/lang/IllegalArgumentException;
        //  11     17     50     53     Ljava/lang/IllegalArgumentException;
        //  22     46     53     56     Ljava/lang/IllegalArgumentException;
        //  48     50     50     53     Ljava/lang/IllegalArgumentException;
        //  51     53     53     56     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 32, Size: 32
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
    
    void retain() {
        try {
            if (LoaderManagerImpl.DEBUG) {
                Log.v(LoaderManagerImpl$LoaderInfo.z[30], LoaderManagerImpl$LoaderInfo.z[29] + this);
            }
            this.mRetaining = true;
            this.mRetainingStarted = this.mStarted;
            this.mStarted = false;
            this.mCallbacks = null;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    void start() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mRetaining:Z
        //     4: istore_3       
        //     5: iload_3        
        //     6: ifeq            28
        //     9: aload_0        
        //    10: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mRetainingStarted:Z
        //    13: ifeq            28
        //    16: aload_0        
        //    17: iconst_1       
        //    18: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mStarted:Z
        //    21: return         
        //    22: astore_1       
        //    23: aload_1        
        //    24: athrow         
        //    25: astore_2       
        //    26: aload_2        
        //    27: athrow         
        //    28: aload_0        
        //    29: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mStarted:Z
        //    32: istore          5
        //    34: iload           5
        //    36: ifne            272
        //    39: aload_0        
        //    40: iconst_1       
        //    41: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mStarted:Z
        //    44: getstatic       android/support/v4/app/LoaderManagerImpl.DEBUG:Z
        //    47: ifeq            83
        //    50: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //    53: bipush          9
        //    55: aaload         
        //    56: new             Ljava/lang/StringBuilder;
        //    59: dup            
        //    60: invokespecial   java/lang/StringBuilder.<init>:()V
        //    63: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //    66: bipush          10
        //    68: aaload         
        //    69: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    72: aload_0        
        //    73: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    76: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    79: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    82: pop            
        //    83: aload_0        
        //    84: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //    87: astore          9
        //    89: aload           9
        //    91: ifnonnull       122
        //    94: aload_0        
        //    95: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
        //    98: ifnull          122
        //   101: aload_0        
        //   102: aload_0        
        //   103: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mCallbacks:Landroid/support/v4/app/LoaderManager$LoaderCallbacks;
        //   106: aload_0        
        //   107: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mId:I
        //   110: aload_0        
        //   111: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mArgs:Landroid/os/Bundle;
        //   114: invokeinterface android/support/v4/app/LoaderManager$LoaderCallbacks.onCreateLoader:(ILandroid/os/Bundle;)Landroid/support/v4/content/Loader;
        //   119: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //   122: aload_0        
        //   123: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //   126: astore          13
        //   128: aload           13
        //   130: ifnull          272
        //   133: aload_0        
        //   134: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //   137: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   140: invokevirtual   java/lang/Class.isMemberClass:()Z
        //   143: istore          14
        //   145: iload           14
        //   147: ifeq            235
        //   150: aload_0        
        //   151: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //   154: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   157: invokevirtual   java/lang/Class.getModifiers:()I
        //   160: invokestatic    java/lang/reflect/Modifier.isStatic:(I)Z
        //   163: ifne            235
        //   166: new             Ljava/lang/IllegalArgumentException;
        //   169: dup            
        //   170: new             Ljava/lang/StringBuilder;
        //   173: dup            
        //   174: invokespecial   java/lang/StringBuilder.<init>:()V
        //   177: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //   180: bipush          8
        //   182: aaload         
        //   183: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   186: aload_0        
        //   187: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //   190: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   193: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   196: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   199: athrow         
        //   200: astore          12
        //   202: aload           12
        //   204: athrow         
        //   205: astore          4
        //   207: aload           4
        //   209: athrow         
        //   210: astore          6
        //   212: aload           6
        //   214: athrow         
        //   215: astore          7
        //   217: aload           7
        //   219: athrow         
        //   220: astore          8
        //   222: aload           8
        //   224: athrow         
        //   225: astore          10
        //   227: aload           10
        //   229: athrow         
        //   230: astore          11
        //   232: aload           11
        //   234: athrow         
        //   235: aload_0        
        //   236: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mListenerRegistered:Z
        //   239: ifne            259
        //   242: aload_0        
        //   243: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //   246: aload_0        
        //   247: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mId:I
        //   250: aload_0        
        //   251: invokevirtual   android/support/v4/content/Loader.registerListener:(ILandroid/support/v4/content/Loader$OnLoadCompleteListener;)V
        //   254: aload_0        
        //   255: iconst_1       
        //   256: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mListenerRegistered:Z
        //   259: aload_0        
        //   260: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //   263: invokevirtual   android/support/v4/content/Loader.startLoading:()V
        //   266: return         
        //   267: astore          15
        //   269: aload           15
        //   271: athrow         
        //   272: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      5      22     25     Ljava/lang/IllegalArgumentException;
        //  9      21     25     28     Ljava/lang/IllegalArgumentException;
        //  23     25     25     28     Ljava/lang/IllegalArgumentException;
        //  28     34     205    210    Ljava/lang/IllegalArgumentException;
        //  39     83     210    215    Ljava/lang/IllegalArgumentException;
        //  83     89     215    220    Ljava/lang/IllegalArgumentException;
        //  94     122    220    225    Ljava/lang/IllegalArgumentException;
        //  122    128    225    230    Ljava/lang/IllegalArgumentException;
        //  133    145    230    235    Ljava/lang/IllegalArgumentException;
        //  150    200    200    205    Ljava/lang/IllegalArgumentException;
        //  217    220    220    225    Ljava/lang/IllegalArgumentException;
        //  227    230    230    235    Ljava/lang/IllegalArgumentException;
        //  232    235    200    205    Ljava/lang/IllegalArgumentException;
        //  235    259    267    272    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 134, Size: 134
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
    
    void stop() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ifeq            39
        //     6: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //     9: bipush          27
        //    11: aaload         
        //    12: new             Ljava/lang/StringBuilder;
        //    15: dup            
        //    16: invokespecial   java/lang/StringBuilder.<init>:()V
        //    19: getstatic       android/support/v4/app/LoaderManagerImpl$LoaderInfo.z:[Ljava/lang/String;
        //    22: bipush          28
        //    24: aaload         
        //    25: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    28: aload_0        
        //    29: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    32: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    35: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    38: pop            
        //    39: aload_0        
        //    40: iconst_0       
        //    41: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mStarted:Z
        //    44: aload_0        
        //    45: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mRetaining:Z
        //    48: istore          5
        //    50: iload           5
        //    52: ifne            93
        //    55: aload_0        
        //    56: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //    59: astore          6
        //    61: aload           6
        //    63: ifnull          93
        //    66: aload_0        
        //    67: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mListenerRegistered:Z
        //    70: ifeq            93
        //    73: aload_0        
        //    74: iconst_0       
        //    75: putfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mListenerRegistered:Z
        //    78: aload_0        
        //    79: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //    82: aload_0        
        //    83: invokevirtual   android/support/v4/content/Loader.unregisterListener:(Landroid/support/v4/content/Loader$OnLoadCompleteListener;)V
        //    86: aload_0        
        //    87: getfield        android/support/v4/app/LoaderManagerImpl$LoaderInfo.mLoader:Landroid/support/v4/content/Loader;
        //    90: invokevirtual   android/support/v4/content/Loader.stopLoading:()V
        //    93: return         
        //    94: astore_1       
        //    95: aload_1        
        //    96: athrow         
        //    97: astore_2       
        //    98: aload_2        
        //    99: athrow         
        //   100: astore_3       
        //   101: aload_3        
        //   102: athrow         
        //   103: astore          4
        //   105: aload           4
        //   107: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      39     94     97     Ljava/lang/IllegalArgumentException;
        //  39     50     97     100    Ljava/lang/IllegalArgumentException;
        //  55     61     100    103    Ljava/lang/IllegalArgumentException;
        //  66     93     103    108    Ljava/lang/IllegalArgumentException;
        //  98     100    100    103    Ljava/lang/IllegalArgumentException;
        //  101    103    103    108    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 56, Size: 56
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
        final StringBuilder sb = new StringBuilder(64);
        sb.append(LoaderManagerImpl$LoaderInfo.z[45]);
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(LoaderManagerImpl$LoaderInfo.z[42]);
        sb.append(this.mId);
        sb.append(LoaderManagerImpl$LoaderInfo.z[44]);
        DebugUtils.buildShortClassTag(this.mLoader, sb);
        sb.append(LoaderManagerImpl$LoaderInfo.z[43]);
        return sb.toString();
    }
}
