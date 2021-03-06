//
// Generated by JTB 1.3.2
//

package minijava.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * f0 -> "false"
 * </PRE>
 */
public class FalseLiteral implements Node {
   public NodeToken f0;

   public FalseLiteral(NodeToken n0) {
      f0 = n0;
   }

   public FalseLiteral() {
      f0 = new NodeToken("false");
   }

   public void accept(minijava.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(minijava.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(minijava.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(minijava.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

