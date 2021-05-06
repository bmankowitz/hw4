//
// Generated by JTB 1.3.2
//

package piglet.visitor;
import piglet.syntaxtree.*;
import java.util.*;

/**
 * All GJ visitors must implement this interface.
 */

public interface GJVisitor<R,A> {

   //
   // GJ Auto class visitors
   //

   public R visit(NodeList n, A argu);
   public R visit(NodeListOptional n, A argu);
   public R visit(NodeOptional n, A argu);
   public R visit(NodeSequence n, A argu);
   public R visit(NodeToken n, A argu);

   //
   // User-generated visitor methods below
   //

   /**
    * <PRE>
    * f0 -> "MAIN"
    * f1 -> StmtList()
    * f2 -> "END"
    * f3 -> ( Procedure() )*
    * f4 -> &lt;EOF&gt;
    * </PRE>
    */
   public R visit(Goal n, A argu);

   /**
    * <PRE>
    * f0 -> ( ( Label() )? Stmt() )*
    * </PRE>
    */
   public R visit(StmtList n, A argu);

   /**
    * <PRE>
    * f0 -> Label()
    * f1 -> "["
    * f2 -> IntegerLiteral()
    * f3 -> "]"
    * f4 -> StmtExp()
    * </PRE>
    */
   public R visit(Procedure n, A argu);

   /**
    * <PRE>
    * f0 -> NoOpStmt()
    *       | ErrorStmt()
    *       | CJumpStmt()
    *       | JumpStmt()
    *       | HStoreStmt()
    *       | HLoadStmt()
    *       | MoveStmt()
    *       | PrintStmt()
    * </PRE>
    */
   public R visit(Stmt n, A argu);

   /**
    * <PRE>
    * f0 -> "NOOP"
    * </PRE>
    */
   public R visit(NoOpStmt n, A argu);

   /**
    * <PRE>
    * f0 -> "ERROR"
    * </PRE>
    */
   public R visit(ErrorStmt n, A argu);

   /**
    * <PRE>
    * f0 -> "CJUMP"
    * f1 -> Exp()
    * f2 -> Label()
    * </PRE>
    */
   public R visit(CJumpStmt n, A argu);

   /**
    * <PRE>
    * f0 -> "JUMP"
    * f1 -> Label()
    * </PRE>
    */
   public R visit(JumpStmt n, A argu);

   /**
    * <PRE>
    * f0 -> "HSTORE"
    * f1 -> Exp()
    * f2 -> IntegerLiteral()
    * f3 -> Exp()
    * </PRE>
    */
   public R visit(HStoreStmt n, A argu);

   /**
    * <PRE>
    * f0 -> "HLOAD"
    * f1 -> Temp()
    * f2 -> Exp()
    * f3 -> IntegerLiteral()
    * </PRE>
    */
   public R visit(HLoadStmt n, A argu);

   /**
    * <PRE>
    * f0 -> "MOVE"
    * f1 -> Temp()
    * f2 -> Exp()
    * </PRE>
    */
   public R visit(MoveStmt n, A argu);

   /**
    * <PRE>
    * f0 -> "PRINT"
    * f1 -> Exp()
    * </PRE>
    */
   public R visit(PrintStmt n, A argu);

   /**
    * <PRE>
    * f0 -> StmtExp()
    *       | Call()
    *       | HAllocate()
    *       | BinOp()
    *       | Temp()
    *       | IntegerLiteral()
    *       | Label()
    * </PRE>
    */
   public R visit(Exp n, A argu);

   /**
    * <PRE>
    * f0 -> "BEGIN"
    * f1 -> StmtList()
    * f2 -> "RETURN"
    * f3 -> Exp()
    * f4 -> "END"
    * </PRE>
    */
   public R visit(StmtExp n, A argu);

   /**
    * <PRE>
    * f0 -> "CALL"
    * f1 -> Exp()
    * f2 -> "("
    * f3 -> ( Exp() )*
    * f4 -> ")"
    * </PRE>
    */
   public R visit(Call n, A argu);

   /**
    * <PRE>
    * f0 -> "HALLOCATE"
    * f1 -> Exp()
    * </PRE>
    */
   public R visit(HAllocate n, A argu);

   /**
    * <PRE>
    * f0 -> Operator()
    * f1 -> Exp()
    * f2 -> Exp()
    * </PRE>
    */
   public R visit(BinOp n, A argu);

   /**
    * <PRE>
    * f0 -> "LT"
    *       | "PLUS"
    *       | "MINUS"
    *       | "TIMES"
    * </PRE>
    */
   public R visit(Operator n, A argu);

   /**
    * <PRE>
    * f0 -> "TEMP"
    * f1 -> IntegerLiteral()
    * </PRE>
    */
   public R visit(Temp n, A argu);

   /**
    * <PRE>
    * f0 -> &lt;INTEGER_LITERAL&gt;
    * </PRE>
    */
   public R visit(IntegerLiteral n, A argu);

   /**
    * <PRE>
    * f0 -> &lt;IDENTIFIER&gt;
    * </PRE>
    */
   public R visit(Label n, A argu);

}