package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class AppListener
 *
 */
@WebListener
public class AppListener implements ServletContextListener {   // Application


	
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("servlet ������ ����...");
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
    	
    	sce.getServletContext().setAttribute("appName", "javaweb");
    	
        System.out.println("servlet �����Ľ��� / application created.");
    }
	
}
