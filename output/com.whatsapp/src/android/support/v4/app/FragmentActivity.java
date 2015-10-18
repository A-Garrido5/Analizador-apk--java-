// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.os.Parcelable;
import android.view.MenuItem;
import android.view.KeyEvent;
import android.util.AttributeSet;
import android.support.annotation.NonNull;
import android.content.Context;
import android.view.Menu;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.content.res.Configuration;
import android.content.Intent;
import android.os.Build$VERSION;
import java.io.FileDescriptor;
import android.view.ViewGroup;
import android.content.res.Resources$NotFoundException;
import android.view.View;
import java.io.PrintWriter;
import android.os.Handler;
import android.support.v4.util.SimpleArrayMap;
import android.app.Activity;

public class FragmentActivity extends Activity
{
    public static int a;
    private static final String[] z;
    SimpleArrayMap mAllLoaderManagers;
    boolean mCheckedForLoaderManager;
    final FragmentContainer mContainer;
    boolean mCreated;
    final FragmentManagerImpl mFragments;
    final Handler mHandler;
    LoaderManagerImpl mLoaderManager;
    boolean mLoadersStarted;
    boolean mOptionsMenuInvalidated;
    boolean mReallyStopped;
    boolean mResumed;
    boolean mRetaining;
    boolean mStopped;
    
    static {
        final String[] z2 = new String[28];
        String s = "s\u001a";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0732:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0011';
                        break;
                    }
                    case 0: {
                        c2 = 'S';
                        break;
                    }
                    case 1: {
                        c2 = '9';
                        break;
                    }
                    case 2: {
                        c2 = 'g';
                        break;
                    }
                    case 3: {
                        c2 = '^';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "2W\u0003,~:]";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "2I\u0017";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "{K\b1ez";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "{K\b1ez";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "=L\u000b2";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "s\u0019";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0010X\t~~=U\u001e~d \\G2~$\\\u0015~ e\u0019\u00057e \u0019\u00011csK\u0002/d6J\u0013\u001d~7\\";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0015K\u00069|6W\u0013\u001fr'P\u00117e*";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0012Z\u00137g:M\u001e~c6J\u00122esW\b~w!X\u00003t=MG;i:J\u0013-15V\u0015~x=]\u0002&+s\t\u001f";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0015K\u00069|6W\u0013\u001fr'P\u00117e*";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0012Z\u00137g:M\u001e~c6J\u00122es_\u0015?v>\\\t*1:W\u0003;isV\u0012*1<_G,p=^\u0002d1cA";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0010X\t~~=U\u001e~d \\G2~$\\\u0015~ e\u0019\u00057e \u0019\u00011csK\u0002/d6J\u0013\u001d~7\\";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "2W\u0003,~:]]-d#I\b,ei_\u0015?v>\\\t*b";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "5K\u00069|6W\u0013";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "2W\u0003,~:]]-d#I\b,ei_\u0015?v>\\\t*b";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "s\u0019";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    s = "sT4*~#I\u0002:,";
                    n = 16;
                    n2 = 17;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    array = z2;
                    s = ">u\b?u6K\u0014\re2K\u0013;un";
                    n = 17;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "sT5;p?U\u001e\re<I\u0017;un";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = ">z\u0015;p'\\\u0003c";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u001fV\u0004?}s\u007f\u0015?v>\\\t*P0M\u000e(x'@G";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\u0005P\u0002)1\u001bP\u0002,p!Z\u000f'+";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = ">k\u0002-d>\\\u0003c";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "s\u0019";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "sj\u0013?e6\u0003";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "s\u0019";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u001fV\u0006:t!\u0019*?\u007f2^\u0002,1";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    break Label_0732;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public FragmentActivity() {
        this.mHandler = new FragmentActivity$1(this);
        this.mFragments = new FragmentManagerImpl();
        this.mContainer = new FragmentActivity$2(this);
    }
    
    private void dumpViewHierarchy(final String s, final PrintWriter printWriter, final View view) {
        while (true) {
            final int a = Fragment.a;
            try {
                printWriter.print(s);
                if (view == null) {
                    printWriter.println(FragmentActivity.z[5]);
                    return;
                }
            }
            catch (Resources$NotFoundException ex) {
                throw ex;
            }
            try {
                printWriter.println(viewToString(view));
                if (!(view instanceof ViewGroup)) {
                    return;
                }
                final ViewGroup viewGroup = (ViewGroup)view;
                final int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    final String string = s + FragmentActivity.z[6];
                    int i = 0;
                    while (i < childCount) {
                        this.dumpViewHierarchy(string, printWriter, viewGroup.getChildAt(i));
                        ++i;
                        if (a != 0) {
                            return;
                        }
                    }
                }
            }
            catch (Resources$NotFoundException ex2) {
                throw ex2;
            }
        }
    }
    
    private static String viewToString(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: bipush          86
        //     2: istore_1       
        //     3: bipush          70
        //     5: istore_2       
        //     6: bipush          46
        //     8: istore_3       
        //     9: getstatic       android/support/v4/app/Fragment.a:I
        //    12: istore          4
        //    14: new             Ljava/lang/StringBuilder;
        //    17: dup            
        //    18: sipush          128
        //    21: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    24: astore          5
        //    26: aload           5
        //    28: aload_0        
        //    29: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    32: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    35: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    38: pop            
        //    39: aload           5
        //    41: bipush          123
        //    43: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    46: pop            
        //    47: aload           5
        //    49: aload_0        
        //    50: invokestatic    java/lang/System.identityHashCode:(Ljava/lang/Object;)I
        //    53: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //    56: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    59: pop            
        //    60: aload           5
        //    62: bipush          32
        //    64: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //    67: pop            
        //    68: aload_0        
        //    69: invokevirtual   android/view/View.getVisibility:()I
        //    72: istore          14
        //    74: iload           14
        //    76: lookupswitch {
        //                0: 586
        //                4: 599
        //                8: 612
        //          default: 112
        //        }
        //   112: aload           5
        //   114: bipush          46
        //   116: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   119: pop            
        //   120: aload_0        
        //   121: invokevirtual   android/view/View.isFocusable:()Z
        //   124: istore          18
        //   126: iload           18
        //   128: ifeq            653
        //   131: iload_2        
        //   132: istore          19
        //   134: aload           5
        //   136: iload           19
        //   138: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   141: pop            
        //   142: aload_0        
        //   143: invokevirtual   android/view/View.isEnabled:()Z
        //   146: istore          22
        //   148: iload           22
        //   150: ifeq            664
        //   153: bipush          69
        //   155: istore          23
        //   157: aload           5
        //   159: iload           23
        //   161: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   164: pop            
        //   165: aload_0        
        //   166: invokevirtual   android/view/View.willNotDraw:()Z
        //   169: istore          26
        //   171: iload           26
        //   173: ifeq            675
        //   176: iload_3        
        //   177: istore          27
        //   179: aload           5
        //   181: iload           27
        //   183: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   186: pop            
        //   187: aload_0        
        //   188: invokevirtual   android/view/View.isHorizontalScrollBarEnabled:()Z
        //   191: istore          30
        //   193: iload           30
        //   195: ifeq            687
        //   198: bipush          72
        //   200: istore          31
        //   202: aload           5
        //   204: iload           31
        //   206: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   209: pop            
        //   210: aload_0        
        //   211: invokevirtual   android/view/View.isVerticalScrollBarEnabled:()Z
        //   214: istore          34
        //   216: iload           34
        //   218: ifeq            698
        //   221: aload           5
        //   223: iload_1        
        //   224: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   227: pop            
        //   228: aload_0        
        //   229: invokevirtual   android/view/View.isClickable:()Z
        //   232: istore          37
        //   234: iload           37
        //   236: ifeq            708
        //   239: bipush          67
        //   241: istore          38
        //   243: aload           5
        //   245: iload           38
        //   247: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   250: pop            
        //   251: aload_0        
        //   252: invokevirtual   android/view/View.isLongClickable:()Z
        //   255: istore          41
        //   257: iload           41
        //   259: ifeq            719
        //   262: bipush          76
        //   264: istore          42
        //   266: aload           5
        //   268: iload           42
        //   270: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   273: pop            
        //   274: aload           5
        //   276: bipush          32
        //   278: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   281: pop            
        //   282: aload_0        
        //   283: invokevirtual   android/view/View.isFocused:()Z
        //   286: istore          46
        //   288: iload           46
        //   290: ifeq            730
        //   293: aload           5
        //   295: iload_2        
        //   296: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   299: pop            
        //   300: aload_0        
        //   301: invokevirtual   android/view/View.isSelected:()Z
        //   304: istore          49
        //   306: iload           49
        //   308: ifeq            740
        //   311: bipush          83
        //   313: istore          50
        //   315: aload           5
        //   317: iload           50
        //   319: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   322: pop            
        //   323: aload_0        
        //   324: invokevirtual   android/view/View.isPressed:()Z
        //   327: istore          53
        //   329: iload           53
        //   331: ifeq            337
        //   334: bipush          80
        //   336: istore_3       
        //   337: aload           5
        //   339: iload_3        
        //   340: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   343: pop            
        //   344: aload           5
        //   346: bipush          32
        //   348: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   351: pop            
        //   352: aload           5
        //   354: aload_0        
        //   355: invokevirtual   android/view/View.getLeft:()I
        //   358: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   361: pop            
        //   362: aload           5
        //   364: bipush          44
        //   366: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   369: pop            
        //   370: aload           5
        //   372: aload_0        
        //   373: invokevirtual   android/view/View.getTop:()I
        //   376: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   379: pop            
        //   380: aload           5
        //   382: bipush          45
        //   384: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   387: pop            
        //   388: aload           5
        //   390: aload_0        
        //   391: invokevirtual   android/view/View.getRight:()I
        //   394: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   397: pop            
        //   398: aload           5
        //   400: bipush          44
        //   402: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   405: pop            
        //   406: aload           5
        //   408: aload_0        
        //   409: invokevirtual   android/view/View.getBottom:()I
        //   412: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   415: pop            
        //   416: aload_0        
        //   417: invokevirtual   android/view/View.getId:()I
        //   420: istore          63
        //   422: iload           63
        //   424: iconst_m1      
        //   425: if_icmpeq       571
        //   428: aload           5
        //   430: getstatic       android/support/v4/app/FragmentActivity.z:[Ljava/lang/String;
        //   433: iconst_0       
        //   434: aaload         
        //   435: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   438: pop            
        //   439: aload           5
        //   441: iload           63
        //   443: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   446: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   449: pop            
        //   450: aload_0        
        //   451: invokevirtual   android/view/View.getResources:()Landroid/content/res/Resources;
        //   454: astore          67
        //   456: iload           63
        //   458: ifeq            571
        //   461: aload           67
        //   463: ifnull          571
        //   466: ldc             -16777216
        //   468: iload           63
        //   470: iand           
        //   471: lookupswitch {
        //          16777216: 763
        //          2130706432: 751
        //          default: 496
        //        }
        //   496: aload           67
        //   498: iload           63
        //   500: invokevirtual   android/content/res/Resources.getResourcePackageName:(I)Ljava/lang/String;
        //   503: astore          69
        //   505: aload           67
        //   507: iload           63
        //   509: invokevirtual   android/content/res/Resources.getResourceTypeName:(I)Ljava/lang/String;
        //   512: astore          70
        //   514: aload           67
        //   516: iload           63
        //   518: invokevirtual   android/content/res/Resources.getResourceEntryName:(I)Ljava/lang/String;
        //   521: astore          71
        //   523: aload           5
        //   525: ldc             " "
        //   527: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   530: pop            
        //   531: aload           5
        //   533: aload           69
        //   535: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   538: pop            
        //   539: aload           5
        //   541: ldc             ":"
        //   543: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   546: pop            
        //   547: aload           5
        //   549: aload           70
        //   551: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   554: pop            
        //   555: aload           5
        //   557: ldc             "/"
        //   559: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   562: pop            
        //   563: aload           5
        //   565: aload           71
        //   567: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   570: pop            
        //   571: aload           5
        //   573: ldc_w           "}"
        //   576: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   579: pop            
        //   580: aload           5
        //   582: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   585: areturn        
        //   586: aload           5
        //   588: bipush          86
        //   590: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   593: pop            
        //   594: iload           4
        //   596: ifeq            120
        //   599: aload           5
        //   601: bipush          73
        //   603: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   606: pop            
        //   607: iload           4
        //   609: ifeq            120
        //   612: aload           5
        //   614: bipush          71
        //   616: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   619: pop            
        //   620: iload           4
        //   622: ifeq            120
        //   625: goto            112
        //   628: astore          6
        //   630: aload           6
        //   632: athrow         
        //   633: astore          7
        //   635: aload           7
        //   637: athrow         
        //   638: astore          8
        //   640: aload           8
        //   642: athrow         
        //   643: astore          9
        //   645: aload           9
        //   647: athrow         
        //   648: astore          17
        //   650: aload           17
        //   652: athrow         
        //   653: iload_3        
        //   654: istore          19
        //   656: goto            134
        //   659: astore          20
        //   661: aload           20
        //   663: athrow         
        //   664: iload_3        
        //   665: istore          23
        //   667: goto            157
        //   670: astore          24
        //   672: aload           24
        //   674: athrow         
        //   675: bipush          68
        //   677: istore          27
        //   679: goto            179
        //   682: astore          28
        //   684: aload           28
        //   686: athrow         
        //   687: iload_3        
        //   688: istore          31
        //   690: goto            202
        //   693: astore          32
        //   695: aload           32
        //   697: athrow         
        //   698: iload_3        
        //   699: istore_1       
        //   700: goto            221
        //   703: astore          35
        //   705: aload           35
        //   707: athrow         
        //   708: iload_3        
        //   709: istore          38
        //   711: goto            243
        //   714: astore          39
        //   716: aload           39
        //   718: athrow         
        //   719: iload_3        
        //   720: istore          42
        //   722: goto            266
        //   725: astore          43
        //   727: aload           43
        //   729: athrow         
        //   730: iload_3        
        //   731: istore_2       
        //   732: goto            293
        //   735: astore          47
        //   737: aload           47
        //   739: athrow         
        //   740: iload_3        
        //   741: istore          50
        //   743: goto            315
        //   746: astore          51
        //   748: aload           51
        //   750: athrow         
        //   751: getstatic       android/support/v4/app/FragmentActivity.z:[Ljava/lang/String;
        //   754: iconst_2       
        //   755: aaload         
        //   756: astore          69
        //   758: iload           4
        //   760: ifeq            505
        //   763: getstatic       android/support/v4/app/FragmentActivity.z:[Ljava/lang/String;
        //   766: iconst_1       
        //   767: aaload         
        //   768: astore          69
        //   770: iload           4
        //   772: ifeq            505
        //   775: goto            496
        //   778: astore          68
        //   780: goto            571
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  26     74     628    633    Landroid/content/res/Resources$NotFoundException;
        //  112    120    643    648    Landroid/content/res/Resources$NotFoundException;
        //  120    126    648    653    Landroid/content/res/Resources$NotFoundException;
        //  134    148    659    664    Landroid/content/res/Resources$NotFoundException;
        //  157    171    670    675    Landroid/content/res/Resources$NotFoundException;
        //  179    193    682    687    Landroid/content/res/Resources$NotFoundException;
        //  202    216    693    698    Landroid/content/res/Resources$NotFoundException;
        //  221    234    703    708    Landroid/content/res/Resources$NotFoundException;
        //  243    257    714    719    Landroid/content/res/Resources$NotFoundException;
        //  266    288    725    730    Landroid/content/res/Resources$NotFoundException;
        //  293    306    735    740    Landroid/content/res/Resources$NotFoundException;
        //  315    329    746    751    Landroid/content/res/Resources$NotFoundException;
        //  496    505    778    783    Landroid/content/res/Resources$NotFoundException;
        //  505    571    778    783    Landroid/content/res/Resources$NotFoundException;
        //  586    594    628    633    Landroid/content/res/Resources$NotFoundException;
        //  599    607    633    638    Landroid/content/res/Resources$NotFoundException;
        //  612    620    638    643    Landroid/content/res/Resources$NotFoundException;
        //  630    633    633    638    Landroid/content/res/Resources$NotFoundException;
        //  635    638    638    643    Landroid/content/res/Resources$NotFoundException;
        //  640    643    643    648    Landroid/content/res/Resources$NotFoundException;
        //  751    758    778    783    Landroid/content/res/Resources$NotFoundException;
        //  763    770    778    783    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 362, Size: 362
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
    
    void doReallyStop(final boolean mRetaining) {
        try {
            if (!this.mReallyStopped) {
                this.mReallyStopped = true;
                this.mRetaining = mRetaining;
                this.mHandler.removeMessages(1);
                this.onReallyStop();
            }
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
    }
    
    public void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        if (Build$VERSION.SDK_INT >= 11) {}
        printWriter.print(s);
        printWriter.print(FragmentActivity.z[21]);
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(FragmentActivity.z[25]);
        final String string = s + FragmentActivity.z[16];
        try {
            printWriter.print(string);
            printWriter.print(FragmentActivity.z[20]);
            printWriter.print(this.mCreated);
            printWriter.print(FragmentActivity.z[23]);
            printWriter.print(this.mResumed);
            printWriter.print(FragmentActivity.z[17]);
            printWriter.print(this.mStopped);
            printWriter.print(FragmentActivity.z[19]);
            printWriter.println(this.mReallyStopped);
            printWriter.print(string);
            printWriter.print(FragmentActivity.z[18]);
            printWriter.println(this.mLoadersStarted);
            if (this.mLoaderManager != null) {
                printWriter.print(s);
                printWriter.print(FragmentActivity.z[27]);
                printWriter.print(Integer.toHexString(System.identityHashCode(this.mLoaderManager)));
                printWriter.println(":");
                this.mLoaderManager.dump(s + FragmentActivity.z[24], fileDescriptor, printWriter, array);
            }
            this.mFragments.dump(s, fileDescriptor, printWriter, array);
            printWriter.print(s);
            printWriter.println(FragmentActivity.z[22]);
            this.dumpViewHierarchy(s + FragmentActivity.z[26], printWriter, this.getWindow().getDecorView());
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
    }
    
    LoaderManagerImpl getLoaderManager(final String p0, final boolean p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/app/FragmentActivity.mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
        //     4: ifnonnull       18
        //     7: aload_0        
        //     8: new             Landroid/support/v4/util/SimpleArrayMap;
        //    11: dup            
        //    12: invokespecial   android/support/v4/util/SimpleArrayMap.<init>:()V
        //    15: putfield        android/support/v4/app/FragmentActivity.mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
        //    18: aload_0        
        //    19: getfield        android/support/v4/app/FragmentActivity.mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
        //    22: aload_1        
        //    23: invokevirtual   android/support/v4/util/SimpleArrayMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    26: checkcast       Landroid/support/v4/app/LoaderManagerImpl;
        //    29: astore          5
        //    31: aload           5
        //    33: ifnonnull       69
        //    36: iload_3        
        //    37: ifeq            75
        //    40: new             Landroid/support/v4/app/LoaderManagerImpl;
        //    43: dup            
        //    44: aload_1        
        //    45: aload_0        
        //    46: iload_2        
        //    47: invokespecial   android/support/v4/app/LoaderManagerImpl.<init>:(Ljava/lang/String;Landroid/support/v4/app/FragmentActivity;Z)V
        //    50: astore          5
        //    52: aload_0        
        //    53: getfield        android/support/v4/app/FragmentActivity.mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
        //    56: aload_1        
        //    57: aload           5
        //    59: invokevirtual   android/support/v4/util/SimpleArrayMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    62: pop            
        //    63: getstatic       android/support/v4/app/Fragment.a:I
        //    66: ifeq            75
        //    69: aload           5
        //    71: aload_0        
        //    72: invokevirtual   android/support/v4/app/LoaderManagerImpl.updateActivity:(Landroid/support/v4/app/FragmentActivity;)V
        //    75: aload           5
        //    77: areturn        
        //    78: astore          4
        //    80: aload           4
        //    82: athrow         
        //    83: astore          6
        //    85: aload           6
        //    87: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  0      18     78     83     Landroid/content/res/Resources$NotFoundException;
        //  52     69     83     88     Landroid/content/res/Resources$NotFoundException;
        //  69     75     83     88     Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0069:
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
    
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments;
    }
    
    public LoaderManager getSupportLoaderManager() {
        try {
            if (this.mLoaderManager != null) {
                return this.mLoaderManager;
            }
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
        this.mCheckedForLoaderManager = true;
        return this.mLoaderManager = this.getLoaderManager(FragmentActivity.z[3], this.mLoadersStarted, true);
    }
    
    void invalidateSupportFragment(final String s) {
        if (this.mAllLoaderManagers == null) {
            return;
        }
        final LoaderManagerImpl loaderManagerImpl = (LoaderManagerImpl)this.mAllLoaderManagers.get(s);
        if (loaderManagerImpl == null) {
            return;
        }
        try {
            if (!loaderManagerImpl.mRetaining) {
                loaderManagerImpl.doDestroy();
                this.mAllLoaderManagers.remove(s);
            }
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
    }
    
    protected void onActivityResult(final int p0, final int p1, final Intent p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //     4: invokevirtual   android/support/v4/app/FragmentManagerImpl.noteStateNotSaved:()V
        //     7: iload_1        
        //     8: bipush          16
        //    10: ishr           
        //    11: istore          4
        //    13: iload           4
        //    15: ifeq            192
        //    18: iload           4
        //    20: iconst_1       
        //    21: isub           
        //    22: istore          5
        //    24: aload_0        
        //    25: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //    28: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //    31: astore          9
        //    33: aload           9
        //    35: ifnull          58
        //    38: iload           5
        //    40: iflt            58
        //    43: iload           5
        //    45: aload_0        
        //    46: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //    49: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //    52: invokevirtual   java/util/ArrayList.size:()I
        //    55: if_icmplt       110
        //    58: getstatic       android/support/v4/app/FragmentActivity.z:[Ljava/lang/String;
        //    61: bipush          8
        //    63: aaload         
        //    64: new             Ljava/lang/StringBuilder;
        //    67: dup            
        //    68: invokespecial   java/lang/StringBuilder.<init>:()V
        //    71: getstatic       android/support/v4/app/FragmentActivity.z:[Ljava/lang/String;
        //    74: bipush          11
        //    76: aaload         
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    80: iload_1        
        //    81: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //    84: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    87: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    90: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //    93: pop            
        //    94: return         
        //    95: astore          6
        //    97: aload           6
        //    99: athrow         
        //   100: astore          7
        //   102: aload           7
        //   104: athrow         
        //   105: astore          8
        //   107: aload           8
        //   109: athrow         
        //   110: aload_0        
        //   111: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //   114: getfield        android/support/v4/app/FragmentManagerImpl.mActive:Ljava/util/ArrayList;
        //   117: iload           5
        //   119: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   122: checkcast       Landroid/support/v4/app/Fragment;
        //   125: astore          11
        //   127: aload           11
        //   129: ifnonnull       174
        //   132: getstatic       android/support/v4/app/FragmentActivity.z:[Ljava/lang/String;
        //   135: bipush          10
        //   137: aaload         
        //   138: new             Ljava/lang/StringBuilder;
        //   141: dup            
        //   142: invokespecial   java/lang/StringBuilder.<init>:()V
        //   145: getstatic       android/support/v4/app/FragmentActivity.z:[Ljava/lang/String;
        //   148: bipush          9
        //   150: aaload         
        //   151: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   154: iload_1        
        //   155: invokestatic    java/lang/Integer.toHexString:(I)Ljava/lang/String;
        //   158: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   161: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   164: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   167: pop            
        //   168: getstatic       android/support/v4/app/Fragment.a:I
        //   171: ifeq            94
        //   174: aload           11
        //   176: ldc_w           65535
        //   179: iload_1        
        //   180: iand           
        //   181: iload_2        
        //   182: aload_3        
        //   183: invokevirtual   android/support/v4/app/Fragment.onActivityResult:(IILandroid/content/Intent;)V
        //   186: return         
        //   187: astore          12
        //   189: aload           12
        //   191: athrow         
        //   192: aload_0        
        //   193: iload_1        
        //   194: iload_2        
        //   195: aload_3        
        //   196: invokespecial   android/app/Activity.onActivityResult:(IILandroid/content/Intent;)V
        //   199: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  24     33     95     105    Landroid/content/res/Resources$NotFoundException;
        //  43     58     105    110    Landroid/content/res/Resources$NotFoundException;
        //  58     94     105    110    Landroid/content/res/Resources$NotFoundException;
        //  97     100    100    105    Landroid/content/res/Resources$NotFoundException;
        //  102    105    105    110    Landroid/content/res/Resources$NotFoundException;
        //  132    174    187    192    Landroid/content/res/Resources$NotFoundException;
        //  174    186    187    192    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0058:
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
    
    public void onAttachFragment(final Fragment fragment) {
    }
    
    public void onBackPressed() {
        try {
            if (!this.mFragments.popBackStackImmediate()) {
                this.supportFinishAfterTransition();
            }
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.dispatchConfigurationChanged(configuration);
    }
    
    protected void onCreate(@Nullable final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //     4: aload_0        
        //     5: aload_0        
        //     6: getfield        android/support/v4/app/FragmentActivity.mContainer:Landroid/support/v4/app/FragmentContainer;
        //     9: aconst_null    
        //    10: invokevirtual   android/support/v4/app/FragmentManagerImpl.attachActivity:(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/app/FragmentContainer;Landroid/support/v4/app/Fragment;)V
        //    13: aload_0        
        //    14: invokevirtual   android/support/v4/app/FragmentActivity.getLayoutInflater:()Landroid/view/LayoutInflater;
        //    17: invokevirtual   android/view/LayoutInflater.getFactory:()Landroid/view/LayoutInflater$Factory;
        //    20: ifnonnull       31
        //    23: aload_0        
        //    24: invokevirtual   android/support/v4/app/FragmentActivity.getLayoutInflater:()Landroid/view/LayoutInflater;
        //    27: aload_0        
        //    28: invokevirtual   android/view/LayoutInflater.setFactory:(Landroid/view/LayoutInflater$Factory;)V
        //    31: aload_0        
        //    32: aload_1        
        //    33: invokespecial   android/app/Activity.onCreate:(Landroid/os/Bundle;)V
        //    36: aload_0        
        //    37: invokevirtual   android/support/v4/app/FragmentActivity.getLastNonConfigurationInstance:()Ljava/lang/Object;
        //    40: checkcast       Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
        //    43: astore_3       
        //    44: aload_3        
        //    45: ifnull          56
        //    48: aload_0        
        //    49: aload_3        
        //    50: getfield        android/support/v4/app/FragmentActivity$NonConfigurationInstances.loaders:Landroid/support/v4/util/SimpleArrayMap;
        //    53: putfield        android/support/v4/app/FragmentActivity.mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
        //    56: aload_1        
        //    57: ifnull          97
        //    60: aload_1        
        //    61: getstatic       android/support/v4/app/FragmentActivity.z:[Ljava/lang/String;
        //    64: bipush          15
        //    66: aaload         
        //    67: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
        //    70: astore          4
        //    72: aload_0        
        //    73: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //    76: astore          6
        //    78: aload_3        
        //    79: ifnull          118
        //    82: aload_3        
        //    83: getfield        android/support/v4/app/FragmentActivity$NonConfigurationInstances.fragments:Ljava/util/ArrayList;
        //    86: astore          7
        //    88: aload           6
        //    90: aload           4
        //    92: aload           7
        //    94: invokevirtual   android/support/v4/app/FragmentManagerImpl.restoreAllState:(Landroid/os/Parcelable;Ljava/util/ArrayList;)V
        //    97: aload_0        
        //    98: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //   101: invokevirtual   android/support/v4/app/FragmentManagerImpl.dispatchCreate:()V
        //   104: return         
        //   105: astore_2       
        //   106: aload_2        
        //   107: athrow         
        //   108: astore          8
        //   110: aload           8
        //   112: athrow         
        //   113: astore          5
        //   115: aload           5
        //   117: athrow         
        //   118: aconst_null    
        //   119: astore          7
        //   121: goto            88
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  0      31     105    108    Landroid/content/res/Resources$NotFoundException;
        //  48     56     108    113    Landroid/content/res/Resources$NotFoundException;
        //  72     78     113    118    Landroid/content/res/Resources$NotFoundException;
        //  82     88     113    118    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 64, Size: 64
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
    
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        if (n == 0) {
            final boolean b = super.onCreatePanelMenu(n, menu) | this.mFragments.dispatchCreateOptionsMenu(menu, this.getMenuInflater());
            try {
                if (Build$VERSION.SDK_INT >= 11) {
                    return b;
                }
            }
            catch (Resources$NotFoundException ex) {
                throw ex;
            }
            return true;
        }
        return super.onCreatePanelMenu(n, menu);
    }
    
    @Nullable
    public View onCreateView(final String s, @NonNull final Context context, @NonNull final AttributeSet set) {
        while (true) {
            try {
                if (!FragmentActivity.z[14].equals(s)) {
                    return super.onCreateView(s, context, set);
                }
            }
            catch (Resources$NotFoundException ex) {
                throw ex;
            }
            final View view = this.mFragments.onCreateView(null, s, context, set);
            if (view == null) {
                break;
            }
            return view;
        }
        try {
            return super.onCreateView(s, context, set);
        }
        catch (Resources$NotFoundException ex2) {
            throw ex2;
        }
    }
    
    protected void onDestroy() {
        try {
            super.onDestroy();
            this.doReallyStop(false);
            this.mFragments.dispatchDestroy();
            if (this.mLoaderManager != null) {
                this.mLoaderManager.doDestroy();
            }
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        try {
            if (Build$VERSION.SDK_INT >= 5 || n != 4) {
                return super.onKeyDown(n, keyEvent);
            }
            final KeyEvent keyEvent2 = keyEvent;
            final int n2 = keyEvent2.getRepeatCount();
            if (n2 == 0) {
                final FragmentActivity fragmentActivity = this;
                fragmentActivity.onBackPressed();
                return true;
            }
            return super.onKeyDown(n, keyEvent);
        }
        catch (Resources$NotFoundException ex) {
            try {
                throw ex;
            }
            catch (Resources$NotFoundException ex2) {
                throw ex2;
            }
        }
        try {
            final KeyEvent keyEvent2 = keyEvent;
            final int n2 = keyEvent2.getRepeatCount();
            if (n2 == 0) {
                final FragmentActivity fragmentActivity = this;
                fragmentActivity.onBackPressed();
                return true;
            }
        }
        catch (Resources$NotFoundException ex3) {
            throw ex3;
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.dispatchLowMemory();
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        try {
            if (super.onMenuItemSelected(n, menuItem)) {
                return true;
            }
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
        switch (n) {
            default: {
                return false;
            }
            case 0: {
                try {
                    return this.mFragments.dispatchOptionsItemSelected(menuItem);
                }
                catch (Resources$NotFoundException ex2) {
                    throw ex2;
                }
            }
            case 6: {
                return this.mFragments.dispatchContextItemSelected(menuItem);
            }
        }
    }
    
    protected void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.noteStateNotSaved();
    }
    
    public void onPanelClosed(final int n, final Menu menu) {
        switch (n) {
            case 0: {
                try {
                    this.mFragments.dispatchOptionsMenuClosed(menu);
                    break;
                }
                catch (Resources$NotFoundException ex) {
                    throw ex;
                }
                break;
            }
        }
        super.onPanelClosed(n, menu);
    }
    
    protected void onPause() {
        try {
            super.onPause();
            this.mResumed = false;
            if (this.mHandler.hasMessages(2)) {
                this.mHandler.removeMessages(2);
                this.onResumeFragments();
            }
            this.mFragments.dispatchPause();
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
    }
    
    protected void onPostResume() {
        super.onPostResume();
        this.mHandler.removeMessages(2);
        this.onResumeFragments();
        this.mFragments.execPendingActions();
    }
    
    protected boolean onPrepareOptionsPanel(final View view, final Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }
    
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        if (n == 0 && menu != null) {
            try {
                if (this.mOptionsMenuInvalidated) {
                    this.mOptionsMenuInvalidated = false;
                    menu.clear();
                    this.onCreatePanelMenu(n, menu);
                }
                return this.onPrepareOptionsPanel(view, menu) | this.mFragments.dispatchPrepareOptionsMenu(menu);
            }
            catch (Resources$NotFoundException ex) {
                throw ex;
            }
        }
        return super.onPreparePanel(n, view, menu);
    }
    
    void onReallyStop() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        android/support/v4/app/FragmentActivity.mLoadersStarted:Z
        //     4: istore          5
        //     6: iload           5
        //     8: ifeq            58
        //    11: aload_0        
        //    12: iconst_0       
        //    13: putfield        android/support/v4/app/FragmentActivity.mLoadersStarted:Z
        //    16: aload_0        
        //    17: getfield        android/support/v4/app/FragmentActivity.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //    20: astore          6
        //    22: aload           6
        //    24: ifnull          58
        //    27: aload_0        
        //    28: getfield        android/support/v4/app/FragmentActivity.mRetaining:Z
        //    31: istore          7
        //    33: iload           7
        //    35: ifne            51
        //    38: aload_0        
        //    39: getfield        android/support/v4/app/FragmentActivity.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //    42: invokevirtual   android/support/v4/app/LoaderManagerImpl.doStop:()V
        //    45: getstatic       android/support/v4/app/Fragment.a:I
        //    48: ifeq            58
        //    51: aload_0        
        //    52: getfield        android/support/v4/app/FragmentActivity.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //    55: invokevirtual   android/support/v4/app/LoaderManagerImpl.doRetain:()V
        //    58: aload_0        
        //    59: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //    62: invokevirtual   android/support/v4/app/FragmentManagerImpl.dispatchReallyStop:()V
        //    65: return         
        //    66: astore_1       
        //    67: aload_1        
        //    68: athrow         
        //    69: astore_2       
        //    70: aload_2        
        //    71: athrow         
        //    72: astore_3       
        //    73: aload_3        
        //    74: athrow         
        //    75: astore          4
        //    77: aload           4
        //    79: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  0      6      66     69     Landroid/content/res/Resources$NotFoundException;
        //  11     22     69     72     Landroid/content/res/Resources$NotFoundException;
        //  27     33     72     75     Landroid/content/res/Resources$NotFoundException;
        //  38     51     75     80     Landroid/content/res/Resources$NotFoundException;
        //  51     58     75     80     Landroid/content/res/Resources$NotFoundException;
        //  67     69     69     72     Landroid/content/res/Resources$NotFoundException;
        //  70     72     72     75     Landroid/content/res/Resources$NotFoundException;
        //  73     75     75     80     Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 42, Size: 42
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
    
    protected void onResume() {
        super.onResume();
        this.mHandler.sendEmptyMessage(2);
        this.mResumed = true;
        this.mFragments.execPendingActions();
    }
    
    protected void onResumeFragments() {
        this.mFragments.dispatchResume();
    }
    
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }
    
    public final Object onRetainNonConfigurationInstance() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_1       
        //     2: getstatic       android/support/v4/app/Fragment.a:I
        //     5: istore_2       
        //     6: aload_0        
        //     7: getfield        android/support/v4/app/FragmentActivity.mStopped:Z
        //    10: ifeq            18
        //    13: aload_0        
        //    14: iconst_1       
        //    15: invokevirtual   android/support/v4/app/FragmentActivity.doReallyStop:(Z)V
        //    18: aload_0        
        //    19: invokevirtual   android/support/v4/app/FragmentActivity.onRetainCustomNonConfigurationInstance:()Ljava/lang/Object;
        //    22: astore          4
        //    24: aload_0        
        //    25: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //    28: invokevirtual   android/support/v4/app/FragmentManagerImpl.retainNonConfig:()Ljava/util/ArrayList;
        //    31: astore          5
        //    33: aload_0        
        //    34: getfield        android/support/v4/app/FragmentActivity.mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
        //    37: ifnull          234
        //    40: aload_0        
        //    41: getfield        android/support/v4/app/FragmentActivity.mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
        //    44: invokevirtual   android/support/v4/util/SimpleArrayMap.size:()I
        //    47: istore          8
        //    49: iload           8
        //    51: anewarray       Landroid/support/v4/app/LoaderManagerImpl;
        //    54: astore          9
        //    56: iload           8
        //    58: iconst_1       
        //    59: isub           
        //    60: istore          10
        //    62: iload           10
        //    64: iflt            94
        //    67: aload           9
        //    69: iload           10
        //    71: aload_0        
        //    72: getfield        android/support/v4/app/FragmentActivity.mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
        //    75: iload           10
        //    77: invokevirtual   android/support/v4/util/SimpleArrayMap.valueAt:(I)Ljava/lang/Object;
        //    80: checkcast       Landroid/support/v4/app/LoaderManagerImpl;
        //    83: aastore        
        //    84: iload           10
        //    86: iconst_1       
        //    87: isub           
        //    88: istore          14
        //    90: iload_2        
        //    91: ifeq            227
        //    94: iconst_0       
        //    95: istore          6
        //    97: iload_1        
        //    98: iload           8
        //   100: if_icmpge       149
        //   103: aload           9
        //   105: iload_1        
        //   106: aaload         
        //   107: astore          11
        //   109: aload           11
        //   111: getfield        android/support/v4/app/LoaderManagerImpl.mRetaining:Z
        //   114: ifeq            124
        //   117: iload_2        
        //   118: ifeq            221
        //   121: iconst_1       
        //   122: istore          6
        //   124: aload           11
        //   126: invokevirtual   android/support/v4/app/LoaderManagerImpl.doDestroy:()V
        //   129: aload_0        
        //   130: getfield        android/support/v4/app/FragmentActivity.mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
        //   133: aload           11
        //   135: getfield        android/support/v4/app/LoaderManagerImpl.mWho:Ljava/lang/String;
        //   138: invokevirtual   android/support/v4/util/SimpleArrayMap.remove:(Ljava/lang/Object;)Ljava/lang/Object;
        //   141: pop            
        //   142: iinc            1, 1
        //   145: iload_2        
        //   146: ifeq            97
        //   149: aload           5
        //   151: ifnonnull       174
        //   154: iload           6
        //   156: ifne            174
        //   159: aload           4
        //   161: ifnonnull       174
        //   164: aconst_null    
        //   165: areturn        
        //   166: astore_3       
        //   167: aload_3        
        //   168: athrow         
        //   169: astore          12
        //   171: aload           12
        //   173: athrow         
        //   174: new             Landroid/support/v4/app/FragmentActivity$NonConfigurationInstances;
        //   177: dup            
        //   178: invokespecial   android/support/v4/app/FragmentActivity$NonConfigurationInstances.<init>:()V
        //   181: astore          7
        //   183: aload           7
        //   185: aconst_null    
        //   186: putfield        android/support/v4/app/FragmentActivity$NonConfigurationInstances.activity:Ljava/lang/Object;
        //   189: aload           7
        //   191: aload           4
        //   193: putfield        android/support/v4/app/FragmentActivity$NonConfigurationInstances.custom:Ljava/lang/Object;
        //   196: aload           7
        //   198: aconst_null    
        //   199: putfield        android/support/v4/app/FragmentActivity$NonConfigurationInstances.children:Landroid/support/v4/util/SimpleArrayMap;
        //   202: aload           7
        //   204: aload           5
        //   206: putfield        android/support/v4/app/FragmentActivity$NonConfigurationInstances.fragments:Ljava/util/ArrayList;
        //   209: aload           7
        //   211: aload_0        
        //   212: getfield        android/support/v4/app/FragmentActivity.mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
        //   215: putfield        android/support/v4/app/FragmentActivity$NonConfigurationInstances.loaders:Landroid/support/v4/util/SimpleArrayMap;
        //   218: aload           7
        //   220: areturn        
        //   221: iconst_1       
        //   222: istore          6
        //   224: goto            142
        //   227: iload           14
        //   229: istore          10
        //   231: goto            62
        //   234: iconst_0       
        //   235: istore          6
        //   237: goto            149
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  6      18     166    169    Landroid/content/res/Resources$NotFoundException;
        //  124    142    169    174    Landroid/content/res/Resources$NotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0124:
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
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        final Parcelable saveAllState = this.mFragments.saveAllState();
        if (saveAllState == null) {
            return;
        }
        try {
            bundle.putParcelable(FragmentActivity.z[13], saveAllState);
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
    }
    
    protected void onStart() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/app/Fragment.a:I
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokespecial   android/app/Activity.onStart:()V
        //     8: aload_0        
        //     9: iconst_0       
        //    10: putfield        android/support/v4/app/FragmentActivity.mStopped:Z
        //    13: aload_0        
        //    14: iconst_0       
        //    15: putfield        android/support/v4/app/FragmentActivity.mReallyStopped:Z
        //    18: aload_0        
        //    19: getfield        android/support/v4/app/FragmentActivity.mHandler:Landroid/os/Handler;
        //    22: iconst_1       
        //    23: invokevirtual   android/os/Handler.removeMessages:(I)V
        //    26: aload_0        
        //    27: getfield        android/support/v4/app/FragmentActivity.mCreated:Z
        //    30: ifne            45
        //    33: aload_0        
        //    34: iconst_1       
        //    35: putfield        android/support/v4/app/FragmentActivity.mCreated:Z
        //    38: aload_0        
        //    39: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //    42: invokevirtual   android/support/v4/app/FragmentManagerImpl.dispatchActivityCreated:()V
        //    45: aload_0        
        //    46: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //    49: invokevirtual   android/support/v4/app/FragmentManagerImpl.noteStateNotSaved:()V
        //    52: aload_0        
        //    53: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //    56: invokevirtual   android/support/v4/app/FragmentManagerImpl.execPendingActions:()Z
        //    59: pop            
        //    60: aload_0        
        //    61: getfield        android/support/v4/app/FragmentActivity.mLoadersStarted:Z
        //    64: istore          10
        //    66: iload           10
        //    68: ifne            160
        //    71: aload_0        
        //    72: iconst_1       
        //    73: putfield        android/support/v4/app/FragmentActivity.mLoadersStarted:Z
        //    76: aload_0        
        //    77: getfield        android/support/v4/app/FragmentActivity.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //    80: astore          17
        //    82: aload           17
        //    84: ifnull          98
        //    87: aload_0        
        //    88: getfield        android/support/v4/app/FragmentActivity.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //    91: invokevirtual   android/support/v4/app/LoaderManagerImpl.doStart:()V
        //    94: iload_1        
        //    95: ifeq            155
        //    98: aload_0        
        //    99: getfield        android/support/v4/app/FragmentActivity.mCheckedForLoaderManager:Z
        //   102: istore          18
        //   104: iload           18
        //   106: ifne            155
        //   109: aload_0        
        //   110: aload_0        
        //   111: getstatic       android/support/v4/app/FragmentActivity.z:[Ljava/lang/String;
        //   114: iconst_4       
        //   115: aaload         
        //   116: aload_0        
        //   117: getfield        android/support/v4/app/FragmentActivity.mLoadersStarted:Z
        //   120: iconst_0       
        //   121: invokevirtual   android/support/v4/app/FragmentActivity.getLoaderManager:(Ljava/lang/String;ZZ)Landroid/support/v4/app/LoaderManagerImpl;
        //   124: putfield        android/support/v4/app/FragmentActivity.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //   127: aload_0        
        //   128: getfield        android/support/v4/app/FragmentActivity.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //   131: astore          19
        //   133: aload           19
        //   135: ifnull          155
        //   138: aload_0        
        //   139: getfield        android/support/v4/app/FragmentActivity.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //   142: getfield        android/support/v4/app/LoaderManagerImpl.mStarted:Z
        //   145: ifne            155
        //   148: aload_0        
        //   149: getfield        android/support/v4/app/FragmentActivity.mLoaderManager:Landroid/support/v4/app/LoaderManagerImpl;
        //   152: invokevirtual   android/support/v4/app/LoaderManagerImpl.doStart:()V
        //   155: aload_0        
        //   156: iconst_1       
        //   157: putfield        android/support/v4/app/FragmentActivity.mCheckedForLoaderManager:Z
        //   160: aload_0        
        //   161: getfield        android/support/v4/app/FragmentActivity.mFragments:Landroid/support/v4/app/FragmentManagerImpl;
        //   164: invokevirtual   android/support/v4/app/FragmentManagerImpl.dispatchStart:()V
        //   167: aload_0        
        //   168: getfield        android/support/v4/app/FragmentActivity.mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
        //   171: ifnull          262
        //   174: aload_0        
        //   175: getfield        android/support/v4/app/FragmentActivity.mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
        //   178: invokevirtual   android/support/v4/util/SimpleArrayMap.size:()I
        //   181: istore          11
        //   183: iload           11
        //   185: anewarray       Landroid/support/v4/app/LoaderManagerImpl;
        //   188: astore          12
        //   190: iload           11
        //   192: iconst_1       
        //   193: isub           
        //   194: istore          13
        //   196: iload           13
        //   198: iflt            228
        //   201: aload           12
        //   203: iload           13
        //   205: aload_0        
        //   206: getfield        android/support/v4/app/FragmentActivity.mAllLoaderManagers:Landroid/support/v4/util/SimpleArrayMap;
        //   209: iload           13
        //   211: invokevirtual   android/support/v4/util/SimpleArrayMap.valueAt:(I)Ljava/lang/Object;
        //   214: checkcast       Landroid/support/v4/app/LoaderManagerImpl;
        //   217: aastore        
        //   218: iload           13
        //   220: iconst_1       
        //   221: isub           
        //   222: istore          16
        //   224: iload_1        
        //   225: ifeq            294
        //   228: iconst_0       
        //   229: istore          14
        //   231: iload           14
        //   233: iload           11
        //   235: if_icmpge       262
        //   238: aload           12
        //   240: iload           14
        //   242: aaload         
        //   243: astore          15
        //   245: aload           15
        //   247: invokevirtual   android/support/v4/app/LoaderManagerImpl.finishRetain:()V
        //   250: aload           15
        //   252: invokevirtual   android/support/v4/app/LoaderManagerImpl.doReportStart:()V
        //   255: iinc            14, 1
        //   258: iload_1        
        //   259: ifeq            231
        //   262: return         
        //   263: astore_2       
        //   264: aload_2        
        //   265: athrow         
        //   266: astore_3       
        //   267: aload_3        
        //   268: athrow         
        //   269: astore          4
        //   271: aload           4
        //   273: athrow         
        //   274: astore          5
        //   276: aload           5
        //   278: athrow         
        //   279: astore          6
        //   281: aload           6
        //   283: athrow         
        //   284: astore          7
        //   286: aload           7
        //   288: athrow         
        //   289: astore          8
        //   291: aload           8
        //   293: athrow         
        //   294: iload           16
        //   296: istore          13
        //   298: goto            196
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  4      45     263    266    Landroid/content/res/Resources$NotFoundException;
        //  45     66     266    269    Landroid/content/res/Resources$NotFoundException;
        //  71     82     269    274    Landroid/content/res/Resources$NotFoundException;
        //  87     94     274    279    Landroid/content/res/Resources$NotFoundException;
        //  98     104    279    284    Landroid/content/res/Resources$NotFoundException;
        //  109    133    284    289    Landroid/content/res/Resources$NotFoundException;
        //  138    155    289    294    Landroid/content/res/Resources$NotFoundException;
        //  267    269    269    274    Landroid/content/res/Resources$NotFoundException;
        //  271    274    274    279    Landroid/content/res/Resources$NotFoundException;
        //  276    279    279    284    Landroid/content/res/Resources$NotFoundException;
        //  281    284    284    289    Landroid/content/res/Resources$NotFoundException;
        //  286    289    289    294    Landroid/content/res/Resources$NotFoundException;
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
    
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        this.mHandler.sendEmptyMessage(1);
        this.mFragments.dispatchStop();
    }
    
    public void setEnterSharedElementCallback(final SharedElementCallback sharedElementCallback) {
        ActivityCompat.setEnterSharedElementCallback(this, sharedElementCallback);
    }
    
    public void startActivityForResult(final Intent intent, final int n) {
        if (n != -1 && (0xFFFF0000 & n) != 0x0) {
            try {
                throw new IllegalArgumentException(FragmentActivity.z[7]);
            }
            catch (Resources$NotFoundException ex) {
                throw ex;
            }
        }
        super.startActivityForResult(intent, n);
    }
    
    public void startActivityFromFragment(final Fragment fragment, final Intent intent, final int n) {
        if (n == -1) {
            try {
                super.startActivityForResult(intent, -1);
                return;
            }
            catch (Resources$NotFoundException ex) {
                throw ex;
            }
        }
        if ((0xFFFF0000 & n) != 0x0) {
            try {
                throw new IllegalArgumentException(FragmentActivity.z[12]);
            }
            catch (Resources$NotFoundException ex2) {
                throw ex2;
            }
        }
        super.startActivityForResult(intent, (1 + fragment.mIndex << 16) + (0xFFFF & n));
    }
    
    public void supportFinishAfterTransition() {
        ActivityCompat.finishAfterTransition(this);
    }
    
    public void supportInvalidateOptionsMenu() {
        try {
            if (Build$VERSION.SDK_INT >= 11) {
                ActivityCompatHoneycomb.invalidateOptionsMenu(this);
                return;
            }
        }
        catch (Resources$NotFoundException ex) {
            throw ex;
        }
        this.mOptionsMenuInvalidated = true;
    }
    
    public void supportPostponeEnterTransition() {
        ActivityCompat.postponeEnterTransition(this);
    }
    
    public void supportStartPostponedEnterTransition() {
        ActivityCompat.startPostponedEnterTransition(this);
    }
}
