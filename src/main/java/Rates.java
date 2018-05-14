public class Rates
{
  private String mid;

  private String code;

  private String currency;

  public String getMid ()
  {
    return mid;
  }

  public void setMid (String mid)
  {
    this.mid = mid;
  }

  public String getCode ()
  {
    return code;
  }

  public void setCode (String code)
  {
    this.code = code;
  }

  public String getCurrency ()
  {
    return currency;
  }

  public void setCurrency (String currency)
  {
    this.currency = currency;
  }

  @Override
  public String toString() {
    return "Rates{" +
        "mid='" + mid + '\'' +
        ", code='" + code + '\'' +
        ", currency='" + currency + '\'' +
        '}';
  }
}