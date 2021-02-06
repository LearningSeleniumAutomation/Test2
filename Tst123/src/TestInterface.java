
public class TestInterface implements Inter1 {

	@Override
	public void test() {
		
		System.out.println("Test method is Implemented");
		
	}

	@Override
	public void display() {
		System.out.println("Display method is implemented");
	}

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
	
		return x+y;
	}
	
	

}
