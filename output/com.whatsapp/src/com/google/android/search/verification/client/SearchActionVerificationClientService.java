// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.search.verification.client;

import android.content.ServiceConnection;
import java.util.Iterator;
import android.os.Bundle;
import android.util.Log;
import android.content.Intent;
import com.google.android.search.verification.api.ISearchActionVerificationService;
import android.app.IntentService;

public abstract class SearchActionVerificationClientService extends IntentService
{
    public static boolean a;
    private final boolean DBG;
    private final long mConnectionTimeout;
    private ISearchActionVerificationService mIRemoteService;
    private SearchActionVerificationClientService$SearchActionVerificationServiceConnection mSearchActionVerificationServiceConnection;
    private final Intent mServiceIntent;
    
    public SearchActionVerificationClientService() {
        final boolean a = SearchActionVerificationClientActivity.a;
        super("SearchActionVerificationClientService");
        this.mServiceIntent = new Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage("com.google.android.googlequicksearchbox");
        this.mIRemoteService = null;
        this.DBG = this.isTestingMode();
        if (this.isTestingMode()) {
            this.mServiceIntent.setPackage("com.google.verificationdemo.fakeverification");
        }
        this.mConnectionTimeout = this.getConnectionTimeout();
        if (a) {
            SearchActionVerificationClientService.a = !SearchActionVerificationClientService.a;
        }
    }
    
    static boolean access$000(final SearchActionVerificationClientService searchActionVerificationClientService) {
        return searchActionVerificationClientService.DBG;
    }
    
    static ISearchActionVerificationService access$102(final SearchActionVerificationClientService searchActionVerificationClientService, final ISearchActionVerificationService miRemoteService) {
        return searchActionVerificationClientService.mIRemoteService = miRemoteService;
    }
    
    private boolean isConnected() {
        return this.mIRemoteService != null;
    }
    
    private boolean isPackageGoogleSigned() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   com/google/android/search/verification/client/SearchActionVerificationClientService.getPackageManager:()Landroid/content/pm/PackageManager;
        //     4: ldc             "com.google.android.googlequicksearchbox"
        //     6: bipush          64
        //     8: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //    11: astore          4
        //    13: aload           4
        //    15: getfield        android/content/pm/PackageInfo.signatures:[Landroid/content/pm/Signature;
        //    18: ifnull          35
        //    21: aload           4
        //    23: getfield        android/content/pm/PackageInfo.signatures:[Landroid/content/pm/Signature;
        //    26: arraylength    
        //    27: istore          10
        //    29: iload           10
        //    31: iconst_1       
        //    32: if_icmpeq       121
        //    35: aload_0        
        //    36: getfield        com/google/android/search/verification/client/SearchActionVerificationClientService.DBG:Z
        //    39: istore          8
        //    41: iload           8
        //    43: ifeq            54
        //    46: ldc             "SAVerificationClientS"
        //    48: ldc             "Wrong number of signatures returned"
        //    50: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    53: pop            
        //    54: iconst_0       
        //    55: ireturn        
        //    56: astore          5
        //    58: aload           5
        //    60: athrow         
        //    61: astore          6
        //    63: aload           6
        //    65: athrow         
        //    66: astore          7
        //    68: aload           7
        //    70: athrow         
        //    71: astore_1       
        //    72: aload_0        
        //    73: getfield        com/google/android/search/verification/client/SearchActionVerificationClientService.DBG:Z
        //    76: ifeq            54
        //    79: aload_1        
        //    80: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    83: astore_2       
        //    84: ldc             "SAVerificationClientS"
        //    86: new             Ljava/lang/StringBuilder;
        //    89: dup            
        //    90: bipush          34
        //    92: aload_2        
        //    93: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //    96: invokevirtual   java/lang/String.length:()I
        //    99: iadd           
        //   100: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   103: ldc             "Unexpected NameNotFoundException: "
        //   105: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   108: aload_2        
        //   109: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   112: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   115: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   118: pop            
        //   119: iconst_0       
        //   120: ireturn        
        //   121: aload           4
        //   123: getfield        android/content/pm/PackageInfo.signatures:[Landroid/content/pm/Signature;
        //   126: iconst_0       
        //   127: aaload         
        //   128: invokevirtual   android/content/pm/Signature.toByteArray:()[B
        //   131: iconst_2       
        //   132: invokestatic    android/util/Base64.encodeToString:([BI)Ljava/lang/String;
        //   135: ldc             "MIIEQzCCAyugAwIBAgIJAMLgh0ZkSjCNMA0GCSqGSIb3DQEBBAUAMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDAeFw0wODA4MjEyMzEzMzRaFw0zNjAxMDcyMzEzMzRaMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDCCASAwDQYJKoZIhvcNAQEBBQADggENADCCAQgCggEBAKtWLgDYO6IIrgqWbxJOKdoR8qtW0I9Y4sypEwPpt1TTcvZApxsdyxMJZ2JORland2qSGT2y5b+3JKkedxiLDmpHpDsz2WCbdxgxRczfey5YZnTJ4VZbH0xqWVW/8lGmPav5xVwnIiJS6HXk+BVKZF+JcWjAsb/GEuq/eFdpuzSqeYTcfi6idkyugwfYwXFU1+5fZKUaRKYCwkkFQVfcAs1fXA5V+++FGfvjJ/CxURaSxaBvGdGDhfXE28LWuT9ozCl5xw4Yq5OGazvV24mZVSoOO0yZ31j7kYvtwYK6NeADwbSxDdJEqO4k//0zOHKrUiGYXtqw/A0LFFtqoZKFjnkCAQOjgdkwgdYwHQYDVR0OBBYEFMd9jMIhF1Ylmn/Tgt9r45jk14alMIGmBgNVHSMEgZ4wgZuAFMd9jMIhF1Ylmn/Tgt9r45jk14aloXikdjB0MQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEUMBIGA1UEChMLR29vZ2xlIEluYy4xEDAOBgNVBAsTB0FuZHJvaWQxEDAOBgNVBAMTB0FuZHJvaWSCCQDC4IdGZEowjTAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBBAUAA4IBAQBt0lLO74UwLDYKqs6Tm8/yzKkEu116FmH4rkaymUIE0P9KaMftGlMexFlaYjzmB2OxZyl6euNXEsQH8gjwyxCUKRJNexBiGcCEyj6z+a1fuHHvkiaai+KL8W1EyNmgjmyy8AW7P+LLlkR+ho5zEHatRbM/YAnqGcFh5iZBqpknHf1SKMXFh4dd239FJ1jWYfbMDMy3NS5CTMQ2XFI1MvcyUTdZPErjQfTbQe3aDQsQcafEQPD+nqActifKZ0Np0IS9L9kR/wbNvyz6ENwPiTrjV2KRkEjH78ZMcUQXg0L3BYHJ3lc69Vs5Ddf9uUGGMYldX3WfMBEmh/9iFBDAaTCK"
        //   137: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   140: istore          11
        //   142: iload           11
        //   144: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  0      13     71     121    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  13     29     56     61     Landroid/content/pm/PackageManager$NameNotFoundException;
        //  35     41     61     66     Landroid/content/pm/PackageManager$NameNotFoundException;
        //  46     54     66     71     Landroid/content/pm/PackageManager$NameNotFoundException;
        //  58     61     61     66     Landroid/content/pm/PackageManager$NameNotFoundException;
        //  63     66     66     71     Landroid/content/pm/PackageManager$NameNotFoundException;
        //  68     71     71     121    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  121    142    71     121    Landroid/content/pm/PackageManager$NameNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 73, Size: 73
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
    
    private static void logIntentWithExtras(final Intent intent) {
        final boolean a = SearchActionVerificationClientActivity.a;
        Log.d("SAVerificationClientS", "Intent:");
        final String value = String.valueOf(intent);
        Log.d("SAVerificationClientS", new StringBuilder(1 + String.valueOf(value).length()).append("\t").append(value).toString());
        final Bundle extras = intent.getExtras();
        if (extras != null) {
            Log.d("SAVerificationClientS", "Extras:");
            for (final String s : extras.keySet()) {
                Log.d("SAVerificationClientS", String.format("\t%s: %s", s, extras.get(s)));
                if (a) {
                    break;
                }
            }
        }
    }
    
    public long getConnectionTimeout() {
        return 1000L;
    }
    
    public boolean isTestingMode() {
        return false;
    }
    
    public final void onCreate() {
        if (this.DBG) {
            Log.d("SAVerificationClientS", "onCreate");
        }
        super.onCreate();
        this.mSearchActionVerificationServiceConnection = new SearchActionVerificationClientService$SearchActionVerificationServiceConnection(this);
        this.bindService(this.mServiceIntent, (ServiceConnection)this.mSearchActionVerificationServiceConnection, 1);
    }
    
    public final void onDestroy() {
        if (this.DBG) {
            Log.d("SAVerificationClientS", "onDestroy");
        }
        super.onDestroy();
        this.unbindService((ServiceConnection)this.mSearchActionVerificationServiceConnection);
    }
    
    protected final void onHandleIntent(final Intent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: getstatic       com/google/android/search/verification/client/SearchActionVerificationClientActivity.a:Z
        //     5: istore_3       
        //     6: aload_1        
        //     7: ifnonnull       40
        //    10: aload_0        
        //    11: getfield        com/google/android/search/verification/client/SearchActionVerificationClientService.DBG:Z
        //    14: istore          45
        //    16: iload           45
        //    18: ifeq            524
        //    21: ldc             "SAVerificationClientS"
        //    23: ldc             "Unable to verify null intent"
        //    25: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //    28: pop            
        //    29: return         
        //    30: astore          43
        //    32: aload           43
        //    34: athrow         
        //    35: astore          44
        //    37: aload           44
        //    39: athrow         
        //    40: aload_0        
        //    41: invokevirtual   com/google/android/search/verification/client/SearchActionVerificationClientService.isTestingMode:()Z
        //    44: ifne            58
        //    47: aload_0        
        //    48: invokespecial   com/google/android/search/verification/client/SearchActionVerificationClientService.isPackageGoogleSigned:()Z
        //    51: istore          42
        //    53: iload           42
        //    55: ifeq            413
        //    58: iload_2        
        //    59: istore          6
        //    61: invokestatic    java/lang/System.nanoTime:()J
        //    64: lstore          7
        //    66: aload_0        
        //    67: invokespecial   com/google/android/search/verification/client/SearchActionVerificationClientService.isConnected:()Z
        //    70: istore          11
        //    72: iload           11
        //    74: ifne            169
        //    77: invokestatic    java/lang/System.nanoTime:()J
        //    80: lload           7
        //    82: lsub           
        //    83: lstore          35
        //    85: aload_0        
        //    86: getfield        com/google/android/search/verification/client/SearchActionVerificationClientService.mConnectionTimeout:J
        //    89: lstore          37
        //    91: lload           35
        //    93: lload           37
        //    95: ldc2_w          1000000
        //    98: lmul           
        //    99: lcmp           
        //   100: ifge            169
        //   103: ldc2_w          50
        //   106: invokestatic    java/lang/Thread.sleep:(J)V
        //   109: goto            66
        //   112: astore          39
        //   114: aload_0        
        //   115: getfield        com/google/android/search/verification/client/SearchActionVerificationClientService.DBG:Z
        //   118: ifeq            165
        //   121: aload           39
        //   123: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   126: astore          40
        //   128: ldc             "SAVerificationClientS"
        //   130: new             Ljava/lang/StringBuilder;
        //   133: dup            
        //   134: bipush          33
        //   136: aload           40
        //   138: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   141: invokevirtual   java/lang/String.length:()I
        //   144: iadd           
        //   145: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   148: ldc             "Unexpected InterruptedException: "
        //   150: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   153: aload           40
        //   155: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   158: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   161: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   164: pop            
        //   165: iload_3        
        //   166: ifeq            66
        //   169: aload_0        
        //   170: invokespecial   com/google/android/search/verification/client/SearchActionVerificationClientService.isConnected:()Z
        //   173: ifeq            358
        //   176: aload_1        
        //   177: ldc             "SearchActionVerificationClientExtraIntent"
        //   179: invokevirtual   android/content/Intent.hasExtra:(Ljava/lang/String;)Z
        //   182: istore          15
        //   184: iload           15
        //   186: ifeq            299
        //   189: aload_1        
        //   190: ldc             "SearchActionVerificationClientExtraIntent"
        //   192: invokevirtual   android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
        //   195: checkcast       Landroid/content/Intent;
        //   198: astore          20
        //   200: aload_0        
        //   201: getfield        com/google/android/search/verification/client/SearchActionVerificationClientService.DBG:Z
        //   204: ifeq            212
        //   207: aload           20
        //   209: invokestatic    com/google/android/search/verification/client/SearchActionVerificationClientService.logIntentWithExtras:(Landroid/content/Intent;)V
        //   212: aload_0        
        //   213: getfield        com/google/android/search/verification/client/SearchActionVerificationClientService.mIRemoteService:Lcom/google/android/search/verification/api/ISearchActionVerificationService;
        //   216: invokeinterface com/google/android/search/verification/api/ISearchActionVerificationService.getVersion:()I
        //   221: istore          28
        //   223: ldc             "SAVerificationClientS"
        //   225: new             Ljava/lang/StringBuilder;
        //   228: dup            
        //   229: bipush          24
        //   231: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   234: ldc             "API version: "
        //   236: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   239: iload           28
        //   241: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   244: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   247: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //   250: pop            
        //   251: new             Landroid/os/Bundle;
        //   254: dup            
        //   255: invokespecial   android/os/Bundle.<init>:()V
        //   258: astore          30
        //   260: iload           6
        //   262: ifeq            494
        //   265: aload_0        
        //   266: getfield        com/google/android/search/verification/client/SearchActionVerificationClientService.mIRemoteService:Lcom/google/android/search/verification/api/ISearchActionVerificationService;
        //   269: aload           20
        //   271: aload           30
        //   273: invokeinterface com/google/android/search/verification/api/ISearchActionVerificationService.isSearchAction:(Landroid/content/Intent;Landroid/os/Bundle;)Z
        //   278: istore          34
        //   280: iload           34
        //   282: ifeq            494
        //   285: aload_0        
        //   286: aload           20
        //   288: iload_2        
        //   289: aload           30
        //   291: invokevirtual   com/google/android/search/verification/client/SearchActionVerificationClientService.performAction:(Landroid/content/Intent;ZLandroid/os/Bundle;)Z
        //   294: pop            
        //   295: iload_3        
        //   296: ifeq            524
        //   299: aload_0        
        //   300: getfield        com/google/android/search/verification/client/SearchActionVerificationClientService.DBG:Z
        //   303: istore          17
        //   305: iload           17
        //   307: ifeq            524
        //   310: aload_1        
        //   311: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   314: astore          18
        //   316: ldc             "SAVerificationClientS"
        //   318: new             Ljava/lang/StringBuilder;
        //   321: dup            
        //   322: bipush          28
        //   324: aload           18
        //   326: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   329: invokevirtual   java/lang/String.length:()I
        //   332: iadd           
        //   333: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   336: ldc_w           "No extra, nothing to check: "
        //   339: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   342: aload           18
        //   344: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   347: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   350: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   353: pop            
        //   354: iload_3        
        //   355: ifeq            524
        //   358: aload_1        
        //   359: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   362: astore          13
        //   364: ldc             "SAVerificationClientS"
        //   366: new             Ljava/lang/StringBuilder;
        //   369: dup            
        //   370: bipush          62
        //   372: aload           13
        //   374: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   377: invokevirtual   java/lang/String.length:()I
        //   380: iadd           
        //   381: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   384: ldc_w           "VerificationService is not connected, unable to check intent: "
        //   387: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   390: aload           13
        //   392: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   395: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   398: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   401: pop            
        //   402: return         
        //   403: astore          4
        //   405: aload           4
        //   407: athrow         
        //   408: astore          5
        //   410: aload           5
        //   412: athrow         
        //   413: iconst_0       
        //   414: istore          6
        //   416: goto            61
        //   419: astore          9
        //   421: aload           9
        //   423: athrow         
        //   424: astore          10
        //   426: aload           10
        //   428: athrow         
        //   429: astore          12
        //   431: aload           12
        //   433: athrow         
        //   434: astore          21
        //   436: aload           21
        //   438: athrow         
        //   439: astore          32
        //   441: aload           32
        //   443: athrow         
        //   444: astore          33
        //   446: aload           33
        //   448: athrow         
        //   449: astore          22
        //   451: aload           22
        //   453: invokevirtual   android/os/RemoteException.getMessage:()Ljava/lang/String;
        //   456: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   459: astore          24
        //   461: aload           24
        //   463: invokevirtual   java/lang/String.length:()I
        //   466: ifeq            504
        //   469: ldc_w           "Remote exception: "
        //   472: aload           24
        //   474: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   477: astore          27
        //   479: aload           27
        //   481: astore          25
        //   483: ldc             "SAVerificationClientS"
        //   485: aload           25
        //   487: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   490: pop            
        //   491: goto            295
        //   494: iconst_0       
        //   495: istore_2       
        //   496: goto            285
        //   499: astore          23
        //   501: aload           23
        //   503: athrow         
        //   504: new             Ljava/lang/String;
        //   507: dup            
        //   508: ldc_w           "Remote exception: "
        //   511: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   514: astore          25
        //   516: goto            483
        //   519: astore          16
        //   521: aload           16
        //   523: athrow         
        //   524: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  10     16     30     35     Ljava/lang/InterruptedException;
        //  21     29     35     40     Ljava/lang/InterruptedException;
        //  32     35     35     40     Ljava/lang/InterruptedException;
        //  40     53     403    413    Ljava/lang/InterruptedException;
        //  66     72     419    424    Ljava/lang/InterruptedException;
        //  77     91     419    424    Ljava/lang/InterruptedException;
        //  77     91     424    429    Landroid/os/RemoteException;
        //  103    109    112    169    Ljava/lang/InterruptedException;
        //  103    109    424    429    Landroid/os/RemoteException;
        //  169    184    429    434    Ljava/lang/InterruptedException;
        //  200    212    434    439    Ljava/lang/InterruptedException;
        //  212    260    449    519    Landroid/os/RemoteException;
        //  265    280    439    449    Ljava/lang/InterruptedException;
        //  265    280    449    519    Landroid/os/RemoteException;
        //  285    295    449    519    Landroid/os/RemoteException;
        //  299    305    519    524    Ljava/lang/InterruptedException;
        //  405    408    408    413    Ljava/lang/InterruptedException;
        //  421    424    424    429    Landroid/os/RemoteException;
        //  441    444    444    449    Ljava/lang/InterruptedException;
        //  441    444    449    519    Landroid/os/RemoteException;
        //  446    449    449    519    Landroid/os/RemoteException;
        //  451    479    499    504    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 245, Size: 245
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
    
    public abstract boolean performAction(final Intent p0, final boolean p1, final Bundle p2);
}
