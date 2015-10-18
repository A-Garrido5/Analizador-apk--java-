// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.NoAspectBoundException;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class RequiresParseDetailAspect
{
    private static /* synthetic */ Throwable ajc$initFailureCause;
    public static final /* synthetic */ RequiresParseDetailAspect ajc$perSingletonInstance;
    
    static {
        try {
            ajc$postClinit();
        }
        catch (Throwable ajc$initFailureCause) {
            RequiresParseDetailAspect.ajc$initFailureCause = ajc$initFailureCause;
        }
    }
    
    private static /* synthetic */ void ajc$postClinit() {
        ajc$perSingletonInstance = new RequiresParseDetailAspect();
    }
    
    public static RequiresParseDetailAspect aspectOf() {
        if (RequiresParseDetailAspect.ajc$perSingletonInstance == null) {
            throw new NoAspectBoundException("com.googlecode.mp4parser.RequiresParseDetailAspect", RequiresParseDetailAspect.ajc$initFailureCause);
        }
        return RequiresParseDetailAspect.ajc$perSingletonInstance;
    }
    
    public static boolean hasAspect() {
        return RequiresParseDetailAspect.ajc$perSingletonInstance != null;
    }
    
    @Before("this(com.googlecode.mp4parser.AbstractBox) && ((execution(public * * (..)) && !( execution(* parseDetails()) || execution(* getNumOfBytesToFirstChild()) || execution(* getType()) || execution(* isParsed()) || execution(* getHeader(*)) || execution(* parse()) || execution(* getBox(*)) || execution(* getSize()) || execution(* getOffset()) || execution(* parseDetails()) || execution(* _parseDetails(*)) || execution(* parse(*,*,*,*)) || execution(* getIsoFile()) || execution(* getParent()) || execution(* setParent(*)) || execution(* getUserType()) || execution(* setUserType(*))) && !@annotation(com.googlecode.mp4parser.annotations.DoNotParseDetail)) || @annotation(com.googlecode.mp4parser.annotations.ParseDetail))")
    public void before(final JoinPoint joinPoint) {
        if (joinPoint.getTarget() instanceof AbstractBox) {
            if (!((AbstractBox)joinPoint.getTarget()).isParsed()) {
                ((AbstractBox)joinPoint.getTarget()).parseDetails();
            }
            return;
        }
        throw new RuntimeException("Only methods in subclasses of " + AbstractBox.class.getName() + " can  be annotated with ParseDetail");
    }
}
