package servlet;

//eventEdit.jsp
//イベントページ

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BordItems;
import model.Event;


/**
 * Servlet implementation class EventEditServlet
 */
@WebServlet("/EventEditServlet")
public class EventEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);


		//リクエストパラメータから取得
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		String autherPassCheck = request.getParameter("autherPass"); //幹事用パス


		//イベント情報の変更（幹事）が押されたとき
		if (action == null){

		//幹事用パスがあっているかどうかのロジック
			ServletContext application = this.getServletContext();
			Event e = (Event) application.getAttribute("event");
			boolean autherCheck = e.isAutherPassEquals(autherPassCheck);


			if (autherCheck == false){

				int confirmation = 0;

				//セッションスコープに保存
				HttpSession session = request.getSession();
				session.setAttribute("confirmation", confirmation);

				//イベントページにフォワード
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/eventEdit.jsp");
				dispatcher.forward(request, response);

			}else{
				//幹事用イベント編集にフォワード
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/eventDatails.jsp");
				dispatcher.forward(request, response);
			}


		}else if (action.equals("edit")){ //一般投稿者が編集ボタン押したとき
			//リクエストパラメータの取得（一般投稿者用パス）
			request.setCharacterEncoding("UTF-8");
			String userPassCheck = request.getParameter("userPass");

			//パスワードが合っているかどうか
			ServletContext application = this.getServletContext();
			BordItems b = (BordItems) application.getAttribute("bordItems");
			boolean userCheck = b.isUserPassEquals(userPassCheck);


			//パスワードがあっていたら編集可能になる
			//間違っていたらちがうよーってでるのを書きたい
			int confirmation = 0;
			//セッションスコープに値を入れて、その値次第で表示を変えるってどうかなあああああああああああああああ
			if(userCheck == false){
				confirmation = 1;
			}else if (userCheck == true){
				confirmation = 2;
			}

			//セッションスコープに保存
			HttpSession session = request.getSession();
			session.setAttribute("confirmation", confirmation);

			//イベントページにフォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/eventEdit.jsp");
			dispatcher.forward(request, response);


		}else if(action.equals("decide")){ //一般投稿者情報入力
			//リクエストパラメータの取得
			request.setCharacterEncoding("UTF-8");
			String userName = request.getParameter("userName");//一般投稿者名
			String userPass = request.getParameter("userPass");//一般投稿者パスワード
			String userRemark = request.getParameter("userRemark");//備考

			//投稿ID
			String itemId = "";

			//参加日選択
			ArrayList<Calendar> preferredDaySet = new ArrayList<Calendar>();
			preferredDaySet.add(aaaaaa);

			//
			ArrayList<Integer> preferredFlagSet = new ArrayList<Integer>();
			preferredFlagSet.add(1233);

			//投稿日時
			Calendar  userRegistDay = Calendar.getInstance();

			//BordItemsインスタンスの生成
			BordItems bordItems = new BordItems(itemId,preferredDaySet, preferredFlagSet,
					userName, userPass, userRemark, userRegistDay);


			//セッションスコープに保存
			HttpSession session = request.getSession();
			session.setAttribute("bordItems",bordItems);



			//DAOの利用



			//フォワード
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/eventEdit.jsp");
			dispatcher.forward(request, response);
		}
	}

}
