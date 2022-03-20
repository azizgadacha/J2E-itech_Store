<%@ page import="com.example.ilprojetfinale.model.produit" %><%--
  Created by IntelliJ IDEA.
  User: azizg
  Date: 06/12/2021
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="navbar.jsp"/>
<br>
<br>
<br>
<div class="container">
    <div class="main-body">

        <!-- Breadcrumb -->

        <!-- /Breadcrumb -->
        <div class="row gutters-sm">


            <div class="col-md-8" style="margin: auto;
  width: 50%;
  border: 3px;
  padding: 10px;">
                <form enctype="multipart/form-data" method="post" action="ajoutimage?ut=<%=request.getParameter("ut")%>&prod=<%=request.getParameter("pro")%>">

                    <div class="card mb-3">
                        <div class="card-body">
                            <br>


                            <div class="row">

                                <span  class="label-input100">insert image</span>

                                <input type="file" name="image" >

                            </div>





                            <br><br>
                            <div class="row" style="width: 200px ;margin: auto;

                                 border: 3px;
                                 padding: 10px;width: 200px" class="row"  >
                                <div class="container-login100-form-btn">
                                    <div class="wrap-login100-form-btn">
                                        <div class="login100-form-bgbtn"></div>
                                        <button class="login100-form-btn">
                                            ajouter
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>

            </div>

        </div>

    </div>
</div>
<br>
<br>
<br>
<br>
<br>
<br>

<br>
<br>
<br>
<jsp:include page="footer.jsp"/>
<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
<script src="vendor/bootstrap/js/popper.js"></script>
<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
<script src="vendor/daterangepicker/moment.min.js"></script>
<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
<script src="js/main.js"></script>
</body>
</html>
