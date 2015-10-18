// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.Menu;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.app.Activity;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.whatsapp.util.cq;
import android.view.View$OnClickListener;
import com.whatsapp.fieldstats.aq;
import android.os.Bundle;
import android.widget.AdapterView$AdapterContextMenuInfo;
import android.view.MenuItem;
import android.content.Intent;
import android.os.Messenger;
import com.whatsapp.protocol.b9;
import com.whatsapp.protocol.c2;
import com.whatsapp.protocol.bl;
import java.util.Collection;
import android.content.res.TypedArray;
import com.whatsapp.util.Log;
import android.content.Context;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.fieldstats.a1;
import android.os.Handler$Callback;
import android.view.View;
import android.widget.TextView;
import android.os.Handler;
import java.util.ArrayList;

public class SetStatus extends DialogToastActivity implements aws
{
    static int k;
    static int n;
    static int q;
    static ArrayList r;
    private static SetStatus s;
    private static final String[] z;
    private String l;
    xo m;
    private final Handler o;
    TextView p;
    private final Handler t;
    private View u;
    
    static {
        final String[] z2 = new String[8];
        int n = 0;
        String[] array = z2;
        String s = "\u0017r9B8\u0017";
        int n2 = -1;
        String intern = null;
    Label_0225:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'M';
                        break;
                    }
                    case 0: {
                        c2 = 'd';
                        break;
                    }
                    case 1: {
                        c2 = '\u0006';
                        break;
                    }
                    case 2: {
                        c2 = 'X';
                        break;
                    }
                    case 3: {
                        c2 = '6';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n2) {
                default: {
                    array[n] = intern;
                    s = "\u0017c,E9\u0005r-Eb\u0017r9B8\u0017s(R,\u0010c<\u00199\u0001k(E9\u0005r-Em\ruxX8\bj";
                    n = 1;
                    array = z2;
                    n2 = 0;
                    continue;
                }
                case 0: {
                    array[n] = intern;
                    s = "$uvA%\u0005r+W=\u0014(6S9";
                    n = 2;
                    array = z2;
                    n2 = 1;
                    continue;
                }
                case 1: {
                    array[n] = intern;
                    n = 3;
                    array = z2;
                    s = "\u0017r9B8\u0017";
                    n2 = 2;
                    continue;
                }
                case 2: {
                    array[n] = intern;
                    n = 4;
                    s = "\u0017r9B8\u0017";
                    n2 = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n] = intern;
                    n = 5;
                    s = "\u0007t=W9\u0001)+B,\u0010s+\u0019>\u0001t1W!\r|9B$\u000bh\u0007S?\u0016i*";
                    n2 = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n] = intern;
                    s = "\u0017r9B8\u0017";
                    n2 = 5;
                    n = 6;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n] = intern;
                    n = 7;
                    array = z2;
                    s = "\u0017r9B8\u0017);D(\u0005r=";
                    n2 = 6;
                    continue;
                }
                case 6: {
                    break Label_0225;
                }
            }
        }
        array[n] = intern;
        z = z2;
        SetStatus.n = -1;
        SetStatus.s = null;
        SetStatus.q = 0;
        SetStatus.k = 2;
    }
    
    public SetStatus() {
        this.l = null;
        this.o = new cb(this);
        this.t = new Handler((Handler$Callback)new adr(this));
    }
    
    static void a(final SetStatus setStatus) {
        setStatus.b();
    }
    
    private void b() {
        a5.a((Context)App.aq, a1.STATUS_UPDATE_C, Integer.valueOf(1));
        this.o.removeMessages(0);
        if (this.l != null) {
            App.aB = this.l;
            this.l = null;
            this.o.sendEmptyMessage(1);
            if (!App.I) {
                return;
            }
        }
        Log.e(SetStatus.z[1]);
    }
    
    static void b(final SetStatus setStatus) {
        setStatus.e();
    }
    
    static View c(final SetStatus setStatus) {
        return setStatus.u;
    }
    
    private boolean c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: new             Ljava/io/File;
        //     7: dup            
        //     8: aload_0        
        //     9: invokevirtual   com/whatsapp/SetStatus.getFilesDir:()Ljava/io/File;
        //    12: getstatic       com/whatsapp/SetStatus.z:[Ljava/lang/String;
        //    15: iconst_4       
        //    16: aaload         
        //    17: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    20: invokevirtual   java/io/File.exists:()Z
        //    23: ifeq            145
        //    26: new             Ljava/io/ObjectInputStream;
        //    29: dup            
        //    30: aload_0        
        //    31: getstatic       com/whatsapp/SetStatus.z:[Ljava/lang/String;
        //    34: bipush          6
        //    36: aaload         
        //    37: invokevirtual   com/whatsapp/SetStatus.openFileInput:(Ljava/lang/String;)Ljava/io/FileInputStream;
        //    40: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    43: astore_3       
        //    44: aload_3        
        //    45: invokevirtual   java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
        //    48: checkcast       Ljava/lang/String;
        //    51: astore          6
        //    53: new             Ljava/util/ArrayList;
        //    56: dup            
        //    57: invokespecial   java/util/ArrayList.<init>:()V
        //    60: putstatic       com/whatsapp/SetStatus.r:Ljava/util/ArrayList;
        //    63: aload           6
        //    65: ldc             "\n"
        //    67: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //    70: astore          7
        //    72: aload           7
        //    74: arraylength    
        //    75: istore          8
        //    77: iconst_0       
        //    78: istore          9
        //    80: iload           9
        //    82: iload           8
        //    84: if_icmpge       118
        //    87: aload           7
        //    89: iload           9
        //    91: aaload         
        //    92: astore          10
        //    94: aload           10
        //    96: invokevirtual   java/lang/String.length:()I
        //    99: ifle            111
        //   102: getstatic       com/whatsapp/SetStatus.r:Ljava/util/ArrayList;
        //   105: aload           10
        //   107: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   110: pop            
        //   111: iinc            9, 1
        //   114: iload_1        
        //   115: ifeq            80
        //   118: aload_3        
        //   119: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   122: iconst_1       
        //   123: ireturn        
        //   124: astore          11
        //   126: aload           11
        //   128: athrow         
        //   129: astore_2       
        //   130: getstatic       com/whatsapp/SetStatus.z:[Ljava/lang/String;
        //   133: iconst_5       
        //   134: aaload         
        //   135: aload_2        
        //   136: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   139: aload_3        
        //   140: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   143: iconst_0       
        //   144: ireturn        
        //   145: aconst_null    
        //   146: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   149: goto            143
        //   152: astore          5
        //   154: aconst_null    
        //   155: astore_3       
        //   156: aload           5
        //   158: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   161: aload_3        
        //   162: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   165: goto            143
        //   168: astore          4
        //   170: aconst_null    
        //   171: astore_3       
        //   172: aload_3        
        //   173: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   176: aload           4
        //   178: athrow         
        //   179: astore          4
        //   181: goto            172
        //   184: astore          5
        //   186: goto            156
        //   189: astore_2       
        //   190: aconst_null    
        //   191: astore_3       
        //   192: goto            130
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  4      44     189    195    Ljava/lang/ClassNotFoundException;
        //  4      44     152    156    Ljava/io/IOException;
        //  4      44     168    172    Any
        //  44     77     129    130    Ljava/lang/ClassNotFoundException;
        //  44     77     184    189    Ljava/io/IOException;
        //  44     77     179    184    Any
        //  87     94     129    130    Ljava/lang/ClassNotFoundException;
        //  87     94     184    189    Ljava/io/IOException;
        //  87     94     179    184    Any
        //  94     111    124    129    Ljava/lang/ClassNotFoundException;
        //  94     111    184    189    Ljava/io/IOException;
        //  94     111    179    184    Any
        //  126    129    129    130    Ljava/lang/ClassNotFoundException;
        //  126    129    184    189    Ljava/io/IOException;
        //  126    129    179    184    Any
        //  130    139    179    184    Any
        //  156    161    179    184    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0130:
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
    
    static void d(final SetStatus setStatus) {
        setStatus.f();
    }
    
    private void e() {
        this.o.removeMessages(0);
        this.o.sendEmptyMessage(0);
    }
    
    private void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: new             Ljava/io/ObjectOutputStream;
        //     7: dup            
        //     8: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    11: getstatic       com/whatsapp/SetStatus.z:[Ljava/lang/String;
        //    14: iconst_0       
        //    15: aaload         
        //    16: iconst_0       
        //    17: invokevirtual   com/whatsapp/App.openFileOutput:(Ljava/lang/String;I)Ljava/io/FileOutputStream;
        //    20: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    23: astore_2       
        //    24: new             Ljava/lang/StringBuilder;
        //    27: dup            
        //    28: invokespecial   java/lang/StringBuilder.<init>:()V
        //    31: astore_3       
        //    32: getstatic       com/whatsapp/SetStatus.r:Ljava/util/ArrayList;
        //    35: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    38: astore          7
        //    40: aload           7
        //    42: invokeinterface java/util/Iterator.hasNext:()Z
        //    47: ifeq            74
        //    50: aload_3        
        //    51: aload           7
        //    53: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    58: checkcast       Ljava/lang/String;
        //    61: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    64: ldc             "\n"
        //    66: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    69: pop            
        //    70: iload_1        
        //    71: ifeq            40
        //    74: aload_3        
        //    75: invokevirtual   java/lang/StringBuilder.length:()I
        //    78: iconst_1       
        //    79: if_icmple       93
        //    82: aload_3        
        //    83: iconst_m1      
        //    84: aload_3        
        //    85: invokevirtual   java/lang/StringBuilder.length:()I
        //    88: iadd           
        //    89: invokevirtual   java/lang/StringBuilder.deleteCharAt:(I)Ljava/lang/StringBuilder;
        //    92: pop            
        //    93: aload_2        
        //    94: aload_3        
        //    95: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    98: invokevirtual   java/io/ObjectOutputStream.writeObject:(Ljava/lang/Object;)V
        //   101: aload_2        
        //   102: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   105: return         
        //   106: astore          8
        //   108: aload           8
        //   110: athrow         
        //   111: astore          6
        //   113: aload           6
        //   115: invokevirtual   java/io/FileNotFoundException.printStackTrace:()V
        //   118: aload_2        
        //   119: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   122: return         
        //   123: astore          4
        //   125: aconst_null    
        //   126: astore_2       
        //   127: aload           4
        //   129: invokevirtual   java/io/IOException.printStackTrace:()V
        //   132: aload_2        
        //   133: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   136: return         
        //   137: astore          5
        //   139: aconst_null    
        //   140: astore_2       
        //   141: aload_2        
        //   142: invokestatic    com/whatsapp/util/b8.a:(Ljava/io/Closeable;)V
        //   145: aload           5
        //   147: athrow         
        //   148: astore          5
        //   150: goto            141
        //   153: astore          4
        //   155: goto            127
        //   158: astore          6
        //   160: aconst_null    
        //   161: astore_2       
        //   162: goto            113
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  4      24     158    165    Ljava/io/FileNotFoundException;
        //  4      24     123    127    Ljava/io/IOException;
        //  4      24     137    141    Any
        //  24     40     111    113    Ljava/io/FileNotFoundException;
        //  24     40     153    158    Ljava/io/IOException;
        //  24     40     148    153    Any
        //  40     70     111    113    Ljava/io/FileNotFoundException;
        //  40     70     153    158    Ljava/io/IOException;
        //  40     70     148    153    Any
        //  74     93     106    111    Ljava/io/FileNotFoundException;
        //  74     93     153    158    Ljava/io/IOException;
        //  74     93     148    153    Any
        //  93     101    111    113    Ljava/io/FileNotFoundException;
        //  93     101    153    158    Ljava/io/IOException;
        //  93     101    148    153    Any
        //  108    111    111    113    Ljava/io/FileNotFoundException;
        //  108    111    153    158    Ljava/io/IOException;
        //  108    111    148    153    Any
        //  113    118    148    153    Any
        //  127    132    148    153    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0113:
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
    
    public ArrayList a() {
        final boolean i = App.I;
        final ArrayList<String> list = new ArrayList<String>();
        final TypedArray obtainTypedArray = this.getResources().obtainTypedArray(2131689478);
        int j = 0;
        while (j < obtainTypedArray.length()) {
            list.add(obtainTypedArray.getString(j));
            ++j;
            if (i) {
                break;
            }
        }
        return list;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final String s) {
    }
    
    @Override
    public void a(final Collection collection) {
    }
    
    @Override
    public void b(final String s) {
    }
    
    @Override
    public void c(final String s) {
    }
    
    @Override
    public void d(final String s) {
        this.runOnUiThread((Runnable)new mt(this, s));
    }
    
    public void e(final String l) {
        this.showDialog(2);
        this.l = l;
        if (!App.a(l, new a9m(this), new ir(this), new g9(this))) {
            this.e();
        }
        this.o.sendEmptyMessageDelayed(0, 32000L);
    }
    
    public void g() {
        this.findViewById(2131755513).setVisibility(0);
        this.findViewById(2131755751).setVisibility(8);
        App.a(App.au() + SetStatus.z[2], 0L, new Messenger(this.t));
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        if (n2 == -1) {
            final String stringExtra = intent.getStringExtra(SetStatus.z[3]);
            if (n == SetStatus.q) {
                SetStatus.r.add(0, stringExtra);
                this.e(stringExtra);
            }
            else {
                if (SetStatus.n >= 0) {
                    SetStatus.r.remove(SetStatus.n);
                    SetStatus.r.add(SetStatus.n, stringExtra);
                }
                if (n == SetStatus.k) {
                    this.e(stringExtra);
                }
            }
        }
    }
    
    public boolean onContextItemSelected(final MenuItem menuItem) {
        final AdapterView$AdapterContextMenuInfo adapterView$AdapterContextMenuInfo = (AdapterView$AdapterContextMenuInfo)menuItem.getMenuInfo();
        switch (menuItem.getItemId()) {
            default: {
                return true;
            }
            case 1: {
                SetStatus.r.remove(adapterView$AdapterContextMenuInfo.position);
                SetStatus.n = -1;
                this.m.notifyDataSetChanged();
                this.f();
                return true;
            }
        }
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        Log.i(SetStatus.z[7]);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setContentView(2130903218);
        aam.a(aq.STATUS_VIEWS);
        this.u = this.findViewById(2131755750);
        Label_0077: {
            if (!App.ba) {
                this.g();
                if (!App.I) {
                    break Label_0077;
                }
            }
            this.u.setOnClickListener((View$OnClickListener)new a23(this));
        }
        (this.p = (TextView)this.findViewById(2131755383)).setText(cq.c(App.aB, this.getBaseContext()));
        if (!this.c()) {
            SetStatus.r = this.a();
        }
        final ListView listView = (ListView)this.findViewById(2131755754);
        listView.setEmptyView(this.findViewById(2131755755));
        listView.setAdapter((ListAdapter)(this.m = new xo(this, (Context)this, 2131755756, SetStatus.r)));
        listView.setOnItemClickListener((AdapterView$OnItemClickListener)new zm(this));
        this.registerForContextMenu((View)listView);
        App.b((aws)this);
        SetStatus.s = this;
    }
    
    @Override
    public void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
        contextMenu.add(0, 1, 0, (CharSequence)this.getString(2131231025));
    }
    
    public Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 0: {
                return (Dialog)ProgressDialog.show((Context)this, (CharSequence)this.getString(2131231788), (CharSequence)this.getString(2131231787), true, false);
            }
            case 1: {
                return (Dialog)ProgressDialog.show((Context)this, (CharSequence)this.getString(2131231785), (CharSequence)this.getString(2131231784), true, false);
            }
            case 50: {
                return new ah6(this, 2131230799, App.aB, new ks(this), 139, 0, 2131231415);
            }
            case 2: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setMessage((CharSequence)this.getString(2131231788));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
            case 3: {
                return new AlertDialog$Builder((Context)this).setMessage(2131231009).setPositiveButton(2131231006, (DialogInterface$OnClickListener)new w_(this)).setNegativeButton(2131230874, null).create();
            }
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        menu.add(0, 0, 0, 2131231006).setIcon(2130838787);
        return true;
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        App.a((aws)this);
        if (SetStatus.s == this) {
            SetStatus.s = null;
        }
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        boolean onOptionsItemSelected = true;
        switch (menuItem.getItemId()) {
            default: {
                onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
                break;
            }
            case 0: {
                if (SetStatus.r.size() == 0) {
                    this.a(2131231426);
                    if (!App.I) {
                        break;
                    }
                }
                this.showDialog(3);
                return onOptionsItemSelected;
            }
            case 16908332: {
                this.finish();
                return onOptionsItemSelected;
            }
        }
        return onOptionsItemSelected;
    }
}
