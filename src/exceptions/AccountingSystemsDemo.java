package exceptions;

import java.util.Date;

public class AccountingSystemsDemo {
    public static void main(String[] args) throws WrongDocumentFormatException {
        Date date = new Date();
        Document[] documents = {
                new ContractForSupplyOfGoods(date, "555abc1a2b", "type1.0", 750),
                new ContractWithEmployee(date, "357", date, "Employee name"),
                new FinancialInvoice(date, "555abc", 1250, "1.0")};
        Register document = new Document();
        try {
            document.saveDoc(documents);
        } catch (WrongDocumentFormatException e) {
            System.out.println(e);
        }
        document.getDocumentInformation(documents[0]);
    }
}
