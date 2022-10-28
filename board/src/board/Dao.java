package board;

import java.util.List;

public interface Dao {
	void insert(Board b);
	Board select(String title);
	List selectAll();
	void update(Board b);
	void delete(int num);

}
