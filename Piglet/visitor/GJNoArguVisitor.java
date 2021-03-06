//
// Generated by JTB 1.3.2
//

package piglet.visitor;
import piglet.syntaxtree.*;
import java.util.*;

/**
 * All GJ visitors with no argument must implement this interface.
 */

public interface GJNoArguVisitor<R> {

   //
   // GJ Auto class visitors with no argument
   //

   public R visit(NodeList n);
   public R visit(NodeListOptional n);
   public R visit(NodeOptional n);
   public R visit(NodeSequence n);
   public R visit(NodeToken n);

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
   public R visit(Goal n);

   /**
    * <PRE>
    * f0 -> ( ( Label() )? Stmt() )*
    * </PRE>
    */
   public R visit(StmtList n);

   /**
    * <PRE>
    * f0 -> Label()
    * f1 -> "["
    * f2 -> IntegerLiteral()
    * f3 -> "]"
    * f4 -> StmtExp()
    * </PRE>
    */
   public R visit(Procedure n);

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
   public R visit(Stmt n);

   /**
    * <PRE>
    * f0 -> "NOOP"
    * </PRE>
    */
   public R visit(NoOpStmt n);

   /**
    * <PRE>
    * f0 -> "ERROR"
    * </PRE>
    */
   public R visit(ErrorStmt n);

   /**
    * <PRE>
    * f0 -> "CJUMP"
    * f1 -> Exp()
    * f2 -> Label()
    * </PRE>
    */
   public R visit(CJumpStmt n);

   /**
    * <PRE>
    * f0 -> "JUMP"
    * f1 -> Label()
    * </PRE>
    */
   public R visit(JumpStmt n);

   /**
    * <PRE>
    * f0 -> "HSTORE"
    * f1 -> Exp()
    * f2 -> IntegerLiteral()
    * f3 -> Exp()
    * </PRE>
    */
   public R visit(HStoreStmt n);

   /**
    * <PRE>
    * f0 -> "HLOAD"
    * f1 -> Temp()
    * f2 -> Exp()
    * f3 -> IntegerLiteral()
    * </PRE>
    */
   public R visit(HLoadStmt n);

   /**
    * <PRE>
    * f0 -> "MOVE"
    * f1 -> Temp()
    * f2 -> Exp()
    * </PRE>
    */
   public R visit(MoveStmt n);

   /**
    * <PRE>
    * f0 -> "PRINT"
    * f1 -> Exp()
    * </PRE>
    */
   public R visit(PrintStmt n);

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
   public R visit(Exp n);

   /**
    * <PRE>
    * f0 -> "BEGIN"
    * f1 -> StmtList()
    * f2 -> "RETURN"
    * f3 -> Exp()
    * f4 -> "END"
    * </PRE>
    */
   public R visit(StmtExp n);

   /**
    * <PRE>
    * f0 -> "CALL"
    * f1 -> Exp()
    * f2 -> "("
    * f3 -> ( Exp() )*
    * f4 -> ")"
    * </PRE>
    */
   public R visit(Call n);

   /**
    * <PRE>
    * f0 -> "HALLOCATE"
    * f1 -> Exp()
    * </PRE>
    */
   public R visit(HAllocate n);

   /**
    * <PRE>
    * f0 -> Operator()
    * f1 -> Exp()
    * f2 -> Exp()
    * </PRE>
    */
   public R visit(BinOp n);

   /**
    * <PRE>
    * f0 -> "LT"
    *       | "PLUS"
    *       | "MINUS"
    *       | "TIMES"
    * </PRE>
    */
   public R visit(Operator n);

   /**
    * <PRE>
    * f0 -> "TEMP"
    * f1 -> IntegerLiteral()
    * </PRE>
    */
   public R visit(Temp n);

   /**
    * <PRE>
    * f0 -> &lt;INTEGER_LITERAL&gt;
    * </PRE>
    */
   public R visit(IntegerLiteral n);

   /**
    * <PRE>
    * f0 -> &lt;IDENTIFIER&gt;
    * </PRE>
    */
   public R visit(Label n);

}

