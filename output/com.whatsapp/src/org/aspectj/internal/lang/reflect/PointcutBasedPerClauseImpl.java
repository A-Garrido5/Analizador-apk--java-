// 
// Decompiled by Procyon v0.5.30
// 

package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.PerClauseKind;
import org.aspectj.lang.reflect.PointcutExpression;
import org.aspectj.lang.reflect.PointcutBasedPerClause;

public class PointcutBasedPerClauseImpl extends PerClauseImpl implements PointcutBasedPerClause
{
    private final PointcutExpression pointcutExpression;
    
    public PointcutBasedPerClauseImpl(final PerClauseKind perClauseKind, final String s) {
        super(perClauseKind);
        this.pointcutExpression = new PointcutExpressionImpl(s);
    }
    
    @Override
    public PointcutExpression getPointcutExpression() {
        return this.pointcutExpression;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        switch (this.getKind()) {
            case PERCFLOW: {
                sb.append("percflow(");
                break;
            }
            case PERCFLOWBELOW: {
                sb.append("percflowbelow(");
                break;
            }
            case PERTARGET: {
                sb.append("pertarget(");
                break;
            }
            case PERTHIS: {
                sb.append("perthis(");
                break;
            }
        }
        sb.append(this.pointcutExpression.asString());
        sb.append(")");
        return sb.toString();
    }
}
