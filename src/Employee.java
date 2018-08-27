public class Employee implements Sortable{
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void compare(int id1,int id2) {
		if(id1<id2)
		{
			System.out.println(id1);
			System.out.println(id2);
		}
		else
		{
			System.out.println(id2);
			System.out.println(id1);
		}
		}
		
}
	
