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

	/*비행기가 날다.
	새가 날다.
	슈퍼맨이 날다!~ㄴㄴ
	비행기가 날다.
	새가 날다.
	슈퍼맨이 날다!~ㄴㄴ
	*/
}}
