// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewGroup;
import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.protocol.bi;
import android.database.Cursor;
import android.content.Context;
import android.widget.CursorAdapter;

class nm extends CursorAdapter
{
    private static final String[] z;
    final Conversation a;
    private int b;
    private Object c;
    
    static {
        final String[] z2 = new String[9];
        String s = ";\u0015}\u001ff*\tr\u001dj7\u0014r\rb(\u000ev\u001b,6\u001fdIs9\br\u0004#1\t3\u0007v4\u00162";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0003';
                        break;
                    }
                    case 0: {
                        c2 = 'X';
                        break;
                    }
                    case 1: {
                        c2 = 'z';
                        break;
                    }
                    case 2: {
                        c2 = '\u0013';
                        break;
                    }
                    case 3: {
                        c2 = 'i';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ";\u0015}\u001ff*\tr\u001dj7\u0014r\rb(\u000ev\u001b,?\u001fg\u0000w=\u0017<\u0019l+\u0013g\u0000l6Uz\u0007u9\u0016z\r#";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "xR";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "qZ3\u001aj\"\u001f)";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "<\u000f~\u0004zx\u0017`\u000e\"";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = ";\u0015}\u001ff*\tr\u001dj7\u0014<\bg2\u000f`\u001d`9\u0019{\f,9\nc\fm<\u001fw";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = ";\u0015}\u001ff*\tr\u001dj7\u0014<\u000ef,\fz\ftw\b|\u001e#1\t3\u0007v4\u00162In+\u001d.";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "4\u001bj\u0006v,%z\u0007e4\u001bg\fq";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "(\bv\u001af6\u000ez\u0007dx\u0019r\u0005ox\u0016|\u000e#1\u00143\nl6\fv\u001bp9\u000ez\u0006mx\nr\u000ef";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public nm(final Conversation a, final Context context, final Cursor cursor, final boolean b) {
        this.a = a;
        super(context, cursor, b);
    }
    
    private int a() {
        return this.getCursor().getCount() - Conversation.E(this.a);
    }
    
    static int a(final nm nm) {
        return nm.a();
    }
    
    private void a(final int n) {
        final boolean i = App.I;
        final int count = this.getCursor().getCount();
        while (true) {
            int n3 = 0;
            Label_0079: {
                if (n >= count) {
                    break Label_0079;
                }
                final int n2 = n;
                Label_0075: {
                    if (n2 >= count) {
                        break Label_0075;
                    }
                    Label_0065: {
                        if (Conversation.R(this.a).get(n2) == null) {
                            break Label_0065;
                        }
                        try {
                            Conversation.R(this.a).remove(n2);
                            n3 = n2 + 1;
                            if (i) {
                                if (i) {
                                    Log.w(nm.z[5]);
                                    Conversation.t(this.a).remove(n - count);
                                }
                                return;
                            }
                        }
                        catch (IllegalStateException ex) {
                            throw ex;
                        }
                    }
                }
            }
            final int n2 = n3;
            continue;
        }
    }
    
    static void a(final nm nm, final int n) {
        nm.a(n);
    }
    
    public void bindView(final View view, final Context context, final Cursor cursor) {
    }
    
    public int getCount() {
        Label_0027: {
            try {
                if (!Conversation.Z(this.a)) {
                    return 0;
                }
                final nm nm = this;
                final Cursor cursor = nm.getCursor();
                if (cursor == null) {
                    final boolean b = false;
                    return b ? 1 : 0;
                }
                break Label_0027;
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            try {
                final nm nm = this;
                final Cursor cursor = nm.getCursor();
                if (cursor == null) {
                    final boolean b = false;
                    return b ? 1 : 0;
                }
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
            try {
                final int n = this.getCursor().getCount() + Conversation.t(this.a).size();
                final int e = Conversation.E(this.a);
                int n2 = 0;
                if (e > 0) {
                    n2 = 1;
                }
                return n2 + n;
            }
            catch (IllegalStateException ex3) {
                throw ex3;
            }
        }
        return 0;
    }
    
    public Object getItem(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   com/whatsapp/nm.getCursor:()Landroid/database/Cursor;
        //     4: invokeinterface android/database/Cursor.getCount:()I
        //     9: istore_2       
        //    10: aload_0        
        //    11: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //    14: invokestatic    com/whatsapp/Conversation.E:(Lcom/whatsapp/Conversation;)I
        //    17: istore          4
        //    19: iconst_0       
        //    20: istore          5
        //    22: iload           4
        //    24: ifle            30
        //    27: iconst_1       
        //    28: istore          5
        //    30: iload_1        
        //    31: iload           5
        //    33: isub           
        //    34: iload_2        
        //    35: if_icmpge       357
        //    38: aload_0        
        //    39: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //    42: invokestatic    com/whatsapp/Conversation.R:(Lcom/whatsapp/Conversation;)Ljava/util/HashMap;
        //    45: iload_1        
        //    46: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    49: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    52: checkcast       Lcom/whatsapp/protocol/bi;
        //    55: astore          11
        //    57: aload           11
        //    59: ifnonnull       119
        //    62: aload_0        
        //    63: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //    66: invokestatic    com/whatsapp/Conversation.E:(Lcom/whatsapp/Conversation;)I
        //    69: istore          15
        //    71: iload           15
        //    73: ifle            140
        //    76: aload_0        
        //    77: invokespecial   com/whatsapp/nm.a:()I
        //    80: istore          28
        //    82: iload_1        
        //    83: iload           28
        //    85: if_icmpne       140
        //    88: aload_0        
        //    89: getfield        com/whatsapp/nm.c:Ljava/lang/Object;
        //    92: ifnonnull       113
        //    95: aload_0        
        //    96: new             Lcom/whatsapp/protocol/bi;
        //    99: dup            
        //   100: aconst_null    
        //   101: getstatic       com/whatsapp/nm.z:[Ljava/lang/String;
        //   104: iconst_4       
        //   105: aaload         
        //   106: aconst_null    
        //   107: invokespecial   com/whatsapp/protocol/bi.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
        //   110: putfield        com/whatsapp/nm.c:Ljava/lang/Object;
        //   113: aload_0        
        //   114: getfield        com/whatsapp/nm.c:Ljava/lang/Object;
        //   117: astore          11
        //   119: aload           11
        //   121: areturn        
        //   122: astore_3       
        //   123: aload_3        
        //   124: athrow         
        //   125: astore          12
        //   127: aload           12
        //   129: athrow         
        //   130: astore          13
        //   132: aload           13
        //   134: athrow         
        //   135: astore          14
        //   137: aload           14
        //   139: athrow         
        //   140: aload_0        
        //   141: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   144: invokestatic    com/whatsapp/Conversation.E:(Lcom/whatsapp/Conversation;)I
        //   147: ifle            173
        //   150: aload_0        
        //   151: invokespecial   com/whatsapp/nm.a:()I
        //   154: istore          27
        //   156: iload_1        
        //   157: iload           27
        //   159: if_icmple       173
        //   162: iload_1        
        //   163: iconst_1       
        //   164: isub           
        //   165: istore          17
        //   167: getstatic       com/whatsapp/App.I:Z
        //   170: ifeq            176
        //   173: iload_1        
        //   174: istore          17
        //   176: aload_0        
        //   177: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   180: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   183: invokevirtual   com/whatsapp/nm.getCursor:()Landroid/database/Cursor;
        //   186: invokeinterface android/database/Cursor.getPosition:()I
        //   191: istore          18
        //   193: aload_0        
        //   194: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   197: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   200: invokevirtual   com/whatsapp/nm.getCursor:()Landroid/database/Cursor;
        //   203: iload_2        
        //   204: iconst_1       
        //   205: isub           
        //   206: iload           17
        //   208: isub           
        //   209: invokeinterface android/database/Cursor.moveToPosition:(I)Z
        //   214: pop            
        //   215: aload_0        
        //   216: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   219: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   222: invokevirtual   com/whatsapp/nm.getCursor:()Landroid/database/Cursor;
        //   225: invokeinterface android/database/Cursor.getPosition:()I
        //   230: istore          20
        //   232: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   235: aload_0        
        //   236: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   239: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   242: invokevirtual   com/whatsapp/nm.getCursor:()Landroid/database/Cursor;
        //   245: aload_0        
        //   246: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   249: getfield        com/whatsapp/Conversation.I:Ljava/lang/String;
        //   252: invokevirtual   com/whatsapp/vy.a:(Landroid/database/Cursor;Ljava/lang/String;)Lcom/whatsapp/protocol/bi;
        //   255: astore          21
        //   257: iload           20
        //   259: iload           18
        //   261: if_icmpge       322
        //   264: aload_0        
        //   265: getfield        com/whatsapp/nm.b:I
        //   268: istore          25
        //   270: iload           20
        //   272: iload           25
        //   274: if_icmple       289
        //   277: iload           20
        //   279: bipush          50
        //   281: aload_0        
        //   282: getfield        com/whatsapp/nm.b:I
        //   285: iadd           
        //   286: if_icmple       322
        //   289: aload_0        
        //   290: iconst_0       
        //   291: iload           20
        //   293: bipush          50
        //   295: isub           
        //   296: invokestatic    java/lang/Math.max:(II)I
        //   299: putfield        com/whatsapp/nm.b:I
        //   302: aload_0        
        //   303: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   306: getfield        com/whatsapp/Conversation.u:Lcom/whatsapp/nm;
        //   309: invokevirtual   com/whatsapp/nm.getCursor:()Landroid/database/Cursor;
        //   312: aload_0        
        //   313: getfield        com/whatsapp/nm.b:I
        //   316: invokeinterface android/database/Cursor.moveToPosition:(I)Z
        //   321: pop            
        //   322: aload_0        
        //   323: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   326: invokestatic    com/whatsapp/Conversation.R:(Lcom/whatsapp/Conversation;)Ljava/util/HashMap;
        //   329: iload_1        
        //   330: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   333: aload           21
        //   335: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   338: pop            
        //   339: aload           21
        //   341: areturn        
        //   342: astore          16
        //   344: aload           16
        //   346: athrow         
        //   347: astore          23
        //   349: aload           23
        //   351: athrow         
        //   352: astore          24
        //   354: aload           24
        //   356: athrow         
        //   357: iload_1        
        //   358: iload_2        
        //   359: isub           
        //   360: istore          6
        //   362: aload_0        
        //   363: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   366: invokestatic    com/whatsapp/Conversation.E:(Lcom/whatsapp/Conversation;)I
        //   369: istore          8
        //   371: iload           8
        //   373: ifle            379
        //   376: iinc            6, -1
        //   379: iload           6
        //   381: iflt            429
        //   384: aload_0        
        //   385: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   388: invokestatic    com/whatsapp/Conversation.t:(Lcom/whatsapp/Conversation;)Ljava/util/ArrayList;
        //   391: invokevirtual   java/util/ArrayList.size:()I
        //   394: istore          10
        //   396: iload           6
        //   398: iload           10
        //   400: if_icmpge       429
        //   403: aload_0        
        //   404: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   407: invokestatic    com/whatsapp/Conversation.t:(Lcom/whatsapp/Conversation;)Ljava/util/ArrayList;
        //   410: iload           6
        //   412: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   415: checkcast       Lcom/whatsapp/protocol/bi;
        //   418: areturn        
        //   419: astore          7
        //   421: aload           7
        //   423: athrow         
        //   424: astore          9
        //   426: aload           9
        //   428: athrow         
        //   429: new             Ljava/lang/StringBuilder;
        //   432: dup            
        //   433: invokespecial   java/lang/StringBuilder.<init>:()V
        //   436: getstatic       com/whatsapp/nm.z:[Ljava/lang/String;
        //   439: iconst_1       
        //   440: aaload         
        //   441: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   444: iload_1        
        //   445: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   448: getstatic       com/whatsapp/nm.z:[Ljava/lang/String;
        //   451: iconst_2       
        //   452: aaload         
        //   453: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   456: iload_2        
        //   457: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   460: getstatic       com/whatsapp/nm.z:[Ljava/lang/String;
        //   463: iconst_3       
        //   464: aaload         
        //   465: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   468: aload_0        
        //   469: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   472: invokestatic    com/whatsapp/Conversation.t:(Lcom/whatsapp/Conversation;)Ljava/util/ArrayList;
        //   475: invokevirtual   java/util/ArrayList.size:()I
        //   478: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   481: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   484: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   487: aconst_null    
        //   488: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  10     19     122    125    Ljava/lang/IllegalStateException;
        //  62     71     125    130    Ljava/lang/IllegalStateException;
        //  76     82     130    135    Ljava/lang/IllegalStateException;
        //  88     113    135    140    Ljava/lang/IllegalStateException;
        //  127    130    130    135    Ljava/lang/IllegalStateException;
        //  132    135    135    140    Ljava/lang/IllegalStateException;
        //  140    156    342    347    Ljava/lang/IllegalStateException;
        //  264    270    347    352    Ljava/lang/IllegalStateException;
        //  277    289    352    357    Ljava/lang/IllegalStateException;
        //  289    322    352    357    Ljava/lang/IllegalStateException;
        //  349    352    352    357    Ljava/lang/IllegalStateException;
        //  362    371    419    424    Ljava/lang/IllegalStateException;
        //  384    396    424    429    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 233, Size: 233
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
    
    public long getItemId(final int n) {
        return n;
    }
    
    public int getItemViewType(final int n) {
        try {
            if (!Conversation.Z(this.a)) {
                return -1;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            if (Conversation.E(this.a) <= 0) {
                return Conversation.k((bi)this.getItem(n));
            }
            final int n2 = n;
            final nm nm = this;
            final int n3 = nm.a();
            if (n2 == n3) {
                return 18;
            }
            return Conversation.k((bi)this.getItem(n));
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        try {
            final int n2 = n;
            final nm nm = this;
            final int n3 = nm.a();
            if (n2 == n3) {
                return 18;
            }
        }
        catch (IllegalStateException ex3) {
            throw ex3;
        }
        return Conversation.k((bi)this.getItem(n));
    }
    
    public View getView(final int p0, final View p1, final ViewGroup p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          4
        //     5: aload_0        
        //     6: iload_1        
        //     7: invokevirtual   com/whatsapp/nm.getItem:(I)Ljava/lang/Object;
        //    10: checkcast       Lcom/whatsapp/protocol/bi;
        //    13: astore          5
        //    15: aload           5
        //    17: getfield        com/whatsapp/protocol/bi.I:B
        //    20: istore          8
        //    22: iload           8
        //    24: bipush          8
        //    26: if_icmpne       60
        //    29: getstatic       com/whatsapp/App.aV:I
        //    32: iconst_3       
        //    33: if_icmplt       60
        //    36: new             Ljava/lang/IllegalStateException;
        //    39: dup            
        //    40: getstatic       com/whatsapp/nm.z:[Ljava/lang/String;
        //    43: bipush          8
        //    45: aaload         
        //    46: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    49: athrow         
        //    50: astore          7
        //    52: aload           7
        //    54: athrow         
        //    55: astore          6
        //    57: aload           6
        //    59: athrow         
        //    60: aload_0        
        //    61: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //    64: invokestatic    com/whatsapp/Conversation.E:(Lcom/whatsapp/Conversation;)I
        //    67: ifle            176
        //    70: aload_0        
        //    71: invokespecial   com/whatsapp/nm.a:()I
        //    74: istore          71
        //    76: iload_1        
        //    77: iload           71
        //    79: if_icmpne       176
        //    82: aload_0        
        //    83: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //    86: getstatic       com/whatsapp/nm.z:[Ljava/lang/String;
        //    89: bipush          7
        //    91: aaload         
        //    92: invokevirtual   com/whatsapp/Conversation.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    95: checkcast       Landroid/view/LayoutInflater;
        //    98: ldc             2130903134
        //   100: aload_3        
        //   101: iconst_0       
        //   102: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //   105: astore          72
        //   107: aload           72
        //   109: ldc             2131755501
        //   111: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   114: checkcast       Landroid/widget/TextView;
        //   117: astore          73
        //   119: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //   122: ldc             2131296301
        //   124: aload_0        
        //   125: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   128: invokestatic    com/whatsapp/Conversation.x:(Lcom/whatsapp/Conversation;)I
        //   131: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //   134: astore          74
        //   136: iconst_1       
        //   137: anewarray       Ljava/lang/Object;
        //   140: astore          75
        //   142: aload           75
        //   144: iconst_0       
        //   145: aload_0        
        //   146: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   149: invokestatic    com/whatsapp/Conversation.x:(Lcom/whatsapp/Conversation;)I
        //   152: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   155: aastore        
        //   156: aload           73
        //   158: aload           74
        //   160: aload           75
        //   162: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   165: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   168: aload           72
        //   170: areturn        
        //   171: astore          9
        //   173: aload           9
        //   175: athrow         
        //   176: aload_2        
        //   177: ifnull          300
        //   180: aload_2        
        //   181: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //   184: astore          62
        //   186: aload           62
        //   188: ifnull          300
        //   191: aload           5
        //   193: invokestatic    com/whatsapp/Conversation.k:(Lcom/whatsapp/protocol/bi;)I
        //   196: istore          63
        //   198: aload_2        
        //   199: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //   202: checkcast       Lcom/whatsapp/protocol/bi;
        //   205: invokestatic    com/whatsapp/Conversation.k:(Lcom/whatsapp/protocol/bi;)I
        //   208: istore          64
        //   210: iload           63
        //   212: iload           64
        //   214: if_icmpne       300
        //   217: aload_0        
        //   218: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   221: invokestatic    com/whatsapp/Conversation.v:(Lcom/whatsapp/Conversation;)Ljava/util/HashSet;
        //   224: aload           5
        //   226: invokevirtual   java/util/HashSet.contains:(Ljava/lang/Object;)Z
        //   229: istore          65
        //   231: iload           65
        //   233: ifne            264
        //   236: aload_0        
        //   237: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   240: invokestatic    com/whatsapp/Conversation.S:(Lcom/whatsapp/Conversation;)Landroid/support/v7/view/ActionMode;
        //   243: astore          69
        //   245: aload           69
        //   247: ifnonnull       264
        //   250: aload_0        
        //   251: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   254: invokestatic    com/whatsapp/Conversation.al:(Lcom/whatsapp/Conversation;)Landroid/support/v7/view/ActionMode;
        //   257: astore          70
        //   259: aload           70
        //   261: ifnull          838
        //   264: iconst_1       
        //   265: istore          66
        //   267: aload_2        
        //   268: checkcast       Lcom/whatsapp/ConversationRow;
        //   271: astore          67
        //   273: aload           67
        //   275: aload           5
        //   277: iload           66
        //   279: invokevirtual   com/whatsapp/ConversationRow.a:(Lcom/whatsapp/protocol/bi;Z)V
        //   282: aload_0        
        //   283: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   286: invokestatic    com/whatsapp/Conversation.v:(Lcom/whatsapp/Conversation;)Ljava/util/HashSet;
        //   289: aload           5
        //   291: invokevirtual   java/util/HashSet.remove:(Ljava/lang/Object;)Z
        //   294: pop            
        //   295: iload           4
        //   297: ifeq            1012
        //   300: aload_0        
        //   301: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   304: aload           5
        //   306: invokestatic    com/whatsapp/Conversation.a:(Landroid/content/Context;Lcom/whatsapp/protocol/bi;)Lcom/whatsapp/ConversationRow;
        //   309: astore          10
        //   311: aload           10
        //   313: ifnonnull       346
        //   316: new             Ljava/lang/StringBuilder;
        //   319: dup            
        //   320: invokespecial   java/lang/StringBuilder.<init>:()V
        //   323: getstatic       com/whatsapp/nm.z:[Ljava/lang/String;
        //   326: bipush          6
        //   328: aaload         
        //   329: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   332: aload           5
        //   334: invokestatic    com/whatsapp/util/Log.a:(Lcom/whatsapp/protocol/bi;)Ljava/lang/String;
        //   337: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   340: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   343: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   346: aload_0        
        //   347: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   350: getfield        com/whatsapp/Conversation.R:Lcom/whatsapp/protocol/c6;
        //   353: astore          13
        //   355: aload           13
        //   357: ifnull          391
        //   360: aload_0        
        //   361: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   364: getfield        com/whatsapp/Conversation.R:Lcom/whatsapp/protocol/c6;
        //   367: aload           5
        //   369: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   372: invokevirtual   com/whatsapp/protocol/c6.equals:(Ljava/lang/Object;)Z
        //   375: ifeq            391
        //   378: aload_0        
        //   379: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //   382: aconst_null    
        //   383: putfield        com/whatsapp/Conversation.R:Lcom/whatsapp/protocol/c6;
        //   386: aload           10
        //   388: invokevirtual   com/whatsapp/ConversationRow.j:()V
        //   391: iload_1        
        //   392: ifne            412
        //   395: aload           10
        //   397: iconst_1       
        //   398: invokevirtual   com/whatsapp/ConversationRow.a:(Z)V
        //   401: iconst_0       
        //   402: istore          18
        //   404: aconst_null    
        //   405: astore          17
        //   407: iload           4
        //   409: ifeq            469
        //   412: aload_0        
        //   413: iload_1        
        //   414: iconst_1       
        //   415: isub           
        //   416: invokevirtual   com/whatsapp/nm.getItem:(I)Ljava/lang/Object;
        //   419: checkcast       Lcom/whatsapp/protocol/bi;
        //   422: astore          14
        //   424: aload           14
        //   426: getfield        com/whatsapp/protocol/bi.u:J
        //   429: aload           5
        //   431: getfield        com/whatsapp/protocol/bi.u:J
        //   434: invokestatic    com/whatsapp/util/b6.b:(JJ)Z
        //   437: istore          15
        //   439: iload           15
        //   441: ifne            455
        //   444: aload           10
        //   446: iconst_1       
        //   447: invokevirtual   com/whatsapp/ConversationRow.a:(Z)V
        //   450: iload           4
        //   452: ifeq            1001
        //   455: aload           10
        //   457: iconst_0       
        //   458: invokevirtual   com/whatsapp/ConversationRow.a:(Z)V
        //   461: aload           14
        //   463: astore          17
        //   465: iload           15
        //   467: istore          18
        //   469: iload           18
        //   471: ifeq            995
        //   474: aload           17
        //   476: ifnull          995
        //   479: aload           17
        //   481: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   484: getfield        com/whatsapp/protocol/c6.b:Z
        //   487: istore          46
        //   489: aload           5
        //   491: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   494: getfield        com/whatsapp/protocol/c6.b:Z
        //   497: istore          47
        //   499: iload           46
        //   501: iload           47
        //   503: if_icmpne       995
        //   506: aload           5
        //   508: getfield        com/whatsapp/protocol/bi.c:I
        //   511: istore          48
        //   513: iload           48
        //   515: bipush          6
        //   517: if_icmpeq       995
        //   520: aload           17
        //   522: getfield        com/whatsapp/protocol/bi.c:I
        //   525: bipush          6
        //   527: if_icmpeq       995
        //   530: aload           5
        //   532: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   535: getfield        com/whatsapp/protocol/c6.b:Z
        //   538: istore          49
        //   540: iload           49
        //   542: ifeq            550
        //   545: iload           4
        //   547: ifeq            989
        //   550: aload           5
        //   552: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   555: astore          52
        //   557: aload           52
        //   559: ifnull          582
        //   562: aload           5
        //   564: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   567: aload           17
        //   569: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   572: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   575: istore          54
        //   577: iload           54
        //   579: ifeq            894
        //   582: iconst_1       
        //   583: istore          53
        //   585: iload           53
        //   587: istore          19
        //   589: aload_0        
        //   590: iload_1        
        //   591: iconst_1       
        //   592: iadd           
        //   593: invokevirtual   com/whatsapp/nm.getItem:(I)Ljava/lang/Object;
        //   596: checkcast       Lcom/whatsapp/protocol/bi;
        //   599: astore          20
        //   601: aload           20
        //   603: ifnull          905
        //   606: aload           20
        //   608: getfield        com/whatsapp/protocol/bi.u:J
        //   611: aload           5
        //   613: getfield        com/whatsapp/protocol/bi.u:J
        //   616: invokestatic    com/whatsapp/util/b6.b:(JJ)Z
        //   619: istore          42
        //   621: iload           42
        //   623: istore          21
        //   625: iload           21
        //   627: ifeq            983
        //   630: aload           20
        //   632: ifnull          983
        //   635: aload           20
        //   637: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   640: getfield        com/whatsapp/protocol/c6.b:Z
        //   643: istore          33
        //   645: aload           5
        //   647: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   650: getfield        com/whatsapp/protocol/c6.b:Z
        //   653: istore          34
        //   655: iload           33
        //   657: iload           34
        //   659: if_icmpne       983
        //   662: aload           5
        //   664: getfield        com/whatsapp/protocol/bi.c:I
        //   667: istore          35
        //   669: iload           35
        //   671: bipush          6
        //   673: if_icmpeq       983
        //   676: aload           20
        //   678: getfield        com/whatsapp/protocol/bi.c:I
        //   681: bipush          6
        //   683: if_icmpeq       983
        //   686: aload           5
        //   688: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   691: getfield        com/whatsapp/protocol/c6.b:Z
        //   694: istore          36
        //   696: iload           36
        //   698: ifeq            706
        //   701: iload           4
        //   703: ifeq            977
        //   706: aload           5
        //   708: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   711: astore          39
        //   713: aload           39
        //   715: ifnull          738
        //   718: aload           5
        //   720: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   723: aload           20
        //   725: getfield        com/whatsapp/protocol/bi.t:Ljava/lang/String;
        //   728: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   731: istore          40
        //   733: iload           40
        //   735: ifeq            936
        //   738: iconst_1       
        //   739: istore          22
        //   741: iload           19
        //   743: ifeq            762
        //   746: iload           22
        //   748: ifeq            762
        //   751: aload           10
        //   753: iconst_2       
        //   754: invokevirtual   com/whatsapp/ConversationRow.a:(I)V
        //   757: iload           4
        //   759: ifeq            810
        //   762: iload           19
        //   764: ifeq            783
        //   767: iload           22
        //   769: ifne            783
        //   772: aload           10
        //   774: iconst_3       
        //   775: invokevirtual   com/whatsapp/ConversationRow.a:(I)V
        //   778: iload           4
        //   780: ifeq            810
        //   783: iload           19
        //   785: ifne            804
        //   788: iload           22
        //   790: ifeq            804
        //   793: aload           10
        //   795: iconst_1       
        //   796: invokevirtual   com/whatsapp/ConversationRow.a:(I)V
        //   799: iload           4
        //   801: ifeq            810
        //   804: aload           10
        //   806: iconst_m1      
        //   807: invokevirtual   com/whatsapp/ConversationRow.a:(I)V
        //   810: aload           10
        //   812: areturn        
        //   813: astore          57
        //   815: aload           57
        //   817: athrow         
        //   818: astore          58
        //   820: aload           58
        //   822: athrow         
        //   823: astore          59
        //   825: aload           59
        //   827: athrow         
        //   828: astore          60
        //   830: aload           60
        //   832: athrow         
        //   833: astore          61
        //   835: aload           61
        //   837: athrow         
        //   838: iconst_0       
        //   839: istore          66
        //   841: goto            267
        //   844: astore          56
        //   846: aload           56
        //   848: athrow         
        //   849: astore          11
        //   851: aload           11
        //   853: athrow         
        //   854: astore          12
        //   856: aload           12
        //   858: athrow         
        //   859: astore          55
        //   861: aload           55
        //   863: athrow         
        //   864: astore          16
        //   866: aload           16
        //   868: athrow         
        //   869: astore          43
        //   871: aload           43
        //   873: athrow         
        //   874: astore          44
        //   876: aload           44
        //   878: athrow         
        //   879: astore          45
        //   881: aload           45
        //   883: athrow         
        //   884: astore          50
        //   886: aload           50
        //   888: athrow         
        //   889: astore          51
        //   891: aload           51
        //   893: athrow         
        //   894: iconst_0       
        //   895: istore          53
        //   897: goto            585
        //   900: astore          41
        //   902: aload           41
        //   904: athrow         
        //   905: iconst_1       
        //   906: istore          21
        //   908: goto            625
        //   911: astore          30
        //   913: aload           30
        //   915: athrow         
        //   916: astore          31
        //   918: aload           31
        //   920: athrow         
        //   921: astore          32
        //   923: aload           32
        //   925: athrow         
        //   926: astore          37
        //   928: aload           37
        //   930: athrow         
        //   931: astore          38
        //   933: aload           38
        //   935: athrow         
        //   936: iconst_0       
        //   937: istore          22
        //   939: goto            741
        //   942: astore          27
        //   944: aload           27
        //   946: athrow         
        //   947: astore          28
        //   949: aload           28
        //   951: athrow         
        //   952: astore          29
        //   954: aload           29
        //   956: athrow         
        //   957: astore          24
        //   959: aload           24
        //   961: athrow         
        //   962: astore          25
        //   964: aload           25
        //   966: athrow         
        //   967: astore          26
        //   969: aload           26
        //   971: athrow         
        //   972: astore          23
        //   974: aload           23
        //   976: athrow         
        //   977: iconst_1       
        //   978: istore          22
        //   980: goto            741
        //   983: iconst_0       
        //   984: istore          22
        //   986: goto            741
        //   989: iconst_1       
        //   990: istore          19
        //   992: goto            589
        //   995: iconst_0       
        //   996: istore          19
        //   998: goto            589
        //  1001: aload           14
        //  1003: astore          17
        //  1005: iload           15
        //  1007: istore          18
        //  1009: goto            469
        //  1012: aload           67
        //  1014: astore          10
        //  1016: goto            346
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  15     22     55     60     Ljava/lang/IllegalStateException;
        //  29     50     50     55     Ljava/lang/IllegalStateException;
        //  57     60     50     55     Ljava/lang/IllegalStateException;
        //  60     76     171    176    Ljava/lang/IllegalStateException;
        //  180    186    813    818    Ljava/lang/IllegalStateException;
        //  191    210    818    823    Ljava/lang/IllegalStateException;
        //  217    231    823    828    Ljava/lang/IllegalStateException;
        //  236    245    828    833    Ljava/lang/IllegalStateException;
        //  250    259    833    838    Ljava/lang/IllegalStateException;
        //  316    346    844    849    Ljava/lang/IllegalStateException;
        //  346    355    849    854    Ljava/lang/IllegalStateException;
        //  360    391    854    859    Ljava/lang/IllegalStateException;
        //  395    401    859    864    Ljava/lang/IllegalStateException;
        //  444    450    864    869    Ljava/lang/IllegalStateException;
        //  455    461    864    869    Ljava/lang/IllegalStateException;
        //  479    499    869    874    Ljava/lang/IllegalStateException;
        //  506    513    874    879    Ljava/lang/IllegalStateException;
        //  520    540    879    884    Ljava/lang/IllegalStateException;
        //  550    557    884    889    Ljava/lang/IllegalStateException;
        //  562    577    889    894    Ljava/lang/IllegalStateException;
        //  606    621    900    905    Ljava/lang/IllegalStateException;
        //  635    655    911    916    Ljava/lang/IllegalStateException;
        //  662    669    916    921    Ljava/lang/IllegalStateException;
        //  676    696    921    926    Ljava/lang/IllegalStateException;
        //  706    713    926    931    Ljava/lang/IllegalStateException;
        //  718    733    931    936    Ljava/lang/IllegalStateException;
        //  751    757    942    957    Ljava/lang/IllegalStateException;
        //  772    778    957    972    Ljava/lang/IllegalStateException;
        //  793    799    972    977    Ljava/lang/IllegalStateException;
        //  804    810    972    977    Ljava/lang/IllegalStateException;
        //  815    818    818    823    Ljava/lang/IllegalStateException;
        //  820    823    823    828    Ljava/lang/IllegalStateException;
        //  825    828    828    833    Ljava/lang/IllegalStateException;
        //  830    833    833    838    Ljava/lang/IllegalStateException;
        //  851    854    854    859    Ljava/lang/IllegalStateException;
        //  871    874    874    879    Ljava/lang/IllegalStateException;
        //  876    879    879    884    Ljava/lang/IllegalStateException;
        //  886    889    889    894    Ljava/lang/IllegalStateException;
        //  913    916    916    921    Ljava/lang/IllegalStateException;
        //  918    921    921    926    Ljava/lang/IllegalStateException;
        //  928    931    931    936    Ljava/lang/IllegalStateException;
        //  944    947    947    957    Ljava/lang/IllegalStateException;
        //  949    952    952    957    Ljava/lang/IllegalStateException;
        //  954    957    957    972    Ljava/lang/IllegalStateException;
        //  959    962    962    972    Ljava/lang/IllegalStateException;
        //  964    967    967    972    Ljava/lang/IllegalStateException;
        //  969    972    972    977    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 477, Size: 477
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
    
    public int getViewTypeCount() {
        while (true) {
            while (true) {
                try {
                    if (Conversation.E(this.a) > 0) {
                        final int n = 1;
                        return n + 19;
                    }
                }
                catch (IllegalStateException ex) {
                    throw ex;
                }
                final int n = 0;
                continue;
            }
        }
    }
    
    public boolean hasStableIds() {
        return true;
    }
    
    public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        Label_0023: {
            if (context != null) {
                if (cursor != null) {
                    break Label_0023;
                }
            }
            try {
                Log.w(nm.z[0]);
                return null;
            }
            catch (Exception ex) {
                throw ex;
            }
        }
        final bi a = App.ak.a(cursor, this.a.I);
        try {
            return (View)Conversation.a((Context)this.a, a);
        }
        catch (Exception ex2) {
            Log.b(ex2);
            return null;
        }
    }
    
    public void notifyDataSetChanged() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //     4: invokestatic    com/whatsapp/Conversation.P:(Lcom/whatsapp/Conversation;)Z
        //     7: istore          4
        //     9: iload           4
        //    11: ifne            28
        //    14: aload_0        
        //    15: invokespecial   android/widget/CursorAdapter.notifyDataSetChanged:()V
        //    18: getstatic       com/whatsapp/App.I:Z
        //    21: istore          7
        //    23: iload           7
        //    25: ifeq            56
        //    28: aload_0        
        //    29: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //    32: invokestatic    com/whatsapp/Conversation.aj:(Lcom/whatsapp/Conversation;)Z
        //    35: ifeq            56
        //    38: aload_0        
        //    39: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //    42: iconst_0       
        //    43: invokestatic    com/whatsapp/Conversation.f:(Lcom/whatsapp/Conversation;Z)Z
        //    46: pop            
        //    47: aload_0        
        //    48: getfield        com/whatsapp/nm.a:Lcom/whatsapp/Conversation;
        //    51: iconst_0       
        //    52: invokestatic    com/whatsapp/Conversation.d:(Lcom/whatsapp/Conversation;Z)Z
        //    55: pop            
        //    56: return         
        //    57: astore_1       
        //    58: aload_1        
        //    59: athrow         
        //    60: astore_2       
        //    61: aload_2        
        //    62: athrow         
        //    63: astore_3       
        //    64: aload_3        
        //    65: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      9      57     60     Ljava/lang/IllegalStateException;
        //  14     23     60     63     Ljava/lang/IllegalStateException;
        //  28     56     63     66     Ljava/lang/IllegalStateException;
        //  58     60     60     63     Ljava/lang/IllegalStateException;
        //  61     63     63     66     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 36, Size: 36
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
    
    protected void onContentChanged() {
    }
}
