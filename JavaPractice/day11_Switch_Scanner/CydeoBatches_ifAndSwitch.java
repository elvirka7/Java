package day11_Switch_Scanner;

public class CydeoBatches_ifAndSwitch {
    public static void main(String[] args) {
        String batchType = "EU",
                result = "",
                USMorning = "Class times are 10-5 EST. M, T, Th, F.",
                USEvening = "Class times are 7-10 EST. M, T, W, Th, S, S",
                EU = "Class times are  10-5 EST. M, T, W, Th, F.",
                invalid = "Invalid Batch";
        boolean batch = batchType == "US morning" || batchType == "US evening" || batchType == "EU";

        if (batch) {
            switch (batchType) {
                case "US morning":
                    result = USMorning;
                    break;
                case "US evening":
                    result = USEvening;
                    break;
                default:
                    result = EU;
            }

        } else {
            result = invalid;
        }
        System.out.println(result);
    }
}
/*
Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"
 */