package step7;

import step5.Bird;
import step5.Flyer;
import step5.SuperMan;

public class TestInterface2 {
public static void main(String[] args) {

	FlyerService service =new FlyerService();
	
	service.enter(new Airplane());
	service.enter(new Bird());
	service.enter(new SuperMan());
	
	
	Flyer f[] = {new Airplane(),new Bird(),new SuperMan()};
	service.enter(f);

	/*����Ⱑ ����.
	���� ����.
	���۸��� ����!~����
	����Ⱑ ����.
	���� ����.
	���۸��� ����!~����
	*/
}}
