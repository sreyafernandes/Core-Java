public class Circle implements Sortable{
	int area;

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public void compare(int a1, int a2) {
		if(a1<a2) {
			System.out.println(a1);
			System.out.println(a2);
		}
		else
		{
			System.out.println(a2);
			System.out.println(a1);
		}
	}
	
}
