package board;

import java.util.List;

public class ServiceImpl implements Service{

	private Dao dao = new DaoImpl();
	@Override
	public void write(Board b) {
		// TODO Auto-generated method stub
		dao.insert(b);
	}

	@Override
	public Board getArticle(String title) {
		// TODO Auto-generated method stub
		return dao.select(title);
	}

	@Override
	public List getArticles() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public void editArticle(Board b) {
		// TODO Auto-generated method stub
		dao.update(b);
	}

	@Override
	public void delArticle(int num) {
		// TODO Auto-generated method stub
		dao.delete(num);
	}
	
}
