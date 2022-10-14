package step10;

import java.util.TreeSet;

public class TestLottoSet {
public static void main(String[] args) {
	LottoService service = new LottoService();
	TreeSet set= service.getLottoSet();
	System.out.println(set);//바뀐 숫자가 나온다.[7, 8, 20, 26, 35, 43]

}}
