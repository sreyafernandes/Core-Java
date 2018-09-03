public class InstruementMain {
	public static void main(String[] args) {
		Instrument i[] = new Instrument[10];
		for(int j=0;j<i.length;j++)
		{
			if(j<3)
				i[j] = new Piano();
			else if(j<6)
				i[j] = new Guitar();
			else 
				i[j] = new Flute();
		}
		for(Instrument ints: i)
		{
			ints.play();
			System.out.println(ints.getClass().getName());
		}
	}
}
