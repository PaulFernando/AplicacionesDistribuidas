<%-- 
    Document   : restaWebService
    Created on : 10/01/2018, 13:12:17
    Author     : paul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <title>resta</title>
        <style>
            h1{
                text-align: center;
            }
        </style>

        <%!
            String num1;
            String num2;
        %>

    </head>
    <body>
        <h1>Resta:</h1>

        <div class="container">
            <div class="row">
                <div class="col-sm">

                </div>
                <div class="col-sm">
                    <%--llamamos al controlador en el action--%>
                    <form action="restaWebService.jsp" method="post">
                        <br>
                        <div class="form-group row">
                            <label class="col-md-3 control-label">1er Numero</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="txt_num1">
                            </div>
                        </div>

                        <div class="form-group row">
                            <label class="col-md-3 control-label">2do Numero</label>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="txt_num2">
                            </div>
                        </div>

                        <div class="form-group">
                            <!-- Button -->                                        
                            <div class="form-group text-center">
                                <button type="submit" class="btn btn-info"> &nbsp Enviar Datos</button>
                            </div>
                        </div>

                    </form>

                    <% num1 = request.getParameter("txt_num1"); %>

                    <% num2 = request.getParameter("txt_num2"); %>


                </div>
                <div class="col-sm">

                </div>
            </div>
        </div>

    </body>

    <%-- start web service invocation --%><hr/>
    <%
        try {
            servicio.ServicioResta_Service service = new servicio.ServicioResta_Service();
            servicio.ServicioResta port = service.getServicioRestaPort();
            // TODO initialize WS operation arguments here
            double a = Double.parseDouble(num1);
            double b = Double.parseDouble(num2);
            // TODO process result here
            java.lang.Double result = port.resta(a, b);
            out.println("Resultado = " + result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
    %>
    <%-- end web service invocation --%><hr/>



</html>
