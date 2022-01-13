package _2_Statements;

import java.util.Scanner;

public class _3_HTTPStatusCode {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter status code:");
        int statusCode = scan.nextInt();

        String result = "";
        if (statusCode == 200 || statusCode == 201 || statusCode == 202 || statusCode == 301 || statusCode == 303 || statusCode == 304 || statusCode == 307 || statusCode == 400 || statusCode == 401 || statusCode == 403 || statusCode == 404 || statusCode == 410 || statusCode == 500 || statusCode == 503) {
            switch (statusCode) {
                case 200:
                    result = "OK";
                    break;
                case 201:
                    result = "Created";
                    break;
                case 202:
                    result = "Accepted";
                    break;
                case 301:
                    result = "Moved Permanently";
                    break;
                case 303:
                    result = "See Other";
                    break;
                case 304:
                    result = "Not Modified";
                    break;
                case 307:
                    result = "Temporary Redirect";
                    break;
                case 400:
                    result = "Bad Request";
                    break;
                case 401:
                    result = "Unauthorized";
                    break;
                case 403:
                    result = "Forbidden";
                    break;
                case 404:
                    result = "Not Found";
                    break;
                case 410:
                    result = "Gone";
                    break;
                case 500:
                    result = "Internal Server Error";
                    break;
                default:
                    result = "Service Unavailable";
                    break;

            }
        } else {
            result = "Invalid status code!";
        }
        System.out.println(result);

        scan.close();
    }
}
/*
HTTP is the protocol that governs communications between servers and web clients (i.e. browsers). Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request. Some of the codes and their meanings are listed below:

STATUS CODES

200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable
Given an int variable status write a switch statement to display the status code message. If an invalid status code is entered display Invalid status code!

Example:

Display message: "Enter status code:"

input: 200

Display message: "OK"
 */