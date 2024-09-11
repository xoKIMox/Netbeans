/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.store;

@WebServlet(name = "Addstore", urlPatterns = {"/Addstore"})
public class Addstore extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        // รับค่าจากผู้ใช้งาน
        
        
        String toyName = request.getParameter("toyName");
        String type = request.getParameter("Type");
        String size = request.getParameter("size");
        String color = request.getParameter("color");
        int price = Integer.parseInt(request.getParameter("price"));
        
        // สร้าง instance of Food
        store toy = new store();
        toy.setId("1");
        toy.setName(toyName);
        toy.setType(type);
        toy.setsize(size);
        toy.setcolor(color);
        toy.setPrice(price);
        
         DBConnection dbConnection = new DBConnection();
        if(!dbConnection.insertNewStore(toy) ){
            System.out.println("Add NewFoodMySQL ERROR");
        }
        
        
        // เก็บ food ไว้ที่ session
        HttpSession session = request.getSession();
        session.setAttribute("toy", toy);
        
        // forward ไป addNewFoodSuccess.jsp
        request.getRequestDispatcher("/addNewtoySuccess.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
