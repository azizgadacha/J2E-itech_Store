<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="com.example.ilprojetfinale.sql.sql" %>
<%
    Blob image = null;
    Connection con = null;
    byte[ ] imgData = null ;
    Statement stmt = null;
    ResultSet rs = null;
    try {
        sql sql =new sql();

        rs=(sql.connexionsahbi()).executeQuery("select * from produit where id ='"+request.getParameter("ul")+"'");
        if (rs.next())
        {

            Blob  blob=rs.getBlob("img");
            byte byteArray []=blob.getBytes(1,(int) blob.length());
            response.setContentType("image/gif");
            OutputStream os =response.getOutputStream();
            os.write(byteArray);
            os.flush();
            os.close();

        }
    }catch(SQLException e) {
    }


%>