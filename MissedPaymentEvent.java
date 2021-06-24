public class MissedPaymentEvent extends AbstractEvent {

  private final Long createdTimeStamp;
  private final String id;

  public MissedPaymentEvent(String id){
      super(id);
  }

  @Override
  public void process() {
      System.out.println("Customer "+id+" missed their payment.");
  }
}
