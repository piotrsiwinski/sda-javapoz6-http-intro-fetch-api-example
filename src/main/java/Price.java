import java.util.List;

public class Price
{

  private String no;

  private List<Rates> rates;

  private String table;

  private String effectiveDate;

  public String getNo ()
  {
    return no;
  }

  public void setNo (String no)
  {
    this.no = no;
  }

  public List<Rates> getRates() {
    return rates;
  }

  public void setRates(List<Rates> rates) {
    this.rates = rates;
  }

  public String getTable ()
  {
    return table;
  }

  public void setTable (String table)
  {
    this.table = table;
  }

  public String getEffectiveDate ()
  {
    return effectiveDate;
  }

  public void setEffectiveDate (String effectiveDate)
  {
    this.effectiveDate = effectiveDate;
  }

  @Override
  public String toString() {
    return "Price{" +
        "no='" + no + '\'' +
        ", rates=" + rates +
        ", table='" + table + '\'' +
        ", effectiveDate='" + effectiveDate + '\'' +
        '}';
  }
}