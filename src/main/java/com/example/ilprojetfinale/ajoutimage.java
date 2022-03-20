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
@WebServlet(name ="ajoutimage", value = "/ajoutimage")
public class ajoutimage  extends HttpServlet {
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
            ps = (sql.connexionsahbi1()).prepareStatement("UPDATE produit SET img=? where id= "+request.getParameter("prod"));
            InputStream is=part.getInputStream();
            ps.setBlob(1,is);
            //  ps.setString(1,ff.getPath());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher("affichage?ut="+request.getParameter("ut")).forward(request, response);













        //  String startDateStr = request.getParameter("startDate");
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//surround below line with try catch block as below code throws checked exception
        //Date startDate = sdf.parse(startDateStr);

    }
    public void destroy() {
    }
}