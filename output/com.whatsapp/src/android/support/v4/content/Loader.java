// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.content;

import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.support.v4.util.DebugUtils;
import android.content.Context;

public class Loader
{
    private static final String[] z;
    boolean mAbandoned;
    boolean mContentChanged;
    Context mContext;
    int mId;
    Loader$OnLoadCompleteListener mListener;
    boolean mProcessingChange;
    boolean mReset;
    boolean mStarted;
    
    static {
        final String[] z2 = new String[11];
        String s = "&sd}?Rrr/;\u001eidn>\u000b;`/6\u001bhuj4\u0017i!}?\u0015rr{?\u0000~e";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'Z';
                        break;
                    }
                    case 0: {
                        c2 = 'r';
                        break;
                    }
                    case 1: {
                        c2 = '\u001b';
                        break;
                    }
                    case 2: {
                        c2 = '\u0001';
                        break;
                    }
                    case 3: {
                        c2 = '\u000f';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "RvSj)\u0017o<";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u001fHun(\u0006~e2";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u001fRe2";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "RvB`4\u0006~o{\u0019\u001azoh?\u0016&";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u001fZcn4\u0016toj>O";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "RvMf)\u0006~oj(O";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "RvQ}5\u0011~r|3\u001c|Bg;\u001c|d2";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "<t!c3\u0001oda?\u0000;sj=\u001bhuj(";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "3ouj7\u0002oha=Ron//\u001cidh3\u0001od}z\u0006sd/-\u0000tohz\u001err{?\u001c~s";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "Rre2";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public Loader(final Context context) {
        this.mStarted = false;
        this.mAbandoned = false;
        this.mReset = true;
        this.mContentChanged = false;
        this.mProcessingChange = false;
        this.mContext = context.getApplicationContext();
    }
    
    public void abandon() {
        this.mAbandoned = true;
        this.onAbandon();
    }
    
    public String dataToString(final Object o) {
        final StringBuilder sb = new StringBuilder(64);
        DebugUtils.buildShortClassTag(o, sb);
        sb.append("}");
        return sb.toString();
    }
    
    public void deliverResult(final Object o) {
        try {
            if (this.mListener != null) {
                this.mListener.onLoadComplete(this, o);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
    }
    
    public void dump(final String p0, final FileDescriptor p1, final PrintWriter p2, final String[] p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_3        
        //     1: aload_1        
        //     2: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //     5: aload_3        
        //     6: getstatic       android/support/v4/content/Loader.z:[Ljava/lang/String;
        //     9: iconst_3       
        //    10: aaload         
        //    11: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    14: aload_3        
        //    15: aload_0        
        //    16: getfield        android/support/v4/content/Loader.mId:I
        //    19: invokevirtual   java/io/PrintWriter.print:(I)V
        //    22: aload_3        
        //    23: getstatic       android/support/v4/content/Loader.z:[Ljava/lang/String;
        //    26: bipush          6
        //    28: aaload         
        //    29: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    32: aload_3        
        //    33: aload_0        
        //    34: getfield        android/support/v4/content/Loader.mListener:Landroid/support/v4/content/Loader$OnLoadCompleteListener;
        //    37: invokevirtual   java/io/PrintWriter.println:(Ljava/lang/Object;)V
        //    40: aload_0        
        //    41: getfield        android/support/v4/content/Loader.mStarted:Z
        //    44: istore          8
        //    46: iload           8
        //    48: ifne            69
        //    51: aload_0        
        //    52: getfield        android/support/v4/content/Loader.mContentChanged:Z
        //    55: istore          12
        //    57: iload           12
        //    59: ifne            69
        //    62: aload_0        
        //    63: getfield        android/support/v4/content/Loader.mProcessingChange:Z
        //    66: ifeq            126
        //    69: aload_3        
        //    70: aload_1        
        //    71: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    74: aload_3        
        //    75: getstatic       android/support/v4/content/Loader.z:[Ljava/lang/String;
        //    78: iconst_2       
        //    79: aaload         
        //    80: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //    83: aload_3        
        //    84: aload_0        
        //    85: getfield        android/support/v4/content/Loader.mStarted:Z
        //    88: invokevirtual   java/io/PrintWriter.print:(Z)V
        //    91: aload_3        
        //    92: getstatic       android/support/v4/content/Loader.z:[Ljava/lang/String;
        //    95: iconst_4       
        //    96: aaload         
        //    97: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   100: aload_3        
        //   101: aload_0        
        //   102: getfield        android/support/v4/content/Loader.mContentChanged:Z
        //   105: invokevirtual   java/io/PrintWriter.print:(Z)V
        //   108: aload_3        
        //   109: getstatic       android/support/v4/content/Loader.z:[Ljava/lang/String;
        //   112: bipush          7
        //   114: aaload         
        //   115: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   118: aload_3        
        //   119: aload_0        
        //   120: getfield        android/support/v4/content/Loader.mProcessingChange:Z
        //   123: invokevirtual   java/io/PrintWriter.println:(Z)V
        //   126: aload_0        
        //   127: getfield        android/support/v4/content/Loader.mAbandoned:Z
        //   130: istore          11
        //   132: iload           11
        //   134: ifne            144
        //   137: aload_0        
        //   138: getfield        android/support/v4/content/Loader.mReset:Z
        //   141: ifeq            183
        //   144: aload_3        
        //   145: aload_1        
        //   146: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   149: aload_3        
        //   150: getstatic       android/support/v4/content/Loader.z:[Ljava/lang/String;
        //   153: iconst_5       
        //   154: aaload         
        //   155: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   158: aload_3        
        //   159: aload_0        
        //   160: getfield        android/support/v4/content/Loader.mAbandoned:Z
        //   163: invokevirtual   java/io/PrintWriter.print:(Z)V
        //   166: aload_3        
        //   167: getstatic       android/support/v4/content/Loader.z:[Ljava/lang/String;
        //   170: iconst_1       
        //   171: aaload         
        //   172: invokevirtual   java/io/PrintWriter.print:(Ljava/lang/String;)V
        //   175: aload_3        
        //   176: aload_0        
        //   177: getfield        android/support/v4/content/Loader.mReset:Z
        //   180: invokevirtual   java/io/PrintWriter.println:(Z)V
        //   183: return         
        //   184: astore          5
        //   186: aload           5
        //   188: athrow         
        //   189: astore          6
        //   191: aload           6
        //   193: athrow         
        //   194: astore          7
        //   196: aload           7
        //   198: athrow         
        //   199: astore          9
        //   201: aload           9
        //   203: athrow         
        //   204: astore          10
        //   206: aload           10
        //   208: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      46     184    189    Ljava/lang/IllegalStateException;
        //  51     57     189    194    Ljava/lang/IllegalStateException;
        //  62     69     194    199    Ljava/lang/IllegalStateException;
        //  69     126    194    199    Ljava/lang/IllegalStateException;
        //  126    132    199    204    Ljava/lang/IllegalStateException;
        //  137    144    204    209    Ljava/lang/IllegalStateException;
        //  144    183    204    209    Ljava/lang/IllegalStateException;
        //  186    189    189    194    Ljava/lang/IllegalStateException;
        //  191    194    194    199    Ljava/lang/IllegalStateException;
        //  201    204    204    209    Ljava/lang/IllegalStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 109, Size: 109
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
    
    public int getId() {
        return this.mId;
    }
    
    public boolean isAbandoned() {
        return this.mAbandoned;
    }
    
    public boolean isStarted() {
        return this.mStarted;
    }
    
    protected void onAbandon() {
    }
    
    protected void onReset() {
    }
    
    protected void onStartLoading() {
    }
    
    protected void onStopLoading() {
    }
    
    public void registerListener(final int mId, final Loader$OnLoadCompleteListener mListener) {
        try {
            if (this.mListener != null) {
                throw new IllegalStateException(Loader.z[0]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        this.mListener = mListener;
        this.mId = mId;
    }
    
    public void reset() {
        this.onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }
    
    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        this.onStartLoading();
    }
    
    public void stopLoading() {
        this.mStarted = false;
        this.onStopLoading();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(64);
        DebugUtils.buildShortClassTag(this, sb);
        sb.append(Loader.z[10]);
        sb.append(this.mId);
        sb.append("}");
        return sb.toString();
    }
    
    public void unregisterListener(final Loader$OnLoadCompleteListener loader$OnLoadCompleteListener) {
        try {
            if (this.mListener == null) {
                throw new IllegalStateException(Loader.z[8]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            if (this.mListener != loader$OnLoadCompleteListener) {
                throw new IllegalArgumentException(Loader.z[9]);
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        this.mListener = null;
    }
}
