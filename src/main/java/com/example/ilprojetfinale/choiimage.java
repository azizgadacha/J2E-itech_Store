package com.example.ilprojetfinale;


import com.example.ilprojetfinale.model.produit;
import com.example.ilprojetfinale.sql.sql;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
@MultipartConfig(maxFileSize = 86177216)
@WebServlet(name ="choiimage", value = "/choiimage")
public class choiimage  extends HttpServlet {
    private String message;
    Connection conn;
    Statement stmt;

    @Override
    public void init() throws ServletException {
       /* try {
           ResultSet res=st.executeQuery("select *  from user");
            while (res.next()) {
              System.out.println( res.getString("password"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } */
    }

    /*
         try {


             Class.forName("com.mysql.cj.jdbc.Driver");

         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/iljee", "root", "root");

         statement = connection.createStatement();
         } catch (SQLException | ClassNotFoundException e) {
             e.printStackTrace();
         }


     }*/
    @Override


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //  ArrayList<produit> ls = new ArrayList<>();

        try {
        sql sql=new sql();
        System.out.println( request.getParameter("id"));


            System.out.println("salah8");
Part part =request.getPart("image");

        PreparedStatement ps= null;
request.getParameter("id");
            ps = (sql.connexionsahbi1()).prepareStatement("UPDATE `utilisateur` SET img=? where id= "+request.getParameter("id"));
            InputStream is=part.getInputStream();
            ps.setBlob(1,is);
          //  ps.setString(1,ff.getPath());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
       ;




           /* String saveFile="";
            String  contentType=request.getContentType();
            if ((contentType!=null)&&(contentType.indexOf("multipart/form-data")>=0))
            {  String res11 = "";
                sql sql = new sql();
                stmt = sql.connexionsahbi();







                    DataInputStream in=new DataInputStream(request.getInputStream());
                    int formaDataLength=request.getContentLength();
                    byte dataBytes[]=new  byte[formaDataLength];
                    int byteRead=0;
                    int totalBytesRead=0;
                    while (totalBytesRead<formaDataLength){
                        byteRead=in.read(dataBytes,totalBytesRead,formaDataLength);
                        totalBytesRead+=byteRead;

                    }
                    String file=new String(dataBytes);
                    saveFile=file.substring(file.indexOf("filename=\"")+10);

                    saveFile =saveFile.substring(0,saveFile.indexOf("\n"));
                    saveFile=saveFile.substring(saveFile.lastIndexOf("\\")+ 1,saveFile.indexOf("\""));
                    int lastIndex=contentType.lastIndexOf("=");
                    String boundary =contentType.substring(lastIndex+1,contentType.length());
                    int pos;
                    pos=file.indexOf("filename=\"");
                    pos=file.indexOf("\n",pos)+1;
                    pos=file.indexOf("\n",pos)+1;
                    pos=file.indexOf("\n",pos)+1

                    ;
                    int boundaryLocation =file.indexOf(boundary,pos)-4;
                    int startPos=((file.substring(0,pos)).getBytes()).length;
                    int endPos=((file.substring(0,boundaryLocation)).getBytes()).length;
                    File ff =new File("C:/Users/azizg/Desktop/9raya/formationet/ilprojetfinale/src/main/resources/img/"+saveFile);
                    FileOutputStream filOut =new FileOutputStream(ff);
                    filOut.write(dataBytes,startPos,(endPos-startPos));
                    filOut.flush();
                    filOut.close();
                    PreparedStatement ps= (sql.connexionsahbi1()).prepareStatement("UPDATE `utilisateur` SET img=? ") ;
                    ps.setString(1,ff.getPath());
                    ps.executeUpdate();
             */




        request.getRequestDispatcher("index.jsp").forward(request, response);













            //  String startDateStr = request.getParameter("startDate");
            //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//surround below line with try catch block as below code throws checked exception
            //Date startDate = sdf.parse(startDateStr);

      }
    public void destroy() {
    }
}