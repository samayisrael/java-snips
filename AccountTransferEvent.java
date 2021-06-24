public class AccountTransferEvent extends Event {

  private final Long createdTimeStamp;
  private final String id;

  public AccountTransferEvent(String id){
      super(id);
  }

  @Override
  public void process() {
      System.out.println("Customer "+id+" needs to transfer their service.");
  }
}
