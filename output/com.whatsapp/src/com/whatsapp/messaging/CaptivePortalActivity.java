// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import com.whatsapp.App;
import com.whatsapp.a2i;
import android.view.View;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.util.Log;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.widget.Button;
import android.view.ViewGroup;
import com.whatsapp.alm;
import android.net.wifi.WifiManager;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.net.NetworkInfo;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.app.Activity;

public class CaptivePortalActivity extends Activity
{
    private static b5 a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        String s = "\u001c\t\\}(\t\r\fy.\r\u001cMea\u001e\u000bX`7\u0016\u001cU)\"\r\rM}$\u001bHJf3_";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'A';
                        break;
                    }
                    case 0: {
                        c2 = '\u007f';
                        break;
                    }
                    case 1: {
                        c2 = 'h';
                        break;
                    }
                    case 2: {
                        c2 = ',';
                        break;
                    }
                    case 3: {
                        c2 = '\t';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\b\u0001J`";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\f\u001bEm\u001e\u0013\t_}\u001e\u0011\u0007X`'\u0016\u000bM}(\u0010\u0006se.\u0018";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u001c\t\\}(\t\r\fy.\r\u001cMe{_";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "\u001c\t\\}(\t\r\fy.\r\u001cMe";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        CaptivePortalActivity.a = new b5((ad)null);
    }
    
    public static String a(final WifiInfo wifiInfo) {
        String ssid;
        if (wifiInfo == null) {
            ssid = null;
        }
        else {
            ssid = wifiInfo.getSSID();
            if (ssid != null && ssid.length() >= 2 && (ssid.startsWith("\"") || ssid.startsWith("'")) && (ssid.endsWith("\"") || ssid.endsWith("'"))) {
                return ssid.substring(1, -1 + ssid.length());
            }
        }
        return ssid;
    }
    
    public static void a(final Context context) {
        synchronized (CaptivePortalActivity.class) {
            CaptivePortalActivity.a.clear();
            context.deleteFile(CaptivePortalActivity.z[2]);
        }
    }
    
    public static boolean a(final NetworkInfo p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   android/net/NetworkInfo.getType:()I
        //     4: istore_2       
        //     5: iload_2        
        //     6: iconst_1       
        //     7: if_icmpeq       15
        //    10: iconst_0       
        //    11: ireturn        
        //    12: astore_1       
        //    13: aload_1        
        //    14: athrow         
        //    15: aconst_null    
        //    16: astore_3       
        //    17: new             Ljava/net/URL;
        //    20: dup            
        //    21: getstatic       com/whatsapp/a6c.g:Ljava/lang/String;
        //    24: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    27: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
        //    30: checkcast       Ljava/net/HttpURLConnection;
        //    33: astore          7
        //    35: aload           7
        //    37: iconst_0       
        //    38: invokevirtual   java/net/HttpURLConnection.setInstanceFollowRedirects:(Z)V
        //    41: aload           7
        //    43: sipush          10000
        //    46: invokevirtual   java/net/HttpURLConnection.setConnectTimeout:(I)V
        //    49: aload           7
        //    51: sipush          10000
        //    54: invokevirtual   java/net/HttpURLConnection.setReadTimeout:(I)V
        //    57: aload           7
        //    59: iconst_0       
        //    60: invokevirtual   java/net/HttpURLConnection.setUseCaches:(Z)V
        //    63: aload           7
        //    65: invokevirtual   java/net/HttpURLConnection.getInputStream:()Ljava/io/InputStream;
        //    68: pop            
        //    69: aload           7
        //    71: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //    74: istore          12
        //    76: iload           12
        //    78: sipush          204
        //    81: if_icmpne       101
        //    84: aload           7
        //    86: ifnull          94
        //    89: aload           7
        //    91: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //    94: iconst_0       
        //    95: ireturn        
        //    96: astore          14
        //    98: aload           14
        //   100: athrow         
        //   101: getstatic       com/whatsapp/messaging/CaptivePortalActivity.z:[Ljava/lang/String;
        //   104: iconst_4       
        //   105: aaload         
        //   106: invokestatic    com/whatsapp/App.F:(Ljava/lang/String;)V
        //   109: new             Ljava/lang/StringBuilder;
        //   112: dup            
        //   113: invokespecial   java/lang/StringBuilder.<init>:()V
        //   116: getstatic       com/whatsapp/messaging/CaptivePortalActivity.z:[Ljava/lang/String;
        //   119: iconst_3       
        //   120: aaload         
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   124: aload_0        
        //   125: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   128: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   131: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   134: aload           7
        //   136: ifnull          144
        //   139: aload           7
        //   141: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   144: iconst_1       
        //   145: ireturn        
        //   146: astore          13
        //   148: aload           13
        //   150: athrow         
        //   151: astore          6
        //   153: aconst_null    
        //   154: astore          7
        //   156: aload           7
        //   158: ifnull          166
        //   161: aload           7
        //   163: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   166: iconst_0       
        //   167: ireturn        
        //   168: astore          8
        //   170: aload           8
        //   172: athrow         
        //   173: astore          4
        //   175: aload_3        
        //   176: ifnull          183
        //   179: aload_3        
        //   180: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   183: aload           4
        //   185: athrow         
        //   186: astore          5
        //   188: aload           5
        //   190: athrow         
        //   191: astore          10
        //   193: aload           7
        //   195: astore_3       
        //   196: aload           10
        //   198: astore          4
        //   200: goto            175
        //   203: astore          9
        //   205: goto            156
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      5      12     15     Ljava/io/IOException;
        //  17     35     151    156    Ljava/io/IOException;
        //  17     35     173    175    Any
        //  35     76     203    208    Ljava/io/IOException;
        //  35     76     191    203    Any
        //  89     94     96     101    Ljava/io/IOException;
        //  101    134    203    208    Ljava/io/IOException;
        //  101    134    191    203    Any
        //  139    144    146    151    Ljava/io/IOException;
        //  161    166    168    173    Ljava/io/IOException;
        //  179    183    186    191    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0094:
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
    
    public void onCreate(final Bundle bundle) {
        final boolean a = e.a;
        super.onCreate(bundle);
        this.requestWindowFeature(1);
        if (Build$VERSION.SDK_INT >= 11) {
            this.setFinishOnTouchOutside(false);
        }
        final WifiInfo connectionInfo = ((WifiManager)this.getSystemService(CaptivePortalActivity.z[1])).getConnectionInfo();
        int networkId;
        if (connectionInfo != null) {
            networkId = connectionInfo.getNetworkId();
        }
        else {
            networkId = -1;
        }
        String a2;
        if (connectionInfo != null) {
            a2 = a(connectionInfo);
        }
        else {
            a2 = null;
        }
        this.setContentView(alm.a(this.getLayoutInflater(), 2130903247, null));
        this.getWindow().setLayout(-1, -2);
        final Button button = (Button)this.findViewById(2131755844);
        final Button button2 = (Button)this.findViewById(2131755843);
        final Button button3 = (Button)this.findViewById(2131755845);
        final TextView textView = (TextView)this.findViewById(2131755842);
        final View viewById = this.findViewById(2131755846);
        button.setOnClickListener((View$OnClickListener)new ad(this));
        Label_0233: {
            if (connectionInfo != null) {
                button2.setText((CharSequence)this.getString(2131231133, new Object[] { a2 }));
                textView.setText((CharSequence)this.getString(2131231975, new Object[] { a2 }));
                if (!a) {
                    break Label_0233;
                }
            }
            button2.setVisibility(8);
            if (viewById != null) {
                viewById.setVisibility(8);
            }
            textView.setText(2131231974);
        }
        button3.setOnClickListener((View$OnClickListener)new aj(this));
        button2.setOnClickListener((View$OnClickListener)new ay(this, networkId, a2));
        Log.i(CaptivePortalActivity.z[0] + a2);
        if (DialogToastActivity.h) {
            e.a = !a;
        }
    }
    
    protected void onPause() {
        super.onPause();
        a2i.a.removeMessages(1);
        App.t();
    }
    
    protected void onResume() {
        super.onResume();
        a2i.a.sendEmptyMessageDelayed(1, 3000L);
    }
}
