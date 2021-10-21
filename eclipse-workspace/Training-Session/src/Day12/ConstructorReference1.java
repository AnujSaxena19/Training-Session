package Day12;

public class ConstructorReference1 {
	public static void main(String args[]) {
		
		ConstructorInter i = ConstructorSample::new;
		ConstructorSample constructorSample=i.get();
	}
}

class ConstructorSample
{
	public ConstructorSample() {
		System.out.println("Sample Constructor execution");
	}
}

interface ConstructorInter{
	public ConstructorSample get();
}
