package cn.lightfish.sql.ast.arithmeticExpr.bigDecimalOperator;

import cn.lightfish.sql.ast.RootExecutionContext;
import cn.lightfish.sql.ast.numberExpr.BigDecimalExpr;
import cn.lightfish.sql.ast.valueExpr.ValueExpr;
import java.math.BigDecimal;
import java.math.RoundingMode;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BigDecimalDivisionExpr implements BigDecimalExpr {
  private final RootExecutionContext context;
  private final ValueExpr left;
  private final ValueExpr right;

  @Override
  public BigDecimal getValue() {
    BigDecimal left = (BigDecimal) this.left.getValue();
    BigDecimal rightValue = (BigDecimal) this.right.getValue();
    return left.divide(rightValue,65);
  }
}