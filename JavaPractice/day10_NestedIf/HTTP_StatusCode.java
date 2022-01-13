package day10_NestedIf;

public class HTTP_StatusCode {
    public static void main(String[] args) {


        int statusCode = 900;

        String message = (statusCode == 200 || statusCode == 201 || statusCode == 202 || statusCode == 301 || statusCode == 303 ||
                statusCode == 304 || statusCode == 307 || statusCode == 400 || statusCode == 401 || statusCode == 403 ||
                statusCode == 404 || statusCode == 410 || statusCode == 500 || statusCode == 503) ?
                (statusCode == 200) ? "OK"
                        : (statusCode == 201) ? "Created"
                        : (statusCode == 202) ? "Accepted"
                        : (statusCode == 301) ? "Moved Permanently"
                        : (statusCode == 303) ? "See Other"
                        : (statusCode == 304) ? "Not Modified"
                        : (statusCode == 307) ? "Temporary Redirect"
                        : (statusCode == 400) ? "Bad Request"
                        : (statusCode == 401) ? "Unauthorized"
                        : (statusCode == 403) ? "Forbidden"
                        : (statusCode == 404) ? "Not Found"
                        : (statusCode == 410) ? "Gone"
                        : (statusCode == 500) ? "Internal Server Error"
                        : "Service Unavailable"
                : "Status code not given";

        System.out.println(message);


    }
}
/*
 HTTP is the protocol that governs communications between web-servers and web clients. Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
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


         declare an int variable called statusCode, and a vlaid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

            NOTE: MUST USE TERNARY.
 */