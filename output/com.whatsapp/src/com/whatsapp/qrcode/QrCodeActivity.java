// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.qrcode;

import com.whatsapp.App;
import android.view.KeyEvent;
import com.whatsapp.l7;
import android.view.View$OnClickListener;
import android.text.Html;
import com.google.d3;
import java.util.ArrayList;
import com.google.bj;
import java.util.HashMap;
import android.view.View;
import com.whatsapp.alm;
import android.view.ViewGroup;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.widget.TextView;
import android.os.HandlerThread;
import android.os.Handler;
import android.hardware.Camera$PreviewCallback;
import com.whatsapp.og;
import com.google.c5;
import com.whatsapp.DialogToastActivity;

public class QrCodeActivity extends DialogToastActivity
{
    public static int r;
    private static final String[] z;
    private c5 k;
    private og l;
    private Camera$PreviewCallback m;
    private Handler n;
    private boolean o;
    private String p;
    private String q;
    private boolean s;
    private HandlerThread t;
    private TextView u;
    private QrCodeView v;
    private Runnable w;
    
    static {
        final String[] z2 = new String[7];
        String s = "g.u\bX\u007f*}\u001fU98q\u0018Xd3m";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = ',';
                        break;
                    }
                    case 0: {
                        c2 = '\u0016';
                        break;
                    }
                    case 1: {
                        c2 = '\\';
                        break;
                    }
                    case 2: {
                        c2 = '\u0014';
                        break;
                    }
                    case 3: {
                        c2 = 'k';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "G.P\u000eOy8q";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "*:{\u0005X6?{\u0007Cda3H\u001c&l$[\u001c1bc\u000eN8+|\nXe=d\u001b\u0002u3yW\u0003p3z\u001f\u0012";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "g.K\u000eHc?u\u001fEy2";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "g.u\bX\u007f*}\u001fU9?f\u000eMb9";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "u3yE[~=`\u0018Mf,K\u001b^s:q\u0019Ix?q\u0018";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "g.u\bX\u007f*}\u001fU9.q\u0018Yz(4";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public QrCodeActivity() {
        this.k = new c5();
        this.o = true;
        this.w = new q(this);
        this.l = new l(this);
        this.m = (Camera$PreviewCallback)new i(this);
    }
    
    static String a(final QrCodeActivity qrCodeActivity, final String q) {
        return qrCodeActivity.q = q;
    }
    
    private void a() {
        this.runOnUiThread((Runnable)new d(this));
    }
    
    static void a(final QrCodeActivity qrCodeActivity, final byte[] array) {
        qrCodeActivity.a(array);
    }
    
    private void a(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/qrcode/QrCodeActivity.r:I
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/qrcode/QrCodeActivity.v:Lcom/whatsapp/qrcode/QrCodeView;
        //     8: invokevirtual   com/whatsapp/qrcode/QrCodeView.a:()Landroid/hardware/Camera$Size;
        //    11: astore_3       
        //    12: iconst_3       
        //    13: aload_3        
        //    14: getfield        android/hardware/Camera$Size.width:I
        //    17: imul           
        //    18: iconst_4       
        //    19: idiv           
        //    20: istore          4
        //    22: iload           4
        //    24: sipush          320
        //    27: if_icmpge       36
        //    30: aload_3        
        //    31: getfield        android/hardware/Camera$Size.width:I
        //    34: istore          4
        //    36: iconst_3       
        //    37: aload_3        
        //    38: getfield        android/hardware/Camera$Size.height:I
        //    41: imul           
        //    42: iconst_4       
        //    43: idiv           
        //    44: istore          5
        //    46: iload           5
        //    48: sipush          320
        //    51: if_icmpge       60
        //    54: aload_3        
        //    55: getfield        android/hardware/Camera$Size.height:I
        //    58: istore          5
        //    60: aload_3        
        //    61: getfield        android/hardware/Camera$Size.width:I
        //    64: iload           4
        //    66: isub           
        //    67: iconst_2       
        //    68: idiv           
        //    69: istore          6
        //    71: aload_3        
        //    72: getfield        android/hardware/Camera$Size.height:I
        //    75: iload           5
        //    77: isub           
        //    78: iconst_2       
        //    79: idiv           
        //    80: istore          7
        //    82: new             Lcom/google/bY;
        //    85: dup            
        //    86: aload_1        
        //    87: aload_3        
        //    88: getfield        android/hardware/Camera$Size.width:I
        //    91: aload_3        
        //    92: getfield        android/hardware/Camera$Size.height:I
        //    95: iload           6
        //    97: iload           7
        //    99: iload           4
        //   101: iload           5
        //   103: iconst_0       
        //   104: invokespecial   com/google/bY.<init>:([BIIIIIIZ)V
        //   107: astore          8
        //   109: aload           8
        //   111: ifnull          365
        //   114: new             Lcom/google/c1;
        //   117: dup            
        //   118: new             Lcom/google/cE;
        //   121: dup            
        //   122: aload           8
        //   124: invokespecial   com/google/cE.<init>:(Lcom/google/b5;)V
        //   127: invokespecial   com/google/c1.<init>:(Lcom/google/cG;)V
        //   130: astore          9
        //   132: aload_0        
        //   133: getfield        com/whatsapp/qrcode/QrCodeActivity.k:Lcom/google/c5;
        //   136: aload           9
        //   138: invokevirtual   com/google/c5.a:(Lcom/google/c1;)Lcom/google/aU;
        //   141: astore          22
        //   143: aload           22
        //   145: astore          12
        //   147: aload_0        
        //   148: getfield        com/whatsapp/qrcode/QrCodeActivity.k:Lcom/google/c5;
        //   151: invokevirtual   com/google/c5.a:()V
        //   154: aload           12
        //   156: ifnull          313
        //   159: aload           12
        //   161: invokevirtual   com/google/aU.a:()Ljava/lang/String;
        //   164: astore          14
        //   166: new             Ljava/lang/StringBuilder;
        //   169: dup            
        //   170: invokespecial   java/lang/StringBuilder.<init>:()V
        //   173: getstatic       com/whatsapp/qrcode/QrCodeActivity.z:[Ljava/lang/String;
        //   176: bipush          6
        //   178: aaload         
        //   179: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   182: aload           14
        //   184: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   187: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   190: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   193: aload           14
        //   195: ifnull          305
        //   198: aload           14
        //   200: aload_0        
        //   201: getfield        com/whatsapp/qrcode/QrCodeActivity.q:Ljava/lang/String;
        //   204: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   207: istore          16
        //   209: iload           16
        //   211: ifne            305
        //   214: aload_0        
        //   215: aload           14
        //   217: putfield        com/whatsapp/qrcode/QrCodeActivity.q:Ljava/lang/String;
        //   220: aload           12
        //   222: invokevirtual   com/google/aU.a:()Ljava/lang/String;
        //   225: invokestatic    com/whatsapp/App.A:(Ljava/lang/String;)Lcom/whatsapp/nh;
        //   228: astore          18
        //   230: aload           18
        //   232: ifnonnull       265
        //   235: aload_0        
        //   236: ldc             2131231258
        //   238: iconst_0       
        //   239: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   242: aload_0        
        //   243: getfield        com/whatsapp/qrcode/QrCodeActivity.v:Lcom/whatsapp/qrcode/QrCodeView;
        //   246: new             Lcom/whatsapp/qrcode/a;
        //   249: dup            
        //   250: aload_0        
        //   251: invokespecial   com/whatsapp/qrcode/a.<init>:(Lcom/whatsapp/qrcode/QrCodeActivity;)V
        //   254: ldc2_w          3000
        //   257: invokevirtual   com/whatsapp/qrcode/QrCodeView.postDelayed:(Ljava/lang/Runnable;J)Z
        //   260: pop            
        //   261: iload_2        
        //   262: ifeq            301
        //   265: aload_0        
        //   266: new             Lcom/whatsapp/qrcode/h;
        //   269: dup            
        //   270: aload_0        
        //   271: invokespecial   com/whatsapp/qrcode/h.<init>:(Lcom/whatsapp/qrcode/QrCodeActivity;)V
        //   274: invokevirtual   com/whatsapp/qrcode/QrCodeActivity.runOnUiThread:(Ljava/lang/Runnable;)V
        //   277: aload_0        
        //   278: aload           18
        //   280: getfield        com/whatsapp/nh.b:Ljava/lang/String;
        //   283: putfield        com/whatsapp/qrcode/QrCodeActivity.p:Ljava/lang/String;
        //   286: aload_0        
        //   287: getfield        com/whatsapp/qrcode/QrCodeActivity.v:Lcom/whatsapp/qrcode/QrCodeView;
        //   290: aload_0        
        //   291: getfield        com/whatsapp/qrcode/QrCodeActivity.w:Ljava/lang/Runnable;
        //   294: ldc2_w          32000
        //   297: invokevirtual   com/whatsapp/qrcode/QrCodeView.postDelayed:(Ljava/lang/Runnable;J)Z
        //   300: pop            
        //   301: iload_2        
        //   302: ifeq            309
        //   305: aload_0        
        //   306: invokespecial   com/whatsapp/qrcode/QrCodeActivity.a:()V
        //   309: iload_2        
        //   310: ifeq            317
        //   313: aload_0        
        //   314: invokespecial   com/whatsapp/qrcode/QrCodeActivity.a:()V
        //   317: return         
        //   318: astore          11
        //   320: aload_0        
        //   321: getfield        com/whatsapp/qrcode/QrCodeActivity.k:Lcom/google/c5;
        //   324: invokevirtual   com/google/c5.a:()V
        //   327: aconst_null    
        //   328: astore          12
        //   330: goto            154
        //   333: astore          10
        //   335: aload_0        
        //   336: getfield        com/whatsapp/qrcode/QrCodeActivity.k:Lcom/google/c5;
        //   339: invokevirtual   com/google/c5.a:()V
        //   342: aload           10
        //   344: athrow         
        //   345: astore          15
        //   347: aload           15
        //   349: athrow         
        //   350: astore          19
        //   352: aload           19
        //   354: athrow         
        //   355: astore          17
        //   357: aload           17
        //   359: athrow         
        //   360: astore          13
        //   362: aload           13
        //   364: athrow         
        //   365: aconst_null    
        //   366: astore          12
        //   368: goto            154
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type           
        //  -----  -----  -----  -----  ---------------
        //  132    143    318    333    Lcom/google/fN;
        //  132    143    333    345    Any
        //  166    193    345    350    Lcom/google/fN;
        //  198    209    345    350    Lcom/google/fN;
        //  235    261    350    355    Lcom/google/fN;
        //  265    301    350    355    Lcom/google/fN;
        //  305    309    355    360    Lcom/google/fN;
        //  313    317    360    365    Lcom/google/fN;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 183, Size: 183
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
    
    static boolean a(final QrCodeActivity qrCodeActivity) {
        return qrCodeActivity.s;
    }
    
    static boolean a(final QrCodeActivity qrCodeActivity, final boolean o) {
        return qrCodeActivity.o = o;
    }
    
    static boolean b(final QrCodeActivity qrCodeActivity) {
        return qrCodeActivity.o;
    }
    
    static boolean b(final QrCodeActivity qrCodeActivity, final boolean s) {
        return qrCodeActivity.s = s;
    }
    
    static Handler c(final QrCodeActivity qrCodeActivity) {
        return qrCodeActivity.n;
    }
    
    static void d(final QrCodeActivity qrCodeActivity) {
        qrCodeActivity.a();
    }
    
    static QrCodeView e(final QrCodeActivity qrCodeActivity) {
        return qrCodeActivity.v;
    }
    
    static String f(final QrCodeActivity qrCodeActivity) {
        return qrCodeActivity.p;
    }
    
    static Camera$PreviewCallback g(final QrCodeActivity qrCodeActivity) {
        return qrCodeActivity.m;
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        Log.i(QrCodeActivity.z[4]);
        this.supportRequestWindowFeature(5);
        super.onCreate(bundle);
        this.getWindow().addFlags(128);
        this.setContentView(alm.a(this.getLayoutInflater(), 2130903207, null, false));
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setSupportProgressBarIndeterminateVisibility(false);
        final HashMap<bj, ArrayList<d3>> hashMap = new HashMap<bj, ArrayList<d3>>();
        final ArrayList<d3> list = new ArrayList<d3>();
        list.add(d3.QR_CODE);
        hashMap.put(bj.POSSIBLE_FORMATS, list);
        (this.t = new HandlerThread(QrCodeActivity.z[1])).start();
        this.n = new Handler(this.t.getLooper());
        this.o = this.getSharedPreferences(QrCodeActivity.z[5], 0).getBoolean(QrCodeActivity.z[3], true);
        (this.v = (QrCodeView)this.findViewById(2131755322)).setCameraCallback(new b(this));
        (this.u = (TextView)this.findViewById(2131755731)).setText((CharSequence)Html.fromHtml(this.getString(2131231502, new Object[] { QrCodeActivity.z[2] })));
        this.findViewById(2131755337).setOnClickListener((View$OnClickListener)new k(this));
        Label_0345: {
            if (this.o) {
                this.findViewById(2131755734).setVisibility(0);
                this.findViewById(2131755732).setVisibility(0);
                this.findViewById(2131755733).setVisibility(8);
                if (QrCodeActivity.r == 0) {
                    break Label_0345;
                }
            }
            this.findViewById(2131755734).setVisibility(8);
            this.findViewById(2131755732).setVisibility(8);
            this.findViewById(2131755733).setVisibility(0);
        }
        l7.b(this.l);
    }
    
    @Override
    protected void onDestroy() {
        Log.i(QrCodeActivity.z[0]);
        super.onDestroy();
        this.t.quit();
        l7.a(this.l);
    }
    
    @Override
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (App.aS == 3 && n == 25) {
            l7.a(this.getBaseContext());
            this.finish();
            return super.onKeyDown(n, keyEvent);
        }
        return super.onKeyDown(n, keyEvent);
    }
}
