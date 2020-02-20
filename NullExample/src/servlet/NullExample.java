/**
 * @author http://software-engineering-lab.com/
 *
 */
package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NullExampleBean;

/**
 * Servlet implementation class NullExample
 */
@WebServlet("/NullExample")
public class NullExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NullExample() {
        super();
        // Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		List<NullExampleBean> nullExampleList;
		if(this.getServletContext().getAttribute("nullExampleList") == null) {
			nullExampleList = new ArrayList<NullExampleBean>();
			String cities[] = (String[]) request.getSession().getAttribute("cities");
			NullExampleBean nullExampleBean;
			for(int i=0;i<cities.length;i++) {
				nullExampleBean = new NullExampleBean();
				nullExampleBean.setCity(cities[i]);
				nullExampleList.add(nullExampleBean);
			}
		} else {
			nullExampleList = (ArrayList<NullExampleBean>) this.getServletContext().getAttribute("nullExampleList");
		}
		
		NullExampleBean nullExampleBean = (NullExampleBean) this.getServletContext().getAttribute("nullexample");		
		int total = 0;
		for(NullExampleBean value:nullExampleList) {
			if(value.getCity().equals(nullExampleBean.getCity())) {
				value.setNumber(nullExampleBean.getNumber());
			}
			// TODO　Integerを使うのであればnullチェックを行う
			int v = value.getNumber() == null ? 0 : value.getNumber();
			total = total + v;
		}
		request.setAttribute("total", total);
		this.getServletContext().setAttribute("nullExampleList", nullExampleList);
		getServletContext().getRequestDispatcher("/NullExampleResult.jsp").forward(request, response);
	}
}
