package school.siit;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<SalesRepresentative> reps = new ArrayList<>();
        SalesRepresentative newSalesRepresentative1 = new SalesRepresentative(10, 500);
        SalesRepresentative newSalesRepresentative2 = new SalesRepresentative(13, 700);
        SalesRepresentative newSalesRepresentative3 = new SalesRepresentative(20, 250);
        SalesRepresentative newSalesRepresentative4 = new SalesRepresentative(5, 400);
        SalesRepresentative newSalesRepresentative5 = new SalesRepresentative(7, 750);

        reps.add(newSalesRepresentative1);
        reps.add(newSalesRepresentative2);
        reps.add(newSalesRepresentative3);
        reps.add(newSalesRepresentative4);
        reps.add(newSalesRepresentative5);

        BubbleSort newBubbleSort = new BubbleSort();
        ArrayList<SalesRepresentative> newReps = newBubbleSort.sort(reps);
        for(SalesRepresentative t:newReps){
            int n = newReps.indexOf(t);
            n++;
            System.out.println("Sales guy " + n + " has " + t.getNumberOfSales() + " sales with a quota of " + t.getQuota() + "$. He has achieved " + t.getWorthOfSales() + "$ worth of sales.");
        }

        ArrayList<SalesRepresentative> reps1 = new ArrayList<>();
        while (true) {

            System.out.println("Please enter the number of sales representative(enter when finished)");
            Scanner noOfSalesRepresentative = new Scanner(System.in);
            if (noOfSalesRepresentative.toString().equalsIgnoreCase("\n")) {
                break;
            }
            String noInString = noOfSalesRepresentative.next();
            for (int i = 1; i <= Integer.parseInt(noInString); i++){
                System.out.println("Please enter the number of sales for sales guy " + i + "(enter when finished)");
                Scanner salesNumber = new Scanner(System.in);
                if(salesNumber.toString().equalsIgnoreCase("\n"))
                    break;
                String numberSalesInString = salesNumber.next();

                System.out.println("Please enter quota for sales guy " + i + "(enter when finished)");
                Scanner quota = new Scanner(System.in);
                if (quota.toString().equalsIgnoreCase("\n"))
                    break;
                String quotaInString = quota.next();

                SalesRepresentative salesRep = new SalesRepresentative(Integer.parseInt(numberSalesInString), Integer.parseInt(quotaInString));
                reps1.add(salesRep);
            }
            ArrayList<SalesRepresentative> newReps1 = newBubbleSort.sort(reps1);
            for(SalesRepresentative r:newReps1){
                int m = newReps1.indexOf(r);
                m++;
                System.out.println("Sales guy " + m + " has " + r.getNumberOfSales() + " sales with a quota of " + r.getQuota() + "$. He has achieved " + r.getWorthOfSales() + "$ worth of sales.");
            }
            break;
        }
    }
}