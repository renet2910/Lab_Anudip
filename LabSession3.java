
public class LabSession3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(
						j+" ");
			}System.out.println();
		}
		System.out.println("------------------------");
		for (int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(
						"*"+" ");
			}System.out.println();
		}
		System.out.println("------------------------");
		for (int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}System.out.println();
		}
		System.out.println("------------------------");
		
        for(int i=4;i>=1;i--)
        {
            for (int j=i;j>0;j--) {
            System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("------------------------");

        int num = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                 System.out.print(num + " ");
                num++;
            }
 
            System.out.println();
        }
	}

}
