package package1;

public class ConceptofArray {

	public static void main(String[] args) {

		String name[]=new String[3];
		name[0]="ram";
		name[1]="vishnu";
		name[2]="Bhim";
		/*System.out.println(name[0]);//by using this type alos we can get output
		System.out.println(name[1]);//or we use fopr loop

		System.out.println(name[2]);*/
		for(int i=0;i<=2;i++)
		{
			System.out.println(name[i]);
		}
		int age[]=new int[3];
		age[0]=51;
		age[1]=93;
		age[2]=11;
		for(int j=0;j<=2;j++)
		{
			System.out.println(age[j]);

		}
		double salary[]=new double[3];
		salary[0]=143.25;
		salary[1]=265.25;
		salary[2]=11.70;
		for(int k=0;k<=2;k++)
		{
			System.out.println(salary[k]);

		}

	}

}
