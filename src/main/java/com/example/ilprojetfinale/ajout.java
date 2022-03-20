package com.example.ilprojetfinale;


import com.example.ilprojetfinale.model.produit;
import com.example.ilprojetfinale.sql.sql;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;

@WebServlet(name ="ajout", value = "/ajout")
public class ajout  extends HttpServlet {
    private String message;
    Connection conn;
    Statement stmt;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException {
doPost(request, response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException {
        ArrayList<produit> ls = new ArrayList<>();
        String res11 = "";

        System.out.println((String)request.getParameter("approvername"));
        try {



            sql sql = new sql();
            Connection cnx = sql.connexionsahbi1();
            //INSERT INTO `produit`(`id`, `produit`, `prix`, `description`, `type`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]')
            PreparedStatement pr = cnx.prepareStatement(" INSERT INTO `produit`( `produit`, `prix`, `description`, `type`) VALUES('"+request.getParameter("nom")+"',"+request.getParameter("prix")+",'"+request.getParameter("description")+"','"+(String)request.getParameter("approvername") +"')"  );
            pr.execute();


            Statement stmt1 = sql.connexionsahbi();
            ResultSet res25 = stmt1.executeQuery("select id  from produit where produit='" + request.getParameter("nom") + "'  and description='"+request.getParameter("description")+"'");
            System.out.println("salah89");
            res11="";
            while (res25.next()) {
                res11 = res11 + res25.getString("id");


            }
            System.out.println(res11);



        }catch (SQLException E){}

        request.setAttribute("pro",res11);

        request.setAttribute("ut",request.getParameter("ut"));
        request.getRequestDispatcher("insertpro.jsp?ut="+request.getParameter("ut")+"&pro="+res11).forward(request,response);

    }




    public void destroy() {
    }
}