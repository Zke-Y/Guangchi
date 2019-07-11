package org.guangchi.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.MultipartConfig;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.guangchi.dao.ManagerAddFoodDao;
import org.guangchi.entity.Food;
import org.guangchi.entity.NewFood;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;




@WebServlet("/ManagerAddPhotoServlet")
@MultipartConfig
public class ManagerAddPhotoServlet extends HttpServlet {
	
    private static final long serialVersionUID = 1L;
    // �ϴ��ļ��洢Ŀ¼
    private static final String UPLOAD_DIRECTORY = "upload";
    // �ϴ�����
    private static final int MEMORY_THRESHOLD   = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE      = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE   = 1024 * 1024 * 50; // 50MB
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("0");
		  // ����Ƿ�Ϊ��ý���ϴ�
    if (!ServletFileUpload.isMultipartContent(request)) {
        // ���������ֹͣ
        PrintWriter writer = response.getWriter();
        writer.println("Error: ��������� enctype=multipart/form-data");
        writer.flush();
        return;
    }

    
    System.out.println("0");
    
    // �����ϴ�����
    DiskFileItemFactory factory = new DiskFileItemFactory();
    // �����ڴ��ٽ�ֵ - �����󽫲�����ʱ�ļ����洢����ʱĿ¼��
    factory.setSizeThreshold(MEMORY_THRESHOLD);
    // ������ʱ�洢Ŀ¼
    factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

    ServletFileUpload upload = new ServletFileUpload(factory);
     
    // ��������ļ��ϴ�ֵ
    upload.setFileSizeMax(MAX_FILE_SIZE);
     
    // �����������ֵ (�����ļ��ͱ�����)
    upload.setSizeMax(MAX_REQUEST_SIZE);
    
    // ���Ĵ���
    upload.setHeaderEncoding("UTF-8"); 

    // ������ʱ·�����洢�ϴ����ļ�
    // ���·����Ե�ǰӦ�õ�Ŀ¼

   String uploadPath = " img\\food_img";
     
   
   
    // ���Ŀ¼�������򴴽�
    File uploadDir = new File(uploadPath);
    if (!uploadDir.exists()) {
        uploadDir.mkdir();
    }
    
    System.out.println("0");
    try {
        // ���������������ȡ�ļ�����
        @SuppressWarnings("unchecked")
        List<FileItem> formItems = upload.parseRequest(request);

        if (formItems != null && formItems.size() > 0) {
            // ����������
            for (FileItem item : formItems) {
                // �����ڱ��е��ֶ�
                if (!item.isFormField()) {
                    String fileName = new File(item.getName()).getName();
                    String filePath = uploadPath + File.separator + fileName;
                    File storeFile = new File(filePath);
                   
                    // ͨ���ļ���ԭʼ���ƣ����ϴ��ļ����������ƣ�ֻ���ϴ�jpgͼƬ�ļ�
                    if (filePath.endsWith("jpg") ) {
                    // �ڿ���̨����ļ����ϴ�·��
                        System.out.println(filePath);
                    	// �����ļ���Ӳ��
                        item.write(storeFile);
                        System.out.println("0");
                        String Newpath="/Guangchi/img/food_img/dfms/"+filePath.substring(uploadPath.length()+1);
                        System.out.println(Newpath);
                		request.setCharacterEncoding("utf-8" );
                		NewFood food=new NewFood(Newpath);
                		ManagerAddFoodDao.AddFood(food);
                       
                		System.out.println("0");
                        
                        
                        
                        
                        request.setAttribute("message",
                            "�ϴ��ɹ�!");
                  
                    }
                    else {
                    	request.setAttribute("message",
                                "��֧�������ļ�!");
                    };
                }
            }
        }
    } catch (Exception ex) {
        request.setAttribute("message",
                "������Ϣ: " + ex.getMessage());
    }
    // ��ת�� message.jsp
    getServletContext().getRequestDispatcher("/message.jsp").forward(
            request, response);
		
		
		


    }
		
}	
		


