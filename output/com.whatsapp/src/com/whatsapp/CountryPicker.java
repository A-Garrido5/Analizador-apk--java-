// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MenuItem;
import com.whatsapp.util.Log;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageButton;
import android.widget.EditText;
import android.text.TextWatcher;

public class CountryPicker extends DialogToastListActivity
{
    public static final String q;
    public static final String v;
    private static final String[] z;
    private TextWatcher r;
    private EditText s;
    private alo t;
    private ImageButton u;
    
    static {
        int n = -1;
        final String[] z2 = new String[3];
        int n2 = 0;
        String[] array = z2;
        String s = "\u001c\u000f\u001c#\u001a\r\u0019\u0019$\r\u0014\u0005\u001bb\n\u001a\u0013\u001d?\u0001\u0006";
        int n3 = n;
        String intern = null;
    Label_0118:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n4 = 0; i > n4; ++n4) {
                final char c = charArray[n4];
                char c2 = '\0';
                switch (n4 % 5) {
                    default: {
                        c2 = 'n';
                        break;
                    }
                    case 0: {
                        c2 = '\u007f';
                        break;
                    }
                    case 1: {
                        c2 = '`';
                        break;
                    }
                    case 2: {
                        c2 = 'i';
                        break;
                    }
                    case 3: {
                        c2 = 'M';
                        break;
                    }
                }
                charArray[n4] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n3) {
                default: {
                    array[n2] = intern;
                    s = "\u001c\u000f\u001c#\u001a\r\u0019\u0019$\r\u0014\u0005\u001bb\u0001\u0011\u0003\u001b(\u000f\u000b\u0005I?\u000b\u001c\u0005\u0000;\u000b\u001b@ \u0002+\u0007\u0003\f=\u001a\u0016\u000f\u0007m\b\r\u000f\u0004m-\u0010\u0015\u00079\u001c\u00060\u0001\"\u0000\u001a)\u0007+\u0001";
                    n2 = 1;
                    array = z2;
                    n3 = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u001c\u000f\u001c#\u001a\r\u0019\u0019$\r\u0014\u0005\u001bb\r\r\u0005\b9\u000b";
                    n3 = 1;
                    continue;
                }
                case 1: {
                    break Label_0118;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        StringBuilder append = new StringBuilder().append(CountryPicker.class.getName());
        String s2 = "Q%1\u0019<>?*\u0002;14;\u0014163&";
        String intern2 = null;
    Label_0429:
        while (true) {
            final char[] charArray2 = s2.toCharArray();
            for (int j = charArray2.length, n5 = 0; j > n5; ++n5) {
                final char c3 = charArray2[n5];
                char c4 = '\0';
                switch (n5 % 5) {
                    default: {
                        c4 = 'n';
                        break;
                    }
                    case 0: {
                        c4 = '\u007f';
                        break;
                    }
                    case 1: {
                        c4 = '`';
                        break;
                    }
                    case 2: {
                        c4 = 'i';
                        break;
                    }
                    case 3: {
                        c4 = 'M';
                        break;
                    }
                }
                charArray2[n5] = (char)(c4 ^ c3);
            }
            intern2 = new String(charArray2).intern();
            switch (n) {
                default: {
                    v = append.append(intern2).toString();
                    final StringBuilder append2 = new StringBuilder().append(CountryPicker.class.getName());
                    s2 = "Q%1\u0019<>?*\u0002;14;\u00141;):\u001d\">96\u0003/2%";
                    append = append2;
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0429;
                }
            }
        }
        q = append.append(intern2).toString();
    }
    
    public CountryPicker() {
        this.r = (TextWatcher)new eh(this);
    }
    
    static alo a(final CountryPicker countryPicker) {
        return countryPicker.t;
    }
    
    static ImageButton b(final CountryPicker countryPicker) {
        return countryPicker.u;
    }
    
    static EditText c(final CountryPicker countryPicker) {
        return countryPicker.s;
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        }
        catch (IllegalArgumentException ex) {
            return false;
        }
    }
    
    @Override
    public void onBackPressed() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/CountryPicker.s:Landroid/widget/EditText;
        //     4: invokevirtual   android/widget/EditText.getText:()Landroid/text/Editable;
        //     7: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    10: istore_3       
        //    11: iload_3        
        //    12: ifne            30
        //    15: aload_0        
        //    16: getfield        com/whatsapp/CountryPicker.s:Landroid/widget/EditText;
        //    19: ldc             ""
        //    21: invokevirtual   android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
        //    24: getstatic       com/whatsapp/App.I:Z
        //    27: ifeq            41
        //    30: aload_0        
        //    31: invokespecial   com/whatsapp/DialogToastListActivity.onBackPressed:()V
        //    34: return         
        //    35: astore_1       
        //    36: aload_1        
        //    37: athrow         
        //    38: astore_2       
        //    39: aload_2        
        //    40: athrow         
        //    41: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      11     35     38     Ljava/lang/IllegalArgumentException;
        //  15     30     38     41     Ljava/lang/IllegalArgumentException;
        //  30     34     38     41     Ljava/lang/IllegalArgumentException;
        //  36     38     38     41     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0030:
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
    
    public void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/CountryPicker.z:[Ljava/lang/String;
        //     7: iconst_2       
        //     8: aaload         
        //     9: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    12: aload_0        
        //    13: aload_1        
        //    14: invokespecial   com/whatsapp/DialogToastListActivity.onCreate:(Landroid/os/Bundle;)V
        //    17: aload_0        
        //    18: invokevirtual   com/whatsapp/CountryPicker.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    21: iconst_1       
        //    22: invokevirtual   android/support/v7/app/ActionBar.setDisplayHomeAsUpEnabled:(Z)V
        //    25: aload_0        
        //    26: ldc             2130903142
        //    28: invokevirtual   com/whatsapp/CountryPicker.setContentView:(I)V
        //    31: new             Ljava/util/ArrayList;
        //    34: dup            
        //    35: invokespecial   java/util/ArrayList.<init>:()V
        //    38: astore_3       
        //    39: invokestatic    com/whatsapp/vi.a:()Ljava/util/ArrayList;
        //    42: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    45: astore          15
        //    47: aload           15
        //    49: invokeinterface java/util/Iterator.hasNext:()Z
        //    54: ifeq            108
        //    57: aload           15
        //    59: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    64: checkcast       Lcom/whatsapp/a2d;
        //    67: astore          16
        //    69: aload_3        
        //    70: new             Lcom/whatsapp/t6;
        //    73: dup            
        //    74: aload           16
        //    76: getfield        com/whatsapp/a2d.e:Ljava/lang/String;
        //    79: aload           16
        //    81: getfield        com/whatsapp/a2d.j:I
        //    84: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    87: aload           16
        //    89: getfield        com/whatsapp/a2d.l:Ljava/lang/String;
        //    92: aload           16
        //    94: getfield        com/whatsapp/a2d.c:Ljava/lang/String;
        //    97: invokespecial   com/whatsapp/t6.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   100: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   103: pop            
        //   104: iload_2        
        //   105: ifeq            47
        //   108: aload_0        
        //   109: invokevirtual   com/whatsapp/CountryPicker.c:()Landroid/widget/ListView;
        //   112: astore          5
        //   114: aload_0        
        //   115: invokevirtual   com/whatsapp/CountryPicker.getLayoutInflater:()Landroid/view/LayoutInflater;
        //   118: ldc             2130903194
        //   120: aload           5
        //   122: iconst_0       
        //   123: invokevirtual   android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //   126: astore          6
        //   128: aload           5
        //   130: aload           6
        //   132: invokevirtual   android/widget/ListView.addHeaderView:(Landroid/view/View;)V
        //   135: aload_0        
        //   136: aload           6
        //   138: ldc             2131755681
        //   140: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   143: checkcast       Landroid/widget/EditText;
        //   146: putfield        com/whatsapp/CountryPicker.s:Landroid/widget/EditText;
        //   149: aload_0        
        //   150: getfield        com/whatsapp/CountryPicker.s:Landroid/widget/EditText;
        //   153: aload_0        
        //   154: getfield        com/whatsapp/CountryPicker.r:Landroid/text/TextWatcher;
        //   157: invokevirtual   android/widget/EditText.addTextChangedListener:(Landroid/text/TextWatcher;)V
        //   160: aload_0        
        //   161: getfield        com/whatsapp/CountryPicker.s:Landroid/widget/EditText;
        //   164: invokestatic    com/whatsapp/alm.a:(Landroid/widget/TextView;)V
        //   167: aload_0        
        //   168: getfield        com/whatsapp/CountryPicker.s:Landroid/widget/EditText;
        //   171: aload_0        
        //   172: invokevirtual   com/whatsapp/CountryPicker.getResources:()Landroid/content/res/Resources;
        //   175: ldc             2131361822
        //   177: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   180: aload_0        
        //   181: invokevirtual   com/whatsapp/CountryPicker.getResources:()Landroid/content/res/Resources;
        //   184: ldc             2131361822
        //   186: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   189: invokestatic    com/whatsapp/alm.a:(Landroid/view/View;II)V
        //   192: aload_0        
        //   193: aload           6
        //   195: ldc             2131755682
        //   197: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   200: checkcast       Landroid/widget/ImageButton;
        //   203: putfield        com/whatsapp/CountryPicker.u:Landroid/widget/ImageButton;
        //   206: aload_0        
        //   207: getfield        com/whatsapp/CountryPicker.u:Landroid/widget/ImageButton;
        //   210: new             Lcom/whatsapp/kv;
        //   213: dup            
        //   214: aload_0        
        //   215: invokespecial   com/whatsapp/kv.<init>:(Lcom/whatsapp/CountryPicker;)V
        //   218: invokevirtual   android/widget/ImageButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   221: aload_0        
        //   222: new             Lcom/whatsapp/alo;
        //   225: dup            
        //   226: aload_0        
        //   227: ldc_w           2130903143
        //   230: aload_3        
        //   231: aload_0        
        //   232: invokevirtual   com/whatsapp/CountryPicker.getIntent:()Landroid/content/Intent;
        //   235: getstatic       com/whatsapp/CountryPicker.v:Ljava/lang/String;
        //   238: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   241: aload_0        
        //   242: invokevirtual   com/whatsapp/CountryPicker.getIntent:()Landroid/content/Intent;
        //   245: getstatic       com/whatsapp/CountryPicker.q:Ljava/lang/String;
        //   248: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   251: invokespecial   com/whatsapp/alo.<init>:(Landroid/content/Context;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;)V
        //   254: putfield        com/whatsapp/CountryPicker.t:Lcom/whatsapp/alo;
        //   257: aload_0        
        //   258: aload_0        
        //   259: getfield        com/whatsapp/CountryPicker.t:Lcom/whatsapp/alo;
        //   262: invokevirtual   com/whatsapp/CountryPicker.a:(Landroid/widget/ListAdapter;)V
        //   265: aload           5
        //   267: new             Lcom/whatsapp/a6v;
        //   270: dup            
        //   271: aload_0        
        //   272: invokespecial   com/whatsapp/a6v.<init>:(Lcom/whatsapp/CountryPicker;)V
        //   275: invokevirtual   android/widget/ListView.setOnItemClickListener:(Landroid/widget/AdapterView$OnItemClickListener;)V
        //   278: aload           5
        //   280: iconst_1       
        //   281: invokevirtual   android/widget/ListView.setFastScrollEnabled:(Z)V
        //   284: aload           5
        //   286: iconst_1       
        //   287: invokevirtual   android/widget/ListView.setScrollbarFadingEnabled:(Z)V
        //   290: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   293: istore          12
        //   295: iload           12
        //   297: bipush          11
        //   299: if_icmplt       358
        //   302: aload           5
        //   304: iconst_1       
        //   305: invokevirtual   android/widget/ListView.setFastScrollAlwaysVisible:(Z)V
        //   308: aload           5
        //   310: ldc_w           33554432
        //   313: invokevirtual   android/widget/ListView.setScrollBarStyle:(I)V
        //   316: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   319: istore          13
        //   321: iload           13
        //   323: bipush          11
        //   325: if_icmplt       366
        //   328: getstatic       com/whatsapp/App.W:Z
        //   331: istore          14
        //   333: iload           14
        //   335: ifeq            348
        //   338: aload           5
        //   340: iconst_1       
        //   341: invokevirtual   android/widget/ListView.setVerticalScrollbarPosition:(I)V
        //   344: iload_2        
        //   345: ifeq            366
        //   348: aload           5
        //   350: iconst_2       
        //   351: invokevirtual   android/widget/ListView.setVerticalScrollbarPosition:(I)V
        //   354: iload_2        
        //   355: ifeq            366
        //   358: aload           5
        //   360: ldc_w           2130839068
        //   363: invokevirtual   android/widget/ListView.setSelector:(I)V
        //   366: return         
        //   367: astore          4
        //   369: getstatic       com/whatsapp/CountryPicker.z:[Ljava/lang/String;
        //   372: iconst_1       
        //   373: aaload         
        //   374: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   377: aload_3        
        //   378: invokevirtual   java/util/ArrayList.clear:()V
        //   381: goto            108
        //   384: astore          7
        //   386: aload           7
        //   388: athrow         
        //   389: astore          8
        //   391: aload           8
        //   393: athrow         
        //   394: astore          9
        //   396: aload           9
        //   398: athrow         
        //   399: astore          10
        //   401: aload           10
        //   403: athrow         
        //   404: astore          11
        //   406: aload           11
        //   408: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  39     47     367    384    Ljava/io/IOException;
        //  47     104    367    384    Ljava/io/IOException;
        //  128    295    384    389    Ljava/io/IOException;
        //  302    321    389    394    Ljava/io/IOException;
        //  328    333    394    399    Ljava/io/IOException;
        //  338    344    399    404    Ljava/io/IOException;
        //  348    354    404    409    Ljava/io/IOException;
        //  358    366    404    409    Ljava/io/IOException;
        //  386    389    389    394    Ljava/io/IOException;
        //  391    394    394    399    Ljava/io/IOException;
        //  396    399    399    404    Ljava/io/IOException;
        //  401    404    404    409    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 187, Size: 187
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
    
    @Override
    protected void onDestroy() {
        Log.i(CountryPicker.z[0]);
        this.s.removeTextChangedListener(this.r);
        super.onDestroy();
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case 16908332: {
                    this.finish();
                    return true;
                }
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        return false;
    }
}
