// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.widget.AdapterView$AdapterContextMenuInfo;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View;
import android.widget.ListAdapter;
import java.util.List;
import android.content.Context;
import android.graphics.Paint;
import com.whatsapp.util.t;
import android.widget.TextView;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.NoSuchElementException;
import android.app.Activity;
import android.content.Intent;
import java.util.Collection;
import java.util.ArrayList;

public class BlockList extends DialogToastListActivity implements aws
{
    private static final String[] z;
    public boolean q;
    ArrayList r;
    private a9q s;
    awt t;
    
    static {
        final String[] z2 = new String[3];
        String s = "NW\u000b\u0010XsX\u000b\u001dGMX\u0010";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '3';
                        break;
                    }
                    case 0: {
                        c2 = ',';
                        break;
                    }
                    case 1: {
                        c2 = ';';
                        break;
                    }
                    case 2: {
                        c2 = 'd';
                        break;
                    }
                    case 3: {
                        c2 = 's';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "NW\u000b\u0010XI_;\u001fZ_O";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "OT\n\u0007ROO";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public BlockList() {
        this.r = new ArrayList();
        this.q = false;
        this.s = new a9q();
    }
    
    static a9q a(final BlockList list) {
        return list.s;
    }
    
    private void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/BlockList.r:Ljava/util/ArrayList;
        //     8: invokevirtual   java/util/ArrayList.clear:()V
        //    11: getstatic       com/whatsapp/App.as:Ljava/util/Hashtable;
        //    14: invokevirtual   java/util/Hashtable.keys:()Ljava/util/Enumeration;
        //    17: astore_2       
        //    18: aload_2        
        //    19: invokeinterface java/util/Enumeration.hasMoreElements:()Z
        //    24: ifeq            97
        //    27: aload_2        
        //    28: invokeinterface java/util/Enumeration.nextElement:()Ljava/lang/Object;
        //    33: checkcast       Ljava/lang/String;
        //    36: astore          4
        //    38: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    41: aload           4
        //    43: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    46: astore          5
        //    48: aload           5
        //    50: ifnull          67
        //    53: aload_0        
        //    54: getfield        com/whatsapp/BlockList.r:Ljava/util/ArrayList;
        //    57: aload           5
        //    59: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    62: pop            
        //    63: iload_1        
        //    64: ifeq            18
        //    67: aload_0        
        //    68: getfield        com/whatsapp/BlockList.r:Ljava/util/ArrayList;
        //    71: new             Lcom/whatsapp/a_9;
        //    74: dup            
        //    75: aload           4
        //    77: invokespecial   com/whatsapp/a_9.<init>:(Ljava/lang/String;)V
        //    80: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    83: pop            
        //    84: goto            18
        //    87: astore          6
        //    89: aload           6
        //    91: athrow         
        //    92: astore_3       
        //    93: iload_1        
        //    94: ifeq            18
        //    97: aload_0        
        //    98: getfield        com/whatsapp/BlockList.r:Ljava/util/ArrayList;
        //   101: new             Lcom/whatsapp/mg;
        //   104: dup            
        //   105: aload_0        
        //   106: invokevirtual   com/whatsapp/BlockList.getApplicationContext:()Landroid/content/Context;
        //   109: invokespecial   com/whatsapp/mg.<init>:(Landroid/content/Context;)V
        //   112: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   115: return         
        //   116: astore          8
        //   118: aload           8
        //   120: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  27     48     92     97     Ljava/util/NoSuchElementException;
        //  53     63     116    121    Ljava/util/NoSuchElementException;
        //  67     84     87     92     Ljava/util/NoSuchElementException;
        //  89     92     92     97     Ljava/util/NoSuchElementException;
        //  118    121    87     92     Ljava/util/NoSuchElementException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0067:
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
    
    private void f() {
        this.e();
        this.t.notifyDataSetChanged();
    }
    
    @Override
    public void a() {
        this.f();
    }
    
    @Override
    public void a(final String s) {
    }
    
    @Override
    public void a(final Collection collection) {
        this.f();
    }
    
    @Override
    public void b(final String s) {
        this.f();
    }
    
    @Override
    public void c(final String s) {
    }
    
    @Override
    public void d(final String s) {
        this.f();
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        if (n2 != -1 || n != 3) {
            return;
        }
        try {
            if (App.a(this, true, intent.getStringExtra(BlockList.z[2]))) {
                this.q = true;
            }
        }
        catch (NoSuchElementException ex) {
            throw ex;
        }
    }
    
    public boolean onContextItemSelected(final MenuItem p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokeinterface android/view/MenuItem.getMenuInfo:()Landroid/view/ContextMenu$ContextMenuInfo;
        //     6: checkcast       Landroid/widget/AdapterView$AdapterContextMenuInfo;
        //     9: astore_2       
        //    10: aload_0        
        //    11: invokevirtual   com/whatsapp/BlockList.c:()Landroid/widget/ListView;
        //    14: aload_2        
        //    15: getfield        android/widget/AdapterView$AdapterContextMenuInfo.position:I
        //    18: invokevirtual   android/widget/ListView.getItemAtPosition:(I)Ljava/lang/Object;
        //    21: checkcast       Lcom/whatsapp/a_9;
        //    24: astore_3       
        //    25: aload_1        
        //    26: invokeinterface android/view/MenuItem.getItemId:()I
        //    31: istore          6
        //    33: iload           6
        //    35: tableswitch {
        //                0: 58
        //          default: 52
        //        }
        //    52: aload_0        
        //    53: aload_1        
        //    54: invokespecial   com/whatsapp/DialogToastListActivity.onContextItemSelected:(Landroid/view/MenuItem;)Z
        //    57: ireturn        
        //    58: aload_0        
        //    59: iconst_0       
        //    60: aload_3        
        //    61: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //    64: invokestatic    com/whatsapp/App.a:(Landroid/app/Activity;ZLjava/lang/String;)Z
        //    67: ifeq            88
        //    70: aload_0        
        //    71: iconst_0       
        //    72: putfield        com/whatsapp/BlockList.q:Z
        //    75: goto            88
        //    78: astore          4
        //    80: aload           4
        //    82: athrow         
        //    83: astore          5
        //    85: aload           5
        //    87: athrow         
        //    88: iconst_1       
        //    89: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  25     33     78     83     Ljava/util/NoSuchElementException;
        //  58     75     83     88     Ljava/util/NoSuchElementException;
        //  80     83     83     88     Ljava/util/NoSuchElementException;
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
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setContentView(2130903081);
        final TextView textView = (TextView)this.findViewById(2131755291);
        textView.setText(com.whatsapp.util.t.a(this.getResources().getString(2131230841), this.getResources().getDrawable(2130838735), (Paint)textView.getPaint()));
        this.e();
        this.a((ListAdapter)(this.t = new awt(this, (Context)this, 2130903104, this.r)));
        this.c().setEmptyView(this.findViewById(2131755290));
        this.registerForContextMenu((View)this.c());
        this.c().setOnItemClickListener((AdapterView$OnItemClickListener)new at_(this));
        App.b((aws)this);
    }
    
    @Override
    public void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        final a_9 a_9 = (a_9)this.c().getItemAtPosition(((AdapterView$AdapterContextMenuInfo)contextMenu$ContextMenuInfo).position);
        super.onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
        contextMenu.add(0, 0, 0, (CharSequence)String.format(this.getString(2131230843), a_9.a((Context)this)));
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 0, 0, 2131231300).setIcon(2130838708), 2);
        return super.onCreateOptionsMenu(menu);
    }
    
    public void onDestroy() {
        super.onDestroy();
        this.s.a();
        App.a((aws)this);
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        final boolean i = App.I;
        switch (menuItem.getItemId()) {
            default: {
                return true;
            }
            case 0: {
                final Intent intent = new Intent((Context)this, (Class)ContactPicker.class);
                final StringBuilder sb = new StringBuilder();
                final Iterator<a_9> iterator = this.r.iterator();
                while (iterator.hasNext()) {
                    sb.append(iterator.next().u).append(",");
                    if (i) {
                        break;
                    }
                }
                intent.putExtra(BlockList.z[0], true);
                intent.putExtra(BlockList.z[1], sb.toString());
                this.startActivityForResult(intent, 3);
                return true;
            }
            case 16908332: {
                this.finish();
                return true;
            }
        }
    }
    
    public void onPause() {
        super.onPause();
    }
    
    public void onResume() {
        super.onResume();
    }
}
