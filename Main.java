public class Main {

    public static void main(String[] args) {
        PasswordChangeEvent eventOne = new PasswordChangeEvent("747474747");
        MissedPaymentEvent eventTwo = new MissedPaymentEvent("88888888");
        AccountTransferEvent eventThree = new AccountTransferEvent("999999999");

        Event[] events = {eventOne, eventTwo, eventThree};

        for (Event e : events) {
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();

        }
    }
}
