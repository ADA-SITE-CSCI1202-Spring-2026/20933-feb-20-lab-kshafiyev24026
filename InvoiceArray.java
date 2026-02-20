import java.util.Scanner;

public class InvoiceArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many invoices? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Invoice #" + (i + 1));

            System.out.print("Enter part number: ");
            String part = sc.nextLine();

            System.out.print("Enter description: ");
            String desc = sc.nextLine();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            System.out.print("Enter price per item: ");
            double price = sc.nextDouble();
            sc.nextLine(); 

            invoices[i] = new Invoice(part, desc, qty, price);
        }

        System.out.println("\nInvoice amounts:");
        for (int i = 0; i < n; i++) {
            System.out.println("Invoice #" + (i + 1) + " (" + invoices[i].getPartNumber() + "): " + invoices[i].getInvoiceAmount());
        }
    }
}
