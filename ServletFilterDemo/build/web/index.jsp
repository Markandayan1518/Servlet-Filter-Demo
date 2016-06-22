<%-- 
    Document   : index
    Created on : Jun 22, 2016, 2:23:03 PM
    Author     : mark-4304
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./Result">
            <table border="1">
                <tbody>
                    <tr>
                        <td>Enter the Name :</td>
                        <td> <input type="text" name="name" value="" /> </td>
                    </tr>
                    <tr>
                        <td>Enter the Email Id :</td>
                        <td> <input type="text" name="email" value="" /> </td>
                    </tr>
                    <tr>
                        <td>Enter the Marks :</td>
                        <td> <input type="text" name="marks" value="" /> </td>
                    </tr>
                </tbody>
            </table>
            <input type="submit" value="Register" />
        </form>
    </body>
</html>
