// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.json.JSONObject;
import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import android.os.AsyncTask;

public class p4 extends AsyncTask
{
    private static final String[] z;
    JSONArray a;
    final DescribeProblemActivity b;
    
    static {
        final String[] z2 = new String[13];
        String s = "\u001dBVWR\u0002\\Z";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0357:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '4';
                        break;
                    }
                    case 0: {
                        c2 = 'm';
                        break;
                    }
                    case 1: {
                        c2 = '.';
                        break;
                    }
                    case 2: {
                        c2 = '7';
                        break;
                    }
                    case 3: {
                        c2 = '#';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "8zq\u000e\f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\f@SQ[\u0004J";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "6s";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\tKD@D\u001fAU\fG\bOE@\\M";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0001I";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u001c[RQM";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0001M";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0005ZCSGW\u0001\u0018TC\u001a\u0000@KU\u0019]VSDCMXN\u001b\u000bOF\fW\u0001GRM@2]RBF\u000eF\u0019S\\\u001d\u0011";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\tKD@D\u001fAU\fG\bOE@\\B\\RPA\u0001Z\u0018@[\u0018@C\u0003";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\u0018\\[";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0019GCOQ";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\tKD@F\u0004^CJ[\u0003";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    break Label_0357;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    protected p4(final DescribeProblemActivity b) {
        this.b = b;
    }
    
    protected Void a(final Void[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_2       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_3       
        //     6: aload_0        
        //     7: getfield        com/whatsapp/p4.b:Lcom/whatsapp/DescribeProblemActivity;
        //    10: invokestatic    com/whatsapp/DescribeProblemActivity.b:(Lcom/whatsapp/DescribeProblemActivity;)Landroid/widget/EditText;
        //    13: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //    16: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    19: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //    22: astore          7
        //    24: new             Ljava/util/ArrayList;
        //    27: dup            
        //    28: invokespecial   java/util/ArrayList.<init>:()V
        //    31: astore          8
        //    33: aload           8
        //    35: new             Lorg/apache/http/message/BasicNameValuePair;
        //    38: dup            
        //    39: getstatic       com/whatsapp/p4.z:[Ljava/lang/String;
        //    42: iconst_0       
        //    43: aaload         
        //    44: getstatic       com/whatsapp/p4.z:[Ljava/lang/String;
        //    47: iconst_2       
        //    48: aaload         
        //    49: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    52: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    55: pop            
        //    56: aload           8
        //    58: new             Lorg/apache/http/message/BasicNameValuePair;
        //    61: dup            
        //    62: getstatic       com/whatsapp/p4.z:[Ljava/lang/String;
        //    65: iconst_5       
        //    66: aaload         
        //    67: invokestatic    com/whatsapp/all.b:()Ljava/lang/String;
        //    70: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    73: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    76: pop            
        //    77: aload           8
        //    79: new             Lorg/apache/http/message/BasicNameValuePair;
        //    82: dup            
        //    83: getstatic       com/whatsapp/p4.z:[Ljava/lang/String;
        //    86: bipush          7
        //    88: aaload         
        //    89: invokestatic    com/whatsapp/all.c:()Ljava/lang/String;
        //    92: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    95: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    98: pop            
        //    99: aload           8
        //   101: new             Lorg/apache/http/message/BasicNameValuePair;
        //   104: dup            
        //   105: getstatic       com/whatsapp/p4.z:[Ljava/lang/String;
        //   108: bipush          6
        //   110: aaload         
        //   111: aload           7
        //   113: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   116: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   119: pop            
        //   120: new             Ljava/net/URL;
        //   123: dup            
        //   124: new             Ljava/lang/StringBuilder;
        //   127: dup            
        //   128: invokespecial   java/lang/StringBuilder.<init>:()V
        //   131: getstatic       com/whatsapp/p4.z:[Ljava/lang/String;
        //   134: bipush          8
        //   136: aaload         
        //   137: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   140: aload           8
        //   142: getstatic       com/whatsapp/p4.z:[Ljava/lang/String;
        //   145: iconst_1       
        //   146: aaload         
        //   147: invokestatic    org/apache/http/client/utils/URLEncodedUtils.format:(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
        //   150: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   153: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   156: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //   159: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //   162: astore          13
        //   164: aload           13
        //   166: sipush          30000
        //   169: invokevirtual   java/net/URLConnection.setConnectTimeout:(I)V
        //   172: aload           13
        //   174: sipush          30000
        //   177: invokevirtual   java/net/URLConnection.setReadTimeout:(I)V
        //   180: aload           13
        //   182: invokevirtual   java/net/URLConnection.getInputStream:()Ljava/io/InputStream;
        //   185: astore          14
        //   187: new             Ljava/lang/StringBuilder;
        //   190: dup            
        //   191: invokespecial   java/lang/StringBuilder.<init>:()V
        //   194: astore          15
        //   196: new             Ljava/io/BufferedReader;
        //   199: dup            
        //   200: new             Ljava/io/InputStreamReader;
        //   203: dup            
        //   204: aload           14
        //   206: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //   209: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //   212: astore          5
        //   214: aload           5
        //   216: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   219: astore          16
        //   221: aload           16
        //   223: ifnull          245
        //   226: aload           15
        //   228: aload           16
        //   230: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   233: pop            
        //   234: aload           5
        //   236: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   239: astore          16
        //   241: iload_3        
        //   242: ifeq            221
        //   245: aload           15
        //   247: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   250: astore          18
        //   252: aload           18
        //   254: astore          19
        //   256: aload           19
        //   258: ifnull          273
        //   261: aload           19
        //   263: invokevirtual   java/lang/String.length:()I
        //   266: istore          21
        //   268: iload           21
        //   270: ifne            280
        //   273: getstatic       com/whatsapp/p4.z:[Ljava/lang/String;
        //   276: iconst_3       
        //   277: aaload         
        //   278: astore          19
        //   280: aload_0        
        //   281: new             Lorg/json/JSONArray;
        //   284: dup            
        //   285: aload           19
        //   287: invokespecial   org/json/JSONArray.<init>:(Ljava/lang/String;)V
        //   290: putfield        com/whatsapp/p4.a:Lorg/json/JSONArray;
        //   293: aload           5
        //   295: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   298: aconst_null    
        //   299: areturn        
        //   300: astore          20
        //   302: aload           20
        //   304: athrow         
        //   305: astore          4
        //   307: getstatic       com/whatsapp/p4.z:[Ljava/lang/String;
        //   310: iconst_4       
        //   311: aaload         
        //   312: aload           4
        //   314: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   317: aload           5
        //   319: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   322: aconst_null    
        //   323: areturn        
        //   324: astore          6
        //   326: aload_2        
        //   327: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   330: aload           6
        //   332: athrow         
        //   333: astore          6
        //   335: aload           5
        //   337: astore_2       
        //   338: goto            326
        //   341: astore          4
        //   343: aconst_null    
        //   344: astore          5
        //   346: goto            307
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      214    341    349    Ljava/lang/Exception;
        //  6      214    324    326    Any
        //  214    221    305    307    Ljava/lang/Exception;
        //  214    221    333    341    Any
        //  226    241    305    307    Ljava/lang/Exception;
        //  226    241    333    341    Any
        //  245    252    305    307    Ljava/lang/Exception;
        //  245    252    333    341    Any
        //  261    268    300    305    Ljava/lang/Exception;
        //  261    268    333    341    Any
        //  273    280    305    307    Ljava/lang/Exception;
        //  273    280    333    341    Any
        //  280    293    305    307    Ljava/lang/Exception;
        //  280    293    333    341    Any
        //  302    305    305    307    Ljava/lang/Exception;
        //  302    305    333    341    Any
        //  307    317    333    341    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0307:
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
    
    protected void a(final Void void1) {
        final boolean i = App.I;
        this.b.removeDialog(2);
        try {
            if (this.a != null) {
                final int length = this.a.length();
                Log.i(p4.z[9] + length);
                if (length > 0) {
                    final ArrayList list = new ArrayList<String>(length);
                    final ArrayList list2 = new ArrayList<String>(length);
                    final ArrayList list3 = new ArrayList<String>(length);
                    int j = 0;
                    while (j < length) {
                        final JSONObject optJSONObject = this.a.optJSONObject(j);
                        list.add(optJSONObject.getString(p4.z[11]));
                        list2.add(optJSONObject.getString(p4.z[12]));
                        list3.add(optJSONObject.getString(p4.z[10]));
                        ++j;
                        if (i) {
                            break;
                        }
                    }
                    final ArrayList<Uri> list4 = new ArrayList<Uri>();
                    final Uri[] c = DescribeProblemActivity.c(this.b);
                    final int length2 = c.length;
                    int n = 0;
                    while (true) {
                        Label_0232: {
                            if (n >= length2) {
                                break Label_0232;
                            }
                            final Uri uri = c[n];
                            Label_0225: {
                                if (uri == null) {
                                    break Label_0225;
                                }
                                try {
                                    list4.add(uri);
                                    ++n;
                                    if (i) {
                                        SearchFAQ.a((Context)this.b, DescribeProblemActivity.a(this.b), DescribeProblemActivity.b(this.b).getText().toString().trim(), list4, DescribeProblemActivity.d(this.b), length, list, list2, list3);
                                        this.b.finish();
                                        return;
                                    }
                                    continue;
                                }
                                catch (Exception ex) {
                                    throw ex;
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (Exception ex2) {
            Log.b(ex2);
        }
        DescribeProblemActivity.a(this.b, (p4)null);
        a8s.a(DescribeProblemActivity.e(this.b), new Void[0]);
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((Void)o);
    }
    
    protected void onPreExecute() {
        this.b.showDialog(2);
    }
}
