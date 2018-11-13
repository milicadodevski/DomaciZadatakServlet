
package FormaServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String ime = request.getParameter("ime");
        String adresa = request.getParameter("adresa");
        String mail = request.getParameter("e-mail");
        String predznanje = request.getParameter("predznanje");
        String telefon = request.getParameter("telefon");
        String zanimanje = request.getParameter("zanimanje");
        String napomena = request.getParameter("napomena");
        PrintWriter out = response.getWriter();
        try  {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Do servleta su stigli sledeci podaci: </h1>");
            out.println("Ime: " + ime);
            out.println("<br><br> Adresa: " + adresa);
            out.println("<br><br>E-mail: " + mail);
            out.println("<br><br>Predznanje: " + predznanje);
            out.println("<br><br>Telefon: " + telefon);
            out.println("<br><br>Zanimanje: " + zanimanje);
            out.println("<br><br>Napomena: " + napomena);
            
            out.println("</body>");
            out.println("</html>");
        }
        finally{
            out.close();
        }
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
