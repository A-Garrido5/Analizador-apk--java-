// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import com.whatsapp.util.co;

class a0g extends co
{
    private static final String[] z;
    final RegisterPhone b;
    
    static {
        final String[] z2 = new String[10];
        String s = "Iw\u0006j&Ow\u0013,%S}\u000ffzXz\u0004`>Iw\bm&Os\rozU}L`:U|\u0004`!Rd\bw,";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0282:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'U';
                        break;
                    }
                    case 0: {
                        c2 = ';';
                        break;
                    }
                    case 1: {
                        c2 = '\u0012';
                        break;
                    }
                    case 2: {
                        c2 = 'a';
                        break;
                    }
                    case 3: {
                        c2 = '\u0003';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "X}\f-\"Ss\u0015p4KbOQ0\\{\u0012w0IB\tl;^<\u0002l Uf\u0013z\nX}\u0005f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Iw\u0006j&Ow\u0013,%S}\u000ffzHw\u0015m Vp\u0004q&\u0014q\u000en8RfAe4R~\u0004g";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0014|\u0014n7^`\\";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "X}\f-\"Ss\u0015p4KbOQ0\\{\u0012w0IB\tl;^<\u0011k:Uw>m Vp\u0004q";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "Iw\u0006j&Ow\u0013,%S}\u000ffzXq\\";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "gV";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "gV";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "Iw\u0006j&Ow\u0013,%S}\u000ffzXz\u0004`>]}\u0013q0R|\u0012w4W~";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "Iw\u0006j&Ow\u0013s=T|\u0004,6X2\u0007b<Ww\u0005#!I{\fO0Zv\bm2aw\u0013lu]`\u000enux}\u0014m!Ik1k:Uw(m3T";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    break Label_0282;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    a0g(final RegisterPhone b) {
        this.b = b;
    }
    
    @Override
    public void a(final View p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //     8: invokestatic    com/whatsapp/RegisterPhone.h:(Lcom/whatsapp/RegisterPhone;)Z
        //    11: istore          4
        //    13: iload           4
        //    15: ifeq            22
        //    18: return         
        //    19: astore_3       
        //    20: aload_3        
        //    21: athrow         
        //    22: aload_0        
        //    23: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //    26: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //    29: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //    32: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //    35: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    38: getstatic       com/whatsapp/a0g.z:[Ljava/lang/String;
        //    41: bipush          6
        //    43: aaload         
        //    44: ldc             ""
        //    46: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    49: astore          5
        //    51: aload_0        
        //    52: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //    55: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //    58: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //    61: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //    64: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    67: astore          6
        //    69: aload           5
        //    71: aload           6
        //    73: invokestatic    com/whatsapp/EnterPhoneNumber.a:(Ljava/lang/String;Ljava/lang/String;)I
        //    76: tableswitch {
        //                2: 396
        //                3: 400
        //                4: 429
        //                5: 468
        //                6: 492
        //                7: 556
        //                8: 620
        //          default: 120
        //        }
        //   120: aload           5
        //   122: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   125: istore          23
        //   127: aload           6
        //   129: getstatic       com/whatsapp/a0g.z:[Ljava/lang/String;
        //   132: bipush          7
        //   134: aaload         
        //   135: ldc             ""
        //   137: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   140: astore          24
        //   142: iload           23
        //   144: aload           24
        //   146: invokestatic    com/whatsapp/vi.a:(ILjava/lang/String;)Ljava/lang/String;
        //   149: astore          51
        //   151: aload           51
        //   153: astore          24
        //   155: new             Ljava/lang/StringBuilder;
        //   158: dup            
        //   159: invokespecial   java/lang/StringBuilder.<init>:()V
        //   162: getstatic       com/whatsapp/a0g.z:[Ljava/lang/String;
        //   165: iconst_5       
        //   166: aaload         
        //   167: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   170: aload           5
        //   172: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   175: getstatic       com/whatsapp/a0g.z:[Ljava/lang/String;
        //   178: iconst_3       
        //   179: aaload         
        //   180: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   183: aload           24
        //   185: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   188: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   191: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   194: aload           5
        //   196: aload_0        
        //   197: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   200: invokestatic    com/whatsapp/RegisterPhone.f:(Lcom/whatsapp/RegisterPhone;)Ljava/lang/String;
        //   203: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   206: istore          28
        //   208: iload           28
        //   210: ifeq            228
        //   213: aload           24
        //   215: aload_0        
        //   216: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   219: invokestatic    com/whatsapp/RegisterPhone.d:(Lcom/whatsapp/RegisterPhone;)Ljava/lang/String;
        //   222: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   225: ifne            242
        //   228: getstatic       com/whatsapp/a0g.z:[Ljava/lang/String;
        //   231: bipush          8
        //   233: aaload         
        //   234: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   237: bipush          7
        //   239: putstatic       com/whatsapp/EnterPhoneNumber.s:I
        //   242: aload           5
        //   244: putstatic       com/whatsapp/EnterPhoneNumber.z:Ljava/lang/String;
        //   247: aload           24
        //   249: putstatic       com/whatsapp/EnterPhoneNumber.w:Ljava/lang/String;
        //   252: aload_0        
        //   253: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   256: invokestatic    com/whatsapp/RegisterPhone.g:(Lcom/whatsapp/RegisterPhone;)V
        //   259: aload_0        
        //   260: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   263: invokestatic    com/whatsapp/RegisterPhone.e:(Lcom/whatsapp/RegisterPhone;)V
        //   266: aload_0        
        //   267: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   270: iconst_0       
        //   271: invokevirtual   com/whatsapp/RegisterPhone.getPreferences:(I)Landroid/content/SharedPreferences;
        //   274: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //   279: astore          29
        //   281: aload           29
        //   283: getstatic       com/whatsapp/a0g.z:[Ljava/lang/String;
        //   286: iconst_1       
        //   287: aaload         
        //   288: getstatic       com/whatsapp/EnterPhoneNumber.z:Ljava/lang/String;
        //   291: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //   296: pop            
        //   297: aload           29
        //   299: getstatic       com/whatsapp/a0g.z:[Ljava/lang/String;
        //   302: iconst_4       
        //   303: aaload         
        //   304: getstatic       com/whatsapp/EnterPhoneNumber.w:Ljava/lang/String;
        //   307: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //   312: pop            
        //   313: aload           29
        //   315: invokeinterface android/content/SharedPreferences$Editor.commit:()Z
        //   320: ifne            331
        //   323: getstatic       com/whatsapp/a0g.z:[Ljava/lang/String;
        //   326: iconst_2       
        //   327: aaload         
        //   328: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   331: invokestatic    com/whatsapp/App.O:()Z
        //   334: ifne            715
        //   337: getstatic       com/whatsapp/a0g.z:[Ljava/lang/String;
        //   340: iconst_0       
        //   341: aaload         
        //   342: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   345: aload_0        
        //   346: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   349: astore          48
        //   351: aload_0        
        //   352: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   355: astore          49
        //   357: iconst_1       
        //   358: anewarray       Ljava/lang/Object;
        //   361: astore          50
        //   363: aload           50
        //   365: iconst_0       
        //   366: aload_0        
        //   367: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   370: ldc             2131230921
        //   372: invokevirtual   com/whatsapp/RegisterPhone.getString:(I)Ljava/lang/String;
        //   375: aastore        
        //   376: aload           48
        //   378: aload           49
        //   380: ldc             2131231532
        //   382: aload           50
        //   384: invokevirtual   com/whatsapp/RegisterPhone.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   387: invokevirtual   com/whatsapp/RegisterPhone.d:(Ljava/lang/String;)V
        //   390: return         
        //   391: astore          33
        //   393: aload           33
        //   395: athrow         
        //   396: iload_2        
        //   397: ifeq            120
        //   400: aload_0        
        //   401: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   404: ldc             2131231525
        //   406: invokevirtual   com/whatsapp/RegisterPhone.f:(I)V
        //   409: aload_0        
        //   410: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   413: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   416: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   419: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   422: pop            
        //   423: return         
        //   424: astore          21
        //   426: aload           21
        //   428: athrow         
        //   429: aload_0        
        //   430: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   433: ldc             2131231526
        //   435: invokevirtual   com/whatsapp/RegisterPhone.f:(I)V
        //   438: aload_0        
        //   439: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   442: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   445: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   448: ldc             ""
        //   450: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //   453: aload_0        
        //   454: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   457: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   460: getfield        com/whatsapp/tw.a:Landroid/widget/EditText;
        //   463: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   466: pop            
        //   467: return         
        //   468: aload_0        
        //   469: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   472: ldc             2131231538
        //   474: invokevirtual   com/whatsapp/RegisterPhone.f:(I)V
        //   477: aload_0        
        //   478: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   481: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   484: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   487: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   490: pop            
        //   491: return         
        //   492: aload_0        
        //   493: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   496: astore          15
        //   498: aload_0        
        //   499: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   502: astore          16
        //   504: iconst_1       
        //   505: anewarray       Ljava/lang/Object;
        //   508: astore          17
        //   510: aload           17
        //   512: iconst_0       
        //   513: aload_0        
        //   514: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   517: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   520: getfield        com/whatsapp/tw.f:Landroid/widget/TextView;
        //   523: invokevirtual   android/widget/TextView.getText:()Ljava/lang/CharSequence;
        //   526: aastore        
        //   527: aload           15
        //   529: aload           16
        //   531: ldc             2131231530
        //   533: aload           17
        //   535: invokevirtual   com/whatsapp/RegisterPhone.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   538: invokevirtual   com/whatsapp/RegisterPhone.d:(Ljava/lang/String;)V
        //   541: aload_0        
        //   542: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   545: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   548: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   551: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   554: pop            
        //   555: return         
        //   556: aload_0        
        //   557: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   560: astore          11
        //   562: aload_0        
        //   563: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   566: astore          12
        //   568: iconst_1       
        //   569: anewarray       Ljava/lang/Object;
        //   572: astore          13
        //   574: aload           13
        //   576: iconst_0       
        //   577: aload_0        
        //   578: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   581: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   584: getfield        com/whatsapp/tw.f:Landroid/widget/TextView;
        //   587: invokevirtual   android/widget/TextView.getText:()Ljava/lang/CharSequence;
        //   590: aastore        
        //   591: aload           11
        //   593: aload           12
        //   595: ldc             2131231529
        //   597: aload           13
        //   599: invokevirtual   com/whatsapp/RegisterPhone.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   602: invokevirtual   com/whatsapp/RegisterPhone.d:(Ljava/lang/String;)V
        //   605: aload_0        
        //   606: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   609: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   612: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   615: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   618: pop            
        //   619: return         
        //   620: aload_0        
        //   621: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   624: astore          7
        //   626: aload_0        
        //   627: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   630: astore          8
        //   632: iconst_1       
        //   633: anewarray       Ljava/lang/Object;
        //   636: astore          9
        //   638: aload           9
        //   640: iconst_0       
        //   641: aload_0        
        //   642: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   645: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   648: getfield        com/whatsapp/tw.f:Landroid/widget/TextView;
        //   651: invokevirtual   android/widget/TextView.getText:()Ljava/lang/CharSequence;
        //   654: aastore        
        //   655: aload           7
        //   657: aload           8
        //   659: ldc             2131231528
        //   661: aload           9
        //   663: invokevirtual   com/whatsapp/RegisterPhone.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   666: invokevirtual   com/whatsapp/RegisterPhone.d:(Ljava/lang/String;)V
        //   669: aload_0        
        //   670: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   673: getfield        com/whatsapp/RegisterPhone.y:Lcom/whatsapp/tw;
        //   676: getfield        com/whatsapp/tw.d:Landroid/widget/EditText;
        //   679: invokevirtual   android/widget/EditText.requestFocus:()Z
        //   682: pop            
        //   683: return         
        //   684: astore          25
        //   686: getstatic       com/whatsapp/a0g.z:[Ljava/lang/String;
        //   689: bipush          9
        //   691: aaload         
        //   692: aload           25
        //   694: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   697: goto            155
        //   700: astore          26
        //   702: aload           26
        //   704: athrow         
        //   705: astore          27
        //   707: aload           27
        //   709: athrow         
        //   710: astore          30
        //   712: aload           30
        //   714: athrow         
        //   715: getstatic       com/whatsapp/EnterPhoneNumber.s:I
        //   718: bipush          7
        //   720: if_icmpne       847
        //   723: aload_0        
        //   724: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   727: invokestatic    com/whatsapp/RegisterPhone.a:(Lcom/whatsapp/RegisterPhone;)V
        //   730: new             Ljava/lang/StringBuilder;
        //   733: dup            
        //   734: invokespecial   java/lang/StringBuilder.<init>:()V
        //   737: getstatic       com/whatsapp/EnterPhoneNumber.z:Ljava/lang/String;
        //   740: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   743: getstatic       com/whatsapp/EnterPhoneNumber.w:Ljava/lang/String;
        //   746: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   749: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   752: invokestatic    com/whatsapp/App.n:(Ljava/lang/String;)Ljava/lang/String;
        //   755: astore          41
        //   757: aload           41
        //   759: invokestatic    com/whatsapp/al5.g:(Ljava/lang/String;)[B
        //   762: astore          42
        //   764: aload           42
        //   766: ifnonnull       782
        //   769: invokestatic    com/whatsapp/al5.k:()[B
        //   772: astore          42
        //   774: aload           42
        //   776: aload           41
        //   778: invokestatic    com/whatsapp/al5.a:([BLjava/lang/String;)Z
        //   781: pop            
        //   782: new             Lcom/whatsapp/a6s;
        //   785: dup            
        //   786: aload_0        
        //   787: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   790: aconst_null    
        //   791: aload_0        
        //   792: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   795: invokestatic    com/whatsapp/RegisterPhone.b:(Lcom/whatsapp/RegisterPhone;)Ljava/lang/Runnable;
        //   798: invokespecial   com/whatsapp/a6s.<init>:(Lcom/whatsapp/EnterPhoneNumber;Ljava/lang/Runnable;Ljava/lang/Runnable;)V
        //   801: astore          43
        //   803: iconst_3       
        //   804: anewarray       [B
        //   807: astore          45
        //   809: aload           45
        //   811: iconst_0       
        //   812: getstatic       com/whatsapp/EnterPhoneNumber.z:Ljava/lang/String;
        //   815: invokevirtual   java/lang/String.getBytes:()[B
        //   818: aastore        
        //   819: aload           45
        //   821: iconst_1       
        //   822: getstatic       com/whatsapp/EnterPhoneNumber.w:Ljava/lang/String;
        //   825: invokevirtual   java/lang/String.getBytes:()[B
        //   828: aastore        
        //   829: aload           45
        //   831: iconst_2       
        //   832: aload           42
        //   834: aastore        
        //   835: aload           43
        //   837: aload           45
        //   839: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //   842: pop            
        //   843: iload_2        
        //   844: ifeq            18
        //   847: getstatic       com/whatsapp/EnterPhoneNumber.s:I
        //   850: istore          38
        //   852: iload           38
        //   854: bipush          14
        //   856: if_icmpne       890
        //   859: new             Lcom/whatsapp/ok;
        //   862: dup            
        //   863: aload_0        
        //   864: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   867: aconst_null    
        //   868: aload_0        
        //   869: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   872: invokestatic    com/whatsapp/RegisterPhone.b:(Lcom/whatsapp/RegisterPhone;)Ljava/lang/Runnable;
        //   875: invokespecial   com/whatsapp/ok.<init>:(Lcom/whatsapp/EnterPhoneNumber;Ljava/lang/Runnable;Ljava/lang/Runnable;)V
        //   878: iconst_0       
        //   879: anewarray       Ljava/lang/String;
        //   882: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //   885: pop            
        //   886: iload_2        
        //   887: ifeq            18
        //   890: bipush          15
        //   892: putstatic       com/whatsapp/EnterPhoneNumber.s:I
        //   895: aload_0        
        //   896: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   899: invokevirtual   com/whatsapp/RegisterPhone.b:()V
        //   902: aload_0        
        //   903: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   906: getfield        com/whatsapp/RegisterPhone.q:Z
        //   909: istore          39
        //   911: iload           39
        //   913: ifne            18
        //   916: aload_0        
        //   917: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   920: invokevirtual   com/whatsapp/RegisterPhone.isFinishing:()Z
        //   923: ifne            18
        //   926: aload_0        
        //   927: getfield        com/whatsapp/a0g.b:Lcom/whatsapp/RegisterPhone;
        //   930: bipush          21
        //   932: invokevirtual   com/whatsapp/RegisterPhone.showDialog:(I)V
        //   935: return         
        //   936: astore          37
        //   938: aload           37
        //   940: athrow         
        //   941: astore          44
        //   943: aload           44
        //   945: athrow         
        //   946: astore          34
        //   948: aload           34
        //   950: athrow         
        //   951: astore          35
        //   953: aload           35
        //   955: athrow         
        //   956: astore          36
        //   958: aload           36
        //   960: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      13     19     22     Ljava/io/IOException;
        //  142    151    684    700    Ljava/io/IOException;
        //  155    208    700    705    Ljava/io/IOException;
        //  213    228    705    710    Ljava/io/IOException;
        //  228    242    705    710    Ljava/io/IOException;
        //  281    331    710    715    Ljava/io/IOException;
        //  331    390    391    396    Ljava/io/IOException;
        //  400    423    424    429    Ljava/io/IOException;
        //  702    705    705    710    Ljava/io/IOException;
        //  782    843    941    946    Ljava/io/IOException;
        //  847    852    946    951    Ljava/io/IOException;
        //  859    886    951    956    Ljava/io/IOException;
        //  890    911    956    961    Ljava/io/IOException;
        //  916    935    936    941    Ljava/io/IOException;
        //  943    946    946    951    Ljava/io/IOException;
        //  948    951    951    956    Ljava/io/IOException;
        //  953    956    956    961    Ljava/io/IOException;
        //  958    961    936    941    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 422, Size: 422
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
