// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import java.util.List;
import android.text.TextUtils;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class BackStackState implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private static final String[] z;
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int mIndex;
    final String mName;
    final int[] mOps;
    final ArrayList mSharedElementSourceNames;
    final ArrayList mSharedElementTargetNames;
    final int mTransition;
    final int mTransitionStyle;
    
    static {
        final String[] z2 = new String[8];
        String s = "a*lR\u0017Aez\u0013\u001bDek\u0006\u0019L.";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'x';
                        break;
                    }
                    case 0: {
                        c2 = '/';
                        break;
                    }
                    case 1: {
                        c2 = 'E';
                        break;
                    }
                    case 2: {
                        c2 = '\u0018';
                        break;
                    }
                    case 3: {
                        c2 = 'r';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u000f*hR[";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "f+k\u0006\u0019A1q\u0013\fJe";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "i7y\u0015\u0015J+l?\u0019A$\u007f\u0017\n";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u000f6}\u0006X] u\u001d\u000eJe~\u0000\u0019H(}\u001c\f\u000ff";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "f+k\u0006\u0019A1q\u0013\fJe";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "i7y\u0015\u0015J+l?\u0019A$\u007f\u0017\n";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u000f'y\u0001\u001d\u000f#j\u0013\u001fB v\u0006X\f";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        CREATOR = (Parcelable$Creator)new BackStackState$1();
    }
    
    public BackStackState(final Parcel parcel) {
        this.mOps = parcel.createIntArray();
        this.mTransition = parcel.readInt();
        this.mTransitionStyle = parcel.readInt();
        this.mName = parcel.readString();
        this.mIndex = parcel.readInt();
        this.mBreadCrumbTitleRes = parcel.readInt();
        this.mBreadCrumbTitleText = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mBreadCrumbShortTitleRes = parcel.readInt();
        this.mBreadCrumbShortTitleText = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mSharedElementSourceNames = parcel.createStringArrayList();
        this.mSharedElementTargetNames = parcel.createStringArrayList();
    }
    
    public BackStackState(final FragmentManagerImpl p0, final BackStackRecord p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokespecial   java/lang/Object.<init>:()V
        //     8: aload_2        
        //     9: getfield        android/support/v4/app/BackStackRecord.mHead:Landroid/support/v4/app/BackStackRecord$Op;
        //    12: astore          4
        //    14: iconst_0       
        //    15: istore          5
        //    17: aload           4
        //    19: ifnull          54
        //    22: aload           4
        //    24: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //    27: ifnull          43
        //    30: iload           5
        //    32: aload           4
        //    34: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //    37: invokevirtual   java/util/ArrayList.size:()I
        //    40: iadd           
        //    41: istore          5
        //    43: aload           4
        //    45: getfield        android/support/v4/app/BackStackRecord$Op.next:Landroid/support/v4/app/BackStackRecord$Op;
        //    48: astore          4
        //    50: iload_3        
        //    51: ifeq            17
        //    54: aload_0        
        //    55: iload           5
        //    57: bipush          7
        //    59: aload_2        
        //    60: getfield        android/support/v4/app/BackStackRecord.mNumOp:I
        //    63: imul           
        //    64: iadd           
        //    65: newarray        I
        //    67: putfield        android/support/v4/app/BackStackState.mOps:[I
        //    70: aload_2        
        //    71: getfield        android/support/v4/app/BackStackRecord.mAddToBackStack:Z
        //    74: ifne            95
        //    77: new             Ljava/lang/IllegalStateException;
        //    80: dup            
        //    81: getstatic       android/support/v4/app/BackStackState.z:[Ljava/lang/String;
        //    84: iconst_0       
        //    85: aaload         
        //    86: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    89: athrow         
        //    90: astore          6
        //    92: aload           6
        //    94: athrow         
        //    95: aload_2        
        //    96: getfield        android/support/v4/app/BackStackRecord.mHead:Landroid/support/v4/app/BackStackRecord$Op;
        //    99: astore          7
        //   101: iconst_0       
        //   102: istore          8
        //   104: aload           7
        //   106: ifnull          387
        //   109: aload_0        
        //   110: getfield        android/support/v4/app/BackStackState.mOps:[I
        //   113: astore          10
        //   115: iload           8
        //   117: iconst_1       
        //   118: iadd           
        //   119: istore          11
        //   121: aload           10
        //   123: iload           8
        //   125: aload           7
        //   127: getfield        android/support/v4/app/BackStackRecord$Op.cmd:I
        //   130: iastore        
        //   131: aload_0        
        //   132: getfield        android/support/v4/app/BackStackState.mOps:[I
        //   135: astore          12
        //   137: iload           11
        //   139: iconst_1       
        //   140: iadd           
        //   141: istore          13
        //   143: aload           7
        //   145: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   148: ifnull          473
        //   151: aload           7
        //   153: getfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   156: getfield        android/support/v4/app/Fragment.mIndex:I
        //   159: istore          14
        //   161: aload           12
        //   163: iload           11
        //   165: iload           14
        //   167: iastore        
        //   168: aload_0        
        //   169: getfield        android/support/v4/app/BackStackState.mOps:[I
        //   172: astore          15
        //   174: iload           13
        //   176: iconst_1       
        //   177: iadd           
        //   178: istore          16
        //   180: aload           15
        //   182: iload           13
        //   184: aload           7
        //   186: getfield        android/support/v4/app/BackStackRecord$Op.enterAnim:I
        //   189: iastore        
        //   190: aload_0        
        //   191: getfield        android/support/v4/app/BackStackState.mOps:[I
        //   194: astore          17
        //   196: iload           16
        //   198: iconst_1       
        //   199: iadd           
        //   200: istore          18
        //   202: aload           17
        //   204: iload           16
        //   206: aload           7
        //   208: getfield        android/support/v4/app/BackStackRecord$Op.exitAnim:I
        //   211: iastore        
        //   212: aload_0        
        //   213: getfield        android/support/v4/app/BackStackState.mOps:[I
        //   216: astore          19
        //   218: iload           18
        //   220: iconst_1       
        //   221: iadd           
        //   222: istore          20
        //   224: aload           19
        //   226: iload           18
        //   228: aload           7
        //   230: getfield        android/support/v4/app/BackStackRecord$Op.popEnterAnim:I
        //   233: iastore        
        //   234: aload_0        
        //   235: getfield        android/support/v4/app/BackStackState.mOps:[I
        //   238: astore          21
        //   240: iload           20
        //   242: iconst_1       
        //   243: iadd           
        //   244: istore          8
        //   246: aload           21
        //   248: iload           20
        //   250: aload           7
        //   252: getfield        android/support/v4/app/BackStackRecord$Op.popExitAnim:I
        //   255: iastore        
        //   256: aload           7
        //   258: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   261: ifnull          354
        //   264: aload           7
        //   266: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   269: invokevirtual   java/util/ArrayList.size:()I
        //   272: istore          26
        //   274: aload_0        
        //   275: getfield        android/support/v4/app/BackStackState.mOps:[I
        //   278: astore          27
        //   280: iload           8
        //   282: iconst_1       
        //   283: iadd           
        //   284: istore          28
        //   286: aload           27
        //   288: iload           8
        //   290: iload           26
        //   292: iastore        
        //   293: iconst_0       
        //   294: istore          29
        //   296: iload           29
        //   298: iload           26
        //   300: if_icmpge       502
        //   303: aload_0        
        //   304: getfield        android/support/v4/app/BackStackState.mOps:[I
        //   307: astore          30
        //   309: iload           28
        //   311: iconst_1       
        //   312: iadd           
        //   313: istore          31
        //   315: aload           30
        //   317: iload           28
        //   319: aload           7
        //   321: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   324: iload           29
        //   326: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   329: checkcast       Landroid/support/v4/app/Fragment;
        //   332: getfield        android/support/v4/app/Fragment.mIndex:I
        //   335: iastore        
        //   336: iload           29
        //   338: iconst_1       
        //   339: iadd           
        //   340: istore          32
        //   342: iload_3        
        //   343: ifeq            491
        //   346: iload           31
        //   348: istore          8
        //   350: iload_3        
        //   351: ifeq            376
        //   354: iload           8
        //   356: istore          22
        //   358: aload_0        
        //   359: getfield        android/support/v4/app/BackStackState.mOps:[I
        //   362: astore          24
        //   364: iload           22
        //   366: iconst_1       
        //   367: iadd           
        //   368: istore          8
        //   370: aload           24
        //   372: iload           22
        //   374: iconst_0       
        //   375: iastore        
        //   376: aload           7
        //   378: getfield        android/support/v4/app/BackStackRecord$Op.next:Landroid/support/v4/app/BackStackRecord$Op;
        //   381: astore          25
        //   383: iload_3        
        //   384: ifeq            484
        //   387: aload_0        
        //   388: aload_2        
        //   389: getfield        android/support/v4/app/BackStackRecord.mTransition:I
        //   392: putfield        android/support/v4/app/BackStackState.mTransition:I
        //   395: aload_0        
        //   396: aload_2        
        //   397: getfield        android/support/v4/app/BackStackRecord.mTransitionStyle:I
        //   400: putfield        android/support/v4/app/BackStackState.mTransitionStyle:I
        //   403: aload_0        
        //   404: aload_2        
        //   405: getfield        android/support/v4/app/BackStackRecord.mName:Ljava/lang/String;
        //   408: putfield        android/support/v4/app/BackStackState.mName:Ljava/lang/String;
        //   411: aload_0        
        //   412: aload_2        
        //   413: getfield        android/support/v4/app/BackStackRecord.mIndex:I
        //   416: putfield        android/support/v4/app/BackStackState.mIndex:I
        //   419: aload_0        
        //   420: aload_2        
        //   421: getfield        android/support/v4/app/BackStackRecord.mBreadCrumbTitleRes:I
        //   424: putfield        android/support/v4/app/BackStackState.mBreadCrumbTitleRes:I
        //   427: aload_0        
        //   428: aload_2        
        //   429: getfield        android/support/v4/app/BackStackRecord.mBreadCrumbTitleText:Ljava/lang/CharSequence;
        //   432: putfield        android/support/v4/app/BackStackState.mBreadCrumbTitleText:Ljava/lang/CharSequence;
        //   435: aload_0        
        //   436: aload_2        
        //   437: getfield        android/support/v4/app/BackStackRecord.mBreadCrumbShortTitleRes:I
        //   440: putfield        android/support/v4/app/BackStackState.mBreadCrumbShortTitleRes:I
        //   443: aload_0        
        //   444: aload_2        
        //   445: getfield        android/support/v4/app/BackStackRecord.mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
        //   448: putfield        android/support/v4/app/BackStackState.mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
        //   451: aload_0        
        //   452: aload_2        
        //   453: getfield        android/support/v4/app/BackStackRecord.mSharedElementSourceNames:Ljava/util/ArrayList;
        //   456: putfield        android/support/v4/app/BackStackState.mSharedElementSourceNames:Ljava/util/ArrayList;
        //   459: aload_0        
        //   460: aload_2        
        //   461: getfield        android/support/v4/app/BackStackRecord.mSharedElementTargetNames:Ljava/util/ArrayList;
        //   464: putfield        android/support/v4/app/BackStackState.mSharedElementTargetNames:Ljava/util/ArrayList;
        //   467: return         
        //   468: astore          9
        //   470: aload           9
        //   472: athrow         
        //   473: iconst_m1      
        //   474: istore          14
        //   476: goto            161
        //   479: astore          23
        //   481: aload           23
        //   483: athrow         
        //   484: aload           25
        //   486: astore          7
        //   488: goto            104
        //   491: iload           32
        //   493: istore          29
        //   495: iload           31
        //   497: istore          28
        //   499: goto            296
        //   502: iload           28
        //   504: istore          8
        //   506: goto            350
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  54     90     90     95     Ljava/lang/IllegalStateException;
        //  109    115    468    473    Ljava/lang/IllegalStateException;
        //  121    137    468    473    Ljava/lang/IllegalStateException;
        //  143    161    468    473    Ljava/lang/IllegalStateException;
        //  358    364    479    484    Ljava/lang/IllegalStateException;
        //  370    376    479    484    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0376:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:692)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:529)
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
    
    public int describeContents() {
        return 0;
    }
    
    public BackStackRecord instantiate(final FragmentManagerImpl p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore_2       
        //     4: new             Landroid/support/v4/app/BackStackRecord;
        //     7: dup            
        //     8: aload_1        
        //     9: invokespecial   android/support/v4/app/BackStackRecord.<init>:(Landroid/support/v4/app/FragmentManagerImpl;)V
        //    12: astore_3       
        //    13: iconst_0       
        //    14: istore          4
        //    16: iconst_0       
        //    17: istore          5
        //    19: iload           5
        //    21: aload_0        
        //    22: getfield        android/support/v4/app/BackStackState.mOps:[I
        //    25: arraylength    
        //    26: if_icmpge       450
        //    29: new             Landroid/support/v4/app/BackStackRecord$Op;
        //    32: dup            
        //    33: invokespecial   android/support/v4/app/BackStackRecord$Op.<init>:()V
        //    36: astore          6
        //    38: aload_0        
        //    39: getfield        android/support/v4/app/BackStackState.mOps:[I
        //    42: astore          8
        //    44: iload           5
        //    46: iconst_1       
        //    47: iadd           
        //    48: istore          9
        //    50: aload           6
        //    52: aload           8
        //    54: iload           5
        //    56: iaload         
        //    57: putfield        android/support/v4/app/BackStackRecord$Op.cmd:I
        //    60: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //    63: ifeq            129
        //    66: getstatic       android/support/v4/app/BackStackState.z:[Ljava/lang/String;
        //    69: iconst_3       
        //    70: aaload         
        //    71: new             Ljava/lang/StringBuilder;
        //    74: dup            
        //    75: invokespecial   java/lang/StringBuilder.<init>:()V
        //    78: getstatic       android/support/v4/app/BackStackState.z:[Ljava/lang/String;
        //    81: iconst_2       
        //    82: aaload         
        //    83: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    86: aload_3        
        //    87: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    90: getstatic       android/support/v4/app/BackStackState.z:[Ljava/lang/String;
        //    93: iconst_1       
        //    94: aaload         
        //    95: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    98: iload           4
        //   100: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   103: getstatic       android/support/v4/app/BackStackState.z:[Ljava/lang/String;
        //   106: bipush          7
        //   108: aaload         
        //   109: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   112: aload_0        
        //   113: getfield        android/support/v4/app/BackStackState.mOps:[I
        //   116: iload           9
        //   118: iaload         
        //   119: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   122: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   125: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   128: pop            
        //   129: aload_0        
        //   130: getfield        android/support/v4/app/BackStackState.mOps:[I
        //   133: astore          10
        //   135: iload           9
        //   137: iconst_1       
        //   138: iadd           
        //   139: istore          11
        //   141: aload           10
        //   143: iload           9
        //   145: iaload         
        //   146: istore          12
        //   148: iload           12
        //   150: iflt            178
        //   153: aload_1        
        //   154: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //   157: iload           12
        //   159: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   162: checkcast       Landroid/support/v4/app/Fragment;
        //   165: astore          35
        //   167: aload           6
        //   169: aload           35
        //   171: putfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   174: iload_2        
        //   175: ifeq            184
        //   178: aload           6
        //   180: aconst_null    
        //   181: putfield        android/support/v4/app/BackStackRecord$Op.fragment:Landroid/support/v4/app/Fragment;
        //   184: aload_0        
        //   185: getfield        android/support/v4/app/BackStackState.mOps:[I
        //   188: astore          14
        //   190: iload           11
        //   192: iconst_1       
        //   193: iadd           
        //   194: istore          15
        //   196: aload           6
        //   198: aload           14
        //   200: iload           11
        //   202: iaload         
        //   203: putfield        android/support/v4/app/BackStackRecord$Op.enterAnim:I
        //   206: aload_0        
        //   207: getfield        android/support/v4/app/BackStackState.mOps:[I
        //   210: astore          16
        //   212: iload           15
        //   214: iconst_1       
        //   215: iadd           
        //   216: istore          17
        //   218: aload           6
        //   220: aload           16
        //   222: iload           15
        //   224: iaload         
        //   225: putfield        android/support/v4/app/BackStackRecord$Op.exitAnim:I
        //   228: aload_0        
        //   229: getfield        android/support/v4/app/BackStackState.mOps:[I
        //   232: astore          18
        //   234: iload           17
        //   236: iconst_1       
        //   237: iadd           
        //   238: istore          19
        //   240: aload           6
        //   242: aload           18
        //   244: iload           17
        //   246: iaload         
        //   247: putfield        android/support/v4/app/BackStackRecord$Op.popEnterAnim:I
        //   250: aload_0        
        //   251: getfield        android/support/v4/app/BackStackState.mOps:[I
        //   254: astore          20
        //   256: iload           19
        //   258: iconst_1       
        //   259: iadd           
        //   260: istore          21
        //   262: aload           6
        //   264: aload           20
        //   266: iload           19
        //   268: iaload         
        //   269: putfield        android/support/v4/app/BackStackRecord$Op.popExitAnim:I
        //   272: aload_0        
        //   273: getfield        android/support/v4/app/BackStackState.mOps:[I
        //   276: astore          22
        //   278: iload           21
        //   280: iconst_1       
        //   281: iadd           
        //   282: istore          23
        //   284: aload           22
        //   286: iload           21
        //   288: iaload         
        //   289: istore          24
        //   291: iload           24
        //   293: ifle            434
        //   296: aload           6
        //   298: new             Ljava/util/ArrayList;
        //   301: dup            
        //   302: iload           24
        //   304: invokespecial   java/util/ArrayList.<init>:(I)V
        //   307: putfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   310: iconst_0       
        //   311: istore          26
        //   313: iload           23
        //   315: istore          27
        //   317: iload           26
        //   319: iload           24
        //   321: if_icmpge       579
        //   324: getstatic       android/support/v4/app/FragmentManagerImpl.DEBUG:Z
        //   327: ifeq            380
        //   330: getstatic       android/support/v4/app/BackStackState.z:[Ljava/lang/String;
        //   333: bipush          6
        //   335: aaload         
        //   336: new             Ljava/lang/StringBuilder;
        //   339: dup            
        //   340: invokespecial   java/lang/StringBuilder.<init>:()V
        //   343: getstatic       android/support/v4/app/BackStackState.z:[Ljava/lang/String;
        //   346: iconst_5       
        //   347: aaload         
        //   348: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   351: aload_3        
        //   352: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   355: getstatic       android/support/v4/app/BackStackState.z:[Ljava/lang/String;
        //   358: iconst_4       
        //   359: aaload         
        //   360: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   363: aload_0        
        //   364: getfield        android/support/v4/app/BackStackState.mOps:[I
        //   367: iload           27
        //   369: iaload         
        //   370: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   373: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   376: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   379: pop            
        //   380: aload_1        
        //   381: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //   384: astore          29
        //   386: aload_0        
        //   387: getfield        android/support/v4/app/BackStackState.mOps:[I
        //   390: astore          30
        //   392: iload           27
        //   394: iconst_1       
        //   395: iadd           
        //   396: istore          23
        //   398: aload           29
        //   400: aload           30
        //   402: iload           27
        //   404: iaload         
        //   405: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   408: checkcast       Landroid/support/v4/app/Fragment;
        //   411: astore          31
        //   413: aload           6
        //   415: getfield        android/support/v4/app/BackStackRecord$Op.removed:Ljava/util/ArrayList;
        //   418: aload           31
        //   420: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   423: pop            
        //   424: iload           26
        //   426: iconst_1       
        //   427: iadd           
        //   428: istore          33
        //   430: iload_2        
        //   431: ifeq            568
        //   434: aload_3        
        //   435: aload           6
        //   437: invokevirtual   android/support/v4/app/BackStackRecord.addOp:(Landroid/support/v4/app/BackStackRecord$Op;)V
        //   440: iload           4
        //   442: iconst_1       
        //   443: iadd           
        //   444: istore          25
        //   446: iload_2        
        //   447: ifeq            557
        //   450: aload_3        
        //   451: aload_0        
        //   452: getfield        android/support/v4/app/BackStackState.mTransition:I
        //   455: putfield        android/support/v4/app/BackStackRecord.mTransition:I
        //   458: aload_3        
        //   459: aload_0        
        //   460: getfield        android/support/v4/app/BackStackState.mTransitionStyle:I
        //   463: putfield        android/support/v4/app/BackStackRecord.mTransitionStyle:I
        //   466: aload_3        
        //   467: aload_0        
        //   468: getfield        android/support/v4/app/BackStackState.mName:Ljava/lang/String;
        //   471: putfield        android/support/v4/app/BackStackRecord.mName:Ljava/lang/String;
        //   474: aload_3        
        //   475: aload_0        
        //   476: getfield        android/support/v4/app/BackStackState.mIndex:I
        //   479: putfield        android/support/v4/app/BackStackRecord.mIndex:I
        //   482: aload_3        
        //   483: iconst_1       
        //   484: putfield        android/support/v4/app/BackStackRecord.mAddToBackStack:Z
        //   487: aload_3        
        //   488: aload_0        
        //   489: getfield        android/support/v4/app/BackStackState.mBreadCrumbTitleRes:I
        //   492: putfield        android/support/v4/app/BackStackRecord.mBreadCrumbTitleRes:I
        //   495: aload_3        
        //   496: aload_0        
        //   497: getfield        android/support/v4/app/BackStackState.mBreadCrumbTitleText:Ljava/lang/CharSequence;
        //   500: putfield        android/support/v4/app/BackStackRecord.mBreadCrumbTitleText:Ljava/lang/CharSequence;
        //   503: aload_3        
        //   504: aload_0        
        //   505: getfield        android/support/v4/app/BackStackState.mBreadCrumbShortTitleRes:I
        //   508: putfield        android/support/v4/app/BackStackRecord.mBreadCrumbShortTitleRes:I
        //   511: aload_3        
        //   512: aload_0        
        //   513: getfield        android/support/v4/app/BackStackState.mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
        //   516: putfield        android/support/v4/app/BackStackRecord.mBreadCrumbShortTitleText:Ljava/lang/CharSequence;
        //   519: aload_3        
        //   520: aload_0        
        //   521: getfield        android/support/v4/app/BackStackState.mSharedElementSourceNames:Ljava/util/ArrayList;
        //   524: putfield        android/support/v4/app/BackStackRecord.mSharedElementSourceNames:Ljava/util/ArrayList;
        //   527: aload_3        
        //   528: aload_0        
        //   529: getfield        android/support/v4/app/BackStackState.mSharedElementTargetNames:Ljava/util/ArrayList;
        //   532: putfield        android/support/v4/app/BackStackRecord.mSharedElementTargetNames:Ljava/util/ArrayList;
        //   535: aload_3        
        //   536: iconst_1       
        //   537: invokevirtual   android/support/v4/app/BackStackRecord.bumpBackStackNesting:(I)V
        //   540: aload_3        
        //   541: areturn        
        //   542: astore          7
        //   544: aload           7
        //   546: athrow         
        //   547: astore          13
        //   549: aload           13
        //   551: athrow         
        //   552: astore          28
        //   554: aload           28
        //   556: athrow         
        //   557: iload           25
        //   559: istore          4
        //   561: iload           23
        //   563: istore          5
        //   565: goto            19
        //   568: iload           33
        //   570: istore          26
        //   572: iload           23
        //   574: istore          27
        //   576: goto            317
        //   579: iload           27
        //   581: istore          23
        //   583: goto            434
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  38     44     542    547    Ljava/lang/IllegalStateException;
        //  50     129    542    547    Ljava/lang/IllegalStateException;
        //  167    174    547    552    Ljava/lang/IllegalStateException;
        //  178    184    547    552    Ljava/lang/IllegalStateException;
        //  324    380    552    557    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 298, Size: 298
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
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeIntArray(this.mOps);
        parcel.writeInt(this.mTransition);
        parcel.writeInt(this.mTransitionStyle);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mBreadCrumbTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbTitleText, parcel, 0);
        parcel.writeInt(this.mBreadCrumbShortTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbShortTitleText, parcel, 0);
        parcel.writeStringList((List)this.mSharedElementSourceNames);
        parcel.writeStringList((List)this.mSharedElementTargetNames);
    }
}
