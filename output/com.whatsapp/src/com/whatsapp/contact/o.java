// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.contact;

import android.telephony.PhoneNumberUtils;
import android.content.Context;
import android.provider.ContactsContract$CommonDataKinds$Phone;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import android.database.Cursor;

public class o
{
    private static final String[] c;
    private static boolean d;
    private static final String[] j;
    private static final String[] l;
    private static final String[] z;
    private final String a;
    private boolean b;
    private final long e;
    private final String f;
    private final String g;
    private final String h;
    private String i;
    private final int k;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_0       
        //     2: bipush          10
        //     4: anewarray       Ljava/lang/String;
        //     7: astore_1       
        //     8: ldc             "(\u0000Z0\u001ew\u000fP*\u0018-\u001aF1\tw\u0019@;\t!GP0\u001f"
        //    10: astore_2       
        //    11: iconst_m1      
        //    12: istore_3       
        //    13: aload_1        
        //    14: astore          4
        //    16: aload_1        
        //    17: astore          5
        //    19: iconst_0       
        //    20: istore          6
        //    22: aload_2        
        //    23: invokevirtual   java/lang/String.toCharArray:()[C
        //    26: astore          7
        //    28: aload           7
        //    30: arraylength    
        //    31: istore          8
        //    33: iconst_0       
        //    34: istore          9
        //    36: iload           8
        //    38: iload           9
        //    40: if_icmpgt       395
        //    43: new             Ljava/lang/String;
        //    46: dup            
        //    47: aload           7
        //    49: invokespecial   java/lang/String.<init>:([C)V
        //    52: invokevirtual   java/lang/String.intern:()Ljava/lang/String;
        //    55: astore          12
        //    57: iload_3        
        //    58: tableswitch {
        //                0: 174
        //                1: 196
        //                2: 218
        //                3: 240
        //                4: 262
        //                5: 285
        //                6: 309
        //                7: 333
        //                8: 357
        //                9: 485
        //               10: 508
        //               11: 531
        //               12: 554
        //               13: 577
        //               14: 616
        //               15: 639
        //               16: 662
        //               17: 685
        //               18: 708
        //               19: 731
        //          default: 152
        //        }
        //   152: aload           4
        //   154: iload           6
        //   156: aload           12
        //   158: aastore        
        //   159: ldc             "(\u0000Z0\u001ew\u000fP*\u0018-\u001aF1\tw\u0019@;\t!GF*\u001a*\u001c"
        //   161: astore_2       
        //   162: iload_0        
        //   163: istore          6
        //   165: aload           5
        //   167: astore          4
        //   169: iconst_0       
        //   170: istore_3       
        //   171: goto            22
        //   174: aload           4
        //   176: iload           6
        //   178: aload           12
        //   180: aastore        
        //   181: ldc             "}\u001b\u0010-T}\f"
        //   183: astore_2       
        //   184: iconst_2       
        //   185: istore          6
        //   187: aload           5
        //   189: astore          4
        //   191: iload_0        
        //   192: istore_3       
        //   193: goto            22
        //   196: aload           4
        //   198: iload           6
        //   200: aload           12
        //   202: aastore        
        //   203: ldc             "}\u001b\u0010-T}\f"
        //   205: astore_2       
        //   206: iconst_3       
        //   207: istore          6
        //   209: aload           5
        //   211: astore          4
        //   213: iconst_2       
        //   214: istore_3       
        //   215: goto            22
        //   218: aload           4
        //   220: iload           6
        //   222: aload           12
        //   224: aastore        
        //   225: ldc             "<\tA?JxU\u0015a"
        //   227: astore_2       
        //   228: iconst_4       
        //   229: istore          6
        //   231: aload           5
        //   233: astore          4
        //   235: iconst_3       
        //   236: istore_3       
        //   237: goto            22
        //   240: aload           4
        //   242: iload           6
        //   244: aload           12
        //   246: aastore        
        //   247: iconst_5       
        //   248: istore          6
        //   250: aload           5
        //   252: astore          4
        //   254: ldc             "<\tA?B"
        //   256: astore_2       
        //   257: iconst_4       
        //   258: istore_3       
        //   259: goto            22
        //   262: aload           4
        //   264: iload           6
        //   266: aload           12
        //   268: aastore        
        //   269: bipush          6
        //   271: istore          6
        //   273: ldc             "<\tA?L"
        //   275: astore_2       
        //   276: iconst_5       
        //   277: istore_3       
        //   278: aload           5
        //   280: astore          4
        //   282: goto            22
        //   285: aload           4
        //   287: iload           6
        //   289: aload           12
        //   291: aastore        
        //   292: bipush          7
        //   294: istore          6
        //   296: ldc             ".\u0006Qp\u001a6\fG1\u0012<FV+\t+\u0007Gp\u0012,\rXq\u00159\u0005P"
        //   298: astore_2       
        //   299: bipush          6
        //   301: istore_3       
        //   302: aload           5
        //   304: astore          4
        //   306: goto            22
        //   309: aload           4
        //   311: iload           6
        //   313: aload           12
        //   315: aastore        
        //   316: bipush          8
        //   318: istore          6
        //   320: ldc             "*\tB\u0001\u00187\u0006A?\u0018,7\\:[eH\n~:\u0016,\u00153\u00125\rA'\u000b=H\b~D"
        //   322: astore_2       
        //   323: bipush          7
        //   325: istore_3       
        //   326: aload           5
        //   328: astore          4
        //   330: goto            22
        //   333: aload           4
        //   335: iload           6
        //   337: aload           12
        //   339: aastore        
        //   340: bipush          9
        //   342: istore          6
        //   344: ldc             "6\u001dX<\u001e*HX+\b,H[1\u000fx\nP~\u0015-\u0004Y"
        //   346: astore_2       
        //   347: bipush          8
        //   349: istore_3       
        //   350: aload           5
        //   352: astore          4
        //   354: goto            22
        //   357: aload           4
        //   359: iload           6
        //   361: aload           12
        //   363: aastore        
        //   364: aload           5
        //   366: putstatic       com/whatsapp/contact/o.z:[Ljava/lang/String;
        //   369: iconst_5       
        //   370: anewarray       Ljava/lang/String;
        //   373: astore          18
        //   375: ldc             "*\tB\u0001\u00187\u0006A?\u0018,7\\:"
        //   377: astore_2       
        //   378: bipush          9
        //   380: istore_3       
        //   381: aload           18
        //   383: astore          4
        //   385: aload           18
        //   387: astore          5
        //   389: iconst_0       
        //   390: istore          6
        //   392: goto            22
        //   395: aload           7
        //   397: iload           9
        //   399: caload         
        //   400: istore          10
        //   402: iload           9
        //   404: iconst_5       
        //   405: irem           
        //   406: tableswitch {
        //                0: 457
        //                1: 464
        //                2: 471
        //                3: 478
        //          default: 436
        //        }
        //   436: bipush          123
        //   438: istore          11
        //   440: aload           7
        //   442: iload           9
        //   444: iload           11
        //   446: iload           10
        //   448: ixor           
        //   449: i2c            
        //   450: castore        
        //   451: iinc            9, 1
        //   454: goto            36
        //   457: bipush          88
        //   459: istore          11
        //   461: goto            440
        //   464: bipush          104
        //   466: istore          11
        //   468: goto            440
        //   471: bipush          53
        //   473: istore          11
        //   475: goto            440
        //   478: bipush          94
        //   480: istore          11
        //   482: goto            440
        //   485: aload           4
        //   487: iload           6
        //   489: aload           12
        //   491: aastore        
        //   492: ldc             "<\u0001F.\u00179\u0011j0\u001a5\r"
        //   494: astore_2       
        //   495: bipush          10
        //   497: istore_3       
        //   498: iload_0        
        //   499: istore          6
        //   501: aload           5
        //   503: astore          4
        //   505: goto            22
        //   508: aload           4
        //   510: iload           6
        //   512: aload           12
        //   514: aastore        
        //   515: ldc             "<\tA?J"
        //   517: astore_2       
        //   518: bipush          11
        //   520: istore_3       
        //   521: iconst_2       
        //   522: istore          6
        //   524: aload           5
        //   526: astore          4
        //   528: goto            22
        //   531: aload           4
        //   533: iload           6
        //   535: aload           12
        //   537: aastore        
        //   538: ldc             "<\tA?I"
        //   540: astore_2       
        //   541: bipush          12
        //   543: istore_3       
        //   544: iconst_3       
        //   545: istore          6
        //   547: aload           5
        //   549: astore          4
        //   551: goto            22
        //   554: aload           4
        //   556: iload           6
        //   558: aload           12
        //   560: aastore        
        //   561: ldc             "<\tA?H"
        //   563: astore_2       
        //   564: bipush          13
        //   566: istore_3       
        //   567: iconst_4       
        //   568: istore          6
        //   570: aload           5
        //   572: astore          4
        //   574: goto            22
        //   577: aload           4
        //   579: iload           6
        //   581: aload           12
        //   583: aastore        
        //   584: aload           5
        //   586: putstatic       com/whatsapp/contact/o.j:[Ljava/lang/String;
        //   589: bipush          6
        //   591: anewarray       Ljava/lang/String;
        //   594: astore          17
        //   596: ldc             "*\tB\u0001\u00187\u0006A?\u0018,7\\:"
        //   598: astore_2       
        //   599: bipush          14
        //   601: istore_3       
        //   602: aload           17
        //   604: astore          4
        //   606: aload           17
        //   608: astore          5
        //   610: iconst_0       
        //   611: istore          6
        //   613: goto            22
        //   616: aload           4
        //   618: iload           6
        //   620: aload           12
        //   622: aastore        
        //   623: ldc             "<\u0001F.\u00179\u0011j0\u001a5\r"
        //   625: astore_2       
        //   626: bipush          15
        //   628: istore_3       
        //   629: iload_0        
        //   630: istore          6
        //   632: aload           5
        //   634: astore          4
        //   636: goto            22
        //   639: aload           4
        //   641: iload           6
        //   643: aload           12
        //   645: aastore        
        //   646: ldc             "<\tA?J"
        //   648: astore_2       
        //   649: bipush          16
        //   651: istore_3       
        //   652: iconst_2       
        //   653: istore          6
        //   655: aload           5
        //   657: astore          4
        //   659: goto            22
        //   662: aload           4
        //   664: iload           6
        //   666: aload           12
        //   668: aastore        
        //   669: ldc             "<\tA?I"
        //   671: astore_2       
        //   672: bipush          17
        //   674: istore_3       
        //   675: iconst_3       
        //   676: istore          6
        //   678: aload           5
        //   680: astore          4
        //   682: goto            22
        //   685: aload           4
        //   687: iload           6
        //   689: aload           12
        //   691: aastore        
        //   692: ldc             "<\tA?H"
        //   694: astore_2       
        //   695: bipush          18
        //   697: istore_3       
        //   698: iconst_4       
        //   699: istore          6
        //   701: aload           5
        //   703: astore          4
        //   705: goto            22
        //   708: aload           4
        //   710: iload           6
        //   712: aload           12
        //   714: aastore        
        //   715: iconst_5       
        //   716: istore          6
        //   718: ldc             "+\u0007G*$3\rL"
        //   720: astore_2       
        //   721: bipush          19
        //   723: istore_3       
        //   724: aload           5
        //   726: astore          4
        //   728: goto            22
        //   731: aload           4
        //   733: iload           6
        //   735: aload           12
        //   737: aastore        
        //   738: aload           5
        //   740: putstatic       com/whatsapp/contact/o.l:[Ljava/lang/String;
        //   743: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   746: istore          14
        //   748: iload           14
        //   750: bipush          11
        //   752: if_icmplt       783
        //   755: iload_0        
        //   756: putstatic       com/whatsapp/contact/o.d:Z
        //   759: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   762: bipush          11
        //   764: if_icmplt       793
        //   767: getstatic       com/whatsapp/contact/o.l:[Ljava/lang/String;
        //   770: astore          16
        //   772: aload           16
        //   774: putstatic       com/whatsapp/contact/o.c:[Ljava/lang/String;
        //   777: return         
        //   778: astore          13
        //   780: aload           13
        //   782: athrow         
        //   783: iconst_0       
        //   784: istore_0       
        //   785: goto            755
        //   788: astore          15
        //   790: aload           15
        //   792: athrow         
        //   793: getstatic       com/whatsapp/contact/o.j:[Ljava/lang/String;
        //   796: astore          16
        //   798: goto            772
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  369    375    778    783    Ljava/lang/NullPointerException;
        //  485    492    778    783    Ljava/lang/NullPointerException;
        //  508    515    778    783    Ljava/lang/NullPointerException;
        //  531    538    778    783    Ljava/lang/NullPointerException;
        //  554    561    778    783    Ljava/lang/NullPointerException;
        //  577    596    778    783    Ljava/lang/NullPointerException;
        //  616    623    778    783    Ljava/lang/NullPointerException;
        //  639    646    778    783    Ljava/lang/NullPointerException;
        //  662    669    778    783    Ljava/lang/NullPointerException;
        //  685    692    778    783    Ljava/lang/NullPointerException;
        //  708    715    778    783    Ljava/lang/NullPointerException;
        //  731    748    778    783    Ljava/lang/NullPointerException;
        //  755    772    788    793    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0755:
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
    
    private o(final long e, final String f, final String a, final int k, final String g, final String s) {
        if (a == null) {
            throw new NullPointerException(o.z[9]);
        }
        try {
            this.e = e;
            this.f = f;
            this.a = a;
            this.k = k;
            this.g = g;
            this.h = s;
            this.b = o.d;
            if (o.d) {
                this.i = s;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
    
    static Cursor a(final b b, final String s) {
        Log.i(o.z[1]);
        final Cursor query = App.i.query(ContactsContract$CommonDataKinds$Phone.CONTENT_URI, o.c, b.getWhereClause(), b.getWhereArgs(), (String)null);
        try {
            Log.i(o.z[0]);
            if (query == null) {
                return query;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        Log.c(o.z[2], null, new Object[] { s, b.name(), query.getCount() });
        return query;
    }
    
    static Cursor a(final String s, final String s2) {
        final Cursor query = App.i.query(ContactsContract$CommonDataKinds$Phone.CONTENT_URI, o.c, o.z[4], new String[] { s }, (String)null);
        if (query == null) {
            return query;
        }
        Log.c(o.z[3], null, new Object[] { s2, s, query.getCount() });
        return query;
    }
    
    static o a(final Context context, final String s, final String s2) {
        final String stripSeparators = PhoneNumberUtils.stripSeparators(s2);
        try {
            if (!PhoneNumberUtils.isGlobalPhoneNumber(stripSeparators)) {
                return null;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return new o(-2L, s, stripSeparators, 0, context.getString(2131230937), null);
    }
    
    static o a(final Cursor cursor) {
        final String stripSeparators = PhoneNumberUtils.stripSeparators(cursor.getString(2));
        try {
            if (!PhoneNumberUtils.isGlobalPhoneNumber(stripSeparators)) {
                return null;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        try {
            final long long1 = cursor.getLong(0);
            final String string = cursor.getString(1);
            final int int1 = cursor.getInt(3);
            final String string2 = cursor.getString(4);
            final boolean d = o.d;
            String string3 = null;
            if (d) {
                string3 = cursor.getString(5);
            }
            return new o(long1, string, stripSeparators, int1, string2, string3);
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
    }
    
    public static boolean a(final String s) {
        try {
            if (5 > s.length()) {
                return false;
            }
            final String s2 = s;
            final int n = s2.length();
            final int n2 = 20;
            if (n <= n2) {
                return true;
            }
            return false;
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        try {
            final String s2 = s;
            final int n = s2.length();
            final int n2 = 20;
            if (n <= n2) {
                return true;
            }
        }
        catch (NullPointerException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public String a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/contact/f.f:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/contact/o.b:Z
        //     8: ifeq            23
        //    11: aload_0        
        //    12: getfield        com/whatsapp/contact/o.i:Ljava/lang/String;
        //    15: astore          26
        //    17: aload           26
        //    19: areturn        
        //    20: astore_2       
        //    21: aload_2        
        //    22: athrow         
        //    23: iconst_2       
        //    24: anewarray       Ljava/lang/String;
        //    27: astore_3       
        //    28: aload_3        
        //    29: iconst_0       
        //    30: getstatic       com/whatsapp/contact/o.z:[Ljava/lang/String;
        //    33: bipush          6
        //    35: aaload         
        //    36: aastore        
        //    37: aload_3        
        //    38: iconst_1       
        //    39: getstatic       com/whatsapp/contact/o.z:[Ljava/lang/String;
        //    42: iconst_5       
        //    43: aaload         
        //    44: aastore        
        //    45: getstatic       com/whatsapp/App.i:Landroid/content/ContentResolver;
        //    48: astore          7
        //    50: getstatic       android/provider/ContactsContract$Data.CONTENT_URI:Landroid/net/Uri;
        //    53: astore          8
        //    55: getstatic       com/whatsapp/contact/o.z:[Ljava/lang/String;
        //    58: bipush          8
        //    60: aaload         
        //    61: astore          9
        //    63: iconst_2       
        //    64: anewarray       Ljava/lang/String;
        //    67: astore          10
        //    69: aload           10
        //    71: iconst_0       
        //    72: aload_0        
        //    73: invokevirtual   com/whatsapp/contact/o.g:()J
        //    76: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //    79: aastore        
        //    80: aload           10
        //    82: iconst_1       
        //    83: getstatic       com/whatsapp/contact/o.z:[Ljava/lang/String;
        //    86: bipush          7
        //    88: aaload         
        //    89: aastore        
        //    90: aload           7
        //    92: aload           8
        //    94: aload_3        
        //    95: aload           9
        //    97: aload           10
        //    99: aconst_null    
        //   100: invokevirtual   android/content/ContentResolver.query:(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   103: astore          11
        //   105: aload           11
        //   107: astore          5
        //   109: aload           5
        //   111: ifnull          246
        //   114: aload_0        
        //   115: iconst_1       
        //   116: putfield        com/whatsapp/contact/o.b:Z
        //   119: aload           5
        //   121: invokeinterface android/database/Cursor.moveToNext:()Z
        //   126: istore          14
        //   128: iload           14
        //   130: ifeq            246
        //   133: aload           5
        //   135: iconst_0       
        //   136: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   141: astore          15
        //   143: aload           5
        //   145: iconst_1       
        //   146: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   151: astore          16
        //   153: aload           16
        //   155: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   158: ifne            206
        //   161: aload           15
        //   163: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   166: istore          25
        //   168: iload           25
        //   170: ifne            206
        //   173: aload_0        
        //   174: new             Ljava/lang/StringBuilder;
        //   177: dup            
        //   178: invokespecial   java/lang/StringBuilder.<init>:()V
        //   181: aload           16
        //   183: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   186: ldc             " "
        //   188: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   191: aload           15
        //   193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   196: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   199: putfield        com/whatsapp/contact/o.i:Ljava/lang/String;
        //   202: iload_1        
        //   203: ifeq            246
        //   206: aload           16
        //   208: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   211: istore          23
        //   213: iload           23
        //   215: ifne            228
        //   218: aload_0        
        //   219: aload           16
        //   221: putfield        com/whatsapp/contact/o.i:Ljava/lang/String;
        //   224: iload_1        
        //   225: ifeq            246
        //   228: aload           15
        //   230: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   233: istore          24
        //   235: iload           24
        //   237: ifne            246
        //   240: aload_0        
        //   241: aload           15
        //   243: putfield        com/whatsapp/contact/o.i:Ljava/lang/String;
        //   246: aload           5
        //   248: ifnull          258
        //   251: aload           5
        //   253: invokeinterface android/database/Cursor.close:()V
        //   258: aload_0        
        //   259: getfield        com/whatsapp/contact/o.i:Ljava/lang/String;
        //   262: areturn        
        //   263: astore          13
        //   265: aload           13
        //   267: athrow         
        //   268: astore          4
        //   270: aload           5
        //   272: ifnull          282
        //   275: aload           5
        //   277: invokeinterface android/database/Cursor.close:()V
        //   282: aload           4
        //   284: athrow         
        //   285: astore          17
        //   287: aload           17
        //   289: athrow         
        //   290: astore          18
        //   292: aload           18
        //   294: athrow         
        //   295: astore          19
        //   297: aload           19
        //   299: athrow         
        //   300: astore          20
        //   302: aload           20
        //   304: athrow         
        //   305: astore          21
        //   307: aload           21
        //   309: athrow         
        //   310: astore          22
        //   312: aload           22
        //   314: athrow         
        //   315: astore          12
        //   317: aload           12
        //   319: athrow         
        //   320: astore          6
        //   322: aload           6
        //   324: athrow         
        //   325: astore          4
        //   327: aconst_null    
        //   328: astore          5
        //   330: goto            270
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  4      17     20     23     Ljava/lang/NullPointerException;
        //  45     105    325    333    Any
        //  114    128    263    268    Ljava/lang/NullPointerException;
        //  114    128    268    270    Any
        //  133    153    268    270    Any
        //  153    168    285    290    Ljava/lang/NullPointerException;
        //  153    168    268    270    Any
        //  173    202    290    295    Ljava/lang/NullPointerException;
        //  173    202    268    270    Any
        //  206    213    295    300    Ljava/lang/NullPointerException;
        //  206    213    268    270    Any
        //  218    224    300    305    Ljava/lang/NullPointerException;
        //  218    224    268    270    Any
        //  228    235    305    310    Ljava/lang/NullPointerException;
        //  228    235    268    270    Any
        //  240    246    310    315    Ljava/lang/NullPointerException;
        //  240    246    268    270    Any
        //  251    258    315    320    Ljava/lang/NullPointerException;
        //  265    268    268    270    Any
        //  275    282    320    325    Ljava/lang/NullPointerException;
        //  287    290    290    295    Ljava/lang/NullPointerException;
        //  287    290    268    270    Any
        //  292    295    295    300    Ljava/lang/NullPointerException;
        //  292    295    268    270    Any
        //  297    300    300    305    Ljava/lang/NullPointerException;
        //  297    300    268    270    Any
        //  302    305    305    310    Ljava/lang/NullPointerException;
        //  302    305    268    270    Any
        //  307    310    310    315    Ljava/lang/NullPointerException;
        //  307    310    268    270    Any
        //  312    315    268    270    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 164, Size: 164
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
    
    public String b() {
        return this.h;
    }
    
    public String c() {
        return this.f;
    }
    
    public String d() {
        return this.g;
    }
    
    public String e() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: aload_1        
        //     3: ifnonnull       8
        //     6: iconst_0       
        //     7: ireturn        
        //     8: aload_0        
        //     9: aload_1        
        //    10: if_acmpne       15
        //    13: iload_2        
        //    14: ireturn        
        //    15: aload_0        
        //    16: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    19: astore          4
        //    21: aload_1        
        //    22: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    25: astore          5
        //    27: aload           4
        //    29: aload           5
        //    31: if_acmpne       6
        //    34: aload_1        
        //    35: checkcast       Lcom/whatsapp/contact/o;
        //    38: astore          6
        //    40: aload_0        
        //    41: invokevirtual   com/whatsapp/contact/o.g:()J
        //    44: lstore          13
        //    46: aload           6
        //    48: invokevirtual   com/whatsapp/contact/o.g:()J
        //    51: lstore          15
        //    53: lload           13
        //    55: lload           15
        //    57: lcmp           
        //    58: ifne            192
        //    61: aload_0        
        //    62: invokevirtual   com/whatsapp/contact/o.c:()Ljava/lang/String;
        //    65: aload           6
        //    67: invokevirtual   com/whatsapp/contact/o.c:()Ljava/lang/String;
        //    70: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //    73: istore          17
        //    75: iload           17
        //    77: ifeq            192
        //    80: aload_0        
        //    81: invokevirtual   com/whatsapp/contact/o.e:()Ljava/lang/String;
        //    84: aload           6
        //    86: invokevirtual   com/whatsapp/contact/o.e:()Ljava/lang/String;
        //    89: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //    92: istore          18
        //    94: iload           18
        //    96: ifeq            192
        //    99: aload_0        
        //   100: invokevirtual   com/whatsapp/contact/o.f:()I
        //   103: istore          19
        //   105: aload           6
        //   107: invokevirtual   com/whatsapp/contact/o.f:()I
        //   110: istore          20
        //   112: iload           19
        //   114: iload           20
        //   116: if_icmpne       192
        //   119: aload_0        
        //   120: invokevirtual   com/whatsapp/contact/o.d:()Ljava/lang/String;
        //   123: aload           6
        //   125: invokevirtual   com/whatsapp/contact/o.d:()Ljava/lang/String;
        //   128: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   131: istore          21
        //   133: iload           21
        //   135: ifeq            192
        //   138: aload_0        
        //   139: invokevirtual   com/whatsapp/contact/o.b:()Ljava/lang/String;
        //   142: aload           6
        //   144: invokevirtual   com/whatsapp/contact/o.b:()Ljava/lang/String;
        //   147: invokestatic    android/text/TextUtils.equals:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
        //   150: istore          22
        //   152: iload           22
        //   154: ifeq            192
        //   157: iload_2        
        //   158: ireturn        
        //   159: astore_3       
        //   160: aload_3        
        //   161: athrow         
        //   162: astore          7
        //   164: aload           7
        //   166: athrow         
        //   167: astore          8
        //   169: aload           8
        //   171: athrow         
        //   172: astore          9
        //   174: aload           9
        //   176: athrow         
        //   177: astore          10
        //   179: aload           10
        //   181: athrow         
        //   182: astore          11
        //   184: aload           11
        //   186: athrow         
        //   187: astore          12
        //   189: aload           12
        //   191: athrow         
        //   192: iconst_0       
        //   193: istore_2       
        //   194: goto            157
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  15     27     159    162    Ljava/lang/NullPointerException;
        //  40     53     162    167    Ljava/lang/NullPointerException;
        //  61     75     167    172    Ljava/lang/NullPointerException;
        //  80     94     172    177    Ljava/lang/NullPointerException;
        //  99     112    177    182    Ljava/lang/NullPointerException;
        //  119    133    182    187    Ljava/lang/NullPointerException;
        //  138    152    187    192    Ljava/lang/NullPointerException;
        //  164    167    167    172    Ljava/lang/NullPointerException;
        //  169    172    172    177    Ljava/lang/NullPointerException;
        //  174    177    177    182    Ljava/lang/NullPointerException;
        //  179    182    182    187    Ljava/lang/NullPointerException;
        //  184    187    187    192    Ljava/lang/NullPointerException;
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
    
    public int f() {
        return this.k;
    }
    
    public long g() {
        return this.e;
    }
    
    @Override
    public int hashCode() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/contact/f.f:Z
        //     3: istore_1       
        //     4: bipush          31
        //     6: bipush          31
        //     8: bipush          31
        //    10: iconst_0       
        //    11: aload_0        
        //    12: getfield        com/whatsapp/contact/o.e:J
        //    15: bipush          32
        //    17: lushr          
        //    18: l2i            
        //    19: iadd           
        //    20: imul           
        //    21: aload_0        
        //    22: getfield        com/whatsapp/contact/o.e:J
        //    25: l2i            
        //    26: iadd           
        //    27: imul           
        //    28: aload_0        
        //    29: getfield        com/whatsapp/contact/o.k:I
        //    32: iadd           
        //    33: imul           
        //    34: istore_2       
        //    35: aload_0        
        //    36: invokevirtual   com/whatsapp/contact/o.e:()Ljava/lang/String;
        //    39: astore          4
        //    41: aload           4
        //    43: ifnonnull       83
        //    46: iconst_0       
        //    47: istore          5
        //    49: iload           5
        //    51: iload_2        
        //    52: iadd           
        //    53: istore          6
        //    55: iload_1        
        //    56: ifeq            77
        //    59: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //    62: istore          8
        //    64: iconst_0       
        //    65: istore          9
        //    67: iload           8
        //    69: ifeq            100
        //    72: iload           9
        //    74: putstatic       com/whatsapp/DialogToastActivity.h:Z
        //    77: iload           6
        //    79: ireturn        
        //    80: astore_3       
        //    81: aload_3        
        //    82: athrow         
        //    83: aload_0        
        //    84: invokevirtual   com/whatsapp/contact/o.e:()Ljava/lang/String;
        //    87: invokevirtual   java/lang/String.hashCode:()I
        //    90: istore          5
        //    92: goto            49
        //    95: astore          7
        //    97: aload           7
        //    99: athrow         
        //   100: iconst_1       
        //   101: istore          9
        //   103: goto            72
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  35     41     80     83     Ljava/lang/NullPointerException;
        //  59     64     95     100    Ljava/lang/NullPointerException;
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
