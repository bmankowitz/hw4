//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * f0 -> "JUMP"
 * f1 -> Label()
 * </PRE>
 */
public class JumpStmt implements Node {
   public NodeToken f0;
   public Label f1;

   public JumpStmt(NodeToken n0, Label n1) {
      f0 = n0;
      f1 = n1;
   }

   public JumpStmt(Label n0) {
      f0 = new NodeToken("JUMP");
      f1 = n0;
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

