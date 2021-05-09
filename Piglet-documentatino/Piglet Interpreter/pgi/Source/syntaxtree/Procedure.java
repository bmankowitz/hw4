//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * f0 -> Label()
 * f1 -> "["
 * f2 -> IntegerLiteral()
 * f3 -> "]"
 * f4 -> StmtExp()
 * </PRE>
 */
public class Procedure implements Node {
   public Label f0;
   public NodeToken f1;
   public IntegerLiteral f2;
   public NodeToken f3;
   public StmtExp f4;

   public Procedure(Label n0, NodeToken n1, IntegerLiteral n2, NodeToken n3, StmtExp n4) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
   }

   public Procedure(Label n0, IntegerLiteral n1, StmtExp n2) {
      f0 = n0;
      f1 = new NodeToken("[");
      f2 = n1;
      f3 = new NodeToken("]");
      f4 = n2;
   }

   public void accept(piglet.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(piglet.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(piglet.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(piglet.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

