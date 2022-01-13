package day10_NestedIf;

public class GradeReport_Ternaries {

    public static void main(String[] args) {


        int score = 100;

        String message =
                (score >= 0 && score <= 100) ?
                        (score >= 90) ? "Excellent"
                                : (score >= 80) ? "Great"
                                : (score >= 70) ? "Good"
                                : (score >= 60) ? "Passed"
                                : "Failed"
                        : "Invalid Score";
        System.out.println(message);

    }
}

/*
score:
    90 ~ 100 ==> Excellent
    80 ~ 89 ==> Great
    70 ~ 79 ==> Good
    60 ~ 69 ==> Passed
    0 ~ 59 ==> Failed
 */

