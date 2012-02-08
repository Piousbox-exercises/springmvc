package springmvc.web;

import java.util.ArrayList;
import org.springframework.web.servlet.ModelAndView;
import java.util.Map;
import junit.framework.TestCase;
import springmvc.service.SimpleProductManager;
import springmvc.domain.Product;
import springmvc.repository.InMemoryProductDao;

public class InventoryControllerTests extends TestCase {

    public void testHandleRequestView() throws Exception {
        InventoryController controller = new InventoryController();
        SimpleProductManager spm = new SimpleProductManager();
        spm.setProductDao(new InMemoryProductDao(new ArrayList<Product>()));
        controller.setProductManager(spm);
//        controller.setProductManager(new SimpleProductManager());
        ModelAndView modelAndView = controller.handleRequest(null, null);
//        assertEquals("jsp/hello.jsp", modelAndView.getViewName());
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        Map modelMap = (Map) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);

    }
}
