// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.os.Message;
import android.os.Handler;

class GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler extends Handler
{
    private static final String z;
    final GestureDetectorCompat$GestureDetectorCompatImplBase this$0;
    
    static {
        final char[] charArray = "\u001dc\bb\u001c?cCa\u0016;~\u0002k\u0016h".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 's';
                    break;
                }
                case 0: {
                    c2 = 'H';
                    break;
                }
                case 1: {
                    c2 = '\r';
                    break;
                }
                case 2: {
                    c2 = 'c';
                    break;
                }
                case 3: {
                    c2 = '\f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler(final GestureDetectorCompat$GestureDetectorCompatImplBase this$0) {
        this.this$0 = this$0;
    }
    
    GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler(final GestureDetectorCompat$GestureDetectorCompatImplBase this$0, final Handler handler) {
        this.this$0 = this$0;
        super(handler.getLooper());
    }
    
    public void handleMessage(final Message p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/view/ViewPager.a:I
        //     3: istore_2       
        //     4: aload_1        
        //     5: getfield        android/os/Message.what:I
        //     8: istore          10
        //    10: iload           10
        //    12: tableswitch {
        //                2: 73
        //                3: 96
        //                4: 107
        //          default: 40
        //        }
        //    40: new             Ljava/lang/RuntimeException;
        //    43: dup            
        //    44: new             Ljava/lang/StringBuilder;
        //    47: dup            
        //    48: invokespecial   java/lang/StringBuilder.<init>:()V
        //    51: getstatic       android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler.z:Ljava/lang/String;
        //    54: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    57: aload_1        
        //    58: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    61: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    64: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //    67: athrow         
        //    68: astore          9
        //    70: aload           9
        //    72: athrow         
        //    73: aload_0        
        //    74: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler.this$0:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;
        //    77: invokestatic    android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.access$100:(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)Landroid/view/GestureDetector$OnGestureListener;
        //    80: aload_0        
        //    81: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler.this$0:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;
        //    84: invokestatic    android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.access$000:(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)Landroid/view/MotionEvent;
        //    87: invokeinterface android/view/GestureDetector$OnGestureListener.onShowPress:(Landroid/view/MotionEvent;)V
        //    92: iload_2        
        //    93: ifeq            172
        //    96: aload_0        
        //    97: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler.this$0:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;
        //   100: invokestatic    android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.access$200:(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)V
        //   103: iload_2        
        //   104: ifeq            172
        //   107: aload_0        
        //   108: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler.this$0:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;
        //   111: invokestatic    android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.access$300:(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)Landroid/view/GestureDetector$OnDoubleTapListener;
        //   114: astore          11
        //   116: aload           11
        //   118: ifnull          172
        //   121: aload_0        
        //   122: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler.this$0:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;
        //   125: invokestatic    android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.access$400:(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)Z
        //   128: istore          12
        //   130: iload           12
        //   132: ifne            159
        //   135: aload_0        
        //   136: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler.this$0:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;
        //   139: invokestatic    android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.access$300:(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)Landroid/view/GestureDetector$OnDoubleTapListener;
        //   142: aload_0        
        //   143: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler.this$0:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;
        //   146: invokestatic    android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.access$000:(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)Landroid/view/MotionEvent;
        //   149: invokeinterface android/view/GestureDetector$OnDoubleTapListener.onSingleTapConfirmed:(Landroid/view/MotionEvent;)Z
        //   154: pop            
        //   155: iload_2        
        //   156: ifeq            172
        //   159: aload_0        
        //   160: getfield        android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler.this$0:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;
        //   163: iconst_1       
        //   164: invokestatic    android/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase.access$502:(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;Z)Z
        //   167: pop            
        //   168: iload_2        
        //   169: ifne            40
        //   172: return         
        //   173: astore_3       
        //   174: aload_3        
        //   175: athrow         
        //   176: astore          4
        //   178: aload           4
        //   180: athrow         
        //   181: astore          5
        //   183: aload           5
        //   185: athrow         
        //   186: astore          6
        //   188: aload           6
        //   190: athrow         
        //   191: astore          7
        //   193: aload           7
        //   195: athrow         
        //   196: astore          8
        //   198: aload           8
        //   200: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  4      10     173    176    Ljava/lang/RuntimeException;
        //  40     68     68     73     Ljava/lang/RuntimeException;
        //  73     92     176    181    Ljava/lang/RuntimeException;
        //  96     103    181    186    Ljava/lang/RuntimeException;
        //  107    116    186    191    Ljava/lang/RuntimeException;
        //  121    130    191    196    Ljava/lang/RuntimeException;
        //  135    155    196    201    Ljava/lang/RuntimeException;
        //  159    168    68     73     Ljava/lang/RuntimeException;
        //  174    176    176    181    Ljava/lang/RuntimeException;
        //  178    181    181    186    Ljava/lang/RuntimeException;
        //  183    186    186    191    Ljava/lang/RuntimeException;
        //  188    191    191    196    Ljava/lang/RuntimeException;
        //  193    196    196    201    Ljava/lang/RuntimeException;
        //  198    201    68     73     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 84, Size: 84
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
