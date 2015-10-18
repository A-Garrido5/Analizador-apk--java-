// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view;

import android.view.Menu;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.ContextWrapper;
import android.view.InflateException;
import android.app.Activity;
import android.content.Context;
import android.view.MenuInflater;

public class SupportMenuInflater extends MenuInflater
{
    private static final Class[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
    private static final Class[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    private static final String[] z;
    private final Object[] mActionProviderConstructorArguments;
    private final Object[] mActionViewConstructorArguments;
    private Context mContext;
    private Object mRealOwner;
    
    static {
        final String[] z2 = new String[11];
        String s = "ef\u001bJ\u001dUk\nW\t\u0010m\u0010VM_n^V\u0002S}\u0013W\u0003D";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'm';
                        break;
                    }
                    case 0: {
                        c2 = '0';
                        break;
                    }
                    case 1: {
                        c2 = '\b';
                        break;
                    }
                    case 2: {
                        c2 = '~';
                        break;
                    }
                    case 3: {
                        c2 = '2';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "]m\u0010G";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Wz\u0011G\u001d";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "]m\u0010G";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "Wz\u0011G\u001d";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "Y|\u001b_";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Y|\u001b_";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "up\u000eW\u000eDa\u0010UM]m\u0010GA\u0010o\u0011FM";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    s = "]m\u0010G";
                    n = 7;
                    n2 = 8;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    array = z2;
                    s = "uz\f]\u001f\u0010a\u0010T\u0001Q|\u0017\\\n\u0010e\u001b\\\u0018\u0010P3~";
                    n = 8;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "uz\f]\u001f\u0010a\u0010T\u0001Q|\u0017\\\n\u0010e\u001b\\\u0018\u0010P3~";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        ACTION_VIEW_CONSTRUCTOR_SIGNATURE = new Class[] { Context.class };
        ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    }
    
    public SupportMenuInflater(final Context mContext) {
        super(mContext);
        this.mContext = mContext;
        this.mActionViewConstructorArguments = new Object[] { mContext };
        this.mActionProviderConstructorArguments = this.mActionViewConstructorArguments;
    }
    
    static Context access$100(final SupportMenuInflater supportMenuInflater) {
        return supportMenuInflater.mContext;
    }
    
    static Class[] access$200() {
        return SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
    }
    
    static Object[] access$300(final SupportMenuInflater supportMenuInflater) {
        return supportMenuInflater.mActionProviderConstructorArguments;
    }
    
    static Object access$400(final SupportMenuInflater supportMenuInflater) {
        return supportMenuInflater.getRealOwner();
    }
    
    static Class[] access$500() {
        return SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    }
    
    static Object[] access$600(final SupportMenuInflater supportMenuInflater) {
        return supportMenuInflater.mActionViewConstructorArguments;
    }
    
    private Object findRealOwner(final Object o) {
        while (true) {
            try {
                if (o instanceof Activity) {
                    return o;
                }
            }
            catch (InflateException ex) {
                throw ex;
            }
            try {
                if (o instanceof ContextWrapper) {
                    return this.findRealOwner(((ContextWrapper)o).getBaseContext());
                }
                return o;
            }
            catch (InflateException ex2) {
                throw ex2;
            }
        }
    }
    
    private Object getRealOwner() {
        try {
            if (this.mRealOwner == null) {
                this.mRealOwner = this.findRealOwner(this.mContext);
            }
            return this.mRealOwner;
        }
        catch (InflateException ex) {
            throw ex;
        }
    }
    
    private void parseMenu(final XmlPullParser p0, final AttributeSet p1, final Menu p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v7/internal/view/WindowCallbackWrapper.a:I
        //     3: istore          4
        //     5: new             Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;
        //     8: dup            
        //     9: aload_0        
        //    10: aload_3        
        //    11: invokespecial   android/support/v7/internal/view/SupportMenuInflater$MenuState.<init>:(Landroid/support/v7/internal/view/SupportMenuInflater;Landroid/view/Menu;)V
        //    14: astore          5
        //    16: aload_1        
        //    17: invokeinterface org/xmlpull/v1/XmlPullParser.getEventType:()I
        //    22: istore          6
        //    24: iload           6
        //    26: iconst_2       
        //    27: if_icmpne       101
        //    30: aload_1        
        //    31: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //    36: astore          41
        //    38: aload           41
        //    40: getstatic       android/support/v7/internal/view/SupportMenuInflater.z:[Ljava/lang/String;
        //    43: iconst_1       
        //    44: aaload         
        //    45: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    48: ifeq            64
        //    51: aload_1        
        //    52: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //    57: istore          6
        //    59: iload           4
        //    61: ifeq            115
        //    64: new             Ljava/lang/RuntimeException;
        //    67: dup            
        //    68: new             Ljava/lang/StringBuilder;
        //    71: dup            
        //    72: invokespecial   java/lang/StringBuilder.<init>:()V
        //    75: getstatic       android/support/v7/internal/view/SupportMenuInflater.z:[Ljava/lang/String;
        //    78: bipush          7
        //    80: aaload         
        //    81: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    84: aload           41
        //    86: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    89: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    92: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //    95: athrow         
        //    96: astore          42
        //    98: aload           42
        //   100: athrow         
        //   101: aload_1        
        //   102: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //   107: istore          6
        //   109: iload           6
        //   111: iconst_1       
        //   112: if_icmpne       24
        //   115: iconst_0       
        //   116: istore          7
        //   118: aconst_null    
        //   119: astore          8
        //   121: iconst_0       
        //   122: istore          9
        //   124: iload           7
        //   126: ifne            173
        //   129: iload           6
        //   131: tableswitch {
        //                2: 482
        //                3: 174
        //                4: 554
        //          default: 156
        //        }
        //   156: iload           7
        //   158: istore          24
        //   160: aload_1        
        //   161: invokeinterface org/xmlpull/v1/XmlPullParser.next:()I
        //   166: istore          25
        //   168: iload           4
        //   170: ifeq            565
        //   173: return         
        //   174: iload           9
        //   176: ifeq            184
        //   179: iload           4
        //   181: ifeq            156
        //   184: aload_1        
        //   185: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //   190: astore          10
        //   192: aload           10
        //   194: getstatic       android/support/v7/internal/view/SupportMenuInflater.z:[Ljava/lang/String;
        //   197: iconst_2       
        //   198: aaload         
        //   199: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   202: istore          38
        //   204: iload           38
        //   206: ifeq            220
        //   209: aload           5
        //   211: aload_2        
        //   212: invokevirtual   android/support/v7/internal/view/SupportMenuInflater$MenuState.readGroup:(Landroid/util/AttributeSet;)V
        //   215: iload           4
        //   217: ifeq            156
        //   220: aload           10
        //   222: getstatic       android/support/v7/internal/view/SupportMenuInflater.z:[Ljava/lang/String;
        //   225: bipush          6
        //   227: aaload         
        //   228: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   231: istore          39
        //   233: iload           39
        //   235: ifeq            249
        //   238: aload           5
        //   240: aload_2        
        //   241: invokevirtual   android/support/v7/internal/view/SupportMenuInflater$MenuState.readItem:(Landroid/util/AttributeSet;)V
        //   244: iload           4
        //   246: ifeq            156
        //   249: aload           10
        //   251: getstatic       android/support/v7/internal/view/SupportMenuInflater.z:[Ljava/lang/String;
        //   254: iconst_3       
        //   255: aaload         
        //   256: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   259: istore          40
        //   261: iload           40
        //   263: ifeq            282
        //   266: aload_0        
        //   267: aload_1        
        //   268: aload_2        
        //   269: aload           5
        //   271: invokevirtual   android/support/v7/internal/view/SupportMenuInflater$MenuState.addSubMenuItem:()Landroid/view/SubMenu;
        //   274: invokespecial   android/support/v7/internal/view/SupportMenuInflater.parseMenu:(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
        //   277: iload           4
        //   279: ifeq            156
        //   282: iload           4
        //   284: ifeq            540
        //   287: iconst_1       
        //   288: istore          11
        //   290: aload_1        
        //   291: invokeinterface org/xmlpull/v1/XmlPullParser.getName:()Ljava/lang/String;
        //   296: astore          12
        //   298: iload           11
        //   300: ifeq            355
        //   303: aload           12
        //   305: aload           10
        //   307: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   310: istore          33
        //   312: iload           33
        //   314: ifeq            355
        //   317: iload           7
        //   319: istore          24
        //   321: aconst_null    
        //   322: astore          8
        //   324: iconst_0       
        //   325: istore          9
        //   327: goto            160
        //   330: astore          34
        //   332: aload           34
        //   334: athrow         
        //   335: astore          35
        //   337: aload           35
        //   339: athrow         
        //   340: astore          36
        //   342: aload           36
        //   344: athrow         
        //   345: astore          37
        //   347: aload           37
        //   349: athrow         
        //   350: astore          32
        //   352: aload           32
        //   354: athrow         
        //   355: aload           12
        //   357: getstatic       android/support/v7/internal/view/SupportMenuInflater.z:[Ljava/lang/String;
        //   360: iconst_4       
        //   361: aaload         
        //   362: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   365: istore          21
        //   367: iload           21
        //   369: ifeq            382
        //   372: aload           5
        //   374: invokevirtual   android/support/v7/internal/view/SupportMenuInflater$MenuState.resetGroup:()V
        //   377: iload           4
        //   379: ifeq            594
        //   382: aload           12
        //   384: getstatic       android/support/v7/internal/view/SupportMenuInflater.z:[Ljava/lang/String;
        //   387: iconst_5       
        //   388: aaload         
        //   389: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   392: istore          22
        //   394: iload           22
        //   396: ifeq            459
        //   399: aload           5
        //   401: invokevirtual   android/support/v7/internal/view/SupportMenuInflater$MenuState.hasAddedItem:()Z
        //   404: istore          28
        //   406: iload           28
        //   408: ifne            594
        //   411: aload           5
        //   413: invokestatic    android/support/v7/internal/view/SupportMenuInflater$MenuState.access$000:(Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;)Landroid/support/v4/view/ActionProvider;
        //   416: astore          29
        //   418: aload           29
        //   420: ifnull          449
        //   423: aload           5
        //   425: invokestatic    android/support/v7/internal/view/SupportMenuInflater$MenuState.access$000:(Landroid/support/v7/internal/view/SupportMenuInflater$MenuState;)Landroid/support/v4/view/ActionProvider;
        //   428: invokevirtual   android/support/v4/view/ActionProvider.hasSubMenu:()Z
        //   431: istore          30
        //   433: iload           30
        //   435: ifeq            449
        //   438: aload           5
        //   440: invokevirtual   android/support/v7/internal/view/SupportMenuInflater$MenuState.addSubMenuItem:()Landroid/view/SubMenu;
        //   443: pop            
        //   444: iload           4
        //   446: ifeq            594
        //   449: aload           5
        //   451: invokevirtual   android/support/v7/internal/view/SupportMenuInflater$MenuState.addItem:()V
        //   454: iload           4
        //   456: ifeq            594
        //   459: aload           12
        //   461: getstatic       android/support/v7/internal/view/SupportMenuInflater.z:[Ljava/lang/String;
        //   464: bipush          8
        //   466: aaload         
        //   467: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   470: istore          23
        //   472: iload           23
        //   474: ifeq            594
        //   477: iload           4
        //   479: ifeq            580
        //   482: new             Ljava/lang/RuntimeException;
        //   485: dup            
        //   486: getstatic       android/support/v7/internal/view/SupportMenuInflater.z:[Ljava/lang/String;
        //   489: iconst_0       
        //   490: aaload         
        //   491: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   494: athrow         
        //   495: astore          27
        //   497: aload           27
        //   499: athrow         
        //   500: astore          13
        //   502: aload           13
        //   504: athrow         
        //   505: astore          14
        //   507: aload           14
        //   509: athrow         
        //   510: astore          15
        //   512: aload           15
        //   514: athrow         
        //   515: astore          16
        //   517: aload           16
        //   519: athrow         
        //   520: astore          17
        //   522: aload           17
        //   524: athrow         
        //   525: astore          18
        //   527: aload           18
        //   529: athrow         
        //   530: astore          19
        //   532: aload           19
        //   534: athrow         
        //   535: astore          20
        //   537: aload           20
        //   539: athrow         
        //   540: aload           10
        //   542: astore          8
        //   544: iconst_1       
        //   545: istore          9
        //   547: iload           7
        //   549: istore          24
        //   551: goto            160
        //   554: aload           8
        //   556: astore          10
        //   558: iload           9
        //   560: istore          11
        //   562: goto            290
        //   565: iload           24
        //   567: istore          26
        //   569: iload           25
        //   571: istore          6
        //   573: iload           26
        //   575: istore          7
        //   577: goto            124
        //   580: iload           11
        //   582: istore          9
        //   584: aload           10
        //   586: astore          8
        //   588: iconst_1       
        //   589: istore          24
        //   591: goto            160
        //   594: iload           11
        //   596: istore          9
        //   598: aload           10
        //   600: astore          8
        //   602: iload           7
        //   604: istore          24
        //   606: goto            160
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  64     96     96     101    Landroid/view/InflateException;
        //  192    204    330    335    Landroid/view/InflateException;
        //  209    215    335    340    Landroid/view/InflateException;
        //  220    233    340    345    Landroid/view/InflateException;
        //  238    244    345    350    Landroid/view/InflateException;
        //  249    261    345    350    Landroid/view/InflateException;
        //  303    312    350    355    Landroid/view/InflateException;
        //  332    335    335    340    Landroid/view/InflateException;
        //  337    340    340    345    Landroid/view/InflateException;
        //  342    345    345    350    Landroid/view/InflateException;
        //  355    367    500    505    Landroid/view/InflateException;
        //  372    377    505    510    Landroid/view/InflateException;
        //  382    394    510    515    Landroid/view/InflateException;
        //  399    406    515    520    Landroid/view/InflateException;
        //  411    418    520    525    Landroid/view/InflateException;
        //  423    433    525    530    Landroid/view/InflateException;
        //  438    444    530    535    Landroid/view/InflateException;
        //  449    454    535    540    Landroid/view/InflateException;
        //  459    472    535    540    Landroid/view/InflateException;
        //  482    495    495    500    Landroid/view/InflateException;
        //  502    505    505    510    Landroid/view/InflateException;
        //  507    510    510    515    Landroid/view/InflateException;
        //  512    515    515    520    Landroid/view/InflateException;
        //  517    520    520    525    Landroid/view/InflateException;
        //  522    525    525    530    Landroid/view/InflateException;
        //  527    530    530    535    Landroid/view/InflateException;
        //  532    535    535    540    Landroid/view/InflateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 277, Size: 277
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
    
    public void inflate(final int p0, final Menu p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_2        
        //     1: instanceof      Landroid/support/v4/internal/view/SupportMenu;
        //     4: ifne            17
        //     7: aload_0        
        //     8: iload_1        
        //     9: aload_2        
        //    10: invokespecial   android/view/MenuInflater.inflate:(ILandroid/view/Menu;)V
        //    13: return         
        //    14: astore_3       
        //    15: aload_3        
        //    16: athrow         
        //    17: aconst_null    
        //    18: astore          4
        //    20: aload_0        
        //    21: getfield        android/support/v7/internal/view/SupportMenuInflater.mContext:Landroid/content/Context;
        //    24: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    27: iload_1        
        //    28: invokevirtual   android/content/res/Resources.getLayout:(I)Landroid/content/res/XmlResourceParser;
        //    31: astore          4
        //    33: aload_0        
        //    34: aload           4
        //    36: aload           4
        //    38: invokestatic    android/util/Xml.asAttributeSet:(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
        //    41: aload_2        
        //    42: invokespecial   android/support/v7/internal/view/SupportMenuInflater.parseMenu:(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
        //    45: aload           4
        //    47: ifnull          13
        //    50: aload           4
        //    52: invokeinterface android/content/res/XmlResourceParser.close:()V
        //    57: return         
        //    58: astore          8
        //    60: new             Landroid/view/InflateException;
        //    63: dup            
        //    64: getstatic       android/support/v7/internal/view/SupportMenuInflater.z:[Ljava/lang/String;
        //    67: bipush          9
        //    69: aaload         
        //    70: aload           8
        //    72: invokespecial   android/view/InflateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    75: athrow         
        //    76: astore          6
        //    78: aload           4
        //    80: ifnull          90
        //    83: aload           4
        //    85: invokeinterface android/content/res/XmlResourceParser.close:()V
        //    90: aload           6
        //    92: athrow         
        //    93: astore          5
        //    95: new             Landroid/view/InflateException;
        //    98: dup            
        //    99: getstatic       android/support/v7/internal/view/SupportMenuInflater.z:[Ljava/lang/String;
        //   102: bipush          10
        //   104: aaload         
        //   105: aload           5
        //   107: invokespecial   android/view/InflateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   110: athrow         
        //   111: astore          7
        //   113: aload           7
        //   115: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                   
        //  -----  -----  -----  -----  ---------------------------------------
        //  0      13     14     17     Lorg/xmlpull/v1/XmlPullParserException;
        //  20     45     58     76     Lorg/xmlpull/v1/XmlPullParserException;
        //  20     45     93     111    Ljava/io/IOException;
        //  20     45     76     93     Any
        //  60     76     76     93     Any
        //  83     90     111    116    Lorg/xmlpull/v1/XmlPullParserException;
        //  95     111    76     93     Any
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
}
