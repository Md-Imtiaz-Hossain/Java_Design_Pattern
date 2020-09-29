package Template_Method_Pattern;

public class Test5 {
    public static void main(String[] args) {

        TransferMoneyTask task = new TransferMoneyTask();
        task.execute();



        GenerateReportTask generateReportTask = new GenerateReportTask();
        generateReportTask.execute();

    }
}
