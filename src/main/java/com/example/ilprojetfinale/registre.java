package com.example.ilprojetfinale;


import com.example.ilprojetfinale.model.produit;
import com.example.ilprojetfinale.sql.sql;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

@WebServlet(name ="registre", value = "/registre")
public class registre  extends HttpServlet {
    private String message;
    Connection conn;
    Statement stmt;


    @Override


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //  ArrayList<produit> ls = new ArrayList<>();
        try {

                System.out.println("salah8");
            System.out.println("salah6");

            String res11 = "";
            System.out.println("salah328");



                        sql sql = new sql();
            System.out.println("salah3sss28");

            stmt = sql.connexionsahbi();





                        ResultSet res = stmt.executeQuery("select *  from utilisateur where username='" + request.getParameter("username") + "'");
            System.out.println("salah89");

                        while (res.next()) {
                            res11 = res11 + res.getString("username");

                        }

                        if ((res11.equals(request.getParameter("username")))) {
                            System.out.println("salah1");
                            request.setAttribute("message", "compte deja entre");
                            request.getRequestDispatcher("registre.jsp").forward(request, response);

                        } else {
                            System.out.println("salah98");

                            Connection cnx = sql.connexionsahbi1();

                            //File f=new File("/home/prashant/Documents/image/mainjava.jpg");
                            //FileInputStream  fs=new FileInputStream(f);

                            //PreparedStatement ps= cnx.prepareStatement("INSERT INTO salah(id,img) VALUES(?,?,?)");
                            //ps.setString(1, "1");
                            //ps.setBinaryStream(2,fs,(int)f.length());
                            //ps.executeUpdate();

                            PreparedStatement pr = cnx.prepareStatement(" INSERT INTO utilisateur( username, mail, password, phone, adress,img) VALUES ('" + request.getParameter("username") + "','" + request.getParameter("email") + "','" + request.getParameter("pass") + "'," + request.getParameter("phone") + ",'" + request.getParameter("adress") + "',null)");
                            System.out.println("salah85");


                            pr.execute();
                             ResultSet res2 = stmt.executeQuery("select id  from utilisateur where username='" + request.getParameter("username") + "'");
                            System.out.println("salah89");
res11="";
                            while (res2.next()) {
                                res11 = res11 + res2.getString("id");

                            }

                            request.getRequestDispatcher("choseimage.jsp?id="+res11).forward(request, response);



                        }


        } catch (SQLException e) {
            System.out.println("mchiittzamer");
            e.printStackTrace();




    }}
    public void destroy() {
    }
}