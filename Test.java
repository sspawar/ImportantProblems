import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Port details");
		int n=sc.nextInt();
		System.out.println("Enter the Port details");
		List<Port> portList=new ArrayList<Port>();
		for(int i=0;i<n;i++){
			String[] port=sc.next().split(",");
			portList.add(new Port(Integer.parseInt(port[0]),port[1],port[2]));
		}
		System.out.println("Enter the position");
		int position=sc.nextInt();
		System.out.println("Enter the port detail to be inserted");
		String[] portToInsert=sc.next().split(",");
		portList.add(position, new Port(Integer.parseInt(portToInsert[0]),portToInsert[1],portToInsert[2]));
		System.out.println("After the insertion of port details");
		System.out.format("%-15s%-15s%s","Port Id","Name ","Location");
		for(Port port:portList){
			System.out.println();
			System.out.format("%-15s%-15s%s",port.getId(),port.getName(),port.getCity());
		}
	}
}
