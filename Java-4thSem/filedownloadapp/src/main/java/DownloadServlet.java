import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DownloadServlet")
public class DownloadServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filename = request.getParameter("filename");
        String filePath = getServletContext().getRealPath("/files/" + filename);
        
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");

        OutputStream os = response.getOutputStream();
        java.io.FileInputStream in = new java.io.FileInputStream(filePath);
        int bytesRead;
        byte[] buffer = new byte[1024]; 
        while ((bytesRead = in.read(buffer)) != -1) {
            os.write(buffer, 0, bytesRead);
        }
        in.close();
        os.close();
    }
}