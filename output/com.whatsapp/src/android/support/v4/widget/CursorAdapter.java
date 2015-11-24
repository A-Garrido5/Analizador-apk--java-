// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.widget.Filter;
import android.view.ViewGroup;
import android.view.View;
import android.widget.FilterQueryProvider;
import android.database.DataSetObserver;
import android.database.Cursor;
import android.content.Context;
import android.widget.Filterable;
import android.widget.BaseAdapter;

public abstract class CursorAdapter extends BaseAdapter implements Filterable, CursorFilter$CursorFilterClient
{
    private static final String[] z;
    protected boolean mAutoRequery;
    protected CursorAdapter$ChangeObserver mChangeObserver;
    protected Context mContext;
    protected Cursor mCursor;
    protected CursorFilter mCursorFilter;
    protected DataSetObserver mDataSetObserver;
    protected boolean mDataValid;
    protected FilterQueryProvider mFilterQueryProvider;
    protected int mRowIDColumn;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0012Wcd&\u0015Webj\u0002\u001feyj\u001f\u001fhr&\u0005^f{c\u0002\u001f}\u007fc\b\u001f~\u007fcF\\\u007feu\tM*~uFIk{o\u0002";
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
                        c2 = '\u0006';
                        break;
                    }
                    case 0: {
                        c2 = 'f';
                        break;
                    }
                    case 1: {
                        c2 = '?';
                        break;
                    }
                    case 2: {
                        c2 = '\n';
                        break;
                    }
                    case 3: {
                        c2 = '\u0017';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0005P\u007f{b\b\u0018~7k\tIo7e\u0013MyxtFKe7v\tLcco\tQ*";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "9Vn";
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
    
    public abstract void bindView(final View p0, final Context p1, final Cursor p2);
    
    public void changeCursor(final Cursor cursor) {
        final Cursor swapCursor = this.swapCursor(cursor);
        if (swapCursor == null) {
            return;
        }
        try {
            swapCursor.close();
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public CharSequence convertToString(final Cursor cursor) {
        if (cursor == null) {
            return "";
        }
        return cursor.toString();
    }
    
    public int getCount() {
        try {
            if (!this.mDataValid) {
                return 0;
            }
            final CursorAdapter cursorAdapter = this;
            final Cursor cursor = cursorAdapter.mCursor;
            if (cursor != null) {
                final CursorAdapter cursorAdapter2 = this;
                final Cursor cursor2 = cursorAdapter2.mCursor;
                return cursor2.getCount();
            }
            return 0;
        }
        catch (IllegalStateException ex) {
            try {
                throw ex;
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        try {
            final CursorAdapter cursorAdapter = this;
            final Cursor cursor = cursorAdapter.mCursor;
            if (cursor != null) {
                final CursorAdapter cursorAdapter2 = this;
                final Cursor cursor2 = cursorAdapter2.mCursor;
                return cursor2.getCount();
            }
        }
        catch (IllegalStateException ex3) {}
        return 0;
    }
    
    public Cursor getCursor() {
        return this.mCursor;
    }
    
    public View getDropDownView(final int n, View view, final ViewGroup viewGroup) {
        while (true) {
            while (true) {
                View dropDownView = null;
                Label_0065: {
                    try {
                        if (this.mDataValid) {
                            this.mCursor.moveToPosition(n);
                            if (view == null) {
                                dropDownView = this.newDropDownView(this.mContext, this.mCursor, viewGroup);
                                if (!SlidingPaneLayout.a) {
                                    break Label_0065;
                                }
                            }
                            this.bindView(view, this.mContext, this.mCursor);
                            return view;
                        }
                    }
                    catch (IllegalStateException ex) {
                        throw ex;
                    }
                    break;
                }
                view = dropDownView;
                continue;
            }
        }
        return null;
    }
    
    public Filter getFilter() {
        try {
            if (this.mCursorFilter == null) {
                this.mCursorFilter = new CursorFilter(this);
            }
            return this.mCursorFilter;
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public Object getItem(final int n) {
        try {
            if (!this.mDataValid) {
                return null;
            }
            final CursorAdapter cursorAdapter = this;
            final Cursor cursor = cursorAdapter.mCursor;
            if (cursor != null) {
                final CursorAdapter cursorAdapter2 = this;
                final Cursor cursor2 = cursorAdapter2.mCursor;
                final int n2 = n;
                cursor2.moveToPosition(n2);
                final CursorAdapter cursorAdapter3 = this;
                return cursorAdapter3.mCursor;
            }
            return null;
        }
        catch (IllegalStateException ex) {
            try {
                throw ex;
            }
            catch (IllegalStateException ex2) {
                throw ex2;
            }
        }
        try {
            final CursorAdapter cursorAdapter = this;
            final Cursor cursor = cursorAdapter.mCursor;
            if (cursor != null) {
                final CursorAdapter cursorAdapter2 = this;
                final Cursor cursor2 = cursorAdapter2.mCursor;
                final int n2 = n;
                cursor2.moveToPosition(n2);
                final CursorAdapter cursorAdapter3 = this;
                return cursorAdapter3.mCursor;
            }
        }
        catch (IllegalStateException ex3) {}
        return null;
    }
    
    public long getItemId(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: lconst_0       
        //     1: lstore_2       
        //     2: aload_0        
        //     3: getfield        android/support/v4/widget/CursorAdapter.mDataValid:Z
        //     6: istore          7
        //     8: iload           7
        //    10: ifeq            55
        //    13: aload_0        
        //    14: getfield        android/support/v4/widget/CursorAdapter.mCursor:Landroid/database/Cursor;
        //    17: astore          8
        //    19: aload           8
        //    21: ifnull          55
        //    24: aload_0        
        //    25: getfield        android/support/v4/widget/CursorAdapter.mCursor:Landroid/database/Cursor;
        //    28: iload_1        
        //    29: invokeinterface android/database/Cursor.moveToPosition:(I)Z
        //    34: ifeq            55
        //    37: aload_0        
        //    38: getfield        android/support/v4/widget/CursorAdapter.mCursor:Landroid/database/Cursor;
        //    41: aload_0        
        //    42: getfield        android/support/v4/widget/CursorAdapter.mRowIDColumn:I
        //    45: invokeinterface android/database/Cursor.getLong:(I)J
        //    50: lstore          9
        //    52: lload           9
        //    54: lstore_2       
        //    55: lload_2        
        //    56: lreturn        
        //    57: astore          4
        //    59: aload           4
        //    61: athrow         
        //    62: astore          5
        //    64: aload           5
        //    66: athrow         
        //    67: astore          6
        //    69: aload           6
        //    71: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  2      8      57     62     Ljava/lang/IllegalStateException;
        //  13     19     62     67     Ljava/lang/IllegalStateException;
        //  24     52     67     72     Ljava/lang/IllegalStateException;
        //  59     62     62     67     Ljava/lang/IllegalStateException;
        //  64     67     67     72     Ljava/lang/IllegalStateException;
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
    
    public View getView(final int n, View view, final ViewGroup viewGroup) {
        try {
            if (!this.mDataValid) {
                throw new IllegalStateException(CursorAdapter.z[0]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            if (!this.mCursor.moveToPosition(n)) {
                throw new IllegalStateException(CursorAdapter.z[1] + n);
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        if (view == null) {
            final View view2 = this.newView(this.mContext, this.mCursor, viewGroup);
            if (!SlidingPaneLayout.a) {
                view = view2;
            }
        }
        this.bindView(view, this.mContext, this.mCursor);
        return view;
    }
    
    public boolean hasStableIds() {
        return true;
    }
    
    public View newDropDownView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
        return this.newView(context, cursor, viewGroup);
    }
    
    public abstract View newView(final Context p0, final Cursor p1, final ViewGroup p2);
    
    protected void onContentChanged() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/widget/CursorAdapter.mAutoRequery:Z
        //     4: istore          4
        //     6: iload           4
        //     8: ifeq            47
        //    11: aload_0        
        //    12: getfield        android/support/v4/widget/CursorAdapter.mCursor:Landroid/database/Cursor;
        //    15: astore          5
        //    17: aload           5
        //    19: ifnull          47
        //    22: aload_0        
        //    23: getfield        android/support/v4/widget/CursorAdapter.mCursor:Landroid/database/Cursor;
        //    26: invokeinterface android/database/Cursor.isClosed:()Z
        //    31: ifne            47
        //    34: aload_0        
        //    35: aload_0        
        //    36: getfield        android/support/v4/widget/CursorAdapter.mCursor:Landroid/database/Cursor;
        //    39: invokeinterface android/database/Cursor.requery:()Z
        //    44: putfield        android/support/v4/widget/CursorAdapter.mDataValid:Z
        //    47: return         
        //    48: astore_1       
        //    49: aload_1        
        //    50: athrow         
        //    51: astore_2       
        //    52: aload_2        
        //    53: athrow         
        //    54: astore_3       
        //    55: aload_3        
        //    56: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      6      48     51     Ljava/lang/IllegalStateException;
        //  11     17     51     54     Ljava/lang/IllegalStateException;
        //  22     47     54     57     Ljava/lang/IllegalStateException;
        //  49     51     51     54     Ljava/lang/IllegalStateException;
        //  52     54     54     57     Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 29, Size: 29
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
    
    public Cursor runQueryOnBackgroundThread(final CharSequence charSequence) {
        try {
            if (this.mFilterQueryProvider != null) {
                return this.mFilterQueryProvider.runQuery(charSequence);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return this.mCursor;
    }
    
    public Cursor swapCursor(final Cursor p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        android/support/v4/widget/CursorAdapter.mCursor:Landroid/database/Cursor;
        //     4: astore_3       
        //     5: aload_1        
        //     6: aload_3        
        //     7: if_acmpne       19
        //    10: aconst_null    
        //    11: astore          4
        //    13: aload           4
        //    15: areturn        
        //    16: astore_2       
        //    17: aload_2        
        //    18: athrow         
        //    19: aload_0        
        //    20: getfield        android/support/v4/widget/CursorAdapter.mCursor:Landroid/database/Cursor;
        //    23: astore          4
        //    25: aload           4
        //    27: ifnull          66
        //    30: aload_0        
        //    31: getfield        android/support/v4/widget/CursorAdapter.mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
        //    34: ifnull          48
        //    37: aload           4
        //    39: aload_0        
        //    40: getfield        android/support/v4/widget/CursorAdapter.mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
        //    43: invokeinterface android/database/Cursor.unregisterContentObserver:(Landroid/database/ContentObserver;)V
        //    48: aload_0        
        //    49: getfield        android/support/v4/widget/CursorAdapter.mDataSetObserver:Landroid/database/DataSetObserver;
        //    52: ifnull          66
        //    55: aload           4
        //    57: aload_0        
        //    58: getfield        android/support/v4/widget/CursorAdapter.mDataSetObserver:Landroid/database/DataSetObserver;
        //    61: invokeinterface android/database/Cursor.unregisterDataSetObserver:(Landroid/database/DataSetObserver;)V
        //    66: aload_0        
        //    67: aload_1        
        //    68: putfield        android/support/v4/widget/CursorAdapter.mCursor:Landroid/database/Cursor;
        //    71: aload_1        
        //    72: ifnull          139
        //    75: aload_0        
        //    76: getfield        android/support/v4/widget/CursorAdapter.mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
        //    79: ifnull          92
        //    82: aload_1        
        //    83: aload_0        
        //    84: getfield        android/support/v4/widget/CursorAdapter.mChangeObserver:Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
        //    87: invokeinterface android/database/Cursor.registerContentObserver:(Landroid/database/ContentObserver;)V
        //    92: aload_0        
        //    93: getfield        android/support/v4/widget/CursorAdapter.mDataSetObserver:Landroid/database/DataSetObserver;
        //    96: ifnull          109
        //    99: aload_1        
        //   100: aload_0        
        //   101: getfield        android/support/v4/widget/CursorAdapter.mDataSetObserver:Landroid/database/DataSetObserver;
        //   104: invokeinterface android/database/Cursor.registerDataSetObserver:(Landroid/database/DataSetObserver;)V
        //   109: aload_0        
        //   110: aload_1        
        //   111: getstatic       android/support/v4/widget/CursorAdapter.z:[Ljava/lang/String;
        //   114: iconst_2       
        //   115: aaload         
        //   116: invokeinterface android/database/Cursor.getColumnIndexOrThrow:(Ljava/lang/String;)I
        //   121: putfield        android/support/v4/widget/CursorAdapter.mRowIDColumn:I
        //   124: aload_0        
        //   125: iconst_1       
        //   126: putfield        android/support/v4/widget/CursorAdapter.mDataValid:Z
        //   129: aload_0        
        //   130: invokevirtual   android/support/v4/widget/CursorAdapter.notifyDataSetChanged:()V
        //   133: getstatic       android/support/v4/widget/SlidingPaneLayout.a:Z
        //   136: ifeq            13
        //   139: aload_0        
        //   140: iconst_m1      
        //   141: putfield        android/support/v4/widget/CursorAdapter.mRowIDColumn:I
        //   144: aload_0        
        //   145: iconst_0       
        //   146: putfield        android/support/v4/widget/CursorAdapter.mDataValid:Z
        //   149: aload_0        
        //   150: invokevirtual   android/support/v4/widget/CursorAdapter.notifyDataSetInvalidated:()V
        //   153: aload           4
        //   155: areturn        
        //   156: astore          7
        //   158: aload           7
        //   160: athrow         
        //   161: astore          9
        //   163: aload           9
        //   165: athrow         
        //   166: astore          10
        //   168: aload           10
        //   170: athrow         
        //   171: astore          5
        //   173: aload           5
        //   175: athrow         
        //   176: astore          6
        //   178: aload           6
        //   180: athrow         
        //   181: astore          8
        //   183: aload           8
        //   185: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      5      16     19     Ljava/lang/IllegalStateException;
        //  30     48     161    166    Ljava/lang/IllegalStateException;
        //  48     66     166    171    Ljava/lang/IllegalStateException;
        //  66     71     171    176    Ljava/lang/IllegalStateException;
        //  75     92     176    181    Ljava/lang/IllegalStateException;
        //  92     109    181    186    Ljava/lang/IllegalStateException;
        //  109    139    156    161    Ljava/lang/IllegalStateException;
        //  139    153    156    161    Ljava/lang/IllegalStateException;
        //  173    176    176    181    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 93, Size: 93
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
