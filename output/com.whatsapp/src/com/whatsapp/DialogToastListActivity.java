// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.os.Handler;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListView;

public class DialogToastListActivity extends DialogToastActivity
{
    private static final String z;
    protected ListView k;
    private AdapterView$OnItemClickListener l;
    private Handler m;
    private boolean n;
    protected ListAdapter o;
    private Runnable p;
    
    static {
        final char[] charArray = "}I\u0014C~GI\u000fE;JRA\\+WRAY?RCAP~hO\u0012E\bMC\u0016\u0011)LI\u0012T~MBAP*PT\bS+PCAX-\u0004\u0001\u0000_:VI\bUpv\b\bUpHO\u0012Ey".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '^';
                    break;
                }
                case 0: {
                    c2 = '$';
                    break;
                }
                case 1: {
                    c2 = '&';
                    break;
                }
                case 2: {
                    c2 = 'a';
                    break;
                }
                case 3: {
                    c2 = '1';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public DialogToastListActivity() {
        this.m = new Handler();
        this.n = false;
        this.p = new am(this);
        this.l = (AdapterView$OnItemClickListener)new xy(this);
    }
    
    private void b() {
        try {
            if (this.k != null) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        this.setContentView(17367060);
    }
    
    public void a(final ListAdapter listAdapter) {
        synchronized (this) {
            this.b();
            this.o = listAdapter;
            this.k.setAdapter(listAdapter);
        }
    }
    
    protected void a(final ListView listView, final View view, final int n, final long n2) {
    }
    
    public ListView c() {
        this.b();
        return this.k;
    }
    
    @Override
    protected void onDestroy() {
        this.m.removeCallbacks(this.p);
        super.onDestroy();
    }
    
    protected void onRestoreInstanceState(final Bundle bundle) {
        this.b();
        super.onRestoreInstanceState(bundle);
    }
    
    @Override
    public void onSupportContentChanged() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/whatsapp/DialogToastActivity.onSupportContentChanged:()V
        //     4: aload_0        
        //     5: ldc             16908292
        //     7: invokevirtual   com/whatsapp/DialogToastListActivity.findViewById:(I)Landroid/view/View;
        //    10: astore_1       
        //    11: aload_0        
        //    12: aload_0        
        //    13: ldc             16908298
        //    15: invokevirtual   com/whatsapp/DialogToastListActivity.findViewById:(I)Landroid/view/View;
        //    18: checkcast       Landroid/widget/ListView;
        //    21: putfield        com/whatsapp/DialogToastListActivity.k:Landroid/widget/ListView;
        //    24: aload_0        
        //    25: getfield        com/whatsapp/DialogToastListActivity.k:Landroid/widget/ListView;
        //    28: ifnonnull       45
        //    31: new             Ljava/lang/RuntimeException;
        //    34: dup            
        //    35: getstatic       com/whatsapp/DialogToastListActivity.z:Ljava/lang/String;
        //    38: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //    41: athrow         
        //    42: astore_2       
        //    43: aload_2        
        //    44: athrow         
        //    45: aload_1        
        //    46: ifnull          57
        //    49: aload_0        
        //    50: getfield        com/whatsapp/DialogToastListActivity.k:Landroid/widget/ListView;
        //    53: aload_1        
        //    54: invokevirtual   android/widget/ListView.setEmptyView:(Landroid/view/View;)V
        //    57: aload_0        
        //    58: getfield        com/whatsapp/DialogToastListActivity.k:Landroid/widget/ListView;
        //    61: aload_0        
        //    62: getfield        com/whatsapp/DialogToastListActivity.l:Landroid/widget/AdapterView$OnItemClickListener;
        //    65: invokevirtual   android/widget/ListView.setOnItemClickListener:(Landroid/widget/AdapterView$OnItemClickListener;)V
        //    68: aload_0        
        //    69: getfield        com/whatsapp/DialogToastListActivity.n:Z
        //    72: ifeq            83
        //    75: aload_0        
        //    76: aload_0        
        //    77: getfield        com/whatsapp/DialogToastListActivity.o:Landroid/widget/ListAdapter;
        //    80: invokevirtual   com/whatsapp/DialogToastListActivity.a:(Landroid/widget/ListAdapter;)V
        //    83: aload_0        
        //    84: getfield        com/whatsapp/DialogToastListActivity.m:Landroid/os/Handler;
        //    87: aload_0        
        //    88: getfield        com/whatsapp/DialogToastListActivity.p:Ljava/lang/Runnable;
        //    91: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    94: pop            
        //    95: aload_0        
        //    96: iconst_1       
        //    97: putfield        com/whatsapp/DialogToastListActivity.n:Z
        //   100: return         
        //   101: astore          5
        //   103: aload           5
        //   105: athrow         
        //   106: astore_3       
        //   107: aload_3        
        //   108: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  11     42     42     45     Ljava/lang/RuntimeException;
        //  49     57     101    106    Ljava/lang/RuntimeException;
        //  57     83     106    109    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0057:
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
